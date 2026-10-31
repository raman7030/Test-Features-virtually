.class public final Ll/᩻ۨۜ;
.super Ljava/lang/Object;
.source "O6M8"


# direct methods
.method public static ֫(FF)F
    .locals 1

    const/4 v0, 0x0

    .line 49
    invoke-static {v0, p0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    const v0, 0x3e19999a    # 0.15f

    mul-float p1, p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    .line 50
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    div-float/2addr p0, p1

    add-float/2addr p0, v0

    const p1, 0x3e99999a    # 0.3f

    div-float/2addr p1, p0

    return p1
.end method
