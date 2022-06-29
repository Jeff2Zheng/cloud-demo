package jz.example.business.base.result;
import java.io.Serializable;

/**
 * @Author JZ
 * @Date 2022/3/30
 */
public class ResponseData<T> implements Serializable {

    private boolean success;
    private Integer code;
    private String message;
    private T data;

    public ResponseData(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseData(boolean success, Integer code, String message, T data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ResponseData<T> of(boolean success, Integer code, String message, T data) {
        return new ResponseData(success, code, message, data);
    }

    public static ResponseData success() {
        return success((Object)null);
    }

    public static <T> ResponseData success(T data) {
        String message = MessageUtil.getMsg(ResponseCodeEnum.SUCCESS.getCode(), new String[]{ResponseCodeEnum.SUCCESS.getMessage()});
        ResponseData<T> result = new ResponseData(ResponseCodeEnum.SUCCESS.getCode(), message, data);
        result.setSuccess(true);
        return result;
    }

    public static <T> ResponseData success(String message, T data) {
        ResponseData<T> result = new ResponseData(ResponseCodeEnum.SUCCESS.getCode(), message, data);
        result.setSuccess(true);
        return result;
    }

    public static <T> ResponseData success(T data, Integer code, String... args) {
        String message = MessageUtil.getMsg(code, args);
        ResponseData<T> result = new ResponseData(code, message, data);
        result.setSuccess(true);
        return result;
    }

    public static <T> ResponseData success(T data, String message) {
        ResponseData<T> result = new ResponseData(ResponseCodeEnum.SUCCESS.getCode(), message, data);
        result.setSuccess(true);
        return result;
    }

    public static <T> ResponseData fail(Integer code, String... args) {
        String message = MessageUtil.getMsg(code, args);
        ResponseData<T> result = new ResponseData(code, message, (Object)null);
        result.setSuccess(false);
        return result;
    }

    public static <T> ResponseData fail() {
        ResponseData<T> result = new ResponseData(ResponseCodeEnum.FAILED.getCode(), ResponseCodeEnum.FAILED.getMessage(), (Object)null);
        result.setSuccess(false);
        return result;
    }

    public static <T> ResponseData fail(String message) {
        ResponseData<T> result = new ResponseData(ResponseCodeEnum.FAILED.getCode(), message, (Object)null);
        result.setSuccess(false);
        return result;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
