.class public final Ll/᩸ۢۡ;
.super Ljava/lang/Object;
.source "I5VL"


# instance fields
.field public final ֫:I

.field public ۧ:Z

.field public ܳ:F

.field public ܽ:F

.field public ܿ:F

.field public ᩳ:F


# direct methods
.method public constructor <init>(FFFFIF)V
    .locals 0

    .line 411
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 412
    iput p1, p0, Ll/᩸ۢۡ;->ܿ:F

    .line 413
    iput p2, p0, Ll/᩸ۢۡ;->ܳ:F

    .line 414
    iput p3, p0, Ll/᩸ۢۡ;->ܽ:F

    .line 415
    iput p4, p0, Ll/᩸ۢۡ;->ᩳ:F

    int-to-float p2, p5

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p2, p4

    const/4 p4, 0x1

    const/4 p5, -0x1

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    if-gez p1, :cond_1

    cmpl-float p2, p3, p6

    if-lez p2, :cond_1

    .line 418
    iput p4, p0, Ll/᩸ۢۡ;->֫:I

    return-void

    :cond_1
    if-lez p1, :cond_2

    neg-float p2, p6

    cmpg-float p2, p3, p2

    if-gez p2, :cond_2

    .line 420
    iput p5, p0, Ll/᩸ۢۡ;->֫:I

    return-void

    .line 422
    :cond_2
    iput p1, p0, Ll/᩸ۢۡ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 460
    iget v0, p0, Ll/᩸ۢۡ;->֫:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    int-to-float p1, p1

    :goto_0
    iput p1, p0, Ll/᩸ۢۡ;->ܿ:F

    .line 461
    iput v1, p0, Ll/᩸ۢۡ;->ܽ:F

    .line 462
    iput v1, p0, Ll/᩸ۢۡ;->ᩳ:F

    const/4 p1, 0x1

    .line 463
    iput-boolean p1, p0, Ll/᩸ۢۡ;->ۧ:Z

    return-void
.end method

.method public final ֫(IFI)Z
    .locals 5

    .line 430
    iget-boolean v0, p0, Ll/᩸ۢۡ;->ۧ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 433
    :cond_0
    iget v0, p0, Ll/᩸ۢۡ;->ܽ:F

    iget v2, p0, Ll/᩸ۢۡ;->֫:I

    mul-int v2, v2, p1

    int-to-float v2, v2

    const/high16 v3, 0x40c00000    # 6.0f

    mul-float v2, v2, v3

    mul-float v2, v2, p2

    add-float/2addr v2, v0

    iput v2, p0, Ll/᩸ۢۡ;->ܽ:F

    const/high16 v0, -0x3fa00000    # -3.5f

    mul-float v0, v0, p2

    float-to-double v2, v0

    .line 434
    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    move-result-wide v2

    double-to-float v0, v2

    .line 435
    iget v2, p0, Ll/᩸ۢۡ;->ܽ:F

    mul-float v2, v2, v0

    iput v2, p0, Ll/᩸ۢۡ;->ܽ:F

    .line 436
    iget v3, p0, Ll/᩸ۢۡ;->ᩳ:F

    mul-float v3, v3, v0

    iput v3, p0, Ll/᩸ۢۡ;->ᩳ:F

    .line 437
    iget v0, p0, Ll/᩸ۢۡ;->ܿ:F

    mul-float v2, v2, p2

    add-float/2addr v2, v0

    iput v2, p0, Ll/᩸ۢۡ;->ܿ:F

    .line 438
    iget v0, p0, Ll/᩸ۢۡ;->ܳ:F

    mul-float v3, v3, p2

    add-float/2addr v3, v0

    iput v3, p0, Ll/᩸ۢۡ;->ܳ:F

    const/4 p2, 0x0

    cmpg-float v0, v2, p2

    if-lez v0, :cond_1

    int-to-float v4, p1

    cmpl-float v2, v2, v4

    if-ltz v2, :cond_3

    :cond_1
    if-gtz v0, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    int-to-float p1, p1

    .line 440
    :goto_0
    iput p1, p0, Ll/᩸ۢۡ;->ܿ:F

    .line 441
    iput p2, p0, Ll/᩸ۢۡ;->ܽ:F

    .line 442
    iput p2, p0, Ll/᩸ۢۡ;->ᩳ:F

    .line 443
    iput-boolean v1, p0, Ll/᩸ۢۡ;->ۧ:Z

    :cond_3
    cmpg-float p1, v3, p2

    if-gtz p1, :cond_4

    .line 447
    iput p2, p0, Ll/᩸ۢۡ;->ܳ:F

    .line 448
    iput p2, p0, Ll/᩸ۢۡ;->ᩳ:F

    goto :goto_1

    :cond_4
    int-to-float p1, p3

    cmpl-float p3, v3, p1

    if-ltz p3, :cond_5

    .line 450
    iput p1, p0, Ll/᩸ۢۡ;->ܳ:F

    .line 451
    iput p2, p0, Ll/᩸ۢۡ;->ᩳ:F

    .line 453
    :cond_5
    :goto_1
    iget-boolean p1, p0, Ll/᩸ۢۡ;->ۧ:Z

    return p1
.end method
