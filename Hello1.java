class Hello1 {
	
}
class Father{
	public final void print(){
		System.out.println("访问底层数据资源");
	}
}
class son extends Father{
	public void print(){
		System.out.println("哈哈");
	}
}