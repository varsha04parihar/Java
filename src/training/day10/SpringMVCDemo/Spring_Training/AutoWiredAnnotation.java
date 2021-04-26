package SpringMVCDemo.Spring_Training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class AutoWiredAnnotation
{
	//value and auto wired annotation
	
	@Value("111")
	private int id;
	@Value("Jimin")
	private String name;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	
	@Autowired
	public void setDate(Date date) 
	{	
		System.out.println("Date setter");
		this.date = date;
	}
	@Override
	public String toString() {
		return "AutoWiredAnnotation [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	
	

	
}
