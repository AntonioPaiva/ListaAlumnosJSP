package py.lista.alumnos.dao;

import java.util.List;

public interface Dao<T> {
	void insertar(T dao);

	void actualizar(T dao);

	void borrar(T dao);

	T buscarAlumno();

	List<T> buscar();
}
