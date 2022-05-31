package site.metacoding.study.ex03.protoss;

public class Zealot {
	private final String name; // 이름
	private static int power = 10; // 공격력
	private static int armor = 10; // 방어력
	private int hp; // 체력
	private int sh; //  쉴드(보호막)
	
	// 상대방의 상태
	public void attack() {}
	
	public void powerUpgrade() {
		power++;
		System.out.println("공격력이 1증가하였습니다.");
	}
	
	public void armorUpgrade() {
		armor++;
		System.out.println("방어력이 1증가하였습니다.");
	}

	public Zealot(String name) {
		super();
		this.name = name;
		this.hp = 100;
		this.sh = 100;
	}
}
