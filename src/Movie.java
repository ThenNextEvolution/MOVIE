import java.io.*;

import java.sql.Array;
import java.text.DecimalFormat;
import java.util.*;




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
        System.out.println(movie.movid+" name: "+movie.movname+" rate: "+movie.movrate+" year:"+movie.year+" views:"+movie.views);
        //System.out.println();

    }
    public static List<Movie> create() throws FileNotFoundException {
        File names = new File("names.log");
        File ids = new File("ids.log");
        File years = new File("year.log");

        //System.out.println(names.exists());

        Scanner sc2 = new Scanner(ids);
        Scanner sc3 = new Scanner(years);
        Scanner sc = new Scanner(names);


        List<Movie> hold = new ArrayList<>();
        //System.out.println(sc.nextLine());
        //sc.
        while (sc.hasNext()) {
            //Movie c = new Movie(sc2.nextLine(),"ghost",2024);c.print(c);
            {
                //String name = sc.nextLine();
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

    public static void compyear() throws FileNotFoundException {
        List<Movie> fo = create();
        for (Movie o : fo) {
            o.print(o);
            //System.out.println(o.movname);
        }
        System.out.println(" orginal");
        sorted sor = new sorted();
        List<Movie> sortmov = sorted.sort(fo,0, fo.size()-1);


        for (Movie o : sortmov) {
            o.print(o);
            //System.out.println(o.movname);
        }
        System.out.println(" you ");



    }
    public static void comprate() throws FileNotFoundException {
        List<Movie> fo = create();
        for (Movie o : fo) {
            o.print(o);
            //System.out.println(o.movname);
        }
        System.out.println(" orginal");
        sortedrate sor = new sortedrate();
        List<Movie> sortmov = sorted.sort(fo,0, fo.size()-1);


        for (Movie o : sortmov) {
            o.print(o);
            //System.out.println(o.movname);
        }
        System.out.println(" you ");

    }
    public static List<Movie> searchrate(List<Movie> rec,double s){
        List<Movie> hold = new ArrayList<>();
        for (Movie mov:rec) {
            if (mov.movrate<= s+1.0 && mov.movrate>= s-1.0){
                hold.add(mov);
            };
        }
        return hold;
    };
    public static List<Movie> searchyear(List<Movie> rec,double s){
        List<Movie> hold = new ArrayList<>();
        for (Movie mov:rec) {
            if (mov.year<= s+1.0 && mov.year>= s-1.0){
                hold.add(mov);
            };
        }
        return hold;
    };






    //ArrayList<T> movid,
    public static void main(String[] args) throws FileNotFoundException {

        //compyear();
        //comprate();
        //searchrate(create(),1.0);
        System.out.println("com");
        for (Movie o : searchrate(create(),1.0)) {
            o.print(o);
            System.out.println("com");
        }


        //for (item:fo){



    };
}