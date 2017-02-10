package Action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String userId;

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (StringUtils.isEmpty(getUserId()) && StringUtils.isEmpty(getPassword())) {
			addFieldError("userId", "User name cannot be empty.");
			addFieldError("password", "Passowrd cannot be empty.");
		} else if (StringUtils.isEmpty(getUserId())) {
			addFieldError("userId", "User name cannot be empty.");
		} else if (StringUtils.isEmpty(getPassword())) {
			addFieldError("password", "Passowrd cannot be empty.");
		}
		super.validate();
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(getUserId().equals("bhaskar") && getPassword().equals("tomar")){
			return "HomePage";
		}else
			return LOGIN;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

}
