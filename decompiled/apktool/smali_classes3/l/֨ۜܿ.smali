.class public final Ll/֨ۜܿ;
.super Ll/᩸᩵ᩴ;
.source "5ATX"


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 6

    .line 149
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ll/᩸᩵ᩴ;->values()Ll/᩶֡ᩴ;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 150
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 151
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, ""

    return-object v0

    .line 154
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_1

    .line 155
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚۜܿ;

    invoke-virtual {v0}, Ll/ۚۜܿ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 159
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "(?:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚۜܿ;

    .line 161
    invoke-virtual {v4}, Ll/ۚۜܿ;->֫()Ljava/lang/String;

    move-result-object v4

    .line 162
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    const/16 v5, 0x7c

    .line 168
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    :goto_1
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_4
    if-eqz v2, :cond_5

    const-string v0, ")?"

    goto :goto_2

    :cond_5
    const-string v0, ")"

    .line 173
    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
