
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
-- Table rg_tk.materia
-- -----------------------------------------------------
INSERT INTO materia (codigo, nombre, parcial1, parcial2, parcial3, talleres, adicionales, proyecto, estudiante_Codigo, docente_codigo, salon_codigo) VALUES (1000, "Calculo I",   2.3, 4.3, 5, 4.6, 3.1, 5, 1134, 3121, 1005);
INSERT INTO materia (codigo, nombre, parcial1, parcial2, parcial3, talleres, adicionales, proyecto, estudiante_Codigo, docente_codigo, salon_codigo) VALUES (2000, "Calculo II",  2.2, 4.2, 5, 4.6, 3.4, 5, 1230, 3221, 1004);
INSERT INTO materia (codigo, nombre, parcial1, parcial2, parcial3, talleres, adicionales, proyecto, estudiante_Codigo, docente_codigo, salon_codigo) VALUES (3000, "Calculo III", 2.5, 4.5, 5, 4.5, 3.5, 5, 1034, 3112, 1003);
INSERT INTO materia (codigo, nombre, parcial1, parcial2, parcial3, talleres, adicionales, proyecto, estudiante_Codigo, docente_codigo, salon_codigo) VALUES (4000, "Fisica I",    2.6, 4.6, 5, 4.4, 3.6, 5, 1234, 3222, 1002);
INSERT INTO materia (codigo, nombre, parcial1, parcial2, parcial3, talleres, adicionales, proyecto, estudiante_Codigo, docente_codigo, salon_codigo) VALUES (5000, "Fisica II",   2.7, 4.7, 5, 4.2, 3.7, 5, 1204, 3211, 1001);


-- -----------------------------------------------------
