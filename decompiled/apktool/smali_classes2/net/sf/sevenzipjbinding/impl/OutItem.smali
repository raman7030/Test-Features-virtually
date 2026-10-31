.class public final Lnet/sf/sevenzipjbinding/impl/OutItem;
.super Ljava/lang/Object;
.source "OutItem.java"

# interfaces
.implements Lnet/sf/sevenzipjbinding/IOutItemAllFormats;


# instance fields
.field public dataSize:Ljava/lang/Long;

.field public index:I

.field public outArchive:Lnet/sf/sevenzipjbinding/IOutArchive;

.field public propertyAttributes:Ljava/lang/Integer;

.field public propertyCreationTime:Ljava/util/Date;

.field public propertyGroup:Ljava/lang/String;

.field public propertyHardLink:Ljava/lang/String;

.field public propertyIsAnti:Ljava/lang/Boolean;

.field public propertyIsDir:Ljava/lang/Boolean;

.field public propertyLastAccessTime:Ljava/util/Date;

.field public propertyLastModificationTime:Ljava/util/Date;

.field public propertyPath:Ljava/lang/String;

.field public propertyPosixAttributes:Ljava/lang/Integer;

.field public propertySymLink:Ljava/lang/String;

.field public propertyUser:Ljava/lang/String;

.field public updateIsNewData:Ljava/lang/Boolean;

.field public updateIsNewProperties:Ljava/lang/Boolean;

.field public updateOldArchiveItemIndex:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lnet/sf/sevenzipjbinding/IOutArchive;I)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->outArchive:Lnet/sf/sevenzipjbinding/IOutArchive;

    .line 59
    iput p2, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->index:I

    return-void
.end method


# virtual methods
.method public getArchiveFormat()Lnet/sf/sevenzipjbinding/ArchiveFormat;
    .locals 1

    .line 77
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->outArchive:Lnet/sf/sevenzipjbinding/IOutArchive;

    invoke-interface {v0}, Lnet/sf/sevenzipjbinding/IOutCreateArchive;->getArchiveFormat()Lnet/sf/sevenzipjbinding/ArchiveFormat;

    move-result-object v0

    return-object v0
.end method

.method public getDataSize()Ljava/lang/Long;
    .locals 1

    .line 84
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->dataSize:Ljava/lang/Long;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    .line 66
    iget v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->index:I

    return v0
.end method

.method public getOutArchive()Lnet/sf/sevenzipjbinding/IOutArchive;
    .locals 1

    .line 70
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->outArchive:Lnet/sf/sevenzipjbinding/IOutArchive;

    return-object v0
.end method

.method public getPropertyAttributes()Ljava/lang/Integer;
    .locals 1

    .line 98
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyAttributes:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPropertyCreationTime()Ljava/util/Date;
    .locals 1

    .line 184
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyCreationTime:Ljava/util/Date;

    return-object v0
.end method

.method public getPropertyGroup()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyGroup:Ljava/lang/String;

    return-object v0
.end method

.method public getPropertyHardLink()Ljava/lang/String;
    .locals 1

    .line 240
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyHardLink:Ljava/lang/String;

    return-object v0
.end method

.method public getPropertyIsAnti()Ljava/lang/Boolean;
    .locals 1

    .line 254
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyIsAnti:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getPropertyIsDir()Ljava/lang/Boolean;
    .locals 1

    .line 141
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyIsDir:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getPropertyLastAccessTime()Ljava/util/Date;
    .locals 1

    .line 170
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyLastAccessTime:Ljava/util/Date;

    return-object v0
.end method

.method public getPropertyLastModificationTime()Ljava/util/Date;
    .locals 1

    .line 155
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyLastModificationTime:Ljava/util/Date;

    return-object v0
.end method

.method public getPropertyPath()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyPath:Ljava/lang/String;

    return-object v0
.end method

.method public getPropertyPosixAttributes()Ljava/lang/Integer;
    .locals 1

    .line 112
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyPosixAttributes:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPropertySymLink()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertySymLink:Ljava/lang/String;

    return-object v0
.end method

