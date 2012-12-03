/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carclassifier;

/**
 *
 * @author Danny Ng
 */
public class gui extends javax.swing.JFrame {
    private CarClassifier carClassifier;
    private String [] carDetails;
    
    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
        carClassifier = new CarClassifier();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        vehicleLabel = new javax.swing.JLabel();
        manufacturerComboBox = new javax.swing.JComboBox();
        manufacturerLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        hpLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        doorsLabel = new javax.swing.JLabel();
        seatLabel = new javax.swing.JLabel();
        seatValue = new javax.swing.JLabel();
        doorsValue = new javax.swing.JLabel();
        weightValue = new javax.swing.JLabel();
        hpValue = new javax.swing.JLabel();
        priceValue = new javax.swing.JLabel();
        modelValue = new javax.swing.JLabel();
        manufacturerValue = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        classValue = new javax.swing.JLabel();
        modelComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 420));
        setMinimumSize(new java.awt.Dimension(800, 420));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setMaximumSize(new java.awt.Dimension(800, 420));
        mainPanel.setMinimumSize(new java.awt.Dimension(800, 420));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 420));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vehicleLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        vehicleLabel.setText("Vehicle");
        mainPanel.add(vehicleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        manufacturerComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        manufacturerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acura", "Audi" }));
        manufacturerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerComboBoxActionPerformed(evt);
            }
        });
        mainPanel.add(manufacturerComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 280, -1));

        manufacturerLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        manufacturerLabel.setText("Manufacturer");
        mainPanel.add(manufacturerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        modelLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        modelLabel.setText("Model");
        mainPanel.add(modelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        priceLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        priceLabel.setText("Price");
        mainPanel.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        hpLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        hpLabel.setText("HP");
        mainPanel.add(hpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        weightLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        weightLabel.setText("Weight");
        mainPanel.add(weightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        doorsLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        doorsLabel.setText("Doors");
        mainPanel.add(doorsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        seatLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        seatLabel.setText("Seating Capacity");
        mainPanel.add(seatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        seatValue.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        seatValue.setText("5");
        mainPanel.add(seatValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        doorsValue.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        doorsValue.setText("4");
        mainPanel.add(doorsValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        weightValue.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        weightValue.setText("3509");
        mainPanel.add(weightValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        hpValue.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        hpValue.setText("211");
        mainPanel.add(hpValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        priceValue.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        priceValue.setText("32500");
        mainPanel.add(priceValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        modelValue.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        modelValue.setText("A4");
        mainPanel.add(modelValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        manufacturerValue.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        manufacturerValue.setText("Audi");
        mainPanel.add(manufacturerValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        classLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        classLabel.setText("Classification");
        mainPanel.add(classLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        classValue.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        classValue.setText("Luxury Sports Sedan");
        mainPanel.add(classValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        modelComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        modelComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelComboBoxActionPerformed(evt);
            }
        });
        mainPanel.add(modelComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 400, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manufacturerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerComboBoxActionPerformed
        carClassifier.getModels(manufacturerComboBox, modelComboBox);
    }//GEN-LAST:event_manufacturerComboBoxActionPerformed

    private void modelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelComboBoxActionPerformed
        carDetails = new String[carClassifier.getNumberOfCarDetails()];
        carDetails = carClassifier.getCarDetails();
        
        manufacturerValue.setText(carDetails[0]);
        modelValue.setText(carDetails[1]);
        priceValue.setText(carDetails[2]);
        hpValue.setText(carDetails[3]);
        weightValue.setText(carDetails[4]);
        doorsValue.setText(carDetails[5]);
        seatValue.setText(carDetails[6]);
    }//GEN-LAST:event_modelComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel classValue;
    private javax.swing.JLabel doorsLabel;
    private javax.swing.JLabel doorsValue;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JLabel hpValue;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox manufacturerComboBox;
    private javax.swing.JLabel manufacturerLabel;
    private javax.swing.JLabel manufacturerValue;
    private javax.swing.JComboBox modelComboBox;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JLabel modelValue;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceValue;
    private javax.swing.JLabel seatLabel;
    private javax.swing.JLabel seatValue;
    private javax.swing.JLabel vehicleLabel;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JLabel weightValue;
    // End of variables declaration//GEN-END:variables
}
