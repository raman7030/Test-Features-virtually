.class public final Ll/ۛۜۧ;
.super Ljava/lang/Object;
.source "68JR"


# static fields
.field public static final ֫:[I

.field public static final ۧ:[I

.field public static final ܳ:[I

.field public static final ܽ:[I

.field public static final ܿ:[I

.field public static final ᩳ:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    const/4 v1, 0x6

    const/4 v2, 0x1

    const/4 v3, 0x2

    .line 142
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ۛۜۧ;->ۧ:[I

    const v0, 0xac44

    const/16 v1, 0x7d00

    const v2, 0xbb80

    .line 145
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ۛۜۧ;->ᩳ:[I

    const/16 v0, 0x5622

    const/16 v1, 0x3e80

    const/16 v2, 0x5dc0

    .line 148
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ۛۜۧ;->ܿ:[I

    const/16 v0, 0x8

    new-array v0, v0, [I

    .line 151
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۛۜۧ;->ܽ:[I

    const/16 v0, 0x13

    new-array v1, v0, [I

    .line 154
    fill-array-data v1, :array_1

    sput-object v1, Ll/ۛۜۧ;->֫:[I

    new-array v0, v0, [I

    .line 160
    fill-array-data v0, :array_2

    sput-object v0, Ll/ۛۜۧ;->ܳ:[I

    return-void

    :array_0
    .array-data 4
        0x2
        0x1
        0x2
        0x3
        0x3
        0x4
        0x4
        0x5
    .end array-data

    :array_1
    .array-data 4
        0x20
        0x28
        0x30
        0x38
        0x40
        0x50
        0x60
        0x70
        0x80
        0xa0
        0xc0
        0xe0
        0x100
        0x140
        0x180
        0x1c0
        0x200
        0x240
        0x280
    .end array-data

    :array_2
    .array-data 4
        0x45
        0x57
        0x68
        0x79
        0x8b
        0xae
        0xd0
        0xf3
        0x116
        0x15c
        0x1a1
        0x1e7
        0x22d
        0x2b8
        0x343
        0x3cf
        0x45a
        0x4e5
        0x571
    .end array-data
.end method

.method public static ֫(II)I
    .locals 2

    .line 605
    div-int/lit8 v0, p1, 0x2

    if-ltz p0, :cond_3

    const/4 v1, 0x3

    if-ge p0, v1, :cond_3

    if-ltz p1, :cond_3

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 613
    :cond_0
    sget-object v1, Ll/ۛۜۧ;->ᩳ:[I

    aget p0, v1, p0

    const v1, 0xac44

    if-ne p0, v1, :cond_1

    .line 615
    sget-object p0, Ll/ۛۜۧ;->ܳ:[I

    aget p0, p0, v0

    rem-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p0

    mul-int/lit8 p1, p1, 0x2

    return p1

    .line 617
    :cond_1
    sget-object p1, Ll/ۛۜۧ;->֫:[I

    aget p1, p1, v0

    const/16 v0, 0x7d00

    if-ne p0, v0, :cond_2

    mul-int/lit8 p1, p1, 0x6

    return p1

    :cond_2
    mul-int/lit8 p1, p1, 0x4

    return p1

    :cond_3
    :goto_0
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/nio/ByteBuffer;)I
    .locals 3

    .line 538
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xf8

    const/4 v1, 0x3

    shr-int/2addr v0, v1

    const/16 v2, 0xa

    if-le v0, v2, :cond_1

    .line 540
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xc0

    shr-int/lit8 v0, v0, 0x6

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 541
    :cond_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p0

    and-int/lit8 p0, p0, 0x30

    shr-int/lit8 v1, p0, 0x4

    .line 542
    :goto_0
    sget-object p0, Ll/ۛۜۧ;->ۧ:[I

    aget p0, p0, v1

    mul-int/lit16 p0, p0, 0x100

    return p0

    :cond_1
    const/16 p0, 0x600

    return p0
.end method

.method public static ֫([B)I
    .locals 4

    .line 513
    array-length v0, p0

    const/4 v1, 0x6

    if-ge v0, v1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/4 v0, 0x5

    .line 517
    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xf8

    const/4 v2, 0x3

    shr-int/2addr v0, v2

    const/16 v3, 0xa

    if-le v0, v3, :cond_1

    const/4 v0, 0x2

    .line 519
    aget-byte v0, p0, v0

    and-int/lit8 v0, v0, 0x7

    shl-int/lit8 v0, v0, 0x8

    .line 520
    aget-byte p0, p0, v2

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    add-int/lit8 p0, p0, 0x1

    mul-int/lit8 p0, p0, 0x2

    return p0

    :cond_1
    const/4 v0, 0x4

    .line 523
    aget-byte p0, p0, v0

    and-int/lit16 v0, p0, 0xc0

    shr-int/2addr v0, v1

    and-int/lit8 p0, p0, 0x3f

    .line 525
    invoke-static {v0, p0}, Ll/ۛۜۧ;->֫(II)I

    move-result p0

    return p0
.end method

.method public static ֫(Ll/ᩳ֨֫;Ljava/lang/String;Ljava/lang/String;Ll/᩵ᩴ֫;)Ll/۠ᩴ֫;
    .locals 5

    .line 181
    new-instance v0, Ll/ܽ֨֫;

    invoke-direct {v0}, Ll/ܽ֨֫;-><init>()V

    .line 182
    invoke-virtual {v0, p0}, Ll/ܽ֨֫;->֫(Ll/ᩳ֨֫;)V

    const/4 v1, 0x2

    .line 184
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    .line 185
    sget-object v2, Ll/ۛۜۧ;->ᩳ:[I

    aget v1, v2, v1

    const/16 v2, 0x8

    .line 186
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v2, 0x3

    .line 187
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    sget-object v3, Ll/ۛۜۧ;->ܽ:[I

    aget v2, v3, v2

    const/4 v3, 0x1

    .line 188
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    :cond_0
    const/4 v3, 0x5

    .line 191
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    .line 192
    sget-object v4, Ll/ۛۜۧ;->֫:[I

    aget v3, v4, v3

    mul-int/lit16 v3, v3, 0x3e8

    .line 194
    invoke-virtual {v0}, Ll/ܽ֨֫;->ۧ()V

    .line 195
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܽ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 196
    new-instance p0, Ll/֨ᩴ֫;

    invoke-direct {p0}, Ll/֨ᩴ֫;-><init>()V

    .line 197
    invoke-virtual {p0, p1}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string p1, "audio/ac3"

    .line 198
    invoke-virtual {p0, p1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 199
    invoke-virtual {p0, v2}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 200
    invoke-virtual {p0, v1}, Ll/֨ᩴ֫;->۠(I)V

    .line 201
    invoke-virtual {p0, p3}, Ll/֨ᩴ֫;->֫(Ll/᩵ᩴ֫;)V

    .line 202
    invoke-virtual {p0, p2}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    .line 203
    invoke-virtual {p0, v3}, Ll/֨ᩴ֫;->ܽ(I)V

    .line 204
    invoke-virtual {p0, v3}, Ll/֨ᩴ֫;->֡(I)V

    .line 205
    invoke-virtual {p0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܽ֨֫;)Ll/ۤۜۧ;
    .locals 23

    move-object/from16 v0, p0

    .line 281
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ᩳ()I

    move-result v1

    const/16 v2, 0x28

    .line 282
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v2, 0x5

    .line 284
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    const/4 v4, 0x1

    const/16 v5, 0xa

    if-le v3, v5, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 285
    :goto_0
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ᩳ(I)V

    .line 295
    sget-object v1, Ll/ۛۜۧ;->ܽ:[I

    sget-object v6, Ll/ۛۜۧ;->ᩳ:[I

    const/4 v7, -0x1

    const/16 v8, 0x8

    const/4 v9, 0x3

    const/4 v10, 0x2

    if-eqz v3, :cond_2a

    const/16 v3, 0x10

    .line 297
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 298
    invoke-virtual {v0, v10}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    if-eqz v11, :cond_3

    if-eq v11, v4, :cond_2

    if-eq v11, v10, :cond_1

    goto :goto_1

    :cond_1
    const/4 v7, 0x2

    goto :goto_1

    :cond_2
    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    .line 312
    :goto_1
    invoke-virtual {v0, v9}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v11, 0xb

    .line 313
    invoke-virtual {v0, v11}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    add-int/2addr v11, v4

    mul-int/lit8 v11, v11, 0x2

    .line 314
    invoke-virtual {v0, v10}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    if-ne v12, v9, :cond_4

    .line 319
    sget-object v6, Ll/ۛۜۧ;->ܿ:[I

    invoke-virtual {v0, v10}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    aget v6, v6, v10

    const/4 v10, 0x6

    const/4 v13, 0x3

    goto :goto_2

    .line 322
    :cond_4
    invoke-virtual {v0, v10}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v13

    .line 323
    sget-object v10, Ll/ۛۜۧ;->ۧ:[I

    aget v10, v10, v13

    .line 324
    aget v6, v6, v12

    :goto_2
    mul-int/lit16 v14, v10, 0x100

    mul-int v15, v11, v6

    mul-int/lit8 v16, v10, 0x20

    .line 632
    div-int v15, v15, v16

    .line 328
    invoke-virtual {v0, v9}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    .line 329
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v17

    .line 330
    aget v1, v1, v3

    add-int v1, v1, v17

    .line 331
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 332
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 333
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_5
    if-nez v3, :cond_6

    .line 336
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 337
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 338
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_6
    if-ne v7, v4, :cond_7

    .line 341
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x10

    .line 342
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 344
    :cond_7
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_20

    const/4 v5, 0x2

    if-le v3, v5, :cond_8

    .line 346
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_8
    and-int/lit8 v16, v3, 0x1

    if-eqz v16, :cond_9

    if-le v3, v5, :cond_9

    const/4 v5, 0x6

    .line 349
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_3

    :cond_9
    const/4 v5, 0x6

    :goto_3
    and-int/lit8 v16, v3, 0x4

    if-eqz v16, :cond_a

    .line 352
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_a
    if-eqz v17, :cond_b

    .line 354
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_b

    .line 355
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_b
    if-nez v7, :cond_20

    .line 358
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v5, 0x6

    .line 359
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_4

    :cond_c
    const/4 v5, 0x6

    :goto_4
    if-nez v3, :cond_d

    .line 361
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    if-eqz v16, :cond_d

    .line 362
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 364
    :cond_d
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    if-eqz v16, :cond_e

    .line 365
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_e
    const/4 v5, 0x2

    .line 367
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    if-ne v8, v4, :cond_f

    .line 369
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_6

    :cond_f
    if-ne v8, v5, :cond_10

    const/16 v5, 0xc

    .line 371
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    goto/16 :goto_6

    :cond_10
    if-ne v8, v9, :cond_1b

    .line 373
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    .line 374
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_19

    .line 375
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 376
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_11

    const/4 v8, 0x4

    .line 377
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_5

    :cond_11
    const/4 v8, 0x4

    .line 379
    :goto_5
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    if-eqz v16, :cond_12

    .line 380
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 382
    :cond_12
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    if-eqz v16, :cond_13

    .line 383
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 385
    :cond_13
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    if-eqz v16, :cond_14

    .line 386
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 388
    :cond_14
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    if-eqz v16, :cond_15

    .line 389
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 391
    :cond_15
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    if-eqz v16, :cond_16

    .line 392
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 394
    :cond_16
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    if-eqz v16, :cond_17

    .line 395
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 397
    :cond_17
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    if-eqz v16, :cond_19

    .line 398
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    if-eqz v16, :cond_18

    .line 399
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 401
    :cond_18
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v16

    if-eqz v16, :cond_19

    .line 402
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 406
    :cond_19
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_1a

    .line 407
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 408
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_1a

    const/4 v8, 0x7

    .line 409
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 410
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_1a

    const/16 v8, 0x8

    .line 411
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_1a
    const/4 v8, 0x2

    add-int/2addr v5, v8

    mul-int/lit8 v5, v5, 0x8

    .line 415
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 416
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ۧ()V

    goto :goto_7

    :cond_1b
    :goto_6
    const/4 v8, 0x2

    :goto_7
    if-ge v3, v8, :cond_1d

    .line 419
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    const/16 v8, 0xe

    if-eqz v5, :cond_1c

    .line 420
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_1c
    if-nez v3, :cond_1d

    .line 423
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_1d

    .line 424
    invoke-virtual {v0, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 428
    :cond_1d
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_20

    if-nez v13, :cond_1e

    .line 430
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_9

    :cond_1e
    const/4 v5, 0x0

    :goto_8
    if-ge v5, v10, :cond_20

    .line 433
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_1f

    .line 434
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_1f
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    .line 441
    :cond_20
    :goto_9
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_25

    .line 442
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v2, 0x2

    if-ne v3, v2, :cond_21

    const/4 v5, 0x4

    .line 444
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_21
    const/4 v5, 0x6

    if-lt v3, v5, :cond_22

    .line 447
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 449
    :cond_22
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    const/16 v5, 0x8

    if-eqz v2, :cond_23

    .line 450
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_23
    if-nez v3, :cond_24

    .line 452
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_24

    .line 453
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_24
    if-ge v12, v9, :cond_25

    .line 456
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܳ()V

    :cond_25
    if-nez v7, :cond_26

    if-eq v13, v9, :cond_26

    .line 460
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܳ()V

    :cond_26
    const/4 v2, 0x2

    if-ne v7, v2, :cond_28

    if-eq v13, v9, :cond_27

    .line 463
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_28

    :cond_27
    const/4 v2, 0x6

    .line 464
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_a

    :cond_28
    const/4 v2, 0x6

    .line 467
    :goto_a
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_29

    .line 468
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    if-ne v2, v4, :cond_29

    const/16 v2, 0x8

    .line 469
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v0

    if-ne v0, v4, :cond_29

    const-string v0, "audio/eac3-joc"

    goto :goto_b

    :cond_29
    const-string v0, "audio/eac3"

    :goto_b
    move-object/from16 v17, v0

    move/from16 v18, v1

    move/from16 v19, v6

    move/from16 v20, v11

    move/from16 v21, v14

    move/from16 v22, v15

    goto :goto_e

    :cond_2a
    const/16 v2, 0x20

    .line 475
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v2, 0x2

    .line 476
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    if-ne v2, v9, :cond_2b

    const/4 v3, 0x0

    goto :goto_c

    :cond_2b
    const-string v3, "audio/ac3"

    :goto_c
    const/4 v5, 0x6

    .line 482
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    .line 483
    div-int/lit8 v8, v5, 0x2

    sget-object v10, Ll/ۛۜۧ;->֫:[I

    aget v8, v10, v8

    mul-int/lit16 v15, v8, 0x3e8

    .line 484
    invoke-static {v2, v5}, Ll/ۛۜۧ;->֫(II)I

    move-result v11

    const/16 v5, 0x8

    .line 485
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 486
    invoke-virtual {v0, v9}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    and-int/lit8 v8, v5, 0x1

    if-eqz v8, :cond_2c

    if-eq v5, v4, :cond_2c

    const/4 v4, 0x2

    .line 488
    invoke-virtual {v0, v4}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_d

    :cond_2c
    const/4 v4, 0x2

    :goto_d
    and-int/lit8 v8, v5, 0x4

    if-eqz v8, :cond_2d

    .line 491
    invoke-virtual {v0, v4}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_2d
    if-ne v5, v4, :cond_2e

    .line 494
    invoke-virtual {v0, v4}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_2e
    if-ge v2, v9, :cond_2f

    .line 497
    aget v7, v6, v2

    .line 499
    :cond_2f
    invoke-virtual/range {p0 .. p0}, Ll/ܽ֨֫;->ܿ()Z

    move-result v0

    .line 500
    aget v1, v1, v5

    add-int/2addr v1, v0

    const/16 v14, 0x600

    move/from16 v18, v1

    move-object/from16 v17, v3

    move/from16 v19, v7

    move/from16 v20, v11

    move/from16 v22, v15

    const/16 v21, 0x600

    .line 502
    :goto_e
    new-instance v0, Ll/ۤۜۧ;

    move-object/from16 v16, v0

    invoke-direct/range {v16 .. v22}, Ll/ۤۜۧ;-><init>(Ljava/lang/String;IIIII)V

    return-object v0
.end method

.method public static ۧ(Ll/ᩳ֨֫;Ljava/lang/String;Ljava/lang/String;Ll/᩵ᩴ֫;)Ll/۠ᩴ֫;
    .locals 7

    .line 223
    new-instance v0, Ll/ܽ֨֫;

    invoke-direct {v0}, Ll/ܽ֨֫;-><init>()V

    .line 224
    invoke-virtual {v0, p0}, Ll/ܽ֨֫;->֫(Ll/ᩳ֨֫;)V

    const/16 v1, 0xd

    .line 226
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    const/4 v2, 0x3

    .line 227
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v3, 0x2

    .line 230
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    .line 231
    sget-object v4, Ll/ۛۜۧ;->ᩳ:[I

    aget v3, v4, v3

    const/16 v4, 0xa

    .line 232
    invoke-virtual {v0, v4}, Ll/ܽ֨֫;->ܿ(I)V

    .line 233
    sget-object v4, Ll/ۛۜۧ;->ܽ:[I

    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    .line 234
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    if-eqz v6, :cond_0

    add-int/lit8 v4, v4, 0x1

    .line 239
    :cond_0
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v2, 0x4

    .line 240
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    .line 241
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    if-lez v2, :cond_2

    const/4 v2, 0x6

    .line 243
    invoke-virtual {v0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 246
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v4, v4, 0x2

    .line 249
    :cond_1
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 253
    :cond_2
    invoke-virtual {v0}, Ll/ܽ֨֫;->֫()I

    move-result v2

    const/4 v6, 0x7

    if-le v2, v6, :cond_3

    .line 254
    invoke-virtual {v0, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 255
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "audio/eac3-joc"

    goto :goto_0

    :cond_3
    const-string v2, "audio/eac3"

    .line 260
    :goto_0
    invoke-virtual {v0}, Ll/ܽ֨֫;->ۧ()V

    .line 261
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܽ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 262
    new-instance p0, Ll/֨ᩴ֫;

    invoke-direct {p0}, Ll/֨ᩴ֫;-><init>()V

    .line 263
    invoke-virtual {p0, p1}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    .line 264
    invoke-virtual {p0, v2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 265
    invoke-virtual {p0, v4}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 266
    invoke-virtual {p0, v3}, Ll/֨ᩴ֫;->۠(I)V

    .line 267
    invoke-virtual {p0, p3}, Ll/֨ᩴ֫;->֫(Ll/᩵ᩴ֫;)V

    .line 268
    invoke-virtual {p0, p2}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    .line 269
    invoke-virtual {p0, v1}, Ll/֨ᩴ֫;->֡(I)V

    .line 270
    invoke-virtual {p0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p0

    return-object p0
.end method
