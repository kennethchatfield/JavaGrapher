package CGraph;

import java.util.concurrent.ThreadLocalRandom;

public class Utility {
	
	public static int getRandomInt(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
