package shanyao.simpleapp.http.httplibrary;

import java.util.HashMap;

/**
 * Created by zs on 2016/8/16.
 */
public class RequestParams {
    protected HashMap<String, String> map;

    public RequestParams() {
        this.map  = new HashMap<>();
    }

    public HashMap getParamsMap() {
        return map;
    }

    public void put(String key, String value) {
        map.put(key, value);
    }

    public void put(String key, long value) {
        map.put(key, String.valueOf(value));
    }

    public void put(String key, int value) {
        map.put(key, String.valueOf(value));
    }

    public void put(String key, double value) {
        map.put(key, String.valueOf(value));
    }
}
