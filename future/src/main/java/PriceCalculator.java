import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceCalculator {

    /**
     * 模型设计
     *
     * 基础功能：根据当前行情，推算
     *
     * 1、当前合约实际价值（应有点位）
     * 当前合约实际价值 = 现货价格 + 基差
     *  现货价格 = 基准价格
     * 2、未来一天涨跌幅度
     */

    /**
     * 计算合约实际价值
     * @param op 现货基准价
     * @param basis 基差
     * @return 合约实际价值
     */
    public BigDecimal calculateFuturePrice(BigDecimal op, BigDecimal basis){
        return op.subtract(basis);
    }

    /**
     * 计算合约未来1日最高价值
     * @param tp 合约实际价值
     * @param percent （待定）
     * @return 合约未来1日最高价值
     */
    public BigDecimal calculateFutureUpperPrice(BigDecimal tp, BigDecimal percent) {
        return tp.add(tp.multiply(percent)).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * 计算合约未来1日最低价值
     * @param tp 合约实际价值
     * @param percent （待定）
     * @return 合约未来1日最低价值
     */
    public BigDecimal calculateFutureLowerPrice(BigDecimal tp, BigDecimal percent) {
        return tp.subtract(tp.multiply(percent)).setScale(2, RoundingMode.HALF_UP);
    }
}
