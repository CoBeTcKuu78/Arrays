public class Main {
    public static void main(String[] args) {
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {902, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);

        }
        boolean arrayAreEqual = true;
        arrayAreEqual = weights.length == weightsCopy.length;
        if (arrayAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arrayAreEqual = false;

                }
            }
        }
        if (arrayAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        int maxWeight = -1;
        for (int weight : weights) {
            if (weight > maxWeight) {
                int current = weight;
                maxWeight = current;
            }

        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i+1] != 0; i++) {
            System.out.println(weights[i+1] - weights[i]);


        }
    }
}