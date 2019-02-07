create table address(
	id int auto_increment,
	street varchar(255) not null,
	zip_code varchar(255) not null,
	
	constraint pk_address_id primary key (id)
);

create table library(
	id int auto_increment,
	name varchar(255) not null,
	address_id int not null unique,
	
	constraint pk_library_id primary key (id),
	constraint fk_library_address_id foreign key (address_id) references address(id)
);