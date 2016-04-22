
-- Este script me llena la Informacion de la BD, con la 
-- info principal, de la sede, cursos, materias, etc...

-- -----------------------------------------------------
-- Table rg_tk.sede
-- -----------------------------------------------------
INSERT INTO sede (codigo, nombre, direccion) VALUES (1100, "principal", "norte");
INSERT INTO sede (codigo, nombre, direccion) VALUES (2200, "secundaria", "noroeste");
INSERT INTO sede (codigo, nombre, direccion) VALUES (3300, "terciaria", "Sur");
INSERT INTO sede (codigo, nombre, direccion) VALUES (4400, "4to-level", "oriente");
INSERT INTO sede (codigo, nombre, direccion) VALUES (5500, "5to-level", "Occidente");

-- -----------------------------------------------------
-- Table rg_tk.salon
-- -----------------------------------------------------
INSERT INTO salon (codigo, nombre, ubicacion) VALUES (1001, "AL-201", "Agora");
INSERT INTO salon (codigo, nombre, ubicacion) VALUES (1002, "PS-103", "Parquesoft");
INSERT INTO salon (codigo, nombre, ubicacion) VALUES (1003, "AL-200", "Agora");
INSERT INTO salon (codigo, nombre, ubicacion) VALUES (1004, "PS-101", "Parquesoft");
INSERT INTO salon (codigo, nombre, ubicacion) VALUES (1005, "AL-201", "Agora");

-- -----------------------------------------------------
-- Table rg_tk.docente
-- -----------------------------------------------------
INSERT INTO docente (codigo, nombre, apellidos, fechaNacimiento) VALUES (3211, "Tony", "Melendez cruz", "2015-03-17");
INSERT INTO docente (codigo, nombre, apellidos, fechaNacimiento) VALUES (3112, "Ana", "Tulipanes rojos", "2014-07-10");
INSERT INTO docente (codigo, nombre, apellidos, fechaNacimiento) VALUES (3121, "Mary", "Caneco Pina", "2013-02-02");
INSERT INTO docente (codigo, nombre, apellidos, fechaNacimiento) VALUES (3221, "Cony", "Toma Pote", "2012-01-13");
INSERT INTO docente (codigo, nombre, apellidos, fechaNacimiento) VALUES (3222, "Karla", "Tulia Lopez", "2011-09-05");


-- -----------------------------------------------------
-- Table rg_tk.estudiante
-- -----------------------------------------------------
INSERT INTO estudiante (codigo, nombre, apellidos, fechaNacimiento, curso_codigo) VALUES ( 1234, "Elber", "Gomez Torba",  "2010-03-11",  1212);
INSERT INTO estudiante (codigo, nombre, apellidos, fechaNacimiento, curso_codigo) VALUES ( 1034, "Alma", "Tadero Perez",  "2011-04-12",  1313);
INSERT INTO estudiante (codigo, nombre, apellidos, fechaNacimiento, curso_codigo) VALUES ( 1204, "Alejo", "damas treso",  "2012-05-13",  1414);
INSERT INTO estudiante (codigo, nombre, apellidos, fechaNacimiento, curso_codigo) VALUES ( 1230, "Camilo",  "Del Basto",  "2013-06-14",  1515);
INSERT INTO estudiante (codigo, nombre, apellidos, fechaNacimiento, curso_codigo) VALUES ( 1134, "Juanita", "sinu noyo",  "2014-07-15",  1616);

-- -----------------------------------------------------
-- Table rg_tk.materia
-- -----------------------------------------------------
INSERT INTO materia (codigo, nombre, parcial1, parcial2, parcial3, talleres, adicionales, proyecto, estudiante_Codigo, docente_codigo, salon_codigo) VALUES (1000, "Calculo I",   2.3, 4.3, 5, 4.6, 3.1, 5, 1134, 3121, 1005);
INSERT INTO materia (codigo, nombre, parcial1, parcial2, parcial3, talleres, adicionales, proyecto, estudiante_Codigo, docente_codigo, salon_codigo) VALUES (2000, "Calculo II",  2.2, 4.2, 5, 4.6, 3.4, 5, 1230, 3221, 1004);
INSERT INTO materia (codigo, nombre, parcial1, parcial2, parcial3, talleres, adicionales, proyecto, estudiante_Codigo, docente_codigo, salon_codigo) VALUES (3000, "Calculo III", 2.5, 4.5, 5, 4.5, 3.5, 5, 1034, 3112, 1003);
INSERT INTO materia (codigo, nombre, parcial1, parcial2, parcial3, talleres, adicionales, proyecto, estudiante_Codigo, docente_codigo, salon_codigo) VALUES (4000, "Fisica I",    2.6, 4.6, 5, 4.4, 3.6, 5, 1234, 3222, 1002);
INSERT INTO materia (codigo, nombre, parcial1, parcial2, parcial3, talleres, adicionales, proyecto, estudiante_Codigo, docente_codigo, salon_codigo) VALUES (5000, "Fisica II",   2.7, 4.7, 5, 4.2, 3.7, 5, 1204, 3211, 1001);


-- -----------------------------------------------------
