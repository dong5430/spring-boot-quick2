package dong.config;

import org.springframework.beans.factory.annotation.Value;

public class MyConfigBean {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;
    @Value("${person.addr}")
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
