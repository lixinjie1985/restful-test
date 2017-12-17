package org.eop.restful.test.example

import org.eop.restful.test.base.AbstractPostTest
import org.springframework.core.io.FileSystemResource
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap

/**
 * @author lixinjie
 * @since 2017-12-05
 */
class FileUploadTest extends AbstractPostTest {

	@Override
	public String getBaseUri() {
		'http://localhost:8080/cmms-manage'
	}

	@Override
	public String getRestUri() {
		'/example/upload'
	}

	@Override
	public Map<String, Object> getUriVars() {
		[:]
	}

	@Override
	public Map<String, Object> getHttpHeaders() {
		['Content-Type':'multipart/form-data;charset=UTF-8','Accept':'application/json;charset=UTF-8']
	}

	@Override
	public <T> T getRequestBody() {
		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>()
		FileSystemResource fsr = new FileSystemResource(new File('F:\\2345下载\\04100170011102896286.jpg'))
		body.add('username', '李新杰')
		body.add('file', fsr)
		body
	}

}
