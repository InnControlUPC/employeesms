package com.github.inncontrol.employees.shared.infrastructure.feign;

import com.github.inncontrol.employees.domain.model.valueobjects.ProfileId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "profile-service", configuration = ProfileFeignConfig.class)
public interface ProfileFeignClient {
    @PostMapping("/api/v1/profiles")
    @ResponseStatus(HttpStatus.CREATED)
    ProfileId createProfile(@RequestBody String firstName, String lastName, String phoneNumber, String email);

    @GetMapping("api/v1/profiles")
    ProfileId getProfileByEmail(@RequestParam String email);

}
