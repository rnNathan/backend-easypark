package com.backend.EasyPark.model.dto;

import com.backend.EasyPark.model.enums.TipoVeiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeiculoDTO {

    private Integer id;
    private String placa;
    private TipoVeiculo tipoVeiculo;
    private boolean ocupandoVaga;
    private Integer idUsuarioDTO; // Relacionamento com o usuário
    private FabricanteDTO fabricanteDTO;
}

