.class public final Ll/ᩳۗᩳ;
.super Ljava/lang/Object;
.source "N6TT"


# instance fields
.field public final ֫:Ll/ܿ᩹ᩳ;

.field public final ۧ:Ljava/util/HashMap;

.field public final synthetic ܽ:Ll/ܳۗᩳ;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/ܳۗᩳ;Ll/ܿ᩹ᩳ;)V
    .locals 0

    .line 177
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    .line 174
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ᩳۗᩳ;->ᩳ:Ljava/util/HashMap;

    .line 175
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ᩳۗᩳ;->ۧ:Ljava/util/HashMap;

    .line 177
    iput-object p2, p0, Ll/ᩳۗᩳ;->֫:Ll/ܿ᩹ᩳ;

    return-void
.end method

.method public static ֫(Ll/ܺۙᩳ;IZLjava/lang/Runnable;)V
    .locals 12

    .line 333
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    new-instance v0, Ll/᩷ۙᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ll/᩷ۙᩳ;-><init>(Ll/ܺۙᩳ;Z)V

    .line 334
    :cond_0
    invoke-virtual {v0}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_a

    .line 335
    invoke-virtual {v0}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۡ۬ᩳ;

    iget-object p0, p0, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    if-eqz p2, :cond_1

    .line 336
    invoke-virtual {p0}, Ll/ܺۙᩳ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    new-instance v2, Ll/᩷ۙᩳ;

    invoke-direct {v2, p0, v1}, Ll/᩷ۙᩳ;-><init>(Ll/ܺۙᩳ;Z)V

    move-object p0, v2

    .line 337
    :cond_2
    :goto_0
    move-object v2, p0

    check-cast v2, Ll/᩷ۙᩳ;

    invoke-virtual {v2}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 338
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 339
    invoke-virtual {v2}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺᩶ᩳ;

    iget-object v3, v2, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    iget-object v4, v2, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    iget-object v5, v2, Ll/᩺᩶ᩳ;->᩻:Ll/ۚۗᩳ;

    const-string v6, "Historical selection exceeds text length"

    if-eqz p2, :cond_4

    .line 353
    invoke-virtual {v5}, Ll/ۚۗᩳ;->ܽ()I

    move-result v7

    if-gt v7, p1, :cond_3

    invoke-virtual {v5}, Ll/ۚۗᩳ;->֫()I

    move-result v7

    if-gt v7, p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_1
    if-eqz p2, :cond_5

    .line 341
    invoke-virtual {v4}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v7

    goto :goto_2

    :cond_5
    invoke-virtual {v3}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v7

    :goto_2
    if-eqz p2, :cond_6

    .line 342
    invoke-virtual {v3}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v3

    goto :goto_3

    :cond_6
    invoke-virtual {v4}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v3

    .line 343
    :goto_3
    iget v2, v2, Ll/᩺᩶ᩳ;->ۜ:I

    if-gt v2, p1, :cond_9

    sub-int v2, p1, v2

    if-gt v7, v2, :cond_9

    int-to-long v8, p1

    int-to-long v10, v7

    sub-long/2addr v8, v10

    int-to-long v2, v3

    add-long/2addr v8, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long p1, v8, v2

    if-gtz p1, :cond_8

    long-to-int p1, v8

    if-nez p2, :cond_2

    .line 353
    invoke-virtual {v5}, Ll/ۚۗᩳ;->ܽ()I

    move-result v2

    if-gt v2, p1, :cond_7

    invoke-virtual {v5}, Ll/ۚۗᩳ;->֫()I

    move-result v2

    if-gt v2, p1, :cond_7

    goto :goto_0

    :cond_7
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 345
    :cond_8
    new-instance p0, Ljava/io/IOException;

    const-string p1, "History replay exceeds coordinate limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 343
    :cond_9
    new-instance p0, Ljava/io/IOException;

    const-string p1, "History range exceeds replayed text"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    return-void
.end method


