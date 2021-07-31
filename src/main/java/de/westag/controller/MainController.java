package de.westag.controller;

import de.westag.model.DirectoryModel;
import de.westag.view.MainView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The controller must know both, the view and the model, because it takes care of the communication between the two
 */
public class MainController {

    private MainView view;
    private DirectoryModel model;

    public MainController() {
        model = new DirectoryModel();
        view = new MainView();

        addListener();
    }

    public void showView() {
        view.setVisible(true);
    }

    private void addListener() {
        view.setPathBtnListener(new PathBtnListener());
        view.setAnalyseBtnListener(new ResetFormListener());
    }

    /**
     * Inner listener classes implements the interface ActionListener
     */
    class PathBtnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // todo open DirectoryBrowser
            model.setPath(view.getPathFieldText());
        }
    }

    class ResetFormListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.resetView();
        }
    }
}
