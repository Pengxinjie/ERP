package interFace;
//多重接口的实现  “,”  
//一个类可以实现多个接口
public class USBbox implements USB,Boom{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.print("电源已接通！");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("开始启动！");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.print("电源断开！");
		boom();
	}

	@Override
	public void boom() {
		// TODO Auto-generated method stub
		System.out.print("BOOM!!");
	}
	
	public void say () {
		System.out.print("我会爆炸哦！");
	}
	
}
