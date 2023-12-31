package br.com.fila.app.filadeespera.controller;

import org.springframework.http.ResponseEntity;
import br.com.fila.app.filadeespera.model.dto.PersonDTO;
import br.com.fila.app.filadeespera.model.entity.Person;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Person Controller", description = "Gerenciamento de pessoas cadastrada no sistema")
public interface PersonController {
    @Operation(summary = "Criação de uma nova pessoa cadastrada no sistema")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201" , description = "Criação de cadastro criado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados Invalídos",content = @Content)
    })
    ResponseEntity<Void> create(PersonDTO personDTO);

    @Operation(summary = "Realiza a busca do person pelo ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201" , description = "busca do person pelo ID realizada com sucesso"),
        @ApiResponse(responseCode = "400", description = "Id invalido",content = @Content)
    })
    ResponseEntity<Person>findById(Long id);

}
