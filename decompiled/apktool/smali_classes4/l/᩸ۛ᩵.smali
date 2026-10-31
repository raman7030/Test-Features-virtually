.class public final Ll/᩸ۛ᩵;
.super Ljava/lang/Object;


# direct methods
.method public static final ֫()I
    .locals 1

    .line 1
    invoke-static {}, Ll/᩹ۛ᩵;->֫()I

    move-result v0

    return v0
.end method

.method public static ֫(IILjava/lang/String;)I
    .locals 7

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    goto :goto_0

    :cond_0
    const p1, 0x1ffffe

    :goto_0
    int-to-long v1, p0

    const/4 p0, 0x1

    int-to-long v3, p0

    int-to-long v5, p1

    move-object v0, p2

    .line 35
    invoke-static/range {v0 .. v6}, Ll/᩸ۛ᩵;->֫(Ljava/lang/String;JJJ)J

    move-result-wide p0

    long-to-int p1, p0

    return p1
.end method

.method public static final ֫(Ljava/lang/String;JJJ)J
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v1, p3

    move-wide/from16 v3, p5

    .line 50
    invoke-static/range {p0 .. p0}, Ll/᩸ۛ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    return-wide p1

    .line 164
    :cond_0
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    const/4 v7, 0x0

    .line 171
    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x30

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v8, v9, :cond_5

    const/4 v7, 0x1

    if-ne v6, v7, :cond_2

    goto :goto_2

    :cond_2
    const/16 v9, 0x2b

    if-eq v8, v9, :cond_4

    const/16 v9, 0x2d

    if-eq v8, v9, :cond_3

    goto :goto_2

    :cond_3
    const-wide/high16 v10, -0x8000000000000000L

    const/4 v8, 0x1

    goto :goto_0

    :cond_4
    const/4 v7, 0x1

    :cond_5
    const/4 v8, 0x0

    move v8, v7

    const/4 v7, 0x0

    :goto_0
    const-wide/16 v12, 0x0

    const-wide v14, -0x38e38e38e38e38eL    # -2.772000429909333E291

    :goto_1
    if-ge v8, v6, :cond_a

    .line 197
    invoke-virtual {v5, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const-wide v16, -0x38e38e38e38e38eL    # -2.772000429909333E291

    move/from16 p1, v6

    const/16 v6, 0xa

    .line 303
    invoke-static {v9, v6}, Ljava/lang/Character;->digit(II)I

    move-result v9

    if-gez v9, :cond_6

    goto :goto_2

    :cond_6
    cmp-long v18, v12, v14

    if-gez v18, :cond_7

    cmp-long v18, v14, v16

    if-nez v18, :cond_8

    int-to-long v14, v6

    .line 202
    div-long v14, v10, v14

    cmp-long v16, v12, v14

    if-gez v16, :cond_7

    goto :goto_2

    :cond_7
    move-wide/from16 v16, v14

    int-to-long v14, v6

    mul-long v12, v12, v14

    int-to-long v14, v9

    add-long v18, v10, v14

    cmp-long v6, v12, v18

    if-gez v6, :cond_9

    :cond_8
    :goto_2
    const/4 v6, 0x0

    goto :goto_3

    :cond_9
    sub-long/2addr v12, v14

    add-int/lit8 v8, v8, 0x1

    move/from16 v6, p1

    move-wide/from16 v14, v16

    goto :goto_1

    :cond_a
    if-eqz v7, :cond_b

    .line 219
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_3

    :cond_b
    neg-long v6, v12

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_3
    const/16 v7, 0x27

    const-string v8, "System property \'"

    if-eqz v6, :cond_d

    .line 51
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v9, v1, v5

    if-gtz v9, :cond_c

    cmp-long v9, v5, v3

    if-gtz v9, :cond_c

    return-wide v5

    .line 53
    :cond_c
    new-instance v9, Ljava/lang/IllegalStateException;

    .line 54
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' should be in range "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ".."

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", but is \'"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 51
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' has unrecognized value \'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget v0, Ll/᩹ۛ᩵;->֫:I

    .line 17
    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method
