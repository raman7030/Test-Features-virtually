.class public final Ll/ᩳۡۧ;
.super Ljava/lang/Object;
.source "X8U2"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public ֫:Ll/ܽۡۧ;

.field public final ۖ:[B

.field public ۘ:Ll/᩵ۢۧ;

.field public ۜ:Ll/᩻᩵֫;

.field public final ۡ:Ll/ۙ᩷ۧ;

.field public ۢ:I

.field public final ۧ:Ll/ᩳ֨֫;

.field public ܳ:Ll/ۛ᩷ۧ;

.field public ܺ:I

.field public ܽ:I

.field public ܿ:Ll/᩸᩷ۧ;

.field public ᩳ:J

.field public final ᩷:Z

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2a

    new-array v0, v0, [B

    .line 144
    iput-object v0, p0, Ll/ᩳۡۧ;->ۖ:[B

    .line 146
    new-instance v0, Ll/ᩳ֨֫;

    const v1, 0x8000

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ᩳ֨֫;-><init>([BI)V

    iput-object v0, p0, Ll/ᩳۡۧ;->ۧ:Ll/ᩳ֨֫;

    .line 147
    iput-boolean v2, p0, Ll/ᩳۡۧ;->᩷:Z

    .line 148
    new-instance v0, Ll/ۙ᩷ۧ;

    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 148
    iput-object v0, p0, Ll/ᩳۡۧ;->ۡ:Ll/ۙ᩷ۧ;

    .line 149
    iput v2, p0, Ll/ᩳۡۧ;->ܺ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 168
    iget v2, v0, Ll/ᩳۡۧ;->ܺ:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_24

    iget-object v6, v0, Ll/ᩳۡۧ;->ۖ:[B

    const/4 v7, 0x2

    if-eq v2, v4, :cond_23

    const/4 v8, 0x4

    const/4 v9, 0x3

    if-eq v2, v7, :cond_21

    const/4 v10, 0x6

    const/4 v11, 0x7

    if-eq v2, v9, :cond_1a

    const-wide/16 v11, 0x0

    const-wide/16 v13, -0x1

    const/4 v6, 0x5

    if-eq v2, v8, :cond_16

    if-ne v2, v6, :cond_15

    .line 259
    iget-object v2, v0, Ll/ᩳۡۧ;->ۘ:Ll/᩵ۢۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    iget-object v2, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    iget-object v2, v0, Ll/ᩳۡۧ;->֫:Ll/ܽۡۧ;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ll/᩻᩷ۧ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 264
    iget-object v2, v0, Ll/ᩳۡۧ;->֫:Ll/ܽۡۧ;

    move-object/from16 v3, p2

    invoke-virtual {v2, v1, v3}, Ll/᩻᩷ۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result v1

    return v1

    .line 268
    :cond_0
    iget-wide v8, v0, Ll/ᩳۡۧ;->ᩳ:J

    const/4 v2, -0x1

    cmp-long v6, v8, v13

    if-nez v6, :cond_7

    .line 269
    iget-object v6, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    .line 139
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 140
    invoke-interface {v1, v4}, Ll/۠᩷ۧ;->֫(I)V

    new-array v8, v4, [B

    .line 142
    invoke-interface {v1, v5, v4, v8}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 143
    aget-byte v8, v8, v5

    and-int/2addr v8, v4

    if-ne v8, v4, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    .line 144
    :goto_0
    invoke-interface {v1, v7}, Ll/۠᩷ۧ;->֫(I)V

    if-eqz v8, :cond_2

    const/4 v10, 0x7

    .line 147
    :cond_2
    new-instance v7, Ll/ᩳ֨֫;

    invoke-direct {v7, v10}, Ll/ᩳ֨֫;-><init>(I)V

    .line 149
    invoke-virtual {v7}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v9

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v10, :cond_4

    sub-int v14, v10, v13

    .line 60
    invoke-interface {v1, v13, v14, v9}, Ll/۠᩷ۧ;->ۧ(II[B)I

    move-result v14

    if-ne v14, v2, :cond_3

    goto :goto_2

    :cond_3
    add-int/2addr v13, v14

    goto :goto_1

    .line 150
    :cond_4
    :goto_2
    invoke-virtual {v7, v13}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 151
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 252
    :try_start_0
    invoke-virtual {v7}, Ll/ᩳ֨֫;->۬()J

    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v8, :cond_5

    :goto_3
    move-wide v11, v1

    goto :goto_4

    .line 258
    :cond_5
    iget v6, v6, Ll/ۛ᩷ۧ;->ᩳ:I

    int-to-long v6, v6

    mul-long v1, v1, v6

    goto :goto_3

    :catch_0
    const/4 v4, 0x0

    :goto_4
    if-eqz v4, :cond_6

    .line 270
    iput-wide v11, v0, Ll/ᩳۡۧ;->ᩳ:J

    goto/16 :goto_c

    .line 156
    :cond_6
    invoke-static {v3, v3}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 275
    :cond_7
    iget-object v3, v0, Ll/ᩳۡۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v6

    const-wide/32 v7, 0xf4240

    const v9, 0x8000

    if-ge v6, v9, :cond_a

    .line 280
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v10

    sub-int/2addr v9, v6

    .line 279
    invoke-interface {v1, v10, v6, v9}, Ll/ۢᩴ֫;->read([BII)I

    move-result v1

    if-ne v1, v2, :cond_8

    goto :goto_5

    :cond_8
    const/4 v4, 0x0

    :goto_5
    if-nez v4, :cond_9

    add-int/2addr v6, v1

    .line 285
    invoke-virtual {v3, v6}, Ll/ᩳ֨֫;->ᩳ(I)V

    goto :goto_6

    .line 286
    :cond_9
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    if-nez v1, :cond_b

    .line 425
    iget-wide v3, v0, Ll/ᩳۡۧ;->ᩳ:J

    mul-long v3, v3, v7

    iget-object v1, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    .line 428
    sget-object v5, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget v1, v1, Ll/ۛ᩷ۧ;->᩷:I

    int-to-long v5, v1

    div-long v8, v3, v5

    .line 429
    iget-object v7, v0, Ll/ᩳۡۧ;->ۘ:Ll/᩵ۢۧ;

    iget v11, v0, Ll/ᩳۡۧ;->ܽ:I

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v10, 0x1

    .line 430
    invoke-interface/range {v7 .. v13}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    return v2

    :cond_a
    const/4 v4, 0x0

    .line 293
    :cond_b
    :goto_6
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 296
    iget v2, v0, Ll/ᩳۡۧ;->ܽ:I

    iget v6, v0, Ll/ᩳۡۧ;->ۢ:I

    if-ge v2, v6, :cond_c

    sub-int/2addr v6, v2

    .line 297
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v3, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 359
    :cond_c
    iget-object v2, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v2

    .line 362
    :goto_7
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v6

    const/16 v9, 0x10

    sub-int/2addr v6, v9

    iget-object v10, v0, Ll/ᩳۡۧ;->ۡ:Ll/ۙ᩷ۧ;

    if-gt v2, v6, :cond_e

    .line 363
    invoke-virtual {v3, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 364
    iget-object v6, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    iget v11, v0, Ll/ᩳۡۧ;->᩻:I

    invoke-static {v3, v6, v11, v10}, Ll/ۗ᩷ۧ;->֫(Ll/ᩳ֨֫;Ll/ۛ᩷ۧ;ILl/ۙ᩷ۧ;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 366
    invoke-virtual {v3, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 367
    iget-wide v10, v10, Ll/ۙ᩷ۧ;->֫:J

    goto :goto_b

    :cond_d
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_e
    if-eqz v4, :cond_12

    .line 392
    :goto_8
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v4

    iget v6, v0, Ll/ᩳۡۧ;->ۢ:I

    sub-int/2addr v4, v6

    if-gt v2, v4, :cond_11

    .line 393
    invoke-virtual {v3, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 396
    :try_start_1
    iget-object v4, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    iget v6, v0, Ll/ᩳۡۧ;->᩻:I

    .line 397
    invoke-static {v3, v4, v6, v10}, Ll/ۗ᩷ۧ;->֫(Ll/ᩳ֨֫;Ll/ۛ᩷ۧ;ILl/ۙ᩷ۧ;)Z

    move-result v4
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_9

    :catch_1
    const/4 v4, 0x0

    .line 403
    :goto_9
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v6

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v11

    if-le v6, v11, :cond_f

    const/4 v4, 0x0

    :cond_f
    if-eqz v4, :cond_10

    .line 410
    invoke-virtual {v3, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 411
    iget-wide v10, v10, Ll/ۙ᩷ۧ;->֫:J

    goto :goto_b

    :cond_10
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 416
    :cond_11
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    invoke-virtual {v3, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_a

    .line 418
    :cond_12
    invoke-virtual {v3, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    :goto_a
    move-wide v10, v13

    .line 301
    :goto_b
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v2

    sub-int/2addr v2, v1

    .line 302
    invoke-virtual {v3, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 303
    iget-object v1, v0, Ll/ᩳۡۧ;->ۘ:Ll/᩵ۢۧ;

    invoke-interface {v1, v2, v3}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 304
    iget v1, v0, Ll/ᩳۡۧ;->ܽ:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/ᩳۡۧ;->ܽ:I

    cmp-long v2, v10, v13

    if-eqz v2, :cond_13

    .line 425
    iget-wide v12, v0, Ll/ᩳۡۧ;->ᩳ:J

    mul-long v12, v12, v7

    iget-object v2, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    .line 428
    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget v2, v2, Ll/ۛ᩷ۧ;->᩷:I

    int-to-long v6, v2

    div-long v16, v12, v6

    .line 429
    iget-object v15, v0, Ll/ᩳۡۧ;->ۘ:Ll/᩵ۢۧ;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v18, 0x1

    move/from16 v19, v1

    .line 430
    invoke-interface/range {v15 .. v21}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 309
    iput v5, v0, Ll/ᩳۡۧ;->ܽ:I

    .line 310
    iput-wide v10, v0, Ll/ᩳۡۧ;->ᩳ:J

    .line 313
    :cond_13
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    array-length v1, v1

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v2

    sub-int/2addr v1, v2

    .line 314
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    if-ge v2, v9, :cond_14

    if-ge v1, v9, :cond_14

    .line 320
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    .line 322
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v4

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v6

    .line 321
    invoke-static {v2, v4, v6, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 323
    invoke-virtual {v3, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 324
    invoke-virtual {v3, v1}, Ll/ᩳ֨֫;->ᩳ(I)V

    :cond_14
    :goto_c
    return v5

    .line 187
    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    .line 231
    :cond_16
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 232
    new-instance v2, Ll/ᩳ֨֫;

    invoke-direct {v2, v7}, Ll/ᩳ֨֫;-><init>(I)V

    .line 233
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    invoke-interface {v1, v5, v7, v4}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 235
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ۗ()I

    move-result v2

    shr-int/lit8 v4, v2, 0x2

    const/16 v7, 0x3ffe

    if-ne v4, v7, :cond_19

    .line 243
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 247
    iput v2, v0, Ll/ᩳۡۧ;->᩻:I

    .line 248
    iget-object v2, v0, Ll/ᩳۡۧ;->ܿ:Ll/᩸᩷ۧ;

    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 251
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v3

    .line 252
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v20

    .line 331
    iget-object v1, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    iget-object v1, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    iget-object v7, v1, Ll/ۛ᩷ۧ;->ۡ:Ll/ۤ᩷ۧ;

    if-eqz v7, :cond_17

    iget-object v7, v7, Ll/ۤ᩷ۧ;->ۧ:[J

    array-length v7, v7

    if-lez v7, :cond_17

    .line 334
    new-instance v7, Ll/۫᩷ۧ;

    invoke-direct {v7, v1, v3, v4}, Ll/۫᩷ۧ;-><init>(Ll/ۛ᩷ۧ;J)V

    goto :goto_d

    :cond_17
    cmp-long v7, v20, v13

    if-eqz v7, :cond_18

    .line 335
    iget-wide v7, v1, Ll/ۛ᩷ۧ;->ܺ:J

    cmp-long v9, v7, v11

    if-lez v9, :cond_18

    .line 336
    new-instance v7, Ll/ܽۡۧ;

    iget v8, v0, Ll/ᩳۡۧ;->᩻:I

    move-object v15, v7

    move-object/from16 v16, v1

    move/from16 v17, v8

    move-wide/from16 v18, v3

    invoke-direct/range {v15 .. v21}, Ll/ܽۡۧ;-><init>(Ll/ۛ᩷ۧ;IJJ)V

    iput-object v7, v0, Ll/ᩳۡۧ;->֫:Ll/ܽۡۧ;

    .line 339
    invoke-virtual {v7}, Ll/᩻᩷ۧ;->֫()Ll/֫᩷ۧ;

    move-result-object v7

    goto :goto_d

    .line 341
    :cond_18
    new-instance v7, Ll/᩷ۢۧ;

    invoke-virtual {v1}, Ll/ۛ᩷ۧ;->֫()J

    move-result-wide v3

    invoke-direct {v7, v3, v4}, Ll/᩷ۢۧ;-><init>(J)V

    .line 249
    :goto_d
    invoke-interface {v2, v7}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 254
    iput v6, v0, Ll/ᩳۡۧ;->ܺ:I

    return v5

    .line 238
    :cond_19
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    const-string v1, "First frame does not start with sync code."

    .line 239
    invoke-static {v1, v3}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 228
    :cond_1a
    iget-object v2, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    const/4 v3, 0x0

    :goto_e
    if-nez v3, :cond_20

    .line 147
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 148
    new-instance v3, Ll/ܽ֨֫;

    new-array v4, v8, [B

    .line 48
    invoke-direct {v3, v4, v8}, Ll/ܽ֨֫;-><init>([BI)V

    .line 149
    invoke-interface {v1, v5, v8, v4}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 151
    invoke-virtual {v3}, Ll/ܽ֨֫;->ܿ()Z

    move-result v4

    .line 152
    invoke-virtual {v3, v11}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v7

    const/16 v12, 0x18

    .line 153
    invoke-virtual {v3, v12}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    add-int/2addr v3, v8

    if-nez v7, :cond_1b

    const/16 v2, 0x26

    new-array v3, v2, [B

    .line 249
    invoke-interface {v1, v3, v5, v2}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 250
    new-instance v2, Ll/ۛ᩷ۧ;

    invoke-direct {v2, v3, v8}, Ll/ۛ᩷ۧ;-><init>([BI)V

    goto :goto_f

    :cond_1b
    if-eqz v2, :cond_1f

    if-ne v7, v9, :cond_1c

    .line 256
    new-instance v7, Ll/ᩳ֨֫;

    invoke-direct {v7, v3}, Ll/ᩳ֨֫;-><init>(I)V

    .line 257
    invoke-virtual {v7}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    invoke-interface {v1, v12, v5, v3}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 258
    invoke-static {v7}, Ll/۬᩷ۧ;->֫(Ll/ᩳ֨֫;)Ll/ۤ᩷ۧ;

    move-result-object v3

    .line 163
    invoke-virtual {v2, v3}, Ll/ۛ᩷ۧ;->֫(Ll/ۤ᩷ۧ;)Ll/ۛ᩷ۧ;

    move-result-object v2

    goto :goto_f

    :cond_1c
    if-ne v7, v8, :cond_1d

    .line 263
    new-instance v7, Ll/ᩳ֨֫;

    invoke-direct {v7, v3}, Ll/ᩳ֨֫;-><init>(I)V

    .line 264
    invoke-virtual {v7}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    invoke-interface {v1, v12, v5, v3}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 265
    invoke-virtual {v7, v8}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 267
    invoke-static {v7, v5, v5}, Ll/᩸ۢۧ;->֫(Ll/ᩳ֨֫;ZZ)Ll/֨ۢۧ;

    move-result-object v3

    .line 269
    iget-object v3, v3, Ll/֨ۢۧ;->֫:[Ljava/lang/String;

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 167
    invoke-virtual {v2, v3}, Ll/ۛ᩷ۧ;->ۧ(Ljava/util/List;)Ll/ۛ᩷ۧ;

    move-result-object v2

    goto :goto_f

    :cond_1d
    if-ne v7, v10, :cond_1e

    .line 169
    new-instance v7, Ll/ᩳ֨֫;

    invoke-direct {v7, v3}, Ll/ᩳ֨֫;-><init>(I)V

    .line 170
    invoke-virtual {v7}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    invoke-interface {v1, v12, v5, v3}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 171
    invoke-virtual {v7, v8}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 172
    invoke-static {v7}, Ll/ۗۡۧ;->֫(Ll/ᩳ֨֫;)Ll/ۗۡۧ;

    move-result-object v3

    .line 174
    invoke-static {v3}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ۛ᩷ۧ;->֫(Ljava/util/List;)Ll/ۛ᩷ۧ;

    move-result-object v2

    goto :goto_f

    .line 176
    :cond_1e
    invoke-interface {v1, v3}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 233
    :goto_f
    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iput-object v2, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    move v3, v4

    goto/16 :goto_e

    .line 159
    :cond_1f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    .line 236
    :cond_20
    iget-object v1, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    iget-object v1, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    iget v1, v1, Ll/ۛ᩷ۧ;->ۜ:I

    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Ll/ᩳۡۧ;->ۢ:I

    .line 238
    iget-object v1, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    iget-object v2, v0, Ll/ᩳۡۧ;->ۜ:Ll/᩻᩵֫;

    invoke-virtual {v1, v6, v2}, Ll/ۛ᩷ۧ;->֫([BLl/᩻᩵֫;)Ll/۠ᩴ֫;

    move-result-object v1

    .line 239
    iget-object v2, v0, Ll/ᩳۡۧ;->ۘ:Ll/᩵ۢۧ;

    .line 240
    invoke-virtual {v1}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v1

    const-string v3, "audio/flac"

    invoke-virtual {v1, v3}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    invoke-interface {v2, v1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 241
    iget-object v1, v0, Ll/ᩳۡۧ;->ۘ:Ll/᩵ۢۧ;

    iget-object v2, v0, Ll/ᩳۡۧ;->ܳ:Ll/ۛ᩷ۧ;

    invoke-virtual {v2}, Ll/ۛ᩷ۧ;->֫()J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Ll/᩵ۢۧ;->֫(J)V

    .line 243
    iput v8, v0, Ll/ᩳۡۧ;->ܺ:I

    return v5

    .line 118
    :cond_21
    new-instance v2, Ll/ᩳ֨֫;

    invoke-direct {v2, v8}, Ll/ᩳ֨֫;-><init>(I)V

    .line 119
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    invoke-interface {v1, v4, v5, v8}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 120
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v1

    const-wide/32 v6, 0x664c6143

    cmp-long v4, v1, v6

    if-nez v4, :cond_22

    .line 223
    iput v9, v0, Ll/ᩳۡۧ;->ܺ:I

    return v5

    :cond_22
    const-string v1, "Failed to read FLAC stream marker."

    .line 121
    invoke-static {v1, v3}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 216
    :cond_23
    array-length v2, v6

    invoke-interface {v1, v5, v2, v6}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 217
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 218
    iput v7, v0, Ll/ᩳۡۧ;->ܺ:I

    return v5

    .line 100
    :cond_24
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 101
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v6

    .line 65
    iget-boolean v2, v0, Ll/ᩳۡۧ;->᩷:Z

    if-nez v2, :cond_25

    move-object v2, v3

    goto :goto_10

    :cond_25
    sget-object v2, Ll/ܿܺۧ;->ۧ:Ll/ۡܶ֫;

    .line 66
    :goto_10
    new-instance v8, Ll/ܽۢۧ;

    invoke-direct {v8}, Ll/ܽۢۧ;-><init>()V

    invoke-virtual {v8, v1, v2}, Ll/ܽۢۧ;->֫(Ll/۠᩷ۧ;Ll/ܽܺۧ;)Ll/᩻᩵֫;

    move-result-object v2

    if-eqz v2, :cond_27

    .line 67
    invoke-virtual {v2}, Ll/᩻᩵֫;->֫()I

    move-result v8

    if-nez v8, :cond_26

    goto :goto_11

    :cond_26
    move-object v3, v2

    .line 103
    :cond_27
    :goto_11
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v8

    sub-long/2addr v8, v6

    long-to-int v2, v8

    .line 104
    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 211
    iput-object v3, v0, Ll/ᩳۡۧ;->ۜ:Ll/᩻᩵֫;

    .line 212
    iput v4, v0, Ll/ᩳۡۧ;->ܺ:I

    return v5
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    .line 194
    iput v0, p0, Ll/ᩳۡۧ;->ܺ:I

    goto :goto_0

    .line 195
    :cond_0
    iget-object p1, p0, Ll/ᩳۡۧ;->֫:Ll/ܽۡۧ;

    if-eqz p1, :cond_1

    .line 196
    invoke-virtual {p1, p3, p4}, Ll/᩻᩷ۧ;->֫(J)V

    :cond_1
    :goto_0
    cmp-long p1, p3, v1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v1, -0x1

    .line 198
    :goto_1
    iput-wide v1, p0, Ll/ᩳۡۧ;->ᩳ:J

    .line 199
    iput v0, p0, Ll/ᩳۡۧ;->ܽ:I

    .line 200
    iget-object p1, p0, Ll/ᩳۡۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܽ(I)V

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 2

    .line 160
    iput-object p1, p0, Ll/ᩳۡۧ;->ܿ:Ll/᩸᩷ۧ;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 161
    invoke-interface {p1, v0, v1}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۡۧ;->ۘ:Ll/᩵ۢۧ;

    .line 162
    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 6

    .line 66
    new-instance v0, Ll/ܽۢۧ;

    invoke-direct {v0}, Ll/ܽۢۧ;-><init>()V

    sget-object v1, Ll/ܿܺۧ;->ۧ:Ll/ۡܶ֫;

    invoke-virtual {v0, p1, v1}, Ll/ܽۢۧ;->֫(Ll/۠᩷ۧ;Ll/ܽܺۧ;)Ll/᩻᩵֫;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 67
    invoke-virtual {v0}, Ll/᩻᩵֫;->֫()I

    .line 79
    :cond_0
    new-instance v0, Ll/ᩳ֨֫;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    .line 80
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    check-cast p1, Ll/ܺ᩷ۧ;

    const/4 v3, 0x0

    .line 157
    invoke-virtual {p1, v3, v3, v1, v2}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 81
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v0

    const-wide/32 v4, 0x664c6143

    cmp-long p1, v0, v4

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v3
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
