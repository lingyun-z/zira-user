CREATE TABLE user(
    user_id VARCHAR(36) PRIMARY KEY NOT NULL,
    work_user_id VARCHAR(36),
    name VARCHAR(256) NOT NULL,
    mail VARCHAR(256) NOT NULL unique,
    password VARCHAR(256) NOT NULL
);

CREATE TABLE project(
    project_id VARCHAR(36) PRIMARY KEY NOT NULL,
    project_name VARCHAR(256) UNIQUE NOT NULL,
    project_description VARCHAR(1024)
);

CREATE TABLE project_auth(
    project_auth_id VARCHAR(36) PRIMARY KEY NOT NULL,
    project_id VARCHAR(36) NOT NULL,
    user_id VARCHAR(36) NOT NULL,
    project_user_role VARCHAR(256)
);

