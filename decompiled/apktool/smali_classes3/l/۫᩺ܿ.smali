.class public final Ll/۫᩺ܿ;
.super Ljava/lang/Object;
.source "P70J"


# static fields
.field public static final ֫:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 35
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    sput-object v0, Ll/۫᩺ܿ;->֫:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static ֫(Ljava/io/DataInput;)Ljava/lang/String;
    .locals 4

    .line 374
    check-cast p0, Ll/᩹᩺ܿ;

    invoke-virtual {p0}, Ll/᩹᩺ܿ;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/high16 v2, 0x100000

    if-gt v0, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "Invalid hex checkpoint path length"

    .line 375
    invoke-static {v3, v2}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    .line 376
    new-array v2, v0, [B

    .line 584
    invoke-virtual {p0, v2, v1, v0}, Ll/᩹᩺ܿ;->readFully([BII)V

    .line 378
    new-instance p0, Ljava/lang/String;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v2, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p0
.end method

.method public static ֫()Ljava/util/concurrent/Executor;
    .locals 1

    .line 51
    sget-object v0, Ll/۫᩺ܿ;->֫:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static ֫(Ll/᩺ܰܿ;Ll/۠ܰܿ;ZLl/ᩳܽܳ;ZZZLjava/util/concurrent/Executor;)Ll/ۛܰܿ;
    .locals 11

    move-object/from16 v0, p7

    const-string v1, "target"

    move-object v3, p1

    .line 71
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v1, "executor"

    .line 73
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    if-eqz p4, :cond_0

    goto :goto_0

    .line 75
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Direct source does not need a lightweight checkpoint"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-eqz p5, :cond_3

    if-nez p2, :cond_2

    if-nez p4, :cond_2

    .line 77
    invoke-virtual {p3}, Ll/ᩳܽܳ;->ᩴ()Z

    move-result v1

    if-nez v1, :cond_2

    .line 78
    invoke-virtual {p3}, Ll/ᩳܽܳ;->length()I

    move-result v1

    const v2, 0x7fffffff

    if-ne v1, v2, :cond_2

    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid partial hex checkpoint"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ll/᩺ܰܿ;->֫()Ll/ۛܰܿ;

    move-result-object v9

    if-eqz p4, :cond_4

    .line 84
    :try_start_0
    invoke-virtual {p3}, Ll/ᩳܽܳ;->᩻()Ll/ۡۧܳ;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_4

    .line 87
    :try_start_1
    invoke-virtual {v9, v1}, Ll/ۛܰܿ;->֫(Ll/ۡۧܳ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    :goto_2
    move-object v2, v0

    .line 92
    :try_start_2
    invoke-virtual {v1}, Ll/ۡۧܳ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_3

    :catch_3
    move-exception v0

    move-object v1, v0

    .line 94
    :try_start_3
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 97
    :goto_3
    throw v2

    .line 100
    :cond_4
    invoke-virtual {p3}, Ll/ᩳܽܳ;->ۜ()Ll/᩷ۧܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۧܳ;->ܽ()J

    move-result-wide v1

    invoke-virtual {v9, v1, v2}, Ll/ۛܰܿ;->֫(J)V

    .line 102
    :goto_4
    new-instance v10, Ll/۠᩺ܿ;

    move-object v1, v10

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p4

    move/from16 v6, p5

    move-object v7, v9

    move/from16 v8, p6

    invoke-direct/range {v1 .. v8}, Ll/۠᩺ܿ;-><init>(Ll/᩺ܰܿ;Ll/۠ܰܿ;ZZZLl/ۛܰܿ;Z)V

    invoke-interface {v0, v10}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_4

    return-object v9

    :catch_4
    move-exception v0

    goto :goto_5

    :catch_5
    move-exception v0

    goto :goto_5

    :catch_6
    move-exception v0

    .line 106
    :goto_5
    invoke-virtual {v9, v0}, Ll/ۛܰܿ;->֫(Ljava/lang/Throwable;)V

    .line 107
    throw v0
.end method

.method public static ֫(Ll/᩺ܰܿ;Ll/ܶ᩵ܿ;Ll/ܺ᩺ܿ;)Ll/۬᩺ܿ;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "target"

    .line 241
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 243
    invoke-static/range {p2 .. p2}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object v1

    .line 244
    invoke-static {v1}, Ll/۫᩺ܿ;->ۧ(Ll/ܿۖ᩷;)V

    .line 248
    :try_start_0
    new-instance v2, Ll/᩶᩺ܿ;

    invoke-virtual/range {p0 .. p0}, Ll/᩺ܰܿ;->᩷()Ljava/io/BufferedInputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/᩶᩺ܿ;-><init>(Ljava/io/BufferedInputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_6

    .line 249
    :try_start_1
    new-instance v3, Ljava/io/DataInputStream;

    invoke-direct {v3, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    .line 250
    :try_start_2
    new-instance v4, Ll/᩹᩺ܿ;

    invoke-direct {v4, v3, v1}, Ll/᩹᩺ܿ;-><init>(Ljava/io/DataInputStream;Ll/ܿۖ᩷;)V

    .line 251
    invoke-virtual {v4}, Ll/᩹᩺ܿ;->readInt()I

    move-result v5

    const v6, 0x4d544858    # 2.22594432E8f

    if-ne v5, v6, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const-string v6, "Invalid hex checkpoint magic"

    invoke-static {v6, v5}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    .line 252
    invoke-virtual {v4}, Ll/᩹᩺ܿ;->readInt()I

    move-result v5

    const/4 v6, 0x6

    const/4 v7, 0x7

    if-eq v5, v6, :cond_2

    if-ne v5, v7, :cond_1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v6, 0x1

    :goto_2
    const-string v7, "Unsupported hex checkpoint version"

    .line 253
    invoke-static {v7, v6}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    .line 254
    invoke-virtual/range {p1 .. p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4}, Ll/۫᩺ܿ;->֫(Ljava/io/DataInput;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "Hex checkpoint target mismatch"

    invoke-static {v7, v6}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    .line 255
    invoke-static {v4}, Ll/۫᩺ܿ;->֫(Ljava/io/DataInput;)Ljava/lang/String;

    move-result-object v6

    .line 256
    invoke-virtual {v4}, Ll/᩹᩺ܿ;->readBoolean()Z

    move-result v7

    .line 257
    new-instance v8, Ll/֫ۧܳ;

    invoke-virtual {v4}, Ll/᩹᩺ܿ;->readLong()J

    move-result-wide v9

    invoke-virtual {v4}, Ll/᩹᩺ܿ;->readLong()J

    move-result-wide v11

    invoke-direct {v8, v9, v10, v11, v12}, Ll/֫ۧܳ;-><init>(JJ)V

    .line 258
    new-instance v9, Ll/֫ۧܳ;

    invoke-virtual {v4}, Ll/᩹᩺ܿ;->readLong()J

    move-result-wide v10

    invoke-virtual {v4}, Ll/᩹᩺ܿ;->readLong()J

    move-result-wide v12

    invoke-direct {v9, v10, v11, v12, v13}, Ll/֫ۧܳ;-><init>(JJ)V

    .line 259
    invoke-virtual {v4}, Ll/᩹᩺ܿ;->readBoolean()Z

    move-result v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    const/4 v11, 0x7

    if-lt v5, v11, :cond_3

    .line 261
    :try_start_3
    invoke-virtual {v4}, Ll/᩹᩺ܿ;->readBoolean()Z

    move-result v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v11, :cond_3

    const/4 v11, 0x1

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :cond_3
    const/4 v11, 0x0

    :goto_3
    if-eqz v7, :cond_5

    if-eqz v10, :cond_4

    goto :goto_4

    :cond_4
    const/4 v12, 0x0

    goto :goto_5

    :cond_5
    :goto_4
    const/4 v12, 0x1

    :goto_5
    :try_start_4
    const-string v13, "Invalid lightweight direct checkpoint"

    .line 262
    invoke-static {v13, v12}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    const-wide/32 v12, 0x7fffffff

    const/4 v14, 0x7

    if-lt v5, v14, :cond_6

    if-eqz v7, :cond_7

    .line 266
    :cond_6
    invoke-virtual {v8}, Ll/֫ۧܳ;->ۧ()J

    move-result-wide v14

    cmp-long v5, v14, v12

    if-gtz v5, :cond_8

    :cond_7
    const/4 v5, 0x1

    goto :goto_6

    :cond_8
    const/4 v5, 0x0

    :goto_6
    const-string v14, "Hex checkpoint target is too large"

    .line 265
    invoke-static {v14, v5}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    .line 268
    invoke-virtual {v9}, Ll/֫ۧܳ;->ۧ()J

    move-result-wide v14

    cmp-long v5, v14, v12

    if-gtz v5, :cond_9

    const/4 v5, 0x1

    goto :goto_7

    :cond_9
    const/4 v5, 0x0

    :goto_7
    const-string v14, "Hex checkpoint base is too large"

    invoke-static {v14, v5}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    if-eqz v11, :cond_b

    if-nez v7, :cond_a

    if-nez v10, :cond_a

    .line 271
    :try_start_5
    invoke-virtual {v9}, Ll/֫ۧܳ;->ۧ()J

    move-result-wide v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    cmp-long v5, v14, v12

    if-nez v5, :cond_a

    goto :goto_8

    :cond_a
    const/4 v5, 0x0

    goto :goto_9

    :cond_b
    :goto_8
    const/4 v5, 0x1

    :goto_9
    :try_start_6
    const-string v12, "Invalid partial hex checkpoint"

    .line 270
    invoke-static {v12, v5}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    if-eqz v7, :cond_c

    .line 274
    :try_start_7
    invoke-static {v0, v6, v8}, Ll/۠ܰܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/֫ۧܳ;)Ll/۠ܰܿ;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_a

    .line 275
    :cond_c
    :try_start_8
    invoke-static {v0, v6, v8}, Ll/۠ܰܿ;->ۧ(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/֫ۧܳ;)Ll/۠ܰܿ;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    :goto_a
    const-string v5, "Hex checkpoint base mismatch"

    if-eqz v7, :cond_d

    .line 278
    :try_start_9
    invoke-virtual {v0}, Ll/۠ܰܿ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 279
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v12

    const-string v13, "Hex checkpoint source type mismatch"

    invoke-static {v13, v12}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    .line 281
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->᩷()Ll/ܺ֡ܿ;

    move-result-object v6

    invoke-static {v6}, Ll/ۚܽܳ;->֫(Ll/ܺ֡ܿ;)Ll/ۚܽܳ;

    move-result-object v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 282
    :try_start_a
    invoke-virtual {v6}, Ll/ۚܽܳ;->֫()Ll/֫ۧܳ;

    move-result-object v12

    invoke-virtual {v8, v12}, Ll/֫ۧܳ;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v12, "Hex checkpoint revision mismatch"

    invoke-static {v12, v8}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    .line 283
    invoke-virtual {v6}, Ll/ۚܽܳ;->֫()Ll/֫ۧܳ;

    move-result-object v8

    invoke-virtual {v9, v8}, Ll/֫ۧܳ;->equals(Ljava/lang/Object;)Z

    move-result v8

    invoke-static {v5, v8}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_d

    :catchall_1
    move-exception v0

    goto :goto_e

    .line 285
    :cond_d
    :try_start_b
    invoke-virtual/range {p0 .. p0}, Ll/᩺ܰܿ;->ᩳ()Ll/ܺ֡ܿ;

    move-result-object v6

    .line 286
    invoke-virtual {v6}, Ll/ܺ֡ܿ;->۠֫()Z

    move-result v8
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    if-eqz v8, :cond_e

    :try_start_c
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v8
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    if-nez v8, :cond_e

    const/4 v8, 0x1

    goto :goto_c

    :goto_b
    const/4 v1, 0x0

    goto :goto_f

    :cond_e
    const/4 v8, 0x0

    :goto_c
    :try_start_d
    const-string v12, "Hex checkpoint base is unavailable"

    invoke-static {v12, v8}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    .line 289
    invoke-static {v6}, Ll/ۚܽܳ;->֫(Ll/ܺ֡ܿ;)Ll/ۚܽܳ;

    move-result-object v6
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 290
    :try_start_e
    invoke-virtual {v6}, Ll/ۚܽܳ;->֫()Ll/֫ۧܳ;

    move-result-object v8

    invoke-virtual {v9, v8}, Ll/֫ۧܳ;->equals(Ljava/lang/Object;)Z

    move-result v8

    invoke-static {v5, v8}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    :goto_d
    if-eqz v10, :cond_f

    .line 295
    :try_start_f
    new-instance v5, Ll/᩸᩺ܿ;

    move-object/from16 v8, p0

    invoke-direct {v5, v8, v2}, Ll/᩸᩺ܿ;-><init>(Ll/᩺ܰܿ;Ll/᩶᩺ܿ;)V

    invoke-static {v6, v4, v5}, Ll/ᩳܽܳ;->֫(Ll/ۚܽܳ;Ljava/io/DataInput;Ll/᩸᩺ܿ;)Ll/ᩳܽܳ;

    move-result-object v5
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    goto :goto_10

    :goto_e
    move-object v1, v6

    :goto_f
    const/4 v4, 0x0

    move-object v6, v1

    goto/16 :goto_15

    .line 301
    :cond_f
    :try_start_10
    new-instance v5, Ll/ᩳܽܳ;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    const/4 v8, 0x0

    .line 120
    :try_start_11
    invoke-direct {v5, v6, v8}, Ll/ᩳܽܳ;-><init>(Ll/ᩴܽܳ;Ljava/io/File;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 304
    :goto_10
    :try_start_12
    invoke-virtual {v4}, Ll/᩹᩺ܿ;->readInt()I

    move-result v8

    const v9, 0x5848544d

    if-ne v8, v9, :cond_10

    const/4 v8, 0x1

    goto :goto_11

    :cond_10
    const/4 v8, 0x0

    :goto_11
    const-string v9, "Invalid hex checkpoint footer"

    invoke-static {v9, v8}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    .line 305
    invoke-virtual {v2}, Ll/᩶᩺ܿ;->֫()J

    move-result-wide v8

    .line 306
    invoke-virtual {v2}, Ll/᩶᩺ܿ;->ܽ()V

    .line 307
    invoke-virtual {v4}, Ll/᩹᩺ܿ;->readLong()J

    move-result-wide v12

    cmp-long v4, v8, v12

    if-nez v4, :cond_11

    const/4 v4, 0x1

    goto :goto_12

    :cond_11
    const/4 v4, 0x0

    :goto_12
    const-string v8, "Hex checkpoint CRC mismatch"

    .line 308
    invoke-static {v8, v4}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    .line 309
    invoke-static {v1}, Ll/۫᩺ܿ;->ۧ(Ll/ܿۖ᩷;)V

    .line 310
    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    move-result v4

    const/4 v8, -0x1

    if-ne v4, v8, :cond_12

    const/4 v4, 0x1

    goto :goto_13

    :cond_12
    const/4 v4, 0x0

    :goto_13
    const-string v8, "Unexpected trailing hex checkpoint data"

    invoke-static {v8, v4}, Ll/۫᩺ܿ;->֫(Ljava/lang/String;Z)V

    .line 311
    invoke-static {v1}, Ll/۫᩺ܿ;->ۧ(Ll/ܿۖ᩷;)V

    .line 312
    invoke-virtual {v5}, Ll/ᩳܽܳ;->᩸()V

    .line 313
    invoke-static {v1}, Ll/۫᩺ܿ;->ۧ(Ll/ܿۖ᩷;)V

    .line 314
    new-instance v1, Ll/۬᩺ܿ;

    invoke-direct {v1, v5, v0, v7, v11}, Ll/۬᩺ܿ;-><init>(Ll/ᩳܽܳ;Ll/۠ܰܿ;ZZ)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 315
    :try_start_13
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    :try_start_14
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_14} :catch_1
    .catch Ljava/lang/Error; {:try_start_14 .. :try_end_14} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    goto :goto_14

    :catch_1
    move-exception v0

    goto :goto_14

    :catch_2
    move-exception v0

    :goto_14
    const/4 v1, 0x1

    move-object v1, v0

    const/4 v4, 0x1

    goto :goto_1c

    :catchall_2
    move-exception v0

    const/4 v1, 0x1

    move-object v1, v0

    const/4 v4, 0x1

    goto :goto_18

    :catchall_3
    move-exception v0

    const/4 v1, 0x1

    move-object v1, v0

    const/4 v4, 0x1

    goto :goto_16

    :catchall_4
    move-exception v0

    move-object v4, v8

    goto :goto_15

    :catchall_5
    move-exception v0

    const/4 v1, 0x0

    move-object v4, v1

    goto :goto_15

    :catchall_6
    move-exception v0

    const/4 v4, 0x0

    move-object v6, v4

    :goto_15
    const/4 v1, 0x0

    move-object v1, v0

    move-object v5, v4

    const/4 v4, 0x0

    .line 248
    :goto_16
    :try_start_15
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    goto :goto_17

    :catchall_7
    move-exception v0

    move-object v3, v0

    :try_start_16
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_17
    throw v1
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    :catchall_8
    move-exception v0

    move-object v1, v0

    goto :goto_18

    :catchall_9
    move-exception v0

    const/4 v6, 0x0

    const/4 v1, 0x0

    move-object v1, v0

    move-object v5, v6

    const/4 v4, 0x0

    :goto_18
    :try_start_17
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_a

    goto :goto_19

    :catchall_a
    move-exception v0

    move-object v2, v0

    :try_start_18
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_19
    throw v1
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_18 .. :try_end_18} :catch_4
    .catch Ljava/lang/Error; {:try_start_18 .. :try_end_18} :catch_3

    :catch_3
    move-exception v0

    goto :goto_1a

    :catch_4
    move-exception v0

    goto :goto_1a

    :catch_5
    move-exception v0

    :goto_1a
    move-object v1, v0

    goto :goto_1c

    :catch_6
    move-exception v0

    goto :goto_1b

    :catch_7
    move-exception v0

    goto :goto_1b

    :catch_8
    move-exception v0

    :goto_1b
    const/4 v6, 0x0

    const/4 v1, 0x0

    move-object v1, v0

    move-object v5, v6

    const/4 v4, 0x0

    :goto_1c
    if-nez v5, :cond_13

    if-eqz v6, :cond_14

    if-nez v4, :cond_14

    .line 324
    :try_start_19
    invoke-virtual {v6}, Ll/ۚܽܳ;->close()V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_9

    goto :goto_1d

    :catch_9
    move-exception v0

    move-object v2, v0

    .line 326
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_1d

    .line 318
    :cond_13
    :try_start_1a
    invoke-virtual {v5}, Ll/ᩳܽܳ;->close()V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_a

    goto :goto_1d

    :catch_a
    move-exception v0

    move-object v2, v0

    .line 320
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 329
    :cond_14
    :goto_1d
    throw v1
.end method

.method public static ֫(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p1, :cond_0

    return-void

    .line 383
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/ۙ᩺ܿ;Ljava/io/DataOutputStream;Ll/۠ܰܿ;ZLl/֫ۧܳ;Ll/֫ۧܳ;ZZLl/ۡۧܳ;)V
    .locals 5

    const v0, 0x4d544858    # 2.22594432E8f

    .line 189
    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    const/4 v0, 0x7

    .line 190
    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 191
    invoke-virtual {p2}, Ll/۠ܰܿ;->֫()Ljava/lang/String;

    move-result-object v0

    .line 362
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 363
    array-length v2, v0

    const-string v3, "Hex checkpoint path is too long"

    const/high16 v4, 0x100000

    if-gt v2, v4, :cond_2

    .line 366
    array-length v2, v0

    invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 367
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 192
    invoke-virtual {p2}, Ll/۠ܰܿ;->ܽ()Ljava/lang/String;

    move-result-object p2

    .line 362
    invoke-virtual {p2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 363
    array-length v0, p2

    if-gt v0, v4, :cond_1

    .line 366
    array-length v0, p2

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 367
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 193
    invoke-virtual {p1, p3}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 194
    invoke-virtual {p4}, Ll/֫ۧܳ;->ۧ()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 195
    invoke-virtual {p4}, Ll/֫ۧܳ;->֫()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 196
    invoke-virtual {p5}, Ll/֫ۧܳ;->ۧ()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 197
    invoke-virtual {p5}, Ll/֫ۧܳ;->֫()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 198
    invoke-virtual {p1, p6}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 199
    invoke-virtual {p1, p7}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    if-eqz p6, :cond_0

    .line 204
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    invoke-virtual {p8, p1}, Ll/ۡۧܳ;->֫(Ljava/io/DataOutputStream;)V

    :cond_0
    const p2, 0x5848544d

    .line 207
    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 208
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    .line 210
    invoke-virtual {p0}, Ll/ۙ᩺ܿ;->֫()J

    move-result-wide p2

    .line 211
    invoke-virtual {p0}, Ll/ۙ᩺ܿ;->ܽ()V

    .line 212
    invoke-virtual {p1, p2, p3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 213
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    return-void

    .line 364
    :cond_1
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ܿۖ᩷;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/۫᩺ܿ;->ۧ(Ll/ܿۖ᩷;)V

    return-void
.end method

.method public static ֫(Ll/᩺ܰܿ;Ll/۠ܰܿ;J)V
    .locals 8

    .line 119
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    invoke-virtual {p0}, Ll/᩺ܰܿ;->֫()Ll/ۛܰܿ;

    move-result-object v7

    .line 123
    :try_start_0
    invoke-virtual {v7, p2, p3}, Ll/ۛܰܿ;->֫(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, v7

    .line 128
    invoke-static/range {v0 .. v6}, Ll/۫᩺ܿ;->ۧ(Ll/᩺ܰܿ;Ll/۠ܰܿ;ZZZLl/ۛܰܿ;Z)V

    const/4 p0, 0x0

    .line 636
    invoke-static {p0}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p0

    invoke-virtual {v7, p0}, Ll/ۛܰܿ;->֫(Ll/ܿۖ᩷;)Ll/ۤܰܿ;

    move-result-object p0

    .line 129
    sget-object p1, Ll/ۤܰܿ;->᩹:Ll/ۤܰܿ;

    if-ne p0, p1, :cond_0

    return-void

    .line 130
    :cond_0
    invoke-virtual {v7}, Ll/ۛܰܿ;->֫()Ljava/io/IOException;

    move-result-object p0

    throw p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    .line 125
    :goto_0
    invoke-virtual {v7, p0}, Ll/ۛܰܿ;->֫(Ljava/lang/Throwable;)V

    .line 126
    throw p0
.end method

.method public static synthetic ֫(Ll/᩺ܰܿ;Ll/۠ܰܿ;ZZZLl/ۛܰܿ;Z)V
    .locals 0

    .line 102
    invoke-static/range {p0 .. p6}, Ll/۫᩺ܿ;->ۧ(Ll/᩺ܰܿ;Ll/۠ܰܿ;ZZZLl/ۛܰܿ;Z)V

    return-void
.end method

.method public static ۧ(Ll/ܿۖ᩷;)V
    .locals 0

    .line 700
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    .line 701
    :cond_0
    new-instance p0, Ll/᩻ܽܳ;

    invoke-direct {p0}, Ll/᩻ܽܳ;-><init>()V

    throw p0
.end method

.method public static ۧ(Ll/᩺ܰܿ;Ll/۠ܰܿ;ZZZLl/ۛܰܿ;Z)V
    .locals 14

    move-object/from16 v1, p5

    .line 159
    :try_start_0
    invoke-virtual {p1}, Ll/۠ܰܿ;->ᩳ()Ll/֫ۧܳ;

    move-result-object v6

    if-eqz p2, :cond_0

    move-object v7, v6

    goto :goto_0

    .line 347
    :cond_0
    invoke-virtual {p0}, Ll/᩺ܰܿ;->ᩳ()Ll/ܺ֡ܿ;

    move-result-object v0

    .line 348
    invoke-virtual {v0}, Ll/ܺ֡ܿ;->۠֫()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v2

    if-nez v2, :cond_3

    .line 24
    new-instance v2, Ll/֫ۧܳ;

    invoke-virtual {v0}, Ll/ܺ֡ܿ;->᩺֫()J

    move-result-wide v3

    invoke-virtual {v0}, Ll/ܺ֡ܿ;->ۛ֫()J

    move-result-wide v7

    invoke-direct {v2, v3, v4, v7, v8}, Ll/֫ۧܳ;-><init>(JJ)V

    .line 352
    invoke-virtual {v2}, Ll/֫ۧܳ;->ۧ()J

    move-result-wide v3

    const-wide/32 v7, 0x7fffffff

    cmp-long v0, v3, v7

    if-gtz v0, :cond_2

    move-object v7, v2

    .line 162
    :goto_0
    new-instance v11, Ll/ۙ᩺ܿ;

    .line 163
    invoke-virtual/range {p5 .. p5}, Ll/ۛܰܿ;->ᩳ()Ljava/io/BufferedOutputStream;

    move-result-object v0

    invoke-direct {v11, v0, v1}, Ll/ۙ᩺ܿ;-><init>(Ljava/io/BufferedOutputStream;Ll/ۛܰܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 164
    :try_start_1
    new-instance v12, Ljava/io/DataOutputStream;

    invoke-direct {v12, v11}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    if-eqz p3, :cond_1

    .line 167
    :try_start_2
    invoke-virtual/range {p5 .. p5}, Ll/ۛܰܿ;->ܳ()Ll/ۡۧܳ;

    move-result-object v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 v8, 0x1

    move-object v2, v11

    move-object v3, v12

    move-object v4, p1

    move/from16 v5, p2

    move/from16 v9, p4

    move-object v10, v13

    .line 168
    :try_start_3
    invoke-static/range {v2 .. v10}, Ll/۫᩺ܿ;->֫(Ll/ۙ᩺ܿ;Ljava/io/DataOutputStream;Ll/۠ܰܿ;ZLl/֫ۧܳ;Ll/֫ۧܳ;ZZLl/ۡۧܳ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 170
    :try_start_4
    invoke-virtual {v13}, Ll/ۡۧܳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 166
    :try_start_5
    invoke-virtual {v13}, Ll/ۡۧܳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_6
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2

    :cond_1
    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v2, v11

    move-object v3, v12

    move-object v4, p1

    move/from16 v5, p2

    move/from16 v9, p4

    .line 172
    invoke-static/range {v2 .. v10}, Ll/۫᩺ܿ;->֫(Ll/ۙ᩺ܿ;Ljava/io/DataOutputStream;Ll/۠ܰܿ;ZLl/֫ۧܳ;Ll/֫ۧܳ;ZZLl/ۡۧܳ;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 175
    :goto_2
    :try_start_7
    invoke-virtual {v12}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :try_start_8
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V

    .line 176
    invoke-virtual/range {p5 .. p6}, Ll/ۛܰܿ;->֫(Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    return-void

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 162
    :try_start_9
    invoke-virtual {v12}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v3, v0

    :try_start_a
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception v0

    move-object v2, v0

    :try_start_b
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception v0

    move-object v3, v0

    :try_start_c
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v2

    .line 353
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Hex checkpoint base is too large"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 349
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Hex checkpoint base is unavailable"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    :catchall_6
    move-exception v0

    .line 178
    invoke-virtual {v1, v0}, Ll/ۛܰܿ;->֫(Ljava/lang/Throwable;)V

    return-void
.end method
