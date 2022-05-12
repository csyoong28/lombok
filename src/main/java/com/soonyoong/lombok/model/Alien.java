package com.soonyoong.lombok.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Data
@ToString
@EqualsAndHashCode
@Log4j
@AllArgsConstructor
@NoArgsConstructor
public class Alien {
    private String name;
    private String tech;
    @Getter
    private int age;
}

//@AllArgsConstructor
//@RequiredArgsConstructor
//@NoArgsConstructor
@Builder
class weapon {
    @Getter @Setter
    private int strength;
    private String name;
}
