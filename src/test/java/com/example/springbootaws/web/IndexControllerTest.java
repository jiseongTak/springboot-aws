package com.example.springbootaws.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IndexControllerTest {
    
    @Autowired private TestRestTemplate restTemplate;
    
    @Test
    void 메인페이지_로딩() throws Exception {
        //given
        String body = this.restTemplate.getForObject("/", String.class);
        
        //then
        // "/" 호출했을때 문자열이 포함되어 있는지 확인
        assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");

    }
}