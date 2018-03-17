package cn.leemaster.flowers.be.webapi.controllers;

import cn.leemaster.flowers.be.web.controller.BaseController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leemaster
 * @Title: VerifyController
 * @Package cn.leemaster.flowers.be.webapi.controllers
 * @Description:
 * 验证控制器
 *      验证用户注册手机号是否重复
 *
 * @date 2018/3/18上午1:34
 */
@RestController
@RequestMapping("/verify")
@CrossOrigin("*")
public class VerifyController extends BaseController {
}
