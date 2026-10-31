.class public final Ll/᩸֡;
.super Ljava/lang/Object;
.source "H1BK"


# static fields
.field public static ֫:Landroid/util/SparseIntArray;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    .line 235
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Ll/᩸֡;->֫:Landroid/util/SparseIntArray;

    const/16 v1, 0xd

    const/4 v2, 0x1

    .line 238
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0xb

    const/4 v4, 0x2

    .line 239
    invoke-virtual {v0, v3, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v4, 0xe

    const/4 v5, 0x3

    .line 240
    invoke-virtual {v0, v4, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0xa

    const/4 v7, 0x4

    .line 241
    invoke-virtual {v0, v6, v7}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v8, 0x12

    const/4 v9, 0x5

    .line 242
    invoke-virtual {v0, v8, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v10, 0x11

    const/4 v11, 0x6

    .line 243
    invoke-virtual {v0, v10, v11}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v12, 0x10

    const/4 v13, 0x7

    .line 244
    invoke-virtual {v0, v12, v13}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v14, 0x13

    const/16 v15, 0x8

    .line 245
    invoke-virtual {v0, v14, v15}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v14, 0x0

    const/16 v15, 0x9

    .line 246
    invoke-virtual {v0, v14, v15}, Landroid/util/SparseIntArray;->append(II)V

    .line 247
    invoke-virtual {v0, v15, v6}, Landroid/util/SparseIntArray;->append(II)V

    .line 248
    invoke-virtual {v0, v9, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0xc

    .line 249
    invoke-virtual {v0, v11, v3}, Landroid/util/SparseIntArray;->append(II)V

    .line 250
    invoke-virtual {v0, v13, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0xf

    .line 251
    invoke-virtual {v0, v1, v4}, Landroid/util/SparseIntArray;->append(II)V

    .line 252
    invoke-virtual {v0, v5, v1}, Landroid/util/SparseIntArray;->append(II)V

    .line 253
    invoke-virtual {v0, v7, v12}, Landroid/util/SparseIntArray;->append(II)V

    .line 254
    invoke-virtual {v0, v2, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v1, 0x2

    .line 255
    invoke-virtual {v0, v1, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x13

    const/16 v2, 0x8

    .line 256
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0x14

    .line 257
    invoke-virtual {v0, v3, v1}, Landroid/util/SparseIntArray;->append(II)V

    return-void
.end method

.method public static ֫(Ll/᩹֡;Landroid/content/res/TypedArray;)V
    .locals 5

    .line 261
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    .line 263
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 264
    sget-object v3, Ll/᩸֡;->֫:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 344
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    goto/16 :goto_1

    .line 341
    :pswitch_0
    invoke-static {p0}, Ll/᩹֡;->᩷(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->᩷(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 337
    :pswitch_1
    invoke-static {p0}, Ll/᩹֡;->ۜ(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ۜ(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 333
    :pswitch_2
    invoke-static {p0}, Ll/᩹֡;->᩻(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->᩻(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 330
    :pswitch_3
    invoke-static {p0}, Ll/᩹֡;->ܳ(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ܳ(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 327
    :pswitch_4
    invoke-static {p0}, Ll/᩹֡;->ܿ(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ܿ(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 324
    :pswitch_5
    invoke-static {p0}, Ll/᩹֡;->ᩳ(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ᩳ(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 321
    :pswitch_6
    invoke-static {p0}, Ll/᩹֡;->ܽ(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ܽ(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 318
    :pswitch_7
    invoke-static {p0}, Ll/᩹֡;->ۧ(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ۧ(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 315
    :pswitch_8
    invoke-static {p0}, Ll/᩹֡;->֫(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->֫(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 312
    :pswitch_9
    invoke-static {p0}, Ll/᩹֡;->֡(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ۘ(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 309
    :pswitch_a
    invoke-static {p0}, Ll/᩹֡;->᩵(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ۖ(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 306
    :pswitch_b
    invoke-static {p0}, Ll/᩹֡;->ᩴ(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ܺ(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 303
    :pswitch_c
    invoke-static {p0}, Ll/᩹֡;->ۘ(Ll/᩹֡;)I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ܽ(Ll/᩹֡;I)V

    goto/16 :goto_1

    .line 295
    :pswitch_d
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v3

    .line 296
    iget v3, v3, Landroid/util/TypedValue;->type:I

    const/4 v4, 0x5

    if-ne v3, v4, :cond_0

    .line 297
    invoke-static {p0}, Ll/᩹֡;->ۖ(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ۡ(Ll/᩹֡;F)V

    goto/16 :goto_1

    .line 299
    :cond_0
    invoke-static {p0}, Ll/᩹֡;->ۖ(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ۡ(Ll/᩹֡;F)V

    goto :goto_1

    .line 292
    :pswitch_e
    invoke-static {p0}, Ll/᩹֡;->ܺ(Ll/᩹֡;)F

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ۢ(Ll/᩹֡;F)V

    goto :goto_1

    .line 289
    :pswitch_f
    invoke-static {p0}, Ll/᩹֡;->ۡ(Ll/᩹֡;)I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->ۧ(Ll/᩹֡;I)V

    goto :goto_1

    .line 286
    :pswitch_10
    invoke-static {p0}, Ll/᩹֡;->ۢ(Ll/᩹֡;)I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    invoke-static {p0, v2}, Ll/᩹֡;->֫(Ll/᩹֡;I)V

    goto :goto_1

    .line 283
    :pswitch_11
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    goto :goto_1

    .line 280
    :pswitch_12
    iget v3, p0, Ll/ۚ֡;->ۧ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Ll/ۚ֡;->ۧ:I

    goto :goto_1

    .line 266
    :pswitch_13
    sget-boolean v3, Ll/ۤۚ;->ۢۧ:Z

    if-eqz v3, :cond_1

    .line 267
    iget v3, p0, Ll/ۚ֡;->ܽ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Ll/ۚ֡;->ܽ:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_3

    .line 269
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ֡;->ᩳ:Ljava/lang/String;

    goto :goto_1

    .line 272
    :cond_1
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v3

    iget v3, v3, Landroid/util/TypedValue;->type:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_2

    .line 273
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ֡;->ᩳ:Ljava/lang/String;

    goto :goto_1

    .line 275
    :cond_2
    iget v3, p0, Ll/ۚ֡;->ܽ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Ll/ۚ֡;->ܽ:I

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
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
        :pswitch_0
    .end packed-switch
.end method
