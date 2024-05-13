import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class screen {


    public static class ChessGUI extends JFrame {
        private static final int BOARD_SIZE = 8;
        private static final int SQUARE_SIZE = 60; // Size of each square in pixels
        private JButton[][] boardLabels;
        private ImageIcon[][] pieceIcons;


        private static final ImageIcon BLACKPAWN = new ImageIcon(new ImageIcon("resources/PawnBlackChessPiece.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));
        private static final ImageIcon WHITEPAWN = new ImageIcon(new ImageIcon("resources/PawnWhiteChessPiecePNG.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));
        private static final ImageIcon BLACKROOK = new ImageIcon(new ImageIcon("resources/RookBlackChessPiece.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));
        private static final ImageIcon WHITEROOK = new ImageIcon(new ImageIcon("resources/RookWhiteChessPiece.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));
        private static final ImageIcon BLACKBISHOP = new ImageIcon(new ImageIcon("resources/BishopBlackChessPiece.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));
        private static final ImageIcon WHITEBISHOP = new ImageIcon(new ImageIcon("resources/BishopWhiteChessPiece.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));
        private static final ImageIcon BLACKKNIGHT = new ImageIcon(new ImageIcon("resources/KnightBlackChessPiece.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));
        private static final ImageIcon WHITEKNIGHT = new ImageIcon(new ImageIcon("resources/KnightWhiteChessPiece.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));
        private static final ImageIcon BLACKKING = new ImageIcon(new ImageIcon("resources/KingBlackChessPiece.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));
        private static final ImageIcon WHITEKING = new ImageIcon(new ImageIcon("resources/KingWhiteChessPiece.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));
        private static final ImageIcon BLACKQUEEN = new ImageIcon(new ImageIcon("resources/QueenBlackChessPiece.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));
        private static final ImageIcon WHITEQUEEN = new ImageIcon(new ImageIcon("resources/QueenWhiteChessPiece.png").getImage().getScaledInstance((int) ((double) SQUARE_SIZE * 0.5), (int) ((double) SQUARE_SIZE * 0.75), Image.SCALE_SMOOTH));


        public ChessGUI(PlayerGUI plr) {
            System.out.println("here");
            setTitle("Chess Board");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(BOARD_SIZE * SQUARE_SIZE, BOARD_SIZE * SQUARE_SIZE);
            setResizable(false);
            setLocationRelativeTo(null);

            JPanel chessPanel = new JPanel(new GridLayout(BOARD_SIZE, BOARD_SIZE));
            add(chessPanel);

            boardLabels = new JButton[BOARD_SIZE][BOARD_SIZE];
            pieceIcons = new ImageIcon[BOARD_SIZE][BOARD_SIZE];
            // Initialize the board with piece icons

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

                    if (pieceIcons[row][col] != null) {
                        boardLabels[row][col] = new JButton(pieceIcons[row][col]);
                    } else {
                        boardLabels[row][col] = new JButton();
                    }

                    boardLabels[row][col].addActionListener(new ButtonActionListener(plr, col, row));

                    square.add(boardLabels[row][col], BorderLayout.CENTER);
                    chessPanel.add(square);
                }
            }


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


        private void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
            MouseAdapter ma = new MouseAdapter() {

                private Point offset;

                @Override
                public void mousePressed(MouseEvent e) {
                    Rectangle bounds = getImageBounds();
                    Point mp = e.getPoint();
                    System.out.println("Clicked");
                    if (bounds.contains(mp)) {
                        offset = new Point();
                        offset.x = mp.x - bounds.x;
                        offset.y = mp.y - bounds.y;
                        System.out.println(offset.x + " " + offset.y);
                    }
                }

                protected Rectangle getImageBounds() {
                    Rectangle bounds = new Rectangle(0, 0, 0, 0);
//                    if (img != null) {
//                        bounds.setLocation(imgPoint);
//                        bounds.setSize(img.getWidth(), img.getHeight());
//                    }
                    return bounds;
                }
            };
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

        public void updateBoardGUI(Board board) {
            // Update GUI with piece icons
            for (int row = 0; row < BOARD_SIZE; row++) {
                for (int col = 0; col < BOARD_SIZE; col++) {
                    Piece boardPiece = board.board[row][col].piece;
                    if (boardPiece != null) {
                        if (boardPiece instanceof Pawn && boardPiece.color == ChessColor.WHITE) {
                            boardLabels[row][col].setIcon(WHITEPAWN);
                        }
                        if (boardPiece instanceof Pawn && boardPiece.color == ChessColor.BLACK) {
                            boardLabels[row][col].setIcon(BLACKPAWN);
                        }
                        if (boardPiece instanceof Rook && boardPiece.color == ChessColor.WHITE) {
                            boardLabels[row][col].setIcon(WHITEROOK);
                        }
                        if (boardPiece instanceof Rook && boardPiece.color == ChessColor.BLACK) {
                            boardLabels[row][col].setIcon(BLACKROOK);
                        }
                        if (boardPiece instanceof Bishop && boardPiece.color == ChessColor.WHITE) {
                            boardLabels[row][col].setIcon(WHITEBISHOP);
                        }
                        if (boardPiece instanceof Bishop && boardPiece.color == ChessColor.BLACK) {
                            boardLabels[row][col].setIcon(BLACKBISHOP);
                        }
                        if (boardPiece instanceof Knight && boardPiece.color == ChessColor.WHITE) {
                            boardLabels[row][col].setIcon(WHITEKNIGHT);
                        }
                        if (boardPiece instanceof Knight && boardPiece.color == ChessColor.BLACK) {
                            boardLabels[row][col].setIcon(BLACKKNIGHT);
                        }
                        if (boardPiece instanceof King && boardPiece.color == ChessColor.WHITE) {
                            boardLabels[row][col].setIcon(WHITEKING);
                        }
                        if (boardPiece instanceof King && boardPiece.color == ChessColor.BLACK) {
                            boardLabels[row][col].setIcon(BLACKKING);
                        }
                        if (boardPiece instanceof Queen && boardPiece.color == ChessColor.WHITE) {
                            boardLabels[row][col].setIcon(WHITEQUEEN);
                        }
                        if (boardPiece instanceof Queen && boardPiece.color == ChessColor.BLACK) {
                            boardLabels[row][col].setIcon(BLACKQUEEN);
                        }
                    } else {
                        boardLabels[row][col].setIcon(null);
                    }
                }
            }
        }

//        public static void main(String[] args) {
//            SwingUtilities.invokeLater(ChessGUI::new);
//        }
    }

}
