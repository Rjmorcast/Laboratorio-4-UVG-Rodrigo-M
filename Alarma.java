public class Alarma extends Timbre {
	public void m1() {
		System.out.println("alarma 1");
	}
	 
	public void m2() {
		super.m1();
	}
	
	public void m3(){
		System.out.println("Alarma 1 / ");
		super.m1();
	}
	 
	public String toString() {
		return super.toString() + "â€" + super.toString();
	}
}