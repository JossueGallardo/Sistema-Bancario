
package sistemabancario_;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*; // Para componentes como JFrame, JButton, etc.
import java.awt.*;    // Para el diseño de la interfaz.
import java.awt.event.ActionEvent;    // Para manejar eventos de botones.
import java.awt.event.ActionListener; // Para definir acciones al presionar botones.
import java.beans.Statement;




public class Loggin extends javax.swing.JFrame {

    
    
    private int xMouse;
    private int yMouse;
    private static HashMap<String, String> usuarios = new HashMap<>();
private static HashMap<String, Cliente> clientes = new HashMap<>();
public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/BancoPinasur";
    private static final String USER = "postgres"; 
    private static final String PASSWORD = "**"; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

public class TestConnection {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            if (conn != null) {
                System.out.println("Conexión exitosa con PostgreSQL.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    
    public Loggin() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDerechoRojo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelIniciarSesion = new javax.swing.JLabel();
        LaberUsuario = new javax.swing.JLabel();
        FieldUsuarioIngreso = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        LaberContraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Password = new javax.swing.JPasswordField();
        crearClienteBoton = new javax.swing.JButton();
        BarraMov = new javax.swing.JPanel();
        ExitLabel = new javax.swing.JLabel();
        Exit = new javax.swing.JPanel();
        IngresarBoton = new javax.swing.JButton();
        registrarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDerechoRojo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(162, 0, 26));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(160, 0, 26));
        jLabel1.setText("BANCO");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 0, 26));
        jLabel2.setText("PIÑASUR");

        javax.swing.GroupLayout PanelDerechoRojoLayout = new javax.swing.GroupLayout(PanelDerechoRojo);
        PanelDerechoRojo.setLayout(PanelDerechoRojoLayout);
        PanelDerechoRojoLayout.setHorizontalGroup(
            PanelDerechoRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerechoRojoLayout.createSequentialGroup()
                .addGroup(PanelDerechoRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDerechoRojoLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDerechoRojoLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        PanelDerechoRojoLayout.setVerticalGroup(
            PanelDerechoRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDerechoRojoLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        getContentPane().add(PanelDerechoRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 36, -1, 420));

        LabelIniciarSesion.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        LabelIniciarSesion.setText("INICIAR SESIÓN");
        getContentPane().add(LabelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 96, 369, -1));

        LaberUsuario.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        LaberUsuario.setText("USUARIO");
        getContentPane().add(LaberUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 173, -1, -1));

        FieldUsuarioIngreso.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        FieldUsuarioIngreso.setForeground(new java.awt.Color(153, 153, 153));
        FieldUsuarioIngreso.setText("Ingrese su nombre de Usuario");
        FieldUsuarioIngreso.setBorder(null);
        FieldUsuarioIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FieldUsuarioIngresoMousePressed(evt);
            }
        });
        FieldUsuarioIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsuarioIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(FieldUsuarioIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 203, 354, -1));

        jSeparator1.setBackground(new java.awt.Color(160, 0, 26));
        jSeparator1.setForeground(new java.awt.Color(160, 0, 26));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 237, 389, 10));

        LaberContraseña.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        LaberContraseña.setText("CONTRASEÑA");
        getContentPane().add(LaberContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 265, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(160, 0, 26));
        jSeparator2.setForeground(new java.awt.Color(160, 0, 26));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 323, 389, 10));

        Password.setForeground(new java.awt.Color(153, 153, 153));
        Password.setText("********");
        Password.setBorder(null);
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordMousePressed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 301, 360, -1));

        crearClienteBoton.setBackground(new java.awt.Color(160, 0, 26));
        crearClienteBoton.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        crearClienteBoton.setForeground(new java.awt.Color(255, 255, 255));
        crearClienteBoton.setMnemonic('R');
        crearClienteBoton.setText("CREAR CLIENTE");
        crearClienteBoton.setToolTipText("Aun no eres cliente?");
        crearClienteBoton.setBorder(null);
        crearClienteBoton.setBorderPainted(false);
        crearClienteBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearClienteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearClienteBotonActionPerformed(evt);
            }
        });
        getContentPane().add(crearClienteBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 120, 30));

        BarraMov.setBackground(new java.awt.Color(160, 0, 26));
        BarraMov.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMovMouseDragged(evt);
            }
        });
        BarraMov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMovMousePressed(evt);
            }
        });

        ExitLabel.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        ExitLabel.setForeground(new java.awt.Color(255, 255, 255));
        ExitLabel.setText("       X");
        ExitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BarraMovLayout = new javax.swing.GroupLayout(BarraMov);
        BarraMov.setLayout(BarraMovLayout);
        BarraMovLayout.setHorizontalGroup(
            BarraMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraMovLayout.createSequentialGroup()
                .addContainerGap(672, Short.MAX_VALUE)
                .addComponent(ExitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BarraMovLayout.setVerticalGroup(
            BarraMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraMovLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(BarraMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 30));

        javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit);
        Exit.setLayout(ExitLayout);
        ExitLayout.setHorizontalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        ExitLayout.setVerticalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        IngresarBoton.setBackground(new java.awt.Color(160, 0, 26));
        IngresarBoton.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        IngresarBoton.setForeground(new java.awt.Color(255, 255, 255));
        IngresarBoton.setMnemonic('I');
        IngresarBoton.setText("INGRESAR");
        IngresarBoton.setBorder(null);
        IngresarBoton.setBorderPainted(false);
        IngresarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarBotonActionPerformed(evt);
            }
        });
        getContentPane().add(IngresarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 30));

        registrarBoton.setBackground(new java.awt.Color(160, 0, 26));
        registrarBoton.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        registrarBoton.setForeground(new java.awt.Color(255, 255, 255));
        registrarBoton.setMnemonic('R');
        registrarBoton.setText("REGISTRAR");
        registrarBoton.setToolTipText("Aun no eres cliente?");
        registrarBoton.setBorder(null);
        registrarBoton.setBorderPainted(false);
        registrarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBotonActionPerformed(evt);
            }
        });
        getContentPane().add(registrarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldUsuarioIngresoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldUsuarioIngresoMousePressed
       if (FieldUsuarioIngreso.getText().equals("Ingrese su nombre de Usuario")) {
        FieldUsuarioIngreso.setText("");
        FieldUsuarioIngreso.setForeground(Color.black);
       }
    }//GEN-LAST:event_FieldUsuarioIngresoMousePressed

    private void PasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMousePressed
          if (Password.getText().equals("********")) {
        Password.setText("");
        Password.setForeground(Color.black);
    }
    // No sobrescribas el campo de usuario cuando el usuario hace clic en el campo de contraseña
    if (FieldUsuarioIngreso.getText().isEmpty()) {
        FieldUsuarioIngreso.setText("Ingrese su nombre de Usuario");
        FieldUsuarioIngreso.setForeground(Color.gray);
    }
    }//GEN-LAST:event_PasswordMousePressed

    private void ExitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitLabelMouseClicked

    private void BarraMovMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMovMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_BarraMovMouseDragged

    private void BarraMovMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMovMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMovMousePressed

    private void FieldUsuarioIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsuarioIngresoActionPerformed
       
    }//GEN-LAST:event_FieldUsuarioIngresoActionPerformed

    private void crearClienteBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearClienteBotonActionPerformed
        
    }//GEN-LAST:event_crearClienteBotonActionPerformed

    private void IngresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarBotonActionPerformed
      // Obtener los valores ingresados por el usuario
    String usuario = FieldUsuarioIngreso.getText();
    String contrasena = new String(Password.getPassword());

    // Llamar al método de verificación de credenciales
    UsuarioDAO dao = new UsuarioDAO();
    boolean loginExitoso = verificarCredenciales(usuario, contrasena);

    if (loginExitoso) {
        // Si las credenciales son correctas, abre la ventana de InterfaceBanca
        JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.");
        InterfaceBanca interfaceBanca = new InterfaceBanca(usuario); // Pasar el usuario como parámetro
        interfaceBanca.setVisible(true);
        this.dispose(); // Cierra la ventana de login
    } else {
        // Mostrar mensaje de error si las credenciales son incorrectas
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_IngresarBotonActionPerformed

    private void registrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBotonActionPerformed
        /// Crear un panel para ingresar los datos del usuario y cuenta
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(8, 2));

    // Campos para los datos del usuario
    JTextField txtNombre = new JTextField();
    JTextField txtCedula = new JTextField();
    JTextField txtEdad = new JTextField();
    JTextField txtUsuario = new JTextField();
    JPasswordField txtContrasena = new JPasswordField();

    // Campos para los datos de la cuenta
    JTextField txtNumeroCuenta = new JTextField();
    JComboBox<String> cmbTipoCuenta = new JComboBox<>(new String[]{"Ahorros", "Corriente"});
    JTextField txtSaldoInicial = new JTextField();

    // Etiquetas y campos del formulario
    panel.add(new JLabel("Nombre:"));
    panel.add(txtNombre);
    panel.add(new JLabel("Cédula:"));
    panel.add(txtCedula);
    panel.add(new JLabel("Edad:"));
    panel.add(txtEdad);
    panel.add(new JLabel("Usuario:"));
    panel.add(txtUsuario);
    panel.add(new JLabel("Contraseña:"));
    panel.add(txtContrasena);
    panel.add(new JLabel("Número de Cuenta:"));
    panel.add(txtNumeroCuenta);
    panel.add(new JLabel("Tipo de Cuenta:"));
    panel.add(cmbTipoCuenta);
    panel.add(new JLabel("Saldo Inicial:"));
    panel.add(txtSaldoInicial);

    // Mostrar el panel en un cuadro de diálogo
    int result = JOptionPane.showConfirmDialog(
        null, panel, "Registrar Usuario y Cuenta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

    if (result == JOptionPane.OK_OPTION) {
        try {
            // Obtener los valores ingresados
            String nombre = txtNombre.getText();
            String cedula = txtCedula.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String usuario = txtUsuario.getText();
            String contrasena = new String(txtContrasena.getPassword());
            String numeroCuenta = txtNumeroCuenta.getText();
            String tipoCuenta = cmbTipoCuenta.getSelectedItem().toString();
            double saldoInicial = Double.parseDouble(txtSaldoInicial.getText());

            // Llamar al método de registro
            UsuarioDAO dao = new UsuarioDAO();
            dao.registrarUsuarioYCuenta(nombre, cedula, edad, usuario, contrasena, numeroCuenta, tipoCuenta, saldoInicial);

            JOptionPane.showMessageDialog(this, "Usuario y cuenta registrados correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en el registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_registrarBotonActionPerformed

  public class UsuarioDAO {
    public void registrarUsuarioYCuenta(String nombre, String cedula, int edad, String usuario, String contrasena, 
                                    String numeroCuenta, String tipoCuenta, double saldoInicial) {
    String sqlUsuario = "INSERT INTO usuarios (nombre, cedula, edad, usuario, contrasena) VALUES (?, ?, ?, ?, ?)";
    String sqlCuenta = "INSERT INTO cuentas (numero_cuenta, id_usuario, tipo, saldo) VALUES (?, ?, ?, ?)";
    String sqlGetId = "SELECT currval(pg_get_serial_sequence('usuarios', 'id'))"; // Obtener el último ID generado

    try (Connection conn = DatabaseConnection.getConnection()) {
        conn.setAutoCommit(false); // Inicia una transacción

        // Insertar usuario
        try (PreparedStatement stmtUsuario = conn.prepareStatement(sqlUsuario)) {
            stmtUsuario.setString(1, nombre);
            stmtUsuario.setString(2, cedula);
            stmtUsuario.setInt(3, edad);
            stmtUsuario.setString(4, usuario);
            stmtUsuario.setString(5, contrasena);
            stmtUsuario.executeUpdate();
        }

        // Obtener el ID del usuario recién insertado
        int usuarioId;
        try (PreparedStatement stmtGetId = conn.prepareStatement(sqlGetId)) {
            ResultSet rs = stmtGetId.executeQuery();
            if (rs.next()) {
                usuarioId = rs.getInt(1); // Obtener el ID generado
            } else {
                throw new SQLException("No se pudo obtener el ID del usuario recién creado.");
            }
        }

        // Insertar la cuenta asociada al usuario
        try (PreparedStatement stmtCuenta = conn.prepareStatement(sqlCuenta)) {
            stmtCuenta.setString(1, numeroCuenta);
            stmtCuenta.setInt(2, usuarioId);
            stmtCuenta.setString(3, tipoCuenta);
            stmtCuenta.setDouble(4, saldoInicial);
            stmtCuenta.executeUpdate();
        }

        conn.commit(); // Confirmar la transacción
        System.out.println("Usuario y cuenta registrados correctamente.");
    } catch (SQLException e) {
        e.printStackTrace();
        throw new RuntimeException("Error al registrar usuario y cuenta: " + e.getMessage());
    }
}
}

public boolean verificarCredenciales(String usuario, String contrasena) {
    String sql = "SELECT COUNT(*) FROM usuarios WHERE usuario = ? AND contrasena = ?";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, usuario);
        stmt.setString(2, contrasena);

        ResultSet rs = stmt.executeQuery();
        if (rs.next() && rs.getInt(1) > 0) {
            return true; // Credenciales válidas
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false; // Credenciales inválidas
}




    
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
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraMov;
    private javax.swing.JPanel Exit;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JTextField FieldUsuarioIngreso;
    private javax.swing.JButton IngresarBoton;
    private javax.swing.JLabel LabelIniciarSesion;
    private javax.swing.JLabel LaberContraseña;
    private javax.swing.JLabel LaberUsuario;
    private javax.swing.JPanel PanelDerechoRojo;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton crearClienteBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton registrarBoton;
    // End of variables declaration//GEN-END:variables
}
