package maven.spring.assignment.Assignment7;

public class Student {

	public String name;
	public String ClassRoom;
	public int Id;
	Student(int id,String name,String classRoom){
		
		this.Id = id;
		this.name = name;
		this.ClassRoom = classRoom;
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setRollNum(String name) {
		name = name;
	}
	public String getClassRoom() {
		return ClassRoom;
	}
	public void setClassRoom(String classRoom) {
		ClassRoom = classRoom;
	}
	
}
