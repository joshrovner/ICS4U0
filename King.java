public class King
{
    private String name;
    private double territorySquareKm;
    private int armySize;
    public String nationName;
    private int numberOfCastles;
    private boolean married;
    private int numPrisoners;

    public King ()
    {
	name = "";
	territorySquareKm = 100000;
	armySize = 10000;
	nationName = "";
	numberOfCastles = 0;
	married = false;
	numPrisoners = 0;
    }


    public King (String n, double territory, int army, String nation, int castles, boolean m, int prisoners)
    {
	name = n;
	territorySquareKm = territory;
	armySize = army;
	nationName = nation;
	numberOfCastles = castles;
	married = m;
	numPrisoners = prisoners;
    }


    public void setName (String newName)
    {
	name = newName;
    }


    public void setNationName (String newNationName)
    {
	nationName = newNationName;
    }


    public boolean conquerTerritory (double territoryAmount)
    {
	if (territoryAmount * 5 < armySize)
	{
	    territorySquareKm += territoryAmount;
	    armySize -= territoryAmount * 5;
	    numPrisoners += territoryAmount / 2;
	    return true;
	}
	else
	    return false;
    }


    public boolean grantIndependence (double territoryAmount)
    {
	if (territoryAmount < territorySquareKm)
	{
	    territorySquareKm -= territoryAmount;
	    return true;
	}
	else
	    return false;
    }


    public void addSoldiers (int soldierAmount)
    {
	armySize += soldierAmount;
    }


    public void removeSoldiers (int soldierAmount)
    {
	armySize -= soldierAmount;
    }


    public void buildCastles (int castleAmount)
    {
	numberOfCastles += castleAmount;
    }


    public boolean destroyCastles (int castleAmount)
    {
	if (castleAmount < numberOfCastles)
	{
	    numberOfCastles -= castleAmount;
	    return true;
	}
	else
	    return false;
    }


    public void marry ()
    {
	married = true;
    }


    public void divorce ()
    {
	married = false;
    }


    public void releasePrisoners ()
    {
	numPrisoners = 0;
    }


    public String getName ()
    {
	return name;
    }


    public double getTerritorySquareKm ()
    {
	return territorySquareKm;
    }


    public int getArmySize ()
    {
	return armySize;
    }


    public String getNationName ()
    {
	return nationName;
    }


    public int getNumberOfCastles ()
    {
	return numberOfCastles;
    }


    public boolean married ()
    {
	return married;
    }


    public int getNumPrisoners ()
    {
	return numPrisoners;
    }
}
