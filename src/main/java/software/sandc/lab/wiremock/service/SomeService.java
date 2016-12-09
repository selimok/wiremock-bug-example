package software.sandc.lab.wiremock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SomeService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${service.host}")
	private String host;

	@Value("${service.port}")
	private String port;

	public final static String BASE_URL_FORMAT = "http://%s:%s%s";

	public String call(String param) {

		String path = "/endpointPath";
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(buildBaseUrl(path)).queryParam("param",
				param);
		try {
			return restTemplate.getForObject(uriBuilder.build().encode().toString(), String.class);

		} catch (Exception e) {
			return "";
		}
	}
	private String buildBaseUrl(String path) {
		return String.format(BASE_URL_FORMAT, host, port, path);
	}
}
