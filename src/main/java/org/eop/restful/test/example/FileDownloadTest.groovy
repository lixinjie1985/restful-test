package org.eop.restful.test.example

import java.util.Map

import org.eop.restful.test.base.AbstractGetTest

/**
 * @author lixinjie
 * @since 2017-12-17
 */
class FileDownloadTest extends AbstractGetTest {

	@Override
	public String getBaseUri() {
		'http://localhost:8080/cmms-manage'
	}

	@Override
	public String getRestUri() {
		'/example/download'
	}

	@Override
	public Map<String, Object> getUriVars() {
		[:]
	}

	@Override
	public Map<String, Object> getHttpHeaders() {
		[:]
	}

	@Override
	public <T> T getRequestBody() {
		null
	}

}
