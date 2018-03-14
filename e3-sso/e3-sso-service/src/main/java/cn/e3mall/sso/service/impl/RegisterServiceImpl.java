package cn.e3mall.sso.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import cn.e3mall.common.utils.E3Result;
import cn.e3mall.mapper.TbUserMapper;
import cn.e3mall.pojo.TbUser;
import cn.e3mall.pojo.TbUserExample;
import cn.e3mall.pojo.TbUserExample.Criteria;
import cn.e3mall.sso.service.RegisterService;
@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private TbUserMapper tbUserMapper;
	@Override
	public E3Result checkData(String param, int type) {
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		//1:用户名 2:手机号 3.邮箱
		if(type == 1){
			criteria.andUsernameEqualTo(param);
		}else if(type == 2){
			criteria.andPhoneEqualTo(param);
		}else if(type == 3){
			criteria.andEmailEqualTo(param);
		}else {
			return E3Result.ok(false);
		}
		List<TbUser> list = tbUserMapper.selectByExample(example);
		if(list != null && list.size() > 0){
			return E3Result.ok(false);
		}else {
			return E3Result.ok(true);
		}
	}
	@Override
	public E3Result register(TbUser user) {
		//数据有效性校验
		if(StringUtils.isBlank(user.getUsername())){
			return E3Result.build(400, "用户名不能为空");
		}
		if(StringUtils.isBlank(user.getPassword())){
			return E3Result.build(400, "密码不能为空");
		}
		E3Result result = checkData(user.getUsername(), 1);
		if(!(boolean) result.getData()){
			return E3Result.build(400, "此用户名已经被占用");
		}
		result = checkData(user.getPhone(), 2);
		if(!(boolean) result.getData()){
			return E3Result.build(400, "此手机号已经被占用");
		}
		/*result = checkData(user.getEmail(), 3);
		if(!(boolean) result.getData()){
			return E3Result.build(400, "此邮箱已经被占用");
		}*/
		user.setCreated(new Date());
		user.setUpdated(new Date());
		//对密码进行加密
		String md5Pass = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
		user.setPassword(md5Pass);
		tbUserMapper.insert(user);
		return E3Result.ok();
	}

}
