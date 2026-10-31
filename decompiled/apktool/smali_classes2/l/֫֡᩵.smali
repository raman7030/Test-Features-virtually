.class public final Ll/֫֡᩵;
.super Ljava/lang/Object;
.source "L9U1"


# static fields
.field public static final ֫:[B

.field public static final ۧ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x18

    new-array v0, v0, [B

    .line 98
    fill-array-data v0, :array_0

    sput-object v0, Ll/֫֡᩵;->ۧ:[B

    const/16 v0, 0x44

    new-array v0, v0, [B

    .line 104
    fill-array-data v0, :array_1

    sput-object v0, Ll/֫֡᩵;->֫:[B

    return-void

    nop

    :array_0
    .array-data 1
        -0x1t
        0x53t
        0x4dt
        0x42t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        -0x2t
        0x53t
        0x4dt
        0x42t
        0x40t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static ֫(I[B)I
    .locals 1

    .line 45
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 p0, p0, 0x1

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x8

    add-int/2addr v0, p0

    return v0
.end method

.method public static ֫(JI[B)V
    .locals 1

    long-to-int v0, p0

    int-to-byte v0, v0

    .line 31
    aput-byte v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    const/16 v0, 0x8

    shr-long/2addr p0, v0

    long-to-int p1, p0

    int-to-byte p0, p1

    .line 32
    aput-byte p0, p3, p2

    return-void
.end method

.method public static ۧ(I[B)I
    .locals 2

    .line 50
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    add-int/2addr v0, p0

    return v0
.end method

.method public static ۧ(JI[B)V
    .locals 3

    long-to-int v0, p0

    int-to-byte v0, v0

    .line 37
    aput-byte v0, p3, p2

    add-int/lit8 v0, p2, 0x1

    const/16 v1, 0x8

    shr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 38
    aput-byte v1, p3, v0

    add-int/lit8 v0, p2, 0x2

    const/16 v1, 0x10

    shr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 39
    aput-byte v1, p3, v0

    add-int/lit8 p2, p2, 0x3

    const/16 v0, 0x18

    shr-long/2addr p0, v0

    long-to-int p1, p0

    int-to-byte p0, p1

    .line 40
    aput-byte p0, p3, p2

    return-void
.end method

.method public static ܽ(I[B)J
    .locals 4

    .line 56
    invoke-static {p0, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    add-int/lit8 p0, p0, 0x4

    invoke-static {p0, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p0

    int-to-long p0, p0

    const/16 v2, 0x20

    shl-long/2addr p0, v2

    add-long/2addr v0, p0

    return-wide v0
.end method

.method public static ܽ(JI[B)V
    .locals 3

    long-to-int v0, p0

    int-to-byte v0, v0

    .line 61
    aput-byte v0, p3, p2

    add-int/lit8 v0, p2, 0x1

    const/16 v1, 0x8

    shr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 62
    aput-byte v1, p3, v0

    add-int/lit8 v0, p2, 0x2

    const/16 v1, 0x10

    shr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 63
    aput-byte v1, p3, v0

    add-int/lit8 v0, p2, 0x3

    const/16 v1, 0x18

    shr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 64
    aput-byte v1, p3, v0

    add-int/lit8 v0, p2, 0x4

    const/16 v1, 0x20

    shr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 65
    aput-byte v1, p3, v0

    add-int/lit8 v0, p2, 0x5

    const/16 v1, 0x28

    shr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 66
    aput-byte v1, p3, v0

    add-int/lit8 v0, p2, 0x6

    const/16 v1, 0x30

    shr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 67
    aput-byte v1, p3, v0

    add-int/lit8 p2, p2, 0x7

    const/16 v0, 0x38

    shr-long/2addr p0, v0

    long-to-int p1, p0

    int-to-byte p0, p1

    .line 68
    aput-byte p0, p3, p2

    return-void
.end method

.method public static ᩳ(I[B)J
    .locals 4

    .line 73
    invoke-static {p0, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    add-int/lit8 p0, p0, 0x4

    .line 74
    invoke-static {p0, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p0

    int-to-long p0, p0

    const/16 v1, 0x20

    shl-long/2addr p0, v1

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p0, v0

    const-wide/16 v0, 0x2710

    .line 76
    div-long/2addr p0, v0

    const-wide v0, 0xa9730b66800L

    sub-long/2addr p0, v0

    return-wide p0
.end method

.method public static ᩳ(JI[B)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-eqz v2, :cond_0

    const-wide v0, 0xa9730b66800L

    add-long/2addr p0, v0

    const-wide/16 v0, 0x2710

    mul-long p0, p0, v0

    .line 85
    :cond_0
    invoke-static {p0, p1, p2, p3}, Ll/֫֡᩵;->ܽ(JI[B)V

    return-void
.end method
