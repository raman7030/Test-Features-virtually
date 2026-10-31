.class public final Ll/ۚ᩷ۡ;
.super Landroid/graphics/drawable/Drawable;
.source "S952"


# instance fields
.field public ֫:F

.field public ۖ:F

.field public ۘ:I

.field public final ۜ:Landroid/graphics/RectF;

.field public ۡ:F

.field public ۢ:I

.field public final ۧ:Landroid/graphics/RectF;

.field public ܳ:F

.field public ܺ:F

.field public final ܽ:Landroid/graphics/RectF;

.field public final ܿ:Landroid/graphics/Path;

.field public final ᩳ:Landroid/graphics/Paint;

.field public ᩴ:F

.field public ᩵:F

.field public ᩷:I

.field public final ᩻:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 20
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 25
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/ۚ᩷ۡ;->ᩳ:Landroid/graphics/Paint;

    .line 30
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll/ۚ᩷ۡ;->ܿ:Landroid/graphics/Path;

    const/high16 v0, 0x3f000000    # 0.5f

    .line 45
    iput v0, p0, Ll/ۚ᩷ۡ;->ܺ:F

    const/16 v0, 0x30

    .line 52
    iput v0, p0, Ll/ۚ᩷ۡ;->ۘ:I

    .line 62
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ۚ᩷ۡ;->ܽ:Landroid/graphics/RectF;

    .line 67
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ۚ᩷ۡ;->ۜ:Landroid/graphics/RectF;

    .line 72
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ۚ᩷ۡ;->᩻:Landroid/graphics/RectF;

    .line 77
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ۚ᩷ۡ;->ۧ:Landroid/graphics/RectF;

    const/high16 v0, 0x40c00000    # 6.0f

    .line 98
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    int-to-float v0, v0

    .line 275
    iput v0, p0, Ll/ۚ᩷ۡ;->ᩴ:F

    .line 276
    iput v0, p0, Ll/ۚ᩷ۡ;->ۖ:F

    const/high16 v0, 0x40800000    # 4.0f

    .line 99
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    int-to-float v1, v1

    .line 301
    iput v1, p0, Ll/ۚ᩷ۡ;->ܳ:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 100
    invoke-static {v1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    int-to-float v1, v1

    .line 315
    iput v1, p0, Ll/ۚ᩷ۡ;->ۡ:F

    .line 101
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    int-to-float v1, v1

    .line 334
    iput v0, p0, Ll/ۚ᩷ۡ;->֫:F

    .line 335
    iput v1, p0, Ll/ۚ᩷ۡ;->᩵:F

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 14

    const-string v0, "canvas"

    .line 9
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 202
    iget v1, p0, Ll/ۚ᩷ۡ;->ۘ:I

    const/4 v2, 0x3

    iget v3, v0, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    if-ne v1, v2, :cond_0

    iget v4, p0, Ll/ۚ᩷ۡ;->ᩴ:F

    add-float/2addr v3, v4

    .line 201
    :cond_0
    iget-object v4, p0, Ll/ۚ᩷ۡ;->ܽ:Landroid/graphics/RectF;

    iput v3, v4, Landroid/graphics/RectF;->left:F

    const/16 v5, 0x30

    .line 204
    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    if-ne v1, v5, :cond_1

    iget v6, p0, Ll/ۚ᩷ۡ;->ۖ:F

    goto :goto_0

    :cond_1
    iget v6, p0, Ll/ۚ᩷ۡ;->ۡ:F

    :goto_0
    add-float/2addr v0, v6

    .line 203
    iput v0, v4, Landroid/graphics/RectF;->top:F

    const/4 v6, 0x2

    int-to-float v6, v6

    .line 205
    iget v7, p0, Ll/ۚ᩷ۡ;->ܳ:F

    mul-float v7, v7, v6

    add-float v8, v7, v3

    add-float/2addr v7, v0

    .line 206
    iput v7, v4, Landroid/graphics/RectF;->bottom:F

    .line 208
    iget v0, p0, Ll/ۚ᩷ۡ;->ۡ:F

    add-float/2addr v3, v0

    iput v3, v4, Landroid/graphics/RectF;->left:F

    add-float/2addr v8, v0

    .line 209
    iput v8, v4, Landroid/graphics/RectF;->right:F

    .line 214
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    const/4 v3, 0x5

    .line 216
    iget v7, v0, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    if-ne v1, v3, :cond_2

    iget v8, p0, Ll/ۚ᩷ۡ;->ᩴ:F

    sub-float/2addr v7, v8

    .line 215
    :cond_2
    iget-object v8, p0, Ll/ۚ᩷ۡ;->ۜ:Landroid/graphics/RectF;

    iput v7, v8, Landroid/graphics/RectF;->right:F

    .line 218
    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    if-ne v1, v5, :cond_3

    iget v9, p0, Ll/ۚ᩷ۡ;->ۖ:F

    goto :goto_1

    :cond_3
    iget v9, p0, Ll/ۚ᩷ۡ;->ۡ:F

    :goto_1
    add-float/2addr v0, v9

    .line 217
    iput v0, v8, Landroid/graphics/RectF;->top:F

    .line 219
    iget v9, p0, Ll/ۚ᩷ۡ;->ܳ:F

    mul-float v9, v9, v6

    sub-float v10, v7, v9

    add-float/2addr v9, v0

    .line 220
    iput v9, v8, Landroid/graphics/RectF;->bottom:F

    .line 222
    iget v0, p0, Ll/ۚ᩷ۡ;->ۡ:F

    sub-float/2addr v10, v0

    iput v10, v8, Landroid/graphics/RectF;->left:F

    sub-float/2addr v7, v0

    .line 223
    iput v7, v8, Landroid/graphics/RectF;->right:F

    .line 228
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 230
    iget v7, v0, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    if-ne v1, v3, :cond_4

    iget v9, p0, Ll/ۚ᩷ۡ;->ᩴ:F

    sub-float/2addr v7, v9

    .line 229
    :cond_4
    iget-object v9, p0, Ll/ۚ᩷ۡ;->᩻:Landroid/graphics/RectF;

    iput v7, v9, Landroid/graphics/RectF;->right:F

    const/16 v10, 0x50

    .line 232
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, v0

    if-ne v1, v10, :cond_5

    iget v11, p0, Ll/ۚ᩷ۡ;->ۖ:F

    sub-float/2addr v0, v11

    .line 233
    :cond_5
    iget v11, p0, Ll/ۚ᩷ۡ;->ܳ:F

    mul-float v11, v11, v6

    sub-float v12, v7, v11

    sub-float v11, v0, v11

    .line 236
    iget v13, p0, Ll/ۚ᩷ۡ;->ۡ:F

    sub-float/2addr v12, v13

    iput v12, v9, Landroid/graphics/RectF;->left:F

    sub-float/2addr v7, v13

    .line 237
    iput v7, v9, Landroid/graphics/RectF;->right:F

    sub-float/2addr v11, v13

    .line 238
    iput v11, v9, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v13

    .line 239
    iput v0, v9, Landroid/graphics/RectF;->bottom:F

    .line 244
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 246
    iget v7, v0, Landroid/graphics/Rect;->left:I

    int-to-float v7, v7

    if-ne v1, v2, :cond_6

    iget v2, p0, Ll/ۚ᩷ۡ;->ᩴ:F

    add-float/2addr v7, v2

    .line 245
    :cond_6
    iget-object v2, p0, Ll/ۚ᩷ۡ;->ۧ:Landroid/graphics/RectF;

    iput v7, v2, Landroid/graphics/RectF;->left:F

    .line 248
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, v0

    if-ne v1, v10, :cond_7

    iget v11, p0, Ll/ۚ᩷ۡ;->ۖ:F

    sub-float/2addr v0, v11

    .line 249
    :cond_7
    iget v11, p0, Ll/ۚ᩷ۡ;->ܳ:F

    mul-float v11, v11, v6

    sub-float v12, v0, v11

    add-float/2addr v11, v7

    .line 252
    iget v13, p0, Ll/ۚ᩷ۡ;->ۡ:F

    add-float/2addr v7, v13

    iput v7, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v11, v13

    .line 253
    iput v11, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v12, v13

    .line 254
    iput v12, v2, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v13

    .line 255
    iput v0, v2, Landroid/graphics/RectF;->bottom:F

    .line 107
    iget-object v0, p0, Ll/ۚ᩷ۡ;->ܿ:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 108
    iget v7, v4, Landroid/graphics/RectF;->left:F

    iget v11, v4, Landroid/graphics/RectF;->bottom:F

    iget v12, p0, Ll/ۚ᩷ۡ;->ܳ:F

    sub-float/2addr v11, v12

    invoke-virtual {v0, v7, v11}, Landroid/graphics/Path;->moveTo(FF)V

    const/high16 v7, 0x43340000    # 180.0f

    const/high16 v11, 0x42b40000    # 90.0f

    .line 109
    invoke-virtual {v0, v4, v7, v11}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    if-ne v1, v5, :cond_8

    .line 113
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    int-to-float v7, v7

    iget v12, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v7, v7, v12

    add-float/2addr v7, v5

    iget v5, p0, Ll/ۚ᩷ۡ;->ᩴ:F

    div-float/2addr v5, v6

    sub-float/2addr v7, v5

    .line 114
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iget v12, p0, Ll/ۚ᩷ۡ;->ۖ:F

    add-float/2addr v5, v12

    .line 112
    invoke-virtual {v0, v7, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 116
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    int-to-float v7, v7

    iget v12, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v7, v7, v12

    add-float/2addr v7, v5

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    invoke-virtual {v0, v7, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 118
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    int-to-float v7, v7

    iget v12, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v7, v7, v12

    add-float/2addr v7, v5

    iget v5, p0, Ll/ۚ᩷ۡ;->ᩴ:F

    div-float/2addr v5, v6

    add-float/2addr v5, v7

    .line 119
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v7

    iget v7, v7, Landroid/graphics/Rect;->top:I

    int-to-float v7, v7

    iget v12, p0, Ll/ۚ᩷ۡ;->ۖ:F

    add-float/2addr v7, v12

    .line 117
    invoke-virtual {v0, v5, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 122
    :cond_8
    iget v5, v8, Landroid/graphics/RectF;->left:F

    iget v7, p0, Ll/ۚ᩷ۡ;->ܳ:F

    add-float/2addr v5, v7

    iget v7, v8, Landroid/graphics/RectF;->top:F

    invoke-virtual {v0, v5, v7}, Landroid/graphics/Path;->lineTo(FF)V

    const/high16 v5, 0x43870000    # 270.0f

    .line 124
    invoke-virtual {v0, v8, v5, v11}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    if-ne v1, v3, :cond_9

    .line 128
    iget v3, v8, Landroid/graphics/RectF;->right:F

    .line 129
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v7

    int-to-float v7, v7

    iget v8, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v7, v7, v8

    add-float/2addr v7, v5

    iget v5, p0, Ll/ۚ᩷ۡ;->ۖ:F

    div-float/2addr v5, v6

    sub-float/2addr v7, v5

    .line 127
    invoke-virtual {v0, v3, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 132
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    iget v5, p0, Ll/ۚ᩷ۡ;->ۡ:F

    sub-float/2addr v3, v5

    .line 133
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v7

    int-to-float v7, v7

    iget v8, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v7, v7, v8

    add-float/2addr v7, v5

    .line 131
    invoke-virtual {v0, v3, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 136
    iget v3, v9, Landroid/graphics/RectF;->right:F

    .line 137
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v7

    int-to-float v7, v7

    iget v8, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v7, v7, v8

    add-float/2addr v7, v5

    iget v5, p0, Ll/ۚ᩷ۡ;->ۖ:F

    div-float/2addr v5, v6

    add-float/2addr v5, v7

    .line 135
    invoke-virtual {v0, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 141
    :cond_9
    iget v3, v9, Landroid/graphics/RectF;->right:F

    .line 142
    iget v5, v9, Landroid/graphics/RectF;->top:F

    iget v7, p0, Ll/ۚ᩷ۡ;->ܳ:F

    add-float/2addr v5, v7

    .line 140
    invoke-virtual {v0, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    const/4 v3, 0x0

    .line 145
    invoke-virtual {v0, v9, v3, v11}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    if-ne v1, v10, :cond_a

    .line 149
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-float v5, v5

    iget v7, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v5, v5, v7

    sub-float/2addr v3, v5

    iget v5, p0, Ll/ۚ᩷ۡ;->ᩴ:F

    div-float/2addr v5, v6

    add-float/2addr v5, v3

    .line 150
    iget v3, v9, Landroid/graphics/RectF;->bottom:F

    .line 148
    invoke-virtual {v0, v5, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 152
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-float v5, v5

    iget v7, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v5, v5, v7

    sub-float/2addr v3, v5

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    int-to-float v5, v5

    iget v7, p0, Ll/ۚ᩷ۡ;->ۡ:F

    sub-float/2addr v5, v7

    invoke-virtual {v0, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 154
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-float v5, v5

    iget v7, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v5, v5, v7

    sub-float/2addr v3, v5

    iget v5, p0, Ll/ۚ᩷ۡ;->ᩴ:F

    div-float/2addr v5, v6

    sub-float/2addr v3, v5

    .line 155
    iget v5, v9, Landroid/graphics/RectF;->bottom:F

    .line 153
    invoke-virtual {v0, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 159
    :cond_a
    iget v3, v2, Landroid/graphics/RectF;->right:F

    iget v5, p0, Ll/ۚ᩷ۡ;->ܳ:F

    sub-float/2addr v3, v5

    .line 160
    iget v5, v2, Landroid/graphics/RectF;->bottom:F

    .line 158
    invoke-virtual {v0, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 163
    invoke-virtual {v0, v2, v11, v11}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    const/4 v3, 0x3

    if-ne v1, v3, :cond_b

    .line 167
    iget v1, v2, Landroid/graphics/RectF;->left:F

    .line 168
    iget v3, v2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v5

    int-to-float v5, v5

    iget v7, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v5, v5, v7

    sub-float/2addr v3, v5

    iget v5, p0, Ll/ۚ᩷ۡ;->ۖ:F

    div-float/2addr v5, v6

    add-float/2addr v5, v3

    .line 166
    invoke-virtual {v0, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 171
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    .line 172
    iget v3, v2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v5

    int-to-float v5, v5

    iget v7, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v5, v5, v7

    sub-float/2addr v3, v5

    .line 170
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 175
    iget v1, v4, Landroid/graphics/RectF;->left:F

    .line 176
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    iget v4, p0, Ll/ۚ᩷ۡ;->ܺ:F

    mul-float v3, v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Ll/ۚ᩷ۡ;->ۖ:F

    div-float/2addr v3, v6

    sub-float/2addr v2, v3

    .line 174
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 180
    :cond_b
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 182
    iget v1, p0, Ll/ۚ᩷ۡ;->᩷:I

    iget-object v2, p0, Ll/ۚ᩷ۡ;->ᩳ:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 183
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 184
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 186
    iget v1, p0, Ll/ۚ᩷ۡ;->ۢ:I

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 187
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 188
    iget v1, p0, Ll/ۚ᩷ۡ;->ۡ:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v1, v3

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 189
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 5

    const-string v0, "padding"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    iget v0, p0, Ll/ۚ᩷ۡ;->֫:F

    iget v1, p0, Ll/ۚ᩷ۡ;->ܳ:F

    add-float/2addr v0, v1

    .line 341
    iget v2, p0, Ll/ۚ᩷ۡ;->᩵:F

    add-float/2addr v1, v2

    const/4 v2, 0x3

    .line 344
    iget v3, p0, Ll/ۚ᩷ۡ;->ۘ:I

    if-eq v3, v2, :cond_3

    const/4 v2, 0x5

    if-eq v3, v2, :cond_2

    const/16 v2, 0x30

    if-eq v3, v2, :cond_1

    const/16 v2, 0x50

    if-eq v3, v2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 348
    :cond_0
    iget v2, p0, Ll/ۚ᩷ۡ;->ۖ:F

    add-float/2addr v2, v1

    goto :goto_0

    .line 347
    :cond_1
    iget v2, p0, Ll/ۚ᩷ۡ;->ۖ:F

    add-float/2addr v2, v1

    move v4, v2

    move v2, v1

    move v1, v4

    :goto_0
    move v3, v2

    move v2, v0

    goto :goto_2

    .line 346
    :cond_2
    iget v2, p0, Ll/ۚ᩷ۡ;->ᩴ:F

    add-float/2addr v2, v0

    goto :goto_1

    .line 345
    :cond_3
    iget v2, p0, Ll/ۚ᩷ۡ;->ᩴ:F

    add-float/2addr v2, v0

    move v4, v2

    move v2, v0

    move v0, v4

    :goto_1
    move v3, v1

    :goto_2
    float-to-int v0, v0

    float-to-int v1, v1

    float-to-int v2, v2

    float-to-int v3, v3

    .line 351
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    const/4 p1, 0x1

    return p1
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 260
    iget-object v0, p0, Ll/ۚ᩷ۡ;->ᩳ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ۚ᩷ۡ;->ᩳ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method

.method public final ֫()V
    .locals 1

    const v0, -0xbfbfc0

    .line 322
    iput v0, p0, Ll/ۚ᩷ۡ;->᩷:I

    return-void
.end method

.method public final ֫(F)V
    .locals 0

    .line 297
    iput p1, p0, Ll/ۚ᩷ۡ;->ܺ:F

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const v0, -0xf0f10

    .line 308
    iput v0, p0, Ll/ۚ᩷ۡ;->ۢ:I

    return-void
.end method
