package com.mass.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExcelColumn {

@JsonProperty("SAP_ID") 
String SAP_ID;

@JsonProperty("REGION") 
String REGION;

@JsonProperty("MAINT_BASE")
String MAINT_BASE;

@JsonProperty("CONSUMER_NAME")
String CONSUMER_NAME="";

@JsonProperty("PROCESS_FLUID")
String PROCESS_FLUID;

@JsonProperty("TYPE")
String TYPE="";

@JsonProperty("DESIGN_CAPACITY")
String DESIGN_CAPACITY="";

@JsonProperty("AVG_PRESSURE")
String AVG_PRESSURE="";

@JsonProperty("AVG_TEMP")
String AVG_TEMP="";

@JsonProperty("AVG_DAILY_CONSUMPTION")
String AVG_DAILY_CONSUMPTION="";

@JsonProperty("NO_OF_STREAM")
String NO_OF_STREAM="";

@JsonProperty("MM_REMARKS")
String MM_REMARKS="";

@JsonProperty("CONFIGURATION")
String CONFIGURATION="";

@JsonProperty("CREATED_BY")
String CREATED_BY="";

@JsonProperty("METERING_TYPE")
String METERING_TYPE;

@JsonProperty("CONNECTIVITY")
String CONNECTIVITY="";

@JsonProperty("STREAM_INDEX")
String STREAM_INDEX;

@JsonProperty("MET_ID")
String MET_ID="";

@JsonProperty("PRIMARY_MAKE")
String PRIMARY_MAKE="";

@JsonProperty("PRIMARY_MODEL")
String PRIMARY_MODEL="";

@JsonProperty("PRIMARY_TAG_NO")
String PRIMARY_TAG_NO="";

@JsonProperty("PRIMARY_SERIAL_NO")
String PRIMARY_SERIAL_NO="";

@JsonProperty("PRIMARY_METER_SIZE")
String PRIMARY_METER_SIZE="";

@JsonProperty("PRIMARY_PRESSURE_CLASS")
String PRIMARY_PRESSURE_CLASS="";

@JsonProperty("PRIMARY_G_RATING")
String PRIMARY_G_RATING="";

@JsonProperty("PRIMARY_Q_MAX")
String PRIMARY_Q_MAX="";

@JsonProperty("PRIMARY_Q_MIN")
String PRIMARY_Q_MIN="";

@JsonProperty("PRIMARY_ORIFICE_DIA")
String PRIMARY_ORIFICE_DIA="";

@JsonProperty("PRIMARY_TUBE_DIAMETER")
String PRIMARY_TUBE_DIAMETER="";

@JsonProperty("KFACTOR")
String KFACTOR="";

@JsonProperty("PRIMARY_CREATED_AT")
String PRIMARY_CREATED_AT="";

@JsonProperty("ORIFICE_LD_CALIBRATION")
String ORIFICE_LD_CALIBRATION="";

@JsonProperty("ORIFICE_ND_CALIBRATION")
String ORIFICE_ND_CALIBRATION="";

@JsonProperty("ORIFICE_CALIBRATION_AGENCY")
String ORIFICE_CALIBRATION_AGENCY="";

@JsonProperty("ORIFICE_LD_METER_INTERNAL_INSP")
String ORIFICE_LD_METER_INTERNAL_INSP="";

@JsonProperty("ORIFICE_ND_METER_INTERNAL_INSP")
String ORIFICE_ND_METER_INTERNAL_INSP="";

@JsonProperty("ORIFICE_INSP_DATA_UPDATE_IN_FC")
String ORIFICE_INSP_DATA_UPDATE_IN_FC="";

@JsonProperty("ORIFICE_CREATED_AT")
String ORIFICE_CREATED_AT="";

@JsonProperty("TR_LD_CALIBRATION")
String TR_LD_CALIBRATION="";

@JsonProperty("TR_ND_CALIBRATION")
String TR_ND_CALIBRATION="";

@JsonProperty("TR_CALIBRATION_AGENCY")
String TR_CALIBRATION_AGENCY="";

@JsonProperty("TR_LD_ERROR_UPDATION")
String TR_LD_ERROR_UPDATION="";

@JsonProperty("TR_LD_METER_INTERNAL_INSP")
String TR_LD_METER_INTERNAL_INSP="";

@JsonProperty("TR_ND_METER_INTERNAL_INSP")
String TR_ND_METER_INTERNAL_INSP="";

@JsonProperty("TR_LD_METERTUBE_INSPECTION")
String TR_LD_METERTUBE_INSPECTION="";

@JsonProperty("TR_ND_METERTUBE_INSPECTION")
String TR_ND_METERTUBE_INSPECTION="";

@JsonProperty("TR_CREATED_AT")
String TR_CREATED_AT="";

@JsonProperty("USM_LD_CALIBRATION")
String USM_LD_CALIBRATION="";

@JsonProperty("USM_ND_CALIBRATION")
String USM_ND_CALIBRATION="";

@JsonProperty("USM_CALIBRATION_AGENCY")
String USM_CALIBRATION_AGENCY="";

@JsonProperty("USM_LD_ERROR_UPDATION")
String USM_LD_ERROR_UPDATION="";

@JsonProperty("USM_LD_METER_INTERNAL_INSP")
String USM_LD_METER_INTERNAL_INSP="";

@JsonProperty("USM_ND_METER_INTERNAL_INSP")
String USM_ND_METER_INTERNAL_INSP="";

@JsonProperty("USM_LD_METERTUBE_INSPECTION")
String USM_LD_METERTUBE_INSPECTION="";

@JsonProperty("USM_ND_METERTUBE_INSPECTION")
String USM_ND_METERTUBE_INSPECTION="";

@JsonProperty("USM_LD_HEALTH_MONITORING")
String USM_LD_HEALTH_MONITORING="";

@JsonProperty("USM_ND_HEALTH_MONITORING")
String USM_ND_HEALTH_MONITORING="";

@JsonProperty("USM_LD_SOS_VERIFICATION")
String USM_LD_SOS_VERIFICATION="";

@JsonProperty("USM_ND_SOS_VERIFICATION")
String USM_ND_SOS_VERIFICATION="";

@JsonProperty("USM_STREAM_CONFIGURED")
String USM_STREAM_CONFIGURED="";

@JsonProperty("USM_OP_CUST_TRAN_INVOICE")
String USM_OP_CUST_TRAN_INVOICE="";

@JsonProperty("USM_CREATED_AT")
String USM_CREATED_AT="";

@JsonProperty("CORIOLIS_LD_CALIBRATION")
String CORIOLIS_LD_CALIBRATION="";

@JsonProperty("CORIOLIS_ND_CALIBRATION")
String CORIOLIS_ND_CALIBRATION="";

@JsonProperty("CORIOLIS_CALIBRATION_AGENCY")
String CORIOLIS_CALIBRATION_AGENCY="";

@JsonProperty("CORIOLIS_CALI_UPDATE_IN_METER")
String CORIOLIS_CALI_UPDATE_IN_METER="";

@JsonProperty("CORIOLIS_LD_METER_TUBE_INSP")
String CORIOLIS_LD_METER_TUBE_INSP="";

@JsonProperty("CORIOLIS_ND_METER_TUBE_INSP")
String CORIOLIS_ND_METER_TUBE_INSP="";

@JsonProperty("CORIOLIS_CREATED_AT")
String CORIOLIS_CREATED_AT="";

@JsonProperty("FC_MAKE")
String FC_MAKE="";

@JsonProperty("FC_MODEL")
String FC_MODEL="";

@JsonProperty("FC_POWER_SOURCE")
String FC_POWER_SOURCE="";

@JsonProperty("BP_CONTRACT_VALUE")
String BP_CONTRACT_VALUE="";

@JsonProperty("BP_CONTRACT_UNIT")
String BP_CONTRACT_UNIT="";

@JsonProperty("BP_ASCONFIGURED_VALUE")
String BP_ASCONFIGURED_VALUE="";

@JsonProperty("BP_ASCONFIGURED_UNIT")
String BP_ASCONFIGURED_UNIT="";

@JsonProperty("AP_SOURCE_TYPE")
String AP_SOURCE_TYPE="";

@JsonProperty("AP_SOURCE")
String AP_SOURCE="";

@JsonProperty("AP_FREQ_OF_UPDATION")
String AP_FREQ_OF_UPDATION="";

@JsonProperty("AP_DATA_USED_FOR_UPDATION")
String AP_DATA_USED_FOR_UPDATION="";

@JsonProperty("AP_LD_UPDATION")
String AP_LD_UPDATION="";

@JsonProperty("AP_ND_UPDATION")
String AP_ND_UPDATION="";

@JsonProperty("AP_PRESENT_VALUE")
String AP_PRESENT_VALUE="";

@JsonProperty("AP_PRESENT_UNIT")
String AP_PRESENT_UNIT="";

@JsonProperty("CCM_ASPERCONTRACT")
String CCM_ASPERCONTRACT="";

@JsonProperty("CCM_ASCONFIGURED")
String CCM_ASCONFIGURED="";

@JsonProperty("HV_ASPERCONTRACT")
String HV_ASPERCONTRACT="";

@JsonProperty("HV_ASCONFIGURED")
String HV_ASCONFIGURED="";

@JsonProperty("FC_TYPE")
String FC_TYPE="";

@JsonProperty("BT_CONTRACT_VALUE")
String BT_CONTRACT_VALUE="";

@JsonProperty("BT_CONTRACT_UNIT")
String BT_CONTRACT_UNIT="";

@JsonProperty("BT_ASCONFIG_VALUE")
String BT_ASCONFIG_VALUE="";

@JsonProperty("BT_ASCONFIG_UNIT")
String BT_ASCONFIG_UNIT="";

@JsonProperty("AP_FREQ_OF_UPDATION_VAL")
String AP_FREQ_OF_UPDATION_VAL="";

@JsonProperty("AP_DATA_USED_FOR_UPDATE_VAL")
String AP_DATA_USED_FOR_UPDATE_VAL="";

@JsonProperty("JOINT_CALI_FREQ")
String JOINT_CALI_FREQ="";

@JsonProperty("LD_CALIBRATION")
String LD_CALIBRATION="";

@JsonProperty("NEXT_CALIBRATION_DATE")
String NEXT_CALIBRATION_DATE="";

@JsonProperty("PT_TYPE")
String PT_TYPE="";

@JsonProperty("PT_MAKE")
String PT_MAKE="";

@JsonProperty("PT_MODEL")
String PT_MODEL="";

@JsonProperty("PT_ACCURACY")
String PT_ACCURACY="";

@JsonProperty("DIFF_PT_TYPE")
String DIFF_PT_TYPE="";

@JsonProperty("DIFF_PT_MAKE")
String DIFF_PT_MAKE="";

@JsonProperty("DIFF_PT_MODEL")
String DIFF_PT_MODEL="";

@JsonProperty("DIFF_PT_ACCURACY")
String DIFF_PT_ACCURACY="";

@JsonProperty("TEMP_INP_TO_FC")
String TEMP_INP_TO_FC="";

@JsonProperty("TEMP_MAKE")
String TEMP_MAKE="";

@JsonProperty("TEMP_MODEL")
String TEMP_MODEL="";

@JsonProperty("TEMP_ACCURACY")
String TEMP_ACCURACY="";

@JsonProperty("RTD_TYPE")
String RTD_TYPE="";

@JsonProperty("RTD_CLASS")
String RTD_CLASS="";

@JsonProperty("RTD_MAKE")
String RTD_MAKE="";

@JsonProperty("RTD_MODEL")
String RTD_MODEL="";

@JsonProperty("RTD_LD_CALIBRATION")
String RTD_LD_CALIBRATION="";

@JsonProperty("IS_BARRIER_INSTALLED")
String IS_BARRIER_INSTALLED="";

@JsonProperty("FB_PM_FREQ_RANGE")
String FB_PM_FREQ_RANGE="";

@JsonProperty("BARRIER_FREQ_RANGE")
String BARRIER_FREQ_RANGE="";

@JsonProperty("LD_SIMULATION")
String LD_SIMULATION="";

@JsonProperty("SECONDARY_CREATED_AT")
String SECONDARY_CREATED_AT="";

@JsonProperty("GQ_DATASOURCE")
String GQ_DATASOURCE="";

@JsonProperty("GQ_FREQ")
String GQ_FREQ="";

@JsonProperty("GQ_DATA_USED")
String GQ_DATA_USED="";

@JsonProperty("GQ_UPDATE_FREQ")
String GQ_UPDATE_FREQ="";

@JsonProperty("GQ_UPDATE_METHOD")
String GQ_UPDATE_METHOD="";

@JsonProperty("LAB_DETAILS")
String LAB_DETAILS="";

@JsonProperty("COMP_COVERED")
String COMP_COVERED="";

@JsonProperty("VALIDITY_DATE")
String VALIDITY_DATE="";

@JsonProperty("COMP_COVERED_VALUE")
String COMP_COVERED_VALUE="";

@JsonProperty("QALITY_DATA_SOURCE_VAL")
String QALITY_DATA_SOURCE_VAL="";

@JsonProperty("QALITY_DATA_USED_VAL")
String QALITY_DATA_USED_VAL="";

@JsonProperty("QALITY_DATA_METHOD_VAL")
String QALITY_DATA_METHOD_VAL="";

@JsonProperty("GC_MAKE")
String GC_MAKE="";

@JsonProperty("GC_MODEL")
String GC_MODEL="";

@JsonProperty("GC_MEASUREMENT_CAPABILITY")
String GC_MEASUREMENT_CAPABILITY="";

@JsonProperty("MI_TYPE")
String MI_TYPE="";

@JsonProperty("MI_MAKE")
String MI_MAKE="";

@JsonProperty("MI_MODEL")
String MI_MODEL="";

@JsonProperty("MI_LD_CALIBRATION")
String MI_LD_CALIBRATION="";

@JsonProperty("MI_ND_CALIBRATION")
String MI_ND_CALIBRATION="";

@JsonProperty("FS_TYPE")
String FS_TYPE="";

@JsonProperty("FS_DESIGN_CAPACITY")
String FS_DESIGN_CAPACITY="";

@JsonProperty("FS_FILTER_SIZE")
String FS_FILTER_SIZE="";

@JsonProperty("FS_MAKE")
String FS_MAKE="";

@JsonProperty("FS_MODEL")
String FS_MODEL="";

@JsonProperty("FS_TAG_NO")
String FS_TAG_NO="";

@JsonProperty("DF_DESIGN_CAPACITY")
String DF_DESIGN_CAPACITY="";

@JsonProperty("DF_FILTER_SIZE")
String DF_FILTER_SIZE="";

@JsonProperty("DF_MAKE")
String DF_MAKE="";

@JsonProperty("DF_MODEL")
String DF_MODEL="";

@JsonProperty("DF_TAG_NO")
String DF_TAG_NO="";

@JsonProperty("PCV_P_SIZE")
String PCV_P_SIZE="";

@JsonProperty("PCV_PRESSURE_RATING")
String PCV_PRESSURE_RATING="";

@JsonProperty("PCV_TYPE")
String PCV_TYPE="";

@JsonProperty("PCV_MAKE")
String PCV_MAKE="";

@JsonProperty("PCV_MODEL")
String PCV_MODEL="";

@JsonProperty("PCV_SETPOINT")
String PCV_SETPOINT="";

@JsonProperty("PCV_UNIT")
String PCV_UNIT="";

@JsonProperty("PCV_REM")
String PCV_REM="";

@JsonProperty("SDV_S_SIZE")
String SDV_S_SIZE="";

@JsonProperty("SDV_PRESSURE_RATING")
String SDV_PRESSURE_RATING="";

@JsonProperty("SDV_MAKE")
String SDV_MAKE="";

@JsonProperty("SDV_MODEL")
String SDV_MODEL="";

@JsonProperty("SDV_SETPOINT")
String SDV_SETPOINT="";

@JsonProperty("SDV_UNIT")
String SDV_UNIT="";

@JsonProperty("SDV_REM")
String SDV_REM="";

@JsonProperty("PSV_C_TYPE")
String PSV_C_TYPE="";

@JsonProperty("PSV_C_SIZE")
String PSV_C_SIZE="";

@JsonProperty("PSV_PRESSURE_RATING")
String PSV_PRESSURE_RATING="";

@JsonProperty("PSV_MAKE")
String PSV_MAKE="";

@JsonProperty("PSV_MODEL")
String PSV_MODEL="";

@JsonProperty("PSV_SETPOINT")
String PSV_SETPOINT="";

@JsonProperty("PSV_UNIT")
String PSV_UNIT="";

@JsonProperty("PSV_REM")
String PSV_REM="";

@JsonProperty("PSV_LAST_CALIBRATION")
String PSV_LAST_CALIBRATION="";

@JsonProperty("PSV_NEXT_CALIBRATION")
String PSV_NEXT_CALIBRATION="";

@JsonProperty("GI_FLOW_CONTROL_VALVE")
String GI_FLOW_CONTROL_VALVE="";

@JsonProperty("GI_FIRE_WATER_SYSTEM")
String GI_FIRE_WATER_SYSTEM="";

@JsonProperty("GI_GAS_DETECTION_SYSTEM")
String GI_GAS_DETECTION_SYSTEM="";

@JsonProperty("GI_LAST_REVIEW_AUDIT_COMM")
String GI_LAST_REVIEW_AUDIT_COMM="";

@JsonProperty("GI_LAST_REVIEW_REG_COMM")
String GI_LAST_REVIEW_REG_COMM="";

@JsonProperty("GI_REMARK")
String GI_REMARK="";

@JsonProperty("PT_MAX_ERROR")
String PT_MAX_ERROR="";

@JsonProperty("PT_MIN_ERROR")
String PT_MIN_ERROR="";

@JsonProperty("PT_MAX_ALLOW")
String PT_MAX_ALLOW="";

@JsonProperty("PT_MIN_ALLOW")
String PT_MIN_ALLOW="";

@JsonProperty("TT_MAX_ERROR")
String TT_MAX_ERROR="";

@JsonProperty("TT_MIN_ERROR")
String TT_MIN_ERROR="";

@JsonProperty("TT_MAX_ALLOW")
String TT_MAX_ALLOW="";

@JsonProperty("TT_MIN_ALLOW")
String TT_MIN_ALLOW="";

public String getSAP_ID() {
	return SAP_ID;
}

public void setSAP_ID(String sAP_ID) {
	SAP_ID = sAP_ID;
}

public String getREGION() {
	return REGION;
}

public void setREGION(String rEGION) {
	REGION = rEGION;
}

public String getMAINT_BASE() {
	return MAINT_BASE;
}

public void setMAINT_BASE(String mAINT_BASE) {
	MAINT_BASE = mAINT_BASE;
}

public String getCONSUMER_NAME() {
	return CONSUMER_NAME;
}

public void setCONSUMER_NAME(String cONSUMER_NAME) {
	CONSUMER_NAME = cONSUMER_NAME;
}

public String getPROCESS_FLUID() {
	return PROCESS_FLUID;
}

public void setPROCESS_FLUID(String pROCESS_FLUID) {
	PROCESS_FLUID = pROCESS_FLUID;
}

public String getTYPE() {
	return TYPE;
}

public void setTYPE(String tYPE) {
	TYPE = tYPE;
}

public String getDESIGN_CAPACITY() {
	return DESIGN_CAPACITY;
}

public void setDESIGN_CAPACITY(String dESIGN_CAPACITY) {
	DESIGN_CAPACITY = dESIGN_CAPACITY;
}

public String getAVG_PRESSURE() {
	return AVG_PRESSURE;
}

public void setAVG_PRESSURE(String aVG_PRESSURE) {
	AVG_PRESSURE = aVG_PRESSURE;
}

public String getAVG_TEMP() {
	return AVG_TEMP;
}

public void setAVG_TEMP(String aVG_TEMP) {
	AVG_TEMP = aVG_TEMP;
}

public String getAVG_DAILY_CONSUMPTION() {
	return AVG_DAILY_CONSUMPTION;
}

public void setAVG_DAILY_CONSUMPTION(String aVG_DAILY_CONSUMPTION) {
	AVG_DAILY_CONSUMPTION = aVG_DAILY_CONSUMPTION;
}

public String getNO_OF_STREAM() {
	return NO_OF_STREAM;
}

public void setNO_OF_STREAM(String nO_OF_STREAM) {
	NO_OF_STREAM = nO_OF_STREAM;
}

public String getMM_REMARKS() {
	return MM_REMARKS;
}

public void setMM_REMARKS(String mM_REMARKS) {
	MM_REMARKS = mM_REMARKS;
}

public String getCONFIGURATION() {
	return CONFIGURATION;
}

public void setCONFIGURATION(String cONFIGURATION) {
	CONFIGURATION = cONFIGURATION;
}

public String getCREATED_BY() {
	return CREATED_BY;
}

public void setCREATED_BY(String cREATED_BY) {
	CREATED_BY = cREATED_BY;
}

public String getMETERING_TYPE() {
	return METERING_TYPE;
}

public void setMETERING_TYPE(String mETERING_TYPE) {
	METERING_TYPE = mETERING_TYPE;
}

public String getCONNECTIVITY() {
	return CONNECTIVITY;
}

public void setCONNECTIVITY(String cONNECTIVITY) {
	CONNECTIVITY = cONNECTIVITY;
}

public String getSTREAM_INDEX() {
	return STREAM_INDEX;
}

public void setSTREAM_INDEX(String sTREAM_INDEX) {
	STREAM_INDEX = sTREAM_INDEX;
}

public String getMET_ID() {
	return MET_ID;
}

public void setMET_ID(String mET_ID) {
	MET_ID = mET_ID;
}

public String getPRIMARY_MAKE() {
	return PRIMARY_MAKE;
}

public void setPRIMARY_MAKE(String pRIMARY_MAKE) {
	PRIMARY_MAKE = pRIMARY_MAKE;
}

public String getPRIMARY_MODEL() {
	return PRIMARY_MODEL;
}

public void setPRIMARY_MODEL(String pRIMARY_MODEL) {
	PRIMARY_MODEL = pRIMARY_MODEL;
}

public String getPRIMARY_TAG_NO() {
	return PRIMARY_TAG_NO;
}

public void setPRIMARY_TAG_NO(String pRIMARY_TAG_NO) {
	PRIMARY_TAG_NO = pRIMARY_TAG_NO;
}

public String getPRIMARY_SERIAL_NO() {
	return PRIMARY_SERIAL_NO;
}

public void setPRIMARY_SERIAL_NO(String pRIMARY_SERIAL_NO) {
	PRIMARY_SERIAL_NO = pRIMARY_SERIAL_NO;
}

public String getPRIMARY_METER_SIZE() {
	return PRIMARY_METER_SIZE;
}

public void setPRIMARY_METER_SIZE(String pRIMARY_METER_SIZE) {
	PRIMARY_METER_SIZE = pRIMARY_METER_SIZE;
}

public String getPRIMARY_PRESSURE_CLASS() {
	return PRIMARY_PRESSURE_CLASS;
}

public void setPRIMARY_PRESSURE_CLASS(String pRIMARY_PRESSURE_CLASS) {
	PRIMARY_PRESSURE_CLASS = pRIMARY_PRESSURE_CLASS;
}

public String getPRIMARY_G_RATING() {
	return PRIMARY_G_RATING;
}

public void setPRIMARY_G_RATING(String pRIMARY_G_RATING) {
	PRIMARY_G_RATING = pRIMARY_G_RATING;
}

public String getPRIMARY_Q_MAX() {
	return PRIMARY_Q_MAX;
}

public void setPRIMARY_Q_MAX(String pRIMARY_Q_MAX) {
	PRIMARY_Q_MAX = pRIMARY_Q_MAX;
}

public String getPRIMARY_Q_MIN() {
	return PRIMARY_Q_MIN;
}

public void setPRIMARY_Q_MIN(String pRIMARY_Q_MIN) {
	PRIMARY_Q_MIN = pRIMARY_Q_MIN;
}

public String getPRIMARY_ORIFICE_DIA() {
	return PRIMARY_ORIFICE_DIA;
}

public void setPRIMARY_ORIFICE_DIA(String pRIMARY_ORIFICE_DIA) {
	PRIMARY_ORIFICE_DIA = pRIMARY_ORIFICE_DIA;
}

public String getPRIMARY_TUBE_DIAMETER() {
	return PRIMARY_TUBE_DIAMETER;
}

public void setPRIMARY_TUBE_DIAMETER(String pRIMARY_TUBE_DIAMETER) {
	PRIMARY_TUBE_DIAMETER = pRIMARY_TUBE_DIAMETER;
}

public String getKFACTOR() {
	return KFACTOR;
}

public void setKFACTOR(String kFACTOR) {
	KFACTOR = kFACTOR;
}

public String getPRIMARY_CREATED_AT() {
	return PRIMARY_CREATED_AT;
}

public void setPRIMARY_CREATED_AT(String pRIMARY_CREATED_AT) {
	PRIMARY_CREATED_AT = pRIMARY_CREATED_AT;
}

public String getORIFICE_LD_CALIBRATION() {
	return ORIFICE_LD_CALIBRATION;
}

public void setORIFICE_LD_CALIBRATION(String oRIFICE_LD_CALIBRATION) {
	ORIFICE_LD_CALIBRATION = oRIFICE_LD_CALIBRATION;
}

public String getORIFICE_ND_CALIBRATION() {
	return ORIFICE_ND_CALIBRATION;
}

public void setORIFICE_ND_CALIBRATION(String oRIFICE_ND_CALIBRATION) {
	ORIFICE_ND_CALIBRATION = oRIFICE_ND_CALIBRATION;
}

public String getORIFICE_CALIBRATION_AGENCY() {
	return ORIFICE_CALIBRATION_AGENCY;
}

public void setORIFICE_CALIBRATION_AGENCY(String oRIFICE_CALIBRATION_AGENCY) {
	ORIFICE_CALIBRATION_AGENCY = oRIFICE_CALIBRATION_AGENCY;
}

public String getORIFICE_LD_METER_INTERNAL_INSP() {
	return ORIFICE_LD_METER_INTERNAL_INSP;
}

public void setORIFICE_LD_METER_INTERNAL_INSP(String oRIFICE_LD_METER_INTERNAL_INSP) {
	ORIFICE_LD_METER_INTERNAL_INSP = oRIFICE_LD_METER_INTERNAL_INSP;
}

public String getORIFICE_ND_METER_INTERNAL_INSP() {
	return ORIFICE_ND_METER_INTERNAL_INSP;
}

public void setORIFICE_ND_METER_INTERNAL_INSP(String oRIFICE_ND_METER_INTERNAL_INSP) {
	ORIFICE_ND_METER_INTERNAL_INSP = oRIFICE_ND_METER_INTERNAL_INSP;
}

public String getORIFICE_INSP_DATA_UPDATE_IN_FC() {
	return ORIFICE_INSP_DATA_UPDATE_IN_FC;
}

public void setORIFICE_INSP_DATA_UPDATE_IN_FC(String oRIFICE_INSP_DATA_UPDATE_IN_FC) {
	ORIFICE_INSP_DATA_UPDATE_IN_FC = oRIFICE_INSP_DATA_UPDATE_IN_FC;
}

public String getORIFICE_CREATED_AT() {
	return ORIFICE_CREATED_AT;
}

public void setORIFICE_CREATED_AT(String oRIFICE_CREATED_AT) {
	ORIFICE_CREATED_AT = oRIFICE_CREATED_AT;
}

public String getTR_LD_CALIBRATION() {
	return TR_LD_CALIBRATION;
}

public void setTR_LD_CALIBRATION(String tR_LD_CALIBRATION) {
	TR_LD_CALIBRATION = tR_LD_CALIBRATION;
}

public String getTR_ND_CALIBRATION() {
	return TR_ND_CALIBRATION;
}

public void setTR_ND_CALIBRATION(String tR_ND_CALIBRATION) {
	TR_ND_CALIBRATION = tR_ND_CALIBRATION;
}

public String getTR_CALIBRATION_AGENCY() {
	return TR_CALIBRATION_AGENCY;
}

public void setTR_CALIBRATION_AGENCY(String tR_CALIBRATION_AGENCY) {
	TR_CALIBRATION_AGENCY = tR_CALIBRATION_AGENCY;
}

public String getTR_LD_ERROR_UPDATION() {
	return TR_LD_ERROR_UPDATION;
}

public void setTR_LD_ERROR_UPDATION(String tR_LD_ERROR_UPDATION) {
	TR_LD_ERROR_UPDATION = tR_LD_ERROR_UPDATION;
}

public String getTR_LD_METER_INTERNAL_INSP() {
	return TR_LD_METER_INTERNAL_INSP;
}

public void setTR_LD_METER_INTERNAL_INSP(String tR_LD_METER_INTERNAL_INSP) {
	TR_LD_METER_INTERNAL_INSP = tR_LD_METER_INTERNAL_INSP;
}

public String getTR_ND_METER_INTERNAL_INSP() {
	return TR_ND_METER_INTERNAL_INSP;
}

public void setTR_ND_METER_INTERNAL_INSP(String tR_ND_METER_INTERNAL_INSP) {
	TR_ND_METER_INTERNAL_INSP = tR_ND_METER_INTERNAL_INSP;
}

public String getTR_LD_METERTUBE_INSPECTION() {
	return TR_LD_METERTUBE_INSPECTION;
}

public void setTR_LD_METERTUBE_INSPECTION(String tR_LD_METERTUBE_INSPECTION) {
	TR_LD_METERTUBE_INSPECTION = tR_LD_METERTUBE_INSPECTION;
}

public String getTR_ND_METERTUBE_INSPECTION() {
	return TR_ND_METERTUBE_INSPECTION;
}

public void setTR_ND_METERTUBE_INSPECTION(String tR_ND_METERTUBE_INSPECTION) {
	TR_ND_METERTUBE_INSPECTION = tR_ND_METERTUBE_INSPECTION;
}

public String getTR_CREATED_AT() {
	return TR_CREATED_AT;
}

public void setTR_CREATED_AT(String tR_CREATED_AT) {
	TR_CREATED_AT = tR_CREATED_AT;
}

public String getUSM_LD_CALIBRATION() {
	return USM_LD_CALIBRATION;
}

public void setUSM_LD_CALIBRATION(String uSM_LD_CALIBRATION) {
	USM_LD_CALIBRATION = uSM_LD_CALIBRATION;
}

public String getUSM_ND_CALIBRATION() {
	return USM_ND_CALIBRATION;
}

public void setUSM_ND_CALIBRATION(String uSM_ND_CALIBRATION) {
	USM_ND_CALIBRATION = uSM_ND_CALIBRATION;
}

public String getUSM_CALIBRATION_AGENCY() {
	return USM_CALIBRATION_AGENCY;
}

public void setUSM_CALIBRATION_AGENCY(String uSM_CALIBRATION_AGENCY) {
	USM_CALIBRATION_AGENCY = uSM_CALIBRATION_AGENCY;
}

public String getUSM_LD_ERROR_UPDATION() {
	return USM_LD_ERROR_UPDATION;
}

public void setUSM_LD_ERROR_UPDATION(String uSM_LD_ERROR_UPDATION) {
	USM_LD_ERROR_UPDATION = uSM_LD_ERROR_UPDATION;
}

public String getUSM_LD_METER_INTERNAL_INSP() {
	return USM_LD_METER_INTERNAL_INSP;
}

public void setUSM_LD_METER_INTERNAL_INSP(String uSM_LD_METER_INTERNAL_INSP) {
	USM_LD_METER_INTERNAL_INSP = uSM_LD_METER_INTERNAL_INSP;
}

public String getUSM_ND_METER_INTERNAL_INSP() {
	return USM_ND_METER_INTERNAL_INSP;
}

public void setUSM_ND_METER_INTERNAL_INSP(String uSM_ND_METER_INTERNAL_INSP) {
	USM_ND_METER_INTERNAL_INSP = uSM_ND_METER_INTERNAL_INSP;
}

public String getUSM_LD_METERTUBE_INSPECTION() {
	return USM_LD_METERTUBE_INSPECTION;
}

public void setUSM_LD_METERTUBE_INSPECTION(String uSM_LD_METERTUBE_INSPECTION) {
	USM_LD_METERTUBE_INSPECTION = uSM_LD_METERTUBE_INSPECTION;
}

public String getUSM_ND_METERTUBE_INSPECTION() {
	return USM_ND_METERTUBE_INSPECTION;
}

public void setUSM_ND_METERTUBE_INSPECTION(String uSM_ND_METERTUBE_INSPECTION) {
	USM_ND_METERTUBE_INSPECTION = uSM_ND_METERTUBE_INSPECTION;
}

public String getUSM_LD_HEALTH_MONITORING() {
	return USM_LD_HEALTH_MONITORING;
}

public void setUSM_LD_HEALTH_MONITORING(String uSM_LD_HEALTH_MONITORING) {
	USM_LD_HEALTH_MONITORING = uSM_LD_HEALTH_MONITORING;
}

public String getUSM_ND_HEALTH_MONITORING() {
	return USM_ND_HEALTH_MONITORING;
}

public void setUSM_ND_HEALTH_MONITORING(String uSM_ND_HEALTH_MONITORING) {
	USM_ND_HEALTH_MONITORING = uSM_ND_HEALTH_MONITORING;
}

public String getUSM_LD_SOS_VERIFICATION() {
	return USM_LD_SOS_VERIFICATION;
}

public void setUSM_LD_SOS_VERIFICATION(String uSM_LD_SOS_VERIFICATION) {
	USM_LD_SOS_VERIFICATION = uSM_LD_SOS_VERIFICATION;
}

public String getUSM_ND_SOS_VERIFICATION() {
	return USM_ND_SOS_VERIFICATION;
}

public void setUSM_ND_SOS_VERIFICATION(String uSM_ND_SOS_VERIFICATION) {
	USM_ND_SOS_VERIFICATION = uSM_ND_SOS_VERIFICATION;
}

public String getUSM_STREAM_CONFIGURED() {
	return USM_STREAM_CONFIGURED;
}

public void setUSM_STREAM_CONFIGURED(String uSM_STREAM_CONFIGURED) {
	USM_STREAM_CONFIGURED = uSM_STREAM_CONFIGURED;
}

public String getUSM_OP_CUST_TRAN_INVOICE() {
	return USM_OP_CUST_TRAN_INVOICE;
}

public void setUSM_OP_CUST_TRAN_INVOICE(String uSM_OP_CUST_TRAN_INVOICE) {
	USM_OP_CUST_TRAN_INVOICE = uSM_OP_CUST_TRAN_INVOICE;
}

public String getUSM_CREATED_AT() {
	return USM_CREATED_AT;
}

public void setUSM_CREATED_AT(String uSM_CREATED_AT) {
	USM_CREATED_AT = uSM_CREATED_AT;
}

public String getCORIOLIS_LD_CALIBRATION() {
	return CORIOLIS_LD_CALIBRATION;
}

public void setCORIOLIS_LD_CALIBRATION(String cORIOLIS_LD_CALIBRATION) {
	CORIOLIS_LD_CALIBRATION = cORIOLIS_LD_CALIBRATION;
}

public String getCORIOLIS_ND_CALIBRATION() {
	return CORIOLIS_ND_CALIBRATION;
}

public void setCORIOLIS_ND_CALIBRATION(String cORIOLIS_ND_CALIBRATION) {
	CORIOLIS_ND_CALIBRATION = cORIOLIS_ND_CALIBRATION;
}

public String getCORIOLIS_CALIBRATION_AGENCY() {
	return CORIOLIS_CALIBRATION_AGENCY;
}

public void setCORIOLIS_CALIBRATION_AGENCY(String cORIOLIS_CALIBRATION_AGENCY) {
	CORIOLIS_CALIBRATION_AGENCY = cORIOLIS_CALIBRATION_AGENCY;
}

public String getCORIOLIS_CALI_UPDATE_IN_METER() {
	return CORIOLIS_CALI_UPDATE_IN_METER;
}

public void setCORIOLIS_CALI_UPDATE_IN_METER(String cORIOLIS_CALI_UPDATE_IN_METER) {
	CORIOLIS_CALI_UPDATE_IN_METER = cORIOLIS_CALI_UPDATE_IN_METER;
}

public String getCORIOLIS_LD_METER_TUBE_INSP() {
	return CORIOLIS_LD_METER_TUBE_INSP;
}

public void setCORIOLIS_LD_METER_TUBE_INSP(String cORIOLIS_LD_METER_TUBE_INSP) {
	CORIOLIS_LD_METER_TUBE_INSP = cORIOLIS_LD_METER_TUBE_INSP;
}

public String getCORIOLIS_ND_METER_TUBE_INSP() {
	return CORIOLIS_ND_METER_TUBE_INSP;
}

public void setCORIOLIS_ND_METER_TUBE_INSP(String cORIOLIS_ND_METER_TUBE_INSP) {
	CORIOLIS_ND_METER_TUBE_INSP = cORIOLIS_ND_METER_TUBE_INSP;
}

public String getCORIOLIS_CREATED_AT() {
	return CORIOLIS_CREATED_AT;
}

public void setCORIOLIS_CREATED_AT(String cORIOLIS_CREATED_AT) {
	CORIOLIS_CREATED_AT = cORIOLIS_CREATED_AT;
}

public String getFC_MAKE() {
	return FC_MAKE;
}

public void setFC_MAKE(String fC_MAKE) {
	FC_MAKE = fC_MAKE;
}

public String getFC_MODEL() {
	return FC_MODEL;
}

public void setFC_MODEL(String fC_MODEL) {
	FC_MODEL = fC_MODEL;
}

public String getFC_POWER_SOURCE() {
	return FC_POWER_SOURCE;
}

public void setFC_POWER_SOURCE(String fC_POWER_SOURCE) {
	FC_POWER_SOURCE = fC_POWER_SOURCE;
}

public String getBP_CONTRACT_VALUE() {
	return BP_CONTRACT_VALUE;
}

public void setBP_CONTRACT_VALUE(String bP_CONTRACT_VALUE) {
	BP_CONTRACT_VALUE = bP_CONTRACT_VALUE;
}

public String getBP_CONTRACT_UNIT() {
	return BP_CONTRACT_UNIT;
}

public void setBP_CONTRACT_UNIT(String bP_CONTRACT_UNIT) {
	BP_CONTRACT_UNIT = bP_CONTRACT_UNIT;
}

public String getBP_ASCONFIGURED_VALUE() {
	return BP_ASCONFIGURED_VALUE;
}

public void setBP_ASCONFIGURED_VALUE(String bP_ASCONFIGURED_VALUE) {
	BP_ASCONFIGURED_VALUE = bP_ASCONFIGURED_VALUE;
}

public String getBP_ASCONFIGURED_UNIT() {
	return BP_ASCONFIGURED_UNIT;
}

public void setBP_ASCONFIGURED_UNIT(String bP_ASCONFIGURED_UNIT) {
	BP_ASCONFIGURED_UNIT = bP_ASCONFIGURED_UNIT;
}

public String getAP_SOURCE_TYPE() {
	return AP_SOURCE_TYPE;
}

public void setAP_SOURCE_TYPE(String aP_SOURCE_TYPE) {
	AP_SOURCE_TYPE = aP_SOURCE_TYPE;
}

public String getAP_SOURCE() {
	return AP_SOURCE;
}

public void setAP_SOURCE(String aP_SOURCE) {
	AP_SOURCE = aP_SOURCE;
}

public String getAP_FREQ_OF_UPDATION() {
	return AP_FREQ_OF_UPDATION;
}

public void setAP_FREQ_OF_UPDATION(String aP_FREQ_OF_UPDATION) {
	AP_FREQ_OF_UPDATION = aP_FREQ_OF_UPDATION;
}

public String getAP_DATA_USED_FOR_UPDATION() {
	return AP_DATA_USED_FOR_UPDATION;
}

public void setAP_DATA_USED_FOR_UPDATION(String aP_DATA_USED_FOR_UPDATION) {
	AP_DATA_USED_FOR_UPDATION = aP_DATA_USED_FOR_UPDATION;
}

public String getAP_LD_UPDATION() {
	return AP_LD_UPDATION;
}

public void setAP_LD_UPDATION(String aP_LD_UPDATION) {
	AP_LD_UPDATION = aP_LD_UPDATION;
}

public String getAP_ND_UPDATION() {
	return AP_ND_UPDATION;
}

public void setAP_ND_UPDATION(String aP_ND_UPDATION) {
	AP_ND_UPDATION = aP_ND_UPDATION;
}

public String getAP_PRESENT_VALUE() {
	return AP_PRESENT_VALUE;
}

public void setAP_PRESENT_VALUE(String aP_PRESENT_VALUE) {
	AP_PRESENT_VALUE = aP_PRESENT_VALUE;
}

public String getAP_PRESENT_UNIT() {
	return AP_PRESENT_UNIT;
}

public void setAP_PRESENT_UNIT(String aP_PRESENT_UNIT) {
	AP_PRESENT_UNIT = aP_PRESENT_UNIT;
}

public String getCCM_ASPERCONTRACT() {
	return CCM_ASPERCONTRACT;
}

public void setCCM_ASPERCONTRACT(String cCM_ASPERCONTRACT) {
	CCM_ASPERCONTRACT = cCM_ASPERCONTRACT;
}

public String getCCM_ASCONFIGURED() {
	return CCM_ASCONFIGURED;
}

public void setCCM_ASCONFIGURED(String cCM_ASCONFIGURED) {
	CCM_ASCONFIGURED = cCM_ASCONFIGURED;
}

public String getHV_ASPERCONTRACT() {
	return HV_ASPERCONTRACT;
}

public void setHV_ASPERCONTRACT(String hV_ASPERCONTRACT) {
	HV_ASPERCONTRACT = hV_ASPERCONTRACT;
}

public String getHV_ASCONFIGURED() {
	return HV_ASCONFIGURED;
}

public void setHV_ASCONFIGURED(String hV_ASCONFIGURED) {
	HV_ASCONFIGURED = hV_ASCONFIGURED;
}

public String getFC_TYPE() {
	return FC_TYPE;
}

public void setFC_TYPE(String fC_TYPE) {
	FC_TYPE = fC_TYPE;
}

public String getBT_CONTRACT_VALUE() {
	return BT_CONTRACT_VALUE;
}

public void setBT_CONTRACT_VALUE(String bT_CONTRACT_VALUE) {
	BT_CONTRACT_VALUE = bT_CONTRACT_VALUE;
}

public String getBT_CONTRACT_UNIT() {
	return BT_CONTRACT_UNIT;
}

public void setBT_CONTRACT_UNIT(String bT_CONTRACT_UNIT) {
	BT_CONTRACT_UNIT = bT_CONTRACT_UNIT;
}

public String getBT_ASCONFIG_VALUE() {
	return BT_ASCONFIG_VALUE;
}

public void setBT_ASCONFIG_VALUE(String bT_ASCONFIG_VALUE) {
	BT_ASCONFIG_VALUE = bT_ASCONFIG_VALUE;
}

public String getBT_ASCONFIG_UNIT() {
	return BT_ASCONFIG_UNIT;
}

public void setBT_ASCONFIG_UNIT(String bT_ASCONFIG_UNIT) {
	BT_ASCONFIG_UNIT = bT_ASCONFIG_UNIT;
}

public String getAP_FREQ_OF_UPDATION_VAL() {
	return AP_FREQ_OF_UPDATION_VAL;
}

public void setAP_FREQ_OF_UPDATION_VAL(String aP_FREQ_OF_UPDATION_VAL) {
	AP_FREQ_OF_UPDATION_VAL = aP_FREQ_OF_UPDATION_VAL;
}

public String getAP_DATA_USED_FOR_UPDATE_VAL() {
	return AP_DATA_USED_FOR_UPDATE_VAL;
}

public void setAP_DATA_USED_FOR_UPDATE_VAL(String aP_DATA_USED_FOR_UPDATE_VAL) {
	AP_DATA_USED_FOR_UPDATE_VAL = aP_DATA_USED_FOR_UPDATE_VAL;
}

public String getJOINT_CALI_FREQ() {
	return JOINT_CALI_FREQ;
}

public void setJOINT_CALI_FREQ(String jOINT_CALI_FREQ) {
	JOINT_CALI_FREQ = jOINT_CALI_FREQ;
}

public String getLD_CALIBRATION() {
	return LD_CALIBRATION;
}

public void setLD_CALIBRATION(String lD_CALIBRATION) {
	LD_CALIBRATION = lD_CALIBRATION;
}

public String getNEXT_CALIBRATION_DATE() {
	return NEXT_CALIBRATION_DATE;
}

public void setNEXT_CALIBRATION_DATE(String nEXT_CALIBRATION_DATE) {
	NEXT_CALIBRATION_DATE = nEXT_CALIBRATION_DATE;
}

public String getPT_TYPE() {
	return PT_TYPE;
}

public void setPT_TYPE(String pT_TYPE) {
	PT_TYPE = pT_TYPE;
}

public String getPT_MAKE() {
	return PT_MAKE;
}

public void setPT_MAKE(String pT_MAKE) {
	PT_MAKE = pT_MAKE;
}

public String getPT_MODEL() {
	return PT_MODEL;
}

public void setPT_MODEL(String pT_MODEL) {
	PT_MODEL = pT_MODEL;
}

public String getPT_ACCURACY() {
	return PT_ACCURACY;
}

public void setPT_ACCURACY(String pT_ACCURACY) {
	PT_ACCURACY = pT_ACCURACY;
}

public String getDIFF_PT_TYPE() {
	return DIFF_PT_TYPE;
}

public void setDIFF_PT_TYPE(String dIFF_PT_TYPE) {
	DIFF_PT_TYPE = dIFF_PT_TYPE;
}

public String getDIFF_PT_MAKE() {
	return DIFF_PT_MAKE;
}

public void setDIFF_PT_MAKE(String dIFF_PT_MAKE) {
	DIFF_PT_MAKE = dIFF_PT_MAKE;
}

public String getDIFF_PT_MODEL() {
	return DIFF_PT_MODEL;
}

public void setDIFF_PT_MODEL(String dIFF_PT_MODEL) {
	DIFF_PT_MODEL = dIFF_PT_MODEL;
}

public String getDIFF_PT_ACCURACY() {
	return DIFF_PT_ACCURACY;
}

public void setDIFF_PT_ACCURACY(String dIFF_PT_ACCURACY) {
	DIFF_PT_ACCURACY = dIFF_PT_ACCURACY;
}

public String getTEMP_INP_TO_FC() {
	return TEMP_INP_TO_FC;
}

public void setTEMP_INP_TO_FC(String tEMP_INP_TO_FC) {
	TEMP_INP_TO_FC = tEMP_INP_TO_FC;
}

public String getTEMP_MAKE() {
	return TEMP_MAKE;
}

public void setTEMP_MAKE(String tEMP_MAKE) {
	TEMP_MAKE = tEMP_MAKE;
}

public String getTEMP_MODEL() {
	return TEMP_MODEL;
}

public void setTEMP_MODEL(String tEMP_MODEL) {
	TEMP_MODEL = tEMP_MODEL;
}

public String getTEMP_ACCURACY() {
	return TEMP_ACCURACY;
}

public void setTEMP_ACCURACY(String tEMP_ACCURACY) {
	TEMP_ACCURACY = tEMP_ACCURACY;
}

public String getRTD_TYPE() {
	return RTD_TYPE;
}

public void setRTD_TYPE(String rTD_TYPE) {
	RTD_TYPE = rTD_TYPE;
}

public String getRTD_CLASS() {
	return RTD_CLASS;
}

public void setRTD_CLASS(String rTD_CLASS) {
	RTD_CLASS = rTD_CLASS;
}

public String getRTD_MAKE() {
	return RTD_MAKE;
}

public void setRTD_MAKE(String rTD_MAKE) {
	RTD_MAKE = rTD_MAKE;
}

public String getRTD_MODEL() {
	return RTD_MODEL;
}

public void setRTD_MODEL(String rTD_MODEL) {
	RTD_MODEL = rTD_MODEL;
}

public String getRTD_LD_CALIBRATION() {
	return RTD_LD_CALIBRATION;
}

public void setRTD_LD_CALIBRATION(String rTD_LD_CALIBRATION) {
	RTD_LD_CALIBRATION = rTD_LD_CALIBRATION;
}

public String getIS_BARRIER_INSTALLED() {
	return IS_BARRIER_INSTALLED;
}

public void setIS_BARRIER_INSTALLED(String iS_BARRIER_INSTALLED) {
	IS_BARRIER_INSTALLED = iS_BARRIER_INSTALLED;
}

public String getFB_PM_FREQ_RANGE() {
	return FB_PM_FREQ_RANGE;
}

public void setFB_PM_FREQ_RANGE(String fB_PM_FREQ_RANGE) {
	FB_PM_FREQ_RANGE = fB_PM_FREQ_RANGE;
}

public String getBARRIER_FREQ_RANGE() {
	return BARRIER_FREQ_RANGE;
}

public void setBARRIER_FREQ_RANGE(String bARRIER_FREQ_RANGE) {
	BARRIER_FREQ_RANGE = bARRIER_FREQ_RANGE;
}

public String getLD_SIMULATION() {
	return LD_SIMULATION;
}

public void setLD_SIMULATION(String lD_SIMULATION) {
	LD_SIMULATION = lD_SIMULATION;
}

public String getSECONDARY_CREATED_AT() {
	return SECONDARY_CREATED_AT;
}

public void setSECONDARY_CREATED_AT(String sECONDARY_CREATED_AT) {
	SECONDARY_CREATED_AT = sECONDARY_CREATED_AT;
}

public String getGQ_DATASOURCE() {
	return GQ_DATASOURCE;
}

public void setGQ_DATASOURCE(String gQ_DATASOURCE) {
	GQ_DATASOURCE = gQ_DATASOURCE;
}

public String getGQ_FREQ() {
	return GQ_FREQ;
}

public void setGQ_FREQ(String gQ_FREQ) {
	GQ_FREQ = gQ_FREQ;
}

public String getGQ_DATA_USED() {
	return GQ_DATA_USED;
}

public void setGQ_DATA_USED(String gQ_DATA_USED) {
	GQ_DATA_USED = gQ_DATA_USED;
}

public String getGQ_UPDATE_FREQ() {
	return GQ_UPDATE_FREQ;
}

public void setGQ_UPDATE_FREQ(String gQ_UPDATE_FREQ) {
	GQ_UPDATE_FREQ = gQ_UPDATE_FREQ;
}

public String getGQ_UPDATE_METHOD() {
	return GQ_UPDATE_METHOD;
}

public void setGQ_UPDATE_METHOD(String gQ_UPDATE_METHOD) {
	GQ_UPDATE_METHOD = gQ_UPDATE_METHOD;
}

public String getLAB_DETAILS() {
	return LAB_DETAILS;
}

public void setLAB_DETAILS(String lAB_DETAILS) {
	LAB_DETAILS = lAB_DETAILS;
}

public String getCOMP_COVERED() {
	return COMP_COVERED;
}

public void setCOMP_COVERED(String cOMP_COVERED) {
	COMP_COVERED = cOMP_COVERED;
}

public String getVALIDITY_DATE() {
	return VALIDITY_DATE;
}

public void setVALIDITY_DATE(String vALIDITY_DATE) {
	VALIDITY_DATE = vALIDITY_DATE;
}

public String getCOMP_COVERED_VALUE() {
	return COMP_COVERED_VALUE;
}

public void setCOMP_COVERED_VALUE(String cOMP_COVERED_VALUE) {
	COMP_COVERED_VALUE = cOMP_COVERED_VALUE;
}

public String getQALITY_DATA_SOURCE_VAL() {
	return QALITY_DATA_SOURCE_VAL;
}

public void setQALITY_DATA_SOURCE_VAL(String qALITY_DATA_SOURCE_VAL) {
	QALITY_DATA_SOURCE_VAL = qALITY_DATA_SOURCE_VAL;
}

public String getQALITY_DATA_USED_VAL() {
	return QALITY_DATA_USED_VAL;
}

public void setQALITY_DATA_USED_VAL(String qALITY_DATA_USED_VAL) {
	QALITY_DATA_USED_VAL = qALITY_DATA_USED_VAL;
}

public String getQALITY_DATA_METHOD_VAL() {
	return QALITY_DATA_METHOD_VAL;
}

public void setQALITY_DATA_METHOD_VAL(String qALITY_DATA_METHOD_VAL) {
	QALITY_DATA_METHOD_VAL = qALITY_DATA_METHOD_VAL;
}

public String getGC_MAKE() {
	return GC_MAKE;
}

public void setGC_MAKE(String gC_MAKE) {
	GC_MAKE = gC_MAKE;
}

public String getGC_MODEL() {
	return GC_MODEL;
}

public void setGC_MODEL(String gC_MODEL) {
	GC_MODEL = gC_MODEL;
}

public String getGC_MEASUREMENT_CAPABILITY() {
	return GC_MEASUREMENT_CAPABILITY;
}

public void setGC_MEASUREMENT_CAPABILITY(String gC_MEASUREMENT_CAPABILITY) {
	GC_MEASUREMENT_CAPABILITY = gC_MEASUREMENT_CAPABILITY;
}

public String getMI_TYPE() {
	return MI_TYPE;
}

public void setMI_TYPE(String mI_TYPE) {
	MI_TYPE = mI_TYPE;
}

public String getMI_MAKE() {
	return MI_MAKE;
}

public void setMI_MAKE(String mI_MAKE) {
	MI_MAKE = mI_MAKE;
}

public String getMI_MODEL() {
	return MI_MODEL;
}

public void setMI_MODEL(String mI_MODEL) {
	MI_MODEL = mI_MODEL;
}

public String getMI_LD_CALIBRATION() {
	return MI_LD_CALIBRATION;
}

public void setMI_LD_CALIBRATION(String mI_LD_CALIBRATION) {
	MI_LD_CALIBRATION = mI_LD_CALIBRATION;
}

public String getMI_ND_CALIBRATION() {
	return MI_ND_CALIBRATION;
}

public void setMI_ND_CALIBRATION(String mI_ND_CALIBRATION) {
	MI_ND_CALIBRATION = mI_ND_CALIBRATION;
}

public String getFS_TYPE() {
	return FS_TYPE;
}

public void setFS_TYPE(String fS_TYPE) {
	FS_TYPE = fS_TYPE;
}

public String getFS_DESIGN_CAPACITY() {
	return FS_DESIGN_CAPACITY;
}

public void setFS_DESIGN_CAPACITY(String fS_DESIGN_CAPACITY) {
	FS_DESIGN_CAPACITY = fS_DESIGN_CAPACITY;
}

public String getFS_FILTER_SIZE() {
	return FS_FILTER_SIZE;
}

public void setFS_FILTER_SIZE(String fS_FILTER_SIZE) {
	FS_FILTER_SIZE = fS_FILTER_SIZE;
}

public String getFS_MAKE() {
	return FS_MAKE;
}

public void setFS_MAKE(String fS_MAKE) {
	FS_MAKE = fS_MAKE;
}

public String getFS_MODEL() {
	return FS_MODEL;
}

public void setFS_MODEL(String fS_MODEL) {
	FS_MODEL = fS_MODEL;
}

public String getFS_TAG_NO() {
	return FS_TAG_NO;
}

public void setFS_TAG_NO(String fS_TAG_NO) {
	FS_TAG_NO = fS_TAG_NO;
}

public String getDF_DESIGN_CAPACITY() {
	return DF_DESIGN_CAPACITY;
}

public void setDF_DESIGN_CAPACITY(String dF_DESIGN_CAPACITY) {
	DF_DESIGN_CAPACITY = dF_DESIGN_CAPACITY;
}

public String getDF_FILTER_SIZE() {
	return DF_FILTER_SIZE;
}

public void setDF_FILTER_SIZE(String dF_FILTER_SIZE) {
	DF_FILTER_SIZE = dF_FILTER_SIZE;
}

public String getDF_MAKE() {
	return DF_MAKE;
}

public void setDF_MAKE(String dF_MAKE) {
	DF_MAKE = dF_MAKE;
}

public String getDF_MODEL() {
	return DF_MODEL;
}

public void setDF_MODEL(String dF_MODEL) {
	DF_MODEL = dF_MODEL;
}

public String getDF_TAG_NO() {
	return DF_TAG_NO;
}

public void setDF_TAG_NO(String dF_TAG_NO) {
	DF_TAG_NO = dF_TAG_NO;
}

public String getPCV_P_SIZE() {
	return PCV_P_SIZE;
}

public void setPCV_P_SIZE(String pCV_P_SIZE) {
	PCV_P_SIZE = pCV_P_SIZE;
}

public String getPCV_PRESSURE_RATING() {
	return PCV_PRESSURE_RATING;
}

public void setPCV_PRESSURE_RATING(String pCV_PRESSURE_RATING) {
	PCV_PRESSURE_RATING = pCV_PRESSURE_RATING;
}

public String getPCV_TYPE() {
	return PCV_TYPE;
}

public void setPCV_TYPE(String pCV_TYPE) {
	PCV_TYPE = pCV_TYPE;
}

public String getPCV_MAKE() {
	return PCV_MAKE;
}

public void setPCV_MAKE(String pCV_MAKE) {
	PCV_MAKE = pCV_MAKE;
}

public String getPCV_MODEL() {
	return PCV_MODEL;
}

public void setPCV_MODEL(String pCV_MODEL) {
	PCV_MODEL = pCV_MODEL;
}

public String getPCV_SETPOINT() {
	return PCV_SETPOINT;
}

public void setPCV_SETPOINT(String pCV_SETPOINT) {
	PCV_SETPOINT = pCV_SETPOINT;
}

public String getPCV_UNIT() {
	return PCV_UNIT;
}

public void setPCV_UNIT(String pCV_UNIT) {
	PCV_UNIT = pCV_UNIT;
}

public String getPCV_REM() {
	return PCV_REM;
}

public void setPCV_REM(String pCV_REM) {
	PCV_REM = pCV_REM;
}

public String getSDV_S_SIZE() {
	return SDV_S_SIZE;
}

public void setSDV_S_SIZE(String sDV_S_SIZE) {
	SDV_S_SIZE = sDV_S_SIZE;
}

public String getSDV_PRESSURE_RATING() {
	return SDV_PRESSURE_RATING;
}

public void setSDV_PRESSURE_RATING(String sDV_PRESSURE_RATING) {
	SDV_PRESSURE_RATING = sDV_PRESSURE_RATING;
}

public String getSDV_MAKE() {
	return SDV_MAKE;
}

public void setSDV_MAKE(String sDV_MAKE) {
	SDV_MAKE = sDV_MAKE;
}

public String getSDV_MODEL() {
	return SDV_MODEL;
}

public void setSDV_MODEL(String sDV_MODEL) {
	SDV_MODEL = sDV_MODEL;
}

public String getSDV_SETPOINT() {
	return SDV_SETPOINT;
}

public void setSDV_SETPOINT(String sDV_SETPOINT) {
	SDV_SETPOINT = sDV_SETPOINT;
}

public String getSDV_UNIT() {
	return SDV_UNIT;
}

public void setSDV_UNIT(String sDV_UNIT) {
	SDV_UNIT = sDV_UNIT;
}

public String getSDV_REM() {
	return SDV_REM;
}

public void setSDV_REM(String sDV_REM) {
	SDV_REM = sDV_REM;
}

public String getPSV_C_TYPE() {
	return PSV_C_TYPE;
}

public void setPSV_C_TYPE(String pSV_C_TYPE) {
	PSV_C_TYPE = pSV_C_TYPE;
}

public String getPSV_C_SIZE() {
	return PSV_C_SIZE;
}

public void setPSV_C_SIZE(String pSV_C_SIZE) {
	PSV_C_SIZE = pSV_C_SIZE;
}

public String getPSV_PRESSURE_RATING() {
	return PSV_PRESSURE_RATING;
}

public void setPSV_PRESSURE_RATING(String pSV_PRESSURE_RATING) {
	PSV_PRESSURE_RATING = pSV_PRESSURE_RATING;
}

public String getPSV_MAKE() {
	return PSV_MAKE;
}

public void setPSV_MAKE(String pSV_MAKE) {
	PSV_MAKE = pSV_MAKE;
}

public String getPSV_MODEL() {
	return PSV_MODEL;
}

public void setPSV_MODEL(String pSV_MODEL) {
	PSV_MODEL = pSV_MODEL;
}

public String getPSV_SETPOINT() {
	return PSV_SETPOINT;
}

public void setPSV_SETPOINT(String pSV_SETPOINT) {
	PSV_SETPOINT = pSV_SETPOINT;
}

public String getPSV_UNIT() {
	return PSV_UNIT;
}

public void setPSV_UNIT(String pSV_UNIT) {
	PSV_UNIT = pSV_UNIT;
}

public String getPSV_REM() {
	return PSV_REM;
}

public void setPSV_REM(String pSV_REM) {
	PSV_REM = pSV_REM;
}

public String getPSV_LAST_CALIBRATION() {
	return PSV_LAST_CALIBRATION;
}

public void setPSV_LAST_CALIBRATION(String pSV_LAST_CALIBRATION) {
	PSV_LAST_CALIBRATION = pSV_LAST_CALIBRATION;
}

public String getPSV_NEXT_CALIBRATION() {
	return PSV_NEXT_CALIBRATION;
}

public void setPSV_NEXT_CALIBRATION(String pSV_NEXT_CALIBRATION) {
	PSV_NEXT_CALIBRATION = pSV_NEXT_CALIBRATION;
}

public String getGI_FLOW_CONTROL_VALVE() {
	return GI_FLOW_CONTROL_VALVE;
}

public void setGI_FLOW_CONTROL_VALVE(String gI_FLOW_CONTROL_VALVE) {
	GI_FLOW_CONTROL_VALVE = gI_FLOW_CONTROL_VALVE;
}

public String getGI_FIRE_WATER_SYSTEM() {
	return GI_FIRE_WATER_SYSTEM;
}

public void setGI_FIRE_WATER_SYSTEM(String gI_FIRE_WATER_SYSTEM) {
	GI_FIRE_WATER_SYSTEM = gI_FIRE_WATER_SYSTEM;
}

public String getGI_GAS_DETECTION_SYSTEM() {
	return GI_GAS_DETECTION_SYSTEM;
}

public void setGI_GAS_DETECTION_SYSTEM(String gI_GAS_DETECTION_SYSTEM) {
	GI_GAS_DETECTION_SYSTEM = gI_GAS_DETECTION_SYSTEM;
}

public String getGI_LAST_REVIEW_AUDIT_COMM() {
	return GI_LAST_REVIEW_AUDIT_COMM;
}

public void setGI_LAST_REVIEW_AUDIT_COMM(String gI_LAST_REVIEW_AUDIT_COMM) {
	GI_LAST_REVIEW_AUDIT_COMM = gI_LAST_REVIEW_AUDIT_COMM;
}

public String getGI_LAST_REVIEW_REG_COMM() {
	return GI_LAST_REVIEW_REG_COMM;
}

public void setGI_LAST_REVIEW_REG_COMM(String gI_LAST_REVIEW_REG_COMM) {
	GI_LAST_REVIEW_REG_COMM = gI_LAST_REVIEW_REG_COMM;
}

public String getGI_REMARK() {
	return GI_REMARK;
}

public void setGI_REMARK(String gI_REMARK) {
	GI_REMARK = gI_REMARK;
}

public String getPT_MAX_ERROR() {
	return PT_MAX_ERROR;
}

public void setPT_MAX_ERROR(String pT_MAX_ERROR) {
	PT_MAX_ERROR = pT_MAX_ERROR;
}

public String getPT_MIN_ERROR() {
	return PT_MIN_ERROR;
}

public void setPT_MIN_ERROR(String pT_MIN_ERROR) {
	PT_MIN_ERROR = pT_MIN_ERROR;
}

public String getPT_MAX_ALLOW() {
	return PT_MAX_ALLOW;
}

public void setPT_MAX_ALLOW(String pT_MAX_ALLOW) {
	PT_MAX_ALLOW = pT_MAX_ALLOW;
}

public String getPT_MIN_ALLOW() {
	return PT_MIN_ALLOW;
}

public void setPT_MIN_ALLOW(String pT_MIN_ALLOW) {
	PT_MIN_ALLOW = pT_MIN_ALLOW;
}

public String getTT_MAX_ERROR() {
	return TT_MAX_ERROR;
}

public void setTT_MAX_ERROR(String tT_MAX_ERROR) {
	TT_MAX_ERROR = tT_MAX_ERROR;
}

public String getTT_MIN_ERROR() {
	return TT_MIN_ERROR;
}

public void setTT_MIN_ERROR(String tT_MIN_ERROR) {
	TT_MIN_ERROR = tT_MIN_ERROR;
}

public String getTT_MAX_ALLOW() {
	return TT_MAX_ALLOW;
}

public void setTT_MAX_ALLOW(String tT_MAX_ALLOW) {
	TT_MAX_ALLOW = tT_MAX_ALLOW;
}

public String getTT_MIN_ALLOW() {
	return TT_MIN_ALLOW;
}

public void setTT_MIN_ALLOW(String tT_MIN_ALLOW) {
	TT_MIN_ALLOW = tT_MIN_ALLOW;
}

@Override
public String toString() {
	return "ExcelColumn [SAP_ID=" + SAP_ID + ", REGION=" + REGION + ", MAINT_BASE=" + MAINT_BASE + ", CONSUMER_NAME="
			+ CONSUMER_NAME + ", PROCESS_FLUID=" + PROCESS_FLUID + ", TYPE=" + TYPE + ", DESIGN_CAPACITY="
			+ DESIGN_CAPACITY + ", AVG_PRESSURE=" + AVG_PRESSURE + ", AVG_TEMP=" + AVG_TEMP + ", AVG_DAILY_CONSUMPTION="
			+ AVG_DAILY_CONSUMPTION + ", NO_OF_STREAM=" + NO_OF_STREAM + ", MM_REMARKS=" + MM_REMARKS
			+ ", CONFIGURATION=" + CONFIGURATION + ", CREATED_BY=" + CREATED_BY + ", METERING_TYPE=" + METERING_TYPE
			+ ", CONNECTIVITY=" + CONNECTIVITY + ", STREAM_INDEX=" + STREAM_INDEX + ", MET_ID=" + MET_ID
			+ ", PRIMARY_MAKE=" + PRIMARY_MAKE + ", PRIMARY_MODEL=" + PRIMARY_MODEL + ", PRIMARY_TAG_NO="
			+ PRIMARY_TAG_NO + ", PRIMARY_SERIAL_NO=" + PRIMARY_SERIAL_NO + ", PRIMARY_METER_SIZE=" + PRIMARY_METER_SIZE
			+ ", PRIMARY_PRESSURE_CLASS=" + PRIMARY_PRESSURE_CLASS + ", PRIMARY_G_RATING=" + PRIMARY_G_RATING
			+ ", PRIMARY_Q_MAX=" + PRIMARY_Q_MAX + ", PRIMARY_Q_MIN=" + PRIMARY_Q_MIN + ", PRIMARY_ORIFICE_DIA="
			+ PRIMARY_ORIFICE_DIA + ", PRIMARY_TUBE_DIAMETER=" + PRIMARY_TUBE_DIAMETER + ", KFACTOR=" + KFACTOR
			+ ", PRIMARY_CREATED_AT=" + PRIMARY_CREATED_AT + ", ORIFICE_LD_CALIBRATION=" + ORIFICE_LD_CALIBRATION
			+ ", ORIFICE_ND_CALIBRATION=" + ORIFICE_ND_CALIBRATION + ", ORIFICE_CALIBRATION_AGENCY="
			+ ORIFICE_CALIBRATION_AGENCY + ", ORIFICE_LD_METER_INTERNAL_INSP=" + ORIFICE_LD_METER_INTERNAL_INSP
			+ ", ORIFICE_ND_METER_INTERNAL_INSP=" + ORIFICE_ND_METER_INTERNAL_INSP + ", ORIFICE_INSP_DATA_UPDATE_IN_FC="
			+ ORIFICE_INSP_DATA_UPDATE_IN_FC + ", ORIFICE_CREATED_AT=" + ORIFICE_CREATED_AT + ", TR_LD_CALIBRATION="
			+ TR_LD_CALIBRATION + ", TR_ND_CALIBRATION=" + TR_ND_CALIBRATION + ", TR_CALIBRATION_AGENCY="
			+ TR_CALIBRATION_AGENCY + ", TR_LD_ERROR_UPDATION=" + TR_LD_ERROR_UPDATION + ", TR_LD_METER_INTERNAL_INSP="
			+ TR_LD_METER_INTERNAL_INSP + ", TR_ND_METER_INTERNAL_INSP=" + TR_ND_METER_INTERNAL_INSP
			+ ", TR_LD_METERTUBE_INSPECTION=" + TR_LD_METERTUBE_INSPECTION + ", TR_ND_METERTUBE_INSPECTION="
			+ TR_ND_METERTUBE_INSPECTION + ", TR_CREATED_AT=" + TR_CREATED_AT + ", USM_LD_CALIBRATION="
			+ USM_LD_CALIBRATION + ", USM_ND_CALIBRATION=" + USM_ND_CALIBRATION + ", USM_CALIBRATION_AGENCY="
			+ USM_CALIBRATION_AGENCY + ", USM_LD_ERROR_UPDATION=" + USM_LD_ERROR_UPDATION
			+ ", USM_LD_METER_INTERNAL_INSP=" + USM_LD_METER_INTERNAL_INSP + ", USM_ND_METER_INTERNAL_INSP="
			+ USM_ND_METER_INTERNAL_INSP + ", USM_LD_METERTUBE_INSPECTION=" + USM_LD_METERTUBE_INSPECTION
			+ ", USM_ND_METERTUBE_INSPECTION=" + USM_ND_METERTUBE_INSPECTION + ", USM_LD_HEALTH_MONITORING="
			+ USM_LD_HEALTH_MONITORING + ", USM_ND_HEALTH_MONITORING=" + USM_ND_HEALTH_MONITORING
			+ ", USM_LD_SOS_VERIFICATION=" + USM_LD_SOS_VERIFICATION + ", USM_ND_SOS_VERIFICATION="
			+ USM_ND_SOS_VERIFICATION + ", USM_STREAM_CONFIGURED=" + USM_STREAM_CONFIGURED
			+ ", USM_OP_CUST_TRAN_INVOICE=" + USM_OP_CUST_TRAN_INVOICE + ", USM_CREATED_AT=" + USM_CREATED_AT
			+ ", CORIOLIS_LD_CALIBRATION=" + CORIOLIS_LD_CALIBRATION + ", CORIOLIS_ND_CALIBRATION="
			+ CORIOLIS_ND_CALIBRATION + ", CORIOLIS_CALIBRATION_AGENCY=" + CORIOLIS_CALIBRATION_AGENCY
			+ ", CORIOLIS_CALI_UPDATE_IN_METER=" + CORIOLIS_CALI_UPDATE_IN_METER + ", CORIOLIS_LD_METER_TUBE_INSP="
			+ CORIOLIS_LD_METER_TUBE_INSP + ", CORIOLIS_ND_METER_TUBE_INSP=" + CORIOLIS_ND_METER_TUBE_INSP
			+ ", CORIOLIS_CREATED_AT=" + CORIOLIS_CREATED_AT + ", FC_MAKE=" + FC_MAKE + ", FC_MODEL=" + FC_MODEL
			+ ", FC_POWER_SOURCE=" + FC_POWER_SOURCE + ", BP_CONTRACT_VALUE=" + BP_CONTRACT_VALUE
			+ ", BP_CONTRACT_UNIT=" + BP_CONTRACT_UNIT + ", BP_ASCONFIGURED_VALUE=" + BP_ASCONFIGURED_VALUE
			+ ", BP_ASCONFIGURED_UNIT=" + BP_ASCONFIGURED_UNIT + ", AP_SOURCE_TYPE=" + AP_SOURCE_TYPE + ", AP_SOURCE="
			+ AP_SOURCE + ", AP_FREQ_OF_UPDATION=" + AP_FREQ_OF_UPDATION + ", AP_DATA_USED_FOR_UPDATION="
			+ AP_DATA_USED_FOR_UPDATION + ", AP_LD_UPDATION=" + AP_LD_UPDATION + ", AP_ND_UPDATION=" + AP_ND_UPDATION
			+ ", AP_PRESENT_VALUE=" + AP_PRESENT_VALUE + ", AP_PRESENT_UNIT=" + AP_PRESENT_UNIT + ", CCM_ASPERCONTRACT="
			+ CCM_ASPERCONTRACT + ", CCM_ASCONFIGURED=" + CCM_ASCONFIGURED + ", HV_ASPERCONTRACT=" + HV_ASPERCONTRACT
			+ ", HV_ASCONFIGURED=" + HV_ASCONFIGURED + ", FC_TYPE=" + FC_TYPE + ", BT_CONTRACT_VALUE="
			+ BT_CONTRACT_VALUE + ", BT_CONTRACT_UNIT=" + BT_CONTRACT_UNIT + ", BT_ASCONFIG_VALUE=" + BT_ASCONFIG_VALUE
			+ ", BT_ASCONFIG_UNIT=" + BT_ASCONFIG_UNIT + ", AP_FREQ_OF_UPDATION_VAL=" + AP_FREQ_OF_UPDATION_VAL
			+ ", AP_DATA_USED_FOR_UPDATE_VAL=" + AP_DATA_USED_FOR_UPDATE_VAL + ", JOINT_CALI_FREQ=" + JOINT_CALI_FREQ
			+ ", LD_CALIBRATION=" + LD_CALIBRATION + ", NEXT_CALIBRATION_DATE=" + NEXT_CALIBRATION_DATE + ", PT_TYPE="
			+ PT_TYPE + ", PT_MAKE=" + PT_MAKE + ", PT_MODEL=" + PT_MODEL + ", PT_ACCURACY=" + PT_ACCURACY
			+ ", DIFF_PT_TYPE=" + DIFF_PT_TYPE + ", DIFF_PT_MAKE=" + DIFF_PT_MAKE + ", DIFF_PT_MODEL=" + DIFF_PT_MODEL
			+ ", DIFF_PT_ACCURACY=" + DIFF_PT_ACCURACY + ", TEMP_INP_TO_FC=" + TEMP_INP_TO_FC + ", TEMP_MAKE="
			+ TEMP_MAKE + ", TEMP_MODEL=" + TEMP_MODEL + ", TEMP_ACCURACY=" + TEMP_ACCURACY + ", RTD_TYPE=" + RTD_TYPE
			+ ", RTD_CLASS=" + RTD_CLASS + ", RTD_MAKE=" + RTD_MAKE + ", RTD_MODEL=" + RTD_MODEL
			+ ", RTD_LD_CALIBRATION=" + RTD_LD_CALIBRATION + ", IS_BARRIER_INSTALLED=" + IS_BARRIER_INSTALLED
			+ ", FB_PM_FREQ_RANGE=" + FB_PM_FREQ_RANGE + ", BARRIER_FREQ_RANGE=" + BARRIER_FREQ_RANGE
			+ ", LD_SIMULATION=" + LD_SIMULATION + ", SECONDARY_CREATED_AT=" + SECONDARY_CREATED_AT + ", GQ_DATASOURCE="
			+ GQ_DATASOURCE + ", GQ_FREQ=" + GQ_FREQ + ", GQ_DATA_USED=" + GQ_DATA_USED + ", GQ_UPDATE_FREQ="
			+ GQ_UPDATE_FREQ + ", GQ_UPDATE_METHOD=" + GQ_UPDATE_METHOD + ", LAB_DETAILS=" + LAB_DETAILS
			+ ", COMP_COVERED=" + COMP_COVERED + ", VALIDITY_DATE=" + VALIDITY_DATE + ", COMP_COVERED_VALUE="
			+ COMP_COVERED_VALUE + ", QALITY_DATA_SOURCE_VAL=" + QALITY_DATA_SOURCE_VAL + ", QALITY_DATA_USED_VAL="
			+ QALITY_DATA_USED_VAL + ", QALITY_DATA_METHOD_VAL=" + QALITY_DATA_METHOD_VAL + ", GC_MAKE=" + GC_MAKE
			+ ", GC_MODEL=" + GC_MODEL + ", GC_MEASUREMENT_CAPABILITY=" + GC_MEASUREMENT_CAPABILITY + ", MI_TYPE="
			+ MI_TYPE + ", MI_MAKE=" + MI_MAKE + ", MI_MODEL=" + MI_MODEL + ", MI_LD_CALIBRATION=" + MI_LD_CALIBRATION
			+ ", MI_ND_CALIBRATION=" + MI_ND_CALIBRATION + ", FS_TYPE=" + FS_TYPE + ", FS_DESIGN_CAPACITY="
			+ FS_DESIGN_CAPACITY + ", FS_FILTER_SIZE=" + FS_FILTER_SIZE + ", FS_MAKE=" + FS_MAKE + ", FS_MODEL="
			+ FS_MODEL + ", FS_TAG_NO=" + FS_TAG_NO + ", DF_DESIGN_CAPACITY=" + DF_DESIGN_CAPACITY + ", DF_FILTER_SIZE="
			+ DF_FILTER_SIZE + ", DF_MAKE=" + DF_MAKE + ", DF_MODEL=" + DF_MODEL + ", DF_TAG_NO=" + DF_TAG_NO
			+ ", PCV_P_SIZE=" + PCV_P_SIZE + ", PCV_PRESSURE_RATING=" + PCV_PRESSURE_RATING + ", PCV_TYPE=" + PCV_TYPE
			+ ", PCV_MAKE=" + PCV_MAKE + ", PCV_MODEL=" + PCV_MODEL + ", PCV_SETPOINT=" + PCV_SETPOINT + ", PCV_UNIT="
			+ PCV_UNIT + ", PCV_REM=" + PCV_REM + ", SDV_S_SIZE=" + SDV_S_SIZE + ", SDV_PRESSURE_RATING="
			+ SDV_PRESSURE_RATING + ", SDV_MAKE=" + SDV_MAKE + ", SDV_MODEL=" + SDV_MODEL + ", SDV_SETPOINT="
			+ SDV_SETPOINT + ", SDV_UNIT=" + SDV_UNIT + ", SDV_REM=" + SDV_REM + ", PSV_C_TYPE=" + PSV_C_TYPE
			+ ", PSV_C_SIZE=" + PSV_C_SIZE + ", PSV_PRESSURE_RATING=" + PSV_PRESSURE_RATING + ", PSV_MAKE=" + PSV_MAKE
			+ ", PSV_MODEL=" + PSV_MODEL + ", PSV_SETPOINT=" + PSV_SETPOINT + ", PSV_UNIT=" + PSV_UNIT + ", PSV_REM="
			+ PSV_REM + ", PSV_LAST_CALIBRATION=" + PSV_LAST_CALIBRATION + ", PSV_NEXT_CALIBRATION="
			+ PSV_NEXT_CALIBRATION + ", GI_FLOW_CONTROL_VALVE=" + GI_FLOW_CONTROL_VALVE + ", GI_FIRE_WATER_SYSTEM="
			+ GI_FIRE_WATER_SYSTEM + ", GI_GAS_DETECTION_SYSTEM=" + GI_GAS_DETECTION_SYSTEM
			+ ", GI_LAST_REVIEW_AUDIT_COMM=" + GI_LAST_REVIEW_AUDIT_COMM + ", GI_LAST_REVIEW_REG_COMM="
			+ GI_LAST_REVIEW_REG_COMM + ", GI_REMARK=" + GI_REMARK + ", PT_MAX_ERROR=" + PT_MAX_ERROR
			+ ", PT_MIN_ERROR=" + PT_MIN_ERROR + ", PT_MAX_ALLOW=" + PT_MAX_ALLOW + ", PT_MIN_ALLOW=" + PT_MIN_ALLOW
			+ ", TT_MAX_ERROR=" + TT_MAX_ERROR + ", TT_MIN_ERROR=" + TT_MIN_ERROR + ", TT_MAX_ALLOW=" + TT_MAX_ALLOW
			+ ", TT_MIN_ALLOW=" + TT_MIN_ALLOW + "]";
}


}

