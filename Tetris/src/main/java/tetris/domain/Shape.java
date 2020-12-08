package tetris.domain;

/**
 * Yksittäistä Tetris-palikkaa kuvaava luokka.
 * Palikka koostuu neljästä tiilestä,
 * joista keskimmäinen on luotaessa aina sama.
 * Tyypistä riippuen palikan kolme muuta tiiltä luodaan
 * eri puolille keskipalikkaa.
 * Palikalla on tyypistä riippuen eri määrä kääntötiloja (orientation),
 * joiden tilaa pidetään muistissa tässä luokassa.
 * Kääntötila vaikuttaa nimensä mukaisesti palikan kääntymiseen.
 */

public class Shape {
    
    private Tile[] tiles;
    private final Tile centerTile = new Tile(5, 1);
    private String type;
    private int orientation;
    
    public Shape(String type) {
        this.tiles = new Tile[4];
        this.tiles[0] = centerTile;
        this.type = type;
        this.orientation = 1;
        createShape(type);
    }
    
    public Tile[] getTiles() {
        return tiles;
    }
    
    public String getType() {
        return type;
    }
    
    public int getOrientation() {
        return orientation;
    }
    
    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }
    
    /**
     * Ohjaa valitsemaan oikeat koordinaatit uutta Tetris-palikkaa luotaessa.
     * Koordinaatit vaihtelevat palikan tyypin mukaan.
     * 
     * @param type luotavan Tetris-palikan tyyppi
     */
    private void createShape(String type) {
        switch (type) {
            case "L":
                getCoordL();
                break;
            case "J":
                getCoordJ();
                break;
            case "S":
                getCoordS();
                break;
            case "Z":
                getCoordZ();
                break;
            case "O":
                getCoordO();
                break;
            case "I":
                getCoordI();
                break;
            case "T":
                getCoordT();
                break;
        }
    }
    
    private void getCoordL() {
        this.tiles[1] = new Tile(centerTile.getX() + 1, centerTile.getY() - 1);
        this.tiles[2] = new Tile(centerTile.getX() - 1, centerTile.getY());
        this.tiles[3] = new Tile(centerTile.getX() + 1, centerTile.getY());
    }
    
    private void getCoordJ() {
        this.tiles[1] = new Tile(centerTile.getX() - 1, centerTile.getY() - 1);
        this.tiles[2] = new Tile(centerTile.getX() - 1, centerTile.getY());
        this.tiles[3] = new Tile(centerTile.getX() + 1, centerTile.getY());
    }
    
    private void getCoordS() {
        this.tiles[1] = new Tile(centerTile.getX() + 1, centerTile.getY() - 1);
        this.tiles[2] = new Tile(centerTile.getX(), centerTile.getY() - 1);
        this.tiles[3] = new Tile(centerTile.getX() - 1, centerTile.getY());
    }
    
    private void getCoordZ() {
        this.tiles[1] = new Tile(centerTile.getX() - 1, centerTile.getY() - 1);
        this.tiles[2] = new Tile(centerTile.getX(), centerTile.getY() - 1);
        this.tiles[3] = new Tile(centerTile.getX() + 1, centerTile.getY());
    }
    
    private void getCoordO() {
        this.tiles[1] = new Tile(centerTile.getX() - 1, centerTile.getY() - 1);
        this.tiles[2] = new Tile(centerTile.getX(), centerTile.getY() - 1);
        this.tiles[3] = new Tile(centerTile.getX() - 1, centerTile.getY());
    }
    
    private void getCoordI() {
        this.tiles[1] = new Tile(centerTile.getX() - 2, centerTile.getY());
        this.tiles[2] = new Tile(centerTile.getX() - 1, centerTile.getY());
        this.tiles[3] = new Tile(centerTile.getX() + 1, centerTile.getY());
    }
    
    private void getCoordT() {
        this.tiles[1] = new Tile(centerTile.getX(), centerTile.getY() - 1);
        this.tiles[2] = new Tile(centerTile.getX() - 1, centerTile.getY());
        this.tiles[3] = new Tile(centerTile.getX() + 1, centerTile.getY());
    }
}
