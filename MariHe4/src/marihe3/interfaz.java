
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marihe3;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import javax.swing.JOptionPane;
import java.util.Formatter;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

// modo oscuro
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Javi
 */


public class interfaz extends javax.swing.JFrame {
    
    
    private void Cerrar(){
        String botones[]={"Cerrar", "Cancelar"};
        
        // Cargar imagen desde archivo
        Icon icono = new ImageIcon(getClass().getResource("")); // Cambiar el nombre del archivo y la ubicación según corresponda
        
        int eleccion = JOptionPane.showOptionDialog(this,
            "¿Deseas cerrar el programa?",
            "Facturación Marihe",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            icono, // Pase el objeto ImageIcon como el sexto parámetro
            botones,
            this);
        
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.out.println("Se canceló el cierre");
        }
    }
    
    

    String barra=File.separator;
    String CrearUbicacion=System.getProperty("user.home")+barra+"/Desktop/Facturacion"+barra;
    
    
    
        DefaultTableModel mode;
        DefaultTableModel mode2;
        DefaultTableModel mode3;
        DefaultTableModel mode4;
        DefaultTableModel mode5;
        DefaultTableModel mode6;
        DefaultTableModel mode7;
        DefaultTableModel mode8;
        DefaultTableModel mode9;
        DefaultTableModel mode10;
        DefaultTableModel mode11;
        DefaultTableModel mode12;
        DefaultTableModel mode13;
        DefaultTableModel mode14;
        DefaultTableModel mode15;
        DefaultTableModel mode16;
        DefaultTableModel mode17;
        DefaultTableModel mode18;
        DefaultTableModel mode19;
        @SuppressWarnings("empty-statement")
        
    public interfaz() {
        initComponents();
        
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        
        this.setTitle("Facturacion MariHe");
        setIconImage(new ImageIcon(getClass().getResource("")).getImage());
        ;   
        String [] enca={"Producto"};
        mode =new DefaultTableModel(null,enca);
        mode2 =new DefaultTableModel(null,enca);
        mode3 =new DefaultTableModel(null,enca);
        mode4 =new DefaultTableModel(null,enca);
        mode5 =new DefaultTableModel(null,enca);
        mode6 =new DefaultTableModel(null,enca);
        mode7 =new DefaultTableModel(null,enca);
        mode8 =new DefaultTableModel(null,enca);
        mode9 =new DefaultTableModel(null,enca);
        mode10 =new DefaultTableModel(null,enca);
        mode11 =new DefaultTableModel(null,enca);
        mode12 =new DefaultTableModel(null,enca);
        mode13 =new DefaultTableModel(null,enca);
        mode14 =new DefaultTableModel(null,enca);
        mode15 =new DefaultTableModel(null,enca);
        mode16 =new DefaultTableModel(null,enca);
        mode17 =new DefaultTableModel(null,enca);
        mode18 =new DefaultTableModel(null,enca);
        mode19 =new DefaultTableModel(null,enca);
        tabla1.setModel(mode);
        tabla2.setModel(mode2);
        tabla3.setModel(mode3);
        tabla4.setModel(mode4);
        tabla5.setModel(mode5);
        tabla6.setModel(mode6);
        tabla7.setModel(mode7);
        tabla8.setModel(mode8);
        tabla9.setModel(mode9);
        tabla10.setModel(mode10);
        tabla11.setModel(mode11);
        tabla12.setModel(mode12);
        tabla13.setModel(mode13);
        tabla14.setModel(mode14);
        tabla15.setModel(mode15);
        tabla16.setModel(mode16);
        tabla17.setModel(mode17);
        tabla18.setModel(mode18); 
        tabla19.setModel(mode19);
        
        
        //PRUEBAAAAAAAAAA LOGO   
    }
    
    private void Crear(){
        String archivo=txtnombre.getText()+".txt";
        File CrearUbi=new File(CrearUbicacion);
        File CrearArchi=new File(CrearUbicacion+archivo);
        
        if(txtnombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "No existe ese nombre");
        } else{
            try {
                if(CrearArchi.exists()){
                    JOptionPane.showMessageDialog(rootPane, "Este nombre ya esta registrado");
                }else{
                    CrearUbi.mkdirs();
                    Formatter CrearForma=new Formatter(CrearUbicacion+archivo);
                    CrearForma.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n"
                    ,"Nombre="+txtnombre.getText(), "M2="+txtTotal1.getText(), "M1="+txtTotal2.getText(), "200="+txtTotal3.getText(), "100="+txtTotal4.getText(), 
                    "Chu="+txtTotal5.getText(), "Gs="+txtTotal6.getText(), "Cha="+txtTotal7.getText(), "G="+txtTotal8.getText(), 
                    "V="+txtTotal9.getText(), "Vit="+txtTotal10.getText(), "C="+txtTotal11.getText(), "Tor="+txtTotal12.getText(), 
                    "Mini="+txtTotal13.getText(), "Bcs="+txtTotal14.getText(), "Salsa="+txtTotal15.getText(), "M1lt="+txtTotal16.getText(), 
                    "M.05="+txtTotal17.getText(), "Kokes="+txtTotal18.getText(), "SalsaFrita="+txtTotal19.getText());
                    
                    CrearForma.close();
                    JOptionPane.showMessageDialog(rootPane, "Registro exitoso!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Registro incorrecto!");
            }
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        txtM2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtTotal1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtM1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtTotal2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt200 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txtTotal3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt100 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        txtTotal4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtChu = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        txtTotal5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGs = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        txtTotal6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCha = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        txtTotal7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtG = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        txtTotal8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtV = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        txtTotal9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtVit = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        txtTotal10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        txtTotal11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTor = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        txtTotal12 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMini = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        txtTotal13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtBcs = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        txtTotal14 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSalsa = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        txtTotal15 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtM1lit = new javax.swing.JTextField();
        jButton32 = new javax.swing.JButton();
        txtTotal16 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtM5 = new javax.swing.JTextField();
        jButton34 = new javax.swing.JButton();
        txtTotal17 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        txtTotal18 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla4 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla5 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla7 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla13 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabla8 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla9 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabla6 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabla14 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        tabla15 = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        tabla16 = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        tabla11 = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        tabla17 = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        tabla12 = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        tabla10 = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        tabla18 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtKokes2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtSalsaFrita = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        tabla19 = new javax.swing.JTable();
        txtTotal19 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("M2");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        txtM2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtM2ActionPerformed(evt);
            }
        });
        txtM2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtM2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtM2KeyTyped(evt);
            }
        });
        getContentPane().add(txtM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, 93, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, -1, -1));

        txtTotal1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 226, 92, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("M1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 11, -1, -1));

        txtM1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtM1ActionPerformed(evt);
            }
        });
        txtM1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtM1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtM1KeyTyped(evt);
            }
        });
        getContentPane().add(txtM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 39, 93, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 78, -1, -1));

        txtTotal2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 226, 92, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("200");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 11, -1, -1));

        txt200.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt200ActionPerformed(evt);
            }
        });
        txt200.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt200KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt200KeyTyped(evt);
            }
        });
        getContentPane().add(txt200, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 39, 93, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 78, -1, -1));

        txtTotal3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 226, 92, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("100");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 11, -1, -1));

        txt100.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt100.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt100KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt100KeyTyped(evt);
            }
        });
        getContentPane().add(txt100, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 39, 93, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Agregar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 78, -1, -1));

        txtTotal4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 226, 91, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Chu");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 11, -1, -1));

        txtChu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtChu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChuKeyTyped(evt);
            }
        });
        getContentPane().add(txtChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 39, 93, -1));

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setText("Agregar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 78, -1, -1));

        txtTotal5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal5ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 226, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Gs");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 11, -1, -1));

        txtGs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGsActionPerformed(evt);
            }
        });
        txtGs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGsKeyTyped(evt);
            }
        });
        getContentPane().add(txtGs, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 39, 93, -1));

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setText("Agregar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 78, -1, -1));

        txtTotal6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal6ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 226, 96, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Cha");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 11, -1, -1));

        txtCha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCha, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 39, 93, -1));

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton14.setText("Agregar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 78, -1, -1));

        txtTotal7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal7ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 226, 96, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("G");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 11, -1, -1));

        txtG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGKeyTyped(evt);
            }
        });
        getContentPane().add(txtG, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 39, 93, -1));

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton16.setText("Agregar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 78, -1, -1));

        txtTotal8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtTotal8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 226, 96, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("V");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 11, -1, -1));

        txtV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtVit, org.jdesktop.beansbinding.ObjectProperty.create(), txtV, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txtV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVActionPerformed(evt);
            }
        });
        txtV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVKeyTyped(evt);
            }
        });
        getContentPane().add(txtV, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 39, 93, -1));

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton18.setText("Agregar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 78, -1, -1));

        txtTotal9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal9ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal9, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 226, 96, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Vit");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        txtVit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVitKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVitKeyTyped(evt);
            }
        });
        getContentPane().add(txtVit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 93, -1));

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton20.setText("Agregar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        txtTotal10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtTotal10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("C");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        txtC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCKeyTyped(evt);
            }
        });
        getContentPane().add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 93, -1));

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton22.setText("Agregar");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        txtTotal11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtTotal11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 100, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Tor");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        txtTor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTorKeyTyped(evt);
            }
        });
        getContentPane().add(txtTor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 93, -1));

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton24.setText("Agregar");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        txtTotal12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtTotal12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Mini");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        txtMini.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMini.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMiniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMiniKeyTyped(evt);
            }
        });
        getContentPane().add(txtMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 93, -1));

        jButton26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton26.setText("Agregar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        txtTotal13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtTotal13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 100, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Bcs");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        txtBcs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBcs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBcsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBcsKeyTyped(evt);
            }
        });
        getContentPane().add(txtBcs, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 93, -1));

        jButton28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton28.setText("Agregar");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        txtTotal14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtTotal14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 100, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Salsa");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        txtSalsa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalsaActionPerformed(evt);
            }
        });
        txtSalsa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalsaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalsaKeyTyped(evt);
            }
        });
        getContentPane().add(txtSalsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 93, -1));

        jButton30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton30.setText("Agregar");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        txtTotal15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtTotal15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 100, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("M1lt");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, -1, -1));

        txtM1lit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtM1lit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtM1litKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtM1litKeyTyped(evt);
            }
        });
        getContentPane().add(txtM1lit, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 93, -1));

        jButton32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton32.setText("Agregar");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, -1, -1));

        txtTotal16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal16ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 100, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("M.05");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, -1, -1));

        txtM5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtKokes2, org.jdesktop.beansbinding.ObjectProperty.create(), txtM5, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txtM5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtM5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtM5KeyTyped(evt);
            }
        });
        getContentPane().add(txtM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 300, 93, -1));

        jButton34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton34.setText("Agregar");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, -1, -1));

        txtTotal17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtTotal17, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 480, 100, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Kokes");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jButton36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton36.setText("Agregar");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        txtTotal18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtTotal18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 100, -1));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla2.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 120, 92, 91));

        tabla3.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla3.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabla3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 120, 92, 91));

        tabla4.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla4.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabla4);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 120, 92, 91));

        tabla5.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla5.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tabla5);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 120, 92, 91));

        tabla7.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla7.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tabla7);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 120, 92, 91));

        tabla13.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla13.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tabla13);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 92, 91));

        tabla8.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla8.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tabla8);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 92, 91));

        tabla9.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla9.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(tabla9);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 120, 92, 91));

        tabla6.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla6.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(tabla6);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 120, 92, 91));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla1.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(tabla1);

        getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 92, 91));

        tabla14.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla14.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(tabla14);

        getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 92, 91));

        tabla15.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla15.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(tabla15);

        getContentPane().add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 92, 91));

        tabla16.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla16.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(tabla16);

        getContentPane().add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 92, 91));

        tabla11.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla11.getTableHeader().setReorderingAllowed(false);
        jScrollPane14.setViewportView(tabla11);

        getContentPane().add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 92, 91));

        tabla17.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla17.getTableHeader().setReorderingAllowed(false);
        jScrollPane15.setViewportView(tabla17);

        getContentPane().add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 380, 92, 91));

        tabla12.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla12.getTableHeader().setReorderingAllowed(false);
        jScrollPane16.setViewportView(tabla12);

        getContentPane().add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 92, 91));

        tabla10.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla10.getTableHeader().setReorderingAllowed(false);
        jScrollPane17.setViewportView(tabla10);

        getContentPane().add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 92, 91));

        tabla18.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla18.getTableHeader().setReorderingAllowed(false);
        jScrollPane18.setViewportView(tabla18);

        getContentPane().add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 92, 91));

        jLabel19.setText("Programado por: Carranza Hernandez Javier Antonio");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 680, 110, 40));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 130, 30));

        txtKokes2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtM2, org.jdesktop.beansbinding.ObjectProperty.create(), txtKokes2, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        txtKokes2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKokes2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKokes2KeyTyped(evt);
            }
        });
        getContentPane().add(txtKokes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 90, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Nombre");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 612, -1, 20));

        jButton37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton37.setText("SUMA TOTAL");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, -1, 42));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Salsa Frita");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, -1, -1));

        txtSalsaFrita.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSalsaFrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalsaFritaActionPerformed(evt);
            }
        });
        txtSalsaFrita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalsaFritaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalsaFritaKeyTyped(evt);
            }
        });
        getContentPane().add(txtSalsaFrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 100, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 100, -1));

        tabla19.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla19.getTableHeader().setReorderingAllowed(false);
        jScrollPane19.setViewportView(tabla19);

        getContentPane().add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 92, 91));

        txtTotal19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtTotal19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 90, -1));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 20, 20));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String [] dato=new String [1];
        dato[0]= txtM2.getText();
        mode.addRow(dato);
        tabla1.setModel(mode);
        txtM2.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtMini.getText();
        mode13.addRow(dato);
        tabla13.setModel(mode13);
        txtMini.setText("");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void txtTotal9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal9ActionPerformed

    private void txtTotal16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal16ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtM1.getText();
        mode2.addRow(dato);
        tabla2.setModel(mode2);
        txtM1.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String [] dato=new String [1];
        dato[0]= txt200.getText();
        mode3.addRow(dato);
        tabla3.setModel(mode3);
        txt200.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String [] dato=new String [1];
        dato[0]= txt100.getText();
        mode4.addRow(dato);
        tabla4.setModel(mode4);
        txt100.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtChu.getText();
        mode5.addRow(dato);
        tabla5.setModel(mode5);
        txtChu.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtGs.getText();
        mode6.addRow(dato);
        tabla6.setModel(mode6);
        txtGs.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtCha.getText();
        mode7.addRow(dato);
        tabla7.setModel(mode7);
        txtCha.setText("");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtG.getText();
        mode8.addRow(dato);
        tabla8.setModel(mode8);
        txtG.setText("");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtV.getText();
        mode9.addRow(dato);
        tabla9.setModel(mode9);
        txtV.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtVit.getText();
        mode10.addRow(dato);
        tabla10.setModel(mode10);
        txtVit.setText("");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtC.getText();
        mode11.addRow(dato);
        tabla11.setModel(mode11);
        txtC.setText("");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtTor.getText();
        mode12.addRow(dato);
        tabla12.setModel(mode12);
        txtTor.setText("");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtBcs.getText();
        mode14.addRow(dato);
        tabla14.setModel(mode14);
        txtBcs.setText("");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtSalsa.getText();
        mode15.addRow(dato);
        tabla15.setModel(mode15);
        txtSalsa.setText("");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtM1lit.getText();
        mode16.addRow(dato);
        tabla16.setModel(mode16);
        txtM1lit.setText("");
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtM5.getText();
        mode17.addRow(dato);
        tabla17.setModel(mode17);
        txtM5.setText("");
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        String [] dato=new String [1];
        dato[0]= txtKokes2.getText();
        mode18.addRow(dato);
        tabla18.setModel(mode18);
        txtKokes2.setText("");
    }//GEN-LAST:event_jButton36ActionPerformed

    private void txtTotal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal5ActionPerformed

    private void txtTotal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal4ActionPerformed

    private void txtTotal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal3ActionPerformed

    private void txtTotal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal6ActionPerformed

    private void txtTotal7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal7ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Crear();
        txtTotal1.setText("");
        txtTotal2.setText("");
        txtTotal3.setText("");
        txtTotal4.setText("");
        txtTotal5.setText("");
        txtTotal6.setText("");
        txtTotal7.setText("");
        txtTotal8.setText("");
        txtTotal9.setText("");
        txtTotal10.setText("");
        txtTotal11.setText("");
        txtTotal12.setText("");
        txtTotal13.setText("");
        txtTotal14.setText("");
        txtTotal15.setText("");
        txtTotal16.setText("");
        txtTotal17.setText("");
        txtTotal18.setText("");
        txtTotal19.setText("");
        
        
       
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void txt100KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt100KeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txt100KeyTyped

    private void txt100KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt100KeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton8.doClick();
        }
    }//GEN-LAST:event_txt100KeyPressed

    private void txtChuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChuKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtChuKeyTyped

    private void txtChuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChuKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton10.doClick();
        }
    }//GEN-LAST:event_txtChuKeyPressed

    private void txtGsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGsKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtGsKeyTyped

    private void txtGsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGsKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton12.doClick();
        }
    }//GEN-LAST:event_txtGsKeyPressed

    private void txtGsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGsActionPerformed

    private void txtChaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChaKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtChaKeyTyped

    private void txtChaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChaKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton14.doClick();
        }
    }//GEN-LAST:event_txtChaKeyPressed

    private void txtGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtGKeyTyped

    private void txtGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton16.doClick();
        }
    }//GEN-LAST:event_txtGKeyPressed

    private void txtVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtVKeyTyped

    private void txtVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton18.doClick();
        }
    }//GEN-LAST:event_txtVKeyPressed

    private void txtVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVActionPerformed

    private void txtVitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVitKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtVitKeyTyped

    private void txtVitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVitKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton20.doClick();
        }

    }//GEN-LAST:event_txtVitKeyPressed

    private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtCKeyTyped

    private void txtCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton22.doClick();
        }
    }//GEN-LAST:event_txtCKeyPressed

    private void txtTorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTorKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtTorKeyTyped

    private void txtTorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTorKeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton24.doClick();
        }
    }//GEN-LAST:event_txtTorKeyPressed

    private void txtMiniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMiniKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtMiniKeyTyped

    private void txtMiniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMiniKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton26.doClick();
        }
    }//GEN-LAST:event_txtMiniKeyPressed

    private void txtBcsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBcsKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtBcsKeyTyped

    private void txtBcsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBcsKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton28.doClick();
        }
    }//GEN-LAST:event_txtBcsKeyPressed

    private void txtSalsaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalsaKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtSalsaKeyTyped

    private void txtSalsaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalsaKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton30.doClick();
        }
    }//GEN-LAST:event_txtSalsaKeyPressed

    private void txtM1litKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtM1litKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtM1litKeyTyped

    private void txtM1litKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtM1litKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton32.doClick();
        }
    }//GEN-LAST:event_txtM1litKeyPressed

    private void txtM5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtM5KeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtM5KeyTyped

    private void txtM5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtM5KeyPressed
        // TODO add your handling code here:

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton34.doClick();
        }
    }//GEN-LAST:event_txtM5KeyPressed

    private void txtKokes2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKokes2KeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtKokes2KeyTyped

    private void txtKokes2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKokes2KeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton36.doClick();
        }
    }//GEN-LAST:event_txtKokes2KeyPressed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            btnGuardar.doClick();
        }
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtM2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtM2KeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtM2KeyTyped

    private void txtM2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtM2KeyPressed
        // prubea sumar con un solo enter

        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton1.doClick();
        }
    }//GEN-LAST:event_txtM2KeyPressed

    private void txtM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtM2ActionPerformed

    private void txtM1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtM1KeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtM1KeyTyped

    private void txtM1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtM1KeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            
        
            jButton4.doClick();
       }
    }//GEN-LAST:event_txtM1KeyPressed

    private void txt200KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt200KeyTyped
        
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txt200KeyTyped

    private void txt200KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt200KeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton6.doClick();
        }
    }//GEN-LAST:event_txt200KeyPressed

    private void txt200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt200ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt200ActionPerformed

    private void txtM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtM1ActionPerformed

    private void txtTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal1ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // Matrices que contienen las tablas y los campos de texto
