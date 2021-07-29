package static2;

public class Main {
	public static void main(String[] args) {
		//Asean 조원 없이도 Asean 조별점수는 조회 가능
		//System.out.println(Asean.score);
		
		Asean chae = new Asean(24, 23, 30);
		Asean jang = new Asean(25, 21, 30);
		Asean seo = new Asean(24, 24, 30);
		Asean jeong = new Asean(23, 23, 27);
		
		chae.showAseanInfo();
		jang.showAseanInfo();
		seo.showAseanInfo();
		jeong.showAseanInfo();
	}
}
