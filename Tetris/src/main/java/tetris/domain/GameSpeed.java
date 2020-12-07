package tetris.domain;

public class GameSpeed {
    
    private int speed;
    
    public GameSpeed() {
        this.speed = 800;
    }
    
    public int setGameSpeed(int level) {
        switch(level) {
            case 0:
                speed = 800;
                break;
            case 1:
                speed = 700;
                break;
            case 2:
                speed = 600;
                break;
            case 3:
                speed = 500;
                break;
            case 4:
                speed = 450;
                break;
            case 5:
                speed = 400;
                break;
            case 6:
                speed = 350;
                break;
            case 7:
                speed = 300;
                break;
            case 8:
                speed = 250;
                break;
            case 9:
                speed = 200;
                break;
            case 10:
                speed = 150;
                break;
        }
        return speed;
    }

    public int getSpeed() {
        return speed;
    }

}
