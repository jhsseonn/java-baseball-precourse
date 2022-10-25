package baseball.domain;

public class Baseball {
    int[] comNum=new int[3];
    int[] userNum=new int[3];
    public int strike;
    public int ball;

    public void initStrikeBall(){
        strike=0;
        ball=0;
    }

    public int[] getComNum() {
        return comNum;
    }

    public void setComNum(int[] comNum) {
        this.comNum = comNum;
    }

    public void setUserNum(int[] userNum) {
        this.userNum = userNum;
    }

    public int[] getUserNum() {
        return userNum;
    }

    public void addStrike(int strike){
        strike+=1;
    }

    public void addBall(int ball){
        ball+=1;
    }
}
