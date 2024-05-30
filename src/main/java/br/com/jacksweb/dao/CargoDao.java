package br.com.jacksweb.dao;

import br.com.jacksweb.domain.Cargo;
import br.com.jacksweb.domain.Departamento;

import java.util.List;

public interface CargoDao {
    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
