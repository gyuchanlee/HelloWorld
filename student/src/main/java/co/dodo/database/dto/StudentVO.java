package co.dodo.database.dto;

import java.sql.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// 게터 세터 한방에가능
//
//@Getter
//@Setter
// @게터 세터 >> 롬복이 자동으로 맨뒤에 getter/setter를 만들어줌. 코드 간략화

// 한방에 @data로 getter/setter 만들기
// 롬복을 이클립스에 설치 후, pom에 내 프로젝트에도 의존성 설치.

public class StudentVO // 관례 명 : 테이블명VO
{
	// 데이터를 담아서 보내거나 데이터를 받아옴.
	// DTO : 데이터 교환을 할 때 사용.
	private String student_id;
	private String name;
	private Date birthday;
	private String major;
	private String address;
	private String tel;
	
	@Override
	public String toString()
	{
		System.out.print(" ( "+student_id+" : ");
		System.out.print(name+" : ");
		System.out.print(birthday+" : ");
		System.out.print(major+" : ");
		System.out.print(address+" : ");
		System.out.println(tel+" ) ");
		return null;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
