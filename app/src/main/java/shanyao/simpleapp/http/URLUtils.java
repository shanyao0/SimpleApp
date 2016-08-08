package shanyao.simpleapp.http;

/**
 * Created by zs on 2016/3/25.
 */
public interface URLUtils {
    //  String BASE_URL = "http://112.124.9.133:8080/parking";
//    String BASE_URL = "http://115.28.209.219:8080/parking-app-client-1.0";
    //  String BASE_URL = "http://192.168.1.111:8080/dovey-parking";
//      String BASE_URL = "http://1r519m4940.iask.in/parking-app-client";
//      String BASE_URL = "http://service.huaching.com/parking-app-client";
    String BASE_URL = "http://service.huaching.com/client";
    String BASE_URL1 = BASE_URL + "/";
    String SHARE_CARPORT1 = "android/newApi/shareSpaceApi/shareList";// 共享车位
    /**
     * 登陆
     */
    String SEND_MSM = BASE_URL + "/android/newApi/carUserApi/sendMsg";// 发送短信
    String CHECK_MSM = BASE_URL + "/android/newApi/carUserApi/validate";// 校验，验证码

    /**
     * 找车场
     */
    String GET_NEAR_PARK = BASE_URL + "/android/newApi/park/getAllByRectangle";// 附近的车场
    String GET_NEAREST_PARK = BASE_URL + "/android/newApi/park/getNeighborhoodPark";// 最近的车场
    String GET_ALL_PARK = BASE_URL + "/android/newApi/park/getAll";// 所有的车场
    /**
     * 车位市场
     */
    String CAR_MARKET = BASE_URL + "/android/newApi/market/getList";// 车位市场
    String CAR_MARKET_DETAIL = BASE_URL + "/android/newApi/market/detail";// 车位市场--详情

    String SHARE_CARPORT = BASE_URL + "/android/newApi/shareSpaceApi/shareList";// 共享车位
    String SHARE_CARPORT_DETAIL = BASE_URL + "/android/newApi/shareSpaceApi/shareDetail";// 共享车位详情
    String SHARE_CARPORT_MARKET_ORDER = BASE_URL + "/android/newApi/shareSpaceApi/book";// 共享车位预约
    /**
     * 我的车位
     */
    String FIXED_CARPORT_DEFAULT = BASE_URL + "/android/newApi/carSpaceControl/getSingleSpaceData";// 我的车位 - 固定车位
    String FIXED_CARPORT_DETAIL = BASE_URL + "/android/newApi/carSpaceControl/getOtherSpaceData";// 我的车位 - 固定车位--详情
    String LOCK_RISE_OR_DROP = BASE_URL + "/android/newApi/carSpaceControl/operate";// 我的车位 - 升降锁
    String LOCK_RISE_OR_DROP_NEW = BASE_URL + "/android/newApi/carSpaceControl/operateNew";// 我的车位 - 升降锁
    String FIXED_CARPORT_LIST = BASE_URL + "/android/newApi/carSpaceControl/getSpaceData";// 我的车位 - 固定车位-列表\

    String TEMP_CARPORT_LIST = BASE_URL + "/android/newApi/shareSpaceApi/tempSpaceList";// 临时车位
    String TEMP_CARPORT_DETAIL = BASE_URL + "/android/newApi/shareSpaceApi/tempSpaceDetail";// 临时车位

    String BIND_CARPORT = BASE_URL + "/android/newApi/publishSpaceApi/bindSpace";// 绑定地锁
    String BIND_CARPORT_NEW = BASE_URL + "/android/newApi/publishSpaceApi/bindSpaceNew";// 新的绑定地锁

    String UNBIND_CARPORT = BASE_URL + "/android/newApi/publishSpaceApi/cancelBind";// 解除绑定
    String CHANGE_BIND_CARPORT = BASE_URL + "/android/newApi/publishSpaceApi/transferSpace";// 绑定转移

    /**
     * 我的发布
     */
    String MY_PUBLISH_CARPORT = BASE_URL + "/android/newApi/publishSpaceApi/publishList";// 列表
    String MY_PUBLISH_CARPORT_DETAIL = BASE_URL + "/android/newApi/publishSpaceApi/publishDetail";// 详情
    String CANCEL_PUBLISH = BASE_URL + "/android/newApi/publishSpaceApi/publishCancel";// 取消发布
    /**
     * 个人中心相关
     */

