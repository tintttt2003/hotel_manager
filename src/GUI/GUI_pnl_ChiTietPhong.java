/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.BLL_Phong;
import BLL.BLL_SoDoPhong;
import BLL.BLL_SoTang;
import DTO.DTO_Phong;
import DTO.DTO_SoTang;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/**
 *
 * @author CherryCe
 */
public class GUI_pnl_ChiTietPhong extends javax.swing.JPanel {

    boolean isShowHidden = false;
    boolean isDonPhong = false;
    boolean isKhachRaNgoai = false;
    public static int indexPosition;

    /**
     * Creates new form GUI_pnlChiTietPhong
     */
    public GUI_pnl_ChiTietPhong() {
        initComponents();
        load();
        lblDonPhong.setVisible(false);
        lblRaNgoai.setVisible(false);
        isHidden();

    }

    public void load() {
        ArrayList<DTO_Phong> array = BLL_SoDoPhong.select(GUI_pnl_SoDoPhong.index);
        BLL_SoDoPhong.load(array, lblSoPhong, lblLoaiPhong, lblSetTrangThai);
        if (lblSetTrangThai.getText().equals("Phòng Trống")) {
            lblIconTrangThai.setIcon(new ImageIcon(getClass().getResource("/IMG/bed (3).png")));
            lblTongThoiGian.setVisible(false);
            lblNgayDefault.setVisible(true);
            lblTongThoiGian.setVisible(false);
            lblTongTien.setVisible(false);
            lblDatCoc.setVisible(false);
            lblConLai.setVisible(false);
            lblSetTongTien.setText(null);
            lblSetDatCoc.setText(null);
            lblSetConLai.setText(null);
        } else {
            lblIconTrangThai.setIcon(new ImageIcon(getClass().getResource("/IMG/hotel-sign (2).png")));
        }
    }

    public void isHidden() {
        lblNgayVao.setVisible(false);
        lblNgayRa.setVisible(false);
        lblGioPhutVao.setVisible(false);
        lblThoiGianRa.setVisible(false);
        lblThangVao.setVisible(false);
        lblThangRa.setVisible(false);
        lblNgayVao.setVisible(false);
        spt_1.setVisible(false);
        spt_2.setVisible(false);
    }

    public void isShow() {
        lblNgayVao.setVisible(true);
        lblNgayRa.setVisible(true);
        lblGioPhutVao.setVisible(true);
        lblThoiGianRa.setVisible(true);
        lblThangVao.setVisible(true);
        lblThangRa.setVisible(true);
        lblNgayVao.setVisible(true);
        spt_1.setVisible(true);
        spt_2.setVisible(true);
    }

