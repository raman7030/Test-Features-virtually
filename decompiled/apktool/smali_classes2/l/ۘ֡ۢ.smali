.class public final Ll/ۘ֡ۢ;
.super Ljava/lang/Object;
.source "T7B2"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ljava/net/InetAddress;I)V
    .locals 3

    .line 497
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    .line 498
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v1, 0x0

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 499
    iput p2, p0, Ll/ۘ֡ۢ;->ܽ:I

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const-wide v1, 0xffffffffL

    sub-int/2addr v0, p2

    shl-long v0, v1, v0

    long-to-int v1, v0

    .line 500
    :goto_0
    iput v1, p0, Ll/ۘ֡ۢ;->֫:I

    .line 501
    invoke-static {p1}, Ll/᩵֡ۢ;->ۧ(Ljava/net/InetAddress;)I

    move-result p1

    and-int/2addr p1, v1

    iput p1, p0, Ll/ۘ֡ۢ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/net/InetAddress;
    .locals 7

    const/4 v0, 0x0

    .line 516
    iget v1, p0, Ll/ۘ֡ۢ;->ܽ:I

    if-eqz v1, :cond_1

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_0

    goto :goto_0

    .line 519
    :cond_0
    iget v1, p0, Ll/ۘ֡ۢ;->֫:I

    not-int v1, v1

    iget v2, p0, Ll/ۘ֡ۢ;->ۧ:I

    or-int/2addr v1, v2

    sget v2, Ll/᩵֡ۢ;->ۢ:I

    shr-int/lit8 v2, v1, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    shr-int/lit8 v3, v1, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    shr-int/lit8 v4, v1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v5, 0x4

    new-array v5, v5, [B

    const/4 v6, 0x0

    aput-byte v2, v5, v6

    const/4 v2, 0x1

    aput-byte v3, v5, v2

    const/4 v2, 0x2

    aput-byte v4, v5, v2

    const/4 v2, 0x3

    aput-byte v1, v5, v2

    .line 824
    :try_start_0
    invoke-static {v5}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public final ֫(Ljava/net/InetAddress;)Z
    .locals 1

    .line 508
    instance-of v0, p1, Ljava/net/Inet4Address;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/᩵֡ۢ;->ۧ(Ljava/net/InetAddress;)I

    move-result p1

    iget v0, p0, Ll/ۘ֡ۢ;->֫:I

    and-int/2addr p1, v0

    iget v0, p0, Ll/ۘ֡ۢ;->ۧ:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
