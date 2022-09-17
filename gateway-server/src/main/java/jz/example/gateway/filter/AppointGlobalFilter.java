package jz.example.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author JZ
 * @Date 2022/3/13
 */
@Component
public class AppointGlobalFilter implements GlobalFilter, Ordered {

    private final Logger logger = LoggerFactory.getLogger(AppointGlobalFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.debug("请求进入");
        //获取参数
        ServerHttpRequest request = exchange.getRequest();
        MultiValueMap<String,String> params = request.getQueryParams();
        String loginIP = params.getFirst("loginIP");
        logger.info("请求路径为,{}", request.getURI());
        if(!"admin".equals(loginIP)){
            //相等 放行
            logger.info("请求放行");
            return chain.filter(exchange);
        }
        //拦截
        logger.info("请求拦截");
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        return exchange.getResponse().setComplete();
    }

    @Override
    public int getOrder() {
        return -1000;
    }
}
