.class public abstract Ll/ܿ᩷ܺ;
.super Ll/ۛۜܺ;
.source "8BAS"


# virtual methods
.method public final ֫(Ll/ۖۜܺ;)I
    .locals 1

    .line 107
    check-cast p1, Ll/ܺۜܺ;

    .line 108
    invoke-virtual {p1}, Ll/ܺۜܺ;->ܿ()I

    move-result v0

    invoke-virtual {p1}, Ll/ۖۜܺ;->ۧ()I

    move-result p1

    mul-int p1, p1, v0

    .line 110
    invoke-virtual {p0, p1}, Ll/ۛۜܺ;->֫(I)I

    move-result p1

    return p1
.end method

.method public abstract ۢ()V
.end method

.method public final ۧ(Ll/ᩳᩴܺ;)V
    .locals 4

    .line 89
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۧ()Ll/֫ۜܺ;

    move-result-object v0

    .line 90
    invoke-virtual {p0}, Ll/ۛۜܺ;->֫()I

    move-result v1

    .line 92
    invoke-virtual {p0}, Ll/ۛۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۜܺ;

    .line 93
    invoke-virtual {v3, v0, p1}, Ll/ۖۜܺ;->֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    .line 94
    invoke-virtual {p1, v1}, Ll/ᩳᩴܺ;->֫(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܳ()V
    .locals 3

    .line 75
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۧ()Ll/֫ۜܺ;

    move-result-object v0

    .line 77
    invoke-virtual {p0}, Ll/ܿ᩷ܺ;->ۢ()V

    .line 79
    invoke-virtual {p0}, Ll/ۛۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۜܺ;

    .line 80
    invoke-virtual {v2, v0}, Ll/ۖۜܺ;->֫(Ll/֫ۜܺ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩷()I
    .locals 2

    .line 48
    invoke-virtual {p0}, Ll/ۛۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v0

    .line 49
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 56
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۜܺ;

    invoke-virtual {v0}, Ll/ۖۜܺ;->ۧ()I

    move-result v0

    mul-int v0, v0, v1

    return v0
.end method
