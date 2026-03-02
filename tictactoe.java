import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//Action listener allows the mouse click to be 'listened to' so that an 
// action can be performed when we click the mouse
public class tictactoe implements ActionListener {
    Random random = new Random();//randomizes who starts
    JFrame frame = new JFrame();//the window frame where the game is held
    JPanel title_panel = new JPanel();//creates a space for contects such as tictactoegame
    JPanel button_panel = new JPanel();//creates a space for buttons
    JLabel textField = new JLabel();//displays context such as O wins!
    JButton[] buttons = new JButton[9];//instantiates 9 buttons for the game
    boolean player1_turn;//decides who to start...if its player 1 its set to tro ,if its false, player 2 plays


    tictactoe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textField.setBackground(new Color(25,25,25));
        textField.setForeground(new Color(25, 255, 0));
        textField.setFont(new Font("Ink Free", Font.BOLD, 75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Tic Tac Toe");
        textField.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        title_panel.add(textField);
        frame.add(title_panel,BorderLayout.NORTH);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
//to decide who's turn will it be first
    public void firstTurn() {

    }
//to check who wins
public void check() {

}

public void xWins(int a, int b, int c) {

}
    public void oWins(int a, int b, int c) {
        
    }
    
}