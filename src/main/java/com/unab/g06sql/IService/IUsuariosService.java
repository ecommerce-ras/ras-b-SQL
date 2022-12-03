package com.unab.g06sql.IService;

import java.util.List;
import java.util.Optional;

import com.unab.g06sql.Entity.Usuarios;

public interface IUsuariosService {

	public List<Usuarios> all();

	public Optional<Usuarios> findById(Integer id);

	public Usuarios save(Usuarios usuarios);

	public void delete(Integer id);
}
