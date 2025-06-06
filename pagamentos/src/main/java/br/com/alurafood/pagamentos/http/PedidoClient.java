package br.com.alurafood.pagamentos.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alurafood.pagamentos.model.Pedido;

@FeignClient("pedidos-ms")
public interface  PedidoClient {

    @RequestMapping(method= RequestMethod.PUT, value= "/pedidos/{id}/pago")
    void atualizaPagamento(@PathVariable Long id);

    @RequestMapping(method= RequestMethod.GET, value= "/pedidos/{id}")
    Pedido obterItensDoPedido(@PathVariable Long id);

}
