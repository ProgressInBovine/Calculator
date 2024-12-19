package model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Spot {

    /**
     * 现货ID
     */
    private String spotId;

    /**
     * 交易日期
     */
    private String tradingDate;

    /**
     * 现货价格
     */
    private BigDecimal spotPrice;

    /**
     * 利润
     */
    private BigDecimal profit;

    /**
     * 利润阈值
     */
    private BigDecimal profitThreshold;
}
