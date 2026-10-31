.class public final Ll/֫ۗۧ;
.super Ll/۟ۗۧ;
.source "B66A"

# interfaces
.implements Ll/᩻۬ۧ;


# instance fields
.field public ֡:Ll/۬۬ۧ;

.field public ֨:Ll/ۗ۬ۧ;

.field public ֫:I

.field public final ۖ:Ll/᩷۬ۧ;

.field public final ۗ:[F

.field public ۘ:Landroid/view/View;

.field public ۙ:F

.field public final ۚ:Ljava/lang/Runnable;

.field public ۜ:Ll/֨ۛ;

.field public ۠:I

.field public ۡ:Ll/ۛۙۧ;

.field public ۢ:F

.field public ۧ:I

.field public ۫:Landroid/view/VelocityTracker;

.field public ۬:Landroid/graphics/Rect;

.field public ܳ:F

.field public ܶ:F

.field public ܺ:F

.field public ܽ:Ll/ۤۙۧ;

.field public ܿ:J

.field public ᩳ:Ljava/util/ArrayList;

.field public final ᩴ:Ljava/util/ArrayList;

.field public ᩵:Ljava/util/ArrayList;

.field public ᩶:Ljava/util/ArrayList;

.field public ᩷:F

.field public ᩸:F

.field public ᩹:I

.field public ᩻:F


# direct methods
.method public constructor <init>(Ll/ۤۙۧ;)V
    .locals 2

    .line 449
    invoke-direct {p0}, Ll/۟ۗۧ;-><init>()V

    .line 169
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫ۗۧ;->ᩴ:Ljava/util/ArrayList;

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 174
    iput-object v0, p0, Ll/֫ۗۧ;->ۗ:[F

    const/4 v0, 0x0

    .line 179
    iput-object v0, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    const/4 v1, -0x1

    .line 219
    iput v1, p0, Ll/֫ۗۧ;->ۧ:I

    const/4 v1, 0x0

    .line 231
    iput v1, p0, Ll/֫ۗۧ;->֫:I

    .line 248
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/֫ۗۧ;->᩵:Ljava/util/ArrayList;

    .line 259
    new-instance v1, Ll/᩹ۙۧ;

    invoke-direct {v1, p0}, Ll/᩹ۙۧ;-><init>(Ll/֫ۗۧ;)V

    iput-object v1, p0, Ll/֫ۗۧ;->ۚ:Ljava/lang/Runnable;

    .line 294
    iput-object v0, p0, Ll/֫ۗۧ;->ۘ:Landroid/view/View;

    .line 316
    new-instance v0, Ll/᩶ۙۧ;

    invoke-direct {v0, p0}, Ll/᩶ۙۧ;-><init>(Ll/֫ۗۧ;)V

    iput-object v0, p0, Ll/֫ۗۧ;->ۖ:Ll/᩷۬ۧ;

    .line 450
    iput-object p1, p0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    return-void
.end method

.method private ֫([F)V
    .locals 3

    .line 531
    iget v0, p0, Ll/֫ۗۧ;->۠:I

    and-int/lit8 v0, v0, 0xc

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 532
    iget v0, p0, Ll/֫ۗۧ;->ܶ:F

    iget v2, p0, Ll/֫ۗۧ;->ܳ:F

    add-float/2addr v0, v2

    iget-object v2, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget-object v2, v2, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    aput v0, p1, v1

    goto :goto_0

    .line 534
    :cond_0
    iget-object v0, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget-object v0, v0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    aput v0, p1, v1

    .line 536
    :goto_0
    iget v0, p0, Ll/֫ۗۧ;->۠:I

    and-int/lit8 v0, v0, 0x3

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 537
    iget v0, p0, Ll/֫ۗۧ;->᩸:F

    iget v2, p0, Ll/֫ۗۧ;->᩻:F

    add-float/2addr v0, v2

    iget-object v2, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget-object v2, v2, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    aput v0, p1, v1

    return-void

    .line 539
    :cond_1
    iget-object v0, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget-object v0, v0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    aput v0, p1, v1

    return-void
.end method

.method public static ֫(Landroid/view/View;FFFF)Z
    .locals 1

    cmpl-float v0, p1, p3

    if-ltz v0, :cond_0

    .line 455
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p3, v0

    cmpg-float p1, p1, p3

    if-gtz p1, :cond_0

    cmpl-float p1, p2, p4

    if-ltz p1, :cond_0

    .line 457
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    add-float/2addr p4, p0

    cmpg-float p0, p2, p4

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ۧ(Ll/ۗ۬ۧ;I)I
    .locals 6

    and-int/lit8 p1, p2, 0xc

    if-eqz p1, :cond_3

    .line 1249
    iget p1, p0, Ll/֫ۗۧ;->ܳ:F

    const/4 v0, 0x4

    const/4 v1, 0x0

    cmpl-float p1, p1, v1

    if-lez p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    .line 1250
    :goto_0
    iget-object v2, p0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    iget-object v3, p0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    if-eqz v2, :cond_2

    iget v4, p0, Ll/֫ۗۧ;->ۧ:I

    const/4 v5, -0x1

    if-le v4, v5, :cond_2

    .line 1251
    iget v4, p0, Ll/֫ۗۧ;->ܺ:F

    .line 1252
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v5, 0x3e8

    .line 1251
    invoke-virtual {v2, v5, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 1253
    iget-object v2, p0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    iget v4, p0, Ll/֫ۗۧ;->ۧ:I

    invoke-virtual {v2, v4}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v2

    .line 1254
    iget-object v4, p0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    iget v5, p0, Ll/֫ۗۧ;->ۧ:I

    invoke-virtual {v4, v5}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v4

    cmpl-float v1, v2, v1

    if-lez v1, :cond_1

    const/16 v0, 0x8

    .line 1256
    :cond_1
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    and-int v2, v0, p2

    if-eqz v2, :cond_2

    if-ne p1, v0, :cond_2

    .line 1257
    iget v2, p0, Ll/֫ۗۧ;->ۙ:F

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_2

    .line 1259
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_2

    return v0

    .line 1264
    :cond_2
    iget-object v0, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 1265
    invoke-virtual {v3}, Ll/ۤۙۧ;->֫()F

    move-result v1

    mul-float v1, v1, v0

    and-int/2addr p2, p1

    if-eqz p2, :cond_3

    .line 1267
    iget p2, p0, Ll/֫ۗۧ;->ܳ:F

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p2, p2, v1

    if-lez p2, :cond_3

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method private ܽ(Ll/ۗ۬ۧ;I)I
    .locals 6

    and-int/lit8 p1, p2, 0x3

    if-eqz p1, :cond_3

    .line 1276
    iget p1, p0, Ll/֫ۗۧ;->᩻:F

    const/4 v0, 0x1

    const/4 v1, 0x0

    cmpl-float p1, p1, v1

    if-lez p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 1277
    :goto_0
    iget-object v2, p0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    iget-object v3, p0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    if-eqz v2, :cond_2

    iget v4, p0, Ll/֫ۗۧ;->ۧ:I

    const/4 v5, -0x1

    if-le v4, v5, :cond_2

    .line 1278
    iget v4, p0, Ll/֫ۗۧ;->ܺ:F

    .line 1279
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v5, 0x3e8

    .line 1278
    invoke-virtual {v2, v5, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 1280
    iget-object v2, p0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    iget v4, p0, Ll/֫ۗۧ;->ۧ:I

    invoke-virtual {v2, v4}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v2

    .line 1281
    iget-object v4, p0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    iget v5, p0, Ll/֫ۗۧ;->ۧ:I

    invoke-virtual {v4, v5}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v4

    cmpl-float v1, v4, v1

    if-lez v1, :cond_1

    const/4 v0, 0x2

    .line 1283
    :cond_1
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    and-int v4, v0, p2

    if-eqz v4, :cond_2

    if-ne v0, p1, :cond_2

    .line 1284
    iget v4, p0, Ll/֫ۗۧ;->ۙ:F

    cmpl-float v4, v1, v4

    if-ltz v4, :cond_2

    .line 1286
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_2

    return v0

    .line 1291
    :cond_2
    iget-object v0, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    .line 1292
    invoke-virtual {v3}, Ll/ۤۙۧ;->֫()F

    move-result v1

    mul-float v1, v1, v0

    and-int/2addr p2, p1

    if-eqz p2, :cond_3

    .line 1293
    iget p2, p0, Ll/֫ۗۧ;->᩻:F

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p2, p2, v1

    if-lez p2, :cond_3

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Ll/۬۬ۧ;Ll/᩸۬ۧ;)V
    .locals 0

    .line 942
    invoke-virtual {p1}, Landroid/graphics/Rect;->setEmpty()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;Ll/۬۬ۧ;Ll/᩸۬ۧ;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    .line 565
    iget-object v1, v0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 566
    iget-object v1, v0, Ll/֫ۗۧ;->ۗ:[F

    invoke-direct {v0, v1}, Ll/֫ۗۧ;->֫([F)V

    .line 567
    aget v2, v1, v2

    const/4 v3, 0x1

    .line 568
    aget v1, v1, v3

    move v11, v1

    move v10, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 570
    :goto_0
    iget-object v12, v0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget v13, v0, Ll/֫ۗۧ;->֫:I

    iget-object v14, v0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1990
    iget-object v15, v0, Ll/֫ۗۧ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v1, 0x0

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v8, :cond_1

    .line 1992
    invoke-interface {v15, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۙۧ;

    .line 1993
    invoke-virtual {v1}, Ll/᩺ۙۧ;->֫()V

    .line 1994
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v6

    .line 1995
    iget-object v4, v1, Ll/᩺ۙۧ;->ۡ:Ll/ۗ۬ۧ;

    iget v5, v1, Ll/᩺ۙۧ;->ܺ:F

    iget v3, v1, Ll/᩺ۙۧ;->ۖ:F

    iget v2, v1, Ll/᩺ۙۧ;->֫:I

    const/16 v16, 0x0

    move-object v1, v14

    move/from16 v17, v2

    move-object/from16 v2, p1

    move/from16 v18, v3

    move-object/from16 v3, p2

    move/from16 v19, v6

    move/from16 v6, v18

    move/from16 v18, v7

    move/from16 v7, v17

    move/from16 v17, v8

    move/from16 v8, v16

    invoke-virtual/range {v1 .. v8}, Ll/ۤۙۧ;->֫(Landroid/graphics/Canvas;Ll/۬۬ۧ;Ll/ۗ۬ۧ;FFIZ)V

    move/from16 v1, v19

    .line 1997
    invoke-virtual {v9, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    add-int/lit8 v7, v18, 0x1

    move/from16 v8, v17

    goto :goto_1

    :cond_1
    if-eqz v12, :cond_2

    .line 2000
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v15

    const/4 v8, 0x1

    move-object v1, v14

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v12

    move v5, v10

    move v6, v11

    move v7, v13

    .line 2001
    invoke-virtual/range {v1 .. v8}, Ll/ۤۙۧ;->֫(Landroid/graphics/Canvas;Ll/۬۬ۧ;Ll/ۗ۬ۧ;FFIZ)V

    .line 2002
    invoke-virtual {v9, v15}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_2
    return-void
.end method

.method public final onDrawOver(Landroid/graphics/Canvas;Ll/۬۬ۧ;Ll/᩸۬ۧ;)V
    .locals 7

    .line 550
    iget-object p3, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    .line 551
    iget-object p3, p0, Ll/֫ۗۧ;->ۗ:[F

    invoke-direct {p0, p3}, Ll/֫ۗۧ;->֫([F)V

    .line 552
    aget v2, p3, v1

    .line 553
    aget p3, p3, v0

    .line 555
    :cond_0
    iget-object p3, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget-object v2, p0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2009
    iget-object v2, p0, Ll/֫ۗۧ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    .line 2011
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺ۙۧ;

    .line 2012
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v6

    .line 2013
    iget-object v5, v5, Ll/᩺ۙۧ;->ۡ:Ll/ۗ۬ۧ;

    .line 2118
    iget-object v5, v5, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 2015
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    .line 2018
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result p3

    .line 2020
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_2
    sub-int/2addr v3, v0

    :goto_1
    if-ltz v3, :cond_5

    .line 2024
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ۙۧ;

    .line 2025
    iget-boolean p3, p1, Ll/᩺ۙۧ;->ۧ:Z

    if-eqz p3, :cond_3

    iget-boolean p1, p1, Ll/᩺ۙۧ;->ᩳ:Z

    if-nez p1, :cond_3

    .line 2026
    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    if-nez p3, :cond_4

    const/4 p1, 0x1

    const/4 v1, 0x1

    :cond_4
    :goto_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_5
    if-eqz v1, :cond_6

    .line 2032
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    :cond_6
    return-void
.end method

.method public final ֫(IILandroid/view/MotionEvent;)V
    .locals 8

    .line 991
    iget-object v0, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    if-nez v0, :cond_e

    const/4 v0, 0x2

    if-ne p1, v0, :cond_e

    iget p1, p0, Ll/֫ۗۧ;->֫:I

    if-eq p1, v0, :cond_e

    .line 992
    iget-object p1, p0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    invoke-virtual {p1}, Ll/ۤۙۧ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 995
    :cond_0
    iget-object v1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v1}, Ll/۬۬ۧ;->getScrollState()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    goto/16 :goto_1

    .line 961
    :cond_1
    iget-object v1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v1}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v1

    .line 962
    iget v3, p0, Ll/֫ۗۧ;->ۧ:I

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-ne v3, v4, :cond_2

    goto :goto_0

    .line 965
    :cond_2
    invoke-virtual {p3, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    .line 966
    invoke-virtual {p3, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    iget v6, p0, Ll/֫ۗۧ;->᩷:F

    sub-float/2addr v4, v6

    .line 967
    invoke-virtual {p3, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    iget v6, p0, Ll/֫ۗۧ;->ۢ:F

    sub-float/2addr v3, v6

    .line 968
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 969
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 971
    iget v6, p0, Ll/֫ۗۧ;->᩹:I

    int-to-float v6, v6

    cmpg-float v7, v4, v6

    if-gez v7, :cond_3

    cmpg-float v6, v3, v6

    if-gez v6, :cond_3

    goto :goto_0

    :cond_3
    cmpl-float v6, v4, v3

    if-lez v6, :cond_4

    .line 974
    invoke-virtual {v1}, Ll/ܿ۬ۧ;->canScrollHorizontally()Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_0

    :cond_4
    cmpl-float v3, v3, v4

    if-lez v3, :cond_5

    .line 976
    invoke-virtual {v1}, Ll/ܿ۬ۧ;->canScrollVertically()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_0

    .line 979
    :cond_5
    invoke-virtual {p0, p3}, Ll/֫ۗۧ;->ܽ(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_0

    .line 983
    :cond_6
    iget-object v3, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v3, v1}, Ll/۬۬ۧ;->getChildViewHolder(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v5

    :goto_0
    if-nez v5, :cond_7

    goto/16 :goto_1

    .line 1002
    :cond_7
    iget-object v1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    .line 1604
    invoke-virtual {p1, v5}, Ll/ۤۙۧ;->ۧ(Ll/ۗ۬ۧ;)I

    move-result p1

    .line 1605
    sget v3, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    move-result v1

    .line 1605
    invoke-static {p1, v1}, Ll/ۤۙۧ;->֫(II)I

    move-result p1

    const v1, 0xff00

    and-int/2addr p1, v1

    shr-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_8

    goto :goto_1

    .line 1013
    :cond_8
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    .line 1014
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p2

    .line 1017
    iget v3, p0, Ll/֫ۗۧ;->᩷:F

    sub-float/2addr v1, v3

    .line 1018
    iget v3, p0, Ll/֫ۗۧ;->ۢ:F

    sub-float/2addr p2, v3

    .line 1021
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 1022
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 1024
    iget v6, p0, Ll/֫ۗۧ;->᩹:I

    int-to-float v6, v6

    cmpg-float v7, v3, v6

    if-gez v7, :cond_9

    cmpg-float v6, v4, v6

    if-gez v6, :cond_9

    goto :goto_1

    :cond_9
    const/4 v6, 0x0

    cmpl-float v3, v3, v4

    if-lez v3, :cond_b

    cmpg-float p2, v1, v6

    if-gez p2, :cond_a

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_a

    goto :goto_1

    :cond_a
    cmpl-float p2, v1, v6

    if-lez p2, :cond_d

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_d

    goto :goto_1

    :cond_b
    cmpg-float v1, p2, v6

    if-gez v1, :cond_c

    and-int/lit8 v1, p1, 0x1

    if-nez v1, :cond_c

    goto :goto_1

    :cond_c
    cmpl-float p2, p2, v6

    if-lez p2, :cond_d

    and-int/2addr p1, v0

    if-nez p1, :cond_d

    goto :goto_1

    .line 1042
    :cond_d
    iput v6, p0, Ll/֫ۗۧ;->᩻:F

    iput v6, p0, Ll/֫ۗۧ;->ܳ:F

    const/4 p1, 0x0

    .line 1043
    invoke-virtual {p3, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ll/֫ۗۧ;->ۧ:I

    .line 1044
    invoke-virtual {p0, v5, v2}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;I)V

    :cond_e
    :goto_1
    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 2

    .line 904
    invoke-virtual {p0, p1}, Ll/֫ۗۧ;->ܽ(Landroid/view/View;)V

    .line 905
    iget-object v0, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0, p1}, Ll/۬۬ۧ;->getChildViewHolder(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 909
    :cond_0
    iget-object v0, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    .line 910
    invoke-virtual {p0, p1, v1}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;I)V

    return-void

    .line 912
    :cond_1
    invoke-virtual {p0, p1, v1}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;Z)V

    .line 913
    iget-object v0, p0, Ll/֫ۗۧ;->ᩴ:Ljava/util/ArrayList;

    iget-object v1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 914
    iget-object v0, p0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    iget-object v1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0, v1, p1}, Ll/ۤۙۧ;->֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ۗ۬ۧ;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    .line 863
    iget-object v1, v0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_7

    .line 866
    :cond_0
    iget v1, v0, Ll/֫ۗۧ;->֫:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    goto/16 :goto_7

    .line 870
    :cond_1
    iget-object v1, v0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    iget v4, v0, Ll/֫ۗۧ;->ܶ:F

    iget v5, v0, Ll/֫ۗۧ;->ܳ:F

    add-float/2addr v4, v5

    float-to-int v7, v4

    .line 872
    iget v4, v0, Ll/֫ۗۧ;->᩸:F

    iget v5, v0, Ll/֫ۗۧ;->᩻:F

    add-float/2addr v4, v5

    float-to-int v8, v4

    .line 873
    iget-object v4, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int v4, v8, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    int-to-float v4, v4

    iget-object v5, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    const/high16 v6, 0x3f000000    # 0.5f

    mul-float v5, v5, v6

    cmpg-float v4, v4, v5

    if-gez v4, :cond_2

    iget-object v4, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 874
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v4

    sub-int v4, v7, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    int-to-float v4, v4

    iget-object v5, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 875
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    mul-float v5, v5, v6

    cmpg-float v4, v4, v5

    if-gez v4, :cond_2

    goto/16 :goto_7

    .line 810
    :cond_2
    iget-object v4, v0, Ll/֫ۗۧ;->᩶:Ljava/util/ArrayList;

    if-nez v4, :cond_3

    .line 811
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Ll/֫ۗۧ;->᩶:Ljava/util/ArrayList;

    .line 812
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Ll/֫ۗۧ;->ᩳ:Ljava/util/ArrayList;

    goto :goto_0

    .line 814
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 815
    iget-object v4, v0, Ll/֫ۗۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 818
    :goto_0
    iget v4, v0, Ll/֫ۗۧ;->ܶ:F

    iget v5, v0, Ll/֫ۗۧ;->ܳ:F

    add-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 819
    iget v5, v0, Ll/֫ۗۧ;->᩸:F

    iget v6, v0, Ll/֫ۗۧ;->᩻:F

    add-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 820
    iget-object v6, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v6

    add-int/2addr v6, v4

    .line 821
    iget-object v9, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    move-result v9

    add-int/2addr v9, v5

    add-int v10, v4, v6

    .line 822
    div-int/2addr v10, v2

    add-int v11, v5, v9

    .line 823
    div-int/2addr v11, v2

    .line 824
    iget-object v2, v0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v2}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v2

    .line 825
    invoke-virtual {v2}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v12

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v12, :cond_8

    .line 827
    invoke-virtual {v2, v13}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    .line 828
    iget-object v15, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    if-ne v14, v15, :cond_5

    :cond_4
    :goto_2
    move-object/from16 v16, v2

    move/from16 v19, v4

    move/from16 v17, v5

    goto/16 :goto_4

    .line 831
    :cond_5
    invoke-virtual {v14}, Landroid/view/View;->getBottom()I

    move-result v15

    if-lt v15, v5, :cond_4

    invoke-virtual {v14}, Landroid/view/View;->getTop()I

    move-result v15

    if-gt v15, v9, :cond_4

    .line 832
    invoke-virtual {v14}, Landroid/view/View;->getRight()I

    move-result v15

    if-lt v15, v4, :cond_4

    invoke-virtual {v14}, Landroid/view/View;->getLeft()I

    move-result v15

    if-le v15, v6, :cond_6

    goto :goto_2

    .line 835
    :cond_6
    iget-object v15, v0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v15, v14}, Ll/۬۬ۧ;->getChildViewHolder(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v15

    .line 836
    invoke-virtual {v1, v15}, Ll/ۤۙۧ;->֫(Ll/ۗ۬ۧ;)Z

    move-result v16

    if-eqz v16, :cond_4

    .line 838
    invoke-virtual {v14}, Landroid/view/View;->getLeft()I

    move-result v16

    invoke-virtual {v14}, Landroid/view/View;->getRight()I

    move-result v17

    add-int v17, v17, v16

    div-int/lit8 v17, v17, 0x2

    sub-int v16, v10, v17

    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->abs(I)I

    move-result v16

    .line 839
    invoke-virtual {v14}, Landroid/view/View;->getTop()I

    move-result v17

    invoke-virtual {v14}, Landroid/view/View;->getBottom()I

    move-result v14

    add-int v14, v14, v17

    div-int/lit8 v14, v14, 0x2

    sub-int v14, v11, v14

    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    move-result v14

    mul-int v16, v16, v16

    mul-int v14, v14, v14

    add-int v14, v14, v16

    move-object/from16 v16, v2

    .line 843
    iget-object v2, v0, Ll/֫ۗۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v19, v4

    move/from16 v17, v5

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_3
    if-ge v4, v2, :cond_7

    move/from16 v18, v2

    .line 845
    iget-object v2, v0, Ll/֫ۗۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-le v14, v2, :cond_7

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v4, v4, 0x1

    move/from16 v2, v18

    goto :goto_3

    .line 851
    :cond_7
    iget-object v2, v0, Ll/֫ۗۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v2, v5, v15}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 852
    iget-object v2, v0, Ll/֫ۗۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v5, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :goto_4
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v2, v16

    move/from16 v5, v17

    move/from16 v4, v19

    goto/16 :goto_1

    .line 855
    :cond_8
    iget-object v2, v0, Ll/֫ۗۧ;->᩶:Ljava/util/ArrayList;

    .line 879
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_7

    .line 1814
    :cond_9
    iget-object v4, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v4, v7

    .line 1815
    iget-object v5, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v5, v8

    .line 1818
    iget-object v6, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v6

    sub-int v6, v7, v6

    .line 1819
    iget-object v9, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->getTop()I

    move-result v9

    sub-int v9, v8, v9

    .line 1820
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, -0x1

    const/4 v13, 0x0

    :goto_5
    if-ge v13, v10, :cond_f

    .line 1822
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۗ۬ۧ;

    if-lez v6, :cond_a

    .line 1824
    iget-object v15, v14, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v15}, Landroid/view/View;->getRight()I

    move-result v15

    sub-int/2addr v15, v4

    if-gez v15, :cond_a

    move-object/from16 v16, v2

    .line 1825
    iget-object v2, v14, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v2

    move/from16 v17, v4

    iget-object v4, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v4

    if-le v2, v4, :cond_b

    .line 1826
    invoke-static {v15}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-le v2, v12, :cond_b

    move v12, v2

    move-object v11, v14

    goto :goto_6

    :cond_a
    move-object/from16 v16, v2

    move/from16 v17, v4

    :cond_b
    :goto_6
    if-gez v6, :cond_c

    .line 1834
    iget-object v2, v14, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    sub-int/2addr v2, v7

    if-lez v2, :cond_c

    .line 1835
    iget-object v4, v14, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v4

    iget-object v15, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v15}, Landroid/view/View;->getLeft()I

    move-result v15

    if-ge v4, v15, :cond_c

    .line 1836
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-le v2, v12, :cond_c

    move v12, v2

    move-object v11, v14

    :cond_c
    if-gez v9, :cond_d

    .line 1844
    iget-object v2, v14, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v2, v8

    if-lez v2, :cond_d

    .line 1845
    iget-object v4, v14, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    iget-object v15, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v15}, Landroid/view/View;->getTop()I

    move-result v15

    if-ge v4, v15, :cond_d

    .line 1846
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-le v2, v12, :cond_d

    move v12, v2

    move-object v11, v14

    :cond_d
    if-lez v9, :cond_e

    .line 1855
    iget-object v2, v14, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    sub-int/2addr v2, v5

    if-gez v2, :cond_e

    .line 1856
    iget-object v4, v14, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v4

    iget-object v15, v3, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v15}, Landroid/view/View;->getBottom()I

    move-result v15

    if-le v4, v15, :cond_e

    .line 1857
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-le v2, v12, :cond_e

    move v12, v2

    move-object v11, v14

    :cond_e
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v2, v16

    move/from16 v4, v17

    goto/16 :goto_5

    :cond_f
    if-nez v11, :cond_10

    .line 885
    iget-object v1, v0, Ll/֫ۗۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 886
    iget-object v1, v0, Ll/֫ۗۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    return-void

    .line 889
    :cond_10
    invoke-virtual {v11}, Ll/ۗ۬ۧ;->getAbsoluteAdapterPosition()I

    move-result v6

    .line 890
    invoke-virtual/range {p1 .. p1}, Ll/ۗ۬ۧ;->getAbsoluteAdapterPosition()I

    move-result v4

    .line 891
    iget-object v2, v0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v1, v2, v3, v11}, Ll/ۤۙۧ;->֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;Ll/ۗ۬ۧ;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 893
    iget-object v1, v0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    iget-object v2, v0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    move-object/from16 v3, p1

    move-object v5, v11

    invoke-virtual/range {v1 .. v8}, Ll/ۤۙۧ;->֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;ILl/ۗ۬ۧ;III)V

    :cond_11
    :goto_7
    return-void
.end method

.method public final ֫(Ll/ۗ۬ۧ;I)V
    .locals 18

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move/from16 v12, p2

    .line 583
    iget-object v0, v10, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    if-ne v11, v0, :cond_0

    iget v0, v10, Ll/֫ۗۧ;->֫:I

    if-ne v12, v0, :cond_0

    return-void

    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    .line 586
    iput-wide v0, v10, Ll/֫ۗۧ;->ܿ:J

    .line 587
    iget v3, v10, Ll/֫ۗۧ;->֫:I

    const/4 v0, 0x1

    .line 589
    invoke-virtual {v10, v11, v0}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;Z)V

    .line 590
    iput v12, v10, Ll/֫ۗۧ;->֫:I

    const/4 v1, 0x2

    if-ne v12, v1, :cond_2

    if-eqz v11, :cond_1

    .line 599
    iget-object v2, v11, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    iput-object v2, v10, Ll/֫ۗۧ;->ۘ:Landroid/view/View;

    goto :goto_0

    .line 593
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must pass a ViewHolder when dragging"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    mul-int/lit8 v2, v12, 0x8

    const/16 v13, 0x8

    add-int/2addr v2, v13

    shl-int v2, v0, v2

    add-int/lit8 v14, v2, -0x1

    .line 606
    iget-object v15, v10, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget-object v9, v10, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    if-eqz v15, :cond_15

    .line 608
    iget-object v2, v15, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_14

    if-ne v3, v1, :cond_3

    goto/16 :goto_2

    .line 1202
    :cond_3
    iget v2, v10, Ll/֫ۗۧ;->֫:I

    if-ne v2, v1, :cond_4

    goto/16 :goto_2

    .line 1205
    :cond_4
    invoke-virtual {v9, v15}, Ll/ۤۙۧ;->ۧ(Ll/ۗ۬ۧ;)I

    move-result v2

    .line 1206
    iget-object v5, v10, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    .line 1208
    sget v6, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    move-result v5

    .line 1206
    invoke-static {v2, v5}, Ll/ۤۙۧ;->֫(II)I

    move-result v5

    const v6, 0xff00

    and-int/2addr v5, v6

    shr-int/2addr v5, v13

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    and-int/2addr v2, v6

    shr-int/2addr v2, v13

    .line 1217
    iget v6, v10, Ll/֫ۗۧ;->ܳ:F

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    iget v7, v10, Ll/֫ۗۧ;->᩻:F

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    cmpl-float v6, v6, v7

    if-lez v6, :cond_7

    .line 1218
    invoke-direct {v10, v15, v5}, Ll/֫ۗۧ;->ۧ(Ll/ۗ۬ۧ;I)I

    move-result v6

    if-lez v6, :cond_6

    and-int/2addr v2, v6

    if-nez v2, :cond_8

    .line 1222
    iget-object v2, v10, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    .line 1977
    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    move-result v2

    .line 1222
    invoke-static {v6, v2}, Ll/ۤۙۧ;->ۧ(II)I

    move-result v2

    goto :goto_1

    .line 1227
    :cond_6
    invoke-direct {v10, v15, v5}, Ll/֫ۗۧ;->ܽ(Ll/ۗ۬ۧ;I)I

    move-result v2

    if-lez v2, :cond_b

    :goto_1
    move v8, v2

    goto :goto_3

    .line 1231
    :cond_7
    invoke-direct {v10, v15, v5}, Ll/֫ۗۧ;->ܽ(Ll/ۗ۬ۧ;I)I

    move-result v6

    if-lez v6, :cond_9

    :cond_8
    move v8, v6

    goto :goto_3

    .line 1234
    :cond_9
    invoke-direct {v10, v15, v5}, Ll/֫ۗۧ;->ۧ(Ll/ۗ۬ۧ;I)I

    move-result v5

    if-lez v5, :cond_b

    and-int/2addr v2, v5

    if-nez v2, :cond_a

    .line 1238
    iget-object v2, v10, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    .line 1977
    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    move-result v2

    .line 1238
    invoke-static {v5, v2}, Ll/ۤۙۧ;->ۧ(II)I

    move-result v2

    goto :goto_1

    :cond_a
    move v8, v5

    goto :goto_3

    :cond_b
    :goto_2
    const/4 v2, 0x0

    const/4 v8, 0x0

    .line 954
    :goto_3
    iget-object v2, v10, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_c

    .line 955
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->recycle()V

    .line 956
    iput-object v4, v10, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    :cond_c
    const/4 v2, 0x4

    const/4 v4, 0x0

    if-eq v8, v0, :cond_e

    if-eq v8, v1, :cond_e

    if-eq v8, v2, :cond_d

    if-eq v8, v13, :cond_d

    const/16 v5, 0x10

    if-eq v8, v5, :cond_d

    const/16 v5, 0x20

    if-eq v8, v5, :cond_d

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    goto :goto_4

    .line 621
    :cond_d
    iget v4, v10, Ll/֫ۗۧ;->ܳ:F

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v4

    const/4 v6, 0x0

    iget-object v5, v10, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    mul-float v4, v4, v5

    const/4 v5, 0x0

    move v7, v4

    :goto_4
    const/16 v16, 0x0

    goto :goto_5

    :cond_e
    const/4 v6, 0x0

    .line 626
    iget v5, v10, Ll/֫ۗۧ;->᩻:F

    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    move-result v5

    iget-object v7, v10, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v7

    int-to-float v7, v7

    mul-float v5, v5, v7

    move/from16 v16, v5

    const/4 v7, 0x0

    :goto_5
    if-ne v3, v1, :cond_f

    const/16 v2, 0x8

    const/16 v5, 0x8

    goto :goto_6

    :cond_f
    if-lez v8, :cond_10

    const/4 v2, 0x2

    const/4 v5, 0x2

    goto :goto_6

    :cond_10
    const/4 v5, 0x4

    .line 639
    :goto_6
    iget-object v1, v10, Ll/֫ۗۧ;->ۗ:[F

    invoke-direct {v10, v1}, Ll/֫ۗۧ;->֫([F)V

    .line 640
    aget v4, v1, v6

    .line 641
    aget v6, v1, v0

    .line 642
    new-instance v2, Ll/ۙۙۧ;

    const/4 v1, 0x0

    move-object v0, v2

    move-object/from16 v1, p0

    move-object/from16 v17, v2

    move-object v2, v15

    move v13, v5

    move v5, v6

    move v6, v7

    move/from16 v7, v16

    move-object/from16 v16, v9

    move-object v9, v15

    invoke-direct/range {v0 .. v9}, Ll/ۙۙۧ;-><init>(Ll/֫ۗۧ;Ll/ۗ۬ۧ;IFFFFILl/ۗ۬ۧ;)V

    .line 671
    iget-object v0, v10, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2145
    invoke-virtual {v0}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_12

    if-ne v13, v1, :cond_11

    const-wide/16 v0, 0xc8

    goto :goto_7

    :cond_11
    const-wide/16 v0, 0xfa

    goto :goto_7

    :cond_12
    if-ne v13, v1, :cond_13

    .line 2150
    invoke-virtual {v0}, Ll/᩺ۗۧ;->ܿ()J

    move-result-wide v0

    goto :goto_7

    .line 2151
    :cond_13
    invoke-virtual {v0}, Ll/᩺ۗۧ;->ܳ()J

    move-result-wide v0

    :goto_7
    move-object/from16 v2, v17

    .line 2438
    iget-object v3, v2, Ll/᩺ۙۧ;->ۢ:Landroid/animation/ValueAnimator;

    invoke-virtual {v3, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 674
    iget-object v0, v10, Ll/֫ۗۧ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 2442
    invoke-virtual {v15, v0}, Ll/ۗ۬ۧ;->setIsRecyclable(Z)V

    .line 2443
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->start()V

    const/4 v1, 0x1

    move-object/from16 v2, v16

    const/4 v0, 0x1

    const/4 v1, 0x0

    goto :goto_8

    :cond_14
    move-object/from16 v16, v9

    const/4 v1, 0x0

    .line 678
    iget-object v0, v15, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v10, v0}, Ll/֫ۗۧ;->ܽ(Landroid/view/View;)V

    .line 679
    iget-object v0, v10, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v15}, Ll/ۤۙۧ;->֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;)V

    const/4 v0, 0x0

    :goto_8
    const/4 v3, 0x0

    .line 681
    iput-object v3, v10, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    goto :goto_9

    :cond_15
    move-object v2, v9

    const/4 v1, 0x0

    const/4 v0, 0x0

    :goto_9
    if-eqz v11, :cond_16

    .line 684
    iget-object v3, v10, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    .line 1604
    invoke-virtual {v2, v11}, Ll/ۤۙۧ;->ۧ(Ll/ۗ۬ۧ;)I

    move-result v4

    .line 1605
    sget v5, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {v3}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    .line 1605
    invoke-static {v4, v3}, Ll/ۤۙۧ;->֫(II)I

    move-result v3

    and-int/2addr v3, v14

    .line 685
    iget v4, v10, Ll/֫ۗۧ;->֫:I

    mul-int/lit8 v4, v4, 0x8

    shr-int/2addr v3, v4

    iput v3, v10, Ll/֫ۗۧ;->۠:I

    .line 687
    iget-object v3, v11, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    int-to-float v3, v3

    iput v3, v10, Ll/֫ۗۧ;->ܶ:F

    .line 688
    iget-object v3, v11, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    int-to-float v3, v3

    iput v3, v10, Ll/֫ۗۧ;->᩸:F

    .line 689
    iput-object v11, v10, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    const/4 v3, 0x2

    if-ne v12, v3, :cond_16

    .line 692
    iget-object v3, v11, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v3, v1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 695
    :cond_16
    iget-object v3, v10, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_18

    .line 697
    iget-object v4, v10, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    if-eqz v4, :cond_17

    const/4 v1, 0x1

    :cond_17
    invoke-interface {v3, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_18
    if-nez v0, :cond_19

    .line 700
    iget-object v0, v10, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->requestSimpleAnimationsInNextLayout()V

    .line 702
    :cond_19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    iget-object v0, v10, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(Ll/ۗ۬ۧ;Z)V
    .locals 4

    .line 924
    iget-object v0, p0, Ll/֫ۗۧ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    .line 926
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ۙۧ;

    .line 927
    iget-object v3, v2, Ll/᩺ۙۧ;->ۡ:Ll/ۗ۬ۧ;

    if-ne v3, p1, :cond_0

    .line 928
    iget-boolean p1, v2, Ll/᩺ۙۧ;->ܿ:Z

    or-int/2addr p1, p2

    iput-boolean p1, v2, Ll/᩺ۙۧ;->ܿ:Z

    .line 929
    iget-boolean p1, v2, Ll/᩺ۙۧ;->ۧ:Z

    if-nez p1, :cond_1

    .line 2447
    iget-object p1, v2, Ll/᩺ۙۧ;->ۢ:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 932
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final ֫(Ll/۬۬ۧ;)V
    .locals 6

    .line 470
    iget-object v0, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    if-ne v0, p1, :cond_0

    goto/16 :goto_1

    .line 473
    :cond_0
    iget-object v1, p0, Ll/֫ۗۧ;->ۖ:Ll/᩷۬ۧ;

    if-eqz v0, :cond_4

    .line 497
    invoke-virtual {v0, p0}, Ll/۬۬ۧ;->removeItemDecoration(Ll/۟ۗۧ;)V

    .line 498
    iget-object v0, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->removeOnItemTouchListener(Ll/᩷۬ۧ;)V

    .line 499
    iget-object v0, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0, p0}, Ll/۬۬ۧ;->removeOnChildAttachStateChangeListener(Ll/᩻۬ۧ;)V

    .line 501
    iget-object v0, p0, Ll/֫ۗۧ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_0
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_1

    const/4 v3, 0x0

    .line 503
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ۙۧ;

    .line 2447
    iget-object v4, v3, Ll/᩺ۙۧ;->ۢ:Landroid/animation/ValueAnimator;

    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    .line 505
    iget-object v4, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    iget-object v3, v3, Ll/᩺ۙۧ;->ۡ:Ll/ۗ۬ۧ;

    iget-object v5, p0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    invoke-virtual {v5, v4, v3}, Ll/ۤۙۧ;->֫(Ll/۬۬ۧ;Ll/ۗ۬ۧ;)V

    goto :goto_0

    .line 507
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 508
    iput-object v0, p0, Ll/֫ۗۧ;->ۘ:Landroid/view/View;

    .line 954
    iget-object v2, p0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_2

    .line 955
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->recycle()V

    .line 956
    iput-object v0, p0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    .line 521
    :cond_2
    iget-object v2, p0, Ll/֫ۗۧ;->ۡ:Ll/ۛۙۧ;

    if-eqz v2, :cond_3

    .line 522
    invoke-virtual {v2}, Ll/ۛۙۧ;->֫()V

    .line 523
    iput-object v0, p0, Ll/֫ۗۧ;->ۡ:Ll/ۛۙۧ;

    .line 525
    :cond_3
    iget-object v2, p0, Ll/֫ۗۧ;->ۜ:Ll/֨ۛ;

    if-eqz v2, :cond_4

    .line 526
    iput-object v0, p0, Ll/֫ۗۧ;->ۜ:Ll/֨ۛ;

    .line 476
    :cond_4
    iput-object p1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    if-eqz p1, :cond_5

    .line 478
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0700d3

    .line 480
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Ll/֫ۗۧ;->ۙ:F

    const v0, 0x7f0700d2

    .line 482
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    iput p1, p0, Ll/֫ۗۧ;->ܺ:F

    .line 488
    iget-object p1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 489
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Ll/֫ۗۧ;->᩹:I

    .line 490
    iget-object p1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {p1, p0}, Ll/۬۬ۧ;->addItemDecoration(Ll/۟ۗۧ;)V

    .line 491
    iget-object p1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {p1, v1}, Ll/۬۬ۧ;->addOnItemTouchListener(Ll/᩷۬ۧ;)V

    .line 492
    iget-object p1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {p1, p0}, Ll/۬۬ۧ;->addOnChildAttachStateChangeListener(Ll/᩻۬ۧ;)V

    .line 515
    new-instance p1, Ll/ۛۙۧ;

    invoke-direct {p1, p0}, Ll/ۛۙۧ;-><init>(Ll/֫ۗۧ;)V

    iput-object p1, p0, Ll/֫ۗۧ;->ۡ:Ll/ۛۙۧ;

    .line 516
    new-instance p1, Ll/֨ۛ;

    iget-object v0, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Ll/֫ۗۧ;->ۡ:Ll/ۛۙۧ;

    invoke-direct {p1, v0, v1}, Ll/֨ۛ;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p1, p0, Ll/֫ۗۧ;->ۜ:Ll/֨ۛ;

    :cond_5
    :goto_1
    return-void
