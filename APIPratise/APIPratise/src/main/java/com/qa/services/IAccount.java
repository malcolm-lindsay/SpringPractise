package com.qa.services;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IAccount {

	String getAccount();

	String addAccount();

	String updateAccount();

	String deleteAccount();

}