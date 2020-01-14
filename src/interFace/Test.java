package interFace;

public class Test {
	public static void main(String[] args) {
		USB li=new USBLight();
		li=new USBbox();
		li.start();
		li.run();
		li.close();
		
		USBbox t1=(USBbox)li;
		Boom t2=t1;
		t2.boom();
		
		t1.say();
	}
}