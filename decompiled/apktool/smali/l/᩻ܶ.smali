.class public final Ll/᩻ܶ;
.super Ljava/lang/Object;
.source "J16Q"


# static fields
.field public static ֫:Ll/᩺۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 45
    new-instance v0, Ll/᩺۠;

    .line 494
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    sput-object v0, Ll/᩻ܶ;->֫:Ll/᩺۠;

    return-void
.end method

.method public static ֫(Ll/ܶ۠;Ll/ܰ۠;)V
    .locals 6

    .line 534
    invoke-virtual {p0}, Ll/ܶ۠;->ۚ()F

    move-result v0

    .line 535
    iget-object v1, p0, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iget-object v2, v1, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    invoke-virtual {v2}, Ll/ۚ۠;->ۧ()I

    move-result v2

    .line 536
    iget-object v3, p0, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    iget-object v4, v3, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    invoke-virtual {v4}, Ll/ۚ۠;->ۧ()I

    move-result v4

    .line 537
    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    add-int/2addr v1, v2

    .line 538
    invoke-virtual {v3}, Ll/ۚ۠;->ܽ()I

    move-result v3

    sub-int v3, v4, v3

    const/high16 v5, 0x3f000000    # 0.5f

    if-ne v2, v4, :cond_0

    const/high16 v0, 0x3f000000    # 0.5f

    goto :goto_0

    :cond_0
    move v2, v1

    move v4, v3

    .line 544
    :goto_0
    invoke-virtual {p0}, Ll/ܶ۠;->ۜ()I

    move-result v1

    sub-int v3, v4, v2

    sub-int/2addr v3, v1

    if-le v2, v4, :cond_1

    sub-int v3, v2, v4

    sub-int/2addr v3, v1

    :cond_1
    int-to-float v3, v3

    mul-float v0, v0, v3

    add-float/2addr v0, v5

    float-to-int v0, v0

    add-int v3, v2, v0

    add-int v5, v3, v1

    if-le v2, v4, :cond_2

    sub-int v3, v2, v0

    sub-int v5, v3, v1

    .line 556
    :cond_2
    invoke-virtual {p0, v3, v5}, Ll/ܶ۠;->ۧ(II)V

    .line 557
    invoke-static {p0, p1}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;)V

    return-void
.end method

