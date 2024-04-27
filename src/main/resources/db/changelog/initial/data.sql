insert into AUTHORITIES(AUTHORITY)
values ( 'USER' ),
       ('ADMIN');

insert into users(email, password, enabled)
VALUES ( 'qwe@qwe.qwe', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true ),
       ( 'john@qwe.qwe', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true ),
       ( 'alex@qwe.qwe', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true ),
       ( 'ser@qwe.qwe', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true ),
       ( 'gin@qwe.qwe', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true );

insert into user_role(user_id, role_id)
values ( 1, 1),
    (2, 1),
       (3, 1),
       (4, 1),
       (5, 1);

insert into files(name, file_name, author_id, status)
VALUES ( 'new file', '1674353323_gas-kvas-com-p-risunki-gor-3d-1.jpg', 1, 'PUBLIC' ),
       ('second_file', 'channels4_profile.jpg', 2, 'PUBLIC'),
       ('third_file', 'create-custom-2d-vector-landscapes.jpg', 3, 'PUBLIC'),
       ('and file', 'unnamed.jpg', 4, 'PUBLIC'),
       ('and private', 'unnamed.jpg (1)', 5, 'PRIVATE');
