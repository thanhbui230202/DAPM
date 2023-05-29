create database QuanLyBienSoXe
go
use QuanLyBienSoXe
go
create table Account(
	idAccount char(5) primary key not null, --AD001, AD002, ND001, ND002
	sdt		varchar(11),
	cccd	varchar(9),
	passWords varchar(25),
	chucVu	nvarchar(5), --admin, user
	queQuan nvarchar(30),	
	hoVaTen nvarchar(25),
	gioiTinh nvarchar(25), --"Nam", "Nữ"
)

INSERT INTO Account
	VALUES('AD001','0','231548764','123','Admin',N'Đà Nẵng',N'Trần Hữu Tiến Đạt',N'Nam'),
		  ('AD002','01','231848763','123','Admin',N'Đà Nẵng',N'Nguyễn Trí Đức',N'Nam'),
		  ('AD003','0905861428','201848763','123','Admin',N'Đà Nẵng',N'Lê Thị Chinh',N'Nữ'),
		  ('AD004','0915831425','261849763','123','Admin',N'Đà Nẵng',N'Trần Văn Sở',N'Nam'),
		  ('ND001','1','261849763','123','User',N'Đà Nẵng',N'Bùi Minh Thành',N'Nam'),
		  ('ND002','11','261849763','123','User',N'Đà Nẵng',N'Nguyễn Ngọc Đạt',N'Nam'),
		  ('ND003','0915831425','261849763','123','User',N'Đà Nẵng',N'Trần Văn Sở',N'Nam'),
		  ('ND004','0915831425','261849763','123','User',N'Đà Nẵng',N'Trần Văn Sở',N'Nam'),
		  ('ND005','0915831425','261849763','123','User',N'Đà Nẵng',N'Trần Văn Sở',N'Nam'),
		  ('ND006','0915831425','261849763','123','User',N'Đà Nẵng',N'Trần Văn Sở',N'Nam'),
		  ('ND007','0915831425','261849763','123','User',N'Đà Nẵng',N'Trần Văn Sở',N'Nam'),
		  ('ND008','0915831425','261849763','123','User',N'Đà Nẵng',N'Trần Văn Sở',N'Nam'),
		  ('ND009','0915831425','261849763','123','User',N'Đà Nẵng',N'Trần Văn Sở',N'Nam'),
		  ('ND010','0915831425','261849763','123','User',N'Đà Nẵng',N'Trần Văn Sở',N'Nam')
		
go
create table loaiXe(
	idLoaiXe varchar(10) primary key not null, --BANTAI, OTO, MOTO, BUS, ...
	tenLoaixe nvarchar(255),
	ghiChu	nvarchar(255)
);
INSERT INTO loaiXe
	VALUES('LX001',N'Xe máy',N'XE MỚI'),
		  ('LX002',N'Xe bán tải',N'XE MỚI'),
		  ('LX003',N'Xe ô tô',N'XE MỚI'),
		  ('LX004',N'Xe buýt',N'XE MỚI');
		 


create table ThongTinXe(
	idThongTinXe char(5) primary key, --TT001, TT002, ...
	idLoaiXeNo varchar(10),
	mauSon nvarchar(25),
	nhanHieu nvarchar(25),
	soLoai nvarchar(25),
	theLoaiDangKi int,
	liDo nvarchar(255),
	idAccount char(5),
		constraint FK_TTXDK_idLoaiXeNo foreign key (idLoaiXeNo) references loaiXe(idLoaiXe)
)

INSERT INTO ThongTinXe
	VALUES('TT001','LX001',N'Đỏ','AB','4',1,N'1234','ND001'),
		  ('TT002','LX002',N'Vàng','Wave','4',1,N'1234','ND002'),
		  ('TT003','LX003',N'Hồng','SH','4',3,N'1234','ND003'),
		  ('TT004','LX004',N'Đen','Vision','4',4,N'1234','ND004'),
		  ('TT005','LX004',N'Xám','AB','4',1,N'1234','ND005'),
		  ('TT006','LX003',N'Xanh Lá','AB','4',2,N'1234','ND006'),
		  ('TT007','LX001',N'Đen','AB','4',1,N'1234','ND007'),
		  ('TT008','LX002',N'Đỏ','AB','4',2,N'1234','ND008'),
		  ('TT009','LX002',N'Xanh Dương','SH','4',1,N'1234','ND009'),
		  ('TT010','LX004',N'Đen','AB','4',1,N'1234','ND010'),
		  ('TT011','LX002',N'Cam','AB','4',2,N'1234','ND001'),
		  ('TT012','LX002',N'Đen','SH','4',1,N'1234','ND002'),
		  ('TT013','LX001',N'Tím','AB','4',4,N'1234','ND003'),
		  ('TT014','LX001',N'Xanh lá','AB','4',1,N'1234','ND004'),
		  ('TT015','LX003',N'Đen','SH','4',3,N'1234','ND005')
		 
