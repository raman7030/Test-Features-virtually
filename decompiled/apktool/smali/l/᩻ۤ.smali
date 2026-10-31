.class public final Ll/᩻ۤ;
.super Ljava/lang/Object;
.source "M5X0"


# direct methods
.method public static ֫(Landroid/content/Context;Ll/ۨ۫;IZILandroid/os/Handler;Ll/᩻۬;)Landroid/graphics/Typeface;
    .locals 1

    .line 160
    new-instance v0, Ll/ܶ۫;

    invoke-direct {v0, p6, p5}, Ll/ܶ۫;-><init>(Ll/᩻۬;Landroid/os/Handler;)V

    if-eqz p3, :cond_0

    .line 163
    invoke-static {p0, p1, v0, p2, p4}, Ll/ܽۤ;->֫(Landroid/content/Context;Ll/ۨ۫;Ll/ܶ۫;II)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    .line 166
    :cond_0
    invoke-static {p0, p1, p2, v0}, Ll/ܽۤ;->֫(Landroid/content/Context;Ll/ۨ۫;ILl/ܶ۫;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Ll/ۨ۫;)Ll/ᩳۤ;
    .locals 0

    .line 100
    invoke-static {p0, p1}, Ll/ۛ۫;->֫(Landroid/content/Context;Ll/ۨ۫;)Ll/ᩳۤ;

    move-result-object p0

    return-object p0
.end method
