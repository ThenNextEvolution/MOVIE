import java.io.*;

import java.sql.Array;
import java.text.DecimalFormat;
import java.util.*;

//public class Sorted {
//    static void sort(List<Movie> array, int lowindex, int highIndex){
//        if(lowindex>=highIndex){
//            return;
//        }
//
//        Movie pivot = array.get(highIndex);
//         int leftp = lowindex;
//        int rightp =highIndex;
//
//        //sort the array each run
//        while(leftp<rightp){
//            while (array.get[leftp]<= pivot && leftp<rightp){
//                leftp++;
//            }
//            while (array.get[rightp]>= pivot && leftp<rightp){
//                rightp--;
//            }
//
//            swap(array, leftp,rightp);
//
//        }
//
//        //swap the pivot with the meet index
//        swap(array, leftp, highIndex);
//
//        //sort left side
//        sort(array,lowindex,leftp-1);
//
//        //sort right side
//        sort(array,leftp,highIndex);
//    }
//
//    private static void swap(List<Movie> array,int index1, int index2){
//        Movie temp = array.get(index1);
//        Movie temp2 = array.get(index2);
//        array.set(index1,temp2);
//        array.set(index2,temp);
//
//
//    }



public class Movie{
    String movname;
    Integer movid,year,views;
    double movrate;
    public static final DecimalFormat df1 = new DecimalFormat( "#.##" );

    public Movie(Integer id, String name, Integer year){
        setMovname(name);
        setMovid(id);

        setYear(year);
        setMovrate(Double.parseDouble(df1.format(Math.random()*10)));
        setViews((int) (Math.random()*1000000));
    }

    public void setMovid(Integer movid) {
        this.movid = movid;
    }

    public void setMovname(String movname) {
        this.movname = movname;
    }

    public void setMovrate(double movrate) {
        this.movrate = movrate;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getMovid() {
        return movid;
    }
    public void print(Movie movie){
       // System.out.print(movie.movid+" name: "+movie.movname+" rate: "+movie.movrate+" year:"+movie.year+" views:"+movie.views);
        //System.out.println();

    }
    public static List<Movie> create() throws FileNotFoundException {
        File names = new File("names.log");
        File ids = new File("ids.log");
        File years = new File("year.log");

        System.out.println(names.exists());

        Scanner sc2 = new Scanner(ids);
        Scanner sc3 = new Scanner(years);
        Scanner sc = new Scanner(names);


        List<Movie> hold = new ArrayList<>();
        while (sc.hasNextLine()) {
            //Movie c = new Movie(sc2.nextLine(),"ghost",2024);c.print(c);
            if (!Objects.equals(sc.nextLine(), "")) {
                String name = sc.nextLine();
                //hold = new List<Movie>();

                Movie c = new Movie(sc2.nextInt(), sc.nextLine(), sc3.nextInt());
                c.print(c);
                hold.add(c);

                //System.out.println(sc.nextLine()+"v"+sc2.nextInt()+"v"+sc3.nextInt());
            }
        }

        return hold;
    }

    public static Object[] readdate(List<Movie> sent){
        Object[] mov =  sent.toArray();
        System.out.println(Arrays.toString(mov));

        return mov;
    }

    public List readdatelist(List<Movie> sent) throws FileNotFoundException {
       return sent;}

    public static void searchyear() throws FileNotFoundException {
        List<Movie> fo = create();
        sorted sor = new sorted();
        List<Movie> sortmov = sorted.sort(fo,0, fo.size()-1);

        for (Movie o : sortmov) {
            o.print(o);

        }




    }






    //ArrayList<T> movid,
    public static void main(String[] args) throws FileNotFoundException {
            System.out.println("Hello world!");
       // ArrayList<> hold =new ArrayList<ArrayList>();
        //Movie c = new Movie(1,"ghost",2024);
        //c.print(c);

        File names = new File("names.log");
        File ids = new File("ids.log");
        File years = new File("year.log");

        System.out.println(names.exists());

        Scanner sc2 = new Scanner(ids);
        Scanner sc3 = new Scanner(years);
        Scanner sc = new Scanner(names);


        while (sc.hasNextLine()){
            //Movie c = new Movie(sc2.nextLine(),"ghost",2024);c.print(c);
            if (!Objects.equals(sc.nextLine(), "")){
                String name = sc.nextLine();

                Movie   c  = new Movie(sc2.nextInt(),sc.nextLine(), sc3.nextInt());c.print(c);
                //System.out.println(sc.nextLine()+"v"+sc2.nextInt()+"v"+sc3.nextInt());
                }}

//        List<Movie> fo = create();
//        for (Movie o : fo) {
//            o.print(o);
//
//        }
        searchyear();


        //for (item:fo){



    };
}