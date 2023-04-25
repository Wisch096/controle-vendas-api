package io.github.wisch096.controlevendasapi.rest.produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.github.wisch096.controlevendasapi.model.Produto;
import io.github.wisch096.controlevendasapi.model.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@PostMapping
	 public ProdutoFormRequest salvar(@RequestBody ProdutoFormRequest produto) {
		
		Produto entityProduto = produto.toModel();
		repository.save(entityProduto);
		System.out.println(entityProduto);

		return ProdutoFormRequest.fromModel(entityProduto);
	 }
}
