/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taliercio
 */
public class BCM_CONFIGSetup extends DeviceSetup {

    /**
     * Creates new form BCM_CONFIGSetup
     */
    public BCM_CONFIGSetup() {
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

        deviceFieldBeanInfo1 = new DeviceFieldBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        deviceDispatch1 = new DeviceDispatch();
        deviceButtons1 = new DeviceButtons();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        deviceChoice1 = new DeviceChoice();
        deviceField2 = new DeviceField();
        deviceField3 = new DeviceField();
        deviceField4 = new DeviceField();
        jPanel7 = new javax.swing.JPanel();
        deviceField5 = new DeviceField();
        deviceField7 = new DeviceField();
        deviceField14 = new DeviceField();
        jPanel8 = new javax.swing.JPanel();
        deviceField10 = new DeviceField();
        deviceField11 = new DeviceField();
        deviceField6 = new DeviceField();
        jPanel9 = new javax.swing.JPanel();
        deviceField12 = new DeviceField();
        deviceField9 = new DeviceField();
        deviceField13 = new DeviceField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        deviceChoice2 = new DeviceChoice();
        deviceField8 = new DeviceField();
        deviceField15 = new DeviceField();
        deviceField16 = new DeviceField();
        jPanel13 = new javax.swing.JPanel();
        deviceField17 = new DeviceField();
        deviceField18 = new DeviceField();
        deviceField19 = new DeviceField();
        jPanel14 = new javax.swing.JPanel();
        deviceField20 = new DeviceField();
        deviceField21 = new DeviceField();
        deviceField22 = new DeviceField();
        jPanel15 = new javax.swing.JPanel();
        deviceField23 = new DeviceField();
        deviceField24 = new DeviceField();
        deviceField25 = new DeviceField();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        deviceChoice3 = new DeviceChoice();
        deviceField26 = new DeviceField();
        deviceField27 = new DeviceField();
        deviceField28 = new DeviceField();
        jPanel19 = new javax.swing.JPanel();
        deviceField29 = new DeviceField();
        deviceField30 = new DeviceField();
        deviceField31 = new DeviceField();
        jPanel20 = new javax.swing.JPanel();
        deviceField32 = new DeviceField();
        deviceField33 = new DeviceField();
        deviceField34 = new DeviceField();
        jPanel21 = new javax.swing.JPanel();
        deviceField35 = new DeviceField();
        deviceField36 = new DeviceField();
        deviceField37 = new DeviceField();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        deviceChoice4 = new DeviceChoice();
        deviceField38 = new DeviceField();
        deviceField39 = new DeviceField();
        deviceField40 = new DeviceField();
        jPanel25 = new javax.swing.JPanel();
        deviceField41 = new DeviceField();
        deviceField42 = new DeviceField();
        deviceField43 = new DeviceField();
        jPanel26 = new javax.swing.JPanel();
        deviceField44 = new DeviceField();
        deviceField45 = new DeviceField();
        deviceField46 = new DeviceField();
        jPanel27 = new javax.swing.JPanel();
        deviceField47 = new DeviceField();
        deviceField48 = new DeviceField();
        deviceField49 = new DeviceField();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        deviceChoice5 = new DeviceChoice();
        deviceField50 = new DeviceField();
        deviceField51 = new DeviceField();
        deviceField52 = new DeviceField();
        jPanel31 = new javax.swing.JPanel();
        deviceField53 = new DeviceField();
        deviceField54 = new DeviceField();
        deviceField55 = new DeviceField();
        jPanel32 = new javax.swing.JPanel();
        deviceField56 = new DeviceField();
        deviceField57 = new DeviceField();
        deviceField58 = new DeviceField();
        jPanel33 = new javax.swing.JPanel();
        deviceField59 = new DeviceField();
        deviceField60 = new DeviceField();
        deviceField61 = new DeviceField();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        deviceChoice6 = new DeviceChoice();
        deviceField62 = new DeviceField();
        deviceField63 = new DeviceField();
        deviceField64 = new DeviceField();
        jPanel37 = new javax.swing.JPanel();
        deviceField65 = new DeviceField();
        deviceField66 = new DeviceField();
        deviceField67 = new DeviceField();
        jPanel38 = new javax.swing.JPanel();
        deviceField68 = new DeviceField();
        deviceField69 = new DeviceField();
        deviceField70 = new DeviceField();
        jPanel39 = new javax.swing.JPanel();
        deviceField71 = new DeviceField();
        deviceField72 = new DeviceField();
        deviceField73 = new DeviceField();

        setDeviceProvider("soserver.nbtf:9000");
        setDeviceTitle("Beam Current Monitor Timing Configuration");
        setDeviceType("BCM_CONFIG");
        setHeight(360);
        setWidth(1050);

        jPanel1.add(jPanel2);

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Comment:");
        deviceField1.setNumCols(60);
        deviceField1.setOffsetNid(1);
        deviceField1.setTextOnly(true);
        jPanel1.add(deviceField1);
        jPanel1.add(deviceDispatch1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        jPanel5.setLayout(new java.awt.GridLayout(4, 1));

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceChoice1.setChoiceItems(new String[] {"CONTINUOUS", "SLOW", "FAST"});
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("Mode:");
        deviceChoice1.setOffsetNid(4);
        deviceChoice1.setUpdateIdentifier("");
        jPanel6.add(deviceChoice1);

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Dev. Path");
        deviceField2.setNumCols(25);
        deviceField2.setOffsetNid(3);
        jPanel6.add(deviceField2);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Start Time [s]:");
        deviceField3.setOffsetNid(5);
        jPanel6.add(deviceField3);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("End Time [s]:");
        deviceField4.setOffsetNid(6);
        jPanel6.add(deviceField4);

        jPanel5.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Continuous"));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("Trig. source:");
        deviceField5.setNumCols(35);
        deviceField5.setOffsetNid(17);
        jPanel7.add(deviceField5);

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("Freq [Hz]:");
        deviceField7.setNumCols(15);
        deviceField7.setOffsetNid(9);
        jPanel7.add(deviceField7);

        deviceField14.setIdentifier("");
        deviceField14.setLabelString("MDS event:");
        deviceField14.setNumCols(15);
        deviceField14.setOffsetNid(14);
        deviceField14.setTextOnly(true);
        jPanel7.add(deviceField14);

        jPanel5.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Slow"));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField10.setIdentifier("");
        deviceField10.setLabelString("Trig. source:");
        deviceField10.setNumCols(35);
        deviceField10.setOffsetNid(15);
        jPanel8.add(deviceField10);

        deviceField11.setIdentifier("");
        deviceField11.setLabelString("Freq [Hz]:");
        deviceField11.setNumCols(15);
        deviceField11.setOffsetNid(11);
        jPanel8.add(deviceField11);

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("MDS event:");
        deviceField6.setNumCols(15);
        deviceField6.setOffsetNid(12);
        deviceField6.setTextOnly(true);
        jPanel8.add(deviceField6);

        jPanel5.add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Fast"));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField12.setIdentifier("");
        deviceField12.setLabelString("Trig. source:");
        deviceField12.setNumCols(35);
        deviceField12.setOffsetNid(16);
        jPanel9.add(deviceField12);

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("Freq [Hz]:");
        deviceField9.setNumCols(15);
        deviceField9.setOffsetNid(10);
        jPanel9.add(deviceField9);

        deviceField13.setIdentifier("");
        deviceField13.setLabelString("MDS event:");
        deviceField13.setNumCols(15);
        deviceField13.setOffsetNid(13);
        deviceField13.setTextOnly(true);
        jPanel9.add(deviceField13);

        jPanel5.add(jPanel9);

        jPanel4.add(jPanel5);

        jTabbedPane1.addTab("CONFIG 1", jPanel4);

        jPanel10.setLayout(new java.awt.GridLayout(1, 1));

        jPanel11.setLayout(new java.awt.GridLayout(4, 1));

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceChoice2.setChoiceItems(new String[] {"CONTINUOUS", "SLOW", "FAST"});
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("Mode:");
        deviceChoice2.setOffsetNid(23);
        deviceChoice2.setUpdateIdentifier("");
        jPanel12.add(deviceChoice2);

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("Dev. Path");
        deviceField8.setNumCols(25);
        deviceField8.setOffsetNid(22);
        jPanel12.add(deviceField8);

        deviceField15.setIdentifier("");
        deviceField15.setLabelString("Start Time [s]:");
        deviceField15.setOffsetNid(24);
        jPanel12.add(deviceField15);

        deviceField16.setIdentifier("");
        deviceField16.setLabelString("End Time [s]:");
        deviceField16.setOffsetNid(25);
        jPanel12.add(deviceField16);

        jPanel11.add(jPanel12);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Continuous"));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField17.setIdentifier("");
        deviceField17.setLabelString("Trig. source:");
        deviceField17.setNumCols(35);
        deviceField17.setOffsetNid(36);
        jPanel13.add(deviceField17);

        deviceField18.setIdentifier("");
        deviceField18.setLabelString("Freq [Hz]:");
        deviceField18.setNumCols(15);
        deviceField18.setOffsetNid(28);
        jPanel13.add(deviceField18);

        deviceField19.setIdentifier("");
        deviceField19.setLabelString("MDS event:");
        deviceField19.setNumCols(15);
        deviceField19.setOffsetNid(33);
        deviceField19.setTextOnly(true);
        jPanel13.add(deviceField19);

        jPanel11.add(jPanel13);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Slow"));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField20.setIdentifier("");
        deviceField20.setLabelString("Trig. source:");
        deviceField20.setNumCols(35);
        deviceField20.setOffsetNid(34);
        jPanel14.add(deviceField20);

        deviceField21.setIdentifier("");
        deviceField21.setLabelString("Freq [Hz]:");
        deviceField21.setNumCols(15);
        deviceField21.setOffsetNid(30);
        jPanel14.add(deviceField21);

        deviceField22.setIdentifier("");
        deviceField22.setLabelString("MDS event:");
        deviceField22.setNumCols(15);
        deviceField22.setOffsetNid(31);
        deviceField22.setTextOnly(true);
        jPanel14.add(deviceField22);

        jPanel11.add(jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Fast"));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField23.setIdentifier("");
        deviceField23.setLabelString("Trig. source:");
        deviceField23.setNumCols(35);
        deviceField23.setOffsetNid(35);
        jPanel15.add(deviceField23);

        deviceField24.setIdentifier("");
        deviceField24.setLabelString("Freq [Hz]:");
        deviceField24.setNumCols(15);
        deviceField24.setOffsetNid(29);
        jPanel15.add(deviceField24);

        deviceField25.setIdentifier("");
        deviceField25.setLabelString("MDS event:");
        deviceField25.setNumCols(15);
        deviceField25.setOffsetNid(32);
        deviceField25.setTextOnly(true);
        jPanel15.add(deviceField25);

        jPanel11.add(jPanel15);

        jPanel10.add(jPanel11);

        jTabbedPane1.addTab("CONFIG 2", jPanel10);

        jPanel16.setLayout(new java.awt.GridLayout(1, 1));

        jPanel17.setLayout(new java.awt.GridLayout(4, 1));

        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceChoice3.setChoiceItems(new String[] {"CONTINUOUS", "SLOW", "FAST"});
        deviceChoice3.setIdentifier("");
        deviceChoice3.setLabelString("Mode:");
        deviceChoice3.setOffsetNid(42);
        deviceChoice3.setUpdateIdentifier("");
        jPanel18.add(deviceChoice3);

        deviceField26.setIdentifier("");
        deviceField26.setLabelString("Dev. Path");
        deviceField26.setNumCols(25);
        deviceField26.setOffsetNid(41);
        jPanel18.add(deviceField26);

        deviceField27.setIdentifier("");
        deviceField27.setLabelString("Start Time [s]:");
        deviceField27.setOffsetNid(43);
        jPanel18.add(deviceField27);

        deviceField28.setIdentifier("");
        deviceField28.setLabelString("End Time [s]:");
        deviceField28.setOffsetNid(44);
        jPanel18.add(deviceField28);

        jPanel17.add(jPanel18);

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Continuous"));
        jPanel19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField29.setIdentifier("");
        deviceField29.setLabelString("Trig. source:");
        deviceField29.setNumCols(35);
        deviceField29.setOffsetNid(55);
        jPanel19.add(deviceField29);

        deviceField30.setIdentifier("");
        deviceField30.setLabelString("Freq [Hz]:");
        deviceField30.setNumCols(15);
        deviceField30.setOffsetNid(47);
        jPanel19.add(deviceField30);

        deviceField31.setIdentifier("");
        deviceField31.setLabelString("MDS event:");
        deviceField31.setNumCols(15);
        deviceField31.setOffsetNid(52);
        deviceField31.setTextOnly(true);
        jPanel19.add(deviceField31);

        jPanel17.add(jPanel19);

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Slow"));
        jPanel20.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField32.setIdentifier("");
        deviceField32.setLabelString("Trig. source:");
        deviceField32.setNumCols(35);
        deviceField32.setOffsetNid(53);
        jPanel20.add(deviceField32);

        deviceField33.setIdentifier("");
        deviceField33.setLabelString("Freq [Hz]:");
        deviceField33.setNumCols(15);
        deviceField33.setOffsetNid(49);
        jPanel20.add(deviceField33);

        deviceField34.setIdentifier("");
        deviceField34.setLabelString("MDS event:");
        deviceField34.setNumCols(15);
        deviceField34.setOffsetNid(50);
        deviceField34.setTextOnly(true);
        jPanel20.add(deviceField34);

        jPanel17.add(jPanel20);

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Fast"));
        jPanel21.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField35.setIdentifier("");
        deviceField35.setLabelString("Trig. source:");
        deviceField35.setNumCols(35);
        deviceField35.setOffsetNid(54);
        jPanel21.add(deviceField35);

        deviceField36.setIdentifier("");
        deviceField36.setLabelString("Freq [Hz]:");
        deviceField36.setNumCols(15);
        deviceField36.setOffsetNid(48);
        jPanel21.add(deviceField36);

        deviceField37.setIdentifier("");
        deviceField37.setLabelString("MDS event:");
        deviceField37.setNumCols(15);
        deviceField37.setOffsetNid(51);
        deviceField37.setTextOnly(true);
        jPanel21.add(deviceField37);

        jPanel17.add(jPanel21);

        jPanel16.add(jPanel17);

        jTabbedPane1.addTab("CONFIG 3", jPanel16);

        jPanel22.setLayout(new java.awt.GridLayout(1, 1));

        jPanel23.setLayout(new java.awt.GridLayout(4, 1));

        jPanel24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceChoice4.setChoiceItems(new String[] {"CONTINUOUS", "SLOW", "FAST"});
        deviceChoice4.setIdentifier("");
        deviceChoice4.setLabelString("Mode:");
        deviceChoice4.setOffsetNid(61);
        deviceChoice4.setUpdateIdentifier("");
        jPanel24.add(deviceChoice4);

        deviceField38.setIdentifier("");
        deviceField38.setLabelString("Dev. Path");
        deviceField38.setNumCols(25);
        deviceField38.setOffsetNid(60);
        jPanel24.add(deviceField38);

        deviceField39.setIdentifier("");
        deviceField39.setLabelString("Start Time [s]:");
        deviceField39.setOffsetNid(62);
        jPanel24.add(deviceField39);

        deviceField40.setIdentifier("");
        deviceField40.setLabelString("End Time [s]:");
        deviceField40.setOffsetNid(63);
        jPanel24.add(deviceField40);

        jPanel23.add(jPanel24);

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Continuous"));
        jPanel25.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField41.setIdentifier("");
        deviceField41.setLabelString("Trig. source:");
        deviceField41.setNumCols(35);
        deviceField41.setOffsetNid(74);
        jPanel25.add(deviceField41);

        deviceField42.setIdentifier("");
        deviceField42.setLabelString("Freq [Hz]:");
        deviceField42.setNumCols(15);
        deviceField42.setOffsetNid(66);
        jPanel25.add(deviceField42);

        deviceField43.setIdentifier("");
        deviceField43.setLabelString("MDS event:");
        deviceField43.setNumCols(15);
        deviceField43.setOffsetNid(71);
        deviceField43.setTextOnly(true);
        jPanel25.add(deviceField43);

        jPanel23.add(jPanel25);

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder("Slow"));
        jPanel26.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField44.setIdentifier("");
        deviceField44.setLabelString("Trig. source:");
        deviceField44.setNumCols(35);
        deviceField44.setOffsetNid(72);
        jPanel26.add(deviceField44);

        deviceField45.setIdentifier("");
        deviceField45.setLabelString("Freq [Hz]:");
        deviceField45.setNumCols(15);
        deviceField45.setOffsetNid(68);
        jPanel26.add(deviceField45);

        deviceField46.setIdentifier("");
        deviceField46.setLabelString("MDS event:");
        deviceField46.setNumCols(15);
        deviceField46.setOffsetNid(69);
        deviceField46.setTextOnly(true);
        jPanel26.add(deviceField46);

        jPanel23.add(jPanel26);

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Fast"));
        jPanel27.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField47.setIdentifier("");
        deviceField47.setLabelString("Trig. source:");
        deviceField47.setNumCols(35);
        deviceField47.setOffsetNid(73);
        jPanel27.add(deviceField47);

        deviceField48.setIdentifier("");
        deviceField48.setLabelString("Freq [Hz]:");
        deviceField48.setNumCols(15);
        deviceField48.setOffsetNid(67);
        jPanel27.add(deviceField48);

        deviceField49.setIdentifier("");
        deviceField49.setLabelString("MDS event:");
        deviceField49.setNumCols(15);
        deviceField49.setOffsetNid(70);
        deviceField49.setTextOnly(true);
        jPanel27.add(deviceField49);

        jPanel23.add(jPanel27);

        jPanel22.add(jPanel23);

        jTabbedPane1.addTab("CONFIG 4", jPanel22);

        jPanel28.setLayout(new java.awt.GridLayout(1, 1));

        jPanel29.setLayout(new java.awt.GridLayout(4, 1));

        jPanel30.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceChoice5.setChoiceItems(new String[] {"CONTINUOUS", "SLOW", "FAST"});
        deviceChoice5.setIdentifier("");
        deviceChoice5.setLabelString("Mode:");
        deviceChoice5.setOffsetNid(80);
        deviceChoice5.setUpdateIdentifier("");
        jPanel30.add(deviceChoice5);

        deviceField50.setIdentifier("");
        deviceField50.setLabelString("Dev. Path");
        deviceField50.setNumCols(25);
        deviceField50.setOffsetNid(79);
        jPanel30.add(deviceField50);

        deviceField51.setIdentifier("");
        deviceField51.setLabelString("Start Time [s]:");
        deviceField51.setOffsetNid(81);
        jPanel30.add(deviceField51);

        deviceField52.setIdentifier("");
        deviceField52.setLabelString("End Time [s]:");
        deviceField52.setOffsetNid(82);
        jPanel30.add(deviceField52);

        jPanel29.add(jPanel30);

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder("Continuous"));
        jPanel31.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField53.setIdentifier("");
        deviceField53.setLabelString("Trig. source:");
        deviceField53.setNumCols(35);
        deviceField53.setOffsetNid(93);
        jPanel31.add(deviceField53);

        deviceField54.setIdentifier("");
        deviceField54.setLabelString("Freq [Hz]:");
        deviceField54.setNumCols(15);
        deviceField54.setOffsetNid(85);
        jPanel31.add(deviceField54);

        deviceField55.setIdentifier("");
        deviceField55.setLabelString("MDS event:");
        deviceField55.setNumCols(15);
        deviceField55.setOffsetNid(90);
        deviceField55.setTextOnly(true);
        jPanel31.add(deviceField55);

        jPanel29.add(jPanel31);

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder("Slow"));
        jPanel32.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField56.setIdentifier("");
        deviceField56.setLabelString("Trig. source:");
        deviceField56.setNumCols(35);
        deviceField56.setOffsetNid(91);
        jPanel32.add(deviceField56);

