/**
 * @author tufei
 * @date 2018/2/9.
 */

class CompanionObjectTest {
    public static void main(String[] args){
        //不可以
        //User.getName();
        //可以,获取到加了@JvmStatic注解的字段，但是是get方法来获取
        String password = User.getPassword();
        //可以,获取到加了@JvmField注解的字段
        //所以通常是使用@JvmField来标注顶层属性或者声明在object中的属性，而不是@JvmStatic
        int age = User.age;

        //不可以,使用Java调的时候，不存在这样的方法
        //User.method()
        //可以
        User.methodWithJvmStatic();
    }
}
