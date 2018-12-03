package com.qa.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Account;
import com.qa.services.IAccount;

@RestController
public class AccountEndpoint implements IAccount {

	
@Autowired
private Account account;
	
/* (non-Javadoc)
 * @see com.qa.REST.IAccount#getAccount()
 */
@Override
@RequestMapping("/getAccount")
public String getAccount()
{
return "Account 1: John";
}		

/* (non-Javadoc)
 * @see com.qa.REST.IAccount#addAccount()
 */
@Override
@RequestMapping("/addAccount")
public String addAccount()
{
return "Account 1: John";
}		

/* (non-Javadoc)
 * @see com.qa.REST.IAccount#updateAccount()
 */
@Override
@RequestMapping("/updateAccount")
public String updateAccount()
{
return "Account 1: John";
}		

/* (non-Javadoc)
 * @see com.qa.REST.IAccount#deleteAccount()
 */
@Override
@RequestMapping("/deleteAccount")
public String deleteAccount()
{
return "Account 1: John";
}		
}

