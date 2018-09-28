package com.fjycnet.sm.ctrl;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * 我的第一个controller (没有Maven,没有Gradle)
 *
 * @author 绯若虚无
 */
public class MyController extends AbstractController {


    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        return new ModelAndView("my_page");
    }
}
