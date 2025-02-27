package kr.co.sist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import kr.co.sist.service.AjaxService;

@Controller
public class AjaxController {
    
    @Autowired(required=false)
    private AjaxService as;
    
    @GetMapping("/day0611/ajax.do")
    public String ajaxFrm() {
        
        return "day0611/ajax_frm";
    }
    
    @GetMapping("/day0611/ajax_result.do")
    public String ajaxFrmProcess(Model model) {
        
        model.addAttribute("jsonObj", as.jsonData());
        
        return "day0611/ajax_result";
    }

    @ResponseBody
    //@GetMapping("/day0611/ajax_responsebody.do")
    @RequestMapping(value="/day0611/ajax_responsebody.do",method=RequestMethod.GET,produces="application/json;charset=UTF-8") //한글이 깨지면 이거 쓰기
    public String ajaxResponseBody() {
        
        return as.jsonData2();
    }
    
    
}
