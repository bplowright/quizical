package com.example.demo;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Movie {

        @NotNull
        @Min(1)
        private JsonTypeInfo.Id String;

        @NotNull
        @Size(min=20, max=2)
        private String name;

        @NotNull
        @Size(min=3, max=10)
        private String type;

        @NotNull
        private String description;

    }