.end method

.method public final ֫()Z
    .locals 15

    .line 747
    iget-object v0, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    const/4 v1, 0x0

    const-wide/high16 v2, -0x8000000000000000L

    if-nez v0, :cond_0

    .line 748
    iput-wide v2, p0, Ll/֫ۗۧ;->ܿ:J

    return v1

    .line 751
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 753
    iget-wide v6, p0, Ll/֫ۗۧ;->ܿ:J

    cmp-long v0, v6, v2

    if-nez v0, :cond_1

    const-wide/16 v6, 0x0

    goto :goto_0

    :cond_1
    sub-long v6, v4, v6

    .line 754
    :goto_0
    iget-object v0, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v0}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v0

    .line 755
    iget-object v8, p0, Ll/֫ۗۧ;->۬:Landroid/graphics/Rect;

    if-nez v8, :cond_2

    .line 756
    new-instance v8, Landroid/graphics/Rect;

    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    iput-object v8, p0, Ll/֫ۗۧ;->۬:Landroid/graphics/Rect;

    .line 760
    :cond_2
    iget-object v8, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget-object v8, v8, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    iget-object v9, p0, Ll/֫ۗۧ;->۬:Landroid/graphics/Rect;

    invoke-virtual {v0, v8, v9}, Ll/ܿ۬ۧ;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 761
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->canScrollHorizontally()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_4

    .line 762
    iget v8, p0, Ll/֫ۗۧ;->ܶ:F

    iget v10, p0, Ll/֫ۗۧ;->ܳ:F

    add-float/2addr v8, v10

    float-to-int v8, v8

    .line 763
    iget-object v10, p0, Ll/֫ۗۧ;->۬:Landroid/graphics/Rect;

    iget v10, v10, Landroid/graphics/Rect;->left:I

    sub-int v10, v8, v10

    iget-object v11, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v11}, Landroid/view/View;->getPaddingLeft()I

    move-result v11

    sub-int/2addr v10, v11

    .line 764
    iget v11, p0, Ll/֫ۗۧ;->ܳ:F

    cmpg-float v12, v11, v9

    if-gez v12, :cond_3

    if-gez v10, :cond_3

    goto :goto_1

    :cond_3
    cmpl-float v10, v11, v9

    if-lez v10, :cond_4

    .line 767
    iget-object v10, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget-object v10, v10, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 768
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    move-result v10

    add-int/2addr v10, v8

    iget-object v8, p0, Ll/֫ۗۧ;->۬:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v10, v8

    iget-object v8, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    .line 769
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v8

    iget-object v11, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v11}, Landroid/view/View;->getPaddingRight()I

    move-result v11

    sub-int/2addr v8, v11

    sub-int/2addr v10, v8

    if-lez v10, :cond_4

    :goto_1
    move v11, v10

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    const/4 v11, 0x0

    .line 775
    :goto_2
    invoke-virtual {v0}, Ll/ܿ۬ۧ;->canScrollVertically()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 776
    iget v0, p0, Ll/֫ۗۧ;->᩸:F

    iget v8, p0, Ll/֫ۗۧ;->᩻:F

    add-float/2addr v0, v8

    float-to-int v0, v0

    .line 777
    iget-object v8, p0, Ll/֫ۗۧ;->۬:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->top:I

    sub-int v8, v0, v8

    iget-object v10, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v10}, Landroid/view/View;->getPaddingTop()I

    move-result v10

    sub-int/2addr v8, v10

    .line 778
    iget v10, p0, Ll/֫ۗۧ;->᩻:F

    cmpg-float v12, v10, v9

    if-gez v12, :cond_5

    if-gez v8, :cond_5

    :goto_3
    move v0, v8

    goto :goto_4

    :cond_5
    cmpl-float v8, v10, v9

    if-lez v8, :cond_6

    .line 781
    iget-object v8, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget-object v8, v8, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v8

    add-int/2addr v8, v0

    iget-object v0, p0, Ll/֫ۗۧ;->۬:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v8, v0

    iget-object v0, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    .line 782
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget-object v9, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v9}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    sub-int/2addr v0, v9

    sub-int/2addr v8, v0

    if-lez v8, :cond_6

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_4
    if-eqz v11, :cond_7

    .line 789
    iget-object v9, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    iget-object v8, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget-object v8, v8, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 790
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v10

    iget-object v8, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    .line 791
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 789
    iget-object v8, p0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    move-wide v12, v6

    invoke-virtual/range {v8 .. v13}, Ll/ۤۙۧ;->֫(Ll/۬۬ۧ;IIJ)I

    move-result v11

    :cond_7
    move v14, v11

    if-eqz v0, :cond_8

    .line 794
    iget-object v9, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    iget-object v8, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    iget-object v8, v8, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 795
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v10

    iget-object v8, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    .line 796
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 794
    iget-object v8, p0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    move v11, v0

    move-wide v12, v6

    invoke-virtual/range {v8 .. v13}, Ll/ۤۙۧ;->֫(Ll/۬۬ۧ;IIJ)I

    move-result v0

    :cond_8
    if-nez v14, :cond_a

    if-eqz v0, :cond_9

    goto :goto_5

    .line 805
    :cond_9
    iput-wide v2, p0, Ll/֫ۗۧ;->ܿ:J

    return v1

    .line 799
    :cond_a
    :goto_5
    iget-wide v6, p0, Ll/֫ۗۧ;->ܿ:J

    cmp-long v1, v6, v2

    if-nez v1, :cond_b

    .line 800
    iput-wide v4, p0, Ll/֫ۗۧ;->ܿ:J

    .line 802
    :cond_b
    iget-object v1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v1, v14, v0}, Ll/۬۬ۧ;->scrollBy(II)V

    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ(IILandroid/view/MotionEvent;)V
    .locals 1

    .line 1181
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    .line 1182
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p2

    .line 1185
    iget p3, p0, Ll/֫ۗۧ;->᩷:F

    sub-float/2addr v0, p3

    iput v0, p0, Ll/֫ۗۧ;->ܳ:F

    .line 1186
    iget p3, p0, Ll/֫ۗۧ;->ۢ:F

    sub-float/2addr p2, p3

    iput p2, p0, Ll/֫ۗۧ;->᩻:F

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_0

    .line 1188
    invoke-static {p3, v0}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, Ll/֫ۗۧ;->ܳ:F

    :cond_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_1

    .line 1191
    iget p2, p0, Ll/֫ۗۧ;->ܳ:F

    invoke-static {p3, p2}, Ljava/lang/Math;->min(FF)F

    move-result p2

    iput p2, p0, Ll/֫ۗۧ;->ܳ:F

    :cond_1
    and-int/lit8 p2, p1, 0x1

    if-nez p2, :cond_2

    .line 1194
    iget p2, p0, Ll/֫ۗۧ;->᩻:F

    invoke-static {p3, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, Ll/֫ۗۧ;->᩻:F

    :cond_2
    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_3

    .line 1197
    iget p1, p0, Ll/֫ۗۧ;->᩻:F

    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, p0, Ll/֫ۗۧ;->᩻:F

    :cond_3
    return-void
.end method

.method public final ۧ(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final ۧ(Ll/ۗ۬ۧ;)V
    .locals 3

    .line 1103
    iget-object v0, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    .line 1604
    iget-object v1, p0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    invoke-virtual {v1, p1}, Ll/ۤۙۧ;->ۧ(Ll/ۗ۬ۧ;)I

    move-result v1

    .line 1605
    sget v2, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    .line 1605
    invoke-static {v1, v0}, Ll/ۤۙۧ;->֫(II)I

    move-result v0

    const/high16 v1, 0xff0000

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    .line 1107
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    if-eq v0, v1, :cond_0

    return-void

    .line 947
    :cond_0
    iget-object v0, p0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_1

    .line 948
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 950
    :cond_1
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۗۧ;->۫:Landroid/view/VelocityTracker;

    const/4 v0, 0x0

    .line 1113
    iput v0, p0, Ll/֫ۗۧ;->᩻:F

    iput v0, p0, Ll/֫ۗۧ;->ܳ:F

    const/4 v0, 0x2

    .line 1114
    invoke-virtual {p0, p1, v0}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;I)V

    :cond_2
    return-void
.end method

.method public final ܽ(Landroid/view/MotionEvent;)Landroid/view/View;
    .locals 6

    .line 1050
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 1051
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 1052
    iget-object v1, p0, Ll/֫ۗۧ;->֨:Ll/ۗ۬ۧ;

    if-eqz v1, :cond_0

    .line 1053
    iget-object v1, v1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 1054
    iget v2, p0, Ll/֫ۗۧ;->ܶ:F

    iget v3, p0, Ll/֫ۗۧ;->ܳ:F

    add-float/2addr v2, v3

    iget v3, p0, Ll/֫ۗۧ;->᩸:F

    iget v4, p0, Ll/֫ۗۧ;->᩻:F

    add-float/2addr v3, v4

    invoke-static {v1, v0, p1, v2, v3}, Ll/֫ۗۧ;->֫(Landroid/view/View;FFFF)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 1058
    :cond_0
    iget-object v1, p0, Ll/֫ۗۧ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    :cond_1
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_2

    .line 1059
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ۙۧ;

    .line 1060
    iget-object v4, v3, Ll/᩺ۙۧ;->ۡ:Ll/ۗ۬ۧ;

    iget-object v4, v4, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 1061
    iget v5, v3, Ll/᩺ۙۧ;->ܺ:F

    iget v3, v3, Ll/᩺ۙۧ;->ۖ:F

    invoke-static {v4, v0, p1, v5, v3}, Ll/֫ۗۧ;->֫(Landroid/view/View;FFFF)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v4

    .line 1065
    :cond_2
    iget-object v1, p0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v1, v0, p1}, Ll/۬۬ۧ;->findChildViewUnder(FF)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Landroid/view/View;)V
    .locals 1

    .line 1328
    iget-object v0, p0, Ll/֫ۗۧ;->ۘ:Landroid/view/View;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 1329
    iput-object p1, p0, Ll/֫ۗۧ;->ۘ:Landroid/view/View;

    :cond_0
    return-void
.end method
