package com.example.hospital_management_system.dto;

import lombok.Data;

@Data
public class PatientDischargeRequest {
    private String patientId;
    private String patientName;
}
