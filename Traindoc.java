import java.util.*;
import java.io.*;

public class Traindoc{
  private String filename;
  private StationStop[] data;
  private String route;
  private int routeNum,year,month,day;

  public static void main(String[] args){
    try{
      Traindoc t = new Traindoc(args[0]);
    }catch(FileNotFoundException e){
      System.out.println(args[0]+" not found");
    }
  }

  public Traindoc(String filename)throws FileNotFoundException{
    this.filename = filename;
    getDateAndNum();
    File f = new File(filename);
    Scanner sca = new Scanner(f);
    getRouteName(sca);
    skipOverHeaders(sca);
    LinkedList<StationStop> stops = new LinkedList<StationStop>();
    while(sca.hasNextLine()){
      stops.add( new StationStop(sca.nextLine()) );
    }
  }
  private void getDateAndNum(){

  }
  private void getRouteName(Scanner scaß){

  }
  private void skipOverHeaders(Scanner sca){

  }
}
