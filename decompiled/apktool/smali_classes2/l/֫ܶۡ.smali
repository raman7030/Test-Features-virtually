.class public final Ll/֫ܶۡ;
.super Ljava/lang/Object;
.source "K6W6"


# static fields
.field public static final ۜ:D


# instance fields
.field public ֫:Z

.field public ۧ:F

.field public ܳ:F

.field public ܽ:F

.field public ܿ:F

.field public ᩳ:F

.field public ᩻:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x3feb333333333333L    # 0.85

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    sput-wide v0, Ll/֫ܶۡ;->ۜ:D

    return-void
.end method


# virtual methods
.method public final ֫(F)V
    .locals 8

    const/high16 v0, 0x42700000    # 60.0f

    mul-float p1, p1, v0

    const v0, 0x3a83126f    # 0.001f

    .line 16
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 17
    iget-boolean v0, p0, Ll/֫ܶۡ;->֫:Z

    if-eqz v0, :cond_0

    .line 18
    iget v0, p0, Ll/֫ܶۡ;->ۧ:F

    div-float/2addr v0, p1

    iput v0, p0, Ll/֫ܶۡ;->ᩳ:F

    iget v0, p0, Ll/֫ܶۡ;->ܽ:F

    div-float/2addr v0, p1

    iput v0, p0, Ll/֫ܶۡ;->ܿ:F

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Ll/֫ܶۡ;->ܽ:F

    iput p1, p0, Ll/֫ܶۡ;->ۧ:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll/֫ܶۡ;->֫:Z

    .line 20
    iput p1, p0, Ll/֫ܶۡ;->᩻:F

    iput p1, p0, Ll/֫ܶۡ;->ܳ:F

    return-void

    :cond_0
    float-to-double v0, p1

    .line 23
    sget-wide v2, Ll/֫ܶۡ;->ۜ:D

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    sub-double v6, v4, v0

    mul-double v6, v6, v2

    sub-double/2addr v4, v2

    div-double/2addr v6, v4

    double-to-float p1, v6

    .line 25
    iget v2, p0, Ll/֫ܶۡ;->ᩳ:F

    mul-float v3, v2, p1

    iput v3, p0, Ll/֫ܶۡ;->ܳ:F

    iget v3, p0, Ll/֫ܶۡ;->ܿ:F

    mul-float p1, p1, v3

    iput p1, p0, Ll/֫ܶۡ;->᩻:F

    float-to-double v4, v2

    mul-double v4, v4, v0

    double-to-float p1, v4

    .line 26
    iput p1, p0, Ll/֫ܶۡ;->ᩳ:F

    float-to-double v2, v3

    mul-double v2, v2, v0

    double-to-float p1, v2

    iput p1, p0, Ll/֫ܶۡ;->ܿ:F

    return-void
.end method

.method public final ֫(FF)V
    .locals 1

    .line 12
    iget v0, p0, Ll/֫ܶۡ;->ۧ:F

    add-float/2addr v0, p1

    iput v0, p0, Ll/֫ܶۡ;->ۧ:F

    iget p1, p0, Ll/֫ܶۡ;->ܽ:F

    add-float/2addr p1, p2

    iput p1, p0, Ll/֫ܶۡ;->ܽ:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll/֫ܶۡ;->֫:Z

    return-void
.end method

.method public final ֫()Z
    .locals 5

    .line 30
    iget-boolean v0, p0, Ll/֫ܶۡ;->֫:Z

    if-nez v0, :cond_1

    iget v0, p0, Ll/֫ܶۡ;->ᩳ:F

    float-to-double v0, v0

    iget v2, p0, Ll/֫ܶۡ;->ܿ:F

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    const-wide v2, 0x3f747ae140000000L    # 0.004999999888241291

    cmpl-double v4, v0, v2

    if-ltz v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Ll/֫ܶۡ;->֫:Z

    const/4 v0, 0x0

    .line 34
    iput v0, p0, Ll/֫ܶۡ;->᩻:F

    iput v0, p0, Ll/֫ܶۡ;->ܳ:F

    iput v0, p0, Ll/֫ܶۡ;->ܿ:F

    iput v0, p0, Ll/֫ܶۡ;->ᩳ:F

    iput v0, p0, Ll/֫ܶۡ;->ܽ:F

    iput v0, p0, Ll/֫ܶۡ;->ۧ:F

    return-void
.end method
