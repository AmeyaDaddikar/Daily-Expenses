package Daily1;

import java.time.LocalDateTime;
import java.util.*;

public class Data {

	private String description;
	private LocalDateTime data_time;
	int amount;
	Scanner sc=new Scanner(System.in);
	public Data(){
		this.description = "";
		this.data_time   = LocalDateTime.now();	
		amount=sc.nextInt();
	}
	
	public Data(String description){
		this.description = description;
		this.data_time   = LocalDateTime.now();
		amount=sc.nextInt();
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public LocalDateTime getTime(){
		return this.data_time;
	}
}
