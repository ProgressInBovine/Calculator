package data.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * @PackgeName: data.model
 * @Author: Creed of QB
 * @Date: 2022/12/3 16:58
 * @project: CostCalculator
 * @Description: 整机电脑
 */
public class Computer {

    private CPU cpu;

    private List<Memory> memoryList;

    public Computer(CPU cpu, List<Memory> memoryList) {
        this.cpu = cpu;
        this.memoryList = memoryList;
    }

    public BigDecimal getFullCost() {
        BigDecimal cost = BigDecimal.ZERO;
        cost = cost.add(cpu.getFullyCost());
        for (Memory memory : memoryList) {
            cost = cost.add(memory.getFullyCost());
        }
        return cost;
    }

    public BigDecimal getDIYCost() {
        BigDecimal cost = BigDecimal.ZERO;
        cost = cost.add(cpu.getDIYCost());
        for (Memory memory : memoryList) {
            cost = cost.add(memory.getDIYCost());
        }
        return cost;
    }
}
