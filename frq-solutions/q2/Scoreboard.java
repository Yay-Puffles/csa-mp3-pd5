public class Scoreboard {
  private String team1;
  private String team2;
  private int team1Score;
  private int team2Score;
  private boolean activeTeam;

  public Scoreboard(String t1, String t2){
    team1 = t1;
    team2 = t2;
    team1Score = 0;
    team2Score = 0;
    activeTeam = true;
  }

  public void recordPlay(int p){
    if (p == 0){
      activeTeam = !activeTeam;
    }
    else{
      if (activeTeam){
        team1Score += p;
      }
      else {
        team2Score += p;
      }
    }
  }

  public String getScore(){
    if (activeTeam){
      return team1Score + "-" + team2Score + "-" + team1;
    }
    else {
      return team1Score + "-" + team2Score + "-" + team2;
    }
  }


  
}