    String GET_USER_INFO = BASE_URL + "/android/newApi/carUserApi/findByMobile";
    //    String UPLOAD_ICON = "http://115.28.209.219/dovey-parking-1.0/picture/uploadPortrait";
    String UPLOAD_ICON = "http://cloud.huaching.com/parking/picture/uploadPortrait";
    String USER_ADVICE_URL = BASE_URL + "/android/newApi/adviseApi/complaint";
    String USER_WAITING_PAY = BASE_URL + "/android/newApi/payment/getNoPaymentRecord";
    String UPLOAD_USER_INFO = BASE_URL + "/android/newApi/carUserApi/updateUser";
    String USER_BILL_LIST = BASE_URL + "/android/newApi/carUserAccount/billingDetails";

    /**
     * 停车场相关
     */

    String GET_PARKING_DETAIL = BASE_URL + "/android/newApi/park/getParkData";
    String COLLECT_PARKING_DETAIL = BASE_URL + "/android/newApi/favorite/favorite";// 收藏停车场

    /**
     * 我的收藏
     */

    String FAVORITE_PARK = BASE_URL + "/android/newApi/favorite/getFavoriteByMobile";// 我收藏的列表
    /**
     * 我的爱车
     */

    String MY_CAR = BASE_URL + "/android/newApi/myCar/getAll";// 我的爱车列表
    String ADD_CAR = BASE_URL + "/android/newApi/myCar/add";// 添加我的爱车
    String DELETE_CAR = BASE_URL + "/android/newApi/myCar/delete";// 删除我的爱车
    String BIND_CAR = BASE_URL + "/android/newApi/carUserApi/bindPlateNumber";// 绑定我的爱车

    /**
     * 车位包相关
     */

    String GET_MY_CARPORT_LIST = BASE_URL + "/android/newApis/myMarket/getList";
    String GET_MY_CARPORT_DETAIL = BASE_URL + "/android/newApis/myMarket/detail";
    String BUY_CARPORT_BY_ACCOUNT = BASE_URL + "/android/newApi/market/buy";
    String BUY_CARPORT_BY_ALIPAY = BASE_URL + "/android/newApi/alipay/getMarketPayInfo";


    /**
     * 支付相关
     */


    String ALIPAY_MY_ACCOUNT = BASE_URL + "/android/newApi/alipay/getAccountPayInfo ";
    String ALIPAY_ORDER_PARKING = BASE_URL + "/android/newApi/alipay/getNoPaymentPayInfo";
    String ACCOUNT_PAY_ORDER_PARKING = BASE_URL + "/android/newApi/carUserAccount/payOrder";
    String GET_HAS_ORDER = BASE_URL + "/android/newApi/homePageApi/getPay";

    String GET_SHARE_CARPORT_ALI_PAY_INFO = BASE_URL + "/android/newApi/alipay/getSpacePayInfo";
    String SHARE_CARPORT_ACCOUNT_PAY = "";


    /**
     * 预订相关
     */

    String BOOK_CONFIRM_ORDER = BASE_URL + "/android/newApi/order/generate";
    String BOOK_DEFAULT_CONFIRM = BASE_URL + "/android/newApi/subscribe/default";

    /**
     * 我的预定，我的订单
     */

    String BOOK_NOW = BASE_URL + "/android/newApi/subscribe/findDueByMobile";
    String BOOK_HISTORY = BASE_URL + "/android/newApi/subscribe/findOverDueByMobile";

    String SHARE_CARPORT_BOOK = BASE_URL + "/android/newApi/shareSpaceApi/bookList";// 共享车位的预约列表
    String SHARE_CARPORT_BOOK_DETAIL = BASE_URL + "/android/newApi/shareSpaceApi/BIDetail"; // 共享车位的预约详情

    String SHARE_CARPORT_ORDER = BASE_URL + "/android/newApi/orderSpaceApi/myOrder";// 共享车位的订单列表
    String SHARE_CARPORT_ORDER_DETAIL = BASE_URL + "/android/newApi/orderSpaceApi/myOrderDetail"; // 共享车位的订单详情

