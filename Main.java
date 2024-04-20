import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        List<ShowTimes> date =new ArrayList<>();
        List<movies> movie;
        movies movie1= new movies();
        List<Tickets>tickets = new ArrayList<>();
        ShowTimes f= new ShowTimes("14/2","133:30",false);
        ShowTimes s= new ShowTimes("14/2","12:30",true);
        date.add(f);
        date.add(s);

        // getting the ID for the most three popular movies...
//        User u1 = new User("sfjdhksjdhfs","visa card",4,"morning Show Time",20);
//        u1.doWhatRequireForBooking();
//        movies.theMostPopular();
//        for (int c :movies.mostPopularMovies) {
//            System.out.println(c);
//        }
//
//      movies  movie1 = new movies("HACKER","DOCUMENTARY",date,"Hall-2",30);
//        movie1.addMovie("C:\\Users\\بلال خبية\\Pictures\\new movies\\hacker.jpg");
 //       movie2.fillChairChecklist(15);

      //  String lint = "D:\\Cinema project\\movies\\movie-1\\img.jpg";













        //delete a ticket for a specific user
//        User u = new User();
//        u.getTickets(2);
//        u.deleteTicket(0,2);


        //Reset all the program to the default state...
       movie1.Reset();






        //check if the given chair exist or not ...
//       movie1.CheckTheChair(1,1);


//        //Booking for a user and storing his files...
//       User u1 = new User("sfjdhksjdhfs","visa card",5,"morning Show Time",3);
//       u1.doWhatRequireForBooking();


        // How to get the movie path for the tickets...
//       User u1 = new User();
//       u1.getTickets(1);
//       String ticketdata [] = new String[6];
//       movies m = new movies();
//       String moviePath;
//       for (Tickets t:u1.userTickets){
//          ticketdata = t.ToString();
//          moviePath = m.path.get(Integer.parseInt(ticketdata[5]));
//          BufferedReader movieFile = new BufferedReader(new FileReader(moviePath+"\\name.txt"));
//           System.out.println(movieFile.readLine());;
//       }


        // get the the user ID by giving his email...
//         System.out.println(u1.getUserID("sfjdhksjdhfs"));






//       for (String s:movie1.path ) {
//            File f = new File(s);
//            movies.ToString(s);
//           System.out.println("   ");
//
//        }



//    THE CODE FOR GENERATE MOVIES

//
//            System.out.println("enter the name :"   );
//            String MovieName=in.nextLine();
//            System.out.println("enter the type");
//            String  type = in.nextLine();
//
//            System.out.println("enter the host hall:");
//            String hostHall=in.nextLine();
//
//           for (int j = 1; j < 3; j++) {
//
//
//            System.out.println("enter the date show :"+j);
//            String monthDay,hourMinute;
//            boolean isItevening;
//            monthDay=in.next();
//            hourMinute=in.next();
//            System.out.println("if evening enter true or 1:");
//            isItevening=in.nextBoolean();

//           ShowTimes date1 = new ShowTimes(monthDay,hourMinute,isItevening);
//            date.add(date1);
//            }
//            movie1 = new movies(MovieName,type,date,hostHall);
//            movie1.addMovie();


    }

    }
