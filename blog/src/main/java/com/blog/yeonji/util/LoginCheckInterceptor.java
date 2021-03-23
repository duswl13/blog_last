package com.blog.yeonji.util;


import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
  
  
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;  
  
 
//로그인 처리중 추가
//HttpSession session  = request.getSession(true);  
//session.setAttribute("member", member);  

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {  
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {  
  
        HttpSession session  = request.getSession(false);  
  
        if(session == null) {  
//            response.sendRedirect(request.getContextPath()+"/member/login.jsp");  
            return false;  
        }  
  
//        Member member = (Member)session.getAttribute("member");  
//  
//        if (member == null) {  
//            response.sendRedirect(request.getContextPath()+"/member/login.jsp");  
//            return false;             
//        }  
//          
        return true;  
    }  
}  