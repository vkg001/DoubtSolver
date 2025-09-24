package com.project.doubt_solver.client;

import com.project.doubt_solver.payloads.GeminiRequest;
import com.project.doubt_solver.payloads.GeminiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="GeminiClient", url ="${gemini.api.url}")
public interface GeminiClient {

    @PostMapping("/v1beta/models/gemini-2.0-flash:generateContent")
    GeminiResponse generateContent(@RequestBody GeminiRequest request, @RequestParam String key);
}

