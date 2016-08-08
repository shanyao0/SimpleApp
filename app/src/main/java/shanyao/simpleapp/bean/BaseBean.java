package shanyao.simpleapp.bean;

/**
 * Created by zs on 2016/8/5.
 */
public class BaseBean<T> {

    private boolean result;
    private String msg;
    private T data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
