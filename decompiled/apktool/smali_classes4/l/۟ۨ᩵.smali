.class public final Ll/۟ۨ᩵;
.super Ll/ۨۨ᩵;
.source "88DU"


# virtual methods
.method public final ֫()I
    .locals 6

    .line 27
    iget-wide v0, p0, Ll/ۨۨ᩵;->᩶:J

    const-wide/16 v2, 0x10

    const v4, 0x165667b1

    cmp-long v5, v0, v2

    if-ltz v5, :cond_0

    .line 28
    iget v0, p0, Ll/ۨۨ᩵;->ۙ:I

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v0

    iget v1, p0, Ll/ۨۨ᩵;->ۗ:I

    const/4 v2, 0x7

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v0

    iget v0, p0, Ll/ۨۨ᩵;->۬:I

    const/16 v2, 0xc

    invoke-static {v0, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v0

    add-int/2addr v0, v1

    iget v1, p0, Ll/ۨۨ᩵;->۫:I

    const/16 v2, 0x12

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v0

    goto :goto_0

    :cond_0
    const v1, 0x165667b1

    :goto_0
    int-to-long v0, v1

    .line 33
    iget-wide v2, p0, Ll/ۨۨ᩵;->᩶:J

    add-long/2addr v0, v2

    long-to-int v1, v0

    const/4 v0, 0x0

    .line 36
    :goto_1
    iget v2, p0, Ll/ۨۨ᩵;->᩸:I

    add-int/lit8 v2, v2, -0x4

    const v3, -0x3d4d51c3

    iget-object v5, p0, Ll/ۨۨ᩵;->᩹:[B

    if-gt v0, v2, :cond_1

    .line 37
    invoke-static {v0, v5}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v2

    mul-int v2, v2, v3

    add-int/2addr v2, v1

    const/16 v1, 0x11

    .line 38
    invoke-static {v2, v1}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    const v2, 0x27d4eb2f

    mul-int v1, v1, v2

    add-int/lit8 v0, v0, 0x4

    goto :goto_1

    .line 42
    :cond_1
    :goto_2
    iget v2, p0, Ll/ۨۨ᩵;->᩸:I

    if-ge v0, v2, :cond_2

    .line 44
    aget-byte v2, v5, v0

    and-int/lit16 v2, v2, 0xff

    mul-int v2, v2, v4

    add-int/2addr v2, v1

    const/16 v1, 0xb

    invoke-static {v2, v1}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    const v2, -0x61c8864f

    mul-int v1, v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    ushr-int/lit8 v0, v1, 0xf

    xor-int/2addr v0, v1

    const v1, -0x7a143589

    mul-int v0, v0, v1

    ushr-int/lit8 v1, v0, 0xd

    xor-int/2addr v0, v1

    mul-int v0, v0, v3

    ushr-int/lit8 v1, v0, 0x10

    xor-int/2addr v0, v1

    return v0
.end method

.method public final ֫(I[B)V
    .locals 12

    const/4 v0, 0x0

    .line 59
    invoke-static {v0, p1, p2}, Ll/ۛ᩸ۘ;->֫(II[B)V

    .line 61
    iget-wide v1, p0, Ll/ۨۨ᩵;->᩶:J

    int-to-long v3, p1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۨۨ᩵;->᩶:J

    .line 63
    iget v1, p0, Ll/ۨۨ᩵;->᩸:I

    add-int v2, v1, p1

    iget-object v3, p0, Ll/ۨۨ᩵;->᩹:[B

    const/16 v4, 0x10

    if-ge v2, v4, :cond_0

    .line 64
    invoke-static {p2, v0, v3, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    iget p2, p0, Ll/ۨۨ᩵;->᩸:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ۨۨ᩵;->᩸:I

    return-void

    :cond_0
    const v2, -0x61c8864f

    const/16 v5, 0xd

    const v6, -0x7a143589

    if-lez v1, :cond_1

    rsub-int/lit8 v7, v1, 0x10

    .line 72
    invoke-static {p2, v0, v3, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    iget v1, p0, Ll/ۨۨ᩵;->ۙ:I

    invoke-static {v0, v3}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v7

    mul-int v7, v7, v6

    add-int/2addr v7, v1

    iput v7, p0, Ll/ۨۨ᩵;->ۙ:I

    .line 75
    invoke-static {v7, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    mul-int v1, v1, v2

    .line 76
    iput v1, p0, Ll/ۨۨ᩵;->ۙ:I

    .line 78
    iget v1, p0, Ll/ۨۨ᩵;->ۗ:I

    const/4 v7, 0x4

    invoke-static {v7, v3}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v7

    mul-int v7, v7, v6

    add-int/2addr v7, v1

    iput v7, p0, Ll/ۨۨ᩵;->ۗ:I

    .line 79
    invoke-static {v7, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    mul-int v1, v1, v2

    .line 80
    iput v1, p0, Ll/ۨۨ᩵;->ۗ:I

    .line 82
    iget v1, p0, Ll/ۨۨ᩵;->۬:I

    const/16 v7, 0x8

    invoke-static {v7, v3}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v7

    mul-int v7, v7, v6

    add-int/2addr v7, v1

    iput v7, p0, Ll/ۨۨ᩵;->۬:I

    .line 83
    invoke-static {v7, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    mul-int v1, v1, v2

    .line 84
    iput v1, p0, Ll/ۨۨ᩵;->۬:I

    .line 86
    iget v1, p0, Ll/ۨۨ᩵;->۫:I

    const/16 v7, 0xc

    invoke-static {v7, v3}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v7

    mul-int v7, v7, v6

    add-int/2addr v7, v1

    iput v7, p0, Ll/ۨۨ᩵;->۫:I

    .line 87
    invoke-static {v7, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    mul-int v1, v1, v2

    .line 88
    iput v1, p0, Ll/ۨۨ᩵;->۫:I

    .line 90
    iget v1, p0, Ll/ۨۨ᩵;->᩸:I

    sub-int/2addr v4, v1

    .line 91
    iput v0, p0, Ll/ۨۨ᩵;->᩸:I

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    add-int/lit8 v1, p1, -0x10

    .line 96
    iget v7, p0, Ll/ۨۨ᩵;->ۙ:I

    .line 97
    iget v8, p0, Ll/ۨۨ᩵;->ۗ:I

    .line 98
    iget v9, p0, Ll/ۨۨ᩵;->۬:I

    .line 99
    iget v10, p0, Ll/ۨۨ᩵;->۫:I

    :goto_1
    if-gt v4, v1, :cond_2

    .line 102
    invoke-static {v4, p2}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v11

    mul-int v11, v11, v6

    add-int/2addr v11, v7

    .line 103
    invoke-static {v11, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    mul-int v7, v7, v2

    add-int/lit8 v11, v4, 0x4

    .line 107
    invoke-static {v11, p2}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v11

    mul-int v11, v11, v6

    add-int/2addr v11, v8

    .line 108
    invoke-static {v11, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v8

    mul-int v8, v8, v2

    add-int/lit8 v11, v4, 0x8

    .line 112
    invoke-static {v11, p2}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v11

    mul-int v11, v11, v6

    add-int/2addr v11, v9

    .line 113
    invoke-static {v11, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v9

    mul-int v9, v9, v2

    add-int/lit8 v11, v4, 0xc

    .line 117
    invoke-static {v11, p2}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v11

    mul-int v11, v11, v6

    add-int/2addr v11, v10

    .line 118
    invoke-static {v11, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v10

    mul-int v10, v10, v2

    add-int/lit8 v4, v4, 0x10

    goto :goto_1

    .line 123
    :cond_2
    iput v7, p0, Ll/ۨۨ᩵;->ۙ:I

    .line 124
    iput v8, p0, Ll/ۨۨ᩵;->ۗ:I

    .line 125
    iput v9, p0, Ll/ۨۨ᩵;->۬:I

    .line 126
    iput v10, p0, Ll/ۨۨ᩵;->۫:I

    if-ge v4, p1, :cond_3

    sub-int/2addr p1, v4

    .line 130
    invoke-static {p2, v4, v3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 131
    iput p1, p0, Ll/ۨۨ᩵;->᩸:I

    :cond_3
    return-void
.end method
