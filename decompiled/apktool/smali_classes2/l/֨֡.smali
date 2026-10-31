.class public final Ll/֨֡;
.super Ljava/lang/Object;
.source "B1BC"


# static fields
.field public static ֫:Landroid/util/SparseIntArray;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 352
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Ll/֨֡;->֫:Landroid/util/SparseIntArray;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 355
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0xb

    const/4 v3, 0x2

    .line 356
    invoke-virtual {v0, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v1, 0x7

    const/4 v4, 0x4

    .line 357
    invoke-virtual {v0, v1, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v5, 0x8

    const/4 v6, 0x5

    .line 358
    invoke-virtual {v0, v5, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v7, 0x9

    const/4 v8, 0x6

    .line 359
    invoke-virtual {v0, v7, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v9, 0x13

    .line 360
    invoke-virtual {v0, v2, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v2, 0x14

    .line 361
    invoke-virtual {v0, v3, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 362
    invoke-virtual {v0, v6, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x11

    .line 363
    invoke-virtual {v0, v1, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v2, 0x10

    .line 364
    invoke-virtual {v0, v2, v7}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0xf

    const/16 v5, 0xa

    .line 365
    invoke-virtual {v0, v3, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0xd

    const/16 v7, 0xc

    .line 366
    invoke-virtual {v0, v6, v7}, Landroid/util/SparseIntArray;->append(II)V

    .line 367
    invoke-virtual {v0, v7, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0xe

    .line 368
    invoke-virtual {v0, v8, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v7, 0x3

    .line 369
    invoke-virtual {v0, v7, v3}, Landroid/util/SparseIntArray;->append(II)V

    .line 370
    invoke-virtual {v0, v4, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 371
    invoke-virtual {v0, v5, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x12

    .line 372
    invoke-virtual {v0, v6, v1}, Landroid/util/SparseIntArray;->append(II)V

    return-void
.end method

.method public static ֫(Ll/۠֡;Landroid/content/res/TypedArray;)V
    .locals 5

    .line 376
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 378
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 379
    sget-object v3, Ll/֨֡;->֫:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 448
    :pswitch_0
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    goto/16 :goto_1

    .line 422
    :pswitch_1
    invoke-static {p0}, Ll/۠֡;->ᩴ(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->ۘ(Ll/۠֡;F)V

    goto/16 :goto_1

    .line 419
    :pswitch_2
    invoke-static {p0}, Ll/۠֡;->ۘ(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->ۖ(Ll/۠֡;F)V

    goto/16 :goto_1

    .line 445
    :pswitch_3
    invoke-static {p0}, Ll/۠֡;->ۜ(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->ۜ(Ll/۠֡;F)V

    goto/16 :goto_1

    .line 441
    :pswitch_4
    invoke-static {p0}, Ll/۠֡;->᩻(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->᩻(Ll/۠֡;F)V

    goto/16 :goto_1

    .line 437
    :pswitch_5
    invoke-static {p0}, Ll/۠֡;->ܳ(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->ܳ(Ll/۠֡;F)V

    goto/16 :goto_1

    .line 434
    :pswitch_6
    invoke-static {p0}, Ll/۠֡;->ܿ(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->ܿ(Ll/۠֡;F)V

    goto/16 :goto_1

    .line 428
    :pswitch_7
    invoke-static {p0}, Ll/۠֡;->ܽ(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->ۧ(Ll/۠֡;F)V

    goto/16 :goto_1

    .line 407
    :pswitch_8
    invoke-static {p0}, Ll/۠֡;->ۢ(Ll/۠֡;)I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->֫(Ll/۠֡;I)V

    goto/16 :goto_1

    .line 395
    :pswitch_9
    iget v3, p0, Ll/ۚ֡;->ۧ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Ll/ۚ֡;->ۧ:I

    goto/16 :goto_1

    .line 381
    :pswitch_a
    sget-boolean v3, Ll/ۤۚ;->ۢۧ:Z

    if-eqz v3, :cond_0

    .line 382
    iget v3, p0, Ll/ۚ֡;->ܽ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Ll/ۚ֡;->ܽ:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_2

    .line 384
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ֡;->ᩳ:Ljava/lang/String;

    goto/16 :goto_1

    .line 387
    :cond_0
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v3

    iget v3, v3, Landroid/util/TypedValue;->type:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_1

    .line 388
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ֡;->ᩳ:Ljava/lang/String;

    goto :goto_1

    .line 390
    :cond_1
    iget v3, p0, Ll/ۚ֡;->ܽ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Ll/ۚ֡;->ܽ:I

    goto :goto_1

    .line 425
    :pswitch_b
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    goto :goto_1

    .line 431
    :pswitch_c
    invoke-static {p0}, Ll/۠֡;->ᩳ(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->ᩳ(Ll/۠֡;F)V

    goto :goto_1

    .line 410
    :pswitch_d
    invoke-static {p0}, Ll/۠֡;->ۡ(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->ۢ(Ll/۠֡;F)V

    goto :goto_1

    .line 416
    :pswitch_e
    invoke-static {p0}, Ll/۠֡;->ۖ(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->ܺ(Ll/۠֡;F)V

    goto :goto_1

    .line 413
    :pswitch_f
    invoke-static {p0}, Ll/۠֡;->ܺ(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->ۡ(Ll/۠֡;F)V

    goto :goto_1

    .line 404
    :pswitch_10
    invoke-static {p0}, Ll/۠֡;->᩷(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->᩷(Ll/۠֡;F)V

    goto :goto_1

    .line 401
    :pswitch_11
    invoke-static {p0}, Ll/۠֡;->ۧ(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->ܽ(Ll/۠֡;F)V

    goto :goto_1

    .line 398
    :pswitch_12
    invoke-static {p0}, Ll/۠֡;->֫(Ll/۠֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/۠֡;->֫(Ll/۠֡;F)V

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_12
        :pswitch_11
        :pswitch_0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
