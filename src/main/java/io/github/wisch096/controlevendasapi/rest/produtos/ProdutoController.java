package io.github.wisch096.controlevendasapi.rest.produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.github.wisch096.controlevendasapi.model.Produto;
import io.github.wisch096.controlevendasapi.model.repository.ProdutoRepository;

import java.util.Optional;

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

	 @PutMapping("{id}")
	public ResponseEntity<Void> atualizar (@PathVariable Long id, @RequestBody ProdutoFormRequest produto) {
		 Optional<Produto> produtoExistente = repository.findById(id);

		 if(produtoExistente.isEmpty()) {
			 return ResponseEntity.notFound().build();
		 }

		 Produto entidade = produto.toModel();
		 entidade.setId(id);
		 repository.save(entidade);

		 return ResponseEntity.ok().build();
	 }


}
