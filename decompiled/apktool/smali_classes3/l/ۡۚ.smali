.class public final Ll/ۡۚ;
.super Ljava/lang/Object;
.source "J1B7"


# static fields
.field public static ֫:Landroid/util/SparseIntArray;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 321
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Ll/ۡۚ;->֫:Landroid/util/SparseIntArray;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 324
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x9

    const/4 v3, 0x2

    .line 325
    invoke-virtual {v0, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v4, 0x5

    const/4 v5, 0x4

    .line 326
    invoke-virtual {v0, v4, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v6, 0x6

    .line 327
    invoke-virtual {v0, v6, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v4, 0x7

    .line 328
    invoke-virtual {v0, v4, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v6, 0x3

    .line 329
    invoke-virtual {v0, v6, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v4, 0xf

    const/16 v6, 0x8

    .line 330
    invoke-virtual {v0, v4, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v7, 0xe

    .line 331
    invoke-virtual {v0, v7, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0xd

    const/16 v8, 0xa

    .line 332
    invoke-virtual {v0, v1, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v9, 0xb

    const/16 v10, 0xc

    .line 333
    invoke-virtual {v0, v9, v10}, Landroid/util/SparseIntArray;->append(II)V

    .line 334
    invoke-virtual {v0, v8, v1}, Landroid/util/SparseIntArray;->append(II)V

    .line 335
    invoke-virtual {v0, v5, v7}, Landroid/util/SparseIntArray;->append(II)V

    .line 336
    invoke-virtual {v0, v2, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x10

    .line 337
    invoke-virtual {v0, v3, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x11

    .line 338
    invoke-virtual {v0, v6, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v2, 0x12

    .line 339
    invoke-virtual {v0, v10, v2}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x14

    .line 340
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v2, 0x15

    .line 341
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x13

    .line 342
    invoke-virtual {v0, v1, v1}, Landroid/util/SparseIntArray;->append(II)V

    return-void
.end method

.method public static ֫(Ll/ܺۚ;Landroid/content/res/TypedArray;)V
    .locals 5

    .line 346
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    .line 348
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 349
    sget-object v3, Ll/ۡۚ;->֫:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 426
    :pswitch_0
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    goto/16 :goto_1

    .line 386
    :pswitch_1
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v3

    .line 387
    iget v3, v3, Landroid/util/TypedValue;->type:I

    const/4 v4, 0x5

    if-ne v3, v4, :cond_0

    .line 388
    invoke-static {p0}, Ll/ܺۚ;->ۖ(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ۡ(Ll/ܺۚ;F)V

    goto/16 :goto_1

    .line 390
    :cond_0
    invoke-static {p0}, Ll/ܺۚ;->ۖ(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ۡ(Ll/ܺۚ;F)V

    goto/16 :goto_1

    .line 383
    :pswitch_2
    invoke-static {p0}, Ll/ܺۚ;->ܺ(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ۢ(Ll/ܺۚ;F)V

    goto/16 :goto_1

    .line 380
    :pswitch_3
    invoke-static {p0}, Ll/ܺۚ;->ۡ(Ll/ܺۚ;)I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ۧ(Ll/ܺۚ;I)V

    goto/16 :goto_1

    .line 423
    :pswitch_4
    invoke-static {p0}, Ll/ܺۚ;->ۜ(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ۜ(Ll/ܺۚ;F)V

    goto/16 :goto_1

    .line 419
    :pswitch_5
    invoke-static {p0}, Ll/ܺۚ;->᩻(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->᩻(Ll/ܺۚ;F)V

    goto/16 :goto_1

    .line 415
    :pswitch_6
    invoke-static {p0}, Ll/ܺۚ;->ܳ(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ܳ(Ll/ܺۚ;F)V

    goto/16 :goto_1

    .line 412
    :pswitch_7
    invoke-static {p0}, Ll/ܺۚ;->ܿ(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ܿ(Ll/ܺۚ;F)V

    goto/16 :goto_1

    .line 406
    :pswitch_8
    invoke-static {p0}, Ll/ܺۚ;->ܽ(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ܽ(Ll/ܺۚ;F)V

    goto/16 :goto_1

    .line 377
    :pswitch_9
    invoke-static {p0}, Ll/ܺۚ;->ۢ(Ll/ܺۚ;)I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->֫(Ll/ܺۚ;I)V

    goto/16 :goto_1

    .line 365
    :pswitch_a
    iget v3, p0, Ll/ۚ֡;->ۧ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Ll/ۚ֡;->ۧ:I

    goto/16 :goto_1

    .line 351
    :pswitch_b
    sget-boolean v3, Ll/ۤۚ;->ۢۧ:Z

    if-eqz v3, :cond_1

    .line 352
    iget v3, p0, Ll/ۚ֡;->ܽ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Ll/ۚ֡;->ܽ:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_3

    .line 354
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ֡;->ᩳ:Ljava/lang/String;

    goto/16 :goto_1

    .line 357
    :cond_1
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v3

    iget v3, v3, Landroid/util/TypedValue;->type:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_2

    .line 358
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ֡;->ᩳ:Ljava/lang/String;

    goto :goto_1

    .line 360
    :cond_2
    iget v3, p0, Ll/ۚ֡;->ܽ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Ll/ۚ֡;->ܽ:I

    goto :goto_1

    .line 403
    :pswitch_c
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    goto :goto_1

    .line 409
    :pswitch_d
    invoke-static {p0}, Ll/ܺۚ;->ᩳ(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ᩳ(Ll/ܺۚ;F)V

    goto :goto_1

    .line 394
    :pswitch_e
    invoke-static {p0}, Ll/ܺۚ;->ۘ(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ܺ(Ll/ܺۚ;F)V

    goto :goto_1

    .line 400
    :pswitch_f
    invoke-static {p0}, Ll/ܺۚ;->᩵(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ۘ(Ll/ܺۚ;F)V

    goto :goto_1

    .line 397
    :pswitch_10
    invoke-static {p0}, Ll/ܺۚ;->ᩴ(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ۖ(Ll/ܺۚ;F)V

    goto :goto_1

    .line 374
    :pswitch_11
    invoke-static {p0}, Ll/ܺۚ;->᩷(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->᩷(Ll/ܺۚ;F)V

    goto :goto_1

    .line 371
    :pswitch_12
    invoke-static {p0}, Ll/ܺۚ;->ۧ(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->ۧ(Ll/ܺۚ;F)V

    goto :goto_1

    .line 368
    :pswitch_13
    invoke-static {p0}, Ll/ܺۚ;->֫(Ll/ܺۚ;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/ܺۚ;->֫(Ll/ܺۚ;F)V

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
        :pswitch_0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_a
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
