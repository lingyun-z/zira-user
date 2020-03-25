INSERT INTO user (user_id, name, mail, password)
VALUES
('1bd358a8-24ac-11ea-b286-0242ac110002', '张凌云', 'zhanglingyun19970823@gmail.com', 'zhanglingyun'),
('502f273d-3061-11ea-921f-0242ac110002', '张哲成', 'zhangzhechen@fullstack.com', 'zhunizaoribiye'),
('d97e96a4-6eca-11ea-a335-0242ac110002', '张仁杰', 'zhangrenjei@php.com', 'woshiphpdashi'),
('e0ccdd0e-6eca-11ea-a335-0242ac110002', '郭浩苒', 'guohaoran@vue.com', 'woshivuedashi');

INSERT INTO project (project_id, project_name, project_description)
VALUES
('a7d243f3-3061-11ea-921f-0242ac110002', 'ZIRA', '这是一个基于微服务的项目需求管理系统');

INSERT INTO project_auth (project_auth_id, project_id, user_id, project_user_role)
VALUES
('1313405b-3062-11ea-921f-0242ac110002', 'a7d243f3-3061-11ea-921f-0242ac110002', '1bd358a8-24ac-11ea-b286-0242ac110002', 'OWNER'),
('1cb3c0d1-3062-11ea-921f-0242ac110002', 'a7d243f3-3061-11ea-921f-0242ac110002', '502f273d-3061-11ea-921f-0242ac110002', 'ADMIN'),
('230d421b-6ecc-11ea-a335-0242ac110002', 'a7d243f3-3061-11ea-921f-0242ac110002', 'd97e96a4-6eca-11ea-a335-0242ac110002', 'MEMBER'),
('2d4f5701-6ecc-11ea-a335-0242ac110002', 'a7d243f3-3061-11ea-921f-0242ac110002', 'e0ccdd0e-6eca-11ea-a335-0242ac110002', 'MEMBER');

