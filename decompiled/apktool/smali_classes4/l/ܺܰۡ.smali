.class public final Ll/ܺܰۡ;
.super Ljava/lang/Object;
.source "D9BL"


# static fields
.field public static ֫:I = 0x0

.field public static ۧ:J = 0x0L

.field public static ܳ:I = 0x0

.field public static ܽ:I = 0x0

.field public static ܿ:Z = false

.field public static ᩳ:I = -0x1

.field public static ᩻:I


# direct methods
.method public static ֫()I
    .locals 1

    .line 25
    sget v0, Ll/ܺܰۡ;->֫:I

    return v0
.end method

.method public static ֫(I[B)I
    .locals 2

    add-int/lit8 v0, p0, 0x3

    .line 14
    aget-byte v0, p1, v0

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static ֫(I)V
    .locals 0

    .line 29
    sput p0, Ll/ܺܰۡ;->֫:I

    return-void
.end method

.method public static ֫(II[B)V
    .locals 2

    and-int/lit16 v0, p1, 0xff

    int-to-byte v0, v0

    .line 39
    aput-byte v0, p2, p0

    add-int/lit8 v0, p0, 0x1

    ushr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 40
    aput-byte v1, p2, v0

    add-int/lit8 v0, p0, 0x2

    ushr-int/lit8 v1, p1, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 41
    aput-byte v1, p2, v0

    add-int/lit8 p0, p0, 0x3

    ushr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 42
    aput-byte p1, p2, p0

    return-void
.end method

.method public static ֫(J)V
    .locals 0

    .line 61
    sput-wide p0, Ll/ܺܰۡ;->ۧ:J

    return-void
.end method

.method public static ֫(JI[B)V
    .locals 5

    const-wide/16 v0, 0xff

    and-long v2, p0, v0

    long-to-int v3, v2

    int-to-byte v2, v3

    .line 53
    aput-byte v2, p3, p2

    add-int/lit8 v2, p2, 0x1

    const/16 v3, 0x8

    ushr-long v3, p0, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    int-to-byte v3, v4

    .line 54
    aput-byte v3, p3, v2

    add-int/lit8 v2, p2, 0x2

    const/16 v3, 0x10

    ushr-long v3, p0, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    int-to-byte v3, v4

    .line 55
    aput-byte v3, p3, v2

    add-int/lit8 v2, p2, 0x3

    const/16 v3, 0x18

    ushr-long v3, p0, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    int-to-byte v3, v4

    .line 56
    aput-byte v3, p3, v2

    add-int/lit8 v2, p2, 0x4

    const/16 v3, 0x20

    ushr-long v3, p0, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    int-to-byte v3, v4

    .line 57
    aput-byte v3, p3, v2

    add-int/lit8 v2, p2, 0x5

    const/16 v3, 0x28

    ushr-long v3, p0, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    int-to-byte v3, v4

    .line 58
    aput-byte v3, p3, v2

    add-int/lit8 v2, p2, 0x6

    const/16 v3, 0x30

    ushr-long v3, p0, v3

    and-long/2addr v3, v0

    long-to-int v4, v3

    int-to-byte v3, v4

    .line 59
    aput-byte v3, p3, v2

    add-int/lit8 p2, p2, 0x7

    const/16 v2, 0x38

    ushr-long/2addr p0, v2

    and-long/2addr p0, v0

    long-to-int p1, p0

    int-to-byte p0, p1

    .line 60
    aput-byte p0, p3, p2

    return-void
.end method

.method public static ֫(Z)V
    .locals 0

    .line 69
    sput-boolean p0, Ll/ܺܰۡ;->ܿ:Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    const-string v0, ".apk"

    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ".apk.bak"

    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ".apk.1"

    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ".jar"

    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۜ()Z
    .locals 2

    .line 77
    sget v0, Ll/ܺܰۡ;->ᩳ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ۡ()V
    .locals 3

    const/4 v0, -0x1

    .line 85
    sput v0, Ll/ܺܰۡ;->ᩳ:I

    const/4 v0, 0x0

    .line 86
    sput v0, Ll/ܺܰۡ;->֫:I

    .line 87
    sput v0, Ll/ܺܰۡ;->ܽ:I

    .line 88
    sput v0, Ll/ܺܰۡ;->ܳ:I

    .line 89
    sput v0, Ll/ܺܰۡ;->᩻:I

    const-wide/16 v1, 0x0

    .line 90
    sput-wide v1, Ll/ܺܰۡ;->ۧ:J

    .line 91
    sput-boolean v0, Ll/ܺܰۡ;->ܿ:Z

    return-void
.end method

.method public static ۢ()V
    .locals 0

    .line 32
    invoke-static {}, Ll/ᩳ۬᩻;->֫()Ll/ᩳ۬᩻;

    .line 51
    invoke-static {}, Ll/ܽ۬᩻;->֫()V

    return-void
.end method

.method public static ۧ()J
    .locals 2

    .line 57
    sget-wide v0, Ll/ܺܰۡ;->ۧ:J

    return-wide v0
.end method

.method public static ۧ(I[B)J
    .locals 7

    add-int/lit8 v0, p0, 0x7

    .line 22
    aget-byte v0, p1, v0

    int-to-long v0, v0

    const/16 v2, 0x38

    shl-long/2addr v0, v2

    add-int/lit8 v2, p0, 0x6

    aget-byte v2, p1, v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    const/16 v6, 0x30

    shl-long/2addr v2, v6

    or-long/2addr v0, v2

    add-int/lit8 v2, p0, 0x5

    aget-byte v2, p1, v2

    int-to-long v2, v2

    and-long/2addr v2, v4

    const/16 v6, 0x28

    shl-long/2addr v2, v6

    or-long/2addr v0, v2

    add-int/lit8 v2, p0, 0x4

    aget-byte v2, p1, v2

    int-to-long v2, v2

    and-long/2addr v2, v4

    const/16 v6, 0x20

    shl-long/2addr v2, v6

    or-long/2addr v0, v2

    add-int/lit8 v2, p0, 0x3

    aget-byte v2, p1, v2

    int-to-long v2, v2

    and-long/2addr v2, v4

    const/16 v6, 0x18

    shl-long/2addr v2, v6

    or-long/2addr v0, v2

    add-int/lit8 v2, p0, 0x2

    aget-byte v2, p1, v2

    int-to-long v2, v2

    and-long/2addr v2, v4

    const/16 v6, 0x10

    shl-long/2addr v2, v6

    or-long/2addr v0, v2

    add-int/lit8 v2, p0, 0x1

    aget-byte v2, p1, v2

    int-to-long v2, v2

    and-long/2addr v2, v4

    const/16 v6, 0x8

    shl-long/2addr v2, v6

    or-long/2addr v0, v2

    aget-byte p0, p1, p0

    int-to-long p0, p0

    and-long/2addr p0, v4

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static ۧ(I)V
    .locals 0

    .line 37
    sput p0, Ll/ܺܰۡ;->ܽ:I

    return-void
.end method

.method public static ۧ(II[B)V
    .locals 1

    and-int/lit16 v0, p1, 0xff

    int-to-byte v0, v0

    .line 34
    aput-byte v0, p2, p0

    add-int/lit8 p0, p0, 0x1

    ushr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 35
    aput-byte p1, p2, p0

    return-void
.end method

.method public static ܳ()Z
    .locals 5

    .line 73
    sget-wide v0, Ll/ܺܰۡ;->ۧ:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ܽ()I
    .locals 1

    .line 33
    sget v0, Ll/ܺܰۡ;->ܽ:I

    return v0
.end method

.method public static ܽ(I[B)I
    .locals 1

    add-int/lit8 v0, p0, 0x1

    .line 10
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method

.method public static ܽ(I)V
    .locals 0

    .line 21
    sput p0, Ll/ܺܰۡ;->ᩳ:I

    return-void
.end method

.method public static ܿ()I
    .locals 1

    .line 49
    sget v0, Ll/ܺܰۡ;->᩻:I

    return v0
.end method

.method public static ܿ(I)V
    .locals 0

    .line 53
    sput p0, Ll/ܺܰۡ;->᩻:I

    return-void
.end method

.method public static ᩳ()I
    .locals 1

    .line 41
    sget v0, Ll/ܺܰۡ;->ܳ:I

    return v0
.end method

.method public static ᩳ(I)V
    .locals 0

    .line 45
    sput p0, Ll/ܺܰۡ;->ܳ:I

    return-void
.end method

.method public static ᩷()Z
    .locals 1

    .line 65
    sget-boolean v0, Ll/ܺܰۡ;->ܿ:Z

    return v0
.end method

.method public static ᩻()Z
    .locals 1

    .line 81
    sget v0, Ll/ܺܰۡ;->ᩳ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
