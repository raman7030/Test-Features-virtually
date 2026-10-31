.class public final Ll/ۨ۬;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "Z20Y"


# instance fields
.field public ֫:I

.field public ۧ:Landroid/graphics/drawable/Drawable$ConstantState;

.field public ܽ:Landroid/content/res/ColorStateList;

.field public ᩳ:Landroid/graphics/PorterDuff$Mode;


# virtual methods
.method public final getChangingConfigurations()I
    .locals 2

    .line 61
    iget v0, p0, Ll/ۨ۬;->֫:I

    .line 62
    iget-object v1, p0, Ll/ۨ۬;->ۧ:Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->getChangingConfigurations()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    return v0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 54
    new-instance v0, Ll/ۛ۬;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ۛ۬;-><init>(Ll/ۨ۬;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public final newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 54
    new-instance v0, Ll/ۛ۬;

    invoke-direct {v0, p0, p1}, Ll/ۛ۬;-><init>(Ll/ۨ۬;Landroid/content/res/Resources;)V

    return-object v0
.end method
