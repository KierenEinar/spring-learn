package spring.action.chap2.bean.mixedconfig;

/**
 * Created by kieren on 18/1/24.
 */
public class CDPlayer implements MediaPlayer {

    private CD cd;

    public CDPlayer (CD cd) {
        this.cd = cd;
    }

    public void play() {
        this.cd.play();
    }
}
