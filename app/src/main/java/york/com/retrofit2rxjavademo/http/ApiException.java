package york.com.retrofit2rxjavademo.http;

/**
 * @author YorkYu
 * @version V1.0
 * @Project: Supplier
 * @Package mall.b2b.meixun.com.supplier.net
 * @Description:
 * @time 2016/8/11 9:20
 */
public class ApiException extends Exception {
    public int code;
    public String message;

    public ApiException(Throwable throwable, int code) {
        super(throwable);
        this.code = code;

    }
}
