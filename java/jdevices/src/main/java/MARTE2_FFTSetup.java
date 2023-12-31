/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manduchi
 */
public class MARTE2_FFTSetup extends DeviceSetup
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form MARTE2_FFTSetup
	 */
	public MARTE2_FFTSetup()
	{
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceButtons1 = new DeviceButtons();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        deviceField5 = new DeviceField();
        jPanel6 = new javax.swing.JPanel();
        deviceField4 = new DeviceField();
        deviceChoice2 = new DeviceChoice();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        deviceField6 = new DeviceField();
        jPanel4 = new javax.swing.JPanel();
        deviceField3 = new DeviceField();

        setDeviceProvider("spilds:8100");
        setDeviceTitle("MARTe2 FFT GAM");
        setDeviceType("MARTE2_FFT");
        setHeight(300);
        setWidth(800);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Num. Samples");
        deviceField1.setNumCols(4);
        deviceField1.setOffsetNid(7);
        jPanel5.add(deviceField1);

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("MdsWriter CPU Mask: ");
        deviceField5.setNumCols(4);
        deviceField5.setOffsetNid(22);
        jPanel5.add(deviceField5);

        jPanel2.add(jPanel5);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Out Segment len (0 to disable writing in tree):");
        deviceField4.setNumCols(5);
        deviceField4.setOffsetNid(28);
        jPanel6.add(deviceField4);

        deviceChoice2.setChoiceItems(new String[] {"int16", "int32", "float32", "float64"});
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("Input type: ");
        deviceChoice2.setOffsetNid(10);
        deviceChoice2.setUpdateIdentifier("");
        jPanel6.add(deviceChoice2);

        jPanel2.add(jPanel6);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Timebase: ");
        deviceField2.setNumCols(35);
        deviceField2.setOffsetNid(3);
        jPanel3.add(deviceField2);

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Timebase div:");
        deviceField6.setNumCols(4);
        deviceField6.setOffsetNid(41);
        jPanel3.add(deviceField6);

        jPanel1.add(jPanel3);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Input");
        deviceField3.setNumCols(35);
        deviceField3.setOffsetNid(13);
        jPanel4.add(deviceField3);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice2;
    private DeviceField deviceField1;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
