package shanyao.simpleapp.utils;

public interface ConstantUtils {
    /**
     * 加载界面的三种状态
     */
    String STATE_LOADING = "hxkj";
    String STATE_SUCCESSED = "shanyao";
    String STATE_FAILED = null;
    String CURRENT_STATE = STATE_SUCCESSED;
    /**
     * 根据资源id跳转的界面
     */
    int FIND_CARPORT_LIST = 1;// 找车场
    int PARKING_DETAIL = 2;// 找车场列表的详情
    int CARPORT_DETAIL = 3;// 车位的详情
    int NAVI_FRAGMENT = 4;// 导航界面
    int SEARCH_MAP = 5;// 地图搜索界面
    int CARPORT_PACKAGE = 6;// 车位包
    int MY_CAR_ADD = 7;// 我的爱车--添加
    int PAY_ORDER_DETAIL = 8;//支付订单详情
    int PAYRECORD_DETAIL = 9;// 缴费的详情
    int ADD_MY_CAR_NO = 10;
    int ADD_MY_CAR_POSITION = 11;// 添加爱车--添加位置


    int CAROUSE_TIME = 3000;// 首页轮播的时间间隔

    /**
     * 界面中的一些常亮
     */
    int MAX_ITEM_LOAD_MORE = 10;// 当首次请求数据超过条后开启加载更多功能
    int MAX_ITEM_LOAD_MORE_DYNAMIC = 10;// 首页动态
    int PAGER_ROWS = 10;// 每一页的数据
    int EMPTY_LIMIT = 20;// 低于这个为红色
    String EXIT_APP = "exit_app";// 退出登陆
    String REFRESH_MAIN = "refresh_main";// 刷新主页
    /**
     * 启动Activity的请求码常亮
     */
    // 请求码
    int FIND_CAR_SEARCH = 100;
    int ADD_CAR_POSITION = 101;// 我的爱车--添加爱车--添加位置
    int CODE_MY_CAR_ADD = 102;//我的爱车--添加
    int CODE_MORE_FIXED_CARPORT = 103;// 我的车位--固定车位--更多
    int EDIT_EDUCATION_EX = 104;
    int STUDY_ENSURE_ORDER = 105;
    int SEND_COURSE_MAP = 106;
    int SEND_PARTY_MAP = 107;

    /**
     * 请求需要result的activity常量
     */

    //请求的是打开相册列表的
    int ACTIVITY_ALBUM_REQUEST_CODE = 301;
    //请求的是相机的拍照功能
    int ACTIVITY_CAMERA_REQUEST_CODE = 302;
    //请求的是裁剪图片的
    int ACTIVITY_CUT_IMAGE_REQUEST_CODE = 303;
    //请求的是二维码扫描的
    int ACTIVITY_SCAN_CODE = 304;
    //请求carportlist的请求码
    int ACTIVITY_CARPORT_LIST= 305;
    //请求userinfo的请求码
    int ACTIVITY_USER_INFO = 306;
    //请求userwallet的请求码
    int ACTIVITY_USER_WALLET = 307;
    //请求充值页面的请求码
    int ACTIVITY_USER_ADD_ACCOUNT = 308;
    //请求支付订单详情页面的请求码
    int ACTIVITY_USER_PAY_ORDER_DETAIL = 309;


    /**
     *
     * 支付宝相关的常量
     *
     */


    int ALIPAY_SIGN = 1;
    int ALIPAY_PAY = 2;


    /**
     *
     * 微信支付常量
     *
     */
    int WE_CHAT_SIGN = 3;
    String WE_CHAT_APP_ID = "";



    /**
     * 网络请求的Toast用语
     */
    String INTERNET_NO_POWER = "网络不给力，请稍后再试";
    /**
     * 广播接收者的Action
     */
    String REFRESH_PAGE_FIRST_DYNAMIC = "refresh_page_first_dynamic";// 首页动态刷新
    String REFRESH_PAGE_MY_DYNAMIC = "refresh_page_my_dynamic";// 我的动态刷新
    String REFRESH_PAGE_COLLECT_DYNAMIC = "refresh_page_collect_dynamic";// 动态收藏刷新


    /**
     *
     * 请求地址常量
     */


    String URL = "http://112.124.9.133:8080/parking-app-client-1.0";//正式
    String TEST_URL = "http://115.28.209.219:8080/parking-app-client-1.0";//测试


    /**
     * 停车场类型常量
     */

    int GROUND_PARK = 1;
    int ROAD_SIDE_PARK = 3;
    int UNDERGROUND_PARK = 2;


    /**
     * 付款类型的常量
     */

    int SUPPORT_PAY_BOOK_ONLINE = 3;
    int SUPPORT_PAY_ONLINE = 2;
    int UNSUPPORT_PAY_ONLINE = 0;
    int READ_ONLY_ONLINE_PAY = 1;


    /**
     * 是否分时段收费
     */

    int ALL_DAY = 1;
    int DAY_NIGHT = 2;

    /**
     * 收费模式常量
     */


    int DAY_RULE_TYPE = 2;
    int TIME_RULE_TYPE = 1;


    /**
     * 车位包类型常量
     */


    int CARPORT_TYPE_NOON = 1;
    int CARPORT_TYPE_MOON = 2;
    int CARPORT_TYPE_ALL_DAY = 3;


    /**
     * 付款类型常量
     */

    int PAY_METHOD_NO = 0;
    int PAY_METHOD_ALIPAY = 1;
    int PAY_METHOD_WECHAT_PAY = 2;
    int PAY_METHOD_ACCOUNT = 3;
}
