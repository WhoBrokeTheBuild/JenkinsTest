/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdsplus
 */
public class RFX_RPDACSetup extends DeviceSetup {

    /**
     * Creates new form RFX_RPDACSetup
     */
    public RFX_RPDACSetup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceButtons1 = new DeviceButtons();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        deviceField6 = new DeviceField();
        deviceDispatch1 = new DeviceDispatch();
        jPanel6 = new javax.swing.JPanel();
        deviceChoice1 = new DeviceChoice();
        deviceChoice2 = new DeviceChoice();
        jPanel5 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        deviceField7 = new DeviceField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        jPanel8 = new javax.swing.JPanel();
        deviceField3 = new DeviceField();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        deviceField4 = new DeviceField();
        jPanel11 = new javax.swing.JPanel();
        deviceField5 = new DeviceField();

        setDeviceProvider("localhost:8100");
        setDeviceTitle("RedPitaya DAC");
        setDeviceType("RFX_RPDAC");
        setHeight(400);
        setWidth(600);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Comment: ");
        deviceField6.setNumCols(20);
        deviceField6.setOffsetNid(1);
        jPanel4.add(deviceField6);
        jPanel4.add(deviceDispatch1);

        jPanel2.add(jPanel4);

        deviceChoice1.setChoiceItems(new String[] {"INTERNAL", "EXTERNAL"});
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("Clock Mode");
        deviceChoice1.setOffsetNid(3);
        deviceChoice1.setUpdateIdentifier("");
        jPanel6.add(deviceChoice1);

        deviceChoice2.setChoiceItems(new String[] {"INTERNAL", "EXTERNAL"});
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("Trig. Mode: ");
        deviceChoice2.setOffsetNid(4);
        deviceChoice2.setUpdateIdentifier("");
        jPanel6.add(deviceChoice2);

        jPanel2.add(jPanel6);

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Clock Freq.");
        deviceField1.setNumCols(15);
        deviceField1.setOffsetNid(2);
        jPanel5.add(deviceField1);

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("Trig. Time");
        deviceField7.setNumCols(15);
        deviceField7.setOffsetNid(5);
        jPanel5.add(deviceField7);

        jPanel2.add(jPanel5);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Channnel 1"));
        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("X Values");
        deviceField2.setNumCols(30);
        deviceField2.setOffsetNid(6);
        jPanel7.add(deviceField2);

        jPanel3.add(jPanel7);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Y Values: ");
        deviceField3.setNumCols(30);
        deviceField3.setOffsetNid(7);
        jPanel8.add(deviceField3);

        jPanel3.add(jPanel8);

        jPanel1.add(jPanel3);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Channnel 2"));
        jPanel9.setLayout(new java.awt.GridLayout(2, 1));

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("X Values");
        deviceField4.setNumCols(30);
        deviceField4.setOffsetNid(8);
        jPanel10.add(deviceField4);

        jPanel9.add(jPanel10);

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("Y Values: ");
        deviceField5.setNumCols(30);
        deviceField5.setOffsetNid(9);
        jPanel11.add(deviceField5);

        jPanel9.add(jPanel11);

        jPanel1.add(jPanel9);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
    private DeviceChoice deviceChoice2;
    private DeviceDispatch deviceDispatch1;
    private DeviceField deviceField1;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
