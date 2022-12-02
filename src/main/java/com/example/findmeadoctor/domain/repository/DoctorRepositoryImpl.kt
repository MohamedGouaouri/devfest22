package com.example.findmeadoctor.domain.repository

import com.example.findmeadoctor.data.remote.api.services.DoctorService
import com.example.findmeadoctor.data.remote.mappers.DoctorDtoMapper
import com.example.findmeadoctor.data.repository.DoctorRepository
import com.example.findmeadoctor.domain.model.Doctor

class DoctorRepositoryImpl(
    private val doctorService: DoctorService,
    private val mapper: DoctorDtoMapper
): DoctorRepository {
    override suspend fun getDoctors(): List<Doctor> {
        return mapper.mapFromDtoList(doctorService.getDoctors())
    }
}