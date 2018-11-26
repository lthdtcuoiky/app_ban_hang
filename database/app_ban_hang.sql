-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 25, 2018 lúc 02:52 PM
-- Phiên bản máy phục vụ: 10.1.36-MariaDB
-- Phiên bản PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `app_ban_hang`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoa_don`
--

CREATE TABLE `hoa_don` (
  `stt` int(11) NOT NULL,
  `ma_hoa_don` int(255) NOT NULL,
  `khach_hang` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `nhan_vien` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ngay_lap_hoa_don` date NOT NULL,
  `tong_tien` int(11) NOT NULL,
  `chu_thich` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `ma_khach_hang` int(11) NOT NULL,
  `ma_san_pham` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khach_hang`
--

CREATE TABLE `khach_hang` (
  `stt` int(11) NOT NULL,
  `ma_khach_hang` int(11) NOT NULL,
  `ten_khach_hang` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ngay_sinh` date NOT NULL,
  `gioi_tinh` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `dia_chi` varchar(128) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `ma_nhan_vien` int(11) NOT NULL,
  `chu_thich` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhan_vien`
--

CREATE TABLE `nhan_vien` (
  `stt` int(11) NOT NULL,
  `ma_nhan_vien` int(11) NOT NULL,
  `ten_nhan_vien` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ngay_sinh` date NOT NULL,
  `gioi_tinh` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `ngay_vao_lam` date NOT NULL,
  `chuc_vu` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `dia_chi` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `so_dien_thoai` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `chu_thich` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhan_vien`
--

INSERT INTO `nhan_vien` (`stt`, `ma_nhan_vien`, `ten_nhan_vien`, `ngay_sinh`, `gioi_tinh`, `ngay_vao_lam`, `chuc_vu`, `dia_chi`, `so_dien_thoai`, `chu_thich`) VALUES
(1, 1, 'Hoàng Thế Long', '1998-02-20', 'nam', '2018-01-20', 'nhân viên', 'Hà Nội', '637891273', 'nhân viên mới'),
(2, 2, 'Nguyễn Trọng Hoàng', '1999-11-10', 'nam', '2016-03-20', 'quản lý nhân viên', 'Hà Nội', '631344443', 'quản lý'),
(3, 3, 'Chu Thanh Thủy', '1999-12-22', 'nữ', '2017-11-12', 'nhân viên', 'Hà Nội', '637831111', 'nhân viên mới'),
(4, 4, 'Cao Thanh Huyền', '1998-08-07', 'nữ', '2017-12-10', 'nhân viên', 'Hà Nội', '213311145', 'nhân viên mới');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `san_pham`
--

CREATE TABLE `san_pham` (
  `ma_san_pham` int(255) NOT NULL,
  `ton_kho` int(11) NOT NULL,
  `ten_san_pham` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `gia_nhap` int(11) NOT NULL,
  `gia_ban` int(11) NOT NULL,
  `chu_thich` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `hinh_anh` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `san_pham`
--

INSERT INTO `san_pham` (`ma_san_pham`, `ton_kho`, `ten_san_pham`, `gia_nhap`, `gia_ban`, `chu_thich`, `hinh_anh`) VALUES
(1, 100, 'pizza', 25000, 35000, 'mua 2 tặng 1', 'https://www.cicis.com/media/1176/pizza_trad_pepperonibeef.png'),
(2, 150, 'hamburger', 35000, 55000, 'tặng nước uống', 'http://www.monngon.tv/uploads/images/2017/06/26/7210c4294d10ad2375fccf9e305f86fa-lam-banh-hamburger-sl.jpg'),
(3, 100, 'kimbap nướng', 15000, 25000, 'mua 3 tặng 1', 'https://cdn.tgdd.vn/Files/2015/10/05/714934/cach-lam-banh-gimbap-nuong-kimbap-nuong-9-760x367.jpg'),
(4, 90, 'capuchino', 25000, 35000, 'giảm giá', 'https://media.cooky.vn/recipe/g3/24169/s800x500/recipe-cover-r24169.jpg'),
(5, 50, 'tacos với hành lá đậu phộng', 45000, 65000, 'tặng nước uống', 'https://photo-1-baomoi.zadn.vn/w1000_r1/2018/08/27/348/27466581/6_76276.jpg'),
(6, 70, 'bánh mì kẹp cá ngừ baguette', 25000, 30000, 'tặng vé giảm giá', 'http://lambanh365.com/wp-content/uploads/2016/01/lam-banh-mi-kep-ca-ngu-cho-bua-sang-du-chat-7-Copy.jpg'),
(7, 110, 'salad tôm ướp dưa chuột', 100000, 120000, 'mua 2 tặng 1', 'https://www.cicis.com/media/1176/pizza_trad_pepper'),
(8, 120, 'bánh mì hội an', 25000, 35000, 'mua 1 tặng 1', 'https://images.foody.vn/res/g24/235305/prof/s576x330/foody-mobile-bre-jpg-688-635986711199449027.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `san_pham_da_ban`
--

CREATE TABLE `san_pham_da_ban` (
  `ma_san_pham` int(11) NOT NULL,
  `ma_hoa_don` int(11) NOT NULL,
  `ten_san_pham` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `so_luong_da_ban` int(11) NOT NULL,
  `gia_ban` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tai_khoan`
--

CREATE TABLE `tai_khoan` (
  `stt` int(11) NOT NULL,
  `id` int(255) NOT NULL,
  `ma_nhan_vien` int(11) NOT NULL,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `quyen` int(15) NOT NULL,
  `chu_thich` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `ten_nhan_vien` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tai_khoan`
--

INSERT INTO `tai_khoan` (`stt`, `id`, `ma_nhan_vien`, `username`, `quyen`, `chu_thich`, `password`, `ten_nhan_vien`) VALUES
(1, 1, 1, 'admin', 2, 'quản lý', 'admin', 'Duy');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `hoa_don`
--
ALTER TABLE `hoa_don`
  ADD PRIMARY KEY (`ma_hoa_don`),
  ADD KEY `fk_hd` (`ma_khach_hang`),
  ADD KEY `fk_hd1` (`ma_san_pham`);

--
-- Chỉ mục cho bảng `khach_hang`
--
ALTER TABLE `khach_hang`
  ADD PRIMARY KEY (`ma_khach_hang`),
  ADD KEY `fk_hd2` (`ma_nhan_vien`);

--
-- Chỉ mục cho bảng `nhan_vien`
--
ALTER TABLE `nhan_vien`
  ADD PRIMARY KEY (`ma_nhan_vien`);

--
-- Chỉ mục cho bảng `san_pham`
--
ALTER TABLE `san_pham`
  ADD PRIMARY KEY (`ma_san_pham`);
ALTER TABLE `san_pham` ADD FULLTEXT KEY `ten_san_pham` (`ten_san_pham`);

--
-- Chỉ mục cho bảng `san_pham_da_ban`
--
ALTER TABLE `san_pham_da_ban`
  ADD PRIMARY KEY (`ma_san_pham`);

--
-- Chỉ mục cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `hoa_don`
--
ALTER TABLE `hoa_don`
  MODIFY `ma_hoa_don` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `khach_hang`
--
ALTER TABLE `khach_hang`
  MODIFY `ma_khach_hang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT cho bảng `nhan_vien`
--
ALTER TABLE `nhan_vien`
  MODIFY `ma_nhan_vien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT cho bảng `san_pham`
--
ALTER TABLE `san_pham`
  MODIFY `ma_san_pham` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT cho bảng `san_pham_da_ban`
--
ALTER TABLE `san_pham_da_ban`
  MODIFY `ma_san_pham` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
