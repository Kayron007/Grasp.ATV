
# GRASP MVC Demo (Java)

Arquitetura **MVC** com camadas **Model / View / Controller** separadas. A View está em um **pacote próprio** (`br.ucb.graspmvc.view`), isolada das demais camadas, conforme pedido.

Padrões **GRASP** aplicados e comentados no código:
- **Controller**: `OrderController` orquestra os casos de uso.
- **Creator**: `Order` cria `OrderItem`.
- **Information Expert**: `Order` calcula `getTotal()`; `OrderItem` calcula `getSubtotal()`.
- **Low Coupling / High Cohesion**: serviços e repositório in-memory isolam infraestrutura do domínio.

## Estrutura
```
src/main/java/br/ucb/graspmvc/
  app/Main.java
  controller/OrderController.java
  model/{Customer,Product,Order,OrderItem}.java
  service/OrderService.java
  repo/InMemoryDatabase.java
  view/{ConsoleView,MenuView}.java
```

## Executar (Maven)
```bash
mvn -q clean package
mvn -q exec:java -Dexec.mainClass=br.ucb.graspmvc.app.Main
```

Saída esperada:
```
==== SISTEMA DE PEDIDOS (MVC/GRASP) ====
1) Criar pedido demo
2) Sair
>> 1
=== RESUMO DO PEDIDO ===
Cliente: Cliente Demo
- Café 500g x2 -> R$ 49,80
- Filtro de Papel x3 -> R$ 22,50
TOTAL: R$ 72,30
```
