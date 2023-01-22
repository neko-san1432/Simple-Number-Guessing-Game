package Exer05_Repetition;

import javax.swing.*;
public class Exer04b_Numberguessing {
    public static void main (String[] args) {
        int g_num;
        int b_g_num = 0;
        int random = b_g_num;
        b_g_num = 29;
        g_num = Integer.parseInt(JOptionPane.showInputDialog("Guess the number:"));
        if (g_num > 10) {
            random = (b_g_num * g_num) / 10;
        } else if (g_num < 10) {
            random = (b_g_num * g_num) / 2;
        }
        while (g_num != b_g_num || g_num != random) {
            if (g_num == b_g_num || g_num == random) {
                JOptionPane.showMessageDialog(null, "You got right!");
                System.exit(0);
            } else if (g_num != b_g_num || g_num != random) {
                JOptionPane.showMessageDialog(null, "Wrong, try again");
                g_num = Integer.parseInt(JOptionPane.showInputDialog("Guess the number:"));
            }
        }
        JOptionPane.showMessageDialog(null, "You got right!");
        System.exit(0);
    }
}
