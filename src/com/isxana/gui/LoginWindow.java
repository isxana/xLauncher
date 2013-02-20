package com.isxana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Stasio
 * Date: 2/19/13
 * Time: 4:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginWindow extends JFrame {
    public LoginWindow(){

        JTextField user;
        JPasswordField password;
        JLabel missing;


        setSize(300, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("xLauncher");

        JPanel fields = new JPanel();
        JPanel checkboxes = new JPanel();
        JPanel buttons = new JPanel();
        JPanel labels = new JPanel();

        user = new JTextField();
        password = new JPasswordField();
        fields.add(user);
        fields.add(password);

        JCheckBox remember = new JCheckBox();
        checkboxes.add(remember);



        add(fields);
        add(checkboxes);
        add(buttons);
        add(labels);
    }
}