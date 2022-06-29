package jz.example.user.base.result;

import cn.hutool.core.util.ClassUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Enumeration;
import java.util.Objects;
import java.util.Properties;

/**
 * @Author JZ
 * @Date 2022/3/30
 */
public class MessageUtil {

    private static final Logger logger = LoggerFactory.getLogger(MessageUtil.class);
    private static final String FILE_NAME = "code.properties";
    private static final Properties prop = new Properties();

    public MessageUtil() {
    }

    private static void loadCodeProperties() throws IOException {
        Enumeration dirs = ClassUtil.getContextClassLoader().getResources("code.properties");

        while(dirs.hasMoreElements()) {
            URL url = (URL)dirs.nextElement();
            InputStream in = url.openStream();
            Properties properties = new Properties();
            properties.load(new InputStreamReader(in, "UTF-8"));
            prop.putAll(properties);
            in.close();
            logger.info("load code properties file from '{}'", url.getPath());
        }

    }

    public static String getMsg(Integer code, String... args) {
        Objects.requireNonNull(code);
        String codeStr = String.valueOf(code);
        if (!prop.containsKey(codeStr) && args.length == 1) {
            return args[0];
        } else {
            String template = null;
            if (prop.containsKey(codeStr)) {
                template = prop.getProperty(codeStr, "");
            } else {
                template = codeStr;
            }

            return StringUtil.format(template, args);
        }
    }

    static {
        try {
            loadCodeProperties();
        } catch (IOException var1) {
            logger.error(var1.getMessage(), var1);
        }

    }
}
