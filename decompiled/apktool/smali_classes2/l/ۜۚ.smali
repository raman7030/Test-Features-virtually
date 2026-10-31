.class public final Ll/ۜۚ;
.super Ljava/lang/Object;
.source "W1AV"


# static fields
.field public static ֫:Landroid/util/SparseIntArray;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 259
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Ll/ۜۚ;->֫:Landroid/util/SparseIntArray;

    const/4 v1, 0x4

    const/4 v2, 0x1

    .line 262
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v3, 0x2

    .line 263
    invoke-virtual {v0, v3, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0xb

    const/4 v4, 0x3

    .line 264
    invoke-virtual {v0, v3, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v5, 0x0

    .line 265
    invoke-virtual {v0, v5, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v1, 0x5

    .line 266
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v2, 0x8

    const/4 v5, 0x6

    .line 267
    invoke-virtual {v0, v2, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0x9

    const/4 v7, 0x7

    .line 268
    invoke-virtual {v0, v6, v7}, Landroid/util/SparseIntArray;->append(II)V

    .line 269
    invoke-virtual {v0, v4, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v4, 0xa

    .line 270
    invoke-virtual {v0, v4, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 271
    invoke-virtual {v0, v7, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v2, 0xc

    .line 272
    invoke-virtual {v0, v5, v2}, Landroid/util/SparseIntArray;->append(II)V

    .line 273
    invoke-virtual {v0, v1, v4}, Landroid/util/SparseIntArray;->append(II)V

    return-void
.end method

.method public static ֫(Ll/᩷ۚ;Landroid/content/res/TypedArray;)V
    .locals 7

    .line 277
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    .line 279
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    .line 280
    sget-object v4, Ll/ۜۚ;->֫:Landroid/util/SparseIntArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v5

    const/4 v6, 0x3

    packed-switch v5, :pswitch_data_0

    .line 334
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    invoke-virtual {v4, v3}, Landroid/util/SparseIntArray;->get(I)I

    goto/16 :goto_1

    .line 327
    :pswitch_0
    iget v4, p0, Ll/᩷ۚ;->ۜ:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Ll/᩷ۚ;->ۜ:F

    goto/16 :goto_1

    .line 324
    :pswitch_1
    iget v4, p0, Ll/᩷ۚ;->᩷:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Ll/᩷ۚ;->᩷:F

    goto/16 :goto_1

    .line 306
    :pswitch_2
    iget v4, p0, Ll/᩷ۚ;->᩻:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Ll/᩷ۚ;->᩻:I

    goto/16 :goto_1

    .line 330
    :pswitch_3
    iget v4, p0, Ll/᩷ۚ;->ܺ:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Ll/᩷ۚ;->ܺ:I

    goto/16 :goto_1

    .line 321
    :pswitch_4
    iget v4, p0, Ll/᩷ۚ;->ۜ:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Ll/᩷ۚ;->᩷:F

    iput v3, p0, Ll/᩷ۚ;->ۜ:F

    goto/16 :goto_1

    .line 318
    :pswitch_5
    iget v4, p0, Ll/᩷ۚ;->ۡ:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Ll/᩷ۚ;->ۡ:F

    goto/16 :goto_1

    .line 315
    :pswitch_6
    iget v4, p0, Ll/᩷ۚ;->ۢ:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Ll/᩷ۚ;->ۢ:F

    goto :goto_1

    .line 312
    :pswitch_7
    iget v4, p0, Ll/᩷ۚ;->ܳ:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Ll/᩷ۚ;->ܳ:I

    goto :goto_1

    .line 309
    :pswitch_8
    iget v4, p0, Ll/ۢۚ;->ܿ:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Ll/ۢۚ;->ܿ:I

    goto :goto_1

    .line 299
    :pswitch_9
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v4

    iget v4, v4, Landroid/util/TypedValue;->type:I

    if-ne v4, v6, :cond_0

    .line 300
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/᩷ۚ;->ۖ:Ljava/lang/String;

    goto :goto_1

    .line 302
    :cond_0
    sget-object v4, Ll/ۡ֡;->ۧ:[Ljava/lang/String;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    aget-object v3, v4, v3

    iput-object v3, p0, Ll/᩷ۚ;->ۖ:Ljava/lang/String;

    goto :goto_1

    .line 296
    :pswitch_a
    iget v4, p0, Ll/ۚ֡;->ۧ:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Ll/ۚ֡;->ۧ:I

    goto :goto_1

    .line 282
    :pswitch_b
    sget-boolean v4, Ll/ۤۚ;->ۢۧ:Z

    if-eqz v4, :cond_1

    .line 283
    iget v4, p0, Ll/ۚ֡;->ܽ:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    iput v4, p0, Ll/ۚ֡;->ܽ:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_3

    .line 285
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/ۚ֡;->ᩳ:Ljava/lang/String;

    goto :goto_1

    .line 288
    :cond_1
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v4

    iget v4, v4, Landroid/util/TypedValue;->type:I

    if-ne v4, v6, :cond_2

    .line 289
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/ۚ֡;->ᩳ:Ljava/lang/String;

    goto :goto_1

    .line 291
    :cond_2
    iget v4, p0, Ll/ۚ֡;->ܽ:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Ll/ۚ֡;->ܽ:I

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_4
    return-void

    :pswitch_data_0
    .packed-switch 0x1
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
