/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.MouseEvent;

/**
 *
 * @author CherryCe
 */
public class GUI_pnl_ChiTietThuNgan extends javax.swing.JPanel {

    /**
     * Creates new form GUI_pnlChiTietPhong
     */
    public GUI_pnl_ChiTietThuNgan() {
        initComponents();
        lblSoPhong.setText(""+GUI_pnl_ThuNgan.index);
    }
    public void text(int i){
        
    }
    
    public void showPopUp(MouseEvent evt){
        jPopupMenu1.show(this, evt.getX(), evt.getY());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        sdoChiTietThuNgan = new HELPER.PanelShadow();
        lblGioPhutDi = new javax.swing.JLabel();
        lblLoaiTien = new javax.swing.JLabel();
        lblHoaDon = new javax.swing.JLabel();
        lblLoaiPhong = new javax.swing.JLabel();
        spt_3 = new javax.swing.JSeparator();
        lblNgay = new javax.swing.JLabel();
        lblSoPhieu = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        lblThangDen = new javax.swing.JLabel();
        spt_1 = new javax.swing.JSeparator();
        lblNgayDen = new javax.swing.JLabel();
        lblSetGio = new javax.swing.JLabel();
        lblGio = new javax.swing.JLabel();
        lblSoPhong = new javax.swing.JLabel();
        lblThangDi = new javax.swing.JLabel();
        spt_2 = new javax.swing.JSeparator();
        lblTongTien = new javax.swing.JLabel();
        lblNgayDi = new javax.swing.JLabel();
        lblIconDongHo = new javax.swing.JLabel();
        lblTongThoiGian = new javax.swing.JLabel();
        lblGioPhutDen = new javax.swing.JLabel();
        lblSetMaHoaDon = new javax.swing.JLabel();
        lblSetNgay = new javax.swing.JLabel();

        jPopupMenu1.setComponentPopupMenu(jPopupMenu1);

        jMenuItem1.setText("jMenuItem1");
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem1");
        jPopupMenu1.add(jMenuItem2);

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(250, 220));
        setPreferredSize(new java.awt.Dimension(250, 220));