.method public static ֫(Ll/ܶ۠;Ll/ܰ۠;Ll/ܶ۠;)V
    .locals 7

    .line 609
    invoke-virtual {p2}, Ll/ܶ۠;->ۚ()F

    move-result v0

    .line 610
    iget-object v1, p2, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iget-object v2, v1, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    invoke-virtual {v2}, Ll/ۚ۠;->ۧ()I

    move-result v2

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    add-int/2addr v1, v2

    .line 611
    iget-object v2, p2, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    iget-object v3, v2, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    invoke-virtual {v3}, Ll/ۚ۠;->ۧ()I

    move-result v3

    invoke-virtual {v2}, Ll/ۚ۠;->ܽ()I

    move-result v2

    sub-int/2addr v3, v2

    if-lt v3, v1, :cond_4

    .line 613
    invoke-virtual {p2}, Ll/ܶ۠;->ۜ()I

    move-result v2

    .line 614
    invoke-virtual {p2}, Ll/ܶ۠;->۠()I

    move-result v4

    const/16 v5, 0x8

    const/high16 v6, 0x3f000000    # 0.5f

    if-eq v4, v5, :cond_3

    .line 615
    iget v4, p2, Ll/ܶ۠;->᩺:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    .line 617
    instance-of v2, p0, Ll/᩸۠;

    if-eqz v2, :cond_0

    .line 618
    invoke-virtual {p0}, Ll/ܶ۠;->ۜ()I

    move-result p0

    goto :goto_0

    .line 620
    :cond_0
    iget-object p0, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    invoke-virtual {p0}, Ll/ܶ۠;->ۜ()I

    move-result p0

    :goto_0
    mul-float v2, v0, v6

    int-to-float p0, p0

    mul-float v2, v2, p0

    float-to-int v2, v2

    goto :goto_1

    :cond_1
    if-nez v4, :cond_2

    sub-int v2, v3, v1

    .line 626
    :cond_2
    :goto_1
    iget p0, p2, Ll/ܶ۠;->ۧ֫:I

    invoke-static {p0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 627
    iget p0, p2, Ll/ܶ۠;->۟:I

    if-lez p0, :cond_3

    .line 628
    invoke-static {p0, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_3
    sub-int/2addr v3, v1

    sub-int/2addr v3, v2

    int-to-float p0, v3

    mul-float v0, v0, p0

    add-float/2addr v0, v6

    float-to-int p0, v0

    add-int/2addr v1, p0

    add-int/2addr v2, v1

    .line 635
    invoke-virtual {p2, v1, v2}, Ll/ܶ۠;->ۧ(II)V

    .line 636
    invoke-static {p2, p1}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;)V

    :cond_4
    return-void
.end method

.method public static ֫(Ll/ܶ۠;Ll/ܰ۠;Ll/ܶ۠;Z)V
    .locals 7

    .line 569
    invoke-virtual {p2}, Ll/ܶ۠;->᩷()F

    move-result v0

    .line 570
    iget-object v1, p2, Ll/ܶ۠;->۫:Ll/ۚ۠;

    iget-object v2, v1, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    invoke-virtual {v2}, Ll/ۚ۠;->ۧ()I

    move-result v2

    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    add-int/2addr v1, v2

    .line 571
    iget-object v2, p2, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    iget-object v3, v2, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    invoke-virtual {v3}, Ll/ۚ۠;->ۧ()I

    move-result v3

    invoke-virtual {v2}, Ll/ۚ۠;->ܽ()I

    move-result v2

    sub-int/2addr v3, v2

    if-lt v3, v1, :cond_4

    .line 573
    invoke-virtual {p2}, Ll/ܶ۠;->ܶ()I

    move-result v2

    .line 574
    invoke-virtual {p2}, Ll/ܶ۠;->۠()I

    move-result v4

    const/16 v5, 0x8

    const/high16 v6, 0x3f000000    # 0.5f

    if-eq v4, v5, :cond_3

    .line 575
    iget v4, p2, Ll/ܶ۠;->ܰ:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    .line 577
    instance-of v2, p0, Ll/᩸۠;

    if-eqz v2, :cond_0

    .line 578
    invoke-virtual {p0}, Ll/ܶ۠;->ܶ()I

    move-result p0

    goto :goto_0

    .line 620
    :cond_0
    iget-object p0, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    .line 580
    invoke-virtual {p0}, Ll/ܶ۠;->ܶ()I

    move-result p0

    .line 582
    :goto_0
    invoke-virtual {p2}, Ll/ܶ۠;->᩷()F

    move-result v2

    mul-float v2, v2, v6

    int-to-float p0, p0

    mul-float v2, v2, p0

    float-to-int v2, v2

    goto :goto_1

    :cond_1
    if-nez v4, :cond_2

    sub-int v2, v3, v1

    .line 586
    :cond_2
    :goto_1
    iget p0, p2, Ll/ܶ۠;->ܽ֫:I

    invoke-static {p0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 587
    iget p0, p2, Ll/ܶ۠;->֫֫:I

    if-lez p0, :cond_3

    .line 588
    invoke-static {p0, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_3
    sub-int/2addr v3, v1

    sub-int/2addr v3, v2

    int-to-float p0, v3

    mul-float v0, v0, p0

    add-float/2addr v0, v6

    float-to-int p0, v0

    add-int/2addr v1, p0

    add-int/2addr v2, v1

    .line 595
    invoke-virtual {p2, v1, v2}, Ll/ܶ۠;->֫(II)V

    .line 596
    invoke-static {p2, p1, p3}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Z)V

    :cond_4
    return-void
.end method

.method public static ֫(Ll/ܶ۠;Ll/ܰ۠;Z)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 232
    instance-of v3, v0, Ll/᩸۠;

    if-nez v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Ll/ܶ۠;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static/range {p0 .. p0}, Ll/᩻ܶ;->֫(Ll/ܶ۠;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 233
    new-instance v3, Ll/᩺۠;

    .line 494
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 234
    invoke-static {v0, v1, v3}, Ll/᩸۠;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/᩺۠;)V

    .line 237
    :cond_0
    sget-object v3, Ll/֡۠;->۫:Ll/֡۠;

    invoke-virtual {v0, v3}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v3

    .line 238
    sget-object v4, Ll/֡۠;->ۛ:Ll/֡۠;

    invoke-virtual {v0, v4}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    .line 239
    invoke-virtual {v3}, Ll/ۚ۠;->ۧ()I

    move-result v5

    .line 240
    invoke-virtual {v4}, Ll/ۚ۠;->ۧ()I

    move-result v6

    .line 242
    invoke-virtual {v3}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v7

    const/16 v8, 0x8

    const/4 v9, 0x0

    if-eqz v7, :cond_b

    invoke-virtual {v3}, Ll/ۚ۠;->ۜ()Z

    move-result v7

    if-eqz v7, :cond_b

    .line 243
    invoke-virtual {v3}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۚ۠;

    .line 244
    iget-object v10, v7, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    .line 247
    invoke-static {v10}, Ll/᩻ܶ;->֫(Ll/ܶ۠;)Z

    move-result v11

    iget-object v12, v10, Ll/ܶ۠;->۫:Ll/ۚ۠;

    iget-object v13, v10, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    .line 248
    invoke-virtual {v10}, Ll/ܶ۠;->ۤ()Z

    move-result v14

    if-eqz v14, :cond_1

    if-eqz v11, :cond_1

    .line 249
    new-instance v14, Ll/᩺۠;

    .line 494
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 250
    invoke-static {v10, v1, v14}, Ll/᩸۠;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/᩺۠;)V

    .line 1966
    :cond_1
    iget-object v14, v10, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v14, v14, v9

    const/4 v15, 0x0

    .line 253
    sget-object v9, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v14, v9, :cond_6

    if-eqz v11, :cond_2

    goto :goto_1

    :cond_2
    if-ne v14, v9, :cond_7

    .line 279
    iget v9, v10, Ll/ܶ۠;->֫֫:I

    if-ltz v9, :cond_7

    iget v9, v10, Ll/ܶ۠;->ܽ֫:I

    if-ltz v9, :cond_7

    .line 281
    invoke-virtual {v10}, Ll/ܶ۠;->۠()I

    move-result v9

    if-eq v9, v8, :cond_3

    iget v9, v10, Ll/ܶ۠;->ܰ:I

    if-nez v9, :cond_7

    .line 1302
    iget v9, v10, Ll/ܶ۠;->֡:F

    cmpl-float v9, v9, v15

    if-nez v9, :cond_7

    .line 282
    :cond_3
    invoke-virtual {v10}, Ll/ܶ۠;->ۙ()Z

    move-result v9

    if-nez v9, :cond_7

    invoke-virtual {v10}, Ll/ܶ۠;->۫()Z

    move-result v9

    if-nez v9, :cond_7

    if-ne v7, v12, :cond_4

    .line 283
    iget-object v9, v13, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Ll/ۚ۠;->ۜ()Z

    move-result v9

    if-nez v9, :cond_5

    :cond_4
    if-ne v7, v13, :cond_7

    iget-object v7, v12, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v7, :cond_7

    .line 284
    invoke-virtual {v7}, Ll/ۚ۠;->ۜ()Z

    move-result v7

    if-eqz v7, :cond_7

    .line 285
    :cond_5
    invoke-virtual {v10}, Ll/ܶ۠;->ۙ()Z

    move-result v7

    if-nez v7, :cond_7

    .line 286
    invoke-static {v0, v1, v10, v2}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/ܶ۠;Z)V

    goto :goto_2

    .line 255
    :cond_6
    :goto_1
    invoke-virtual {v10}, Ll/ܶ۠;->ۤ()Z

    move-result v9

    if-eqz v9, :cond_8

    :cond_7
    :goto_2
    const/4 v9, 0x0

    goto/16 :goto_0

    :cond_8
    if-ne v7, v12, :cond_9

    .line 262
    iget-object v9, v13, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v9, :cond_9

    .line 263
    invoke-virtual {v12}, Ll/ۚ۠;->ܽ()I

    move-result v7

    add-int/2addr v7, v5

    .line 264
    invoke-virtual {v10}, Ll/ܶ۠;->ܶ()I

    move-result v9

    add-int/2addr v9, v7

    .line 265
    invoke-virtual {v10, v7, v9}, Ll/ܶ۠;->֫(II)V

    .line 266
    invoke-static {v10, v1, v2}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Z)V

    goto :goto_2

    :cond_9
    if-ne v7, v13, :cond_a

    .line 267
    iget-object v9, v12, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v9, :cond_a

    .line 268
    invoke-virtual {v13}, Ll/ۚ۠;->ܽ()I

    move-result v7

    sub-int v7, v5, v7

    .line 269
    invoke-virtual {v10}, Ll/ܶ۠;->ܶ()I

    move-result v9

    sub-int v9, v7, v9

    .line 270
    invoke-virtual {v10, v9, v7}, Ll/ܶ۠;->֫(II)V

    .line 271
    invoke-static {v10, v1, v2}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Z)V

    goto :goto_2

    :cond_a
    if-ne v7, v12, :cond_7

    .line 272
    iget-object v7, v13, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v7, :cond_7

    .line 273
    invoke-virtual {v7}, Ll/ۚ۠;->ۜ()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v10}, Ll/ܶ۠;->ۙ()Z

    move-result v7

    if-nez v7, :cond_7

    .line 274
    invoke-static {v10, v1, v2}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;Z)V

    goto :goto_2

    :cond_b
    const/4 v3, 0x0

    .line 291
    instance-of v5, v0, Ll/ۗ۠;

    if-eqz v5, :cond_c

    goto/16 :goto_6

    .line 294
    :cond_c
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v5

    if-eqz v5, :cond_18

    invoke-virtual {v4}, Ll/ۚ۠;->ۜ()Z

    move-result v5

    if-eqz v5, :cond_18

    .line 295
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_d
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚ۠;

    .line 296
    iget-object v7, v5, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    .line 297
    invoke-static {v7}, Ll/᩻ܶ;->֫(Ll/ܶ۠;)Z

    move-result v9

    iget-object v10, v7, Ll/ܶ۠;->۫:Ll/ۚ۠;

    iget-object v11, v7, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    .line 298
    invoke-virtual {v7}, Ll/ܶ۠;->ۤ()Z

    move-result v12

    if-eqz v12, :cond_e

    if-eqz v9, :cond_e

    .line 299
    new-instance v12, Ll/᩺۠;

    .line 494
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 300
    invoke-static {v7, v1, v12}, Ll/᩸۠;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/᩺۠;)V

    :cond_e
    if-ne v5, v10, :cond_f

    .line 305
    iget-object v12, v11, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v12, :cond_f

    invoke-virtual {v12}, Ll/ۚ۠;->ۜ()Z

    move-result v12

    if-nez v12, :cond_10

    :cond_f
    if-ne v5, v11, :cond_11

    iget-object v12, v10, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v12, :cond_11

    .line 306
    invoke-virtual {v12}, Ll/ۚ۠;->ۜ()Z

    move-result v12

    if-eqz v12, :cond_11

    :cond_10
    const/4 v12, 0x1

    goto :goto_4

    :cond_11
    const/4 v12, 0x0

    .line 1966
    :goto_4
    iget-object v13, v7, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    const/4 v14, 0x0

    aget-object v13, v13, v14

    .line 307
    sget-object v15, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v13, v15, :cond_14

    if-eqz v9, :cond_12

    goto :goto_5

    :cond_12
    if-ne v13, v15, :cond_d

    .line 329
    iget v5, v7, Ll/ܶ۠;->֫֫:I

    if-ltz v5, :cond_d

    iget v5, v7, Ll/ܶ۠;->ܽ֫:I

    if-ltz v5, :cond_d

    .line 331
    invoke-virtual {v7}, Ll/ܶ۠;->۠()I

    move-result v5

    if-eq v5, v8, :cond_13

    iget v5, v7, Ll/ܶ۠;->ܰ:I

    if-nez v5, :cond_d

    .line 1302
    iget v5, v7, Ll/ܶ۠;->֡:F

    cmpl-float v5, v5, v3

    if-nez v5, :cond_d

    .line 332
    :cond_13
    invoke-virtual {v7}, Ll/ܶ۠;->ۙ()Z

    move-result v5

    if-nez v5, :cond_d

    invoke-virtual {v7}, Ll/ܶ۠;->۫()Z

    move-result v5

    if-nez v5, :cond_d

    if-eqz v12, :cond_d

    .line 333
    invoke-virtual {v7}, Ll/ܶ۠;->ۙ()Z

    move-result v5

    if-nez v5, :cond_d

    .line 334
    invoke-static {v0, v1, v7, v2}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/ܶ۠;Z)V

    goto :goto_3

    .line 309
    :cond_14
    :goto_5
    invoke-virtual {v7}, Ll/ܶ۠;->ۤ()Z

    move-result v9

    if-eqz v9, :cond_15

    goto/16 :goto_3

    :cond_15
    if-ne v5, v10, :cond_16

    .line 316
    iget-object v9, v11, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v9, :cond_16

    .line 317
    invoke-virtual {v10}, Ll/ۚ۠;->ܽ()I

    move-result v5

    add-int/2addr v5, v6

    .line 318
    invoke-virtual {v7}, Ll/ܶ۠;->ܶ()I

    move-result v9

    add-int/2addr v9, v5

    .line 319
    invoke-virtual {v7, v5, v9}, Ll/ܶ۠;->֫(II)V

    .line 320
    invoke-static {v7, v1, v2}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Z)V

    goto/16 :goto_3

    :cond_16
    if-ne v5, v11, :cond_17

    .line 321
    iget-object v5, v10, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v5, :cond_17

    .line 322
    invoke-virtual {v11}, Ll/ۚ۠;->ܽ()I

    move-result v5

    sub-int v5, v6, v5

    .line 323
    invoke-virtual {v7}, Ll/ܶ۠;->ܶ()I

    move-result v9

    sub-int v9, v5, v9

    .line 324
    invoke-virtual {v7, v9, v5}, Ll/ܶ۠;->֫(II)V

    .line 325
    invoke-static {v7, v1, v2}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Z)V

    goto/16 :goto_3

    :cond_17
    if-eqz v12, :cond_d

    .line 326
    invoke-virtual {v7}, Ll/ܶ۠;->ۙ()Z

    move-result v5

    if-nez v5, :cond_d

    .line 327
    invoke-static {v7, v1, v2}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;Z)V

    goto/16 :goto_3

    :cond_18
    :goto_6
    return-void
