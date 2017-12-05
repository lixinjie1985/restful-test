package org.eop.restful.test.base;

import org.springframework.http.HttpMethod;

/**
 * @author lixinjie
 * @since 2017-12-05
 */
public abstract class AbstractDeleteTest extends AbstractRestfulTest {

	@Override
	public HttpMethod getHttpMethod() {
		return HttpMethod.DELETE;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> Class<T> getResponseType() {
		return (Class<T>)String.class;
	}

}
