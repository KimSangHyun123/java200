package s083;

public class BillboardMain2 {
	public static void main(String[] args) {
		Billboard b1 = new Billboard(1,"Hello",1,"https://www.billboard.com/images/pref_images/q61808osztw.jpg","Adele");
		showAbout(b1);
		Billboard b = b1;
		showAbout(b);
	}
	public static void showAbout(Billboard bb) {
		String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(),bb.getSong(),bb.getLastweek(),bb.getImageSrc(),bb.getArtist());
		System.out.println(sf);

	}
}
