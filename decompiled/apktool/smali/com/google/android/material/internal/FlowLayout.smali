.class public Lcom/google/android/material/internal/FlowLayout;
.super Landroid/view/ViewGroup;
.source "FlowLayout.java"


# instance fields
.field public itemSpacing:I

.field public lineSpacing:I

.field public rowCount:I

.field public singleLine:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/internal/FlowLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/internal/FlowLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 59
    iput-boolean p3, p0, Lcom/google/android/material/internal/FlowLayout;->singleLine:Z

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/internal/FlowLayout;->loadFromAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 66
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 p3, 0x0

    .line 67
    iput-boolean p3, p0, Lcom/google/android/material/internal/FlowLayout;->singleLine:Z

    .line 68
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/internal/FlowLayout;->loadFromAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static getMeasuredDimension(III)I
    .locals 1

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_1

    const/high16 v0, 0x40000000    # 2.0f

    if-eq p1, v0, :cond_0

    return p2

    :cond_0
    return p0

    .line 182
    :cond_1
    invoke-static {p2, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method private loadFromAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 73
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Ll/᩵۠ܺ;->ܳۙ:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 74
    sget p2, Ll/᩵۠ܺ;->ۜۙ:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/material/internal/FlowLayout;->lineSpacing:I

    .line 75
    sget p2, Ll/᩵۠ܺ;->᩻ۙ:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/material/internal/FlowLayout;->itemSpacing:I

    .line 76
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public getItemSpacing()I
    .locals 1

    .line 88
    iget v0, p0, Lcom/google/android/material/internal/FlowLayout;->itemSpacing:I

    return v0
.end method

.method public getLineSpacing()I
    .locals 1

    .line 80
    iget v0, p0, Lcom/google/android/material/internal/FlowLayout;->lineSpacing:I

    return v0
.end method

.method public getRowCount()I
    .locals 1

    .line 248
    iget v0, p0, Lcom/google/android/material/internal/FlowLayout;->rowCount:I

    return v0
.end method

.method public getRowIndex(Landroid/view/View;)I
    .locals 1

    .line 253
    sget v0, Ll/᩷۠ܺ;->᩸ۜ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    .line 254
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 257
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public isSingleLine()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Lcom/google/android/material/internal/FlowLayout;->singleLine:Z

    return v0
.end method

.method public onLayout(ZIIII)V
    .locals 8

    .line 190
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 p3, 0x0

    if-nez p1, :cond_0

    .line 192
    iput p3, p0, Lcom/google/android/material/internal/FlowLayout;->rowCount:I

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 195
    iput p1, p0, Lcom/google/android/material/internal/FlowLayout;->rowCount:I

    .line 197
    sget p3, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result p3

    if-ne p3, p1, :cond_1

    const/4 p3, 0x1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_2

    .line 198
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p5

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p5

    :goto_1
    if-eqz p3, :cond_3

    .line 199
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    .line 201
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr p4, p2

    sub-int/2addr p4, v0

    const/4 p2, 0x0

    move v2, p5

    move v0, v1

    .line 207
    :goto_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge p2, v3, :cond_8

    .line 208
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 210
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-ne v4, v5, :cond_4

    .line 211
    sget v4, Ll/᩷۠ܺ;->᩸ۜ:I

    const/4 v5, -0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    goto :goto_6

    .line 215
    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 218
    instance-of v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v5, :cond_5

    .line 219
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 48
    invoke-virtual {v4}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v5

    .line 65
    invoke-virtual {v4}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v4

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_4
    add-int v6, v2, v5

    .line 224
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v7, v6

    .line 226
    iget-boolean v6, p0, Lcom/google/android/material/internal/FlowLayout;->singleLine:Z

    if-nez v6, :cond_6

    if-le v7, p4, :cond_6

    .line 228
    iget v0, p0, Lcom/google/android/material/internal/FlowLayout;->lineSpacing:I

    add-int/2addr v0, v1

    .line 229
    iget v1, p0, Lcom/google/android/material/internal/FlowLayout;->rowCount:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/google/android/material/internal/FlowLayout;->rowCount:I

    move v2, p5

    .line 231
    :cond_6
    sget v1, Ll/᩷۠ܺ;->᩸ۜ:I

    iget v6, p0, Lcom/google/android/material/internal/FlowLayout;->rowCount:I

    sub-int/2addr v6, p1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v1, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    add-int v1, v2, v5

    .line 233
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    add-int/2addr v6, v1

    .line 234
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    add-int/2addr v7, v0

    if-eqz p3, :cond_7

    sub-int v1, p4, v6

    sub-int v6, p4, v2

    sub-int/2addr v6, v5

    .line 237
    invoke-virtual {v3, v1, v0, v6, v7}, Landroid/view/View;->layout(IIII)V

    goto :goto_5

    .line 240
    :cond_7
    invoke-virtual {v3, v1, v0, v6, v7}, Landroid/view/View;->layout(IIII)V

    :goto_5
    add-int/2addr v5, v4

    .line 243
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v1, v5

    iget v3, p0, Lcom/google/android/material/internal/FlowLayout;->itemSpacing:I

    add-int/2addr v1, v3

    add-int/2addr v2, v1

    move v1, v7

    :goto_6
    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_8
    return-void
.end method

.method public onMeasure(II)V
    .locals 19

    move-object/from16 v0, p0

    .line 107
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 108
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 110
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 111
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    const/high16 v5, -0x80000000

    if-eq v2, v5, :cond_1

    const/high16 v5, 0x40000000    # 2.0f

    if-ne v2, v5, :cond_0

    goto :goto_0

    :cond_0
    const v5, 0x7fffffff

    goto :goto_1

    :cond_1
    :goto_0
    move v5, v1

    .line 118
    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    .line 119
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    .line 123
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v8

    sub-int/2addr v5, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v8, v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 124
    :goto_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v11

    if-ge v9, v11, :cond_7

    .line 125
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 127
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    move-result v12

    const/16 v13, 0x8

    if-ne v12, v13, :cond_2

    move/from16 v12, p1

    move/from16 v13, p2

    goto :goto_5

    :cond_2
    move/from16 v12, p1

    move/from16 v13, p2

    .line 130
    invoke-virtual {v0, v11, v12, v13}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 132
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    .line 135
    instance-of v15, v14, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v15, :cond_3

    .line 136
    check-cast v14, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 137
    iget v15, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 138
    iget v14, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_3

    :cond_3
    const/4 v15, 0x0

    const/4 v14, 0x0

    :goto_3
    add-int v16, v6, v15

    .line 141
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v17

    move/from16 v18, v6

    add-int v6, v17, v16

    if-le v6, v5, :cond_4

    .line 146
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/internal/FlowLayout;->isSingleLine()Z

    move-result v6

    if-nez v6, :cond_4

    .line 147
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    .line 148
    iget v8, v0, Lcom/google/android/material/internal/FlowLayout;->lineSpacing:I

    add-int/2addr v8, v7

    goto :goto_4

    :cond_4
    move/from16 v6, v18

    :goto_4
    add-int v7, v6, v15

    .line 151
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v16

    add-int v7, v16, v7

    .line 152
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v16

    add-int v16, v16, v8

    if-le v7, v10, :cond_5

    move v10, v7

    :cond_5
    add-int/2addr v15, v14

    .line 159
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v7, v15

    iget v11, v0, Lcom/google/android/material/internal/FlowLayout;->itemSpacing:I

    add-int/2addr v7, v11

    add-int/2addr v7, v6

    .line 164
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    if-ne v9, v6, :cond_6

    add-int/2addr v10, v14

    :cond_6
    move v6, v7

    move/from16 v7, v16

    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 169
    :cond_7
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    add-int/2addr v5, v10

    .line 170
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    add-int/2addr v6, v7

    .line 172
    invoke-static {v1, v2, v5}, Lcom/google/android/material/internal/FlowLayout;->getMeasuredDimension(III)I

    move-result v1

    .line 173
    invoke-static {v3, v4, v6}, Lcom/google/android/material/internal/FlowLayout;->getMeasuredDimension(III)I

    move-result v2

    .line 174
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setItemSpacing(I)V
    .locals 0

    .line 92
    iput p1, p0, Lcom/google/android/material/internal/FlowLayout;->itemSpacing:I

    return-void
.end method

.method public setLineSpacing(I)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/google/android/material/internal/FlowLayout;->lineSpacing:I

    return-void
.end method

.method public setSingleLine(Z)V
    .locals 0

    .line 102
    iput-boolean p1, p0, Lcom/google/android/material/internal/FlowLayout;->singleLine:Z

    return-void
.end method
