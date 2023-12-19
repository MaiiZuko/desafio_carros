ALTER TABLE carros CHANGE chassisId chassis_id VARCHAR(255) DEFAULT 'defaultChassisId';

UPDATE carros SET chassis_id = 'defaultChassisId' WHERE chassis_id IS NULL;

ALTER TABLE carros ADD COLUMN id BIGINT AUTO_INCREMENT PRIMARY KEY;