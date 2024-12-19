package model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 计算指标
 */
@Data
public class Indicator {

    /**
     * 基差
     */
    private BigDecimal basis;

    /**
     * 是否高库存标志位
     */
    private boolean isHighInventory;

    /**
     * 是否高利润标志位
     */
    private boolean isHighProfitable;
}
