package net.codejava.spring.dao;

import net.codejava.spring.entity.Account;

public interface AccountDAO {
	public Account findAccount(String userName );
}
