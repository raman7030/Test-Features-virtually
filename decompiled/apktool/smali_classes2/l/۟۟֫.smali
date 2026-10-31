.class public final Ll/۟۟֫;
.super Ljava/lang/Object;
.source "58LL"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ᩸:J

.field public final ᩹:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 441
    new-instance v0, Ll/ܰ۟֫;

    .line 442
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 441
    sput-object v0, Ll/۟۟֫;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 7

    .line 411
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    .line 403
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-ltz v6, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 404
    :goto_0
    invoke-static {v6}, Ll/᩺֡֫;->֫(Z)V

    cmp-long v6, v2, v4

    if-gez v6, :cond_1

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    :cond_1
    const/4 p1, 0x1

    .line 405
    :cond_2
    invoke-static {p1}, Ll/᩺֡֫;->֫(Z)V

    .line 406
    iput-wide v0, p0, Ll/۟۟֫;->᩹:J

    .line 407
    iput-wide v2, p0, Ll/۟۟֫;->᩸:J

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 416
    instance-of v0, p1, Ll/۟۟֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 419
    :cond_0
    check-cast p1, Ll/۟۟֫;

    .line 420
    iget-wide v2, p0, Ll/۟۟֫;->᩹:J

    iget-wide v4, p1, Ll/۟۟֫;->᩹:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Ll/۟۟֫;->᩸:J

    iget-wide v4, p1, Ll/۟۟֫;->᩸:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 425
    iget-wide v0, p0, Ll/۟۟֫;->᩹:J

    long-to-int v1, v0

    mul-int/lit16 v1, v1, 0x3c1

    .line 426
    iget-wide v2, p0, Ll/۟۟֫;->᩸:J

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 437
    iget-wide v0, p0, Ll/۟۟֫;->᩹:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 438
    iget-wide v0, p0, Ll/۟۟֫;->᩸:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
