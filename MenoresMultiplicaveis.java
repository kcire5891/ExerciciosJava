import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MenoresMultiplicaveis {

	public static void main(String[] args) {
		// ****************************************
		// Não alterar o trecho de código abaixo
		// ****************************************

		Scanner scanner = new Scanner(System.in);
		int[] nums = Stream.of(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
		int x = scanner.nextInt();

		System.out.println(Arrays.toString(resolver(nums, x)));

		// ****************************************
		// Não alterar o trecho de código acima
		// ****************************************
	}

	public static int[] resolver(int[] nums, int x) {

		// ****************************************
		// Digite seu código aqui
		// ****************************************

		// try {

		int[] mtp = new int[] { 0, 0 };
		int tamanho = nums.length;
		int menorSomaPossivel = 0;

		System.out.println(Arrays.toString(nums));
		System.out.println(nums.length);

		for (int i = 0; i < nums.length; i++) {
			int kct = 0;
			System.out.println("inicio:" + i);
			System.out.println("nums[i]: " + nums[i]);

			// int depois = i++;
			for (int j = 0; j < nums.length; j++) {
				System.out.println("nums[i+1]: " + nums[j]);
				System.out.println("nums[i] * nums[i + 1]: " + (nums[i] * nums[j]));
				// if ((nums[i] * nums[i + 1]) == x) {
				// mtp = new int[] { i, i };
				// }
				if (((nums[i] * nums[j]) == x)) {
					// if (menorSomaPossivel == 0) {
					// menorSomaPossivel = nums[i] + nums[i++];
					// mtp = new int[] {i, i};
					// }
					// if ((nums[i] + nums[i++]) < menorSomaPossivel) {
					// menorSomaPossivel = nums[i] + nums[i++];
					System.out.println("valor bateu primeiro: " + i);
					System.out.println("valor bateu segundo: " + (j));
					// mtp = [ i, j ];
					// }
				}
			}

		}

		System.out.println(Arrays.toString(mtp));

		int[] solucao = mtp;

		// ****************************************
		// Para DEBUGAR utilize o System.err.println()
		// ****************************************

		System.err.println("My debug messages");

		return solucao;
		// } catch (Exception e) {
		// System.err.println(e);
		// }
	}
}