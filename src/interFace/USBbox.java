package interFace;
//���ؽӿڵ�ʵ��  ��,��  
//һ�������ʵ�ֶ���ӿ�
public class USBbox implements USB,Boom{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.print("��Դ�ѽ�ͨ��");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("��ʼ������");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.print("��Դ�Ͽ���");
		boom();
	}

	@Override
	public void boom() {
		// TODO Auto-generated method stub
		System.out.print("BOOM!!");
	}
	
	public void say () {
		System.out.print("�һᱬըŶ��");
	}
	
}
