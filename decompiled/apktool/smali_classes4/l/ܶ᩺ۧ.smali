.class public final Ll/ܶ᩺ۧ;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "G5V7"


# instance fields
.field public ֫:Z

.field public ۜ:I

.field public ۡ:Landroid/graphics/PorterDuff$Mode;

.field public ۢ:Landroid/content/res/ColorStateList;

.field public ۧ:Z

.field public ܳ:Landroid/content/res/ColorStateList;

.field public ܺ:Ll/۠᩺ۧ;

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:Landroid/graphics/Bitmap;

.field public ᩷:Landroid/graphics/Paint;

.field public ᩻:Landroid/graphics/PorterDuff$Mode;


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    .line 1139
    iget v0, p0, Ll/ܶ᩺ۧ;->ۜ:I

    return v0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1128
    new-instance v0, Ll/᩹᩺ۧ;

    invoke-direct {v0, p0}, Ll/᩹᩺ۧ;-><init>(Ll/ܶ᩺ۧ;)V

    return-object v0
.end method

.method public final newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1134
    new-instance p1, Ll/᩹᩺ۧ;

    invoke-direct {p1, p0}, Ll/᩹᩺ۧ;-><init>(Ll/ܶ᩺ۧ;)V

    return-object p1
.end method
