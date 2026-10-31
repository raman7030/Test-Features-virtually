.class public final Ll/᩷ܰۜ;
.super Ljava/lang/Object;
.source "56JK"


# direct methods
.method public static ֫(Ll/᩺ۨۜ;Ll/ܶۨۜ;Ll/᩶ۛۜ;JLl/ܰܰۜ;Ll/ܿۖ᩷;Ll/᩶ۨۜ;)Ll/᩹ۨۜ;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    .line 19
    iget-object v5, v0, Ll/ܶۨۜ;->ܳ:Ll/ۤۛۡ;

    iget-object v6, v0, Ll/ܶۨۜ;->᩻:Ll/ۨۨۜ;

    .line 20
    new-instance v7, Landroid/graphics/Rect;

    iget v0, v5, Ll/ۤۛۡ;->ܺ:I

    iget v8, v5, Ll/ۤۛۡ;->ᩳ:I

    const/4 v9, 0x0

    invoke-direct {v7, v9, v9, v0, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 21
    invoke-virtual/range {p2 .. p2}, Ll/᩶ۛۜ;->֫()J

    move-result-wide v9

    move-wide/from16 v11, p3

    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    const/4 v0, 0x1

    const/4 v11, 0x1

    :goto_0
    if-lez v11, :cond_9

    const/high16 v0, 0x40000000    # 2.0f

    if-gt v11, v0, :cond_9

    .line 23
    invoke-static/range {p6 .. p6}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 24
    iget v0, v5, Ll/ۤۛۡ;->ܺ:I

    invoke-static {v0, v11}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v12

    long-to-int v13, v12

    .line 25
    invoke-static {v8, v11}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v14

    long-to-int v12, v14

    int-to-long v14, v13

    int-to-long v0, v12

    mul-long v14, v14, v0

    const-wide/16 v0, 0x4

    mul-long v0, v0, v14

    .line 27
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p1, v8

    const/16 v8, 0x800

    if-gt v13, v8, :cond_3

    if-gt v12, v8, :cond_3

    const-wide/32 v16, 0x400000

    cmp-long v8, v14, v16

    if-gtz v8, :cond_3

    cmp-long v8, v0, v9

    if-lez v8, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v3, :cond_2

    .line 31
    :try_start_0
    invoke-virtual {v3, v7, v11, v2, v4}, Ll/ܰܰۜ;->֫(Landroid/graphics/Rect;ILl/᩶ۛۜ;Ll/ܿۖ᩷;)Ll/᩹ۨۜ;

    move-result-object v0
    :try_end_0
    .catch Ll/֨ۨۜ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object v1, v0

    const/4 v0, 0x1

    if-ne v13, v0, :cond_3

    if-eq v12, v0, :cond_1

    goto :goto_1

    .line 34
    :cond_1
    throw v1

    :cond_2
    const/4 v8, 0x1

    const/4 v14, 0x0

    .line 38
    invoke-virtual {v5, v14}, Ll/ۤۛۡ;->֫(Z)J

    move-result-wide v14

    add-long/2addr v14, v0

    add-long/2addr v14, v0

    .line 39
    invoke-virtual {v2, v14, v15}, Ll/᩶ۛۜ;->֫(J)Ll/᩹ۛۜ;

    move-result-object v1

    if-nez v1, :cond_4

    if-ne v13, v8, :cond_3

    if-eq v12, v8, :cond_9

    :cond_3
    :goto_1
    move-object/from16 v8, p0

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    move-object/from16 v8, p0

    .line 46
    :try_start_1
    invoke-virtual {v8, v6}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 47
    invoke-virtual/range {p0 .. p0}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 48
    :try_start_2
    invoke-static {v3}, Ll/᩺ۛۡ;->֫(Ljava/io/InputStream;)Ll/ۤۛۡ;

    move-result-object v0

    invoke-virtual {v5, v0}, Ll/ۤۛۡ;->֫(Ll/ۤۛۡ;)V

    .line 49
    invoke-static {v3, v5, v7, v11, v4}, Ll/᩺ۛۡ;->֫(Ljava/io/InputStream;Ll/ۤۛۡ;Landroid/graphics/Rect;ILl/ܿۖ᩷;)Landroid/graphics/Bitmap;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_5

    .line 51
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 52
    :cond_5
    invoke-virtual {v8, v6}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 53
    invoke-static/range {p6 .. p6}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 54
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v0

    int-to-long v3, v0

    invoke-virtual {v1, v3, v4}, Ll/᩹ۛۜ;->ۧ(J)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 56
    new-instance v0, Ll/᩹ۨۜ;

    invoke-direct {v0, v2, v1, v11}, Ll/᩹ۨۜ;-><init>(Landroid/graphics/Bitmap;Ll/᩹ۛۜ;I)V

    return-object v0

    .line 55
    :cond_6
    new-instance v0, Ll/֨ۨۜ;

    const-string v3, "TGA preview allocation exceeds budget"

    .line 330
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 55
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_0
    move-exception v0

    move-object v4, v0

    if-eqz v3, :cond_7

    .line 47
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_5
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_2
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    if-eqz v2, :cond_8

    .line 61
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 62
    :cond_8
    invoke-virtual {v1}, Ll/᩹ۛۜ;->close()V

    .line 63
    throw v0

    :goto_3
    mul-int/lit8 v11, v11, 0x2

    move-object v1, v8

    move/from16 v8, p1

    goto/16 :goto_0

    .line 65
    :cond_9
    new-instance v0, Ll/֨ۨۜ;

    const-string v1, "TGA preview does not fit bitmap budget"

    .line 330
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 65
    throw v0
.end method
