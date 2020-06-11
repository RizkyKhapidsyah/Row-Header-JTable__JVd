package com.rk;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FormUtama extends JFrame {

    JTable table;
    JList listRowHeader;
    JScrollPane scroll;

    String rowHeader[] = {"1", "2", "3", "4", "5"};
    String colHeader[] = {"A", "B", "C", "D", "E"};

    public FormUtama() {
        super("Table Dengan Row Header");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        setTable();
        setRowHeader();

        add(scroll, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();
        setVisible(true);
    }


    public void setTable() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(colHeader);
        tableModel.setRowCount(rowHeader.length);

        table = new JTable(tableModel);
        scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(400, 200));
    }

    public void setRowHeader() {
        listRowHeader = new JList();
        listRowHeader.setListData(rowHeader);
        listRowHeader.setFixedCellHeight(table.getRowHeight());
        listRowHeader.setFixedCellWidth(60);
        listRowHeader.setBackground(table.getTableHeader().getBackground());
        listRowHeader.setCellRenderer(new TableRow_CellRenderer(table));
        scroll.setRowHeaderView(listRowHeader);
    }

}
