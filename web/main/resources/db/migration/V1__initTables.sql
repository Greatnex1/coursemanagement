CREATE TABLE student (

                        id BIGSERIAL PRIMARY KEY,
                        firstname TEXT NOT NULL,
                        lastname TEXT NOT NULL,
                        email TEXT NOT NULL,
                        gender TEXT NOT NULL,
                        unique (id)
);