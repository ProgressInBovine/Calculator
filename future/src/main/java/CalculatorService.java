import model.Future;
import model.Indicator;
import model.Spot;

import java.math.BigDecimal;

/**
 * 计算服务
 */
public class CalculatorService {

    public static void main(String[] args) {
//        PriceCalculator pc = new PriceCalculator();
//        BigDecimal op = new BigDecimal(17525);
//        BigDecimal basic = new BigDecimal(-1040);
//        System.out.println("橡胶合约RU2505的实际价值是："+ pc.calculateFuturePrice(op, basic));
//        BigDecimal percent = new BigDecimal(0.02);
//        System.out.println("橡胶合约RU2505未来1日最高价格是："+ pc.calculateFutureUpperPrice(pc.calculateFuturePrice(op, basic), percent));
//        System.out.println("橡胶合约RU2505未来1日最高价格是："+ pc.calculateFutureLowerPrice(pc.calculateFuturePrice(op, basic), percent));

        FutureCalculator calculator = new FutureCalculator();
        Future future = new Future();
        future.setContract("RU2505");
        future.setTradingDate("20241219");
        future.setContractSettlePrice(new BigDecimal(17705));
        future.setInventory(new BigDecimal(137800));
        future.setInventoryThreshold(new BigDecimal(154270));
        Spot spot = new Spot();
        spot.setSpotPrice(new BigDecimal(17005));
//        spot.setProfit(new BigDecimal());
        Indicator indicator = calculator.calculatorIndicator(future, spot);
        System.out.println("交易日"+future.getTradingDate()+"合约"+future.getContract()+"基差是"+indicator.getBasis());
        if(indicator.getBasis().compareTo(BigDecimal.ZERO) > 0){
            System.out.println("交易日"+future.getTradingDate()+"合约"+future.getContract()+"处于升水");
        }
        else {
            System.out.println("交易日"+future.getTradingDate()+"合约"+future.getContract()+"处于贴水");
        }
        if(indicator.isHighInventory()) {
            System.out.println("交易日"+future.getTradingDate()+"合约"+future.getContract()+"处于高仓位");
        }
        else {
            System.out.println("交易日"+future.getTradingDate()+"合约"+future.getContract()+"不处于高仓位");
        }
        if(indicator.isHighProfitable()) {
            System.out.println("交易日"+future.getTradingDate()+"合约"+future.getContract()+"处于高利润");
        }
        else {
            System.out.println("交易日"+future.getTradingDate()+"合约"+future.getContract()+"不处于高利润");
        }

        System.out.println();
        if(indicator.getBasis().compareTo(BigDecimal.ZERO) > 0
        && indicator.isHighInventory()) {
            System.out.println("交易日"+future.getTradingDate()+"合约"+future.getContract()+"适合高位做空");
        }

        if(indicator.getBasis().compareTo(BigDecimal.ZERO) < 0
        && !indicator.isHighInventory()) {
            System.out.println("交易日"+future.getTradingDate()+"合约"+future.getContract()+"适合低位做多");
        }

    }

}
