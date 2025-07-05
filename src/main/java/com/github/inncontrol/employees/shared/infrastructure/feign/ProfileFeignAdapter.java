package com.github.inncontrol.employees.shared.infrastructure.feign;

import com.github.inncontrol.employees.domain.model.valueobjects.ProfileId;
import com.github.inncontrol.employees.shared.infrastructure.feign.dto.CreateProfileRequest;
import com.github.inncontrol.employees.shared.infrastructure.feign.dto.ProfileResource;
import org.springframework.stereotype.Component;

@Component
public class ProfileFeignAdapter {
    private final ProfileFeignClient profileFeignClient;

    public ProfileFeignAdapter(ProfileFeignClient profileFeignClient) {
        this.profileFeignClient = profileFeignClient;
    }

    public ProfileId createProfile(CreateProfileRequest request) {
        return profileFeignClient.createProfile(request);
    }

    public ProfileId getProfileByEmail(String email) {
        ProfileResource profileResource = profileFeignClient.getProfileByEmail(email);
        return new ProfileId(profileResource.id());
    }
}
