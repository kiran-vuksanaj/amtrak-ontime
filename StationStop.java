public class StationStop{
  private String loc;
  private TimeBlock schedArr,schedDep,actArr,actDep;
  private boolean arr,dep;

  public StationStop(String line){
    String[] sections = line.split("\\s++");
    for(int i=1;i<8;i++){
      System.out.print(sections[i]+"\t");
    }
    System.out.println("");
  }


  private class TimeBlock{
    private int relDay,hour,min;
  }
}
