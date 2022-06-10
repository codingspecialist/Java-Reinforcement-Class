package site.metacoding.study.ex03;

import site.metacoding.study.ex03.protoss.Dragoon;
import site.metacoding.study.ex03.protoss.Zealot;

public class App {
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1");
		Zealot z2 = new Zealot("질럿2");
		Dragoon d1 = new Dragoon("드라군1");
	
		z1.공격(z2);
		System.out.println(z1.name +"의 mp는 "+z1.getMp());
		System.out.println(z2.getHp());
		
		d1.공격(z1);
		System.out.println(d1.getMp());
		System.out.println(z1.getHp());
	}

}
