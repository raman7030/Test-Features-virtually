.class public final Ll/۟᩸ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":only-of-type"

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 4

    .line 619
    invoke-virtual {p2}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 620
    instance-of v1, p1, Ll/֨֡ۚ;

    if-eqz v1, :cond_0

    goto :goto_1

    .line 623
    :cond_0
    invoke-virtual {p1}, Ll/᩶֡ۚ;->۫()Ll/֫᩸ۚ;

    move-result-object p1

    .line 624
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶֡ۚ;

    .line 625
    invoke-virtual {v2}, Ll/᩶֡ۚ;->ۜ֫()Ll/ܽ֨ۚ;

    move-result-object v2

    invoke-virtual {p2}, Ll/᩶֡ۚ;->ۜ֫()Ll/ܽ֨ۚ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ܽ֨ۚ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    if-ne v1, p1, :cond_3

    return p1

    :cond_3
    :goto_1
    return v0
.end method
