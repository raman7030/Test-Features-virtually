.class public final Ll/᩸ۛۧ;
.super Ll/֡ۛۧ;
.source "G5Y2"


# virtual methods
.method public final getPath(FFFF)Landroid/graphics/Path;
    .locals 1

    .line 185
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 186
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 187
    invoke-virtual {v0, p3, p4}, Landroid/graphics/Path;->lineTo(FF)V

    return-object v0
.end method
