import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 等价类划分原则：
 * 单字符字符串：当输入字符串只有一个字符时。
 * 多字符字符串：当输入字符串有多个字符时。
 * 无交换对：当没有提供任何索引对时。
 * 一个交换对：当只提供了一个索引对时。
 * 多个交换对：当提供了多个索引对时。
 * 重复交换对：当提供了重复索引对时。
 */

public class L2022211878_7_Test {

    //单字符字符串 无交换对
    @Test
    public void testSingleCharacter() {
        Solution7 solution = new Solution7();
        String s = "a";
        List<List<Integer>> pairs = new ArrayList<>();
        assertEquals("a", solution.smallestStringWithSwaps(s, pairs));
    }
    //多字符字符串 无交换对
    @Test
    public void testNoPairs() {
        Solution7 solution = new Solution7();
        String s = "dcab";
        List<List<Integer>> pairs = new ArrayList<>();
        assertEquals("dcab", solution.smallestStringWithSwaps(s, pairs));
    }
    //多字符字符串 一个交换对
    @Test
    public void testOnePair() {
        Solution7 solution = new Solution7();
        String s = "dcab";
        List<List<Integer>> pairs = new ArrayList<>(Arrays.asList(
                Arrays.asList(0, 3)
        ));
        assertEquals("bcad", solution.smallestStringWithSwaps(s, pairs));
    }
    //多字符字符串 多个交换对
    @Test
    public void testMultiplePairs() {
        Solution7 solution = new Solution7();
        String s = "dcab";
        List<List<Integer>> pairs = new ArrayList<>(Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(1, 2)
        ));
        assertEquals("bacd", solution.smallestStringWithSwaps(s, pairs));
    }
    //重复的交换对
    @Test
    public void testDuplicatePairs() {
        Solution7 solution = new Solution7();
        String s = "dcab";
        List<List<Integer>> pairs = new ArrayList<>(Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(1, 2),
                Arrays.asList(0, 3)  // 重复的交换对
        ));
        assertEquals("bacd", solution.smallestStringWithSwaps(s, pairs));
    }

}