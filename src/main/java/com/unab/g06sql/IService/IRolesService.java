package com.unab.g06sql.IService;

import java.util.List;
import java.util.Optional;

import com.unab.g06sql.Entity.Roles;

public interface IRolesService {

	public List<Roles> all();

	public Optional<Roles> findById(Integer id);

	public Roles save(Roles roles);

	public void delete(Integer id);
}
