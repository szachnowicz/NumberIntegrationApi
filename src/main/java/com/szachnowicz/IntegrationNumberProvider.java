package com.szachnowicz;

import org.springframework.web.client.RestTemplate;

class IntegrationNumberProvider implements NumberProvider {
    private final String URL = "https://www.random.org/integers/?num=1&min=1&max=9999&col=1&base=10&format=plain&rnd=new";
    private RestTemplate restTemplate = new RestTemplate();

    public Integer getRandomNumber() {
        String forObject = restTemplate.getForObject(URL, String.class).trim();
        return Integer.valueOf(forObject);
    }
}
