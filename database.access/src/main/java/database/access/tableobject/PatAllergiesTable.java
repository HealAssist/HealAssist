package database.access.tableobject;

public class PatAllergiesTable extends DatabaseTable {
	public static final String TABLE_NAME = PatAllergiesEnum.TABLE_NAME.toString();
	public static final String ALLERGY_ID = PatAllergiesEnum.ALLERGY_ID.toString();
	public static final String ALLERGY_TYPE = PatAllergiesEnum.ALLERGY_TYPE.toString();
	public static final String ALLERGY_REACTION = PatAllergiesEnum.ALLERGY_REACTION.toString();
	public static final String ALLERGY_STATUS = PatAllergiesEnum.ALLERGY_STATUS.toString();
	public static final String PATIENT_CHART_ID = PatAllergiesEnum.PATIENT_CHART_ID.toString();
	
	public PatAllergiesTable(){
		super();
		this.setTableName(TABLE_NAME);
	}			
	public PatAllergiesTable addAllergyId(String newId){		
		this.addNumAttr(ALLERGY_ID, newId);
		return this;
	}
	public PatAllergiesTable addAllergyType(String newType){		
		this.addStrAttr(ALLERGY_TYPE, newType);
		return this;
	}
	public PatAllergiesTable addAllergyReaction(String newReaction){		
		this.addStrAttr(ALLERGY_REACTION, newReaction);
		return this;
	}
	public PatAllergiesTable addAllergyStatus(String newStatus){		
		this.addStrAttr(ALLERGY_STATUS, newStatus);
		return this;
	}
	public PatAllergiesTable addPatientChartId(String newId){		
		this.addNumAttr(PATIENT_CHART_ID, newId);
		return this;
	}
}
