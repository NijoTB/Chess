import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {
    private int x;
    private int y;
    final PlayerGUI plr;


    public ButtonActionListener(PlayerGUI plr, int x, int y) {
        this.x = x;
        this.y = y;
        this.plr = plr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (plr.startX < 0 && plr.startY < 0) {
            plr.startX = x;
            plr.startY = y;
        } else {
            plr.endX = x;
            plr.endY = y;
        }

    }
}
