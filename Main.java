import java.util.Scanner;

class Main {
	static void runCalc() {
		double out1 = 0;
		Scanner inputDetect = new Scanner(System.in);
		System.out.print("\033[H\033[2J");
  	System.out.flush();
		System.out.println("\u001B[22;0mEnter operation (+, -, *, or /)\u001B[1;96m\n");
		String op = inputDetect.nextLine();
		System.out.println("\n\u001B[22;0mEnter first number\u001B[1;96m\n");
    double in1 = inputDetect.nextDouble();
		System.out.println("\n\u001B[22;0mEnter second number\u001B[1;96m\n");
		double in2 = inputDetect.nextDouble();
		int opDetector;
		opDetector = op.indexOf("+");
		if (opDetector != -1) {
			out1 = in1 + in2;
		}
		opDetector = op.indexOf("-");
		if (opDetector != -1) {
			out1 = in1 - in2;
		}
		opDetector = op.indexOf("*");
		if (opDetector != -1) {
			out1 = in1 * in2;
		}
		opDetector = op.indexOf("/");
		if (opDetector != -1) {
			out1 = in1 / in2;
		}
		
		System.out.println("\n\n\u001B[1;93m" + in1 + " " + op + " " + in2 + " = " + out1);
		System.out.println("\n\u001B[0mwould you like to do another problem? (true/false)");
		boolean cont = inputDetect.nextBoolean();
		if (cont == true) {
			runCalc();
		} else {
			try
				{
					System.out.print("\n\u001B[1;31mexiting...");
					Thread.sleep(1500);
					System.out.println("\rexit successful");
					System.exit(0);
				}
			catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
		}
	}
  public static void main(String[] args) {
		runCalc();
  }
}