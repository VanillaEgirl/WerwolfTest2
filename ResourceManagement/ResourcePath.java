package root.ResourceManagement;

public class ResourcePath {
    public static String IMAGE_FILE_EXTENSION = ".png";
    public static String SAVE_FILE_EXTENSION = ".txt";
    public static String SAVE_FILE_PATH = System.getenv("APPDATA") + "\\Werwolf\\";
    public static String PICTURE_PATH = "src\\pictures\\";
    public static String ICON_PATH = PICTURE_PATH + "Icons\\";
    public static String CARD_PATH = PICTURE_PATH + "Karten\\";
    public static String SECONDARY_ROLE_PATH = CARD_PATH + "Bonusrollen\\";
    public static String OPEN_SECONDARY_ROLE_PATH = SECONDARY_ROLE_PATH + "Augensymbolkarten\\";

    public static String LAST_GAME_FILE_FILE = SAVE_FILE_PATH + "lastGame" + SAVE_FILE_EXTENSION;

    public static String BÜRGER_PATH = CARD_PATH + "Bürger\\";
    public static String SCHATTENPRIESTER_PATH = CARD_PATH + "Schattenpriester\\";
    public static String ÜBERLÄUFER_PATH = CARD_PATH + "Überläufer\\";
    public static String VAMPIRE_PATH = CARD_PATH + "Vampire\\";
    public static String WÖLFE_PATH = CARD_PATH + "Werwölfe\\";

    public static String DEAKTIVIERT = ICON_PATH + "Deaktiviert" + IMAGE_FILE_EXTENSION;
    public static String AKTIV = ICON_PATH + "Aktiv" + IMAGE_FILE_EXTENSION;
    public static String PASSIV = ICON_PATH + "Passiv" + IMAGE_FILE_EXTENSION;
    public static String INFORMATIV = ICON_PATH + "Informativ" + IMAGE_FILE_EXTENSION;
    public static String FREIBIER = ICON_PATH + "Freibier" + IMAGE_FILE_EXTENSION;
    public static String LIEBESPAAR = ICON_PATH + "Liebespaar" + IMAGE_FILE_EXTENSION;
    public static String SCHÖNLING = ICON_PATH + "Schönling" + IMAGE_FILE_EXTENSION;
    public static String TOT = ICON_PATH + "Tod" + IMAGE_FILE_EXTENSION;
    public static String TORTE_ICON = ICON_PATH + "Torte" + IMAGE_FILE_EXTENSION;
    public static String TORTE = CARD_PATH + "Torte" + IMAGE_FILE_EXTENSION;
    public static String VERSTUMMT = ICON_PATH + "Verstummt" + IMAGE_FILE_EXTENSION;
    public static String AUFGEBRAUCHT = ICON_PATH + "Aufgebraucht" + IMAGE_FILE_EXTENSION;
    public static String AUS_DEM_SPIEL = ICON_PATH + "Aus_dem_Spiel" + IMAGE_FILE_EXTENSION;
    public static String TARNUMHANG = ICON_PATH + "Tarnumhang" + IMAGE_FILE_EXTENSION;
    public static String TÖTEND = ICON_PATH + "Tötend" + IMAGE_FILE_EXTENSION;
    public static String NICHT_TÖTEND = ICON_PATH + "Nicht_Tötend" + IMAGE_FILE_EXTENSION;

    public static String BÜRGER_ICON = ICON_PATH + "Bürger" + IMAGE_FILE_EXTENSION;
    public static String SCHATTENPRIESTER_ICON = ICON_PATH + "Schattenpriester" + IMAGE_FILE_EXTENSION;
    public static String VAMPIERE_ICON = ICON_PATH + "Vampire" + IMAGE_FILE_EXTENSION;
    public static String WÖLFE_ICON = ICON_PATH + "Wölfe" + IMAGE_FILE_EXTENSION;
    public static String ÜBERLÄUFER_ICON = ICON_PATH + "Überläufer" + IMAGE_FILE_EXTENSION;

