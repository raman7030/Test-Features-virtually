.class public final Ll/ᩳ۟ܿ;
.super Ljava/lang/Object;
.source "V717"


# direct methods
.method public static ֫(Ll/ۜܰܿ;)Z
    .locals 1

    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    .line 110
    instance-of v0, p0, Ll/ۗܺ᩷;

    if-eqz v0, :cond_1

    .line 109
    check-cast p0, Ll/ۗܺ᩷;

    .line 110
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
