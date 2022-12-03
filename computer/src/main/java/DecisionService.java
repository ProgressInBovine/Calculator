import service.MainCalculateService;

import java.math.BigDecimal;

/**
 * @PackgeName: PACKAGE_NAME
 * @Author: Creed of QB
 * @Date: 2022/12/3 17:08
 * @project: CostCalculator
 * @Description:
 */
public class DecisionService {

    public static void main(String[] args) {
        MainCalculateService ms = new MainCalculateService();
        ms.initFullyComputer();
        BigDecimal bigDecimal = ms.calculateCostOfBuyFully();
        System.out.println("整机的花费是：" + bigDecimal);
    }


}
