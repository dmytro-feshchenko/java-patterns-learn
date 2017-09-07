package com.technoboom.observer.SwingObserverSample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/20/17
 * Time: 9:28 PM
 * Project: patterns-learn
 * Package: com.technoboom.observer.SwingObserverSample
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class SwingObserverSample {
    private JFrame frame;

    public static void main(String[] args) {
        SwingObserverSample swingObserverSample = new SwingObserverSample();
        swingObserverSample.go();
    }

    private void go() {
        frame = new JFrame();
        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, jButton);

        frame.pack();
        frame.setVisible(true);
    }

    private class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    private class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}
