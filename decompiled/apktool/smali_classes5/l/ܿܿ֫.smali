.class public final Ll/ܿܿ֫;
.super Ll/ᩳܿ֫;
.source "1AMY"


# virtual methods
.method public final ֫(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 177
    instance-of v0, p1, Landroid/text/PrecomputedText;

    if-nez v0, :cond_1

    instance-of p1, p1, Ll/۠ۤ;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
