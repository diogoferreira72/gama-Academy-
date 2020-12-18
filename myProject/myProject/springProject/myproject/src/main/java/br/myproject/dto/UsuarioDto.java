package br.myproject.dto;

import br.myproject.model.Usuario;

// DTO - Data Transfer Objects
public class UsuarioDto {
    // << Atributos >>
    //..... mudando o padrão de nomes (fugindo do padrão)
    private String nomeUsuario;
    private String enderecoEletronico;
    private char resourceAcessControlFacility;

    // << Métodos >>
    // botão direito ... source action
    public UsuarioDto(Usuario user) {
        this.nomeUsuario = user.getName();
        this.enderecoEletronico = user.getEmail();
        this.resourceAcessControlFacility = user.getRacf();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEnderecoEletronico() {
        return enderecoEletronico;
    }

    public void setEnderecoEletronico(String enderecoEletronico) {
        this.enderecoEletronico = enderecoEletronico;
    }

    public char getResourceAcessControlFacility() {
        return resourceAcessControlFacility;
    }

    public void setResourceAcessControlFacility(char resourceAcessControlFacility) {
        this.resourceAcessControlFacility = resourceAcessControlFacility;
    }



}
