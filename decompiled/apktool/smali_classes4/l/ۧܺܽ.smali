.class public final Ll/ۧܺܽ;
.super Ljava/lang/Object;
.source "N53S"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 17

    .line 107
    invoke-virtual/range {p1 .. p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷ܽ;

    invoke-virtual {v0}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    .line 108
    invoke-virtual/range {p1 .. p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 110
    new-instance v2, Ll/ۨ᩷ܽ;

    invoke-direct {v2}, Ll/ۨ᩷ܽ;-><init>()V

    .line 116
    array-length v3, v1

    const/4 v4, 0x2

    shr-int/2addr v3, v4

    new-array v5, v3, [I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v7, v3, :cond_0

    add-int/lit8 v9, v8, 0x1

    .line 118
    aget-byte v10, v1, v8

    and-int/lit16 v10, v10, 0xff

    add-int/lit8 v11, v8, 0x2

    aget-byte v9, v1, v9

    not-int v9, v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    or-int/2addr v9, v10

    add-int/lit8 v10, v8, 0x3

    aget-byte v11, v1, v11

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x10

    or-int/2addr v9, v11

    add-int/lit8 v8, v8, 0x4

    aget-byte v10, v1, v10

    not-int v10, v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x18

    or-int/2addr v9, v10

    aput v9, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 122
    :cond_0
    aget v1, v0, v6

    const/4 v6, 0x1

    aget v7, v0, v6

    aget v4, v0, v4

    const/4 v8, 0x3

    aget v0, v0, v8

    const/4 v8, 0x0

    :goto_1
    const v10, 0x61c88647

    if-ge v8, v3, :cond_2

    .line 124
    aget v11, v5, v8

    add-int/lit8 v12, v8, 0x1

    .line 125
    aget v13, v5, v12

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_2
    const/16 v9, 0x40

    if-ge v14, v9, :cond_1

    sub-int/2addr v15, v10

    shl-int/lit8 v9, v13, 0x4

    add-int/2addr v9, v1

    add-int v16, v13, v15

    xor-int v9, v9, v16

    shr-int/lit8 v16, v13, 0x5

    add-int v16, v16, v7

    xor-int v9, v9, v16

    add-int/2addr v11, v9

    shl-int/lit8 v9, v11, 0x4

    add-int/2addr v9, v4

    add-int v16, v11, v15

    xor-int v9, v9, v16

    shr-int/lit8 v16, v11, 0x5

    add-int v16, v16, v0

    xor-int v9, v9, v16

    add-int/2addr v13, v9

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    .line 132
    :cond_1
    aput v11, v5, v8

    .line 133
    aput v13, v5, v12

    add-int/lit8 v8, v8, 0x2

    goto :goto_1

    :cond_2
    sub-int/2addr v3, v6

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v3, :cond_4

    .line 137
    aget v8, v5, v6

    .line 138
    aget v9, v5, v3

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x10

    :goto_4
    if-ge v11, v13, :cond_3

    sub-int/2addr v12, v10

    shl-int/lit8 v14, v9, 0x4

    add-int/2addr v14, v1

    add-int v15, v9, v12

    xor-int/2addr v14, v15

    shr-int/lit8 v15, v9, 0x5

    add-int/2addr v15, v7

    xor-int/2addr v14, v15

    add-int/2addr v8, v14

    shl-int/lit8 v14, v8, 0x4

    add-int/2addr v14, v4

    add-int v15, v8, v12

    xor-int/2addr v14, v15

    shr-int/lit8 v15, v8, 0x5

    add-int/2addr v15, v0

    xor-int/2addr v14, v15

    add-int/2addr v9, v14

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 145
    :cond_3
    aput v8, v5, v6

    .line 146
    aput v9, v5, v3

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 111
    :cond_4
    invoke-virtual {v2, v5}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    .line 112
    invoke-virtual {v0, v2}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
