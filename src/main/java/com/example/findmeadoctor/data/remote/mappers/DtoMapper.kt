package com.example.findmeadoctor.data.remote.mappers

interface DtoMapper <Dto, DomainModel> {
    fun mapFromDto(dto: Dto): DomainModel
    fun mapToDto(domainModel: DomainModel): Dto

}