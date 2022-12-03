package data.model;

import data.BaseCost;

import java.math.BigDecimal;

/**
 * @PackgeName: data.model
 * @Author: Creed of QB
 * @Date: 2022/12/3 16:50
 * @project: CostCalculator
 * @Description:
 */
public class CPU extends BaseCost {

    public CPU(BigDecimal basePrice, BigDecimal manualFee) {
        super(basePrice, manualFee);
    }
}