go
	
	
create table DangKiBienSo(
	idDangKi char(5) primary key not null, --DK001, DK002, ...
	tenChuXe nvarchar(255),
	namsinh int,
	diachi nvarchar(255),
	cccdChuXe varchar(10),
	sdtNLTT varchar(10),
	soHoaDonDienTu varchar(10),
	maSoThue varchar(10),
	maHoSoKhaiLePhiTruocBa varchar(10),
	soToKhaiHaiQuan varchar(25),
	soSeriKTCLXX varchar(25),
	gmailChuXe nvarchar	(255),
	idThongTinXeNo char(5), --TT001,TT002,...
	tinhTrangDangKi char(2), --CD, DD, KD
	idAccountDangKi char(5), --ND001, ND002, ...
	idAccountDuyet char(5), --AD001, AD002, ...
	bienSoXe int,
		constraint FK_DKBS_idThongTinXeNo foreign key (idThongTinXeNo) references ThongTinXe(idThongTinXe)
)
INSERT INTO DangKiBienSo
	VALUES('DK001',N'Nguyễn Trí Đức','2002',N'01 Nguyễn Tất Thành','0000000001','0000000001','00001','00001','00001','00001','00001','agmail.com','TT001','DD','ND001','AD001','43001'),
		  ('DK002',N'Trần Hữu Tiến Đạt ','2002',N'02 Nguyễn Xí','0000000002','0000000002','00002','00002','00002','00002','00002','agmail.com','TT002','DD','ND002','AD002','43002'),
		  ('DK003',N'Bùi Minh Thành','2002',N'03 Nguyễn Hữu Thọ','0000000003','0000000003','00003','00003','00003','00003','00003','agmail.com','TT003','DD','ND003','AD003','43003'),
		  ('DK004',N'Huỳnh Ngọc Đạt','2002',N'04 Trần Cao Vân','0000000004','0000000004','00004','00004','00004','00004','00004','agmail.com','TT004','DD','ND004','AD004','43004'),
		  ('DK005',N'Nguyễn Văn Vui','2002',N'05 Ông Ích Khiêm','0000000005','0000000005','00005','00005','00005','00005','00005','agmail.com','TT005','CD','ND005','',''),
		  ('DK006',N'Lê Hòa Bình','2002',N'06 Nguyễn Văn Linh','0000000006','0000000006','00006','00006','00006','00006','00006','agmail.com','TT006','CD','ND006','',''),
		  ('DK007',N'Ngô Tiến Phát','2002',N'07 Đoàn Thị Điểm','0000000007','0000000007','00007','00007','00007','00007','00007','agmail.com','TT007','CD','ND007','',''),
		  ('DK008',N'Đặng Tấn Khải','2002',N'08 Điện Biên Phủ','0000000008','0000000008','00008','00008','00008','00008','00008','agmail.com','TT008','CD','ND008','',''),
		  ('DK009',N'Nguyễn Văn Sơn','2002',N'09 Phan Thanh','0000000009','0000000009','00009','00009','00009','00009','00009','agmail.com','TT009','CD','ND009','',''),
		  ('DK010',N'Nguyễn Bảo Nhi','2002',N'10 Phan Văn Nghị','0000000010','0000000010','00010','00010','00010','00010','00010','agmail.com','TT010','CD','ND010','',''),
		  ('DK011',N'Trần Tô Lâm','2002',N'11 Thanh Sơn','0000000011','0000000011','00011','00011','00011','00011','00011','agmail.com','TT011','CD','ND001','',''),
		  ('DK012',N'Lê Bảo Nhi','2002',N'12 Lê Đình Dương','0000000012','0000000012','00012','00012','00012','00012','00012','agmail.com','TT012','KD','ND002','',''),
		  ('DK013',N'Hoàng Tấn Lực','2002',N'13 Lê Hồng Phong','0000000013','0000000013','00013','00013','00013','00013','00013','agmail.com','TT013','KD','ND003','',''),
		  ('DK014',N'Võ Đình Tấn','2002',N'14 Nguyễn Trãi','0000000014','0000000014','00014','00014','00014','00014','00014','agmail.com','TT014','KD','ND004','',''),
		  ('DK015',N'Bùi Văn Hoàng','2002',N'15 Hoàng Thị Loan','0000000015','0000000015','00015','00015','00015','00015','00015','agmail.com','TT015','KD','ND005','','')

go
create or alter function getIdDangKiNext
(
)
returns char(5)
as
begin
	declare @idNextInt int;
	select @idNextInt = max(right(idDangKi,3))+1
	from DangKiBienSo
	declare @idNextChar char(5);
	select @idNextChar = CONCAT('DK',FORMAT(@idNextInt,'D3'))
	return @idNextChar
end
go

create or alter function getIdAccountUserNext
(
)
returns  char (5)
as
begin
	declare @IdNextInt int;
	select @IdNextInt = max(right(idAccount,3))+1
	from Account
	where chucVu = 'User'
	declare @idNextChar char(5);
	select @idNextChar = CONCAT('ND',FORMAT(@idNextInt,'D3'))
	return @idNextChar
end

go
create or alter function getIdAccountAdNext
(
)
returns  char (5)
as
begin
	declare @IdNextInt int;
	select @IdNextInt = max(right(idAccount,3))+1
	from Account
	where chucVu = 'Admin'
	declare @idNextChar char(5);
	select @idNextChar = CONCAT('AD',FORMAT(@idNextInt,'D3'))
	return @idNextChar
end
go
create or alter function getIdThongTinXeNext
(
)
returns  char (5)
as
begin
	declare @IdNextInt int;
	select @IdNextInt = max(right(idThongTinXe,3))+1
	from ThongTinXe
	declare @idNextChar char(5);
	select @idNextChar = CONCAT('TT',FORMAT(@idNextInt,'D3'))
	return @idNextChar
end

go
--select dbo.getIdAccountAdNext()