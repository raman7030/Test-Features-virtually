.class public final Ll/֨ۜ᩷;
.super Ll/۟ۜ᩷;
.source "K7IB"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginImageView;


# virtual methods
.method public final clearColorFilter()V
    .locals 1

    .line 113
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearColorFilter()V

    return-void
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0
.end method

.method public final getCropToPadding()Z
    .locals 1

    .line 83
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getCropToPadding()Z

    move-result v0

    return v0
.end method

.method public final getImageAlpha()I
    .locals 1

    .line 118
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getImageAlpha()I

    move-result v0

    return v0
.end method

.method public final getImageDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final getImageMatrix()Landroid/graphics/Matrix;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method

.method public final getImageTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getImageTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public final getImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getImageTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public final getScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    return-object v0
.end method

.method public final setColorFilter(I)V
    .locals 1

    .line 103
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    return-void
.end method

.method public final setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 98
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 108
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public final setCropToPadding(Z)V
    .locals 1

    .line 88
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setCropToPadding(Z)V

    return-void
.end method

.method public final setImage(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 36
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final setImage(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 31
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setImageAlpha(I)V
    .locals 1

    .line 123
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageAlpha(I)V

    return-void
.end method

.method public final setImageMatrix(Landroid/graphics/Matrix;)V
    .locals 1

    .line 78
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final setImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 47
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final setImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 58
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public final setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    .line 68
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method
