package model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Future {

    /**
     * 合约号
     */
    private String contract;

    /**
     * 合约价格
     */
    private BigDecimal contractPrice;

    /**
     * 交易日期
     */
    private String tradingDate;

    /**
     * 合约当日结算价格
     */
    private BigDecimal contractSettlePrice;

    /**
     * 现货ID
     */
    private String spotId;

    /**
     * 库存(仓单)
     */
    private BigDecimal inventory;

    /**
     * 库存(仓单)阈值
     */
    private BigDecimal inventoryThreshold;


}
