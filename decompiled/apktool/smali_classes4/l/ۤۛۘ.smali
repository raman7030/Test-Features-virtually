.class public final Ll/ۤۛۘ;
.super Ll/᩺ۛۘ;
.source "G8XL"


# virtual methods
.method public final ֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;Ll/ܶ۬ۘ;)Ljava/lang/Object;
    .locals 2

    .line 23
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object p3

    const-string v0, "href"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    .line 24
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 25
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->ܿ()Ll/۠᩶ۘ;

    move-result-object v0

    const-class v1, Ll/ۖۚ֡;

    invoke-interface {v0, v1}, Ll/۠᩶ۘ;->֫(Ljava/lang/Class;)Ll/֫ۙۘ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 28
    sget-object v1, Ll/ۙۙۘ;->ᩳ:Ll/ۨ᩶ۘ;

    invoke-virtual {v1, p2, p3}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 33
    invoke-interface {v0, p1, p2}, Ll/֫ۙۘ;->֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 1

    const-string v0, "a"

    .line 42
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
