package database.access.tableobject;

public class PhyPatientsTable extends DatabaseTable{		
		public static final String TABLE_NAME = PhyPatientsEnum.TABLE_NAME.toString();
		public static final String PHYSICIAN_USERNAME = PhyPatientsEnum.PHYSICIAN_USERNAME.toString();
		public static final String PATIENT_CHART_ID = PhyPatientsEnum.PATIENT_CHART_ID.toString();
		
		public PhyPatientsTable(){
			super();
			this.setTableName(TABLE_NAME);
		}				
		public PhyPatientsTable addPhysicianUsername(String newPhysicianUsername){		
			this.addStrAttr(PHYSICIAN_USERNAME, newPhysicianUsername);
			return this;
		}
		public PhyPatientsTable addPatientChartId(String newPatientChartId){				
			this.addStrAttr(PATIENT_CHART_ID, newPatientChartId);
			return this;
		}	
}