    public static String BESTIENMEISTER_KARTE = BÜRGER_PATH + "Bestienmeister" + IMAGE_FILE_EXTENSION;
    public static String BRUDER_KARTE = BÜRGER_PATH + "Bruder" + IMAGE_FILE_EXTENSION;
    public static String BRÜDER_KARTE = BÜRGER_PATH + "Brüder" + IMAGE_FILE_EXTENSION;
    public static String BUCHHALTER_KARTE = BÜRGER_PATH + "Buchhalter" + IMAGE_FILE_EXTENSION;
    public static String DORFBEWOHNER_KARTE = BÜRGER_PATH + "Dorfbewohner" + IMAGE_FILE_EXTENSION;
    public static String GUTE_HEXE_KARTE = BÜRGER_PATH + "Gute_Hexe" + IMAGE_FILE_EXTENSION;
    public static String HOLDE_MAID_KARTE = BÜRGER_PATH + "Holde_Maid" + IMAGE_FILE_EXTENSION;
    public static String ORAKEL_KARTE = BÜRGER_PATH + "Orakel" + IMAGE_FILE_EXTENSION;
    public static String RIESE_KARTE = BÜRGER_PATH + "Riese" + IMAGE_FILE_EXTENSION;
    public static String SAMMLER_KARTE = BÜRGER_PATH + "Sammler" + IMAGE_FILE_EXTENSION;
    public static String SEHERIN_KARTE = BÜRGER_PATH + "Seherin" + IMAGE_FILE_EXTENSION;
    public static String SPÄHER_KARTE = BÜRGER_PATH + "Späher" + IMAGE_FILE_EXTENSION;
    public static String WIRT_KARTE = BÜRGER_PATH + "Wirt" + IMAGE_FILE_EXTENSION;

    public static String SCHATTENPRIESTER_KARTE = SCHATTENPRIESTER_PATH + "Schattenpriester" + IMAGE_FILE_EXTENSION;

    public static String ÜBERLÄUFER_KARTE = ÜBERLÄUFER_PATH + "Überläufer" + IMAGE_FILE_EXTENSION;

    public static String GRAF_VLADIMIR_KARTE = VAMPIRE_PATH + "Graf_Vladimir" + IMAGE_FILE_EXTENSION;
    public static String LADY_ALEERA_KARTE = VAMPIRE_PATH + "Lady_Aleera" + IMAGE_FILE_EXTENSION;
    public static String MISS_VERONA_KARTE = VAMPIRE_PATH + "Miss_Verona" + IMAGE_FILE_EXTENSION;

    public static String ALPHAWOLF_KARTE = WÖLFE_PATH + "Alphawolf" + IMAGE_FILE_EXTENSION;
    public static String BLUTWOLF_KARTE = WÖLFE_PATH + "Blutwolf" + IMAGE_FILE_EXTENSION;
    public static String BÖSE_HEXE_KARTE = WÖLFE_PATH + "Böse_Hexe" + IMAGE_FILE_EXTENSION;
    public static String CHEMIKER_KARTE = WÖLFE_PATH + "Chemiker" + IMAGE_FILE_EXTENSION;
    public static String WERWOLF_KARTE = WÖLFE_PATH + "Werwolf" + IMAGE_FILE_EXTENSION;
    public static String WÖLFIN_KARTE = WÖLFE_PATH + "Wölfin" + IMAGE_FILE_EXTENSION;

