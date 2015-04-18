package database.access.query;

import java.util.Arrays;

public class SelectQuery extends QueryObject {		
	private SelectClause selectClause;
	private FromClause fromClause;
	private WhereClause whereClause;
	
	public SelectQuery(){ 
		super();		
		init();
	}		
	
	public void select(String selectClause){
		this.selectClause.setSelectClause(selectClause);
	}
	public void select(String[] columns){
		this.selectClause.setSelectClause(columns);
	}
	
	private void init(){
		this.setQueryStr("SELECT ");
	}
		
}
