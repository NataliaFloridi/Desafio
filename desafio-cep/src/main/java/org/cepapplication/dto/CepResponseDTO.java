package org.cepapplication.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CepResponseDTO {

    private String cep;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
}
