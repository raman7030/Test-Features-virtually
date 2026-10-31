.class public abstract Ll/᩷۬֡;
.super Ll/ۚ۬֡;
.source "K56X"

# interfaces
.implements Ll/֡֫ۚ;


# virtual methods
.method public getSignature()Ljava/lang/String;
    .locals 6

    .line 50
    invoke-interface {p0}, Ll/֡֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷֫ۚ;

    .line 51
    invoke-interface {v1}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Ldalvik/annotation/Signature;"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_2

    goto :goto_3

    .line 61
    :cond_2
    invoke-interface {v1}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢ֫ۚ;

    .line 62
    invoke-interface {v1}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "value"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 63
    invoke-interface {v1}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v0

    .line 64
    invoke-interface {v0}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    const/16 v3, 0x1c

    if-eq v1, v3, :cond_4

    goto :goto_3

    .line 67
    :cond_4
    check-cast v0, Ll/᩶ܽۚ;

    goto :goto_1

    :cond_5
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_6

    goto :goto_3

    .line 75
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    invoke-interface {v0}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤܽۚ;

    .line 77
    invoke-interface {v3}, Ll/ۤܽۚ;->ۖ()I

    move-result v4

    const/16 v5, 0x17

    if-eq v4, v5, :cond_7

    :goto_3
    return-object v2

    .line 80
    :cond_7
    check-cast v3, Ll/ܿᩳۚ;

    invoke-interface {v3}, Ll/ܿᩳۚ;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 82
    :cond_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
