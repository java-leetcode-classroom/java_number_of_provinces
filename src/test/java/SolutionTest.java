import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    final  private  Solution sol = new Solution();
    @Test
    void findCircleNumExample1() {
        assertEquals(2, sol.findCircleNum(new int[][]{
                {1,1,0},
                {1,1,0},
                {0,0,1}
        }));
    }
    @Test
    void findCircleNumExample2() {
        assertEquals(3, sol.findCircleNum(new int[][]{
                {1,0,0},
                {0,1,0},
                {0,0,1}
        }));
    }
}