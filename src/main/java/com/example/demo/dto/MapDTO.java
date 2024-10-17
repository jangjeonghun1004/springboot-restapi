package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MapDTO {
    private String key;
    private String value;
}
