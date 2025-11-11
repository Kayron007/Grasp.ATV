# GRASP Demo (Java)

Mini aplicação Java demonstrando **GRASP**:
- **Controller**: `OrderController` coordena o caso de uso "criar pedido e adicionar itens".
- **Creator**: `Order` cria seus `OrderItem` (agregação natural).
- **Information Expert**: `Order` calcula `getTotal()` e `OrderItem` calcula `getSubtotal()`.
- **Low Coupling / High Cohesion**: camadas com responsabilidades claras e sem dependências desnecessárias (`OrderService` e `InMemoryDatabase`).

## Requisitos
- Java 17+ (ou 11+, ajustando o `--release` se quiser)
- Opcional: Maven/Gradle (não é obrigatório para compilar/rodar)

## Executando sem build tool
```bash
# Estando na raiz do projeto (grasp-demo/)
javac -d out $(find src/main/java -name "*.java")
java -cp out br.ucb.grasp.Main
