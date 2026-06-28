-- ================================================
-- Hotel Governance System
-- v3 — Histórico de operações e relatórios
-- ================================================

use hotel_governance_system;

-- Adição do campo de data da última saída de hóspede
ALTER TABLE quartos
ADD COLUMN data_ultima_saida DATETIME NULL;

-- Criação da tabela de histórico de operações
CREATE TABLE historico_operacoes (
    id_historico INT NOT NULL AUTO_INCREMENT,
    id_quarto INT NOT NULL,
    numero_quarto INT NOT NULL,
    id_status_anterior INT,
    id_status_novo INT NOT NULL,
    tipo_operacao VARCHAR(50) NOT NULL,
    data_hora DATETIME DEFAULT NOW(),
    PRIMARY KEY (id_historico),
    FOREIGN KEY (id_quarto) REFERENCES quartos(id_quarto)
) DEFAULT CHARSET utf8mb4;