    public static String ANALYTIKER_KARTE = SECONDARY_ROLE_PATH + "Analytiker" + IMAGE_FILE_EXTENSION;
    public static String ANÄSTHESIST_KARTE = SECONDARY_ROLE_PATH + "Anästhesist" + IMAGE_FILE_EXTENSION;
    public static String ARCHIVAR_KARTE = SECONDARY_ROLE_PATH + "Archivar" + IMAGE_FILE_EXTENSION;
    public static String BESCHWÖRER_KARTE = SECONDARY_ROLE_PATH + "Beschwörer" + IMAGE_FILE_EXTENSION;
    public static String DETEKTIV_KARTE = SECONDARY_ROLE_PATH + "Detektiv" + IMAGE_FILE_EXTENSION;
    public static String FRISÖR_KARTE = SECONDARY_ROLE_PATH + "Frisör" + IMAGE_FILE_EXTENSION;
    public static String GEFÄNGNISWÄRTER_KARTE = SECONDARY_ROLE_PATH + "Gefängniswärter" + IMAGE_FILE_EXTENSION;
    public static String GUTE_FEE_KARTE = SECONDARY_ROLE_PATH + "Gute_Fee" + IMAGE_FILE_EXTENSION;
    public static String IMITATOR_KARTE = SECONDARY_ROLE_PATH + "Imitator" + IMAGE_FILE_EXTENSION;
    public static String KONDITOR_KARTE = SECONDARY_ROLE_PATH + "Konditor" + IMAGE_FILE_EXTENSION;
    public static String KONDITORLEHRLING_KARTE = SECONDARY_ROLE_PATH + "Konditorlehrling" + IMAGE_FILE_EXTENSION;
    public static String LAMM_KARTE = SECONDARY_ROLE_PATH + "Lamm" + IMAGE_FILE_EXTENSION;
    public static String NACHBAR_KARTE = SECONDARY_ROLE_PATH + "Nachbar" + IMAGE_FILE_EXTENSION;
    public static String PROSTITUIERTE_KARTE = SECONDARY_ROLE_PATH + "Prostituierte" + IMAGE_FILE_EXTENSION;
    public static String REINE_SEELE_KARTE = SECONDARY_ROLE_PATH + "Reine_Seele" + IMAGE_FILE_EXTENSION;
    public static String REINES_LICHT_KARTE = SECONDARY_ROLE_PATH + "Reines_Licht" + IMAGE_FILE_EXTENSION;
     public static String SCHATTEN_KARTE = SECONDARY_ROLE_PATH + "Schatten" + IMAGE_FILE_EXTENSION;
    public static String SCHATTENKUTTE_KARTE = SECONDARY_ROLE_PATH + "Schattenkutte" + IMAGE_FILE_EXTENSION;
    public static String SCHWARZE_SEELE_KARTE = SECONDARY_ROLE_PATH + "Schwarze_Seele" + IMAGE_FILE_EXTENSION;
    public static String SPION_KARTE = SECONDARY_ROLE_PATH + "Spion" + IMAGE_FILE_EXTENSION;
    public static String TARNUMHANG_KARTE = SECONDARY_ROLE_PATH + "Tarnumhang" + IMAGE_FILE_EXTENSION;
    public static String TOTENGRÄBER_KARTE = SECONDARY_ROLE_PATH + "Totengräber" + IMAGE_FILE_EXTENSION;
    public static String VAMPIRUMHANG_KARTE = SECONDARY_ROLE_PATH + "Vampirumhang" + IMAGE_FILE_EXTENSION;
    public static String WACHHUND_KARTE = SECONDARY_ROLE_PATH + "Wachhund" + IMAGE_FILE_EXTENSION;
    public static String WAHRSAGER_KARTE = SECONDARY_ROLE_PATH + "Wahrsager" + IMAGE_FILE_EXTENSION;
    public static String WOLFSPELZ_KARTE = SECONDARY_ROLE_PATH + "Wolfspelz" + IMAGE_FILE_EXTENSION;

    public static String FEINSCHMECKER_KARTE = OPEN_SECONDARY_ROLE_PATH + "Feinschmecker" + IMAGE_FILE_EXTENSION;
    public static String HAUPTMANN_KARTE = OPEN_SECONDARY_ROLE_PATH + "Hauptmann" + IMAGE_FILE_EXTENSION;
    public static String OBERÄLTERTER_KARTE = OPEN_SECONDARY_ROLE_PATH + "Oberälterter" + IMAGE_FILE_EXTENSION;
    public static String PRIESTER_KARTE = OPEN_SECONDARY_ROLE_PATH + "Priester" + IMAGE_FILE_EXTENSION;
    public static String REINE_SEELE_OPEN_KARTE = OPEN_SECONDARY_ROLE_PATH + "Reine_Seele" + IMAGE_FILE_EXTENSION;
    public static String RICHTERIN_KARTE = OPEN_SECONDARY_ROLE_PATH + "Richterin" + IMAGE_FILE_EXTENSION;
}
