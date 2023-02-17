import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
    JLabel movieLabel, nameLabel, numberLabel, dateLabel, timeLabel;
    JTextField movieText, nameText, numberText, dateText, timeText;
    JButton bookButton, clearButton;

    public Main() {
        setTitle("Movie Ticket Booking System");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        // Create Movie Label
        movieLabel = new JLabel("Movie Name:");
        movieLabel.setBounds(50, 50, 100, 30);
        add(movieLabel);

        // Create Movie Text Field
        movieText = new JTextField();
        movieText.setBounds(170, 50, 200, 30);
        add(movieText);

        // Create Name Label
        nameLabel = new JLabel("Your Name:");
        nameLabel.setBounds(50, 100, 100, 30);
        add(nameLabel);

        // Create Name Text Field
        nameText = new JTextField();
        nameText.setBounds(170, 100, 200, 30);
        add(nameText);

        // Create Number of Tickets Label
        numberLabel = new JLabel("Number of Tickets:");
        numberLabel.setBounds(50, 150, 120, 30);
        add(numberLabel);

        // Create Number of Tickets Text Field
        numberText = new JTextField();
        numberText.setBounds(170, 150, 200, 30);
        add(numberText);

        // Create Date Label
        dateLabel = new JLabel("Date:");
        dateLabel.setBounds(50, 200, 100, 30);
        add(dateLabel);

        // Create Date Text Field
        dateText = new JTextField();
        dateText.setBounds(170, 200, 200, 30);
        add(dateText);

        // Create Time Label
        timeLabel = new JLabel("Time:");
        timeLabel.setBounds(50, 250, 100, 30);
        add(timeLabel);

        // Create Time Text Field
        timeText = new JTextField();
        timeText.setBounds(170, 250, 200, 30);
        add(timeText);

        // Create Book Button
        bookButton = new JButton("Book Tickets");
        bookButton.setBounds(170, 300, 120, 30);
        add(bookButton);

        // Create Clear Button
        clearButton = new JButton("Clear Fields");
        clearButton.setBounds(300, 300, 120, 30);
        add(clearButton);

        // Add action listeners to buttons
        bookButton.addActionListener(this);
        clearButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bookButton) {
            String movie = movieText.getText();
            String name = nameText.getText();
            String number = numberText.getText();
            String date = dateText.getText();
            String time = timeText.getText();

            // Perform the booking process here
            JOptionPane.showMessageDialog(null, "Tickets booked successfully!");
        } else if (e.getSource() == clearButton) {
            // Clear all text fields
            movieText.setText("");
            nameText.setText("");
            numberText.setText("");
            dateText.setText("");
            timeText.setText("");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
