package 面向对象3;
/*
 * 封装
 */
public class a {
	public static void main(String[] args) {
		Person p=new Person();
		
		String n=p.getName();
		System.out.print(n);
		
        p.setName("pxj");
        n=p.getName();
		System.out.print(n);
		
		//getset快捷键  source键
	}
}