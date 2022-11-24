import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;


public class Movie{ //MOvie class
    String movname;
    Integer movid,year,views;
    double movrate;
    public static final DecimalFormat df1 = new DecimalFormat( "#.##" );

    public Movie(Integer id, String name, Integer year){
        setMovname(name);//movie id, name, year, rate, views
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
    public void print(Movie movie){// get the movies in a array of movies, print all info
        System.out.println(movie.movid+" name: "+movie.movname+" rate: "+movie.movrate+" year:"+movie.year+" views:"+movie.views);
        //System.out.println();

    }
    public static List<Movie> create() throws FileNotFoundException {// creates new list of movies based on log files
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
            {

                Movie c = new Movie(sc2.nextInt(), sc.nextLine(), sc3.nextInt());
                //c.print(c);
                hold.add(c);

            }
        }

        return hold;
    }
    public static void make() throws IOException {
        FileWriter wr = new FileWriter("list.txt");
        List<Movie> hold = create();
        try {
                String v =("movid       views   movrate     year    name"+String.format("%n"));
            wr.write(v);
            for (Movie item:hold) {
                String g =item.movid.toString()+"    "+item.views.toString()+"   "+ item.movrate+"      "+item.year.toString()+"     "+item.movname+String.format("%n");
                wr.write(g,0,g.length()-1);
                //wr.
               // wr.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        wr.flush();
        wr.close();



    }

//    private String toString(Movie s) {
//        String hold = s.
//
//        return null;
//    }

    public static Object[] readdate(List<Movie> sent){//return arrayofmovies
        Movie[] arr =new Movie[sent.size()];
        for (Movie e:sent) {
            arr[sent.indexOf(e)]=e;
        }

        return arr;
    }

    public List readdatelist(List<Movie> sent) throws FileNotFoundException { // return list of movies already in list
       return sent;}

//    public  static void


    public  static class compy implements Comparator<Movie>{

        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.year.compareTo(o2.year);


        }
    }
    public  static class compr implements Comparator<Movie>{

        @Override
        public int compare(Movie o1, Movie o2) {
            return Double.compare(o1.movrate, o2.movrate);


        }
    }


    public static void compyear() throws FileNotFoundException { //sort list by year
        List<Movie> fo = create();
        for (Movie o : fo) {
            o.print(o);

        }
        System.out.println(" orginal");
        List<Movie> sortmov = sorted.sort(fo,0, fo.size()-1);


        for (Movie o : sortmov) {
            o.print(o);

        }
        System.out.println(" you ");



    }
    public static void comprate() throws FileNotFoundException {// sorts list by rate
        List<Movie> fo = create();
        for (Movie o : fo) {
            o.print(o);

        }
        System.out.println(" orginal");
        List<Movie> sortmov = sorted.sort(fo,0, fo.size()-1);


        for (Movie o : sortmov) {
            o.print(o);

        }
        System.out.println(" you ");

    }
    public static List<Movie> searchrate(List<Movie> rec,double s){// search list for movies close to rating s
        List<Movie> hold = new ArrayList<>();
        for (Movie mov:rec) {
            if (mov.movrate<= s+1.0 && mov.movrate>= s-1.0){
                hold.add(mov);
            }
        }
        return hold;
    }

    public static List<Movie> searchyear(List<Movie> rec,int s){// search list by year
        List<Movie> hold = new ArrayList<>();
        for (Movie mov:rec) {
            if (mov.year<= s+1 && mov.year>= s-1){
                hold.add(mov);
            };
        }
        return hold;
    }

    public static List<Movie> sea(List<Movie> rec){//get movie id
        List<Movie> hold = new ArrayList<>();
        for (Movie mov:rec) {
            System.out.println(mov.movid);
        }
        return hold;
    }




    //ArrayList<T> movid,
    public static void main(String[] args) throws IOException {
       // make();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("What do you want?:" +
                    "1: compare year "+
                    "2: compare rating "+
                    "3: search by rate "+
                    "4: search by year "+
                    "5: make file "+
                    "6: stop loop")
            ;
            int choice = input.nextInt();

            if (choice == 1){
                List<Movie> hol = create();
                hol.sort(new compy());
                for (Movie o : hol) {
                    o.print(o);
                    //System.out.println("com");
                }
            }
            else if (choice == 2) {
                List<Movie> hol = create();
                hol.sort(new compr());
                for (Movie o : hol) {
                    o.print(o);
                    //System.out.println("com");
                }
            }
            else if (choice == 3) {
                searchrate(create(),1.0);
                for (Movie o : searchrate(create(),1.0)) {
                    o.print(o);
                    System.out.println("com");
                }
            }
            else if (choice == 4) {

                searchyear(create(),1);
                for (Movie o : searchrate(create(),1)) {
                    o.print(o);
                    System.out.println("com");
                }
            }
            else if (choice == 5) {
                make();
            } else if (choice==6) {
                break;

            }
//            for (Movie o : create()) {
//                o.print(o);
//                System.out.println("com");
//            }
        }


        }







    }

