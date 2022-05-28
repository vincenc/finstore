package com.vinfin.finstore.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class Testdata {
    
    private final String name;
    private final String address;

    Testdata() {
        this("", "");
    }
}
