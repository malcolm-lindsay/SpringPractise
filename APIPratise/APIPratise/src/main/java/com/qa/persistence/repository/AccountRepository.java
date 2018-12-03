package com.qa.persistence.repository;

import java.util.Collection;
import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;
import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class AccountRepository {


		@Autowired
		private EntityManager em;

		@Override
		@Transactional(REQUIRED)
		public String createAccount(Prize prize) {
			if (prize != null) {
				em.persist(prize);
				return PrizeConstants.CREATE_PRIZE;
			}
			return PrizeConstants.PRIZE_NOT_FOUND;
		}
//
//		@Override
//		public String getPrize(String accountNumber) {
//
//			Query q = em.createQuery("Select p FROM Prize p");
//
//			Collection<Prize> prizes = (Collection<Prize>) q.getResultList();
//
//			for (Prize p : prizes) {
//				if (p.getAccountNumber().equals(accountNumber)) {
//					return p.getPrize();
//				}
//			}
//
//			return PrizeConstants.PRIZE_NOT_FOUND;
//	}
}
