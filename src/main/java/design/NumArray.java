package design;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class NumArray {

    int[] originalData;
    int[] calculatedData;
    int blockSize;

    public NumArray(int[] nums) {
        originalData = nums;
        blockSize = (int) Math.sqrt(originalData.length);
        int newLength = originalData.length / blockSize;
        if (originalData.length % blockSize != 0) newLength++;
        calculatedData = new int[newLength];
        int curSum = 0;
        int block = blockSize;
        int blockInd = 0;
        for (int i = 0; i < originalData.length; i++) {
            curSum += originalData[i];
            block--;
            if (block == 0) {
                calculatedData[blockInd++] = curSum;
                curSum = 0;
                block = blockSize;
            }
        }
        if (curSum > 0) calculatedData[blockInd] = curSum;
    }

    public void update(int index, int val) {
        int blockInd = index / blockSize;
        calculatedData[blockInd] += (val - originalData[index]);
        originalData[index] = val;
    }

    public int sumRange(int i, int j) {
        int blockIndI = i / blockSize;
        int blockIndJ = j / blockSize;
        int sum = 0;
        if (blockIndI == blockIndJ) {
            int realIdI = blockIndI * blockSize + i % blockSize;
            int realIdJ = blockIndJ * blockSize + j % blockSize;
            for (int k = realIdI; k <= realIdJ; k++) sum += originalData[k];
            return sum;
        }
        for (int k = blockIndI + 1; k < blockIndJ; k++) sum += calculatedData[k];
        int realIdIStart = blockIndI * blockSize + i % blockSize;
        int realIdIEnd = (blockIndI + 1) * blockSize - 1;
        for (int k = realIdIStart; k <= realIdIEnd; k++) sum += originalData[k];
        int realIdJStart = blockIndJ * blockSize;
        int realIdJEnd = blockIndJ * blockSize + j % blockSize;
        for (int k = realIdJStart; k <= realIdJEnd; k++) sum += originalData[k];

        return sum;
    }
}
