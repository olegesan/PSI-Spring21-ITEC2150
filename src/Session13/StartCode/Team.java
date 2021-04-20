package Session13.StartCode;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends TeamPlayer<T>>{
    private List<T> teamMembers;
    private String name;
    private String homeCity;

    public Team(String name, String homeCity){
        this.name = name;
        this.homeCity = homeCity;
        teamMembers = new ArrayList<>();
    }

    public String getTeamSport(){
        if(getSize() == 0 ){
            System.out.println("Team has no members.\nCannot get team sport right now.\nAdd at least one player.");
            return "";
        }
        return teamMembers.get(0).getSport();
    }

    public void compete(Team<T> team){
        long team_kpi =  Math.round(this.getTeamAvgKPI());
        long opposite_kpi = Math.round(team.getTeamAvgKPI());
        if(team_kpi>opposite_kpi){
            System.out.println(name+" wins over "+team.getName());
        }else if(team_kpi<opposite_kpi){
            System.out.println(team.getName()+" beats "+ name);
        }else{
            System.out.println("This is a rare situation and, I know it is not perfect, but we got a draw.\n" +
                    "even though it might not be possible for this type of sport.");
        }
    }

    public double getTeamAvgKPI(){
        double kpi = 0;
        for(T player: teamMembers){
            kpi+= player.getMagicKPI();
        }
        return kpi / teamMembers.size();
    }

    public List<T> getTeamMembers() {
        return teamMembers;
    }

    public int getSize(){
        return teamMembers.size();
    }

    public void addTeamMember(T player){
        teamMembers.add(player);
    }

    public void removePlayer(T player){
        teamMembers.remove(player);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getRosterStr(){
        StringBuilder output = new StringBuilder();
        output.append("Roster:");
        for(T player: teamMembers){
            String player_name = player.getName();
            int player_number = player.getPlayerNumber();
            output.append("\n").append(player_name).append(" ").append(player_number);
        }
        return output.toString();
    }

    public void printRoster(){
        System.out.println(getRosterStr());
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Team Name: "+name);
        output.append("\nHometown: "+homeCity);
        output.append("\n").append(getRosterStr());
        return output.toString();
    }
}
