package software.sandc.lab.wiremock.service;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.assertNotNull;

import javax.annotation.PostConstruct;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.tomakehurst.wiremock.junit.WireMockClassRule;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@TestPropertySource("/application-test.properties")
public class SomeServiceIntegrationTest {

	@Value("${wiremock.host}")
	private String wiremockHost;

	@Value("${wiremock.port}")
	private Integer wiremockPort;

	@ClassRule
	public static WireMockClassRule wireClassMockRule;
	
	@Rule
	public WireMockClassRule wireMockRule = wireClassMockRule;

	@Autowired
	private SomeService service;

	@PostConstruct
	public void init() {		
		wireMockRule = new WireMockClassRule(wireMockConfig().bindAddress(
				wiremockHost).port(wiremockPort));
	}

	@Test
	public void shouldDoSomething() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	@Test
	public void shouldDoSomething2() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	@Test
	public void shouldDoSomething3() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	@Test
	public void shouldDoSomething4() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	@Test
	public void shouldDoSomething5() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	@Test
	public void shouldDoSomething6() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	@Test
	public void shouldDoSomething7() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	@Test
	public void shouldDoSomething8() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	@Test
	public void shouldDoSomething9() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	@Test
	public void shouldDoSomething10() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	@Test
	public void shouldDoSomething11() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}

	
	@Test
	public void shouldDoSomething12() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	@Test
	public void shouldDoSomething13() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	
	@Test
	public void shouldDoSomething14() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	
	
	@Test
	public void shouldDoSomething15() {
		// given
		String param = "someParameter";
		String expectedURLPath = "/endpointPath";
		wireMockRule.stubFor(get(urlPathEqualTo(expectedURLPath)).willReturn(
				aResponse()
				.withStatus(200)
				.withHeader("Content-Type", "text/plain;charset=UTF-8")
				.withBody("someResponse")));

		sleep();
		
		// when
		String response = service.call(param);

		// then
		assertNotNull(response);
		verify(getRequestedFor(urlPathEqualTo(expectedURLPath))
				.withQueryParam("param", equalTo(param)));
	}
	private void sleep(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