        deviceField57.setIdentifier("");
        deviceField57.setLabelString("Freq [Hz]:");
        deviceField57.setNumCols(15);
        deviceField57.setOffsetNid(87);
        jPanel32.add(deviceField57);

        deviceField58.setIdentifier("");
        deviceField58.setLabelString("MDS event:");
        deviceField58.setNumCols(15);
        deviceField58.setOffsetNid(88);
        deviceField58.setTextOnly(true);
        jPanel32.add(deviceField58);

        jPanel29.add(jPanel32);

        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder("Fast"));
        jPanel33.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField59.setIdentifier("");
        deviceField59.setLabelString("Trig. source:");
        deviceField59.setNumCols(35);
        deviceField59.setOffsetNid(92);
        jPanel33.add(deviceField59);

        deviceField60.setIdentifier("");
        deviceField60.setLabelString("Freq [Hz]:");
        deviceField60.setNumCols(15);
        deviceField60.setOffsetNid(86);
        jPanel33.add(deviceField60);

        deviceField61.setIdentifier("");
        deviceField61.setLabelString("MDS event:");
        deviceField61.setNumCols(15);
        deviceField61.setOffsetNid(89);
        deviceField61.setTextOnly(true);
        jPanel33.add(deviceField61);

        jPanel29.add(jPanel33);

        jPanel28.add(jPanel29);

        jTabbedPane1.addTab("CONFIG 5", jPanel28);

        jPanel34.setLayout(new java.awt.GridLayout(1, 1));

        jPanel35.setLayout(new java.awt.GridLayout(4, 1));

        jPanel36.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceChoice6.setChoiceItems(new String[] {"CONTINUOUS", "SLOW", "FAST"});
        deviceChoice6.setIdentifier("");
        deviceChoice6.setLabelString("Mode:");
        deviceChoice6.setOffsetNid(99);
        deviceChoice6.setUpdateIdentifier("");
        jPanel36.add(deviceChoice6);

        deviceField62.setIdentifier("");
        deviceField62.setLabelString("Dev. Path");
        deviceField62.setNumCols(25);
        deviceField62.setOffsetNid(98);
        jPanel36.add(deviceField62);

        deviceField63.setIdentifier("");
        deviceField63.setLabelString("Start Time [s]:");
        deviceField63.setOffsetNid(100);
        jPanel36.add(deviceField63);

        deviceField64.setIdentifier("");
        deviceField64.setLabelString("End Time [s]:");
        deviceField64.setOffsetNid(101);
        jPanel36.add(deviceField64);

        jPanel35.add(jPanel36);

        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder("Continuous"));
        jPanel37.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField65.setIdentifier("");
        deviceField65.setLabelString("Trig. source:");
        deviceField65.setNumCols(35);
        deviceField65.setOffsetNid(112);
        jPanel37.add(deviceField65);

        deviceField66.setIdentifier("");
        deviceField66.setLabelString("Freq [Hz]:");
        deviceField66.setNumCols(15);
        deviceField66.setOffsetNid(104);
        jPanel37.add(deviceField66);

        deviceField67.setIdentifier("");
        deviceField67.setLabelString("MDS event:");
        deviceField67.setNumCols(15);
        deviceField67.setOffsetNid(109);
        deviceField67.setTextOnly(true);
        jPanel37.add(deviceField67);

        jPanel35.add(jPanel37);

        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder("Slow"));
        jPanel38.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField68.setIdentifier("");
        deviceField68.setLabelString("Trig. source:");
        deviceField68.setNumCols(35);
        deviceField68.setOffsetNid(110);
        jPanel38.add(deviceField68);

        deviceField69.setIdentifier("");
        deviceField69.setLabelString("Freq [Hz]:");
        deviceField69.setNumCols(15);
        deviceField69.setOffsetNid(106);
        jPanel38.add(deviceField69);

        deviceField70.setIdentifier("");
        deviceField70.setLabelString("MDS event:");
        deviceField70.setNumCols(15);
        deviceField70.setOffsetNid(107);
        deviceField70.setTextOnly(true);
        jPanel38.add(deviceField70);

        jPanel35.add(jPanel38);

        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder("Fast"));
        jPanel39.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        deviceField71.setIdentifier("");
        deviceField71.setLabelString("Trig. source:");
        deviceField71.setNumCols(35);
        deviceField71.setOffsetNid(111);
        jPanel39.add(deviceField71);

        deviceField72.setIdentifier("");
        deviceField72.setLabelString("Freq [Hz]:");
        deviceField72.setNumCols(15);
        deviceField72.setOffsetNid(105);
        jPanel39.add(deviceField72);

        deviceField73.setIdentifier("");
        deviceField73.setLabelString("MDS event:");
        deviceField73.setNumCols(15);
        deviceField73.setOffsetNid(108);
        deviceField73.setTextOnly(true);
        jPanel39.add(deviceField73);

        jPanel35.add(jPanel39);

        jPanel34.add(jPanel35);

        jTabbedPane1.addTab("CONFIG 6", jPanel34);

        jPanel3.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
    private DeviceChoice deviceChoice2;
    private DeviceChoice deviceChoice3;
    private DeviceChoice deviceChoice4;
    private DeviceChoice deviceChoice5;
    private DeviceChoice deviceChoice6;
    private DeviceDispatch deviceDispatch1;
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
    private DeviceField deviceField2;
    private DeviceField deviceField20;
    private DeviceField deviceField21;
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
    private DeviceField deviceField39;
    private DeviceField deviceField4;
    private DeviceField deviceField40;
    private DeviceField deviceField41;
    private DeviceField deviceField42;
    private DeviceField deviceField43;
    private DeviceField deviceField44;
    private DeviceField deviceField45;
    private DeviceField deviceField46;
    private DeviceField deviceField47;
    private DeviceField deviceField48;
    private DeviceField deviceField49;
    private DeviceField deviceField5;
    private DeviceField deviceField50;
    private DeviceField deviceField51;
    private DeviceField deviceField52;
    private DeviceField deviceField53;
    private DeviceField deviceField54;
    private DeviceField deviceField55;
    private DeviceField deviceField56;
    private DeviceField deviceField57;
    private DeviceField deviceField58;
    private DeviceField deviceField59;
    private DeviceField deviceField6;
    private DeviceField deviceField60;
    private DeviceField deviceField61;
    private DeviceField deviceField62;
    private DeviceField deviceField63;
    private DeviceField deviceField64;
    private DeviceField deviceField65;
    private DeviceField deviceField66;
    private DeviceField deviceField67;
    private DeviceField deviceField68;
    private DeviceField deviceField69;
    private DeviceField deviceField7;
    private DeviceField deviceField70;
    private DeviceField deviceField71;
    private DeviceField deviceField72;
    private DeviceField deviceField73;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private DeviceFieldBeanInfo deviceFieldBeanInfo1;
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
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