.end method

.method public static ֫(Ll/᩸۠;Ll/ܰ۠;)V
    .locals 13

    .line 1966
    iget-object v0, p0, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    const/4 v3, 0x1

    .line 1975
    aget-object v0, v0, v3

    .line 59
    invoke-virtual {p0}, Ll/ܶ۠;->۟()V

    .line 108
    iget-object v4, p0, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    .line 61
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    .line 63
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܶ۠;

    .line 64
    invoke-virtual {v7}, Ll/ܶ۠;->۟()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {p0}, Ll/᩸۠;->ܺ֫()Z

    move-result v6

    .line 74
    sget-object v7, Ll/۠۠;->᩹:Ll/۠۠;

    if-ne v2, v7, :cond_1

    .line 75
    invoke-virtual {p0}, Ll/ܶ۠;->ܶ()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Ll/ܶ۠;->֫(II)V

    goto :goto_1

    .line 77
    :cond_1
    invoke-virtual {p0}, Ll/ܶ۠;->֫֫()V

    :goto_1
    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_2
    const/high16 v9, 0x3f000000    # 0.5f

    const/4 v10, -0x1

    if-ge v2, v5, :cond_7

    .line 84
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܶ۠;

    .line 85
    instance-of v12, v11, Ll/ۗ۠;

    if-eqz v12, :cond_5

    .line 86
    check-cast v11, Ll/ۗ۠;

    .line 87
    invoke-virtual {v11}, Ll/ۗ۠;->᩻֫()I

    move-result v12

    if-ne v12, v3, :cond_6

    .line 88
    invoke-virtual {v11}, Ll/ۗ۠;->ۜ֫()I

    move-result v7

    if-eq v7, v10, :cond_2

    .line 89
    invoke-virtual {v11}, Ll/ۗ۠;->ۜ֫()I

    move-result v7

    invoke-virtual {v11, v7}, Ll/ۗ۠;->֨(I)V

    goto :goto_3

    .line 90
    :cond_2
    invoke-virtual {v11}, Ll/ۗ۠;->᩷֫()I

    move-result v7

    if-eq v7, v10, :cond_3

    invoke-virtual {p0}, Ll/ܶ۠;->ۛ()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 91
    invoke-virtual {p0}, Ll/ܶ۠;->ܶ()I

    move-result v7

    invoke-virtual {v11}, Ll/ۗ۠;->᩷֫()I

    move-result v9

    sub-int/2addr v7, v9

    invoke-virtual {v11, v7}, Ll/ۗ۠;->֨(I)V

    goto :goto_3

    .line 92
    :cond_3
    invoke-virtual {p0}, Ll/ܶ۠;->ۛ()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 93
    invoke-virtual {v11}, Ll/ۗ۠;->ۢ֫()F

    move-result v7

    invoke-virtual {p0}, Ll/ܶ۠;->ܶ()I

    move-result v10

    int-to-float v10, v10

    mul-float v7, v7, v10

    add-float/2addr v7, v9

    float-to-int v7, v7

    .line 94
    invoke-virtual {v11, v7}, Ll/ۗ۠;->֨(I)V

    :cond_4
    :goto_3
    const/4 v7, 0x1

    goto :goto_4

    .line 98
    :cond_5
    instance-of v9, v11, Ll/ۖ۠;

    if-eqz v9, :cond_6

    .line 99
    check-cast v11, Ll/ۖ۠;

    .line 100
    invoke-virtual {v11}, Ll/ۖ۠;->ܺ֫()I

    move-result v9

    if-nez v9, :cond_6

    const/4 v8, 0x1

    :cond_6
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    if-eqz v7, :cond_9

    const/4 v2, 0x0

    :goto_5
    if-ge v2, v5, :cond_9

    .line 107
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܶ۠;

    .line 108
    instance-of v11, v7, Ll/ۗ۠;

    if-eqz v11, :cond_8

    .line 109
    check-cast v7, Ll/ۗ۠;

    .line 110
    invoke-virtual {v7}, Ll/ۗ۠;->᩻֫()I

    move-result v11

    if-ne v11, v3, :cond_8

    .line 111
    invoke-static {v7, p1, v6}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Z)V

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 118
    :cond_9
    invoke-static {p0, p1, v6}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Z)V

    if-eqz v8, :cond_b

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v5, :cond_b

    .line 123
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܶ۠;

    .line 124
    instance-of v8, v7, Ll/ۖ۠;

    if-eqz v8, :cond_a

    .line 125
    check-cast v7, Ll/ۖ۠;

    .line 126
    invoke-virtual {v7}, Ll/ۖ۠;->ܺ֫()I

    move-result v8

    if-nez v8, :cond_a

    .line 211
    invoke-virtual {v7}, Ll/ۖ۠;->ۜ֫()Z

    move-result v8

    if-eqz v8, :cond_a

    .line 213
    invoke-static {v7, p1, v6}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Z)V

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 134
    :cond_b
    sget-object v2, Ll/۠۠;->᩹:Ll/۠۠;

    if-ne v0, v2, :cond_c

    .line 135
    invoke-virtual {p0}, Ll/ܶ۠;->ۜ()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Ll/ܶ۠;->ۧ(II)V

    goto :goto_7

    .line 137
    :cond_c
    invoke-virtual {p0}, Ll/ܶ۠;->ۧ֫()V

    :goto_7
    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    :goto_8
    if-ge v0, v5, :cond_12

    .line 144
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܶ۠;

    .line 145
    instance-of v11, v8, Ll/ۗ۠;

    if-eqz v11, :cond_10

    .line 146
    check-cast v8, Ll/ۗ۠;

    .line 147
    invoke-virtual {v8}, Ll/ۗ۠;->᩻֫()I

    move-result v11

    if-nez v11, :cond_11

    .line 148
    invoke-virtual {v8}, Ll/ۗ۠;->ۜ֫()I

    move-result v2

    if-eq v2, v10, :cond_d

    .line 149
    invoke-virtual {v8}, Ll/ۗ۠;->ۜ֫()I

    move-result v2

    invoke-virtual {v8, v2}, Ll/ۗ۠;->֨(I)V

    goto :goto_9

    .line 150
    :cond_d
    invoke-virtual {v8}, Ll/ۗ۠;->᩷֫()I

    move-result v2

    if-eq v2, v10, :cond_e

    invoke-virtual {p0}, Ll/ܶ۠;->ۨ()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 151
    invoke-virtual {p0}, Ll/ܶ۠;->ۜ()I

    move-result v2

    invoke-virtual {v8}, Ll/ۗ۠;->᩷֫()I

    move-result v11

    sub-int/2addr v2, v11

    invoke-virtual {v8, v2}, Ll/ۗ۠;->֨(I)V

    goto :goto_9

    .line 152
    :cond_e
    invoke-virtual {p0}, Ll/ܶ۠;->ۨ()Z

    move-result v2

    if-eqz v2, :cond_f

    .line 153
    invoke-virtual {v8}, Ll/ۗ۠;->ۢ֫()F

    move-result v2

    invoke-virtual {p0}, Ll/ܶ۠;->ۜ()I

    move-result v11

    int-to-float v11, v11

    mul-float v2, v2, v11

    add-float/2addr v2, v9

    float-to-int v2, v2

    .line 154
    invoke-virtual {v8, v2}, Ll/ۗ۠;->֨(I)V

    :cond_f
    :goto_9
    const/4 v2, 0x1

    goto :goto_a

    .line 158
    :cond_10
    instance-of v11, v8, Ll/ۖ۠;

    if-eqz v11, :cond_11

    .line 159
    check-cast v8, Ll/ۖ۠;

    .line 160
    invoke-virtual {v8}, Ll/ۖ۠;->ܺ֫()I

    move-result v8

    if-ne v8, v3, :cond_11

    const/4 v7, 0x1

    :cond_11
    :goto_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_12
    if-eqz v2, :cond_14

    const/4 v0, 0x0

    :goto_b
    if-ge v0, v5, :cond_14

    .line 167
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ۠;

    .line 168
    instance-of v8, v2, Ll/ۗ۠;

    if-eqz v8, :cond_13

    .line 169
    check-cast v2, Ll/ۗ۠;

    .line 170
    invoke-virtual {v2}, Ll/ۗ۠;->᩻֫()I

    move-result v8

    if-nez v8, :cond_13

    .line 171
    invoke-static {v2, p1}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;)V

    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    .line 178
    :cond_14
    invoke-static {p0, p1}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;)V

    if-eqz v7, :cond_16

    const/4 p0, 0x0

    :goto_c
    if-ge p0, v5, :cond_16

    .line 183
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ۠;

    .line 184
    instance-of v2, v0, Ll/ۖ۠;

    if-eqz v2, :cond_15

    .line 185
    check-cast v0, Ll/ۖ۠;

    .line 186
    invoke-virtual {v0}, Ll/ۖ۠;->ܺ֫()I

    move-result v2

    if-ne v2, v3, :cond_15

    .line 211
    invoke-virtual {v0}, Ll/ۖ۠;->ۜ֫()Z

    move-result v2

    if-eqz v2, :cond_15

    .line 215
    invoke-static {v0, p1}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;)V

    :cond_15
    add-int/lit8 p0, p0, 0x1

    goto :goto_c

    :cond_16
    :goto_d
    if-ge v1, v5, :cond_18

    .line 195
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶ۠;

    .line 196
    invoke-virtual {p0}, Ll/ܶ۠;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {p0}, Ll/᩻ܶ;->֫(Ll/ܶ۠;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 197
    sget-object v0, Ll/᩻ܶ;->֫:Ll/᩺۠;

    invoke-static {p0, p1, v0}, Ll/᩸۠;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/᩺۠;)V

    .line 198
    invoke-static {p0, p1, v6}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Z)V

    .line 199
    invoke-static {p0, p1}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;)V

    :cond_17
    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_18
    return-void
