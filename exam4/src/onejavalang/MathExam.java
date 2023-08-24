package onejavalang;

import java.util.Random;

public class MathExam {
	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(4) + "    " + Math.pow(4, 0.5));//root
		System.out.println(Math.pow(8, 1/3.0));
		/*
		for( int i = 0; i < 10 + 1; i += 1) {
			System.out.println( Math.pow(2, i));
		}
		*/
		//round, ceil, floor => 사용할 때 정확하게 구분해서 사용해야 한다.
		System.out.println(Math.ceil(12.1));//올림
		System.out.println(Math.floor(12.1));//내림
		System.out.println(Math.round(12.1));//반올림
		
		for( int i = 1; i < 11; i += 1 ) {
			System.out.println(Math.random());// 0 < random() > 1
			System.out.println( (int)(Math.random()*100/*범위개수*/) + 101/*시작하는 숫자*/);//소수자 자리수 올리고 정수로표현
		}
		System.out.println("-------------------------------------");
		Random rnd = new Random();
		for( int i = 1; i < 11; i += 1 ) {
			System.out.println(rnd.nextDouble());// 0 < random() > 1
			System.out.println(rnd.nextInt(50/*범위개수*/)+ 101/*시작하는 숫자*/);
		}
		System.out.println("-------------------------------------");
		Random rnd1 = new Random(50);//seed 같은 공식으로 동일한 수를 랜덤으로 줌, 다른곳에서도 같은 숫자로 나옴
		//프리셸게임 seed 사용하고 있음, 번호 똑같이 부여됨 카드가 중복이 되면 안되기 때문에
		
		long st = System.nanoTime();//아래 for문이 돌아가는 시간
		long st1 = System.currentTimeMillis();
		for( int i = 1; i < 11; i += 1 ) {
			System.out.println(rnd1.nextInt(50/*범위개수*/)+ 101/*시작하는 숫자*/);
		}
		System.out.println(System.nanoTime() -st );
		System.out.println(System.currentTimeMillis() -st1 );
	}

}
