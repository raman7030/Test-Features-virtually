.class public Ll/᩹᩹۠;
.super Ll/۠᩹۠;
.source "S403"


# annotations
.annotation runtime Ll/ۙ᩸۠;
    value = .enum Ll/ۗ᩸۠;->ܽ֫:Ll/ۗ᩸۠;
.end annotation


# virtual methods
.method public final ֫(Ljava/util/List;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 139
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩸۠;

    .line 140
    move-object v1, p0

    check-cast v1, Ll/ۢᩴ۠;

    .line 974
    move-object v2, p2

    check-cast v2, Ljava/util/Set;

    invoke-virtual {v1, v0, v2}, Ll/ۢᩴ۠;->֫(Ll/ۨ᩸۠;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ֫(Ll/ۙ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 797
    invoke-virtual {p1}, Ll/᩶֡֨;->ܺ()Ll/ۖܶ۠;

    move-result-object p1

    .line 239
    invoke-virtual {p0, p1, p2}, Ll/᩹᩹۠;->֫(Ljava/util/List;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