.end method

.method public static ֫(Ll/ܶ۠;)Z
    .locals 7

    .line 1966
    iget-object v0, p0, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    const/4 v3, 0x1

    .line 1975
    aget-object v0, v0, v3

    .line 620
    iget-object v4, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-eqz v4, :cond_0

    .line 649
    check-cast v4, Ll/᩸۠;

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    .line 1966
    iget-object v5, v4, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v5, v5, v1

    .line 650
    sget-object v5, Ll/۠۠;->᩹:Ll/۠۠;

    :cond_1
    if-eqz v4, :cond_2

    .line 1975
    iget-object v4, v4, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v4, v4, v3

    .line 651
    sget-object v4, Ll/۠۠;->᩹:Ll/۠۠;

    .line 652
    :cond_2
    sget-object v4, Ll/۠۠;->᩹:Ll/۠۠;

    const/4 v5, 0x0

    if-eq v2, v4, :cond_5

    sget-object v6, Ll/۠۠;->ۗ:Ll/۠۠;

    if-eq v2, v6, :cond_5

    sget-object v6, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v2, v6, :cond_3

    iget v2, p0, Ll/ܶ۠;->ܰ:I

    if-nez v2, :cond_3

    iget v2, p0, Ll/ܶ۠;->֡:F

    cmpl-float v2, v2, v5

    if-nez v2, :cond_3

    .line 658
    invoke-virtual {p0, v1}, Ll/ܶ۠;->ܿ(I)Z

    move-result v2

    if-nez v2, :cond_5

    .line 659
    :cond_3
    invoke-virtual {p0}, Ll/ܶ۠;->ۛ()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v2, 0x1

    :goto_2
    if-eq v0, v4, :cond_8

    .line 660
    sget-object v4, Ll/۠۠;->ۗ:Ll/۠۠;

    if-eq v0, v4, :cond_8

    sget-object v4, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v0, v4, :cond_6

    iget v0, p0, Ll/ܶ۠;->᩺:I

    if-nez v0, :cond_6

    iget v0, p0, Ll/ܶ۠;->֡:F

    cmpl-float v0, v0, v5

    if-nez v0, :cond_6

    .line 666
    invoke-virtual {p0, v3}, Ll/ܶ۠;->ܿ(I)Z

    move-result v0

    if-nez v0, :cond_8

    .line 667
    :cond_6
    invoke-virtual {p0}, Ll/ܶ۠;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    goto :goto_4

    :cond_8
    :goto_3
    const/4 v0, 0x1

    .line 668
    :goto_4
    iget p0, p0, Ll/ܶ۠;->֡:F

    cmpl-float p0, p0, v5

    if-lez p0, :cond_9

    if-nez v2, :cond_a

    if-eqz v0, :cond_9

    goto :goto_5

    :cond_9
    if-eqz v2, :cond_b

    if-eqz v0, :cond_b

    :cond_a
    :goto_5
    return v3

    :cond_b
    return v1
