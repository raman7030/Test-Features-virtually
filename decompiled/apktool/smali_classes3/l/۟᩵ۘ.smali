.class public final Ll/۟᩵ۘ;
.super Landroid/view/animation/Animation;
.source "J1WB"


# static fields
.field public static final ܿ֫:Ljava/util/WeakHashMap;

.field public static final ᩳ֫:Z


# instance fields
.field public ֫֫:F

.field public ۗ:Z

.field public final ۙ:Landroid/graphics/Camera;

.field public ۛ:F

.field public final ۟:Landroid/graphics/Matrix;

.field public ۤ:F

.field public ۧ֫:F

.field public ۨ:F

.field public ۫:F

.field public ۬:F

.field public ܰ:F

.field public final ܽ֫:Ljava/lang/ref/WeakReference;

.field public final ᩶:Landroid/graphics/RectF;

.field public final ᩸:Landroid/graphics/RectF;

.field public ᩹:F

.field public ᩺:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 21
    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ll/۟᩵ۘ;->ᩳ֫:Z

    .line 23
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ll/۟᩵ۘ;->ܿ֫:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 63
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 45
    new-instance v0, Landroid/graphics/Camera;

    invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V

    iput-object v0, p0, Ll/۟᩵ۘ;->ۙ:Landroid/graphics/Camera;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 48
    iput v0, p0, Ll/۟᩵ۘ;->᩹:F

    .line 54
    iput v0, p0, Ll/۟᩵ۘ;->᩺:F

    .line 55
    iput v0, p0, Ll/۟᩵ۘ;->ܰ:F

    .line 59
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/۟᩵ۘ;->᩶:Landroid/graphics/RectF;

    .line 60
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/۟᩵ۘ;->᩸:Landroid/graphics/RectF;

    .line 61
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/۟᩵ۘ;->۟:Landroid/graphics/Matrix;

    const-wide/16 v0, 0x0

    .line 64
    invoke-virtual {p0, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    const/4 v0, 0x1

    .line 65
    invoke-virtual {p0, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 66
    invoke-virtual {p1, p0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 67
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/۟᩵ۘ;->ܽ֫:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private ֨()V
    .locals 2

    .line 230
    iget-object v0, p0, Ll/۟᩵ۘ;->ܽ֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 232
    iget-object v1, p0, Ll/۟᩵ۘ;->᩶:Landroid/graphics/RectF;

    invoke-direct {p0, v0, v1}, Ll/۟᩵ۘ;->֫(Landroid/view/View;Landroid/graphics/RectF;)V

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/view/View;)Ll/۟᩵ۘ;
    .locals 3

    .line 35
    sget-object v0, Ll/۟᩵ۘ;->ܿ֫:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟᩵ۘ;

    if-eqz v1, :cond_1

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v2

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    return-object v1

    .line 38
    :cond_1
    :goto_0
    new-instance v1, Ll/۟᩵ۘ;

    invoke-direct {v1, p0}, Ll/۟᩵ۘ;-><init>(Landroid/view/View;)V

    .line 39
    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method private ֫(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 8

    .line 281
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 282
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    .line 283
    iget-boolean v1, p0, Ll/۟᩵ۘ;->ۗ:Z

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz v1, :cond_0

    .line 284
    iget v3, p0, Ll/۟᩵ۘ;->۬:F

    goto :goto_0

    :cond_0
    div-float v3, v0, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 285
    iget v1, p0, Ll/۟᩵ۘ;->۫:F

    goto :goto_1

    :cond_1
    div-float v1, p1, v2

    .line 287
    :goto_1
    iget v2, p0, Ll/۟᩵ۘ;->ۤ:F

    .line 288
    iget v4, p0, Ll/۟᩵ۘ;->ۛ:F

    .line 289
    iget v5, p0, Ll/۟᩵ۘ;->ۨ:F

    const/4 v6, 0x0

    cmpl-float v7, v2, v6

    if-nez v7, :cond_2

    cmpl-float v7, v4, v6

    if-nez v7, :cond_2

    cmpl-float v6, v5, v6

    if-eqz v6, :cond_3

    .line 292
    :cond_2
    iget-object v6, p0, Ll/۟᩵ۘ;->ۙ:Landroid/graphics/Camera;

    invoke-virtual {v6}, Landroid/graphics/Camera;->save()V

    .line 293
    invoke-virtual {v6, v2}, Landroid/graphics/Camera;->rotateX(F)V

    .line 294
    invoke-virtual {v6, v4}, Landroid/graphics/Camera;->rotateY(F)V

    neg-float v2, v5

    .line 295
    invoke-virtual {v6, v2}, Landroid/graphics/Camera;->rotateZ(F)V

    .line 296
    invoke-virtual {v6, p2}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V

    .line 297
    invoke-virtual {v6}, Landroid/graphics/Camera;->restore()V

    neg-float v2, v3

    neg-float v4, v1

    .line 298
    invoke-virtual {p2, v2, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 299
    invoke-virtual {p2, v3, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 302
    :cond_3
    iget v2, p0, Ll/۟᩵ۘ;->᩺:F

    .line 303
    iget v4, p0, Ll/۟᩵ۘ;->ܰ:F

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v6, v2, v5

    if-nez v6, :cond_4

    cmpl-float v5, v4, v5

    if-eqz v5, :cond_5

    .line 305
    :cond_4
    invoke-virtual {p2, v2, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    div-float/2addr v3, v0

    neg-float v3, v3

    mul-float v2, v2, v0

    sub-float/2addr v2, v0

    mul-float v2, v2, v3

    div-float/2addr v1, p1

    neg-float v0, v1

    mul-float v4, v4, p1

    sub-float/2addr v4, p1

    mul-float v4, v4, v0

    .line 308
    invoke-virtual {p2, v2, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 311
    :cond_5
    iget p1, p0, Ll/۟᩵ۘ;->֫֫:F

    iget v0, p0, Ll/۟᩵ۘ;->ۧ֫:F

    invoke-virtual {p2, p1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return-void
.end method

.method private ֫(Landroid/view/View;Landroid/graphics/RectF;)V
    .locals 3

    .line 254
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 255
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    .line 258
    invoke-virtual {p2, v2, v2, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 261
    iget-object v0, p0, Ll/۟᩵ۘ;->۟:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 262
    invoke-direct {p0, p1, v0}, Ll/۟᩵ۘ;->֫(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 263
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 265
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p2, v0, p1}, Landroid/graphics/RectF;->offset(FF)V

    .line 268
    iget p1, p2, Landroid/graphics/RectF;->right:F

    iget v0, p2, Landroid/graphics/RectF;->left:F

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    .line 270
    iput v0, p2, Landroid/graphics/RectF;->right:F

    .line 271
    iput p1, p2, Landroid/graphics/RectF;->left:F

    .line 273
    :cond_0
    iget p1, p2, Landroid/graphics/RectF;->bottom:F

    iget v0, p2, Landroid/graphics/RectF;->top:F

    cmpg-float v1, p1, v0

    if-gez v1, :cond_1

    .line 275
    iput p1, p2, Landroid/graphics/RectF;->top:F

    .line 276
    iput v0, p2, Landroid/graphics/RectF;->bottom:F

    :cond_1
    return-void
.end method

.method private ۚ()V
    .locals 7

    .line 236
    iget-object v0, p0, Ll/۟᩵ۘ;->ܽ֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    .line 237
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 242
    :cond_0
    iget-object v1, p0, Ll/۟᩵ۘ;->᩸:Landroid/graphics/RectF;

    invoke-direct {p0, v0, v1}, Ll/۟᩵ۘ;->֫(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 243
    iget-object v2, p0, Ll/۟᩵ۘ;->᩶:Landroid/graphics/RectF;

    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 245
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    float-to-double v2, v2

    .line 246
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget v3, v1, Landroid/graphics/RectF;->top:F

    float-to-double v3, v3

    .line 247
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-int v3, v3

    iget v4, v1, Landroid/graphics/RectF;->right:F

    float-to-double v4, v4

    .line 248
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    float-to-double v5, v1

    .line 249
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v1, v5

    .line 245
    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/view/View;->invalidate(IIII)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 1

    .line 316
    iget-object p1, p0, Ll/۟᩵ۘ;->ܽ֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_0

    .line 318
    iget v0, p0, Ll/۟᩵ۘ;->᩹:F

    invoke-virtual {p2, v0}, Landroid/view/animation/Transformation;->setAlpha(F)V

    .line 319
    invoke-virtual {p2}, Landroid/view/animation/Transformation;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/۟᩵ۘ;->֫(Landroid/view/View;Landroid/graphics/Matrix;)V

    :cond_0
    return-void
.end method

.method public final ֡()F
    .locals 2

    .line 216
    iget-object v0, p0, Ll/۟᩵ۘ;->ܽ֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 220
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ll/۟᩵ۘ;->ۧ֫:F

    add-float/2addr v0, v1

    return v0
.end method

.method public final ֫()F
    .locals 1

    .line 71
    iget v0, p0, Ll/۟᩵ۘ;->᩹:F

    return v0
.end method

.method public final ֫(F)V
    .locals 1

    .line 74
    iget v0, p0, Ll/۟᩵ۘ;->᩹:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 75
    iput p1, p0, Ll/۟᩵ۘ;->᩹:F

    .line 76
    iget-object p1, p0, Ll/۟᩵ۘ;->ܽ֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_0

    .line 78
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final ۖ()F
    .locals 1

    .line 183
    iget v0, p0, Ll/۟᩵ۘ;->֫֫:F

    return v0
.end method

.method public final ۘ()F
    .locals 1

    .line 193
    iget v0, p0, Ll/۟᩵ۘ;->ۧ֫:F

    return v0
.end method

.method public final ۜ()F
    .locals 1

    .line 125
    iget v0, p0, Ll/۟᩵ۘ;->ۛ:F

    return v0
.end method

.method public final ۜ(F)V
    .locals 1

    .line 149
    iget v0, p0, Ll/۟᩵ۘ;->ܰ:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 150
    invoke-direct {p0}, Ll/۟᩵ۘ;->֨()V

    .line 151
    iput p1, p0, Ll/۟᩵ۘ;->ܰ:F

    .line 152
    invoke-direct {p0}, Ll/۟᩵ۘ;->ۚ()V

    :cond_0
    return-void
.end method

.method public final ۡ()I
    .locals 1

    .line 156
    iget-object v0, p0, Ll/۟᩵ۘ;->ܽ֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 160
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v0

    return v0
.end method

.method public final ۡ(F)V
    .locals 1

    .line 210
    iget-object v0, p0, Ll/۟᩵ۘ;->ܽ֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 212
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    invoke-virtual {p0, p1}, Ll/۟᩵ۘ;->᩷(F)V

    :cond_0
    return-void
.end method

.method public final ۢ()F
    .locals 1

    .line 146
    iget v0, p0, Ll/۟᩵ۘ;->ܰ:F

    return v0
.end method

.method public final ۢ(F)V
    .locals 1

    .line 196
    iget v0, p0, Ll/۟᩵ۘ;->ۧ֫:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 197
    invoke-direct {p0}, Ll/۟᩵ۘ;->֨()V

    .line 198
    iput p1, p0, Ll/۟᩵ۘ;->ۧ֫:F

    .line 199
    invoke-direct {p0}, Ll/۟᩵ۘ;->ۚ()V

    :cond_0
    return-void
.end method

.method public final ۧ(F)V
    .locals 1

    .line 86
    iget-boolean v0, p0, Ll/۟᩵ۘ;->ۗ:Z

    if-eqz v0, :cond_1

    iget v0, p0, Ll/۟᩵ۘ;->۬:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 87
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/۟᩵ۘ;->֨()V

    const/4 v0, 0x1

    .line 88
    iput-boolean v0, p0, Ll/۟᩵ۘ;->ۗ:Z

    .line 89
    iput p1, p0, Ll/۟᩵ۘ;->۬:F

    .line 90
    invoke-direct {p0}, Ll/۟᩵ۘ;->ۚ()V

    return-void
.end method

.method public final ܳ()F
    .locals 1

    .line 115
    iget v0, p0, Ll/۟᩵ۘ;->ۤ:F

    return v0
.end method

.method public final ܳ(F)V
    .locals 1

    .line 129
    iget v0, p0, Ll/۟᩵ۘ;->ۛ:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 130
    invoke-direct {p0}, Ll/۟᩵ۘ;->֨()V

    .line 131
    iput p1, p0, Ll/۟᩵ۘ;->ۛ:F

    .line 132
    invoke-direct {p0}, Ll/۟᩵ۘ;->ۚ()V

    :cond_0
    return-void
.end method

.method public final ܺ()I
    .locals 1

    .line 169
    iget-object v0, p0, Ll/۟᩵ۘ;->ܽ֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 173
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v0

    return v0
.end method

.method public final ܺ(F)V
    .locals 1

    .line 223
    iget-object v0, p0, Ll/۟᩵ۘ;->ܽ֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 225
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    invoke-virtual {p0, p1}, Ll/۟᩵ۘ;->ۢ(F)V

    :cond_0
    return-void
.end method

.method public final ܽ()F
    .locals 1

    .line 83
    iget v0, p0, Ll/۟᩵ۘ;->۬:F

    return v0
.end method

.method public final ܽ(F)V
    .locals 1

    .line 97
    iget-boolean v0, p0, Ll/۟᩵ۘ;->ۗ:Z

    if-eqz v0, :cond_1

    iget v0, p0, Ll/۟᩵ۘ;->۫:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 98
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/۟᩵ۘ;->֨()V

    const/4 v0, 0x1

    .line 99
    iput-boolean v0, p0, Ll/۟᩵ۘ;->ۗ:Z

    .line 100
    iput p1, p0, Ll/۟᩵ۘ;->۫:F

    .line 101
    invoke-direct {p0}, Ll/۟᩵ۘ;->ۚ()V

    return-void
.end method

.method public final ܿ()F
    .locals 1

    .line 105
    iget v0, p0, Ll/۟᩵ۘ;->ۨ:F

    return v0
.end method

.method public final ܿ(F)V
    .locals 1

    .line 118
    iget v0, p0, Ll/۟᩵ۘ;->ۤ:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 119
    invoke-direct {p0}, Ll/۟᩵ۘ;->֨()V

    .line 120
    iput p1, p0, Ll/۟᩵ۘ;->ۤ:F

    .line 121
    invoke-direct {p0}, Ll/۟᩵ۘ;->ۚ()V

    :cond_0
    return-void
.end method

.method public final ᩳ()F
    .locals 1

    .line 94
    iget v0, p0, Ll/۟᩵ۘ;->۫:F

    return v0
.end method

.method public final ᩳ(F)V
    .locals 1

    .line 108
    iget v0, p0, Ll/۟᩵ۘ;->ۨ:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 109
    invoke-direct {p0}, Ll/۟᩵ۘ;->֨()V

    .line 110
    iput p1, p0, Ll/۟᩵ۘ;->ۨ:F

    .line 111
    invoke-direct {p0}, Ll/۟᩵ۘ;->ۚ()V

    :cond_0
    return-void
.end method

.method public final ᩵()F
    .locals 2

    .line 203
    iget-object v0, p0, Ll/۟᩵ۘ;->ܽ֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 207
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ll/۟᩵ۘ;->֫֫:F

    add-float/2addr v0, v1

    return v0
.end method

.method public final ᩷()F
    .locals 1

    .line 136
    iget v0, p0, Ll/۟᩵ۘ;->᩺:F

    return v0
.end method

.method public final ᩷(F)V
    .locals 1

    .line 186
    iget v0, p0, Ll/۟᩵ۘ;->֫֫:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 187
    invoke-direct {p0}, Ll/۟᩵ۘ;->֨()V

    .line 188
    iput p1, p0, Ll/۟᩵ۘ;->֫֫:F

    .line 189
    invoke-direct {p0}, Ll/۟᩵ۘ;->ۚ()V

    :cond_0
    return-void
.end method

.method public final ᩻(F)V
    .locals 1

    .line 139
    iget v0, p0, Ll/۟᩵ۘ;->᩺:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    .line 140
    invoke-direct {p0}, Ll/۟᩵ۘ;->֨()V

    .line 141
    iput p1, p0, Ll/۟᩵ۘ;->᩺:F

    .line 142
    invoke-direct {p0}, Ll/۟᩵ۘ;->ۚ()V

    :cond_0
    return-void
.end method
