.class public final Ll/᩹᩶᩻;
.super Ljava/lang/Object;
.source "81ZE"


# direct methods
.method public static ֫(Ljava/util/Collection;)J
    .locals 4

    .line 50
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide/16 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩺ۡ;

    .line 51
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_0

    .line 52
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v2

    add-long/2addr v0, v2

    goto :goto_0

    :cond_1
    return-wide v0
.end method

.method public static ֫(Ll/ۗ᩺ۡ;Ll/ܶ᩵ܿ;[BLjava/lang/String;Ll/֡ۛۡ;)Ljava/io/InputStream;
    .locals 1

    if-eqz p4, :cond_0

    .line 291
    invoke-virtual {p4}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳܰۡ;

    if-nez v0, :cond_1

    .line 293
    invoke-static {p1, p2}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;[B)Ll/ᩳܰۡ;

    move-result-object v0

    goto :goto_0

    .line 296
    :cond_0
    invoke-static {p1, p2}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;[B)Ll/ᩳܰۡ;

    move-result-object v0

    .line 298
    :cond_1
    :goto_0
    invoke-virtual {v0, p3}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    .line 301
    :try_start_0
    invoke-virtual {v0, p0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p4, :cond_2

    return-object p0

    .line 310
    :cond_2
    new-instance p1, Ll/֨᩶᩻;

    invoke-direct {p1, p0, p4, v0}, Ll/֨᩶᩻;-><init>(Ljava/io/InputStream;Ll/֡ۛۡ;Ll/ᩳܰۡ;)V

    return-object p1

    :catch_0
    move-exception p0

    .line 303
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 304
    throw p0
.end method

.method public static ֫(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ll/ܿۖ᩷;)Ljava/util/List;
    .locals 5

    .line 69
    invoke-static {}, Ll/ۤܺܳ;->ᩳ()Ljava/util/List;

    move-result-object v0

    .line 76
    invoke-static {p1}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 0
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 79
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 80
    invoke-virtual {p0}, Ll/ᩳܰۡ;->᩵()Ljava/lang/String;

    move-result-object v2

    .line 82
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ܺܳ;

    .line 83
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    .line 210
    :cond_1
    iget-object v4, v3, Ll/۫ܺܳ;->ۧ:Ljava/lang/String;

    .line 86
    invoke-virtual {p0, v4}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 87
    :try_start_1
    invoke-virtual {p0, p1}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_1
    .catch Ll/ۘܰۡ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 88
    :try_start_2
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ll/ۘܰۡ; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_0
    move-exception v3

    .line 87
    :try_start_4
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v4

    :try_start_5
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v3
    :try_end_5
    .catch Ll/ۘܰۡ; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 94
    :cond_2
    :goto_2
    invoke-virtual {p0, v2}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    .line 0
    new-instance p0, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    invoke-static {p0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :catchall_2
    move-exception p1

    .line 94
    invoke-virtual {p0, v2}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    .line 95
    throw p1
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Z)Ll/᩸᩶᩻;
    .locals 1

    .line 34
    new-instance v0, Ll/᩸᩶᩻;

    invoke-direct {v0, p0}, Ll/᩸᩶᩻;-><init>(Ll/ܶ᩵ܿ;)V

    if-eqz p1, :cond_0

    .line 36
    sget-object p0, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ᩴ֫()Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-static {v0, p0}, Ll/᩸᩶᩻;->֫(Ll/᩸᩶᩻;Ll/ܶ᩵ܿ;)V

    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v0}, Ll/᩸᩶᩻;->֫(Ll/᩸᩶᩻;)Ll/ܶ᩵ܿ;

    move-result-object p0

    const-string p1, ".tmp"

    .line 899
    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 38
    invoke-static {v0, p0}, Ll/᩸᩶᩻;->֫(Ll/᩸᩶᩻;Ll/ܶ᩵ܿ;)V

    .line 40
    :goto_0
    new-instance p0, Ll/ۡܰۡ;

    invoke-static {v0}, Ll/᩸᩶᩻;->ۧ(Ll/᩸᩶᩻;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-static {v0, p0}, Ll/᩸᩶᩻;->֫(Ll/᩸᩶᩻;Ll/ۡܰۡ;)V

    return-object v0
.end method

.method public static ֫()V
    .locals 1

    .line 345
    new-instance v0, Ll/֡᩶᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 352
    invoke-static {p0, p1}, Ll/ۗܺܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    new-instance p0, Ll/ۚ᩶᩻;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ll/ܶ᩵ܿ;ZLl/ܶ᩶᩻;)V
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    .line 104
    invoke-static/range {p2 .. p2}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;)Z

    move-result v4

    const/16 v5, 0x1000

    const/4 v6, 0x0

    if-eqz v4, :cond_8

    .line 184
    invoke-interface/range {p5 .. p5}, Ll/ܶ᩶᩻;->ᩴ()Z

    move-result v4

    if-nez v4, :cond_0

    .line 185
    invoke-interface/range {p5 .. p5}, Ll/ܶ᩶᩻;->cancel()V

    return-void

    .line 192
    :cond_0
    :goto_0
    :try_start_0
    new-instance v4, Ljava/io/BufferedInputStream;

    invoke-virtual/range {p1 .. p2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v8

    invoke-direct {v4, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ll/ۘܰۡ; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 194
    :try_start_1
    invoke-static {v1, v4}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ljava/io/BufferedInputStream;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 446
    invoke-virtual {v2, v6}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v8
    :try_end_1
    .catch Ll/ۘܰۡ; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-array v9, v5, [B

    .line 200
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    .line 202
    :goto_1
    invoke-virtual {v4, v9}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-lez v5, :cond_3

    .line 203
    invoke-virtual {v8, v9, v6, v5}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v6, v5

    add-long/2addr v12, v6

    cmp-long v5, v10, v14

    if-lez v5, :cond_1

    .line 206
    invoke-interface {v3, v12, v13, v10, v11}, Ll/ܶ᩶᩻;->֫(JJ)V

    .line 208
    :cond_1
    invoke-interface/range {p5 .. p5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 209
    invoke-static {v8}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_2
    .catch Ll/ۘܰۡ; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 211
    :try_start_3
    invoke-virtual/range {p3 .. p3}, Ll/ܶ᩵ܿ;->۬()Z
    :try_end_3
    .catch Ll/ۘܰۡ; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    goto :goto_1

    .line 216
    :cond_3
    :try_start_4
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ll/ۘܰۡ; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-nez p4, :cond_4

    .line 218
    :try_start_5
    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 219
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Ll/ܶ᩵ܿ;->֫(J)Z
    :try_end_5
    .catch Ll/ۘܰۡ; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 243
    :cond_4
    :goto_2
    invoke-static {v4}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    goto/16 :goto_a

    :catch_0
    move-exception v0

    goto :goto_4

    .line 195
    :cond_5
    :try_start_6
    new-instance v5, Ll/ۘܰۡ;

    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ll/ۘܰۡ;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_6
    .catch Ll/ۘܰۡ; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    const/4 v4, 0x0

    :goto_3
    const/4 v8, 0x0

    .line 238
    :goto_4
    :try_start_7
    invoke-static {v8}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 240
    :try_start_8
    invoke-virtual/range {p3 .. p3}, Ll/ܶ᩵ܿ;->۬()Z

    .line 241
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_5
    move-object v7, v4

    goto :goto_7

    :catch_3
    const/4 v4, 0x0

    :catch_4
    const/4 v8, 0x0

    .line 223
    :catch_5
    :try_start_9
    invoke-static {v4}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 225
    :try_start_a
    invoke-static {v8}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 227
    :try_start_b
    invoke-virtual/range {p3 .. p3}, Ll/ܶ᩵ܿ;->۬()Z

    .line 228
    invoke-interface/range {p5 .. p5}, Ll/ܶ᩶᩻;->ۖ()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 229
    invoke-static {}, Ll/᩹᩶᩻;->֫()V

    :cond_6
    const/4 v4, 0x0

    .line 231
    invoke-virtual {v0, v4}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    .line 232
    invoke-interface/range {p5 .. p5}, Ll/ܶ᩶᩻;->ᩴ()Z

    move-result v4

    if-nez v4, :cond_7

    .line 233
    invoke-interface/range {p5 .. p5}, Ll/ܶ᩶᩻;->cancel()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto :goto_a

    :cond_7
    const/16 v5, 0x1000

    const/4 v6, 0x0

    goto/16 :goto_0

    :goto_6
    const/4 v7, 0x0

    :goto_7
    const/16 v16, 0x0

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object/from16 v16, v8

    const/4 v7, 0x0

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object v7, v4

    move-object/from16 v16, v8

    .line 243
    :goto_8
    invoke-static {v7}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 244
    invoke-static/range {v16 .. v16}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 245
    throw v0

    :cond_8
    const-wide/16 v4, 0x0

    .line 108
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface/range {p5 .. p5}, Ll/ܶ᩶᩻;->ᩴ()Z

    move-result v6

    if-nez v6, :cond_9

    .line 109
    invoke-interface/range {p5 .. p5}, Ll/ܶ᩶᩻;->cancel()V

    return-void

    .line 117
    :cond_9
    :try_start_c
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v6
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    if-eqz v6, :cond_d

    :cond_a
    const/4 v6, 0x1

    .line 122
    :try_start_d
    new-instance v7, Ljava/io/BufferedInputStream;

    invoke-virtual/range {p1 .. p2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_d
    .catch Ll/ۘܰۡ; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 123
    :try_start_e
    invoke-static {v1, v7}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ljava/io/BufferedInputStream;)Z

    move-result v8
    :try_end_e
    .catch Ll/ۘܰۡ; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    xor-int/2addr v6, v8

    goto :goto_9

    :catchall_4
    move-exception v0

    const/4 v6, 0x0

    goto/16 :goto_d

    :catch_6
    nop

    goto :goto_9

    :catch_7
    const/4 v7, 0x0

    :goto_9
    if-eqz v6, :cond_c

    .line 128
    :try_start_f
    invoke-static {v7}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 130
    :try_start_10
    invoke-interface/range {p5 .. p5}, Ll/ܶ᩶᩻;->ۖ()Z

    move-result v6

    if-eqz v6, :cond_b

    .line 131
    invoke-static {}, Ll/᩹᩶᩻;->֫()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    :cond_b
    const/4 v6, 0x0

    .line 133
    :try_start_11
    invoke-virtual {v0, v6}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V

    .line 134
    invoke-interface/range {p5 .. p5}, Ll/ܶ᩶᩻;->ᩴ()Z

    move-result v7

    if-nez v7, :cond_a

    .line 135
    invoke-interface/range {p5 .. p5}, Ll/ܶ᩶᩻;->cancel()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    :goto_a
    return-void

    :cond_c
    const/4 v6, 0x0

    .line 140
    :try_start_12
    invoke-interface/range {p5 .. p5}, Ll/ܶ᩶᩻;->᩺()Z

    move-result v8

    if-eqz v8, :cond_e

    .line 141
    invoke-virtual/range {p1 .. p1}, Ll/ᩳܰۡ;->᩵()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v8, p0

    invoke-static {v0, v8}, Ll/᩹᩶᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    goto :goto_b

    :cond_d
    const/4 v6, 0x0

    .line 147
    :try_start_13
    invoke-virtual/range {p1 .. p2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    move-object v7, v0

    :cond_e
    :goto_b
    const/4 v0, 0x0

    .line 446
    :try_start_14
    invoke-virtual {v2, v0}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v8
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    const/16 v9, 0x1000

    :try_start_15
    new-array v9, v9, [B

    .line 152
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v10

    move-wide v12, v4

    .line 154
    :cond_f
    invoke-virtual {v7, v9}, Ljava/io/InputStream;->read([B)I

    move-result v14

    if-lez v14, :cond_11

    .line 155
    invoke-virtual {v8, v9, v0, v14}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v14, v14

    add-long/2addr v12, v14

    cmp-long v14, v10, v4

    if-lez v14, :cond_10

    .line 158
    invoke-interface {v3, v12, v13, v10, v11}, Ll/ܶ᩶᩻;->֫(JJ)V

    .line 159
    :cond_10
    invoke-interface/range {p5 .. p5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v14

    if-eqz v14, :cond_f

    .line 160
    invoke-static {v8}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    .line 162
    :try_start_16
    invoke-virtual/range {p3 .. p3}, Ll/ܶ᩵ܿ;->۬()Z
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    .line 173
    invoke-static {v7}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    .line 167
    :cond_11
    :try_start_17
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    if-nez p4, :cond_12

    .line 169
    :try_start_18
    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 170
    invoke-virtual/range {p2 .. p2}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ll/ܶ᩵ܿ;->֫(J)Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_6

    .line 173
    :cond_12
    invoke-static {v7}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_5
    move-exception v0

    move-object v6, v8

    goto :goto_d

    :catchall_6
    move-exception v0

    goto :goto_d

    :catchall_7
    move-exception v0

    goto :goto_c

    :catchall_8
    move-exception v0

    const/4 v6, 0x0

    :goto_c
    move-object v7, v6

    :goto_d
    invoke-static {v7}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 174
    invoke-static {v6}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 175
    throw v0
.end method

.method public static ֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/۠᩶᩻;)V
    .locals 5

    .line 265
    invoke-virtual {p2, p0}, Ll/ۡܰۡ;->ܽ(Ll/ۗ᩺ۡ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 268
    :cond_0
    invoke-virtual {p2, p0}, Ll/ۡܰۡ;->ۧ(Ll/ۗ᩺ۡ;)V

    const/16 v0, 0x1000

    new-array v0, v0, [B

    .line 274
    :try_start_0
    invoke-virtual {p1, p0}, Ll/ᩳܰۡ;->ᩳ(Ll/ۗ᩺ۡ;)Ll/۫ܰۡ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-wide/16 v1, 0x0

    .line 275
    :cond_1
    :try_start_1
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-lez v3, :cond_2

    .line 276
    invoke-virtual {p2, v3, v0}, Ll/ۡܰۡ;->֫(I[B)V

    int-to-long v3, v3

    add-long/2addr v1, v3

    .line 278
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v3

    invoke-interface {p3, v1, v2, v3, v4}, Ll/۠᩶᩻;->֫(JJ)V

    .line 279
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_1

    .line 283
    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :cond_2
    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    :catchall_1
    move-exception p0

    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 284
    throw p0
.end method

.method public static ֫(Ll/᩸᩶᩻;)V
    .locals 2

    .line 45
    invoke-static {p0}, Ll/᩸᩶᩻;->֫(Ll/᩸᩶᩻;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, ".tmp"

    .line 899
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 45
    invoke-static {p0, v0}, Ll/᩸᩶᩻;->֫(Ll/᩸᩶᩻;Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public static ֫(Ll/ۗ᩺ۡ;)Z
    .locals 1

    .line 59
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ܰ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->֨()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/ۗ᩺ۡ;Ljava/io/BufferedInputStream;)Z
    .locals 1

    const/16 v0, 0x400

    .line 329
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/io/BufferedInputStream;->mark(I)V

    new-array v0, v0, [B

    .line 331
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 332
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->reset()V
    :try_end_0
    .catch Ll/ۘܰۡ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/zip/ZipException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p1

    .line 337
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ܰ()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 340
    :cond_0
    throw p1

    :catch_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method
