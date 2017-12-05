package org.eop.restful.test.example.file

import org.eop.restful.test.base.AbstractPostTest
import org.springframework.core.io.FileSystemResource
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap

/**
 * @author lixinjie
 * @since 2017-12-05
 */
class FilePost extends AbstractPostTest {

	@Override
	public String getBaseUri() {
		''
	}

	@Override
	public String getRestUri() {
		''
	}

	@Override
	public Map<String, Object> getUriVars() {
		[:]
	}

	@Override
	public Map<String, Object> getHttpHeaders() {
		['Content-Type':'multipart/form-data;charset=UTF-8','Accept':'application/json']
	}

	@Override
	public <T> T getRequestBody() {
		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>()
		FileSystemResource fsr = new FileSystemResource(new File('C:\\Users\\Administrator\\Desktop\\新建文本文档.txt'))
		body.add('name', '中文')
		body.add('file', fsr)
		body
	}

}
