/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manduchi
 */
public class MARTE2_STREAMSetup extends DeviceSetup
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form MARTE2_STREAMSetup
	 */
	public MARTE2_STREAMSetup()
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

        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        deviceField14 = new DeviceField();
        deviceChoice9 = new DeviceChoice();
        jPanel12 = new javax.swing.JPanel();
        deviceField11 = new DeviceField();
        deviceField12 = new DeviceField();
        deviceField13 = new DeviceField();
        deviceField10 = new DeviceField();
        deviceButtons1 = new DeviceButtons();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        deviceChoice1 = new DeviceChoice();
        deviceField15 = new DeviceField();
        deviceField199 = new DeviceField();
        jPanel4 = new javax.swing.JPanel();
        deviceField3 = new DeviceField();
        deviceChoice2 = new DeviceChoice();
        deviceField16 = new DeviceField();
        deviceField200 = new DeviceField();
        jPanel5 = new javax.swing.JPanel();
        deviceField4 = new DeviceField();
        deviceChoice3 = new DeviceChoice();
        deviceField17 = new DeviceField();
        deviceField201 = new DeviceField();
        jPanel6 = new javax.swing.JPanel();
        deviceField5 = new DeviceField();
        deviceChoice4 = new DeviceChoice();
        deviceField18 = new DeviceField();
        deviceField202 = new DeviceField();
        jPanel7 = new javax.swing.JPanel();
        deviceField6 = new DeviceField();
        deviceChoice5 = new DeviceChoice();
        deviceField19 = new DeviceField();
        deviceField203 = new DeviceField();
        jPanel8 = new javax.swing.JPanel();
        deviceField7 = new DeviceField();
        deviceChoice6 = new DeviceChoice();
        deviceField20 = new DeviceField();
        deviceField204 = new DeviceField();
        jPanel9 = new javax.swing.JPanel();
        deviceField8 = new DeviceField();
        deviceChoice7 = new DeviceChoice();
        deviceField21 = new DeviceField();
        deviceField205 = new DeviceField();
        jPanel10 = new javax.swing.JPanel();
        deviceField9 = new DeviceField();
        deviceChoice8 = new DeviceChoice();
        deviceField22 = new DeviceField();
        deviceField206 = new DeviceField();
        jPanel13 = new javax.swing.JPanel();
        deviceField23 = new DeviceField();
        deviceChoice10 = new DeviceChoice();
        deviceField24 = new DeviceField();
        deviceField207 = new DeviceField();
        jPanel14 = new javax.swing.JPanel();
        deviceField25 = new DeviceField();
        deviceChoice11 = new DeviceChoice();
        deviceField26 = new DeviceField();
        deviceField208 = new DeviceField();
        jPanel15 = new javax.swing.JPanel();
        deviceField27 = new DeviceField();
        deviceChoice12 = new DeviceChoice();
        deviceField28 = new DeviceField();
        deviceField209 = new DeviceField();
        jPanel16 = new javax.swing.JPanel();
        deviceField29 = new DeviceField();
        deviceChoice13 = new DeviceChoice();
        deviceField30 = new DeviceField();
        deviceField210 = new DeviceField();
        jPanel17 = new javax.swing.JPanel();
        deviceField31 = new DeviceField();
        deviceChoice14 = new DeviceChoice();
        deviceField32 = new DeviceField();
        deviceField211 = new DeviceField();
        jPanel18 = new javax.swing.JPanel();
        deviceField33 = new DeviceField();
        deviceChoice15 = new DeviceChoice();
        deviceField34 = new DeviceField();
        deviceField212 = new DeviceField();
        jPanel19 = new javax.swing.JPanel();
        deviceField35 = new DeviceField();
        deviceChoice16 = new DeviceChoice();
        deviceField36 = new DeviceField();
        deviceField213 = new DeviceField();
        jPanel20 = new javax.swing.JPanel();
        deviceField37 = new DeviceField();
        deviceChoice17 = new DeviceChoice();
        deviceField38 = new DeviceField();
        deviceField214 = new DeviceField();

        setDeviceProvider("localhost:8100");
        setDeviceTitle("MARTe2 Stream");
        setDeviceType("MARTE2_STREAM");
        setHeight(500);
        setWidth(900);

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Timebase");
        deviceField1.setNumCols(25);
        deviceField1.setOffsetNid(3);
        jPanel11.add(deviceField1);

        deviceField14.setIdentifier("");
        deviceField14.setLabelString("Timebase div.:");
        deviceField14.setNumCols(4);
        deviceField14.setOffsetNid(1307);
        jPanel11.add(deviceField14);

        deviceChoice9.setChoiceIntValues(new int[] {1, 0});
        deviceChoice9.setChoiceItems(new String[] {"Time Streaming", "Oscilloscope"});
        deviceChoice9.setConvert(true);
        deviceChoice9.setIdentifier("");
        deviceChoice9.setLabelString("Mode: ");
        deviceChoice9.setOffsetNid(16);
        deviceChoice9.setUpdateIdentifier("");
        jPanel11.add(deviceChoice9);

        jPanel2.add(jPanel11);

        deviceField11.setIdentifier("");
        deviceField11.setLabelString("CPU Mask: ");
        deviceField11.setNumCols(4);
        deviceField11.setOffsetNid(19);
        jPanel12.add(deviceField11);

        deviceField12.setIdentifier("");
        deviceField12.setLabelString("Stack size: ");
        deviceField12.setOffsetNid(22);
        jPanel12.add(deviceField12);

        deviceField13.setIdentifier("");
        deviceField13.setLabelString("Num. buffers: ");
        deviceField13.setNumCols(4);
        deviceField13.setOffsetNid(25);
        jPanel12.add(deviceField13);

        deviceField10.setIdentifier("");
        deviceField10.setLabelString("Event Division: ");
        deviceField10.setNumCols(4);
        deviceField10.setOffsetNid(7);
        jPanel12.add(deviceField10);

        jPanel2.add(jPanel12);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);
        jPanel2.getAccessibleContext().setAccessibleName("");

        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(16, 1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 1(Time if TimeStreaming mode)"));

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Value: ");
        deviceField2.setNumCols(35);
        deviceField2.setOffsetNid(31);
        jPanel3.add(deviceField2);

        deviceChoice1.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("Type: ");
        deviceChoice1.setOffsetNid(28);
        deviceChoice1.setUpdateIdentifier("");
        jPanel3.add(deviceChoice1);

        deviceField15.setIdentifier("");
        deviceField15.setLabelString("Channel: ");
        deviceField15.setNumCols(15);
        deviceField15.setOffsetNid(36);
        deviceField15.setTextOnly(true);
        jPanel3.add(deviceField15);

        deviceField199.setIdentifier("");
        deviceField199.setLabelString("Dimensions: ");
        deviceField199.setNumCols(4);
        deviceField199.setOffsetNid(29);
        jPanel3.add(deviceField199);

        jPanel1.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 2"));

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Value: ");
        deviceField3.setNumCols(35);
        deviceField3.setOffsetNid(41);
        jPanel4.add(deviceField3);

        deviceChoice2.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "uint32"});
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("Type: ");
        deviceChoice2.setOffsetNid(38);
        deviceChoice2.setUpdateIdentifier("");
        jPanel4.add(deviceChoice2);

        deviceField16.setIdentifier("");
        deviceField16.setLabelString("Channel: ");
        deviceField16.setNumCols(15);
        deviceField16.setOffsetNid(46);
        deviceField16.setTextOnly(true);
        jPanel4.add(deviceField16);

        deviceField200.setIdentifier("");
        deviceField200.setLabelString("Dimensions: ");
        deviceField200.setNumCols(4);
        deviceField200.setOffsetNid(39);
        jPanel4.add(deviceField200);

        jPanel1.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 3"));

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Value: ");
        deviceField4.setNumCols(35);
        deviceField4.setOffsetNid(51);
        jPanel5.add(deviceField4);

        deviceChoice3.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice3.setIdentifier("");
        deviceChoice3.setLabelString("Type: ");
        deviceChoice3.setOffsetNid(48);
        deviceChoice3.setUpdateIdentifier("");
        jPanel5.add(deviceChoice3);

        deviceField17.setIdentifier("");
        deviceField17.setLabelString("Channel: ");
        deviceField17.setNumCols(15);
        deviceField17.setOffsetNid(56);
        deviceField17.setTextOnly(true);
        jPanel5.add(deviceField17);

        deviceField201.setIdentifier("");
        deviceField201.setLabelString("Dimensions: ");
        deviceField201.setNumCols(4);
        deviceField201.setOffsetNid(49);
        jPanel5.add(deviceField201);

        jPanel1.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 4"));

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("Value: ");
        deviceField5.setNumCols(35);
        deviceField5.setOffsetNid(61);
        jPanel6.add(deviceField5);

        deviceChoice4.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice4.setIdentifier("");
        deviceChoice4.setLabelString("Type: ");
        deviceChoice4.setOffsetNid(58);
        deviceChoice4.setUpdateIdentifier("");
        jPanel6.add(deviceChoice4);

        deviceField18.setIdentifier("");
        deviceField18.setLabelString("Channel: ");
        deviceField18.setNumCols(15);
        deviceField18.setOffsetNid(66);
        deviceField18.setTextOnly(true);
        jPanel6.add(deviceField18);

        deviceField202.setIdentifier("");
        deviceField202.setLabelString("Dimensions: ");
        deviceField202.setNumCols(4);
        deviceField202.setOffsetNid(59);
        jPanel6.add(deviceField202);

        jPanel1.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 5"));

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Value: ");
        deviceField6.setNumCols(35);
        deviceField6.setOffsetNid(71);
        jPanel7.add(deviceField6);

        deviceChoice5.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice5.setIdentifier("");
        deviceChoice5.setLabelString("Type: ");
        deviceChoice5.setOffsetNid(68);
        deviceChoice5.setUpdateIdentifier("");
        jPanel7.add(deviceChoice5);

        deviceField19.setIdentifier("");
        deviceField19.setLabelString("Channel: ");
        deviceField19.setNumCols(15);
        deviceField19.setOffsetNid(76);
        deviceField19.setTextOnly(true);
        jPanel7.add(deviceField19);

        deviceField203.setIdentifier("");
        deviceField203.setLabelString("Dimensions: ");
        deviceField203.setNumCols(4);
        deviceField203.setOffsetNid(69);
        jPanel7.add(deviceField203);

        jPanel1.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 6"));

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("Value: ");
        deviceField7.setNumCols(35);
        deviceField7.setOffsetNid(81);
        jPanel8.add(deviceField7);

        deviceChoice6.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice6.setIdentifier("");
        deviceChoice6.setLabelString("Type: ");
        deviceChoice6.setOffsetNid(68);
        deviceChoice6.setUpdateIdentifier("");
        jPanel8.add(deviceChoice6);

        deviceField20.setIdentifier("");
        deviceField20.setLabelString("Channel: ");
        deviceField20.setNumCols(15);
        deviceField20.setOffsetNid(86);
        deviceField20.setTextOnly(true);
        jPanel8.add(deviceField20);

        deviceField204.setIdentifier("");
        deviceField204.setLabelString("Dimensions: ");
        deviceField204.setNumCols(4);
        deviceField204.setOffsetNid(79);
        jPanel8.add(deviceField204);

        jPanel1.add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 7"));

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("Value: ");
        deviceField8.setNumCols(35);
        deviceField8.setOffsetNid(91);
        jPanel9.add(deviceField8);

        deviceChoice7.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice7.setIdentifier("");
        deviceChoice7.setLabelString("Type: ");
        deviceChoice7.setOffsetNid(88);
        deviceChoice7.setUpdateIdentifier("");
        jPanel9.add(deviceChoice7);

        deviceField21.setIdentifier("");
        deviceField21.setLabelString("Channel: ");
        deviceField21.setNumCols(15);
        deviceField21.setOffsetNid(96);
        deviceField21.setTextOnly(true);
        jPanel9.add(deviceField21);

        deviceField205.setIdentifier("");
        deviceField205.setLabelString("Dimensions: ");
        deviceField205.setNumCols(4);
        deviceField205.setOffsetNid(89);
        jPanel9.add(deviceField205);

        jPanel1.add(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 8"));

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("Value: ");
        deviceField9.setNumCols(35);
        deviceField9.setOffsetNid(101);
        jPanel10.add(deviceField9);

        deviceChoice8.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice8.setIdentifier("");
        deviceChoice8.setLabelString("Type: ");
        deviceChoice8.setOffsetNid(98);
        deviceChoice8.setUpdateIdentifier("");
        jPanel10.add(deviceChoice8);

        deviceField22.setIdentifier("");
        deviceField22.setLabelString("Channel: ");
        deviceField22.setNumCols(15);
        deviceField22.setOffsetNid(106);
        deviceField22.setTextOnly(true);
        jPanel10.add(deviceField22);

        deviceField206.setIdentifier("");
        deviceField206.setLabelString("Dimensions: ");
        deviceField206.setNumCols(4);
        deviceField206.setOffsetNid(99);
        jPanel10.add(deviceField206);

        jPanel1.add(jPanel10);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 9"));

        deviceField23.setIdentifier("");
        deviceField23.setLabelString("Value: ");
        deviceField23.setNumCols(45);
        deviceField23.setOffsetNid(111);
        jPanel13.add(deviceField23);

        deviceChoice10.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice10.setIdentifier("");
        deviceChoice10.setLabelString("Type: ");
        deviceChoice10.setOffsetNid(108);
        deviceChoice10.setUpdateIdentifier("");
        jPanel13.add(deviceChoice10);

        deviceField24.setIdentifier("");
        deviceField24.setLabelString("Channel: ");
        deviceField24.setNumCols(15);
        deviceField24.setOffsetNid(116);
        deviceField24.setTextOnly(true);
        jPanel13.add(deviceField24);

        deviceField207.setIdentifier("");
        deviceField207.setLabelString("Dimensions: ");
        deviceField207.setNumCols(4);
        deviceField207.setOffsetNid(109);
        jPanel13.add(deviceField207);

        jPanel1.add(jPanel13);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 10"));

        deviceField25.setIdentifier("");
        deviceField25.setLabelString("Value: ");
        deviceField25.setNumCols(45);
        deviceField25.setOffsetNid(121);
        jPanel14.add(deviceField25);

        deviceChoice11.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice11.setIdentifier("");
        deviceChoice11.setLabelString("Type: ");
        deviceChoice11.setOffsetNid(118);
        deviceChoice11.setUpdateIdentifier("");
        jPanel14.add(deviceChoice11);

        deviceField26.setIdentifier("");
        deviceField26.setLabelString("Channel: ");
        deviceField26.setNumCols(15);
        deviceField26.setOffsetNid(126);
        deviceField26.setTextOnly(true);
        jPanel14.add(deviceField26);

        deviceField208.setIdentifier("");
        deviceField208.setLabelString("Dimensions: ");
        deviceField208.setNumCols(4);
        deviceField208.setOffsetNid(119);
        jPanel14.add(deviceField208);

        jPanel1.add(jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 11"));

        deviceField27.setIdentifier("");
        deviceField27.setLabelString("Value: ");
        deviceField27.setNumCols(45);
        deviceField27.setOffsetNid(131);
        jPanel15.add(deviceField27);

        deviceChoice12.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice12.setIdentifier("");
        deviceChoice12.setLabelString("Type: ");
        deviceChoice12.setOffsetNid(128);
        deviceChoice12.setUpdateIdentifier("");
        jPanel15.add(deviceChoice12);

        deviceField28.setIdentifier("");
        deviceField28.setLabelString("Channel: ");
        deviceField28.setNumCols(15);
        deviceField28.setOffsetNid(136);
        deviceField28.setTextOnly(true);
        jPanel15.add(deviceField28);

        deviceField209.setIdentifier("");
        deviceField209.setLabelString("Dimensions: ");
        deviceField209.setNumCols(4);
        deviceField209.setOffsetNid(129);
        jPanel15.add(deviceField209);

        jPanel1.add(jPanel15);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 12"));

        deviceField29.setIdentifier("");
        deviceField29.setLabelString("Value: ");
        deviceField29.setNumCols(45);
        deviceField29.setOffsetNid(141);
        jPanel16.add(deviceField29);

        deviceChoice13.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice13.setIdentifier("");
        deviceChoice13.setLabelString("Type: ");
        deviceChoice13.setOffsetNid(138);
        deviceChoice13.setUpdateIdentifier("");
        jPanel16.add(deviceChoice13);

        deviceField30.setIdentifier("");
        deviceField30.setLabelString("Channel: ");
        deviceField30.setNumCols(15);
        deviceField30.setOffsetNid(146);
        deviceField30.setTextOnly(true);
        jPanel16.add(deviceField30);

        deviceField210.setIdentifier("");
        deviceField210.setLabelString("Dimensions: ");
        deviceField210.setNumCols(4);
        deviceField210.setOffsetNid(139);
        jPanel16.add(deviceField210);

        jPanel1.add(jPanel16);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 13"));

        deviceField31.setIdentifier("");
        deviceField31.setLabelString("Value: ");
        deviceField31.setNumCols(45);
        deviceField31.setOffsetNid(151);
        jPanel17.add(deviceField31);

        deviceChoice14.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice14.setIdentifier("");
        deviceChoice14.setLabelString("Type: ");
        deviceChoice14.setOffsetNid(148);
        deviceChoice14.setUpdateIdentifier("");
        jPanel17.add(deviceChoice14);

        deviceField32.setIdentifier("");
        deviceField32.setLabelString("Channel: ");
        deviceField32.setNumCols(15);
        deviceField32.setOffsetNid(156);
        deviceField32.setTextOnly(true);
        jPanel17.add(deviceField32);

        deviceField211.setIdentifier("");
        deviceField211.setLabelString("Dimensions: ");
        deviceField211.setNumCols(4);
        deviceField211.setOffsetNid(149);
        jPanel17.add(deviceField211);

        jPanel1.add(jPanel17);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 14"));

        deviceField33.setIdentifier("");
        deviceField33.setLabelString("Value: ");
        deviceField33.setNumCols(45);
        deviceField33.setOffsetNid(161);
        jPanel18.add(deviceField33);

        deviceChoice15.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice15.setIdentifier("");
        deviceChoice15.setLabelString("Type: ");
        deviceChoice15.setOffsetNid(158);
        deviceChoice15.setUpdateIdentifier("");
        jPanel18.add(deviceChoice15);

        deviceField34.setIdentifier("");
        deviceField34.setLabelString("Channel: ");
        deviceField34.setNumCols(15);
        deviceField34.setOffsetNid(166);
        deviceField34.setTextOnly(true);
        jPanel18.add(deviceField34);

        deviceField212.setIdentifier("");
        deviceField212.setLabelString("Dimensions: ");
        deviceField212.setNumCols(4);
        deviceField212.setOffsetNid(159);
        jPanel18.add(deviceField212);

        jPanel1.add(jPanel18);

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 15"));

        deviceField35.setIdentifier("");
        deviceField35.setLabelString("Value: ");
        deviceField35.setNumCols(45);
        deviceField35.setOffsetNid(171);
        jPanel19.add(deviceField35);

        deviceChoice16.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice16.setIdentifier("");
        deviceChoice16.setLabelString("Type: ");
        deviceChoice16.setOffsetNid(168);
        deviceChoice16.setUpdateIdentifier("");
        jPanel19.add(deviceChoice16);

        deviceField36.setIdentifier("");
        deviceField36.setLabelString("Channel: ");
        deviceField36.setNumCols(15);
        deviceField36.setOffsetNid(176);
        deviceField36.setTextOnly(true);
        jPanel19.add(deviceField36);

        deviceField213.setIdentifier("");
        deviceField213.setLabelString("Dimensions: ");
        deviceField213.setNumCols(4);
        deviceField213.setOffsetNid(169);
        jPanel19.add(deviceField213);

        jPanel1.add(jPanel19);

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 16"));

        deviceField37.setIdentifier("");
        deviceField37.setLabelString("Value: ");
        deviceField37.setNumCols(45);
        deviceField37.setOffsetNid(181);
        jPanel20.add(deviceField37);

        deviceChoice17.setChoiceItems(new String[] {"float32", "float64", "int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64"});
        deviceChoice17.setIdentifier("");
        deviceChoice17.setLabelString("Type: ");
        deviceChoice17.setOffsetNid(178);
        deviceChoice17.setUpdateIdentifier("");
        jPanel20.add(deviceChoice17);

        deviceField38.setIdentifier("");
        deviceField38.setLabelString("Channel: ");
        deviceField38.setNumCols(15);
        deviceField38.setOffsetNid(186);
        deviceField38.setTextOnly(true);
        jPanel20.add(deviceField38);

        deviceField214.setIdentifier("");
        deviceField214.setLabelString("Dimensions: ");
        deviceField214.setNumCols(4);
        deviceField214.setOffsetNid(179);
        jPanel20.add(deviceField214);

        jPanel1.add(jPanel20);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
    private DeviceChoice deviceChoice10;
    private DeviceChoice deviceChoice11;
    private DeviceChoice deviceChoice12;
    private DeviceChoice deviceChoice13;
    private DeviceChoice deviceChoice14;
    private DeviceChoice deviceChoice15;
    private DeviceChoice deviceChoice16;
    private DeviceChoice deviceChoice17;
    private DeviceChoice deviceChoice2;
    private DeviceChoice deviceChoice3;
    private DeviceChoice deviceChoice4;
    private DeviceChoice deviceChoice5;
    private DeviceChoice deviceChoice6;
    private DeviceChoice deviceChoice7;
    private DeviceChoice deviceChoice8;
    private DeviceChoice deviceChoice9;
    private DeviceField deviceField1;
    private DeviceField deviceField10;
    private DeviceField deviceField11;
    private DeviceField deviceField12;
    private DeviceField deviceField13;
    private DeviceField deviceField14;
    private DeviceField deviceField15;
    private DeviceField deviceField16;
    private DeviceField deviceField17;
    private DeviceField deviceField18;
    private DeviceField deviceField19;
    private DeviceField deviceField199;
    private DeviceField deviceField2;
    private DeviceField deviceField20;
    private DeviceField deviceField200;
    private DeviceField deviceField201;
    private DeviceField deviceField202;
    private DeviceField deviceField203;
    private DeviceField deviceField204;
    private DeviceField deviceField205;
    private DeviceField deviceField206;
    private DeviceField deviceField207;
    private DeviceField deviceField208;
    private DeviceField deviceField209;
    private DeviceField deviceField21;
    private DeviceField deviceField210;
    private DeviceField deviceField211;
    private DeviceField deviceField212;
    private DeviceField deviceField213;
    private DeviceField deviceField214;
    private DeviceField deviceField22;
    private DeviceField deviceField23;
    private DeviceField deviceField24;
    private DeviceField deviceField25;
    private DeviceField deviceField26;
    private DeviceField deviceField27;
    private DeviceField deviceField28;
    private DeviceField deviceField29;
    private DeviceField deviceField3;
    private DeviceField deviceField30;
    private DeviceField deviceField31;
    private DeviceField deviceField32;
    private DeviceField deviceField33;
    private DeviceField deviceField34;
    private DeviceField deviceField35;
    private DeviceField deviceField36;
    private DeviceField deviceField37;
    private DeviceField deviceField38;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
