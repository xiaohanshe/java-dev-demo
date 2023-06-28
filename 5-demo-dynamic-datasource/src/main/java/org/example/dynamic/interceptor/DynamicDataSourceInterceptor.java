package org.example.dynamic.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.*;

import javax.servlet.http.*;

/**
 * 每次请求都拦截，判断用户使用哪个数据源
 *
 * @author han
 * @since 2023/06/28
 */
@Slf4j
public class DynamicDataSourceInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1.获取当前用户登录信息
        log.info("获取当前用户登录信息...");
        // 2.判断用户的（租户）或数据源
        log.info("判断用户的（租户）或数据源...");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // DynamicDataSourceContextHolder.clear();
    }
}
