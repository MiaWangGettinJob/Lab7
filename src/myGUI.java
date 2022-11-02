/*
Lab 7
Simiao Wang
5101
Section-8
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class myGUI extends JFrame implements ActionListener {
    private JButton read = new JButton("Click to read from file"),
                    write = new JButton("Click to write to file");
    private JTextField filename = new JTextField(20);
    private JTextArea readArea = new JTextArea(50,40),
                     writeArea = new JTextArea(50,40);
    private JPanel panel= new JPanel();
    private JPanel panel2= new JPanel();

    private String fileAnnual = "/Users/simiaowang/Downloads/annual.csv";

    public myGUI(){ //constructor
        setTitle("                      Read and Write File" );
        panel.setLayout(new GridLayout(4,4,2,1));
        panel.add(new JLabel("                      Reading File Name"));
        panel.add(new JLabel("                      File Name to Write"));
        panel.add(new JLabel("                      Annual.cvs"));
        panel.add(filename);
        panel.add(read);
        panel.add(write);
        JScrollPane scroll = new JScrollPane(readArea);
        readArea.setLineWrap(true);
        writeArea.setLineWrap(true);
        panel2.add(writeArea);
        read.addActionListener ( this ) ;
        write.addActionListener ( this ) ;
        getContentPane().add("North",panel);
        getContentPane().add("West",scroll);
        getContentPane().add("East", panel2);

    }
    public void actionPerformed ( ActionEvent evt ) {
        if (evt.getSource() == read) {
            readArea.setText("");
            new File().readFile(readArea,fileAnnual) ;
        }
        else new File().writeFile(fileAnnual, writeArea, filename.getText() ) ;
    } // actionPerformed ()









}
