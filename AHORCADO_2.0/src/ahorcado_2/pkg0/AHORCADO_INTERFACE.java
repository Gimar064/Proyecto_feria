/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado_2.pkg0;

import java.util.Random;
import java.lang.Thread;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author Dell E6420
 */
public class AHORCADO_INTERFACE extends javax.swing.JFrame{
String letra="0";
String palabra="0";
int palabraint=0;
int contador=1;
  

    public AHORCADO_INTERFACE() {
        initComponents();
        setSize(1831,966);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBT = new javax.swing.JButton();
        jBQ = new javax.swing.JButton();
        jBW = new javax.swing.JButton();
        jBE = new javax.swing.JButton();
        jBY = new javax.swing.JButton();
        jBuU = new javax.swing.JButton();
        jBI = new javax.swing.JButton();
        jBO = new javax.swing.JButton();
        jBP = new javax.swing.JButton();
        jBA = new javax.swing.JButton();
        jBS = new javax.swing.JButton();
        jBD = new javax.swing.JButton();
        jBF = new javax.swing.JButton();
        jBG = new javax.swing.JButton();
        jBH = new javax.swing.JButton();
        jBJ = new javax.swing.JButton();
        jBK = new javax.swing.JButton();
        jBL = new javax.swing.JButton();
        jBZ = new javax.swing.JButton();
        jBX = new javax.swing.JButton();
        jBC = new javax.swing.JButton();
        jBV = new javax.swing.JButton();
        jBB = new javax.swing.JButton();
        jBN = new javax.swing.JButton();
        jBM = new javax.swing.JButton();
        jBESPACIO = new javax.swing.JButton();
        jBÑ = new javax.swing.JButton();
        jBR = new javax.swing.JButton();
        JLB_MOSTRAR = new javax.swing.JLabel();
        jBENTER = new javax.swing.JButton();
        JLB_LETRA = new javax.swing.JLabel();
        JLB_LINEAS = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        JLBINICIAR = new javax.swing.JButton();
        lblSegundo = new javax.swing.JLabel();
        jblfondo_de_tiempo = new javax.swing.JLabel();
        JLB_OPORTUNIDADES = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jbl_registrar = new javax.swing.JButton();
        jbn_resultado = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jBT.setText("T");
        jBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTActionPerformed(evt);
            }
        });
        getContentPane().add(jBT);
        jBT.setBounds(860, 550, 70, 60);

        jBQ.setText("Q");
        jBQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQActionPerformed(evt);
            }
        });
        getContentPane().add(jBQ);
        jBQ.setBounds(580, 550, 70, 60);

        jBW.setText("W");
        jBW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWActionPerformed(evt);
            }
        });
        getContentPane().add(jBW);
        jBW.setBounds(650, 550, 70, 60);

        jBE.setText("E");
        jBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEActionPerformed(evt);
            }
        });
        getContentPane().add(jBE);
        jBE.setBounds(720, 550, 70, 60);

        jBY.setText("Y");
        jBY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBYActionPerformed(evt);
            }
        });
        getContentPane().add(jBY);
        jBY.setBounds(930, 550, 70, 60);

        jBuU.setText("U");
        jBuU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuUActionPerformed(evt);
            }
        });
        getContentPane().add(jBuU);
        jBuU.setBounds(1000, 550, 70, 60);

        jBI.setText("I");
        jBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIActionPerformed(evt);
            }
        });
        getContentPane().add(jBI);
        jBI.setBounds(1070, 550, 70, 60);

        jBO.setText("O");
        jBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOActionPerformed(evt);
            }
        });
        getContentPane().add(jBO);
        jBO.setBounds(1140, 550, 70, 60);

        jBP.setText("P");
        jBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPActionPerformed(evt);
            }
        });
        getContentPane().add(jBP);
        jBP.setBounds(1210, 550, 70, 60);

        jBA.setText("A");
        jBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAActionPerformed(evt);
            }
        });
        getContentPane().add(jBA);
        jBA.setBounds(600, 620, 70, 60);

        jBS.setText("S");
        jBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSActionPerformed(evt);
            }
        });
        getContentPane().add(jBS);
        jBS.setBounds(650, 620, 70, 60);

        jBD.setText("D");
        jBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDActionPerformed(evt);
            }
        });
        getContentPane().add(jBD);
        jBD.setBounds(710, 620, 70, 60);

        jBF.setText("F");
        jBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFActionPerformed(evt);
            }
        });
        getContentPane().add(jBF);
        jBF.setBounds(770, 620, 70, 60);

        jBG.setText("G");
        jBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGActionPerformed(evt);
            }
        });
        getContentPane().add(jBG);
        jBG.setBounds(830, 620, 70, 60);

        jBH.setText("H");
        jBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHActionPerformed(evt);
            }
        });
        getContentPane().add(jBH);
        jBH.setBounds(890, 620, 70, 60);

        jBJ.setText("J");
        jBJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJActionPerformed(evt);
            }
        });
        getContentPane().add(jBJ);
        jBJ.setBounds(960, 620, 70, 60);

        jBK.setText("K");
        jBK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKActionPerformed(evt);
            }
        });
        getContentPane().add(jBK);
        jBK.setBounds(1030, 620, 70, 60);

        jBL.setText("L");
        jBL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLActionPerformed(evt);
            }
        });
        getContentPane().add(jBL);
        jBL.setBounds(1100, 620, 70, 60);

        jBZ.setText("Z");
        jBZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBZActionPerformed(evt);
            }
        });
        getContentPane().add(jBZ);
        jBZ.setBounds(600, 690, 70, 60);

        jBX.setText("X");
        jBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBXActionPerformed(evt);
            }
        });
        getContentPane().add(jBX);
        jBX.setBounds(670, 690, 70, 60);

        jBC.setText("C");
        jBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCActionPerformed(evt);
            }
        });
        getContentPane().add(jBC);
        jBC.setBounds(740, 690, 70, 60);

        jBV.setText("V");
        jBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVActionPerformed(evt);
            }
        });
        getContentPane().add(jBV);
        jBV.setBounds(800, 690, 70, 60);

        jBB.setText("B");
        jBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBActionPerformed(evt);
            }
        });
        getContentPane().add(jBB);
        jBB.setBounds(870, 690, 70, 60);

        jBN.setText("N");
        jBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNActionPerformed(evt);
            }
        });
        getContentPane().add(jBN);
        jBN.setBounds(930, 690, 70, 60);

        jBM.setText("M");
        jBM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMActionPerformed(evt);
            }
        });
        getContentPane().add(jBM);
        jBM.setBounds(990, 690, 70, 60);

        jBESPACIO.setText("ESPACIO");
        jBESPACIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBESPACIOActionPerformed(evt);
            }
        });
        getContentPane().add(jBESPACIO);
        jBESPACIO.setBounds(800, 770, 260, 60);

        jBÑ.setText("Ñ");
        jBÑ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBÑActionPerformed(evt);
            }
        });
        getContentPane().add(jBÑ);
        jBÑ.setBounds(1170, 620, 70, 60);

        jBR.setText("R");
        jBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRActionPerformed(evt);
            }
        });
        getContentPane().add(jBR);
        jBR.setBounds(790, 550, 70, 60);

        JLB_MOSTRAR.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        JLB_MOSTRAR.setForeground(new java.awt.Color(255, 255, 255));
        JLB_MOSTRAR.setText("La Letra Selecciona es:");
        getContentPane().add(JLB_MOSTRAR);
        JLB_MOSTRAR.setBounds(600, 480, 210, 60);

        jBENTER.setForeground(new java.awt.Color(255, 255, 255));
        jBENTER.setText("ENTER");
        jBENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBENTERActionPerformed(evt);
            }
        });
        getContentPane().add(jBENTER);
        jBENTER.setBounds(1060, 690, 200, 60);

        JLB_LETRA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLB_LETRA.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(JLB_LETRA);
        JLB_LETRA.setBounds(810, 490, 70, 40);

        JLB_LINEAS.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        JLB_LINEAS.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(JLB_LINEAS);
        JLB_LINEAS.setBounds(800, 390, 460, 90);

        lbltime.setBackground(new java.awt.Color(51, 51, 0));
        lbltime.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbltime.setForeground(new java.awt.Color(204, 255, 255));
        lbltime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltime.setText("TIME");
        lbltime.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 51)));
        getContentPane().add(lbltime);
        lbltime.setBounds(70, 170, 100, 40);

        JLBINICIAR.setText("Iniciar");
        JLBINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLBINICIARActionPerformed(evt);
            }
        });
        getContentPane().add(JLBINICIAR);
        JLBINICIAR.setBounds(360, 180, 110, 30);

        lblSegundo.setBackground(new java.awt.Color(255, 255, 255));
        lblSegundo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblSegundo.setForeground(new java.awt.Color(255, 255, 255));
        lblSegundo.setText("     00");
        lblSegundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        getContentPane().add(lblSegundo);
        lblSegundo.setBounds(170, 170, 150, 40);

        jblfondo_de_tiempo.setBackground(new java.awt.Color(255, 255, 255));
        jblfondo_de_tiempo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jblfondo_de_tiempo);
        jblfondo_de_tiempo.setBounds(60, 120, 420, 660);

        JLB_OPORTUNIDADES.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 14)); // NOI18N
        JLB_OPORTUNIDADES.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(JLB_OPORTUNIDADES);
        JLB_OPORTUNIDADES.setBounds(480, 120, 160, 130);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        label1.setText("RESEÑA");
        getContentPane().add(label1);
        label1.setBounds(80, 80, 360, 40);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell E6420\\Desktop\\IMAGENES PROPUESTAS\\pa.gif")); // NOI18N
        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(1330, 10, 200, 200);

        jbl_registrar.setText("REGISTRARSE");
        jbl_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbl_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbl_registrar);
        jbl_registrar.setBounds(1350, 250, 110, 40);

        jbn_resultado.setText("RESULTADOS");
        getContentPane().add(jbn_resultado);
        jbn_resultado.setBounds(1360, 330, 100, 40);

        jButton4.setText("SALIR");
        getContentPane().add(jButton4);
        jButton4.setBounds(1380, 590, 100, 40);

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Biting My Nails", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RETO DAGB");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5);
        jLabel5.setBounds(660, 20, 390, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("00");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 170, 70, 40);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell E6420\\Desktop\\IMAGENES PROPUESTAS\\GzAPrt.jpg")); // NOI18N
        jLabel1.setText("ll");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -190, 1510, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTActionPerformed
