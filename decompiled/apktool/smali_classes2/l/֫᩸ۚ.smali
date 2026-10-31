.class public final Ll/֫᩸ۚ;
.super Ljava/util/ArrayList;
.source "H403"


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 3

    .line 53
    new-instance v0, Ll/֫᩸ۚ;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶֡ۚ;

    .line 56
    invoke-virtual {v2}, Ll/᩶֡ۚ;->clone()Ll/᩶֡ۚ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 276
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 277
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶֡ۚ;

    .line 278
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\n"

    .line 279
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    :cond_0
    invoke-virtual {v2}, Ll/ۨ֡ۚ;->ۖ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 282
    :cond_1
    invoke-static {v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
