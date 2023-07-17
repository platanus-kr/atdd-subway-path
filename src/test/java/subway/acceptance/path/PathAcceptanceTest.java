package subway.acceptance.path;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import subway.acceptance.AcceptanceTest;
import subway.acceptance.station.StationSteps;

import java.util.HashMap;
import java.util.Map;

@DisplayName("경로 관련 기능")
public class PathAcceptanceTest extends AcceptanceTest {
    public Map<String, Long> stationsMap = new HashMap<>();

    // TODO: 인수 테스트 작성

    /**
     * 교대역  ---- *2호선* --- d:10 ------  강남역
     * |                                    |
     * *3호선*                            *신분당선*
     * d:2                                 d:10
     * |                                   |
     * 남부터미널역  --- *3호선* -- d:3 --- 양재
     */

    @BeforeEach
    void addLine() {
        // "교대역", "강남역", "역삼역", "선릉역", "삼성역", "잠실역", "강변역", "건대역", "성수역", "왕십리역"
        stationsMap = StationSteps.기본_역_생성();
    }

    /**
     * Given 3개의 구간을 가진 노선이 있고
     * When 노선의 상행역과 하행역으로 경로를 조회하면
     * Then 4개의 역이 출력된다
     * Then 3 구간의 모든 거리의 합이 출력된다
     */
    @DisplayName("같은 노선의 경로를 조회한다")
    @Test
    void getPath() {

    }

    /**
     * Given 각 구간을 가진 3개의 서로 연결된 노선이 있고
     * When 3 노선을 모두 통과하는 경로를 조회하면
     * Then 경로 조회 결과가 나온다
     * Then 구간의 모든 거리의 합이 출력된다
     */
    @DisplayName("다른 노선에 있는 지하철 경로를 조회한다")
    @Test
    void getPathWithOtherLine() {

    }

    /**
     * Given 각 구간을 가진 3개의 서로 연결된 노선이 있고
     * When 연결되지 않은 경로를 조회하면
     * Then 경로가 조회되지 않는다
     */
    @DisplayName("연결되지 않은 경로를 조회한다")
    @Test
    void getPathWithNotConnected() {

    }

    /**
     * Given 각 구간을 가진 3개의 서로 연결된 노선이 있고
     * When 시작과 끝을 같은 역을 조회하면
     * Then 경로가 조회되지 않는다
     */
    @DisplayName("시작과 끝이 같은 역의 경로를 조회한다.")
    @Test
    void getPathWithSameStation() {

    }

    /**
     * Given 각 구간을 가진 3개의 서로 연결된 노선이 있고
     * When 존재 하지 않는 역으로 경로를 조회하면
     * Then 경로가 조회되지 않는다
     */
    @DisplayName("존재하지 않는 역으로 경로를 조회한다")
    @Test
    void getPathWithNotExistStation() {

    }

    private Long getStationId(String name) {
        return stationsMap.get(name);
    }


}
