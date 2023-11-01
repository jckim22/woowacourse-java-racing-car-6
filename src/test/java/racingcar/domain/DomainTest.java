package racingcar.domain;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import racingcar.Application;
import racingcar.domain.entity.CarEntity;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DomainTest extends NsTest {
    String inputString = "juch,jayo,hi";
    String[] result = inputString.split(",");
    CarEntity isWinnerCar = new CarEntity("thr", 7);

    CarEntity[] arrayExCars = {new CarEntity("one", 4),
            new CarEntity("two", 6),
            isWinnerCar};
    List<CarEntity> exCars = new ArrayList<>(List.of(arrayExCars));
    List<CarEntity> winners = new ArrayList<>();

    @Test
    void maxScore_반환() {
        assertThat(FindMaxScore.findMax(exCars)).isEqualTo(7);
    }

    @Test
    void findWinner_우승자_반환() {
        winners.add(isWinnerCar);
        assertThat(FindWinnerCar.equalMaxScroe(exCars, 7)).isEqualTo(winners);
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}