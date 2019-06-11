package objectcode;

public class mainclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		pokemon a=new pokemon("pikachu","electric",100);
		pokemon b=new pokemon("Charizard","fire",500);
		//directly accessing the variables
		/*System.out.println(a.name);
		System.out.println(a.type);
		System.out.println(a.hp);*/
		System.out.println(a.getName());
		System.out.println(a.getType());
		System.out.println(a.getHp());
		player p = new player("peter",3000);
		p.addPokemon(a);
		p.addPokemon(b);
		p.printTeam();
	}

}
