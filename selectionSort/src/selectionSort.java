public class selectionSort{

   void selectionSort(int array[]){
        int size = array.length;
        for(int i = 0; i < size - 1; i++){
            int min = i;
            for(int j = i + 1; j < size; j++){
                if(array[j] < array[min]){
                    min = j;
                }

            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }
    }
}
