/**
 * 
 */
package kevin.tm.service.impl;

import java.util.List;

import kevin.tm.dao.AdminBeanMapper;
import kevin.tm.model.AdminBean;
import kevin.tm.model.AdminBeanExample;
import kevin.tm.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Diluka
 * 
 */
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminBeanMapper adminBeanMapper;

    public AdminBeanMapper getAdminBeanMapper() {
	return this.adminBeanMapper;
    }

    public void setAdminBeanMapper(AdminBeanMapper adminBeanMapper) {
	this.adminBeanMapper = adminBeanMapper;
    }

    /*
     * (non-Javadoc)
     * 
     * @see kevin.tm.service.AdminService#save(kevin.tm.model.AdminBean)
     */
    @Override
    public int save(AdminBean adminBean) {
	return this.adminBeanMapper.insert(adminBean);
    }

    /*
     * (non-Javadoc)
     * 
     * @see kevin.tm.service.AdminService#deleteById(java.lang.String)
     */
    @Override
    public int deleteById(String loginId) {
	return this.adminBeanMapper.deleteByPrimaryKey(loginId);
    }

    /*
     * (non-Javadoc)
     * 
     * @see kevin.tm.service.AdminService#update(kevin.tm.model.AdminBean)
     */
    @Override
    public int update(AdminBean adminBean) {
	return this.adminBeanMapper.updateByPrimaryKey(adminBean);
    }

    /*
     * (non-Javadoc)
     * 
     * @see kevin.tm.service.AdminService#findById(java.lang.String)
     */
    @Override
    public AdminBean findById(String loginId) {
	return this.adminBeanMapper.selectByPrimaryKey(loginId);
    }

    /*
     * (non-Javadoc)
     * 
     * @see kevin.tm.service.AdminService#findAll()
     */
    @Override
    public List<AdminBean> findAll() {
	AdminBeanExample adminBeanExample = new AdminBeanExample();
	adminBeanExample.clear();
	adminBeanExample.createCriteria().getAllCriteria();
	return this.adminBeanMapper.selectByExample(adminBeanExample);
    }

    /*
     * (non-Javadoc)
     * 
     * @see kevin.tm.service.AdminService#login(java.lang.String,
     * java.lang.String)
     */
    @Override
    public AdminBean login(String loginId, String loginPwd) {
	AdminBeanExample adminBeanExample = new AdminBeanExample();
	adminBeanExample.clear();
	adminBeanExample.createCriteria().andLoginidEqualTo(loginId)
		.andLoginpwdEqualTo(loginPwd);
	List<AdminBean> list = this.adminBeanMapper
		.selectByExample(adminBeanExample);
	return list.size() > 0 ? list.get(0) : null;
    }

}