JLB_LETRA.setText("");
        letra="t";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBTActionPerformed

    private void jBQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQActionPerformed
    JLB_LETRA.setText("");
        letra="q";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBQActionPerformed

    private void jBWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBWActionPerformed
        JLB_LETRA.setText("");
        letra="w";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBWActionPerformed

    private void jBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEActionPerformed
       JLB_LETRA.setText("");
        letra="e";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBEActionPerformed

    private void jBYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBYActionPerformed
        JLB_LETRA.setText("");
        letra="y";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBYActionPerformed

    private void jBuUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuUActionPerformed
       JLB_LETRA.setText("");
        letra="u";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBuUActionPerformed

    private void jBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIActionPerformed
        JLB_LETRA.setText("");
        letra="i";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBIActionPerformed

    private void jBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOActionPerformed
       JLB_LETRA.setText("");
        letra="o";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBOActionPerformed

    private void jBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPActionPerformed
       JLB_LETRA.setText("");
        letra="p";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBPActionPerformed

    private void jBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAActionPerformed
      JLB_LETRA.setText("");
        letra="a";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBAActionPerformed

    private void jBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSActionPerformed
        JLB_LETRA.setText("");
        letra="s";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBSActionPerformed

    private void jBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDActionPerformed
        JLB_LETRA.setText("");
        letra="d";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBDActionPerformed

    private void jBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFActionPerformed
        JLB_LETRA.setText("");
        letra="f";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBFActionPerformed

    private void jBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGActionPerformed
       JLB_LETRA.setText("");
        letra="g";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBGActionPerformed

    private void jBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHActionPerformed
        JLB_LETRA.setText("");
        letra="h";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBHActionPerformed

    private void jBJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJActionPerformed
        JLB_LETRA.setText("");
        letra="j";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBJActionPerformed

    private void jBKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKActionPerformed
      JLB_LETRA.setText("");
        letra="k";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBKActionPerformed

    private void jBLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLActionPerformed
       JLB_LETRA.setText("");
        letra="l";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBLActionPerformed

    private void jBZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBZActionPerformed
        JLB_LETRA.setText("");
        letra="z";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBZActionPerformed

    private void jBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBXActionPerformed
        JLB_LETRA.setText("");
        letra="x";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBXActionPerformed

    private void jBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCActionPerformed
       JLB_LETRA.setText("");
        letra="c";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBCActionPerformed

    private void jBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVActionPerformed
      JLB_LETRA.setText("");
        letra="v";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBVActionPerformed

    private void jBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBActionPerformed
        JLB_LETRA.setText("");
        letra="b";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBBActionPerformed

    private void jBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNActionPerformed
       JLB_LETRA.setText("");
        letra="n";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBNActionPerformed

    private void jBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMActionPerformed
      JLB_LETRA.setText("");
        letra="m";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBMActionPerformed

    private void jBESPACIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBESPACIOActionPerformed
       JLB_LETRA.setText("");
        letra=" ";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBESPACIOActionPerformed

    private void jBÑActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBÑActionPerformed
        JLB_LETRA.setText("");
        letra="ñ";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBÑActionPerformed

    private void jBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRActionPerformed
        JLB_LETRA.setText("");
        letra="r";
      JLB_LETRA.setText(letra);
    }//GEN-LAST:event_jBRActionPerformed

    private void jBENTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBENTERActionPerformed
        System.out.println("palabra del Enter:  "+palabra);
        boolean resultado=palabra.contains(letra);
            if(resultado){
               System.out.println("correcto");
               
               
        }else{
            System.out.println("incorrecto");
            if(contador==1){
            jblfondo_de_tiempo.setText("");
             String ContadoString=Integer.toString(contador);
                JLB_OPORTUNIDADES.setText(ContadoString+"/ 6");
                String patch=("C:\\Users\\Dell E6420\\Desktop\\AHORCADO_2.0\\src\\imagenes\\01.jpg");
                ImageIcon icon=new ImageIcon(patch);
                jblfondo_de_tiempo.setIcon(icon);
                contador=contador+1;
            } else if(contador==2){
           jblfondo_de_tiempo.setText("");
            String ContadoString=Integer.toString(contador);
                JLB_OPORTUNIDADES.setText(ContadoString+"/ 6");
            String patch=("C:\\Users\\Dell E6420\\Desktop\\AHORCADO_2.0\\src\\imagenes\\02.jpg");
                ImageIcon icon=new ImageIcon(patch);
                jblfondo_de_tiempo.setIcon(icon);
                contador=contador+1;
            }else if(contador==3){
           jblfondo_de_tiempo.setText("");
            String ContadoString=Integer.toString(contador);
                JLB_OPORTUNIDADES.setText(ContadoString+"/ 6");
            String patch=("C:\\Users\\Dell E6420\\Desktop\\AHORCADO_2.0\\src\\imagenes\\03.jpg");
                ImageIcon icon=new ImageIcon(patch);
                jblfondo_de_tiempo.setIcon(icon);
                contador=contador+1;    
            }else if(contador==4){
           jblfondo_de_tiempo.setText("");
            String ContadoString=Integer.toString(contador);
                JLB_OPORTUNIDADES.setText(ContadoString+"/ 6");
            String patch=("C:\\Users\\Dell E6420\\Desktop\\AHORCADO_2.0\\src\\imagenes\\04.jpg");
                ImageIcon icon=new ImageIcon(patch);
                jblfondo_de_tiempo.setIcon(icon);
                contador=contador+1;
            }
            else if(contador==5){
           jblfondo_de_tiempo.setText("");
            String ContadoString=Integer.toString(contador);
                JLB_OPORTUNIDADES.setText(ContadoString+"/ 6");
            String patch=("C:\\Users\\Dell E6420\\Desktop\\AHORCADO_2.0\\src\\imagenes\\06.jpg");
                ImageIcon icon=new ImageIcon(patch);
                jblfondo_de_tiempo.setIcon(icon);
                contador=contador+1;
                
            }else if(contador==6){
           jblfondo_de_tiempo.setText("");
            String ContadoString=Integer.toString(contador);
                JLB_OPORTUNIDADES.setText(ContadoString+"/ 6");
            String patch=("C:\\Users\\Dell E6420\\Desktop\\AHORCADO_2.0\\src\\imagenes\\05.jpg");
                ImageIcon icon=new ImageIcon(patch);
                jblfondo_de_tiempo.setIcon(icon);
                contador=contador+1;
            }}
    }//GEN-LAST:event_jBENTERActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
