.class public final Ll/᩹ܳ֫;
.super Ll/ۗ᩷֫;
.source "RB93"


# direct methods
.method public static ֫(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    .line 798
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 799
    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    .line 800
    invoke-static {v0}, Ll/ۡ᩺;->֫(Landroid/view/ViewGroup;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 801
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    .line 802
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 805
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_3

    .line 807
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 808
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    .line 809
    invoke-static {v2, p1}, Ll/᩹ܳ֫;->֫(Landroid/view/View;Ljava/util/ArrayList;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 814
    :cond_2
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 815
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method

.method public static ֫(Ll/ۖ᩵;Landroid/view/View;)V
    .locals 4

    .line 825
    invoke-static {p1}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 827
    invoke-virtual {p0, v0, p1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 829
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 830
    check-cast p1, Landroid/view/ViewGroup;

    .line 831
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 833
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 834
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    .line 835
    invoke-static {p0, v2}, Ll/᩹ܳ֫;->֫(Ll/ۖ᩵;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ֫(Ll/ۖ᩵;Ljava/util/Collection;)V
    .locals 1

    .line 780
    invoke-virtual {p0}, Ll/ۖ᩵;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 781
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 782
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 783
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 784
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/ArrayList;Z)V
    .locals 29

    move-object/from16 v0, p1

    move/from16 v1, p2

    .line 61
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙ᩷֫;

    .line 62
    invoke-virtual {v5}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v9

    iget-object v9, v9, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-static {v9}, Ll/᩶᩷֫;->ۧ(Landroid/view/View;)Ll/᩶᩷֫;

    move-result-object v9

    .line 63
    sget-object v10, Ll/᩷ܳ֫;->֫:[I

    invoke-virtual {v5}, Ll/ۙ᩷֫;->ܽ()Ll/᩶᩷֫;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v10, v10, v11

    if-eq v10, v8, :cond_2

    if-eq v10, v7, :cond_2

    const/4 v7, 0x3

    if-eq v10, v7, :cond_2

    if-eq v10, v6, :cond_1

    goto :goto_0

    .line 73
    :cond_1
    sget-object v6, Ll/᩶᩷֫;->ۗ:Ll/᩶᩷֫;

    if-eq v9, v6, :cond_0

    move-object v4, v5

    goto :goto_0

    .line 67
    :cond_2
    sget-object v6, Ll/᩶᩷֫;->ۗ:Ll/᩶᩷֫;

    if-ne v9, v6, :cond_0

    if-nez v3, :cond_0

    move-object v3, v5

    goto :goto_0

    .line 80
    :cond_3
    invoke-static {v7}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 81
    invoke-static {v3}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v4}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 87
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 88
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 0
    invoke-static {v0, v8}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v7

    .line 144
    check-cast v7, Ll/ۙ᩷֫;

    invoke-virtual {v7}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v7

    .line 146
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۙ᩷֫;

    .line 147
    invoke-virtual {v9}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v10

    iget-object v10, v10, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    iget-object v11, v7, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    iget v11, v11, Ll/ܳ᩻֫;->ܽ:I

    iput v11, v10, Ll/ܳ᩻֫;->ܽ:I

    .line 149
    invoke-virtual {v9}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v10

    iget-object v10, v10, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    iget-object v11, v7, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    iget v11, v11, Ll/ܳ᩻֫;->ܳ:I

    iput v11, v10, Ll/ܳ᩻֫;->ܳ:I

    .line 151
    invoke-virtual {v9}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v10

    iget-object v10, v10, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    iget-object v11, v7, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    iget v11, v11, Ll/ܳ᩻֫;->ۡ:I

    iput v11, v10, Ll/ܳ᩻֫;->ۡ:I

    .line 153
    invoke-virtual {v9}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v9

    iget-object v9, v9, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    iget-object v10, v7, Ll/ۡ᩻֫;->mAnimationInfo:Ll/ܳ᩻֫;

    iget v10, v10, Ll/ܳ᩻֫;->ܺ:I

    iput v10, v9, Ll/ܳ᩻֫;->ܺ:I

    goto :goto_1

    .line 93
    :cond_5
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۙ᩷֫;

    .line 95
    new-instance v8, Ll/᩻۫;

    invoke-direct {v8}, Ll/᩻۫;-><init>()V

    .line 96
    invoke-virtual {v7, v8}, Ll/ۙ᩷֫;->ۧ(Ll/᩻۫;)V

    .line 98
    new-instance v9, Ll/۠ܳ֫;

    invoke-direct {v9, v7, v8, v1}, Ll/۠ܳ֫;-><init>(Ll/ۙ᩷֫;Ll/᩻۫;Z)V

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    new-instance v8, Ll/᩻۫;

    invoke-direct {v8}, Ll/᩻۫;-><init>()V

    .line 102
    invoke-virtual {v7, v8}, Ll/ۙ᩷֫;->ۧ(Ll/᩻۫;)V

    .line 104
    new-instance v9, Ll/᩸ܳ֫;

    if-eqz v1, :cond_6

    if-ne v7, v3, :cond_7

    goto :goto_3

    :cond_6
    if-ne v7, v4, :cond_7

    :goto_3
    const/4 v10, 0x1

    goto :goto_4

    :cond_7
    const/4 v10, 0x0

    .line 105
    :goto_4
    invoke-direct {v9, v7, v8, v1, v10}, Ll/᩸ܳ֫;-><init>(Ll/ۙ᩷֫;Ll/᩻۫;ZZ)V

    .line 104
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    new-instance v8, Ll/ۢܳ֫;

    move-object/from16 v9, p0

    invoke-direct {v8, v9, v6, v7}, Ll/ۢܳ֫;-><init>(Ll/᩹ܳ֫;Ljava/util/ArrayList;Ll/ۙ᩷֫;)V

    invoke-virtual {v7, v8}, Ll/ۙ᩷֫;->֫(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_8
    move-object/from16 v9, p0

    .line 345
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 348
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v8, 0x0

    :cond_9
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩸ܳ֫;

    .line 349
    invoke-virtual {v10}, Ll/ܶܳ֫;->ᩳ()Z

    move-result v11

    if-eqz v11, :cond_a

    goto :goto_5

    .line 353
    :cond_a
    invoke-virtual {v10}, Ll/᩸ܳ֫;->ܿ()Ll/ܺ᩷֫;

    move-result-object v11

    if-nez v8, :cond_b

    move-object v8, v11

    goto :goto_5

    :cond_b
    if-eqz v11, :cond_9

    if-ne v8, v11, :cond_c

    goto :goto_5

    .line 357
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 359
    invoke-virtual {v10}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " returned Transition "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    invoke-virtual {v10}, Ll/᩸ܳ֫;->᩻()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " which uses a different Transition  type than other Fragments."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    if-nez v8, :cond_f

    .line 366
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸ܳ֫;

    .line 367
    invoke-virtual {v5}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object v8

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    invoke-virtual {v5}, Ll/ܶܳ֫;->֫()V

    goto :goto_6

    :cond_e
    move-object v5, v0

    move-object/from16 v23, v2

    move-object v10, v6

    goto/16 :goto_1a

    .line 376
    :cond_f
    new-instance v15, Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩷֫;->ܽ()Landroid/view/ViewGroup;

    move-result-object v10

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-direct {v15, v10}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 382
    new-instance v14, Landroid/graphics/Rect;

    invoke-direct {v14}, Landroid/graphics/Rect;-><init>()V

    .line 383
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 384
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 385
    new-instance v11, Ll/ۖ᩵;

    invoke-direct {v11}, Ll/ۖ᩵;-><init>()V

    .line 386
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v10, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v10, v17

    move-object/from16 v22, v18

    const/16 v17, 0x0

    :goto_7
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_1d

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ll/᩸ܳ֫;

    .line 387
    invoke-virtual/range {v18 .. v18}, Ll/᩸ܳ֫;->ۜ()Z

    move-result v19

    if-eqz v19, :cond_1c

    if-eqz v3, :cond_1c

    if-eqz v4, :cond_1c

    .line 393
    invoke-virtual/range {v18 .. v18}, Ll/᩸ܳ֫;->ܳ()Ljava/lang/Object;

    move-result-object v10

    .line 392
    invoke-virtual {v8, v10}, Ll/ܺ᩷֫;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .line 391
    invoke-virtual {v8, v10}, Ll/ܺ᩷֫;->ܽ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .line 396
    invoke-virtual {v4}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v18

    .line 397
    invoke-virtual/range {v18 .. v18}, Ll/ۡ᩻֫;->getSharedElementSourceNames()Ljava/util/ArrayList;

    move-result-object v7

    .line 400
    invoke-virtual {v3}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v18

    .line 401
    invoke-virtual/range {v18 .. v18}, Ll/ۡ᩻֫;->getSharedElementSourceNames()Ljava/util/ArrayList;

    move-result-object v9

    .line 402
    invoke-virtual {v3}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v18

    move-object/from16 v23, v2

    .line 403
    invoke-virtual/range {v18 .. v18}, Ll/ۡ᩻֫;->getSharedElementTargetNames()Ljava/util/ArrayList;

    move-result-object v2

    const/16 v18, 0x0

    move-object/from16 v18, v5

    move-object/from16 v24, v6

    const/4 v6, 0x0

    .line 406
    :goto_8
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v6, v5, :cond_11

    .line 407
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v19, v2

    const/4 v2, -0x1

    if-eq v5, v2, :cond_10

    .line 411
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v7, v5, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_10
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v2, v19

    goto :goto_8

    .line 414
    :cond_11
    invoke-virtual {v4}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v2

    .line 415
    invoke-virtual {v2}, Ll/ۡ᩻֫;->getSharedElementTargetNames()Ljava/util/ArrayList;

    move-result-object v2

    if-nez v1, :cond_12

    .line 421
    invoke-virtual {v3}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۡ᩻֫;->getExitTransitionCallback()Ll/᩻ۙ;

    .line 422
    invoke-virtual {v4}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۡ᩻֫;->getEnterTransitionCallback()Ll/᩻ۙ;

    goto :goto_9

    .line 426
    :cond_12
    invoke-virtual {v3}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۡ᩻֫;->getEnterTransitionCallback()Ll/᩻ۙ;

    .line 427
    invoke-virtual {v4}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۡ᩻֫;->getExitTransitionCallback()Ll/᩻ۙ;

    .line 429
    :goto_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_a
    if-ge v6, v5, :cond_13

    .line 431
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 432
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move/from16 v20, v5

    move-object/from16 v5, v19

    check-cast v5, Ljava/lang/String;

    .line 433
    invoke-virtual {v11, v9, v5}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    move/from16 v5, v20

    goto :goto_a

    :cond_13
    const/4 v5, 0x2

    .line 436
    invoke-static {v5}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v6

    if-eqz v6, :cond_15

    .line 438
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_b

    .line 442
    :cond_14
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_c

    .line 449
    :cond_15
    new-instance v5, Ll/ۖ᩵;

    invoke-direct {v5}, Ll/ۖ᩵;-><init>()V

    .line 450
    invoke-virtual {v3}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v6

    iget-object v6, v6, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-static {v5, v6}, Ll/᩹ܳ֫;->֫(Ll/ۖ᩵;Landroid/view/View;)V

    .line 451
    invoke-virtual {v5, v7}, Ll/ۖ᩵;->֫(Ljava/util/Collection;)V

    .line 472
    invoke-virtual {v5}, Ll/ۖ᩵;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-virtual {v11, v6}, Ll/ۖ᩵;->֫(Ljava/util/Collection;)V

    .line 477
    new-instance v6, Ll/ۖ᩵;

    invoke-direct {v6}, Ll/ۖ᩵;-><init>()V

    .line 478
    invoke-virtual {v4}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v9

    iget-object v9, v9, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-static {v6, v9}, Ll/᩹ܳ֫;->֫(Ll/ۖ᩵;Landroid/view/View;)V

    .line 479
    invoke-virtual {v6, v2}, Ll/ۖ᩵;->֫(Ljava/util/Collection;)V

    .line 480
    invoke-virtual {v11}, Ll/ۖ᩵;->values()Ljava/util/Collection;

    move-result-object v9

    invoke-virtual {v6, v9}, Ll/ۖ᩵;->֫(Ljava/util/Collection;)V

    .line 508
    sget-object v9, Ll/ᩳ᩷֫;->֫:Ll/ܺ᩷֫;

    .line 71
    invoke-virtual {v11}, Ll/ۗ᩵;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    :goto_d
    if-ltz v9, :cond_17

    .line 72
    invoke-virtual {v11, v9}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v25, v0

    move-object/from16 v0, v19

    check-cast v0, Ljava/lang/String;

    .line 73
    invoke-virtual {v6, v0}, Ll/ۗ᩵;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    .line 74
    invoke-virtual {v11, v9}, Ll/ۗ᩵;->ܿ(I)Ljava/lang/Object;

    :cond_16
    add-int/lit8 v9, v9, -0x1

    move-object/from16 v0, v25

    goto :goto_d

    :cond_17
    move-object/from16 v25, v0

    .line 513
    invoke-virtual {v11}, Ll/ۖ᩵;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v5, v0}, Ll/᩹ܳ֫;->֫(Ll/ۖ᩵;Ljava/util/Collection;)V

    .line 514
    invoke-virtual {v11}, Ll/ۖ᩵;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v6, v0}, Ll/᩹ܳ֫;->֫(Ll/ۖ᩵;Ljava/util/Collection;)V

    .line 516
    invoke-virtual {v11}, Ll/ۗ᩵;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 520
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 521
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    move-object v10, v0

    move-object v6, v11

    move-object v7, v12

    move-object v0, v13

    move-object v2, v14

    move-object v9, v15

    move-object/from16 v15, v25

    goto/16 :goto_10

    .line 526
    :cond_18
    invoke-virtual {v4}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v0

    invoke-virtual {v3}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v9

    if-eqz v1, :cond_19

    .line 94
    invoke-virtual {v9}, Ll/ۡ᩻֫;->getEnterTransitionCallback()Ll/᩻ۙ;

    goto :goto_e

    .line 95
    :cond_19
    invoke-virtual {v0}, Ll/ۡ᩻֫;->getEnterTransitionCallback()Ll/᩻ۙ;

    .line 530
    :goto_e
    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩷֫;->ܽ()Landroid/view/ViewGroup;

    move-result-object v0

    new-instance v9, Ll/᩵ܳ֫;

    invoke-direct {v9, v4, v3, v1, v6}, Ll/᩵ܳ֫;-><init>(Ll/ۙ᩷֫;Ll/ۙ᩷֫;ZLl/ۖ᩵;)V

    invoke-static {v0, v9}, Ll/ܳۨ;->֫(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 539
    invoke-virtual {v5}, Ll/ۖ᩵;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 542
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1a

    const/4 v0, 0x0

    .line 543
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const/4 v9, 0x0

    .line 369
    invoke-virtual {v5, v7, v9}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 544
    check-cast v5, Landroid/view/View;

    .line 545
    invoke-virtual {v8, v5, v10}, Ll/ܺ᩷֫;->ۧ(Landroid/view/View;Ljava/lang/Object;)V

    move-object/from16 v22, v5

    goto :goto_f

    :cond_1a
    const/4 v0, 0x0

    const/4 v9, 0x0

    .line 549
    :goto_f
    invoke-virtual {v6}, Ll/ۖ᩵;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 552
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1b

    .line 553
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 369
    invoke-virtual {v6, v0, v9}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 554
    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1b

    .line 561
    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩷֫;->ܽ()Landroid/view/ViewGroup;

    move-result-object v2

    new-instance v5, Ll/֡ܳ֫;

    invoke-direct {v5, v8, v0, v14}, Ll/֡ܳ֫;-><init>(Ll/ܺ᩷֫;Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v2, v5}, Ll/ܳۨ;->֫(Landroid/view/View;Ljava/lang/Runnable;)V

    const/16 v17, 0x1

    .line 574
    :cond_1b
    invoke-virtual {v8, v10, v15, v13}, Ll/ܺ᩷֫;->ۧ(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    const/4 v0, 0x0

    const/4 v2, 0x0

    move-object v5, v10

    move-object v10, v8

    move-object v6, v11

    move-object v11, v5

    move-object v7, v12

    move-object v12, v0

    move-object v0, v13

    move-object v13, v2

    move-object v2, v14

    move-object v14, v5

    move-object v9, v15

    move-object v15, v7

    .line 579
    invoke-virtual/range {v10 .. v15}, Ll/ܺ᩷֫;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 584
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v15, v25

    invoke-virtual {v15, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    invoke-virtual {v15, v4, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v10, v5

    goto :goto_10

    :cond_1c
    move-object/from16 v23, v2

    move-object/from16 v18, v5

    move-object/from16 v24, v6

    move-object v6, v11

    move-object v7, v12

    move-object v2, v14

    move-object v9, v15

    move-object v15, v0

    move-object v0, v13

    :goto_10
    move-object v13, v0

    move-object v14, v2

    move-object v11, v6

    move-object v12, v7

    move-object v0, v15

    move-object/from16 v5, v18

    move-object/from16 v2, v23

    move-object/from16 v6, v24

    move-object v15, v9

    move-object/from16 v9, p0

    goto/16 :goto_7

    :cond_1d
    move-object/from16 v23, v2

    move-object/from16 v18, v5

    move-object/from16 v24, v6

    move-object v6, v11

    move-object v7, v12

    move-object v2, v14

    move-object v9, v15

    move-object v15, v0

    move-object v0, v13

    .line 589
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 595
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v14, v11

    move-object v13, v12

    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v16, v11

    check-cast v16, Ll/᩸ܳ֫;

    .line 596
    invoke-virtual/range {v16 .. v16}, Ll/ܶܳ֫;->ᩳ()Z

    move-result v11

    if-eqz v11, :cond_1e

    .line 598
    invoke-virtual/range {v16 .. v16}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object v11

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v15, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    invoke-virtual/range {v16 .. v16}, Ll/ܶܳ֫;->֫()V

    goto :goto_11

    .line 602
    :cond_1e
    invoke-virtual/range {v16 .. v16}, Ll/᩸ܳ֫;->᩻()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v8, v11}, Ll/ܺ᩷֫;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    .line 603
    invoke-virtual/range {v16 .. v16}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object v11

    if-eqz v10, :cond_20

    if-eq v11, v3, :cond_1f

    if-ne v11, v4, :cond_20

    :cond_1f
    const/16 v19, 0x1

    goto :goto_12

    :cond_20
    const/16 v19, 0x0

    :goto_12
    if-nez v12, :cond_22

    if-nez v19, :cond_21

    .line 612
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v15, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    invoke-virtual/range {v16 .. v16}, Ll/ܶܳ֫;->֫()V

    :cond_21
    move-object/from16 v25, v0

    move-object/from16 p2, v5

    move-object/from16 v28, v6

    move-object/from16 v27, v9

    move-object/from16 v26, v10

    move-object v5, v15

    move-object/from16 v0, v22

    move-object/from16 v10, v24

    goto/16 :goto_17

    :cond_22
    move-object/from16 v25, v15

    .line 617
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 p2, v5

    .line 619
    invoke-virtual {v11}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v5

    iget-object v5, v5, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    .line 618
    invoke-static {v5, v15}, Ll/᩹ܳ֫;->֫(Landroid/view/View;Ljava/util/ArrayList;)V

    if-eqz v19, :cond_24

    if-ne v11, v3, :cond_23

    .line 623
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    goto :goto_13

    .line 625
    :cond_23
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 628
    :cond_24
    :goto_13
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_25

    .line 629
    invoke-virtual {v8, v9, v12}, Ll/ܺ᩷֫;->֫(Landroid/view/View;Ljava/lang/Object;)V

    move-object/from16 v28, v6

    move-object/from16 v27, v9

    move-object/from16 v26, v10

    move-object v9, v13

    move-object v6, v14

    move-object/from16 v10, v24

    move-object/from16 v5, v25

    move-object/from16 v25, v0

    move-object v14, v12

    move-object v0, v15

    goto :goto_14

    .line 631
    :cond_25
    invoke-virtual {v8, v12, v15}, Ll/ܺ᩷֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;)V

    const/4 v5, 0x0

    const/16 v19, 0x0

    move-object/from16 v26, v10

    move-object v10, v8

    move-object/from16 v20, v11

    move-object v11, v12

    move-object/from16 v21, v12

    move-object/from16 v27, v9

    move-object v9, v13

    move-object v13, v15

    move-object/from16 v28, v6

    move-object v6, v14

    move-object v14, v5

    move-object/from16 v5, v25

    move-object/from16 v25, v0

    move-object v0, v15

    move-object/from16 v15, v19

    .line 632
    invoke-virtual/range {v10 .. v15}, Ll/ܺ᩷֫;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 635
    invoke-virtual/range {v20 .. v20}, Ll/ۙ᩷֫;->ܽ()Ll/᩶᩷֫;

    move-result-object v10

    sget-object v11, Ll/᩶᩷֫;->᩹:Ll/᩶᩷֫;

    if-ne v10, v11, :cond_26

    move-object/from16 v11, v20

    move-object/from16 v10, v24

    .line 639
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 642
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 644
    invoke-virtual {v11}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v13

    iget-object v13, v13, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 646
    invoke-virtual {v11}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v13

    iget-object v13, v13, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    move-object/from16 v14, v21

    .line 645
    invoke-virtual {v8, v14, v13, v12}, Ll/ܺ᩷֫;->֫(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 653
    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩷֫;->ܽ()Landroid/view/ViewGroup;

    move-result-object v12

    new-instance v13, Ll/ۚܳ֫;

    invoke-direct {v13, v0}, Ll/ۚܳ֫;-><init>(Ljava/util/ArrayList;)V

    invoke-static {v12, v13}, Ll/ܳۨ;->֫(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_14

    :cond_26
    move-object/from16 v11, v20

    move-object/from16 v14, v21

    move-object/from16 v10, v24

    .line 662
    :goto_14
    invoke-virtual {v11}, Ll/ۙ᩷֫;->ܽ()Ll/᩶᩷֫;

    move-result-object v12

    sget-object v13, Ll/᩶᩷֫;->ۗ:Ll/᩶᩷֫;

    if-ne v12, v13, :cond_28

    .line 663
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz v17, :cond_27

    .line 665
    invoke-virtual {v8, v14, v2}, Ll/ܺ᩷֫;->֫(Ljava/lang/Object;Landroid/graphics/Rect;)V

    :cond_27
    move-object/from16 v0, v22

    goto :goto_15

    :cond_28
    move-object/from16 v0, v22

    .line 668
    invoke-virtual {v8, v0, v14}, Ll/ܺ᩷֫;->ۧ(Landroid/view/View;Ljava/lang/Object;)V

    .line 670
    :goto_15
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v5, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 672
    invoke-virtual/range {v16 .. v16}, Ll/᩸ܳ֫;->᩷()Z

    move-result v11

    if-eqz v11, :cond_29

    .line 674
    invoke-virtual {v8, v6, v14}, Ll/ܺ᩷֫;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_16

    .line 678
    :cond_29
    invoke-virtual {v8, v9, v14}, Ll/ܺ᩷֫;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    :goto_16
    move-object v14, v6

    move-object v13, v9

    :goto_17
    move-object/from16 v22, v0

    move-object v15, v5

    move-object/from16 v24, v10

    move-object/from16 v0, v25

    move-object/from16 v10, v26

    move-object/from16 v9, v27

    move-object/from16 v6, v28

    move-object/from16 v5, p2

    goto/16 :goto_11

    :cond_2a
    move-object/from16 v25, v0

    move-object/from16 v28, v6

    move-object v11, v10

    move-object v9, v13

    move-object v6, v14

    move-object v5, v15

    move-object/from16 v10, v24

    .line 686
    invoke-virtual {v8, v6, v9, v11}, Ll/ܺ᩷֫;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2b

    goto/16 :goto_1a

    .line 697
    :cond_2b
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2c
    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_33

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩸ܳ֫;

    .line 698
    invoke-virtual {v6}, Ll/ܶܳ֫;->ᩳ()Z

    move-result v9

    if-eqz v9, :cond_2d

    goto :goto_18

    .line 702
    :cond_2d
    invoke-virtual {v6}, Ll/᩸ܳ֫;->᩻()Ljava/lang/Object;

    move-result-object v9

    .line 703
    invoke-virtual {v6}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object v12

    if-eqz v11, :cond_2f

    if-eq v12, v3, :cond_2e

    if-ne v12, v4, :cond_2f

    :cond_2e
    const/4 v13, 0x1

    goto :goto_19

    :cond_2f
    const/4 v13, 0x0

    :goto_19
    if-nez v9, :cond_30

    if-eqz v13, :cond_2c

    .line 709
    :cond_30
    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩷֫;->ܽ()Landroid/view/ViewGroup;

    move-result-object v9

    sget v13, Ll/ܿ᩺;->֫:I

    .line 3941
    invoke-virtual {v9}, Landroid/view/View;->isLaidOut()Z

    move-result v9

    if-nez v9, :cond_32

    const/4 v9, 0x2

    .line 710
    invoke-static {v9}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v13

    if-eqz v13, :cond_31

    .line 712
    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩷֫;->ܽ()Landroid/view/ViewGroup;

    move-result-object v9

    invoke-static {v9}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v12}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 716
    :cond_31
    invoke-virtual {v6}, Ll/ܶܳ֫;->֫()V

    goto :goto_18

    .line 719
    :cond_32
    invoke-virtual {v6}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    invoke-virtual {v6}, Ll/ܶܳ֫;->ܽ()Ll/᩻۫;

    move-result-object v9

    new-instance v13, Ll/֨ܳ֫;

    invoke-direct {v13, v6, v12}, Ll/֨ܳ֫;-><init>(Ll/᩸ܳ֫;Ll/ۙ᩷֫;)V

    .line 718
    invoke-virtual {v8, v0, v9, v13}, Ll/ܺ᩷֫;->֫(Ljava/lang/Object;Ll/᩻۫;Ljava/lang/Runnable;)V

    goto :goto_18

    .line 738
    :cond_33
    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩷֫;->ܽ()Landroid/view/ViewGroup;

    move-result-object v2

    sget v6, Ll/ܿ᩺;->֫:I

    .line 3941
    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    move-result v2

    if-nez v2, :cond_34

    :goto_1a
    move-object/from16 v24, v3

    move-object/from16 v22, v4

    goto/16 :goto_21

    :cond_34
    const/4 v2, 0x4

    .line 743
    invoke-static {v1, v2}, Ll/ᩳ᩷֫;->֫(Ljava/util/ArrayList;I)V

    .line 159
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 160
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v9, 0x0

    :goto_1b
    if-ge v9, v6, :cond_35

    .line 162
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    .line 163
    invoke-static {v12}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v13, 0x0

    .line 164
    invoke-static {v12, v13}, Ll/ܿ᩺;->֫(Landroid/view/View;Ljava/lang/String;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1b

    :cond_35
    const/4 v9, 0x2

    .line 746
    invoke-static {v9}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v6

    if-eqz v6, :cond_37

    .line 749
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_36

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    .line 750
    invoke-static {v9}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 751
    invoke-static {v9}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    goto :goto_1c

    .line 754
    :cond_36
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_37

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    .line 755
    invoke-static {v9}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 756
    invoke-static {v9}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    goto :goto_1d

    .line 760
    :cond_37
    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩷֫;->ܽ()Landroid/view/ViewGroup;

    move-result-object v6

    invoke-virtual {v8, v6, v0}, Ll/ܺ᩷֫;->֫(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 761
    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩷֫;->ܽ()Landroid/view/ViewGroup;

    move-result-object v0

    .line 178
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 179
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v12, 0x0

    :goto_1e
    if-ge v12, v6, :cond_3b

    move-object/from16 v13, v25

    .line 182
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    .line 183
    invoke-static {v14}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v15

    .line 184
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v15, :cond_38

    move-object/from16 v24, v3

    move-object/from16 v22, v4

    goto :goto_20

    :cond_38
    move-object/from16 v22, v4

    const/4 v4, 0x0

    .line 188
    invoke-static {v14, v4}, Ll/ܿ᩺;->֫(Landroid/view/View;Ljava/lang/String;)V

    move-object/from16 v14, v28

    .line 369
    invoke-virtual {v14, v15, v4}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 189
    check-cast v4, Ljava/lang/String;

    const/16 v16, 0x0

    const/4 v14, 0x0

    :goto_1f
    move-object/from16 v24, v3

    if-ge v14, v6, :cond_3a

    .line 191
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_39

    .line 192
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-static {v3, v15}, Ll/ܿ᩺;->֫(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_20

    :cond_39
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v3, v24

    goto :goto_1f

    :cond_3a
    :goto_20
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v25, v13

    move-object/from16 v4, v22

    move-object/from16 v3, v24

    goto :goto_1e

    :cond_3b
    move-object/from16 v24, v3

    move-object/from16 v22, v4

    move-object/from16 v13, v25

    .line 198
    new-instance v3, Ll/ۡ᩷֫;

    move-object/from16 v16, v3

    move/from16 v17, v6

    move-object/from16 v18, v7

    move-object/from16 v19, v2

    move-object/from16 v20, v13

    move-object/from16 v21, v9

    invoke-direct/range {v16 .. v21}, Ll/ۡ᩷֫;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-static {v0, v3}, Ll/ܳۨ;->֫(Landroid/view/View;Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 765
    invoke-static {v1, v0}, Ll/ᩳ᩷֫;->֫(Ljava/util/ArrayList;I)V

    .line 766
    invoke-virtual {v8, v11, v13, v7}, Ll/ܺ᩷֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 123
    :goto_21
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    .line 161
    invoke-virtual/range {p0 .. p0}, Ll/ۗ᩷֫;->ܽ()Landroid/view/ViewGroup;

    move-result-object v1

    .line 162
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 163
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 167
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x0

    :goto_22
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_44

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۠ܳ֫;

    .line 168
    invoke-virtual {v7}, Ll/ܶܳ֫;->ᩳ()Z

    move-result v8

    if-eqz v8, :cond_3c

    .line 170
    invoke-virtual {v7}, Ll/ܶܳ֫;->֫()V

    goto :goto_22

    .line 173
    :cond_3c
    invoke-virtual {v7, v2}, Ll/۠ܳ֫;->֫(Landroid/content/Context;)Ll/ۚ᩻֫;

    move-result-object v8

    if-nez v8, :cond_3d

    .line 176
    invoke-virtual {v7}, Ll/ܶܳ֫;->֫()V

    goto :goto_22

    .line 179
    :cond_3d
    iget-object v8, v8, Ll/ۚ᩻֫;->ۧ:Landroid/animation/Animator;

    if-nez v8, :cond_3e

    .line 182
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_22

    .line 187
    :cond_3e
    invoke-virtual {v7}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object v9

    .line 188
    invoke-virtual {v9}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v11

    .line 189
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_40

    const/4 v12, 0x2

    .line 191
    invoke-static {v12}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v8

    if-eqz v8, :cond_3f

    .line 192
    invoke-static {v11}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    :cond_3f
    invoke-virtual {v7}, Ll/ܶܳ֫;->֫()V

    goto :goto_22

    .line 201
    :cond_40
    invoke-virtual {v9}, Ll/ۙ᩷֫;->ܽ()Ll/᩶᩷֫;

    move-result-object v6

    sget-object v12, Ll/᩶᩷֫;->᩹:Ll/᩶᩷֫;

    if-ne v6, v12, :cond_41

    const/4 v6, 0x1

    const/4 v14, 0x1

    goto :goto_23

    :cond_41
    const/4 v6, 0x0

    const/4 v14, 0x0

    :goto_23
    if-eqz v14, :cond_42

    .line 206
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 208
    :cond_42
    iget-object v6, v11, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    .line 209
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 210
    new-instance v15, Ll/ۡܳ֫;

    move-object v11, v15

    move-object v12, v1

    move-object v13, v6

    move-object/from16 p2, v4

    move-object v4, v15

    move-object v15, v9

    move-object/from16 v16, v7

    invoke-direct/range {v11 .. v16}, Ll/ۡܳ֫;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLl/ۙ᩷֫;Ll/۠ܳ֫;)V

    invoke-virtual {v8, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 226
    invoke-virtual {v8, v6}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 227
    invoke-virtual {v8}, Landroid/animation/Animator;->start()V

    const/4 v4, 0x2

    .line 228
    invoke-static {v4}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v6

    if-eqz v6, :cond_43

    .line 229
    invoke-virtual {v9}, Ll/ۙ᩷֫;->toString()Ljava/lang/String;

    .line 233
    :cond_43
    invoke-virtual {v7}, Ll/ܶܳ֫;->ܽ()Ll/᩻۫;

    move-result-object v4

    .line 234
    new-instance v6, Ll/ܺܳ֫;

    invoke-direct {v6, v8, v9}, Ll/ܺܳ֫;-><init>(Landroid/animation/Animator;Ll/ۙ᩷֫;)V

    invoke-virtual {v4, v6}, Ll/᩻۫;->֫(Ll/ܳ۫;)V

    const/4 v6, 0x1

    move-object/from16 v4, p2

    goto/16 :goto_22

    .line 247
    :cond_44
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_24
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ܳ֫;

    .line 249
    invoke-virtual {v4}, Ll/ܶܳ֫;->ۧ()Ll/ۙ᩷֫;

    move-result-object v5

    .line 250
    invoke-virtual {v5}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v7

    if-eqz v0, :cond_46

    const/4 v8, 0x2

    .line 252
    invoke-static {v8}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v5

    if-eqz v5, :cond_45

    .line 253
    invoke-static {v7}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 256
    :cond_45
    invoke-virtual {v4}, Ll/ܶܳ֫;->֫()V

    goto :goto_24

    :cond_46
    const/4 v8, 0x2

    if-eqz v6, :cond_48

    .line 261
    invoke-static {v8}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v5

    if-eqz v5, :cond_47

    .line 262
    invoke-static {v7}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 265
    :cond_47
    invoke-virtual {v4}, Ll/ܶܳ֫;->֫()V

    goto :goto_24

    .line 270
    :cond_48
    iget-object v7, v7, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    .line 272
    invoke-virtual {v4, v2}, Ll/۠ܳ֫;->֫(Landroid/content/Context;)Ll/ۚ᩻֫;

    move-result-object v8

    .line 136
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    iget-object v8, v8, Ll/ۚ᩻֫;->֫:Landroid/view/animation/Animation;

    .line 136
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    invoke-virtual {v5}, Ll/ۙ᩷֫;->ܽ()Ll/᩶᩷֫;

    move-result-object v9

    .line 274
    sget-object v11, Ll/᩶᩷֫;->ۙ:Ll/᩶᩷֫;

    if-eq v9, v11, :cond_49

    .line 277
    invoke-virtual {v7, v8}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 281
    invoke-virtual {v4}, Ll/ܶܳ֫;->֫()V

    goto :goto_25

    .line 283
    :cond_49
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 284
    new-instance v9, Ll/֨᩻֫;

    invoke-direct {v9, v8, v1, v7}, Ll/֨᩻֫;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 286
    new-instance v8, Ll/ۘܳ֫;

    invoke-direct {v8, v7, v1, v4, v5}, Ll/ۘܳ֫;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Ll/۠ܳ֫;Ll/ۙ᩷֫;)V

    invoke-virtual {v9, v8}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 317
    invoke-virtual {v7, v9}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v8, 0x2

    .line 318
    invoke-static {v8}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v9

    if-eqz v9, :cond_4a

    .line 319
    invoke-virtual {v5}, Ll/ۙ᩷֫;->toString()Ljava/lang/String;

    .line 324
    :cond_4a
    :goto_25
    invoke-virtual {v4}, Ll/ܶܳ֫;->ܽ()Ll/᩻۫;

    move-result-object v8

    .line 325
    new-instance v9, Ll/ᩴܳ֫;

    invoke-direct {v9, v7, v1, v4, v5}, Ll/ᩴܳ֫;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Ll/۠ܳ֫;Ll/ۙ᩷֫;)V

    invoke-virtual {v8, v9}, Ll/᩻۫;->֫(Ll/ܳ۫;)V

    goto :goto_24

    .line 129
    :cond_4b
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ᩷֫;

    .line 843
    invoke-virtual {v1}, Ll/ۙ᩷֫;->ᩳ()Ll/ۡ᩻֫;

    move-result-object v2

    iget-object v2, v2, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    .line 844
    invoke-virtual {v1}, Ll/ۙ᩷֫;->ܽ()Ll/᩶᩷֫;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/᩶᩷֫;->֫(Landroid/view/View;)V

    goto :goto_26

    .line 132
    :cond_4c
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x2

    .line 133
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_4d

    .line 134
    invoke-static/range {v24 .. v24}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static/range {v22 .. v22}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_4d
    return-void
.end method