    /**
     * 我的授权
     */
    String AUTHORIZATION_LIST = BASE_URL + "/android/newApi/shareSpaceApi/impowerList";
    String AUTHORIZATION = BASE_URL + "/android/newApi/shareSpaceApi/impower";

    /**
     * 车位市场
     */
    String PAY_RECORD = BASE_URL + "/android/newApi/payment/getPaymentRecordList";// 缴费记录
    String PAY_RECORD_DETAIL = BASE_URL + "/android/newApi/payment/getPaymentOrder";// 缴费记录--详情
    /**
     * 版本更新
     */
    String DOWN_APK = "http://cloud.huaching.com/parking/version/download";// 下载软件
    String GET_UPDATE_INFO = "http://cloud.huaching.com/parking/version/getNew";// 获取服务器版本信息

    /**
     * 车位分享
     */

    String ADD_RELEASE = BASE_URL + "/android/newApi/share/addShare";
    String GET_RELEASE_INCOME = BASE_URL + "/android/newApi/share/getIncomeByMobile";
    String GET_RELEASE_DATE = BASE_URL + "/android/newApi/share/getShareBySpaceId";
    String UPDATE_RELEASE_STATUS = BASE_URL + "/android/newApi/share/updateStatusById";
    String GET_RELEASE_LIST = BASE_URL + "/android/newApi/share/getShareList";
    String SHARE_GET_NEAR_PARK = BASE_URL + "/android/newApi/SpaceApi/spaceOnParkList";
    String SHARE_GET_NEAREST_PARK = BASE_URL + "/android/newApi/SpaceApi/getNeighborhoodPark";
    String SHARE_GET_NEAREST_PARK_LIST = BASE_URL + "/android/newApi/SpaceApi/spaceList";
    /**
     * 新车位分享
     */
    String PUBLISH_CARPORT = BASE_URL + "/android/newApi/publishSpaceApi/publishSpace";//发布车位
    String LONG_RENT_LIST = BASE_URL + "/android/newApi/member/getList";//长租车位列表
    String LONG_RENT_DETAIL = BASE_URL + "/android/newApi/member/priceDetail";//长租车位详情
    String LONG_RENT_ORDER_BUILD = BASE_URL + "/android/newApi/member/save";//长租订单
    String MY_LONG_RENT_DETAIL = BASE_URL + "/android/newApi/member/detail";//我的长租车位详情
    String MY_LONG_RENT_LIST = BASE_URL + "/android/newApi/member/getMyList";//我的长租车位列表
    String MY_LONG_RENT_RENEW_BUILD = BASE_URL + "/android/newApi/member/renewal";//我的长租车位续费生成订单
    String LONG_RENT_ORDER_SIGN = BASE_URL + "/android/alipay/getMemberPayInfo";//长租车位包订单
    String ASK_RENT_CARPORT = BASE_URL + "/android/newApi/publishSpaceApi/needList";//我要求租的列表
    String ASK_RENT_CARPORT_DETAIL = BASE_URL + "/android/newApi/publishSpaceApi/needDetail";//我要求租的详情
    String PUBLISH_RENT_CARPORT = BASE_URL + "/android/newApi/publishSpaceApi/publishNeed";//发布求组

    String ASK_RENT_CARPORT_TEST = BASE_URL + "/android/newApi/member/jianqian";//测试

    /**
     * 获取所有的停车场信息
     */
    String GET_ALL_PARKNAME_AND_ID = BASE_URL + "/android/newApi/homePageApi/getParks";// 获取所有的停车场信息

    /**
     * 我的收入
     */

    String MY_INCOME = BASE_URL + "/android/newApi/orderSpaceApi/myIncome";
    String MY_INCOME_DETAIL = BASE_URL + "/android/newApi/orderSpaceApi/incomeDetail";

    /**
     * 我的求租
     */
    String MY_ASK_RENT = BASE_URL + "/android/newApi/publishSpaceApi/myNeedList";//我的求租列表
    String MY_ASK_RENT_DETAIL = BASE_URL + "/android/newApi/publishSpaceApi/needDetail";//我的求租详情
    String DETAIL_MY_ASK_RENT = BASE_URL + "/android/newApi/publishSpaceApi/needDelete";//删除一条我的求租

}

