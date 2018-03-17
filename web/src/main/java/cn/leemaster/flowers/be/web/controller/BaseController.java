package cn.leemaster.flowers.be.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author leemaster
 * @Title: BaseController
 * @Package cn.leemaster.flowers.be.web.controller
 * @Description:
 * 使用 @ModelAttribute 将先进行方法，如同拦截器一样
 *
 * 把Resquest  和 Response 的参数和 其他的东西存入Dto 内部 然后直接扔到 Service 进行处理
 *
 * //TODO  完成抽象类 从而可以进行 request 的传送
 *
 * @date 2018/3/12上午2:10
 */
public abstract class BaseController {

    protected static final ThreadLocal<HttpServletRequest> REQUEST_THREAD_LOCAL = new ThreadLocal<>();

    protected static final ThreadLocal<HttpServletResponse> RESPONSE_THREAD_LOCAL = new ThreadLocal<>();



    public void setAttribute(HttpServletRequest request , HttpServletResponse response){

    }
}
