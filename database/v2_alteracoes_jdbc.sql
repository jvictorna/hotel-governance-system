-- ================================================
-- Hotel Governance System
-- v2 — Alterações para integração JDBC
-- ================================================

use hotel_governance_system;

-- Alteração do tipo da coluna numero de VARCHAR para INT
ALTER TABLE quartos
MODIFY COLUMN numero INT NOT NULL;

-- Adição do campo de controle de origem da limpeza
ALTER TABLE quartos
ADD COLUMN id_origem_limpeza INT NULL;

-- Adição do campo de controle de origem da manutenção
ALTER TABLE quartos
ADD COLUMN id_origem_manutencao INT NULL;