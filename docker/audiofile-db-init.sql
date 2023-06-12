CREATE TABLE IF NOT EXISTS `spotify_retriever_dev`.`audiofiles` (
    `filepath` VARCHAR(767) NOT NULL,
    PRIMARY KEY (`filepath`),
    UNIQUE INDEX `audiofiles_UNIQUE` (`filepath` ASC) VISIBLE)
    ENGINE = InnoDB;