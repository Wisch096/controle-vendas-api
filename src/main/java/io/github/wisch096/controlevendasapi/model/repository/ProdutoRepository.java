package io.github.wisch096.controlevendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.wisch096.controlevendasapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
