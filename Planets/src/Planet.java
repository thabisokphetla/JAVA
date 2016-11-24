import java.util.Scanner;

public enum Planet {
		MERCURY(3.303e23+23,2.4397e6),
		VENUS (4.869e+24,6.0518e6),
		EARTH(5.976e+24,6.37814e6),
		MARS(6.421e23,3.3972e6),
		JUPITER(1.9e+27,7.1492e7),
		SATURN(5.688e+26,6.0268e7),
		URANUS(8.686e+25,2.5559e7),
		NEPTUNE(1.024e+26,2.4746e7);
		
		private final double mass;
		private final double radius;
		
		private Planet(double mass,double radius) {
			this.mass = mass;
			this.radius = radius;
		}

		public double mass() {
			return mass;
		}

		public double radius() {
			return radius;
		}
		public static final double G = 6.67300E-11;
		
		double surfaceGravity(){
			return G * mass/(radius*radius);
		}
		double surfaceWeight(double otherMass){
			return otherMass * surfaceGravity();
		}
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner key = new Scanner(System.in);
			System.out.print("Enter your weight : ");
			String w = key.nextLine();
			double earthWeight = Double.parseDouble(w);
			double mass = earthWeight/EARTH.surfaceGravity();
			for (Planet p : Planet.values()){
				System.out.printf("Your weight on %s is %f %n",p,p.surfaceWeight(mass));
			}
		}
}
