.class public Ll/ᩳ֡;
.super Ll/ۗ᩸;
.source "6428"


# instance fields
.field public ᩺:Ll/᩶۠;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 129
    invoke-direct {p0, p1, p2}, Ll/ۗ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 133
    invoke-direct {p0, p1, p2, p3}, Ll/ۗ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p0, v0, p1, p2}, Ll/ᩳ֡;->֫(Ll/ۤ۠;II)V

    return-void
.end method

.method public final ֫(Landroid/util/AttributeSet;)V
    .locals 7

    .line 200
    invoke-super {p0, p1}, Ll/ۗ᩸;->֫(Landroid/util/AttributeSet;)V

    .line 201
    new-instance v0, Ll/᩶۠;

    invoke-direct {v0}, Ll/᩶۠;-><init>()V

    iput-object v0, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    if-eqz p1, :cond_1b

    .line 203
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Ll/᩸᩸;->ۧ:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 204
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1a

    .line 206
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    if-nez v3, :cond_0

    .line 208
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->۟(I)V

    goto/16 :goto_1

    :cond_0
    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 210
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/ۤ۠;->֨(I)V

    goto/16 :goto_1

    :cond_1
    const/16 v4, 0xb

    if-ne v3, v4, :cond_2

    .line 213
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/ۤ۠;->᩶(I)V

    goto/16 :goto_1

    :cond_2
    const/16 v4, 0xc

    if-ne v3, v4, :cond_3

    .line 217
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/ۤ۠;->ܶ(I)V

    goto/16 :goto_1

    :cond_3
    const/4 v4, 0x2

    if-ne v3, v4, :cond_4

    .line 220
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/ۤ۠;->᩸(I)V

    goto/16 :goto_1

    :cond_4
    const/4 v5, 0x3

    if-ne v3, v5, :cond_5

    .line 222
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/ۤ۠;->ۙ(I)V

    goto/16 :goto_1

    :cond_5
    const/4 v5, 0x4

    if-ne v3, v5, :cond_6

    .line 224
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/ۤ۠;->᩹(I)V

    goto/16 :goto_1

    :cond_6
    const/4 v5, 0x5

    if-ne v3, v5, :cond_7

    .line 226
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/ۤ۠;->۠(I)V

    goto/16 :goto_1

    :cond_7
    const/16 v5, 0x26

    if-ne v3, v5, :cond_8

    .line 228
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ᩳ֫(I)V

    goto/16 :goto_1

    :cond_8
    const/16 v5, 0x1c

    if-ne v3, v5, :cond_9

    .line 230
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ۛ(I)V

    goto/16 :goto_1

    :cond_9
    const/16 v5, 0x25

    if-ne v3, v5, :cond_a

    .line 232
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ܽ֫(I)V

    goto/16 :goto_1

    :cond_a
    const/16 v5, 0x16

    if-ne v3, v5, :cond_b

    .line 234
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ۗ(I)V

    goto/16 :goto_1

    :cond_b
    const/16 v5, 0x1e

    if-ne v3, v5, :cond_c

    .line 236
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ۨ(I)V

    goto/16 :goto_1

    :cond_c
    const/16 v5, 0x18

    if-ne v3, v5, :cond_d

    .line 238
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->۬(I)V

    goto/16 :goto_1

    :cond_d
    const/16 v5, 0x20

    if-ne v3, v5, :cond_e

    .line 240
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->᩺(I)V

    goto/16 :goto_1

    :cond_e
    const/16 v5, 0x1a

    const/high16 v6, 0x3f000000    # 0.5f

    if-ne v3, v5, :cond_f

    .line 242
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ܿ(F)V

    goto/16 :goto_1

    :cond_f
    const/16 v5, 0x15

    if-ne v3, v5, :cond_10

    .line 244
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ܽ(F)V

    goto/16 :goto_1

    :cond_10
    const/16 v5, 0x1d

    if-ne v3, v5, :cond_11

    .line 246
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ܳ(F)V

    goto/16 :goto_1

    :cond_11
    const/16 v5, 0x17

    if-ne v3, v5, :cond_12

    .line 248
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ᩳ(F)V

    goto :goto_1

    :cond_12
    const/16 v5, 0x1f

    if-ne v3, v5, :cond_13

    .line 250
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->᩻(F)V

    goto :goto_1

    :cond_13
    const/16 v5, 0x23

    if-ne v3, v5, :cond_14

    .line 252
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ۜ(F)V

    goto :goto_1

    :cond_14
    const/16 v5, 0x19

    if-ne v3, v5, :cond_15

    .line 254
    iget-object v5, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v5, v3}, Ll/᩶۠;->۫(I)V

    goto :goto_1

    :cond_15
    const/16 v5, 0x22

    if-ne v3, v5, :cond_16

    .line 256
    iget-object v5, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v5, v3}, Ll/᩶۠;->֫֫(I)V

    goto :goto_1

    :cond_16
    const/16 v4, 0x1b

    if-ne v3, v4, :cond_17

    .line 258
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ۤ(I)V

    goto :goto_1

    :cond_17
    const/16 v4, 0x24

    if-ne v3, v4, :cond_18

    .line 260
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ۧ֫(I)V

    goto :goto_1

    :cond_18
    const/16 v4, 0x21

    if-ne v3, v4, :cond_19

    .line 262
    iget-object v4, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    const/4 v5, -0x1

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ll/᩶۠;->ܰ(I)V

    :cond_19
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 265
    :cond_1a
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 268
    :cond_1b
    iget-object p1, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    iput-object p1, p0, Ll/۟ܶ;->᩹:Ll/۬۠;

    .line 269
    invoke-virtual {p0}, Ll/۟ܶ;->ܽ()V

    return-void
.end method

.method public final ֫(Ll/ۤ۠;II)V
    .locals 2

    .line 162
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 163
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 164
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 165
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p3

    if-eqz p1, :cond_0

    .line 167
    invoke-virtual {p1, v0, p2, v1, p3}, Ll/ۤ۠;->֫(IIII)V

    .line 168
    invoke-virtual {p1}, Ll/ۤ۠;->᩷֫()I

    move-result p2

    invoke-virtual {p1}, Ll/ۤ۠;->ۜ֫()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 170
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final ֫(Ll/ܶ۠;Z)V
    .locals 0

    .line 144
    iget-object p1, p0, Ll/ᩳ֡;->᩺:Ll/᩶۠;

    invoke-virtual {p1, p2}, Ll/ۤ۠;->ۧ(Z)V

    return-void
.end method

.method public final ֫(Ll/᩷᩸;Ll/۬۠;Ll/ᩴ᩸;Landroid/util/SparseArray;)V
    .locals 0

    .line 184
    invoke-super {p0, p1, p2, p3, p4}, Ll/۟ܶ;->֫(Ll/᩷᩸;Ll/۬۠;Ll/ᩴ᩸;Landroid/util/SparseArray;)V

    .line 185
    instance-of p1, p2, Ll/᩶۠;

    if-eqz p1, :cond_0

    .line 186
    check-cast p2, Ll/᩶۠;

    .line 187
    iget p1, p3, Ll/ܽ᩸;->᩷֫:I

    const/4 p3, -0x1

    if-eq p1, p3, :cond_0

    .line 188
    invoke-virtual {p2, p1}, Ll/᩶۠;->۟(I)V

    :cond_0
    return-void
.end method
