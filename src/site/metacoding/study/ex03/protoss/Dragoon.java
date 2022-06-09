package site.metacoding.study.ex03.protoss;

public class Dragoon {
	public final String name; // 이름
	private static int power = 15; // 공격력
	private static int armor = 5; // 방어력
	private int hp; // 체력
	
	public int getPower() {
		return power;
	}
	
	public void 공격당함(Dragoon unit) {
		hp = hp - unit.getPower();
		System.out.println(this.name+"가 "+unit.name+"에게 공격당했습니다. 현재 hp : "+this.hp);
	}
	
	public void 공격당함(Zealot unit) {
		hp = hp - unit.getPower();
		System.out.println(this.name+"가 "+unit.name+"에게 공격당했습니다. 현재 hp : "+this.hp);
	}
	
	public void powerUpgrade() {
		power++;
		System.out.println("공격력이 1증가하였습니다.");
	}
	
	public void armorUpgrade() {
		armor++;
		System.out.println("방어력이 1증가하였습니다.");
	}

	public Dragoon(String name) {
		super();
		this.name = name;
		this.hp = 100;
	}
}
