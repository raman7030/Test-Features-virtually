.class public final Ll/֡۟ܳ;
.super Ll/֫ۜܳ;
.source "K17Q"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 7

    const-string v0, "local"

    .line 18
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/֫ۧ֨;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/֫ۧ֨;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩵۟ܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 21
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    .line 22
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    const-string v6, ".apk"

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    .line 28
    :goto_1
    array-length v3, v0

    if-ne v3, v4, :cond_2

    .line 29
    aget-object v3, v0, v2

    new-array v4, v2, [Ljava/lang/String;

    invoke-static {v3, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-static {v3}, Ll/᩹ۨۡ;->֫(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 31
    :goto_2
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object p1

    invoke-static {p1, v0, v3, v1, v2}, Ll/ܶۗܽ;->֫(Ll/ܽۢܳ;[Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void
.end method
