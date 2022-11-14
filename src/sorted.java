import java.util.List;

public class sorted {
    static void sort(List<Movie> array, int lowindex, int highIndex){
        if(lowindex>=highIndex){
            return;
        }

        Integer pivot = array.get(highIndex).year;
        int leftp = lowindex;
        int rightp =highIndex;

        //sort the array each run
        while(leftp<rightp){
            while (array.get(leftp).year<= pivot && leftp<rightp){
                leftp++;
            }
            while (array.get(rightp).year>= pivot && leftp<rightp){
                rightp--;
            }

            swap(array, leftp,rightp);

        }

        //swap the pivot with the meet index
        swap(array, leftp, highIndex);

        //sort left side
        sort(array,lowindex,leftp-1);

        //sort right side
        sort(array,leftp,highIndex);
    }

    private static void swap(List<Movie> array, int index1, int index2){
        Movie temp = array.get(index1);
        Movie temp2 = array.get(index2);
        array.set(index1,temp2);
        array.set(index2,temp);


    }}