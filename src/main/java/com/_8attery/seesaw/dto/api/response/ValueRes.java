package com._8attery.seesaw.dto.api.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString @Data
@AllArgsConstructor
@NoArgsConstructor
public class ValueRes {

    private List<String> values;

}