.class public Ll/᩺᩸ۚ;
.super Ll/ۚ᩸ۚ;
.source "4BJX"


# virtual methods
.method public final ֫(Ll/᩶֡ۚ;)I
    .locals 5

    .line 531
    invoke-virtual {p1}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 533
    :cond_0
    invoke-virtual {p1}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶֡ۚ;->۫()Ll/֫᩸ۚ;

    move-result-object v0

    .line 534
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶֡ۚ;

    .line 535
    invoke-virtual {v2}, Ll/᩶֡ۚ;->ۜ֫()Ll/ܽ֨ۚ;

    move-result-object v3

    invoke-virtual {p1}, Ll/᩶֡ۚ;->ۜ֫()Ll/ܽ֨ۚ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ܽ֨ۚ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v1, v1, 0x1

    :cond_2
    if-ne v2, p1, :cond_1

    :cond_3
    return v1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "nth-of-type"

    return-object v0
.end method
