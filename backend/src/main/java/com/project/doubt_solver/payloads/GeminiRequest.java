package com.project.doubt_solver.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeminiRequest {
    private List<Content> contents;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class  Content{
        private List<Part> parts;


    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static  class  Part{
        private String text;
    }
}
