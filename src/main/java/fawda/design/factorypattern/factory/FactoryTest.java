package fawda.design.factorypattern.factory;


/**
 * <b>时间:</b> <i>2019-03-07 23:14</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain }使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author liuyl@hzrisencn.com
 **/
public class FactoryTest {
    public static void main(String[] args) {
        IVehicleFactory ivehicleFactory = new BusFactory();
        ivehicleFactory.create().create();

        ivehicleFactory = new CarFactory();
        ivehicleFactory.create().create();

        ivehicleFactory = new ElectricleVechicleFactory();
        ivehicleFactory.create().create();

    }
}
