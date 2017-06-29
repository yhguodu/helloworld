create table todp_portal_work_order_approval (
		id int not null primary key auto_increment,
		uid int not null,
        user_name char(20) not null,
        title char(50) not null,
        request_reason char(255) not null,
        product_id int not null,
        product_code char(20) not null,
        product_name char(50) not null,
        gmt_created bigint(20) not null,
        gmt_approved bigint(20),
        approval_reason char(255),
        admin_id int not null,
        admin_name char(20) not null,
        status int not null
);
