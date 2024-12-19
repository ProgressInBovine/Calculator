import model.Future;
import model.Indicator;
import model.Spot;

import java.math.BigDecimal;

/**
 * 期货价值计算模型
 */
public class FutureCalculator {

    /**
     * 计算基差（合约结算价）
     * @param future 期货合约
     * @param spot 现货
     * @return
     */
    public Indicator calculatorIndicator(Future future, Spot spot){
        Indicator indicator = new Indicator();
        BigDecimal basis = spot.getSpotPrice().subtract(future.getContractSettlePrice());
        indicator.setBasis(basis);
        boolean isHighInventory = future.getInventory().subtract(future.getInventoryThreshold()).subtract(new BigDecimal(10000)).compareTo(BigDecimal.ZERO) > 0;
        indicator.setHighInventory(isHighInventory);
//        boolean isHighProfitable = spot.getProfit().subtract(spot.getProfitThreshold()).subtract(new BigDecimal(100)).compareTo(BigDecimal.ZERO) > 0;
//        indicator.setHighProfitable(isHighProfitable);
        return indicator;
    }
}
