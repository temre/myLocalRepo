package devmanuals;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld")
public class JsfHelloWorldBean {
String str= "JSF Hello World";

public String getStr() {
return str;
}
}