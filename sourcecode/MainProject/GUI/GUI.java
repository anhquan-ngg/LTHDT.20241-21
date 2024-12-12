package MainProject.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Structure Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setLayout(null);

        JButton stackButton = new JButton("Stack");
        JButton queueButton = new JButton("Queue");
        JButton listButton = new JButton("List");
        JButton exitButton = new JButton("Exit");
        JButton helpButton = new JButton("Help");

        stackButton.setBounds(50, 50, 100, 30);
        queueButton.setBounds(200, 50, 100, 30);
        listButton.setBounds(350, 50, 100, 30);
        helpButton.setBounds(50, 130, 100, 30);
        exitButton.setBounds(350, 130, 100, 30);

        stackButton.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                new StackGUI();
            };
        });

        queueButton.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                new QueueGUI();
            }
        });

        listButton.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                new ListGUI();
            }
        });

        exitButton.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Exit Confirmation",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        helpButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "This GUI allows you to choose between:\n"
                + "- Stack\n- Queue\n- List\nClick Exit to close."));

        frame.add(stackButton);
        frame.add(queueButton);
        frame.add(listButton);
        frame.add(helpButton);
        frame.add(exitButton);

        frame.setVisible(true);
    }
}