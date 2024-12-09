import java.math.BigDecimal;

/**
 * 计算服务
 */
public class CalculatorService {

    public static void main(String[] args) {
        PriceCalculator pc = new PriceCalculator();
        BigDecimal op = new BigDecimal(17525);
        BigDecimal basic = new BigDecimal(-1040);
        System.out.println("橡胶合约RU2505的实际价值是："+ pc.calculateFuturePrice(op, basic));
        BigDecimal percent = new BigDecimal(0.02);
        System.out.println("橡胶合约RU2505未来1日最高价格是："+ pc.calculateFutureUpperPrice(pc.calculateFuturePrice(op, basic), percent));
        System.out.println("橡胶合约RU2505未来1日最高价格是："+ pc.calculateFutureLowerPrice(pc.calculateFuturePrice(op, basic), percent));
    }

}
