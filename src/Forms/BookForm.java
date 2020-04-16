/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import dashboard.LibrarianDashboard;
import classes.*;
import javax.swing.JOptionPane;
        
        
public class BookForm extends javax.swing.JFrame {

    private int isbn;
    private String title;
    private String author;
    private int editionNo;
    private int quantity;
    private String subject;
    private int shelfNo;
    private String genre = "";
    
    public BookForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void getData(){
        title = titleTxt.getText();
        author = authorTxt.getText();
        isbn = Integer.parseInt(isbnTxt.getText());
        subject = subjectTxt.getText();
        editionNo = Integer.parseInt(editionNoTxt.getText());
        quantity = Integer.parseInt(quantityTxt.getText());
        shelfNo = Integer.parseInt(shelfNoTxt.getText());
        
        if(genreList.getSelectedIndex() != -1){
            for(String gen : genreList.getSelectedValuesList()){
                genre += gen+",";
            }
        }
    }
    
    public void setData(int isbn,String title,String author,int editionNo,int quantity,String subject,int shelfNo){
        
        titleTxt.setText(title);
        authorTxt.setText(author);
        isbnTxt.setText(Integer.toString(isbn));
        subjectTxt.setText(subject);
        editionNoTxt.setText(Integer.toString(editionNo));
        quantityTxt.setText(Integer.toString(quantity));
        shelfNoTxt.setText(Integer.toString(shelfNo));
        
     }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newBookPanel1 = new javax.swing.JPanel();
        newBookPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        editionNoLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        shelfNoLabel = new javax.swing.JLabel();
        titleTxt = new javax.swing.JTextField();
        authorTxt = new javax.swing.JTextField();
        editionNoTxt = new javax.swing.JTextField();
        quantityTxt = new javax.swing.JTextField();
        subjectTxt = new javax.swing.JTextField();
        shelfNoTxt = new javax.swing.JTextField();
        genreLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        genreList = new javax.swing.JList<>();
        recordBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        isbnLabel = new javax.swing.JLabel();
        isbnTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        newBookInfoTitle = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Book");
        setResizable(false);

        newBookPanel1.setBackground(new java.awt.Color(51, 51, 51));
        newBookPanel1.setForeground(new java.awt.Color(0, 102, 102));
        newBookPanel1.setPreferredSize(new java.awt.Dimension(370, 529));

        newBookPanel2.setBackground(new java.awt.Color(25, 180, 156));
        newBookPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Franklin Gothic Demi Cond", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        newBookPanel2.setForeground(new java.awt.Color(0, 102, 102));

        titleLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title:");

        authorLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        authorLabel.setForeground(new java.awt.Color(255, 255, 255));
        authorLabel.setText("Author(s):");

        editionNoLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        editionNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        editionNoLabel.setText("Edition no:");

        quantityLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        quantityLabel.setText("Quantity:");

        subjectLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        subjectLabel.setForeground(new java.awt.Color(255, 255, 255));
        subjectLabel.setText("Subject:");

        shelfNoLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        shelfNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        shelfNoLabel.setText("Shelf no:");

        genreLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(255, 255, 255));
        genreLabel.setText("Genre:");

        genreList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dictionary", "Encyclopedia", "Guide", "TextBook", "Fantasy", "Journal", "Fairytale", "Poetry", "Science Fiction", "Short Story", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(genreList);

        recordBtn.setBackground(new java.awt.Color(0, 51, 51));
        recordBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        recordBtn.setForeground(new java.awt.Color(255, 255, 255));
        recordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/record.png"))); // NOI18N
        recordBtn.setText("Record");
        recordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(204, 0, 0));
        clearBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/cleaner.png"))); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        isbnLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        isbnLabel.setForeground(new java.awt.Color(255, 255, 255));
        isbnLabel.setText("ISBN:");

        updateBtn.setBackground(new java.awt.Color(0, 51, 51));
        updateBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/record.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newBookPanel2Layout = new javax.swing.GroupLayout(newBookPanel2);
        newBookPanel2.setLayout(newBookPanel2Layout);
        newBookPanel2Layout.setHorizontalGroup(
            newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newBookPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newBookPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quantityLabel)
                            .addComponent(shelfNoLabel)
                            .addComponent(genreLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shelfNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(newBookPanel2Layout.createSequentialGroup()
                                .addComponent(recordBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateBtn)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(newBookPanel2Layout.createSequentialGroup()
                        .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editionNoLabel)
                            .addComponent(titleLabel)
                            .addComponent(isbnLabel)
                            .addComponent(authorLabel)
                            .addComponent(subjectLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subjectTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(authorTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(editionNoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(titleTxt)
                                .addComponent(isbnTxt)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newBookPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clearBtn))))
        );
        newBookPanel2Layout.setVerticalGroup(
            newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newBookPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isbnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editionNoLabel)
                    .addComponent(editionNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shelfNoLabel)
                    .addComponent(shelfNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genreLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newBookPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recordBtn)
                    .addComponent(updateBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(25, 180, 156));

        newBookInfoTitle.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        newBookInfoTitle.setForeground(new java.awt.Color(255, 255, 255));
        newBookInfoTitle.setText("<html><u>Book Form</u></html>");

        backBtn.setBackground(new java.awt.Color(25, 180, 156));
        backBtn.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/backward.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newBookInfoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newBookInfoTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout newBookPanel1Layout = new javax.swing.GroupLayout(newBookPanel1);
        newBookPanel1.setLayout(newBookPanel1Layout);
        newBookPanel1Layout.setHorizontalGroup(
            newBookPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newBookPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newBookPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newBookPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        newBookPanel1Layout.setVerticalGroup(
            newBookPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newBookPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newBookPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newBookPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newBookPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // clear to default
        titleTxt.setText("");
        authorTxt.setText("");
        isbnTxt.setText("");
        subjectTxt.setText("");
        editionNoTxt.setText("");
        quantityTxt.setText("");
        shelfNoTxt.setText("");
        genreList.clearSelection();
        
    }//GEN-LAST:event_clearBtnActionPerformed

    private void recordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordBtnActionPerformed
        // record book button
        getData();
        
        Book info = new Book();
        info.addBooInfo1(isbn, title, author, editionNo);
        info.addBookInfo2(quantity, subject, shelfNo, genre);
        info.register();
        
    int ok = 0;
        JOptionPane.showMessageDialog(this, "Your Data is Successfully Recorded!", "Data Recorded",JOptionPane.INFORMATION_MESSAGE);
        if(ok == 0){
            //to return to dashboard
        LibrarianDashboard lab = new LibrarianDashboard();
        lab.setVisible(true);
        lab.dashboard().setSelectedIndex(0);
            dispose();
            
        }
        
    }//GEN-LAST:event_recordBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //update database
        getData();
        Book info = new Book();
        info.addBooInfo1(isbn, title, author, editionNo);
        info.addBookInfo2(quantity, subject, shelfNo, genre);
        info.update();
        
        
        
         int ok = 0;
        JOptionPane.showMessageDialog(this, "Your Data is Successfully Updated!", "Data Recorded",JOptionPane.INFORMATION_MESSAGE);
        if(ok == 0){
          //to return to dashboard
        LibrarianDashboard lab = new LibrarianDashboard();
        lab.setVisible(true);
        lab.dashboard().setSelectedIndex(0);
        dispose();
        lab.rdo().doClick();
            dispose();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // go Backward
        dispose();
        LibrarianDashboard m = new LibrarianDashboard();
        m.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public void book() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel editionNoLabel;
    private javax.swing.JTextField editionNoTxt;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JList<String> genreList;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JTextField isbnTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel newBookInfoTitle;
    private javax.swing.JPanel newBookPanel1;
    private javax.swing.JPanel newBookPanel2;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton recordBtn;
    private javax.swing.JLabel shelfNoLabel;
    private javax.swing.JTextField shelfNoTxt;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTextField subjectTxt;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
