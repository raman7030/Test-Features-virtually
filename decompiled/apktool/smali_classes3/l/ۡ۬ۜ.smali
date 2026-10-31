.class public final Ll/ۡ۬ۜ;
.super Ljava/lang/Object;
.source "W7AQ"


# direct methods
.method public static ֫(IIIF)I
    .locals 4

    const/4 v0, -0x1

    if-lez p0, :cond_8

    if-gtz p1, :cond_0

    goto :goto_5

    :cond_0
    const/16 v1, 0x5a

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p2, v1, :cond_2

    const/16 v1, 0x10e

    if-ne p2, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x1

    :goto_1
    if-eqz p2, :cond_3

    int-to-float v1, p1

    goto :goto_2

    :cond_3
    int-to-float v1, p0

    :goto_2
    if-eqz p2, :cond_4

    int-to-float p0, p0

    goto :goto_3

    :cond_4
    int-to-float p0, p1

    :goto_3
    const/4 p1, 0x0

    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float p1, p3, p1

    if-lez p1, :cond_5

    goto :goto_4

    :cond_5
    const/high16 p3, 0x3f800000    # 1.0f

    :goto_4
    mul-float v1, v1, p3

    sub-float p1, v1, p0

    .line 52
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, p2

    if-gez p1, :cond_6

    return v0

    :cond_6
    cmpl-float p0, v1, p0

    if-lez p0, :cond_7

    return v3

    :cond_7
    return v2

    :cond_8
    :goto_5
    return v0
.end method
