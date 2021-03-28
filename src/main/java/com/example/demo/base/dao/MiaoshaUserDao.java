package com.example.demo.base.dao;

import com.example.demo.base.domain.MiaoshaUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface MiaoshaUserDao {
	
	@Select("select * from fs_user where id = #{id}")
	MiaoshaUser getById(@Param("id") long id);

	@Select("select * from fs_user where mobile = #{mobile}")
	MiaoshaUser getByMobile(@Param("mobile") String mobile);

	@Update("update fs_user set password = #{password} where id = #{id}")
	void update(MiaoshaUser toBeUpdate);
}
