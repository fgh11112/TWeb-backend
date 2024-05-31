package com.shoppingwebapp.Model;
import jakarta.persistence.*;

@Entity
public class third_account {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer account_id;
	
	private Integer user_id;
	
	private String service_provider;
	
	private String email;
	
	private String access_token;
	
	

	public third_account() {
		super();
	}

	public third_account(Integer account_id, Integer user_id, String service_provider, String email,
			String access_token) {
		super();
		this.account_id = account_id;
		this.user_id = user_id;
		this.service_provider = service_provider;
		this.email = email;
		this.access_token = access_token;
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getService_provider() {
		return service_provider;
	}

	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	@Override
	public String toString() {
		return "third_account [account_id=" + account_id + ", user_id=" + user_id + ", service_provider="
				+ service_provider + ", email=" + email + ", access_token=" + access_token + "]";
	}
	
	
	
	
}
