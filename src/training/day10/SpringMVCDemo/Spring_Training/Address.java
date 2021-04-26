package SpringMVCDemo.Spring_Training;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add")
public class Address 
{
	@Value("house no 3")
	private String houseNo;
	
	@Value("Pune city")
	private String city;
	
	@Value("India")
	private String country;

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", country=" + country + "]";
	}

	

}
