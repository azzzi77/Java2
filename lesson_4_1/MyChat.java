package lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.text.*;
import java.awt.Color;


public class MyChat extends JFrame {

    JTextArea textArea;
    JTextField textMsg;
    JScrollPane textAreaScroll;

    public MyChat() {
        setTitle(":::: \\w/  Гламурный чат для Блондинко v1.0  \\w/  ::::");
        setBounds(300, 300, 420, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Tahoma", Font.BOLD, 12);

        Image img = new ImageIcon(this.getClass().getResource("icon5.png")).getImage();
        this.setIconImage(img);

         // центральная панель
        JPanel center = new JPanel();

        add(center, BorderLayout.CENTER);
       center.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 255, 14)));
        center.setLayout(new BorderLayout());

        //нижняя панель
        JPanel footer = new JPanel();
        add(footer, BorderLayout.SOUTH);
        footer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 255, 14)));
        footer.setPreferredSize(new Dimension(1, 40));
        footer.setLayout(new BorderLayout());

        //кнопка
        JButton chatButton = new JButton("Отправить");
        chatButton.setBackground(new java.awt.Color(79, 255, 200));
        chatButton.setFont(font);
        chatButton.setToolTipText("Нажми чтобы отправить сообщение");
        footer.add(chatButton, BorderLayout.EAST);

        // окно чата, без возможности писать там
        textArea = new JTextArea();
        textArea.setFont(font);
        textArea.setBackground(new java.awt.Color(255, 190, 226));
        textAreaScroll = new JScrollPane(textArea);
         center.add(textAreaScroll, BorderLayout.CENTER);
        textArea.setEditable(false);

        //поле для сообщений
        textMsg = new JTextField();
        textMsg.setBackground(new java.awt.Color(255, 247, 72));
        textMsg.setFont(font);
        footer.add(textMsg, BorderLayout.CENTER);

        // событие по кнопке
        chatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMsg();
            }
        });

        //событие по энтеп
        textMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMsg();
            }
        });


        setVisible(true);

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        textArea.append("\n Добро пожаловать! Cегодня - "+formatForDateNow.format(dateNow)+"\n");
        textArea.append(" -------------------------------------------------------------------------\n\n");

    }
    void addMsg() {

        if (textMsg.getText().length() > 0) {
            Date dateNow = new Date();
            SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss");
            textArea.append("[" + formatForDateNow.format(dateNow) + "] : " + textMsg.getText() + "\n");
            textMsg.setText(""); // чистем поле после
            textMsg.grabFocus();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else {
            infoBox("А сообщение кто, Пушкин писать будет?!", "ОШИБКАААААААААААА!");
            textMsg.grabFocus();
            //textArea.setForeground(Color.red);
           // textArea.append("Ты забыл написать сообщение...\n");
        }
    }

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Упс: " + titleBar, JOptionPane.ERROR_MESSAGE);
    }

}