JTable[] tablas = {tabla1, tabla2, tabla3, tabla4, tabla5, tabla6, tabla7, tabla8, tabla9, tabla10, tabla11, tabla12, tabla13, tabla14, tabla15, tabla16, tabla17, tabla18, tabla19};
JTextField[] camposTotal = {txtTotal1, txtTotal2, txtTotal3, txtTotal4, txtTotal5, txtTotal6, txtTotal7, txtTotal8, txtTotal9, txtTotal10, txtTotal11, txtTotal12, txtTotal13, txtTotal14, txtTotal15, txtTotal16, txtTotal17, txtTotal18, txtTotal19};

// Recorrer todas las tablas y calcular sus totales
for (int i = 0; i < tablas.length; i++) {
    int total = 0;
    for (int j = 0; j < tablas[i].getRowCount(); j++) {
        try {
            int value = Integer.parseInt(tablas[i].getValueAt(j, 0).toString());
            total += value;
        } catch (NumberFormatException e) {
            // Manejar la excepción si el valor no es un número válido
        }
    }
    camposTotal[i].setText(String.valueOf(total));
}

    }//GEN-LAST:event_jButton37ActionPerformed

    private void txtSalsaFritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalsaFritaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalsaFritaActionPerformed

    private void txtSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalsaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String [] dato=new String [1];
        dato[0]= txtSalsaFrita.getText();
        mode19.addRow(dato);
        tabla19.setModel(mode19);
        txtSalsaFrita.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSalsaFritaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalsaFritaKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            jButton2.doClick();
        }
    }//GEN-LAST:event_txtSalsaFritaKeyPressed

    private void txtSalsaFritaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalsaFritaKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtSalsaFritaKeyTyped

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
   
     if (jCheckBox1.isSelected()) {
        getContentPane().setBackground(Color.BLACK);
        jLabel1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);
        jLabel3.setForeground(Color.WHITE);
        jLabel4.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.WHITE);
        jLabel6.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel10.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.WHITE);
        jLabel14.setForeground(Color.WHITE);
        jLabel15.setForeground(Color.WHITE);
        jLabel16.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
        jLabel18.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        jLabel20.setForeground(Color.WHITE);
        jLabel21.setForeground(Color.WHITE);
        jCheckBox1.setForeground(Color.WHITE);
        
        
    } else {
        getContentPane().setBackground(Color.BLACK);
        jLabel1.setForeground(Color.WHITE);
        jLabel2.setForeground(Color.WHITE);
        jLabel3.setForeground(Color.WHITE);
        jLabel4.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.WHITE);
        jLabel6.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        jLabel8.setForeground(Color.WHITE);
        jLabel9.setForeground(Color.WHITE);
        jLabel10.setForeground(Color.WHITE);
        jLabel11.setForeground(Color.WHITE);
        jLabel12.setForeground(Color.WHITE);
        jLabel13.setForeground(Color.WHITE);
        jLabel14.setForeground(Color.WHITE);
        jLabel15.setForeground(Color.WHITE);
        jLabel16.setForeground(Color.WHITE);
        jLabel17.setForeground(Color.WHITE);
        jLabel18.setForeground(Color.WHITE);
        jLabel19.setForeground(Color.WHITE);
        jLabel20.setForeground(Color.WHITE);
        jLabel21.setForeground(Color.WHITE);
        jCheckBox1.setForeground(Color.WHITE);
    }   
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new interfaz().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla10;
    private javax.swing.JTable tabla11;
    private javax.swing.JTable tabla12;
    private javax.swing.JTable tabla13;
    private javax.swing.JTable tabla14;
    private javax.swing.JTable tabla15;
    private javax.swing.JTable tabla16;
    private javax.swing.JTable tabla17;
    private javax.swing.JTable tabla18;
    private javax.swing.JTable tabla19;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tabla3;
    private javax.swing.JTable tabla4;
    private javax.swing.JTable tabla5;
    private javax.swing.JTable tabla6;
    private javax.swing.JTable tabla7;
    private javax.swing.JTable tabla8;
    private javax.swing.JTable tabla9;
    private javax.swing.JTextField txt100;
    private javax.swing.JTextField txt200;
    private javax.swing.JTextField txtBcs;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCha;
    private javax.swing.JTextField txtChu;
    private javax.swing.JTextField txtG;
    private javax.swing.JTextField txtGs;
    private javax.swing.JTextField txtKokes2;
    private javax.swing.JTextField txtM1;
    private javax.swing.JTextField txtM1lit;
    private javax.swing.JTextField txtM2;
    private javax.swing.JTextField txtM5;
    private javax.swing.JTextField txtMini;
    private javax.swing.JTextField txtSalsa;
    private javax.swing.JTextField txtSalsaFrita;
    private javax.swing.JTextField txtTor;
    private javax.swing.JTextField txtTotal1;
    private javax.swing.JTextField txtTotal10;
    private javax.swing.JTextField txtTotal11;
    private javax.swing.JTextField txtTotal12;
    private javax.swing.JTextField txtTotal13;
    private javax.swing.JTextField txtTotal14;
    private javax.swing.JTextField txtTotal15;
    private javax.swing.JTextField txtTotal16;
    private javax.swing.JTextField txtTotal17;
    private javax.swing.JTextField txtTotal18;
    private javax.swing.JTextField txtTotal19;
    private javax.swing.JTextField txtTotal2;
    private javax.swing.JTextField txtTotal3;
    private javax.swing.JTextField txtTotal4;
    private javax.swing.JTextField txtTotal5;
    private javax.swing.JTextField txtTotal6;
    private javax.swing.JTextField txtTotal7;
    private javax.swing.JTextField txtTotal8;
    private javax.swing.JTextField txtTotal9;
    private javax.swing.JTextField txtV;
    private javax.swing.JTextField txtVit;
    private javax.swing.JTextField txtnombre;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private Object getclass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
