.class public final Ll/ᩳ֡ۢ;
.super Ljava/lang/Object;
.source "77BL"


# virtual methods
.method public final ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 9

    const-string v0, "path"

    .line 40
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    .line 38
    :cond_0
    invoke-static {v1}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 39
    sget-object v3, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    invoke-static {}, Ll/ܿۧ᩻;->ܽ()Z

    move-result v4

    invoke-virtual {v3, v1, v4}, Ll/ۖۧ᩻;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    new-array v4, v2, [Ljava/lang/String;

    invoke-static {v1, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 42
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    const v0, 0x7f120829

    new-array v1, v2, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 44
    :cond_1
    invoke-static {}, Ll/ܿۧ᩻;->ۧ()Z

    move-result v4

    if-nez v4, :cond_2

    .line 46
    new-instance v4, Ll/ܽ֡ۢ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v3, v4}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 48
    :cond_2
    invoke-static {v1}, Ll/ܺ᩵ۢ;->֫(Ljava/lang/String;)Ll/ۡ᩵ۢ;

    move-result-object v4

    if-nez v4, :cond_8

    const-string v4, "sortMethod"

    .line 50
    invoke-static {p1, v4}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "sortReverse"

    .line 51
    invoke-static {p1, v6}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez v5, :cond_3

    if-nez p1, :cond_3

    .line 31
    new-instance v4, Ll/ۡ᩵ۢ;

    invoke-direct {v4, v2, v2}, Ll/ۡ᩵ۢ;-><init>(IZ)V

    goto :goto_1

    :cond_3
    const/4 v7, 0x1

    const v8, 0x7f120827

    if-nez v5, :cond_4

    .line 56
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    aput-object v4, v0, v2

    .line 62
    invoke-static {v8, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_4
    if-nez p1, :cond_5

    .line 60
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    aput-object v6, v0, v2

    .line 62
    invoke-static {v8, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    :cond_5
    const v8, 0x7f120826

    .line 66
    :try_start_0
    invoke-static {v5}, Ll/ܺ᩵ۢ;->ۧ(Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v5, "true"

    .line 77
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v2, 0x1

    goto :goto_0

    :cond_6
    const-string v5, "false"

    .line 80
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz p1, :cond_7

    .line 77
    :goto_0
    new-instance p1, Ll/ۡ᩵ۢ;

    invoke-direct {p1, v4, v2}, Ll/ۡ᩵ۢ;-><init>(IZ)V

    move-object v4, p1

    goto :goto_1

    .line 83
    :cond_7
    :try_start_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid boolean"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p1

    throw p1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 74
    :catch_0
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    aput-object v6, v0, v2

    .line 62
    invoke-static {v8, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 68
    :catch_1
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v7, [Ljava/lang/Object;

    aput-object v4, v0, v2

    .line 62
    invoke-static {v8, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 80
    :cond_8
    :goto_1
    iget p1, v4, Ll/ۡ᩵ۢ;->֫:I

    iget-boolean v2, v4, Ll/ۡ᩵ۢ;->ۧ:Z

    invoke-static {v3, p1, v2}, Ll/۟۬ܳ;->֫(Ljava/util/ArrayList;IZ)V

    .line 82
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 84
    invoke-static {v3}, Ll/᩷᩵ۢ;->֫(Ll/ᩳۜܳ;)Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 87
    :cond_9
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 88
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "files"

    .line 89
    invoke-virtual {v2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    invoke-static {v2}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 35
    :cond_a
    :goto_3
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v0, 0x7f12073e

    new-array v1, v2, [Ljava/lang/Object;

    .line 62
    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method
