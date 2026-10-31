.class public final Ll/ۧ֫ۧ;
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

    .line 502
    new-instance v0, Ll/֫֫ۧ;

    .line 503
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 502
    sput-object v0, Ll/ۧ֫ۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 6

    .line 472
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    .line 465
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-gez p1, :cond_1

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 466
    :goto_1
    invoke-static {p1}, Ll/᩺֡֫;->֫(Z)V

    .line 467
    iput-wide v0, p0, Ll/ۧ֫ۧ;->᩹:J

    .line 468
    iput-wide v2, p0, Ll/ۧ֫ۧ;->᩸:J

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

    .line 477
    instance-of v0, p1, Ll/ۧ֫ۧ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 480
    :cond_0
    check-cast p1, Ll/ۧ֫ۧ;

    .line 481
    iget-wide v2, p0, Ll/ۧ֫ۧ;->᩹:J

    iget-wide v4, p1, Ll/ۧ֫ۧ;->᩹:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Ll/ۧ֫ۧ;->᩸:J

    iget-wide v4, p1, Ll/ۧ֫ۧ;->᩸:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 486
    iget-wide v0, p0, Ll/ۧ֫ۧ;->᩹:J

    long-to-int v1, v0

    mul-int/lit16 v1, v1, 0x3c1

    .line 487
    iget-wide v2, p0, Ll/ۧ֫ۧ;->᩸:J

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 498
    iget-wide v0, p0, Ll/ۧ֫ۧ;->᩹:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 499
    iget-wide v0, p0, Ll/ۧ֫ۧ;->᩸:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
