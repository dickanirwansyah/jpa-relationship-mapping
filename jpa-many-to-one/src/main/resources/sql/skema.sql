create table product(
	id int auto_increment,
	nama varchar(255) null,
	price int null,
	qty int null,
	created_at datetime not null,
	updated_at datetime not null,
	kategori_id varchar(255) not null,
	
	constraint pk_produk_id primary key (id),
	constraint fk_produk_kategori_id foreign key (kategori_id) references kategori(id)
);

create table kategori(
	id varchar(255) not null unique,
	nama varchar(255) not null,
	created_at datetime not null,
	updated_at datetime not null,
	
	constraint pk_kategori_id primary key (id)
);