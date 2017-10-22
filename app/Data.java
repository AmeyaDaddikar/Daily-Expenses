import java.time.LocalDateTime;

public class Data {

	private String description;
	private LocalDateTime data_time;
	
	public Data(){
		this.description = "";
		this.data_time   = LocalDataTime.now();	
	}
	
	public Data(String description){
		this.description = description;
		this.data_time   = LocalDataTime.now();
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public LocalDateTime getTime(){
		return this.data_time;
	}
}
