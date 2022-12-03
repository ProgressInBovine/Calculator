package data;

import java.math.BigDecimal;

/**
 * @PackgeName: data.model
 * @Author: Creed of QB
 * @Date: 2022/12/3 17:00
 * @project: CostCalculator
 * @Description:
 */
public class BaseCost {

    /**
     * 基础价格
     */
    private BigDecimal basePrice;

    /**
     * 手工费
     */
    private BigDecimal manualFee;

    public BaseCost(BigDecimal basePrice, BigDecimal manualFee) {
        this.basePrice = basePrice;
        this.manualFee = manualFee;
    }

    public BigDecimal getFullyCost(){
        return basePrice.add(manualFee);
    }

    public BigDecimal getDIYCost(){
        return basePrice;
    }
}
