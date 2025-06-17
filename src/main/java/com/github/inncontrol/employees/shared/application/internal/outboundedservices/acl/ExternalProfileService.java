package com.github.inncontrol.employees.shared.application.internal.outboundedservices.acl;

import com.github.inncontrol.employees.domain.model.valueobjects.ProfileId;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExternalProfileService {

    public ExternalProfileService() {
    }

    public Optional<ProfileId> fetchProfileIdByEmail(String email) {
        return Optional.empty();
    }


    public Optional<ProfileId> createProfile(String firstName, String lastName,  String phoneNumber, String email) {
        Long number = 11L;

        return Optional.of(new ProfileId(number));
    }
}
