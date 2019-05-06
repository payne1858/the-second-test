package club.payne.jmeterdemo1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public @ResponseBody Object login(){

        ArrayList<Object> list = new ArrayList<>();
        list.add("tom");
        list.add("jack");
        list.add("marry");
        System.out.println("请求成功...");
        System.out.println("2秒");
        return list;

    }


    @RequestMapping(value = "/info",method = RequestMethod.POST)
    public @ResponseBody Object info(String name,String address) {
        System.out.println("请求成功...");
        System.out.println("用户姓名是：" + name + "," + "地址是：" + address);
        ArrayList<Object> list = new ArrayList<>();
        list.add("tom");
        System.out.println("this is v2");
        list.add(name);
        return list;
    }

}
