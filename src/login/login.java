package login;

import java.awt.Color;
import database.dao.DaoEmpleado;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import com.dashboard.dashboard; 
/**
 *
 * @author Alex
 */
        
public class login extends javax.swing.JFrame {
    DaoEmpleado daoempleado;
    int intent = 0;
    
    private static final Map<String, List<String>> permisosPorRol = new HashMap<>();
static {
    permisosPorRol.put("1", List.of("Clientes", "Ventas", "Empleados", "Compras", "Proveedores", "Productos")); // Gerente
    permisosPorRol.put("2", List.of("Clientes", "Ventas", "Empleados", "Compras")); // Sub-Gerente
    permisosPorRol.put("3", List.of("Clientes", "Ventas")); // Empleado General
}

    public login() {
        initComponents();
        daoempleado = new DaoEmpleado();
        configComponents();
    }
    	
        private void configComponents(){
        // Titulo de la ventana
        setTitle("Iniciar sesión");
        // posición de la ventana
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        ZORRIANA = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();
        iniciarsesion = new javax.swing.JLabel();
        UsrTitle = new javax.swing.JLabel();
        UsrTxtF = new javax.swing.JTextField();
        UsrSep = new javax.swing.JSeparator();
        PswTitle = new javax.swing.JLabel();
        PswField = new javax.swing.JPasswordField();
        PswSep = new javax.swing.JSeparator();
        BTNEntrar = new javax.swing.JPanel();
        LblEntrar = new javax.swing.JLabel();
        BTNCancelar = new javax.swing.JPanel();
        LblCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage( getClass().getResource("/img/icono.png")));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setName("Iniciar Sesión"); // NOI18N
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ZORRIANA.setFont(new java.awt.Font("Jost", 1, 36)); // NOI18N
        ZORRIANA.setForeground(new java.awt.Color(240, 240, 240));
        ZORRIANA.setText("ZORRIANA");
        ZORRIANA.setToolTipText("");
        bg.add(ZORRIANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 200, 50));

        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoblanco.png"))); // NOI18N
        bg.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 290, 210));

        FONDO.setBackground(new java.awt.Color(247, 139, 86));
        FONDO.setForeground(new java.awt.Color(247, 139, 86));
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/warehouse.png"))); // NOI18N
        bg.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        iniciarsesion.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        iniciarsesion.setText("INICIAR SESIÓN");
        bg.add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 270, 50));

        UsrTitle.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        UsrTitle.setText("USUARIO");
        bg.add(UsrTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 80, 30));

        UsrTxtF.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        UsrTxtF.setForeground(new java.awt.Color(204, 204, 204));
        UsrTxtF.setText("Ingrese su usuario");
        UsrTxtF.setBorder(null);
        UsrTxtF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsrTxtF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsrTxtFMousePressed(evt);
            }
        });
        UsrTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsrTxtFActionPerformed(evt);
            }
        });
        UsrTxtF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsrTxtFKeyPressed(evt);
            }
        });
        bg.add(UsrTxtF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 270, 30));
        bg.add(UsrSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 270, 20));

        PswTitle.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        PswTitle.setText("CONTRASEÑA");
        bg.add(PswTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 110, 30));

        PswField.setForeground(new java.awt.Color(204, 204, 204));
        PswField.setText("********");
        PswField.setBorder(null);
        PswField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PswField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PswFieldMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PswFieldMousePressed(evt);
            }
        });
        PswField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PswFieldActionPerformed(evt);
            }
        });
        PswField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PswFieldKeyPressed(evt);
            }
        });
        bg.add(PswField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 270, 30));
        bg.add(PswSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 270, 20));

        BTNEntrar.setBackground(new java.awt.Color(169, 85, 15));
        BTNEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNEntrarMouseExited(evt);
            }
        });

        LblEntrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        LblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        LblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEntrar.setText("ENTRAR");

        javax.swing.GroupLayout BTNEntrarLayout = new javax.swing.GroupLayout(BTNEntrar);
        BTNEntrar.setLayout(BTNEntrarLayout);
        BTNEntrarLayout.setHorizontalGroup(
            BTNEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTNEntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        BTNEntrarLayout.setVerticalGroup(
            BTNEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTNEntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(BTNEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 130, 40));

        BTNCancelar.setBackground(new java.awt.Color(107, 54, 10));
        BTNCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNCancelarMouseExited(evt);
            }
        });

        LblCancelar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        LblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        LblCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCancelar.setText("CANCELAR");

        javax.swing.GroupLayout BTNCancelarLayout = new javax.swing.GroupLayout(BTNCancelar);
        BTNCancelar.setLayout(BTNCancelarLayout);
        BTNCancelarLayout.setHorizontalGroup(
            BTNCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTNCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        BTNCancelarLayout.setVerticalGroup(
            BTNCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BTNCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(BTNCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsrTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsrTxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsrTxtFActionPerformed

    private void BTNEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNEntrarMouseEntered
        BTNEntrar.setBackground(Color.green);
    }//GEN-LAST:event_BTNEntrarMouseEntered

    private void BTNEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNEntrarMouseExited
        BTNEntrar.setBackground(new Color (169,85,15));
    }//GEN-LAST:event_BTNEntrarMouseExited

    private void BTNCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNCancelarMouseEntered
        BTNCancelar.setBackground(Color.red);
    }//GEN-LAST:event_BTNCancelarMouseEntered

    private void BTNCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNCancelarMouseExited
        BTNCancelar.setBackground(new Color (107,54,10));
    }//GEN-LAST:event_BTNCancelarMouseExited

    private void BTNCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNCancelarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BTNCancelarMouseClicked

    private void UsrTxtFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsrTxtFMousePressed
        if (UsrTxtF.getText().equals("Ingrese su usuario")) {
            UsrTxtF.setText("");
            UsrTxtF.setForeground(Color.black);
        }
        if (String.valueOf(PswField.getPassword()).isEmpty()) {
            PswField.setText("********");
            PswField.setForeground(Color.gray);
        }
        
        
    }//GEN-LAST:event_UsrTxtFMousePressed

    private void PswFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PswFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PswFieldActionPerformed

    private void PswFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PswFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PswFieldMouseClicked

    private void PswFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PswFieldMousePressed
        if (String.valueOf(PswField.getPassword()).equals("********")) {
            PswField.setText("");
            PswField.setForeground(Color.black);
        }
        if (UsrTxtF.getText().isEmpty()) {
            UsrTxtF.setText("Ingrese su usuario");
            UsrTxtF.setForeground(Color.gray);
        }
    }//GEN-LAST:event_PswFieldMousePressed

    private void UsrTxtFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsrTxtFKeyPressed
    if (UsrTxtF.getText().equals("Ingrese su usuario")) {
            UsrTxtF.setText("");
            UsrTxtF.setForeground(Color.black);
        }
        if (String.valueOf(PswField.getPassword()).isEmpty()) {
            PswField.setText("********");
            PswField.setForeground(Color.gray);
        }
    if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { 
        PswField.requestFocus(); // Cambia el foco al campo de contraseña
    }   
    }//GEN-LAST:event_UsrTxtFKeyPressed

    private void PswFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PswFieldKeyPressed
         if (String.valueOf(PswField.getPassword()).equals("********")) {
            PswField.setText("");
            PswField.setForeground(Color.black);
        }
        if (UsrTxtF.getText().isEmpty()) {
            UsrTxtF.setText("Ingrese su usuario");
            UsrTxtF.setForeground(Color.gray);
        }
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            String usuario = UsrTxtF.getText();
            char[] password = PswField.getPassword();
            autenticar(usuario, password);
    }
    }//GEN-LAST:event_PswFieldKeyPressed

