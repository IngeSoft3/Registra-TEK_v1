-- MySQL Script generated by MySQL Workbench
-- 04/06/16 04:53:39
-- Model: New Model    Version: 1.0
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema rg_tk
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS rg_tk ;
CREATE SCHEMA IF NOT EXISTS rg_tk DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE rg_tk ;

-- -----------------------------------------------------
-- Table rg_tk.sede
-- -----------------------------------------------------
DROP TABLE IF EXISTS rg_tk.sede ;

CREATE TABLE IF NOT EXISTS rg_tk.sede (
  codigo INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  direccion VARCHAR(45) NOT NULL,
  PRIMARY KEY (codigo))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table rg_tk.curso
-- -----------------------------------------------------
DROP TABLE IF EXISTS rg_tk.curso ;

CREATE TABLE IF NOT EXISTS rg_tk.curso (
  codigo INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  jornada VARCHAR(45) NOT NULL,
  sede_codigo INT NOT NULL,
  PRIMARY KEY (codigo),
  INDEX fk_curso_sede_idx (sede_codigo ASC),
  CONSTRAINT fk_curso_sede
    FOREIGN KEY (sede_codigo)
    REFERENCES rg_tk.sede (codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table rg_tk.estudiante
-- -----------------------------------------------------
DROP TABLE IF EXISTS rg_tk.estudiante ;

CREATE TABLE IF NOT EXISTS rg_tk.estudiante (
  codigo INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  apellidos VARCHAR(45) NOT NULL,
  fechaNacimiento DATE NOT NULL,
  curso_codigo INT NOT NULL,
  PRIMARY KEY (codigo),
  INDEX fk_estudiante_curso1_idx (curso_codigo ASC),
  CONSTRAINT fk_estudiante_curso1
    FOREIGN KEY (curso_codigo)
    REFERENCES rg_tk.curso (codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
