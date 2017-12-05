package org.eop.restful.test.example.weixin

import java.util.Map

import org.eop.restful.test.base.AbstractGetTest

/**
 * @author lixinjie
 * @since 2017-12-05
 */
class WeixinGet extends AbstractGetTest {

	@Override
	public String getBaseUri() {
		'https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET'
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
		[:]
	}

	@Override
	public <T> T getRequestBody() {
		null
	}

}