.end method

.method public static ۧ(Ll/ܶ۠;Ll/ܰ۠;)V
    .locals 14

    .line 353
    instance-of v0, p0, Ll/᩸۠;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ۠;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ll/᩻ܶ;->֫(Ll/ܶ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 354
    new-instance v0, Ll/᩺۠;

    .line 494
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 355
    invoke-static {p0, p1, v0}, Ll/᩸۠;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/᩺۠;)V

    .line 358
    :cond_0
    sget-object v0, Ll/֡۠;->ۨ:Ll/֡۠;

    invoke-virtual {p0, v0}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v0

    .line 359
    sget-object v1, Ll/֡۠;->᩶:Ll/֡۠;

    invoke-virtual {p0, v1}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v1

    .line 360
    invoke-virtual {v0}, Ll/ۚ۠;->ۧ()I

    move-result v2

    .line 361
    invoke-virtual {v1}, Ll/ۚ۠;->ۧ()I

    move-result v3

    .line 363
    invoke-virtual {v0}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x1

    if-eqz v4, :cond_b

    invoke-virtual {v0}, Ll/ۚ۠;->ۜ()Z

    move-result v4

    if-eqz v4, :cond_b

    .line 364
    invoke-virtual {v0}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ۠;

    .line 365
    iget-object v8, v4, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    .line 368
    invoke-static {v8}, Ll/᩻ܶ;->֫(Ll/ܶ۠;)Z

    move-result v9

    iget-object v10, v8, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iget-object v11, v8, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    .line 369
    invoke-virtual {v8}, Ll/ܶ۠;->ۤ()Z

    move-result v12

    if-eqz v12, :cond_2

    if-eqz v9, :cond_2

    .line 370
    new-instance v12, Ll/᩺۠;

    .line 494
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 371
    invoke-static {v8, p1, v12}, Ll/᩸۠;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/᩺۠;)V

    .line 1975
    :cond_2
    iget-object v12, v8, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v12, v12, v7

    .line 374
    sget-object v13, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v12, v13, :cond_7

    if-eqz v9, :cond_3

    goto :goto_1

    :cond_3
    if-ne v12, v13, :cond_1

    .line 400
    iget v9, v8, Ll/ܶ۠;->۟:I

    if-ltz v9, :cond_1

    iget v9, v8, Ll/ܶ۠;->ۧ֫:I

    if-ltz v9, :cond_1

    .line 402
    invoke-virtual {v8}, Ll/ܶ۠;->۠()I

    move-result v9

    if-eq v9, v6, :cond_4

    iget v9, v8, Ll/ܶ۠;->᩺:I

    if-nez v9, :cond_1

    .line 1302
    iget v9, v8, Ll/ܶ۠;->֡:F

    cmpl-float v9, v9, v5

    if-nez v9, :cond_1

    .line 403
    :cond_4
    invoke-virtual {v8}, Ll/ܶ۠;->۬()Z

    move-result v9

    if-nez v9, :cond_1

    invoke-virtual {v8}, Ll/ܶ۠;->۫()Z

    move-result v9

    if-nez v9, :cond_1

    if-ne v4, v10, :cond_5

    .line 404
    iget-object v9, v11, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Ll/ۚ۠;->ۜ()Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    if-ne v4, v11, :cond_1

    iget-object v4, v10, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v4, :cond_1

    .line 405
    invoke-virtual {v4}, Ll/ۚ۠;->ۜ()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 406
    :cond_6
    invoke-virtual {v8}, Ll/ܶ۠;->۬()Z

    move-result v4

    if-nez v4, :cond_1

    .line 407
    invoke-static {p0, p1, v8}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/ܶ۠;)V

    goto :goto_0

    .line 376
    :cond_7
    :goto_1
    invoke-virtual {v8}, Ll/ܶ۠;->ۤ()Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_0

    :cond_8
    if-ne v4, v10, :cond_9

    .line 383
    iget-object v9, v11, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v9, :cond_9

    .line 384
    invoke-virtual {v10}, Ll/ۚ۠;->ܽ()I

    move-result v4

    add-int/2addr v4, v2

    .line 385
    invoke-virtual {v8}, Ll/ܶ۠;->ۜ()I

    move-result v9

    add-int/2addr v9, v4

    .line 386
    invoke-virtual {v8, v4, v9}, Ll/ܶ۠;->ۧ(II)V

    .line 387
    invoke-static {v8, p1}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;)V

    goto/16 :goto_0

    :cond_9
    if-ne v4, v11, :cond_a

    .line 388
    iget-object v9, v11, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v9, :cond_a

    .line 389
    invoke-virtual {v11}, Ll/ۚ۠;->ܽ()I

    move-result v4

    sub-int v4, v2, v4

    .line 390
    invoke-virtual {v8}, Ll/ܶ۠;->ۜ()I

    move-result v9

    sub-int v9, v4, v9

    .line 391
    invoke-virtual {v8, v9, v4}, Ll/ܶ۠;->ۧ(II)V

    .line 392
    invoke-static {v8, p1}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;)V

    goto/16 :goto_0

    :cond_a
    if-ne v4, v10, :cond_1

    .line 393
    iget-object v4, v11, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v4, :cond_1

    .line 394
    invoke-virtual {v4}, Ll/ۚ۠;->ۜ()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 395
    invoke-static {v8, p1}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;)V

    goto/16 :goto_0

    .line 412
    :cond_b
    instance-of v0, p0, Ll/ۗ۠;

    if-eqz v0, :cond_c

    goto/16 :goto_6

    .line 415
    :cond_c
    invoke-virtual {v1}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-virtual {v1}, Ll/ۚ۠;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 416
    invoke-virtual {v1}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_d
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ۠;

    .line 417
    iget-object v2, v1, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    .line 418
    invoke-static {v2}, Ll/᩻ܶ;->֫(Ll/ܶ۠;)Z

    move-result v4

    iget-object v8, v2, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iget-object v9, v2, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    .line 419
    invoke-virtual {v2}, Ll/ܶ۠;->ۤ()Z

    move-result v10

    if-eqz v10, :cond_e

    if-eqz v4, :cond_e

    .line 420
    new-instance v10, Ll/᩺۠;

    .line 494
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 421
    invoke-static {v2, p1, v10}, Ll/᩸۠;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/᩺۠;)V

    :cond_e
    if-ne v1, v8, :cond_f

    .line 426
    iget-object v10, v9, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v10, :cond_f

    invoke-virtual {v10}, Ll/ۚ۠;->ۜ()Z

    move-result v10

    if-nez v10, :cond_10

    :cond_f
    if-ne v1, v9, :cond_11

    iget-object v10, v8, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v10, :cond_11

    .line 427
    invoke-virtual {v10}, Ll/ۚ۠;->ۜ()Z

    move-result v10

    if-eqz v10, :cond_11

    :cond_10
    const/4 v10, 0x1

    goto :goto_3

    :cond_11
    const/4 v10, 0x0

    .line 1975
    :goto_3
    iget-object v11, v2, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v11, v11, v7

    .line 428
    sget-object v12, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v11, v12, :cond_14

    if-eqz v4, :cond_12

    goto :goto_4

    :cond_12
    if-ne v11, v12, :cond_d

    .line 450
    iget v1, v2, Ll/ܶ۠;->۟:I

    if-ltz v1, :cond_d

    iget v1, v2, Ll/ܶ۠;->ۧ֫:I

    if-ltz v1, :cond_d

    .line 452
    invoke-virtual {v2}, Ll/ܶ۠;->۠()I

    move-result v1

    if-eq v1, v6, :cond_13

    iget v1, v2, Ll/ܶ۠;->᩺:I

    if-nez v1, :cond_d

    .line 1302
    iget v1, v2, Ll/ܶ۠;->֡:F

    cmpl-float v1, v1, v5

    if-nez v1, :cond_d

    .line 453
    :cond_13
    invoke-virtual {v2}, Ll/ܶ۠;->۬()Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {v2}, Ll/ܶ۠;->۫()Z

    move-result v1

    if-nez v1, :cond_d

    if-eqz v10, :cond_d

    .line 454
    invoke-virtual {v2}, Ll/ܶ۠;->۬()Z

    move-result v1

    if-nez v1, :cond_d

    .line 455
    invoke-static {p0, p1, v2}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/ܶ۠;)V

    goto :goto_2

    .line 430
    :cond_14
    :goto_4
    invoke-virtual {v2}, Ll/ܶ۠;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_15

    goto/16 :goto_2

    :cond_15
    if-ne v1, v8, :cond_16

    .line 437
    iget-object v4, v9, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v4, :cond_16

    .line 438
    invoke-virtual {v8}, Ll/ۚ۠;->ܽ()I

    move-result v1

    add-int/2addr v1, v3

    .line 439
    invoke-virtual {v2}, Ll/ܶ۠;->ۜ()I

    move-result v4

    add-int/2addr v4, v1

    .line 440
    invoke-virtual {v2, v1, v4}, Ll/ܶ۠;->ۧ(II)V

    .line 441
    invoke-static {v2, p1}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;)V

    goto/16 :goto_2

    :cond_16
    if-ne v1, v9, :cond_17

    .line 442
    iget-object v1, v8, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v1, :cond_17

    .line 443
    invoke-virtual {v9}, Ll/ۚ۠;->ܽ()I

    move-result v1

    sub-int v1, v3, v1

    .line 444
    invoke-virtual {v2}, Ll/ܶ۠;->ۜ()I

    move-result v4

    sub-int v4, v1, v4

    .line 445
    invoke-virtual {v2, v4, v1}, Ll/ܶ۠;->ۧ(II)V

    .line 446
    invoke-static {v2, p1}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;)V

    goto/16 :goto_2

    :cond_17
    if-eqz v10, :cond_d

    .line 447
    invoke-virtual {v2}, Ll/ܶ۠;->۬()Z

    move-result v1

    if-nez v1, :cond_d

    .line 448
    invoke-static {v2, p1}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;)V

    goto/16 :goto_2

    .line 461
    :cond_18
    sget-object v0, Ll/֡۠;->᩹:Ll/֡۠;

    invoke-virtual {p0, v0}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object p0

    .line 462
    invoke-virtual {p0}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {p0}, Ll/ۚ۠;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 463
    invoke-virtual {p0}, Ll/ۚ۠;->ۧ()I

    move-result v0

    .line 464
    invoke-virtual {p0}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_19
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ۠;

    .line 465
    iget-object v2, v1, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    .line 466
    invoke-static {v2}, Ll/᩻ܶ;->֫(Ll/ܶ۠;)Z

    move-result v3

    .line 467
    invoke-virtual {v2}, Ll/ܶ۠;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_1a

    if-eqz v3, :cond_1a

    .line 468
    new-instance v4, Ll/᩺۠;

    .line 494
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 469
    invoke-static {v2, p1, v4}, Ll/᩸۠;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/᩺۠;)V

    .line 1975
    :cond_1a
    iget-object v4, v2, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v4, v4, v7

    .line 471
    sget-object v5, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v4, v5, :cond_1b

    if-eqz v3, :cond_19

    .line 473
    :cond_1b
    invoke-virtual {v2}, Ll/ܶ۠;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_1c

    goto :goto_5

    .line 480
    :cond_1c
    iget-object v3, v2, Ll/ܶ۠;->ۜ:Ll/ۚ۠;

    if-ne v1, v3, :cond_19

    .line 481
    invoke-virtual {v2, v0}, Ll/ܶ۠;->᩻(I)V

    .line 482
    :try_start_0
    invoke-static {v2, p1}, Ll/᩻ܶ;->ۧ(Ll/ܶ۠;Ll/ܰ۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p0

    throw p0

    :cond_1d
    :goto_6
    return-void
.end method

.method public static ۧ(Ll/ܶ۠;Ll/ܰ۠;Z)V
    .locals 6

    .line 499
    invoke-virtual {p0}, Ll/ܶ۠;->᩷()F

    move-result v0

    .line 500
    iget-object v1, p0, Ll/ܶ۠;->۫:Ll/ۚ۠;

    iget-object v2, v1, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    invoke-virtual {v2}, Ll/ۚ۠;->ۧ()I

    move-result v2

    .line 501
    iget-object v3, p0, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    iget-object v4, v3, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    invoke-virtual {v4}, Ll/ۚ۠;->ۧ()I

    move-result v4

    .line 502
    invoke-virtual {v1}, Ll/ۚ۠;->ܽ()I

    move-result v1

    add-int/2addr v1, v2

    .line 503
    invoke-virtual {v3}, Ll/ۚ۠;->ܽ()I

    move-result v3

    sub-int v3, v4, v3

    const/high16 v5, 0x3f000000    # 0.5f

    if-ne v2, v4, :cond_0

    const/high16 v0, 0x3f000000    # 0.5f

    goto :goto_0

    :cond_0
    move v2, v1

    move v4, v3

    .line 509
    :goto_0
    invoke-virtual {p0}, Ll/ܶ۠;->ܶ()I

    move-result v1

    sub-int v3, v4, v2

    sub-int/2addr v3, v1

    if-le v2, v4, :cond_1

    sub-int v3, v2, v4

    sub-int/2addr v3, v1

    :cond_1
    int-to-float v3, v3

    mul-float v0, v0, v3

    add-float/2addr v0, v5

    float-to-int v0, v0

    add-int/2addr v0, v2

    add-int v3, v0, v1

    if-le v2, v4, :cond_2

    sub-int v3, v0, v1

    .line 521
    :cond_2
    invoke-virtual {p0, v0, v3}, Ll/ܶ۠;->֫(II)V

    .line 522
    invoke-static {p0, p1, p2}, Ll/᩻ܶ;->֫(Ll/ܶ۠;Ll/ܰ۠;Z)V

    return-void
.end method
