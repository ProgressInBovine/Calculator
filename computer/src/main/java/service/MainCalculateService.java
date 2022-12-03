package service;

import data.model.CPU;
import data.model.Computer;
import data.model.Memory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackgeName: service
 * @Author: Creed of QB
 * @Date: 2022/12/3 16:47
 * @project: CostCalculator
 * @Description:
 */
public class MainCalculateService {

    private Computer computer;

    public void initFullyComputer() {
        CPU cpu = new CPU(new BigDecimal("3000"),new BigDecimal("50"));
        Memory memory = new Memory(new BigDecimal("200"),new BigDecimal("15"));
        List<Memory> memoryList = new ArrayList<>();
        memoryList.add(memory);
        computer = new Computer(cpu, memoryList);
    }

    public BigDecimal calculateCostOfBuyFully() {
        return computer.getFullCost();
    }
}
