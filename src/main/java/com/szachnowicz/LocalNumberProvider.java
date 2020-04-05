package com.szachnowicz;

import java.util.Random;

class LocalNumberProvider implements NumberProvider {
    public Integer getRandomNumber() {
        return new Random().nextInt();
    }
}
