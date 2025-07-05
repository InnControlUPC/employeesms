package com.github.inncontrol.employees.shared.infrastructure.feign.dto;

public record ProfileResource(
        Long id,
        String names,
        String lastName,
        String email,
        String phoneNumber,
        Long userId
) {
}
