/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_SoTang;
import DTO.DTO_SoTang;
import java.awt.Component;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CherryCe
 */
public class BLL_SoTang {

    public static boolean check(DTO_SoTang soTang) {
        if (soTang.getMaTang().isEmpty() || soTang.getTenTang().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static void add(DTO_SoTang soTang) {
        if (check(soTang) == false) {
            JOptionPane.showMessageDialog(null, "Dữ Liệu Không Được Để Trống !!!");
        } else {
            DAL_SoTang.add(soTang);
        }
    }

    public static void delete(String maTang) {
        try {
            DAL_SoTang.delete(maTang);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dữ Liệu Đang Được Sử Dụng !!!");
        }
    }

    public static void edit(DTO_SoTang soTang) {
        if (check(soTang) == false) {
            JOptionPane.showMessageDialog(null, "Dữ Liệu Không Được Để Trống !!!");
        } else {
            DAL_SoTang.edit(soTang);
        }
    }

    public static ArrayList<DTO_SoTang> select() {
        ResultSet rs = DAL_SoTang.select();
        ArrayList<DTO_SoTang> array = new ArrayList<>();
        try {
            while (rs.next()) {
                DTO_SoTang soTang = new DTO_SoTang();
                soTang.setMaTang(rs.getString("MaTang"));
                soTang.setTenTang(rs.getString("TenTang"));
                array.add(soTang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return array;
    }

    public void load(ArrayList<DTO_SoTang> array, JTable tbl) {
        DefaultTableModel tblModel = (DefaultTableModel) tbl.getModel();
        tblModel.setColumnIdentifiers(new Object[]{"Mã Tầng", "Tên Tầng", "Sửa", "Xóa"});
        tblModel.setRowCount(0);
        for (DTO_SoTang soTang : array) {
            Object obj[] = new Object[2];
            obj[0] = soTang.getMaTang();
            obj[1] = soTang.getTenTang();
            tbl.getColumnModel().getColumn(2).setCellRenderer(new iconEdit());
            tbl.getColumnModel().getColumn(3).setCellRenderer(new iconDelete());
            tblModel.addRow(obj);
        }
    }

    public class iconEdit extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setIcon(new ImageIcon("C:\\Users\\CherryCe\\Documents\\NetBeansProjects\\Hotel_Management\\src\\IMG\\edit.png"));
            setHorizontalAlignment(CENTER);
            return this;
        }
    }

    public class iconDelete extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setIcon(new ImageIcon("C:\\Users\\CherryCe\\Documents\\NetBeansProjects\\Hotel_Management\\src\\IMG\\trash.png"));
            setHorizontalAlignment(CENTER);
            return this;
        }
    }
}
