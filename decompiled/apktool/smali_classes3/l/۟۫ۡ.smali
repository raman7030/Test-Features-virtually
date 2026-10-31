.class public final Ll/۟۫ۡ;
.super Ljava/lang/Object;
.source "UBQC"


# direct methods
.method public static ֫(II)D
    .locals 10

    .line 48
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    .line 49
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    .line 50
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    const/4 v2, 0x3

    new-array v3, v2, [D

    .line 52
    invoke-static {v0, v1, p0, v3}, Ll/۟ۗ;->֫(III[D)V

    .line 48
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result p0

    .line 49
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v0

    .line 50
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    new-array v1, v2, [D

    .line 52
    invoke-static {p0, v0, p1, v1}, Ll/۟ۗ;->֫(III[D)V

    const/4 p0, 0x0

    .line 595
    aget-wide v4, v3, p0

    aget-wide p0, v1, p0

    sub-double/2addr v4, p0

    const-wide/high16 p0, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    const/4 v0, 0x1

    aget-wide v6, v3, v0

    aget-wide v8, v1, v0

    sub-double/2addr v6, v8

    .line 596
    invoke-static {v6, v7, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    add-double/2addr v6, v4

    const/4 v0, 0x2

    aget-wide v2, v3, v0

    aget-wide v0, v1, v0

    sub-double/2addr v2, v0

    .line 597
    invoke-static {v2, v3, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    add-double/2addr p0, v6

    .line 595
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static ֫(I)I
    .locals 2

    .line 22
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    mul-int/lit16 v0, v0, 0x12b

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    mul-int/lit16 v1, v1, 0x24b

    add-int/2addr v1, v0

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x72

    add-int/2addr p0, v1

    .line 23
    div-int/lit16 p0, p0, 0x3e8

    return p0
.end method

.method public static ֫(Landroid/graphics/Bitmap;)I
    .locals 10

    .line 69
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 70
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 71
    new-instance v2, Ll/ܺۢᩴ;

    mul-int v3, v0, v1

    div-int/lit8 v3, v3, 0x4

    invoke-direct {v2, v3}, Ll/ܺۢᩴ;-><init>(I)V

    add-int/lit8 v3, v0, -0x1

    add-int/lit8 v4, v1, -0x1

    .line 74
    new-instance v5, Ll/۫۫ۡ;

    invoke-direct {v5, p0}, Ll/۫۫ۡ;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v0, :cond_2

    .line 76
    invoke-virtual {v5, v7, v6}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 77
    invoke-virtual {p0, v7, v6}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v8

    invoke-virtual {v2, v8}, Ll/ܺۢᩴ;->add(I)Z

    .line 80
    :cond_0
    invoke-virtual {v5, v7, v4}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 81
    invoke-virtual {p0, v7, v4}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v8

    invoke-virtual {v2, v8}, Ll/ܺۢᩴ;->add(I)Z

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v1, :cond_5

    .line 86
    invoke-virtual {v5, v6, v0}, Ll/۫۫ۡ;->֫(II)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 87
    invoke-virtual {p0, v6, v0}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v7

    invoke-virtual {v2, v7}, Ll/ܺۢᩴ;->add(I)Z

    .line 90
    :cond_3
    invoke-virtual {v5, v3, v0}, Ll/۫۫ۡ;->֫(II)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 91
    invoke-virtual {p0, v3, v0}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v7

    invoke-virtual {v2, v7}, Ll/ܺۢᩴ;->add(I)Z

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    :goto_2
    if-ge v0, v3, :cond_9

    const/4 v1, 0x1

    :goto_3
    if-ge v1, v4, :cond_8

    .line 97
    invoke-virtual {v5, v0, v1}, Ll/۫۫ۡ;->֫(II)Z

    move-result v7

    if-eqz v7, :cond_7

    add-int/lit8 v7, v0, -0x1

    add-int/lit8 v8, v1, -0x1

    .line 98
    invoke-virtual {v5, v7, v8}, Ll/۫۫ۡ;->֫(II)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 99
    invoke-virtual {v5, v0, v8}, Ll/۫۫ۡ;->֫(II)Z

    move-result v9

    if-eqz v9, :cond_6

    add-int/lit8 v9, v0, 0x1

    .line 100
    invoke-virtual {v5, v9, v8}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 101
    invoke-virtual {v5, v7, v1}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 102
    invoke-virtual {v5, v9, v1}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_6

    add-int/lit8 v8, v1, 0x1

    .line 103
    invoke-virtual {v5, v7, v8}, Ll/۫۫ۡ;->֫(II)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 104
    invoke-virtual {v5, v0, v8}, Ll/۫۫ۡ;->֫(II)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 105
    invoke-virtual {v5, v9, v8}, Ll/۫۫ۡ;->֫(II)Z

    move-result v7

    if-nez v7, :cond_7

    .line 106
    :cond_6
    invoke-virtual {p0, v0, v1}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v7

    invoke-virtual {v2, v7}, Ll/ܺۢᩴ;->add(I)Z

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 112
    :cond_9
    invoke-virtual {v2}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_a

    goto :goto_4

    .line 115
    :cond_a
    new-instance p0, Ll/ܰ۫ۡ;

    invoke-virtual {v2}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܰ۫ۡ;-><init>([I)V

    .line 116
    iget-object p0, p0, Ll/ܰ۫ۡ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    .line 117
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۛ۠ۧ;

    invoke-virtual {p0}, Ll/ۛ۠ۧ;->ܽ()I

    move-result p0

    return p0

    :cond_b
    :goto_4
    return v6
.end method

.method public static ֫(I[F)V
    .locals 9

    shr-int/lit8 v0, p0, 0x10

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    and-int/lit16 p0, p0, 0xff

    if-le v1, v0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-le p0, v2, :cond_1

    move v2, p0

    :cond_1
    if-ge v1, v0, :cond_2

    move v3, v1

    goto :goto_1

    :cond_2
    move v3, v0

    :goto_1
    if-ge p0, v3, :cond_3

    move v3, p0

    :cond_3
    sub-int v3, v2, v3

    int-to-float v4, v2

    const v5, 0x3b808081

    mul-float v5, v5, v4

    const/4 v6, 0x2

    .line 167
    aput v5, p1, v6

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_8

    int-to-float v8, v3

    div-float v4, v8, v4

    .line 171
    aput v4, p1, v5

    if-nez v3, :cond_4

    .line 180
    aput v7, p1, v6

    return-void

    :cond_4
    if-ne v0, v2, :cond_5

    sub-int/2addr v1, p0

    int-to-float p0, v1

    div-float/2addr p0, v8

    goto :goto_3

    :cond_5
    if-ne v1, v2, :cond_6

    sub-int/2addr p0, v0

    int-to-float p0, p0

    div-float/2addr p0, v8

    const/high16 v0, 0x40000000    # 2.0f

    goto :goto_2

    :cond_6
    sub-int/2addr v0, v1

    int-to-float p0, v0

    div-float/2addr p0, v8

    const/high16 v0, 0x40800000    # 4.0f

    :goto_2
    add-float/2addr p0, v0

    :goto_3
    const/high16 v0, 0x42700000    # 60.0f

    mul-float p0, p0, v0

    cmpg-float v0, p0, v7

    if-gez v0, :cond_7

    const/high16 v0, 0x43b40000    # 360.0f

    add-float/2addr p0, v0

    .line 193
    :cond_7
    aput p0, p1, v6

    return-void

    .line 173
    :cond_8
    aput v7, p1, v5

    .line 174
    aput v7, p1, v6

    return-void
.end method

.method public static ۧ(II)I
    .locals 2

    ushr-int/lit8 v0, p0, 0x18

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x50

    if-ge v0, v1, :cond_0

    return p1

    .line 130
    :cond_0
    invoke-static {p0}, Ll/۟۫ۡ;->֫(I)I

    move-result p0

    const/16 p1, 0x82

    if-le p0, p1, :cond_1

    const/high16 p0, -0x1000000

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ܽ(II)Z
    .locals 3

    .line 31
    invoke-static {p0, p1}, Ll/۟۫ۡ;->֫(II)D

    move-result-wide p0

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    cmpg-double v2, p0, v0

    if-gez v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
