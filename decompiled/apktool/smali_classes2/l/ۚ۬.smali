.class public final Ll/ۚ۬;
.super Ljava/lang/Object;
.source "65YF"


# direct methods
.method public static ֫(Landroid/graphics/drawable/Drawable;FF)V
    .locals 0

    .line 433
    invoke-virtual {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 438
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;IIII)V
    .locals 0

    .line 475
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 443
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 453
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->applyTheme(Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 470
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 448
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;)Z
    .locals 0

    .line 458
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    move-result p0

    return p0
.end method

.method public static ۧ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;
    .locals 0

    .line 463
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object p0

    return-object p0
.end method
