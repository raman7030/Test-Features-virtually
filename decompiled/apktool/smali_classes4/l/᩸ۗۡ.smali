.class public final Ll/᩸ۗۡ;
.super Ljava/lang/Object;
.source "N5A8"


# direct methods
.method public static ֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 64
    invoke-static {}, Ll/֫ۘ;->֫()Ll/֫ۘ;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ll/֫ۘ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    if-nez p0, :cond_0

    const-string p0, ""

    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 21
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    .line 25
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    .line 26
    invoke-static {p0}, Ll/᩸ۗۡ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_2
    return-object v1
.end method

.method public static ֫(I)Z
    .locals 1

    const/16 v0, 0x400

    if-lt p0, v0, :cond_0

    const v0, 0xffff

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
