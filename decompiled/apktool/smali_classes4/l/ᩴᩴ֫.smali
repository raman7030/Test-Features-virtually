.class public final Ll/ᩴᩴ֫;
.super Ljava/lang/Object;
.source "U8TP"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ۗ:Ljava/util/UUID;

.field public final ۙ:Ljava/lang/String;

.field public final ᩶:Ljava/lang/String;

.field public final ᩸:[B

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 390
    new-instance v0, Ll/ۘᩴ֫;

    .line 391
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 390
    sput-object v0, Ll/ᩴᩴ֫;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 5

    .line 304
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 305
    new-instance v0, Ljava/util/UUID;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    iput-object v0, p0, Ll/ᩴᩴ֫;->ۗ:Ljava/util/UUID;

    .line 306
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴᩴ֫;->᩶:Ljava/lang/String;

    .line 307
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iput-object v0, p0, Ll/ᩴᩴ֫;->ۙ:Ljava/lang/String;

    .line 308
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    iput-object p1, p0, Ll/ᩴᩴ֫;->᩸:[B

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    .line 297
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    iput-object p1, p0, Ll/ᩴᩴ֫;->ۗ:Ljava/util/UUID;

    .line 299
    iput-object p2, p0, Ll/ᩴᩴ֫;->᩶:Ljava/lang/String;

    .line 155
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    invoke-static {p3}, Ll/ۢ᩵֫;->ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴᩴ֫;->ۙ:Ljava/lang/String;

    .line 301
    iput-object p4, p0, Ll/ᩴᩴ֫;->᩸:[B

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 349
    instance-of v0, p1, Ll/ᩴᩴ֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    .line 355
    :cond_1
    check-cast p1, Ll/ᩴᩴ֫;

    .line 356
    iget-object v2, p0, Ll/ᩴᩴ֫;->᩶:Ljava/lang/String;

    iget-object v3, p1, Ll/ᩴᩴ֫;->᩶:Ljava/lang/String;

    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ᩴᩴ֫;->ۙ:Ljava/lang/String;

    iget-object v3, p1, Ll/ᩴᩴ֫;->ۙ:Ljava/lang/String;

    .line 357
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ᩴᩴ֫;->ۗ:Ljava/util/UUID;

    iget-object v3, p1, Ll/ᩴᩴ֫;->ۗ:Ljava/util/UUID;

    .line 358
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ᩴᩴ֫;->᩸:[B

    iget-object p1, p1, Ll/ᩴᩴ֫;->᩸:[B

    .line 359
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 364
    iget v0, p0, Ll/ᩴᩴ֫;->᩹:I

    if-nez v0, :cond_1

    .line 365
    iget-object v0, p0, Ll/ᩴᩴ֫;->ۗ:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 366
    iget-object v2, p0, Ll/ᩴᩴ֫;->᩶:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 367
    iget-object v2, p0, Ll/ᩴᩴ֫;->ۙ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 368
    iget-object v1, p0, Ll/ᩴᩴ֫;->᩸:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    .line 369
    iput v1, p0, Ll/ᩴᩴ֫;->᩹:I

    .line 371
    :cond_1
    iget v0, p0, Ll/ᩴᩴ֫;->᩹:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 383
    iget-object p2, p0, Ll/ᩴᩴ֫;->ۗ:Ljava/util/UUID;

    invoke-virtual {p2}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 384
    invoke-virtual {p2}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 385
    iget-object p2, p0, Ll/ᩴᩴ֫;->᩶:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 386
    iget-object p2, p0, Ll/ᩴᩴ֫;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 387
    iget-object p2, p0, Ll/ᩴᩴ֫;->᩸:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method

.method public final ֫(Ljava/util/UUID;)Z
    .locals 2

    .line 318
    sget-object v0, Ll/᩻ᩴ֫;->ᩳ:Ljava/util/UUID;

    iget-object v1, p0, Ll/ᩴᩴ֫;->ۗ:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
