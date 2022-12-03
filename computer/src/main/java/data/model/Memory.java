package data.model;

import data.BaseCost;

import java.math.BigDecimal;

/**
 * @PackgeName: data.model
 * @Author: Creed of QB
 * @Date: 2022/12/3 16:51
 * @project: CostCalculator
 * @Description:
 */
public class Memory extends BaseCost {

    public Memory(BigDecimal basePrice, BigDecimal manualFee) {
        super(basePrice, manualFee);
    }
}
