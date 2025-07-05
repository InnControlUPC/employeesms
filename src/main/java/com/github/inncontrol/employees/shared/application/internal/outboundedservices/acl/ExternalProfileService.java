package com.github.inncontrol.employees.shared.application.internal.outboundedservices.acl;

import com.github.inncontrol.employees.domain.model.valueobjects.ProfileId;
import com.github.inncontrol.employees.shared.infrastructure.feign.ProfileFeignAdapter;
import com.github.inncontrol.employees.shared.infrastructure.feign.dto.CreateProfileRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExternalProfileService {
    private final ProfileFeignAdapter profileFeignClientAdapter;

    public ExternalProfileService(ProfileFeignAdapter profileFeignClientAdapter) {
        this.profileFeignClientAdapter = profileFeignClientAdapter;
    }

    public Optional<ProfileId> fetchProfileIdByEmail(String email) {
        try {
            ProfileId profileId = profileFeignClientAdapter.getProfileByEmail(email);
            return Optional.ofNullable(profileId);
        } catch (Exception e) {
            System.err.println("Error fetching profile by email: " + e.getMessage());
            return Optional.empty();
        }
    }


    public Optional<ProfileId> createProfile(String firstName, String lastName,  String phoneNumber, String email) {
        try {
            CreateProfileRequest createProfileRequest = new CreateProfileRequest(firstName, lastName, phoneNumber, email);
            ProfileId profileId = profileFeignClientAdapter.createProfile(createProfileRequest);
            return Optional.ofNullable(profileId);
        } catch (Exception e) {
            System.err.println("Error creating profile: " + e.getMessage());
            return Optional.empty();
        }
    }
}

