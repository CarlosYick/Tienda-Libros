package yick.tienda_libros.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import yick.tienda_libros.modelo.Libro;

public interface LibroRepositorio extends JpaRepository<Libro, Integer> {
}
