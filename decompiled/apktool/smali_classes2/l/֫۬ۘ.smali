.class public final Ll/֫۬ۘ;
.super Landroid/text/style/ReplacementSpan;
.source "G90S"


# instance fields
.field public final ۗ:Ljava/util/ArrayList;

.field public ۙ:Ll/۟ۗۘ;

.field public final ۛ:Landroid/text/TextPaint;

.field public final ۤ:Landroid/graphics/Rect;

.field public final ۨ:Ll/ۜ۬ۘ;

.field public final ۫:Landroid/graphics/Paint;

.field public final ۬:Z

.field public ᩶:I

.field public final ᩸:Ljava/util/List;

.field public final ᩹:Z

.field public ᩺:I


# direct methods
.method public constructor <init>(Ll/ۜ۬ۘ;Ljava/util/ArrayList;ZZ)V
    .locals 2

    .line 94
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 83
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/֫۬ۘ;->ۤ:Landroid/graphics/Rect;

    .line 84
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/֫۬ۘ;->۫:Landroid/graphics/Paint;

    .line 95
    iput-object p1, p0, Ll/֫۬ۘ;->ۨ:Ll/ۜ۬ۘ;

    .line 96
    iput-object p2, p0, Ll/֫۬ۘ;->᩸:Ljava/util/List;

    .line 97
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/֫۬ۘ;->ۗ:Ljava/util/ArrayList;

    .line 98
    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    iput-object p1, p0, Ll/֫۬ۘ;->ۛ:Landroid/text/TextPaint;

    .line 99
    iput-boolean p3, p0, Ll/֫۬ۘ;->᩹:Z

    .line 100
    iput-boolean p4, p0, Ll/֫۬ۘ;->۬:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫۬ۘ;)Ll/۟ۗۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫۬ۘ;->ۙ:Ll/۟ۗۘ;

    return-object p0
.end method

