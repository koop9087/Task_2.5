public class Calculate {
    public static int[] comparingNumber(int[] array) {
        int[] mas = new int[sizeOfArray(array)];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] > i) {
                mas[j] = array[i];
                j++;
            }
        }
        return mas;
    }

    private static int sizeOfArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                count++;
            }
        }
        return count;
    }
}