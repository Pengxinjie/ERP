package Exception;
/*
 *Java�쳣�������
 *
 * �쳣���ࣺ
 * 1.�������쳣
 * 2.����ʱ�쳣���﷨��ȷ��
 * �ٿ�ָ���쳣
 * �������쳣�����ĸΪ0
 * ������ת���쳣
 * �������±�Խ��
 * 
 * �쳣����
 * ʹ��try��catch��finall
 * 
 * try{
 *    //���ܳ����쳣�Ĵ���
 * }
 * catch(ParseExcetion e){
 * 	  //����ִ�еĴ���
 * }
 * finally{
 * 	  //�����Ƿ����쳣��Ҫִ�еĴ���
 * }
 * 
 * ������ֲ��쳣���³������
 * ����ͨ����ͬ�쳣���д���
 */
public class Test {
	public static void main(String[] args) throws RenpinException {
		
//		try {
//			int a=10;
//			int b=0;
//			int c=a/b;//�����쳣
//			System.out.print("�������У�");
//			
//			String s=null;
//			s.charAt(1);
//		} catch (Exception e) {//�����쳣
//			//���쳣������catch
//			System.out.print("�����쳣��");
//			System.out.print(e);
//			e.printStackTrace();
//			return;//���治��ִ�У�����finally
//		}finally {
//			System.out.print("������ζ�ִ��");
//		}
		Hello ho=null;
		try {
				ho.hi();
		} catch (NullPointerException e) {
			System.out.print("��ָ���쳣");
		}catch (RenpinException e) {
			System.out.print("��Ʒ�쳣");
		}
		
		
	}
}
