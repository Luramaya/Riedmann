package net.luramaya.car;

public class Mirror {
    public enum POSITION{RIGHT,LEFT, REAR}
    private POSITION mirrorPos;
    private int size;
    private boolean folded = true;

    public Mirror(POSITION mirrorPos, int size) {
        this.mirrorPos = mirrorPos;
        this.size = size;
    }


    public void toggleFold(){

        if (folded){
            System.out.println("UNFOLDIIIING " + this.mirrorPos.name());
        }else{
            System.out.println("FOLDIIING" + this.mirrorPos.name());
        }

        folded = !folded;
    }
}


