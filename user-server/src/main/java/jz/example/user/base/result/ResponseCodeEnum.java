package jz.example.user.base.result;

/**
 * @Author JZ
 * @Date 2022/3/30
 */
public enum ResponseCodeEnum {

    SUCCESS(200, "请求成功"),
    FAILED(201, "请求失败"),
    ERROR(500, "请求异常，请联系平台管理员！"),
    UNAUTHORIZED(403, "抱歉，您没有访问权限"),
    NOT_FOUND(404, "路径不存在，请检查路径是否正确"),
    METHOD_NOT_ALLOWED(405, "不支持'%s'请求"),
    MESSAGE_NOT_READABLE(400, "参数格式转换错误");

    private Integer code;
    private String message;

    private ResponseCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
