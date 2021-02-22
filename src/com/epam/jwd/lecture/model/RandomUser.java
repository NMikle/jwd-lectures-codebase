package com.epam.jwd.lecture.model;

import com.epam.jwd.lecture.sql.Bark;

public interface RandomUser extends User {

    @Bark
    String getRandomData();
}
