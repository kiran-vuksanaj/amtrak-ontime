import java.util.*;
import java.io.*;

public class Traindoc{
  private String filename;
  private StationStop[] data;
  private String route;
  private int routeNum,year,month,day;

  public Traindoc(String filename)throws FileNotFoundException{
    File f = new File(filename);
    Scanner sca = new Scanner(f);
    while(sca.hasNext()){
      System.out.println(sca.next());
    }
  }
}
