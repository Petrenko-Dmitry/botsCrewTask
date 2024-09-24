
CREATE TABLE IF NOT EXISTS lector (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    degree ENUM('PROFESSOR', 'ASSOCIATE_PROFESSOR', 'ASSISTANT') NOT NULL,
    salary DECIMAL(10, 2) NOT NULL
    );

CREATE TABLE IF NOT EXISTS department (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    head_id BIGINT,
    FOREIGN KEY (head_id) REFERENCES lector(id)
    );

CREATE TABLE IF NOT EXISTS department_lectors (
    departments_id BIGINT NOT NULL,
    lectors_id BIGINT NOT NULL,
    PRIMARY KEY (departments_id, lectors_id),
    FOREIGN KEY (departments_id) REFERENCES department(id),
    FOREIGN KEY (lectors_id) REFERENCES lector(id)
    );