private void iniciarSesion() {
    String usuario = UsrTxtF.getText();
    char[] password = PswField.getPassword();

    // Validar campos vacíos
    if (usuario.trim().isEmpty() || password.length == 0) {
        JOptionPane.showMessageDialog(this, "Por favor, llene todos los campos.", 
                                      "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Autenticar usuario
    Object[] empleado = daoempleado.getEmployeeByUsr(usuario, password);

    if (empleado == null || empleado[0] == null) {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", 
                                      "Error de autenticación", JOptionPane.ERROR_MESSAGE);
    } else {
        String idEmpleado = (String) empleado[0]; // ID del empleado
        String nombreCompleto = empleado[3] + " " + empleado[4] + (empleado[5] != null ? " " + empleado[5] : ""); // Concatenación del nombre completo
        List<String> permisos = permisosPorRol.getOrDefault(empleado[1], new ArrayList<>());

        // Crear el dashboard con permisos y pasar tanto el nombre como el ID del empleado
        dashboard db = new dashboard(nombreCompleto, idEmpleado, permisos);
        db.setVisible(true); // Pasa el nombre y el ID al dashboard
        this.dispose(); // Cierra la ventana actual
    }
}


private void autenticar(String usuario, char[] contrasenia) {
    Object[] empleado = daoempleado.getEmployeeByUsr(usuario, contrasenia);

    if (empleado != null && empleado[0] != null) {
        String idEmpleado = (String) empleado[0]; // ID del empleado
        String idPuesto = (String) empleado[1]; // ID del puesto
        List<String> permisos = permisosPorRol.getOrDefault(idPuesto, new ArrayList<>());

        // Verificar que se obtuvo el nombre completo del empleado
        String nombreCompleto = empleado[3] + " " + empleado[4] + (empleado[5] != null ? " " + empleado[5] : ""); // Incluyendo el apellido materno
        if (nombreCompleto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se pudo obtener el nombre del empleado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear el dashboard con permisos
        dashboard db = new dashboard(nombreCompleto, idEmpleado, permisos);
        db.setVisible(true);
        this.dispose();
    } else {
        intent++;
        if (intent >= 3) {
            JOptionPane.showMessageDialog(this, "Demasiados intentos fallidos. Cerrando aplicación.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}



    private void BTNEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNEntrarMouseClicked
        String usuario = UsrTxtF.getText();
        char[] password = PswField.getPassword();
        autenticar(usuario, password);
    }//GEN-LAST:event_BTNEntrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BTNCancelar;
    private javax.swing.JPanel BTNEntrar;
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel LblCancelar;
    private javax.swing.JLabel LblEntrar;
    private javax.swing.JPasswordField PswField;
    private javax.swing.JSeparator PswSep;
    private javax.swing.JLabel PswTitle;
    private javax.swing.JSeparator UsrSep;
    private javax.swing.JLabel UsrTitle;
    private javax.swing.JTextField UsrTxtF;
    private javax.swing.JLabel ZORRIANA;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel iniciarsesion;
    // End of variables declaration//GEN-END:variables
}