        sdoChiTietThuNgan.setBackground(new java.awt.Color(255, 255, 255));
        sdoChiTietThuNgan.setMinimumSize(new java.awt.Dimension(250, 220));
        sdoChiTietThuNgan.setPreferredSize(new java.awt.Dimension(250, 220));
        sdoChiTietThuNgan.setShadowOpacity(0.3F);
        sdoChiTietThuNgan.setShadowSize(4);
        sdoChiTietThuNgan.setShadowType(HELPER.ShadowType.BOT_RIGHT);
        sdoChiTietThuNgan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGioPhutDi.setBackground(new java.awt.Color(255, 255, 255));
        lblGioPhutDi.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblGioPhutDi.setForeground(new java.awt.Color(62, 73, 95));
        lblGioPhutDi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGioPhutDi.setText("19:09");
        sdoChiTietThuNgan.add(lblGioPhutDi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 40, 20));

        lblLoaiTien.setBackground(new java.awt.Color(255, 255, 255));
        lblLoaiTien.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblLoaiTien.setForeground(new java.awt.Color(62, 73, 95));
        lblLoaiTien.setText("Tiền Mặt");
        sdoChiTietThuNgan.add(lblLoaiTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 30));

        lblHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        lblHoaDon.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(62, 73, 95));
        lblHoaDon.setText("Hóa Đơn");
        sdoChiTietThuNgan.add(lblHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));

        lblLoaiPhong.setBackground(new java.awt.Color(255, 255, 255));
        lblLoaiPhong.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblLoaiPhong.setForeground(new java.awt.Color(62, 73, 95));
        lblLoaiPhong.setText("Phòng Đơn");
        sdoChiTietThuNgan.add(lblLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        spt_3.setForeground(new java.awt.Color(62, 73, 95));
        sdoChiTietThuNgan.add(spt_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 220, 10));

        lblNgay.setBackground(new java.awt.Color(255, 255, 255));
        lblNgay.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblNgay.setForeground(new java.awt.Color(153, 153, 153));
        lblNgay.setText("Ngày");
        sdoChiTietThuNgan.add(lblNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 40, 20));

        lblSoPhieu.setBackground(new java.awt.Color(255, 255, 255));
        lblSoPhieu.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblSoPhieu.setForeground(new java.awt.Color(153, 153, 153));
        lblSoPhieu.setText("Mã Hóa Đơn");
        sdoChiTietThuNgan.add(lblSoPhieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        lblNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(62, 73, 95));
        lblNhanVien.setText("CherryCe");
        sdoChiTietThuNgan.add(lblNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, 30));

        lblThangDen.setBackground(new java.awt.Color(255, 255, 255));
        lblThangDen.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblThangDen.setForeground(new java.awt.Color(62, 73, 95));
        lblThangDen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThangDen.setText("9");
        lblThangDen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sdoChiTietThuNgan.add(lblThangDen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 20, 30));

        spt_1.setBackground(new java.awt.Color(0, 0, 0));
        spt_1.setForeground(new java.awt.Color(62, 73, 95));
        sdoChiTietThuNgan.add(spt_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 20, 10));

        lblNgayDen.setBackground(new java.awt.Color(255, 255, 255));
        lblNgayDen.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNgayDen.setForeground(new java.awt.Color(62, 73, 95));
        lblNgayDen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNgayDen.setText("16");
        lblNgayDen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sdoChiTietThuNgan.add(lblNgayDen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 20, -1));

        lblSetGio.setBackground(new java.awt.Color(255, 255, 255));
        lblSetGio.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSetGio.setForeground(new java.awt.Color(62, 73, 95));
        lblSetGio.setText("19:09");
        sdoChiTietThuNgan.add(lblSetGio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 40, 30));

        lblGio.setBackground(new java.awt.Color(255, 255, 255));
        lblGio.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblGio.setForeground(new java.awt.Color(153, 153, 153));
        lblGio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGio.setText("Giờ");
        sdoChiTietThuNgan.add(lblGio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 40, 20));

        lblSoPhong.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lblSoPhong.setForeground(new java.awt.Color(62, 73, 95));
        lblSoPhong.setText("101");
        sdoChiTietThuNgan.add(lblSoPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        lblThangDi.setBackground(new java.awt.Color(255, 255, 255));
        lblThangDi.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblThangDi.setForeground(new java.awt.Color(62, 73, 95));
        lblThangDi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThangDi.setText("9");
        lblThangDi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sdoChiTietThuNgan.add(lblThangDi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 20, 30));

        spt_2.setBackground(new java.awt.Color(0, 0, 0));
        spt_2.setForeground(new java.awt.Color(62, 73, 95));
        sdoChiTietThuNgan.add(spt_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 20, 10));

        lblTongTien.setBackground(new java.awt.Color(255, 255, 255));
        lblTongTien.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(255, 102, 102));
        lblTongTien.setText("525,000");
        sdoChiTietThuNgan.add(lblTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 80, -1));

        lblNgayDi.setBackground(new java.awt.Color(255, 255, 255));
        lblNgayDi.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNgayDi.setForeground(new java.awt.Color(62, 73, 95));
        lblNgayDi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNgayDi.setText("16");
        lblNgayDi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sdoChiTietThuNgan.add(lblNgayDi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 20, -1));

        lblIconDongHo.setBackground(new java.awt.Color(255, 255, 255));
        lblIconDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clock.png"))); // NOI18N
        sdoChiTietThuNgan.add(lblIconDongHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 30, 30));

        lblTongThoiGian.setBackground(new java.awt.Color(255, 255, 255));
        lblTongThoiGian.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblTongThoiGian.setForeground(new java.awt.Color(255, 102, 102));
        lblTongThoiGian.setText("30'");
        sdoChiTietThuNgan.add(lblTongThoiGian, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 40, 30));

        lblGioPhutDen.setBackground(new java.awt.Color(255, 255, 255));
        lblGioPhutDen.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblGioPhutDen.setForeground(new java.awt.Color(62, 73, 95));
        lblGioPhutDen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGioPhutDen.setText("19:09");
        sdoChiTietThuNgan.add(lblGioPhutDen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 40, 20));

        lblSetMaHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        lblSetMaHoaDon.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSetMaHoaDon.setForeground(new java.awt.Color(62, 73, 95));
        lblSetMaHoaDon.setText("220922001");
        sdoChiTietThuNgan.add(lblSetMaHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 30));

        lblSetNgay.setBackground(new java.awt.Color(255, 255, 255));
        lblSetNgay.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSetNgay.setForeground(new java.awt.Color(62, 73, 95));
        lblSetNgay.setText("22/09/22");
        sdoChiTietThuNgan.add(lblSetNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sdoChiTietThuNgan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sdoChiTietThuNgan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    public javax.swing.JLabel lblGio;
    private javax.swing.JLabel lblGioPhutDen;
    private javax.swing.JLabel lblGioPhutDi;
    public javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblIconDongHo;
    public javax.swing.JLabel lblLoaiPhong;
    public javax.swing.JLabel lblLoaiTien;
    public javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblNgayDen;
    private javax.swing.JLabel lblNgayDi;
    public javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSetGio;
    private javax.swing.JLabel lblSetMaHoaDon;
    private javax.swing.JLabel lblSetNgay;
    public javax.swing.JLabel lblSoPhieu;
    private javax.swing.JLabel lblSoPhong;
    private javax.swing.JLabel lblThangDen;
    private javax.swing.JLabel lblThangDi;
    private javax.swing.JLabel lblTongThoiGian;
    private javax.swing.JLabel lblTongTien;
    public HELPER.PanelShadow sdoChiTietThuNgan;
    private javax.swing.JSeparator spt_1;
    private javax.swing.JSeparator spt_2;
    private javax.swing.JSeparator spt_3;
    // End of variables declaration//GEN-END:variables
}