.method public getPropertyUser()Ljava/lang/String;
    .locals 1

    .line 198
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyUser:Ljava/lang/String;

    return-object v0
.end method

.method public getUpdateIsNewData()Ljava/lang/Boolean;
    .locals 1

    .line 268
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateIsNewData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getUpdateIsNewProperties()Ljava/lang/Boolean;
    .locals 1

    .line 282
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateIsNewProperties:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getUpdateOldArchiveItemIndex()Ljava/lang/Integer;
    .locals 1

    .line 296
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateOldArchiveItemIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public setDataSize(Ljava/lang/Long;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->dataSize:Ljava/lang/Long;

    return-void
.end method

.method public setPropertyAttributes(Ljava/lang/Integer;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyAttributes:Ljava/lang/Integer;

    return-void
.end method

.method public setPropertyCreationTime(Ljava/util/Date;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyCreationTime:Ljava/util/Date;

    return-void
.end method

.method public setPropertyGroup(Ljava/lang/String;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyGroup:Ljava/lang/String;

    return-void
.end method

.method public setPropertyHardLink(Ljava/lang/String;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyHardLink:Ljava/lang/String;

    return-void
.end method

.method public setPropertyIsAnti(Ljava/lang/Boolean;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyIsAnti:Ljava/lang/Boolean;

    return-void
.end method

.method public setPropertyIsDir(Ljava/lang/Boolean;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyIsDir:Ljava/lang/Boolean;

    return-void
.end method

.method public setPropertyLastAccessTime(Ljava/util/Date;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyLastAccessTime:Ljava/util/Date;

    return-void
.end method

.method public setPropertyLastModificationTime(Ljava/util/Date;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyLastModificationTime:Ljava/util/Date;

    return-void
.end method

.method public setPropertyPath(Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyPath:Ljava/lang/String;

    return-void
.end method

.method public setPropertyPosixAttributes(Ljava/lang/Integer;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyPosixAttributes:Ljava/lang/Integer;

    return-void
.end method

.method public setPropertySymLink(Ljava/lang/String;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertySymLink:Ljava/lang/String;

    return-void
.end method

.method public setPropertyUser(Ljava/lang/String;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->propertyUser:Ljava/lang/String;

    return-void
.end method

.method public setUpdateIsNewData(Ljava/lang/Boolean;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateIsNewData:Ljava/lang/Boolean;

    return-void
.end method

.method public setUpdateIsNewProperties(Ljava/lang/Boolean;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateIsNewProperties:Ljava/lang/Boolean;

    return-void
.end method

.method public setUpdateOldArchiveItemIndex(Ljava/lang/Integer;)V
    .locals 0

    .line 303
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateOldArchiveItemIndex:Ljava/lang/Integer;

    return-void
.end method

.method public verify(Z)V
    .locals 1

    if-eqz p1, :cond_7

    .line 308
    iget-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateIsNewData:Ljava/lang/Boolean;

    if-eqz p1, :cond_6

    .line 311
    iget-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateIsNewProperties:Ljava/lang/Boolean;

    if-eqz p1, :cond_5

    .line 314
    iget-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateOldArchiveItemIndex:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    .line 318
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    .line 319
    iget-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateIsNewData:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 322
    iget-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateIsNewProperties:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 323
    :cond_0
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "updateOldArchiveItemIndex must be provided (updateIsNewProperties is false)"

    invoke-direct {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 320
    :cond_1
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "updateOldArchiveItemIndex must be provided (updateIsNewData is false)"

    invoke-direct {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 327
    :cond_2
    :goto_0
    iget-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateIsNewData:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutItem;->updateIsNewProperties:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 328
    :cond_3
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "updateIsNewProperties must be set (updateIsNewData is true)"

    invoke-direct {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 315
    :cond_4
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "updateOldArchiveItemIndex can\'t be null"

    invoke-direct {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 312
    :cond_5
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "updateIsNewProperties can\'t be null"

    invoke-direct {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 309
    :cond_6
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "updateIsNewData can\'t be null"

    invoke-direct {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_1
    return-void
.end method
