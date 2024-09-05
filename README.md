# Programação orientada a objetos
- A programação orientada a objetos (POO) é um paradigma de programação que organiza o código em torno de objetos, que representam entidades do mundo real e possuem características (atributos) e comportamentos (métodos)

## Conceitos da atividade
- Enum
- Herança

#### ENUM
Enuns são campos com valores fixos pré-definidos.

```java
package enums;

public enum TipoCapaEnum
{
    COMUM,
    DURA,
    PERSONALIZADA
}

```

#### Herança
É o ato de criar classes que herdam atributos e métodos de outra classe.
A classe principal se chama superclasse, as classes "filhas" que herda da superclasse se chama subclasse.
**Superclasse: ** conhecida como "classe mãe"
**Subclasse: ** conhecida como "classe filha"

![image](https://github.com/user-attachments/assets/a0ec4432-8928-4911-a477-cc57c5befcb0)

se usa o comando "extends" para uma classe herdar da superclasse:

```java
public class Gerente extends Funcionario{
private double gratificacao;
}
```
