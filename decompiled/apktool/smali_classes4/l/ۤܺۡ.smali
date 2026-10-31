.class public final Ll/ۤܺۡ;
.super Ll/ۗܺۡ;
.source "34K8"


# static fields
.field public static final ܳ֫:Landroid/graphics/RectF;

.field public static final ܽ֫:Ll/۫ܺۡ;

.field public static final ܿ֫:Landroid/graphics/RectF;

.field public static final ᩳ֫:Ll/۫ܺۡ;

.field public static final ᩻֫:Landroid/graphics/RectF;


# instance fields
.field public ֫֫:Ll/۫ܺۡ;

.field public ۟:Ll/۫ܺۡ;

.field public ۧ֫:Z

.field public ۨ:F

.field public ܰ:I

.field public ᩺:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 24
    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, -0x3ccc0000    # -180.0f

    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sput-object v0, Ll/ۤܺۡ;->ܿ֫:Landroid/graphics/RectF;

    .line 25
    new-instance v0, Landroid/graphics/RectF;

    const/high16 v5, -0x3f800000    # -4.0f

    const/high16 v6, 0x40800000    # 4.0f

    invoke-direct {v0, v1, v5, v3, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    sput-object v0, Ll/ۤܺۡ;->ܳ֫:Landroid/graphics/RectF;

    .line 26
    new-instance v0, Landroid/graphics/RectF;

    const/high16 v1, -0x3cf00000    # -144.0f

    const/high16 v3, 0x43100000    # 144.0f

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sput-object v0, Ll/ۤܺۡ;->᩻֫:Landroid/graphics/RectF;

    .line 27
    new-instance v0, Ll/۫ܺۡ;

    const v1, -0x3bfd599a    # -522.6f

    invoke-direct {v0, v1}, Ll/۫ܺۡ;-><init>(F)V

    sput-object v0, Ll/ۤܺۡ;->ܽ֫:Ll/۫ܺۡ;

    .line 28
    new-instance v0, Ll/۫ܺۡ;

    const v1, -0x3cba6666    # -197.6f

    invoke-direct {v0, v1}, Ll/۫ܺۡ;-><init>(F)V

    sput-object v0, Ll/ۤܺۡ;->ᩳ֫:Ll/۫ܺۡ;

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 6

    .line 12
    invoke-direct {p0}, Ll/ۙܺۡ;-><init>()V

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Ll/ۗܺۡ;->ۛ:Z

    const v1, 0x7f0400fc

    .line 17
    filled-new-array {v1}, [I

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/4 v2, 0x0

    .line 19
    :try_start_0
    invoke-virtual {v1, v2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 25
    invoke-virtual {p0, v3}, Ll/ۙܺۡ;->setTint(I)V

    .line 32
    iput-boolean v0, p0, Ll/ۤܺۡ;->ۧ֫:Z

    .line 35
    new-instance v1, Ll/۫ܺۡ;

    sget-object v3, Ll/ۤܺۡ;->ܽ֫:Ll/۫ܺۡ;

    invoke-direct {v1, v3}, Ll/۫ܺۡ;-><init>(Ll/۫ܺۡ;)V

    iput-object v1, p0, Ll/ۤܺۡ;->۟:Ll/۫ܺۡ;

    .line 36
    new-instance v3, Ll/۫ܺۡ;

    sget-object v4, Ll/ۤܺۡ;->ᩳ֫:Ll/۫ܺۡ;

    invoke-direct {v3, v4}, Ll/۫ܺۡ;-><init>(Ll/۫ܺۡ;)V

    iput-object v3, p0, Ll/ۤܺۡ;->֫֫:Ll/۫ܺۡ;

    .line 46
    invoke-virtual {p1}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    const/high16 v5, 0x40800000    # 4.0f

    mul-float v5, v5, v4

    .line 47
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    iput v5, p0, Ll/ۤܺۡ;->ܰ:I

    const/high16 v5, 0x41800000    # 16.0f

    mul-float v4, v4, v5

    .line 48
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iput v4, p0, Ll/ۤܺۡ;->᩺:I

    const v4, 0x1010033

    .line 26
    filled-new-array {v4}, [I

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v4, 0x0

    .line 28
    :try_start_1
    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 50
    iput v4, p0, Ll/ۤܺۡ;->ۨ:F

    .line 53
    invoke-static {v1}, Ll/᩹ܺۡ;->֫(Ljava/lang/Object;)Landroid/animation/AnimatorSet;

    move-result-object p1

    .line 54
    invoke-static {v3}, Ll/᩹ܺۡ;->ۧ(Ljava/lang/Object;)Landroid/animation/AnimatorSet;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/animation/Animator;

    aput-object p1, v3, v2

    aput-object v1, v3, v0

    iput-object v3, p0, Ll/ۗܺۡ;->ۤ:[Landroid/animation/Animator;

    return-void

    :catchall_0
    move-exception v0

    .line 30
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 31
    throw v0

    :catchall_1
    move-exception p1

    .line 21
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 22
    throw p1
.end method


# virtual methods
.method public final getIntrinsicHeight()I
    .locals 1

    .line 82
    iget-boolean v0, p0, Ll/ۗܺۡ;->ۛ:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۤܺۡ;->᩺:I

    return v0

    :cond_0
    iget v0, p0, Ll/ۤܺۡ;->ܰ:I

    return v0
.end method

.method public final ֫()V
    .locals 1

    .line 71
    iget-boolean v0, p0, Ll/ۤܺۡ;->ۧ֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 72
    iput-boolean v0, p0, Ll/ۤܺۡ;->ۧ֫:Z

    .line 73
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
    .locals 4

    .line 93
    iget-boolean v0, p0, Ll/ۗܺۡ;->ۛ:Z

    sget-object v1, Ll/ۤܺۡ;->ܿ֫:Landroid/graphics/RectF;

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    int-to-float p3, p3

    .line 94
    sget-object v0, Ll/ۤܺۡ;->ܳ֫:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr p3, v3

    int-to-float p4, p4

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v3

    div-float/2addr p4, v3

    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 95
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result p3

    div-float/2addr p3, v2

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result p4

    div-float/2addr p4, v2

    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_0

    :cond_0
    int-to-float p3, p3

    .line 97
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v0

    div-float/2addr p3, v0

    int-to-float p4, p4

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v0

    div-float/2addr p4, v0

    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 98
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result p3

    div-float/2addr p3, v2

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result p4

    div-float/2addr p4, v2

    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 101
    :goto_0
    iget-boolean p3, p0, Ll/ۤܺۡ;->ۧ֫:Z

    if-eqz p3, :cond_1

    .line 102
    iget p3, p0, Ll/ۙܺۡ;->᩸:I

    int-to-float p3, p3

    iget p4, p0, Ll/ۤܺۡ;->ۨ:F

    mul-float p3, p3, p4

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 111
    invoke-virtual {p1, v1, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 104
    iget p3, p0, Ll/ۙܺۡ;->᩸:I

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 116
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result p3

    .line 117
    iget-object p4, p0, Ll/ۤܺۡ;->֫֫:Ll/۫ܺۡ;

    iget v0, p4, Ll/۫ܺۡ;->ۧ:F

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 118
    iget p4, p4, Ll/۫ܺۡ;->֫:F

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, p4, v0}, Landroid/graphics/Canvas;->scale(FF)V

    .line 120
    sget-object p4, Ll/ۤܺۡ;->᩻֫:Landroid/graphics/RectF;

    invoke-virtual {p1, p4, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 122
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 116
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result p3

    .line 117
    iget-object v2, p0, Ll/ۤܺۡ;->۟:Ll/۫ܺۡ;

    iget v3, v2, Ll/۫ܺۡ;->ۧ:F

    invoke-virtual {p1, v3, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 118
    iget v1, v2, Ll/۫ܺۡ;->֫:F

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->scale(FF)V

    .line 120
    invoke-virtual {p1, p4, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 122
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 25
    iget-boolean v0, p0, Ll/ۗܺۡ;->ۛ:Z

    if-eq v0, p1, :cond_0

    .line 26
    iput-boolean p1, p0, Ll/ۗܺۡ;->ۛ:Z

    .line 27
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method
