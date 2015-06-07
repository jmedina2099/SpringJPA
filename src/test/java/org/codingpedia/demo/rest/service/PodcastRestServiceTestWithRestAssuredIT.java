package org.codingpedia.demo.rest.service;
import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class PodcastRestServiceTestWithRestAssuredIT {

	@Test
	public void testPodcast2FetchSuccessful(){
		expect().
			body("id", equalTo(2)).
			body("title", equalTo("- The Naked Scientists Podcast - Stripping Down Science")).
		when().
			get("http://localhost:8888/hello/podcasts/2");
	}
}
