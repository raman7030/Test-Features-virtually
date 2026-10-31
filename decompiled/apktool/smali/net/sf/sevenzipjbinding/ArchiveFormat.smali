.class public final enum Lnet/sf/sevenzipjbinding/ArchiveFormat;
.super Ljava/lang/Enum;
.source "ArchiveFormat.java"


# static fields
.field public static final synthetic $VALUES:[Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum APFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum APM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum AR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum ARJ:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum AVB:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum BASE64:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum BZIP2:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum CAB:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum CHM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum COMPOUND:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum CPIO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum CRAMFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum DMG:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum ELF:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum EXT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum FAT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum FLV:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum GPT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum GZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum HFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum HXS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum IHEX:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum ISO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum LP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum LVM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum LZH:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum LZMA:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum LZMA86:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum MACHO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum MBR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum MSLZ:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum MUB:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum NSIS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum NTFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum PE:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum PPMD:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum QCOW:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum RAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum RAR5:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum RPM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum SEVEN_ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum SPARSE:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum SPLIT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum SQUASHFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum SWF:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum SWFC:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum TAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum TE:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum UDF:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum UEFI:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum VDI:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum VHD:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum VHDX:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum VMDK:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum WIM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum XAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum XZ:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum Z:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum ZSTD:Lnet/sf/sevenzipjbinding/ArchiveFormat;


# instance fields
.field public codecIndex:I

.field public methodName:Ljava/lang/String;

.field public outArchiveImplementation:Ljava/lang/Class;

.field public supportMultipleFiles:Z


# direct methods
.method public static synthetic $values()[Lnet/sf/sevenzipjbinding/ArchiveFormat;
    .locals 3

    const/16 v0, 0x3c

    new-array v0, v0, [Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 409
    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->TAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SPLIT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->RAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->RAR5:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LZMA:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ISO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->HFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->GZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->CPIO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->BZIP2:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SEVEN_ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->Z:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ARJ:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->CAB:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LZH:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->CHM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->NSIS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->AR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->RPM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->UDF:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->WIM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->XAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->FAT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->NTFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->XZ:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->PPMD:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LZMA86:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->HXS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ZSTD:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->APFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->APM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->BASE64:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->COMPOUND:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->CRAMFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x22

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->DMG:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x23

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ELF:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x24

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->EXT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x25

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->FLV:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x26

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->GPT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x27

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->IHEX:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x28

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x29

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->MACHO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->MBR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->MSLZ:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->MUB:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->PE:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->QCOW:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SPARSE:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x30

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SQUASHFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x31

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SWF:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x32

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SWFC:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x33

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->UEFI:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x34

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->TE:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x35

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->VDI:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x36

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->VHD:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x37

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->VHDX:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x38

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->VMDK:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x39

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->AVB:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    sget-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LVM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v2, 0x3b

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 17

    .line 413
    new-instance v6, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-class v4, Ll/ܶ᩺᩵;

    const/4 v5, 0x1

    const-string v1, "ZIP"

    const/4 v2, 0x0

    const-string v3, "Zip"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    sput-object v6, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 418
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-class v11, Ll/۠᩺᩵;

    const/4 v12, 0x1

    const-string v8, "TAR"

    const/4 v9, 0x1

    const-string v10, "Tar"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->TAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 423
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "SPLIT"

    const/4 v2, 0x2

    const-string v3, "Split"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SPLIT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 428
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v1, 0x3

    const-string v2, "Rar"

    const-string v3, "RAR"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->RAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 433
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v1, 0x4

    const-string v2, "Rar5"

    const-string v3, "RAR5"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->RAR5:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 438
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "LZMA"

    const/4 v2, 0x5

    const-string v3, "Lzma"

    const/4 v5, 0x0

    invoke-direct {v0, v1, v2, v3, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LZMA:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 443
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v1, 0x6

    const-string v2, "Iso"

    const-string v3, "ISO"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ISO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 448
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "HFS"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->HFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 453
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-class v10, Ll/֨᩺᩵;

    const/16 v16, 0x0

    const-string v7, "GZIP"

    const/16 v8, 0x8

    const-string v9, "GZip"

    move-object v6, v0

    move/from16 v11, v16

    invoke-direct/range {v6 .. v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->GZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 458
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x9

    const-string v2, "Cpio"

    const-string v3, "CPIO"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->CPIO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 463
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-class v15, Ll/ۚ᩺᩵;

    const-string v12, "BZIP2"

    const/16 v13, 0xa

    const-string v14, "BZip2"

    move-object v11, v0

    invoke-direct/range {v11 .. v16}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->BZIP2:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 468
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-class v10, Ll/֡᩺᩵;

    const/4 v11, 0x1

    const-string v7, "SEVEN_ZIP"

    const/16 v8, 0xb

    const-string v9, "7z"

    move-object v6, v0

    invoke-direct/range {v6 .. v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SEVEN_ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 473
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "Z"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2, v1, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->Z:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 478
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0xd

    const-string v2, "Arj"

    const-string v3, "ARJ"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ARJ:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 483
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0xe

    const-string v2, "Cab"

    const-string v3, "CAB"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->CAB:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 488
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0xf

    const-string v2, "Lzh"

    const-string v3, "LZH"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LZH:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 493
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x10

    const-string v2, "Chm"

    const-string v3, "CHM"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->CHM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 498
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x11

    const-string v2, "Nsis"

    const-string v3, "NSIS"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->NSIS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 503
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x12

    const-string v2, "Ar"

    const-string v3, "AR"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->AR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 508
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x13

    const-string v2, "Rpm"

    const-string v3, "RPM"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->RPM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 513
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x14

    const-string v2, "Udf"

    const-string v3, "UDF"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->UDF:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 518
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x15

    const-string v2, "Wim"

    const-string v3, "WIM"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->WIM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 523
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x16

    const-string v2, "Xar"

    const-string v3, "XAR"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->XAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 528
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x17

    const-string v2, "fat"

    const-string v3, "FAT"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->FAT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 533
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x18

    const-string v2, "ntfs"

    const-string v3, "NTFS"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->NTFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 538
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x19

    const-string v2, "xz"

    const-string v3, "XZ"

    invoke-direct {v0, v3, v1, v2, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->XZ:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 543
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x1a

    const-string v2, "Ppmd"

    const-string v3, "PPMD"

    invoke-direct {v0, v3, v1, v2, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->PPMD:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 548
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x1b

    const-string v2, "lzma86"

    const-string v3, "LZMA86"

    invoke-direct {v0, v3, v1, v2, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LZMA86:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 553
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x1c

    const-string v2, "Hxs"

    const-string v3, "HXS"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->HXS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 558
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x1d

    const-string v2, "zstd"

    const-string v3, "ZSTD"

    invoke-direct {v0, v3, v1, v2, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ZSTD:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 563
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "APFS"

    const/16 v2, 0x1e

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->APFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 568
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "APM"

    const/16 v2, 0x1f

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->APM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 573
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x20

    const-string v2, "Base64"

    const-string v3, "BASE64"

    invoke-direct {v0, v3, v1, v2, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->BASE64:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 578
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x21

    const-string v2, "Compound"

    const-string v3, "COMPOUND"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->COMPOUND:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 583
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x22

    const-string v2, "CramFS"

    const-string v3, "CRAMFS"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->CRAMFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 588
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x23

    const-string v2, "Dmg"

    const-string v3, "DMG"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->DMG:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 593
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "ELF"

    const/16 v2, 0x24

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ELF:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 598
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x25

    const-string v2, "Ext"

    const-string v3, "EXT"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->EXT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 603
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "FLV"

    const/16 v2, 0x26

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->FLV:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 608
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "GPT"

    const/16 v2, 0x27

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->GPT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 613
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x28

    const-string v2, "IHex"

    const-string v3, "IHEX"

    invoke-direct {v0, v3, v1, v2, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->IHEX:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 618
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "LP"

    const/16 v2, 0x29

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 623
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x2a

    const-string v2, "MachO"

    const-string v3, "MACHO"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->MACHO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 628
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "MBR"

    const/16 v2, 0x2b

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->MBR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 633
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x2c

    const-string v2, "MsLZ"

    const-string v3, "MSLZ"

    invoke-direct {v0, v3, v1, v2, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->MSLZ:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 638
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x2d

    const-string v2, "Mub"

    const-string v3, "MUB"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->MUB:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 643
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "PE"

    const/16 v2, 0x2e

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->PE:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 648
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "QCOW"

    const/16 v2, 0x2f

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->QCOW:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 653
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x30

    const-string v2, "Sparse"

    const-string v3, "SPARSE"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SPARSE:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 658
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x31

    const-string v2, "SquashFS"

    const-string v3, "SQUASHFS"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SQUASHFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 663
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "SWF"

    const/16 v2, 0x32

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SWF:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 668
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x33

    const-string v2, "SWFc"

    const-string v3, "SWFC"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SWFC:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 673
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v1, 0x34

    const-string v2, "UEFIc"

    const-string v3, "UEFI"

    invoke-direct {v0, v3, v1, v2, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->UEFI:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 678
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "TE"

    const/16 v2, 0x35

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->TE:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 683
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "VDI"

    const/16 v2, 0x36

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->VDI:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 688
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "VHD"

    const/16 v2, 0x37

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->VHD:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 693
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "VHDX"

    const/16 v2, 0x38

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->VHDX:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 698
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "VMDK"

    const/16 v2, 0x39

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->VMDK:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 703
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "AVB"

    const/16 v2, 0x3a

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->AVB:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 708
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v1, "LVM"

    const/16 v2, 0x3b

    invoke-direct {v0, v1, v2, v1, v4}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LVM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 409
    invoke-static {}, Lnet/sf/sevenzipjbinding/ArchiveFormat;->$values()[Lnet/sf/sevenzipjbinding/ArchiveFormat;

    move-result-object v0

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->$VALUES:[Lnet/sf/sevenzipjbinding/ArchiveFormat;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V
    .locals 0

    .line 728
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const/4 p1, -0x2

    .line 716
    iput p1, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->codecIndex:I

    .line 729
    iput-object p3, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->methodName:Ljava/lang/String;

    .line 730
    iput-object p4, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->outArchiveImplementation:Ljava/lang/Class;

    .line 731
    iput-boolean p5, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->supportMultipleFiles:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v5, p4

    .line 724
    invoke-direct/range {v0 .. v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    return-void
.end method

.method public static findOutArchiveImplementationToInterface(Ljava/lang/Class;)Lnet/sf/sevenzipjbinding/ArchiveFormat;
    .locals 5

    .line 796
    invoke-static {}, Lnet/sf/sevenzipjbinding/ArchiveFormat;->values()[Lnet/sf/sevenzipjbinding/ArchiveFormat;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 797
    invoke-virtual {v3}, Lnet/sf/sevenzipjbinding/ArchiveFormat;->getOutArchiveImplementation()Ljava/lang/Class;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 798
    invoke-virtual {p0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 802
    :cond_1
    new-instance p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "Can\'t determine corresponding archive format to the interface IOutArchive."

    .line 803
    invoke-direct {p0, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/ArchiveFormat;
    .locals 1

    .line 409
    const-class v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    return-object p0
.end method

.method public static values()[Lnet/sf/sevenzipjbinding/ArchiveFormat;
    .locals 1

    .line 409
    sget-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->$VALUES:[Lnet/sf/sevenzipjbinding/ArchiveFormat;

    invoke-virtual {v0}, [Lnet/sf/sevenzipjbinding/ArchiveFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/sf/sevenzipjbinding/ArchiveFormat;

    return-object v0
.end method


# virtual methods
.method public getMethodName()Ljava/lang/String;
    .locals 1

    .line 740
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->methodName:Ljava/lang/String;

    return-object v0
.end method

.method public getOutArchiveImplementation()Ljava/lang/Class;
    .locals 1

    .line 759
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->outArchiveImplementation:Ljava/lang/Class;

    return-object v0
.end method

.method public isOutArchiveSupported()Z
    .locals 1

    .line 750
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->outArchiveImplementation:Ljava/lang/Class;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public supportMultipleFiles()Z
    .locals 1

    .line 769
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->supportMultipleFiles:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 777
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->methodName:Ljava/lang/String;

    return-object v0
.end method
