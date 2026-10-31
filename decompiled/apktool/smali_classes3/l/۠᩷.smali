.class public final Ll/۠᩷;
.super Landroid/graphics/drawable/Drawable;
.source "9649"


# instance fields
.field public final ֫:Ll/ܶ᩷;


# direct methods
.method public constructor <init>(Ll/ܶ᩷;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 33
    iput-object p1, p0, Ll/۠᩷;->֫:Ll/ܶ᩷;

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 38
    iget-object v0, p0, Ll/۠᩷;->֫:Ll/ܶ᩷;

    iget-boolean v1, v0, Ll/ܶ᩷;->ۗ:Z

    if-eqz v1, :cond_0

    .line 39
    iget-object v0, v0, Ll/ܶ᩷;->ۤ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 40
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 43
    :cond_0
    iget-object v1, v0, Ll/ܶ᩷;->᩹:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    .line 44
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 46
    :cond_1
    iget-object v1, v0, Ll/ܶ᩷;->ۛ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_2

    iget-boolean v0, v0, Ll/ܶ᩷;->۬:Z

    if-eqz v0, :cond_2

    .line 47
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_2
    return-void
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getOutline(Landroid/graphics/Outline;)V
    .locals 3

    .line 68
    iget-object v0, p0, Ll/۠᩷;->֫:Ll/ܶ᩷;

    iget-boolean v1, v0, Ll/ܶ᩷;->ۗ:Z

    iget-object v2, v0, Ll/ܶ᩷;->᩹:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 69
    iget-object v0, v0, Ll/ܶ᩷;->ۤ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 87
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V

    return-void

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V

    :cond_1
    return-void
.end method

.method public final setAlpha(I)V
    .locals 0

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method
