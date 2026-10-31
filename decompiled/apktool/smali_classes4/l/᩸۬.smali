.class public final Ll/᩸۬;
.super Ljava/lang/Object;
.source "X2Z7"


# direct methods
.method public static ֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1081
    new-instance v0, Landroid/graphics/drawable/AdaptiveIconDrawable;

    invoke-direct {v0, p0, p1}, Landroid/graphics/drawable/AdaptiveIconDrawable;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public static ֫(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    .locals 0

    .line 1086
    invoke-static {p0}, Landroid/graphics/drawable/Icon;->createWithAdaptiveBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p0

    return-object p0
.end method
