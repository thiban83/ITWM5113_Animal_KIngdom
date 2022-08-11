import java.awt.*;

public class NinjaCat extends Tiger {

    public boolean hasInfected;

    public NinjaCat (){
        hasInfected=false;
    }

    public Color getColor() {
        if (hasInfected){
            return Color.ORANGE;
        } else {
            return Color.pink;
        }

    }


    public String toString() {
        if (hasInfected){
            return "NINJA";
        } else {
            return "ninja";
        }

    }


    public Action getMove(CritterInfo info) {
        //same as Tiger, but changes color when has infected
        if (info.getFront()==Neighbor.OTHER){
            hasInfected=true;
        }
        return super.getMove(info);

    }
}
