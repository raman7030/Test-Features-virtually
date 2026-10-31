.class public final Ll/ۙܺ;
.super Ll/֡᩻;
.source "J5NH"


# instance fields
.field public ᩸:Z


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 393
    invoke-direct {p0, p1}, Ll/֡᩻;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x1

    .line 394
    iput-boolean p1, p0, Ll/ۙܺ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 411
    iget-boolean v0, p0, Ll/ۙܺ;->᩸:Z

    if-eqz v0, :cond_0

    .line 412
    invoke-super {p0, p1}, Ll/֡᩻;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public final setHotspot(FF)V
    .locals 1

    .line 418
    iget-boolean v0, p0, Ll/ۙܺ;->᩸:Z

    if-eqz v0, :cond_0

    .line 419
    invoke-super {p0, p1, p2}, Ll/֡᩻;->setHotspot(FF)V

    :cond_0
    return-void
.end method

.method public final setHotspotBounds(IIII)V
    .locals 1

    .line 425
    iget-boolean v0, p0, Ll/ۙܺ;->᩸:Z

    if-eqz v0, :cond_0

    .line 426
    invoke-super {p0, p1, p2, p3, p4}, Ll/֡᩻;->setHotspotBounds(IIII)V

    :cond_0
    return-void
.end method

.method public final setState([I)Z
    .locals 1

    .line 403
    iget-boolean v0, p0, Ll/ۙܺ;->᩸:Z

    if-eqz v0, :cond_0

    .line 404
    invoke-super {p0, p1}, Ll/֡᩻;->setState([I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final setVisible(ZZ)Z
    .locals 1

    .line 432
    iget-boolean v0, p0, Ll/ۙܺ;->᩸:Z

    if-eqz v0, :cond_0

    .line 433
    invoke-super {p0, p1, p2}, Ll/֡᩻;->setVisible(ZZ)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Z)V
    .locals 0

    .line 398
    iput-boolean p1, p0, Ll/ۙܺ;->᩸:Z

    return-void
.end method
