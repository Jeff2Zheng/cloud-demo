package jz.example.user.util;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSONObject;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @Author JZ
 * @Date 2022/10/25
 */
public class StringUtil {
    public StringUtil() {
    }

    public static int length(CharSequence cs) {
        return StrUtil.length(cs);
    }

    public static String toString(Object value) {
        return null == value ? "" : value.toString();
    }

    public static String emptyIfNull(CharSequence str) {
        return StrUtil.nullToEmpty(str);
    }

    public static String nullToEmpty(CharSequence str) {
        return StrUtil.nullToDefault(str, "");
    }

    public static String nullToDefault(CharSequence str, String defaultStr) {
        return StrUtil.nullToDefault(str, defaultStr);
    }

    public static String emptyToDefault(CharSequence str, String defaultStr) {
        return StrUtil.emptyToDefault(str, defaultStr);
    }

    public static String blankToDefault(CharSequence str, String defaultStr) {
        return StrUtil.blankToDefault(str, defaultStr);
    }

    public static String emptyToNull(CharSequence str) {
        return StrUtil.emptyToNull(str);
    }

    public static String trim(CharSequence str) {
        return StrUtil.trim(str);
    }

    public static String hide(CharSequence str, int startInclude, int endExclude) {
        return StrUtil.hide(str, startInclude, endExclude);
    }

    public static String camel(String str) {
        return StrUtil.toCamelCase(str);
    }

    @Deprecated
    public static StringBuffer camel(StringBuffer str) {
        return new StringBuffer(StrUtil.toCamelCase(str));
    }

    public static String underline(String str) {
        return StrUtil.toUnderlineCase(str);
    }

    @Deprecated
    public static StringBuffer underline(StringBuffer str) {
        return new StringBuffer(StrUtil.toUnderlineCase(str));
    }

    public static String toLowerCaseFirstOne(String s) {
        return StrUtil.lowerFirst(s);
    }

    public static String toUpperCaseFirstOne(String s) {
        return StrUtil.upperFirst(s);
    }

    public static Map<String, Object> jsonStrToMap(String jsonStr) {
        Map<String, Object> dataMap = MapUtil.newHashMap();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        Iterator var3 = jsonObject.entrySet().iterator();

        while(var3.hasNext()) {
            Object map = var3.next();
            dataMap.put(((Map.Entry)map).getKey().toString(), ((Map.Entry)map).getValue());
        }

        return dataMap;
    }

    public static Map<String, Object> jsonToMap(JSONObject jsonObject) {
        Map<String, Object> dataMap = MapUtil.newHashMap();
        Iterator var2 = jsonObject.entrySet().iterator();

        while(var2.hasNext()) {
            Object map = var2.next();
            dataMap.put(((Map.Entry)map).getKey().toString(), ((Map.Entry)map).getValue());
        }

        return dataMap;
    }

    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < length; ++i) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }

        return sb.toString();
    }

    public static String format(String template, Object... params) {
        return StrUtil.format(template, params);
    }

    public static String getUUID() {
        return StrUtil.uuid().replace("-", "");
    }

    public static String listJoin(List<String> list, String str) {
        return ArrayUtil.join(list, str);
    }

    public static String listJoin(String[] list, String str) {
        return ArrayUtil.join(list, str);
    }

    public static String extendStrLR(String code, int num) {
        String codeStr = code;
        if (code.length() > num) {
            codeStr = code.substring(code.length() - num);
        }

        return String.format("%0" + num + "d", Integer.parseInt(codeStr));
    }

}
