.class public final Ll/ۖۛ᩷;
.super Ljava/lang/Object;
.source "X77O"


# direct methods
.method public static ֫()Ljava/lang/String;
    .locals 3

    .line 20
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "psri"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "code"

    goto :goto_0

    :cond_0
    const-string v0, "ps"

    :goto_0
    const-string v1, "_r"

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ()Ljava/lang/String;
    .locals 3

    .line 20
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "psri"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "code"

    goto :goto_0

    :cond_0
    const-string v0, "ps"

    :goto_0
    const-string v1, "_s"

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
