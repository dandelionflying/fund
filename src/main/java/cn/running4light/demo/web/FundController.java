package cn.running4light.demo.web;

import cn.running4light.demo.entity.SimpleDetail;
import com.xiaoleilu.hutool.http.HttpUtil;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author running4light
 * @description
 * @createTime 2021/6/25 13:57
 */
@RequestMapping("fund")
@RestController
public class FundController {

    @GetMapping("get")
    public String get(@RequestParam  String code){
        HttpUtil s = new HttpUtil();
        String s1 = HttpUtil.get("http://fundgz.1234567.com.cn/js/"+ code +".js");
        return s1;
    }

    @GetMapping("list")
    public List list(){
        String[] codes = {"003095","161725"};
        GsonJsonParser s = new GsonJsonParser();
        List list = new ArrayList<>();
        for (String code :
                codes) {
            String data = HttpUtil.get("http://fundgz.1234567.com.cn/js/"+ code +".js");
            String cut = data.replace("jsonpgz(", "").replace(");", "");
            Map<String, Object> obj = s.parseMap(cut);
            list.add(obj);
        }
        return list;
    }
    @PostMapping("codeAll")
    public List codeAll(){
        String trl = "http://fund.eastmoney.com/js/fundcode_search.js";
        return null;
    }
}
