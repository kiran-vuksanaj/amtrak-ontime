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
    String[] splitName = filename.split("_");
    routeNum = Integer.parseInt(splitName[0].substring(
                                                      splitName[0].lastIndexOf("/")+1,
                                                      splitName[0].length()
                                                      ));
    year = Integer.parseInt(splitName[1].substring(0,4));
    month = Integer.parseInt(splitName[1].substring(4,6));
    day = Integer.parseInt(splitName[1].substring(6,8));
  }
  private void getRouteName(Scanner scaß){

  }
  private void skipOverHeaders(Scanner sca){

  }
}
