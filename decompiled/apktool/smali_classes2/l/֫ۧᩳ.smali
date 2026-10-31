.class public final Ll/֫ۧᩳ;
.super Ljava/lang/Object;
.source "150C"


# direct methods
.method public static ֫()Ljava/util/List;
    .locals 4

    .line 16
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "dictionary"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Ll/᩺᩵ۡ;->ܺ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const v1, 0x7f120233

    .line 28
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 413
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 29
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ܰ֫ᩳ;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ܰ֫ᩳ;-><init>(I)V

    .line 30
    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ۧۨ᩷;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ll/ۧۨ᩷;-><init>(I)V

    .line 31
    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/۟֫ᩳ;

    invoke-direct {v2, v1}, Ll/۟֫ᩳ;-><init>(Ljava/lang/String;)V

    .line 32
    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 41
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 42
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    return-object v0

    .line 45
    :cond_1
    invoke-static {v1}, Ll/֫ۧᩳ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۗ()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 49
    :cond_2
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 47
    :cond_3
    :goto_0
    new-instance v0, Ll/᩶֫ᩳ;

    invoke-direct {v0, v1}, Ll/᩶֫ᩳ;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 26
    :cond_4
    :goto_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 2

    .line 16
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "dictionary"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".mtd"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method
