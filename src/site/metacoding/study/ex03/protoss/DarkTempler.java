package site.metacoding.study.ex03.protoss;

import site.metacoding.study.ex03.StarAble;

// 다형성 = 질럿은 질럿이기도 하고 프로토스 이기도 하다. (2가지 이름으로 부를 수 있다)
public class DarkTempler extends Protoss {
	public final String name; // 이름
	private static int power = 10; // 공격력
	private static int armor = 10; // 방어력
	private int hp; // 체력
	private int mp; // 마나

	public int getHp() {
		return this.hp;
	}

	public int getMp() {
		return this.mp;
	}

	public int getPower() {
		return power;
	}

	public void powerUpgrade() {
		power++;
		System.out.println("공격력이 1증가하였습니다.");
	}

	public void armorUpgrade() {
		armor++;
		System.out.println("방어력이 1증가하였습니다.");
	}

	public DarkTempler(String name) {
		super();
		this.name = name;
		this.hp = 100;
		this.mp = 100;
	}

	@Override
	public void 공격(Protoss unit) {
		this.mp = this.mp - 10;
		unit.공격당함(power);
	}

	@Override
	protected void 공격당함(int enemyPower) {
		hp = hp - enemyPower;
	}
}
