.class public final Ll/۠᩷᩵;
.super Ll/᩹᩷᩵;
.source "C9Z9"


# instance fields
.field public final ۘ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۛۢ᩵;ZILjava/lang/String;)V
    .locals 6

    .line 469
    sget-object v2, Ll/ۨۢ᩵;->᩺֫:Ll/ۨۢ᩵;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Ll/᩹᩷᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZI)V

    .line 470
    iput-object p5, p0, Ll/۠᩷᩵;->ۘ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۡۢ᩵;)Ll/ܶۢ᩵;
    .locals 4

    const/4 v0, 0x0

    .line 554
    invoke-virtual {p0, v0}, Ll/۠᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object v0

    .line 555
    invoke-virtual {v0, p1}, Ll/᩶ۢ᩵;->֫(Ll/ۡۢ᩵;)V

    .line 556
    invoke-virtual {v0}, Ll/᩶ۢ᩵;->֨()Ljava/lang/String;

    move-result-object v1

    .line 519
    iget-object v2, p0, Ll/۠᩷᩵;->ۘ:Ljava/lang/String;

    .line 557
    invoke-static {v1, v2}, Ll/ۡۢ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 558
    new-instance v3, Ll/ܶۢ᩵;

    invoke-direct {v3, p1, v1, v2, v0}, Ll/ܶۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V

    return-object v3
.end method

.method public final ֫(Z)Ll/᩶ۢ᩵;
    .locals 10

    .line 533
    invoke-virtual {p0}, Ll/ܰۜ᩵;->ۜ()Z

    move-result v0

    iget-object v1, p0, Ll/۠᩷᩵;->ۘ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 535
    invoke-static {v1}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v3

    .line 536
    new-instance v0, Ll/᩶ۢ᩵;

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    move v7, p1

    invoke-direct/range {v2 .. v8}, Ll/᩶ۢ᩵;-><init>(Ljava/util/Map;IIIZ[B)V

    return-object v0

    .line 194
    :cond_0
    sget-object v0, Ll/۫ۜ᩵;->᩶:Ll/۫ۜ᩵;

    iget-object v2, p0, Ll/ܰۜ᩵;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "in-addr.arpa"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 198
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "ip6.arpa"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 539
    :cond_1
    invoke-virtual {p0}, Ll/ܰۜ᩵;->᩻()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 541
    new-instance v0, Ll/᩶ۢ᩵;

    .line 168
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v0

    move v8, p1

    .line 541
    invoke-direct/range {v3 .. v9}, Ll/᩶ۢ᩵;-><init>(Ljava/util/Map;IIIZ[B)V

    return-object v0

    .line 543
    :cond_2
    invoke-static {v1}, Ll/ۙۢ᩵;->֫(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 544
    sget-object v3, Ll/۫ۜ᩵;->۬:Ll/۫ۜ᩵;

    .line 168
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 544
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    new-instance v2, Ll/᩶ۢ᩵;

    invoke-direct {v2, v1, v0, p1}, Ll/᩶ۢ᩵;-><init>(Ljava/lang/String;Ljava/util/HashMap;Z)V

    return-object v2

    .line 538
    :cond_3
    :goto_0
    new-instance v0, Ll/᩶ۢ᩵;

    .line 168
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v0

    move v8, p1

    .line 538
    invoke-direct/range {v3 .. v9}, Ll/᩶ۢ᩵;-><init>(Ljava/util/Map;IIIZ[B)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 567
    invoke-super {p0, p1}, Ll/᩹᩷᩵;->֫(Ljava/lang/StringBuilder;)V

    const-string v0, " alias: \'"

    .line 568
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    iget-object v0, p0, Ll/۠᩷᩵;->ۘ:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "null"

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    .line 570
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ll/ܿ᩷᩵;)V
    .locals 1

    .line 484
    iget-object v0, p0, Ll/۠᩷᩵;->ۘ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ܿ᩷᩵;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ܰۜ᩵;)Z
    .locals 1

    .line 479
    invoke-super {p0, p1}, Ll/ܰۜ᩵;->֫(Ll/ܰۜ᩵;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Ll/۠᩷᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/۠᩷᩵;

    invoke-virtual {p0, p1}, Ll/۠᩷᩵;->ܽ(Ll/᩹᩷᩵;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ۡۢ᩵;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/ۡۢ᩵;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/᩹᩷᩵;)Z
    .locals 2

    .line 489
    instance-of v0, p1, Ll/۠᩷᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 492
    :cond_0
    check-cast p1, Ll/۠᩷᩵;

    iget-object p1, p1, Ll/۠᩷᩵;->ۘ:Ljava/lang/String;

    .line 493
    iget-object v0, p0, Ll/۠᩷᩵;->ۘ:Ljava/lang/String;

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    return v1

    .line 496
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ᩴ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵()Ljava/lang/String;
    .locals 1

    .line 519
    iget-object v0, p0, Ll/۠᩷᩵;->ۘ:Ljava/lang/String;

    return-object v0
.end method
