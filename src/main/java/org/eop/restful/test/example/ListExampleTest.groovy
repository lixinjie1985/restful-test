package org.eop.restful.test.example

import java.util.Map

import org.eop.restful.test.base.AbstractGetTest

/**
 * @author lixinjie
 * @since 2017-12-17
 */
class ListExampleTest extends AbstractGetTest {

	@Override
	public String getBaseUri() {
		'http://localhost:8080/cmms-manage'
	}

	@Override
	public String getRestUri() {
		'/example/page/{pageNum}/{pageSize}'
	}

	@Override
	public Map<String, Object> getUriVars() {
		[pageNum:1,pageSize:2]
	}

	@Override
	public Map<String, Object> getHttpHeaders() {
		['Content-Type':'application/json;charset=utf-8','Accept':'application/json;charset=utf-8']
	}

	@Override
	public <T> T getRequestBody() {
		null
	}

}
