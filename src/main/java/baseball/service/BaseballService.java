package baseball.service;


import baseball.domain.Baseball;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class BaseballService {

    int[] randomNum=new int[3];
    int[] userNum=new int[3];
    Baseball baseball;

    public void setRandomNumber() {
        for(int i=0; i<randomNum.length; i++){
            randomNum[i]=Randoms.pickNumberInRange(1,9);
        }
        baseball.setComNum(randomNum);
    }

    public void getUserNum() {
        System.out.println("숫자를 입력해주세요: ");
        String number=Console.readLine();
        for(int i=0; i<number.length(); i++){
            userNum[i]=number.charAt(i)-'0';
        }
        baseball.setUserNum(userNum);
    }

    public void startGame() {
        baseball.initStrikeBall();
        setRandomNumber();
        getUserNum();
    }


}
