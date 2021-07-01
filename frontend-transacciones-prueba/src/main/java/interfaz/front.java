package interfaz;

import domain.Cuenta;
import domain.Transaccion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.ws.rs.client.Entity;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class front extends javax.swing.JFrame {

    //variables que vamos a utilizar
    private static final String URL_BASE = "http://localhost:8080/backend-transacciones-prueba/webservice";
    private static Client cliente = ClientBuilder.newClient();
    ;
     private static WebTarget webTargetC = cliente.target(URL_BASE).path("/cuentas");
    ;
     private static WebTarget webTargetT = cliente.target(URL_BASE).path("/transacciones");
    ;
     private static Cuenta cuenta;
    private static List<Cuenta> cuentas;
    private static Transaccion transaccion;
    private static List<Transaccion> transacciones;
    private static Invocation.Builder invocationBuilder;
    private static Response response;
    
    DefaultTableModel model;

    public front() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Opciones = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        MostrarTransacciones = new javax.swing.JButton();
        ConsultarSaldo = new javax.swing.JButton();
        Abono = new javax.swing.JFrame();
        jLabel15 = new javax.swing.JLabel();
        CantidadAbono = new javax.swing.JTextField();
        SubmitAbono = new javax.swing.JButton();
        AtrasAbono = new javax.swing.JButton();
        Retiro = new javax.swing.JFrame();
        jLabel16 = new javax.swing.JLabel();
        CantidadRetiro = new javax.swing.JTextField();
        SubmitRetiro = new javax.swing.JButton();
        AtrasRetiro = new javax.swing.JButton();
        HistorialTransaccional = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransaccionesTable = new javax.swing.JTable();
        ExportarHistorialTransaccional = new javax.swing.JButton();
        idCuentaDigitado = new javax.swing.JTextField();
        contraseñaCuentaDigitado = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        Opciones.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Opciones.setMaximumSize(new java.awt.Dimension(295, 275));
        Opciones.setMinimumSize(new java.awt.Dimension(295, 275));
        Opciones.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Opciones.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 55, 28));

        jLabel3.setText("Abono");
        Opciones.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 46, 28));

        jLabel4.setText("Retiro");
        Opciones.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel5.setText("Historial Transaccional");
        Opciones.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel6.setText("Consultar Saldo");
        Opciones.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Opciones.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 55, 28));

        MostrarTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTransaccionesActionPerformed(evt);
            }
        });
        Opciones.getContentPane().add(MostrarTransacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 55, 28));

        ConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarSaldoActionPerformed(evt);
            }
        });
        Opciones.getContentPane().add(ConsultarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 55, 26));

        Abono.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Abono.setMinimumSize(new java.awt.Dimension(377, 180));
        Abono.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Cantida del Abono :");
        Abono.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        CantidadAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadAbonoActionPerformed(evt);
            }
        });
        Abono.getContentPane().add(CantidadAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 170, -1));

        SubmitAbono.setText("Abonar");
        SubmitAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitAbonoActionPerformed(evt);
            }
        });
        Abono.getContentPane().add(SubmitAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        AtrasAbono.setText("Atras");
        AtrasAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasAbonoActionPerformed(evt);
            }
        });
        Abono.getContentPane().add(AtrasAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        Retiro.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Retiro.setMaximumSize(new java.awt.Dimension(377, 180));
        Retiro.setMinimumSize(new java.awt.Dimension(377, 180));
        Retiro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Cantida del Retiro :");
        Retiro.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        CantidadRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadRetiroActionPerformed(evt);
            }
        });
        Retiro.getContentPane().add(CantidadRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 170, -1));

        SubmitRetiro.setText("Retirar");
        SubmitRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitRetiroActionPerformed(evt);
            }
        });
        Retiro.getContentPane().add(SubmitRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        AtrasRetiro.setText("Atras");
        AtrasRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasRetiroActionPerformed(evt);
            }
        });
        Retiro.getContentPane().add(AtrasRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        HistorialTransaccional.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        HistorialTransaccional.setMaximumSize(new java.awt.Dimension(705, 350));
        HistorialTransaccional.setMinimumSize(new java.awt.Dimension(705, 350));
        HistorialTransaccional.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransaccionesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Fecha", "Saldo Anterior", "Saldo Actual"
            }
        ));
        jScrollPane1.setViewportView(TransaccionesTable);

        HistorialTransaccional.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 670, 180));

        ExportarHistorialTransaccional.setText("Exportar");
        ExportarHistorialTransaccional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarHistorialTransaccionalActionPerformed(evt);
            }
        });
        HistorialTransaccional.getContentPane().add(ExportarHistorialTransaccional, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idCuentaDigitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCuentaDigitadoActionPerformed(evt);
            }
        });

        contraseñaCuentaDigitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaCuentaDigitadoActionPerformed(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idCuentaDigitado)
                    .addComponent(contraseñaCuentaDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButton)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCuentaDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contraseñaCuentaDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(LoginButton)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idCuentaDigitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCuentaDigitadoActionPerformed

    }//GEN-LAST:event_idCuentaDigitadoActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        cuenta = webTargetC.path("/" + Integer.parseInt(idCuentaDigitado.getText())).request(MediaType.APPLICATION_JSON).get(Cuenta.class);
        String contraseñad = cuenta.getContraseña();
        if (contraseñad.equals(contraseñaCuentaDigitado.getText())) {
            Opciones.setVisible(true);
            this.setVisible(false);
            System.out.println("Se inicio sesion");
        } else {
            System.out.println("contraseña equivocada");
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void contraseñaCuentaDigitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaCuentaDigitadoActionPerformed

    }//GEN-LAST:event_contraseñaCuentaDigitadoActionPerformed

    private void CantidadAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadAbonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadAbonoActionPerformed

    private void CantidadRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadRetiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadRetiroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Opciones.setVisible(false);
        Abono.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Opciones.setVisible(false);
        Retiro.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarSaldoActionPerformed
            JOptionPane.showMessageDialog(null, "Su saldo es de : "+cuenta.getSaldo());
    }//GEN-LAST:event_ConsultarSaldoActionPerformed

    private void AtrasRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasRetiroActionPerformed
        Opciones.setVisible(true);
        Retiro.setVisible(false);
    }//GEN-LAST:event_AtrasRetiroActionPerformed

    private void AtrasAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasAbonoActionPerformed
        Opciones.setVisible(true);
        Abono.setVisible(false);    }//GEN-LAST:event_AtrasAbonoActionPerformed

    private void SubmitAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitAbonoActionPerformed
        //Se crea la nueva transaccion de tipo abono
        Transaccion nuevaTransacion = new Transaccion();
        Long dateTime = System.currentTimeMillis();
        Timestamp timeStamp = new Timestamp(dateTime);
        nuevaTransacion.setFecha(timeStamp.toString());
        nuevaTransacion.setIdCuenta(cuenta.getIdCuenta());
        nuevaTransacion.setSaldoActual(cuenta.getSaldo() + Integer.parseInt(CantidadAbono.getText()));
        nuevaTransacion.setSaldoAnterior(cuenta.getSaldo());
        nuevaTransacion.setTipo("abono");
        invocationBuilder = webTargetT.request(MediaType.APPLICATION_JSON);
        response = invocationBuilder.post(Entity.entity(nuevaTransacion, MediaType.APPLICATION_JSON));
        System.out.println("");
        System.out.println(response.getStatus());
        Transaccion transaccionRecuperada = response.readEntity(Transaccion.class);
        System.out.println("Transaccion recuperada : " + transaccionRecuperada);

        //se modifica el saldo de la cuenta
        Cuenta cuentaModificar = cuenta;
        cuentaModificar.setSaldo(cuentaModificar.getSaldo() + Integer.parseInt(CantidadAbono.getText()));
        String pathId = "/" + cuentaModificar.getIdCuenta();
        invocationBuilder = webTargetC.path(pathId).request(MediaType.APPLICATION_JSON);
        response = invocationBuilder.put(Entity.entity(cuentaModificar, MediaType.APPLICATION_JSON));
        System.out.println("");
        System.out.println("Response:" + response.getStatus());
        System.out.println("persona modificada:" + response.readEntity(Cuenta.class));
    }//GEN-LAST:event_SubmitAbonoActionPerformed

    private void SubmitRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitRetiroActionPerformed
        if (Integer.parseInt(CantidadRetiro.getText()) > cuenta.getSaldo()) {
            System.out.println("Error intenta retira mayor cantidad al saldo ");
        } else {
            //Se crea la nueva transaccion de tipo retiro
            Transaccion nuevaTransacion = new Transaccion();
            Long dateTime = System.currentTimeMillis();
            Timestamp timeStamp = new Timestamp(dateTime);
            nuevaTransacion.setFecha(timeStamp.toString());
            nuevaTransacion.setIdCuenta(cuenta.getIdCuenta());
            nuevaTransacion.setSaldoActual(cuenta.getSaldo() - Integer.parseInt(CantidadRetiro.getText()));
            nuevaTransacion.setSaldoAnterior(cuenta.getSaldo());
            nuevaTransacion.setTipo("retiro");
            invocationBuilder = webTargetT.request(MediaType.APPLICATION_JSON);
            response = invocationBuilder.post(Entity.entity(nuevaTransacion, MediaType.APPLICATION_JSON));
            System.out.println("");
            System.out.println(response.getStatus());
            Transaccion transaccionRecuperada = response.readEntity(Transaccion.class);
            System.out.println("Transaccion recuperada : " + transaccionRecuperada);

            //se modifica el saldo de la cuenta
            Cuenta cuentaModificar = cuenta;
            cuentaModificar.setSaldo(cuentaModificar.getSaldo() - Integer.parseInt(CantidadRetiro.getText()));
            String pathId = "/" + cuentaModificar.getIdCuenta();
            invocationBuilder = webTargetC.path(pathId).request(MediaType.APPLICATION_JSON);
            response = invocationBuilder.put(Entity.entity(cuentaModificar, MediaType.APPLICATION_JSON));
            System.out.println("");
            System.out.println("Response:" + response.getStatus());
            System.out.println("persona modificada:" + response.readEntity(Cuenta.class));
        }


    }//GEN-LAST:event_SubmitRetiroActionPerformed

    private void MostrarTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTransaccionesActionPerformed
        Opciones.setVisible(false);
        HistorialTransaccional.setVisible(true);
        
        transacciones = webTargetT.request(MediaType.APPLICATION_JSON).get(Response.class).readEntity(new GenericType<List<Transaccion>>(){});
        
        String [] titulos = {"Tipo","Fecha","Saldo Anterior","Saldo Actual"};
        model = new DefaultTableModel(null,titulos);
        TransaccionesTable.setModel(model);
        
        for (int i = 0; i < transacciones.size(); i++) {
            if (transacciones.get(i).getIdCuenta()==cuenta.getIdCuenta()) {
                Object [] oTransacciones = {transacciones.get(i).getTipo(),transacciones.get(i).getFecha(),transacciones.get(i).getSaldoAnterior(),transacciones.get(i).getSaldoActual()};
                model.addRow(oTransacciones);
            }
        }
        
        
        
    }//GEN-LAST:event_MostrarTransaccionesActionPerformed

    
    private void ExportarHistorialTransaccionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarHistorialTransaccionalActionPerformed
        try{
            Workbook wb = new XSSFWorkbook();
            Sheet sheet = wb.createSheet("Historial De Transacciones");
            Row rowCol = sheet.createRow(0);
            for (int i = 0; i < TransaccionesTable.getColumnCount(); i++) {
                Cell cell = rowCol.createCell(i);
                cell.setCellValue(TransaccionesTable.getColumnName(i));
            }
            for (int i = 0; i < TransaccionesTable.getRowCount(); i++) {
                Row row = sheet.createRow(i+1);
                for (int j = 0; j < TransaccionesTable.getColumnCount(); j++) {
                    Cell cell = row.createCell(j);
                    if (TransaccionesTable.getValueAt(i, j)!=null) {
                        cell.setCellValue(TransaccionesTable.getValueAt(i, j).toString());
                    }
                }
            }
            FileOutputStream out = new FileOutputStream(new File("Transacciones.xlsx"));
            wb.write(out);
            wb.close();
            out.close();
            System.out.println(out);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException io){
            System.out.println(io);
        }
    }//GEN-LAST:event_ExportarHistorialTransaccionalActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new front().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Abono;
    private javax.swing.JButton AtrasAbono;
    private javax.swing.JButton AtrasRetiro;
    private javax.swing.JTextField CantidadAbono;
    private javax.swing.JTextField CantidadRetiro;
    private javax.swing.JButton ConsultarSaldo;
    private javax.swing.JButton ExportarHistorialTransaccional;
    private javax.swing.JFrame HistorialTransaccional;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton MostrarTransacciones;
    private javax.swing.JFrame Opciones;
    private javax.swing.JFrame Retiro;
    private javax.swing.JButton SubmitAbono;
    private javax.swing.JButton SubmitRetiro;
    private javax.swing.JTable TransaccionesTable;
    private javax.swing.JTextField contraseñaCuentaDigitado;
    private javax.swing.JTextField idCuentaDigitado;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
