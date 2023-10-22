public class StudentDemo {
	public static void main(String[] args) {
		Student maria = new Student("Maria", "Informatics", 21);
		Student peter = new Student("Peter", "Mathematics", 19);
		Student georgi = new Student("Georgi", "Informatics", 18);
		
		System.out.println("Maria year in college: " + maria.yearInCollage);
		
		for (int i = 0; i < 5; i++) {
			maria.upYear();
		}
		
		System.out.println("Maria year in college: " + maria.yearInCollage);
		
		System.out.println("Maria money: " + maria.money);
		maria.receiveScholarship(3, 200);
		System.out.println("Maria money: " + maria.money);
	}
}
