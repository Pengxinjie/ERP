package interFace;

public class USBFan implements USB{

	@Override
	public void start() {
		System.out.print("风扇打开！");
	}

	@Override
	public void run() {
		System.out.print("风扇运转！");
	}

	@Override
	public void close() {
		System.out.print("风扇已关闭！");
	}

}
