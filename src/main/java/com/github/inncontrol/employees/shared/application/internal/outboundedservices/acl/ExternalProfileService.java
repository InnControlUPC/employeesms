package com.github.inncontrol.employees.shared.application.internal.outboundedservices.acl;

import com.github.inncontrol.employees.domain.model.valueobjects.ProfileId;
import com.github.inncontrol.employees.shared.infrastructure.feign.ProfileFeignClient;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExternalProfileService {
    private final ProfileFeignClient profileFeignClient;

    public ExternalProfileService(ProfileFeignClient profileFeignClient) {
        this.profileFeignClient = profileFeignClient;
    }

    public Optional<ProfileId> fetchProfileIdByEmail(String email) {
        try {
            ProfileId profileId = profileFeignClient.getProfileByEmail(email);
            return Optional.ofNullable(profileId);
        } catch (Exception e) {
            System.err.println("Error fetching profile by email: " + e.getMessage());
            return Optional.empty();
        }
    }


    public Optional<ProfileId> createProfile(String firstName, String lastName,  String phoneNumber, String email) {
        try {
            ProfileId profileId = profileFeignClient.createProfile(firstName, lastName, phoneNumber, email);
            return Optional.ofNullable(profileId);
        } catch (Exception e) {
            System.err.println("Error creating profile: " + e.getMessage());
            return Optional.empty();
        }
    }
}
