CREATE TABLE course(

                       id BIGSERIAL PRIMARY KEY,
                       courseCode BIGSERIAL,
                       courseTitle TEXT NOT NULL,
                       courseCreated  DATE NOT NULL,
                       unique(courseCode)

);