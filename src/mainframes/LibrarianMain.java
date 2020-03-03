package mainframes;

import Forms.*;
import Log.YouAre;
import classes.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LibrarianMain extends javax.swing.JFrame {

    public LibrarianMain() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void selectBook() {
        DefaultTableModel addTable = (DefaultTableModel) booksTable.getModel();
        Statement state;

        try {
            state = Lms_Connection.lms_con.createStatement();

            ResultSet add = state.executeQuery("SELECT * FROM books");
            while (add.next()) {
                String title = add.getString("title");
                String author = add.getString("author");
                int isbn = add.getInt("isbn");
                String subject = add.getString("subject");
                int editionNo = add.getInt("editionNo");
                int quantity = add.getInt("quantity");
                int shelfNo = add.getInt("shelfNo");
                String genre = add.getString("genre");
                addTable.addRow(new Object[]{title, author, isbn, subject, editionNo, quantity, shelfNo, genre});
            }
            state.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void removeBookData() {

        DefaultTableModel addTable = (DefaultTableModel) booksTable.getModel();
        while (addTable.getRowCount() > 0) {
            addTable.removeRow(0);
        }
    }

    //member select method and remove method
    public void selectMemberData() {
        DefaultTableModel addTable = (DefaultTableModel) membersTable.getModel();
        Statement state;

        try {
            state = Lms_Connection.lms_con.createStatement();

            ResultSet add = state.executeQuery("SELECT * FROM library_member");
            while (add.next()) {
                int id = add.getInt("id");
                String fullName = add.getString("name");
                String major = add.getString("major");
                String gender = add.getString("gender");
                int contactNo = add.getInt("contact");
                String address = add.getString("address");
                String expire = add.getString("expire_date");
                addTable.addRow(new Object[]{id, fullName, major, gender, contactNo, address, expire});
            }
            state.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void removeMemberData() {

        DefaultTableModel addTable = (DefaultTableModel) membersTable.getModel();
        while (addTable.getRowCount() > 0) {
            addTable.removeRow(0);
        }
    }
    //

    public void selectIssuedBook() {
        DefaultTableModel addTable = (DefaultTableModel) issueTable.getModel();
        Statement state;

        try {
            state = Lms_Connection.lms_con.createStatement();

            ResultSet add = state.executeQuery("SELECT * FROM issued_book");
            while (add.next()) {
                int isbn = add.getInt("book_isbn");
                String title = add.getString("title");
                String subject = add.getString("subject");
                int shelfNo = add.getInt("shelf_no");

                int id = add.getInt("member_id");
                String fullName = add.getString("member_name");
                String issedDate = add.getString("issued_date");
                String returnDate = add.getString("return_date");
                addTable.addRow(new Object[]{isbn, title, shelfNo, subject, id, fullName, issedDate, returnDate});
            }
            state.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void removeIssuedData() {

        DefaultTableModel addTable = (DefaultTableModel) issueTable.getModel();
        while (addTable.getRowCount() > 0) {
            addTable.removeRow(0);
        }
    }

    public void returnBook(int bookIsbn, int memberId) {

        Statement state;

        try {
            state = Lms_Connection.lms_con.createStatement();

            ResultSet add = state.executeQuery("SELECT * FROM issued_book");
            while (add.next()) {
                if (bookIsbn == add.getInt("book_isbn") && memberId == add.getInt("member_id")) {

                    IssueBook issue = new IssueBook();
                    issue.delete(bookIsbn);

                }
            }
            state.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void removeRetrunedBook() {

        DefaultTableModel addTable = (DefaultTableModel) issueTable.getModel();
        while (addTable.getRowCount() > 0) {
            addTable.removeRow(0);
        }
    }

    public javax.swing.JTabbedPane dashboard() {

        return dashboardTabbed;
    }

    public javax.swing.JButton rdo() {
        return listBtn1;
    }

    public javax.swing.JButton rdo2() {
        return listBtn2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        dashboardTabbed = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addBtn1 = new javax.swing.JButton();
        listBtn1 = new javax.swing.JButton();
        updateBtn1 = new javax.swing.JButton();
        removeBtn1 = new javax.swing.JButton();
        searchBtn1 = new javax.swing.JButton();
        searchBookTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        membersTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        addBtn2 = new javax.swing.JButton();
        listBtn2 = new javax.swing.JButton();
        removeBtn2 = new javax.swing.JButton();
        updateBtn2 = new javax.swing.JButton();
        searchBtn2 = new javax.swing.JButton();
        searchMemberTxt = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        borrowBtn = new javax.swing.JButton();
        listBorrowBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        issueTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LMS");
        setPreferredSize(new java.awt.Dimension(927, 650));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(25, 180, 156));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html><u>Book</u></html>");

        addBtn1.setBackground(new java.awt.Color(0, 51, 51));
        addBtn1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        addBtn1.setForeground(new java.awt.Color(255, 255, 255));
        addBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/book-add.png"))); // NOI18N
        addBtn1.setText("       Add");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });

        listBtn1.setBackground(new java.awt.Color(0, 51, 51));
        listBtn1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        listBtn1.setForeground(new java.awt.Color(255, 255, 255));
        listBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/list.png"))); // NOI18N
        listBtn1.setText("       List");
        listBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtn1ActionPerformed(evt);
            }
        });

        updateBtn1.setBackground(new java.awt.Color(0, 51, 51));
        updateBtn1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        updateBtn1.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/pen.png"))); // NOI18N
        updateBtn1.setText("   Update");
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });

        removeBtn1.setBackground(new java.awt.Color(0, 51, 51));
        removeBtn1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        removeBtn1.setForeground(new java.awt.Color(255, 255, 255));
        removeBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/remove.png"))); // NOI18N
        removeBtn1.setText(" Remove");
        removeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtn1ActionPerformed(evt);
            }
        });

        searchBtn1.setBackground(new java.awt.Color(0, 51, 51));
        searchBtn1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        searchBtn1.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/search.png"))); // NOI18N
        searchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn1ActionPerformed(evt);
            }
        });

        searchBookTxt.setBackground(new java.awt.Color(25, 180, 156));
        searchBookTxt.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        searchBookTxt.setText("search...");
        searchBookTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        searchBookTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBookTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(listBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(searchBookTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(searchBookTxt))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "author", "isbn", "subject", "edition no", "quantity", "shelf no", "genre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booksTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(booksTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboardTabbed.addTab("Book Dashboard", jPanel1);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        membersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "major", "gender", "contact", "address", "expire date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        membersTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(membersTable);

        jPanel5.setBackground(new java.awt.Color(25, 180, 156));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html><u>Member</u></html>");

        addBtn2.setBackground(new java.awt.Color(0, 51, 51));
        addBtn2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        addBtn2.setForeground(new java.awt.Color(255, 255, 255));
        addBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/book-add.png"))); // NOI18N
        addBtn2.setText("       Add");
        addBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn2ActionPerformed(evt);
            }
        });

        listBtn2.setBackground(new java.awt.Color(0, 51, 51));
        listBtn2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        listBtn2.setForeground(new java.awt.Color(255, 255, 255));
        listBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/list.png"))); // NOI18N
        listBtn2.setText("       List");
        listBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtn2ActionPerformed(evt);
            }
        });

        removeBtn2.setBackground(new java.awt.Color(0, 51, 51));
        removeBtn2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        removeBtn2.setForeground(new java.awt.Color(255, 255, 255));
        removeBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/remove.png"))); // NOI18N
        removeBtn2.setText(" Remove");
        removeBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtn2ActionPerformed(evt);
            }
        });

        updateBtn2.setBackground(new java.awt.Color(0, 51, 51));
        updateBtn2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        updateBtn2.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/pen.png"))); // NOI18N
        updateBtn2.setText("   Update");
        updateBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn2ActionPerformed(evt);
            }
        });

        searchBtn2.setBackground(new java.awt.Color(0, 51, 51));
        searchBtn2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        searchBtn2.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/search.png"))); // NOI18N
        searchBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn2ActionPerformed(evt);
            }
        });

        searchMemberTxt.setBackground(new java.awt.Color(25, 180, 156));
        searchMemberTxt.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        searchMemberTxt.setText("search...");
        searchMemberTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        searchMemberTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMemberTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(listBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(removeBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(searchMemberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchMemberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        dashboardTabbed.addTab("Member Dashboard", jPanel4);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));

        jPanel10.setBackground(new java.awt.Color(25, 180, 156));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html><u>Issue Book</u></html>");

        borrowBtn.setBackground(new java.awt.Color(0, 51, 51));
        borrowBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        borrowBtn.setForeground(new java.awt.Color(255, 255, 255));
        borrowBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/book-add.png"))); // NOI18N
        borrowBtn.setText("     Borrow Book");
        borrowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBtnActionPerformed(evt);
            }
        });

        listBorrowBtn.setBackground(new java.awt.Color(0, 51, 51));
        listBorrowBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        listBorrowBtn.setForeground(new java.awt.Color(255, 255, 255));
        listBorrowBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/list.png"))); // NOI18N
        listBorrowBtn.setText("List Issued Book");
        listBorrowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBorrowBtnActionPerformed(evt);
            }
        });

        returnBtn.setBackground(new java.awt.Color(0, 51, 51));
        returnBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        returnBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/remove.png"))); // NOI18N
        returnBtn.setText("Return Book");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listBorrowBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(borrowBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(borrowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listBorrowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        issueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "book id", "title", "subject", "shelf no", "member id", "member name", "issued date", "return date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(issueTable);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        dashboardTabbed.addTab("Issue Book", jPanel8);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setBackground(new java.awt.Color(25, 180, 156));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 180, 156));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/logo.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/top.png"))); // NOI18N

        logoutBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(204, 0, 0));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoutBtn)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenuBar1.setBackground(new java.awt.Color(25, 180, 156));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Book");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Add Books");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("List Books");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem12.setText("List Borrowed Books");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setText("Update Books");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem4.setText("Remove Book");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Member");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Add Member");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("List Members");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem10.setText("Update Member");
        jMenu3.add(jMenuItem10);

        jMenuItem7.setText("Remove Member");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu7.setText("Search");

        jMenuItem14.setText("Book");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem15.setText("Member");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("About");

        jMenuItem8.setText("Open Source");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("About");
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardTabbed)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dashboardTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void updateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn2ActionPerformed
        // update the database
        DefaultTableModel table = (DefaultTableModel) membersTable.getModel();
        int row = membersTable.getSelectedRow();//return the index of the first row selected

        int id = Integer.parseInt(table.getValueAt(row, 0).toString());
        String name = (String) table.getValueAt(row, 1);
        String major = (String) table.getValueAt(row, 2);
        String gender = (String) table.getValueAt(row, 3);
        int contactNo = Integer.parseInt(table.getValueAt(row, 4).toString());
        String address = (String) table.getValueAt(row, 5);
        String expire = (String) table.getValueAt(row, 6);

        MemberForm show = new MemberForm();
        show.setData(name, gender, address, contactNo, id, major, expire);
        show.setVisible(true);
        dispose();
    }//GEN-LAST:event_updateBtn2ActionPerformed

    private void removeBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtn2ActionPerformed
        int row = membersTable.getSelectedRow();
        int id = Integer.parseInt(membersTable.getValueAt(row, 0).toString());
        LibraryMember del = new LibraryMember();
        del.delete(id);

        removeMemberData();
        listBtn2.doClick();
    }//GEN-LAST:event_removeBtn2ActionPerformed

    private void listBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBtn2ActionPerformed
        //list in the table
        removeMemberData();
        selectMemberData();
    }//GEN-LAST:event_listBtn2ActionPerformed

    private void addBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn2ActionPerformed

        MemberForm ob = new MemberForm();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_addBtn2ActionPerformed

    private void removeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtn1ActionPerformed

        int confirm = JOptionPane.showConfirmDialog(this, "Are You Sure?", "Delete Data", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        switch(confirm) {
            case JOptionPane.YES_OPTION:
            int row = booksTable.getSelectedRow();
            int isbn = Integer.parseInt(booksTable.getValueAt(row, 2).toString());
            Book del = new Book();
            del.delete(isbn);

            removeBookData();
            listBtn1.doClick();
            break;
            
            case JOptionPane.NO_OPTION:
                System.out.println("aasd");
                break;
        }
        

    }//GEN-LAST:event_removeBtn1ActionPerformed

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        // update the database
        DefaultTableModel table = (DefaultTableModel) booksTable.getModel();
        int row = booksTable.getSelectedRow();//return the index of the first row selected

        String title = (String) table.getValueAt(row, 0);
        String author = (String) table.getValueAt(row, 1);
        int isbn = Integer.parseInt(table.getValueAt(row, 2).toString());
        String subject = (String) table.getValueAt(row, 3);
        int editionNo = Integer.parseInt(table.getValueAt(row, 4).toString());
        int quantity = Integer.parseInt(table.getValueAt(row, 5).toString());
        int shelfNo = Integer.parseInt(table.getValueAt(row, 6).toString());
        String genre = (String) table.getValueAt(row, 7);

        BookForm show = new BookForm();
        show.setData(isbn, title, author, editionNo, quantity, subject, shelfNo);
        show.setVisible(true);
        dispose();
    }//GEN-LAST:event_updateBtn1ActionPerformed

    private void listBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBtn1ActionPerformed
        //list in the table
        removeBookData();
        selectBook();
    }//GEN-LAST:event_listBtn1ActionPerformed

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        // Book Form
        BookForm form = new BookForm();
        form.book();
        dispose();
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void searchBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn2ActionPerformed
        //search in members
        DefaultTableModel addTable = (DefaultTableModel) membersTable.getModel();
        Statement state;
        int idSearch = Integer.parseInt(searchMemberTxt.getText());
        removeMemberData();
        try {

            state = Lms_Connection.lms_con.createStatement();

            ResultSet add = state.executeQuery("SELECT * FROM library_member");
            while (add.next()) {
                if (idSearch == add.getInt("id")) {
                    int id = add.getInt("id");
                    String fullName = add.getString("name");
                    String major = add.getString("major");
                    String gender = add.getString("gender");
                    int contactNo = add.getInt("contact");
                    String address = add.getString("address");
                    String expire = add.getString("expire_date");
                    addTable.addRow(new Object[]{id, fullName, major, gender, contactNo, address, expire});
                }
            }
            state.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchBtn2ActionPerformed

    private void searchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn1ActionPerformed
        //search in book
        DefaultTableModel addTable = (DefaultTableModel) booksTable.getModel();
        Statement state;
        int isbnSearch = Integer.parseInt(searchBookTxt.getText());
        removeBookData();
        try {

            state = Lms_Connection.lms_con.createStatement();

            ResultSet add = state.executeQuery("SELECT * FROM books");
            while (add.next()) {

                if (isbnSearch == add.getInt("isbn")) {
                    String title = add.getString("title");
                    String author = add.getString("author");
                    int isbn = add.getInt("isbn");
                    String subject = add.getString("subject");
                    int editionNo = add.getInt("editionNo");
                    int quantity = add.getInt("quantity");
                    int shelfNo = add.getInt("shelfNo");
                    String genre = add.getString("genre");
                    addTable.addRow(new Object[]{title, author, isbn, subject, editionNo, quantity, shelfNo, genre});
                }
            }
            state.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchBtn1ActionPerformed

    private void borrowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBtnActionPerformed
        // 
        BorrowBook borrow = new BorrowBook();
        borrow.setVisible(true);
        borrow.setDate();
        dispose();
    }//GEN-LAST:event_borrowBtnActionPerformed

    private void listBorrowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBorrowBtnActionPerformed
        removeIssuedData();
        selectIssuedBook();

    }//GEN-LAST:event_listBorrowBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed

        ReturnBook show = new ReturnBook();
        show.setVisible(true);
        dispose();
    }//GEN-LAST:event_returnBtnActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        removeBtn2.doClick();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        dashboardTabbed.setSelectedIndex(1);
        searchMemberTxt.setText("");
        searchMemberTxt.requestFocusInWindow();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        //
        YouAre you = new YouAre();
        you.youAre();
        dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        removeBtn1.doClick();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        updateBtn1.doClick();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        dashboardTabbed.setSelectedIndex(2);
        listBorrowBtn.doClick();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        listBtn1.doClick();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        addBtn1.doClick();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        addBtn2.doClick();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        dashboardTabbed.setSelectedIndex(1);
        listBtn2.doClick();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        updateBtn2.doClick();
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        searchBookTxt.setText("");
        searchMemberTxt.requestFocusInWindow();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void searchBookTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBookTxtMouseClicked
        searchBookTxt.setText("");
    }//GEN-LAST:event_searchBookTxtMouseClicked

    private void searchMemberTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMemberTxtMouseClicked
        searchMemberTxt.setText("");
    }//GEN-LAST:event_searchMemberTxtMouseClicked

    /**
     * @param args the command line arguments
     */
    public void librarianMain() {
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
            java.util.logging.Logger.getLogger(LibrarianMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn1;
    private javax.swing.JButton addBtn2;
    private javax.swing.JTable booksTable;
    private javax.swing.JButton borrowBtn;
    private javax.swing.JTabbedPane dashboardTabbed;
    private javax.swing.JTable issueTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton listBorrowBtn;
    private javax.swing.JButton listBtn1;
    private javax.swing.JButton listBtn2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable membersTable;
    private javax.swing.JButton removeBtn1;
    private javax.swing.JButton removeBtn2;
    private javax.swing.JButton returnBtn;
    private javax.swing.JTextField searchBookTxt;
    private javax.swing.JButton searchBtn1;
    private javax.swing.JButton searchBtn2;
    private javax.swing.JTextField searchMemberTxt;
    private javax.swing.JButton updateBtn1;
    private javax.swing.JButton updateBtn2;
    // End of variables declaration//GEN-END:variables
}
