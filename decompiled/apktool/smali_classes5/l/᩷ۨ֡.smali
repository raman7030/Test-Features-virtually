.class public final Ll/᩷ۨ֡;
.super Ljava/lang/Object;
.source "36B9"

# interfaces
.implements Ll/᩵֫ۚ;


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/۬ۛ֡;

.field public volatile ܽ:Ljava/util/BitSet;

.field public ܿ:I

.field public final ᩳ:Ll/ܽۨ֡;


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;Ll/ܽۨ֡;I)V
    .locals 1

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 82
    iput v0, p0, Ll/᩷ۨ֡;->ܿ:I

    .line 77
    iput-object p1, p0, Ll/᩷ۨ֡;->ۧ:Ll/۬ۛ֡;

    .line 78
    iput-object p2, p0, Ll/᩷ۨ֡;->ᩳ:Ll/ܽۨ֡;

    .line 79
    iput p3, p0, Ll/᩷ۨ֡;->֫:I

    return-void
.end method

.method public static ֫(Ll/۠ۗ֡;Ll/ᩴۨ֡;IILl/ܺۢᩴ;Ljava/util/BitSet;Ljava/util/BitSet;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p6

    .line 237
    :goto_0
    invoke-virtual/range {p4 .. p4}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_16

    .line 238
    invoke-virtual/range {p4 .. p4}, Ll/ۤܿᩴ;->ܿ()I

    move-result v4

    int-to-long v5, v4

    .line 239
    invoke-static {v5, v6}, Ll/᩷ۨ֡;->֫(J)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    mul-int/lit8 v5, v4, 0x2

    add-int v5, v5, p2

    .line 244
    invoke-virtual {v3, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 248
    :cond_1
    invoke-virtual {v1, v5}, Ll/ᩴۨ֡;->᩷(I)V

    .line 251
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v4

    move/from16 v5, p3

    if-lt v4, v5, :cond_3

    :cond_2
    :goto_2
    move-object/from16 v9, p5

    goto :goto_0

    .line 343
    :cond_3
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܿ()I

    move-result v4

    if-nez v4, :cond_4

    .line 345
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܳ()I

    move-result v4

    .line 347
    :cond_4
    invoke-virtual {v0, v4}, Ll/۠ۗ֡;->֫(I)Ll/֨ۗ֡;

    move-result-object v4

    if-nez v4, :cond_5

    goto :goto_2

    .line 262
    :cond_5
    sget-object v6, Ll/ۜۨ֡;->֫:[I

    iget-object v7, v4, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    const/4 v7, 0x0

    const/4 v8, 0x2

    packed-switch v6, :pswitch_data_0

    const/4 v6, 0x0

    goto :goto_3

    .line 265
    :pswitch_0
    invoke-virtual {v1, v8}, Ll/ᩴۨ֡;->ۧ(I)I

    move-result v6

    goto :goto_3

    .line 264
    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ᩳ()I

    move-result v6

    goto :goto_3

    .line 263
    :pswitch_2
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܽ()I

    move-result v6

    :goto_3
    if-eqz v6, :cond_6

    .line 269
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v9

    sub-int v9, v9, p2

    div-int/2addr v9, v8

    int-to-long v9, v9

    int-to-long v11, v6

    add-long/2addr v9, v11

    .line 272
    invoke-static {v2, v3, v9, v10}, Ll/᩷ۨ֡;->֫(Ll/ܺۢᩴ;Ljava/util/BitSet;J)V

    .line 276
    :cond_6
    sget-object v9, Ll/ۜۨ֡;->ۧ:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v9, v9, v10

    const/16 v10, 0x8

    const/4 v11, 0x1

    const/4 v12, 0x4

    if-eq v9, v11, :cond_11

    if-eq v9, v8, :cond_d

    const/4 v10, 0x3

    if-eq v9, v10, :cond_9

    if-eq v9, v12, :cond_8

    const/4 v6, 0x5

    if-eq v9, v6, :cond_7

    .line 336
    iget-object v6, v4, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    iget v6, v6, Ll/ۘۗ֡;->᩹:I

    div-int/2addr v6, v8

    goto/16 :goto_7

    .line 333
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->᩻()I

    move-result v6

    mul-int/lit8 v6, v6, 0x4

    add-int/2addr v6, v8

    goto/16 :goto_7

    .line 329
    :cond_8
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->᩻()I

    move-result v6

    mul-int/lit8 v6, v6, 0x2

    goto/16 :goto_6

    .line 310
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v9

    .line 311
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v10

    sub-int v10, v10, p2

    div-int/2addr v10, v8

    int-to-long v10, v10

    int-to-long v13, v6

    add-long/2addr v13, v10

    .line 313
    invoke-static {v13, v14}, Ll/᩷ۨ֡;->֫(J)Z

    move-result v6

    if-eqz v6, :cond_c

    long-to-int v6, v13

    mul-int/lit8 v6, v6, 0x2

    add-int v6, v6, p2

    .line 314
    invoke-virtual {v1, v6}, Ll/ᩴۨ֡;->᩷(I)V

    .line 343
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܿ()I

    move-result v6

    if-nez v6, :cond_a

    .line 345
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܳ()I

    move-result v6

    .line 347
    :cond_a
    invoke-virtual {v0, v6}, Ll/۠ۗ֡;->֫(I)Ll/֨ۗ֡;

    move-result-object v6

    .line 315
    sget-object v13, Ll/֨ۗ֡;->۟᩻:Ll/֨ۗ֡;

    if-ne v6, v13, :cond_b

    .line 316
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->᩻()I

    move-result v6

    mul-int/lit8 v13, v6, 0x4

    add-int/2addr v13, v12

    :goto_4
    if-ge v7, v6, :cond_b

    mul-int/lit8 v12, v7, 0x4

    add-int/2addr v12, v13

    .line 319
    invoke-virtual {v1, v12}, Ll/ᩴۨ֡;->ۧ(I)I

    move-result v12

    int-to-long v14, v12

    add-long/2addr v14, v10

    .line 320
    invoke-static {v2, v3, v14, v15}, Ll/᩷ۨ֡;->֫(Ll/ܺۢᩴ;Ljava/util/BitSet;J)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 324
    :cond_b
    invoke-virtual {v1, v9}, Ll/ᩴۨ֡;->᩷(I)V

    .line 326
    :cond_c
    iget-object v6, v4, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    iget v6, v6, Ll/ۘۗ֡;->᩹:I

    div-int/2addr v6, v8

    goto/16 :goto_7

    .line 292
    :cond_d
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v9

    .line 293
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v11

    sub-int v11, v11, p2

    div-int/2addr v11, v8

    int-to-long v11, v11

    int-to-long v13, v6

    add-long/2addr v13, v11

    .line 295
    invoke-static {v13, v14}, Ll/᩷ۨ֡;->֫(J)Z

    move-result v6

    if-eqz v6, :cond_10

    long-to-int v6, v13

    mul-int/lit8 v6, v6, 0x2

    add-int v6, v6, p2

    .line 296
    invoke-virtual {v1, v6}, Ll/ᩴۨ֡;->᩷(I)V

    .line 343
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܿ()I

    move-result v6

    if-nez v6, :cond_e

    .line 345
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ܳ()I

    move-result v6

    .line 347
    :cond_e
    invoke-virtual {v0, v6}, Ll/۠ۗ֡;->֫(I)Ll/֨ۗ֡;

    move-result-object v6

    .line 297
    sget-object v13, Ll/֨ۗ֡;->᩶ܳ:Ll/֨ۗ֡;

    if-ne v6, v13, :cond_f

    .line 298
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->᩻()I

    move-result v6

    :goto_5
    if-ge v7, v6, :cond_f

    mul-int/lit8 v13, v7, 0x4

    add-int/2addr v13, v10

    .line 300
    invoke-virtual {v1, v13}, Ll/ᩴۨ֡;->ۧ(I)I

    move-result v13

    int-to-long v13, v13

    add-long/2addr v13, v11

    .line 301
    invoke-static {v2, v3, v13, v14}, Ll/᩷ۨ֡;->֫(Ll/ܺۢᩴ;Ljava/util/BitSet;J)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 305
    :cond_f
    invoke-virtual {v1, v9}, Ll/ᩴۨ֡;->᩷(I)V

    .line 307
    :cond_10
    iget-object v6, v4, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    iget v6, v6, Ll/ۘۗ֡;->᩹:I

    div-int/2addr v6, v8

    goto :goto_7

    .line 278
    :cond_11
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->᩻()I

    move-result v6

    .line 279
    invoke-virtual {v1, v12}, Ll/ᩴۨ֡;->ۧ(I)I

    move-result v7

    if-ltz v7, :cond_2

    if-eq v6, v11, :cond_12

    if-eq v6, v8, :cond_12

    if-eq v6, v12, :cond_12

    if-eq v6, v10, :cond_12

    goto/16 :goto_2

    :cond_12
    int-to-long v9, v6

    int-to-long v13, v7

    mul-long v9, v9, v13

    const-wide/32 v13, 0x7fffffff

    cmp-long v15, v9, v13

    if-lez v15, :cond_13

    goto/16 :goto_2

    :cond_13
    mul-int v6, v6, v7

    add-int/2addr v6, v11

    .line 289
    div-int/2addr v6, v8

    :goto_6
    add-int/2addr v6, v12

    .line 338
    :goto_7
    invoke-virtual/range {p1 .. p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v7

    sub-int v7, v7, p2

    div-int/2addr v7, v8

    add-int v8, v7, v6

    int-to-long v9, v7

    .line 340
    invoke-static {v9, v10}, Ll/᩷ۨ֡;->֫(J)Z

    move-result v9

    if-eqz v9, :cond_2

    if-ge v8, v7, :cond_14

    goto/16 :goto_2

    :cond_14
    move-object/from16 v9, p5

    .line 343
    invoke-virtual {v9, v7}, Ljava/util/BitSet;->set(I)V

    .line 344
    invoke-virtual {v3, v7, v8}, Ljava/util/BitSet;->set(II)V

    .line 348
    invoke-virtual {v4}, Ll/֨ۗ֡;->֫()Z

    move-result v4

    if-nez v4, :cond_15

    goto/16 :goto_0

    :cond_15
    mul-int/lit8 v6, v6, 0x2

    .line 353
    invoke-virtual {v1, v6}, Ll/ᩴۨ֡;->֫(I)V

    goto/16 :goto_1

    :cond_16
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ܺۢᩴ;Ljava/util/BitSet;J)V
    .locals 1

    .line 370
    invoke-static {p2, p3}, Ll/᩷ۨ֡;->֫(J)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    long-to-int p3, p2

    .line 374
    invoke-virtual {p1, p3}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    if-nez p1, :cond_1

    .line 454
    invoke-virtual {p0, p3}, Ll/ܺۢᩴ;->add(I)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(J)Z
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_0

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic ֫(Ljava/util/BitSet;Ll/۠֫ۚ;)Z
    .locals 3

    .line 454
    invoke-interface {p1}, Ll/۠֫ۚ;->ܽ()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    .line 455
    invoke-interface {p1}, Ll/۠֫ۚ;->ᩳ()I

    move-result v0

    int-to-long v1, v0

    .line 457
    invoke-static {v1, v2}, Ll/᩷ۨ֡;->֫(J)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/util/BitSet;->get(I)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 460
    :cond_0
    instance-of p0, p1, Ll/ۚ۟֡;

    if-eqz p0, :cond_1

    .line 461
    check-cast p1, Ll/ۚ۟֡;

    invoke-virtual {p1}, Ll/ۚ۟֡;->ܿ()V

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ܽ()Ll/᩷۟֡;
    .locals 7

    .line 428
    iget-object v0, p0, Ll/᩷ۨ֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/᩷ۨ֡;->֫:I

    add-int/lit8 v2, v2, 0x8

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۧ(I)I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_3

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    .line 438
    iget-object v4, p0, Ll/᩷ۨ֡;->ᩳ:Ll/ܽۨ֡;

    const-string v5, "%s: Invalid debug offset%n"

    if-gez v1, :cond_1

    .line 439
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-virtual {v1, v5, v2}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 440
    invoke-static {v0, v3, p0}, Ll/᩷۟֡;->֫(Ll/۬ۛ֡;ILl/᩷ۨ֡;)Ll/᩷۟֡;

    move-result-object v0

    return-object v0

    .line 442
    :cond_1
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۘۨ֡;->length()I

    move-result v6

    if-lt v1, v6, :cond_2

    .line 443
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-virtual {v1, v5, v2}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 444
    invoke-static {v0, v3, p0}, Ll/᩷۟֡;->֫(Ll/۬ۛ֡;ILl/᩷ۨ֡;)Ll/᩷۟֡;

    move-result-object v0

    return-object v0

    .line 446
    :cond_2
    invoke-static {v0, v1, p0}, Ll/᩷۟֡;->֫(Ll/۬ۛ֡;ILl/᩷ۨ֡;)Ll/᩷۟֡;

    move-result-object v0

    return-object v0

    .line 436
    :cond_3
    :goto_0
    invoke-static {v0, v3, p0}, Ll/᩷۟֡;->֫(Ll/۬ۛ֡;ILl/᩷ۨ֡;)Ll/᩷۟֡;

    move-result-object v0

    return-object v0
.end method

.method private ܿ()V
    .locals 15

    .line 98
    iget v0, p0, Ll/᩷ۨ֡;->֫:I

    add-int/lit8 v0, v0, 0x10

    .line 188
    invoke-virtual {p0}, Ll/᩷ۨ֡;->֫()I

    move-result v1

    .line 189
    new-instance v8, Ljava/util/BitSet;

    invoke-direct {v8}, Ljava/util/BitSet;-><init>()V

    if-lez v1, :cond_4

    mul-int/lit8 v1, v1, 0x2

    add-int v9, v1, v0

    .line 192
    iget-object v1, p0, Ll/᩷ۨ֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v10

    .line 194
    :try_start_0
    iget-object v1, p0, Ll/᩷ۨ֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->֫()Ll/۠ۗ֡;

    move-result-object v11

    .line 196
    new-instance v12, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ll/᩷ۨ֡;->ۜ()Ljava/util/List;

    move-result-object v1

    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 197
    new-instance v13, Ll/ܺۢᩴ;

    invoke-direct {v13}, Ll/ܺۢᩴ;-><init>()V

    .line 198
    new-instance v14, Ljava/util/BitSet;

    invoke-direct {v14}, Ljava/util/BitSet;-><init>()V

    const/4 v1, 0x0

    .line 454
    invoke-virtual {v13, v1}, Ll/ܺۢᩴ;->add(I)Z

    .line 200
    :cond_0
    invoke-virtual {v13}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    move-object v1, v11

    move-object v2, v10

    move v3, v0

    move v4, v9

    move-object v5, v13

    move-object v6, v8

    move-object v7, v14

    .line 201
    invoke-static/range {v1 .. v7}, Ll/᩷ۨ֡;->֫(Ll/۠ۗ֡;Ll/ᩴۨ֡;IILl/ܺۢᩴ;Ljava/util/BitSet;Ljava/util/BitSet;)V

    .line 203
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 206
    :cond_1
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 207
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 208
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۨ֡;

    .line 209
    invoke-virtual {v2}, Ll/ܺۨ֡;->֫()I

    move-result v3

    int-to-long v4, v3

    .line 210
    invoke-static {v4, v5}, Ll/᩷ۨ֡;->֫(J)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v14, v3}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 212
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 213
    invoke-virtual {v2}, Ll/ܺۨ֡;->ۧ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ۛ֡;

    .line 214
    invoke-interface {v3}, Ll/ۖ֫ۚ;->۟()I

    move-result v3

    int-to-long v3, v3

    .line 216
    invoke-static {v13, v14, v3, v4}, Ll/᩷ۨ֡;->֫(Ll/ܺۢᩴ;Ljava/util/BitSet;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 225
    :cond_3
    :goto_1
    invoke-virtual {v10}, Ll/ᩴۨ֡;->ۘ()V

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-virtual {v10}, Ll/ᩴۨ֡;->ۘ()V

    .line 226
    throw v0

    .line 228
    :cond_4
    :goto_2
    iput-object v8, p0, Ll/᩷ۨ֡;->ܽ:Ljava/util/BitSet;

    return-void
.end method

.method private ᩳ()Ljava/util/BitSet;
    .locals 2

    .line 381
    iget-object v1, p0, Ll/᩷ۨ֡;->ܽ:Ljava/util/BitSet;

    if-nez v1, :cond_1

    move-object v0, p0

    .line 383
    monitor-enter v0

    .line 384
    :try_start_0
    iget-object v1, p0, Ll/᩷ۨ֡;->ܽ:Ljava/util/BitSet;

    if-nez v1, :cond_0

    .line 386
    invoke-direct {p0}, Ll/᩷ۨ֡;->ܿ()V

    .line 387
    iget-object v1, p0, Ll/᩷ۨ֡;->ܽ:Ljava/util/BitSet;

    .line 390
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 94
    iget-object v0, p0, Ll/᩷ۨ֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/᩷ۨ֡;->֫:I

    add-int/lit8 v1, v1, 0xc

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    return v0
.end method

.method public final ۜ()Ljava/util/List;
    .locals 5

    .line 396
    iget-object v0, p0, Ll/᩷ۨ֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/᩷ۨ֡;->֫:I

    add-int/lit8 v2, v1, 0x6

    invoke-virtual {v0, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v0

    if-lez v0, :cond_0

    .line 404
    invoke-virtual {p0}, Ll/᩷ۨ֡;->֫()I

    move-result v2

    add-int/lit8 v1, v1, 0x10

    const/4 v3, 0x2

    const/4 v4, 0x3

    .line 36
    invoke-static {v2, v3, v1, v4}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v1

    and-int/lit8 v1, v1, -0x4

    mul-int/lit8 v2, v0, 0x8

    add-int/2addr v2, v1

    .line 409
    new-instance v3, Ll/᩻ۨ֡;

    invoke-direct {v3, p0, v1, v2, v0}, Ll/᩻ۨ֡;-><init>(Ll/᩷ۨ֡;III)V

    return-object v3

    .line 424
    :cond_0
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ljava/lang/Iterable;
    .locals 3

    .line 452
    invoke-direct {p0}, Ll/᩷ۨ֡;->ᩳ()Ljava/util/BitSet;

    move-result-object v0

    .line 453
    invoke-direct {p0}, Ll/᩷ۨ֡;->ܽ()Ll/᩷۟֡;

    move-result-object v1

    new-instance v2, Ll/ᩳۨ֡;

    invoke-direct {v2, v0}, Ll/ᩳۨ֡;-><init>(Ljava/util/BitSet;)V

    invoke-static {v1, v2}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;Ll/ᩴܶܺ;)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/util/Iterator;
    .locals 1

    .line 471
    invoke-direct {p0}, Ll/᩷ۨ֡;->ܽ()Ll/᩷۟֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷۟֡;->ۧ()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ljava/lang/Iterable;
    .locals 4

    .line 156
    invoke-virtual {p0}, Ll/᩷ۨ֡;->֫()I

    move-result v0

    .line 98
    iget v1, p0, Ll/᩷ۨ֡;->֫:I

    add-int/lit8 v1, v1, 0x10

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    .line 160
    iget-object v2, p0, Ll/᩷ۨ֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v2}, Ll/۬ۛ֡;->᩵()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0}, Ll/᩷ۨ֡;->ᩳ()Ljava/util/BitSet;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 161
    :goto_0
    new-instance v3, Ll/ܿۨ֡;

    invoke-direct {v3, p0, v1, v0, v2}, Ll/ܿۨ֡;-><init>(Ll/᩷ۨ֡;IILjava/util/BitSet;)V

    return-object v3
.end method

.method public final ᩻()I
    .locals 2

    .line 86
    iget v0, p0, Ll/᩷ۨ֡;->ܿ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 88
    iget-object v0, p0, Ll/᩷ۨ֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/᩷ۨ֡;->֫:I

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v0

    iput v0, p0, Ll/᩷ۨ֡;->ܿ:I

    :cond_0
    return v0
.end method
