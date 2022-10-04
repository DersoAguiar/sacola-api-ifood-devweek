package anderson.dio.sacola.service;

import anderson.dio.sacola.model.Item;
import anderson.dio.sacola.model.Sacola;
import anderson.dio.sacola.resource.dto.ItemDto;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(long id, int formaPagamento);
}
