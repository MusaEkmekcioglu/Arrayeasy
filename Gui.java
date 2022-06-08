import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import ArrayEasy;

public class Gui {

    private JFrame frame = new JFrame("Arrays Easy");
    private JPanel panel = new JPanel();

    private JLabel labelArrayLength = new JLabel("Dizi Uzunluğu");
    private JTextField textArrayLength = new JTextField(20);
    private JLabel labelArrayItems = new JLabel("Değerler(ex: 34 87 100): ");
    private JTextField textArrayItems = new JTextField(20);
    private JTextArea textAreaAnswer = new JTextArea(5, 20);

    private JButton button = new JButton("Hesapla");

    Gui() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        panel.setLayout(new GridLayout(3, 2));
        
        //Add components
        panel.add(labelArrayLength);
        panel.add(textArrayLength);
        panel.add(labelArrayItems);
        panel.add(textArrayItems);
        panel.add(textAreaAnswer);
        panel.add(button);
        
        
        frame.add(panel);
        frame.setVisible(true);

        Clicklistener click = new Clicklistener();

        button.addActionListener(click);
    }

    private class Clicklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int uzunluk = Integer.parseInt(textArrayLength.getText());
            String[] degerlerString = textArrayItems.getText().split(" ");
            int[] degerler = new int[uzunluk];
            
            for(int i = 0; i < uzunluk; i++)
            {
                degerler[i] = Integer.parseInt(degerlerString[i]);
            }
            
            for(int a: degerler)
                System.out.println(a);

            int[] sonuc = ArrayEasy.metot(degerler);

            System.out.println(sonuc);

            String sonucStr = "";
            
            for(int value: degerler)
            {
                sonucStr += Integer.toString(value);
            }
            
            textAreaAnswer.append(sonucStr);
        }
    }

}// end of Gui
