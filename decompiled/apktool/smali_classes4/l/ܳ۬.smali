.class public final Ll/ܳ۬;
.super Ljava/lang/Object;
.source "7553"


# direct methods
.method public static ֫([Ll/ܿ۬;Landroid/graphics/Path;)V
    .locals 7

    const/4 v0, 0x6

    new-array v0, v0, [F

    .line 383
    array-length v1, p0

    const/16 v2, 0x6d

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p0, v3

    .line 384
    invoke-static {v4}, Ll/ܿ۬;->֫(Ll/ܿ۬;)C

    move-result v5

    .line 385
    invoke-static {v4}, Ll/ܿ۬;->ۧ(Ll/ܿ۬;)[F

    move-result-object v6

    .line 384
    invoke-static {p1, v0, v2, v5, v6}, Ll/ܿ۬;->֫(Landroid/graphics/Path;[FCC[F)V

    .line 386
    invoke-static {v4}, Ll/ܿ۬;->֫(Ll/ܿ۬;)C

    move-result v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫([Ll/ܿ۬;[Ll/ܿ۬;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    if-nez p1, :cond_0

    goto :goto_2

    .line 146
    :cond_0
    array-length v1, p0

    array-length v2, p1

    if-eq v1, v2, :cond_1

    return v0

    :cond_1
    const/4 v1, 0x0

    .line 150
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_4

    .line 151
    aget-object v2, p0, v1

    invoke-static {v2}, Ll/ܿ۬;->֫(Ll/ܿ۬;)C

    move-result v2

    aget-object v3, p1, v1

    invoke-static {v3}, Ll/ܿ۬;->֫(Ll/ܿ۬;)C

    move-result v3

    if-ne v2, v3, :cond_3

    aget-object v2, p0, v1

    .line 152
    invoke-static {v2}, Ll/ܿ۬;->ۧ(Ll/ܿ۬;)[F

    move-result-object v2

    array-length v2, v2

    aget-object v3, p1, v1

    invoke-static {v3}, Ll/ܿ۬;->ۧ(Ll/ܿ۬;)[F

    move-result-object v3

    array-length v3, v3

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0

    :cond_4
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_2
    return v0
.end method

.method public static ֫(I[F)[F
    .locals 2

    if-ltz p0, :cond_1

    .line 59
    array-length v0, p1

    if-ltz v0, :cond_0

    .line 64
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 65
    new-array p0, p0, [F

    const/4 v1, 0x0

    .line 66
    invoke-static {p1, v1, p0, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0

    .line 61
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p0

    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)[Ll/ܿ۬;
    .locals 16

    move-object/from16 v0, p0

    .line 98
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 99
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v3, v5, :cond_f

    .line 181
    :goto_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v6, 0x45

    const/16 v7, 0x65

    if-ge v3, v5, :cond_2

    .line 182
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    add-int/lit8 v8, v5, -0x41

    add-int/lit8 v9, v5, -0x5a

    mul-int v9, v9, v8

    if-lez v9, :cond_0

    add-int/lit8 v8, v5, -0x61

    add-int/lit8 v9, v5, -0x7a

    mul-int v9, v9, v8

    if-gtz v9, :cond_1

    :cond_0
    if-eq v5, v7, :cond_1

    if-eq v5, v6, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 101
    :cond_2
    :goto_2
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 102
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_e

    .line 218
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v8, 0x7a

    if-eq v5, v8, :cond_d

    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v8, 0x5a

    if-ne v5, v8, :cond_3

    goto/16 :goto_9

    .line 222
    :cond_3
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v2

    new-array v2, v2, [F

    .line 228
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v8, 0x1

    const/4 v9, 0x0

    :goto_3
    if-ge v8, v5, :cond_c

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v14, v8

    .line 270
    :goto_4
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v14, v15, :cond_9

    .line 273
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const/16 v7, 0x20

    if-eq v15, v7, :cond_7

    const/16 v7, 0x65

    if-eq v15, v6, :cond_6

    if-eq v15, v7, :cond_6

    packed-switch v15, :pswitch_data_0

    goto :goto_5

    :pswitch_0
    if-nez v11, :cond_4

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_6

    :pswitch_1
    if-eq v14, v8, :cond_5

    if-nez v10, :cond_5

    :cond_4
    const/4 v10, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x1

    goto :goto_6

    :cond_5
    :goto_5
    const/4 v10, 0x0

    goto :goto_6

    :cond_6
    const/4 v10, 0x1

    goto :goto_6

    :cond_7
    const/16 v7, 0x65

    :pswitch_2
    const/4 v10, 0x0

    const/4 v12, 0x1

    :goto_6
    if-eqz v12, :cond_8

    goto :goto_7

    :cond_8
    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    :cond_9
    :goto_7
    if-ge v8, v14, :cond_a

    add-int/lit8 v10, v9, 0x1

    .line 239
    invoke-virtual {v4, v8, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 238
    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v8

    aput v8, v2, v9

    move v9, v10

    :cond_a
    if-eqz v13, :cond_b

    goto :goto_8

    :cond_b
    add-int/lit8 v14, v14, 0x1

    :goto_8
    move v8, v14

    goto :goto_3

    .line 249
    :cond_c
    invoke-static {v9, v2}, Ll/ܳ۬;->֫(I[F)[F

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v5, 0x0

    move-object v5, v2

    const/4 v2, 0x0

    goto :goto_a

    :catch_0
    move-exception v0

    .line 251
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "error in parsing \""

    const-string v3, "\""

    .line 0
    invoke-static {v2, v4, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 251
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 219
    :cond_d
    :goto_9
    new-array v5, v2, [F

    .line 104
    :goto_a
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 197
    new-instance v4, Ll/ܿ۬;

    invoke-direct {v4, v2, v5}, Ll/ܿ۬;-><init>(C[F)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    add-int/lit8 v2, v3, 0x1

    const/4 v4, 0x0

    move v4, v3

    move v3, v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_f
    sub-int/2addr v3, v4

    const/4 v2, 0x1

    if-ne v3, v2, :cond_10

    .line 110
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v4, v2, :cond_10

    .line 111
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/4 v2, 0x0

    new-array v3, v2, [F

    .line 197
    new-instance v4, Ll/ܿ۬;

    invoke-direct {v4, v0, v3}, Ll/ܿ۬;-><init>(C[F)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_10
    const/4 v2, 0x0

    .line 113
    :goto_b
    new-array v0, v2, [Ll/ܿ۬;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܿ۬;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫([Ll/ܿ۬;)[Ll/ܿ۬;
    .locals 4

    .line 125
    array-length v0, p0

    new-array v0, v0, [Ll/ܿ۬;

    const/4 v1, 0x0

    .line 126
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    .line 127
    new-instance v2, Ll/ܿ۬;

    aget-object v3, p0, v1

    invoke-direct {v2, v3}, Ll/ܿ۬;-><init>(Ll/ܿ۬;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Landroid/graphics/Path;
    .locals 3

    .line 78
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 79
    invoke-static {p0}, Ll/ܳ۬;->֫(Ljava/lang/String;)[Ll/ܿ۬;

    move-result-object v1

    .line 438
    :try_start_0
    invoke-static {v1, v0}, Ll/ܳ۬;->֫([Ll/ܿ۬;Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 83
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error in parsing "

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ۧ([Ll/ܿ۬;[Ll/ܿ۬;)V
    .locals 4

    const/4 v0, 0x0

    .line 170
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 171
    aget-object v1, p0, v0

    aget-object v2, p1, v0

    invoke-static {v2}, Ll/ܿ۬;->֫(Ll/ܿ۬;)C

    move-result v2

    invoke-static {v1, v2}, Ll/ܿ۬;->֫(Ll/ܿ۬;C)V

    const/4 v1, 0x0

    .line 172
    :goto_1
    aget-object v2, p1, v0

    invoke-static {v2}, Ll/ܿ۬;->ۧ(Ll/ܿ۬;)[F

    move-result-object v2

    array-length v2, v2

    if-ge v1, v2, :cond_0

    .line 173
    aget-object v2, p0, v0

    invoke-static {v2}, Ll/ܿ۬;->ۧ(Ll/ܿ۬;)[F

    move-result-object v2

    aget-object v3, p1, v0

    invoke-static {v3}, Ll/ܿ۬;->ۧ(Ll/ܿ۬;)[F

    move-result-object v3

    aget v3, v3, v1

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
