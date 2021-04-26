package SpringMVCDemo.Spring_Training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ca")
public class ComponentAnnotation
{
	@Value("1111")
	private int id;
	@Value("Jennie")
	private String name;
	private Address add;
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
	public Address getAddress() {
		return add;
	}
	public void setAddress(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "ComponentAnnotation [id=" + id + ", name=" + name + ", address=" + add + "]";
	}
	
	

}
