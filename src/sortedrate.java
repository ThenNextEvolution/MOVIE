import java.lang.reflect.Array;
import java.util.List;

public class sortedrate {
    static List<Movie> sort(List<Movie> array, int lowindex, int highIndex){
//
//        System.out.println(" orginal");
//        for (Movie o : array) {
//            o.print(o);
//            System.out.println(o.movname);
//        }
//        System.out.println(" orginal");
        if(lowindex>=highIndex){
            return array;
        }

        Integer pivot = array.get(highIndex).year;
        int leftp = lowindex;
        int rightp =highIndex;

        //sort the array each run
        while(leftp<rightp){
            while (array.get(leftp).movrate<= pivot && leftp<rightp){
                leftp++;
            }
            while (array.get(rightp).movrate>= pivot && leftp<rightp){
                rightp--;
            }
            // System.out.println(leftp+" you1 "+highIndex);
            swap(array, leftp,rightp);

        }

        //swap the pivot with the meet index
        //System.out.println(leftp+" you "+highIndex);
        swap(array, leftp, highIndex);
        //System.out.println(lowindex+" yooo "+highIndex);
        //sort left side
        sort(array,lowindex,leftp-1);

        //sort right side
        sort(array,leftp,highIndex);

        return array;
    }

    private static void swap(List<Movie> array, int index1, int index2){
        // System.out.println(index1+"pp"+index2);
        // System.out.println(array.get(index1).movname+"."+array.get(index2).movname);
        Movie temp = array.get(index1);
        Movie temp2 = array.get(index2);
        array.set(index1,temp2);
        array.set(index2,temp);
        //System.out.println(array.get(index1).movname+"..."+array.get(index2).movname);


    }}