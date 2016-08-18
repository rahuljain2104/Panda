package com.qc.panda.uilocators;

public interface PandaLocators {

	
	//main page 
	public static String cell0 = "//*[@id='El']" ;
	
	//login page
	public static String loginButton = "//input[@value = 'Login as a Controller']" ;
	public static String ownerNameTextBox = "//input[@name= 'ownerName']" ;
	
	public static String releaseSystemBtn = "//input[@name= 'loginBtn']" ;
	
	// Logical Test Overview MIMO
	public static String applyFlushBtn = "//*[@id='IDC_LV_LT_APPLY_FLUSH']" ;
	public static String configureBtn = "//*[@id='IDC_LV_LT_CONFIGURE']" ;
	public static String runBtn = "//*[@id='ID_RUN']" ;
	public static String stopBtn = "//*[@id='ID_STOP']" ;
	public static String editCheckBx = "//*[@id='IDC_EDIT']" ;
	
	public static String phnSetupBtn = "//*[@id='IDC_LV_LOGIC_TEST_MSI_SETUP']" ;
	public static String channelSetupBtn = "//*[@id='IDC_LV_LOGIC_TEST_CHAN_SETUP_0']" ;
	public static String csmTypeSetupBtn = "//*[@id='IDC_LV_LOGIC_TEST_CSI_SETUP_0']" ;
	
	// MIMO Channel Setup
	public static String tx0_rx0_IOR = "//*[@id='IDC_LV_CHANNEL_FWD_IOR_0_0']" ;
	public static String tx0_rx1_IOR = "//*[@id='IDC_LV_CHANNEL_FWD_IOR_1_0']" ;
	public static String tx1_rx0_IOR = "//*[@id='IDC_LV_CHANNEL_FWD_IOR_0_1']" ;
	public static String tx1_rx1_IOR = "//*[@id='IDC_LV_CHANNEL_FWD_IOR_1_1']" ;
	
	public static String backBtn = "//*[@id='IDCANCEL']" ;
	
	
}
