/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jForm;

import customcp.ScrollBarCustom;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.DangKiBienSo;
import model.User;
import control.QuanLyDangKy;
import java.util.Random;
/**
 *
 * @author ADMIN
 */
public class QuanLyDangKiPanel extends javax.swing.JPanel {
   /**
     * Creates new form QuanLyXePanel
     */
    DefaultTableModel defaultTableModel;
    User user;
    DangKiBienSo dangKiBienSo;
    QuanLyDangKy quanLyDangKy;
    
    public QuanLyDangKiPanel() {
        initComponents();     
    }
    
     public QuanLyDangKiPanel(User userkh) {
        initComponents();
        user = new User(userkh);
        txtmanv.setText("Mã NV: "+user.getIdAccount());
        txttennv.setText("Tên NV: "+user.getHoVaTen());
        txtrole.setText("Chức vụ: "+user.getChucVu());
        quanLyDangKy = new QuanLyDangKy();

        
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        
        
        tbDangKi.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("id");
        defaultTableModel.addColumn("Tên chủ xe");
        defaultTableModel.addColumn("CCCD chủ xe");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("Năm sinh");
        defaultTableModel.addColumn("SĐTNLTT");
        defaultTableModel.addColumn("idNLTT");
        defaultTableModel.addColumn("Tình trạng");
        defaultTableModel.addColumn("Biển số xe");
        
        setDataTable(quanLyDangKy.getAllDangKi());
        
        customTable(jScrollPane1,tbDangKi);
    }
    
    
    public void setDataTable(List<DangKiBienSo> listDK){
        for(DangKiBienSo x : listDK)
        {
            defaultTableModel.addRow(new Object[]{x.getIdDangKi(),x.getTenChuXe(),x.getCccdChuXe(),
                x.getDiaChi(),x.getNamsinh(), x.getSdtNLTT(),x.getIdAccountDangKi(),x.getTinhTrangDangKi(),x.getBienSoXe()});
        }
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        lbBienSoXe = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        txtsearch = new javax.swing.JTextField();
        btsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDangKi = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtrole = new javax.swing.JLabel();
        txtmanv = new javax.swing.JLabel();
        txttennv = new javax.swing.JLabel();
        ckboxchuaduyet = new javax.swing.JCheckBox();
        ckboxkhongduyet = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btDuyet = new customcp.Buttonshine();
        btKhongDuyet = new customcp.Buttonshine();
        buttonshine2 = new customcp.Buttonshine();
        buttonshine4 = new customcp.Buttonshine();
        ckbDaDuyet = new javax.swing.JCheckBox();
        buttonshine3 = new customcp.Buttonshine();

        jDialog1.setTitle("Mã xe");
        jDialog1.setMinimumSize(new java.awt.Dimension(400, 300));
        jDialog1.setModal(true);
        jDialog1.setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(240, 240, 240));
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseClicked(evt);
            }
        });

        lbBienSoXe.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        lbBienSoXe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBienSoXe.setText("42 24343 34");
        lbBienSoXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBienSoXeMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Truck.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Motorcycle.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Car (1).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBienSoXe, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(lbBienSoXe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 204, 51));
        setMaximumSize(new java.awt.Dimension(947, 680));
        setMinimumSize(new java.awt.Dimension(947, 680));
        setPreferredSize(new java.awt.Dimension(947, 680));

        txtsearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtsearch.setText("Tìm tên, số điện thoại, cccd ...");
        txtsearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtsearchFocusLost(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        btsearch.setBackground(new java.awt.Color(51, 204, 0));
        btsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btsearch.setText("Tìm kiếm");
        btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchActionPerformed(evt);
            }
        });

        tbDangKi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbDangKi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDangKi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbDangKi);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin nhân viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtrole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtrole.setText("Chức vụ: User");

        txtmanv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmanv.setText("Mã NV: AA00000");

        txttennv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttennv.setText("Tên nhân viên: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtmanv)
                .addGap(33, 33, 33)
                .addComponent(txttennv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtrole)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttennv)
                    .addComponent(txtmanv)
                    .addComponent(txtrole))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        ckboxchuaduyet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckboxchuaduyet.setSelected(true);
        ckboxchuaduyet.setText("Chưa duyệt");
        ckboxchuaduyet.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckboxchuaduyetItemStateChanged(evt);
            }
        });

        ckboxkhongduyet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckboxkhongduyet.setSelected(true);
        ckboxkhongduyet.setText("Không duyệt");
        ckboxkhongduyet.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckboxkhongduyetItemStateChanged(evt);
            }
        });
        ckboxkhongduyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckboxkhongduyetActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        btDuyet.setBackground(new java.awt.Color(51, 253, 15));
        btDuyet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btDuyet.setText("Duyệt");
        btDuyet.setEffectColor(new java.awt.Color(240, 240, 240));
        btDuyet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btDuyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDuyetActionPerformed(evt);
            }
        });
        jPanel2.add(btDuyet);

        btKhongDuyet.setBackground(new java.awt.Color(51, 253, 15));
        btKhongDuyet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btKhongDuyet.setText("Không duyệt");
        btKhongDuyet.setEffectColor(new java.awt.Color(240, 240, 240));
        btKhongDuyet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btKhongDuyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKhongDuyetActionPerformed(evt);
            }
        });
        jPanel2.add(btKhongDuyet);

        buttonshine2.setBackground(new java.awt.Color(51, 253, 15));
        buttonshine2.setText("In ấn");
        buttonshine2.setEffectColor(new java.awt.Color(240, 240, 240));
        buttonshine2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonshine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonshine2ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonshine2);

        buttonshine4.setBackground(new java.awt.Color(51, 253, 15));
        buttonshine4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        buttonshine4.setText("Đặt lại");
        buttonshine4.setEffectColor(new java.awt.Color(240, 240, 240));
        buttonshine4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonshine4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonshine4ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonshine4);

        ckbDaDuyet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckbDaDuyet.setSelected(true);
        ckbDaDuyet.setText("Đã duyệt");
        ckbDaDuyet.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbDaDuyetItemStateChanged(evt);
            }
        });
        ckbDaDuyet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbDaDuyetActionPerformed(evt);
            }
        });

        buttonshine3.setBackground(new java.awt.Color(51, 253, 15));
        buttonshine3.setText("Cấp biển số xe");
        buttonshine3.setEffectColor(new java.awt.Color(240, 240, 240));
        buttonshine3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonshine3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonshine3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ckbDaDuyet, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ckboxchuaduyet, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ckboxkhongduyet)
                        .addGap(61, 61, 61)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btsearch))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(buttonshine3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ckboxkhongduyet)
                        .addComponent(ckboxchuaduyet)
                        .addComponent(ckbDaDuyet)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonshine3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusGained
        // TODO add your handling code here:
        if (txtsearch.getText().equals("Tìm tên, số điện thoại, cccd ..."))
        {
            txtsearch.setText("");
            txtsearch.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtsearchFocusGained

    private void txtsearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusLost
        // TODO add your handling code here:
        if(txtsearch.getText().equals(""))
        {
            txtsearch.setText("Tìm tên, số điện thoại, cccd ...");
            txtsearch.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtsearchFocusLost

    private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
        if (txtsearch.getText().equals("") || txtsearch.getText().equals("Tìm tên, số điện thoại, cccd ..."))
        {
            defaultTableModel.setRowCount(0);
            
        }
        else 
        {
            defaultTableModel.setRowCount(0);
            setDataTable(quanLyDangKy.getAllDangKisdt_ten_cccd(txtsearch.getText()));
        }
        
    }//GEN-LAST:event_btsearchActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
        btsearchActionPerformed(evt);
    }//GEN-LAST:event_txtsearchActionPerformed

    
    private void buttonshine4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonshine4ActionPerformed
        ckbDaDuyet.setSelected(true);
        ckboxchuaduyet.setSelected(true);
        ckboxkhongduyet.setSelected(true);
        defaultTableModel.setRowCount(0);
        setDataTable(quanLyDangKy.getAllDangKi());
        jScrollPane1.getVerticalScrollBar().setValue(0);
    }//GEN-LAST:event_buttonshine4ActionPerformed

    private void btDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDuyetActionPerformed
        // TODO add your handling code here:
       int row = tbDangKi.getSelectedRow();
        if(row == -1)
        {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn bản đăng kí trước!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String trangthai = String.valueOf(tbDangKi.getValueAt(row, 7));
            if (trangthai.equals("DD"))
            {
                JOptionPane.showMessageDialog(this, "Bản đăng kí đã duyệt rồi!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                String idDangKi = String.valueOf(defaultTableModel.getValueAt(row, 0));
                quanLyDangKy.updateTinhTrangDangKi_DaDuyet(idDangKi, user.getIdAccount());
                JOptionPane.showMessageDialog(this, "Duyệt thành công");
            }
        }
    }//GEN-LAST:event_btDuyetActionPerformed

    private void buttonshine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonshine2ActionPerformed
        // TODO add your handling code here:
        int row = tbDangKi.getSelectedRow();
        if(row == -1)
        {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn bản đăng kí trước!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String trangthai = String.valueOf(tbDangKi.getValueAt(row, 7));
            if (trangthai.equals("DD"))
            {
                String idDangKi = String.valueOf(tbDangKi.getValueAt(row, 0));
                dangKiBienSo = new DangKiBienSo();
                dangKiBienSo = quanLyDangKy.getDangKiById(idDangKi);
                ThanhToanFrame inframe=new ThanhToanFrame(dangKiBienSo);
                inframe.setVisible(true);
                inframe.setAlwaysOnTop(true);
            }
            else 
            {
                JOptionPane.showMessageDialog(this, "Bản đăng kí chưa được duyệt!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonshine2ActionPerformed

    private void lbBienSoXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBienSoXeMouseClicked
        // TODO add your handling code here:
        jDialog1.setVisible(false);
    }//GEN-LAST:event_lbBienSoXeMouseClicked

    private void btKhongDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKhongDuyetActionPerformed
        int row = tbDangKi.getSelectedRow();
        if(row == -1)
        {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn bản đăng kí trước!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String trangthai = String.valueOf(tbDangKi.getValueAt(row, 7));
            if (trangthai.equals("DD"))
            {
                JOptionPane.showMessageDialog(this, "Bản đăng kí đã duyệt rồi!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            }
            else 
            {
                String idDangKi = String.valueOf(defaultTableModel.getValueAt(row, 0));
                quanLyDangKy.updateTinhTrangDangKi_KhongDuyet(idDangKi, user.getIdAccount());
                JOptionPane.showMessageDialog(this, "Không duyệt thành công");
            }
        }
    }//GEN-LAST:event_btKhongDuyetActionPerformed

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kGradientPanel1MouseClicked

    private void buttonshine3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonshine3ActionPerformed
        // TODO add your handling code here:
        int row = tbDangKi.getSelectedRow();
        if(row == -1)
        {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn bản đăng kí trước!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            String trangthai = String.valueOf(tbDangKi.getValueAt(row, 7));
            String bienSo = String.valueOf(tbDangKi.getValueAt(row, 8));
            if (trangthai.equals("KD"))
            {
                JOptionPane.showMessageDialog(this, "Bản đăng kí không duyệt rồi!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            }
            if (trangthai.equals("CD"))
            {
                JOptionPane.showMessageDialog(this, "Bản đăng kí chưa duyệt rồi!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            }
            if (trangthai.equals("DD") && !bienSo.equals("0"))
            {
                JOptionPane.showMessageDialog(this, "Đã cấp biển số xe","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                System.out.println(trangthai + bienSo);
            }
            if (trangthai.equals("DD") && bienSo.equals("0"))
            {
                String idDangKi = String.valueOf(defaultTableModel.getValueAt(row, 0));
                Random random = new Random();
                int x = random.nextInt(89999) + 10000;
                lbBienSoXe.setText( String.valueOf(x));
                jDialog1.setLocationRelativeTo(null);
                jDialog1.setVisible(true);
                quanLyDangKy.updateBienSoXe(idDangKi, String.valueOf(x));
                JOptionPane.showMessageDialog(this, "Cập nhập thành công!");
            }
        }
    }//GEN-LAST:event_buttonshine3ActionPerformed

    private void ckboxkhongduyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckboxkhongduyetActionPerformed
        // TODO add your handling code here:
        settabledataif();
    }//GEN-LAST:event_ckboxkhongduyetActionPerformed

    private void ckboxkhongduyetItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckboxkhongduyetItemStateChanged
        settabledataif();
    }//GEN-LAST:event_ckboxkhongduyetItemStateChanged

    private void ckboxchuaduyetItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckboxchuaduyetItemStateChanged
        // TODO add your handling code here:
        settabledataif();
    }//GEN-LAST:event_ckboxchuaduyetItemStateChanged

    private void ckbDaDuyetItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckbDaDuyetItemStateChanged
        // TODO add your handling code here:
        settabledataif();
    }//GEN-LAST:event_ckbDaDuyetItemStateChanged

    private void ckbDaDuyetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbDaDuyetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbDaDuyetActionPerformed

   
    public void settabledataif(){
        if (ckbDaDuyet.isSelected())
        {
            defaultTableModel.setRowCount(0);
            setDataTable(quanLyDangKy.getAllDangKi("DD"));
        }
        if(ckboxchuaduyet.isSelected())
        {
            defaultTableModel.setRowCount(0);
            setDataTable(quanLyDangKy.getAllDangKi("CD"));
        }
        if(ckboxkhongduyet.isSelected())
        {
            defaultTableModel.setRowCount(0);
            setDataTable(quanLyDangKy.getAllDangKi("KD"));
        }
        if(ckbDaDuyet.isSelected() && ckboxchuaduyet.isSelected() && ckboxkhongduyet.isSelected())
        {
            defaultTableModel.setRowCount(0);
            setDataTable(quanLyDangKy.getAllDangKi());
        }
        if(ckbDaDuyet.isSelected() && ckboxchuaduyet.isSelected())
        {
            defaultTableModel.setRowCount(0);
            setDataTable(quanLyDangKy.getAllDangKi("DD","CD"));
        }
        if(ckbDaDuyet.isSelected() && ckboxkhongduyet.isSelected())
        {
            defaultTableModel.setRowCount(0);
            setDataTable(quanLyDangKy.getAllDangKi("DD","KD"));
        }
        if(ckboxchuaduyet.isSelected() && ckboxkhongduyet.isSelected())
        {
            defaultTableModel.setRowCount(0);
            setDataTable(quanLyDangKy.getAllDangKi("KD","CD"));
        }
    }
    
    public final void customTable(JScrollPane scroll,JTable table)
    {
        scroll.getViewport().setBackground(new Color(230,230,230));
        scroll.setViewportBorder(null);
        setBorder(null);
        scroll.setBorder(null);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new ScrollBarCustom(){
            @Override
            public void setForeground(Color fg) {
                super.setForeground(new Color(51,253,15));
            }
            
        });
        scroll.getVerticalScrollBar().setUnitIncrement(30);
        
        JPanel panel=new JPanel();
        panel.setBackground(new Color(255,204,51));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER,panel);
        
        table.setSelectionForeground(new Color(0,0,0));
        table.setSelectionBackground(new Color(51,255,95));
        table.setRowHeight(31);

        setForeground(Color.red);

//        table.setShowHorizontalLines(true);
//        table.setShowVerticalLines(true);
        table.setGridColor(Color.black);
//        tbXe.setBackground(new Color(60,60,60));
//        tbXe.setForeground(new Color(200,200,200));

        DefaultTableCellRenderer tableheader = new DefaultTableCellRenderer(){
            @Override
            public void paint(Graphics g) {
                super.paint(g); //To change body of generated methods, choose Tools | Templates.
                g.setColor(Color.black);
                g.drawLine(0,getHeight()-1,getWidth(),getHeight()-1);
                g.drawLine(0,0,0,getHeight());
            }

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected,
                                                          hasFocus, row, column);
                c.setFont(new Font("Serif", Font.BOLD, 16));
                return c;
            }
            
        };
        tableheader.setPreferredSize(new Dimension(0,30)); // header table
        tableheader.setForeground(Color.black);
        tableheader.setBackground(new Color(51,253,15));
        tableheader.setHorizontalAlignment(SwingConstants.CENTER);
        
        table.getTableHeader().setDefaultRenderer(tableheader);
      
//        table.getTableHeader().setFont(new Font("Segoe UI", 30, 30));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customcp.Buttonshine btDuyet;
    private customcp.Buttonshine btKhongDuyet;
    private javax.swing.JButton btsearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private customcp.Buttonshine buttonshine2;
    private customcp.Buttonshine buttonshine3;
    private customcp.Buttonshine buttonshine4;
    private javax.swing.JCheckBox ckbDaDuyet;
    private javax.swing.JCheckBox ckboxchuaduyet;
    private javax.swing.JCheckBox ckboxkhongduyet;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbBienSoXe;
    private javax.swing.JTable tbDangKi;
    private javax.swing.JLabel txtmanv;
    private javax.swing.JLabel txtrole;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JLabel txttennv;
    // End of variables declaration//GEN-END:variables


}
