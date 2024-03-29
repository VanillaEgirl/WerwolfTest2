package root.Rollen.Hauptrollen.Werwölfe;

import root.Frontend.FrontendControl;
import root.ResourceManagement.ResourcePath;
import root.Rollen.Fraktion;
import root.Rollen.Fraktionen.Werwölfe;
import root.Rollen.Hauptrolle;
import root.Spieler;
import root.mechanics.Opfer;

/**
 * Created by Steve on 12.11.2017.
 */
public class Wölfin extends Hauptrolle
{
    public static final int WARTEND = 0;
    public static final int TÖTEND = 1;
    public static final int FERTIG = 2;

    public static final String KILL = "KILL";
    public static final String KEIN_KILL = "Kein Kill";

    public static final String name = "Wölfin";
    public static Fraktion fraktion = new Werwölfe();
    public static final String imagePath = ResourcePath.WÖLFIN_KARTE;
    public static boolean unique = true;
    public static boolean spammable = false;
    public static boolean killing = true;
    public static int modus = WARTEND;

    @Override
    public String aktion(String chosenOption) {
        Spieler chosenPlayer = Spieler.findSpieler(chosenOption);
        modus = FERTIG;
        if(chosenPlayer!=null) {
            besucht = chosenPlayer;

            Spieler täter = Spieler.findSpielerPerRolle(name);
            Opfer.addVictim(chosenPlayer, täter, false);

            return KILL;
        } else {
            return KEIN_KILL;
        }
    }

    @Override
    public FrontendControl getDropdownOtions() {
        return Spieler.getLivigPlayerOrNoneFrontendControl(this);
    }

    @Override
    public String getName() {
        return name;
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

    @Override
    public boolean isKilling() {
        return killing;
    }
}