Random datos=new Random();
    int numero = datos.nextInt(193);
 System.out.println(numero);
 switch(numero){
 case 1:System.out.println("agua"); palabra="agua"; break;
case 2:System.out.println("amigo"); palabra="amigo"; break;
case 3:System.out.println("año"); palabra="año"; break;
case 4:System.out.println("cabeza"); palabra="cabeza"; break;
case 5:System.out.println("calle"); palabra="calle"; break;
case 6:System.out.println("casa"); palabra="casa"; break;
case 7:System.out.println("ciudad"); palabra="ciudad"; break;
case 8:System.out.println("clase"); palabra="clase"; break;
case 9:System.out.println("color"); palabra="color"; break;
case 10:System.out.println("cosa"); palabra="cosa"; break;
case 11:System.out.println("cuerpo"); palabra="cuerpo"; break;
case 12:System.out.println("día"); palabra="día"; break;
case 13:System.out.println("dinero"); palabra="dinero"; break;
case 14:System.out.println("ejemplo"); palabra="ejemplo"; break;
case 15:System.out.println("escuela"); palabra="escuela"; break;
case 16:System.out.println("familia"); palabra="familia"; break;
case 17:System.out.println("fin"); palabra="fin"; break;
case 18:System.out.println("frente"); palabra="frente"; break;
case 19:System.out.println("gente"); palabra="gente"; break;
case 20:System.out.println("hermano"); palabra="hermano"; break;
case 21:System.out.println("hijo"); palabra="hijo"; break;
case 22:System.out.println("historia"); palabra="historia"; break;
case 23:System.out.println("hombre"); palabra="hombre"; break;
case 24:System.out.println("hora"); palabra="hora"; break;
case 25:System.out.println("idea"); palabra="idea"; break;
case 26:System.out.println("joven "); palabra="joven "; break;
case 27:System.out.println("lado"); palabra="lado"; break;
case 28:System.out.println("libro"); palabra="libro"; break;
case 29:System.out.println("lugar"); palabra="lugar"; break;
case 30:System.out.println("madre"); palabra="madre"; break;
case 31:System.out.println("manera"); palabra="manera"; break;
case 32:System.out.println("mano"); palabra="mano"; break;
case 33:System.out.println("mes"); palabra="mes"; break;
case 34:System.out.println("mesa"); palabra="mesa"; break;
case 35:System.out.println("minuto"); palabra="minuto"; break;
case 36:System.out.println("mujer"); palabra="mujer"; break;
case 37:System.out.println("mundo"); palabra="mundo"; break;
case 38:System.out.println("música"); palabra="música"; break;
case 39:System.out.println("niño"); palabra="niño"; break;
case 40:System.out.println("noche"); palabra="noche"; break;
case 41:System.out.println("nombre"); palabra="nombre"; break;
case 42:System.out.println("número"); palabra="número"; break;
case 43:System.out.println("ojo"); palabra="ojo"; break;
case 44:System.out.println("padre"); palabra="padre"; break;
case 45:System.out.println("país"); palabra="país"; break;
case 46:System.out.println("palabra"); palabra="palabra"; break;
case 47:System.out.println("papel"); palabra="papel"; break;
case 48:System.out.println("parte "); palabra="parte "; break;
case 49:System.out.println("persona"); palabra="persona"; break;
case 50:System.out.println("pie"); palabra="pie"; break;
case 51:System.out.println("pregunta"); palabra="pregunta"; break;
case 52:System.out.println("problema"); palabra="problema"; break;
case 53:System.out.println("pueblo"); palabra="pueblo"; break;
case 54:System.out.println("puerta"); palabra="puerta"; break;
case 55:System.out.println("semana"); palabra="semana"; break;
case 56:System.out.println("señor"); palabra="señor"; break;
case 57:System.out.println("tarde"); palabra="tarde"; break;
case 58:System.out.println("tarea"); palabra="tarea"; break;
case 59:System.out.println("tiempo"); palabra="tiempo"; break;
case 60:System.out.println("tipo"); palabra="tipo"; break;
case 61:System.out.println("trabajo"); palabra="trabajo"; break;
case 62:System.out.println("verdad"); palabra="verdad"; break;
case 63:System.out.println("vez"); palabra="vez"; break;
case 64:System.out.println("vida"); palabra="vida"; break;
case 66:System.out.println("alto"); palabra="alto"; break;
case 67:System.out.println("blanco"); palabra="blanco"; break;
case 68:System.out.println("bueno"); palabra="bueno"; break;
case 69:System.out.println("cada"); palabra="cada"; break;
case 70:System.out.println("claro"); palabra="claro"; break;
case 71:System.out.println("difícil"); palabra="difícil"; break;
case 72:System.out.println("ese"); palabra="ese"; break;
case 73:System.out.println("español"); palabra="español"; break;
case 74:System.out.println("este"); palabra="este"; break;
case 75:System.out.println("grande"); palabra="grande"; break;
case 76:System.out.println("humano"); palabra="humano"; break;
case 77:System.out.println("importante"); palabra="importante"; break;
case 78:System.out.println("largo"); palabra="largo"; break;
case 79:System.out.println("malo"); palabra="malo"; break;
case 80:System.out.println("más"); palabra="más"; break;
case 81:System.out.println("mejor"); palabra="mejor"; break;
case 82:System.out.println("menos"); palabra="menos"; break;
case 83:System.out.println("mi"); palabra="mi"; break;
case 84:System.out.println("mucho"); palabra="mucho"; break;
case 85:System.out.println("nuestro"); palabra="nuestro"; break;
case 86:System.out.println("nuevo"); palabra="nuevo"; break;
case 87:System.out.println("otro"); palabra="otro"; break;
case 88:System.out.println("pequeño"); palabra="pequeño"; break;
case 89:System.out.println("poco"); palabra="poco"; break;
case 90:System.out.println("primero"); palabra="primero"; break;
case 91:System.out.println("segundo"); palabra="segundo"; break;
case 92:System.out.println("solo"); palabra="solo"; break;
case 93:System.out.println("su"); palabra="su"; break;
case 94:System.out.println("todo"); palabra="todo"; break;
case 95:System.out.println("viejo"); palabra="viejo"; break;
case 96:System.out.println("abrir"); palabra="abrir"; break;
case 97:System.out.println("andar"); palabra="andar"; break;
case 98:System.out.println("aprender"); palabra="aprender"; break;
case 99:System.out.println("ayudar"); palabra="ayudar"; break;
case 100:System.out.println("buscar"); palabra="buscar"; break;
case 101:System.out.println("comer"); palabra="comer"; break;
case 102:System.out.println("comprar"); palabra="comprar"; break;
case 103:System.out.println("comprender"); palabra="comprender"; break;
case 104:System.out.println("conocer"); palabra="conocer"; break;
case 105:System.out.println("contar"); palabra="contar"; break;
case 106:System.out.println("correr"); palabra="correr"; break;
case 107:System.out.println("dar"); palabra="dar"; break;
case 108:System.out.println("decidir"); palabra="decidir"; break;
case 109:System.out.println("decir"); palabra="decir"; break;
case 110:System.out.println("empezar"); palabra="empezar"; break;
case 111:System.out.println("encontrar"); palabra="encontrar"; break;
case 112:System.out.println("enseñar"); palabra="enseñar"; break;
case 113:System.out.println("entender"); palabra="entender"; break;
case 114:System.out.println("entrar"); palabra="entrar"; break;
case 115:System.out.println("escribir"); palabra="escribir"; break;
case 116:System.out.println("escuchar"); palabra="escuchar"; break;
case 117:System.out.println("estar"); palabra="estar"; break;
case 118:System.out.println("estudiar"); palabra="estudiar"; break;
case 119:System.out.println("ganar"); palabra="ganar"; break;
case 120:System.out.println("gustar"); palabra="gustar"; break;
case 121:System.out.println("hablar"); palabra="hablar"; break;
case 122:System.out.println("hacer"); palabra="hacer"; break;
case 123:System.out.println("ir"); palabra="ir"; break;
case 124:System.out.println("jugar"); palabra="jugar"; break;
case 125:System.out.println("leer"); palabra="leer"; break;
case 126:System.out.println("levantar"); palabra="levantar"; break;
case 127:System.out.println("llamar"); palabra="llamar"; break;
case 128:System.out.println("llegar"); palabra="llegar"; break;
case 129:System.out.println("llevar"); palabra="llevar"; break;
case 130:System.out.println("mirar"); palabra="mirar"; break;
case 131:System.out.println("necesitar"); palabra="necesitar"; break;
case 132:System.out.println("olvidar"); palabra="olvidar"; break;
case 133:System.out.println("pagar"); palabra="pagar"; break;
case 134:System.out.println("parecer"); palabra="parecer"; break;
case 135:System.out.println("pasar"); palabra="pasar"; break;
case 136:System.out.println("pedir"); palabra="pedir"; break;
case 137:System.out.println("pensar"); palabra="pensar"; break;
case 138:System.out.println("perder"); palabra="perder"; break;
case 139:System.out.println("poder"); palabra="poder"; break;
case 140:System.out.println("poner"); palabra="poner"; break;
case 141:System.out.println("preferir"); palabra="preferir"; break;
case 142:System.out.println("preguntar"); palabra="preguntar"; break;
case 143:System.out.println("querer"); palabra="querer"; break;
case 144:System.out.println("recibir"); palabra="recibir"; break;
case 145:System.out.println("recordar"); palabra="recordar"; break;
case 146:System.out.println("saber"); palabra="saber"; break;
case 147:System.out.println("sacar"); palabra="sacar"; break;
case 148:System.out.println("salir"); palabra="salir"; break;
case 149:System.out.println("ser"); palabra="ser"; break;
case 150:System.out.println("tener"); palabra="tener"; break;
case 151:System.out.println("tocar"); palabra="tocar"; break;
case 152:System.out.println("tomar"); palabra="tomar"; break;
case 153:System.out.println("trabajar"); palabra="trabajar"; break;
case 154:System.out.println("vender"); palabra="vender"; break;
case 155:System.out.println("venir"); palabra="venir"; break;
case 156:System.out.println("ver"); palabra="ver"; break;
case 157:System.out.println("vivir"); palabra="vivir"; break;
case 158:System.out.println("volver"); palabra="volver"; break;
case 159:System.out.println(""); palabra="0"; break;
case 160:System.out.println("adelante"); palabra="adelante"; break;
case 161:System.out.println("ahora"); palabra="ahora"; break;
case 162:System.out.println("allá"); palabra="allá"; break;
case 163:System.out.println("allí"); palabra="allí"; break;
case 164:System.out.println("antes"); palabra="antes"; break;
case 165:System.out.println("aquí"); palabra="aquí"; break;
case 166:System.out.println("arriba"); palabra="arriba"; break;
case 167:System.out.println("así"); palabra="así"; break;
case 168:System.out.println("atrás"); palabra="atrás"; break;
case 169:System.out.println("bien"); palabra="bien"; break;
case 170:System.out.println("casi"); palabra="casi"; break;
case 171:System.out.println("cerca"); palabra="cerca"; break;
case 172:System.out.println("claro"); palabra="claro"; break;
case 173:System.out.println("después"); palabra="después"; break;
case 174:System.out.println("dónde"); palabra="dónde"; break;
case 175:System.out.println("durante"); palabra="durante"; break;
case 176:System.out.println("encima"); palabra="encima"; break;
case 177:System.out.println("entonces"); palabra="entonces"; break;
case 178:System.out.println("fuera"); palabra="fuera"; break;
case 179:System.out.println("hoy"); palabra="hoy"; break;
case 180:System.out.println("lejos"); palabra="lejos"; break;
case 181:System.out.println("luego"); palabra="luego"; break;
case 182:System.out.println("mal"); palabra="mal"; break;
case 183:System.out.println("muy"); palabra="muy"; break;
case 184:System.out.println("nunca"); palabra="nunca"; break;
case 185:System.out.println("pronto"); palabra="pronto"; break;
case 186:System.out.println("realmente"); palabra="realmente"; break;
case 187:System.out.println("si"); palabra="si"; break;
case 188:System.out.println("siempre"); palabra="siempre"; break;
case 189:System.out.println("solamente"); palabra="solamente"; break;
case 190:System.out.println("solo"); palabra="solo"; break;
case 191:System.out.println("también"); palabra="también"; break;
case 192:System.out.println("todavía"); palabra="todavía"; break;
case 193:System.out.println("ya"); palabra="ya"; break;  }
 palabraint=palabra.length();
        System.out.println("La paralabra seleccionada es: "+palabra);    
        for(int i=0;i<=palabraint;i++){
            JLB_LINEAS.setText("_ "+JLB_LINEAS.getText());
            System.out.println(palabraint);
        }
    }//GEN-LAST:event_formWindowOpened

    private void JLBINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLBINICIARActionPerformed
      for (int minuto=0;minuto<=60;minuto++){
       
         for (int segundo=0;segundo<=60;segundo++){
             try {
                 
                 
                 Thread.sleep(1*1000);
             } catch (InterruptedException e) {
                 
             }
         lblSegundo.setText("");
         String seguntoString=Integer.toString(segundo);
          
         String minutoString=Integer.toString(minuto);
          lblSegundo.setText(minutoString+""+seguntoString);
          System.out.println(minutoString+""+seguntoString);
         }
       
    }

    
    }//GEN-LAST:event_JLBINICIARActionPerformed

    private void jbl_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbl_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbl_registrarActionPerformed


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
            java.util.logging.Logger.getLogger(AHORCADO_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AHORCADO_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AHORCADO_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AHORCADO_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AHORCADO_INTERFACE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JLBINICIAR;
    private javax.swing.JLabel JLB_LETRA;
    private javax.swing.JLabel JLB_LINEAS;
    private javax.swing.JLabel JLB_MOSTRAR;
    private javax.swing.JLabel JLB_OPORTUNIDADES;
    private javax.swing.JButton jBA;
    private javax.swing.JButton jBB;
    private javax.swing.JButton jBC;
    private javax.swing.JButton jBD;
    private javax.swing.JButton jBE;
    private javax.swing.JButton jBENTER;
    private javax.swing.JButton jBESPACIO;
    private javax.swing.JButton jBF;
    private javax.swing.JButton jBG;
    private javax.swing.JButton jBH;
    private javax.swing.JButton jBI;
    private javax.swing.JButton jBJ;
    private javax.swing.JButton jBK;
    private javax.swing.JButton jBL;
    private javax.swing.JButton jBM;
    private javax.swing.JButton jBN;
    private javax.swing.JButton jBO;
    private javax.swing.JButton jBP;
    private javax.swing.JButton jBQ;
    private javax.swing.JButton jBR;
    private javax.swing.JButton jBS;
    private javax.swing.JButton jBT;
    private javax.swing.JButton jBV;
    private javax.swing.JButton jBW;
    private javax.swing.JButton jBX;
    private javax.swing.JButton jBY;
    private javax.swing.JButton jBZ;
    private javax.swing.JButton jBuU;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jBÑ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbl_registrar;
    private javax.swing.JLabel jblfondo_de_tiempo;
    private javax.swing.JButton jbn_resultado;
    private java.awt.Label label1;
    private javax.swing.JLabel lblSegundo;
    private javax.swing.JLabel lbltime;
    // End of variables declaration//GEN-END:variables

