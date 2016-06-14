import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sentence");
		String sentence = input.nextLine();
		Queue<String> queue = new LinkedList<String>();

		String[] temp;
		temp = sentence.split(" ");
		for (String s : temp) {
			if (s.length() > 3) {
				queue.offer(s);
			}
		}
		while (!queue.isEmpty()) {
			System.out.print(queue.poll());
			System.out.print(" ");
		}
		input.close();
	}
}
