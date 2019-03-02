public class StationStop{
  private String loc;
  private TimeBlock schedArr,schedDep,actArr,actDep;
  private boolean arr,dep;


  private class TimeBlock{
    private int relDay,hour,min;
  }
}
