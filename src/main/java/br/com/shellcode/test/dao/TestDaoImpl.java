package br.com.shellcode.test.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.shellcode.test.domain.Test;

@Repository
public class TestDaoImpl implements TestDao {

	@Autowired
	private EntityManager em;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void insert(Test test) {
		em.persist(test);
		Test test2 = new Test();
		em.persist(test2);
	}

}
