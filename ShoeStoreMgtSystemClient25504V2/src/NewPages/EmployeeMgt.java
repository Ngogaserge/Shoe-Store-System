/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewPages;

import Model.Employee;
import Service.EmployeeService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Serge
 */
public class EmployeeMgt extends javax.swing.JInternalFrame {
    DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * Creates new form EmployeeMgt
     */
    public EmployeeMgt() {
        initComponents();
        addTableColumnsHeader();
        addTableRowDataEmployee();
    }
    private void addTableColumnsHeader(){
        tableModel.addColumn("Id");
        tableModel.addColumn("First Name");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("Contact");
        tableModel.addColumn("Username");
        tableModel.addColumn("Password");
        tableModel.addColumn("Position");
        empTable.setModel(tableModel);
    }
    
    private void addTableRowDataEmployee(){
        try {
            tableModel.setRowCount(0);
            Registry thereg = LocateRegistry.getRegistry("127.0.0.1", 6000);
            EmployeeService service = (EmployeeService) thereg.lookup("employee");
            List<Employee> employees = service.retrieveEmployee();
            for(Employee theemp: employees){
                tableModel.addRow(new Object[]{
                    theemp.getEmployeeId(),
                    theemp.getFirstName(),
                    theemp.getLastName(),
                    theemp.getContacts(),
                    theemp.getUsername(),
                    theemp.getPassword(),
                    theemp.getPosition()
                        
//                thecustomers.getCust_phone()
                });
            }
        } catch (RemoteException ex) {
            Logger.getLogger(EmployeeMgt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(EmployeeMgt.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fnametxt = new javax.swing.JTextField();
        lnametxt = new javax.swing.JTextField();
        contacttxt = new javax.swing.JTextField();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JTextField();
        positiontxt = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        searchtxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setText("LastName");

        jLabel4.setText("Contact:");

        jLabel5.setText("Username:");

        jLabel6.setText("Password:");

        jLabel7.setText("Position");

        fnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnametxtActionPerformed(evt);
            }
        });

        lnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnametxtActionPerformed(evt);
            }
        });

        contacttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttxtActionPerformed(evt);
            }
        });

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("First Name:");

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(empTable);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/icons8-print-24.png"))); // NOI18N
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lnametxt)
                                    .addComponent(contacttxt)
                                    .addComponent(usernametxt)
                                    .addComponent(passwordtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(fnametxt))
                                .addGap(94, 94, 94)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(positiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addComponent(jButton3)
                                .addGap(62, 62, 62)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(189, 189, 189))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(registerBtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(positiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerBtn)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addContainerGap(466, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contacttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttxtActionPerformed

    private void lnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnametxtActionPerformed

    private void fnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnametxtActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
         try {
        if(fnametxt.getText().trim().isEmpty() || lnametxt.getText().trim().isEmpty() || contacttxt == null || contacttxt.getText().trim().isEmpty()  ){
            JOptionPane.showMessageDialog(this, "Plsease Fill All fields","Empty Field",JOptionPane.ERROR_MESSAGE);
           // resetBtnActionPerformed(evt);
        
       
            //resetBtnActionPerformed(evt);
        }
        else if(contacttxt.getText().length() != 10){
         JOptionPane.showMessageDialog(this, "Contact should be size 10 ","Invalid Field",JOptionPane.ERROR_MESSAGE);    
        }
        
        else if(!usernametxt.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$")){
            JOptionPane.showMessageDialog(this, "Please enter a real email format","Invalid input",JOptionPane.ERROR_MESSAGE);
        }
        else{
            Employee employee = new Employee();
            employee.setFirstName(fnametxt.getText());
            employee.setLastName(lnametxt.getText());
            employee.setContacts(contacttxt.getText());
            employee.setUsername(usernametxt.getText());
            employee.setPassword(passwordtxt.getText());
            employee.setPosition(positiontxt.getText());

            Registry thereg = LocateRegistry.getRegistry("127.0.0.1", 6000);
            EmployeeService service = (EmployeeService) thereg.lookup("employee");
            Employee employeeObj = service.registerEmployee(employee);
            if (employeeObj != null) {
                JOptionPane.showMessageDialog(this, "Employee registered", "Result", JOptionPane.INFORMATION_MESSAGE);
            addTableRowDataEmployee();
            } else {
                JOptionPane.showMessageDialog(this, "Employee not registered", "Result", JOptionPane.ERROR_MESSAGE);
            }
            

        }
         }catch (Exception e) {
            e.printStackTrace();
        }
         
                        // TODO add your handling code here:
    }//GEN-LAST:event_registerBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = empTable.getSelectedRow();
        DefaultTableModel tbModel = (DefaultTableModel) empTable.getModel();
        int theId = Integer.parseInt(tbModel.getValueAt(selectedRow,0).toString());   
        Employee emp = new Employee();
        emp.setEmployeeId(theId);
        emp.setFirstName(fnametxt.getText());
        emp.setLastName(lnametxt.getText());
        emp.setContacts(contacttxt.getText());
        emp.setUsername(usernametxt.getText());
        emp.setPassword(passwordtxt.getText());
        emp.setPosition(positiontxt.getText());
        try {
            Registry theregistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            
            EmployeeService service = (EmployeeService) theregistry.lookup("employee");

//            shoe.setShoeId(Integer.parseInt(searchtxt.getText()));
            Employee employeeObj = service.updateEmployee(emp);
              if (selectedRow == -1) {
    // No row is selected, handle this case appropriately
    JOptionPane.showMessageDialog(null, "Please select a row to update.", "No row selected", JOptionPane.WARNING_MESSAGE);
    return;
}
            if (employeeObj != null){
            JOptionPane.showMessageDialog(this, "Employee updated","Result",JOptionPane.INFORMATION_MESSAGE);
            addTableRowDataEmployee();
            fnametxt.setText("");
            lnametxt.setText("");
            contacttxt.setText("");
            usernametxt.setText("");
            passwordtxt.setText("");
            positiontxt.setText("");
            
            }else{
            JOptionPane.showMessageDialog(this, "Employee not updated","Result", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
          Registry thereg = LocateRegistry.getRegistry("127.0.0.1", 6000);
          EmployeeService service = (EmployeeService) thereg.lookup("employee");
          Employee employee = new Employee();
          employee.setEmployeeId(Integer.parseInt(searchtxt.getText()));
          Employee employeeObj = service.deleteEmployee(employee);
          if(employeeObj == null){
              JOptionPane.showMessageDialog(this, "Employee not deleted","Result", JOptionPane.ERROR_MESSAGE);
          
          }
          else{
              JOptionPane.showMessageDialog(this, "Employee deleted","Result", JOptionPane.INFORMATION_MESSAGE);
          addTableRowDataEmployee();
          }
        } catch (Exception e) {
            e.printStackTrace();
        }
   // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            if (searchtxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Id ", "Empty Field", JOptionPane.ERROR_MESSAGE);
        } 
            else{
                Employee emp = new Employee();
                Registry theregistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
                EmployeeService service = (EmployeeService) theregistry.lookup("employee");
                emp.setEmployeeId(Integer.parseInt(searchtxt.getText()));
                Employee employeeObj = service.searchEmployee(emp);
                if(employeeObj == null){
                    JOptionPane.showMessageDialog(this, "Id does not exists","Result",JOptionPane.ERROR_MESSAGE);
                    
                }
                else{
                    fnametxt.setText(employeeObj.getFirstName());
                    lnametxt.setText(employeeObj.getLastName());
                    contacttxt.setText(employeeObj.getContacts());
                    usernametxt.setText(employeeObj.getUsername());
                    passwordtxt.setText(employeeObj.getPassword());
                    positiontxt.setText(employeeObj.getPosition());
                    
                    registerBtn.setEnabled(false);
                }
                
                
            }
        } catch (Exception e) {
        }
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            empTable.print();
        } catch (Exception e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contacttxt;
    private javax.swing.JTable empTable;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnametxt;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField positiontxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
