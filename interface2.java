/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thursday;

/**
 *
 * @author ganza
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class interface2 {

        public static void main(String[] args) {
                //FRAME 
                JFrame f = new JFrame();
                //LABEL
                JLabel L1 = new JLabel("LOAN MANAGEMENT SYSTEM");
                L1.setBounds(20, 40, 500, 30);
                Font font=new Font("arial", Font.BOLD,30);
                L1.setFont(font);
                JLabel L2 = new JLabel("LOAN AMOUNT:");
                L2.setBounds(30, 100, 200, 20);
                JLabel L3 = new JLabel("LOAN PERIOD:");
                L3.setBounds(30, 130, 200, 20);
                JLabel L4 = new JLabel("INTEREST RATE IN %:");
                L4.setBounds(30, 160, 200, 20);
                JLabel L5 = new JLabel("PROCESSING FEE:");
                L5.setBounds(30, 190, 200, 20);
                //TEXTFIELD
                JTextField T2 = new JTextField();
                T2.setBounds(180, 100, 200, 20);
                JTextField T3 = new JTextField();
                T3.setBounds(180, 130, 200, 20);
                JTextField T4 = new JTextField();
                T4.setBounds(180, 160, 200, 20);
                JTextField T5 = new JTextField();
                T5.setBounds(180, 190, 200, 20);
                //BUTTON FOR CALCULATIONS
                JButton B1 = new JButton("CALCULATE TOTAL AMOUNT TO BE PAID");
                B1.setBounds(10, 250, 280, 20);
                JButton B2 = new JButton("CALCULATE TOTAL AMOUNT TO BE PAID PER MONTH");
                B2.setBounds(10, 300, 280, 20);
                JTextField T6 = new JTextField();
                T6.setBounds(300, 250, 100, 20);
                T6.setEditable(false);
                JTextField T7 = new JTextField();
                T7.setBounds(300, 300, 100, 20);
                T7.setEditable(false);
                //ADDING LABEL
                f.add(L1);
                f.add(L2);
                f.add(L3);
                f.add(L4);
                f.add(L5);
                //LABEL TEXT
                f.add(T2);
                f.add(T3);
                f.add(T4);
                f.add(T5);
                //ADDING BUTTON FOR CALCULATIONS ALONG WITH THEIR TEXTFIELD
                f.add(B1);
                f.add(T6);
                f.add(B2);
                f.add(T7);
                //CALCULATION OF AMOUNT TO BE PAID
                B1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String AM = T2.getText();
                                String PF = T5.getText();
                                String I = T4.getText();

                                Integer AMOUNT = Integer.parseInt(AM);
                                int PROCESSING_FEE = Integer.parseInt(PF);
                                Double INTEREST_RATE = Double.parseDouble(I);
                                Double TP = AMOUNT + PROCESSING_FEE + (AMOUNT * (INTEREST_RATE / 100));
                                String RESULT = String.valueOf(TP);
                                T6.setText(RESULT);
                        }

                });
                 //CALCULATION OF AMOUNT TO BE PAID PER MONTH
                B2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String AM = T2.getText();
                                String PF = T5.getText();
                                String I = T4.getText();
                                String LP = T3.getText();

                                Integer AMOUNT = Integer.parseInt(AM);
                                Integer PROCESSING_FEE = Integer.parseInt(PF);
                                Double INTEREST_RATE = Double.parseDouble(I);
                                Integer LOAN_PERIOD = Integer.parseInt(LP);
                                Double PM = (AMOUNT + PROCESSING_FEE + (AMOUNT * (INTEREST_RATE / 100))) / LOAN_PERIOD;
                                String RESULT = String.valueOf(PM);
                                T7.setText(RESULT);
                        }

                });
                 //ADJUSTING FRAME
                f.setSize(500, 500);
                f.setLayout(null);
                f.setVisible(true);
                f.getContentPane().setBackground(new Color(153, 255, 204));

        }
}