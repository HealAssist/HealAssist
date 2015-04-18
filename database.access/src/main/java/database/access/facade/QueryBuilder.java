package database.access.facade;

public class QueryBuilder {
	private String query;
	
	private void setQueryString(String newText){
		this.query = newText;
	}
	
	public QueryBuilder(){
		init();
	}
	private void init(){
		setQueryString("");
	}
}
