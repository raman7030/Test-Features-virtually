.class public final Ll/֡ۘۘ;
.super Ljava/lang/Object;
.source "17YO"


# static fields
.field public static final ֡:[I


# instance fields
.field public ֫:B

.field public final ۖ:Ll/᩵ۘۘ;

.field public ۘ:[I

.field public ۜ:I

.field public ۡ:I

.field public ۢ:I

.field public ۧ:I

.field public ܳ:B

.field public ܺ:I

.field public ܽ:[I

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:I

.field public final ᩵:Ll/ܶۘۘ;

.field public ᩷:[I

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x11

    new-array v0, v0, [I

    .line 35
    fill-array-data v0, :array_0

    sput-object v0, Ll/֡ۘۘ;->֡:[I

    return-void

    :array_0
    .array-data 4
        0x0
        0x1
        0x3
        0x7
        0xf
        0x1f
        0x3f
        0x7f
        0xff
        0x1ff
        0x3ff
        0x7ff
        0xfff
        0x1fff
        0x3fff
        0x7fff
        0xffff
    .end array-data
.end method

.method public constructor <init>(Ll/ܶۘۘ;Ll/᩵ۘۘ;)V
    .locals 1

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 69
    iput v0, p0, Ll/֡ۘۘ;->ᩴ:I

    .line 89
    iput-object p1, p0, Ll/֡ۘۘ;->᩵:Ll/ܶۘۘ;

    .line 90
    iput-object p2, p0, Ll/֡ۘۘ;->ۖ:Ll/᩵ۘۘ;

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 27

    move-object/from16 v0, p0

    .line 119
    iget-object v1, v0, Ll/֡ۘۘ;->᩵:Ll/ܶۘۘ;

    iget v2, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 120
    iget v3, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 121
    iget-object v4, v0, Ll/֡ۘۘ;->ۖ:Ll/᩵ۘۘ;

    iget v5, v4, Ll/᩵ۘۘ;->᩷:I

    iget v6, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 122
    iget v7, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 123
    iget v8, v4, Ll/᩵ۘۘ;->᩶:I

    .line 124
    iget v9, v4, Ll/᩵ۘۘ;->᩵:I

    if-ge v8, v9, :cond_0

    sub-int/2addr v9, v8

    add-int/lit8 v9, v9, -0x1

    goto :goto_0

    :cond_0
    sub-int v9, v5, v8

    :goto_0
    move v10, v9

    move v9, v8

    move v8, v7

    move v7, v6

    move v6, v3

    move v3, v2

    move/from16 v2, p1

    .line 128
    :goto_1
    iget v11, v0, Ll/֡ۘۘ;->ۡ:I

    const-string v12, "invalid literal/length code"

    const-string v13, "invalid distance code"

    sget-object v15, Ll/֡ۘۘ;->֡:[I

    const/4 v14, 0x0

    packed-switch v11, :pswitch_data_0

    move-object v11, v0

    move/from16 v17, v3

    move/from16 v16, v6

    move v6, v7

    .line 449
    iput v6, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 450
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    move/from16 v3, v16

    .line 451
    iput v3, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 452
    iget-wide v2, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v17, v0

    int-to-long v5, v0

    add-long/2addr v2, v5

    iput-wide v2, v1, Ll/᩶ۘۘ;->ۡ:J

    move/from16 v2, v17

    .line 453
    iput v2, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 454
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    const/4 v0, -0x2

    .line 455
    invoke-virtual {v4, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    .line 438
    :pswitch_0
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 439
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 440
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 441
    iget-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v2, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v2, v3, v2

    int-to-long v7, v2

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 442
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 443
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    const/4 v1, -0x3

    .line 444
    invoke-virtual {v4, v1}, Ll/᩵ۘۘ;->֫(I)I

    move-result v1

    return v1

    :pswitch_1
    const/4 v5, 0x7

    if-le v8, v5, :cond_1

    add-int/lit8 v8, v8, -0x8

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v3, v3, -0x1

    .line 410
    :cond_1
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 411
    invoke-virtual {v4, v2}, Ll/᩵ۘۘ;->֫(I)I

    move-result v2

    .line 412
    iget v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 413
    iget v5, v4, Ll/᩵ۘۘ;->᩵:I

    if-eq v5, v9, :cond_2

    .line 416
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 417
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 418
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 419
    iget-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v7, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v7, v3, v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 420
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 421
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 422
    invoke-virtual {v4, v2}, Ll/᩵ۘۘ;->֫(I)I

    move-result v1

    return v1

    :cond_2
    const/16 v2, 0x8

    .line 424
    iput v2, v0, Ll/֡ۘۘ;->ۡ:I

    .line 427
    :pswitch_2
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 428
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 429
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 430
    iget-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v2, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v2, v3, v2

    int-to-long v7, v2

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 431
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 432
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    const/4 v1, 0x1

    .line 433
    invoke-virtual {v4, v1}, Ll/᩵ۘۘ;->֫(I)I

    move-result v1

    return v1

    :pswitch_3
    if-nez v10, :cond_8

    if-ne v9, v5, :cond_4

    .line 371
    iget v11, v4, Ll/᩵ۘۘ;->᩵:I

    if-eqz v11, :cond_4

    if-lez v11, :cond_3

    add-int/lit8 v11, v11, -0x1

    move v10, v11

    goto :goto_2

    :cond_3
    move v10, v5

    :goto_2
    const/4 v9, 0x0

    :cond_4
    if-nez v10, :cond_8

    .line 376
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 377
    invoke-virtual {v4, v2}, Ll/᩵ۘۘ;->֫(I)I

    move-result v2

    .line 378
    iget v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 379
    iget v10, v4, Ll/᩵ۘۘ;->᩵:I

    if-ge v9, v10, :cond_5

    sub-int v11, v10, v9

    add-int/lit8 v11, v11, -0x1

    goto :goto_3

    :cond_5
    sub-int v11, v5, v9

    :goto_3
    if-ne v9, v5, :cond_7

    if-eqz v10, :cond_7

    if-lez v10, :cond_6

    add-int/lit8 v10, v10, -0x1

    goto :goto_4

    :cond_6
    move v10, v5

    :goto_4
    const/4 v9, 0x0

    goto :goto_5

    :cond_7
    move v10, v11

    :goto_5
    if-nez v10, :cond_8

    .line 386
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 387
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 388
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 389
    iget-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v7, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v7, v3, v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 390
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 391
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 392
    invoke-virtual {v4, v2}, Ll/᩵ۘۘ;->֫(I)I

    move-result v1

    return v1

    .line 398
    :cond_8
    iget-object v2, v4, Ll/᩵ۘۘ;->᩹:[B

    add-int/lit8 v11, v9, 0x1

    iget v12, v0, Ll/֡ۘۘ;->ۜ:I

    int-to-byte v12, v12

    aput-byte v12, v2, v9

    add-int/lit8 v10, v10, -0x1

    .line 401
    iput v14, v0, Ll/֡ۘۘ;->ۡ:I

    const/4 v2, 0x0

    move v9, v11

    :goto_6
    move-object v11, v0

    goto/16 :goto_29

    .line 299
    :pswitch_4
    iget v11, v0, Ll/֡ۘۘ;->ܿ:I

    :goto_7
    if-ge v8, v11, :cond_a

    if-eqz v6, :cond_9

    add-int/lit8 v6, v6, -0x1

    .line 315
    iget-object v2, v1, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v12, v3, 0x1

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/2addr v2, v8

    or-int/2addr v7, v2

    add-int/lit8 v8, v8, 0x8

    const/4 v2, 0x0

    move v3, v12

    goto :goto_7

    .line 306
    :cond_9
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 307
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 308
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 309
    iget-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v7, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v7, v3, v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 310
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 311
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 312
    invoke-virtual {v4, v2}, Ll/᩵ۘۘ;->֫(I)I

    move-result v1

    return v1

    .line 319
    :cond_a
    iget v12, v0, Ll/֡ۘۘ;->ۧ:I

    aget v13, v15, v11

    and-int/2addr v13, v7

    add-int/2addr v12, v13

    iput v12, v0, Ll/֡ۘۘ;->ۧ:I

    shr-int/2addr v7, v11

    sub-int/2addr v8, v11

    const/4 v11, 0x5

    .line 324
    iput v11, v0, Ll/֡ۘۘ;->ۡ:I

    .line 326
    :pswitch_5
    iget v11, v0, Ll/֡ۘۘ;->ۧ:I

    sub-int v11, v9, v11

    :goto_8
    if-gez v11, :cond_b

    add-int/2addr v11, v5

    goto :goto_8

    .line 330
    :cond_b
    :goto_9
    iget v12, v0, Ll/֡ۘۘ;->᩻:I

    if-eqz v12, :cond_13

    if-nez v10, :cond_11

    if-ne v9, v5, :cond_d

    .line 333
    iget v12, v4, Ll/᩵ۘۘ;->᩵:I

    if-eqz v12, :cond_d

    if-lez v12, :cond_c

    add-int/lit8 v12, v12, -0x1

    move v10, v12

    goto :goto_a

    :cond_c
    move v10, v5

    :goto_a
    const/4 v9, 0x0

    :cond_d
    if-nez v10, :cond_11

    .line 338
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 339
    invoke-virtual {v4, v2}, Ll/᩵ۘۘ;->֫(I)I

    move-result v2

    .line 340
    iget v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 341
    iget v10, v4, Ll/᩵ۘۘ;->᩵:I

    if-ge v9, v10, :cond_e

    sub-int v12, v10, v9

    add-int/lit8 v12, v12, -0x1

    goto :goto_b

    :cond_e
    sub-int v12, v5, v9

    :goto_b
    if-ne v9, v5, :cond_10

    if-eqz v10, :cond_10

    if-lez v10, :cond_f

    add-int/lit8 v10, v10, -0x1

    goto :goto_c

    :cond_f
    move v10, v5

    :goto_c
    const/4 v9, 0x0

    goto :goto_d

    :cond_10
    move v10, v12

    :goto_d
    if-nez v10, :cond_11

    .line 349
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 350
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 351
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 352
    iget-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v7, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v7, v3, v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 353
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 354
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 355
    invoke-virtual {v4, v2}, Ll/᩵ۘۘ;->֫(I)I

    move-result v1

    return v1

    .line 360
    :cond_11
    iget-object v12, v4, Ll/᩵ۘۘ;->᩹:[B

    add-int/lit8 v13, v9, 0x1

    add-int/lit8 v15, v11, 0x1

    aget-byte v11, v12, v11

    aput-byte v11, v12, v9

    add-int/lit8 v10, v10, -0x1

    if-ne v15, v5, :cond_12

    const/4 v9, 0x0

    const/4 v11, 0x0

    goto :goto_e

    :cond_12
    move v11, v15

    .line 365
    :goto_e
    iget v9, v0, Ll/֡ۘۘ;->᩻:I

    add-int/lit8 v9, v9, -0x1

    iput v9, v0, Ll/֡ۘۘ;->᩻:I

    move v9, v13

    goto :goto_9

    .line 367
    :cond_13
    iput v14, v0, Ll/֡ۘۘ;->ۡ:I

    goto/16 :goto_6

    .line 219
    :pswitch_6
    iget v11, v0, Ll/֡ۘۘ;->ܿ:I

    :goto_f
    if-ge v8, v11, :cond_15

    if-eqz v6, :cond_14

    add-int/lit8 v6, v6, -0x1

    .line 235
    iget-object v2, v1, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v12, v3, 0x1

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/2addr v2, v8

    or-int/2addr v7, v2

    add-int/lit8 v8, v8, 0x8

    const/4 v2, 0x0

    move v3, v12

    goto :goto_f

    .line 226
    :cond_14
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 227
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 228
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 229
    iget-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v7, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v7, v3, v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 230
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 231
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 232
    invoke-virtual {v4, v2}, Ll/᩵ۘۘ;->֫(I)I

    move-result v1

    return v1

    .line 239
    :cond_15
    iget v12, v0, Ll/֡ۘۘ;->᩻:I

    aget v14, v15, v11

    and-int/2addr v14, v7

    add-int/2addr v12, v14

    iput v12, v0, Ll/֡ۘۘ;->᩻:I

    shr-int/2addr v7, v11

    sub-int/2addr v8, v11

    .line 244
    iget-byte v11, v0, Ll/֡ۘۘ;->֫:B

    iput v11, v0, Ll/֡ۘۘ;->ܺ:I

    .line 245
    iget-object v11, v0, Ll/֡ۘۘ;->ܽ:[I

    iput-object v11, v0, Ll/֡ۘۘ;->ۘ:[I

    .line 246
    iget v11, v0, Ll/֡ۘۘ;->ᩳ:I

    iput v11, v0, Ll/֡ۘۘ;->ᩴ:I

    const/4 v11, 0x3

    .line 247
    iput v11, v0, Ll/֡ۘۘ;->ۡ:I

    .line 249
    :pswitch_7
    iget v11, v0, Ll/֡ۘۘ;->ܺ:I

    :goto_10
    if-ge v8, v11, :cond_17

    if-eqz v6, :cond_16

    add-int/lit8 v6, v6, -0x1

    .line 265
    iget-object v2, v1, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v12, v3, 0x1

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/2addr v2, v8

    or-int/2addr v7, v2

    add-int/lit8 v8, v8, 0x8

    const/4 v2, 0x0

    move v3, v12

    goto :goto_10

    .line 256
    :cond_16
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 257
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 258
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 259
    iget-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v7, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v7, v3, v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 260
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 261
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 262
    invoke-virtual {v4, v2}, Ll/᩵ۘۘ;->֫(I)I

    move-result v1

    return v1

    .line 269
    :cond_17
    iget v12, v0, Ll/֡ۘۘ;->ᩴ:I

    aget v11, v15, v11

    and-int/2addr v11, v7

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x3

    .line 271
    iget-object v11, v0, Ll/֡ۘۘ;->ۘ:[I

    add-int/lit8 v14, v12, 0x1

    aget v14, v11, v14

    shr-int/2addr v7, v14

    sub-int/2addr v8, v14

    .line 274
    aget v14, v11, v12

    and-int/lit8 v15, v14, 0x10

    if-eqz v15, :cond_18

    and-int/lit8 v13, v14, 0xf

    .line 276
    iput v13, v0, Ll/֡ۘۘ;->ܿ:I

    add-int/lit8 v12, v12, 0x2

    .line 277
    aget v11, v11, v12

    iput v11, v0, Ll/֡ۘۘ;->ۧ:I

    const/4 v11, 0x4

    .line 278
    iput v11, v0, Ll/֡ۘۘ;->ۡ:I

    goto/16 :goto_6

    :cond_18
    and-int/lit8 v15, v14, 0x40

    if-nez v15, :cond_19

    .line 282
    iput v14, v0, Ll/֡ۘۘ;->ܺ:I

    .line 283
    div-int/lit8 v13, v12, 0x3

    add-int/lit8 v12, v12, 0x2

    aget v11, v11, v12

    add-int/2addr v13, v11

    iput v13, v0, Ll/֡ۘۘ;->ᩴ:I

    goto/16 :goto_6

    :cond_19
    const/16 v2, 0x9

    .line 286
    iput v2, v0, Ll/֡ۘۘ;->ۡ:I

    .line 287
    iput-object v13, v1, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 290
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 291
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 292
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 293
    iget-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v2, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v2, v3, v2

    int-to-long v7, v2

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 294
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 295
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    const/4 v1, -0x3

    .line 296
    invoke-virtual {v4, v1}, Ll/᩵ۘۘ;->֫(I)I

    move-result v1

    return v1

    :pswitch_8
    move-object v11, v0

    move/from16 v16, v6

    move-object v6, v12

    goto/16 :goto_26

    :pswitch_9
    const/16 v11, 0x102

    if-lt v10, v11, :cond_36

    const/16 v11, 0xa

    if-lt v6, v11, :cond_36

    .line 133
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 134
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 135
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 136
    iget-wide v10, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v2, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v2, v3, v2

    move v14, v6

    move/from16 p1, v7

    int-to-long v6, v2

    add-long/2addr v10, v6

    iput-wide v10, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 137
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 138
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 139
    iget-byte v2, v0, Ll/֡ۘۘ;->ܳ:B

    iget-byte v6, v0, Ll/֡ۘۘ;->֫:B

    iget-object v7, v0, Ll/֡ۘۘ;->᩷:[I

    iget v10, v0, Ll/֡ۘۘ;->ۢ:I

    iget-object v11, v0, Ll/֡ۘۘ;->ܽ:[I

    move/from16 v16, v14

    iget v14, v0, Ll/֡ۘۘ;->ᩳ:I

    move/from16 v17, v3

    .line 495
    iget v3, v4, Ll/᩵ۘۘ;->᩵:I

    if-ge v9, v3, :cond_1a

    sub-int/2addr v3, v9

    add-int/lit8 v3, v3, -0x1

    goto :goto_11

    :cond_1a
    sub-int v3, v5, v9

    .line 498
    :goto_11
    aget v2, v15, v2

    .line 499
    aget v6, v15, v6

    move v0, v8

    move-object/from16 v18, v12

    move-object/from16 v19, v13

    move v8, v3

    move v12, v9

    move/from16 v3, v17

    move/from16 v9, p1

    :goto_12
    const/16 v13, 0x14

    if-ge v0, v13, :cond_1b

    add-int/lit8 v16, v16, -0x1

    .line 506
    iget-object v13, v1, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v17, v3, 0x1

    aget-byte v3, v13, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/2addr v3, v0

    or-int/2addr v9, v3

    add-int/lit8 v0, v0, 0x8

    move/from16 v3, v17

    goto :goto_12

    :cond_1b
    and-int v13, v9, v2

    add-int v17, v10, v13

    mul-int/lit8 v17, v17, 0x3

    .line 514
    aget v20, v7, v17

    if-nez v20, :cond_1c

    add-int/lit8 v13, v17, 0x1

    .line 515
    aget v13, v7, v13

    shr-int/2addr v9, v13

    sub-int/2addr v0, v13

    .line 518
    iget-object v13, v4, Ll/᩵ۘۘ;->᩹:[B

    add-int/lit8 v20, v12, 0x1

    add-int/lit8 v17, v17, 0x2

    move/from16 p1, v0

    aget v0, v7, v17

    int-to-byte v0, v0

    aput-byte v0, v13, v12

    move/from16 v0, p1

    move/from16 v21, v2

    move-object/from16 v2, v19

    goto/16 :goto_1d

    :cond_1c
    :goto_13
    add-int/lit8 v21, v17, 0x1

    .line 524
    aget v21, v7, v21

    shr-int v9, v9, v21

    sub-int v0, v0, v21

    and-int/lit8 v21, v20, 0x10

    if-eqz v21, :cond_2a

    and-int/lit8 v13, v20, 0xf

    add-int/lit8 v17, v17, 0x2

    .line 529
    aget v17, v7, v17

    aget v20, v15, v13

    and-int v20, v9, v20

    move/from16 v21, v2

    add-int v2, v17, v20

    shr-int/2addr v9, v13

    sub-int/2addr v0, v13

    :goto_14
    const/16 v13, 0xf

    if-ge v0, v13, :cond_1d

    add-int/lit8 v16, v16, -0x1

    .line 537
    iget-object v13, v1, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v17, v3, 0x1

    aget-byte v3, v13, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/2addr v3, v0

    or-int/2addr v9, v3

    add-int/lit8 v0, v0, 0x8

    move/from16 v3, v17

    goto :goto_14

    :cond_1d
    and-int v13, v9, v6

    add-int v17, v14, v13

    mul-int/lit8 v17, v17, 0x3

    .line 545
    aget v20, v11, v17

    :goto_15
    add-int/lit8 v22, v17, 0x1

    .line 549
    aget v22, v11, v22

    shr-int v9, v9, v22

    sub-int v0, v0, v22

    and-int/lit8 v22, v20, 0x10

    if-eqz v22, :cond_27

    and-int/lit8 v13, v20, 0xf

    move/from16 v22, v3

    move/from16 v23, v16

    :goto_16
    if-ge v0, v13, :cond_1e

    add-int/lit8 v23, v23, -0x1

    .line 557
    iget-object v3, v1, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v16, v22, 0x1

    aget-byte v3, v3, v22

    and-int/lit16 v3, v3, 0xff

    shl-int/2addr v3, v0

    or-int/2addr v9, v3

    add-int/lit8 v0, v0, 0x8

    move/from16 v22, v16

    goto :goto_16

    :cond_1e
    add-int/lit8 v17, v17, 0x2

    .line 561
    aget v3, v11, v17

    aget v16, v15, v13

    and-int v16, v9, v16

    add-int v3, v3, v16

    shr-int v24, v9, v13

    sub-int v25, v0, v13

    sub-int v26, v8, v2

    if-lt v12, v3, :cond_20

    sub-int v0, v12, v3

    sub-int v3, v12, v0

    if-lez v3, :cond_1f

    const/4 v8, 0x2

    if-le v8, v3, :cond_1f

    .line 572
    iget-object v3, v4, Ll/᩵ۘۘ;->᩹:[B

    add-int/lit8 v8, v12, 0x1

    add-int/lit8 v9, v0, 0x1

    aget-byte v13, v3, v0

    aput-byte v13, v3, v12

    add-int/lit8 v12, v12, 0x2

    add-int/lit8 v0, v0, 0x2

    .line 573
    aget-byte v9, v3, v9

    aput-byte v9, v3, v8

    goto :goto_17

    .line 576
    :cond_1f
    iget-object v3, v4, Ll/᩵ۘۘ;->᩹:[B

    const/4 v8, 0x2

    invoke-static {v3, v0, v3, v12, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v12, v12, 0x2

    add-int/lit8 v0, v0, 0x2

    :goto_17
    add-int/lit8 v2, v2, -0x2

    goto :goto_1a

    :cond_20
    sub-int v0, v12, v3

    :cond_21
    add-int/2addr v0, v5

    if-ltz v0, :cond_21

    sub-int v3, v5, v0

    if-le v2, v3, :cond_24

    sub-int/2addr v2, v3

    sub-int v8, v12, v0

    if-lez v8, :cond_23

    if-le v3, v8, :cond_23

    .line 591
    :goto_18
    iget-object v8, v4, Ll/᩵ۘۘ;->᩹:[B

    add-int/lit8 v9, v12, 0x1

    add-int/lit8 v13, v0, 0x1

    aget-byte v0, v8, v0

    aput-byte v0, v8, v12

    add-int/lit8 v3, v3, -0x1

    move v12, v9

    if-nez v3, :cond_22

    goto :goto_19

    :cond_22
    move v0, v13

    goto :goto_18

    .line 594
    :cond_23
    iget-object v8, v4, Ll/᩵ۘۘ;->᩹:[B

    invoke-static {v8, v0, v8, v12, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v12, v3

    :goto_19
    const/4 v0, 0x0

    :cond_24
    :goto_1a
    sub-int v3, v12, v0

    if-lez v3, :cond_26

    if-le v2, v3, :cond_26

    .line 606
    :goto_1b
    iget-object v3, v4, Ll/᩵ۘۘ;->᩹:[B

    add-int/lit8 v8, v12, 0x1

    add-int/lit8 v9, v0, 0x1

    aget-byte v0, v3, v0

    aput-byte v0, v3, v12

    add-int/lit8 v2, v2, -0x1

    if-nez v2, :cond_25

    goto :goto_1c

    :cond_25
    move v12, v8

    move v0, v9

    goto :goto_1b

    .line 609
    :cond_26
    iget-object v3, v4, Ll/᩵ۘۘ;->᩹:[B

    invoke-static {v3, v0, v3, v12, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int v8, v12, v2

    :goto_1c
    move v12, v8

    move/from16 v3, v22

    move/from16 v13, v23

    move/from16 v9, v24

    move/from16 v0, v25

    move/from16 v8, v26

    goto/16 :goto_1e

    :cond_27
    and-int/lit8 v22, v20, 0x40

    if-nez v22, :cond_28

    add-int/lit8 v17, v17, 0x2

    .line 616
    aget v17, v11, v17

    add-int v13, v13, v17

    .line 617
    aget v17, v15, v20

    and-int v17, v9, v17

    add-int v13, v13, v17

    add-int v17, v14, v13

    mul-int/lit8 v17, v17, 0x3

    .line 619
    aget v20, v11, v17

    goto/16 :goto_15

    :cond_28
    move-object/from16 v13, v19

    .line 621
    iput-object v13, v1, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 623
    iget v2, v1, Ll/᩶ۘۘ;->ۧ:I

    sub-int v2, v2, v16

    shr-int/lit8 v6, v0, 0x3

    if-ge v6, v2, :cond_29

    move v2, v6

    :cond_29
    add-int v6, v16, v2

    sub-int/2addr v3, v2

    shl-int/lit8 v2, v2, 0x3

    sub-int/2addr v0, v2

    .line 629
    iput v9, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 630
    iput v0, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 631
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 632
    iget-wide v6, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v8, v0

    add-long/2addr v6, v8

    iput-wide v6, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 633
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 634
    iput v12, v4, Ll/᩵ۘۘ;->᩶:I

    move-object/from16 v6, v18

    goto/16 :goto_21

    :cond_2a
    move/from16 v21, v2

    move-object/from16 v2, v19

    and-int/lit8 v19, v20, 0x40

    if-nez v19, :cond_2f

    add-int/lit8 v17, v17, 0x2

    .line 643
    aget v17, v7, v17

    add-int v13, v13, v17

    .line 644
    aget v17, v15, v20

    and-int v17, v9, v17

    add-int v13, v13, v17

    add-int v17, v10, v13

    mul-int/lit8 v17, v17, 0x3

    .line 646
    aget v20, v7, v17

    if-nez v20, :cond_2e

    add-int/lit8 v13, v17, 0x1

    .line 648
    aget v13, v7, v13

    shr-int/2addr v9, v13

    sub-int/2addr v0, v13

    .line 651
    iget-object v13, v4, Ll/᩵ۘۘ;->᩹:[B

    add-int/lit8 v20, v12, 0x1

    add-int/lit8 v17, v17, 0x2

    move/from16 p1, v0

    aget v0, v7, v17

    int-to-byte v0, v0

    aput-byte v0, v13, v12

    move/from16 v0, p1

    :goto_1d
    add-int/lit8 v8, v8, -0x1

    move-object/from16 v19, v2

    move/from16 v13, v16

    move/from16 v12, v20

    :goto_1e
    const/16 v2, 0x102

    if-lt v8, v2, :cond_2c

    const/16 v2, 0xa

    if-ge v13, v2, :cond_2b

    goto :goto_1f

    :cond_2b
    move/from16 v16, v13

    move/from16 v2, v21

    goto/16 :goto_12

    .line 693
    :cond_2c
    :goto_1f
    iget v2, v1, Ll/᩶ۘۘ;->ۧ:I

    sub-int/2addr v2, v13

    shr-int/lit8 v6, v0, 0x3

    if-ge v6, v2, :cond_2d

    move v2, v6

    :cond_2d
    add-int/2addr v13, v2

    sub-int/2addr v3, v2

    shl-int/lit8 v2, v2, 0x3

    sub-int/2addr v0, v2

    .line 699
    iput v9, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 700
    iput v0, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 701
    iput v13, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 702
    iget-wide v6, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v8, v0

    add-long/2addr v6, v8

    iput-wide v6, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 703
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 704
    iput v12, v4, Ll/᩵ۘۘ;->᩶:I

    const/4 v0, 0x0

    goto :goto_20

    :cond_2e
    move-object/from16 v19, v2

    move/from16 v2, v21

    goto/16 :goto_13

    :cond_2f
    and-int/lit8 v2, v20, 0x20

    if-eqz v2, :cond_31

    .line 657
    iget v2, v1, Ll/᩶ۘۘ;->ۧ:I

    sub-int v2, v2, v16

    shr-int/lit8 v6, v0, 0x3

    if-ge v6, v2, :cond_30

    move v2, v6

    :cond_30
    add-int v6, v16, v2

    sub-int/2addr v3, v2

    shl-int/lit8 v2, v2, 0x3

    sub-int/2addr v0, v2

    .line 663
    iput v9, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 664
    iput v0, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 665
    iput v6, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 666
    iget-wide v6, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v8, v0

    add-long/2addr v6, v8

    iput-wide v6, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 667
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 668
    iput v12, v4, Ll/᩵ۘۘ;->᩶:I

    const/4 v0, 0x1

    :goto_20
    move-object/from16 v6, v18

    goto :goto_22

    :cond_31
    move-object/from16 v6, v18

    .line 672
    iput-object v6, v1, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 674
    iget v2, v1, Ll/᩶ۘۘ;->ۧ:I

    sub-int v2, v2, v16

    shr-int/lit8 v7, v0, 0x3

    if-ge v7, v2, :cond_32

    move v2, v7

    :cond_32
    add-int v7, v16, v2

    sub-int/2addr v3, v2

    shl-int/lit8 v2, v2, 0x3

    sub-int/2addr v0, v2

    .line 680
    iput v9, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 681
    iput v0, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 682
    iput v7, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 683
    iget-wide v7, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v9, v0

    add-long/2addr v7, v9

    iput-wide v7, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 684
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 685
    iput v12, v4, Ll/᩵ۘۘ;->᩶:I

    :goto_21
    const/4 v0, -0x3

    .line 141
    :goto_22
    iget v2, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 142
    iget v3, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 143
    iget v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 144
    iget v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 145
    iget v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 146
    iget v10, v4, Ll/᩵ۘۘ;->᩵:I

    if-ge v9, v10, :cond_33

    sub-int/2addr v10, v9

    const/4 v11, 0x1

    sub-int/2addr v10, v11

    goto :goto_23

    :cond_33
    const/4 v11, 0x1

    sub-int v10, v5, v9

    :goto_23
    if-eqz v0, :cond_35

    if-ne v0, v11, :cond_34

    const/4 v6, 0x7

    goto :goto_24

    :cond_34
    const/16 v6, 0x9

    :goto_24
    move-object/from16 v11, p0

    .line 149
    iput v6, v11, Ll/֡ۘۘ;->ۡ:I

    move v6, v3

    move v3, v2

    move v2, v0

    goto/16 :goto_29

    :cond_35
    move-object/from16 v11, p0

    move/from16 v16, v3

    move v3, v2

    move v2, v0

    goto :goto_25

    :cond_36
    move-object v11, v0

    move/from16 v17, v3

    move/from16 v16, v6

    move/from16 p1, v7

    move-object v6, v12

    move/from16 v7, p1

    move/from16 v3, v17

    .line 153
    :goto_25
    iget-byte v0, v11, Ll/֡ۘۘ;->ܳ:B

    iput v0, v11, Ll/֡ۘۘ;->ܺ:I

    .line 154
    iget-object v0, v11, Ll/֡ۘۘ;->᩷:[I

    iput-object v0, v11, Ll/֡ۘۘ;->ۘ:[I

    .line 155
    iget v0, v11, Ll/֡ۘۘ;->ۢ:I

    iput v0, v11, Ll/֡ۘۘ;->ᩴ:I

    const/4 v0, 0x1

    .line 157
    iput v0, v11, Ll/֡ۘۘ;->ۡ:I

    .line 159
    :goto_26
    iget v0, v11, Ll/֡ۘۘ;->ܺ:I

    move/from16 v12, v16

    :goto_27
    if-ge v8, v0, :cond_38

    if-eqz v12, :cond_37

    add-int/lit8 v12, v12, -0x1

    .line 175
    iget-object v2, v1, Ll/᩶ۘۘ;->᩻:[B

    add-int/lit8 v13, v3, 0x1

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/2addr v2, v8

    or-int/2addr v7, v2

    add-int/lit8 v8, v8, 0x8

    const/4 v2, 0x0

    move v3, v13

    goto :goto_27

    .line 166
    :cond_37
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 167
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 168
    iput v12, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 169
    iget-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v7, v0

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 170
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 171
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    .line 172
    invoke-virtual {v4, v2}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    .line 179
    :cond_38
    iget v13, v11, Ll/֡ۘۘ;->ᩴ:I

    aget v0, v15, v0

    and-int/2addr v0, v7

    add-int/2addr v13, v0

    mul-int/lit8 v13, v13, 0x3

    .line 181
    iget-object v0, v11, Ll/֡ۘۘ;->ۘ:[I

    add-int/lit8 v14, v13, 0x1

    aget v14, v0, v14

    ushr-int/2addr v7, v14

    sub-int/2addr v8, v14

    .line 184
    aget v14, v0, v13

    if-nez v14, :cond_39

    add-int/lit8 v13, v13, 0x2

    .line 187
    aget v0, v0, v13

    iput v0, v11, Ll/֡ۘۘ;->ۜ:I

    const/4 v0, 0x6

    .line 188
    iput v0, v11, Ll/֡ۘۘ;->ۡ:I

    goto :goto_28

    :cond_39
    and-int/lit8 v15, v14, 0x10

    if-eqz v15, :cond_3a

    and-int/lit8 v6, v14, 0xf

    .line 192
    iput v6, v11, Ll/֡ۘۘ;->ܿ:I

    add-int/lit8 v13, v13, 0x2

    .line 193
    aget v0, v0, v13

    iput v0, v11, Ll/֡ۘۘ;->᩻:I

    const/4 v0, 0x2

    .line 194
    iput v0, v11, Ll/֡ۘۘ;->ۡ:I

    goto :goto_28

    :cond_3a
    and-int/lit8 v15, v14, 0x40

    if-nez v15, :cond_3b

    .line 198
    iput v14, v11, Ll/֡ۘۘ;->ܺ:I

    .line 199
    div-int/lit8 v6, v13, 0x3

    add-int/lit8 v13, v13, 0x2

    aget v0, v0, v13

    add-int/2addr v6, v0

    iput v6, v11, Ll/֡ۘۘ;->ᩴ:I

    goto :goto_28

    :cond_3b
    and-int/lit8 v0, v14, 0x20

    if-eqz v0, :cond_3c

    const/4 v0, 0x7

    .line 203
    iput v0, v11, Ll/֡ۘۘ;->ۡ:I

    :goto_28
    move v6, v12

    :goto_29
    move-object v0, v11

    goto/16 :goto_1

    :cond_3c
    const/16 v0, 0x9

    .line 206
    iput v0, v11, Ll/֡ۘۘ;->ۡ:I

    .line 207
    iput-object v6, v1, Ll/᩶ۘۘ;->ܳ:Ljava/lang/String;

    .line 210
    iput v7, v4, Ll/᩵ۘۘ;->ܽ:I

    .line 211
    iput v8, v4, Ll/᩵ۘۘ;->ᩳ:I

    .line 212
    iput v12, v1, Ll/᩶ۘۘ;->ۧ:I

    .line 213
    iget-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    iget v0, v1, Ll/᩶ۘۘ;->ۜ:I

    sub-int v0, v3, v0

    int-to-long v7, v0

    add-long/2addr v5, v7

    iput-wide v5, v1, Ll/᩶ۘۘ;->ۡ:J

    .line 214
    iput v3, v1, Ll/᩶ۘۘ;->ۜ:I

    .line 215
    iput v9, v4, Ll/᩵ۘۘ;->᩶:I

    const/4 v0, -0x3

    .line 216
    invoke-virtual {v4, v0}, Ll/᩵ۘۘ;->֫(I)I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_6
        :pswitch_7
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
