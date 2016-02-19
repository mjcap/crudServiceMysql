package com.capbpm;

public class ColumnMetadata {

	public String column_name;
	public String data_type;
	

	public String getData_type() {
		return data_type;
	}
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	@Override
	public String toString() {
		return "ColumnMetadata [column_name=" + column_name + ", data_type=" + data_type + "]";
	}
	public String getColumn_name() {
		return column_name;
	}
	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
	
}
