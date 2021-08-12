package de.westag.controller;

import de.westag.model.DirectoryModel;
import de.westag.service.DirectoryService;
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
        view.setTableColumns();
        view.setVisible(true);
    }

    private void addListener() {
        view.setPathBtnListener(new PathBtnListener());
        view.setAnalyseBtnListener(new StartAnalysisListener());
    }

    /**
     * Inner listener classes implements the interface ActionListener
     */
    class PathBtnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new java.io.File("."));
            fileChooser.setDialogTitle("Ordnerauswahl");
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser.setAcceptAllFileFilterUsed(false);
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {                
                model.setPath(fileChooser.getSelectedFile().getAbsolutePath());
                view.setPathFieldText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        }
    }

    class StartAnalysisListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // todo start a new thread that begins the analysis
            DirectoryService service = new DirectoryService(model.getPath());
            service.StartAnalysis();
        }
    }
}
