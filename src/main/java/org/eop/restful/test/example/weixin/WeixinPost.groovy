package org.eop.restful.test.example.weixin

import java.util.Map

import org.eop.restful.test.base.AbstractPostTest

/**
 * @author lixinjie
 * @since 2017-12-05
 */
class WeixinPost extends AbstractPostTest {

	@Override
	public String getBaseUri() {
		'https://api.weixin.qq.com/cgi-bin/template/api_set_industry?access_token=ACCESS_TOKEN'
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
		'''{
"industry_id1":"1",
"industry_id2":"4"
}'''
	}

}
