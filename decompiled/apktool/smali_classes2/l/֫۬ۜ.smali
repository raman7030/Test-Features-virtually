.class public final Ll/֫۬ۜ;
.super Ljava/lang/Object;
.source "778V"


# direct methods
.method public static ֫(II)I
    .locals 1

    sub-int/2addr p0, p1

    .line 159
    div-int/lit8 p1, p0, 0x2

    const/4 v0, 0x0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 199
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static ֫(IIIF)Ll/ܰۗۜ;
    .locals 3

    const/4 v0, 0x0

    if-lez p0, :cond_7

    if-gtz p1, :cond_0

    goto :goto_5

    :cond_0
    const/4 v1, 0x0

    cmpl-float v2, p3, v1

    if-lez v2, :cond_1

    goto :goto_0

    :cond_1
    const/high16 p3, 0x3f800000    # 1.0f

    :goto_0
    int-to-float p0, p0

    mul-float p0, p0, p3

    const/16 p3, 0x5a

    if-eq p2, p3, :cond_3

    const/16 p3, 0x10e

    if-ne p2, p3, :cond_2

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p2, 0x1

    :goto_2
    if-eqz p2, :cond_4

    int-to-float p3, p1

    goto :goto_3

    :cond_4
    move p3, p0

    :goto_3
    if-eqz p2, :cond_5

    goto :goto_4

    :cond_5
    int-to-float p0, p1

    :goto_4
    cmpg-float p1, p3, v1

    if-lez p1, :cond_7

    cmpg-float p1, p0, v1

    if-gtz p1, :cond_6

    goto :goto_5

    .line 110
    :cond_6
    new-instance p1, Ll/ܰۗۜ;

    invoke-direct {p1, p3, p0}, Ll/ܰۗۜ;-><init>(FF)V

    return-object p1

    :cond_7
    :goto_5
    return-object v0
.end method
