CREATE TABLE user(
    user_id VARCHAR(36) PRIMARY KEY NOT NULL,
    work_user_id VARCHAR(36) NOT NULL,
    name VARCHAR(256),
    mail VARCHAR(256)
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

