.class public final Ll/ܿ᩸ᩳ;
.super Ljava/lang/Object;
.source "NB3C"


# static fields
.field public static ֫:I = 0x1312d00

.field public static ۧ:Ljava/lang/CharSequence;

.field private static final ܳܶܿ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x87

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    const/16 v0, 0x2c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿ᩸ᩳ;->ܳܶܿ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0xf20s
        -0x7da4s
        -0x7e00s
        -0x7db3s
        -0x7dbes
        -0x7db1s
        -0x7da3s
        -0x7da3s
        -0x7d99s
        -0x7dbes
        -0x7dbes
        -0x7db5s
        -0x7db7s
        -0x7db1s
        -0x7dbes
        -0x7df2s
        -0x7da3s
        -0x7db5s
        -0x7db5s
        -0x7dbbs
        -0x7e00s
        -0x7daas
        -0x7dbds
        -0x7dbes
        -0x7da4s
        -0x7db5s
        -0x7da3s
        -0x7dbfs
        -0x7da5s
        -0x7da4s
        -0x7db3s
        -0x7db5s
        -0x7da3s
        -0x7e00s
        -0x7db1s
        -0x7da4s
        -0x7da3s
        -0x7db3s
        -0x7d95s
        -0x7d83s
        -0x7d82s
        -0x7d99s
        -0x7d82s
        -0x7d95s
    .end array-data
.end method

.method public static ֫()Ll/ۧ᩸ᩳ;
    .locals 4

    .line 61
    sget-object v0, Ll/ܿ᩸ᩳ;->ۧ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 63
    sput-object v1, Ll/ܿ᩸ᩳ;->ۧ:Ljava/lang/CharSequence;

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 67
    :goto_0
    new-instance v1, Ll/ۧ᩸ᩳ;

    const-string v2, "\n"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Ll/ۧ᩸ᩳ;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    return-object v1
.end method

.method public static ֫(Ll/ۗܶᩳ;ZILl/ܿۖ᩷;)Ll/ۧ᩸ᩳ;
    .locals 1

    const/4 v0, 0x0

    .line 76
    invoke-static {p0, p1, p2, p3, v0}, Ll/ܿ᩸ᩳ;->֫(Ll/ۗܶᩳ;ZILl/ܿۖ᩷;Z)Ll/ۧ᩸ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static native ֫(Ll/ۗܶᩳ;ZILl/ܿۖ᩷;Z)Ll/ۧ᩸ᩳ;
.end method

