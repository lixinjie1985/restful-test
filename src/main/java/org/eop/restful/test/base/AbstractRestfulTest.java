package org.eop.restful.test.base;

import java.util.Map;

import org.eop.restful.test.junit4.AbstractJunit4Test;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author lixinjie
 * @since 2017-12-05
 */
public abstract class AbstractRestfulTest extends AbstractJunit4Test {

	public abstract String getBaseUri();
	
	public abstract String getRestUri();
	
	public abstract Map<String, Object> getUriVars();
	
	public abstract Map<String, Object> getHttpHeaders();
	
	public abstract HttpMethod getHttpMethod();
	
	public abstract <T> T getRequestBody();
	
	public abstract <T> Class<T> getResponseType();

	@Test
	public void execute() {
		RestTemplate restTplt = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
		HttpHeaders headers = new HttpHeaders();
		for (Map.Entry<String, Object> header : getHttpHeaders().entrySet()) {
			headers.add(header.getKey(), header.getValue().toString());
		}
		HttpEntity<?> requestEntity = new HttpEntity<Object>(getRequestBody(), headers);
		ResponseEntity<?> responseEntity = restTplt.exchange(getBaseUri() + getRestUri(), getHttpMethod(), requestEntity, getResponseType(), getUriVars());
		System.out.print(responseEntity.getStatusCode().value() + " " + responseEntity.getStatusCode().getReasonPhrase() + " ");
		System.out.println(responseEntity.getHeaders().getFirst("Content-Disposition") + " " + responseEntity.getHeaders().getFirst("Content-Type"));
		System.out.println(responseEntity.getBody());
	}
}
