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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class QuanLyNhanVienPanel extends javax.swing.JPanel {

    DefaultTableModel defaultTableModel;
   
    BufferedImage xulyanh;
    JFileChooser changeAvatar;
    
    public QuanLyNhanVienPanel() {
        initComponents();
    }
    
   
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsodienthoai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttentk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtmadinhdanh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtquequan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ckchucvu = new javax.swing.JComboBox<>();
        ckgioitinh = new javax.swing.JComboBox<>();
        ScrollPane1 = new javax.swing.JScrollPane();
        tabledata = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btthem = new customcp.Buttonshine();
        btxoa = new customcp.Buttonshine();
        btsuauser = new customcp.Buttonshine();
        btdatlai = new customcp.Buttonshine();
        btsearch = new customcp.Buttonshine();
        btxacnhan = new customcp.Buttonshine();
        jPanel3 = new javax.swing.JPanel();
        txtmanv = new javax.swing.JLabel();
        imageAvatar = new customcp.ImageAvatar();
        lbdoianhdd = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(947, 680));
        setPreferredSize(new java.awt.Dimension(947, 680));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin nhân viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Họ tên");

        txthoten.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính");

        txtsodienthoai.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Số điện thoại");

        txttentk.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tên tài khoản");

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mật khẩu");

        txtmadinhdanh.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mã định danh");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Quê quán");

        txtquequan.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Chức vụ");

        ckchucvu.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ckchucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        ckgioitinh.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ckgioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtquequan)
                    .addComponent(txtsodienthoai)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckgioitinh, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmadinhdanh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txttentk, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(ckchucvu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txttentk, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(ckgioitinh))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtmadinhdanh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtquequan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addComponent(ckchucvu))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tabledata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabledata.setModel(new javax.swing.table.DefaultTableModel(
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
        tabledata.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ScrollPane1.setViewportView(tabledata);

        txtsearch.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtsearch.setText("Tìm mã, tên, tên tài khoản...");
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

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        btthem.setBackground(new java.awt.Color(51, 253, 15));
        btthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btthem.setText("Thêm");
        btthem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });
        jPanel2.add(btthem);

        btxoa.setBackground(new java.awt.Color(51, 253, 15));
        btxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btxoa.setText("Xóa");
        btxoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });
        jPanel2.add(btxoa);

        btsuauser.setBackground(new java.awt.Color(51, 253, 15));
        btsuauser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btsuauser.setText("Sửa");
        btsuauser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btsuauser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuauserActionPerformed(evt);
            }
        });
        jPanel2.add(btsuauser);

        btdatlai.setBackground(new java.awt.Color(51, 253, 15));
        btdatlai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btdatlai.setText("Đặt lại");
        btdatlai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btdatlai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdatlaiActionPerformed(evt);
            }
        });
        jPanel2.add(btdatlai);

        btsearch.setBackground(new java.awt.Color(51, 253, 15));
        btsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btsearch.setText("Tìm");
        btsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchActionPerformed(evt);
            }
        });

        btxacnhan.setBackground(new java.awt.Color(51, 253, 15));
        btxacnhan.setText("Xác nhận");
        btxacnhan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btxacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxacnhanActionPerformed(evt);
            }
        });

        jPanel3.setOpaque(false);

        txtmanv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmanv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtmanv.setText("Mã NV:");

        imageAvatar.setToolTipText("");
        imageAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NV00001.png"))); // NOI18N

        lbdoianhdd.setBackground(new java.awt.Color(51, 253, 15));
        lbdoianhdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbdoianhdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbdoianhdd.setToolTipText("");
        lbdoianhdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbdoianhddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbdoianhddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbdoianhddMouseExited(evt);
            }
        });
        imageAvatar.add(lbdoianhdd);
        lbdoianhdd.setBounds(60, 60, 70, 30);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(txtmanv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtmanv)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btxacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btxacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusGained
        // TODO add your handling code here:
    
    }//GEN-LAST:event_txtsearchFocusGained

    private void txtsearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsearchFocusLost
        // TODO add your handling code here:
    
    }//GEN-LAST:event_txtsearchFocusLost

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
        btsearchActionPerformed(evt);
    }//GEN-LAST:event_txtsearchActionPerformed

    private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btsearchActionPerformed

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btthemActionPerformed

    private void btdatlaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdatlaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btdatlaiActionPerformed

    private void btxacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxacnhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btxacnhanActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btxoaActionPerformed

    private void btsuauserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuauserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btsuauserActionPerformed

    private void lbdoianhddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbdoianhddMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbdoianhddMouseEntered

    private void lbdoianhddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbdoianhddMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbdoianhddMouseExited

    private void lbdoianhddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbdoianhddMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbdoianhddMouseClicked

    
    
    
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
        
        JPanel panel=new JPanel(){
            @Override
            public void paint(Graphics g) {
                super.paint(g); //To change body of generated methods, choose Tools | Templates.
                g.drawLine(0,getHeight()-1,getWidth(),getHeight()-1);
            }
            
        };
        panel.setBackground(new Color(51,253,15));
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
    private javax.swing.JScrollPane ScrollPane1;
    private customcp.Buttonshine btdatlai;
    private customcp.Buttonshine btsearch;
    private customcp.Buttonshine btsuauser;
    private customcp.Buttonshine btthem;
    private customcp.Buttonshine btxacnhan;
    private customcp.Buttonshine btxoa;
    private javax.swing.JComboBox<String> ckchucvu;
    private javax.swing.JComboBox<String> ckgioitinh;
    private customcp.ImageAvatar imageAvatar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbdoianhdd;
    private javax.swing.JTable tabledata;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmadinhdanh;
    private javax.swing.JLabel txtmanv;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtquequan;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsodienthoai;
    private javax.swing.JTextField txttentk;
    // End of variables declaration//GEN-END:variables
}