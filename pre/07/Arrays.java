public class Arrays {

    public static double[] powArray(double[] array, double power){
      double[] accumulator = new double[array.length];
      for (int i=0;i<array.length;i++){
         accumulator[i] = Math.pow(array[i],power);
      }
      return accumulator;
   }
   
   public static int[] histogram(int[] array, int count){
      int[] counter = new int[count];
      for (int element:array){
         counter[element]++;
      }
      return counter;
   }


   public static int indexOfMax(int[] numbers){
      int index = 0;
      for (int i=1;i<numbers.length;i++){
         if (numbers[i] > numbers[index]){
            index = i;
         }
      }
      return index;
   }

   public static boolean[] sieve(int n){
      boolean[] result = new boolean[n];
      for (int i=2;i<n;i++)
         result[i] = true;
      for (int number=2;number<=(int)Math.sqrt(n);number++){
         if (result[number] == true){
            for (int indexInSeries = number*number;indexInSeries < n;indexInSeries += number){
               result[indexInSeries] = false;
            }
         }
      }
      return result;
   }
}
