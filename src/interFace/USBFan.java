package interFace;

public class USBFan implements USB{

	@Override
	public void start() {
		System.out.print("���ȴ򿪣�");
	}

	@Override
	public void run() {
		System.out.print("������ת��");
	}

	@Override
	public void close() {
		System.out.print("�����ѹرգ�");
	}

}
