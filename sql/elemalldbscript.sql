USE [master]
GO
/****** Object:  Database [elemalldb]    Script Date: 2019/5/18 15:19:31 ******/
CREATE DATABASE [elemalldb]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'elemalldb', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\elemalldb.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'elemalldb_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\elemalldb_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [elemalldb] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [elemalldb].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [elemalldb] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [elemalldb] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [elemalldb] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [elemalldb] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [elemalldb] SET ARITHABORT OFF 
GO
ALTER DATABASE [elemalldb] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [elemalldb] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [elemalldb] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [elemalldb] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [elemalldb] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [elemalldb] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [elemalldb] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [elemalldb] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [elemalldb] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [elemalldb] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [elemalldb] SET  DISABLE_BROKER 
GO
ALTER DATABASE [elemalldb] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [elemalldb] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [elemalldb] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [elemalldb] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [elemalldb] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [elemalldb] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [elemalldb] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [elemalldb] SET RECOVERY FULL 
GO
ALTER DATABASE [elemalldb] SET  MULTI_USER 
GO
ALTER DATABASE [elemalldb] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [elemalldb] SET DB_CHAINING OFF 
GO
ALTER DATABASE [elemalldb] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [elemalldb] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [elemalldb]
GO
/****** Object:  Table [dbo].[customer_login]    Script Date: 2019/5/18 15:19:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[customer_login](
	[customer_id] [varchar](50) NOT NULL,
	[mobile_phone] [varchar](20) NOT NULL,
	[login_name] [varchar](20) NOT NULL,
	[login_pwd] [varchar](100) NOT NULL,
	[identity_card_type] [int] NULL,
	[identity_card_no] [varchar](20) NULL,
	[user_status] [int] NULL,
	[create_time] [datetime] NULL,
	[modified_time] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[customer_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[customer_login] ([customer_id], [mobile_phone], [login_name], [login_pwd], [identity_card_type], [identity_card_no], [user_status], [create_time], [modified_time]) VALUES (N'8fe6086086024ed88c37a6cfa988a664', N'15009189102', N'niklaus', N'c4b8ce1b67d38aa98345f108f9f529ca', 1, NULL, 1, CAST(0x0000AA4E00004C54 AS DateTime), CAST(0x0000AA4E00004C54 AS DateTime))
INSERT [dbo].[customer_login] ([customer_id], [mobile_phone], [login_name], [login_pwd], [identity_card_type], [identity_card_no], [user_status], [create_time], [modified_time]) VALUES (N'd5cf71e192234c3da4496b4351c15818', N'15009189103', N'admin', N'c4b8ce1b67d38aa98345f108f9f529ca', 1, NULL, 1, CAST(0x0000AA4D018B60EF AS DateTime), CAST(0x0000AA4D018B60EF AS DateTime))
ALTER TABLE [dbo].[customer_login] ADD  DEFAULT ((1)) FOR [identity_card_type]
GO
ALTER TABLE [dbo].[customer_login] ADD  DEFAULT ((1)) FOR [user_status]
GO
ALTER TABLE [dbo].[customer_login] ADD  DEFAULT (getdate()) FOR [create_time]
GO
ALTER TABLE [dbo].[customer_login] ADD  DEFAULT (getdate()) FOR [modified_time]
GO
USE [master]
GO
ALTER DATABASE [elemalldb] SET  READ_WRITE 
GO
