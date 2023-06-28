## 整合 Mybatis-plus-dynamic-datasource 多数据源
1. 基于数据库的多租户实现

2. 参考：[https://blog.csdn.net/SakuraZzZzZzZz/article/details/118609473](https://blog.csdn.net/SakuraZzZzZzZz/article/details/118609473)
3. 参考：[https://blog.csdn.net/zznnniuu/article/details/129291674](https://blog.csdn.net/zznnniuu/article/details/129291674)

## 拦截器方法的执行顺序：

### preHandle、postHandle与afterCompletion

1. **preHandle**

调用时间：Controller方法处理之前

执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序一个接一个执行

若返回false，则中断执行，注意：不会进入afterCompletion

2. **postHandle+**

调用前提：preHandle返回true

调用时间：Controller方法处理完之后，DispatcherServlet进行视图的渲染之前，也就是说在这个方法中你可以对ModelAndView进行操作

执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序倒着执行。

备注：postHandle虽然post打头，但post、get方法都能处理

3. **afterCompletion**

调用前提：preHandle返回true

调用时间：DispatcherServlet进行视图的渲染之后

多用于清理资源