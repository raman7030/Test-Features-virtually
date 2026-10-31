.class public final Ll/ۗ᩷ۡ;
.super Landroid/graphics/drawable/Drawable;
.source "N933"


# instance fields
.field public final ֫:Landroid/graphics/Paint;

.field public final ۧ:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 656
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 654
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/ۗ᩷ۡ;->֫:Landroid/graphics/Paint;

    .line 657
    iput p1, p0, Ll/ۗ᩷ۡ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 24

    move-object/from16 v0, p0

    .line 663
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    .line 664
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 665
    iget v3, v1, Landroid/graphics/Rect;->top:I

    .line 666
    iget v4, v1, Landroid/graphics/Rect;->right:I

    .line 667
    iget v5, v1, Landroid/graphics/Rect;->bottom:I

    .line 668
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v6

    iget v7, v0, Ll/ۗ᩷ۡ;->ۧ:I

    div-int/2addr v6, v7

    .line 669
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    div-int/2addr v1, v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    if-gt v8, v1, :cond_2

    const/4 v10, 0x0

    move v11, v9

    :goto_1
    if-gt v10, v6, :cond_1

    mul-int v12, v10, v7

    add-int/2addr v12, v2

    mul-int v13, v8, v7

    add-int/2addr v13, v3

    add-int v14, v12, v7

    .line 675
    invoke-static {v4, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    add-int v15, v13, v7

    .line 676
    invoke-static {v5, v15}, Ljava/lang/Math;->min(II)I

    move-result v15

    if-eqz v11, :cond_0

    const/16 v16, -0x1

    move/from16 v17, v1

    const/4 v1, -0x1

    goto :goto_2

    :cond_0
    const v16, -0x343435

    move/from16 v17, v1

    const v1, -0x343435

    :goto_2
    move/from16 v16, v2

    .line 677
    iget-object v2, v0, Ll/ۗ᩷ۡ;->֫:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v1, v12

    int-to-float v12, v13

    int-to-float v13, v14

    int-to-float v14, v15

    move-object/from16 v18, p1

    move/from16 v19, v1

    move/from16 v20, v12

    move/from16 v21, v13

    move/from16 v22, v14

    move-object/from16 v23, v2

    .line 678
    invoke-virtual/range {v18 .. v23}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    xor-int/lit8 v11, v11, 0x1

    add-int/lit8 v10, v10, 0x1

    move/from16 v2, v16

    move/from16 v1, v17

    goto :goto_1

    :cond_1
    move/from16 v17, v1

    move/from16 v16, v2

    xor-int/lit8 v9, v9, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 692
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Alpha is not supported by this drawable."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 697
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "ColorFilter is not supported by this drawable."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
