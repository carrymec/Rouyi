package com.ruoyi.system.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.util.Date;

/**
 * 学生表 sys_student
 * 
 * @author ruoyi
 * @date 2019-08-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_student")
public class Student
{
	/** 编号 */
    @TableId
	private Integer studentId;
	/** 学生名称 */
	private String studentName;
	/** 年龄 */
	private Integer studentAge;
	/** 性别（0男 1女 2未知） */
	private String studentSex;
	/** 状态（0正常 1停用） */
	private String studentStatus;
	/** 生日 */
	private Date studentBirthday;
	/** 备注 */
	private String remark;
}
