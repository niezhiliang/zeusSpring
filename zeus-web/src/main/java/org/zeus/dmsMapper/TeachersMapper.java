package org.zeus.dmsMapper;

import org.zeus.bean.Role;
import org.zeus.bean.TblTeacherBase;
import org.zeus.dto.UserInfoUpdateForm;
import org.zeus.dto.UserRegister;

import java.util.List;

/**
 * Created by aichaellee on 2018/12/31.
 */
public interface TeachersMapper {

    /**
     * 根据用户名得到用户信息
     * @param username
     * @return
     */
    TblTeacherBase loadUserByUsername(String username);
    TblTeacherBase loadUserByMobile(String mobile);


    /**
     * 根据用户名得到用户的角色
     * @param TID
     * @return
     */
    List<Role> getRolesByTeacherId(Long TID);

    /**
     * 查看当前的所有用户
     * @return
     */
    List<TblTeacherBase> getAllUsers();


    /**
     * 添加新用户
     * @param tblTeacherBase
     * @return
     */
    int addNewUser(UserRegister tblTeacherBase);

    /**
     * 新增用户时添加对应的角色
     * @param userRegister
     * @return
     */
    int addRoleOfUser(UserRegister userRegister);

    int updateUserInfo(UserInfoUpdateForm userInfoUpdateForm);

    int updatePassword(TblTeacherBase user);


}
