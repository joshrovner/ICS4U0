public class KingTester
{
    public static void main (String[] args)
    {
 Pharaoh p = new Pharaoh ("Amenhotep III", 800000, 100000, "Ancient Egypt", 2, true, 10000, 0, "Amenhotep-Huy", "King's Valley 22", 18);
 p.grantIndependence (10000);
 p.removeSoldiers (800);
 p.marry ();
 System.out.println (p.getArmySize () + " " + p.getMarried ());
    }
}
