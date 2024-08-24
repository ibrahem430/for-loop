package loop;

public class loop {

	public static void main(String[] args) {
		System.out.println("hallo ");
//this is the list of all nationalites valid and not valid
		String[] nationality = { "jordan", "syria", "jordan", "oman", "egypt", "hello", "bye", "eraq" };
		// those are the name of the people in coptition
		String[] names = { "rowan", "layan", "ahmad", "ali", "anas", "omar", "haneen", "haya" };
		// the age of people
		int[] age = { 17, 18, 79, 80, 41, 8, 18, 34 };
		// this is the fillter for valid nationalites
		String[] validnationality = { "jordan", "syria", "oman", "egypt", "eraq" };
		for (int i = 0; i < names.length; i++) {
			boolean isvalidnationality = false;
			boolean isvalidage = age[i] > 17 && age[i] < 100;
			for (String validnationalityy : validnationality) {

				if (nationality[i].equalsIgnoreCase(validnationalityy)) {
					isvalidnationality = true;
					break;
				}

			}
			if (isvalidnationality && isvalidage) {
				if (nationality[i].equals("jordan") && age[i] >= 18) {
					// the people are jordanian and ages=>18.
					System.out.println("hay " + names[i] + " you have been selected");
				} else {
					// the people are not jordanian but the age >=18.
					System.out.println("sorry " + names[i] + " you have not been selected becose the nationality is "
							+ nationality[i] + " while is age is ok");
				}
			} else if (isvalidage == false && isvalidnationality) {
				// the people are jordanian but the age<18.
				System.out.println("sorry " + names[i] + " you have not been selected becouse the age is ander 18");

			}

		}
	}

}
