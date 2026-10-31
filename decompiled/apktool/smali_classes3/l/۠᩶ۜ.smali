.class public final Ll/۠᩶ۜ;
.super Ljava/lang/Object;
.source "T72Q"


# static fields
.field public static final ֫:Ljava/lang/Object;

.field public static ۧ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 25
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۠᩶ۜ;->֫:Ljava/lang/Object;

    return-void
.end method

.method public static ֫([B)Ljava/util/ArrayList;
    .locals 6

    .line 265
    invoke-static {p0}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object p0

    .line 266
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const v1, 0x4d504c01    # 2.1841512E8f

    if-ne v0, v1, :cond_4

    .line 269
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-lez v0, :cond_3

    int-to-long v1, v0

    .line 270
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_3

    .line 273
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 275
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v3

    .line 276
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    .line 279
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 277
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid music path"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 281
    :cond_1
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-nez p0, :cond_2

    return-object v1

    .line 282
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Trailing music playlist data"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 271
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid music playlist size"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 267
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported music playlist format"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫()Ll/֨᩶ۜ;
    .locals 15

    .line 144
    sget-object v0, Ll/۠᩶ۜ;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 145
    :try_start_0
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "mpl"

    invoke-interface {v1, v2}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result v5

    .line 146
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "mpl"

    const/16 v3, 0x19

    invoke-interface {v1, v3, v2}, Ll/۫ۤۡ;->֫(ILjava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 148
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "mpl"

    invoke-interface {v1, v3, v2}, Ll/۫ۤۡ;->֫(Ljava/lang/String;[B)[B

    move-result-object v2

    .line 150
    :cond_0
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "mpi"

    const/16 v4, 0x15

    invoke-interface {v1, v4, v3}, Ll/۫ۤۡ;->֫(ILjava/lang/String;)Z

    move-result v1

    const/4 v3, -0x1

    if-eqz v1, :cond_1

    .line 152
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v6, "mpi"

    invoke-interface {v1, v6, v3}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 154
    :cond_1
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v6, "mpp"

    invoke-interface {v1, v6}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result v1

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    .line 155
    sget-object v7, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v8, "mpp"

    invoke-interface {v7, v4, v8}, Ll/۫ۤۡ;->֫(ILjava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v4, 0x1

    :goto_1
    if-eqz v4, :cond_4

    .line 158
    sget-object v7, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v8, "mpp"

    invoke-interface {v7, v8, v6}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v7

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    :goto_2
    if-eqz v1, :cond_6

    if-eqz v4, :cond_5

    if-gtz v7, :cond_6

    :cond_5
    const/4 v1, 0x1

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    :goto_3
    if-gtz v7, :cond_7

    const/4 v7, 0x0

    .line 165
    :cond_7
    sget-wide v12, Ll/۠᩶ۜ;->ۧ:J

    .line 166
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_15

    .line 167
    array-length v0, v2

    if-nez v0, :cond_8

    goto/16 :goto_a

    .line 174
    :cond_8
    :try_start_1
    invoke-static {v2}, Ll/۠᩶ۜ;->֫([B)Ljava/util/ArrayList;

    move-result-object v0

    if-ltz v3, :cond_14

    .line 175
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    if-ge v3, v2, :cond_14

    .line 182
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 183
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    const/4 v8, 0x0

    .line 185
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v5, v9, :cond_c

    .line 187
    :try_start_2
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    new-array v10, v6, [Ljava/lang/String;

    invoke-static {v9, v10}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 188
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v10

    if-nez v10, :cond_9

    goto :goto_5

    .line 191
    :cond_9
    new-instance v10, Ll/ۢۧ᩻;

    invoke-direct {v10, v9}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    .line 192
    invoke-virtual {v10}, Ll/ܺۘܳ;->۠֫()Ljava/lang/String;

    move-result-object v9

    const-string v11, "audio/"

    invoke-virtual {v9, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_a

    goto :goto_5

    .line 195
    :cond_a
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    if-ne v5, v3, :cond_b

    const/4 v8, 0x1

    :catch_0
    :cond_b
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 204
    :cond_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_d

    .line 205
    new-instance v0, Ll/֨᩶ۜ;

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Ll/֨᩶ۜ;-><init>(Ll/ۖܶۜ;ZIJ)V

    return-object v0

    .line 292
    :cond_d
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    sub-int v6, v5, v3

    .line 293
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    const/4 v9, 0x1

    const/4 v10, 0x0

    .line 294
    :goto_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v9, v11, :cond_10

    .line 295
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    sub-int v14, v11, v3

    .line 296
    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    move-result v14

    if-lt v14, v6, :cond_e

    if-ne v14, v6, :cond_f

    if-le v11, v5, :cond_f

    :cond_e
    move v10, v9

    move v5, v11

    move v6, v14

    :cond_f
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    :cond_10
    if-nez v8, :cond_11

    if-lez v7, :cond_11

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v11, 0x0

    goto :goto_7

    :cond_11
    move v11, v7

    .line 214
    :goto_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v3, v0, :cond_13

    if-eqz v1, :cond_12

    goto :goto_8

    :cond_12
    const/4 v0, 0x0

    goto :goto_9

    :cond_13
    :goto_8
    const/4 v0, 0x1

    .line 215
    :goto_9
    new-instance v9, Ll/ۖܶۜ;

    sget-object v1, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    invoke-direct {v9, v1, v2, v10}, Ll/ۖܶۜ;-><init>(Ll/ܰܺܳ;Ljava/util/List;I)V

    .line 217
    new-instance v1, Ll/֨᩶ۜ;

    move-object v8, v1

    move v10, v0

    invoke-direct/range {v8 .. v13}, Ll/֨᩶ۜ;-><init>(Ll/ۖܶۜ;ZIJ)V

    return-object v1

    .line 176
    :cond_14
    :try_start_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid music playlist index"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 179
    :catch_1
    new-instance v0, Ll/֨᩶ۜ;

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Ll/֨᩶ۜ;-><init>(Ll/ۖܶۜ;ZIJ)V

    return-object v0

    .line 169
    :cond_15
    :goto_a
    new-instance v0, Ll/֨᩶ۜ;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v3, v0

    move-wide v7, v12

    invoke-direct/range {v3 .. v8}, Ll/֨᩶ۜ;-><init>(Ll/ۖܶۜ;ZIJ)V

    return-object v0

    :catchall_0
    move-exception v1

    .line 166
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method public static ֫(IILjava/util/List;)V
    .locals 4

    .line 312
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 313
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    .line 314
    invoke-interface {v1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 316
    :cond_0
    sget-object p2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p2}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p2

    .line 246
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    const v1, 0x4d504c01    # 2.1841512E8f

    .line 0
    invoke-static {v1}, Ll/ᩴۘܿ;->֫(I)Ll/ۤۜܽ;

    move-result-object v1

    .line 251
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 252
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 253
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 256
    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_1

    .line 254
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid music path"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 258
    :cond_2
    invoke-virtual {v1}, Ll/ۤۜܽ;->ۖ()[B

    move-result-object v0

    const-string v1, "mpl"

    .line 317
    invoke-interface {p2, v1, v0}, Ll/۬ۤۡ;->֫(Ljava/lang/String;[B)Ll/۬ۤۡ;

    move-result-object p2

    const-string v0, "mpi"

    .line 318
    invoke-interface {p2, p0, v0}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    const-string p2, "mpp"

    if-lez p1, :cond_3

    .line 320
    invoke-interface {p0, p1, p2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    goto :goto_2

    .line 322
    :cond_3
    invoke-interface {p0, p2}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    .line 324
    :goto_2
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    .line 325
    sget-wide p0, Ll/۠᩶ۜ;->ۧ:J

    const-wide/16 v0, 0x1

    add-long/2addr p0, v0

    sput-wide p0, Ll/۠᩶ۜ;->ۧ:J

    return-void

    .line 247
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Empty music playlist"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܰܺܳ;)V
    .locals 5

    .line 115
    sget-object v0, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    if-eq p0, v0, :cond_0

    return-void

    .line 118
    :cond_0
    sget-object p0, Ll/۠᩶ۜ;->֫:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    .line 119
    :try_start_0
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "mpp"

    invoke-interface {p0, v1}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    .line 120
    monitor-exit v0

    return-void

    .line 122
    :cond_1
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    const-string v1, "mpp"

    invoke-interface {p0, v1}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    .line 123
    sget-wide v1, Ll/۠᩶ۜ;->ۧ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    sput-wide v1, Ll/۠᩶ۜ;->ۧ:J

    .line 124
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܰܺܳ;I)V
    .locals 3

    .line 74
    sget-object v0, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    if-eq p0, v0, :cond_0

    return-void

    .line 77
    :cond_0
    sget-object p0, Ll/۠᩶ۜ;->֫:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    .line 78
    :try_start_0
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "mpl"

    invoke-interface {p0, v1}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    .line 79
    monitor-exit v0

    return-void

    .line 81
    :cond_1
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    const-string v1, "mpi"

    .line 82
    invoke-interface {p0, p1, v1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    const-string p1, "mpp"

    .line 83
    invoke-interface {p0, p1}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    .line 84
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    .line 85
    sget-wide p0, Ll/۠᩶ۜ;->ۧ:J

    const-wide/16 v1, 0x1

    add-long/2addr p0, v1

    sput-wide p0, Ll/۠᩶ۜ;->ۧ:J

    .line 86
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܰܺܳ;II)V
    .locals 3

    .line 93
    sget-object v0, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    if-eq p0, v0, :cond_0

    return-void

    .line 96
    :cond_0
    sget-object p0, Ll/۠᩶ۜ;->֫:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    .line 97
    :try_start_0
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "mpl"

    invoke-interface {p0, v1}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "mpi"

    const/16 v2, 0x15

    .line 98
    invoke-interface {p0, v2, v1}, Ll/۫ۤۡ;->֫(ILjava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "mpi"

    const/4 v2, -0x1

    .line 99
    invoke-interface {p0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-eq p0, p1, :cond_1

    goto :goto_1

    .line 102
    :cond_1
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    if-lez p2, :cond_2

    const-string p1, "mpp"

    .line 104
    invoke-interface {p0, p2, p1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    goto :goto_0

    :cond_2
    const-string p1, "mpp"

    .line 106
    invoke-interface {p0, p1}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    .line 108
    :goto_0
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    .line 109
    sget-wide p0, Ll/۠᩶ۜ;->ۧ:J

    const-wide/16 v1, 0x1

    add-long/2addr p0, v1

    sput-wide p0, Ll/۠᩶ۜ;->ۧ:J

    .line 110
    monitor-exit v0

    return-void

    .line 100
    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 110
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/֨᩶ۜ;)Z
    .locals 7

    .line 224
    sget-object v0, Ll/۠᩶ۜ;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 225
    :try_start_0
    sget-wide v1, Ll/۠᩶ۜ;->ۧ:J

    invoke-virtual {p0}, Ll/֨᩶ۜ;->ܳ()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    const/4 p0, 0x0

    .line 226
    monitor-exit v0

    return p0

    .line 228
    :cond_0
    invoke-virtual {p0}, Ll/֨᩶ۜ;->ܽ()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    .line 229
    monitor-exit v0

    return v2

    .line 231
    :cond_1
    invoke-virtual {p0}, Ll/֨᩶ۜ;->֫()Ll/ۖܶۜ;

    move-result-object v1

    if-nez v1, :cond_2

    .line 332
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    const-string v1, "mpl"

    .line 333
    invoke-interface {p0, v1}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    const-string v1, "mpi"

    .line 334
    invoke-interface {p0, v1}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    const-string v1, "mpp"

    .line 335
    invoke-interface {p0, v1}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    .line 336
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    .line 337
    sget-wide v3, Ll/۠᩶ۜ;->ۧ:J

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    sput-wide v3, Ll/۠᩶ۜ;->ۧ:J

    goto :goto_0

    .line 236
    :cond_2
    invoke-virtual {v1}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Ll/ۖܶۜ;->֫()I

    move-result v1

    invoke-virtual {p0}, Ll/֨᩶ۜ;->ᩳ()I

    move-result p0

    .line 235
    invoke-static {v1, p0, v3}, Ll/۠᩶ۜ;->֫(IILjava/util/List;)V

    .line 238
    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p0

    .line 239
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܰܺܳ;Ljava/util/List;I)Z
    .locals 3

    .line 35
    sget-object v0, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    const/4 v1, 0x0

    if-eq p0, v0, :cond_0

    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    if-ltz p2, :cond_5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge p2, v2, :cond_5

    if-ne p0, v0, :cond_4

    .line 54
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    .line 57
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    .line 59
    :try_start_0
    invoke-interface {v0}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۙ֫()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 44
    :cond_3
    sget-object p0, Ll/۠᩶ۜ;->֫:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    .line 45
    :try_start_1
    invoke-static {p2, v1, p1}, Ll/۠᩶ۜ;->֫(IILjava/util/List;)V

    .line 46
    monitor-exit v0

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :catch_0
    :cond_4
    :goto_0
    return v1

    .line 39
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid music playlist"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
