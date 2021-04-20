package Session13.StartCode;


public class Main {
    public static void main(String[] args) {

        /*
        make 2 basketball teams;
        You can use "Bulls", "Chicago"
                    "Thunder", "Oklahoma"
         */
        Team<BasketballPlayer> bulls =
        Team<BasketballPlayer> thunder =
        /*
        make 2 football teams;
        You can use "Pirates", "New Jersey"
                    "Alligators", "Gainesville"
        */
        Team<FootballPlayer> pirates =
        Team<FootballPlayer> alligators =

        /*
        For the sake of time let's just make 2 basketball players for each team

        You can use "Lebron James" age 30 position: "PF" team "Bulls" (should be a varriable to one of the teams above)
                    Jersey Number: 23 KPI: 99 allStar times: 14
                    "Michael Jordan" age 40 position "SG" team "bulls" jesrsey: 23 kpi: 100 allStar times: 16
                    "Russel Westbrook" age 25 position "PG" team thunder jersey 0 kpi 80 allstar 13
                    "Kevin Durant" age 28 position "PF" team thunder jersey 67 kpi 89 allstar 13
         If using different players, change variable names to avoid confusion
         */

        BasketballPlayer lebron =
        BasketballPlayer jordan =

        BasketballPlayer westbrook =
        BasketballPlayer durant =

        //Add basketball players to their teams
            //Once again, if changed names, rename players
        bulls.addTeamMember(jordan);
        bulls.addTeamMember(lebron);

        thunder.addTeamMember(durant);
        thunder.addTeamMember(westbrook);

        // print two teams and make one compete with another
        System.out.println(bulls);
        System.out.println(thunder);
        bulls.compete(thunder);

        // try making a football and a basketball team to compete
//        pirates.compete(bulls);

    }



}
