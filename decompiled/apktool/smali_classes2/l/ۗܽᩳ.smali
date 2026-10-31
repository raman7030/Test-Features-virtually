.class public final Ll/ۗܽᩳ;
.super Ljava/lang/Object;
.source "L1W7"


# static fields
.field public static ֫:Z

.field public static ۧ:Ll/᩵ۡ᩷;

.field public static ܽ:Ll/ۨ᩶᩻;


# direct methods
.method public static ֫(Ll/ܰۧᩳ;)Ljava/lang/String;
    .locals 3

    .line 303
    sget-object v0, Ll/᩶ܽᩳ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-string p0, "SHA-256-Digest"

    return-object p0

    .line 309
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected content digest algorithm: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string p0, "SHA1-Digest"

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/۬ۧᩳ;)V
    .locals 11

    .line 69
    new-instance v0, Ll/ᩳܰۡ;

    invoke-direct {v0, p0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 70
    :try_start_0
    invoke-virtual {v0}, Ll/ᩳܰۡ;->᩶()Z

    move-result p0

    if-nez p0, :cond_b

    .line 73
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 76
    invoke-virtual {v0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v6, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۗ᩺ۡ;

    .line 77
    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->᩹()Ljava/lang/String;

    move-result-object v9

    .line 78
    invoke-static {v9}, Ll/ۗܽᩳ;->֫(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 79
    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v9

    add-long/2addr v6, v9

    .line 80
    invoke-virtual {p0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/16 v1, 0x5000

    if-eqz v5, :cond_6

    .line 86
    new-instance v2, Ll/ۡܰۡ;

    invoke-direct {v2, p1}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 87
    :try_start_1
    invoke-virtual {v2}, Ll/ۡܰۡ;->ᩳ()V

    .line 88
    new-instance p1, Ll/᩻ܽᩳ;

    invoke-direct {p1, v6, v7, p2}, Ll/᩻ܽᩳ;-><init>(JLl/۬ۧᩳ;)V

    new-array v1, v1, [B

    .line 91
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩺ۡ;

    .line 92
    invoke-virtual {v2, v3}, Ll/ۡܰۡ;->ܽ(Ll/ۗ᩺ۡ;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 93
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Ll/᩻ܽᩳ;->֫(J)V

    goto :goto_1

    .line 96
    :cond_3
    invoke-virtual {v2, v3}, Ll/ۡܰۡ;->ۧ(Ll/ۗ᩺ۡ;)V

    .line 97
    invoke-virtual {v0, v3}, Ll/ᩳܰۡ;->ᩳ(Ll/ۗ᩺ۡ;)Ll/۫ܰۡ;

    move-result-object v3

    .line 98
    :cond_4
    invoke-virtual {v3, v1}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-lez v4, :cond_2

    .line 99
    invoke-virtual {v2, v4, v1}, Ll/ۡܰۡ;->֫(I[B)V

    .line 100
    invoke-virtual {p1, v4}, Ll/᩻ܽᩳ;->֫(I)V

    if-eqz p2, :cond_4

    .line 101
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_4

    .line 106
    :try_start_2
    invoke-virtual {v2}, Ll/ۡܰۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 123
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V

    return-void

    .line 106
    :cond_5
    :try_start_3
    invoke-virtual {v2}, Ll/ۡܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    goto :goto_3

    :catchall_0
    move-exception p0

    .line 86
    :try_start_4
    invoke-virtual {v2}, Ll/ۡܰۡ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_5
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    .line 446
    :cond_6
    invoke-virtual {p1, v4}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 109
    :try_start_6
    invoke-virtual {v0}, Ll/ᩳܰۡ;->᩻()Ll/۠ۖܽ;

    move-result-object p1

    .line 110
    invoke-interface {p1, v2, v3}, Ll/۠ۖܽ;->seek(J)V

    .line 111
    new-instance v2, Ll/᩻ܽᩳ;

    invoke-interface {p1}, Ll/۠ۖܽ;->length()J

    move-result-wide v5

    invoke-direct {v2, v5, v6, p2}, Ll/᩻ܽᩳ;-><init>(JLl/۬ۧᩳ;)V

    new-array v1, v1, [B

    .line 114
    :cond_7
    invoke-interface {p1, v1}, Ll/۠ۖܽ;->read([B)I

    move-result v3

    const/4 v5, -0x1

    if-eq v3, v5, :cond_8

    .line 115
    invoke-virtual {p0, v1, v4, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 116
    invoke-virtual {v2, v3}, Ll/᩻ܽᩳ;->֫(I)V

    if-eqz p2, :cond_7

    .line 117
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz v3, :cond_7

    .line 121
    :try_start_7
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 123
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V

    return-void

    :cond_8
    if-eqz p0, :cond_9

    .line 121
    :try_start_8
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 123
    :cond_9
    :goto_3
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V

    return-void

    :catchall_2
    move-exception p1

    if-eqz p0, :cond_a

    .line 108
    :try_start_9
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p0

    :try_start_a
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_a
    :goto_4
    throw p1

    .line 71
    :cond_b
    new-instance p0, Ll/֫ۛۡ;

    const p1, 0x7f120b45

    invoke-direct {p0, p1}, Ll/֫ۛۡ;-><init>(I)V

    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception p0

    .line 69
    :try_start_b
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/۬ܿᩳ;Ljava/lang/String;ZZLl/۬ۧᩳ;)V
    .locals 22

    move-object/from16 v0, p6

    const/4 v1, 0x0

    .line 129
    :try_start_0
    new-instance v8, Ll/ᩳܰۡ;

    move-object/from16 v2, p0

    invoke-direct {v8, v2}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    :try_start_1
    new-instance v9, Ll/ۡܰۡ;

    move-object/from16 v2, p1

    invoke-direct {v9, v2}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    if-eqz v0, :cond_0

    .line 130
    :try_start_2
    invoke-interface/range {p6 .. p6}, Ll/۬ۧᩳ;->ۙ()V

    .line 131
    :cond_0
    invoke-virtual {v9}, Ll/ۡܰۡ;->ᩳ()V

    .line 133
    sget-object v2, Ll/ۗܽᩳ;->ۧ:Ll/᩵ۡ᩷;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v8}, Ll/᩵ۡ᩷;->֫(Ll/ᩳܰۡ;)Ll/۟ۧᩳ;

    move-result-object v14

    .line 134
    invoke-virtual/range {p2 .. p2}, Ll/۬ܿᩳ;->᩻()Ljava/security/cert/X509Certificate;

    move-result-object v2

    invoke-virtual {v2}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v2

    iget v3, v14, Ll/۟ۧᩳ;->֫:I

    invoke-static {v2, v3}, Ll/ۛܿᩳ;->֫(Ljava/security/PublicKey;I)Ll/ܰۧᩳ;

    move-result-object v13

    .line 136
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 138
    invoke-virtual {v8}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v3, 0x0

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ᩺ۡ;

    .line 139
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->᩹()Ljava/lang/String;

    move-result-object v6

    .line 140
    invoke-static {v6}, Ll/ۗܽᩳ;->֫(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 141
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v11

    const-wide/16 v15, 0x3

    mul-long v11, v11, v15

    add-long/2addr v11, v3

    .line 142
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v3

    add-long/2addr v3, v11

    .line 143
    invoke-interface {v10, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 144
    :cond_2
    sget-boolean v7, Ll/ۗܽᩳ;->֫:Z

    if-eqz v7, :cond_1

    const-string v7, "/"

    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 145
    invoke-interface {v10, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    const-wide/16 v5, 0x64

    .line 149
    div-long v5, v3, v5

    const-wide/16 v11, 0x19

    mul-long v18, v5, v11

    .line 150
    new-instance v15, Ll/᩻ܽᩳ;

    add-long v3, v3, v18

    invoke-direct {v15, v3, v4, v0}, Ll/᩻ܽᩳ;-><init>(JLl/۬ۧᩳ;)V

    .line 151
    new-instance v21, Ll/ۙܽᩳ;

    invoke-direct/range {v21 .. v21}, Ll/ۙܽᩳ;-><init>()V

    .line 152
    new-instance v11, Ll/ۧۤᩴ;

    invoke-direct {v11}, Ll/ۧۤᩴ;-><init>()V

    .line 156
    invoke-virtual {v8}, Ll/ᩳܰۡ;->ۙ()Ll/ܳܰۡ;

    move-result-object v12

    .line 157
    new-instance v7, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v7, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>(Ljava/util/Collection;)V

    .line 186
    sget-object v2, Ll/֫ۨۡ;->ᩳ:Ljava/util/concurrent/ExecutorService;

    .line 39
    sget v6, Ll/ܿ᩸ۡ;->֫:I

    invoke-static {v6}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    const/4 v1, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v6, :cond_4

    .line 158
    :try_start_3
    new-instance v3, Ll/᩹ܽᩳ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v1, v3

    move-object v2, v13

    move-object/from16 p0, v14

    move-object v14, v3

    move-object v3, v12

    move/from16 v16, v4

    move-object v4, v7

    move-object/from16 p1, v13

    move-object v13, v5

    move-object v5, v15

    move/from16 v17, v6

    move-object/from16 v6, p6

    move-object/from16 v20, v7

    move-object v7, v11

    :try_start_4
    invoke-direct/range {v1 .. v7}, Ll/᩹ܽᩳ;-><init>(Ll/ܰۧᩳ;Ll/ܳܰۡ;Ljava/util/concurrent/ConcurrentLinkedQueue;Ll/᩻ܽᩳ;Ll/۬ۧᩳ;Ll/ۧۤᩴ;)V

    .line 189
    invoke-interface {v13, v14}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    add-int/lit8 v4, v16, 0x1

    move-object/from16 v14, p0

    move-object v5, v13

    move/from16 v6, v17

    move-object/from16 v7, v20

    move-object/from16 v13, p1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    move-object v13, v5

    goto/16 :goto_3

    :cond_4
    move-object/from16 p1, v13

    move-object/from16 p0, v14

    move-object v13, v5

    const/16 v1, 0x5000

    :try_start_5
    new-array v1, v1, [B

    .line 202
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    if-eqz v3, :cond_9

    :try_start_6
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩺ۡ;

    .line 204
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 205
    invoke-virtual {v9, v3}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    goto :goto_2

    .line 208
    :cond_6
    invoke-virtual {v9, v3}, Ll/ۡܰۡ;->ܽ(Ll/ۗ᩺ۡ;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 209
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v3

    invoke-virtual {v15, v3, v4}, Ll/᩻ܽᩳ;->֫(J)V

    goto :goto_2

    .line 212
    :cond_7
    invoke-virtual {v9, v3}, Ll/ۡܰۡ;->ۧ(Ll/ۗ᩺ۡ;)V

    .line 213
    invoke-virtual {v8, v3}, Ll/ᩳܰۡ;->ᩳ(Ll/ۗ᩺ۡ;)Ll/۫ܰۡ;

    move-result-object v3

    .line 214
    :cond_8
    invoke-virtual {v3, v1}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-lez v4, :cond_5

    .line 215
    invoke-virtual {v9, v4, v1}, Ll/ۡܰۡ;->֫(I[B)V

    .line 216
    invoke-virtual {v15, v4}, Ll/᩻ܽᩳ;->֫(I)V

    if-eqz v0, :cond_8

    .line 217
    invoke-interface/range {p6 .. p6}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v4, :cond_8

    goto :goto_2

    .line 223
    :cond_9
    :try_start_7
    invoke-static {v13}, Ll/֫ۨۡ;->֫(Ljava/util/concurrent/ExecutorService;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    if-eqz v0, :cond_a

    .line 224
    :try_start_8
    invoke-interface/range {p6 .. p6}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-eqz v1, :cond_a

    .line 259
    :try_start_9
    invoke-virtual {v9}, Ll/ۡܰۡ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :try_start_a
    invoke-virtual {v8}, Ll/ᩳܰۡ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 260
    invoke-interface {v13}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_d

    .line 261
    invoke-interface {v13}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    return-void

    :catchall_2
    move-exception v0

    move-object v5, v13

    goto/16 :goto_a

    :catchall_3
    move-exception v0

    move-object v5, v13

    goto/16 :goto_8

    :goto_3
    move-object v1, v0

    move-object v5, v13

    goto/16 :goto_6

    :cond_a
    move-object/from16 v10, v21

    move-object/from16 v12, p2

    move-object v1, v13

    move-object/from16 v13, p1

    move-object/from16 v14, p0

    move-object v2, v15

    move-object/from16 v15, p3

    move/from16 v16, p4

    move/from16 v17, p5

    move-object/from16 v20, v2

    .line 227
    :try_start_b
    invoke-virtual/range {v10 .. v20}, Ll/ۙܽᩳ;->֫(Ll/ۧۤᩴ;Ll/۬ܿᩳ;Ll/ܰۧᩳ;Ll/۟ۧᩳ;Ljava/lang/String;ZZJLl/᩻ܽᩳ;)V

    if-eqz v0, :cond_b

    .line 229
    invoke-interface/range {p6 .. p6}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    if-eqz v0, :cond_b

    .line 259
    :try_start_c
    invoke-virtual {v9}, Ll/ۡܰۡ;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    :try_start_d
    invoke-virtual {v8}, Ll/ᩳܰۡ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    .line 260
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_d

    .line 261
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    return-void

    .line 232
    :cond_b
    :try_start_e
    invoke-virtual {v9}, Ll/ۡܰۡ;->֫()Ljava/io/OutputStream;

    move-result-object v0

    .line 233
    sget-object v2, Ll/ۗܽᩳ;->ܽ:Ll/ۨ᩶᩻;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    const-string v3, "META-INF/MANIFEST.MF"

    if-nez v2, :cond_c

    .line 235
    :try_start_f
    invoke-virtual {v9, v3}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 236
    invoke-static/range {v21 .. v21}, Ll/ۙܽᩳ;->֫(Ll/ۙܽᩳ;)Ljava/io/ByteArrayOutputStream;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 237
    invoke-static/range {v21 .. v21}, Ll/ۙܽᩳ;->ܽ(Ll/ۙܽᩳ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 238
    invoke-static/range {v21 .. v21}, Ll/ۙܽᩳ;->ۧ(Ll/ۙܽᩳ;)Ljava/io/ByteArrayOutputStream;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 239
    invoke-static/range {v21 .. v21}, Ll/ۙܽᩳ;->ܿ(Ll/ۙܽᩳ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 240
    invoke-static/range {v21 .. v21}, Ll/ۙܽᩳ;->ᩳ(Ll/ۙܽᩳ;)Ljava/io/ByteArrayOutputStream;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    goto :goto_4

    .line 234
    :cond_c
    iget-wide v4, v2, Ll/ۨ᩶᩻;->֫:J

    .line 244
    new-instance v2, Ll/ۗ᩺ۡ;

    invoke-direct {v2, v3}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 245
    invoke-virtual {v2, v4, v5}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 246
    invoke-virtual {v9, v2}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 247
    invoke-static/range {v21 .. v21}, Ll/ۙܽᩳ;->֫(Ll/ۙܽᩳ;)Ljava/io/ByteArrayOutputStream;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 249
    new-instance v2, Ll/ۗ᩺ۡ;

    invoke-static/range {v21 .. v21}, Ll/ۙܽᩳ;->ܽ(Ll/ۙܽᩳ;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 250
    invoke-virtual {v2, v4, v5}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 251
    invoke-virtual {v9, v2}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 252
    invoke-static/range {v21 .. v21}, Ll/ۙܽᩳ;->ۧ(Ll/ۙܽᩳ;)Ljava/io/ByteArrayOutputStream;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 254
    new-instance v2, Ll/ۗ᩺ۡ;

    invoke-static/range {v21 .. v21}, Ll/ۙܽᩳ;->ܿ(Ll/ۙܽᩳ;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 255
    invoke-virtual {v2, v4, v5}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 256
    invoke-virtual {v9, v2}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 257
    invoke-static/range {v21 .. v21}, Ll/ۙܽᩳ;->ᩳ(Ll/ۙܽᩳ;)Ljava/io/ByteArrayOutputStream;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 259
    :goto_4
    :try_start_10
    invoke-virtual {v9}, Ll/ۡܰۡ;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    :try_start_11
    invoke-virtual {v8}, Ll/ᩳܰۡ;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 260
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_d

    .line 261
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    :cond_d
    return-void

    :catchall_4
    move-exception v0

    move-object v1, v13

    goto :goto_5

    :catchall_5
    move-exception v0

    :goto_5
    move-object v5, v1

    move-object v1, v0

    .line 129
    :goto_6
    :try_start_12
    invoke-virtual {v9}, Ll/ۡܰۡ;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    goto :goto_7

    :catchall_6
    move-exception v0

    move-object v2, v0

    :try_start_13
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    :catchall_7
    move-exception v0

    goto :goto_8

    :catchall_8
    move-exception v0

    move-object v5, v1

    :goto_8
    move-object v1, v0

    :try_start_14
    invoke-virtual {v8}, Ll/ᩳܰۡ;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    goto :goto_9

    :catchall_9
    move-exception v0

    move-object v2, v0

    :try_start_15
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    :catchall_a
    move-exception v0

    goto :goto_a

    :catchall_b
    move-exception v0

    move-object v5, v1

    :goto_a
    if-eqz v5, :cond_e

    .line 260
    invoke-interface {v5}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v1

    if-nez v1, :cond_e

    .line 261
    invoke-interface {v5}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 263
    :cond_e
    throw v0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 5

    const-string v0, "/"

    .line 270
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "META-INF/"

    .line 275
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    return v2

    :cond_1
    const/16 v0, 0x2f

    const/16 v3, 0x9

    .line 279
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    const/4 v4, -0x1

    if-eq v0, v4, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 289
    :goto_0
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v3, "manifest.mf"

    .line 291
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, ".sf"

    .line 292
    invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, ".rsa"

    .line 293
    invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, ".dsa"

    .line 294
    invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, ".ec"

    .line 295
    invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "sig-"

    .line 296
    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    return v2

    :cond_4
    :goto_1
    return v1
.end method
