.class public final Ll/ۗۛۘ;
.super Ll/᩺ۛۘ;
.source "78YS"


# virtual methods
.method public final ֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;Ll/ܶ۬ۘ;)Ljava/lang/Object;
    .locals 2

    .line 26
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->ܿ()Ll/۠᩶ۘ;

    move-result-object v0

    const-class v1, Ll/ۜۚ֡;

    invoke-interface {v0, v1}, Ll/۠᩶ۘ;->֫(Ljava/lang/Class;)Ll/֫ۙۘ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    .line 33
    :try_start_0
    invoke-interface {p3}, Ll/ܶ۬ۘ;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p3, 0x0

    :goto_0
    if-lt p3, v1, :cond_2

    const/4 v1, 0x6

    if-le p3, v1, :cond_1

    goto :goto_1

    .line 43
    :cond_1
    sget-object v1, Ll/ۙۙۘ;->ܽ:Ll/ۨ᩶ۘ;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v1, p2, p3}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 45
    invoke-interface {v0, p1, p2}, Ll/֫ۙۘ;->֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 6

    const-string v4, "h5"

    const-string v5, "h6"

    const-string v0, "h1"

    const-string v1, "h2"

    const-string v2, "h3"

    const-string v3, "h4"

    .line 51
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
