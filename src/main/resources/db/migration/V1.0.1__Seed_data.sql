INSERT INTO user (user_id, work_user_id, name, mail)
VALUES
('1bd358a8-24ac-11ea-b286-0242ac110002', 'test', 'zly', 'zly@aaa.com'),
('502f273d-3061-11ea-921f-0242ac110002', 'test1', 'zzc', 'zzc@aaa.com');

INSERT INTO project (project_id, project_name, project_description)
VALUES
('a7d243f3-3061-11ea-921f-0242ac110002', 'ZIRA', 'zira description');

INSERT INTO project_auth (project_auth_id, project_id, user_id, project_user_role)
VALUES
('1313405b-3062-11ea-921f-0242ac110002', 'a7d243f3-3061-11ea-921f-0242ac110002', '1bd358a8-24ac-11ea-b286-0242ac110002', 'OWNER'),
('1cb3c0d1-3062-11ea-921f-0242ac110002', 'a7d243f3-3061-11ea-921f-0242ac110002', '502f273d-3061-11ea-921f-0242ac110002', 'MEMBER');

