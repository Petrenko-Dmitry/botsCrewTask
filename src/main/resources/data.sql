-- Inserting data into the lector table
INSERT INTO lector (id, name, degree, salary)
SELECT 1, 'Ivan Petrenko', 'PROFESSOR', 15000
    WHERE NOT EXISTS (SELECT 1 FROM lector WHERE id = 1);

INSERT INTO lector (id, name, degree, salary)
SELECT 2, 'Oksana Kovalenko', 'ASSOCIATE_PROFESSOR', 12000
    WHERE NOT EXISTS (SELECT 1 FROM lector WHERE id = 2);

INSERT INTO lector (id, name, degree, salary)
SELECT 3, 'Serhiy Honchar', 'PROFESSOR', 14000
    WHERE NOT EXISTS (SELECT 1 FROM lector WHERE id = 3);

INSERT INTO lector (id, name, degree, salary)
SELECT 4, 'Mariya Levchenko', 'ASSISTANT', 10000
    WHERE NOT EXISTS (SELECT 1 FROM lector WHERE id = 4);

INSERT INTO lector (id, name, degree, salary)
SELECT 5, 'Andriy Sydorenko', 'ASSISTANT', 9000
    WHERE NOT EXISTS (SELECT 1 FROM lector WHERE id = 5);

INSERT INTO lector (id, name, degree, salary)
SELECT 6, 'Tetiana Kravchenko', 'ASSOCIATE_PROFESSOR', 11000
    WHERE NOT EXISTS (SELECT 1 FROM lector WHERE id = 6);

INSERT INTO lector (id, name, degree, salary)
SELECT 7, 'Viktoriya Yarosh', 'PROFESSOR', 16000
    WHERE NOT EXISTS (SELECT 1 FROM lector WHERE id = 7);

INSERT INTO lector (id, name, degree, salary)
SELECT 8, 'Mykola Chornyi', 'ASSOCIATE_PROFESSOR', 11500
    WHERE NOT EXISTS (SELECT 1 FROM lector WHERE id = 8);

INSERT INTO lector (id, name, degree, salary)
SELECT 9, 'Olena Ponomarenko', 'ASSISTANT', 9500
    WHERE NOT EXISTS (SELECT 1 FROM lector WHERE id = 9);

INSERT INTO lector (id, name, degree, salary)
SELECT 10, 'Roman Kostenko', 'ASSOCIATE_PROFESSOR', 9000
    WHERE NOT EXISTS (SELECT 1 FROM lector WHERE id = 10);

-- Inserting data into the department table
INSERT INTO department (id, name, head_id)
SELECT 1, 'Computer Science', 1
    WHERE NOT EXISTS (SELECT 1 FROM department WHERE id = 1);

INSERT INTO department (id, name, head_id)
SELECT 2, 'Economics', 2
    WHERE NOT EXISTS (SELECT 1 FROM department WHERE id = 2);

INSERT INTO department (id, name, head_id)
SELECT 3, 'Mathematics', 1
    WHERE NOT EXISTS (SELECT 1 FROM department WHERE id = 3);

INSERT INTO department (id, name, head_id)
SELECT 4, 'Physics', 3
    WHERE NOT EXISTS (SELECT 1 FROM department WHERE id = 4);

INSERT INTO department (id, name, head_id)
SELECT 5, 'Chemistry', 5
    WHERE NOT EXISTS (SELECT 1 FROM department WHERE id = 5);

INSERT INTO department (id, name, head_id)
SELECT 6, 'Biology', 6
    WHERE NOT EXISTS (SELECT 1 FROM department WHERE id = 6);

INSERT INTO department (id, name, head_id)
SELECT 7, 'Sociology', 7
    WHERE NOT EXISTS (SELECT 1 FROM department WHERE id = 7);

INSERT INTO department (id, name, head_id)
SELECT 8, 'Philology', 8
    WHERE NOT EXISTS (SELECT 1 FROM department WHERE id = 8);

INSERT INTO department (id, name, head_id)
SELECT 9, 'Psychology', 9
    WHERE NOT EXISTS (SELECT 1 FROM department WHERE id = 9);

INSERT INTO department (id, name, head_id)
SELECT 10, 'History', 10
    WHERE NOT EXISTS (SELECT 1 FROM department WHERE id = 10);

-- Inserting data into the department_lectors table
INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 1, 1
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 1 AND lectors_id = 1);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 1, 2
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 1 AND lectors_id = 2);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 2, 2
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 2 AND lectors_id = 2);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 3, 1
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 3 AND lectors_id = 1);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 3, 3
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 3 AND lectors_id = 3);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 4, 3
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 4 AND lectors_id = 3);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 4, 4
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 4 AND lectors_id = 4);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 5, 4
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 5 AND lectors_id = 4);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 5, 5
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 5 AND lectors_id = 5);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 6, 6
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 6 AND lectors_id = 6);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 7, 7
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 7 AND lectors_id = 7);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 8, 8
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 8 AND lectors_id = 8);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 9, 9
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 9 AND lectors_id = 9);

INSERT INTO department_lectors (departments_id, lectors_id)
SELECT 10, 10
    WHERE NOT EXISTS (SELECT 1 FROM department_lectors WHERE departments_id = 10 AND lectors_id = 10);
