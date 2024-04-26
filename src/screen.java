import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class screen {


    public static class ChessGUI extends JFrame {
        private static final int BOARD_SIZE = 8;
        private static final int SQUARE_SIZE = 60; // Size of each square in pixels
        private JLabel[][] boardLabels;
        private ImageIcon[][] pieceIcons;

        public ChessGUI() {
            setTitle("Chess Board");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(BOARD_SIZE * SQUARE_SIZE, BOARD_SIZE * SQUARE_SIZE);
            setResizable(false);
            setLocationRelativeTo(null);

            JPanel chessPanel = new JPanel(new GridLayout(BOARD_SIZE, BOARD_SIZE));
            add(chessPanel);

            boardLabels = new JLabel[BOARD_SIZE][BOARD_SIZE];
            pieceIcons = new ImageIcon[BOARD_SIZE][BOARD_SIZE];

            // Populate the chessboard with squares and piece icons
            for (int row = 0; row < BOARD_SIZE; row++) {
                for (int col = 0; col < BOARD_SIZE; col++) {
                    JPanel square = new JPanel(new BorderLayout());
                    square.setPreferredSize(new Dimension(SQUARE_SIZE, SQUARE_SIZE));

                    // Alternate colors for squares
                    if ((row + col) % 2 == 0) {
                        square.setBackground(Color.WHITE);
                    } else {
                        square.setBackground(Color.DARK_GRAY);
                    }

                    boardLabels[row][col] = new JLabel();
                    square.add(boardLabels[row][col], BorderLayout.CENTER);
                    chessPanel.add(square);
                }
            }

            // Initialize the board with piece icons
            initializeBoard();

            // Add mouse listener for interaction
            addMouseListener(new MouseAdapter() {
                private int selectedRow = -1;
                private int selectedCol = -1;

                @Override
                public void mouseClicked(MouseEvent e) {
                    int mouseX = e.getX();
                    int mouseY = e.getY();

                    int clickedRow = mouseY / SQUARE_SIZE;
                    int clickedCol = mouseX / SQUARE_SIZE;

                    if (selectedRow == -1 && selectedCol == -1) {
                        // No piece selected, select the clicked piece if it exists
                        if (pieceIcons[clickedRow][clickedCol] != null) {
                            selectedRow = clickedRow;
                            selectedCol = clickedCol;
                        }
                    } else {
                        // Move the selected piece to the clicked position
                        movePiece(selectedRow, selectedCol, clickedRow, clickedCol);
                        selectedRow = -1;
                        selectedCol = -1;
                    }
                }
            });

            setVisible(true);
        }

        private void initializeBoard() {
            // Initialize the board with piece icons
            // For simplicity, let's add only one type of piece (black pawns) for demonstration
            for (int col = 0; col < BOARD_SIZE; col++) {
                pieceIcons[1][col] = new ImageIcon("");
            }

            // Update GUI with piece icons
            updateBoardGUI();
        }

        private void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
            // Perform move logic here (not implemented in this example)
            // For demonstration, just move the piece visually on the GUI
            pieceIcons[toRow][toCol] = pieceIcons[fromRow][fromCol];
            pieceIcons[fromRow][fromCol] = null;
            updateBoardGUI();
        }

        private void updateBoardGUI() {
            // Update GUI with piece icons
            for (int row = 0; row < BOARD_SIZE; row++) {
                for (int col = 0; col < BOARD_SIZE; col++) {
                    if (pieceIcons[row][col] != null) {
                        boardLabels[row][col].setIcon(pieceIcons[row][col]);
                    } else {
                        boardLabels[row][col].setIcon(null);
                    }
                }
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(ChessGUI::new);
        }
    }

}
