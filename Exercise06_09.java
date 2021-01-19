
public class Exercise06_09 {
	public static void main(String[] args) {
		System.out.println("Feet  Meters    Meters  Feet");
		System.out.println("-----------------------------");
		double foot = 1;
		double meter = 20;
		for (int z = 1; z < 11; z++) {
			footToMeter(foot);
			meterToFoot(meter);
			foot += 1;
			meter += 5;
			System.out.println();
			}
	}
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		System.out.printf("%-2.1f%9.3f", foot, meter);
		foot += 1;
		return foot;
	}
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		System.out.printf("%9.1f%9.3f", meter, foot);
		meter += 5;
		return meter;
		
	}

}
