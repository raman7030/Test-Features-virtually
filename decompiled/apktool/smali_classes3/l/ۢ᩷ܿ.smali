.class public final Ll/ۢ᩷ܿ;
.super Ljava/lang/Object;
.source "UAR2"


# direct methods
.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶۜܿ;)I
    .locals 2

    .line 86
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 88
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-virtual {p1}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    .line 87
    invoke-static {p0, v1}, Ll/ۜ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܺ֡ܿ;

    move-result-object p0

    .line 88
    invoke-virtual {p0}, Ll/ܺ֡ܿ;->getName()Ljava/lang/String;

    move-result-object p0

    .line 87
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x2

    return p0

    .line 91
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".cache"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ֫()Ljava/util/ArrayList;
    .locals 1

    .line 96
    invoke-static {}, Ll/ۜ᩷ܿ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶۜܿ;
    .locals 3

    .line 100
    invoke-static {p0}, Ll/᩵ۖܿ;->֫(Ljava/lang/String;)V

    .line 101
    new-instance v0, Ll/ܽ᩷ܿ;

    invoke-direct {v0, p1}, Ll/ܽ᩷ܿ;-><init>(Ljava/lang/String;)V

    .line 102
    invoke-static {p1, p0}, Ll/᩵ۖܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 103
    new-instance p1, Ll/ܳۨۢ;

    new-instance v1, Ll/ۨܿ֡;

    .line 23
    new-instance v2, Ll/֡᩹ᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-direct {v1, p0, v2}, Ll/ۨܿ֡;-><init>(Ljava/lang/CharSequence;Ljava/lang/Runnable;)V

    .line 103
    invoke-direct {p1, v1}, Ll/ܳۨۢ;-><init>(Ll/ۨܿ֡;)V

    .line 104
    invoke-virtual {p1, v0}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 105
    new-instance v1, Ll/֫ܳ֡;

    invoke-direct {v1, p1}, Ll/֫ܳ֡;-><init>(Ll/᩻ܳ֡;)V

    .line 106
    new-instance p1, Ll/ܳܰۢ;

    invoke-direct {p1, v1}, Ll/ܳܰۢ;-><init>(Ll/֫ܳ֡;)V

    .line 107
    invoke-virtual {p1, v0}, Ll/ᩴܳ֡;->֫(Ll/ۛܿ֡;)V

    .line 108
    invoke-virtual {p1}, Ll/ܳܰۢ;->ۜ֫()Ll/۫ۨۢ;

    move-result-object p1

    .line 109
    new-instance v0, Ll/ܶۜܿ;

    invoke-direct {v0, p1}, Ll/ܶۜܿ;-><init>(Ll/۫ۨۢ;)V

    .line 110
    invoke-virtual {v0}, Ll/ܶۜܿ;->ۧ()V

    .line 113
    invoke-static {v0}, Ll/᩺ܺܿ;->ۧ(Ll/ܶۜܿ;)Ll/᩺ܺܿ;

    .line 114
    invoke-static {v0, p0}, Ll/ۜ᩷ܿ;->֫(Ll/ܶۜܿ;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 120
    invoke-static {p0}, Ll/ۜ᩷ܿ;->֫(Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public static ֫(Ll/ܶۜܿ;)Z
    .locals 0

    .line 125
    invoke-static {p0}, Ll/ۜ᩷ܿ;->ܽ(Ll/ܶۜܿ;)Z

    move-result p0

    return p0
.end method

.method public static ۧ()Ljava/util/HashMap;
    .locals 12

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 26
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 27
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 28
    sget-object v3, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v4, "syntax/custom"

    invoke-virtual {v3, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    const/4 v4, 0x1

    .line 413
    invoke-virtual {v3, v4}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v3

    .line 29
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 30
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v7, ".cache"

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܶ᩵ܿ;

    .line 31
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 32
    sget v8, Ll/ۜ᩷ܿ;->֫:I

    .line 291
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    .line 292
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    const/4 v9, 0x6

    .line 0
    invoke-static {v9, v7, v6}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 280
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 297
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object v8, v7

    :cond_2
    :goto_1
    if-eqz v8, :cond_0

    .line 34
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 38
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܶ᩵ܿ;

    .line 39
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_2

    .line 42
    :cond_5
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    .line 43
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_2

    .line 46
    :cond_6
    invoke-static {v5}, Ll/ۜ᩷ܿ;->ۧ(Ll/ܶ᩵ܿ;)Ll/ܰۜܿ;

    move-result-object v6

    if-nez v6, :cond_7

    goto :goto_2

    .line 47
    :cond_7
    iget-object v8, v6, Ll/ܰۜܿ;->֫:Ljava/lang/String;

    if-eqz v8, :cond_8

    .line 51
    invoke-virtual {v2, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 52
    invoke-virtual {v0, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    invoke-virtual {v1, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 56
    :cond_8
    iget-object v6, v6, Ll/ܰۜܿ;->ۧ:Ll/ܶۜܿ;

    .line 57
    invoke-virtual {v6}, Ll/ܶۜܿ;->ۢ()Ljava/lang/String;

    move-result-object v8

    .line 280
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    .line 59
    invoke-virtual {v2, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    .line 60
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 302
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v9

    .line 303
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v10

    .line 302
    invoke-static {v10, v8}, Ll/ۜ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܺ֡ܿ;

    move-result-object v10

    .line 303
    invoke-virtual {v10}, Ll/ܺ֡ܿ;->getName()Ljava/lang/String;

    move-result-object v10

    .line 302
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 62
    :cond_9
    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܶۜܿ;

    .line 63
    invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܶ᩵ܿ;

    if-eqz v9, :cond_b

    .line 76
    invoke-static {v5, v6}, Ll/ۢ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܶۜܿ;)I

    move-result v11

    .line 77
    invoke-static {v10, v9}, Ll/ۢ᩷ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܶۜܿ;)I

    move-result v9

    if-eq v11, v9, :cond_a

    if-le v11, v9, :cond_4

    goto :goto_3

    .line 81
    :cond_a
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v9

    if-gez v9, :cond_4

    .line 65
    :cond_b
    :goto_3
    invoke-virtual {v0, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    invoke-virtual {v1, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    :cond_c
    return-object v0
.end method
