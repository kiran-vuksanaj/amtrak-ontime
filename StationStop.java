public class StationStop{
  private String loc;
  private TimeBlock schedArr,schedDep,actArr,actDep;
  private boolean arr,dep;

  public StationStop(String line){
    
  }


  private class TimeBlock{
    private int relDay,hour,min;
  }
}
