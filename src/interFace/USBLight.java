package interFace;
//USB�ӿڵ�ʵ����
public class USBLight implements USB{

	@Override
	public void start() {
		System.out.print("��Դ��ͨ��");
	}

	@Override
	public void run() {
		System.out.print("USB�ƹ����գ�");
	}

	@Override
	public void close() {
		System.out.print("��Դ�Ͽ���");
	}

}
