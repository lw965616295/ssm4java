package com.ruishun.test;

public class Tests {

/*	@Test
	public void t1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*");
		ErpUserMapper mapper = ac.getBean(ErpUserMapper.class);
		ErpUserExample example = new ErpUserExample();
		PageHelper.startPage(1, 2);
		List<ErpUser> list = mapper.selectByExample(example);
		for (ErpUser erpUser : list) {
			System.out.println(erpUser.getUserName());
		}
		PageInfo<ErpUser> pageInfo = new PageInfo<ErpUser>(list);
		System.out.println(pageInfo.getSize()+"::"+pageInfo.toString()+"::"+pageInfo.getPageSize());
		System.out.println(pageInfo.getTotal());
	}
	@Test
	public void t2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*");
		ErpUserService bean = ac.getBean(ErpUserService.class);
	}
	@Test
	public void t3() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*");
		ErpUserService bean = ac.getBean(ErpUserService.class);
		
		ErpUser erpUser = new ErpUser();
		erpUser.setUserNo("dd555");
		erpUser.setUserPwd(MD5Util.getMD5("123"));
		erpUser.setUserName("SS");
		bean.addUser(erpUser);
	}*/
}
