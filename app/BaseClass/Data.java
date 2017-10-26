package Daily1;

import java.time.LocalDateTime;
import java.util.*;

public class Data {

	private String description;
	private LocalDateTime data_time;
	float amount;

	public Data(){
		this.description = "";
		this.data_time   = LocalDateTime.now();	
		this.amount = 0.0f;
	}
	
	public Data(String description, float amount){
		this.description = description;
		this.data_time   = LocalDateTime.now();
		this.amount = amount;
	}
	
	//RETURNS THE DESCRIPTION OF DATA
	public String getDescription(){
		return this.description;
	}

	
	//SETS A NEW DESCRIPTION, CAN BE USED IF USER WANTS TO ALTER DATA
	public String setDescription(String description){
		this.description = description;
	}
	
	//RETURNS THE TIME OF TRANSACTION OF THE DATA
	public LocalDateTime getTime(){
		return this.data_time;
	}
	
	//LocalDateTime can be created by 'of' method in LocalDateTime
	//https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html#of-int-int-int-int-int-int-int-
	//Any of the overloaded methods should do
	public void setTime(LocalDateTime new_time){
		this.data_time = new_time;
	}
	
	//SETS A NEW AMOUNT OF MONEY FOR THE DATA, CAN BE USED IF USER WANTS TO ALTER DATA
	public void setAmount(float amount){
		this.amount = amount;
	}
	
	//RETURNS THE AMOUNT OF DATA
	public float getAmount(){
		return amount;
	}
}
