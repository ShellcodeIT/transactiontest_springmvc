package br.com.shellcode.test.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.shellcode.test.dao.TestDao;
import br.com.shellcode.test.domain.Test;

@Controller
@RequestMapping(value = "/test")
public class TestController {

	@Autowired
	private TestDao testDao;

	@RequestMapping(method = RequestMethod.GET)
	public String insert() {
		Test test = new Test();
		testDao.insert(test);
		return "test/index";
	}
}
