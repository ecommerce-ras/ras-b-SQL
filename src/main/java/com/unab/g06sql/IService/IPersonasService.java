package com.unab.g06sql.IService;
import java.util.List;
import java.util.Optional;

import com.unab.g06sql.Entity.Personas;

public interface IPersonasService {
	
	public List<Personas> all();

	public Optional<Personas> findById(Integer id);

	public Personas save(Personas personas);

	public void delete(Integer id);

}
