

/**
 * 自定义异常类
 * 第二种定义方式：继承Throwable 类
 * Throwable 类是 Java 语言中所有错误或异常的超类。它的两个子类是Error和Exception；
 * @author new
 *
 */
public class MySecondException extends Throwable {

	public MySecondException() {
		super();
	}

	public MySecondException(String msg) {
		super(msg);
	}

	public MySecondException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public MySecondException(Throwable cause) {
		super(cause);
	}
}
