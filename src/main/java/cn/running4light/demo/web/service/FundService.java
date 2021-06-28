package cn.running4light.demo.web.service;

import cn.running4light.demo.entity.SimpleDetail;
import com.google.gson.Gson;
import com.xiaoleilu.hutool.http.HttpUtil;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author running4light
 * @description
 * @createTime 2021/6/28 16:38
 */
@Service
public class FundService {
    public List find(String[] codes) {
        GsonJsonParser s = new GsonJsonParser();
        List list = new ArrayList();
        for (String code :
                codes) {
            String data = HttpUtil.get("http://fundgz.1234567.com.cn/js/"+ code +".js");
            String cut = data.replace("jsonpgz(", "").replace(");", "");
//            System.err.println(cut);
            Gson son = new Gson();
//            Object simpleDetail = son.fromJson(cut, Object.class);
            Map<String, Object> obj = s.parseMap(cut);
            // 时间字符串转datetime有问题 暂时先存为字符串
            SimpleDetail simpleDetail = son.fromJson(cut, SimpleDetail.class);
            list.add(simpleDetail);
        }
        return list;
    }
    public void print() {
        String[] codes = {"260108","005827","009777","007531","006098","320007","501057","501058","008086"
                ,"161725","161122","162412","003095","161725","519678"
                ,"004854","501037","001469","005658","100038","160222"};
        GsonJsonParser s = new GsonJsonParser();
        List list = new ArrayList();
        for (String code :
                codes) {
            String data = HttpUtil.get("http://fundgz.1234567.com.cn/js/"+ code +".js");
            String cut = data.replace("jsonpgz(", "").replace(");", "");
//            System.err.println(cut);
            Gson son = new Gson();
//            Object simpleDetail = son.fromJson(cut, Object.class);
            Map<String, Object> obj = s.parseMap(cut);
            // 时间字符串转datetime有问题 暂时先存为字符串
            SimpleDetail simpleDetail = son.fromJson(cut, SimpleDetail.class);
            System.err.println(simpleDetail);
        }
    }
}
