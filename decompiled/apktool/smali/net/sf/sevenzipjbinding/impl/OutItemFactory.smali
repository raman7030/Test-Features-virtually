.class public Lnet/sf/sevenzipjbinding/impl/OutItemFactory;
.super Ljava/lang/Object;
.source "OutItemFactory.java"


# static fields
.field public static final ZERO:Ljava/lang/Long;


# instance fields
.field public index:I

.field public outArchive:Lnet/sf/sevenzipjbinding/IOutArchive;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 39
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->ZERO:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Lnet/sf/sevenzipjbinding/IOutArchive;I)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->outArchive:Lnet/sf/sevenzipjbinding/IOutArchive;

    .line 45
    iput p2, p0, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->index:I

    return-void
.end method

.method private createOutItemIntern()Lnet/sf/sevenzipjbinding/impl/OutItem;
    .locals 3

    .line 67
    new-instance v0, Lnet/sf/sevenzipjbinding/impl/OutItem;

    iget-object v1, p0, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->outArchive:Lnet/sf/sevenzipjbinding/IOutArchive;

    iget v2, p0, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->index:I

    invoke-direct {v0, v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;-><init>(Lnet/sf/sevenzipjbinding/IOutArchive;I)V

    .line 68
    invoke-direct {p0, v0}, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->fillDefaultValues(Lnet/sf/sevenzipjbinding/impl/OutItem;)V

    return-object v0
.end method

.method private fillDefaultValues(Lnet/sf/sevenzipjbinding/impl/OutItem;)V
    .locals 3

    .line 73
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->outArchive:Lnet/sf/sevenzipjbinding/IOutArchive;

    invoke-interface {v0}, Lnet/sf/sevenzipjbinding/IOutUpdateArchive;->getConnectedInArchive()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    .line 74
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setUpdateOldArchiveItemIndex(Ljava/lang/Integer;)V

    .line 75
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setUpdateIsNewData(Ljava/lang/Boolean;)V

    .line 76
    invoke-virtual {p1, v0}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setUpdateIsNewProperties(Ljava/lang/Boolean;)V

    .line 78
    :cond_0
    sget-object v0, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->ZERO:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setDataSize(Ljava/lang/Long;)V

    .line 79
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v0}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyLastModificationTime(Ljava/util/Date;)V

    .line 81
    sget-object v0, Ll/᩸᩺᩵;->֫:[I

    invoke-virtual {p1}, Lnet/sf/sevenzipjbinding/impl/OutItem;->getArchiveFormat()Lnet/sf/sevenzipjbinding/ArchiveFormat;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 99
    invoke-direct {p0, p1}, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->fillDefaultValuesTar(Lnet/sf/sevenzipjbinding/IOutItemTar;)V

    return-void

    .line 103
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No default values strategy for the archive format \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    invoke-virtual {p1}, Lnet/sf/sevenzipjbinding/impl/OutItem;->getArchiveFormat()Lnet/sf/sevenzipjbinding/ArchiveFormat;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_2
    invoke-direct {p0, p1}, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->fillDefaultValuesGZip(Lnet/sf/sevenzipjbinding/IOutItemGZip;)V

    return-void

    .line 91
    :cond_3
    invoke-direct {p0, p1}, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->fillDefaultValuesBZip2(Lnet/sf/sevenzipjbinding/IOutItemBZip2;)V

    return-void

    .line 87
    :cond_4
    invoke-direct {p0, p1}, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->fillDefaultValuesZip(Lnet/sf/sevenzipjbinding/IOutItemZip;)V

    return-void

    .line 83
    :cond_5
    invoke-direct {p0, p1}, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->fillDefaultValues7z(Lnet/sf/sevenzipjbinding/IOutItem7z;)V

    return-void
.end method

.method private fillDefaultValues7z(Lnet/sf/sevenzipjbinding/IOutItem7z;)V
    .locals 1

    .line 109
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lnet/sf/sevenzipjbinding/IOutItem7z;->setPropertyIsAnti(Ljava/lang/Boolean;)V

    .line 110
    invoke-interface {p1, v0}, Lnet/sf/sevenzipjbinding/IOutItem7z;->setPropertyIsDir(Ljava/lang/Boolean;)V

    const/4 v0, 0x0

    .line 111
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lnet/sf/sevenzipjbinding/IOutItem7z;->setPropertyAttributes(Ljava/lang/Integer;)V

    return-void
.end method

.method private fillDefaultValuesBZip2(Lnet/sf/sevenzipjbinding/IOutItemBZip2;)V
    .locals 0

    return-void
.end method

.method private fillDefaultValuesGZip(Lnet/sf/sevenzipjbinding/IOutItemGZip;)V
    .locals 0

    return-void
.end method

.method private fillDefaultValuesTar(Lnet/sf/sevenzipjbinding/IOutItemTar;)V
    .locals 1

    .line 126
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lnet/sf/sevenzipjbinding/IOutItemTar;->setPropertyIsDir(Ljava/lang/Boolean;)V

    return-void
.end method

.method private fillDefaultValuesZip(Lnet/sf/sevenzipjbinding/IOutItemZip;)V
    .locals 1

    .line 115
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lnet/sf/sevenzipjbinding/IOutItemZip;->setPropertyIsDir(Ljava/lang/Boolean;)V

    const/4 v0, 0x0

    .line 116
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lnet/sf/sevenzipjbinding/IOutItemZip;->setPropertyAttributes(Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public createOutItem()Lnet/sf/sevenzipjbinding/IOutItemBase;
    .locals 1

    .line 63
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->createOutItemIntern()Lnet/sf/sevenzipjbinding/impl/OutItem;

    move-result-object v0

    return-object v0
.end method

.method public createOutItem(I)Lnet/sf/sevenzipjbinding/IOutItemBase;
    .locals 1

    .line 154
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->outArchive:Lnet/sf/sevenzipjbinding/IOutArchive;

    invoke-interface {v0}, Lnet/sf/sevenzipjbinding/IOutUpdateArchive;->getConnectedInArchive()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 159
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->createOutItemIntern()Lnet/sf/sevenzipjbinding/impl/OutItem;

    move-result-object v0

    .line 161
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setUpdateOldArchiveItemIndex(Ljava/lang/Integer;)V

    .line 162
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setUpdateIsNewData(Ljava/lang/Boolean;)V

    .line 163
    invoke-virtual {v0, p1}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setUpdateIsNewProperties(Ljava/lang/Boolean;)V

    return-object v0

    .line 156
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Not an update operation"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public createOutItemAndCloneProperties(I)Lnet/sf/sevenzipjbinding/IOutItemBase;
    .locals 3

    .line 182
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->outArchive:Lnet/sf/sevenzipjbinding/IOutArchive;

    invoke-interface {v0}, Lnet/sf/sevenzipjbinding/IOutUpdateArchive;->getConnectedInArchive()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 187
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->createOutItemIntern()Lnet/sf/sevenzipjbinding/impl/OutItem;

    move-result-object v1

    .line 189
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setUpdateOldArchiveItemIndex(Ljava/lang/Integer;)V

    .line 190
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setUpdateIsNewData(Ljava/lang/Boolean;)V

    .line 191
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setUpdateIsNewProperties(Ljava/lang/Boolean;)V

    .line 193
    sget-object v2, Lnet/sf/sevenzipjbinding/PropID;->PATH:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {v0, p1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyPath(Ljava/lang/String;)V

    .line 195
    sget-object v2, Lnet/sf/sevenzipjbinding/PropID;->ATTRIBUTES:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {v0, p1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyAttributes(Ljava/lang/Integer;)V

    .line 196
    sget-object v2, Lnet/sf/sevenzipjbinding/PropID;->POSIX_ATTRIB:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {v0, p1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyPosixAttributes(Ljava/lang/Integer;)V

    .line 199
    sget-object v2, Lnet/sf/sevenzipjbinding/PropID;->USER:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {v0, p1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyUser(Ljava/lang/String;)V

    .line 200
    sget-object v2, Lnet/sf/sevenzipjbinding/PropID;->GROUP:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {v0, p1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyGroup(Ljava/lang/String;)V

    .line 202
    sget-object v2, Lnet/sf/sevenzipjbinding/PropID;->CREATION_TIME:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {v0, p1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Date;

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyCreationTime(Ljava/util/Date;)V

    .line 203
    sget-object v2, Lnet/sf/sevenzipjbinding/PropID;->LAST_MODIFICATION_TIME:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {v0, p1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Date;

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyLastModificationTime(Ljava/util/Date;)V

    .line 205
    sget-object v2, Lnet/sf/sevenzipjbinding/PropID;->LAST_ACCESS_TIME:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {v0, p1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Date;

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyLastAccessTime(Ljava/util/Date;)V

    .line 208
    sget-object v2, Lnet/sf/sevenzipjbinding/PropID;->IS_ANTI:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {v0, p1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyIsAnti(Ljava/lang/Boolean;)V

    .line 209
    sget-object v2, Lnet/sf/sevenzipjbinding/PropID;->IS_FOLDER:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {v0, p1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v1, p1}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyIsDir(Ljava/lang/Boolean;)V

    return-object v1

    .line 184
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Not an update operation"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
