# 🏨 Protótipo de Sistema de Governança (Hotelaria)

Este projeto é um MVP (Minimum Viable Product) desenvolvido como estudo de caso acadêmico. Ele foi inspirado na rotina operacional de uma pousada real, com o objetivo de simular o controle de fluxos de governança de forma lógica e segura.

## 🚀 Funcionalidades do Protótipo (v1.0)

* *Simulação de Status*: Controle de um bloco experimental de 5 quartos (Disponível, Sujo, Em Limpeza).
* *Fluxo de Check-out*: Simulação de saída de hóspedes com alteração automática para status de limpeza.
* *Módulo de Operação*: Opções para a equipe iniciar e finalizar a higienização de cada unidade.
* *Checklist de Inspeção*: Verificação de itens críticos (Frigobar, Cama, Enxoval) para garantir o padrão de qualidade.
* *Validação de Entrada*: Tratamento de erros para garantir que apenas quartos configurados sejam acessados.

## 🆕 Atualizações da Versão 1.1

* *Modularização com Procedimentos: Organização do código em blocos específicos, facilitando a leitura e futura manutenção (Clean Code*).
* *Camada de Validação (Travas de Segurança)*: Implementação de lógica para impedir erros de fluxo, como iniciar limpeza em quartos ocupados ou finalizar check-out de quartos já vazios.
* *Feedback ao Usuário*: Inclusão de mensagens de erro detalhadas que explicam o motivo exato de uma operação não ser permitida.

## ⚡ Atualizações da Versão 1.3 (Salto de Versão)

Esta atualização consolida a maturidade da arquitetura e a implementação de regras de negócio avançadas, garantindo que o sistema seja à prova de falhas operacionais.

* *Inteligência de Estados (Memória): Implementação do vetor statusAnterior, permitindo que o sistema "lembre" a origem do quarto. Isso distingue entre uma arrumação de hóspede (quarto volta a ficar **Ocupado) e uma limpeza pós-saída (quarto fica **Disponível*).
* *Novo Fluxo de Manutenção: Adição de estados para Manutenção Técnica, incluindo o **Status 9 (Revisão Pós-Manutenção)*, criando um ciclo completo de reparo, vistoria e liberação.
* *Robustez Lógica (Se Aninhado): Reestruturação profunda das validações utilizando a técnica de **Se Aninhados* para garantir a integridade dos dados e evitar conflitos de transição no VisuAlg.
* *Checklist de Inspeção Dinâmico*: Expansão dos módulos de vistoria com desvio automático para o bloco de manutenção caso falhas técnicas (ar-condicionado, frigobar) sejam detectadas.
* *Interface e UX*: Refinamento do console com o uso de pausa_fake e LimpaTela, garantindo que o usuário visualize alertas importantes antes de retornar ao menu.

## 🛠️ Conceitos de ADS Aplicados

* *Estruturas de Dados: Uso de **Vetores (Arrays)* para gerenciar os estados das unidades.
* *Lógica de Programação*: Estruturas de decisão complexas e laços de repetição.
* *Engenharia de Requisitos*: Modelagem de um fluxo real de hotelaria para um ambiente de código.

## 🧰 Ferramentas Utilizadas

* *VisuAlg 3.0*: Ambiente de desenvolvimento para Portugol.
* *Git & GitHub*: Versionamento e hospedagem do portfólio.
* *Gemini AI*: Apoio na estruturação da documentação e revisão de lógica.

## 📅 Evolução do Projeto (RoadMap)

- [x] Implementação do status de "Ocupado" com retorno inteligente.
- [x] Módulo de Revisão Técnica (Status 9).
- [ ] Expansão da matriz para suporte a escala real (38+ quartos).
- [ ] Geração de relatório final de ocupação e produtividade.