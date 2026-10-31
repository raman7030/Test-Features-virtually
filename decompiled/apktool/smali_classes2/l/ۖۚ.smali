.class public final Ll/ۖۚ;
.super Ljava/lang/Object;
.source "U1D7"


# static fields
.field public static ֫:Landroid/util/SparseIntArray;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 262
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Ll/ۖۚ;->֫:Landroid/util/SparseIntArray;

    const/4 v1, 0x0

    const/16 v2, 0x8

    .line 265
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v1, 0x4

    .line 266
    invoke-virtual {v0, v1, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v1, 0x5

    const/4 v3, 0x1

    .line 267
    invoke-virtual {v0, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v4, 0x6

    const/4 v5, 0x2

    .line 268
    invoke-virtual {v0, v4, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v6, 0x7

    .line 269
    invoke-virtual {v0, v3, v6}, Landroid/util/SparseIntArray;->append(II)V

    .line 270
    invoke-virtual {v0, v6, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v3, 0x9

    .line 271
    invoke-virtual {v0, v3, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v1, 0x3

    .line 272
    invoke-virtual {v0, v1, v3}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0xa

    .line 273
    invoke-virtual {v0, v5, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v1, 0xb

    .line 274
    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->append(II)V

    return-void
.end method

.method public static ֫(Ll/ۘۚ;Landroid/content/res/TypedArray;)V
    .locals 5

    .line 278
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 280
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 281
    sget-object v3, Ll/ۖۚ;->֫:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_1

    .line 322
    :pswitch_1
    invoke-static {p0}, Ll/ۘۚ;->ᩳ(Ll/ۘۚ;)I

    move-result v4

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-static {p0, v4}, Ll/ۘۚ;->ܽ(Ll/ۘۚ;I)V

    goto/16 :goto_1

    .line 319
    :pswitch_2
    invoke-static {p0}, Ll/ۘۚ;->ܽ(Ll/ۘۚ;)Z

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-static {p0, v2}, Ll/ۘۚ;->֫(Ll/ۘۚ;Z)V

    goto/16 :goto_2

    .line 316
    :pswitch_3
    invoke-static {p0}, Ll/ۘۚ;->ۧ(Ll/ۘۚ;)I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    invoke-static {p0, v2}, Ll/ۘۚ;->ۧ(Ll/ۘۚ;I)V

    goto/16 :goto_2

    .line 283
    :pswitch_4
    iget v3, p0, Ll/ۚ֡;->ۧ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    iput v2, p0, Ll/ۚ֡;->ۧ:I

    int-to-float v2, v2

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v2, v3

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    .line 284
    invoke-static {p0, v2}, Ll/ۘۚ;->֫(Ll/ۘۚ;F)V

    goto :goto_2

    .line 287
    :pswitch_5
    sget-boolean v3, Ll/ۤۚ;->ۢۧ:Z

    if-eqz v3, :cond_0

    .line 288
    iget v3, p0, Ll/ۚ֡;->ܽ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Ll/ۚ֡;->ܽ:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_2

    .line 290
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ֡;->ᩳ:Ljava/lang/String;

    goto :goto_2

    .line 293
    :cond_0
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v3

    iget v3, v3, Landroid/util/TypedValue;->type:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_1

    .line 294
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ֡;->ᩳ:Ljava/lang/String;

    goto :goto_2

    .line 296
    :cond_1
    iget v3, p0, Ll/ۚ֡;->ܽ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Ll/ۚ֡;->ܽ:I

    goto :goto_2

    .line 313
    :pswitch_6
    invoke-static {p0}, Ll/ۘۚ;->֫(Ll/ۘۚ;)I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    invoke-static {p0, v2}, Ll/ۘۚ;->֫(Ll/ۘۚ;I)V

    goto :goto_2

    .line 310
    :pswitch_7
    iget v3, p0, Ll/ۘۚ;->᩹:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Ll/ۘۚ;->᩹:F

    goto :goto_2

    .line 307
    :pswitch_8
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Ll/ۘۚ;->ܽ(Ll/ۘۚ;Ljava/lang/String;)V

    goto :goto_2

    .line 304
    :pswitch_9
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Ll/ۘۚ;->ۧ(Ll/ۘۚ;Ljava/lang/String;)V

    goto :goto_2

    .line 301
    :pswitch_a
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Ll/ۘۚ;->֫(Ll/ۘۚ;Ljava/lang/String;)V

    goto :goto_2

    .line 324
    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_0
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
