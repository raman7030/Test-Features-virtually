.class public final Ll/֡ۛ;
.super Ljava/lang/Object;
.source "51AH"


# direct methods
.method public static ֫(Landroid/graphics/Rect;Ljava/util/List;)Landroid/view/DisplayCutout;
    .locals 1

    .line 228
    new-instance v0, Landroid/view/DisplayCutout;

    invoke-direct {v0, p0, p1}, Landroid/view/DisplayCutout;-><init>(Landroid/graphics/Rect;Ljava/util/List;)V

    return-object v0
.end method

.method public static ֫(Landroid/view/DisplayCutout;)Ljava/util/List;
    .locals 0

    .line 253
    invoke-virtual {p0}, Landroid/view/DisplayCutout;->getBoundingRects()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/view/DisplayCutout;)I
    .locals 0

    .line 238
    invoke-virtual {p0}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result p0

    return p0
.end method

.method public static ܽ(Landroid/view/DisplayCutout;)I
    .locals 0

    .line 243
    invoke-virtual {p0}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    move-result p0

    return p0
.end method

.method public static ܿ(Landroid/view/DisplayCutout;)I
    .locals 0

    .line 233
    invoke-virtual {p0}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    move-result p0

    return p0
.end method

.method public static ᩳ(Landroid/view/DisplayCutout;)I
    .locals 0

    .line 248
    invoke-virtual {p0}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result p0

    return p0
.end method
