.class public final Ll/ܺ᩸ᩳ;
.super Ljava/lang/Object;
.source "Q92M"


# direct methods
.method public static ֫(Ll/۟᩸ᩳ;IILjava/nio/charset/Charset;ILjava/lang/Runnable;Ll/ۖ᩸ᩳ;Ljava/io/OutputStreamWriter;Z)Ll/ۡ᩸ᩳ;
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    sub-int v7, v2, v1

    int-to-long v11, v7

    const/4 v7, 0x0

    if-eqz p8, :cond_0

    .line 148
    new-instance v8, Ll/ۢ᩸ᩳ;

    .line 136
    invoke-direct {v8}, Ljava/io/OutputStream;-><init>()V

    goto :goto_0

    :cond_0
    move-object v8, v7

    :goto_0
    if-nez v8, :cond_1

    goto :goto_1

    .line 150
    :cond_1
    new-instance v7, Ljava/io/OutputStreamWriter;

    invoke-direct {v7, v8, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    :goto_1
    const v9, 0x8000

    :try_start_0
    new-array v10, v9, [C

    move v13, v1

    :goto_2
    if-ge v13, v2, :cond_6

    .line 153
    invoke-interface/range {p5 .. p5}, Ljava/lang/Runnable;->run()V

    sub-int v14, v2, v13

    .line 154
    invoke-static {v9, v14}, Ljava/lang/Math;->min(II)I

    move-result v9

    add-int/2addr v9, v13

    invoke-static {v2, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    move v14, v13

    :goto_3
    if-ge v14, v9, :cond_3

    sub-int v15, v14, v13

    move-wide/from16 v16, v11

    .line 156
    invoke-virtual {v0, v14}, Ll/۟᩸ᩳ;->charAt(I)C

    move-result v11

    aput-char v11, v10, v15

    if-eqz v5, :cond_2

    .line 157
    invoke-virtual {v5, v11}, Ll/ۖ᩸ᩳ;->֫(C)V

    :cond_2
    add-int/lit8 v14, v14, 0x1

    move-wide/from16 v11, v16

    goto :goto_3

    :cond_3
    move-wide/from16 v16, v11

    const/4 v11, 0x0

    if-eqz v7, :cond_4

    sub-int v12, v9, v13

    .line 159
    invoke-virtual {v7, v10, v11, v12}, Ljava/io/Writer;->write([CII)V

    :cond_4
    if-eqz v6, :cond_5

    sub-int v12, v9, v13

    .line 160
    invoke-virtual {v6, v10, v11, v12}, Ljava/io/Writer;->write([CII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    const v11, 0x8000

    move v13, v9

    move-wide/from16 v11, v16

    const v9, 0x8000

    goto :goto_2

    :cond_6
    move-wide/from16 v16, v11

    if-eqz v7, :cond_7

    .line 163
    invoke-virtual {v7}, Ljava/io/Writer;->close()V

    :cond_7
    const-wide/16 v5, 0x0

    if-nez v8, :cond_8

    move-wide v7, v5

    goto :goto_4

    .line 164
    :cond_8
    iget-wide v7, v8, Ll/ۢ᩸ᩳ;->᩸:J

    :goto_4
    const-string v9, "\\b[\\p{L}\\d]+\\b"

    .line 167
    invoke-static {v9}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v9

    invoke-virtual {v9, v0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v9

    .line 168
    invoke-virtual {v9}, Ll/۫ۘܽ;->ۡ()V

    invoke-virtual {v9, v4}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    .line 169
    invoke-virtual {v9, v1, v2}, Ll/۫ۘܽ;->region(II)V

    move-wide v13, v5

    .line 170
    :goto_5
    invoke-virtual {v9}, Ll/۫ۘܽ;->find()Z

    move-result v10

    const-wide/16 v11, 0x1

    if-eqz v10, :cond_9

    add-long/2addr v13, v11

    goto :goto_5

    :cond_9
    const-string v9, "[\\u4e00-\\u9fa5]"

    .line 175
    invoke-static {v9}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v9

    invoke-virtual {v9, v0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v9

    .line 176
    invoke-virtual {v9}, Ll/۫ۘܽ;->ۡ()V

    invoke-virtual {v9, v4}, Ll/۫ۘܽ;->֫(Ljava/lang/Runnable;)V

    .line 177
    invoke-virtual {v9, v1, v2}, Ll/۫ۘܽ;->region(II)V

    .line 178
    :goto_6
    invoke-virtual {v9}, Ll/۫ۘܽ;->find()Z

    move-result v4

    if-eqz v4, :cond_a

    add-long/2addr v5, v11

    goto :goto_6

    :cond_a
    const-string v4, "\n"

    .line 182
    invoke-virtual {v4, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    array-length v3, v3

    sub-int v3, p4, v3

    move-wide v9, v7

    move-wide/from16 v18, v11

    :goto_7
    if-ge v1, v2, :cond_c

    .line 185
    invoke-virtual {v0, v1}, Ll/۟᩸ᩳ;->charAt(I)C

    move-result v4

    const/16 v7, 0xa

    if-ne v4, v7, :cond_b

    add-long v18, v18, v11

    if-eqz p8, :cond_b

    int-to-long v7, v3

    add-long/2addr v9, v7

    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 191
    :cond_c
    new-instance v0, Ll/ۡ᩸ᩳ;

    const/4 v1, 0x0

    move-object v8, v0

    move-wide/from16 v11, v16

    move-wide v15, v5

    move-wide/from16 v17, v18

    move/from16 v19, v1

    invoke-direct/range {v8 .. v19}, Ll/ۡ᩸ᩳ;-><init>(JJJJJI)V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    if-eqz v7, :cond_d

    .line 150
    :try_start_1
    invoke-virtual {v7}, Ljava/io/Writer;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_d
    :goto_8
    throw v1
.end method
