use master
go

drop database if exists DA1_NHOM5
go

CREATE DATABASE DA1_NHOM5
GO

USE DA1_NHOM5
GO

CREATE TABLE [NhanVien] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL,
  [Ten] NVARCHAR(255) NOT NULL,
  [GioiTinh] INT DEFAULT 0,
  [NgaySinh] DATE DEFAULT NULL,
  [Sdt] VARCHAR(255) NOT NULL,
  [MatKhau] VARCHAR(255) NOT NULL,
  [Email] VARCHAR(255) UNIQUE NOT NULL,
  [DiaChi] NVARCHAR(255) DEFAULT NULL,
  [_Role] INT DEFAULT 0,
  [TrangThai] INT DEFAULT 0
)
GO

CREATE TABLE [KhachHang] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL,
  [HoTen] NVARCHAR(255) NOT NULL,
  [GioiTinh] INT DEFAULT 0,
  [Sdt] VARCHAR(20) UNIQUE NOT NULL,
  [DiaChi] NVARCHAR(255) DEFAULT NULL,
  [NgaySinh] DATE DEFAULT NULL,
  [LoaiKH] int default 0,
  [TrangThai] INT DEFAULT 0
)
GO

CREATE TABLE [HoaDon] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Id_KH] UNIQUEIDENTIFIER,
  [Id_NV] UNIQUEIDENTIFIER,
  [Ma] VARCHAR(255) UNIQUE,
  [NgayTao] DATE DEFAULT NULL,
  [Sdt_KH] VARCHAR(20) NOT NULL,
  [DiaChi] NVARCHAR(255) DEFAULT NULL,
  [LoaiThanhToan] INT DEFAULT 0,
  [TongTien] decimal(20,0) DEFAULT 0,
  [TinhTrang] INT DEFAULT 0
)
GO

CREATE TABLE [NhaCungCap] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL,
  [Ten] NVARCHAR(225) DEFAULT NULL,
  [DiaChi] NVARCHAR(255) DEFAULT NULL,
  [Sdt] NVARCHAR(20) DEFAULT NULL,
  [TrangThai] INT DEFAULT 0
)
GO

CREATE TABLE [SanPham] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL, 
  [Ten] NVARCHAR(255) DEFAULT NULL,
  [TrangThai] INT DEFAULT 0 --> 0 ? Con hang : Het hang ...
)
GO

CREATE TABLE [Loai] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL, 
  [Ten] NVARCHAR(255) DEFAULT NULL,
)
GO

CREATE TABLE [MauSac] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL, 
  [Ten] NVARCHAR(255) DEFAULT NULL,
)
GO


CREATE TABLE [ChiTietSP] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL,
  [Id_ncc] UNIQUEIDENTIFIER,
  [Id_sp] UNIQUEIDENTIFIER,
  [Id_Loai] UNIQUEIDENTIFIER,
  [Id_MauSac] UNIQUEIDENTIFIER,
  [KichCo] INT DEFAULT 0,
  [SoLuong] INT DEFAULT 0,
  [GiaBan] decimal(20,0) DEFAULT 0,
  [UrlAnh] varchar(50) default null,
  [MaQR] varchar(255) default null
)
GO

CREATE TABLE [HoaDonCT] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Id_hd] UNIQUEIDENTIFIER,
  [Id_ctsp] UNIQUEIDENTIFIER,
  [soLuong] INT DEFAULT 0,
  [donGia] decimal(20,0) DEFAULT 0
)
GO

ALTER TABLE [HoaDon] ADD FOREIGN KEY ([Id_NV]) REFERENCES [NhanVien] ([Id])
GO

ALTER TABLE [HoaDon] ADD FOREIGN KEY ([Id_KH]) REFERENCES [KhachHang] ([Id])
GO

ALTER TABLE [ChiTietSP] ADD FOREIGN KEY ([Id_ncc]) REFERENCES [NhaCungCap] ([Id])
GO

ALTER TABLE [ChiTietSP] ADD FOREIGN KEY ([Id_sp]) REFERENCES [SanPham] ([Id])
GO

ALTER TABLE [ChiTietSP] ADD FOREIGN KEY ([Id_Loai]) REFERENCES [Loai] ([Id])
GO

ALTER TABLE [ChiTietSP] ADD FOREIGN KEY ([Id_MauSac]) REFERENCES [MauSac] ([Id])
GO

