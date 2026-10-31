.class public final Ll/ᩴ۬ۘ;
.super Ljava/lang/Object;
.source "98WG"


# direct methods
.method public static ֫(Ll/ܶ۬ۘ;)Ljava/lang/String;
    .locals 2

    .line 35
    move-object v0, p0

    check-cast v0, Ll/᩶۬ۘ;

    .line 26
    iget-object v0, v0, Ll/᩶۬ۘ;->ܽ:Ljava/lang/String;

    const-string v1, "br"

    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p0, "\n"

    return-object p0

    :cond_0
    const-string v1, "img"

    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 40
    invoke-interface {p0}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object p0

    const-string v0, "alt"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_2

    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-object p0

    :cond_2
    :goto_0
    const-string p0, "\ufffc"

    return-object p0

    :cond_3
    const-string p0, "iframe"

    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "\u00a0"

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method
