package baseball.service;

import baseball.domain.Baseball;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class BaseballService {

    int[] randomNum=new int[3];
    Baseball baseball;

    public void startBaseballGame() {
        for(int i=0; i<randomNum.length; i++){
            randomNum[i]=Randoms.pickNumberInRange(1,9);
        }
        baseball.setComNum(randomNum);
    }


}
