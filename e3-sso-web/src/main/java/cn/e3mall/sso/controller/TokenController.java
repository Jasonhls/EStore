package cn.e3mall.sso.controller;

import javax.print.attribute.standard.Media;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.utils.E3Result;
import cn.e3mall.common.utils.JsonUtils;
import cn.e3mall.sso.service.TokenService;

@Controller
public class TokenController {
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 解决js跨域问题，请求中带有callback，然后响应一个js回去
	 * @param token
	 * @param callback
	 * @return
	 */
	//@RequestMapping(value="/user/token/{token}",method=RequestMethod.POST)
	/*@RequestMapping(value="/user/token/{token}",produces=MediaType.APPLICATION_JSON_VALUE + ";charset-utf-8")
	@ResponseBody
	public String getUserByToken(@PathVariable String token,String callback){
		E3Result e3Result = tokenService.getUserByToken(token);
		if(StringUtils.isNotBlank(callback)){
			String strResult = callback + "(" + JsonUtils.objectToJson(e3Result) + ");";
			return strResult;
		}
		return JsonUtils.objectToJson(e3Result);
	}*/
	
	@RequestMapping(value="/user/token/{token}")
	@ResponseBody
	public Object getUserByToken(@PathVariable String token,String callback){
		E3Result e3Result = tokenService.getUserByToken(token);
		if(StringUtils.isNotBlank(callback)){
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(e3Result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		}
		return e3Result;
	}
}
