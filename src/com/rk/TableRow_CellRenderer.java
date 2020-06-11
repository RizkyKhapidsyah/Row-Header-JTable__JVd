package com.rk;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class TableRow_CellRenderer implements ListCellRenderer {

    JTable table;
    JLabel label = new JLabel();

    public TableRow_CellRenderer(JTable table) {
        this.table = table;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JTableHeader header = table.getTableHeader();

        label.setBorder(UIManager.getBorder("Table Header.cellBorder"));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(header.getForeground());
        label.setBackground(header.getBackground());
        label.setFont(header.getFont());
        label.setText(value.toString());
        return label;
    }
}
