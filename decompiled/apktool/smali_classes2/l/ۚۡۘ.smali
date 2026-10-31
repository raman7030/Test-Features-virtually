.class public final Ll/ۚۡۘ;
.super Ljava/lang/Object;
.source "77UP"


# instance fields
.field public ֫:[B

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    const/4 v0, 0x0

    .line 40
    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Ll/ۚۡۘ;-><init>([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/ۚۡۘ;->֫:[B

    .line 45
    iput p2, p0, Ll/ۚۡۘ;->ܽ:I

    .line 46
    iput p3, p0, Ll/ۚۡۘ;->ۧ:I

    add-int/2addr p2, p3

    .line 47
    array-length p1, p1

    if-gt p2, p1, :cond_0

    return-void

    .line 48
    :cond_0
    new-instance p1, Ll/֨ۡۘ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 48
    throw p1
.end method

.method public static ֫([B)I
    .locals 2

    .line 149
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, p0}, Ljava/math/BigInteger;-><init>([B)V

    .line 152
    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    const/16 v1, 0x1f

    if-gt p0, v1, :cond_0

    .line 153
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result p0

    return p0

    .line 155
    :cond_0
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string v0, "BigInteger out of int range"

    invoke-direct {p0, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫([I)I
    .locals 6

    const/4 v0, 0x0

    .line 94
    aget v1, p1, v0

    add-int/lit8 v2, v1, 0x1

    .line 95
    iget-object v3, p0, Ll/ۚۡۘ;->֫:[B

    aget-byte v1, v3, v1

    and-int/lit16 v4, v1, 0xff

    and-int/lit16 v5, v1, 0x80

    if-eqz v5, :cond_0

    and-int/lit8 v1, v1, 0x7f

    const/4 v4, 0x0

    :goto_0
    add-int/lit8 v5, v1, -0x1

    if-lez v1, :cond_0

    shl-int/lit8 v1, v4, 0x8

    add-int/lit8 v4, v2, 0x1

    .line 100
    aget-byte v2, v3, v2

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v1, v2

    move v2, v4

    move v4, v1

    move v1, v5

    goto :goto_0

    .line 103
    :cond_0
    aput v2, p1, v0

    return v4
.end method


# virtual methods
.method public final ֫(I)Z
    .locals 1

    .line 90
    invoke-virtual {p0}, Ll/ۚۡۘ;->ᩳ()I

    move-result v0

    or-int/lit16 p1, p1, 0xa0

    and-int/lit16 p1, p1, 0xff

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()[B
    .locals 5

    .line 109
    iget v0, p0, Ll/ۚۡۘ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    filled-new-array {v0}, [I

    move-result-object v0

    .line 110
    invoke-direct {p0, v0}, Ll/ۚۡۘ;->֫([I)I

    move-result v1

    const/4 v2, 0x0

    .line 111
    aget v0, v0, v2

    .line 112
    new-array v3, v1, [B

    .line 113
    iget-object v4, p0, Ll/ۚۡۘ;->֫:[B

    invoke-static {v4, v0, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v3
.end method

.method public final ۜ()Z
    .locals 2

    .line 68
    invoke-virtual {p0}, Ll/ۚۡۘ;->ᩳ()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()[Ll/ۚۡۘ;
    .locals 11

    .line 118
    iget-object v0, p0, Ll/ۚۡۘ;->֫:[B

    iget v1, p0, Ll/ۚۡۘ;->ܽ:I

    aget-byte v2, v0, v1

    const/4 v3, 0x1

    new-array v4, v3, [I

    add-int/2addr v1, v3

    const/4 v5, 0x0

    aput v1, v4, v5

    .line 121
    invoke-direct {p0, v4}, Ll/ۚۡۘ;->֫([I)I

    move-result v1

    const/4 v6, 0x5

    if-ne v2, v6, :cond_0

    new-array v0, v5, [Ll/ۚۡۘ;

    return-object v0

    .line 125
    :cond_0
    aget v2, v4, v5

    .line 126
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-lez v1, :cond_1

    add-int/lit8 v7, v2, 0x1

    add-int/lit8 v1, v1, -0x1

    aput v7, v4, v5

    .line 132
    invoke-direct {p0, v4}, Ll/ۚۡۘ;->֫([I)I

    move-result v8

    .line 133
    aget v9, v4, v5

    sub-int v7, v9, v7

    sub-int/2addr v1, v7

    .line 135
    new-instance v10, Ll/ۚۡۘ;

    add-int/2addr v7, v3

    add-int/2addr v7, v8

    invoke-direct {v10, v0, v2, v7}, Ll/ۚۡۘ;-><init>([BII)V

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int v2, v9, v8

    sub-int/2addr v1, v8

    goto :goto_0

    .line 139
    :cond_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ll/ۚۡۘ;

    .line 140
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object v0
.end method

.method public final ܳ()Z
    .locals 2

    .line 60
    invoke-virtual {p0}, Ll/ۚۡۘ;->ᩳ()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()[B
    .locals 3

    .line 145
    iget v0, p0, Ll/ۚۡۘ;->ۧ:I

    iget v1, p0, Ll/ۚۡۘ;->ܽ:I

    add-int/2addr v0, v1

    iget-object v2, p0, Ll/ۚۡۘ;->֫:[B

    invoke-static {v2, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 76
    invoke-virtual {p0}, Ll/ۚۡۘ;->ᩳ()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 52
    iget-object v0, p0, Ll/ۚۡۘ;->֫:[B

    iget v1, p0, Ll/ۚۡۘ;->ܽ:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final ᩷()Z
    .locals 2

    .line 56
    invoke-virtual {p0}, Ll/ۚۡۘ;->ᩳ()I

    move-result v0

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 64
    invoke-virtual {p0}, Ll/ۚۡۘ;->ᩳ()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
