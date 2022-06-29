package jz.example.user.base.result;

import cn.hutool.core.util.StrUtil;

import java.util.List;

/**
 * @Author JZ
 * @Date 2022/3/30
 */
public class StringUtil extends StrUtil {
    private StringUtil() {
    }

    public static String toString(Object obj) {
        return null == obj ? null : obj.toString();
    }

    public static String join(String[] stringArray, String separator) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < stringArray.length; ++i) {
            if (i > 0) {
                sb.append(separator);
            }

            sb.append(stringArray[i]);
        }

        return sb.toString();
    }

    public static String join(List<String> list, String separator) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        for(int len = list.size(); i < len; ++i) {
            if (i > 0) {
                sb.append(separator);
            }

            sb.append((String)list.get(i));
        }

        return sb.toString();
    }
}
