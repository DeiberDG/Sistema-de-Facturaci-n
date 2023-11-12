package vista;

import controlador.Controlador_Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import modelo.Usuario;

public class FrameLogin extends javax.swing.JFrame {

    public FrameLogin() {
        initComponents();
        this.setTitle("Login - GoFac"); // Esto Cambia el titulo de la ventana
        this.setSize(new Dimension(990, 730)); // Esto cambia la dimension de la ventana
        this.setLocationRelativeTo(null); // Esto hace que el JFrame aparezca centrado   
    }
    
        // Este metodo cambia el icono de la aplicacion
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Logo.png"));
        return retValue;
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        panelLogin = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_password = new javax.swing.JPasswordField();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        boton_entrar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        indicador_sesion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        panelLogin.setBackground(new java.awt.Color(29, 41, 58));
        panelLogin.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(29, 40, 57));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(990, 730));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 300));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 89, 137));
        jLabel2.setText("INICIAR SESIÓN");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 130, 196));
        jLabel3.setText("USUARIO");

        text_user.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        text_user.setForeground(new java.awt.Color(204, 204, 204));
        text_user.setText("Ingrese su nombre de usuario");
        text_user.setBorder(null);
        text_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_userMousePressed(evt);
            }
        });
        text_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_userActionPerformed(evt);
            }
        });
        text_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_userKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 130, 196));
        jLabel4.setText("CONTRASEÑA");

        text_password.setForeground(new java.awt.Color(204, 204, 204));
        text_password.setText("****************");
        text_password.setBorder(null);
        text_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_passwordMousePressed(evt);
            }
        });
        text_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_passwordKeyPressed(evt);
            }
        });

        separador1.setForeground(new java.awt.Color(0, 0, 0));

        separador2.setForeground(new java.awt.Color(0, 0, 0));

        boton_entrar.setBackground(new java.awt.Color(63, 130, 196));
        boton_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_entrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_entrarMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ENTRAR");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout boton_entrarLayout = new javax.swing.GroupLayout(boton_entrar);
        boton_entrar.setLayout(boton_entrarLayout);
        boton_entrarLayout.setHorizontalGroup(
            boton_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );
        boton_entrarLayout.setVerticalGroup(
            boton_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boton_entrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        indicador_sesion.setBackground(new java.awt.Color(255, 0, 51));
        indicador_sesion.setFont(new java.awt.Font("Lato Black", 2, 10)); // NOI18N
        indicador_sesion.setForeground(new java.awt.Color(255, 51, 51));
        indicador_sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicador_sesion.setText(" ");
        indicador_sesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(boton_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(277, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(text_password, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(text_user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addComponent(separador1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(indicador_sesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(separador2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_user, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(indicador_sesion)
                .addGap(18, 18, 18)
                .addComponent(boton_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icono_Grande.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(333, 333, 333))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        panelLogin.add(jPanel6, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_userActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        boton_entrar.setBackground(new Color(0,152,196)); // Esto cambia el color del boton cuando el mouse esta encima
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        boton_entrar.setBackground(new Color(63,130,196)); // Esto devuelve el boton al color original al quitar el mouse
    }//GEN-LAST:event_jLabel5MouseExited

    private void text_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_userMousePressed
        if (text_user.getText().equals("Ingrese su nombre de usuario")){
            
            text_user.setText(""); // Esto hace que el textField se borre cuando se pone el cursor
            text_user.setForeground(Color.black); // Pone de color negro lo que pongamos en el campo
        }
        
        if (String.valueOf(text_password.getPassword()).isEmpty()){
            text_password.setText("****************"); // El passwordField se queda intacto
            text_password.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_text_userMousePressed

    private void text_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_passwordMousePressed
        if (String.valueOf(text_password.getPassword()).equals("****************")){
            text_password.setText(""); // Esto hace que el textField se borre cuando se pone el cursor
            text_password.setForeground(Color.black); // Pone de color negro lo que pongamos en el campo
        }
        
        if (text_user.getText().isEmpty()){
            
            text_user.setText("Ingrese su nombre de usuario"); // Esto hace que el textField se borre cuando se pone el cursor
            text_user.setForeground(Color.gray); 
        }
    }//GEN-LAST:event_text_passwordMousePressed

    private void boton_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMouseClicked
        // Esto toca borrarlo
    }//GEN-LAST:event_boton_entrarMouseClicked

    private void boton_entrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMousePressed

// Esto hay que borrarlo
    }//GEN-LAST:event_boton_entrarMousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.Login(); // Esto ejecuta el metodo para iniciar sesion

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void text_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_userKeyPressed
        // Esto hace que cuando se presione la tecla ENTER se pase al TextField de la contraseña
        if (evt.getKeyCode() == evt.VK_ENTER || evt.getKeyCode() == evt.VK_TAB){
            text_password.requestFocus();
            if (String.valueOf(text_password.getPassword()).equals("****************")){
                text_password.setText(""); // Esto hace que el textField se borre cuando se pone el cursor
                text_password.setForeground(Color.black); // Pone de color negro lo que pongamos en el campo
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_text_userKeyPressed

    private void text_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_passwordKeyPressed
        // Esto hace que al presionar la tecla Enter, se inicie sesion
        if (evt.getKeyCode() == evt.VK_ENTER){
            this.Login();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_text_passwordKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boton_entrar;
    private javax.swing.JLabel indicador_sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JPasswordField text_password;
    private javax.swing.JTextField text_user;
    // End of variables declaration//GEN-END:variables
    
    
    private void Login(){
        
        if (!text_user.getText().equals("Ingrese su nombre de usuario") && !String.valueOf(text_password.getPassword()).equals("****************")){
            
            // Este if hace que si los compos en el inicio de sesion no estan vacios, haga la consulta SQL
            if (!text_user.getText().isEmpty() && !String.valueOf(text_password.getPassword()).equals("")){
                
                Controlador_Usuario controlUsuario = new Controlador_Usuario();
                Usuario usuario = new Usuario();
                usuario.setUsuario(text_user.getText().trim()); // El metodo trim() elimina los espacios de la cadena de texto
                usuario.setPassword(String.valueOf(text_password.getPassword()));
                
                if (controlUsuario.LoginUsuario(usuario)){
                    
                    indicador_sesion.setText("Iniciando Sesion");
                    
                }else{
                    
                    indicador_sesion.setText(controlUsuario.getRes());
                    
                }
                
            }else{
                
                indicador_sesion.setText("Ingrese sus credenciales");
                
            }
        }else{
            
            indicador_sesion.setText("Ingrese sus credenciales");
            
        }
    }
}