ALTER TABLE [HoaDonCT] ADD FOREIGN KEY ([Id_ctsp]) REFERENCES [ChiTietSP] ([Id])
GO

ALTER TABLE [HoaDonCT] ADD FOREIGN KEY ([Id_hd]) REFERENCES [HoaDon] ([Id])
GO



select * from KhachHang
select * from NhanVien
select * from HoaDon h 

select * FROM HoaDon 
select * from ChiTietSP
select * from HoaDon

select * from ChiTietSP


select * from NhaCungCap
select * from SanPham
select * from Loai
select * from MauSac
select * from ChiTietSP



select * from HoaDonCT

select * FROM HoaDon 
select * from HoaDonCT 

go




insert into NhanVien(Ma, Ten, GioiTinh, NgaySinh, Sdt, MatKhau, Email, DiaChi, _Role, TrangThai)
values ('Qly',N'Quản Lý',0,'2003/10/18','0963707163','QuanLy','QuanLy@gmail.com',N'Vân Canh - Hà Nội',0,0),
('NhanVien',N'Nhân Viên',1,'2003/10/18','0963707163','NhanVien','NhanVien@gmail.com',N'Vân Canh - Hà Nội',1,1)

insert into NhanVien(Ma, Ten, GioiTinh, NgaySinh, CCCD, Sdt, MatKhau, Email, DiaChi, _Role, TrangThai)
values ('Qly',N'Quản Lý',0,'2003/10/18','352700998877','0963707163','QuanLy','QuanLy@gmail.com',N'Vân Canh - Hà Nội',0,0),
('NhanVien',N'Nhân Viên',1,'2003/10/18','352711223344','0963707163','NhanVien','NhanVien@gmail.com',N'Vân Canh - Hà Nội',1,1)
go

insert into KhachHang(Ma, HoTen, GioiTinh, Sdt,DiaChi,NgaySinh, TrangThai)
values ('KH1',N'Khách hàng 1',0,'0987654321',N'Hà Nội', '2003/10/18',0),
('KH2',N'Khách hàng 2',1,'0987654322',N'Hà Nội', '2003/10/18',1),
('KH3',N'Khách hàng 3',1,'0987654333',N'Hà Nội', '2003/10/18',0)
go

INSERT INTO NhaCungCap(Ma, Ten, DiaChi, Sdt, TrangThai)
VALUES ('NCC1',N'NHÀ CUNG CẤP 1',N'HÀ NỘI','0987656789',0),
('NCC2',N'NHÀ CUNG CẤP 2',N'HÀ NỘI','0987656789',1)
go

INSERT INTO SanPham(Ma, Ten,TrangThai)
VALUES ('SP1',N'SẢN PHẨM 1',0),
('SP2',N'SẢN PHẨM 2',1)
go
INSERT INTO HoaDon(Id_KH, Id_NV, Ma, NgayTao,Sdt_KH,DiaChi,LoaiThanhToan,TongTien,TinhTrang)
VALUES ('8E8CC3BD-2489-409D-AA0E-5087CD2A0CC6','7299470F-5C7A-4C7E-BE1D-2638119983FC','HD1','2022/11/29','0987654321',N'HÀ NỘI',0,10000,0),
('8E8CC3BD-2489-409D-AA0E-5087CD2A0CC6','23001D6C-287F-4E5D-884D-501137444068','HD2','2022/11/29','0987654321',N'HÀ NỘI',1,150000,1),
('C9230C9A-0AF0-49DD-B4D7-FD6339BA6F22','244EC22B-CEDB-4480-AB5F-50A9BBD1D7C8','HD3','2022/11/29','0987654321',N'HÀ NỘI',2,NULL,2)
go

insert into HoaDon(Ma, Id_KH, Id_NV, NgayTao, Sdt_KH, LoaiThanhToan, TinhTrang)
values('HD20221209100652907','765730A9-2A05-E24A-B9B0-502D573E6C6B','E9FCB8D8-AEDD-4092-8FD0-A64B2475B8C7','2022-12-09','0963708456',0,1)


--insert into HoaDonCT(Id_hd,Id_ctsp,donGia,soLuong)
--values('4A66071D-3C4A-4A5B-8615-A27F57D94DD7','9E497C35-9DEA-43FD-8921-41ECEF5FEAB5',150000,10),
--('4C78D128-3BA7-491A-B1EF-6B24E8CFC5F6','9E497C35-9DEA-43FD-8921-41ECEF5FEAB5',120000,15)
--go
