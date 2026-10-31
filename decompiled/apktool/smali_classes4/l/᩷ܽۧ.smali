.class public final Ll/᩷ܽۧ;
.super Ljava/lang/Object;
.source "N8PX"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/᩸ܿۧ;

.field public ܳ:J

.field public ܽ:Ll/ۜܽۧ;

.field public final ܿ:Ll/ᩳ֨֫;

.field public ᩳ:Ll/ۜܽۧ;

.field public ᩻:Ll/ۜܽۧ;


# direct methods
.method public constructor <init>(Ll/᩸ܿۧ;)V
    .locals 3

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Ll/᩷ܽۧ;->ۧ:Ll/᩸ܿۧ;

    .line 57
    check-cast p1, Ll/۫ܿۧ;

    invoke-virtual {p1}, Ll/۫ܿۧ;->ۧ()I

    move-result p1

    iput p1, p0, Ll/᩷ܽۧ;->֫:I

    .line 58
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/᩷ܽۧ;->ܿ:Ll/ᩳ֨֫;

    .line 59
    new-instance v0, Ll/ۜܽۧ;

    const-wide/16 v1, 0x0

    invoke-direct {v0, p1, v1, v2}, Ll/ۜܽۧ;-><init>(IJ)V

    iput-object v0, p0, Ll/᩷ܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 60
    iput-object v0, p0, Ll/᩷ܽۧ;->ᩳ:Ll/ۜܽۧ;

    .line 61
    iput-object v0, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    return-void
.end method

