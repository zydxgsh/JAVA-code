class Test5_Animal {
	public static void main(String[] args) {
		Cat c1 = new Cat("��",4);
		System.out.println(c1.getColor() + "..." + c1.getLeg());
		c1.eat();
		c1.catchMouse();

		Dog d1 = new Dog("��",2);
		System.out.println(d1.getColor() + "..." + d1.getLeg());
		d1.eat();
		d1.lookHome();
	}
}
/*
* A:è����������
* B:������ʾ
	* è�������̳а�
	* ����:ë����ɫ,�ȵĸ���
	* ��Ϊ:�Է�
	* è������Ϊ:ץ����catchMouse
	* ��������Ϊ:����lookHome
*/

class Animal {
	private String color;					//ë����ɫ
	private int leg;						//�ȵĸ���

	public Animal(){}

	public Animal(String color,int leg) {
		this.color = color;
		this.leg = leg;
	}

	public void setColor(String color) {	//������ɫ
		this.color = color;
	}

	public String getColor() {				//��ȡ��ɫ
		return color;
	}

	public void setLeg(int leg) {			//�����ȵĸ���
		this.leg = leg;
	}

	public int getLeg() {					//��ȡ�ȵĸ���
		return leg;
	}

	public void eat() {						//�Է�
		System.out.println("�Է�");
	}
}

class Cat extends Animal {
	public Cat() {}							//�ղι���

	public Cat(String color,int leg) {		//�вι���
		super(color,leg);
	}

	public void eat() {						//����
		System.out.println("è����");
	}

	public void catchMouse() {				//ץ����
		System.out.println("ץ����");
	}
}

class Dog extends Animal {
	public Dog() {}							//�ղι���

	public Dog(String color,int leg) {		//�вι���
		super(color,leg);
	}

	public void eat() {						//����
		System.out.println("������");
	}

	public void lookHome() {				//����
		System.out.println("����");
	}
}