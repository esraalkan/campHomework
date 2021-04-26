package homework2;


public class Main {

	public static void main(String[] args) {
		Course course1= new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý C#+Angular", "Engin Demiroð");
		Course course2= new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý Java", "Engin Demiroð");
		Course course3= new Course(3,"Programalamaya Giri Ýçin Temel Kurs", "Engin Demiroð");
		
		User user1=new User(1,"Esra", "Demir","alkanesraa@gmail.com", "a12345");
		User user2=new User(1,"Ozan", "Demir","aabcd@gmail.com", "a12345");
		
		Course[] courses= {course1,course2,course3};
		User[] users= {user1,user2};
		
		System.out.println("-Kurslar");
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		System.out.println("--");
		
		System.out.println("-Kullanýcý Ad Soyadlarý");
		
		for (User user : users) {
			System.out.println(user.name + " " + user.surname);
		}
		
		System.out.println("--");
		
		CourseManagement courseManager=new CourseManagement();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);
		
		System.out.println("--");
		
		UserManagement userManager=new UserManagement();
		userManager.addUser(user1);
		userManager.addUser(user2);
		
		System.out.println("--");
		

	}

}