.method private ֫(I)I
    .locals 6

    .line 231
    iget-object v0, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    iget-object v1, v0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    if-nez v1, :cond_0

    .line 232
    iget-object v1, p0, Ll/᩷ܽۧ;->ۧ:Ll/᩸ܿۧ;

    .line 233
    check-cast v1, Ll/۫ܿۧ;

    invoke-virtual {v1}, Ll/۫ܿۧ;->֫()Ll/۠ܿۧ;

    move-result-object v1

    new-instance v2, Ll/ۜܽۧ;

    iget-object v3, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    iget-wide v3, v3, Ll/ۜܽۧ;->ۧ:J

    iget v5, p0, Ll/᩷ܽۧ;->֫:I

    invoke-direct {v2, v5, v3, v4}, Ll/ۜܽۧ;-><init>(IJ)V

    .line 509
    iput-object v1, v0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    .line 510
    iput-object v2, v0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 236
    :cond_0
    iget-object v0, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    iget-wide v0, v0, Ll/ۜܽۧ;->ۧ:J

    iget-wide v2, p0, Ll/᩷ܽۧ;->ܳ:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public static ֫(Ll/ۜܽۧ;JLjava/nio/ByteBuffer;I)Ll/ۜܽۧ;
    .locals 5

    .line 455
    :goto_0
    iget-wide v0, p0, Ll/ۜܽۧ;->ۧ:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 456
    iget-object p0, p0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    goto :goto_0

    :cond_0
    :goto_1
    if-lez p4, :cond_1

    .line 406
    iget-wide v0, p0, Ll/ۜܽۧ;->ۧ:J

    sub-long/2addr v0, p1

    long-to-int v1, v0

    invoke-static {p4, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 407
    iget-object v1, p0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    .line 408
    iget-object v2, v1, Ll/۠ܿۧ;->֫:[B

    .line 521
    iget-wide v3, p0, Ll/ۜܽۧ;->ᩳ:J

    sub-long v3, p1, v3

    long-to-int v4, v3

    iget v1, v1, Ll/۠ܿۧ;->ۧ:I

    add-int/2addr v4, v1

    .line 408
    invoke-virtual {p3, v2, v4, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr p4, v0

    int-to-long v0, v0

    add-long/2addr p1, v0

    .line 411
    iget-wide v0, p0, Ll/ۜܽۧ;->ۧ:J

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 412
    iget-object p0, p0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    goto :goto_1

    :cond_1
    return-object p0
.end method

.method public static ֫(Ll/ۜܽۧ;J[BI)Ll/ۜܽۧ;
    .locals 6

    .line 455
    :goto_0
    iget-wide v0, p0, Ll/ۜܽۧ;->ۧ:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 456
    iget-object p0, p0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    goto :goto_0

    :cond_0
    move v0, p4

    :cond_1
    :goto_1
    if-lez v0, :cond_2

    .line 432
    iget-wide v1, p0, Ll/ۜܽۧ;->ۧ:J

    sub-long/2addr v1, p1

    long-to-int v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 433
    iget-object v2, p0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    .line 434
    iget-object v3, v2, Ll/۠ܿۧ;->֫:[B

    .line 521
    iget-wide v4, p0, Ll/ۜܽۧ;->ᩳ:J

    sub-long v4, p1, v4

    long-to-int v5, v4

    iget v2, v2, Ll/۠ܿۧ;->ۧ:I

    add-int/2addr v5, v2

    sub-int v2, p4, v0

    .line 434
    invoke-static {v3, v5, p3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v0, v1

    int-to-long v1, v1

    add-long/2addr p1, v1

    .line 442
    iget-wide v1, p0, Ll/ۜܽۧ;->ۧ:J

    cmp-long v3, p1, v1

    if-nez v3, :cond_1

    .line 443
    iget-object p0, p0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    goto :goto_1

    :cond_2
    return-object p0
.end method

.method public static ֫(Ll/ۜܽۧ;Ll/᩸᩸֫;Ll/ۡܽۧ;Ll/ᩳ֨֫;)Ll/ۜܽۧ;
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 268
    invoke-virtual/range {p1 .. p1}, Ll/᩸᩸֫;->֡()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 317
    iget-wide v3, v1, Ll/ۡܽۧ;->ۧ:J

    const/4 v5, 0x1

    .line 320
    invoke-virtual {v2, v5}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 321
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    move-object/from16 v7, p0

    invoke-static {v7, v3, v4, v6, v5}, Ll/᩷ܽۧ;->֫(Ll/ۜܽۧ;J[BI)Ll/ۜܽۧ;

    move-result-object v5

    const-wide/16 v6, 0x1

    add-long/2addr v3, v6

    .line 323
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    const/4 v7, 0x0

    aget-byte v6, v6, v7

    and-int/lit16 v8, v6, 0x80

    if-eqz v8, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    and-int/lit8 v6, v6, 0x7f

    .line 328
    iget-object v9, v0, Ll/᩸᩸֫;->᩶:Ll/ۚ᩸֫;

    .line 329
    iget-object v10, v9, Ll/ۚ᩸֫;->ᩳ:[B

    if-nez v10, :cond_1

    const/16 v10, 0x10

    new-array v10, v10, [B

    .line 330
    iput-object v10, v9, Ll/ۚ᩸֫;->ᩳ:[B

    goto :goto_1

    .line 333
    :cond_1
    invoke-static {v10, v7}, Ljava/util/Arrays;->fill([BB)V

    .line 335
    :goto_1
    iget-object v10, v9, Ll/ۚ᩸֫;->ᩳ:[B

    invoke-static {v5, v3, v4, v10, v6}, Ll/᩷ܽۧ;->֫(Ll/ۜܽۧ;J[BI)Ll/ۜܽۧ;

    move-result-object v5

    int-to-long v10, v6

    add-long/2addr v3, v10

    if-eqz v8, :cond_2

    const/4 v6, 0x2

    .line 341
    invoke-virtual {v2, v6}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 342
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v10

    invoke-static {v5, v3, v4, v10, v6}, Ll/᩷ܽۧ;->֫(Ll/ۜܽۧ;J[BI)Ll/ۜܽۧ;

    move-result-object v5

    const-wide/16 v10, 0x2

    add-long/2addr v3, v10

    .line 344
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->ۗ()I

    move-result v6

    move v10, v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x1

    const/4 v10, 0x1

    .line 350
    :goto_2
    iget-object v6, v9, Ll/ۚ᩸֫;->᩻:[I

    if-eqz v6, :cond_3

    .line 351
    array-length v11, v6

    if-ge v11, v10, :cond_4

    .line 352
    :cond_3
    new-array v6, v10, [I

    :cond_4
    move-object v11, v6

    .line 354
    iget-object v6, v9, Ll/ۚ᩸֫;->ۜ:[I

    if-eqz v6, :cond_5

    .line 355
    array-length v12, v6

    if-ge v12, v10, :cond_6

    .line 356
    :cond_5
    new-array v6, v10, [I

    :cond_6
    move-object v12, v6

    if-eqz v8, :cond_7

    mul-int/lit8 v6, v10, 0x6

    .line 360
    invoke-virtual {v2, v6}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 361
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v8

    invoke-static {v5, v3, v4, v8, v6}, Ll/᩷ܽۧ;->֫(Ll/ۜܽۧ;J[BI)Ll/ۜܽۧ;

    move-result-object v5

    int-to-long v13, v6

    add-long/2addr v3, v13

    .line 363
    invoke-virtual {v2, v7}, Ll/ᩳ֨֫;->ܿ(I)V

    :goto_3
    if-ge v7, v10, :cond_8

    .line 365
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->ۗ()I

    move-result v6

    aput v6, v11, v7

    .line 366
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->᩹()I

    move-result v6

    aput v6, v12, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 369
    :cond_7
    aput v7, v11, v7

    .line 370
    iget v6, v1, Ll/ۡܽۧ;->ܽ:I

    iget-wide v13, v1, Ll/ۡܽۧ;->ۧ:J

    sub-long v13, v3, v13

    long-to-int v8, v13

    sub-int/2addr v6, v8

    aput v6, v12, v7

    .line 374
    :cond_8
    iget-object v6, v1, Ll/ۡܽۧ;->֫:Ll/ᩴۢۧ;

    sget-object v7, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 375
    iget-object v13, v6, Ll/ᩴۢۧ;->ᩳ:[B

    iget-object v14, v9, Ll/ۚ᩸֫;->ᩳ:[B

    iget v15, v6, Ll/ᩴۢۧ;->ۧ:I

    iget v7, v6, Ll/ᩴۢۧ;->ܽ:I

    iget v6, v6, Ll/ᩴۢۧ;->֫:I

    move/from16 v16, v7

    move/from16 v17, v6

    invoke-virtual/range {v9 .. v17}, Ll/ۚ᩸֫;->֫(I[I[I[B[BIII)V

    .line 386
    iget-wide v6, v1, Ll/ۡܽۧ;->ۧ:J

    sub-long/2addr v3, v6

    long-to-int v4, v3

    int-to-long v8, v4

    add-long/2addr v6, v8

    .line 387
    iput-wide v6, v1, Ll/ۡܽۧ;->ۧ:J

    .line 388
    iget v3, v1, Ll/ۡܽۧ;->ܽ:I

    sub-int/2addr v3, v4

    iput v3, v1, Ll/ۡܽۧ;->ܽ:I

    goto :goto_4

    :cond_9
    move-object/from16 v7, p0

    move-object v5, v7

    .line 272
    :goto_4
    invoke-virtual/range {p1 .. p1}, Ll/ۘ᩸֫;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_c

    const/4 v3, 0x4

    .line 274
    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 275
    iget-wide v6, v1, Ll/ۡܽۧ;->ۧ:J

    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    invoke-static {v5, v6, v7, v4, v3}, Ll/᩷ܽۧ;->֫(Ll/ۜܽۧ;J[BI)Ll/ۜܽۧ;

    move-result-object v4

    .line 276
    invoke-virtual/range {p3 .. p3}, Ll/ᩳ֨֫;->᩹()I

    move-result v2

    .line 277
    iget-wide v5, v1, Ll/ۡܽۧ;->ۧ:J

    const-wide/16 v7, 0x4

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/ۡܽۧ;->ۧ:J

    .line 278
    iget v5, v1, Ll/ۡܽۧ;->ܽ:I

    sub-int/2addr v5, v3

    iput v5, v1, Ll/ۡܽۧ;->ܽ:I

    .line 281
    invoke-virtual {v0, v2}, Ll/᩸᩸֫;->ܳ(I)V

    .line 282
    iget-wide v5, v1, Ll/ۡܽۧ;->ۧ:J

    iget-object v3, v0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    invoke-static {v4, v5, v6, v3, v2}, Ll/᩷ܽۧ;->֫(Ll/ۜܽۧ;JLjava/nio/ByteBuffer;I)Ll/ۜܽۧ;

    move-result-object v3

    .line 283
    iget-wide v4, v1, Ll/ۡܽۧ;->ۧ:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, v1, Ll/ۡܽۧ;->ۧ:J

    .line 284
    iget v4, v1, Ll/ۡܽۧ;->ܽ:I

    sub-int/2addr v4, v2

    iput v4, v1, Ll/ۡܽۧ;->ܽ:I

    .line 159
    iget-object v2, v0, Ll/᩸᩸֫;->۫:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    move-result v2

    if-ge v2, v4, :cond_a

    goto :goto_5

    .line 162
    :cond_a
    iget-object v2, v0, Ll/᩸᩸֫;->۫:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    goto :goto_6

    .line 160
    :cond_b
    :goto_5
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, v0, Ll/᩸᩸֫;->۫:Ljava/nio/ByteBuffer;

    .line 288
    :goto_6
    iget-wide v4, v1, Ll/ۡܽۧ;->ۧ:J

    iget-object v0, v0, Ll/᩸᩸֫;->۫:Ljava/nio/ByteBuffer;

    iget v1, v1, Ll/ۡܽۧ;->ܽ:I

    .line 289
    invoke-static {v3, v4, v5, v0, v1}, Ll/᩷ܽۧ;->֫(Ll/ۜܽۧ;JLjava/nio/ByteBuffer;I)Ll/ۜܽۧ;

    move-result-object v0

    return-object v0

    .line 292
    :cond_c
    iget v2, v1, Ll/ۡܽۧ;->ܽ:I

    invoke-virtual {v0, v2}, Ll/᩸᩸֫;->ܳ(I)V

    .line 293
    iget-wide v2, v1, Ll/ۡܽۧ;->ۧ:J

    iget-object v0, v0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    iget v1, v1, Ll/ۡܽۧ;->ܽ:I

    .line 294
    invoke-static {v5, v2, v3, v0, v1}, Ll/᩷ܽۧ;->֫(Ll/ۜܽۧ;JLjava/nio/ByteBuffer;I)Ll/ۜܽۧ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ۢᩴ֫;IZ)I
    .locals 7

    .line 176
    invoke-direct {p0, p2}, Ll/᩷ܽۧ;->֫(I)I

    move-result p2

    .line 177
    iget-object v0, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    iget-object v1, v0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    iget-object v2, v1, Ll/۠ܿۧ;->֫:[B

    iget-wide v3, p0, Ll/᩷ܽۧ;->ܳ:J

    .line 521
    iget-wide v5, v0, Ll/ۜܽۧ;->ᩳ:J

    sub-long/2addr v3, v5

    long-to-int v0, v3

    iget v1, v1, Ll/۠ܿۧ;->ۧ:I

    add-int/2addr v0, v1

    .line 178
    invoke-interface {p1, v2, v0, p2}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-eqz p3, :cond_0

    return p2

    .line 186
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 245
    :cond_1
    iget-wide p2, p0, Ll/᩷ܽۧ;->ܳ:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/᩷ܽۧ;->ܳ:J

    .line 246
    iget-object v0, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    iget-wide v1, v0, Ll/ۜܽۧ;->ۧ:J

    cmp-long v3, p2, v1

    if-nez v3, :cond_2

    .line 247
    iget-object p2, v0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    iput-object p2, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    :cond_2
    return p1
.end method

.method public final ֫()J
    .locals 2

    .line 172
    iget-wide v0, p0, Ll/᩷ܽۧ;->ܳ:J

    return-wide v0
.end method

.method public final ֫(ILl/ᩳ֨֫;)V
    .locals 8

    :cond_0
    :goto_0
    if-lez p1, :cond_1

    .line 194
    invoke-direct {p0, p1}, Ll/᩷ܽۧ;->֫(I)I

    move-result v0

    .line 195
    iget-object v1, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    iget-object v2, v1, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    iget-object v3, v2, Ll/۠ܿۧ;->֫:[B

    iget-wide v4, p0, Ll/᩷ܽۧ;->ܳ:J

    .line 521
    iget-wide v6, v1, Ll/ۜܽۧ;->ᩳ:J

    sub-long/2addr v4, v6

    long-to-int v1, v4

    iget v2, v2, Ll/۠ܿۧ;->ۧ:I

    add-int/2addr v1, v2

    .line 195
    invoke-virtual {p2, v1, v0, v3}, Ll/ᩳ֨֫;->֫(II[B)V

    sub-int/2addr p1, v0

    .line 245
    iget-wide v1, p0, Ll/᩷ܽۧ;->ܳ:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩷ܽۧ;->ܳ:J

    .line 246
    iget-object v0, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    iget-wide v3, v0, Ll/ۜܽۧ;->ۧ:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 247
    iget-object v0, v0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    iput-object v0, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(J)V
    .locals 4

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_1

    .line 156
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/᩷ܽۧ;->ܽ:Ll/ۜܽۧ;

    iget-wide v1, v0, Ll/ۜܽۧ;->ۧ:J

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    .line 159
    iget-object v0, v0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    iget-object v1, p0, Ll/᩷ܽۧ;->ۧ:Ll/᩸ܿۧ;

    check-cast v1, Ll/۫ܿۧ;

    invoke-virtual {v1, v0}, Ll/۫ܿۧ;->֫(Ll/۠ܿۧ;)V

    .line 160
    iget-object v0, p0, Ll/᩷ܽۧ;->ܽ:Ll/ۜܽۧ;

    const/4 v1, 0x0

    .line 530
    iput-object v1, v0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    .line 531
    iget-object v2, v0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 532
    iput-object v1, v0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 160
    iput-object v2, p0, Ll/᩷ܽۧ;->ܽ:Ll/ۜܽۧ;

    goto :goto_0

    .line 162
    :cond_1
    iget-object p1, p0, Ll/᩷ܽۧ;->ᩳ:Ll/ۜܽۧ;

    iget-wide p1, p1, Ll/ۜܽۧ;->ᩳ:J

    iget-wide v1, v0, Ll/ۜܽۧ;->ᩳ:J

    cmp-long v3, p1, v1

    if-gez v3, :cond_2

    .line 165
    iput-object v0, p0, Ll/᩷ܽۧ;->ᩳ:Ll/ۜܽۧ;

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(Ll/᩸᩸֫;Ll/ۡܽۧ;)V
    .locals 2

    .line 143
    iget-object v0, p0, Ll/᩷ܽۧ;->ᩳ:Ll/ۜܽۧ;

    iget-object v1, p0, Ll/᩷ܽۧ;->ܿ:Ll/ᩳ֨֫;

    invoke-static {v0, p1, p2, v1}, Ll/᩷ܽۧ;->֫(Ll/ۜܽۧ;Ll/᩸᩸֫;Ll/ۡܽۧ;Ll/ᩳ֨֫;)Ll/ۜܽۧ;

    return-void
.end method

.method public final ۧ()V
    .locals 7

    .line 68
    iget-object v0, p0, Ll/᩷ܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 212
    iget-object v1, v0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    iget-object v2, p0, Ll/᩷ܽۧ;->ۧ:Ll/᩸ܿۧ;

    if-nez v1, :cond_0

    goto :goto_0

    .line 218
    :cond_0
    move-object v1, v2

    check-cast v1, Ll/۫ܿۧ;

    invoke-virtual {v1, v0}, Ll/۫ܿۧ;->֫(Ll/ܶܿۧ;)V

    const/4 v1, 0x0

    .line 530
    iput-object v1, v0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    .line 532
    iput-object v1, v0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 69
    :goto_0
    iget-object v0, p0, Ll/᩷ܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 497
    iget-object v1, v0, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    const-wide/16 v3, 0x0

    .line 498
    iput-wide v3, v0, Ll/ۜܽۧ;->ᩳ:J

    .line 499
    iget v1, p0, Ll/᩷ܽۧ;->֫:I

    int-to-long v5, v1

    iput-wide v5, v0, Ll/ۜܽۧ;->ۧ:J

    .line 70
    iget-object v0, p0, Ll/᩷ܽۧ;->ܽ:Ll/ۜܽۧ;

    iput-object v0, p0, Ll/᩷ܽۧ;->ᩳ:Ll/ۜܽۧ;

    .line 71
    iput-object v0, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    .line 72
    iput-wide v3, p0, Ll/᩷ܽۧ;->ܳ:J

    .line 73
    check-cast v2, Ll/۫ܿۧ;

    invoke-virtual {v2}, Ll/۫ܿۧ;->ܿ()V

    return-void
.end method

.method public final ۧ(J)V
    .locals 7

    .line 83
    iget-wide v0, p0, Ll/᩷ܽۧ;->ܳ:J

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 84
    iput-wide p1, p0, Ll/᩷ܽۧ;->ܳ:J

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 85
    iget-object v3, p0, Ll/᩷ܽۧ;->ۧ:Ll/᩸ܿۧ;

    iget v4, p0, Ll/᩷ܽۧ;->֫:I

    cmp-long v5, p1, v0

    if-eqz v5, :cond_6

    iget-object v0, p0, Ll/᩷ܽۧ;->ܽ:Ll/ۜܽۧ;

    iget-wide v5, v0, Ll/ۜܽۧ;->ᩳ:J

    cmp-long v1, p1, v5

    if-nez v1, :cond_1

    goto :goto_3

    .line 94
    :cond_1
    :goto_1
    iget-wide p1, p0, Ll/᩷ܽۧ;->ܳ:J

    iget-wide v5, v0, Ll/ۜܽۧ;->ۧ:J

    cmp-long v1, p1, v5

    if-lez v1, :cond_2

    .line 95
    iget-object v0, v0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    goto :goto_1

    .line 98
    :cond_2
    iget-object p1, v0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    iget-object p2, p1, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    if-nez p2, :cond_3

    goto :goto_2

    .line 218
    :cond_3
    check-cast v3, Ll/۫ܿۧ;

    invoke-virtual {v3, p1}, Ll/۫ܿۧ;->֫(Ll/ܶܿۧ;)V

    .line 530
    iput-object v2, p1, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    .line 532
    iput-object v2, p1, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 101
    :goto_2
    new-instance p2, Ll/ۜܽۧ;

    iget-wide v1, v0, Ll/ۜܽۧ;->ۧ:J

    invoke-direct {p2, v4, v1, v2}, Ll/ۜܽۧ;-><init>(IJ)V

    iput-object p2, v0, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 104
    iget-wide v1, p0, Ll/᩷ܽۧ;->ܳ:J

    iget-wide v3, v0, Ll/ۜܽۧ;->ۧ:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_4

    move-object v0, p2

    .line 106
    :cond_4
    iput-object v0, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    .line 107
    iget-object v0, p0, Ll/᩷ܽۧ;->ᩳ:Ll/ۜܽۧ;

    if-ne v0, p1, :cond_5

    .line 108
    iput-object p2, p0, Ll/᩷ܽۧ;->ᩳ:Ll/ۜܽۧ;

    :cond_5
    return-void

    .line 87
    :cond_6
    :goto_3
    iget-object p1, p0, Ll/᩷ܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 212
    iget-object p2, p1, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    if-nez p2, :cond_7

    goto :goto_4

    .line 218
    :cond_7
    check-cast v3, Ll/۫ܿۧ;

    invoke-virtual {v3, p1}, Ll/۫ܿۧ;->֫(Ll/ܶܿۧ;)V

    .line 530
    iput-object v2, p1, Ll/ۜܽۧ;->֫:Ll/۠ܿۧ;

    .line 532
    iput-object v2, p1, Ll/ۜܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 88
    :goto_4
    new-instance p1, Ll/ۜܽۧ;

    iget-wide v0, p0, Ll/᩷ܽۧ;->ܳ:J

    invoke-direct {p1, v4, v0, v1}, Ll/ۜܽۧ;-><init>(IJ)V

    iput-object p1, p0, Ll/᩷ܽۧ;->ܽ:Ll/ۜܽۧ;

    .line 89
    iput-object p1, p0, Ll/᩷ܽۧ;->ᩳ:Ll/ۜܽۧ;

    .line 90
    iput-object p1, p0, Ll/᩷ܽۧ;->᩻:Ll/ۜܽۧ;

    return-void
.end method

.method public final ۧ(Ll/᩸᩸֫;Ll/ۡܽۧ;)V
    .locals 2

    .line 130
    iget-object v0, p0, Ll/᩷ܽۧ;->ᩳ:Ll/ۜܽۧ;

    iget-object v1, p0, Ll/᩷ܽۧ;->ܿ:Ll/ᩳ֨֫;

    invoke-static {v0, p1, p2, v1}, Ll/᩷ܽۧ;->֫(Ll/ۜܽۧ;Ll/᩸᩸֫;Ll/ۡܽۧ;Ll/ᩳ֨֫;)Ll/ۜܽۧ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܽۧ;->ᩳ:Ll/ۜܽۧ;

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 117
    iget-object v0, p0, Ll/᩷ܽۧ;->ܽ:Ll/ۜܽۧ;

    iput-object v0, p0, Ll/᩷ܽۧ;->ᩳ:Ll/ۜܽۧ;

    return-void
.end method
