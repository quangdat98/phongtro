USE [master]
GO
/****** Object:  Database [PhongTro]    Script Date: 4/6/2020 2:56:49 PM ******/
CREATE DATABASE [PhongTro]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'PhongTro', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\PhongTro.mdf' , SIZE = 3136KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'PhongTro_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\PhongTro_log.ldf' , SIZE = 832KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [PhongTro] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [PhongTro].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [PhongTro] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [PhongTro] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [PhongTro] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [PhongTro] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [PhongTro] SET ARITHABORT OFF 
GO
ALTER DATABASE [PhongTro] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [PhongTro] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [PhongTro] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [PhongTro] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [PhongTro] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [PhongTro] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [PhongTro] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [PhongTro] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [PhongTro] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [PhongTro] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [PhongTro] SET  ENABLE_BROKER 
GO
ALTER DATABASE [PhongTro] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [PhongTro] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [PhongTro] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [PhongTro] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [PhongTro] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [PhongTro] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [PhongTro] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [PhongTro] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [PhongTro] SET  MULTI_USER 
GO
ALTER DATABASE [PhongTro] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [PhongTro] SET DB_CHAINING OFF 
GO
ALTER DATABASE [PhongTro] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [PhongTro] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [PhongTro]
GO
/****** Object:  Table [dbo].[datphong]    Script Date: 4/6/2020 2:56:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[datphong](
	[MaDP] [int] IDENTITY(1,1) NOT NULL,
	[ThoiGianTaoHD] [date] NOT NULL,
	[MaKH] [int] NOT NULL,
	[MaPhong] [int] NOT NULL,
	[ChiTiet] [nvarchar](255) NOT NULL,
	[NoiDung] [nvarchar](max) NOT NULL,
	[TongTien] [float] NOT NULL,
	[ThoiGian] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[khachhang]    Script Date: 4/6/2020 2:56:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[khachhang](
	[MaKH] [int] IDENTITY(1,1) NOT NULL,
	[HoTen] [nvarchar](255) NOT NULL,
	[SDT] [varchar](255) NULL,
	[Email] [varchar](255) NULL,
	[DiaChi] [nvarchar](255) NULL,
	[Pass] [varchar](50) NOT NULL,
	[GhiChu] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[loaiphong]    Script Date: 4/6/2020 2:56:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[loaiphong](
	[MaLoaiPhong] [int] IDENTITY(1,1) NOT NULL,
	[TenLoaiPhong] [nvarchar](255) NOT NULL,
	[MoTa] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLoaiPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[nguoiquantri]    Script Date: 4/6/2020 2:56:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[nguoiquantri](
	[MaQT] [int] IDENTITY(1,1) NOT NULL,
	[HoTen] [nvarchar](255) NOT NULL,
	[SDT] [varchar](255) NULL,
	[Email] [varchar](255) NULL,
	[DiaChi] [nvarchar](255) NULL,
	[Pass] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaQT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[phong]    Script Date: 4/6/2020 2:56:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[phong](
	[MaPhong] [int] IDENTITY(1,1) NOT NULL,
	[DiaChi] [nvarchar](255) NOT NULL,
	[MoTa] [nvarchar](255) NULL,
	[DienTich] [varchar](50) NOT NULL,
	[Gia] [float] NOT NULL,
	[anh] [varchar](max) NOT NULL,
	[MaLoaiPhong] [int] NOT NULL,
	[NguoiDang] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tintuc]    Script Date: 4/6/2020 2:56:49 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tintuc](
	[MaTT] [int] IDENTITY(1,1) NOT NULL,
	[TieuDe] [nvarchar](255) NOT NULL,
	[MoTa] [nvarchar](255) NULL,
	[NoiDung] [ntext] NOT NULL,
	[NgayDang] [date] NULL,
	[MaQT] [int] NULL,
	[anh] [varchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaTT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[datphong] ON 

INSERT [dbo].[datphong] ([MaDP], [ThoiGianTaoHD], [MaKH], [MaPhong], [ChiTiet], [NoiDung], [TongTien], [ThoiGian]) VALUES (1, CAST(0xC5400B00 AS Date), 1, 2, N'cho 3 người thuê', N'cho thuê phòng trọ', 7000000, 3)
INSERT [dbo].[datphong] ([MaDP], [ThoiGianTaoHD], [MaKH], [MaPhong], [ChiTiet], [NoiDung], [TongTien], [ThoiGian]) VALUES (8, CAST(0xC6400B00 AS Date), 11, 2, N'thÃªu cho 3 ngÆ°á»i', N'nhÃ  trá» sinh viÃªn', 4000000, 2)
INSERT [dbo].[datphong] ([MaDP], [ThoiGianTaoHD], [MaKH], [MaPhong], [ChiTiet], [NoiDung], [TongTien], [ThoiGian]) VALUES (10, CAST(0xD1400B00 AS Date), 8, 2, N'thÃªu cho 3 ngÆ°á»i', N'nhÃ  trá» sinh viÃªn', 4000000, 4)
INSERT [dbo].[datphong] ([MaDP], [ThoiGianTaoHD], [MaKH], [MaPhong], [ChiTiet], [NoiDung], [TongTien], [ThoiGian]) VALUES (11, CAST(0xD1400B00 AS Date), 8, 8, N'thÃªu cho 3 ngÆ°á»i', N'nhÃ  trá» sinh viÃªn', 4000000, 2)
INSERT [dbo].[datphong] ([MaDP], [ThoiGianTaoHD], [MaKH], [MaPhong], [ChiTiet], [NoiDung], [TongTien], [ThoiGian]) VALUES (12, CAST(0xD2400B00 AS Date), 8, 8, N'thÃªu cho 3 ngÆ°á»i', N'nhÃ  trá» sinh viÃªn', 6000002, 2)
SET IDENTITY_INSERT [dbo].[datphong] OFF
SET IDENTITY_INSERT [dbo].[khachhang] ON 

INSERT [dbo].[khachhang] ([MaKH], [HoTen], [SDT], [Email], [DiaChi], [Pass], [GhiChu]) VALUES (1, N'quang dat', N'0325807700', N'dat@gmail.com', N'thai binh', N'123', N'đẹp trai vui tính')
INSERT [dbo].[khachhang] ([MaKH], [HoTen], [SDT], [Email], [DiaChi], [Pass], [GhiChu]) VALUES (8, N'dat123', N'123', N'dat@gmail.com', N'123', N'123', N'1123')
INSERT [dbo].[khachhang] ([MaKH], [HoTen], [SDT], [Email], [DiaChi], [Pass], [GhiChu]) VALUES (9, N'dat123', N'123', N'dat_test', N'123', N'dat_test', N'1123')
INSERT [dbo].[khachhang] ([MaKH], [HoTen], [SDT], [Email], [DiaChi], [Pass], [GhiChu]) VALUES (11, N'quang dat', N'01234567890', N'dat', N'123', N'dat_test', N'1123')
SET IDENTITY_INSERT [dbo].[khachhang] OFF
SET IDENTITY_INSERT [dbo].[loaiphong] ON 

INSERT [dbo].[loaiphong] ([MaLoaiPhong], [TenLoaiPhong], [MoTa]) VALUES (1, N'Sinh Viên', N'Phòng rộng từ 20m2 đến 40m2, phù hợp với từ 3-5 người')
INSERT [dbo].[loaiphong] ([MaLoaiPhong], [TenLoaiPhong], [MoTa]) VALUES (2, N'Hộ Gia Đình', N'Phòng Trên 55m2 cỡ cho hộ gia đình')
INSERT [dbo].[loaiphong] ([MaLoaiPhong], [TenLoaiPhong], [MoTa]) VALUES (3, N'Phòng Nhỏ', N'phù hợp với người ở một mình')
SET IDENTITY_INSERT [dbo].[loaiphong] OFF
SET IDENTITY_INSERT [dbo].[nguoiquantri] ON 

INSERT [dbo].[nguoiquantri] ([MaQT], [HoTen], [SDT], [Email], [DiaChi], [Pass]) VALUES (1, N'datdeptrai', N'0325807700', N'dat@gmail.com', N'hung ha thai binh', N'123')
SET IDENTITY_INSERT [dbo].[nguoiquantri] OFF
SET IDENTITY_INSERT [dbo].[phong] ON 

INSERT [dbo].[phong] ([MaPhong], [DiaChi], [MoTa], [DienTich], [Gia], [anh], [MaLoaiPhong], [NguoiDang]) VALUES (2, N'xuân phương - Nam Từ Liêm', N'Phòng phù hợp với gia đình nhở,học 3-4 người, giao thông thuận tiện', N'30m2', 2500000, N'resources/images/home.png', 1, NULL)
INSERT [dbo].[phong] ([MaPhong], [DiaChi], [MoTa], [DienTich], [Gia], [anh], [MaLoaiPhong], [NguoiDang]) VALUES (3, N'260 cầu giấy', N'phòng lớn thích hợp cho đại gia đình', N'55m2', 6000000, N'resources/images/anhphong3.jpg', 2, NULL)
INSERT [dbo].[phong] ([MaPhong], [DiaChi], [MoTa], [DienTich], [Gia], [anh], [MaLoaiPhong], [NguoiDang]) VALUES (8, N'50m2', N'Phong Lon thuan tien cho giao thong di lai', N'50m2', 3000001, N'resources/images/anhphong2.jpg', 2, NULL)
INSERT [dbo].[phong] ([MaPhong], [DiaChi], [MoTa], [DienTich], [Gia], [anh], [MaLoaiPhong], [NguoiDang]) VALUES (11, N'20m2', N'Phòng sạch sẽ gần trạm xe bus thuận tiện giao thông.', N'20m2', 1500000, N'resources/images/anh5.jpg', 1, N'dat123')
INSERT [dbo].[phong] ([MaPhong], [DiaChi], [MoTa], [DienTich], [Gia], [anh], [MaLoaiPhong], [NguoiDang]) VALUES (12, N'50m2', N'phòng sạch sẽ rộng thoải mái phù hợp với hộ gia đình nhỏ', N'50m2', 3000001, N'resources/images/anh8.jpg', 2, N'dat123')
SET IDENTITY_INSERT [dbo].[phong] OFF
SET IDENTITY_INSERT [dbo].[tintuc] ON 

INSERT [dbo].[tintuc] ([MaTT], [TieuDe], [MoTa], [NoiDung], [NgayDang], [MaQT], [anh]) VALUES (1, N'Rần rần trào lưu khoe phòng được F5 "xinh xỉu":', N'Rần rần trào lưu khoe phòng được F5 "xinh xỉu": Nhìn mà muốn xin một slot ở cùng nhà ngay và luôn', N'Check in ở cà phê sang chảnh, nhà hàng đắt đỏ hay resort xa xỉ để chứng tỏ độ "chịu chơi" thì bình thường quá rồi. Năm 2020, muốn ghi điểm tuyệt đối phải check in ở... nhà cơ. Nghe thì có vẻ lạ nhưng gần đây, dân tình đang thi nhau khoe ảnh với căn nhà (hoặc phòng trọ) do chính tay họ decor xinh xắn, lung linh chẳng kém gì studio hay quán cà phê.  Một không gian sống xinh đẹp thể hiện rất nhiều về chủ nhân đấy nhé. Nó chứng tỏ bạn là người có gu thẩm mỹ lại rất gọn gàng, ngăn nắp và khéo tay, chịu khó. Vậy nên, chỉ cần khoe một căn phòng siêu ấm cúng thì ai mà chẳng muốn cùng bạn "Netflix and chill" trong ngày cuối tuần!  Nhìn loạt ảnh dưới đây để được truyền cảm hứng và lên plan để "biến hình" cho phòng của mình ngay đi!', CAST(0xDE400B00 AS Date), 1, N'resources/images/home.png')
INSERT [dbo].[tintuc] ([MaTT], [TieuDe], [MoTa], [NoiDung], [NgayDang], [MaQT], [anh]) VALUES (8, N'Mất bạn thân chỉ vì rủ về ở cùng phòng trọ', N'Mất bạn thân chỉ vì rủ về ở cùng phòng trọ: Ai sống xa nhà thì nhớ khắc cốt ghi tâm điều này!', N'Sống xa gia đình, không có được sự chăm sóc của cha mẹ, học tập ở những thành phố lớn, khiến các cô cậu sinh viên phải cố gắng và cạnh tranh nhiều hơn. Cũng vì ở một môi trường xa lạ, nhiều bạn sinh viên có xu hướng rủ nhau "về chung một nhà", để có thể bên nhau gần hơn, giữ lửa tình bạn, đồng thời khi có việc cần thì người quen còn tốt hơn người xa lạ.  Nhưng có được bạn rồi đã khó, giữ được tình bạn lại càng khó hơn. Không ít trường hợp sinh viên lên mạng xã hội tâm sự, kêu ca vì những người bạn cùng phòng từ bạn thành thù vì ở chung phòng trọ. Sự khác nhau về phong cách sống, những điều nhỏ nhất trong sinh hoạt hàng ngày khiến không ít người mất bạn sau khi ở chung phòng trọ. Bạn cùng phòng nghiện Facebook, mang người yêu về ngủ qua đêm, ở bẩn… là những nguyên nhân khiến cả hai từ thân thiết có thể "trở mặt" sau một thời gian sống chung.', CAST(0xDE400B00 AS Date), 1, N'resources/images/anhphong1.jpg')
SET IDENTITY_INSERT [dbo].[tintuc] OFF
ALTER TABLE [dbo].[datphong]  WITH CHECK ADD  CONSTRAINT [MaKH] FOREIGN KEY([MaKH])
REFERENCES [dbo].[khachhang] ([MaKH])
GO
ALTER TABLE [dbo].[datphong] CHECK CONSTRAINT [MaKH]
GO
ALTER TABLE [dbo].[datphong]  WITH CHECK ADD  CONSTRAINT [MaPhong] FOREIGN KEY([MaPhong])
REFERENCES [dbo].[phong] ([MaPhong])
GO
ALTER TABLE [dbo].[datphong] CHECK CONSTRAINT [MaPhong]
GO
ALTER TABLE [dbo].[phong]  WITH CHECK ADD  CONSTRAINT [MaLoaiPhong] FOREIGN KEY([MaLoaiPhong])
REFERENCES [dbo].[loaiphong] ([MaLoaiPhong])
GO
ALTER TABLE [dbo].[phong] CHECK CONSTRAINT [MaLoaiPhong]
GO
ALTER TABLE [dbo].[tintuc]  WITH CHECK ADD  CONSTRAINT [MaQT] FOREIGN KEY([MaQT])
REFERENCES [dbo].[nguoiquantri] ([MaQT])
GO
ALTER TABLE [dbo].[tintuc] CHECK CONSTRAINT [MaQT]
GO
USE [master]
GO
ALTER DATABASE [PhongTro] SET  READ_WRITE 
GO
