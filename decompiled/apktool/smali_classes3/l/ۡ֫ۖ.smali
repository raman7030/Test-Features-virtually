.class public final Ll/ۡ֫ۖ;
.super Ljava/lang/Object;
.source "27RL"


# direct methods
.method public static ֫(Ll/۬ܺ֨;Ll/᩷֫ۖ;)Ll/ۢ֫ۖ;
    .locals 7

    .line 63
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 64
    invoke-static {v0, p0}, Ll/ۡ֫ۖ;->֫(Ljava/util/ArrayDeque;Ll/۬ܺ֨;)Ll/۬ܺ֨;

    move-result-object p0

    .line 66
    sget-object v1, Ll/᩷֫ۖ;->᩶:Ll/᩷֫ۖ;

    if-ne p1, v1, :cond_2

    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 92
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    .line 93
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚۚ۠;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    invoke-static {v5}, Ll/۟ۚ۠;->ۢ(Ll/ۚۚ۠;)I

    move-result v5

    if-ge v5, v1, :cond_0

    .line 95
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    add-int/lit8 v3, v3, 0x1

    neg-int v0, v3

    .line 96
    invoke-static {p1, v0}, Ljava/util/Collections;->rotate(Ljava/util/List;I)V

    move-object v0, p1

    goto :goto_1

    :cond_0
    move v3, v4

    move v1, v5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 71
    :cond_2
    :goto_1
    new-instance p1, Ll/ۢ֫ۖ;

    invoke-static {v0}, Ll/ܳ۬ܺ;->֫(Ljava/lang/Iterable;)Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Ll/ۢ֫ۖ;-><init>(Ll/۬ܺ֨;Ll/ܳ۬ܺ;)V

    return-object p1
.end method

.method public static ֫(Ljava/util/ArrayDeque;Ll/۬ܺ֨;)Ll/۬ܺ֨;
    .locals 3

    .line 115
    sget-object v0, Ll/ۜ֫ۖ;->֫:[I

    invoke-interface {p1}, Ll/۬ܺ֨;->֫()Ll/ۗܺ֨;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 119
    :cond_0
    move-object v0, p1

    check-cast v0, Ll/ۨۢ֨;

    .line 120
    invoke-interface {v0}, Ll/ۨۢ֨;->᩹()Ll/۫᩵۠;

    move-result-object v1

    invoke-interface {v1}, Ll/۬ܺ֨;->֫()Ll/ۗܺ֨;

    move-result-object v1

    sget-object v2, Ll/ۗܺ֨;->ۛ:Ll/ۗܺ֨;

    if-eq v1, v2, :cond_1

    :goto_0
    return-object p1

    .line 123
    :cond_1
    invoke-interface {v0}, Ll/ۨۢ֨;->᩹()Ll/۫᩵۠;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ۡ֫ۖ;->֫(Ljava/util/ArrayDeque;Ll/۬ܺ֨;)Ll/۬ܺ֨;

    move-result-object p1

    .line 124
    invoke-interface {v0}, Ll/ۨۢ֨;->getAnnotations()Ll/ۖܶ۠;

    move-result-object v0

    invoke-static {v0}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    return-object p1

    .line 117
    :cond_2
    check-cast p1, Ll/۟ۢ֨;

    invoke-interface {p1}, Ll/۟ۢ֨;->getType()Ll/۬ܺ֨;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ۡ֫ۖ;->֫(Ljava/util/ArrayDeque;Ll/۬ܺ֨;)Ll/۬ܺ֨;

    move-result-object p0

    return-object p0
.end method
