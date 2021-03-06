package co.edu.friend;
// 친구의 주소록 : 이름, 연락처
// 학교친구 : 학교이름, 전공과목
// 회사친구 : 회사이름, 부서
public class Friend 
{
	// 필드
	private String name;
	private String phone;
	private Gender gender; // MEN, WOMEN; 열거형.
	
	// 생성자
	public Friend() {} // protected
	
	public Friend(String name, String phone) 
	{
		this.name = name;
		this.phone = phone;
	}
	
	public Friend(String name, String phone, Gender gender)
	{
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}
	
	// 메서드
	public String getName() 
	{
		return name;
	}

	public final void setName(String name) // final method> 오버라이딩이 불가능한 메서드. final class > 상속이 불가능한 클래스. 
	{
		this.name = name;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	
	

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() 
	{
		return "Friend [name=" + name + ", phone=" + phone + ", gender="+gender+"]";
	}

	
	
}
