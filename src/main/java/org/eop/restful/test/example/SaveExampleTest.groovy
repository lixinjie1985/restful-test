package org.eop.restful.test.example

import java.util.Map

import org.eop.restful.test.base.AbstractPostTest

/**
 * @author lixinjie
 * @since 2017-12-17
 */
class SaveExampleTest extends AbstractPostTest {

	@Override
	public String getBaseUri() {
		'http://localhost:8080/cmms-manage'
	}

	@Override
	public String getRestUri() {
		'/example/save'
	}

	@Override
	public Map<String, Object> getUriVars() {
		[:]
	}

	@Override
	public Map<String, Object> getHttpHeaders() {
		['Content-Type':'application/json;charset=utf-8','Accept':'application/json;charset=utf-8']
	}

	@Override
	public <T> T getRequestBody() {
		'{"name":"","age":17,"birthday":"2018-12-12 00:00:00"}'
	}

}