# virtual methods
.method public final ֫(IJ)Ljava/lang/Object;
    .locals 1

    .line 304
    iget-object v0, p0, Ll/ᩳۗᩳ;->ᩳ:Ljava/util/HashMap;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܿۗᩳ;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 306
    :cond_0
    invoke-static {p2}, Ll/ܿۗᩳ;->֫(Ll/ܿۗᩳ;)I

    move-result p3

    if-ne p3, p1, :cond_1

    .line 307
    invoke-static {p2}, Ll/ܿۗᩳ;->ۧ(Ll/ܿۗᩳ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 306
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Conflicting history reference types"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/۬ۜܽ;)Ll/ۚۗᩳ;
    .locals 7

    .line 296
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    const/4 v1, -0x1

    if-lt v0, v1, :cond_0

    if-lt p1, v1, :cond_0

    int-to-long v1, v0

    const/16 v3, 0x20

    shl-long/2addr v1, v3

    int-to-long v3, p1

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long/2addr v1, v3

    .line 300
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-instance v2, Ll/ܽۗᩳ;

    invoke-direct {v2, v0, p1}, Ll/ܽۗᩳ;-><init>(II)V

    iget-object p1, p0, Ll/ᩳۗᩳ;->ۧ:Ljava/util/HashMap;

    invoke-static {p1, v1, v2}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚۗᩳ;

    return-object p1

    .line 297
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid history selection"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(IJJZ)Ll/ۢۙᩳ;
    .locals 17

    move-object/from16 v8, p0

    move/from16 v0, p1

    move-wide/from16 v9, p2

    const-wide/16 v1, 0x0

    cmp-long v3, v9, v1

    if-nez v3, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/16 v3, 0x2e

    if-gt v0, v3, :cond_e

    move-wide/from16 v4, p4

    .line 209
    invoke-virtual {v8, v9, v10, v4, v5}, Ll/ᩳۗᩳ;->ۧ(JJ)Ll/ۧۗᩳ;

    move-result-object v11

    .line 210
    :try_start_0
    iget-object v4, v11, Ll/ۧۗᩳ;->᩸:Ll/۬ۜܽ;

    invoke-virtual {v4}, Ll/۬ۜܽ;->readInt()I

    move-result v12

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-eqz p6, :cond_1

    const/4 v6, 0x2

    goto :goto_0

    :cond_1
    const/4 v6, 0x4

    :goto_0
    if-eq v12, v6, :cond_4

    if-eqz p6, :cond_2

    const/4 v6, 0x3

    goto :goto_1

    :cond_2
    const/4 v6, 0x5

    :goto_1
    if-ne v12, v6, :cond_3

    goto :goto_2

    .line 212
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid history sequence type"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 214
    :cond_4
    :goto_2
    invoke-virtual {v8, v12, v9, v10}, Ll/ᩳۗᩳ;->֫(IJ)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 215
    check-cast v6, Ll/ۢۙᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    invoke-virtual {v11}, Ll/ۧۗᩳ;->close()V

    return-object v6

    .line 216
    :cond_5
    :try_start_1
    iget-object v6, v8, Ll/ᩳۗᩳ;->֫:Ll/ܿ᩹ᩳ;

    invoke-virtual {v6}, Ll/ܿ᩹ᩳ;->֫()V

    if-eq v12, v5, :cond_b

    if-ne v12, v4, :cond_6

    goto/16 :goto_3

    .line 223
    :cond_6
    iget v4, v11, Ll/ۧۗᩳ;->᩶:I

    const/16 v6, 0x1c

    if-ne v4, v6, :cond_a

    .line 224
    iget-object v4, v11, Ll/ۧۗᩳ;->᩸:Ll/۬ۜܽ;

    invoke-virtual {v4}, Ll/۬ۜܽ;->readInt()I

    move-result v13

    iget-object v4, v11, Ll/ۧۗᩳ;->᩸:Ll/۬ۜܽ;

    invoke-virtual {v4}, Ll/۬ۜܽ;->readInt()I

    move-result v14

    .line 225
    iget-object v4, v11, Ll/ۧۗᩳ;->᩸:Ll/۬ۜܽ;

    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v6

    iget-object v4, v11, Ll/ۧۗᩳ;->᩸:Ll/۬ۜܽ;

    invoke-virtual {v4}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v15

    if-lt v13, v5, :cond_9

    if-gt v13, v3, :cond_9

    if-lt v14, v5, :cond_9

    cmp-long v3, v6, v1

    if-eqz v3, :cond_9

    cmp-long v3, v15, v1

    if-eqz v3, :cond_9

    .line 227
    iget-object v1, v8, Ll/ᩳۗᩳ;->֫:Ll/ܿ᩹ᩳ;

    iget v1, v1, Ll/ܿ᩹ᩳ;->֫:I

    if-gt v14, v1, :cond_8

    const/4 v5, 0x1

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    move v2, v0

    move-wide v3, v6

    const/4 v7, 0x1

    move-wide/from16 v5, p2

    move/from16 p4, v12

    const/4 v12, 0x1

    move/from16 v7, p6

    .line 228
    invoke-virtual/range {v1 .. v7}, Ll/ᩳۗᩳ;->֫(IJJZ)Ll/ۢۙᩳ;

    move-result-object v7

    move-object/from16 v1, p0

    move v2, v0

    move-wide v3, v15

    move-wide/from16 v5, p2

    move-object v0, v7

    move/from16 v7, p6

    invoke-virtual/range {v1 .. v7}, Ll/ᩳۗᩳ;->֫(IJJZ)Ll/ۢۙᩳ;

    move-result-object v1

    .line 229
    iget v2, v0, Ll/ۢۙᩳ;->֫:I

    iget v3, v1, Ll/ۢۙᩳ;->֫:I

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-gt v2, v12, :cond_7

    iget v2, v0, Ll/ۢۙᩳ;->֫:I

    iget v3, v1, Ll/ۢۙᩳ;->֫:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v2, v12

    if-ne v13, v2, :cond_7

    iget v2, v0, Ll/ۢۙᩳ;->᩻:I

    int-to-long v2, v2

    iget v4, v1, Ll/ۢۙᩳ;->᩻:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    int-to-long v4, v14

    cmp-long v6, v2, v4

    if-nez v6, :cond_7

    .line 242
    new-instance v2, Ll/ۢۙᩳ;

    invoke-direct {v2, v0, v1}, Ll/ۢۙᩳ;-><init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V

    goto :goto_5

    .line 230
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid history sequence balance"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 227
    :cond_8
    new-instance v0, Ll/ܰ۬ᩳ;

    const-string v1, "History logical size limit exceeded"

    .line 8
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 227
    throw v0

    .line 226
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid history sequence metadata"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 223
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid history sequence branch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    :goto_3
    move/from16 p4, v12

    .line 219
    iget v0, v11, Ll/ۧۗᩳ;->᩶:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_d

    .line 220
    iget-object v0, v11, Ll/ۧۗᩳ;->᩸:Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v0

    .line 221
    new-instance v2, Ll/ۢۙᩳ;

    if-eqz p6, :cond_c

    invoke-virtual {v8, v0, v1, v9, v10}, Ll/ᩳۗᩳ;->ܽ(JJ)Ll/ۡ۬ᩳ;

    move-result-object v0

    goto :goto_4

    :cond_c
    invoke-virtual {v8, v0, v1, v9, v10}, Ll/ᩳۗᩳ;->֫(JJ)Ll/᩺᩶ᩳ;

    move-result-object v0

    :goto_4
    invoke-direct {v2, v0}, Ll/ۢۙᩳ;-><init>(Ljava/lang/Object;)V

    .line 233
    :goto_5
    iget-object v0, v8, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-static {v0}, Ll/ܳۗᩳ;->ۧ(Ll/ܳۗᩳ;)Ll/᩸۬ᩳ;

    move-result-object v0

    iput-object v0, v2, Ll/ۢۙᩳ;->ܿ:Ll/᩸۬ᩳ;

    .line 234
    iput-wide v9, v2, Ll/ۢۙᩳ;->ᩳ:J

    .line 235
    iget-object v0, v8, Ll/ᩳۗᩳ;->ᩳ:Ljava/util/HashMap;

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-instance v3, Ll/ܿۗᩳ;

    move/from16 v4, p4

    invoke-direct {v3, v4, v2}, Ll/ܿۗᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 237
    invoke-virtual {v11}, Ll/ۧۗᩳ;->close()V

    return-object v2

    .line 219
    :cond_d
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid history sequence leaf"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 209
    :try_start_3
    invoke-virtual {v11}, Ll/ۧۗᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v1

    .line 208
    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid history sequence depth"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(JJ)Ll/᩺᩶ᩳ;
    .locals 24

    move-object/from16 v1, p0

    move-wide/from16 v11, p1

    .line 269
    invoke-virtual/range {p0 .. p4}, Ll/ᩳۗᩳ;->ۧ(JJ)Ll/ۧۗᩳ;

    move-result-object v13

    .line 270
    :try_start_0
    iget-object v0, v13, Ll/ۧۗᩳ;->᩸:Ll/۬ۜܽ;

    .line 271
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const/4 v14, 0x7

    if-ne v2, v14, :cond_2

    iget v2, v13, Ll/ۧۗᩳ;->᩶:I

    const/16 v3, 0x48

    if-ne v2, v3, :cond_2

    .line 272
    invoke-virtual {v1, v14, v11, v12}, Ll/ᩳۗᩳ;->֫(IJ)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 273
    check-cast v2, Ll/᩺᩶ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    invoke-virtual {v13}, Ll/ۧۗᩳ;->close()V

    return-object v2

    .line 274
    :cond_0
    :try_start_1
    iget-object v2, v1, Ll/ᩳۗᩳ;->֫:Ll/ܿ᩹ᩳ;

    invoke-virtual {v2}, Ll/ܿ᩹ᩳ;->֫()V

    .line 275
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v15

    .line 276
    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v17

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v19

    .line 277
    invoke-virtual {v1, v0}, Ll/ᩳۗᩳ;->֫(Ll/۬ۜܽ;)Ll/ۚۗᩳ;

    move-result-object v21

    .line 290
    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v3

    .line 291
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v8

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v7

    .line 292
    iget-object v2, v1, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-static {v2}, Ll/ܳۗᩳ;->ܽ(Ll/ܳۗᩳ;)Ll/ܳ᩹ᩳ;

    move-result-object v2

    iget-object v10, v1, Ll/ᩳۗᩳ;->֫:Ll/ܿ᩹ᩳ;

    move-wide/from16 v5, p1

    invoke-virtual/range {v2 .. v10}, Ll/ܳ᩹ᩳ;->֫(JJIIILl/ܿ᩹ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v22

    .line 290
    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v3

    .line 291
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v8

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v7

    .line 292
    iget-object v0, v1, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-static {v0}, Ll/ܳۗᩳ;->ܽ(Ll/ܳۗᩳ;)Ll/ܳ᩹ᩳ;

    move-result-object v2

    iget-object v10, v1, Ll/ᩳۗᩳ;->֫:Ll/ܿ᩹ᩳ;

    move-wide/from16 v5, p1

    invoke-virtual/range {v2 .. v10}, Ll/ܳ᩹ᩳ;->֫(JJIIILl/ܿ᩹ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v23

    if-ltz v15, :cond_1

    int-to-long v2, v15

    .line 279
    invoke-virtual/range {v22 .. v22}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v4, v2

    const-wide/32 v6, 0x7fffffff

    cmp-long v0, v4, v6

    if-gtz v0, :cond_1

    invoke-virtual/range {v23 .. v23}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v2, v4

    cmp-long v0, v2, v6

    if-gtz v0, :cond_1

    const-wide/16 v2, 0x0

    cmp-long v0, v17, v2

    if-ltz v0, :cond_1

    cmp-long v0, v19, v2

    if-ltz v0, :cond_1

    .line 281
    new-instance v0, Ll/᩺᩶ᩳ;

    move v2, v15

    move-object v15, v0

    move/from16 v16, v2

    invoke-direct/range {v15 .. v23}, Ll/᩺᩶ᩳ;-><init>(IJJLl/ۚۗᩳ;Ll/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;)V

    .line 282
    iget-object v2, v1, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-static {v2}, Ll/ܳۗᩳ;->ۧ(Ll/ܳۗᩳ;)Ll/᩸۬ᩳ;

    move-result-object v2

    iput-object v2, v0, Ll/᩺᩶ᩳ;->ܿ:Ll/᩸۬ᩳ;

    .line 283
    iput-wide v11, v0, Ll/᩺᩶ᩳ;->ᩳ:J

    .line 284
    iget-object v2, v1, Ll/ᩳۗᩳ;->ᩳ:Ljava/util/HashMap;

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    new-instance v4, Ll/ܿۗᩳ;

    invoke-direct {v4, v14, v0}, Ll/ܿۗᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 286
    invoke-virtual {v13}, Ll/ۧۗᩳ;->close()V

    return-object v0

    .line 280
    :cond_1
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid history change metadata"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 271
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid history change shape"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 269
    :try_start_3
    invoke-virtual {v13}, Ll/ۧۗᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
.end method

.method public final ֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JJ)V
    .locals 9

    .line 311
    invoke-virtual {p1}, Ll/ܺۙᩳ;->ۧ()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p2}, Ll/ܺۙᩳ;->ۧ()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-object v2, p0, Ll/ᩳۗᩳ;->֫:Ll/ܿ᩹ᩳ;

    iget v3, v2, Ll/ܿ᩹ᩳ;->֫:I

    int-to-long v3, v3

    cmp-long v5, v0, v3

    if-gtz v5, :cond_7

    .line 312
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x2

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object p2, v3, p1

    .line 0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v5, v3, v4

    invoke-static {v5, p2, v5, v4, p1}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v4

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 314
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide/16 v3, 0x0

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺۙᩳ;

    .line 315
    invoke-virtual {p2}, Ll/ܺۙᩳ;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    move-object v1, p2

    check-cast v1, Ll/᩷ۙᩳ;

    invoke-virtual {v1}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ۬ᩳ;

    .line 316
    iget-wide v5, v1, Ll/ۡ۬ᩳ;->ۧ:J

    iget-object v1, v1, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    cmp-long v7, v5, p3

    if-gez v7, :cond_5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 317
    invoke-virtual {v1}, Ll/ܺۙᩳ;->ۧ()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v3, v5

    .line 318
    iget v5, v2, Ll/ܿ᩹ᩳ;->֫:I

    int-to-long v5, v5

    cmp-long v7, v3, v5

    if-gtz v7, :cond_4

    .line 319
    invoke-virtual {v1}, Ll/ܺۙᩳ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    move-object v5, v1

    check-cast v5, Ll/᩷ۙᩳ;

    invoke-virtual {v5}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺᩶ᩳ;

    .line 320
    iget-object v6, p0, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-static {v6}, Ll/ܳۗᩳ;->֫(Ll/ܳۗᩳ;)Ljava/lang/Runnable;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Runnable;->run()V

    .line 321
    iget-wide v6, v5, Ll/᩺᩶ᩳ;->ܽ:J

    cmp-long v8, v6, p5

    if-gtz v8, :cond_3

    iget-wide v5, v5, Ll/᩺᩶ᩳ;->ۧ:J

    cmp-long v7, v5, p5

    if-gtz v7, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid historical edit mark"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 318
    :cond_4
    new-instance p1, Ll/ܰ۬ᩳ;

    const-string p2, "History replay size limit exceeded"

    .line 8
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 318
    throw p1

    .line 316
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid history record identity"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    return-void

    .line 311
    :cond_7
    new-instance p1, Ll/ܰ۬ᩳ;

    const-string p2, "History record count limit exceeded"

    .line 8
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 311
    throw p1
.end method

.method public final ۧ(JJ)Ll/ۧۗᩳ;
    .locals 6

    .line 180
    iget-object v0, p0, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-static {v0}, Ll/ܳۗᩳ;->֫(Ll/ܳۗᩳ;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const-wide/16 v0, 0x40

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    cmp-long v0, p1, p3

    if-gez v0, :cond_1

    .line 183
    iget-object v0, p0, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-static {v0}, Ll/ܳۗᩳ;->ۧ(Ll/ܳۗᩳ;)Ll/᩸۬ᩳ;

    move-result-object v0

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-static {v1}, Ll/ܳۗᩳ;->ۧ(Ll/ܳۗᩳ;)Ll/᩸۬ᩳ;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ll/᩸۬ᩳ;->ۧ(J)Ll/۟۬ᩳ;

    move-result-object v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    iget v0, v1, Ll/۟۬ᩳ;->ᩳ:I

    const/4 v2, 0x5

    if-ne v0, v2, :cond_0

    iget v0, v1, Ll/۟۬ᩳ;->ܽ:I

    const/4 v2, 0x4

    if-lt v0, v2, :cond_0

    const/16 v2, 0x48

    if-gt v0, v2, :cond_0

    const-wide/16 v2, 0x20

    add-long/2addr v2, p1

    int-to-long v4, v0

    add-long/2addr v2, v4

    const-wide/16 v4, 0x10

    add-long/2addr v2, v4

    cmp-long v0, v2, p3

    if-gtz v0, :cond_0

    iget-wide p3, v1, Ll/۟۬ᩳ;->֫:J

    iget-object v0, p0, Ll/ᩳۗᩳ;->֫:Ll/ܿ᩹ᩳ;

    iget-wide v2, v0, Ll/ܿ᩹ᩳ;->ۧ:J

    cmp-long v0, p3, v2

    if-gez v0, :cond_0

    .line 187
    iget-object p3, p0, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-static {p3}, Ll/ܳۗᩳ;->ۧ(Ll/ܳۗᩳ;)Ll/᩸۬ᩳ;

    move-result-object p3

    iget-object p3, p3, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget p4, v1, Ll/۟۬ᩳ;->ܽ:I

    int-to-long v2, p4

    add-long/2addr v2, v4

    invoke-virtual {p3, v2, v3}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object p3

    .line 189
    :try_start_1
    new-instance p4, Ll/ۧۗᩳ;

    new-instance v0, Ll/۬ۜܽ;

    iget-object v2, p0, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-static {v2}, Ll/ܳۗᩳ;->ۧ(Ll/ܳۗᩳ;)Ll/᩸۬ᩳ;

    move-result-object v2

    invoke-virtual {v2, p1, p2, v1}, Ll/᩸۬ᩳ;->֫(JLl/۟۬ᩳ;)[B

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۜܽ;-><init>([B)V

    iget p1, v1, Ll/۟۬ᩳ;->ܽ:I

    invoke-direct {p4, v0, p1, p3}, Ll/ۧۗᩳ;-><init>(Ll/۬ۜܽ;ILl/ۚ۬ᩳ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-object p4

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 191
    :goto_0
    invoke-virtual {p3}, Ll/ۚ۬ᩳ;->close()V

    .line 192
    throw p1

    .line 186
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid history frame boundary"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 183
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 181
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid history reference"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(JJ)Ll/ۡ۬ᩳ;
    .locals 20

    move-object/from16 v8, p0

    move-wide/from16 v9, p1

    .line 246
    invoke-virtual/range {p0 .. p4}, Ll/ᩳۗᩳ;->ۧ(JJ)Ll/ۧۗᩳ;

    move-result-object v11

    .line 247
    :try_start_0
    iget-object v0, v11, Ll/ۧۗᩳ;->᩸:Ll/۬ۜܽ;

    .line 248
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const/4 v12, 0x6

    if-ne v1, v12, :cond_5

    iget v1, v11, Ll/ۧۗᩳ;->᩶:I

    const/16 v2, 0x24

    if-ne v1, v2, :cond_5

    .line 249
    invoke-virtual {v8, v12, v9, v10}, Ll/ᩳۗᩳ;->֫(IJ)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 250
    check-cast v1, Ll/ۡ۬ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 265
    invoke-virtual {v11}, Ll/ۧۗᩳ;->close()V

    return-object v1

    .line 251
    :cond_0
    :try_start_1
    iget-object v1, v8, Ll/ᩳۗᩳ;->֫:Ll/ܿ᩹ᩳ;

    invoke-virtual {v1}, Ll/ܿ᩹ᩳ;->֫()V

    .line 252
    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v14

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v16

    .line 253
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v13

    .line 254
    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v3

    .line 255
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const-wide/16 v1, 0x0

    cmp-long v5, v14, v1

    if-lez v5, :cond_4

    if-ltz v13, :cond_4

    const/4 v1, 0x1

    if-gt v13, v1, :cond_4

    if-lez v0, :cond_4

    .line 257
    iget-object v1, v8, Ll/ᩳۗᩳ;->֫:Ll/ܿ᩹ᩳ;

    iget v1, v1, Ll/ܿ᩹ᩳ;->֫:I

    if-gt v0, v1, :cond_3

    .line 203
    new-instance v7, Ll/ܺۙᩳ;

    const/16 v18, 0x0

    const/4 v2, 0x0

    move-object/from16 v1, p0

    move-wide/from16 v5, p1

    move-object v12, v7

    move/from16 v7, v18

    invoke-virtual/range {v1 .. v7}, Ll/ᩳۗᩳ;->֫(IJJZ)Ll/ۢۙᩳ;

    move-result-object v1

    invoke-direct {v12, v1}, Ll/ܺۙᩳ;-><init>(Ll/ۢۙᩳ;)V

    .line 259
    invoke-virtual {v12}, Ll/ܺۙᩳ;->ۧ()I

    move-result v1

    if-ne v1, v0, :cond_2

    .line 260
    new-instance v0, Ll/ۡ۬ᩳ;

    if-nez v13, :cond_1

    sget-object v1, Ll/ܰ᩶ᩳ;->۫:Ll/ܰ᩶ᩳ;

    :goto_0
    move-object/from16 v18, v1

    goto :goto_1

    :cond_1
    sget-object v1, Ll/ܰ᩶ᩳ;->᩹:Ll/ܰ᩶ᩳ;

    goto :goto_0

    :goto_1
    move-object v13, v0

    move-object/from16 v19, v12

    invoke-direct/range {v13 .. v19}, Ll/ۡ۬ᩳ;-><init>(JJLl/ܰ᩶ᩳ;Ll/ܺۙᩳ;)V

    .line 261
    iget-object v1, v8, Ll/ᩳۗᩳ;->ܽ:Ll/ܳۗᩳ;

    invoke-static {v1}, Ll/ܳۗᩳ;->ۧ(Ll/ܳۗᩳ;)Ll/᩸۬ᩳ;

    move-result-object v1

    iput-object v1, v0, Ll/ۡ۬ᩳ;->ܿ:Ll/᩸۬ᩳ;

    .line 262
    iput-wide v9, v0, Ll/ۡ۬ᩳ;->ᩳ:J

    .line 263
    iget-object v1, v8, Ll/ᩳۗᩳ;->ᩳ:Ljava/util/HashMap;

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Ll/ܿۗᩳ;

    const/4 v4, 0x6

    invoke-direct {v3, v4, v0}, Ll/ܿۗᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 265
    invoke-virtual {v11}, Ll/ۧۗᩳ;->close()V

    return-object v0

    .line 259
    :cond_2
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "History change count mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 257
    :cond_3
    new-instance v0, Ll/ܰ۬ᩳ;

    const-string v1, "History change count limit exceeded"

    .line 8
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 257
    throw v0

    .line 256
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid history record metadata"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 248
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid history record shape"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 246
    :try_start_3
    invoke-virtual {v11}, Ll/ۧۗᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method
