package fawda.design.decoratorpattern.simplie;

/**
 * <b>时间:</b> <i>2019-03-17 20:13</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain }使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author liuyl@hzrisencn.com
 **/
public class BattercakeWithEggAndSausage extends BattercakeWithEgg {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
