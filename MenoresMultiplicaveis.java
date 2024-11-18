import java.util.*;
import java.util.stream.Collectors;
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

		ArrayList<Integer> numeros = new ArrayList<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
//        ArrayList<Integer[]> numeros = new ArrayList<>(Collections.singleton(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
//        List<Integer[]> menorPossivel = new ArrayList<>(List.of(
//                new Integer[]{1, 2, 3},
//                new Integer[]{4, 5, 6}
//        ));
		List<Integer[]> menorPossivel = new ArrayList<>();

//        numeros.add(new Integer[]{1, 2, 3});
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.deepToString(numeros.toArray()));

		Integer[] array1 = {1, 2, 3};
		Integer[] array2 = {4, 5, 6};
		Integer[] arr = {0,0 ,0};
//        Integer[] array3 = nums;
		ArrayList<Integer[]> listaDeArrays = new ArrayList<>();
		listaDeArrays.add(array1);

		for (int i = 0; i < numeros.size(); i++) {
//            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
//            System.out.println(numeros.get(i));
			for (int j = 1; j < numeros.size(); j++) {
//                System.out.println(episodiosTemporada.get(j).titulo());

//                System.out.println(numeros.get(i) * numeros.get(j));
//menorPossivel.add(new Integer[]{});


				if ((numeros.get(i) * numeros.get(j)) == x) {
					System.out.println("i: " + numeros.get(i));
					System.out.println("j: " + numeros.get(j));
					menorPossivel.add(new Integer[]{numeros.get(i), numeros.get(j), numeros.get(i) + numeros.get(j)});
					System.out.println(Arrays.deepToString(menorPossivel.toArray()));
				}


			}
		}

//        for (int k = 0; k < menorPossivel.size(); k++) {
//            for (int l = k + 1; l < menorPossivel.size(); l++) {
//                if (menorPossivel.get(k).length > 3 && menorPossivel.get(l).length > 3) {
//                    if (menorPossivel.get(k)[3] < menorPossivel.get(l)[3]) {
//                        arr = menorPossivel.get(k); // System.out.println(menorPossivel.get(k)[3]);
//                    }
//
//                }
//            }
//        }


		System.out.println(menorPossivel.get(0)[2]);
		int k = 0;
		int l = 0;

		System.out.println("k: " + k);
		System.out.println("l: " + l);
		System.out.println(menorPossivel.size());

		while (k <= menorPossivel.size() - 1){
			System.out.println("k++: " + k);
			l = 0;
			while (l <= menorPossivel.size() - 1){
				System.out.println("l++: " + l);

				System.out.println("menor k: "+menorPossivel.get(k)[2]);
				System.out.println("menor l: "+menorPossivel.get(l)[2]);
				if (menorPossivel.get(k)[2] <= menorPossivel.get(l)[2]) {
//                if (menorPossivel.get(k)[2] < menorPossivel.get(l)[2]) {
					System.out.println(arr[2]);
					if (arr[2] == 0) {
						arr = menorPossivel.get(k);
					}
					if (menorPossivel.get(k)[2] < arr[2]) {

						arr = menorPossivel.get(k);
						System.out.println("menor: "+Arrays.toString(menorPossivel.get(k)));
					}

				}
				l++;
			}
			k++;
		}

		System.out.println(arr[2]);
		System.out.println("final: "+Arrays.toString(arr));
//        System.out.println("final: "+Arrays.deepToString(arr.toArray()));

//        // try {
//
//        int[] mtp = new int[] { 0, 0 };
//        int tamanho = nums.length;
//        int menorSomaPossivel = 0;
//
//        System.out.println(Arrays.toString(nums));
//        System.out.println(nums.length);
//
//        for (int i = 0; i < nums.length; i++) {
//            int kct = 0;
//            System.out.println("inicio:" + i);
//            System.out.println("nums[i]: " + nums[i]);
//
//            // int depois = i++;
//            for (int j = 0; j < nums.length; j++) {
//                System.out.println("nums[i+1]: " + nums[j]);
//                System.out.println("nums[i] * nums[i + 1]: " + (nums[i] * nums[j]));
//                // if ((nums[i] * nums[i + 1]) == x) {
//                // mtp = new int[] { i, i };
//                // }
//                if (((nums[i] * nums[j]) == x)) {
//                    // if (menorSomaPossivel == 0) {
//                    // menorSomaPossivel = nums[i] + nums[i++];
//                    // mtp = new int[] {i, i};
//                    // }
//                    // if ((nums[i] + nums[i++]) < menorSomaPossivel) {
//                    // menorSomaPossivel = nums[i] + nums[i++];
//                    System.out.println("valor bateu primeiro: " + i);
//                    System.out.println("valor bateu segundo: " + (j));
//                    // mtp = [ i, j ];
//                    // }
//                }
//            }
//
//        }

//        System.out.println(numeros);

//        int[] solucao = numeros.stream().mapToInt(Integer::intValue).toArray();
		int[] solucao = {arr[0],arr[1]};
		;

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