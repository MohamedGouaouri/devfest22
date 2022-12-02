package com.example.findmeadoctor.data.remote.mappers

import com.example.findmeadoctor.data.remote.dto.DoctorDto
import com.example.findmeadoctor.domain.model.Doctor

class DoctorDtoMapper: DtoMapper<DoctorDto, Doctor> {
    override fun mapFromDto(entity: DoctorDto): Doctor {
        return Doctor(
            id = entity.id,
            name = entity.name,
            num_reviews = entity.num_reviews,
            rating = entity.rating,
            speciality = entity.speciality
        )
    }

    override fun mapToDto(domainModel: Doctor): DoctorDto {
        return DoctorDto(
            id = domainModel.id,
            name = domainModel.name,
            num_reviews = domainModel.num_reviews,
            rating = domainModel.rating,
            speciality = domainModel.speciality
        )
    }
    
    fun mapFromDtoList(initial: List<DoctorDto>): List<Doctor>{
        return initial.map {
            mapFromDto(it)
        }
    }

    fun toDtoList(initial: List<Doctor>): List<DoctorDto>{
        return initial.map { mapToDto(it) }
    }
}