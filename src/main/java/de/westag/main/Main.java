package de.westag.main;

import de.westag.controller.MainController;

import javax.swing.*;

public class Main {
    static MainController controller;

    public static void main(String[] args) {

        Runnable guiCreator = () -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            controller = new MainController();
            controller.showView();
        };

        SwingUtilities.invokeLater(guiCreator);
    }
}
