.class public final Ll/۬ᩳܺ;
.super Ll/۠ᩳܺ;
.source "3BDE"


# static fields
.field public static final ֫:Ll/۬ᩳܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 75
    new-instance v0, Ll/۬ᩳܺ;

    .line 61
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 75
    sput-object v0, Ll/۬ᩳܺ;->֫:Ll/۬ᩳܺ;

    return-void
.end method

.method public static ֫(Ll/ۧᩴܺ;Ll/ۤܺܺ;IZ)Ll/᩺ܽܺ;
    .locals 11

    .line 601
    invoke-virtual {p0}, Ll/ۧᩴܺ;->֫()I

    move-result v0

    mul-int/lit8 v1, p2, 0xa

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    .line 263
    new-instance v0, Ll/۟ۘܺ;

    .line 276
    new-instance v1, Ll/֫ᩴܺ;

    invoke-direct {v1, p0}, Ll/֫ᩴܺ;-><init>(Ll/ۧᩴܺ;)V

    .line 371
    invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 607
    new-instance p0, Ll/᩺ܽܺ;

    .line 105
    invoke-direct {p0, p2}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    .line 611
    :try_start_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v5

    .line 612
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v6

    .line 613
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v3

    .line 614
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    .line 615
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v10

    .line 616
    invoke-virtual {p1, v3}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ll/۬ܺܺ;

    .line 617
    invoke-virtual {p1, v4}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v3

    check-cast v3, Ll/۬ܺܺ;

    if-eqz p3, :cond_0

    move-object v8, v2

    move-object v9, v3

    goto :goto_1

    :cond_0
    move-object v9, v2

    move-object v8, v3

    :goto_1
    move-object v3, p0

    move v4, v1

    .line 627
    invoke-virtual/range {v3 .. v10}, Ll/᩺ܽܺ;->֫(IIILl/۬ܺܺ;Ll/۬ܺܺ;Ll/۬ܺܺ;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    .line 638
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "shouldn\'t happen"

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 641
    :cond_1
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ܺ()V

    return-object p0

    :cond_2
    add-int/lit8 v1, v1, 0x2

    .line 603
    invoke-static {v1}, Ll/۬ᩳܺ;->֫(I)V

    throw v2
.end method

.method public static ֫()V
    .locals 3

    .line 794
    new-instance v0, Ll/᩺ᩳܺ;

    const-string v1, "severely truncated attribute"

    const/4 v2, 0x0

    .line 60
    invoke-direct {v0, v1, v2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 794
    throw v0
.end method

.method public static ֫(I)V
    .locals 2

    .line 817
    new-instance v0, Ll/᩺ᩳܺ;

    .line 818
    invoke-static {p0}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object p0

    const-string v1, "bad attribute length; expected length "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    .line 60
    invoke-direct {v0, p0, v1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 818
    throw v0
.end method

.method public static ۧ(Ll/᩹ᩳܺ;II)Ll/᩺ۧܺ;
    .locals 1

    const/4 v0, 0x2

    if-lt p2, v0, :cond_0

    .line 654
    new-instance v0, Ll/֨ᩳܺ;

    invoke-direct {v0, p0, p1, p2}, Ll/֨ᩳܺ;-><init>(Ll/᩹ᩳܺ;II)V

    .line 656
    sget-object p0, Ll/ۨۢܺ;->᩶:Ll/ۨۢܺ;

    .line 657
    invoke-virtual {v0, p0}, Ll/֨ᩳܺ;->֫(Ll/ۨۢܺ;)Ll/᩺ۢܺ;

    move-result-object p0

    .line 659
    new-instance p1, Ll/᩺ۧܺ;

    const-string v0, "RuntimeInvisibleAnnotations"

    .line 40
    invoke-direct {p1, v0, p0, p2}, Ll/ܳܽܺ;-><init>(Ljava/lang/String;Ll/᩺ۢܺ;I)V

    return-object p1

    .line 651
    :cond_0
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static ܽ(Ll/᩹ᩳܺ;II)Ll/۟ۧܺ;
    .locals 1

    const/4 v0, 0x2

    if-lt p2, v0, :cond_0

    .line 671
    new-instance v0, Ll/֨ᩳܺ;

    invoke-direct {v0, p0, p1, p2}, Ll/֨ᩳܺ;-><init>(Ll/᩹ᩳܺ;II)V

    .line 673
    sget-object p0, Ll/ۨۢܺ;->ۗ:Ll/ۨۢܺ;

    .line 674
    invoke-virtual {v0, p0}, Ll/֨ᩳܺ;->֫(Ll/ۨۢܺ;)Ll/᩺ۢܺ;

    move-result-object p0

    .line 676
    new-instance p1, Ll/۟ۧܺ;

    const-string v0, "RuntimeVisibleAnnotations"

    .line 40
    invoke-direct {p1, v0, p0, p2}, Ll/ܳܽܺ;-><init>(Ljava/lang/String;Ll/᩺ۢܺ;I)V

    return-object p1

    .line 668
    :cond_0
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static ᩳ(Ll/᩹ᩳܺ;II)Ll/ۧܽܺ;
    .locals 1

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 722
    invoke-virtual {p0}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object p2

    .line 723
    invoke-virtual {p0}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object p0

    .line 724
    invoke-virtual {p2, p1}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result p1

    .line 725
    invoke-virtual {p0, p1}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object p0

    check-cast p0, Ll/۬ܺܺ;

    .line 726
    new-instance p1, Ll/ۧܽܺ;

    invoke-direct {p1, p0}, Ll/ۧܽܺ;-><init>(Ll/۬ܺܺ;)V

    return-object p1

    .line 719
    :cond_0
    invoke-static {v0}, Ll/۬ᩳܺ;->֫(I)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final ֫(Ll/᩹ᩳܺ;ILjava/lang/String;II)Ll/۫ᩳܺ;
    .locals 25

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p4

    move/from16 v4, p5

    const-string v5, "truncated attribute"

    const/4 v6, 0x0

    const-string v7, "Synthetic"

    const-string v8, "Signature"

    const-string v9, "RuntimeVisibleAnnotations"

    const-string v10, "RuntimeInvisibleAnnotations"

    const-string v11, "Deprecated"

    const/4 v12, 0x0

    const/4 v13, 0x2

    if-eqz v1, :cond_2a

    const/4 v14, 0x1

    if-eq v1, v14, :cond_21

    const/4 v15, 0x3

    if-eq v1, v13, :cond_9

    if-eq v1, v15, :cond_1

    :cond_0
    move-object/from16 v14, p0

    goto/16 :goto_a

    :cond_1
    const-string v1, "LineNumberTable"

    if-ne v2, v1, :cond_5

    if-lt v4, v13, :cond_4

    .line 509
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v0

    .line 510
    invoke-virtual {v0, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v1

    add-int/lit8 v2, v3, 0x2

    add-int/lit8 v3, v4, -0x2

    mul-int/lit8 v4, v1, 0x4

    if-ne v3, v4, :cond_3

    .line 524
    new-instance v3, Ll/ۛܽܺ;

    .line 67
    invoke-direct {v3, v1}, Ll/ܿᩴܺ;-><init>(I)V

    :goto_0
    if-ge v12, v1, :cond_2

    .line 527
    invoke-virtual {v0, v2}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v4

    add-int/lit8 v5, v2, 0x2

    .line 528
    invoke-virtual {v0, v5}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v5

    .line 529
    invoke-virtual {v3, v12, v4, v5}, Ll/ۛܽܺ;->֫(III)V

    add-int/lit8 v2, v2, 0x4

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 537
    :cond_2
    invoke-virtual {v3}, Ll/ᩴᩴܺ;->ܺ()V

    .line 538
    new-instance v0, Ll/ۤۧܺ;

    invoke-direct {v0, v3}, Ll/ۤۧܺ;-><init>(Ll/ۛܽܺ;)V

    return-object v0

    :cond_3
    add-int/2addr v4, v13

    .line 521
    invoke-static {v4}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    .line 506
    :cond_4
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    throw v6

    :cond_5
    const-string v1, "LocalVariableTable"

    if-ne v2, v1, :cond_7

    if-lt v4, v13, :cond_6

    .line 550
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v2

    .line 551
    invoke-virtual {v2, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v5

    add-int/lit8 v6, v3, 0x2

    add-int/2addr v3, v4

    .line 559
    invoke-virtual {v2, v6, v3}, Ll/ۧᩴܺ;->֫(II)Ll/ۧᩴܺ;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v0

    .line 558
    invoke-static {v2, v0, v5, v12}, Ll/۬ᩳܺ;->֫(Ll/ۧᩴܺ;Ll/ۤܺܺ;IZ)Ll/᩺ܽܺ;

    move-result-object v0

    .line 561
    new-instance v2, Ll/ۛۧܺ;

    .line 36
    invoke-direct {v2, v1, v0}, Ll/ۜܽܺ;-><init>(Ljava/lang/String;Ll/᩺ܽܺ;)V

    return-object v2

    .line 547
    :cond_6
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    throw v6

    :cond_7
    const-string v1, "LocalVariableTypeTable"

    if-ne v2, v1, :cond_0

    if-lt v4, v13, :cond_8

    .line 573
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v2

    .line 574
    invoke-virtual {v2, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v5

    add-int/lit8 v6, v3, 0x2

    add-int/2addr v3, v4

    .line 582
    invoke-virtual {v2, v6, v3}, Ll/ۧᩴܺ;->֫(II)Ll/ۧᩴܺ;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v0

    .line 581
    invoke-static {v2, v0, v5, v14}, Ll/۬ᩳܺ;->֫(Ll/ۧᩴܺ;Ll/ۤܺܺ;IZ)Ll/᩺ܽܺ;

    move-result-object v0

    .line 584
    new-instance v2, Ll/ۨۧܺ;

    .line 36
    invoke-direct {v2, v1, v0}, Ll/ۜܽܺ;-><init>(Ljava/lang/String;Ll/᩺ܽܺ;)V

    return-object v2

    .line 570
    :cond_8
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    throw v6

    :cond_9
    const-string v1, "AnnotationDefault"

    if-ne v2, v1, :cond_b

    if-lt v4, v13, :cond_a

    .line 216
    new-instance v1, Ll/֨ᩳܺ;

    invoke-direct {v1, v0, v3, v4}, Ll/֨ᩳܺ;-><init>(Ll/᩹ᩳܺ;II)V

    .line 218
    invoke-virtual {v1}, Ll/֨ᩳܺ;->֫()Ll/ܰۡܺ;

    move-result-object v0

    .line 220
    new-instance v1, Ll/ܶۧܺ;

    invoke-direct {v1, v4, v0}, Ll/ܶۧܺ;-><init>(ILl/ܰۡܺ;)V

    return-object v1

    .line 213
    :cond_a
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    throw v6

    :cond_b
    const-string v1, "Code"

    if-ne v2, v1, :cond_13

    const/16 v1, 0xc

    if-lt v4, v1, :cond_12

    .line 257
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v1

    .line 258
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v2

    .line 259
    invoke-virtual {v1, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v17

    add-int/lit8 v7, v3, 0x2

    .line 260
    invoke-virtual {v1, v7}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v18

    add-int/lit8 v7, v3, 0x4

    .line 261
    invoke-virtual {v1, v7}, Ll/ۧᩴܺ;->ۧ(I)I

    move-result v7

    add-int/lit8 v8, v3, 0x8

    add-int/lit8 v4, v4, -0x8

    add-int/lit8 v9, v7, 0x4

    if-lt v4, v9, :cond_11

    add-int v9, v8, v7

    sub-int/2addr v4, v7

    .line 283
    new-instance v7, Ll/ۙܽܺ;

    .line 284
    invoke-virtual {v1, v8, v9}, Ll/ۧᩴܺ;->֫(II)Ll/ۧᩴܺ;

    move-result-object v8

    invoke-direct {v7, v8, v2}, Ll/ۙܽܺ;-><init>(Ll/ۧᩴܺ;Ll/ۤܺܺ;)V

    .line 291
    invoke-virtual {v1, v9}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v8

    if-nez v8, :cond_c

    .line 293
    sget-object v10, Ll/۠ܽܺ;->᩶:Ll/۠ܽܺ;

    goto :goto_1

    .line 294
    :cond_c
    new-instance v10, Ll/۠ܽܺ;

    .line 41
    invoke-direct {v10, v8}, Ll/ܿᩴܺ;-><init>(I)V

    :goto_1
    add-int/2addr v9, v13

    add-int/lit8 v4, v4, -0x2

    mul-int/lit8 v11, v8, 0x8

    add-int/2addr v11, v13

    if-lt v4, v11, :cond_10

    :goto_2
    if-ge v12, v8, :cond_e

    .line 314
    invoke-virtual {v1, v9}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v21

    add-int/lit8 v5, v9, 0x2

    .line 315
    invoke-virtual {v1, v5}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v22

    add-int/lit8 v5, v9, 0x4

    .line 316
    invoke-virtual {v1, v5}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v23

    add-int/lit8 v5, v9, 0x6

    .line 317
    invoke-virtual {v1, v5}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v5

    if-nez v5, :cond_d

    move-object v5, v6

    goto :goto_3

    .line 82
    :cond_d
    invoke-virtual {v2, v5}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v5

    .line 318
    :goto_3
    move-object/from16 v24, v5

    check-cast v24, Ll/۫ܺܺ;

    move-object/from16 v19, v10

    move/from16 v20, v12

    .line 319
    invoke-virtual/range {v19 .. v24}, Ll/۠ܽܺ;->֫(IIIILl/۫ܺܺ;)V

    add-int/lit8 v9, v9, 0x8

    add-int/lit8 v4, v4, -0x8

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 335
    :cond_e
    invoke-virtual {v10}, Ll/ᩴᩴܺ;->ܺ()V

    .line 337
    new-instance v1, Ll/ܶᩳܺ;

    move-object/from16 v14, p0

    invoke-direct {v1, v0, v15, v9, v14}, Ll/ܶᩳܺ;-><init>(Ll/᩹ᩳܺ;IILl/۠ᩳܺ;)V

    .line 341
    invoke-virtual {v1}, Ll/ܶᩳܺ;->ۧ()Ll/ܰᩳܺ;

    move-result-object v21

    .line 342
    invoke-virtual/range {v21 .. v21}, Ll/ᩴᩴܺ;->ܺ()V

    .line 344
    invoke-virtual {v1}, Ll/ܶᩳܺ;->֫()I

    move-result v0

    sub-int/2addr v0, v9

    if-ne v0, v4, :cond_f

    .line 349
    new-instance v0, Ll/᩹ۧܺ;

    move-object/from16 v16, v0

    move-object/from16 v19, v7

    move-object/from16 v20, v10

    invoke-direct/range {v16 .. v21}, Ll/᩹ۧܺ;-><init>(IILl/ۙܽܺ;Ll/۠ܽܺ;Ll/ܰᩳܺ;)V

    return-object v0

    :cond_f
    sub-int/2addr v9, v3

    add-int/2addr v9, v0

    .line 346
    invoke-static {v9}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    :cond_10
    move-object/from16 v14, p0

    .line 805
    new-instance v0, Ll/᩺ᩳܺ;

    .line 60
    invoke-direct {v0, v5, v6}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 805
    throw v0

    :cond_11
    move-object/from16 v14, p0

    new-instance v0, Ll/᩺ᩳܺ;

    .line 60
    invoke-direct {v0, v5, v6}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 805
    throw v0

    :cond_12
    move-object/from16 v14, p0

    .line 254
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    throw v6

    :cond_13
    move-object/from16 v14, p0

    if-ne v2, v11, :cond_15

    if-nez v4, :cond_14

    .line 383
    new-instance v0, Ll/ۙۧܺ;

    .line 32
    invoke-direct {v0, v11}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 380
    :cond_14
    invoke-static {v12}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    :cond_15
    const-string v1, "Exceptions"

    if-ne v2, v1, :cond_18

    if-lt v4, v13, :cond_17

    .line 424
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v1

    .line 425
    invoke-virtual {v1, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v1

    add-int/lit8 v2, v3, 0x2

    add-int/lit8 v3, v4, -0x2

    mul-int/lit8 v4, v1, 0x2

    if-ne v3, v4, :cond_16

    .line 439
    invoke-virtual {v0, v2, v1}, Ll/᩹ᩳܺ;->֫(II)Ll/ۧۖܺ;

    move-result-object v0

    .line 440
    new-instance v1, Ll/۬ۧܺ;

    invoke-direct {v1, v0}, Ll/۬ۧܺ;-><init>(Ll/ۧۖܺ;)V

    return-object v1

    :cond_16
    add-int/2addr v4, v13

    .line 436
    invoke-static {v4}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    .line 421
    :cond_17
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    throw v6

    :cond_18
    if-ne v2, v10, :cond_19

    .line 164
    invoke-static {v0, v3, v4}, Ll/۬ᩳܺ;->ۧ(Ll/᩹ᩳܺ;II)Ll/᩺ۧܺ;

    move-result-object v0

    return-object v0

    :cond_19
    if-ne v2, v9, :cond_1a

    .line 168
    invoke-static {v0, v3, v4}, Ll/۬ᩳܺ;->ܽ(Ll/᩹ᩳܺ;II)Ll/۟ۧܺ;

    move-result-object v0

    return-object v0

    :cond_1a
    const-string v1, "RuntimeInvisibleParameterAnnotations"

    if-ne v2, v1, :cond_1c

    if-lt v4, v13, :cond_1b

    .line 688
    new-instance v2, Ll/֨ᩳܺ;

    invoke-direct {v2, v0, v3, v4}, Ll/֨ᩳܺ;-><init>(Ll/᩹ᩳܺ;II)V

    .line 690
    sget-object v0, Ll/ۨۢܺ;->᩶:Ll/ۨۢܺ;

    .line 691
    invoke-virtual {v2, v0}, Ll/֨ᩳܺ;->ۧ(Ll/ۨۢܺ;)Ll/ܰۢܺ;

    move-result-object v0

    .line 693
    new-instance v2, Ll/ܰۧܺ;

    .line 42
    invoke-direct {v2, v1, v0, v4}, Ll/᩷ܽܺ;-><init>(Ljava/lang/String;Ll/ܰۢܺ;I)V

    return-object v2

    .line 685
    :cond_1b
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    throw v6

    :cond_1c
    const-string v1, "RuntimeVisibleParameterAnnotations"

    if-ne v2, v1, :cond_1e

    if-lt v4, v13, :cond_1d

    .line 705
    new-instance v2, Ll/֨ᩳܺ;

    invoke-direct {v2, v0, v3, v4}, Ll/֨ᩳܺ;-><init>(Ll/᩹ᩳܺ;II)V

    .line 707
    sget-object v0, Ll/ۨۢܺ;->ۗ:Ll/ۨۢܺ;

    .line 708
    invoke-virtual {v2, v0}, Ll/֨ᩳܺ;->ۧ(Ll/ۨۢܺ;)Ll/ܰۢܺ;

    move-result-object v0

    .line 710
    new-instance v2, Ll/֫ܽܺ;

    .line 42
    invoke-direct {v2, v1, v0, v4}, Ll/᩷ܽܺ;-><init>(Ljava/lang/String;Ll/ܰۢܺ;I)V

    return-object v2

    .line 702
    :cond_1d
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    throw v6

    :cond_1e
    if-ne v2, v8, :cond_1f

    .line 182
    invoke-static {v0, v3, v4}, Ll/۬ᩳܺ;->ᩳ(Ll/᩹ᩳܺ;II)Ll/ۧܽܺ;

    move-result-object v0

    return-object v0

    :cond_1f
    if-ne v2, v7, :cond_44

    if-nez v4, :cond_20

    .line 783
    new-instance v0, Ll/ܿܽܺ;

    .line 32
    invoke-direct {v0, v7}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 780
    :cond_20
    invoke-static {v12}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    :cond_21
    move-object/from16 v14, p0

    const-string v1, "ConstantValue"

    if-ne v2, v1, :cond_23

    if-ne v4, v13, :cond_22

    .line 361
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v1

    .line 362
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v0

    .line 363
    invoke-virtual {v1, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v1

    .line 364
    invoke-virtual {v0, v1}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/ۛܺܺ;

    .line 365
    new-instance v1, Ll/᩶ۧܺ;

    invoke-direct {v1, v0}, Ll/᩶ۧܺ;-><init>(Ll/ۛܺܺ;)V

    return-object v1

    .line 358
    :cond_22
    invoke-static {v13}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    :cond_23
    if-ne v2, v11, :cond_25

    if-nez v4, :cond_24

    .line 383
    new-instance v0, Ll/ۙۧܺ;

    .line 32
    invoke-direct {v0, v11}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 380
    :cond_24
    invoke-static {v12}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    :cond_25
    if-ne v2, v10, :cond_26

    .line 135
    invoke-static {v0, v3, v4}, Ll/۬ᩳܺ;->ۧ(Ll/᩹ᩳܺ;II)Ll/᩺ۧܺ;

    move-result-object v0

    return-object v0

    :cond_26
    if-ne v2, v9, :cond_27

    .line 139
    invoke-static {v0, v3, v4}, Ll/۬ᩳܺ;->ܽ(Ll/᩹ᩳܺ;II)Ll/۟ۧܺ;

    move-result-object v0

    return-object v0

    :cond_27
    if-ne v2, v8, :cond_28

    .line 143
    invoke-static {v0, v3, v4}, Ll/۬ᩳܺ;->ᩳ(Ll/᩹ᩳܺ;II)Ll/ۧܽܺ;

    move-result-object v0

    return-object v0

    :cond_28
    if-ne v2, v7, :cond_44

    if-nez v4, :cond_29

    .line 783
    new-instance v0, Ll/ܿܽܺ;

    .line 32
    invoke-direct {v0, v7}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 780
    :cond_29
    invoke-static {v12}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    :cond_2a
    move-object/from16 v14, p0

    const-string v1, "BootstrapMethods"

    if-ne v2, v1, :cond_31

    if-lt v4, v13, :cond_30

    .line 232
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v1

    .line 233
    invoke-virtual {v1, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    add-int/2addr v3, v13

    add-int/lit8 v4, v4, -0x2

    .line 242
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v7

    .line 243
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ۖ()Ll/۫ܺܺ;

    move-result-object v0

    .line 824
    new-instance v8, Ll/᩵ܽܺ;

    .line 38
    invoke-direct {v8, v2}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v2, :cond_2e

    const/4 v10, 0x4

    if-lt v4, v10, :cond_2d

    .line 830
    invoke-virtual {v1, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v11

    add-int/lit8 v12, v3, 0x2

    .line 831
    invoke-virtual {v1, v12}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v12

    add-int/2addr v3, v10

    add-int/lit8 v4, v4, -0x4

    mul-int/lit8 v10, v12, 0x2

    if-lt v4, v10, :cond_2c

    .line 845
    new-instance v10, Ll/ۘܽܺ;

    .line 40
    invoke-direct {v10, v12}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v13, 0x0

    :goto_5
    if-ge v13, v12, :cond_2b

    .line 847
    invoke-virtual {v1, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v15

    .line 852
    invoke-virtual {v7, v15}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v15

    invoke-virtual {v10, v13, v15}, Ll/ۘܽܺ;->֫(ILl/ܰۡܺ;)V

    add-int/lit8 v13, v13, 0x1

    add-int/lit8 v3, v3, 0x2

    add-int/lit8 v4, v4, -0x2

    goto :goto_5

    .line 854
    :cond_2b
    invoke-virtual {v10}, Ll/ᩴᩴܺ;->ܺ()V

    .line 855
    invoke-virtual {v7, v11}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v11

    .line 856
    check-cast v11, Ll/᩸ܺܺ;

    invoke-virtual {v8, v9, v0, v11, v10}, Ll/᩵ܽܺ;->֫(ILl/۫ܺܺ;Ll/᩸ܺܺ;Ll/ۘܽܺ;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 805
    :cond_2c
    new-instance v0, Ll/᩺ᩳܺ;

    .line 60
    invoke-direct {v0, v5, v6}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 805
    throw v0

    :cond_2d
    new-instance v0, Ll/᩺ᩳܺ;

    .line 60
    invoke-direct {v0, v5, v6}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 805
    throw v0

    .line 858
    :cond_2e
    invoke-virtual {v8}, Ll/ᩴᩴܺ;->ܺ()V

    if-nez v4, :cond_2f

    .line 245
    new-instance v0, Ll/᩸ۧܺ;

    invoke-direct {v0, v8}, Ll/᩸ۧܺ;-><init>(Ll/᩵ܽܺ;)V

    return-object v0

    .line 861
    :cond_2f
    invoke-static {v4}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    .line 229
    :cond_30
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    throw v6

    :cond_31
    if-ne v2, v11, :cond_33

    if-nez v4, :cond_32

    .line 383
    new-instance v0, Ll/ۙۧܺ;

    .line 32
    invoke-direct {v0, v11}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 380
    :cond_32
    invoke-static {v12}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    :cond_33
    const-string v1, "EnclosingMethod"

    if-ne v2, v1, :cond_36

    const/4 v1, 0x4

    if-ne v4, v1, :cond_35

    .line 395
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v1

    .line 396
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v0

    .line 398
    invoke-virtual {v1, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    .line 399
    invoke-virtual {v0, v2}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v2

    check-cast v2, Ll/۫ܺܺ;

    add-int/2addr v3, v13

    .line 401
    invoke-virtual {v1, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v1

    if-nez v1, :cond_34

    goto :goto_6

    .line 82
    :cond_34
    invoke-virtual {v0, v1}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v6

    .line 402
    :goto_6
    check-cast v6, Ll/᩶ܺܺ;

    .line 404
    new-instance v0, Ll/ۗۧܺ;

    invoke-direct {v0, v2, v6}, Ll/ۗۧܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    return-object v0

    :cond_35
    const/4 v0, 0x4

    .line 392
    invoke-static {v0}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    :cond_36
    const-string v1, "InnerClasses"

    if-ne v2, v1, :cond_3c

    if-lt v4, v13, :cond_3b

    .line 452
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v1

    .line 453
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v0

    .line 454
    invoke-virtual {v1, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v2

    add-int/2addr v3, v13

    add-int/lit8 v4, v4, -0x2

    mul-int/lit8 v5, v2, 0x8

    if-ne v4, v5, :cond_3a

    .line 468
    new-instance v4, Ll/ۡܽܺ;

    .line 34
    invoke-direct {v4, v2}, Ll/ܿᩴܺ;-><init>(I)V

    :goto_7
    if-ge v12, v2, :cond_39

    .line 471
    invoke-virtual {v1, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v5

    add-int/lit8 v7, v3, 0x2

    .line 472
    invoke-virtual {v1, v7}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v7

    add-int/lit8 v8, v3, 0x4

    .line 473
    invoke-virtual {v1, v8}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v8

    add-int/lit8 v9, v3, 0x6

    .line 474
    invoke-virtual {v1, v9}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v20

    .line 475
    invoke-virtual {v0, v5}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v5

    move-object/from16 v17, v5

    check-cast v17, Ll/۫ܺܺ;

    if-nez v7, :cond_37

    move-object v5, v6

    goto :goto_8

    .line 82
    :cond_37
    invoke-virtual {v0, v7}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v5

    .line 476
    :goto_8
    move-object/from16 v18, v5

    check-cast v18, Ll/۫ܺܺ;

    if-nez v8, :cond_38

    move-object v5, v6

    goto :goto_9

    .line 82
    :cond_38
    invoke-virtual {v0, v8}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v5

    .line 477
    :goto_9
    move-object/from16 v19, v5

    check-cast v19, Ll/۬ܺܺ;

    move-object v15, v4

    move/from16 v16, v12

    .line 478
    invoke-virtual/range {v15 .. v20}, Ll/ۡܽܺ;->֫(ILl/۫ܺܺ;Ll/۫ܺܺ;Ll/۬ܺܺ;I)V

    add-int/lit8 v3, v3, 0x8

    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    .line 496
    :cond_39
    invoke-virtual {v4}, Ll/ᩴᩴܺ;->ܺ()V

    .line 497
    new-instance v0, Ll/۫ۧܺ;

    invoke-direct {v0, v4}, Ll/۫ۧܺ;-><init>(Ll/ۡܽܺ;)V

    return-object v0

    :cond_3a
    add-int/2addr v5, v13

    .line 465
    invoke-static {v5}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    .line 449
    :cond_3b
    invoke-static {}, Ll/۬ᩳܺ;->֫()V

    throw v6

    :cond_3c
    if-ne v2, v10, :cond_3d

    .line 106
    invoke-static {v0, v3, v4}, Ll/۬ᩳܺ;->ۧ(Ll/᩹ᩳܺ;II)Ll/᩺ۧܺ;

    move-result-object v0

    return-object v0

    :cond_3d
    if-ne v2, v9, :cond_3e

    .line 110
    invoke-static {v0, v3, v4}, Ll/۬ᩳܺ;->ܽ(Ll/᩹ᩳܺ;II)Ll/۟ۧܺ;

    move-result-object v0

    return-object v0

    :cond_3e
    if-ne v2, v7, :cond_40

    if-nez v4, :cond_3f

    .line 783
    new-instance v0, Ll/ܿܽܺ;

    .line 32
    invoke-direct {v0, v7}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 780
    :cond_3f
    invoke-static {v12}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    :cond_40
    if-ne v2, v8, :cond_41

    .line 117
    invoke-static {v0, v3, v4}, Ll/۬ᩳܺ;->ᩳ(Ll/᩹ᩳܺ;II)Ll/ۧܽܺ;

    move-result-object v0

    return-object v0

    :cond_41
    const-string v1, "SourceDebugExtension"

    if-ne v2, v1, :cond_42

    .line 740
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v0

    add-int v1, v3, v4

    invoke-virtual {v0, v3, v1}, Ll/ۧᩴܺ;->֫(II)Ll/ۧᩴܺ;

    move-result-object v0

    .line 741
    new-instance v1, Ll/۬ܺܺ;

    invoke-direct {v1, v0}, Ll/۬ܺܺ;-><init>(Ll/ۧᩴܺ;)V

    .line 742
    new-instance v0, Ll/ܽܽܺ;

    invoke-direct {v0, v1}, Ll/ܽܽܺ;-><init>(Ll/۬ܺܺ;)V

    return-object v0

    :cond_42
    const-string v1, "SourceFile"

    if-ne v2, v1, :cond_44

    if-ne v4, v13, :cond_43

    .line 761
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v1

    .line 762
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v0

    .line 763
    invoke-virtual {v1, v3}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v1

    .line 764
    invoke-virtual {v0, v1}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/۬ܺܺ;

    .line 765
    new-instance v1, Ll/ᩳܽܺ;

    invoke-direct {v1, v0}, Ll/ᩳܽܺ;-><init>(Ll/۬ܺܺ;)V

    return-object v1

    .line 758
    :cond_43
    invoke-static {v13}, Ll/۬ᩳܺ;->֫(I)V

    throw v6

    .line 134
    :cond_44
    :goto_a
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ᩳ()Ll/ۧᩴܺ;

    move-result-object v1

    .line 135
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    .line 136
    new-instance v0, Ll/ܺܽܺ;

    invoke-direct {v0, v2, v1, v3, v4}, Ll/ܺܽܺ;-><init>(Ljava/lang/String;Ll/ۧᩴܺ;II)V

    return-object v0
.end method
