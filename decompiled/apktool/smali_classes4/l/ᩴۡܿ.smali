.class public final Ll/ᩴۡܿ;
.super Ljava/lang/Object;
.source "Q6ZO"


# direct methods
.method public static bridge synthetic ֫(I[B)I
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩴۡܿ;->ۧ(I[B)I

    move-result p0

    return p0
.end method

.method public static ֫(IILl/۬ۜܽ;)Ll/ܺۡܿ;
    .locals 10

    const-string v0, "in"

    .line 202
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p2, Ll/۬ۜܽ;->᩸:[B

    .line 203
    invoke-virtual {p2}, Ll/۬ۜܽ;->֫()I

    move-result v1

    if-lt p0, v1, :cond_b

    .line 204
    array-length v2, v0

    if-gt p0, v2, :cond_b

    const/4 v2, 0x0

    .line 207
    invoke-static {v2}, Ll/᩺ۢܿ;->֫(Ll/ܶۜܿ;)Ll/᩺ۢܿ;

    move-result-object v2

    sub-int v3, p0, v1

    const/16 v4, 0xd

    if-ge v3, v4, :cond_0

    .line 209
    :try_start_0
    invoke-static {v2}, Ll/ܺۡܿ;->֫(Ll/᩺ۢܿ;)Ll/ܺۡܿ;

    move-result-object p1

    goto/16 :goto_3

    .line 210
    :cond_0
    new-instance v3, Ll/ۖۡܿ;

    invoke-direct {v3, v0, v1, p0}, Ll/ۖۡܿ;-><init>([BII)V

    .line 211
    invoke-virtual {v3}, Ll/ۖۡܿ;->ۧ()I

    move-result v1

    const v4, 0x53594e33

    if-ne v1, v4, :cond_a

    invoke-virtual {v3}, Ll/ۖۡܿ;->ۧ()I

    move-result v1

    const/4 v4, 0x3

    if-eq v1, v4, :cond_1

    goto/16 :goto_2

    .line 214
    :cond_1
    invoke-virtual {v3}, Ll/ۖۡܿ;->֫()I

    move-result v1

    add-int/lit8 v3, p0, -0x4

    .line 216
    invoke-static {v3, v0}, Ll/ᩴۡܿ;->ۧ(I[B)I

    move-result v4

    .line 371
    new-instance v5, Ljava/util/zip/CRC32;

    invoke-direct {v5}, Ljava/util/zip/CRC32;-><init>()V

    sub-int v6, v3, v1

    .line 372
    invoke-virtual {v5, v0, v1, v6}, Ljava/util/zip/CRC32;->update([BII)V

    .line 373
    invoke-virtual {v5}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v5

    long-to-int v6, v5

    if-eq v6, v4, :cond_2

    .line 218
    invoke-static {v2}, Ll/ܺۡܿ;->֫(Ll/᩺ۢܿ;)Ll/ܺۡܿ;

    move-result-object p1

    goto/16 :goto_3

    .line 220
    :cond_2
    new-instance v4, Ll/ۖۡܿ;

    invoke-direct {v4, v0, v1, v3}, Ll/ۖۡܿ;-><init>([BII)V

    .line 221
    invoke-virtual {v4}, Ll/ۖۡܿ;->ܽ()I

    move-result v0

    if-nez v0, :cond_3

    .line 223
    invoke-virtual {v4}, Ll/ۖۡܿ;->ܿ()V

    .line 224
    invoke-static {v2}, Ll/ܺۡܿ;->֫(Ll/᩺ۢܿ;)Ll/ܺۡܿ;

    move-result-object p1

    goto/16 :goto_3

    :cond_3
    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v3, 0x2

    if-ne v0, v3, :cond_4

    goto :goto_0

    .line 227
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown syntax cache kind"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_0
    const/16 v3, 0x4000

    .line 229
    invoke-virtual {v4, v3}, Ll/ۖۡܿ;->֫(I)Ljava/lang/String;

    move-result-object v3

    .line 230
    invoke-static {v3}, Ll/ۜ᩷ܿ;->ܿ(Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object v3

    invoke-static {v3}, Ll/᩺ۢܿ;->֫(Ll/ܶۜܿ;)Ll/᩺ۢܿ;

    move-result-object v2

    .line 231
    invoke-virtual {v2}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v3

    .line 232
    invoke-virtual {v2}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v5

    .line 233
    invoke-virtual {v4}, Ll/ۖۡܿ;->ۧ()I

    move-result v6

    .line 234
    invoke-virtual {v4}, Ll/ۖۡܿ;->ۧ()I

    move-result v7

    .line 235
    invoke-virtual {v4}, Ll/ۖۡܿ;->ۧ()I

    move-result v8

    .line 236
    invoke-virtual {v4}, Ll/ۖۡܿ;->ۧ()I

    move-result v9

    if-eqz v3, :cond_9

    if-eqz v5, :cond_9

    .line 237
    invoke-virtual {v3}, Ll/᩺ܺܿ;->ᩳ()I

    move-result v5

    if-ne v5, v6, :cond_9

    if-ne v7, p1, :cond_9

    if-ltz v7, :cond_9

    if-ltz v8, :cond_9

    if-lt v9, v8, :cond_9

    if-gt v9, v7, :cond_9

    sub-int p1, v9, v8

    if-ne v0, v1, :cond_7

    if-nez v8, :cond_6

    if-ne v9, v7, :cond_6

    const v5, 0xf4240

    if-gt v7, v5, :cond_6

    goto :goto_1

    .line 246
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid full syntax cache coverage"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 250
    :cond_7
    :goto_1
    invoke-static {v4, v7}, Ll/ᩴۡܿ;->֫(Ll/ۖۡܿ;I)Ll/᩺ۖܿ;

    move-result-object v5

    .line 251
    invoke-static {v4, p1}, Ll/ᩴۡܿ;->ۧ(Ll/ۖۡܿ;I)Ll/ۢۖܿ;

    move-result-object v6

    .line 252
    invoke-static {v4, p1, v3}, Ll/ᩴۡܿ;->֫(Ll/ۖۡܿ;ILl/᩺ܺܿ;)Ll/ᩳۢܿ;

    move-result-object p1

    .line 253
    invoke-virtual {v4}, Ll/ۖۡܿ;->ܿ()V

    if-ne v0, v1, :cond_8

    .line 255
    invoke-static {v2, v6, p1, v5}, Ll/ܺۡܿ;->֫(Ll/᩺ۢܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;Ll/᩺ۖܿ;)Ll/ܺۡܿ;

    move-result-object p1

    goto :goto_3

    .line 257
    :cond_8
    iget-object v0, v3, Ll/᩺ܺܿ;->ܿ:Ll/᩸᩷ܿ;

    invoke-static {v7, v8, v6, p1, v0}, Ll/۟ۖܿ;->֫(IILl/ۢۖܿ;Ll/ᩳۢܿ;Ll/᩸᩷ܿ;)Ll/۟ۖܿ;

    move-result-object p1

    .line 259
    invoke-static {v2, p1, v5}, Ll/ܺۡܿ;->֫(Ll/᩺ۢܿ;Ll/۟ۖܿ;Ll/᩺ۖܿ;)Ll/ܺۡܿ;

    move-result-object p1

    goto :goto_3

    .line 241
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Syntax cache identity differs"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 212
    :cond_a
    :goto_2
    invoke-static {v2}, Ll/ܺۡܿ;->֫(Ll/᩺ۢܿ;)Ll/ܺۡܿ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    .line 261
    :catch_0
    :try_start_1
    invoke-static {v2}, Ll/ܺۡܿ;->֫(Ll/᩺ۢܿ;)Ll/ܺۡܿ;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    int-to-long v0, p0

    .line 263
    invoke-virtual {p2, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    return-object p1

    :goto_4
    int-to-long v0, p0

    invoke-virtual {p2, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    .line 264
    throw p1

    .line 205
    :cond_b
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string p1, "Syntax cache record is outside input"

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۖۡܿ;ILl/᩺ܺܿ;)Ll/ᩳۢܿ;
    .locals 11

    .line 339
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v2

    if-lez v2, :cond_6

    const v0, 0xf4240

    if-gt v2, v0, :cond_6

    .line 340
    invoke-virtual {p0}, Ll/ۖۡܿ;->ᩳ()I

    move-result v0

    div-int/lit8 v0, v0, 0x10

    if-gt v2, v0, :cond_6

    .line 343
    new-array v3, v2, [I

    .line 344
    new-array v4, v2, [I

    .line 345
    new-array v5, v2, [I

    .line 346
    new-array v6, v2, [Ll/ܶۜܿ;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_4

    .line 348
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v7

    aput v7, v3, v1

    .line 349
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v8

    aput v8, v4, v1

    .line 350
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v9

    aput v9, v5, v1

    .line 351
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v10

    if-ltz v7, :cond_3

    if-lt v8, v7, :cond_3

    if-gt v8, p1, :cond_3

    if-nez v1, :cond_0

    const/4 v7, -0x1

    if-ne v9, v7, :cond_3

    :cond_0
    if-eqz v1, :cond_1

    if-ltz v9, :cond_3

    if-ge v9, v1, :cond_3

    :cond_1
    if-ltz v10, :cond_3

    .line 355
    invoke-virtual {p2}, Ll/᩺ܺܿ;->֫()I

    move-result v7

    if-gt v10, v7, :cond_3

    if-nez v10, :cond_2

    const/4 v7, 0x0

    goto :goto_1

    :cond_2
    add-int/lit8 v10, v10, -0x1

    .line 359
    invoke-virtual {p2, v10}, Ll/᩺ܺܿ;->֫(I)Ll/ܶۜܿ;

    move-result-object v7

    :goto_1
    aput-object v7, v6, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 356
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid syntax cache context node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 361
    :cond_4
    aget p0, v3, v0

    if-nez p0, :cond_5

    aget p0, v4, v0

    if-ne p0, p1, :cond_5

    aget-object p0, v6, v0

    iget-object p2, p2, Ll/᩺ܺܿ;->ۡ:Ll/ܶۜܿ;

    if-ne p0, p2, :cond_5

    .line 365
    new-instance p0, Ll/ᩳۢܿ;

    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v6}, Ll/ᩳۢܿ;-><init>(II[I[I[I[Ll/ܶۜܿ;)V

    return-object p0

    .line 363
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid syntax cache context root"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 341
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid syntax cache context count"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۖۡܿ;I)Ll/᩺ۖܿ;
    .locals 6

    .line 436
    invoke-virtual {p0}, Ll/ۖۡܿ;->ܽ()I

    move-result v0

    if-eqz v0, :cond_1

    const/16 v1, 0xff

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 438
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid syntax cache boolean"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    if-eqz v0, :cond_5

    .line 272
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v0

    if-ltz v0, :cond_4

    const/16 v1, 0x20

    if-gt v0, v1, :cond_4

    .line 274
    invoke-virtual {p0}, Ll/ۖۡܿ;->ᩳ()I

    move-result v1

    div-int/lit8 v1, v1, 0x8

    if-gt v0, v1, :cond_4

    .line 279
    sget-object v1, Ll/᩺ۖܿ;->ۧ:Ll/᩺ۖܿ;

    const/4 v2, -0x1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_3

    .line 280
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v4

    .line 281
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v5

    if-ltz v4, :cond_2

    if-ge v4, v5, :cond_2

    if-gt v5, p1, :cond_2

    if-le v4, v2, :cond_2

    .line 285
    invoke-static {v1, v4, v5}, Ll/᩺ۖܿ;->֫(Ll/᩺ۖܿ;II)Ll/᩺ۖܿ;

    move-result-object v1

    add-int/lit8 v3, v3, 0x1

    move v2, v5

    goto :goto_1

    .line 283
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid syntax derived refresh range"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-object v1

    .line 275
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid syntax derived refresh range count"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۤۜܽ;)V
    .locals 4

    const v0, 0x53594e33

    .line 144
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v0, 0x3

    .line 145
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 146
    invoke-virtual {p0}, Ll/ۤۜܽ;->getPosition()J

    move-result-wide v0

    long-to-int v1, v0

    const/4 v0, 0x0

    .line 147
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 148
    invoke-virtual {p0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v0

    invoke-virtual {p0}, Ll/ۤۜܽ;->getPosition()J

    move-result-wide v2

    long-to-int v3, v2

    .line 371
    new-instance v2, Ljava/util/zip/CRC32;

    invoke-direct {v2}, Ljava/util/zip/CRC32;-><init>()V

    sub-int/2addr v3, v1

    .line 372
    invoke-virtual {v2, v0, v1, v3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 373
    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    .line 148
    invoke-virtual {p0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method public static ֫(Ll/ۤۜܽ;ILjava/lang/String;Ll/᩺ܺܿ;IIILl/ۢۖܿ;Ll/ᩳۢܿ;Ll/᩺ۖܿ;)V
    .locals 4

    .line 98
    invoke-virtual {p7}, Ll/ۢۖܿ;->֫()I

    move-result v0

    sub-int v1, p6, p5

    if-ne v0, v1, :cond_f

    .line 99
    invoke-virtual {p8}, Ll/ᩳۢܿ;->ۧ()I

    move-result v0

    invoke-virtual {p7}, Ll/ۢۖܿ;->֫()I

    move-result v1

    if-ne v0, v1, :cond_f

    const v0, 0x53594e33

    .line 102
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v0, 0x3

    .line 103
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 104
    invoke-virtual {p0}, Ll/ۤۜܽ;->getPosition()J

    move-result-wide v0

    long-to-int v1, v0

    .line 105
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 106
    invoke-virtual {p0, p2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 107
    invoke-virtual {p3}, Ll/᩺ܺܿ;->ᩳ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 108
    invoke-virtual {p0, p4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 109
    invoke-virtual {p0, p5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 110
    invoke-virtual {p0, p6}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 p1, 0x0

    if-eqz p9, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 122
    :goto_0
    invoke-virtual {p0, p2}, Ll/ۤۜܽ;->֫(Z)V

    if-nez p9, :cond_1

    goto :goto_2

    .line 124
    :cond_1
    invoke-virtual {p9}, Ll/᩺ۖܿ;->ܽ()I

    move-result p2

    const/16 p5, 0x20

    if-gt p2, p5, :cond_e

    .line 128
    invoke-virtual {p0, p2}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 p5, 0x0

    const/4 p6, -0x1

    :goto_1
    if-ge p5, p2, :cond_3

    .line 131
    invoke-virtual {p9, p5}, Ll/᩺ۖܿ;->֫(I)Ll/ܳۖܿ;

    move-result-object v0

    .line 132
    invoke-virtual {v0}, Ll/ܳۖܿ;->ܽ()I

    move-result v2

    if-ltz v2, :cond_2

    invoke-virtual {v0}, Ll/ܳۖܿ;->ܽ()I

    move-result v2

    invoke-virtual {v0}, Ll/ܳۖܿ;->֫()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 133
    invoke-virtual {v0}, Ll/ܳۖܿ;->֫()I

    move-result v2

    if-gt v2, p4, :cond_2

    invoke-virtual {v0}, Ll/ܳۖܿ;->ܽ()I

    move-result v2

    if-le v2, p6, :cond_2

    .line 136
    invoke-virtual {v0}, Ll/ܳۖܿ;->ܽ()I

    move-result p6

    invoke-virtual {p0, p6}, Ll/ۤۜܽ;->writeInt(I)V

    .line 137
    invoke-virtual {v0}, Ll/ܳۖܿ;->֫()I

    move-result p6

    invoke-virtual {p0, p6}, Ll/ۤۜܽ;->writeInt(I)V

    .line 138
    invoke-virtual {v0}, Ll/ܳۖܿ;->֫()I

    move-result p6

    add-int/lit8 p5, p5, 0x1

    goto :goto_1

    .line 134
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid syntax derived refresh range"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 153
    :cond_3
    :goto_2
    new-instance p2, Ll/ۘۡܿ;

    invoke-direct {p2}, Ll/ۘۡܿ;-><init>()V

    .line 143
    new-instance p4, Ll/ᩳۖܿ;

    invoke-direct {p4}, Ll/ᩳۖܿ;-><init>()V

    invoke-virtual {p4, p7}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 155
    :goto_3
    invoke-virtual {p4}, Ll/ᩳۖܿ;->ܿ()Z

    move-result p5

    if-eqz p5, :cond_4

    invoke-virtual {p4}, Ll/ᩳۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object p5

    invoke-virtual {p2, p5}, Ll/ۘۡܿ;->ۧ(Ll/᩸᩷ܿ;)V

    goto :goto_3

    .line 156
    :cond_4
    invoke-virtual {p7}, Ll/ۢۖܿ;->ۧ()I

    move-result p5

    invoke-virtual {p0, p5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 157
    invoke-virtual {p2}, Ll/ۘۡܿ;->֫()I

    move-result p5

    invoke-virtual {p0, p5}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 p5, 0x0

    .line 158
    :goto_4
    invoke-virtual {p2}, Ll/ۘۡܿ;->֫()I

    move-result p6

    if-ge p5, p6, :cond_7

    invoke-virtual {p2, p5}, Ll/ۘۡܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object p6

    .line 169
    invoke-virtual {p6}, Ll/᩸᩷ܿ;->ᩳ()I

    move-result p9

    invoke-virtual {p0, p9}, Ll/ۤۜܽ;->writeInt(I)V

    .line 170
    invoke-virtual {p6}, Ll/᩸᩷ܿ;->ܽ()I

    move-result p9

    invoke-virtual {p0, p9}, Ll/ۤۜܽ;->writeInt(I)V

    .line 171
    invoke-virtual {p6}, Ll/᩸᩷ܿ;->᩵()I

    move-result p9

    invoke-virtual {p0, p9}, Ll/ۤۜܽ;->writeInt(I)V

    .line 172
    invoke-virtual {p6}, Ll/᩸᩷ܿ;->ᩴ()I

    move-result p9

    invoke-virtual {p0, p9}, Ll/ۤۜܽ;->writeInt(I)V

    .line 173
    invoke-virtual {p6}, Ll/᩸᩷ܿ;->᩻()I

    move-result p9

    invoke-virtual {p0, p9}, Ll/ۤۜܽ;->writeInt(I)V

    .line 174
    invoke-virtual {p6}, Ll/᩸᩷ܿ;->֫()Ljava/lang/String;

    move-result-object p6

    if-eqz p6, :cond_5

    const/4 p9, 0x1

    goto :goto_5

    :cond_5
    const/4 p9, 0x0

    .line 175
    :goto_5
    invoke-virtual {p0, p9}, Ll/ۤۜܽ;->֫(Z)V

    if-eqz p6, :cond_6

    .line 176
    invoke-virtual {p0, p6}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    :cond_6
    add-int/lit8 p5, p5, 0x1

    goto :goto_4

    .line 159
    :cond_7
    invoke-virtual {p4, p7}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 160
    :goto_6
    invoke-virtual {p4}, Ll/ᩳۖܿ;->ܿ()Z

    move-result p5

    if-eqz p5, :cond_9

    .line 161
    invoke-virtual {p4}, Ll/ᩳۖܿ;->֫()I

    move-result p5

    invoke-virtual {p4}, Ll/ᩳۖܿ;->ۧ()I

    move-result p6

    sub-int/2addr p5, p6

    .line 162
    invoke-virtual {p4}, Ll/ᩳۖܿ;->ᩳ()Z

    move-result p6

    if-eqz p6, :cond_8

    const/high16 p6, -0x80000000

    or-int/2addr p5, p6

    :cond_8
    invoke-virtual {p0, p5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 163
    invoke-virtual {p4}, Ll/ᩳۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object p5

    invoke-virtual {p2, p5}, Ll/ۘۡܿ;->֫(Ll/᩸᩷ܿ;)I

    move-result p5

    invoke-virtual {p0, p5}, Ll/ۤۜܽ;->writeInt(I)V

    goto :goto_6

    .line 182
    :cond_9
    invoke-virtual {p8}, Ll/ᩳۢܿ;->֫()I

    move-result p2

    invoke-virtual {p0, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 183
    :goto_7
    invoke-virtual {p8}, Ll/ᩳۢܿ;->֫()I

    move-result p2

    if-ge p1, p2, :cond_d

    .line 184
    invoke-virtual {p8, p1}, Ll/ᩳۢܿ;->ܳ(I)I

    move-result p2

    invoke-virtual {p0, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 185
    invoke-virtual {p8, p1}, Ll/ᩳۢܿ;->ܽ(I)I

    move-result p2

    invoke-virtual {p0, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 186
    invoke-virtual {p8, p1}, Ll/ᩳۢܿ;->ܿ(I)I

    move-result p2

    invoke-virtual {p0, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 187
    invoke-virtual {p8, p1}, Ll/ᩳۢܿ;->ᩳ(I)Ll/ܶۜܿ;

    move-result-object p2

    if-nez p2, :cond_a

    const/4 p4, -0x1

    goto :goto_8

    .line 188
    :cond_a
    invoke-virtual {p3, p2}, Ll/᩺ܺܿ;->֫(Ll/ܶۜܿ;)I

    move-result p4

    :goto_8
    if-eqz p2, :cond_c

    if-ltz p4, :cond_b

    goto :goto_9

    .line 190
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Syntax context language is outside program graph"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    :goto_9
    add-int/lit8 p4, p4, 0x1

    .line 192
    invoke-virtual {p0, p4}, Ll/ۤۜܽ;->writeInt(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    .line 114
    :cond_d
    invoke-virtual {p0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object p1

    invoke-virtual {p0}, Ll/ۤۜܽ;->getPosition()J

    move-result-wide p2

    long-to-int p3, p2

    .line 371
    new-instance p2, Ljava/util/zip/CRC32;

    invoke-direct {p2}, Ljava/util/zip/CRC32;-><init>()V

    sub-int/2addr p3, v1

    .line 372
    invoke-virtual {p2, p1, v1, p3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 373
    invoke-virtual {p2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide p1

    long-to-int p2, p1

    .line 114
    invoke-virtual {p0, p2}, Ll/ۤۜܽ;->writeInt(I)V

    return-void

    .line 126
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Too many syntax derived refresh ranges"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 100
    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Syntax cache payload coverage differs"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۤۜܽ;Ll/᩺ۢܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;ZZLl/۟ۖܿ;Ll/᩺ۖܿ;)V
    .locals 13

    move-object v10, p0

    move-object v7, p2

    const-string v0, "out"

    .line 44
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "definition"

    move-object v1, p1

    .line 45
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    invoke-virtual {p0}, Ll/ۤۜܽ;->getPosition()J

    move-result-wide v11

    .line 48
    :try_start_0
    invoke-virtual {p1}, Ll/᩺ۢܿ;->֫()Ll/ܶۜܿ;

    move-result-object v0

    .line 49
    invoke-virtual {p1}, Ll/᩺ۢܿ;->ۧ()Ll/᩺ܺܿ;

    move-result-object v3

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 50
    :cond_0
    invoke-static {v0}, Ll/ۜ᩷ܿ;->ۧ(Ll/ܶۜܿ;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v2, v1

    if-eqz p4, :cond_6

    if-eqz v0, :cond_6

    if-eqz v2, :cond_6

    if-eqz v3, :cond_6

    if-nez v7, :cond_1

    goto/16 :goto_2

    :cond_1
    const/4 v0, 0x0

    const v1, 0xf4240

    if-eqz p5, :cond_3

    if-nez p6, :cond_3

    if-eqz p3, :cond_3

    .line 57
    invoke-virtual/range {p3 .. p3}, Ll/ᩳۢܿ;->ۧ()I

    move-result v4

    invoke-virtual {p2}, Ll/ۢۖܿ;->֫()I

    move-result v5

    if-ne v4, v5, :cond_3

    .line 89
    invoke-virtual {p2}, Ll/ۢۖܿ;->ۧ()I

    move-result v4

    if-gt v4, v1, :cond_2

    invoke-virtual/range {p3 .. p3}, Ll/ᩳۢܿ;->֫()I

    move-result v4

    if-gt v4, v1, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_3

    .line 59
    invoke-virtual {p2}, Ll/ۢۖܿ;->֫()I

    move-result v4

    .line 60
    invoke-virtual {p2}, Ll/ۢۖܿ;->֫()I

    move-result v6

    const/4 v1, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    move-object v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p7

    .line 59
    invoke-static/range {v0 .. v9}, Ll/ᩴۡܿ;->֫(Ll/ۤۜܽ;ILjava/lang/String;Ll/᩺ܺܿ;IIILl/ۢۖܿ;Ll/ᩳۢܿ;Ll/᩺ۖܿ;)V

    return-void

    :cond_3
    if-nez p5, :cond_5

    if-eqz p6, :cond_5

    .line 64
    invoke-virtual/range {p6 .. p6}, Ll/۟ۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v4

    if-ne v4, v7, :cond_5

    .line 65
    invoke-virtual/range {p6 .. p6}, Ll/۟ۖܿ;->᩻()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 66
    invoke-virtual/range {p6 .. p6}, Ll/۟ۖܿ;->ܿ()Ll/ۢۖܿ;

    move-result-object v8

    .line 67
    invoke-virtual/range {p6 .. p6}, Ll/۟ۖܿ;->ᩳ()Ll/ᩳۢܿ;

    move-result-object v9

    if-eqz v8, :cond_5

    if-eqz v9, :cond_5

    .line 69
    invoke-virtual {v9}, Ll/ᩳۢܿ;->ۧ()I

    move-result v4

    invoke-virtual {v8}, Ll/ۢۖܿ;->֫()I

    move-result v5

    if-ne v4, v5, :cond_5

    .line 89
    invoke-virtual {v8}, Ll/ۢۖܿ;->ۧ()I

    move-result v4

    if-gt v4, v1, :cond_4

    invoke-virtual {v9}, Ll/ᩳۢܿ;->֫()I

    move-result v4

    if-gt v4, v1, :cond_4

    const/4 v0, 0x1

    :cond_4
    if-eqz v0, :cond_5

    .line 71
    invoke-virtual {p2}, Ll/ۢۖܿ;->֫()I

    move-result v4

    .line 72
    invoke-virtual/range {p6 .. p6}, Ll/۟ۖܿ;->ۧ()I

    move-result v5

    .line 73
    invoke-virtual/range {p6 .. p6}, Ll/۟ۖܿ;->֫()I

    move-result v6

    const/4 v1, 0x2

    move-object v0, p0

    move-object v7, v8

    move-object v8, v9

    move-object/from16 v9, p7

    .line 71
    invoke-static/range {v0 .. v9}, Ll/ᩴۡܿ;->֫(Ll/ۤۜܽ;ILjava/lang/String;Ll/᩺ܺܿ;IIILl/ۢۖܿ;Ll/ᩳۢܿ;Ll/᩺ۖܿ;)V

    return-void

    .line 78
    :cond_5
    invoke-static {p0}, Ll/ᩴۡܿ;->֫(Ll/ۤۜܽ;)V

    return-void

    .line 53
    :cond_6
    :goto_2
    invoke-static {p0}, Ll/ᩴۡܿ;->֫(Ll/ۤۜܽ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 80
    :catch_0
    invoke-virtual {p0, v11, v12}, Ll/ۤۜܽ;->seek(J)V

    long-to-int v0, v11

    .line 81
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->֫(I)V

    .line 82
    invoke-static {p0}, Ll/ᩴۡܿ;->֫(Ll/ۤۜܽ;)V

    return-void
.end method

.method public static ۧ(I[B)I
    .locals 2

    .line 378
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public static ۧ(Ll/ۖۡܿ;I)Ll/ۢۖܿ;
    .locals 14

    .line 293
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v0

    .line 294
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v1

    if-ltz v0, :cond_a

    if-ltz v1, :cond_a

    if-nez p1, :cond_0

    if-nez v0, :cond_a

    if-nez v1, :cond_a

    :cond_0
    if-eqz p1, :cond_1

    if-eqz v0, :cond_a

    if-gt v0, p1, :cond_a

    const v2, 0xf4240

    if-gt v0, v2, :cond_a

    if-eqz v1, :cond_a

    if-gt v1, v0, :cond_a

    .line 300
    :cond_1
    invoke-virtual {p0}, Ll/ۖۡܿ;->ᩳ()I

    move-result v2

    div-int/lit8 v2, v2, 0x15

    if-gt v1, v2, :cond_a

    .line 303
    new-array v2, v1, [Ll/᩸᩷ܿ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_5

    .line 327
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v5

    .line 328
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v6

    .line 329
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v7

    .line 330
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v8

    .line 331
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v9

    .line 436
    invoke-virtual {p0}, Ll/ۖۡܿ;->ܽ()I

    move-result v4

    if-eqz v4, :cond_3

    const/16 v10, 0xff

    if-ne v4, v10, :cond_2

    goto :goto_1

    .line 438
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid syntax cache boolean"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    if-eqz v4, :cond_4

    const/high16 v4, 0x10000

    .line 332
    invoke-virtual {p0, v4}, Ll/ۖۡܿ;->֫(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    .line 333
    :goto_2
    invoke-static/range {v4 .. v9}, Ll/᩸᩷ܿ;->֫(Ljava/lang/String;IIIII)Ll/᩸᩷ܿ;

    move-result-object v4

    .line 304
    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 305
    :cond_5
    new-instance v3, Ll/ܽۖܿ;

    invoke-direct {v3}, Ll/ܽۖܿ;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_3
    if-ge v4, v0, :cond_8

    .line 308
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v6

    if-gez v6, :cond_6

    const/4 v7, 0x1

    goto :goto_4

    :cond_6
    const/4 v7, 0x0

    :goto_4
    const v8, 0x7fffffff

    and-int/2addr v6, v8

    .line 311
    invoke-virtual {p0}, Ll/ۖۡܿ;->ۧ()I

    move-result v8

    if-lez v6, :cond_7

    if-ltz v8, :cond_7

    if-ge v8, v1, :cond_7

    int-to-long v9, v5

    int-to-long v11, v6

    add-long/2addr v9, v11

    int-to-long v11, p1

    cmp-long v13, v9, v11

    if-gtz v13, :cond_7

    .line 316
    aget-object v8, v2, v8

    invoke-virtual {v3, v6, v8, v7}, Ll/ܽۖܿ;->֫(ILl/᩸᩷ܿ;Z)V

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 314
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid syntax cache run"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    if-ne v5, p1, :cond_9

    .line 322
    invoke-virtual {v3}, Ll/ܽۖܿ;->֫()Ll/ۢۖܿ;

    move-result-object p0

    return-object p0

    .line 320
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Syntax cache runs do not cover payload"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 301
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid syntax cache run counts"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
