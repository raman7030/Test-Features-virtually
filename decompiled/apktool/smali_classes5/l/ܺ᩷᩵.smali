.class public final Ll/ܺ᩷᩵;
.super Ll/ᩴ᩷᩵;
.source "7A22"


# virtual methods
.method public final ֫(Ll/ۡۢ᩵;Ljava/util/HashSet;)V
    .locals 8

    .line 96
    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    check-cast v0, Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۜ᩵;

    .line 97
    check-cast v1, Ll/᩶ۢ᩵;

    invoke-virtual {p0, p1, p2, v1}, Ll/ᩴ᩷᩵;->֫(Ll/ۡۢ᩵;Ljava/util/HashSet;Ll/᩶ۢ᩵;)V

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p0}, Ll/ܰۜ᩵;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 100
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۗ()Ll/ۧۤᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۢ᩵;

    .line 101
    new-instance v7, Ll/۠᩷᩵;

    sget-object v3, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    sget v5, Ll/۬ۢ᩵;->ۧ:I

    invoke-virtual {v0}, Ll/ۢۢ᩵;->֫()Ljava/lang/String;

    move-result-object v6

    const-string v2, "_services._dns-sd._udp.local."

    const/4 v4, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ll/۠᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZILjava/lang/String;)V

    invoke-virtual {p2, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 194
    :cond_1
    sget-object v0, Ll/۫ۜ᩵;->᩶:Ll/۫ۜ᩵;

    iget-object v1, p0, Ll/ܰۜ᩵;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "in-addr.arpa"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    const-string v4, "ip6.arpa"

    if-nez v2, :cond_3

    .line 198
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    .line 117
    :cond_2
    invoke-virtual {p0}, Ll/ܰۜ᩵;->᩻()Z

    return-void

    .line 168
    :cond_3
    :goto_2
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 104
    sget-object v5, Ll/۫ۜ᩵;->ۙ:Ll/۫ۜ᩵;

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_6

    .line 105
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_6

    .line 106
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v5

    .line 138
    iget-object v5, v5, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    if-eqz v5, :cond_4

    .line 107
    invoke-virtual {v5}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_4
    const-string v5, ""

    .line 108
    :goto_3
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 194
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 110
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v2

    sget-object v3, Ll/ۨۢ᩵;->ۙ:Ll/ۨۢ᩵;

    sget v5, Ll/۬ۢ᩵;->ۧ:I

    invoke-virtual {v2, v3, v5}, Ll/۟᩷᩵;->֫(Ll/ۨۢ᩵;I)Ll/۠᩷᩵;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 198
    :cond_5
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 113
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object p1

    sget-object v0, Ll/ۨۢ᩵;->۬:Ll/ۨۢ᩵;

    sget v1, Ll/۬ۢ᩵;->ۧ:I

    invoke-virtual {p1, v0, v1}, Ll/۟᩷᩵;->֫(Ll/ۨۢ᩵;I)Ll/۠᩷᩵;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method
