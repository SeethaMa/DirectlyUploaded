package ifcondition;

public class UsePhone {
	public static void main(String[]args) {
		Phone p1=new Phone();
		p1.color="Red";
		p1.price=50000;
		p1.brand="Nokia";
		p1.isAndroid=true;
		Phone p2=new Phone();
		p2.color="Black";
		p2.price=450000;
		p2.brand="Vivo";
		p2.isAndroid=true;
		Phone p3=new Phone();
		p3.color="Silver";
		p3.price=55000;
		p3.brand="Oppo";
		p3.isAndroid=true;
		if (p1.price>p2.price&&p1.price>p3.price) {
		System.out.println("Max price mobile is "+(p1.brand.toUpperCase()));
		}
		else if (p2.price>p1.price&&p2.price>p3.price) {
		System.out.println("Max price mobile is "+(p2.brand.toUpperCase()));
		}
		else {
			System.out.println("Max price mobile is "+(p3.brand.toUpperCase()));
		}
		}
			
	}


