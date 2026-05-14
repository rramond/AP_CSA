package frq2_class_design;

import java.awt.color.ICC_ColorSpace;

/*
The Scoreboard class contains a constructor and two methods.
• The constructor has two parameters. The first parameter is a String containing the
name of team 1, and the second parameter is a String containing the name of team 2.
The game always begins with team 1 as the active team.
• The recordPlay method has a single nonnegative integer parameter that is equal to the
number of points scored on a play or 0 if the play failed. If the play results in one or
more points scored, the active team’s score is updated and that team remains active. If the
value of the parameter is 0, the active team’s turn ends and the inactive team becomes the
active team. The recordPlay method does not return a value.
• The getScore method has no parameters. The method returns a String containing
information about the current state of the game. The returned string begins with the score of
team 1, followed by a hyphen ("-"), followed by the score of team 2, followed by a
hyphen, followed by the name of the team that is currently active
*/
public class Scoreboard {

    private String activeTeam;
    private int pointsT1 = 0, pointsT2 = 0;
    private String team1Name, team2Name;;

    public Scoreboard(String team1, String team2){
        team1Name = team1;
        team2Name = team2;
        activeTeam = team1;
    }

    public void recordPlay(int points){
            if(points != 0) {
                if (activeTeam.equals(team1Name)) pointsT1 += points;
                else pointsT2 += points;
            } else {
                activeTeam = activeTeam.equals(team1Name) ? team2Name : team1Name;
        }
    }

    public String getScore(){
        return pointsT1 + "-" + pointsT2 + "-" + activeTeam;
    }
}
