package shanyao.simpleapp.fragment;

import android.support.v4.app.Fragment;

import shanyao.simpleapp.R;
import shanyao.simpleapp.fragment.main.ConsumeCenterFragment;
import shanyao.simpleapp.fragment.main.DataCenterFragment;
import shanyao.simpleapp.fragment.main.MainFragment;
import shanyao.simpleapp.fragment.main.ManagerCenterFragment;
import shanyao.simpleapp.fragment.main.OperationCenterFragment;
import shanyao.simpleapp.fragment.main.consume.EatOrderFragment;
import shanyao.simpleapp.fragment.main.consume.MerchantOrderFragment;
import shanyao.simpleapp.fragment.main.consume.ParkingOrderFragment;
import shanyao.simpleapp.fragment.main.consume.VipOrderFragment;
import shanyao.simpleapp.fragment.main.data.CarAnalysisFragment;
import shanyao.simpleapp.fragment.main.data.CarStatisticsFragment;
import shanyao.simpleapp.fragment.main.data.ChargeStatisticsFragment;
import shanyao.simpleapp.fragment.main.data.IncomeAnalysisFragment;
import shanyao.simpleapp.fragment.main.manager.MerchantManagerFragment;
import shanyao.simpleapp.fragment.main.manager.VipManagerFragment;
import shanyao.simpleapp.fragment.main.operation.CorpseCarFragment;
import shanyao.simpleapp.fragment.main.operation.OnParkCarFragment;
import shanyao.simpleapp.fragment.main.operation.OutInRecordFragment;
import shanyao.simpleapp.fragment.main.operation.PayRecordFragment;
import shanyao.simpleapp.fragment.main.operation.UnusualOpenFragment;
import shanyao.simpleapp.fragment.me.MeFragment;
import shanyao.simpleapp.fragment.park.ParkListFragment;
import shanyao.simpleapp.utils.LogUtils;


/**
 * fragment的工厂类
 * zs on 2015/11/3.
 */
public class FragmentFactory {

    /**
     * 根据资源id返回不同的fragment
     */
    public static Fragment createById(int resId) {
        Fragment fragment = null;
        switch (resId) {
            case R.id.home_operation_center:// 运营中心
                fragment = new OperationCenterFragment();
                break;
            case R.id.home_consume_center:// 消费中心
                fragment = new ConsumeCenterFragment();
                break;
            case R.id.home_manager_center:// 管理中心
                fragment = new ManagerCenterFragment();
                break;
            case R.id.home_data_center:// 数据中心
                fragment = new DataCenterFragment();
                break;
        }
        return fragment;
    }

    /**
     * main
     *
     * @param position
     * @return
     */
    public static Fragment createForMain(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:// 主页
                fragment = new MainFragment();
                break;
            case 1:// 停车场
                fragment = new ParkListFragment();
                break;
            case 2:// 我
                fragment = new MeFragment();
                break;
        }
        return fragment;
    }

    /**
     * 运营中心
     *
     * @param position
     * @return
     */
    public static Fragment createForOperation(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:// 异常开闸
                fragment = new UnusualOpenFragment();
                LogUtils.e("zs",position+"------UnusualOpenFragment");
                break;
            case 1:// 出入记录
                fragment = new OutInRecordFragment();
                LogUtils.e("zs",position+"------OutInRecordFragment");
                break;
            case 2:// 在场车辆
                fragment = new OnParkCarFragment();
                LogUtils.e("zs",position+"------OnParkCarFragment");
                break;
            case 3:// 僵尸车辆
                fragment = new CorpseCarFragment();
                LogUtils.e("zs",position+"------CorpseCarFragment");
                break;
            case 4:// 缴费记录
                fragment = new PayRecordFragment();
                LogUtils.e("zs",position+"------PayRecordFragment");
                break;
        }
        return fragment;
    }

    /**
     * 消费中心
     *
     * @param position
     * @return
     */
    public static Fragment createForConsume(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:// 会员订单
                fragment = new VipOrderFragment();
                break;
            case 1:// 停车订单
                fragment = new ParkingOrderFragment();
                break;
            case 2:// 商家订单
                fragment = new MerchantOrderFragment();
                break;
            case 3:// 餐停定单
                fragment = new EatOrderFragment();
                break;
        }
        return fragment;
    }
    /**
     * 管理中心
     *
     * @param position
     * @return
     */
    public static Fragment createForManager(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:// 会员管理
                fragment = new VipManagerFragment();
                break;
            case 1:// 停车管理
                fragment = new MerchantManagerFragment();
                break;
        }
        return fragment;
    }
    /**
     * 数据中心
     *
     * @param position
     * @return
     */
    public static Fragment createForData(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:// 收费统计
                fragment = new ChargeStatisticsFragment();
                break;
            case 1:// 车次统计
                fragment = new CarStatisticsFragment();
                break;
            case 2:// 收入分析
                fragment = new IncomeAnalysisFragment();
                break;
            case 3:// 车次分析
                fragment = new CarAnalysisFragment();
                break;
        }
        return fragment;
    }
}
