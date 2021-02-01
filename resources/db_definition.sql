create table u_role
(
    id int auto_increment
        primary key,
    role_name varchar(20) not null,
    constraint u_role_role_name_uindex
        unique (role_name)
);

create table b_user
(
    id int auto_increment
        primary key,
    u_login varchar(50) not null,
    u_pass varchar(100) not null,
    u_name varchar(100) null,
    role_id int default 2 not null,
    constraint b_user_u_login_uindex
        unique (u_login),
    constraint b_user_u_role_id_fk
        foreign key (role_id) references u_role (id)
);

