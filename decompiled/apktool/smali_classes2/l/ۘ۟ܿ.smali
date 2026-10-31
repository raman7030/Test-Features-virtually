.class public final Ll/ۘ۟ܿ;
.super Ljava/lang/Object;
.source "J9R5"

# interfaces
.implements Landroid/view/animation/Interpolator;


# static fields
.field public static final ֫:F

.field public static final ۧ:F


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    .line 949
    invoke-static {v0}, Ll/ۘ۟ܿ;->֫(F)F

    move-result v1

    div-float v1, v0, v1

    sput v1, Ll/ۘ۟ܿ;->֫:F

    .line 951
    invoke-static {v0}, Ll/ۘ۟ܿ;->֫(F)F

    move-result v2

    mul-float v1, v1, v2

    sub-float/2addr v0, v1

    sput v0, Ll/ۘ۟ܿ;->ۧ:F

    return-void
.end method

.method public static ֫(F)F
    .locals 3

    const/high16 v0, 0x41000000    # 8.0f

    mul-float p0, p0, v0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v1, p0, v0

    if-gez v1, :cond_0

    neg-float v1, p0

    float-to-double v1, v1

    .line 957
    invoke-static {v1, v2}, Ljava/lang/Math;->exp(D)D

    move-result-wide v1

    double-to-float v1, v1

    sub-float/2addr v0, v1

    sub-float/2addr p0, v0

    return p0

    :cond_0
    sub-float p0, v0, p0

    float-to-double v1, p0

    .line 960
    invoke-static {v1, v2}, Ljava/lang/Math;->exp(D)D

    move-result-wide v1

    double-to-float p0, v1

    const v1, 0x3f21d2a7

    const v2, 0x3ebc5ab2

    .line 961
    invoke-static {v0, p0, v1, v2}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public final getInterpolation(F)F
    .locals 1

    .line 968
    sget v0, Ll/ۘ۟ܿ;->֫:F

    invoke-static {p1}, Ll/ۘ۟ܿ;->֫(F)F

    move-result p1

    mul-float v0, v0, p1

    const/4 p1, 0x0

    cmpl-float p1, v0, p1

    if-lez p1, :cond_0

    .line 970
    sget p1, Ll/ۘ۟ܿ;->ۧ:F

    add-float/2addr v0, p1

    :cond_0
    return v0
.end method
