package de.westag.view;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    private JPanel rootPanel;
    private JTextField pathField;
    private JButton pathBtn;
    private JButton analyseBtn;
    private JTable table1;
    private JLabel pathLabel;
    private String columns[];

    public MainView() {
        super("DirectoryInfo");
        initialization();
    }

    private void initialization() {
        add(rootPanel);
        this.setSize(600, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void resetView() {
        pathField.setText("");
    }

    public String getPathFieldText() {
        return pathField.getText();
    }

    public void setPathFieldText(String pathFieldText) {
        pathField.setText(pathFieldText);
    }

    public void setTableColumns() {
        TableColumn column = new TableColumn();
        column.setHeaderValue("Hallo");
        table1.addColumn(column);
    }

    /**
     * Provide functions that can later be used from the controller to add the necessary listeners
     */
    public void setPathBtnListener(ActionListener listener) {
        pathBtn.addActionListener(listener);
    }

    public void setAnalyseBtnListener(ActionListener listener) {
        analyseBtn.addActionListener(listener);
    }
}
