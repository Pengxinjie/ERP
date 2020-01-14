package interFace;
//USB接口的实现类
public class USBLight implements USB{

	@Override
	public void start() {
		System.out.print("电源连通！");
	}

	@Override
	public void run() {
		System.out.print("USB灯光普照！");
	}

	@Override
	public void close() {
		System.out.print("电源断开！");
	}

}
