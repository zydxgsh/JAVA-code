class Demo7_Phone {
	public static void main(String[] args) {
		Ios8 i = new Ios8();
		i.siri();
		i.call();
	}
}

/*
B:������д��Ӧ�ã�
	* ��������Ҫ����Ĺ��ܣ������������������Լ���������ʱ��������д�����еķ���������������Ϯ�˸���Ĺ��ܣ��ֶ������������е����ݡ�
	ios7ϵͳ siri speak English
	ios8ϵͳ siri ˵����
*/

class Ios7 {
	public void call() {
		System.out.println("��绰");
	}

	public void siri() {
		System.out.println("speak English");
	}
}

class Ios8 extends Ios7 {
	public void siri() {
		
		System.out.println("˵����");
		super.siri();
	}
}