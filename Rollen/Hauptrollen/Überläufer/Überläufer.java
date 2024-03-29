package root.Rollen.Hauptrollen.Überläufer;

import root.Frontend.FrontendControl;
import root.ResourceManagement.ResourcePath;
import root.Rollen.Fraktion;
import root.Rollen.Fraktionen.Überläufer_Fraktion;
import root.Rollen.Hauptrolle;
import root.Rollen.Hauptrollen.Bürger.Dorfbewohner;
import root.Rollen.Nebenrolle;
import root.Rollen.Nebenrollen.Schatten;
import root.Rollen.RoleType;
import root.Spieler;

/**
 * Created by Steve on 12.11.2017.
 */
public class Überläufer extends Hauptrolle
{
    public static final String name = "Überläufer";
    public static int roleType = RoleType.CHOOSE_ONE;
    public static Fraktion fraktion = new Überläufer_Fraktion();
    public static final String imagePath = ResourcePath.ÜBERLÄUFER_KARTE;
    public static boolean unique = true;
    public static boolean spammable = false;

    @Override
    public String aktion(String chosenOption) {
        Hauptrolle chosenHauptrolle = Hauptrolle.findHauptrolle(chosenOption);
        if (chosenHauptrolle != null) {
            try {
                Spieler spielerHauptrolle = Spieler.findSpielerPerRolle(chosenHauptrolle.getName());
                spielerHauptrolle.hauptrolle = new Dorfbewohner();

                Spieler spielerÜberläufer = Spieler.findSpielerPerRolle(name);
                spielerÜberläufer.hauptrolle = chosenHauptrolle;
            }catch (NullPointerException e) {
                System.out.println(name + " nicht gefunden");
            }
        }

        return null;
    }

    @Override
    public FrontendControl getDropdownOtions() {
        return new FrontendControl(FrontendControl.LIST_DISPLAY_AS_TEXT, Spieler.getDeadHauptrollen());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRoleType() {
        return roleType;
    }

    @Override
    public Fraktion getFraktion() {
        return fraktion;
    }

    @Override
    public String getImagePath() {
        return imagePath;
    }

    @Override
    public boolean isUnique() {
        return unique;
    }

    @Override
    public boolean isSpammable() {
        return spammable;
    }
}