public class Demo {
	public static void main(String[] args) {
		Computer hp = new Computer();
		System.out.println(hp.operationSystem);
		hp.price = 1000.5;
		
		Computer dell = new Computer(2012, 2000, true, 500, 500, "Linux");
		
		int result = dell.comparePrice(hp);
//		if(result == -1) {
//			System.out.println("Dell is more expensive than hp");
//		} else {
//			if(result == 1) {
//				System.out.println("Dell is NOT more expensive than hp");
//			} else {
//				System.out.println("The computer have equals prices");
//			}
//		}
		
		
		switch (result) {
			case -1:
				System.out.println("Dell is more expensive than hp");
				break;
			case 1:
				System.out.println("Dell is NOT more expensive than hp");
				break;
			case 0:
				System.out.println("The computer have equals prices");
				break;
			default:
				System.out.println("Error !");
				break;
		}
		
	}
}
