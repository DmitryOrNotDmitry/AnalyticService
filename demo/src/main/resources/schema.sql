CREATE TABLE Player (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Operation (
    id BIGINT PRIMARY KEY,
    player_id BIGINT NOT NULL,
    amount DOUBLE NOT NULL,
    FOREIGN KEY (player_id) REFERENCES Player(id) ON DELETE CASCADE
);

alter table Operation add foreign key (player_id) references Player(id);