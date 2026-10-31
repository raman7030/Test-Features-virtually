.class public final Ll/ۜ᩶֨;
.super Ll/ܽ᩶֨;
.source "I7LP"


# instance fields
.field public final synthetic ܳ֫:Ll/ۚ᩶֨;

.field public ܿ֫:Ll/ܽ۫ᩴ;

.field public ᩳ֫:Ll/ܽ۫ᩴ;


# direct methods
.method public constructor <init>(Ll/ۚ᩶֨;Ll/ܳ֡۠;Ll/֫ۤ֨;Ll/ܳ֡۠;Ljava/util/Map;)V
    .locals 0

    .line 529
    iput-object p1, p0, Ll/ۜ᩶֨;->ܳ֫:Ll/ۚ᩶֨;

    .line 530
    invoke-direct/range {p0 .. p5}, Ll/ܽ᩶֨;-><init>(Ll/ۚ᩶֨;Ll/۫᩵۠;Ll/֫ۤ֨;Ll/۫᩵۠;Ljava/util/Map;)V

    .line 520
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩶֨;->ᩳ֫:Ll/ܽ۫ᩴ;

    .line 523
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩶֨;->ܿ֫:Ll/ܽ۫ᩴ;

    return-void
.end method

.method private ֫(Ll/ۙ֨֨;Ll/᩻ۗ֨;)V
    .locals 9

    .line 577
    iget-object v0, p2, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    .line 578
    iget-object v1, p0, Ll/ۜ᩶֨;->ܳ֫:Ll/ۚ᩶֨;

    invoke-static {v1}, Ll/ۚ᩶֨;->֫(Ll/ۚ᩶֨;)Ll/ۢۗ֨;

    move-result-object v2

    iget-object v3, p0, Ll/ܽ᩶֨;->֫֫:Ll/۫᩵۠;

    check-cast v3, Ll/ܳ֡۠;

    invoke-virtual {v2, v3, p1, p2}, Ll/ۢۗ֨;->֫(Ll/ܳ֡۠;Ll/ۙ֨֨;Ll/᩻ۗ֨;)Ll/᩻ۗ֨;

    move-result-object p2

    .line 579
    sget-object v2, Ll/ۧ᩶֨;->֫:[I

    invoke-virtual {v3}, Ll/ܳ֡۠;->᩷֫()Ll/ܰۡ֨;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v2, v2, v4

    const/4 v4, 0x1

    if-eq v2, v4, :cond_4

    const/4 v4, 0x2

    if-eq v2, v4, :cond_0

    goto :goto_1

    .line 544
    :cond_0
    iget-object v2, p0, Ll/ۜ᩶֨;->ܿ֫:Ll/ܽ۫ᩴ;

    new-instance v4, Ll/ܳ᩶֨;

    invoke-direct {v4, p0}, Ll/ܳ᩶֨;-><init>(Ll/ۜ᩶֨;)V

    invoke-virtual {v2, v4}, Ll/ܽ۫ᩴ;->orElseGet(Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܶ۠;

    .line 584
    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۤ֡۠;

    .line 597
    iget-object v5, p2, Ll/᩻ۗ֨;->ᩳ:Ll/ۙ֨֨;

    iget-object v6, p2, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    sget-object v7, Ll/ۢ۠֨;->ᩴ֫:Ll/ۢ۠֨;

    invoke-virtual {v5, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    const/4 v8, 0x0

    if-eqz v5, :cond_2

    iget-object v5, v4, Ll/ۤ֡۠;->ۗ:Ll/۫᩵۠;

    if-eqz v5, :cond_2

    .line 599
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ll/ۚ᩶֨;->ܽ(Ll/ۚ᩶֨;)Ll/ۛ۠۠;

    move-result-object v4

    const-string v5, "unexpected.ret.val"

    new-array v7, v8, [Ljava/lang/Object;

    .line 600
    invoke-virtual {v4, v5, v7}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v4

    .line 599
    invoke-interface {v6, v3, v4}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    goto :goto_0

    .line 601
    :cond_2
    iget-object v5, p2, Ll/᩻ۗ֨;->ᩳ:Ll/ۙ֨֨;

    invoke-virtual {v5, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 602
    iget-object v5, v4, Ll/ۤ֡۠;->ۗ:Ll/۫᩵۠;

    if-nez v5, :cond_3

    .line 604
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ll/ۚ᩶֨;->ܽ(Ll/ۚ᩶֨;)Ll/ۛ۠۠;

    move-result-object v5

    const-string v7, "missing.ret.val"

    new-array v8, v8, [Ljava/lang/Object;

    .line 605
    invoke-virtual {v5, v7, v8}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v5

    .line 604
    invoke-interface {v6, v3, v5}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    .line 607
    :cond_3
    iget-object v4, v4, Ll/ۤ֡۠;->ۗ:Ll/۫᩵۠;

    iget-object v5, v4, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-static {v4, v5, p2}, Ll/ۚ᩶֨;->֫(Ll/ۚۚ۠;Ll/ۙ֨֨;Ll/᩻ۗ֨;)Ll/ۙ֨֨;

    goto :goto_0

    .line 581
    :cond_4
    iget-object v2, v3, Ll/ܳ֡۠;->۫:Ll/ۚۚ۠;

    iget-object v4, v2, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-static {v2, v4, p2}, Ll/ۚ᩶֨;->֫(Ll/ۚۚ۠;Ll/ۙ֨֨;Ll/᩻ۗ֨;)Ll/ۙ֨֨;

    .line 590
    :cond_5
    :goto_1
    invoke-static {v1}, Ll/ۚ᩶֨;->֫(Ll/ۚ᩶֨;)Ll/ۢۗ֨;

    move-result-object p2

    invoke-virtual {p2, v3, p1, v0}, Ll/ۢۗ֨;->֫(Ll/ܳ֡۠;Ll/ۙ֨֨;Ll/ۘ۬֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;Ll/۫᩵۠;)Ll/ܽ᩶֨;
    .locals 6

    .line 517
    move-object v2, p2

    check-cast v2, Ll/ܳ֡۠;

    .line 622
    new-instance p2, Ll/ۜ᩶֨;

    iget-object v0, p0, Ll/ܽ᩶֨;->֫֫:Ll/۫᩵۠;

    move-object v4, v0

    check-cast v4, Ll/ܳ֡۠;

    iget-object v5, p0, Ll/ܽ᩶֨;->ۧ֫:Ljava/util/Map;

    iget-object v1, p0, Ll/ۜ᩶֨;->ܳ֫:Ll/ۚ᩶֨;

    move-object v0, p2

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Ll/ۜ᩶֨;-><init>(Ll/ۚ᩶֨;Ll/ܳ֡۠;Ll/֫ۤ֨;Ll/ܳ֡۠;Ljava/util/Map;)V

    return-object p2
.end method

.method public final ۧ(Ll/᩻ۗ֨;)Ll/ۙ֨֨;
    .locals 4

    .line 563
    :try_start_0
    iget-object v0, p0, Ll/ۜ᩶֨;->ܳ֫:Ll/ۚ᩶֨;

    invoke-static {v0}, Ll/ۚ᩶֨;->֫(Ll/ۚ᩶֨;)Ll/ۢۗ֨;

    move-result-object v0

    iget-object v1, p0, Ll/ܽ᩶֨;->֫֫:Ll/۫᩵۠;

    check-cast v1, Ll/ۙ֡۠;

    .line 535
    iget-object v2, p0, Ll/ۜ᩶֨;->ᩳ֫:Ll/ܽ۫ᩴ;

    new-instance v3, Ll/ܿ᩶֨;

    invoke-direct {v3, p0}, Ll/ܿ᩶֨;-><init>(Ll/ۜ᩶֨;)V

    invoke-virtual {v2, v3}, Ll/ܽ۫ᩴ;->orElseGet(Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܶ۠;

    .line 563
    invoke-virtual {v0, v1, p1, v2}, Ll/ۢۗ֨;->֫(Ll/ۙ֡۠;Ll/᩻ۗ֨;Ll/ۖܶ۠;)Ll/ۜۗ֨;

    move-result-object v0

    .line 564
    iget-object v1, v0, Ll/ۜۗ֨;->֫:Ll/ۙ֨֨;

    .line 565
    iget-object v0, v0, Ll/ۜۗ֨;->ۧ:Ll/ۙ֨֨;

    .line 567
    invoke-direct {p0, v1, p1}, Ll/ۜ᩶֨;->֫(Ll/ۙ֨֨;Ll/᩻ۗ֨;)V
    :try_end_0
    .catch Ll/ۛܶ֨; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 570
    iget-object p1, p1, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    invoke-virtual {v0}, Ll/ۛܶ֨;->֫()Ll/ܽܶ۠;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    return-object v1
.end method
