.class public Ll/ۨ᩸ۚ;
.super Ll/ۚ᩸ۚ;
.source "4BJX"


# virtual methods
.method public final ֫(Ll/᩶֡ۚ;)I
    .locals 5

    .line 556
    invoke-virtual {p1}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 558
    :cond_0
    invoke-virtual {p1}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶֡ۚ;->۫()Ll/֫᩸ۚ;

    move-result-object v0

    .line 559
    invoke-virtual {p1}, Ll/᩶֡ۚ;->ۛ()I

    move-result v2

    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 560
    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶֡ۚ;

    invoke-virtual {v3}, Ll/᩶֡ۚ;->ۜ֫()Ll/ܽ֨ۚ;

    move-result-object v3

    invoke-virtual {p1}, Ll/᩶֡ۚ;->ۜ֫()Ll/ܽ֨ۚ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ܽ֨ۚ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "nth-last-of-type"

    return-object v0
.end method
