package grafico;

import java.text.DecimalFormat;
import java.util.Map;
import javax.swing.JOptionPane;
import operaciones.GestionDatos;
import datos.*;
import java.awt.Color;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        JPanelNCuenta.setVisible(false);
        JPanelCuentaEx.setVisible(false);
        JPanelCuenta.setVisible(false);
        this.getContentPane().setBackground(Color.lightGray);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        JBtCrearCuenta = new javax.swing.JButton();
        JPanelNCuenta = new javax.swing.JPanel();
        JTxNombre = new javax.swing.JLabel();
        JTxID = new javax.swing.JLabel();
        JTxSaldo = new javax.swing.JLabel();
        JCTxNombre = new javax.swing.JTextField();
        JCTxID = new javax.swing.JTextField();
        JCTxValor = new javax.swing.JTextField();
        JBtCrear = new javax.swing.JButton();
        JTxTipoId = new javax.swing.JLabel();
        JBoxTipoIDN = new javax.swing.JComboBox<>();
        JBtCancelar = new javax.swing.JButton();
        JPanelCuentaEx = new javax.swing.JPanel();
        JTxIDCu = new javax.swing.JLabel();
        JCTxIDCue = new javax.swing.JTextField();
        JBtBuscar = new javax.swing.JButton();
        JPanelCuenta = new javax.swing.JPanel();
        JBtRetirar = new javax.swing.JButton();
        JBtConsignar = new javax.swing.JButton();
        JCTxSaldoRetirar = new javax.swing.JTextField();
        JCTxSaldoConsignar = new javax.swing.JTextField();
        JBtAceptarCuenta = new javax.swing.JButton();
        JTxIdEx = new javax.swing.JLabel();
        JTxNombreEx = new javax.swing.JLabel();
        JTxNumCuentaEx = new javax.swing.JLabel();
        JTxSaldoEx = new javax.swing.JLabel();
        JTxTipoIdCuenta = new javax.swing.JLabel();
        JTxTipoIdCuentaEx = new javax.swing.JLabel();
        JBoxTipoId = new javax.swing.JComboBox<>();
        JBtBuscarCuenta = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuentas de Ahorros");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JBtCrearCuenta.setBackground(new java.awt.Color(199, 216, 233));
        JBtCrearCuenta.setFont(new java.awt.Font("Perpetua", 1, 15)); // NOI18N
        JBtCrearCuenta.setText("Nueva Cuenta");
        JBtCrearCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));
        JBtCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtCrearCuentaActionPerformed(evt);
            }
        });

        JPanelNCuenta.setBackground(new java.awt.Color(201, 218, 235));

        JTxNombre.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        JTxNombre.setText("Nombre completo: ");
        JTxNombre.setToolTipText("");

        JTxID.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        JTxID.setText("N?? Identificacion:");

        JTxSaldo.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        JTxSaldo.setText("Valor inicial: ");

        JCTxNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        JCTxNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));

        JCTxID.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        JCTxID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));
        JCTxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCTxIDActionPerformed(evt);
            }
        });

        JCTxValor.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        JCTxValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));
        JCTxValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCTxValorActionPerformed(evt);
            }
        });

        JBtCrear.setBackground(new java.awt.Color(204, 204, 204));
        JBtCrear.setFont(new java.awt.Font("Perpetua", 1, 15)); // NOI18N
        JBtCrear.setText("Crear");
        JBtCrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));
        JBtCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtCrearActionPerformed(evt);
            }
        });

        JTxTipoId.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        JTxTipoId.setText("Tipo de Identificaci??n");

        JBoxTipoIDN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de Ciudadania", "Tarjeta de Extranjeria", "Tarjeta de Identidad", "Cedula de Extranjeria" }));

        javax.swing.GroupLayout JPanelNCuentaLayout = new javax.swing.GroupLayout(JPanelNCuenta);
        JPanelNCuenta.setLayout(JPanelNCuentaLayout);
        JPanelNCuentaLayout.setHorizontalGroup(
            JPanelNCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelNCuentaLayout.createSequentialGroup()
                .addGroup(JPanelNCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelNCuentaLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(JBtCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelNCuentaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(JPanelNCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTxTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelNCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JCTxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTxSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JCTxID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTxID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JCTxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JBoxTipoIDN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        JPanelNCuentaLayout.setVerticalGroup(
            JPanelNCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelNCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCTxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTxID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCTxID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTxTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBoxTipoIDN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(JTxSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCTxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(JBtCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JBtCancelar.setBackground(new java.awt.Color(199, 216, 233));
        JBtCancelar.setFont(new java.awt.Font("Perpetua", 1, 15)); // NOI18N
        JBtCancelar.setText("Cancelar");
        JBtCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(117, 147, 177), 2, true));
        JBtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtCancelarActionPerformed(evt);
            }
        });

        JPanelCuentaEx.setBackground(new java.awt.Color(199, 216, 233));

        JTxIDCu.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        JTxIDCu.setText("N?? Identificacion: ");

        JCTxIDCue.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 12)); // NOI18N
        JCTxIDCue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));
        JCTxIDCue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCTxIDCueActionPerformed(evt);
            }
        });

        JBtBuscar.setBackground(new java.awt.Color(204, 204, 204));
        JBtBuscar.setFont(new java.awt.Font("Perpetua", 1, 15)); // NOI18N
        JBtBuscar.setText("Buscar");
        JBtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));
        JBtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtBuscarActionPerformed(evt);
            }
        });

        JPanelCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 3));

        JBtRetirar.setBackground(new java.awt.Color(199, 216, 233));
        JBtRetirar.setFont(new java.awt.Font("Perpetua", 1, 15)); // NOI18N
        JBtRetirar.setText("Retirar");
        JBtRetirar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));
        JBtRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtRetirarActionPerformed(evt);
            }
        });

        JBtConsignar.setBackground(new java.awt.Color(199, 216, 233));
        JBtConsignar.setFont(new java.awt.Font("Perpetua", 1, 15)); // NOI18N
        JBtConsignar.setText("Consignar");
        JBtConsignar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));
        JBtConsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtConsignarActionPerformed(evt);
            }
        });

        JCTxSaldoRetirar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));

        JCTxSaldoConsignar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));

        JBtAceptarCuenta.setBackground(new java.awt.Color(204, 204, 204));
        JBtAceptarCuenta.setText("Aceptar");
        JBtAceptarCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));
        JBtAceptarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtAceptarCuentaActionPerformed(evt);
            }
        });

        JTxIdEx.setText("Identificacion: ");

        JTxNombreEx.setText("Nombre: ");

        JTxNumCuentaEx.setText("Cuenta: ");

        JTxSaldoEx.setText("Saldo: ");

        JTxTipoIdCuenta.setText("Tipo identificacion: ");

        javax.swing.GroupLayout JPanelCuentaLayout = new javax.swing.GroupLayout(JPanelCuenta);
        JPanelCuenta.setLayout(JPanelCuentaLayout);
        JPanelCuentaLayout.setHorizontalGroup(
            JPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCuentaLayout.createSequentialGroup()
                .addGroup(JPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelCuentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelCuentaLayout.createSequentialGroup()
                                .addComponent(JBtRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBtConsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelCuentaLayout.createSequentialGroup()
                                .addComponent(JCTxSaldoRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JCTxSaldoConsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelCuentaLayout.createSequentialGroup()
                                .addGroup(JPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTxIdEx, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(JTxNombreEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(JPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTxNumCuentaEx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTxSaldoEx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JPanelCuentaLayout.createSequentialGroup()
                        .addGroup(JPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelCuentaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JTxTipoIdCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelCuentaLayout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(JBtAceptarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanelCuentaLayout.setVerticalGroup(
            JPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxNombreEx, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxNumCuentaEx, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxIdEx, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxSaldoEx, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTxTipoIdCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(JPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtConsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCTxSaldoRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCTxSaldoConsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBtAceptarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        JTxTipoIdCuentaEx.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        JTxTipoIdCuentaEx.setText("Tipo Identificacion: ");

        JBoxTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de Ciudadania", "Tarjeta de Extranjeria", "Tarjeta de Identidad", "Cedula de Extranjeria" }));
        JBoxTipoId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 145, 174), 2));

        javax.swing.GroupLayout JPanelCuentaExLayout = new javax.swing.GroupLayout(JPanelCuentaEx);
        JPanelCuentaEx.setLayout(JPanelCuentaExLayout);
        JPanelCuentaExLayout.setHorizontalGroup(
            JPanelCuentaExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCuentaExLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelCuentaExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPanelCuentaExLayout.createSequentialGroup()
                        .addGroup(JPanelCuentaExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTxIDCu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCTxIDCue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(JPanelCuentaExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelCuentaExLayout.createSequentialGroup()
                                .addComponent(JBoxTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(JPanelCuentaExLayout.createSequentialGroup()
                                .addComponent(JTxTipoIdCuentaEx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                                .addComponent(JBtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        JPanelCuentaExLayout.setVerticalGroup(
            JPanelCuentaExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCuentaExLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelCuentaExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxIDCu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTxTipoIdCuentaEx))
                .addGap(18, 18, 18)
                .addGroup(JPanelCuentaExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCTxIDCue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBoxTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JPanelCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JBtBuscarCuenta.setBackground(new java.awt.Color(199, 216, 233));
        JBtBuscarCuenta.setFont(new java.awt.Font("Perpetua", 1, 15)); // NOI18N
        JBtBuscarCuenta.setText("Cuenta Existente");
        JBtBuscarCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 147, 177), 2));
        JBtBuscarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtBuscarCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBtCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanelNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(JPanelCuentaEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBtBuscarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtBuscarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPanelNCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelCuentaEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 32, Short.MAX_VALUE)
                .addComponent(JBtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(983, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBtCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtCrearCuentaActionPerformed
        JPanelNCuenta.setVisible(true);
        JBtCrearCuenta.setEnabled(false);
        JBtBuscarCuenta.setEnabled(true);
        JPanelCuentaEx.setVisible(false);
        JPanelCuenta.setVisible(false);
    }//GEN-LAST:event_JBtCrearCuentaActionPerformed

    private void JBtBuscarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtBuscarCuentaActionPerformed
        JBtBuscarCuenta.setEnabled(false);
        JPanelNCuenta.setVisible(false);
        JBtCrearCuenta.setEnabled(true);
        JPanelCuentaEx.setVisible(true);
        JCTxIDCue.setEnabled(true);
        JPanelCuenta.setVisible(true);
    }//GEN-LAST:event_JBtBuscarCuentaActionPerformed

    private void JBtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtBuscarActionPerformed
        JPanelCuenta.setVisible(true);
        JCTxSaldoRetirar.setEnabled(false);
        JCTxSaldoConsignar.setEnabled(false);
        JBtConsignar.setEnabled(true);
        JBtRetirar.setEnabled(true);
        JCTxIDCue.setEnabled(false);
        //pruebas
        GestionDatos sdsd = new GestionDatos();
        sdsd.ListaCuentas.containsValue(JCTxNombre);
        JTxNombreEx.setText("Nombre: "+sdsd.ListaCuentas.containsKey(57225454));
        JTxIdEx.setText("Identificacion: "+pruebaIdentificacion());
        JTxTipoIdCuenta.setText("Tipo Identificacion: "+prueba3());
        JTxSaldoEx.setText("Saldo: ");
        JBoxTipoId.setEnabled(false);
        JPanelCuentaEx.setVisible(true);
    }//GEN-LAST:event_JBtBuscarActionPerformed

    private void JBtRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtRetirarActionPerformed
        JCTxSaldoRetirar.setVisible(true);
        JCTxSaldoConsignar.setVisible(false);
        JBtConsignar.setEnabled(false);
        JCTxSaldoRetirar.setEnabled(true);
    }//GEN-LAST:event_JBtRetirarActionPerformed

    private void JBtConsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtConsignarActionPerformed
        JCTxSaldoConsignar.setVisible(true);
        JCTxSaldoRetirar.setVisible(false);
        JBtRetirar.setEnabled(false);
        JCTxSaldoConsignar.setEnabled(true);
        
    }//GEN-LAST:event_JBtConsignarActionPerformed

    private void JBtAceptarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtAceptarCuentaActionPerformed
        JCTxSaldoRetirar.setEnabled(false);
        JCTxSaldoConsignar.setEnabled(false);
        JBtConsignar.setEnabled(true);
        JBtRetirar.setEnabled(true);
        JBoxTipoId.setEnabled(true);
        JPanelCuenta.setVisible(false);
        JCTxSaldoConsignar.setVisible(true);
        JCTxSaldoRetirar.setVisible(true);
        JCTxIDCue.setEnabled(true);
    }//GEN-LAST:event_JBtAceptarCuentaActionPerformed

    private void JBtCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtCrearActionPerformed
        JPanelCuentaEx.setVisible(false);
        JPanelNCuenta.setVisible(false);
        JBtCrearCuenta.setEnabled(true);
        guardarDatosCrearCuenta();
        //System.exit(0);
        cargarCuentas();
        JCTxNombre.setText("");
        JCTxID.setText("");
        JCTxValor.setText("");
        
    }//GEN-LAST:event_JBtCrearActionPerformed

    private void JCTxValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCTxValorActionPerformed
        JBtCrear.setEnabled(true);
    }//GEN-LAST:event_JCTxValorActionPerformed

    private void JCTxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCTxIDActionPerformed
        JBtCrear.setEnabled(false);
    }//GEN-LAST:event_JCTxIDActionPerformed

    private void JBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBtCancelarActionPerformed

    private void JCTxIDCueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCTxIDCueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCTxIDCueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JBoxTipoIDN;
    private javax.swing.JComboBox<String> JBoxTipoId;
    private javax.swing.JButton JBtAceptarCuenta;
    private javax.swing.JButton JBtBuscar;
    private javax.swing.JButton JBtBuscarCuenta;
    private javax.swing.JButton JBtCancelar;
    private javax.swing.JButton JBtConsignar;
    private javax.swing.JButton JBtCrear;
    private javax.swing.JButton JBtCrearCuenta;
    private javax.swing.JButton JBtRetirar;
    private javax.swing.JTextField JCTxID;
    private javax.swing.JTextField JCTxIDCue;
    private javax.swing.JTextField JCTxNombre;
    private javax.swing.JTextField JCTxSaldoConsignar;
    private javax.swing.JTextField JCTxSaldoRetirar;
    private javax.swing.JTextField JCTxValor;
    private javax.swing.JPanel JPanelCuenta;
    private javax.swing.JPanel JPanelCuentaEx;
    private javax.swing.JPanel JPanelNCuenta;
    private javax.swing.JLabel JTxID;
    private javax.swing.JLabel JTxIDCu;
    private javax.swing.JLabel JTxIdEx;
    private javax.swing.JLabel JTxNombre;
    private javax.swing.JLabel JTxNombreEx;
    private javax.swing.JLabel JTxNumCuentaEx;
    private javax.swing.JLabel JTxSaldo;
    private javax.swing.JLabel JTxSaldoEx;
    private javax.swing.JLabel JTxTipoId;
    private javax.swing.JLabel JTxTipoIdCuenta;
    private javax.swing.JLabel JTxTipoIdCuentaEx;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    
    public String prueba ()
    {
        String IdPrueba = "1234";
        
        return IdPrueba;
        
    }
    public String prueba1 ()
    {
        String NombrePruebra = "Andres santiago Puentes Munevar";
        return NombrePruebra;
    }
    public String prueba3 ()
    {
        
        
        String TipoIDPrueba = JBoxTipoId.getSelectedItem().toString();
        return TipoIDPrueba;
    }
    public float prueba4()
    {
        float saldoPrueba = 50000;
        return saldoPrueba;
    }

    
    public void guardarDatosCrearCuenta()
    {
        String nombre = JCTxNombre.getText();
        String identificacion = JCTxID.getText();
        String tipoIdentificacion = JBoxTipoIDN.getSelectedItem().toString();
        String SALDO = JCTxValor.getText();
        
        //Esta parte se usa para comvertir un String en Double.
        double saldo = Double.parseDouble(SALDO);
        
        GestionDatos g = new GestionDatos();
        Cuenta c = g.crearCuenta(nombre, identificacion, saldo, tipoIdentificacion);// g.crearCliente(nombre, identificacion, saldo,tipoIdentificacion);
        
        if (c!=null )
        {
            cargarCuentas();
            JOptionPane.showMessageDialog(this, "Se creo la cuenta con "+c);
            
        }else
        {
            JOptionPane.showMessageDialog(this, " no creo la cuenta");
        }
        
        
        //Esta opcion permite darle formato a las cifras decimales.
        DecimalFormat formatea = new DecimalFormat("###,###.##");
        //System.out.println("$"+formatea.format(saldo));
        //System.out.println(""+nombre+" "+identificacion+" "+tipoIdentificacion+" "+saldo);
    }
    public String pruebraNombre()
    {
        //se usa para llamar los datos creados anterior mente
        String nombre = JCTxNombre.getText();
        return nombre; 
    }
    public String pruebaIdentificacion()
    {
        String identificacion = JCTxID.getText();
        return identificacion;
    }
    
    public void cargarCuentas()
    {
        GestionDatos gestor = new GestionDatos();
        Map<String, Cuenta> lista = gestor.obtenerLista();
        for (Map.Entry<String, Cuenta> dato  : lista.entrySet()) {
            Cuenta nova = dato.getValue();
            Object[] datos = {
                nova.obtenerCliente(),
                    nova.obtenerNumCuenta(),
                        nova.obtenerSaldo()
                

            };
            System.out.println(""+nova.obtenerCliente()+" Cuenta: "+nova.obtenerNumCuenta());
        }
    }
    
    
}

