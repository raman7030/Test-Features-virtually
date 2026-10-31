.class public abstract Ll/ۚ֡᩵;
.super Ljava/lang/Object;
.source "E9ZE"


# static fields
.field public static final ۧ:[B

.field public static final ܽ:[B


# instance fields
.field public ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 36
    fill-array-data v1, :array_0

    sput-object v1, Ll/ۚ֡᩵;->ۧ:[B

    new-array v0, v0, [B

    .line 43
    fill-array-data v0, :array_1

    sput-object v0, Ll/ۚ֡᩵;->ܽ:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x4et
        0x54t
        0x4ct
        0x4dt
        0x53t
        0x53t
        0x50t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x6t
        0x1t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0xft
    .end array-data
.end method

.method public static ֫(II[B[B)I
    .locals 1

    .line 148
    invoke-static {p1, p0, p2}, Ll/ۚ֡᩵;->֫(II[B)V

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    .line 149
    array-length v0, p3

    if-lez v0, :cond_0

    .line 150
    array-length v0, p3

    invoke-static {p3, p1, p2, p0, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 151
    array-length p0, p3

    return p0

    :cond_0
    return p1
.end method

.method public static ֫(I[B[B)I
    .locals 2

    if-eqz p2, :cond_0

    .line 137
    array-length p2, p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    :goto_1
    add-int/lit8 p0, p0, 0x4

    return p0

    :cond_1
    and-int/lit16 v0, p2, 0xff

    int-to-byte v0, v0

    .line 131
    aput-byte v0, p1, p0

    add-int/lit8 v1, p0, 0x1

    shr-int/lit8 p2, p2, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    .line 132
    aput-byte p2, p1, v1

    add-int/lit8 v1, p0, 0x2

    .line 131
    aput-byte v0, p1, v1

    add-int/lit8 v0, p0, 0x3

    .line 132
    aput-byte p2, p1, v0

    goto :goto_1
.end method

.method public static ֫(II[B)V
    .locals 2

    and-int/lit16 v0, p1, 0xff

    int-to-byte v0, v0

    .line 123
    aput-byte v0, p2, p0

    add-int/lit8 v0, p0, 0x1

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 124
    aput-byte v1, p2, v0

    add-int/lit8 v0, p0, 0x2

    shr-int/lit8 v1, p1, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 125
    aput-byte v1, p2, v0

    add-int/lit8 p0, p0, 0x3

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 126
    aput-byte p1, p2, p0

    return-void
.end method

.method public static ֫(I[B)[B
    .locals 3

    .line 109
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x4

    .line 115
    invoke-static {p0, p1}, Ll/ۚ֡᩵;->ۧ(I[B)I

    move-result p0

    .line 116
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 117
    invoke-static {p1, p0, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public static ۧ(I[B)I
    .locals 2

    .line 103
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 64
    iget v0, p0, Ll/ۚ֡᩵;->֫:I

    return v0
.end method

.method public final ֫(I)Z
    .locals 1

    .line 64
    iget v0, p0, Ll/ۚ֡᩵;->֫:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()V
    .locals 2

    const/high16 v0, 0x800000

    .line 64
    iget v1, p0, Ll/ۚ֡᩵;->֫:I

    or-int/2addr v0, v1

    .line 74
    iput v0, p0, Ll/ۚ֡᩵;->֫:I

    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 74
    iput p1, p0, Ll/ۚ֡᩵;->֫:I

    return-void
.end method
