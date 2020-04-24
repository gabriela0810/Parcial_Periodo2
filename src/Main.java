
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class Main extends javax.swing.JFrame {

    ArrayList<FarmDermocosmeticos> farmDermocosmetico;
    ArrayList<FarmInfantil> farmInfantil;
    ArrayList<FarmAnalgesicos> farmAnalgesicos;
    int id=0;
    public Main() {
        initComponents();
        
        this.farmAnalgesicos=new ArrayList<>();
        this.farmDermocosmetico=new ArrayList<>();
        this.farmInfantil=new ArrayList<>();
            
        generarDatos();
        cargarFarmA();
    }
    
    private void generarDatos(){
        this.farmAnalgesicos.add(new FarmAnalgesicos("Jarabe", 2, "Dramamine", 1.50, "Laboratorios Lopez"));
        this.farmAnalgesicos.get(0).agregarExistencias(10);
        this.farmAnalgesicos.add(new FarmAnalgesicos("Pastilla", 2, "NFF", 0.50, "Zwger"));
        this.farmAnalgesicos.get(1).agregarExistencias(10);
        this.farmDermocosmetico.add(new FarmDermocosmeticos("Esparcir sobre el rostro", 20, "Embryolisse", 3.80, "Lait-Creme"));
        this.farmDermocosmetico.get(0).agregarExistencias(10);
        this.farmInfantil.add(new FarmInfantil(1.5, 5, "Bacaolinita", 2.00, "Laines"));
        this.farmInfantil.get(0).agregarExistencias(10);
    }
    
    private void cargarFarmA(){
        this.inpfarmaco.removeAllItems();
        for(int i=0; i<this.farmAnalgesicos.size(); i++){
            this.inpfarmaco.addItem(this.farmAnalgesicos.get(i).nombre);
        }
    }
    private void cargarFarmD(){
        this.inpfarmaco.removeAllItems();
        for(int i=0; i<this.farmDermocosmetico.size(); i++){
            this.inpfarmaco.addItem(this.farmDermocosmetico.get(i).nombre);
        }
    }
    private void cargarFarmI(){
        this.inpfarmaco.removeAllItems();
        for(int i=0; i<this.farmInfantil.size(); i++){
            this.inpfarmaco.addItem(this.farmInfantil.get(i).nombre);
        }
    }
    
    private void cargarFarmA2(){
        this.inpfarmaco1.removeAllItems();
        for(int i=0; i<this.farmAnalgesicos.size(); i++){
            this.inpfarmaco1.addItem(this.farmAnalgesicos.get(i).nombre);
        }
    }
    private void cargarFarmD2(){
        this.inpfarmaco1.removeAllItems();
        for(int i=0; i<this.farmDermocosmetico.size(); i++){
            this.inpfarmaco1.addItem(this.farmDermocosmetico.get(i).nombre);
        }
    }
    private void cargarFarmI2(){
        this.inpfarmaco1.removeAllItems();
        for(int i=0; i<this.farmInfantil.size(); i++){
            this.inpfarmaco1.addItem(this.farmInfantil.get(i).nombre);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel29 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inpnom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inpprovee = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inpdosis = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        inpprecio = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inpexist = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        inpusi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        inpdosisedad = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        inpcatg2 = new javax.swing.JComboBox<>();
        inptpaplic = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        inpunid = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        inptotal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        inpfarmaco = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        inpcatg1 = new javax.swing.JComboBox<>();
        txtdatoss = new javax.swing.JScrollPane();
        txtdatoss1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        inpnewunid = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        inpcatg3 = new javax.swing.JComboBox<>();
        inpfarmaco1 = new javax.swing.JComboBox<>();

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel29.setText("_");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("COMPRA");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Nombre del Farmaco:");

        inpnom.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Proveedor:");

        inpprovee.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("N° Dosis:");

        inpdosis.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inpdosis.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Precio: $");

        inpprecio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inpprecio.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Categoria: ");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel8.setText("CATEGORIA DEL FARMACO");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("N° Existencias:");

        inpexist.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inpexist.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Uso:");

        inpusi.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inpusi.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Dosis por Edad:");

        inpdosisedad.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inpdosisedad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        inpdosisedad.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setText("Tipo de Aplicacion:");

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton1.setText("COMPRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        inpcatg2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inpcatg2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farmaco Analgesico", "Farmaco Dermocosmetico", "Farmaco Infantil" }));
        inpcatg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpcatg2ActionPerformed(evt);
            }
        });

        inptpaplic.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inptpaplic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jarabe", "Inyeccion", "Pastilla" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inpprovee, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inpnom, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inpprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inpdosis, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inpcatg2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inpexist, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inpusi, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inpdosisedad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inptpaplic, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inpnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inpprovee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inpdosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inpprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inpexist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(inpcatg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(inpusi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(inpdosisedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(inptpaplic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("VENTA");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel13.setText("DATOS DEL FARMACO");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("Farmaco:");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("Unidades:");

        inpunid.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inpunid.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        inpunid.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                inpunidStateChanged(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setText("Total: $");

        inptotal.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inptotal.setEnabled(false);

        jButton2.setBackground(new java.awt.Color(0, 204, 51));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton2.setText("VENDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        inpfarmaco.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inpfarmaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpfarmacoActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel26.setText("Categoria: ");

        inpcatg1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inpcatg1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farmaco Analgesico", "Farmaco Dermocosmetico", "Farmaco Infantil" }));
        inpcatg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpcatg1ActionPerformed(evt);
            }
        });

        txtdatoss1.setColumns(20);
        txtdatoss1.setRows(5);
        txtdatoss.setViewportView(txtdatoss1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inpunid, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inpcatg1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inptotal))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inpfarmaco, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(txtdatoss, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(inpcatg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(inpfarmaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(inpunid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(inptotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtdatoss, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setText("ABASTECER FARMACO");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel24.setText("Farmaco:");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel25.setText("Nuevas Unidades:");

        inpnewunid.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inpnewunid.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

        jButton3.setBackground(new java.awt.Color(0, 204, 51));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton3.setText("CONFIRMAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel27.setText("Categoria: ");

        inpcatg3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        inpcatg3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farmaco Analgesico", "Farmaco Dermocosmetico", "Farmaco Infantil" }));
        inpcatg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpcatg3ActionPerformed(evt);
            }
        });

        inpfarmaco1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inpcatg3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(inpfarmaco1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inpnewunid, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpcatg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(inpnewunid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpfarmaco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inpcatg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpcatg1ActionPerformed
        if(this.inpcatg1.getSelectedIndex()==0){
            cargarFarmA();
        }else if(this.inpcatg1.getSelectedIndex()==1){
            cargarFarmD();
        }else if(this.inpcatg1.getSelectedIndex()==2){
            cargarFarmI();
        }
    }//GEN-LAST:event_inpcatg1ActionPerformed

    private void inpcatg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpcatg2ActionPerformed
        if(this.inpcatg2.getSelectedIndex()==0){
            this.inptpaplic.setEnabled(true);
            this.inpusi.setEnabled(false);
            this.inpdosisedad.setEnabled(false);
        }else if(this.inpcatg2.getSelectedIndex()==1){
            this.inptpaplic.setEnabled(false);
            this.inpusi.setEnabled(true);
            this.inpdosisedad.setEnabled(false);
        }else if(this.inpcatg2.getSelectedIndex()==2){
            this.inptpaplic.setEnabled(false);
            this.inpusi.setEnabled(false);
            this.inpdosisedad.setEnabled(true);
        }
    }//GEN-LAST:event_inpcatg2ActionPerformed

    private void inpfarmacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpfarmacoActionPerformed
        if(this.inpcatg1.getSelectedIndex()==0){
            id=this.inpfarmaco.getSelectedIndex();
            if(id<0){
                id=0;
            }
            this.txtdatoss1.setText(this.farmAnalgesicos.get(id).datosFarmaco() + 
                                    this.farmAnalgesicos.get(id).datosPorCategorias());
            this.inptotal.setText(String.valueOf(this.farmAnalgesicos.get(id).precio));    
            
        }
        if(this.inpcatg1.getSelectedIndex()==1){
            id=this.inpfarmaco.getSelectedIndex();
            if(id<0){
                id=0;
            }
            this.txtdatoss1.setText(this.farmDermocosmetico.get(id).datosFarmaco() + 
                                    this.farmDermocosmetico.get(id).datosPorCategorias());
            this.inptotal.setText(String.valueOf(this.farmDermocosmetico.get(id).precio));    
        }
        if(this.inpcatg1.getSelectedIndex()==2){
            id=this.inpfarmaco.getSelectedIndex();
            if(id<0){
                id=0;
            }
            this.txtdatoss1.setText(this.farmInfantil.get(id).datosFarmaco() + 
                                    this.farmInfantil.get(id).datosPorCategorias());
            this.inptotal.setText(String.valueOf(this.farmInfantil.get(id).precio));    
        }
    }//GEN-LAST:event_inpfarmacoActionPerformed

    private void inpunidStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_inpunidStateChanged
        if(this.inpcatg1.getSelectedIndex()==0){
            id=this.inpfarmaco.getSelectedIndex();
            if(id<0){
                id=0;
            }
            double pre=this.farmAnalgesicos.get(id).precio;
            int ttuni=Integer.parseInt(this.inpunid.getValue().toString());
            
            this.inptotal.setText(String.valueOf(pre*ttuni));            
        }
        if(this.inpcatg1.getSelectedIndex()==1){
            id=this.inpfarmaco.getSelectedIndex();
            if(id<0){
                id=0;
            }
            double pre=this.farmDermocosmetico.get(id).precio;
            int ttuni=Integer.parseInt(this.inpunid.getValue().toString());
            
            this.inptotal.setText(String.valueOf(pre*ttuni));
        }
        if(this.inpcatg1.getSelectedIndex()==2){
            id=this.inpfarmaco.getSelectedIndex();
            if(id<0){
                id=0;
            }
            double pre=this.farmInfantil.get(id).precio;
            int ttuni=Integer.parseInt(this.inpunid.getValue().toString());
            
            this.inptotal.setText(String.valueOf(pre*ttuni));
        }
            
    }//GEN-LAST:event_inpunidStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(this.inpcatg1.getSelectedIndex()==0){
            id=this.inpfarmaco.getSelectedIndex();
            if(id<0){
                id=0;
            }
             
            int ttuni=Integer.parseInt(this.inpunid.getValue().toString());
            
            if(this.farmAnalgesicos.get(id).validarExistencias(ttuni)==1){
                JOptionPane.showMessageDialog(this, "Ya no hay existencias de este Farmaco");
            }else{
                this.farmAnalgesicos.get(id).venExistencias(ttuni);
                JOptionPane.showMessageDialog(this, "Farmaco vendido, Quedan " + this.farmAnalgesicos.get(id).nExistencias);
            }
            
        }
        if(this.inpcatg1.getSelectedIndex()==1){
            id=this.inpfarmaco.getSelectedIndex();
            if(id<0){
                id=0;
            }
            int ttuni=Integer.parseInt(this.inpunid.getValue().toString());
            
            if(this.farmDermocosmetico.get(id).validarExistencias(ttuni)==1){
                JOptionPane.showMessageDialog(this, "Ya no hay existencias de este Farmaco");
            }else{
                this.farmDermocosmetico.get(id).venExistencias(ttuni);
                JOptionPane.showMessageDialog(this, "Farmaco vendido, Quedan " + this.farmDermocosmetico.get(id).nExistencias);
            }
        }
        if(this.inpcatg1.getSelectedIndex()==2){
            id=this.inpfarmaco.getSelectedIndex();
            if(id<0){
                id=0;
            }
            int ttuni=Integer.parseInt(this.inpunid.getValue().toString());
            
            if(this.farmInfantil.get(id).validarExistencias(ttuni)==1){
                JOptionPane.showMessageDialog(this, "Ya no hay existencias de este Farmaco");
            }else{
                this.farmInfantil.get(id).venExistencias(ttuni);
                JOptionPane.showMessageDialog(this, "Farmaco vendido, Quedan " + this.farmInfantil.get(id).nExistencias);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String tapli=this.inptpaplic.getSelectedItem().toString();
        int ndoss=Integer.parseInt(this.inpdosis.getValue().toString());
        String nomf=this.inpnom.getText();
        double pre=Double.parseDouble(this.inpprecio.getValue().toString());
        String provee=this.inpprovee.getText();
        int nex=Integer.valueOf(this.inpexist.getValue().toString());
        int idt=this.farmAnalgesicos.size();
        String tuso=this.inpusi.getText();
        double tdoss=Double.parseDouble(this.inpdosisedad.getValue().toString());
        
        if(this.inpcatg2.getSelectedIndex()==0){
            this.farmAnalgesicos.add(new FarmAnalgesicos(tapli, ndoss, nomf, pre, provee));
            this.farmAnalgesicos.get(idt-1).agregarExistencias(nex);
            JOptionPane.showMessageDialog(this, "Farmaco Comprado");
        }
        if(this.inpcatg2.getSelectedIndex()==1){
            this.farmDermocosmetico.add(new FarmDermocosmeticos(tuso, ndoss, nomf, pre, provee));
            this.farmDermocosmetico.get(idt-1).agregarExistencias(nex);
            JOptionPane.showMessageDialog(this, "Farmaco Comprado");
        }
        if(this.inpcatg2.getSelectedIndex()==2){
            this.farmInfantil.add(new FarmInfantil(tdoss, ndoss, nomf, pre, provee));
            this.farmInfantil.get(idt-1).agregarExistencias(nex);
            JOptionPane.showMessageDialog(this, "Farmaco Comprado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(this.inpcatg3.getSelectedIndex()==0){        
            int ttuni=Integer.parseInt(this.inpnewunid.getValue().toString());
            int idfar=this.inpfarmaco1.getSelectedIndex();
            
            this.farmAnalgesicos.get(idfar).agregarExistencias(ttuni);
            JOptionPane.showMessageDialog(this, "Farmaco Abastecido");
        }
        if(this.inpcatg3.getSelectedIndex()==1){
            int ttuni=Integer.parseInt(this.inpnewunid.getValue().toString());
            int idfar=this.inpfarmaco1.getSelectedIndex();
            
            this.farmDermocosmetico.get(idfar).agregarExistencias(ttuni);
            JOptionPane.showMessageDialog(this, "Farmaco Abastecido");
        }
        if(this.inpcatg3.getSelectedIndex()==2){
            int ttuni=Integer.parseInt(this.inpnewunid.getValue().toString());
            int idfar=this.inpfarmaco1.getSelectedIndex();
            
            this.farmInfantil.get(idfar).agregarExistencias(ttuni);
            JOptionPane.showMessageDialog(this, "Farmaco Abastecido");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void inpcatg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpcatg3ActionPerformed
        if(this.inpcatg3.getSelectedIndex()==0){
            cargarFarmA2();
        }else if(this.inpcatg3.getSelectedIndex()==1){
            cargarFarmD2();
        }else if(this.inpcatg3.getSelectedIndex()==2){
            cargarFarmI2();
        }
    }//GEN-LAST:event_inpcatg3ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> inpcatg1;
    private javax.swing.JComboBox<String> inpcatg2;
    private javax.swing.JComboBox<String> inpcatg3;
    private javax.swing.JSpinner inpdosis;
    private javax.swing.JSpinner inpdosisedad;
    private javax.swing.JSpinner inpexist;
    private javax.swing.JComboBox<String> inpfarmaco;
    private javax.swing.JComboBox<String> inpfarmaco1;
    private javax.swing.JSpinner inpnewunid;
    private javax.swing.JTextField inpnom;
    private javax.swing.JSpinner inpprecio;
    private javax.swing.JTextField inpprovee;
    private javax.swing.JTextField inptotal;
    private javax.swing.JComboBox<String> inptpaplic;
    private javax.swing.JSpinner inpunid;
    private javax.swing.JTextField inpusi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JScrollPane txtdatoss;
    private javax.swing.JTextArea txtdatoss1;
    // End of variables declaration//GEN-END:variables
}
