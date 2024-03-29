package root.Rollen.Fraktionen;

import root.ResourceManagement.ResourcePath;
import root.Rollen.Fraktion;

import java.awt.*;

public class Bürger extends Fraktion
{
    public static final String name = "Bürger";
    public static Color farbe = Color.yellow;
    public static final String imagePath = ResourcePath.BÜRGER_ICON;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Color getFarbe() { return farbe; }

    @Override
    public String getImagePath() {
        return imagePath;
    }
}
