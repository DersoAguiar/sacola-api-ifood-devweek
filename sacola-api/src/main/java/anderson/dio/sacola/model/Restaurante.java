package anderson.dio.sacola.model;

import anderson.dio.sacola.enumeration.FormaPagamento;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor


public class Restaurante {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String nome;
   @OneToMany(cascade = CascadeType.ALL) //cascadetype.all significa que se o restaurante for excluido, todos os itens dentro dele serao excluidos também
   private List<Produto> produtos;
   @Embedded
   private Endereco endereco;
}