.method private ֫(IILl/ܰۗۘ;)V
    .locals 11

    .line 315
    new-instance v0, Ll/ۛۗۘ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۛۗۘ;-><init>(Ll/֫۬ۘ;IILl/ܰۗۘ;)V

    .line 329
    iget-object v1, p3, Ll/ܰۗۘ;->ۧ:Ljava/lang/CharSequence;

    .line 330
    check-cast v1, Landroid/text/Spannable;

    .line 335
    new-instance v10, Landroid/text/StaticLayout;

    iget p3, p3, Ll/ܰۗۘ;->֫:I

    const/4 v2, 0x1

    if-eq p3, v2, :cond_1

    const/4 v2, 0x2

    if-eq p3, v2, :cond_0

    .line 419
    sget-object p3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 416
    :cond_0
    sget-object p3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    goto :goto_0

    .line 413
    :cond_1
    sget-object p3, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    :goto_0
    move-object v6, p3

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 339
    iget-object v4, p0, Ll/֫۬ۘ;->ۛ:Landroid/text/TextPaint;

    const/high16 v7, 0x3f800000    # 1.0f

    move-object v2, v10

    move-object v3, v1

    move v5, p2

    invoke-direct/range {v2 .. v9}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 346
    invoke-static {v1, v10}, Ll/ᩴۗۘ;->֫(Landroid/text/Spannable;Landroid/text/StaticLayout;)V

    .line 356
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const-class p3, Ll/֡ۨۘ;

    const/4 v2, 0x0

    invoke-interface {v1, v2, p2, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ll/֡ۨۘ;

    if-eqz p2, :cond_3

    .line 357
    array-length p3, p2

    if-lez p3, :cond_3

    .line 360
    array-length p3, p2

    :goto_1
    if-ge v2, p3, :cond_3

    aget-object v1, p2, v2

    .line 362
    invoke-virtual {v1}, Ll/֡ۨۘ;->֫()Ll/ܿۨۘ;

    move-result-object v1

    .line 114
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v3

    if-eqz v3, :cond_2

    goto :goto_2

    .line 370
    :cond_2
    new-instance v3, Ll/ۨۗۘ;

    invoke-direct {v3, v0}, Ll/ۨۗۘ;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1, v3}, Ll/ܿۨۘ;->֫(Landroid/graphics/drawable/Drawable$Callback;)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 351
    :cond_3
    iget-object p2, p0, Ll/֫۬ۘ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫۬ۘ;IILl/ܰۗۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Ll/֫۬ۘ;->֫(IILl/ܰۗۘ;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/֫۬ۘ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫۬ۘ;->ۗ:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v3, p3

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p8

    move-object/from16 v7, p9

    .line 155
    invoke-static/range {p1 .. p2}, Ll/ۤ᩵ۚ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;)I

    move-result v8

    .line 295
    iget v9, v1, Ll/֫۬ۘ;->᩺:I

    iget-boolean v10, v1, Ll/֫۬ۘ;->᩹:Z

    iget-object v11, v1, Ll/֫۬ۘ;->ۗ:Ljava/util/ArrayList;

    iget-object v12, v1, Ll/֫۬ۘ;->ۨ:Ll/ۜ۬ۘ;

    if-eq v9, v8, :cond_1

    .line 157
    iput v8, v1, Ll/֫۬ۘ;->᩺:I

    .line 159
    instance-of v8, v7, Landroid/text/TextPaint;

    iget-object v9, v1, Ll/֫۬ۘ;->ۛ:Landroid/text/TextPaint;

    if-eqz v8, :cond_0

    .line 161
    move-object v8, v7

    check-cast v8, Landroid/text/TextPaint;

    invoke-virtual {v9, v8}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    goto :goto_0

    .line 163
    :cond_0
    invoke-virtual {v9, v7}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 300
    :goto_0
    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 302
    iget-object v8, v1, Ll/֫۬ۘ;->᩸:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    .line 82
    iget v13, v12, Ll/ۜ۬ۘ;->ܽ:I

    mul-int/lit8 v13, v13, 0x2

    .line 304
    invoke-virtual {v1, v9}, Ll/֫۬ۘ;->֫(I)I

    move-result v9

    sub-int/2addr v9, v13

    .line 306
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 308
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v13

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v13, :cond_1

    .line 309
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ܰۗۘ;

    invoke-direct {v1, v14, v9, v15}, Ll/֫۬ۘ;->֫(IILl/ܰۗۘ;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 82
    :cond_1
    iget v8, v12, Ll/ۜ۬ۘ;->ܽ:I

    .line 172
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v9

    .line 174
    invoke-virtual {v1, v9}, Ll/֫۬ۘ;->֫(I)I

    move-result v13

    .line 177
    iget v14, v1, Ll/֫۬ۘ;->᩺:I

    div-int/2addr v14, v9

    sub-int v14, v13, v14

    .line 182
    iget-object v15, v1, Ll/֫۬ۘ;->۫:Landroid/graphics/Paint;

    if-eqz v10, :cond_2

    .line 133
    iget v10, v12, Ll/ۜ۬ۘ;->ܿ:I

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 134
    sget-object v10, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move/from16 p7, v8

    goto :goto_3

    .line 184
    :cond_2
    iget-boolean v10, v1, Ll/֫۬ۘ;->۬:Z

    if-eqz v10, :cond_4

    .line 111
    iget v10, v12, Ll/ۜ۬ۘ;->ܳ:I

    if-nez v10, :cond_3

    .line 112
    invoke-virtual {v15}, Landroid/graphics/Paint;->getColor()I

    move-result v10

    move/from16 p7, v8

    const/16 v8, 0x16

    invoke-static {v10, v8}, Ll/ۜ᩺ۘ;->֫(II)I

    move-result v10

    goto :goto_2

    :cond_3
    move/from16 p7, v8

    .line 116
    :goto_2
    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 117
    sget-object v8, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v15, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_3

    :cond_4
    move/from16 p7, v8

    .line 125
    iget v8, v12, Ll/ۜ۬ۘ;->ᩳ:I

    invoke-virtual {v15, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 126
    sget-object v8, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v15, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 192
    :goto_3
    invoke-virtual {v15}, Landroid/graphics/Paint;->getColor()I

    move-result v8

    iget-object v10, v1, Ll/֫۬ۘ;->ۤ:Landroid/graphics/Rect;

    if-eqz v8, :cond_5

    .line 193
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v8

    move/from16 v16, v14

    .line 195
    :try_start_0
    iget v14, v1, Ll/֫۬ۘ;->᩺:I

    move/from16 v17, v13

    sub-int v13, v6, v5

    move-object/from16 v18, v11

    const/4 v11, 0x0

    invoke-virtual {v10, v11, v11, v14, v13}, Landroid/graphics/Rect;->set(IIII)V

    int-to-float v11, v5

    .line 196
    invoke-virtual {v2, v4, v11}, Landroid/graphics/Canvas;->translate(FF)V

    .line 197
    invoke-virtual {v2, v10, v15}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    invoke-virtual {v2, v8}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-virtual {v2, v8}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 200
    throw v0

    :cond_5
    move-object/from16 v18, v11

    move/from16 v17, v13

    move/from16 v16, v14

    .line 207
    :goto_4
    invoke-virtual {v15, v7}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 98
    iget v7, v12, Ll/ۜ۬ۘ;->֫:I

    if-nez v7, :cond_6

    .line 99
    invoke-virtual {v15}, Landroid/graphics/Paint;->getColor()I

    move-result v7

    const/16 v8, 0x4b

    invoke-static {v7, v8}, Ll/ۜ᩺ۘ;->֫(II)I

    move-result v7

    .line 104
    :cond_6
    invoke-virtual {v15, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 106
    sget-object v7, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v15, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 87
    iget v7, v12, Ll/ۜ۬ۘ;->ۧ:I

    const/4 v8, -0x1

    if-ne v7, v8, :cond_7

    .line 88
    invoke-virtual {v15}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v7

    const/high16 v8, 0x3f000000    # 0.5f

    add-float/2addr v7, v8

    float-to-int v7, v7

    :cond_7
    if-lez v7, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    :goto_5
    sub-int v11, v6, v5

    .line 214
    iget v12, v1, Ll/֫۬ۘ;->᩶:I

    sub-int v12, v11, v12

    div-int/lit8 v12, v12, 0x4

    if-eqz v8, :cond_a

    .line 224
    move-object v13, v0

    check-cast v13, Landroid/text/Spanned;

    .line 225
    const-class v14, Ll/ܳ۬ۘ;

    move/from16 p9, v12

    move/from16 v12, p4

    invoke-interface {v13, v3, v12, v14}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Ll/ܳ۬ۘ;

    if-eqz v12, :cond_9

    .line 226
    array-length v13, v12

    if-lez v13, :cond_9

    const/4 v13, 0x0

    .line 227
    aget-object v12, v12, v13

    .line 8
    instance-of v13, v0, Landroid/text/Spanned;

    if-eqz v13, :cond_9

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {v0, v12}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v3, :cond_9

    float-to-int v0, v4

    .line 230
    iget v3, v1, Ll/֫۬ۘ;->᩺:I

    add-int v12, v5, v7

    invoke-virtual {v10, v0, v5, v3, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 231
    invoke-virtual {v2, v10, v15}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    const/4 v0, 0x1

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    :goto_6
    float-to-int v3, v4

    sub-int v12, v6, v7

    .line 237
    iget v13, v1, Ll/֫۬ۘ;->᩺:I

    invoke-virtual {v10, v3, v12, v13, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 238
    invoke-virtual {v2, v10, v15}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_7

    :cond_a
    move/from16 p9, v12

    const/4 v0, 0x0

    :goto_7
    if-eqz v0, :cond_b

    move v0, v7

    goto :goto_8

    :cond_b
    const/4 v0, 0x0

    :goto_8
    sub-int/2addr v11, v7

    const/4 v3, 0x0

    const/4 v6, 0x0

    :goto_9
    if-ge v3, v9, :cond_e

    move-object/from16 v12, v18

    .line 251
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/text/Layout;

    .line 252
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v14

    mul-int v12, v3, v17

    int-to-float v12, v12

    add-float/2addr v12, v4

    int-to-float v4, v5

    .line 255
    :try_start_1
    invoke-virtual {v2, v12, v4}, Landroid/graphics/Canvas;->translate(FF)V

    if-eqz v8, :cond_c

    const/4 v4, 0x0

    .line 259
    invoke-virtual {v10, v4, v0, v7, v11}, Landroid/graphics/Rect;->set(IIII)V

    .line 261
    invoke-virtual {v2, v10, v15}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    add-int/lit8 v4, v9, -0x1

    if-ne v3, v4, :cond_c

    sub-int v4, v17, v7

    sub-int v4, v4, v16

    sub-int v12, v17, v16

    .line 265
    invoke-virtual {v10, v4, v0, v12, v11}, Landroid/graphics/Rect;->set(IIII)V

    .line 271
    invoke-virtual {v2, v10, v15}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_c
    move/from16 v4, p7

    int-to-float v12, v4

    move/from16 p2, v0

    add-int v0, v4, p9

    int-to-float v0, v0

    .line 275
    invoke-virtual {v2, v12, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 276
    invoke-virtual {v13, v2}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 278
    invoke-virtual {v13}, Landroid/text/Layout;->getHeight()I

    move-result v0

    if-le v0, v6, :cond_d

    .line 279
    invoke-virtual {v13}, Landroid/text/Layout;->getHeight()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move v6, v0

    .line 283
    :cond_d
    invoke-virtual {v2, v14}, Landroid/graphics/Canvas;->restoreToCount(I)V

    add-int/lit8 v3, v3, 0x1

    move/from16 v0, p2

    move/from16 p7, v4

    move/from16 v4, p5

    goto :goto_9

    :catchall_1
    move-exception v0

    invoke-virtual {v2, v14}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 284
    throw v0

    .line 287
    :cond_e
    iget v0, v1, Ll/֫۬ۘ;->᩶:I

    if-eq v0, v6, :cond_f

    .line 288
    iget-object v0, v1, Ll/֫۬ۘ;->ۙ:Ll/۟ۗۘ;

    if-eqz v0, :cond_f

    .line 289
    check-cast v0, Ll/ᩳ۬ۘ;

    .line 53
    iget-object v2, v0, Ll/ᩳ۬ۘ;->ۧ:Landroid/widget/TextView;

    iget-object v0, v0, Ll/ᩳ۬ۘ;->֫:Ljava/lang/Runnable;

    invoke-virtual {v2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 54
    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_f
    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    .line 114
    iget-object p1, p0, Ll/֫۬ۘ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_2

    if-eqz p5, :cond_2

    .line 119
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/text/Layout;

    .line 120
    invoke-virtual {p4}, Landroid/text/Layout;->getHeight()I

    move-result p4

    if-le p4, p3, :cond_0

    move p3, p4

    goto :goto_0

    .line 127
    :cond_1
    iput p3, p0, Ll/֫۬ۘ;->᩶:I

    .line 130
    iget-object p1, p0, Ll/֫۬ۘ;->ۨ:Ll/ۜ۬ۘ;

    .line 82
    iget p1, p1, Ll/ۜ۬ۘ;->ܽ:I

    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p3

    neg-int p1, p1

    .line 132
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 133
    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 135
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 136
    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 140
    :cond_2
    iget p1, p0, Ll/֫۬ۘ;->᩺:I

    return p1
.end method

.method public final ֫()I
    .locals 1

    .line 400
    iget-object v0, p0, Ll/֫۬ۘ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/֫۬ۘ;->֫(I)I

    move-result v0

    return v0
.end method

.method public final ֫(I)I
    .locals 2

    .line 405
    iget v0, p0, Ll/֫۬ۘ;->᩺:I

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float v0, v0, v1

    int-to-float p1, p1

    div-float/2addr v0, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr v0, p1

    float-to-int p1, v0

    return p1
.end method

.method public final ֫(Ll/۟ۗۘ;)V
    .locals 0

    .line 426
    iput-object p1, p0, Ll/֫۬ۘ;->ۙ:Ll/۟ۗۘ;

    return-void
.end method

.method public final ۧ(I)Landroid/text/Layout;
    .locals 3

    .line 387
    iget-object v0, p0, Ll/֫۬ۘ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 388
    invoke-virtual {p0, v1}, Ll/֫۬ۘ;->֫(I)I

    move-result v2

    .line 389
    div-int/2addr p1, v2

    if-lt p1, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 393
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/text/Layout;

    return-object p1
.end method
