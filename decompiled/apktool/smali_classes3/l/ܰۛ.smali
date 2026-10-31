.class public final Ll/ܰۛ;
.super Ljava/lang/Object;
.source "P5AI"


# instance fields
.field public ֫:Z

.field public ۧ:Landroid/view/ViewParent;

.field public ܽ:Landroid/view/ViewParent;

.field public final ܿ:Landroid/view/ViewGroup;

.field public ᩳ:[I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Ll/ܰۛ;->ܿ:Landroid/view/ViewGroup;

    return-void
.end method

.method private ۧ(IIII[II[I)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v9, p5

    move/from16 v7, p6

    .line 86
    iget-boolean v1, v0, Ll/ܰۛ;->֫:Z

    const/4 v10, 0x0

    if-eqz v1, :cond_a

    .line 240
    invoke-direct {v0, v7}, Ll/ܰۛ;->ܽ(I)Landroid/view/ViewParent;

    move-result-object v8

    if-nez v8, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v11, 0x1

    if-nez p1, :cond_2

    if-nez p2, :cond_2

    if-nez p3, :cond_2

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v9, :cond_a

    .line 271
    aput v10, v9, v10

    .line 272
    aput v10, v9, v11

    return v10

    .line 248
    :cond_2
    :goto_0
    iget-object v12, v0, Ll/ܰۛ;->ܿ:Landroid/view/ViewGroup;

    if-eqz v9, :cond_3

    .line 249
    invoke-virtual {v12, v9}, Landroid/view/View;->getLocationInWindow([I)V

    .line 250
    aget v1, v9, v10

    .line 251
    aget v2, v9, v11

    move v13, v1

    move v14, v2

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_1
    if-nez p7, :cond_5

    .line 426
    iget-object v1, v0, Ll/ܰۛ;->ᩳ:[I

    if-nez v1, :cond_4

    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 427
    iput-object v1, v0, Ll/ܰۛ;->ᩳ:[I

    .line 429
    :cond_4
    iget-object v1, v0, Ll/ܰۛ;->ᩳ:[I

    .line 256
    aput v10, v1, v10

    .line 257
    aput v10, v1, v11

    move-object v15, v1

    goto :goto_2

    :cond_5
    move-object/from16 v15, p7

    .line 342
    :goto_2
    instance-of v1, v8, Ll/֫ۨ;

    if-eqz v1, :cond_6

    .line 343
    move-object v1, v8

    check-cast v1, Ll/֫ۨ;

    move-object v2, v12

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p6

    move-object v8, v15

    invoke-interface/range {v1 .. v8}, Ll/֫ۨ;->onNestedScroll(Landroid/view/View;IIIII[I)V

    goto :goto_3

    .line 349
    :cond_6
    aget v1, v15, v10

    add-int v1, v1, p3

    aput v1, v15, v10

    .line 350
    aget v1, v15, v11

    add-int v1, v1, p4

    aput v1, v15, v11

    .line 352
    instance-of v1, v8, Ll/۟ۛ;

    if-eqz v1, :cond_7

    .line 353
    move-object v1, v8

    check-cast v1, Ll/۟ۛ;

    move-object v2, v12

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p6

    invoke-interface/range {v1 .. v7}, Ll/۟ۛ;->onNestedScroll(Landroid/view/View;IIIII)V

    goto :goto_3

    :cond_7
    if-nez v7, :cond_8

    move-object v1, v8

    move-object v2, v12

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    .line 359
    :try_start_0
    invoke-static/range {v1 .. v6}, Ll/ۚ᩺;->֫(Landroid/view/ViewParent;Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 362
    :catch_0
    invoke-static {v8}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_8
    :goto_3
    if-eqz v9, :cond_9

    .line 264
    invoke-virtual {v12, v9}, Landroid/view/View;->getLocationInWindow([I)V

    .line 265
    aget v1, v9, v10

    sub-int/2addr v1, v13

    aput v1, v9, v10

    .line 266
    aget v1, v9, v11

    sub-int/2addr v1, v14

    aput v1, v9, v11

    :cond_9
    return v11

    :cond_a
    :goto_4
    return v10
.end method

.method private ܽ(I)Landroid/view/ViewParent;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 409
    :cond_0
    iget-object p1, p0, Ll/ܰۛ;->ۧ:Landroid/view/ViewParent;

    return-object p1

    .line 407
    :cond_1
    iget-object p1, p0, Ll/ܰۛ;->ܽ:Landroid/view/ViewParent;

    return-object p1
.end method


# virtual methods
.method public final ֫(IIII[II[I)V
    .locals 0

    .line 232
    invoke-direct/range {p0 .. p7}, Ll/ܰۛ;->ۧ(IIII[II[I)Z

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 70
    iget-boolean v0, p0, Ll/ܰۛ;->֫:Z

    if-eqz v0, :cond_0

    .line 71
    sget v0, Ll/ܿ᩺;->֫:I

    .line 3553
    iget-object v0, p0, Ll/ܰۛ;->ܿ:Landroid/view/ViewGroup;

    invoke-static {v0}, Ll/۬ۨ;->ۡ(Landroid/view/View;)V

    .line 73
    :cond_0
    iput-boolean p1, p0, Ll/ܰۛ;->֫:Z

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Ll/ܰۛ;->֫:Z

    return v0
.end method

.method public final ֫(FF)Z
    .locals 3

    .line 86
    iget-boolean v0, p0, Ll/ܰۛ;->֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 370
    invoke-direct {p0, v1}, Ll/ܰۛ;->ܽ(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 372
    iget-object v2, p0, Ll/ܰۛ;->ܿ:Landroid/view/ViewGroup;

    .line 479
    :try_start_0
    invoke-static {v0, v2, p1, p2}, Ll/ۚ᩺;->֫(Landroid/view/ViewParent;Landroid/view/View;FF)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 481
    :catch_0
    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return v1
.end method

.method public final ֫(FFZ)Z
    .locals 3

    .line 86
    iget-boolean v0, p0, Ll/ܰۛ;->֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 350
    invoke-direct {p0, v1}, Ll/ܰۛ;->ܽ(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 352
    iget-object v2, p0, Ll/ܰۛ;->ܿ:Landroid/view/ViewGroup;

    .line 441
    :try_start_0
    invoke-static {v0, v2, p1, p2, p3}, Ll/ۚ᩺;->֫(Landroid/view/ViewParent;Landroid/view/View;FFZ)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 443
    :catch_0
    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return v1
.end method

.method public final ֫(I)Z
    .locals 0

    .line 114
    invoke-direct {p0, p1}, Ll/ܰۛ;->ܽ(I)Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(II)Z
    .locals 7

    .line 146
    invoke-virtual {p0, p2}, Ll/ܰۛ;->֫(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_3

    .line 86
    :cond_0
    iget-boolean v0, p0, Ll/ܰۛ;->֫:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_9

    .line 151
    iget-object v0, p0, Ll/ܰۛ;->ܿ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    move-object v4, v0

    :goto_0
    if-eqz v3, :cond_9

    .line 216
    instance-of v5, v3, Ll/۟ۛ;

    if-eqz v5, :cond_1

    .line 218
    move-object v6, v3

    check-cast v6, Ll/۟ۛ;

    invoke-interface {v6, v4, v0, p1, p2}, Ll/۟ۛ;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z

    move-result v6

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    .line 224
    :try_start_0
    invoke-static {v3, v4, v0, p1}, Ll/ۚ᩺;->ۧ(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 226
    :catch_0
    invoke-static {v3}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_7

    if-eqz p2, :cond_4

    if-eq p2, v1, :cond_3

    goto :goto_2

    .line 420
    :cond_3
    iput-object v3, p0, Ll/ܰۛ;->ۧ:Landroid/view/ViewParent;

    goto :goto_2

    .line 417
    :cond_4
    iput-object v3, p0, Ll/ܰۛ;->ܽ:Landroid/view/ViewParent;

    :goto_2
    if-eqz v5, :cond_5

    .line 260
    check-cast v3, Ll/۟ۛ;

    invoke-interface {v3, v4, v0, p1, p2}, Ll/۟ۛ;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V

    goto :goto_3

    :cond_5
    if-nez p2, :cond_6

    .line 266
    :try_start_1
    invoke-static {v3, v4, v0, p1}, Ll/ۚ᩺;->֫(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)V
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    .line 268
    :catch_1
    invoke-static {v3}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_6
    :goto_3
    return v1

    .line 159
    :cond_7
    instance-of v5, v3, Landroid/view/View;

    if-eqz v5, :cond_8

    .line 160
    move-object v4, v3

    check-cast v4, Landroid/view/View;

    .line 162
    :cond_8
    invoke-interface {v3}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    goto :goto_0

    :cond_9
    return v2
.end method

.method public final ֫(IIII[I)Z
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 205
    invoke-direct/range {v0 .. v7}, Ll/ܰۛ;->ۧ(IIII[II[I)Z

    move-result p1

    return p1
.end method

.method public final ֫(IIII[II)Z
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    .line 219
    invoke-direct/range {v0 .. v7}, Ll/ܰۛ;->ۧ(IIII[II[I)Z

    move-result p1

    return p1
.end method

.method public final ֫(II[I[II)Z
    .locals 14

    move-object v0, p0

    move v3, p1

    move/from16 v4, p2

    move-object/from16 v7, p4

    move/from16 v6, p5

    .line 86
    iget-boolean v1, v0, Ll/ܰۛ;->֫:Z

    const/4 v8, 0x0

    if-eqz v1, :cond_a

    .line 304
    invoke-direct {p0, v6}, Ll/ܰۛ;->ܽ(I)Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v9, 0x1

    if-nez v3, :cond_2

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v7, :cond_a

    .line 332
    aput v8, v7, v8

    .line 333
    aput v8, v7, v9

    return v8

    .line 312
    :cond_2
    :goto_0
    iget-object v10, v0, Ll/ܰۛ;->ܿ:Landroid/view/ViewGroup;

    if-eqz v7, :cond_3

    .line 313
    invoke-virtual {v10, v7}, Landroid/view/View;->getLocationInWindow([I)V

    .line 314
    aget v2, v7, v8

    .line 315
    aget v5, v7, v9

    move v11, v2

    move v12, v5

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1
    if-nez p3, :cond_5

    .line 426
    iget-object v2, v0, Ll/ܰۛ;->ᩳ:[I

    if-nez v2, :cond_4

    const/4 v2, 0x2

    new-array v2, v2, [I

    .line 427
    iput-object v2, v0, Ll/ܰۛ;->ᩳ:[I

    .line 429
    :cond_4
    iget-object v2, v0, Ll/ܰۛ;->ᩳ:[I

    move-object v13, v2

    goto :goto_2

    :cond_5
    move-object/from16 v13, p3

    .line 321
    :goto_2
    aput v8, v13, v8

    .line 322
    aput v8, v13, v9

    .line 398
    instance-of v2, v1, Ll/۟ۛ;

    if-eqz v2, :cond_6

    .line 400
    check-cast v1, Ll/۟ۛ;

    move-object v2, v10

    move v3, p1

    move/from16 v4, p2

    move-object v5, v13

    move/from16 v6, p5

    invoke-interface/range {v1 .. v6}, Ll/۟ۛ;->onNestedPreScroll(Landroid/view/View;II[II)V

    goto :goto_3

    :cond_6
    if-nez v6, :cond_7

    .line 405
    :try_start_0
    invoke-static {v1, v10, p1, v4, v13}, Ll/ۚ᩺;->֫(Landroid/view/ViewParent;Landroid/view/View;II[I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 407
    :catch_0
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_7
    :goto_3
    if-eqz v7, :cond_8

    .line 326
    invoke-virtual {v10, v7}, Landroid/view/View;->getLocationInWindow([I)V

    .line 327
    aget v1, v7, v8

    sub-int/2addr v1, v11

    aput v1, v7, v8

    .line 328
    aget v1, v7, v9

    sub-int/2addr v1, v12

    aput v1, v7, v9

    .line 330
    :cond_8
    aget v1, v13, v8

    if-nez v1, :cond_9

    aget v1, v13, v9

    if-eqz v1, :cond_a

    :cond_9
    const/4 v8, 0x1

    :cond_a
    :goto_4
    return v8
.end method

.method public final ۧ(I)V
    .locals 3

    .line 187
    invoke-direct {p0, p1}, Ll/ܰۛ;->ܽ(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 294
    instance-of v1, v0, Ll/۟ۛ;

    iget-object v2, p0, Ll/ܰۛ;->ܿ:Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 296
    check-cast v0, Ll/۟ۛ;

    invoke-interface {v0, v2, p1}, Ll/۟ۛ;->onStopNestedScroll(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 301
    :try_start_0
    invoke-static {v0, v2}, Ll/ۚ᩺;->֫(Landroid/view/ViewParent;Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 303
    :catch_0
    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    goto :goto_1

    .line 420
    :cond_2
    iput-object v0, p0, Ll/ܰۛ;->ۧ:Landroid/view/ViewParent;

    goto :goto_1

    .line 417
    :cond_3
    iput-object v0, p0, Ll/ܰۛ;->ܽ:Landroid/view/ViewParent;

    :cond_4
    :goto_1
    return-void
.end method
