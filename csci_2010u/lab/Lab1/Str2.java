class Str2 {
	public static void main (String[] args) {
		String p1 = "Earth is ";
		int ea = 3;
		String p2 = " billion years old";
		String s = p1 + ea + p2;

		System.out.println(s);

		System.out.println("Sun is " + ea + 2 + " billion years old");
		System.out.println("Sun is " + (ea + 2) + " billion years old");
		
		//1 > 2

		// Escape squeneces

		System.out.println("1. I said \"Hello\" to you.");
		System.out.println("2. I said \nHello to you.");
		System.out.println("3. I said \tHello to you.");
		System.out.println("4. I said \b\bHello to you.");
		System.out.println("5. I said \fHello to you.");
		System.out.println("6. I said \\ Hello to you.");
	}
}