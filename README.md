# 🏨 Protótipo de Sistema de Governança (Hotelaria)

Este projeto é um MVP (Minimum Viable Product) desenvolvido como estudo de caso acadêmico. Foi inspirado na rotina operacional de uma pousada real, com o objetivo de simular o controle de fluxos de governança de forma lógica e segura.

---

## 🚀 Funcionalidades do Protótipo (v1.0)
- **Simulação de Status:** Controle de um bloco experimental de 5 quartos (Disponível, Sujo, Em Limpeza).
- **Fluxo de Check-out:** Simulação de saída de hóspedes com alteração automática para status de limpeza.
- **Módulo de Operação:** Opções para a equipe iniciar e finalizar a higienização de cada unidade.
- **Checklist de Inspeção:** Verificação de itens críticos (Frigobar, Cama, Enxoval) para garantir o padrão de qualidade.
- **Validação de Entrada:** Tratamento de erros para garantir que apenas quartos configurados sejam acessados.

---

## 🆕 Atualizações da Versão 1.1
- **Modularização com Procedimentos:** Organização do código em blocos específicos, facilitando a leitura e futura manutenção (Clean Code).
- **Início das Travas de Segurança:** Implementação de validação para impedir que quartos inválidos sejam acessados, com mensagens de erro detalhadas ao usuário.
- **Interface Aprimorada:** Padronização visual do console com cabeçalhos e separadores, melhorando a experiência de uso.

---

## ⚡ Atualizações da Versão 1.3 (Salto de Versão)
Esta atualização consolida a maturidade da arquitetura e a implementação de regras de negócio avançadas, garantindo que o sistema seja à prova de falhas operacionais.

- **Inteligência de Estados (Memória):** Implementação do vetor `statusAnterior`, permitindo que o sistema "lembre" a origem do quarto. Isso distingue entre uma arrumação de hóspede (quarto volta a ficar **Ocupado**) e uma limpeza pós-saída (quarto fica **Disponível**).
- **Novo Fluxo de Manutenção:** Adição de estados para Manutenção Técnica, incluindo o **Status 9 (Revisão Pós-Manutenção)**, criando um ciclo completo de reparo, vistoria e liberação.
- **Travas de Segurança Avançadas:** Reestruturação profunda das validações utilizando `Se Aninhados`, impedindo transições de estado inválidas e evitando erros operacionais.
- **Checklist de Inspeção Dinâmico:** Expansão dos módulos de vistoria com desvio automático para manutenção caso falhas técnicas (ar-condicionado, frigobar) sejam detectadas durante a inspeção.
- **Interface e UX:** Refinamento do console com `pausa_fake` e `LimpaTela`, garantindo que o usuário visualize alertas importantes antes de retornar ao menu.

---

## 🔒 Atualizações da Versão 1.4 — Protótipo Final
- **Travas de Segurança Completas:** Fechamento de todas as brechas operacionais.
- **Validação de Entradas:** Checklists passam a aceitar apenas S ou N.
- **Correção do Fluxo Pós Manutenção:** Inconsistência do status 9 resolvida.
- **Modularização Total:** Bloco principal limpo e preparado para expansão.

---

## 🏨 Atualizações da Versão 2.0 — Sistema Real

Esta versão representa a evolução do protótipo acadêmico para um sistema
baseado na estrutura real de uma pousada, expandindo de 5 quartos 
fictícios para 38 quartos reais distribuídos em 4 andares.

- **Expansão para 38 Quartos Reais:** O sistema passa a operar com a
  numeração real dos quartos (02, 03, 101, 208, 311...), substituindo
  os 5 quartos fictícios do protótipo.

- **Vetor de Mapeamento:** Implementação do vetor `numerosQuartos` que
  associa cada posição interna à numeração real do quarto, permitindo
  que o sistema trabalhe com números não sequenciais.

- **Algoritmo de Busca Sequencial:** O sistema percorre o vetor de
  mapeamento para localizar a posição interna correspondente ao número
  digitado pelo usuário, introduzindo o conceito de busca por índice.

- **Organização por Andar:** A exibição dos quartos foi reestruturada
  em 4 seções — Térreo, 1º, 2º e 3º Andar — refletindo a estrutura
  física do sistema e facilitando a leitura operacional.

- **Validação Dinâmica:** A validação de quarto inválido deixou de
  verificar um intervalo fixo (1 a 5) e passou a verificar se o número
  digitado existe de fato no cadastro do sistema.

---

## 🛠️ Conceitos de ADS Aplicados
- **Estruturas de Dados:** Uso de Vetores (Arrays) para gerenciar os estados das unidades.
- **Lógica de Programação:** Estruturas de decisão complexas e laços de repetição.
- **Engenharia de Requisitos:** Modelagem de um fluxo real de hotelaria para um ambiente de código.

---

## 🧰 Ferramentas Utilizadas
- **VisuAlg 3.0:** Ambiente de desenvolvimento para Portugol.
- **Java + NetBeans IDE 29:** Ambiente de desenvolvimento para a migração do sistema.
- **Git & GitHub:** Versionamento e hospedagem do portfólio.
- **Assistente de IA:** Apoio na estruturação da documentação e revisão de lógica.

---

## 📅 Próximos Passos
- ~~Correção e fechamento do protótipo de 5 quartos (v1.4)~~ ✅
- ~~Expansão para os 38 quartos reais distribuídos por andar (v2.0)~~ ✅
- ~~Migração do sistema para Java~~ ✅
- Geração de relatório final de ocupação e produtividade
- Implementação de interface mobile

---

## 📁 Histórico de Versões
| Versão | Marco |
|--------|-------|
| v1.0 | Protótipo inicial — 3 status, fluxo básico, lógica centralizada |
| v1.1 | Modularização — procedimentos separados, interface aprimorada, início das travas |
| v1.3 | Maturidade — 9 status, inteligência de estados, travas avançadas, checklists dinâmicos |
| v1.4 | Protótipo final — travas completas, validação de entradas, correção do fluxo pós manutenção e modularização total |
| v2.0 | Sistema real — 38 quartos da pousada, organizados por andar, com busca por número real |
| v2.0 Java | Migração completa para Java — métodos, travas, checklists e loop principal |