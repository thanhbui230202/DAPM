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

create table loaiXe(
	idLoaiXe varchar(10) primary key not null, --BANTAI, OTO, MOTO, BUS, ...
	tenLoaixe nvarchar(255),
	ghiChu	nvarchar(255)
);
create table ThongTinXeDangKi(
	idThongTinXe char(5) primary key, --TT001, TT002, ...
	idLoaiXeNo varchar(10),
	mauSon nvarchar(25),
	nhanHieu nvarchar(25),
	soLoai nvarchar(25),
	theLoaiDangKi nvarchar(25),
	liDo nvarchar(255),
		constraint FK_TTXDK_idLoaiXeNo foreign key (idLoaiXeNo) references loaiXe(idLoaiXe)
)
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
		constraint FK_DKBS_idThongTinXeNo foreign key (idThongTinXeNo) references ThongTinXeDangKi(idThongTinXe)
)

go
create or alter function getIdDangKiNext
(
)
returns char(5)
as
begin
	declare @idNextInt int;
	select @idNextInt = max(right(idDangKi,5))+1
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

