.class public final Ll/᩹ᩳ;
.super Ll/᩸ᩳ;
.source "OB8N"


# virtual methods
.method public final ֫(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 1

    .line 136
    check-cast p2, [Ljava/lang/String;

    const-string p1, "input"

    .line 0
    invoke-static {p2, p1}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    new-instance p1, Landroid/content/Intent;

    const-string v0, "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "androidx.activity.result.contract.extra.PERMISSIONS"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "Intent(ACTION_REQUEST_PE\u2026EXTRA_PERMISSIONS, input)"

    invoke-static {p1, p2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final ֫(Landroid/content/Intent;I)Ljava/lang/Object;
    .locals 5

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 203
    invoke-static {}, Ll/֡ܶ᩵;->֫()Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    .line 204
    invoke-static {}, Ll/֡ܶ᩵;->֫()Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p2, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 205
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    const-string v0, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    .line 206
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object p1

    if-eqz p1, :cond_8

    if-nez p2, :cond_2

    goto :goto_4

    .line 968
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 969
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    aget v4, p1, v3

    if-nez v4, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 209
    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 970
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 4354
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4364
    array-length v1, p2

    :goto_2
    if-ge v2, v1, :cond_6

    aget-object v3, p2, v2

    if-eqz v3, :cond_5

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 4016
    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 4017
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 4018
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1}, Ll/֫ܶ᩵;->֫(Ljava/lang/Iterable;)I

    move-result p1

    invoke-static {v0}, Ll/֫ܶ᩵;->֫(Ljava/lang/Iterable;)I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 4019
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 4020
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 44
    new-instance v3, Ll/ܺ۠᩵;

    invoke-direct {v3, p1, v0}, Ll/ܺ۠᩵;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4020
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 211
    :cond_7
    invoke-static {v2}, Ll/֡ܶ᩵;->֫(Ljava/util/ArrayList;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    .line 207
    :cond_8
    :goto_4
    invoke-static {}, Ll/֡ܶ᩵;->֫()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Landroid/content/Context;Ljava/lang/Object;)Ll/ܶᩳ;
    .locals 5

    .line 136
    check-cast p2, [Ljava/lang/String;

    const-string v0, "input"

    .line 0
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    array-length v0, p2

    if-nez v0, :cond_0

    .line 186
    new-instance p1, Ll/ܶᩳ;

    invoke-static {}, Ll/֡ܶ᩵;->֫()Ljava/util/Map;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ܶᩳ;-><init>(Ljava/lang/Object;)V

    return-object p1

    .line 960
    :cond_0
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p2, v2

    .line 189
    invoke-static {p1, v3}, Ll/֨ۙ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1

    .line 962
    :cond_2
    array-length p1, p2

    invoke-static {p1}, Ll/֡ܶ᩵;->֫(I)I

    move-result p1

    const/16 v0, 0x10

    if-ge p1, v0, :cond_3

    const/16 p1, 0x10

    .line 963
    :cond_3
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 964
    array-length p1, p2

    :goto_1
    if-ge v1, p1, :cond_4

    aget-object v2, p2, v1

    .line 195
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    new-instance v4, Ll/ܺ۠᩵;

    invoke-direct {v4, v2, v3}, Ll/ܺ۠᩵;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9359
    invoke-virtual {v4}, Ll/ܺ۠᩵;->ܽ()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4}, Ll/ܺ۠᩵;->ᩳ()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 195
    :cond_4
    new-instance p1, Ll/ܶᩳ;

    invoke-direct {p1, v0}, Ll/ܶᩳ;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
