package shanyao.simpleapp.bean;

import java.util.List;

/**
 * Created by zhaoshuo on 2016/6/3.
 */
public class ShareCarportInfo{


    /**
     * data : [{"address":"","endTime":"18:00","id":46,"latitude":0,"longitude":0,"parkName":"","picture":"","price":0.1,"publishTime":"2016-06-07 14:39","spaceType":1,"statTime":"08:00","status":2},{"address":"浙江 温州 瑞安市 商城大道","endTime":"19:00","id":1,"latitude":27.776049,"longitude":120.639107,"parkName":"瑞安隆山公园社会停车场","picture":"http://cloud.huaching.com/parking/picture/getPicture?fileName=1603303025339313.jpg","price":10.6,"publishTime":"2016-06-02 11:21","spaceType":2,"statTime":"08:00","status":2},{"address":"浙江 温州 瑞安市 商城大道","endTime":"19:00","id":2,"latitude":27.776049,"longitude":120.639107,"parkName":"瑞安隆山公园社会停车场","picture":"http://cloud.huaching.com/parking/picture/getPicture?fileName=1603303025339313.jpg","price":10.6,"publishTime":"2016-06-03 10:38","spaceType":1,"statTime":"08:00","status":2},{"address":"浙江 温州 瑞安市 商城大道","endTime":"19:00","id":3,"latitude":27.776049,"longitude":120.639107,"parkName":"瑞安隆山公园社会停车场","picture":"http://cloud.huaching.com/parking/picture/getPicture?fileName=1603303025339313.jpg","price":10.6,"publishTime":"2016-06-03 10:39","spaceType":1,"statTime":"08:00","status":2},{"address":"浙江 温州 瑞安市 商城大道","endTime":"19:00","id":4,"latitude":27.776049,"longitude":120.639107,"parkName":"瑞安隆山公园社会停车场","picture":"http://cloud.huaching.com/parking/picture/getPicture?fileName=1603303025339313.jpg","price":10.6,"publishTime":"2016-06-03 10:39","spaceType":1,"statTime":"08:00","status":2},{"address":"浙江 温州 瑞安市 商城大道","endTime":"19:00","id":5,"latitude":27.776049,"longitude":120.639107,"parkName":"瑞安隆山公园社会停车场","picture":"http://cloud.huaching.com/parking/picture/getPicture?fileName=1603303025339313.jpg","price":10.6,"publishTime":"2016-06-03 10:49","spaceType":1,"statTime":"08:00","status":2},{"address":"浙江 温州 瑞安市 商城大道","endTime":"19:00","id":6,"latitude":27.776049,"longitude":120.639107,"parkName":"瑞安隆山公园社会停车场","picture":"http://cloud.huaching.com/parking/picture/getPicture?fileName=1603303025339313.jpg","price":10.6,"publishTime":"2016-06-03 10:54","spaceType":1,"statTime":"08:00","status":2},{"address":"浙江 温州 瑞安市 商城大道","endTime":"18:00","id":48,"latitude":27.776049,"longitude":120.639107,"parkName":"瑞安隆山公园社会停车场","picture":"http://cloud.huaching.com/parking/picture/getPicture?fileName=1603303025339313.jpg","price":12,"publishTime":"2016-06-07 17:38","spaceType":1,"statTime":"06:00","status":2}]
     * msg :
     * result : true
     */

    private String msg;
    private boolean result;
    /**
     * address :
     * endTime : 18:00
     * id : 46
     * latitude : 0
     * longitude : 0
     * parkName :
     * picture :
     * price : 0.1
     * publishTime : 2016-06-07 14:39
     * spaceType : 1
     * statTime : 08:00
     * status : 2
     */

    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String address;
        private String endTime;
        private int id;
        private float latitude;
        private float longitude;
        private String parkName;
        private String picture;
        private double price;
        private String publishTime;
        private int spaceType;
        private String statTime;
        private int status;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public float getLatitude() {
            return latitude;
        }

        public void setLatitude(float latitude) {
            this.latitude = latitude;
        }

        public float getLongitude() {
            return longitude;
        }

        public void setLongitude(float longitude) {
            this.longitude = longitude;
        }

        public String getParkName() {
            return parkName;
        }

        public void setParkName(String parkName) {
            this.parkName = parkName;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(String publishTime) {
            this.publishTime = publishTime;
        }

        public int getSpaceType() {
            return spaceType;
        }

        public void setSpaceType(int spaceType) {
            this.spaceType = spaceType;
        }

        public String getStatTime() {
            return statTime;
        }

        public void setStatTime(String statTime) {
            this.statTime = statTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }
}