    public void showPopUp(MouseEvent evt) {
        popMenu.show(this, evt.getX(), evt.getY());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popMenu = new javax.swing.JPopupMenu();
        mniDatPhong = new javax.swing.JMenuItem();
        mniDonPhong = new javax.swing.JMenuItem();
        mniKhachRaNgoai = new javax.swing.JMenuItem();
        mniThanhToanNhom = new javax.swing.JMenuItem();
        sdoChiTietPhong = new HELPER.PanelShadow();
        lblThoiGianRa = new javax.swing.JLabel();
        spt_1 = new javax.swing.JSeparator();
        lblNgayRa = new javax.swing.JLabel();
        lblThangRa = new javax.swing.JLabel();
        lblSetDatCoc = new javax.swing.JLabel();
        lblDonPhong = new javax.swing.JLabel();
        lblDatCoc = new javax.swing.JLabel();
        spt_2 = new javax.swing.JSeparator();
        lblSetTongTien = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        lblSetConLai = new javax.swing.JLabel();
        lblGioPhutVao = new javax.swing.JLabel();
        lblLoaiPhong = new javax.swing.JLabel();
        lblConLai = new javax.swing.JLabel();
        lblThangVao = new javax.swing.JLabel();
        lblSetTrangThai = new javax.swing.JLabel();
        lblNgayVao = new javax.swing.JLabel();
        lblIconTrangThai = new javax.swing.JLabel();
        lblSoPhong = new javax.swing.JLabel();
        lblRaNgoai = new javax.swing.JLabel();
        lblTongThoiGian = new javax.swing.JLabel();
        lblNgayDefault = new javax.swing.JLabel();

        popMenu.setBackground(new java.awt.Color(255, 255, 255));
        popMenu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        popMenu.setForeground(new java.awt.Color(62, 73, 95));
        popMenu.setComponentPopupMenu(popMenu);

        mniDatPhong.setBackground(new java.awt.Color(255, 255, 255));
        mniDatPhong.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mniDatPhong.setForeground(new java.awt.Color(62, 73, 95));
        mniDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/calendar.png"))); // NOI18N
        mniDatPhong.setText("Đặt Phòng");
        mniDatPhong.setMinimumSize(new java.awt.Dimension(150, 30));
        mniDatPhong.setOpaque(true);
        mniDatPhong.setPreferredSize(new java.awt.Dimension(150, 30));
        mniDatPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mniDatPhongMouseClicked(evt);
            }
        });
        mniDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDatPhongActionPerformed(evt);
            }
        });
        popMenu.add(mniDatPhong);

        mniDonPhong.setBackground(new java.awt.Color(255, 255, 255));
        mniDonPhong.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mniDonPhong.setForeground(new java.awt.Color(62, 73, 95));
        mniDonPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cleaning.png"))); // NOI18N
        mniDonPhong.setText("Dọn Phòng");
        mniDonPhong.setMinimumSize(new java.awt.Dimension(150, 30));
        mniDonPhong.setOpaque(true);
        mniDonPhong.setPreferredSize(new java.awt.Dimension(150, 30));
        mniDonPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDonPhongActionPerformed(evt);
            }
        });
        popMenu.add(mniDonPhong);

        mniKhachRaNgoai.setBackground(new java.awt.Color(255, 255, 255));
        mniKhachRaNgoai.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mniKhachRaNgoai.setForeground(new java.awt.Color(62, 73, 95));
        mniKhachRaNgoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout (8).png"))); // NOI18N
        mniKhachRaNgoai.setText("Khách Ra Ngoài");
        mniKhachRaNgoai.setMinimumSize(new java.awt.Dimension(150, 30));
        mniKhachRaNgoai.setOpaque(true);
        mniKhachRaNgoai.setPreferredSize(new java.awt.Dimension(150, 30));
        mniKhachRaNgoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhachRaNgoaiActionPerformed(evt);
            }
        });
        popMenu.add(mniKhachRaNgoai);

        mniThanhToanNhom.setBackground(new java.awt.Color(255, 255, 255));
        mniThanhToanNhom.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mniThanhToanNhom.setForeground(new java.awt.Color(62, 73, 95));
        mniThanhToanNhom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/multiple-users-silhouette.png"))); // NOI18N
        mniThanhToanNhom.setText("Thanh Toán Nhóm");
        mniThanhToanNhom.setMinimumSize(new java.awt.Dimension(150, 30));
        mniThanhToanNhom.setOpaque(true);
        mniThanhToanNhom.setPreferredSize(new java.awt.Dimension(150, 30));
        popMenu.add(mniThanhToanNhom);

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(220, 180));
        setPreferredSize(new java.awt.Dimension(220, 180));

        sdoChiTietPhong.setBackground(new java.awt.Color(97, 177, 90));
        sdoChiTietPhong.setComponentPopupMenu(popMenu);
        sdoChiTietPhong.setMinimumSize(new java.awt.Dimension(220, 180));
        sdoChiTietPhong.setPreferredSize(new java.awt.Dimension(220, 180));
        sdoChiTietPhong.setShadowOpacity(0.3F);
        sdoChiTietPhong.setShadowSize(3);
        sdoChiTietPhong.setShadowType(HELPER.ShadowType.BOT_RIGHT);
        sdoChiTietPhong.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                sdoChiTietPhongMouseMoved(evt);
            }
        });
        sdoChiTietPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdoChiTietPhongMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sdoChiTietPhongMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sdoChiTietPhongMouseReleased(evt);
            }
        });
        sdoChiTietPhong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblThoiGianRa.setBackground(new java.awt.Color(255, 255, 255));
        lblThoiGianRa.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblThoiGianRa.setForeground(new java.awt.Color(255, 255, 255));
        lblThoiGianRa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThoiGianRa.setText("19:09");
        sdoChiTietPhong.add(lblThoiGianRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 40, 20));
        sdoChiTietPhong.add(spt_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 20, 10));

        lblNgayRa.setBackground(new java.awt.Color(255, 255, 255));
        lblNgayRa.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNgayRa.setForeground(new java.awt.Color(255, 255, 255));
        lblNgayRa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNgayRa.setText("16");
        lblNgayRa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sdoChiTietPhong.add(lblNgayRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 20, 20));

        lblThangRa.setBackground(new java.awt.Color(255, 255, 255));
        lblThangRa.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblThangRa.setForeground(new java.awt.Color(255, 255, 255));
        lblThangRa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThangRa.setText("9");
        lblThangRa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sdoChiTietPhong.add(lblThangRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 20, 30));

        lblSetDatCoc.setBackground(new java.awt.Color(255, 255, 255));
        lblSetDatCoc.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSetDatCoc.setForeground(new java.awt.Color(255, 255, 255));
        lblSetDatCoc.setText("200K");
        sdoChiTietPhong.add(lblSetDatCoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 40, 30));

        lblDonPhong.setBackground(new java.awt.Color(255, 255, 255));
        lblDonPhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mop (1).png"))); // NOI18N
        lblDonPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sdoChiTietPhong.add(lblDonPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 30, 20));

        lblDatCoc.setBackground(new java.awt.Color(255, 255, 255));
        lblDatCoc.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblDatCoc.setForeground(new java.awt.Color(230, 230, 230));
        lblDatCoc.setText("Đặt Cọc");
        sdoChiTietPhong.add(lblDatCoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 30));
        sdoChiTietPhong.add(spt_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 20, 10));

        lblSetTongTien.setBackground(new java.awt.Color(255, 255, 255));
        lblSetTongTien.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSetTongTien.setForeground(new java.awt.Color(255, 255, 255));
        lblSetTongTien.setText("1,400K");
        sdoChiTietPhong.add(lblSetTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, 30));

        lblTongTien.setBackground(new java.awt.Color(255, 255, 255));
        lblTongTien.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(230, 230, 230));
        lblTongTien.setText("Tổng Tiền");
        sdoChiTietPhong.add(lblTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        lblSetConLai.setBackground(new java.awt.Color(255, 255, 255));
        lblSetConLai.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSetConLai.setForeground(new java.awt.Color(255, 255, 255));
        lblSetConLai.setText("1,200k");
        sdoChiTietPhong.add(lblSetConLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 50, 30));

        lblGioPhutVao.setBackground(new java.awt.Color(255, 255, 255));
        lblGioPhutVao.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblGioPhutVao.setForeground(new java.awt.Color(255, 255, 255));
        lblGioPhutVao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGioPhutVao.setText("19:09");
        sdoChiTietPhong.add(lblGioPhutVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 40, 20));

        lblLoaiPhong.setBackground(new java.awt.Color(255, 255, 255));
        lblLoaiPhong.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblLoaiPhong.setForeground(new java.awt.Color(230, 230, 230));
        lblLoaiPhong.setText("Phòng Đơn");
        sdoChiTietPhong.add(lblLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        lblConLai.setBackground(new java.awt.Color(255, 255, 255));
        lblConLai.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblConLai.setForeground(new java.awt.Color(230, 230, 230));
        lblConLai.setText("Còn Lại");
        sdoChiTietPhong.add(lblConLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 30));

        lblThangVao.setBackground(new java.awt.Color(255, 255, 255));
        lblThangVao.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblThangVao.setForeground(new java.awt.Color(255, 255, 255));
        lblThangVao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThangVao.setText("9");
        lblThangVao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sdoChiTietPhong.add(lblThangVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 20, 30));

        lblSetTrangThai.setBackground(new java.awt.Color(255, 255, 255));
        lblSetTrangThai.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblSetTrangThai.setForeground(new java.awt.Color(230, 230, 230));
        lblSetTrangThai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSetTrangThai.setText("Có Khách");
        sdoChiTietPhong.add(lblSetTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, 20));

        lblNgayVao.setBackground(new java.awt.Color(255, 255, 255));
        lblNgayVao.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNgayVao.setForeground(new java.awt.Color(255, 255, 255));
        lblNgayVao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNgayVao.setText("16");
        lblNgayVao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sdoChiTietPhong.add(lblNgayVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 20, 20));

        lblIconTrangThai.setBackground(new java.awt.Color(255, 255, 255));
        lblIconTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/hotel-sign (2).png"))); // NOI18N
        sdoChiTietPhong.add(lblIconTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 30, 20));

        lblSoPhong.setBackground(new java.awt.Color(255, 255, 255));
        lblSoPhong.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lblSoPhong.setForeground(new java.awt.Color(255, 255, 255));
        lblSoPhong.setText("101");
        sdoChiTietPhong.add(lblSoPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 20));

        lblRaNgoai.setBackground(new java.awt.Color(255, 255, 255));
        lblRaNgoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRaNgoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout (4).png"))); // NOI18N
        lblRaNgoai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sdoChiTietPhong.add(lblRaNgoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 30, 20));

        lblTongThoiGian.setBackground(new java.awt.Color(255, 255, 255));
        lblTongThoiGian.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTongThoiGian.setForeground(new java.awt.Color(62, 73, 95));
        lblTongThoiGian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTongThoiGian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/circle (1).png"))); // NOI18N
        lblTongThoiGian.setText("6h30m");
        lblTongThoiGian.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTongThoiGian.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblTongThoiGianMouseMoved(evt);
            }
        });
        lblTongThoiGian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTongThoiGianMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTongThoiGianMouseExited(evt);
            }
        });
        sdoChiTietPhong.add(lblTongThoiGian, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, 70));

        lblNgayDefault.setBackground(new java.awt.Color(255, 255, 255));
        lblNgayDefault.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lblNgayDefault.setForeground(new java.awt.Color(255, 255, 255));
        lblNgayDefault.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNgayDefault.setText("22/09/22");
        sdoChiTietPhong.add(lblNgayDefault, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sdoChiTietPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sdoChiTietPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sdoChiTietPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdoChiTietPhongMouseClicked
        // TODO add your handling code here:
        indexPosition = GUI_pnl_SoDoPhong.pnlFormChinh.getComponentZOrder(sdoChiTietPhong);
        if (evt.getClickCount() == 2) {
            new GUI_dal_ThongTinPhong(null, true).setVisible(true);
        }
    }//GEN-LAST:event_sdoChiTietPhongMouseClicked

    private void lblTongThoiGianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTongThoiGianMouseExited
        // TODO add your handling code here:
        lblTongThoiGian.setForeground(new Color(62, 73, 95));
        sdoChiTietPhong.setBorder(null);
    }//GEN-LAST:event_lblTongThoiGianMouseExited

    private void lblTongThoiGianMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTongThoiGianMouseMoved
        // TODO add your handling code here:
        lblTongThoiGian.setForeground(new Color(255, 102, 102));
        sdoChiTietPhong.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(33, 150, 243)));
    }//GEN-LAST:event_lblTongThoiGianMouseMoved

    private void lblTongThoiGianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTongThoiGianMouseClicked
        // TODO add your handling code here:
        if (!isShowHidden) {
            isShow();
            isShowHidden = true;
        } else {
            isHidden();
            isShowHidden = false;
        }
    }//GEN-LAST:event_lblTongThoiGianMouseClicked

    private void sdoChiTietPhongMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdoChiTietPhongMouseMoved
        // TODO add your handling code here:
        sdoChiTietPhong.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(33, 150, 243)));
    }//GEN-LAST:event_sdoChiTietPhongMouseMoved

    private void sdoChiTietPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdoChiTietPhongMouseExited
        // TODO add your handling code here:
        sdoChiTietPhong.setBorder(null);
    }//GEN-LAST:event_sdoChiTietPhongMouseExited

    private void sdoChiTietPhongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdoChiTietPhongMouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) {
            showPopUp(evt);
        }
    }//GEN-LAST:event_sdoChiTietPhongMouseReleased

    private void mniDatPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mniDatPhongMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mniDatPhongMouseClicked

    private void mniDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDatPhongActionPerformed
        // TODO add your handling code here:  
        indexPosition = GUI_pnl_SoDoPhong.pnlFormChinh.getComponentZOrder(sdoChiTietPhong);
        new GUI_dal_ThongTinPhong(null, true).setVisible(true);
    }//GEN-LAST:event_mniDatPhongActionPerformed

    private void mniDonPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDonPhongActionPerformed
        // TODO add your handling code here:
        if (!isDonPhong) {
            lblDonPhong.setVisible(true);
            isDonPhong = true;
        } else {
            lblDonPhong.setVisible(false);
            isDonPhong = false;
        }
    }//GEN-LAST:event_mniDonPhongActionPerformed

    private void mniKhachRaNgoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhachRaNgoaiActionPerformed
        // TODO add your handling code here:
        if (!isKhachRaNgoai) {
            lblRaNgoai.setVisible(true);
            isKhachRaNgoai = true;
        } else {
            lblRaNgoai.setVisible(false);
            isKhachRaNgoai = false;
        }
    }//GEN-LAST:event_mniKhachRaNgoaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lblConLai;
    public javax.swing.JLabel lblDatCoc;
    public javax.swing.JLabel lblDonPhong;
    public javax.swing.JLabel lblGioPhutVao;
    public javax.swing.JLabel lblIconTrangThai;
    public static javax.swing.JLabel lblLoaiPhong;
    public javax.swing.JLabel lblNgayDefault;
    public javax.swing.JLabel lblNgayRa;
    public javax.swing.JLabel lblNgayVao;
    public javax.swing.JLabel lblRaNgoai;
    public javax.swing.JLabel lblSetConLai;
    public javax.swing.JLabel lblSetDatCoc;
    public javax.swing.JLabel lblSetTongTien;
    public javax.swing.JLabel lblSetTrangThai;
    public static javax.swing.JLabel lblSoPhong;
    public javax.swing.JLabel lblThangRa;
    public javax.swing.JLabel lblThangVao;
    public javax.swing.JLabel lblThoiGianRa;
    public javax.swing.JLabel lblTongThoiGian;
    public javax.swing.JLabel lblTongTien;
    public javax.swing.JMenuItem mniDatPhong;
    public javax.swing.JMenuItem mniDonPhong;
    public javax.swing.JMenuItem mniKhachRaNgoai;
    public javax.swing.JMenuItem mniThanhToanNhom;
    public javax.swing.JPopupMenu popMenu;
    public HELPER.PanelShadow sdoChiTietPhong;
    public javax.swing.JSeparator spt_1;
    public javax.swing.JSeparator spt_2;
    // End of variables declaration//GEN-END:variables
}