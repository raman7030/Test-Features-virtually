.class public final Ll/۫ۗ;
.super Ljava/lang/Object;
.source "C1AZ"


# direct methods
.method public static ֫(ILjava/lang/Object;)Landroid/graphics/ColorFilter;
    .locals 1

    .line 70
    new-instance v0, Landroid/graphics/BlendModeColorFilter;

    check-cast p1, Landroid/graphics/BlendMode;

    invoke-direct {v0, p0, p1}, Landroid/graphics/BlendModeColorFilter;-><init>(ILandroid/graphics/BlendMode;)V

    check-cast v0, Landroid/graphics/ColorFilter;

    return-object v0
.end method
