package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
		
		Hero hs1 = new Hero();
		Hero hs2 = new Hero();
		Hero hs3 = new Hero();
		
		hs1.setJob("워리어");
		hs1.setHp(18000);
		hs1.setMp(5000);
		hs1.setGender('남');
		hs1.setLevel(5);
		
		hs2.setJob("마법사");
		hs2.setHp(5000);
		hs2.setMp(25000);
		hs2.setGender('여');
		hs2.setLevel(2);

		hs3.setJob("힐러");
		hs3.setHp(10000);
		hs3.setMp(50000);
		hs3.setGender('남');
		hs3.setLevel(10);
		
		System.out.println("직업 : " + hs1.getJob());
		System.out.println("hp : " + hs1.getHp());
		System.out.println("mp : " + hs1.getMp());
		System.out.println("성별 : " + hs1.getGender());
		System.out.println("현재 레벨은 " + hs1.getLevel() + " 입니다.");
		System.out.println();
		System.out.println("직업 : " + hs2.getJob());
		System.out.println("hp : " + hs2.getHp());
		System.out.println("mp : " + hs2.getMp());
		System.out.println("성별 : " + hs2.getGender());
		System.out.println("현재 레벨은 " + hs2.getLevel() + " 입니다.");
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println(hs2.attack());
		System.out.println();
		System.out.println("직업 : " + hs1.getJob());
		System.out.println("hp : " + hs1.getHp());
		System.out.println("mp : " + hs1.getMp());
		System.out.println("성별 : " + hs1.getGender());
		System.out.println("현재 레벨은 " + hs1.getLevel() + " 입니다.");
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("직업 : " + hs3.getJob());
		System.out.println("hp : " + hs3.getHp());
		System.out.println("mp : " + hs3.getMp());
		System.out.println("성별 : " + hs3.getGender());
		System.out.println("현재 레벨은 " + hs3.getLevel() + " 입니다.");
		System.out.println();
		System.out.println(hs3.jump());

		
	}

}
	