.method public static ֫(Ll/ۙܶᩳ;ILl/ܿۖ᩷;)Ll/ۧ᩸ᩳ;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 71
    invoke-static {p0, v0, p1, p2, v1}, Ll/ܿ᩸ᩳ;->֫(Ll/ۗܶᩳ;ZILl/ܿۖ᩷;Z)Ll/ۧ᩸ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩳ᩸ᩳ;ILl/ܿۖ᩷;)Ll/ۧ᩸ᩳ;
    .locals 19
    .annotation build Ll/۬۠ܽ;
    .end annotation

    const-string v0, "tmp_"

    .line 210
    invoke-interface/range {p0 .. p0}, Ll/ᩳ᩸ᩳ;->ۧ()Ljava/io/InputStream;

    move-result-object v1

    const v2, 0x8000

    .line 211
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->mark(I)V

    new-array v3, v2, [B

    .line 1876
    invoke-static {v1, v3, v2}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;[BI)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const-string v4, "\n"

    if-gtz v2, :cond_0

    .line 215
    :try_start_1
    new-instance v0, Ll/ۧ᩸ᩳ;

    const-string v2, ""

    sget v3, Ll/ܳ᩷ܽ;->᩵:I

    invoke-direct {v0, v4, v2, v3}, Ll/ۧ᩸ᩳ;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 366
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object v0

    :cond_0
    const/4 v5, -0x1

    if-nez v2, :cond_1

    .line 371
    :try_start_2
    sget v6, Ll/ܳ᩷ܽ;->᩵:I

    goto :goto_1

    :cond_1
    move/from16 v6, p1

    if-eq v6, v5, :cond_2

    goto :goto_1

    .line 373
    :cond_2
    invoke-static {v2, v3}, Ll/ܽۘᩳ;->֫(I[B)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    const/4 v6, -0x1

    goto :goto_0

    .line 374
    :cond_3
    invoke-static {v6}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;)I

    move-result v6

    :goto_0
    if-ne v6, v5, :cond_4

    .line 375
    invoke-static {v2, v3}, Ll/ܳ᩷ܽ;->ۧ(I[B)I

    move-result v6

    .line 219
    :cond_4
    :goto_1
    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V

    .line 220
    sget v7, Ll/ܳ᩷ܽ;->᩵:I

    if-eq v6, v7, :cond_9

    sget v7, Ll/ܳ᩷ܽ;->֡:I

    if-ne v6, v7, :cond_5

    goto :goto_2

    .line 224
    :cond_5
    sget v7, Ll/ܳ᩷ܽ;->ܺ:I

    const-wide/16 v8, 0x2

    if-ne v6, v7, :cond_6

    .line 225
    invoke-static {v2, v3}, Ll/ۧ᩷ܽ;->֫(I[B)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 226
    invoke-static {v8, v9, v1}, Ll/᩹ۢ֡;->ۧ(JLjava/io/InputStream;)V

    goto :goto_3

    .line 228
    :cond_6
    sget v7, Ll/ܳ᩷ܽ;->ۖ:I

    if-ne v6, v7, :cond_7

    .line 229
    invoke-static {v2, v3}, Ll/ۧ᩷ܽ;->ۧ(I[B)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 230
    invoke-static {v8, v9, v1}, Ll/᩹ۢ֡;->ۧ(JLjava/io/InputStream;)V

    goto :goto_3

    .line 232
    :cond_7
    sget v7, Ll/ܳ᩷ܽ;->ۘ:I

    const-wide/16 v8, 0x4

    if-ne v6, v7, :cond_8

    .line 233
    invoke-static {v2, v3}, Ll/ۧ᩷ܽ;->ܽ(I[B)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 234
    invoke-static {v8, v9, v1}, Ll/᩹ۢ֡;->ۧ(JLjava/io/InputStream;)V

    goto :goto_3

    .line 236
    :cond_8
    sget v7, Ll/ܳ᩷ܽ;->ᩴ:I

    if-ne v6, v7, :cond_a

    .line 237
    invoke-static {v2, v3}, Ll/ۧ᩷ܽ;->ᩳ(I[B)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 238
    invoke-static {v8, v9, v1}, Ll/᩹ۢ֡;->ۧ(JLjava/io/InputStream;)V

    goto :goto_3

    .line 221
    :cond_9
    :goto_2
    invoke-static {v2, v3}, Ll/ۧ᩷ܽ;->ܿ(I[B)Z

    move-result v2

    if-eqz v2, :cond_a

    const-wide/16 v2, 0x3

    .line 222
    invoke-static {v2, v3, v1}, Ll/᩹ۢ֡;->ۧ(JLjava/io/InputStream;)V

    .line 241
    :cond_a
    :goto_3
    new-instance v2, Ll/۬ۖܽ;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-static {v6}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v7

    invoke-direct {v3, v1, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v2, v3}, Ll/۬ۖܽ;-><init>(Ljava/io/InputStreamReader;)V

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/CharSequence;

    const/4 v7, 0x0

    const/4 v8, 0x0

    aput-object v7, v3, v8

    .line 243
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 248
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 249
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 250
    sget-object v11, Ll/֫ۨۡ;->ᩳ:Ljava/util/concurrent/ExecutorService;

    .line 39
    sget v11, Ll/ܿ᩸ۡ;->֫:I

    invoke-static {v11}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 252
    :try_start_3
    new-instance v12, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v12}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 255
    sget v13, Ll/ܿ᩸ᩳ;->֫:I

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v7

    .line 256
    :goto_4
    invoke-virtual {v2}, Ll/۬ۖܽ;->read()I

    move-result v7

    if-eq v7, v5, :cond_17

    if-lt v14, v13, :cond_10

    int-to-char v5, v7

    .line 257
    sget v17, Ll/֫᩻᩵;->֫:I

    move-object/from16 v17, v4

    const v4, 0xd800

    if-lt v5, v4, :cond_b

    const v4, 0xe000

    if-ge v5, v4, :cond_b

    goto/16 :goto_8

    .line 258
    :cond_b
    invoke-interface/range {p2 .. p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-nez v4, :cond_f

    .line 261
    :goto_5
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v4

    const/4 v5, 0x3

    if-lt v4, v5, :cond_c

    const-wide/16 v4, 0xa

    .line 262
    invoke-static {v4, v5}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_5

    .line 264
    :cond_c
    invoke-static {}, Ll/ᩳۚᩳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v14

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    const/16 v5, 0xa

    .line 265
    invoke-static {v8, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    .line 267
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v14
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit16 v14, v14, -0x3e8

    if-lt v5, v14, :cond_d

    const/4 v14, 0x0

    .line 268
    :try_start_4
    invoke-virtual {v8, v14, v5}, Ljava/lang/StringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v18

    .line 269
    invoke-virtual {v8, v14, v5}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_6
    move-object/from16 v5, v18

    goto :goto_7

    .line 271
    :cond_d
    :try_start_5
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/4 v14, 0x0

    .line 272
    :try_start_6
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->setLength(I)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_6

    .line 274
    :goto_7
    :try_start_7
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 275
    new-instance v14, Ll/ܰܶᩳ;

    invoke-direct {v14, v4, v5, v12}, Ll/ܰܶᩳ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/CharSequence;Ljava/util/concurrent/atomic/AtomicInteger;)V

    invoke-interface {v11, v14}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v14

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v15, :cond_e

    const/4 v14, 0x0

    aput-object v5, v3, v14

    const/4 v15, 0x1

    .line 284
    :cond_e
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v14

    .line 285
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 259
    :cond_f
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0

    :cond_10
    move-object/from16 v17, v4

    :goto_8
    const/16 v4, 0xd

    if-ne v7, v4, :cond_16

    const/16 v4, 0xa

    .line 288
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v14, 0x1

    .line 290
    invoke-virtual {v2}, Ll/۬ۖܽ;->read()I

    move-result v7

    if-nez v16, :cond_12

    if-ne v7, v4, :cond_11

    const-string v4, "\r\n"

    goto :goto_9

    :cond_11
    const-string v4, "\r"

    :goto_9
    move-object/from16 v16, v4

    :cond_12
    const/4 v4, -0x1

    if-eq v7, v4, :cond_15

    const/16 v4, 0xa

    if-ne v7, v4, :cond_13

    goto :goto_b

    :cond_13
    const/16 v5, 0xd

    if-ne v7, v5, :cond_14

    .line 298
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_a

    :cond_14
    int-to-char v4, v7

    .line 301
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_a
    add-int/lit8 v14, v14, 0x2

    goto :goto_c

    :cond_15
    :goto_b
    move v14, v5

    goto :goto_c

    :cond_16
    int-to-char v4, v7

    .line 305
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v14, v14, 0x1

    :goto_c
    const/4 v5, -0x1

    move-object/from16 v4, v17

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_f

    :catch_0
    move-exception v0

    goto/16 :goto_11

    :catch_1
    move-exception v0

    goto/16 :goto_11

    :catch_2
    move-exception v0

    goto/16 :goto_11

    :cond_17
    move-object/from16 v17, v4

    if-nez v16, :cond_18

    move-object/from16 v4, v17

    goto :goto_d

    :cond_18
    move-object/from16 v4, v16

    :goto_d
    if-eqz v15, :cond_1b

    if-lez v14, :cond_19

    .line 314
    invoke-static {}, Ll/ᩳۚᩳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 315
    invoke-static {v0, v8}, Ll/ܿ᩸ᩳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/CharSequence;)V

    .line 316
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    :cond_19
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_3
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Future;
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 320
    :try_start_8
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_8
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_e

    :catch_4
    move-exception v0

    move-object v2, v0

    .line 322
    :try_start_9
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0

    .line 327
    :cond_1a
    new-instance v0, Ll/ۧ᩸ᩳ;

    const/4 v2, 0x0

    aget-object v2, v3, v2

    invoke-direct {v0, v2, v4, v9, v6}, Ll/ۧ᩸ᩳ;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/util/ArrayList;I)V
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 364
    :try_start_a
    invoke-interface {v11}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 366
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object v0

    .line 329
    :cond_1b
    :try_start_b
    new-instance v0, Ll/ۧ᩸ᩳ;

    invoke-direct {v0, v4, v8, v6}, Ll/ۧ᩸ᩳ;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V
    :try_end_b
    .catch Ljava/util/concurrent/CancellationException; {:try_start_b .. :try_end_b} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_b .. :try_end_b} :catch_5
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/lang/Error; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 364
    :try_start_c
    invoke-interface {v11}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 366
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object v0

    .line 358
    :goto_f
    :try_start_d
    invoke-static {v10}, Ll/ܿ᩸ᩳ;->֫(Ljava/util/ArrayList;)V

    .line 359
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩵ܿ;

    .line 360
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_10

    .line 362
    :cond_1c
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 352
    :goto_11
    invoke-static {v10}, Ll/ܿ᩸ᩳ;->֫(Ljava/util/ArrayList;)V

    .line 353
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩵ܿ;

    .line 354
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_12

    .line 356
    :cond_1d
    throw v0

    :catch_5
    const/4 v14, 0x0

    :catch_6
    const/4 v2, 0x0

    .line 337
    aput-object v2, v3, v14

    .line 338
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 339
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->trimToSize()V

    .line 340
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catchall_1
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Future;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 342
    :try_start_e
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    goto :goto_13

    .line 347
    :cond_1e
    :try_start_f
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 348
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 349
    sget v0, Ll/ܿ᩸ᩳ;->֫:I

    int-to-float v0, v0

    const/high16 v2, 0x3f400000    # 0.75f

    mul-float v0, v0, v2

    float-to-int v0, v0

    sput v0, Ll/ܿ᩸ᩳ;->֫:I

    .line 350
    new-instance v0, Ll/ܽ᩸ᩳ;

    .line 388
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 350
    throw v0

    .line 331
    :catch_7
    invoke-static {v10}, Ll/ܿ᩸ᩳ;->֫(Ljava/util/ArrayList;)V

    .line 332
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩵ܿ;

    .line 333
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    goto :goto_14

    .line 364
    :cond_1f
    :try_start_10
    invoke-interface {v11}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 366
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    const/4 v1, 0x0

    return-object v1

    :catchall_2
    move-exception v0

    .line 364
    :try_start_11
    invoke-interface {v11}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 365
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    :catchall_3
    move-exception v0

    move-object v2, v0

    if-eqz v1, :cond_20

    .line 210
    :try_start_12
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    goto :goto_15

    :catchall_4
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_20
    :goto_15
    throw v2
.end method

.method public static ֫(Ljava/util/ArrayList;)V
    .locals 2

    .line 392
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    const/4 v1, 0x1

    .line 393
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 395
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/CharSequence;)V
    .locals 5

    .line 402
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 406
    new-instance v1, Ll/ܰۖܽ;

    new-instance v2, Ll/ۗۖܽ;

    new-instance v3, Ll/ۤۖܽ;

    const/4 v4, 0x0

    .line 446
    invoke-virtual {p0, v4}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p0

    .line 406
    invoke-direct {v3, p0}, Ll/ۤۖܽ;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v2, v3}, Ll/ۗۖܽ;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v1, v2}, Ll/ܰۖܽ;-><init>(Ljava/io/OutputStream;)V

    .line 407
    :try_start_0
    invoke-virtual {v1, p1, v4, v0}, Ll/ܰۖܽ;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 408
    invoke-virtual {v1}, Ll/ܰۖܽ;->close()V

    return-void

    :catchall_0
    move-exception p0

    .line 406
    :try_start_1
    invoke-virtual {v1}, Ll/ܰۖܽ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method
