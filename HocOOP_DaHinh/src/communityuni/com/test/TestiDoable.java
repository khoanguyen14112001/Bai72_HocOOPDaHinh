package communityuni.com.test;

import communityuni.com.model.NhanVien;
import communityuni.com.model.SinhVien;
import communityuni.com.model.iDoable;

public class TestiDoable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iDoable x;
		x = new NhanVien();
		x.doSomething();
		x = new SinhVien();
		x.doSomething();

	}

}
