package de.westag.main;

import de.westag.controller.MainController;

import javax.swing.*;

public class Main {
    static MainController controller;

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        controller = new MainController();

        controller.showView();
    }
}
