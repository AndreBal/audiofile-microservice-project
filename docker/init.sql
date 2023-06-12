
CREATE TABLE IF NOT EXISTS `spotify_retriever_dev`.`users` (
  `idusers` INT NOT NULL,
  `login` TEXT NULL,
  `password` TEXT NULL,
  `email` TEXT NULL,
  PRIMARY KEY (`idusers`),
  UNIQUE INDEX `idusers_UNIQUE` (`idusers` ASC) VISIBLE)
ENGINE = InnoDB;