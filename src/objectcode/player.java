package objectcode;

import java.util.ArrayList;

public class player {
 String name;
 int money;
 ArrayList<pokemon> team = new ArrayList<pokemon>();
public player(String name, int money, ArrayList<pokemon> team) {
	
	this.name = name;
	this.money = money;
	this.team = team;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getMoney() {
	return money;
}
public void setMoney(Integer money) {
	this.money = money;
}
public ArrayList<pokemon> getTeam() {
	return team;
}
public void setTeam(ArrayList<pokemon> team) {
	this.team = team;
}
public void addPokemon(pokemon ob)
{
	this.team.add(ob);
}
public void printTeam(){
	for(int i=0;i<team.size();i++)
	{
		System.out.println(team.get(i).getName());
	}
}
 
}
