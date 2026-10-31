.class public final Ll/ܳ᩸ۡ;
.super Ljava/lang/Object;
.source "EAJU"


# instance fields
.field public ֫:F

.field public ۧ:F

.field public final ܳ:Landroid/graphics/RectF;

.field public final ܽ:I

.field public ܿ:F

.field public ᩳ:F


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ܳ᩸ۡ;->ܳ:Landroid/graphics/RectF;

    .line 24
    iput p1, p0, Ll/ܳ᩸ۡ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 67
    iput v0, p0, Ll/ܳ᩸ۡ;->֫:F

    iput v0, p0, Ll/ܳ᩸ۡ;->ܿ:F

    iput v0, p0, Ll/ܳ᩸ۡ;->ᩳ:F

    iput v0, p0, Ll/ܳ᩸ۡ;->ۧ:F

    .line 68
    iget-object v0, p0, Ll/ܳ᩸ۡ;->ܳ:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    return-void
.end method

.method public final ֫(FFFF)V
    .locals 6

    .line 28
    iget v1, p0, Ll/ܳ᩸ۡ;->ܽ:I

    move-object v0, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Ll/ܳ᩸ۡ;->֫(IFFFF)V

    return-void
.end method

.method public final ֫(IFFFF)V
    .locals 5

    .line 32
    iput p2, p0, Ll/ܳ᩸ۡ;->ۧ:F

    .line 33
    iput p3, p0, Ll/ܳ᩸ۡ;->ܿ:F

    .line 34
    iput p4, p0, Ll/ܳ᩸ۡ;->ᩳ:F

    .line 35
    iput p5, p0, Ll/ܳ᩸ۡ;->֫:F

    sub-float v0, p4, p2

    sub-float v1, p5, p3

    const/4 v2, -0x1

    if-eq p1, v2, :cond_4

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, 0x40200000    # 2.5f

    if-eqz p1, :cond_3

    const/4 v4, 0x1

    if-eq p1, v4, :cond_2

    const/4 v4, 0x2

    if-eq p1, v4, :cond_1

    const/4 v4, 0x3

    if-eq p1, v4, :cond_0

    goto :goto_2

    :cond_0
    mul-float v0, v0, v3

    sub-float/2addr p2, v0

    goto :goto_0

    :cond_1
    mul-float v0, v0, v3

    add-float/2addr p4, v0

    :goto_0
    div-float/2addr v1, v2

    sub-float/2addr p3, v1

    add-float/2addr p5, v1

    goto :goto_2

    :cond_2
    mul-float v1, v1, v3

    sub-float/2addr p3, v1

    goto :goto_1

    :cond_3
    mul-float v1, v1, v3

    add-float/2addr p5, v1

    :goto_1
    div-float/2addr v0, v2

    sub-float/2addr p2, v0

    add-float/2addr p4, v0

    .line 63
    :goto_2
    iget-object p1, p0, Ll/ܳ᩸ۡ;->ܳ:Landroid/graphics/RectF;

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/RectF;->set(FFFF)V

    return-void

    .line 41
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ֫(FF)Z
    .locals 1

    .line 72
    iget-object v0, p0, Ll/ܳ᩸ۡ;->ܳ:Landroid/graphics/RectF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    move-result p1

    return p1
.end method

.method public final ۧ(FF)Z
    .locals 1

    .line 79
    iget v0, p0, Ll/ܳ᩸ۡ;->ۧ:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    iget v0, p0, Ll/ܳ᩸ۡ;->ᩳ:F

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    iget p1, p0, Ll/ܳ᩸ۡ;->ܿ:F

    cmpl-float p1, p2, p1

    if-ltz p1, :cond_0

    iget p1, p0, Ll/ܳ᩸ۡ;->֫:F

    cmpg-float p1, p2, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
