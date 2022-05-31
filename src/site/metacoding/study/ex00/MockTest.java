package site.metacoding.study.ex00;

// Object = 실체화(인스턴스화 = new가 되나?)가 가능해야함.
abstract class 요리사{
	abstract public void 요리하다(); // 오버라이드됨
}

// 요리사
class 임꺽정 extends 요리사{

	@Override
	public void 요리하다() { // 재정의가 됨.
			System.out.println("요리를 시작합니다. 케이크가 만들어졌습니다.");
	}
	
}

// 사장
class 장보고{
	요리사 p1;
	
	public 장보고(요리사 p1) {
		this.p1 = p1;
	}
	
	public void 계산() {
		System.out.println("계산을 합니다.");
	}

}

class Mock임꺽정 extends 요리사{

	@Override
	public void 요리하다() {
		// stub
	}
	
}

public class MockTest {

	public static void main(String[] args) {
//		요리사 p = new 임꺽정();
//		장보고 s = new 장보고(p);
//		s.p1.요리하다();
		
		장보고 s = new 장보고(new Mock임꺽정());
		s.계산();
	}

}
