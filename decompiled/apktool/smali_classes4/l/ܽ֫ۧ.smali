.class public final Ll/ܽ֫ۧ;
.super Ljava/lang/Object;
.source "58LL"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ۗ:[B

.field public final ۙ:Ljava/lang/String;

.field public final ۛ:Landroid/net/Uri;

.field public final ۤ:Ll/ۧ֫ۧ;

.field public final ۫:Ljava/util/List;

.field public final ۬:Ljava/lang/String;

.field public final ᩶:[B

.field public final ᩸:Ll/۟۟֫;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 380
    new-instance v0, Ll/᩺۟֫;

    .line 381
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 380
    sput-object v0, Ll/ܽ֫ۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .line 223
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iput-object v0, p0, Ll/ܽ֫ۧ;->ۙ:Ljava/lang/String;

    .line 225
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Ll/ܽ֫ۧ;->ۛ:Landroid/net/Uri;

    .line 226
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܽ֫ۧ;->۬:Ljava/lang/String;

    .line 227
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 228
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 230
    const-class v3, Ll/ܶ᩵֫;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Ll/ܶ᩵֫;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 232
    :cond_0
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܽ֫ۧ;->۫:Ljava/util/List;

    .line 233
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    iput-object v0, p0, Ll/ܽ֫ۧ;->ۗ:[B

    .line 234
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܽ֫ۧ;->᩹:Ljava/lang/String;

    .line 235
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    iput-object v0, p0, Ll/ܽ֫ۧ;->᩶:[B

    .line 236
    const-class v0, Ll/۟۟֫;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Ll/۟۟֫;

    iput-object v0, p0, Ll/ܽ֫ۧ;->᩸:Ll/۟۟֫;

    .line 237
    const-class v0, Ll/ۧ֫ۧ;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ll/ۧ֫ۧ;

    iput-object p1, p0, Ll/ܽ֫ۧ;->ۤ:Ll/ۧ֫ۧ;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 328
    instance-of v0, p1, Ll/ܽ֫ۧ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 331
    :cond_0
    check-cast p1, Ll/ܽ֫ۧ;

    .line 332
    iget-object v0, p0, Ll/ܽ֫ۧ;->ۙ:Ljava/lang/String;

    iget-object v2, p1, Ll/ܽ֫ۧ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܽ֫ۧ;->ۛ:Landroid/net/Uri;

    iget-object v2, p1, Ll/ܽ֫ۧ;->ۛ:Landroid/net/Uri;

    .line 333
    invoke-virtual {v0, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܽ֫ۧ;->۬:Ljava/lang/String;

    iget-object v2, p1, Ll/ܽ֫ۧ;->۬:Ljava/lang/String;

    .line 334
    invoke-static {v0, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܽ֫ۧ;->۫:Ljava/util/List;

    iget-object v2, p1, Ll/ܽ֫ۧ;->۫:Ljava/util/List;

    .line 335
    invoke-interface {v0, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܽ֫ۧ;->ۗ:[B

    iget-object v2, p1, Ll/ܽ֫ۧ;->ۗ:[B

    .line 336
    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܽ֫ۧ;->᩹:Ljava/lang/String;

    iget-object v2, p1, Ll/ܽ֫ۧ;->᩹:Ljava/lang/String;

    .line 337
    invoke-static {v0, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܽ֫ۧ;->᩶:[B

    iget-object v2, p1, Ll/ܽ֫ۧ;->᩶:[B

    .line 338
    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܽ֫ۧ;->᩸:Ll/۟۟֫;

    iget-object v2, p1, Ll/ܽ֫ۧ;->᩸:Ll/۟۟֫;

    .line 339
    invoke-static {v0, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܽ֫ۧ;->ۤ:Ll/ۧ֫ۧ;

    iget-object p1, p1, Ll/ܽ֫ۧ;->ۤ:Ll/ۧ֫ۧ;

    .line 340
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 345
    iget-object v0, p0, Ll/ܽ֫ۧ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3c1

    .line 346
    iget-object v1, p0, Ll/ܽ֫ۧ;->ۛ:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    const/4 v0, 0x0

    .line 347
    iget-object v2, p0, Ll/ܽ֫ۧ;->۬:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 348
    iget-object v2, p0, Ll/ܽ֫ۧ;->۫:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    .line 349
    iget-object v1, p0, Ll/ܽ֫ۧ;->ۗ:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 350
    iget-object v2, p0, Ll/ܽ֫ۧ;->᩹:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 351
    iget-object v2, p0, Ll/ܽ֫ۧ;->᩶:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    .line 352
    iget-object v1, p0, Ll/ܽ֫ۧ;->᩸:Ll/۟۟֫;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ll/۟۟֫;->hashCode()I

    move-result v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    .line 353
    iget-object v1, p0, Ll/ܽ֫ۧ;->ۤ:Ll/ۧ֫ۧ;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll/ۧ֫ۧ;->hashCode()I

    move-result v0

    :cond_3
    add-int/2addr v2, v0

    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܽ֫ۧ;->۬:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܽ֫ۧ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 366
    iget-object p2, p0, Ll/ܽ֫ۧ;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 367
    iget-object p2, p0, Ll/ܽ֫ۧ;->ۛ:Landroid/net/Uri;

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 368
    iget-object p2, p0, Ll/ܽ֫ۧ;->۬:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 369
    iget-object p2, p0, Ll/ܽ֫ۧ;->۫:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 370
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 371
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    invoke-virtual {p1, v2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 373
    :cond_0
    iget-object p2, p0, Ll/ܽ֫ۧ;->ۗ:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 374
    iget-object p2, p0, Ll/ܽ֫ۧ;->᩹:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 375
    iget-object p2, p0, Ll/ܽ֫ۧ;->᩶:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 376
    iget-object p2, p0, Ll/ܽ֫ۧ;->᩸:Ll/۟۟֫;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 377
    iget-object p2, p0, Ll/ܽ֫ۧ;->ۤ:Ll/ۧ֫ۧ;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
