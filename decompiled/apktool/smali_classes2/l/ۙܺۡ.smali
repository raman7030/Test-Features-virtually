.class public abstract Ll/ۙܺۡ;
.super Landroid/graphics/drawable/Drawable;
.source "96B4"


# instance fields
.field public ۗ:Landroid/content/res/ColorStateList;

.field public ۙ:Landroid/graphics/PorterDuffColorFilter;

.field public ۬:Landroid/graphics/PorterDuff$Mode;

.field public ᩶:Ll/᩶ܺۡ;

.field public ᩸:I

.field public ᩹:Landroid/graphics/ColorFilter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/16 v0, 0xff

    .line 26
    iput v0, p0, Ll/ۙܺۡ;->᩸:I

    .line 29
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Ll/ۙܺۡ;->۬:Landroid/graphics/PorterDuff$Mode;

    .line 32
    new-instance v0, Ll/᩶ܺۡ;

    invoke-direct {v0, p0}, Ll/᩶ܺۡ;-><init>(Ll/ۙܺۡ;)V

    iput-object v0, p0, Ll/ۙܺۡ;->᩶:Ll/᩶ܺۡ;

    return-void
.end method

.method private ֫()Z
    .locals 4

    .line 109
    iget-object v0, p0, Ll/ۙܺۡ;->ۗ:Landroid/content/res/ColorStateList;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v3, p0, Ll/ۙܺۡ;->۬:Landroid/graphics/PorterDuff$Mode;

    if-nez v3, :cond_0

    goto :goto_0

    .line 115
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    .line 117
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    iget-object v3, p0, Ll/ۙܺۡ;->۬:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    iput-object v2, p0, Ll/ۙܺۡ;->ۙ:Landroid/graphics/PorterDuffColorFilter;

    return v1

    .line 110
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۙܺۡ;->ۙ:Landroid/graphics/PorterDuffColorFilter;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    const/4 v0, 0x0

    .line 111
    iput-object v0, p0, Ll/ۙܺۡ;->ۙ:Landroid/graphics/PorterDuffColorFilter;

    return v1
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 136
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 137
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 141
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 142
    iget v2, v0, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    iget v3, v0, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 143
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-virtual {p0, p1, v2, v0}, Ll/ۙܺۡ;->֫(Landroid/graphics/Canvas;II)V

    .line 144
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    .line 160
    iget-object v0, p0, Ll/ۙܺۡ;->᩶:Ll/᩶ܺۡ;

    return-object v0
.end method

.method public isStateful()Z
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۙܺۡ;->ۗ:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onStateChange([I)Z
    .locals 0

    .line 104
    invoke-direct {p0}, Ll/ۙܺۡ;->֫()Z

    move-result p1

    return p1
.end method

.method public setAlpha(I)V
    .locals 1

    .line 44
    iget v0, p0, Ll/ۙܺۡ;->᩸:I

    if-eq v0, p1, :cond_0

    .line 45
    iput p1, p0, Ll/ۙܺۡ;->᩸:I

    .line 46
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 63
    iput-object p1, p0, Ll/ۙܺۡ;->᩹:Landroid/graphics/ColorFilter;

    .line 64
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setTint(I)V
    .locals 0

    .line 72
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙܺۡ;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 80
    iput-object p1, p0, Ll/ۙܺۡ;->ۗ:Landroid/content/res/ColorStateList;

    .line 81
    invoke-direct {p0}, Ll/ۙܺۡ;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 82
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 91
    iput-object p1, p0, Ll/ۙܺۡ;->۬:Landroid/graphics/PorterDuff$Mode;

    .line 92
    invoke-direct {p0}, Ll/ۙܺۡ;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 93
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public abstract ֫(Landroid/graphics/Canvas;II)V
.end method
