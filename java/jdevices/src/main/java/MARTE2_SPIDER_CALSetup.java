/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdsplus
 */
public class MARTE2_SPIDER_CALSetup extends DeviceSetup {

    /**
     * Creates new form MARTE2_SPIDER_CALSetup
     */
    public MARTE2_SPIDER_CALSetup() {
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
        jPanel3 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        deviceField2 = new DeviceField();
        jPanel4 = new javax.swing.JPanel();
        deviceField3 = new DeviceField();
        deviceField4 = new DeviceField();
        deviceField5 = new DeviceField();
        deviceInputs1 = new DeviceInputs();

        setDeviceProvider("spilds:8100");
        setDeviceTitle("MARTe2 Spider Calorimeter");
        setDeviceType("MARTE2_SPIDER_CAL");
        setHeight(300);
        setUpdateEvent("");
        setWidth(500);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Period");
        deviceField1.setOffsetNid(7);
        jPanel3.add(deviceField1);

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Timebase: ");
        deviceField2.setNumCols(25);
        deviceField2.setOffsetNid(3);
        jPanel3.add(deviceField2);

        jPanel2.add(jPanel3);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Out trigger: ");
        deviceField3.setNumCols(25);
        deviceField3.setOffsetNid(598);
        jPanel4.add(deviceField3);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Pre samples: ");
        deviceField4.setOffsetNid(599);
        jPanel4.add(deviceField4);

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("Post samples: ");
        deviceField5.setOffsetNid(600);
        jPanel4.add(deviceField5);

        jPanel2.add(jPanel4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        deviceInputs1.setOffsetNid(8);
        getContentPane().add(deviceInputs1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceField deviceField1;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceInputs deviceInputs1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
