package igre;

enum Vrednost {
	dva,tri,cetiri,pet,sest,sedam,osam,devet,deset,zandar,dama,kralj,as
}

enum Znak{pik,herc,karo,tref}

public class Karta {
	private Vrednost vrednost;
	private Znak znak;
	public Karta(Vrednost vrednost, Znak znak) {
		this.vrednost = vrednost;
		this.znak = znak;
	}
	public Vrednost getVrednost() {
		return vrednost;
	}
	public void setVrednost(Vrednost vrednost) {
		this.vrednost = vrednost;
	}
	public Znak getZnak() {
		return znak;
	}
	public void setZnak(Znak znak) {
		this.znak = znak;
	}
}
