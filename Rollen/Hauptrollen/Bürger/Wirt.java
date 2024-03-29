package root.Rollen.Hauptrollen.Bürger;

import root.Frontend.FrontendControl;
import root.ResourceManagement.ResourcePath;
import root.Rollen.Fraktion;
import root.Rollen.Fraktionen.Bürger;
import root.Rollen.Hauptrolle;
import root.Rollen.RoleType;
import root.Spieler;

import java.util.ArrayList;

/**
 * Created by Steve on 12.11.2017.
 */
public class Wirt extends Hauptrolle
{
    public static final String JA = "Ja";
    public static final String NEIN = "Nein";

    public static final String name = "Wirt";
    public static int roleType = RoleType.CHOOSE_ONE;
    public static Fraktion fraktion = new Bürger();
    public static final String imagePath = ResourcePath.WIRT_KARTE;
    public static boolean unique = true;
    public static boolean spammable = false;
    public static int freibierCharges = 1;

    @Override
    public String aktion(String chosenOption) {
        if (chosenOption.equals(JA)) {
            freibierCharges--;
        }

        return chosenOption;
    }

    @Override
    public FrontendControl getDropdownOtions() {
        FrontendControl frontendControl = new FrontendControl();

        frontendControl.typeOfContent = FrontendControl.LIST_WITHOUT_DISPLAY;
        frontendControl.content.add(JA);
        frontendControl.content.add(NEIN);

        return frontendControl;
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