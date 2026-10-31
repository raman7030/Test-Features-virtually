.class public final Ll/᩵᩶֨;
.super Ll/ܽ᩶֨;
.source "I7LP"


# instance fields
.field public ܿ֫:Ll/ܽ۫ᩴ;

.field public final synthetic ᩳ֫:Ll/ۚ᩶֨;


# direct methods
.method public constructor <init>(Ll/ۚ᩶֨;Ll/ܰ֡۠;Ll/֫ۤ֨;Ll/ܰ֡۠;Ljava/util/Map;)V
    .locals 0

    .line 469
    iput-object p1, p0, Ll/᩵᩶֨;->ᩳ֫:Ll/ۚ᩶֨;

    .line 470
    invoke-direct/range {p0 .. p5}, Ll/ܽ᩶֨;-><init>(Ll/ۚ᩶֨;Ll/۫᩵۠;Ll/֫ۤ֨;Ll/۫᩵۠;Ljava/util/Map;)V

    .line 463
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩶֨;->ܿ֫:Ll/ܽ۫ᩴ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;Ll/۫᩵۠;)Ll/ܽ᩶֨;
    .locals 6

    .line 461
    move-object v2, p2

    check-cast v2, Ll/ܰ֡۠;

    .line 510
    new-instance p2, Ll/᩵᩶֨;

    iget-object v0, p0, Ll/ܽ᩶֨;->֫֫:Ll/۫᩵۠;

    move-object v4, v0

    check-cast v4, Ll/ܰ֡۠;

    iget-object v5, p0, Ll/ܽ᩶֨;->ۧ֫:Ljava/util/Map;

    iget-object v1, p0, Ll/᩵᩶֨;->ᩳ֫:Ll/ۚ᩶֨;

    move-object v0, p2

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Ll/᩵᩶֨;-><init>(Ll/ۚ᩶֨;Ll/ܰ֡۠;Ll/֫ۤ֨;Ll/ܰ֡۠;Ljava/util/Map;)V

    return-object p2
.end method

.method public final ۧ(Ll/᩻ۗ֨;)Ll/ۙ֨֨;
    .locals 4

    .line 475
    iget-object v0, p0, Ll/᩵᩶֨;->ᩳ֫:Ll/ۚ᩶֨;

    invoke-static {v0}, Ll/ۚ᩶֨;->֫(Ll/ۚ᩶֨;)Ll/ۢۗ֨;

    move-result-object v1

    iget-object v2, p1, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2093
    new-instance v3, Ll/᩶ۙ֨;

    invoke-direct {v3, v1, v2}, Ll/᩶ۙ֨;-><init>(Ll/ۢۗ֨;Ll/ۘ۬֨;)V

    .line 475
    invoke-virtual {p1, v3}, Ll/᩻ۗ֨;->֫(Ll/ۘ۬֨;)Ll/᩻ۗ֨;

    move-result-object v1

    .line 476
    iget-object v2, p1, Ll/᩻ۗ֨;->ᩳ:Ll/ۙ֨֨;

    sget-object v3, Ll/ۢ۠֨;->ᩴ֫:Ll/ۢ۠֨;

    invoke-virtual {v2, v3}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 478
    iget-object p1, p1, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    invoke-static {v0}, Ll/ۚ᩶֨;->֫(Ll/ۚ᩶֨;)Ll/ۢۗ֨;

    move-result-object v1

    iget-object v1, v1, Ll/ۢۗ֨;->֡:Ll/ۛ۠۠;

    sget-object v3, Ll/ۨᩴ۠;->۟֫:Ll/ۨ۠۠;

    invoke-virtual {v1, v3}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object v1

    iget-object v3, p0, Ll/֨۫֨;->۟:Ll/۫᩵۠;

    invoke-interface {p1, v3, v1}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    .line 479
    invoke-static {v0}, Ll/ۚ᩶֨;->֫(Ll/ۚ᩶֨;)Ll/ۢۗ֨;

    move-result-object p1

    iget-object p1, p1, Ll/ۢۗ֨;->᩷֫:Ll/ۛ᩸֨;

    invoke-virtual {p1, v2}, Ll/ۛ᩸֨;->ܳ(Ll/ۙ֨֨;)Ll/۫ۚ֨;

    move-result-object p1

    return-object p1

    .line 491
    :cond_0
    iget-object v0, p0, Ll/᩵᩶֨;->ܿ֫:Ll/ܽ۫ᩴ;

    new-instance v2, Ll/ۘ᩶֨;

    invoke-direct {v2, p0}, Ll/ۘ᩶֨;-><init>(Ll/᩵᩶֨;)V

    invoke-virtual {v0, v2}, Ll/ܽ۫ᩴ;->orElseGet(Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖܶ۠;

    .line 482
    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۚ۠;

    .line 483
    iget-object v2, v2, Ll/ۖۚ۠;->۬:Ll/۫᩵۠;

    iget-object v3, v2, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-static {v2, v3, p1}, Ll/ۚ᩶֨;->֫(Ll/ۚۚ۠;Ll/ۙ֨֨;Ll/᩻ۗ֨;)Ll/ۙ֨֨;

    goto :goto_0

    .line 485
    :cond_1
    iget-object p1, v1, Ll/᩻ۗ֨;->ᩳ:Ll/ۙ֨֨;

    return-object p1
.end method
