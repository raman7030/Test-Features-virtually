.class public final Ll/ܳ᩸۠;
.super Ll/۫᩸֨;
.source "C420"


# instance fields
.field public final synthetic ᩸:Ll/ۖ᩸۠;


# direct methods
.method public constructor <init>(Ll/ۖ᩸۠;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 459
    iput-object p1, p0, Ll/ܳ᩸۠;->᩸:Ll/ۖ᩸۠;

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 459
    check-cast p1, Ljava/lang/Void;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۚۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 459
    check-cast p2, Ljava/lang/Void;

    .line 491
    iget-object p1, p1, Ll/ۚۚ֨;->ۤ:Ll/ۙ֨֨;

    const/4 p2, 0x0

    .line 4980
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 459
    check-cast p2, Ljava/lang/Void;

    .line 555
    invoke-virtual {p1}, Ll/ۙ֨֨;->ۗ֫()Ll/ۙ֨֨;

    move-result-object p1

    check-cast p1, Ll/ۡ֨֨;

    .line 556
    sget-object p2, Ll/ܺ᩸۠;->ۗ:Ll/ܺ᩸۠;

    iget-object v0, p0, Ll/ܳ᩸۠;->᩸:Ll/ۖ᩸۠;

    invoke-static {v0, p1, p2}, Ll/ۖ᩸۠;->֫(Ll/ۖ᩸۠;Ll/ۙ֨֨;Ll/ܺ᩸۠;)I

    move-result p2

    iget-object v1, v0, Ll/ۖ᩸۠;->᩷:Ljava/util/EnumMap;

    iget-object v2, v0, Ll/ۖ᩸۠;->ܽ:Ll/ۛ۠۠;

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-ne p2, v3, :cond_8

    .line 558
    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p2

    .line 559
    :goto_0
    instance-of v3, p2, Ll/۫ۚ֨;

    if-eqz v3, :cond_0

    check-cast p2, Ll/۫ۚ֨;

    .line 560
    invoke-virtual {p2}, Ll/۫ۚ֨;->᩺()Ll/ۙ֨֨;

    move-result-object p2

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_3

    .line 563
    sget-object v3, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    .line 564
    invoke-virtual {p2, v3}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v3}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 595
    :cond_1
    invoke-virtual {p2}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v0, Ll/ۖ᩸۠;->ۜ:Ll/ۛ᩸֨;

    invoke-virtual {v3, p2}, Ll/ۛ᩸֨;->᩻(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p2

    goto :goto_1

    :cond_2
    invoke-static {p2}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p2

    goto :goto_1

    .line 566
    :cond_3
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p2

    .line 568
    :goto_1
    iget-object v3, v0, Ll/ۖ᩸۠;->ᩳ:Ll/ۜ᩸۠;

    iget-object v5, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v3, v5}, Ll/ۜ᩸۠;->֫(Ll/ۛ֡֨;)V

    .line 570
    iget-object v3, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_5

    check-cast v3, Ll/ۙ֨֨;

    sget-object v7, Ll/ۢ۠֨;->᩻֫:Ll/ۢ۠֨;

    .line 571
    invoke-virtual {v3, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    sget-object v7, Ll/ۢ۠֨;->۟:Ll/ۢ۠֨;

    .line 572
    invoke-virtual {v3, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v3, 0x1

    .line 574
    :goto_3
    iget-object v7, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v7}, Ll/ۛ֡֨;->۬()J

    move-result-wide v7

    const-wide/16 v9, 0x1000

    and-long/2addr v7, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x2

    cmp-long v12, v7, v9

    if-nez v12, :cond_7

    if-eqz v3, :cond_6

    const-string v3, ".1"

    goto :goto_4

    :cond_6
    const-string v3, ""

    :goto_4
    const-string v7, "where.typevar"

    .line 577
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v7, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 578
    invoke-virtual {v7}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v7

    invoke-static {v7}, Ll/᩸ᩴ֨;->֫(Ll/ۛ֡֨;)Ll/۠ᩴ֨;

    move-result-object v7

    iget-object v8, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v8}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object v8

    const/4 v9, 0x4

    new-array v9, v9, [Ljava/lang/Object;

    aput-object p1, v9, v5

    aput-object p2, v9, v6

    aput-object v7, v9, v11

    const/4 v5, 0x3

    aput-object v8, v9, v5

    .line 576
    invoke-virtual {v2, v3, v9}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v2

    .line 579
    sget-object v3, Ll/ܺ᩸۠;->ۗ:Ll/ܺ᩸۠;

    invoke-virtual {v1, v3}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    iget-object v0, v0, Ll/ۖ᩸۠;->ܿ:Ll/֨ܶ֨;

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p1}, Ll/ۛ֡֨;->ۚ֫()Ll/ۛ֡֨;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4927
    invoke-virtual {p1, v0, v4}, Ll/ۛ֡֨;->֫(Ll/ۤ֡֨;Ljava/util/Locale;)Ljava/lang/Object;

    .line 581
    invoke-virtual {p0, p2}, Ll/ܳ᩸۠;->֫(Ll/ۖܶ۠;)V

    return-object v4

    :cond_7
    xor-int/lit8 v0, v3, 0x1

    .line 583
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 585
    sget-object v0, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8606
    new-instance v0, Ll/ۨ۠۠;

    new-array v3, v11, [Ljava/lang/Object;

    aput-object p1, v3, v5

    aput-object p2, v3, v6

    const-string v5, "compiler"

    const-string v6, "where.fresh.typevar"

    invoke-direct {v0, v5, v6, v3}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    invoke-virtual {v2, v0}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v0

    .line 586
    sget-object v2, Ll/ܺ᩸۠;->ۗ:Ll/ܺ᩸۠;

    invoke-virtual {v1, v2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    invoke-virtual {p0, p2}, Ll/ܳ᩸۠;->֫(Ll/ۖܶ۠;)V

    :cond_8
    return-object v4
.end method

.method public final ֫(Ll/ۤۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 459
    check-cast p2, Ljava/lang/Void;

    .line 469
    iget-object p2, p1, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    invoke-virtual {p0, p2}, Ll/ܳ᩸۠;->֫(Ll/ۖܶ۠;)V

    .line 470
    iget-object p1, p1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    const/4 p2, 0x0

    .line 4980
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final ֫(Ll/ۧ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 459
    check-cast p2, Ljava/lang/Void;

    .line 476
    iget-object p2, p1, Ll/ۧ֨֨;->ۤ:Ll/ۖܶ۠;

    invoke-virtual {p0, p2}, Ll/ܳ᩸۠;->֫(Ll/ۖܶ۠;)V

    .line 477
    iget-object p1, p1, Ll/ۧ֨֨;->ۨ:Ll/ۙ֨֨;

    const/4 p2, 0x0

    .line 4980
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final ֫(Ll/۫ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 459
    check-cast p2, Ljava/lang/Void;

    .line 483
    invoke-virtual {p1}, Ll/۫ۚ֨;->᩺()Ll/ۙ֨֨;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 4980
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final ֫(Ll/ܶۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 459
    check-cast p2, Ljava/lang/Void;

    .line 507
    sget-object p2, Ll/ܺ᩸۠;->᩶:Ll/ܺ᩸۠;

    iget-object v0, p0, Ll/ܳ᩸۠;->᩸:Ll/ۖ᩸۠;

    invoke-static {v0, p1, p2}, Ll/ۖ᩸۠;->֫(Ll/ۖ᩸۠;Ll/ۙ֨֨;Ll/ܺ᩸۠;)I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    .line 508
    iget-object v1, p1, Ll/ۡ֨֨;->ۛ:Ll/ۙ֨֨;

    iget-object v2, p1, Ll/ܶۚ֨;->᩺:Ll/᩶֨֨;

    iget-object v4, v0, Ll/ۖ᩸۠;->ܳ:Ll/᩷ۚ֨;

    iget-object v4, v4, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    if-ne v1, v4, :cond_0

    const-string v1, ".1"

    goto :goto_0

    :cond_0
    const-string v1, ""

    .line 509
    :goto_0
    iget-object v4, v0, Ll/ۖ᩸۠;->ܽ:Ll/ۛ۠۠;

    const-string v5, "where.captured"

    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object v5

    iget-object v6, p1, Ll/ۡ֨֨;->ۛ:Ll/ۙ֨֨;

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object p1, v7, v8

    const/4 v8, 0x1

    aput-object v5, v7, v8

    const/4 v5, 0x2

    aput-object v6, v7, v5

    const/4 v5, 0x3

    aput-object v2, v7, v5

    invoke-virtual {v4, v1, v7}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v1

    .line 510
    iget-object v0, v0, Ll/ۖ᩸۠;->᩷:Ljava/util/EnumMap;

    invoke-virtual {v0, p2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4980
    invoke-virtual {v2, p0, v3}, Ll/᩶֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    iget-object p2, p1, Ll/ۡ֨֨;->ۛ:Ll/ۙ֨֨;

    .line 4980
    invoke-virtual {p2, p0, v3}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p1

    .line 4980
    invoke-virtual {p1, p0, v3}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v3
.end method

.method public final ֫(Ll/᩶֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 459
    check-cast p2, Ljava/lang/Void;

    .line 497
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    const/4 p2, 0x0

    .line 4980
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 459
    check-cast p2, Ljava/lang/Void;

    .line 520
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result p2

    const/4 v0, 0x0

    iget-object v1, p0, Ll/ܳ᩸۠;->᩸:Ll/ۖ᩸۠;

    if-eqz p2, :cond_0

    .line 521
    sget-object p2, Ll/ܺ᩸۠;->ۙ:Ll/ܺ᩸۠;

    invoke-static {v1, p1, p2}, Ll/ۖ᩸۠;->֫(Ll/ۖ᩸۠;Ll/ۙ֨֨;Ll/ܺ᩸۠;)I

    move-result v2

    iget-object v3, v1, Ll/ۖ᩸۠;->ۜ:Ll/ۛ᩸֨;

    const/4 v4, -0x1

    if-ne v2, v4, :cond_2

    .line 522
    invoke-virtual {v3, p1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    .line 523
    invoke-virtual {v3, p1}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v3

    .line 524
    iget-object v4, v1, Ll/ۖ᩸۠;->ܽ:Ll/ۛ۠۠;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v5, Ll/ۖܶ۠;

    invoke-direct {v5, v2, v3}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    .line 524
    sget-object v6, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 8614
    new-instance v6, Ll/ۨ۠۠;

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object p1, v7, v8

    const/4 v8, 0x1

    aput-object v5, v7, v8

    const-string v5, "compiler"

    const-string v8, "where.intersection"

    invoke-direct {v6, v5, v8, v7}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    invoke-virtual {v4, v6}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v4

    .line 525
    iget-object v5, v1, Ll/ۖ᩸۠;->᩷:Ljava/util/EnumMap;

    invoke-virtual {v5, p2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4980
    invoke-virtual {v2, p0, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    invoke-virtual {p0, v3}, Ll/ܳ᩸۠;->֫(Ll/ۖܶ۠;)V

    goto :goto_1

    .line 529
    :cond_0
    iget-object p2, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object p2, p2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p2}, Ll/ۤܶ۠;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 531
    iget-object p2, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object p2, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    check-cast p2, Ll/᩶ۚ֨;

    if-eqz p2, :cond_2

    .line 533
    iget-object v2, p2, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 534
    iget-object p2, p2, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    iget-object p2, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p2, Ll/ۙ֨֨;

    goto :goto_0

    .line 536
    :cond_1
    iget-object p2, p2, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    .line 4980
    :goto_0
    invoke-virtual {p2, p0, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    :cond_2
    :goto_1
    iget-object p2, v1, Ll/ۖ᩸۠;->ᩳ:Ll/ۜ᩸۠;

    iget-object v1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p2, v1}, Ll/ۜ᩸۠;->֫(Ll/ۛ֡֨;)V

    .line 541
    invoke-virtual {p1}, Ll/᩶ۚ֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/ܳ᩸۠;->֫(Ll/ۖܶ۠;)V

    .line 544
    :try_start_0
    invoke-virtual {p1}, Ll/᩶ۚ֨;->۫()Ll/ۙ֨֨;

    move-result-object p2
    :try_end_0
    .catch Ll/᩷֡֨; {:try_start_0 .. :try_end_0} :catch_0

    .line 548
    sget-object v1, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    if-eq p2, v1, :cond_3

    .line 549
    invoke-virtual {p1}, Ll/᩶ۚ֨;->۫()Ll/ۙ֨֨;

    move-result-object p1

    .line 4980
    invoke-virtual {p1, p0, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    :catch_0
    :cond_3
    return-object v0
.end method

.method public final ֫(Ll/ۖܶ۠;)V
    .locals 2

    .line 462
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ֨֨;

    const/4 v1, 0x0

    .line 4980
    invoke-virtual {v0, p0, v1}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
