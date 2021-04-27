package generics.teamAndPlayerAdder;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String teamName;

    public Team(String name){
        this.teamName=name;
    }

    private ArrayList<T> myPlayers= new ArrayList<T>();

    public boolean addPlayers(T player){
        if(myPlayers.contains(player)){
            System.out.println("Player name already exist "+ ((Player)player).getName()+" in" + this.teamName + " team.");
            return false;
        }else{
            myPlayers.add(player);
            System.out.println("New Players name is :"+((Player)player)+ " Team name :" + this.teamName);
            return true;
        }
    }

}
