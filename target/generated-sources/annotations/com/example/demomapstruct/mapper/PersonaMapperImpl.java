package com.example.demomapstruct.mapper;

import com.example.demomapstruct.dto.PersonaDTO;
import com.example.demomapstruct.model.Persona;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-15T10:34:19-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
public class PersonaMapperImpl implements PersonaMapper {

    @Override
    public Persona personaDTOToPersona(PersonaDTO personaDTO) {
        if ( personaDTO == null ) {
            return null;
        }

        Persona persona = new Persona();

        persona.setId( personaDTO.getId() );
        persona.setNombre( personaDTO.getNombre() );
        persona.setApellido( personaDTO.getApellido() );
        persona.setDireccion( personaDTO.getDireccion() );
        persona.setTelefono( personaDTO.getTelefono() );

        return persona;
    }

    @Override
    public PersonaDTO personaToPersonaDTO(Persona persona) {
        if ( persona == null ) {
            return null;
        }

        PersonaDTO personaDTO = new PersonaDTO();

        personaDTO.setId( persona.getId() );
        personaDTO.setNombre( persona.getNombre() );
        personaDTO.setApellido( persona.getApellido() );
        personaDTO.setDireccion( persona.getDireccion() );
        personaDTO.setTelefono( persona.getTelefono() );

        return personaDTO;
    }
}
