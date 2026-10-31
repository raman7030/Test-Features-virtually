.class public final Ll/۬ۨ᩵;
.super Ljava/lang/Object;
.source "F8CY"


# direct methods
.method public static ֫(I[BII)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge p2, p3, :cond_0

    add-int/lit8 v1, p0, 0x1

    .line 62
    aget-byte p0, p1, p0

    add-int/lit8 v2, p2, 0x1

    aget-byte p2, p1, p2

    if-ne p0, p2, :cond_0

    add-int/lit8 v0, v0, 0x1

    move p0, v1

    move p2, v2

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static ֫([BII[BII)I
    .locals 2

    add-int v0, p4, p2

    add-int/lit8 v0, v0, 0x1

    add-int/lit16 v1, p2, 0xf0

    .line 135
    div-int/lit16 v1, v1, 0xff

    add-int/2addr v1, v0

    if-gt v1, p5, :cond_1

    const/16 p5, 0xf

    if-lt p2, p5, :cond_0

    add-int/lit8 p5, p4, 0x1

    const/16 v0, -0x10

    .line 140
    aput-byte v0, p3, p4

    add-int/lit8 p4, p2, -0xf

    .line 141
    invoke-static {p4, p5, p3}, Ll/۬ۨ᩵;->ۧ(II[B)I

    move-result p4

    goto :goto_0

    :cond_0
    add-int/lit8 p5, p4, 0x1

    shl-int/lit8 v0, p2, 0x4

    int-to-byte v0, v0

    .line 143
    aput-byte v0, p3, p4

    move p4, p5

    .line 146
    :goto_0
    invoke-static {p0, p1, p3, p4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p4, p2

    return p4

    .line 136
    :cond_1
    new-instance p0, Ll/ۘۨ᩵;

    .line 35
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 136
    throw p0
.end method

.method public static ֫([B[BIIIIII)I
    .locals 5

    sub-int v0, p3, p2

    add-int/lit8 v1, p6, 0x1

    add-int v2, v1, v0

    add-int/lit8 v2, v2, 0x8

    ushr-int/lit8 v3, v0, 0x8

    add-int/2addr v2, v3

    const-string v3, "maxDestLen is too small"

    if-gt v2, p7, :cond_3

    const/16 v2, 0xf

    if-lt v0, v2, :cond_0

    add-int/lit8 v4, v0, -0xf

    .line 101
    invoke-static {v4, v1, p1}, Ll/۬ۨ᩵;->ۧ(II[B)I

    move-result v1

    const/16 v4, -0x10

    goto :goto_0

    :cond_0
    shl-int/lit8 v4, v0, 0x4

    .line 107
    :goto_0
    invoke-static {p2, p0, v1, p1, v0}, Ll/۬ۨ᩵;->֫(I[BI[BI)V

    add-int/2addr v1, v0

    sub-int/2addr p3, p4

    add-int/lit8 p0, v1, 0x1

    int-to-byte p2, p3

    .line 112
    aput-byte p2, p1, v1

    add-int/lit8 p2, v1, 0x2

    ushr-int/lit8 p3, p3, 0x8

    int-to-byte p3, p3

    .line 113
    aput-byte p3, p1, p0

    add-int/lit8 p0, p5, -0x4

    add-int/lit8 v1, v1, 0x8

    ushr-int/lit8 p3, p0, 0x8

    add-int/2addr v1, p3

    if-gt v1, p7, :cond_2

    if-lt p0, v2, :cond_1

    or-int/lit8 p0, v4, 0xf

    add-int/lit8 p5, p5, -0x13

    .line 122
    invoke-static {p5, p2, p1}, Ll/۬ۨ᩵;->ۧ(II[B)I

    move-result p2

    goto :goto_1

    :cond_1
    or-int/2addr p0, v4

    :goto_1
    int-to-byte p0, p0

    .line 127
    aput-byte p0, p1, p6

    return p2

    .line 118
    :cond_2
    new-instance p0, Ll/ۘۨ᩵;

    .line 31
    invoke-direct {p0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 118
    throw p0

    .line 95
    :cond_3
    new-instance p0, Ll/ۘۨ᩵;

    .line 31
    invoke-direct {p0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 95
    throw p0
.end method

.method public static ֫(I[BI[BI)V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_1

    add-int v1, p0, v0

    add-int v2, p2, v0

    const/4 v3, 0x0

    :goto_1
    const/16 v4, 0x8

    if-ge v3, v4, :cond_0

    add-int v4, v2, v3

    add-int v5, v1, v3

    .line 56
    :try_start_0
    aget-byte v5, p1, v5

    aput-byte v5, p3, v4
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 86
    :catch_0
    new-instance p1, Ll/ۘۨ᩵;

    const-string p2, "Malformed input at offset "

    .line 0
    invoke-static {p0, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 31
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 86
    throw p1

    :cond_0
    add-int/lit8 v0, v0, 0x8

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(II[B)Z
    .locals 2

    .line 37
    aget-byte v0, p2, p0

    aget-byte v1, p2, p1

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, p0, 0x1

    aget-byte v0, p2, v0

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p2, v1

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, p0, 0x2

    aget-byte v0, p2, v0

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p2, v1

    if-ne v0, v1, :cond_0

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p2, p0

    add-int/lit8 p1, p1, 0x3

    aget-byte p1, p2, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(II[B)I
    .locals 2

    :goto_0
    const/16 v0, 0xff

    if-lt p0, v0, :cond_0

    add-int/lit8 v0, p1, 0x1

    const/4 v1, -0x1

    .line 154
    aput-byte v1, p2, p1

    add-int/lit16 p0, p0, -0xff

    move p1, v0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, p1, 0x1

    int-to-byte p0, p0

    .line 157
    aput-byte p0, p2, p1

    return v0
.end method

.method public static ۧ(I[BII)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-lez p0, :cond_0

    if-le p2, p3, :cond_0

    add-int/lit8 p0, p0, -0x1

    .line 70
    aget-byte v1, p1, p0

    add-int/lit8 p2, p2, -0x1

    aget-byte v2, p1, p2

    if-ne v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method
