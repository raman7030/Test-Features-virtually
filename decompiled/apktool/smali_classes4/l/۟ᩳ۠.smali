.class public final Ll/۟ᩳ۠;
.super Ll/ܶᩳ۠;
.source "B7KX"


# instance fields
.field public ܳ:Ll/ۖܶ۠;

.field public ܿ:Z

.field public final synthetic ᩻:Ll/ۧܿ۠;


# direct methods
.method public constructor <init>(Ll/ۧܿ۠;Ll/ܳ֡֨;Ll/ۖܶ۠;)V
    .locals 0

    .line 1395
    iput-object p1, p0, Ll/۟ᩳ۠;->᩻:Ll/ۧܿ۠;

    .line 1396
    invoke-direct {p0, p1, p2}, Ll/ܶᩳ۠;-><init>(Ll/ۧܿ۠;Ll/᩶֡֨;)V

    .line 1397
    iput-object p3, p0, Ll/۟ᩳ۠;->ܳ:Ll/ۖܶ۠;

    .line 1398
    invoke-virtual {p2}, Ll/ܳ֡֨;->۫֫()Ll/ۖܶ۠;

    move-result-object p1

    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance p2, Ll/ܿ᩵ۢ;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Ll/ܿ᩵ۢ;-><init>(I)V

    invoke-interface {p1, p2}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result p1

    iput-boolean p1, p0, Ll/۟ᩳ۠;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۙ֨֨;
    .locals 6

    .line 1403
    iget-object v0, p0, Ll/ܶᩳ۠;->ۧ:Ll/ۙ֨֨;

    if-nez v0, :cond_2

    .line 1404
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 1405
    iget-object v1, p0, Ll/۟ᩳ۠;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢۚ۠;

    .line 1406
    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, p0, Ll/۟ᩳ۠;->᩻:Ll/ۧܿ۠;

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢۚ۠;

    if-ne v3, v2, :cond_0

    .line 1407
    iget-boolean v5, p0, Ll/۟ᩳ۠;->ܿ:Z

    if-eqz v5, :cond_0

    invoke-static {v4}, Ll/ۧܿ۠;->ۚ(Ll/ۧܿ۠;)Ll/ۛ᩸֨;

    move-result-object v4

    iget-object v3, v3, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v4, v3}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3

    goto :goto_1

    :cond_0
    iget-object v3, v3, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 227
    :goto_1
    invoke-virtual {v0, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 1410
    :cond_1
    new-instance v1, Ll/ۧ֨֨;

    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v0

    invoke-static {v4}, Ll/ۧܿ۠;->ۖ(Ll/ۧܿ۠;)Ll/᩷ۚ֨;

    move-result-object v2

    iget-object v2, v2, Ll/᩷ۚ֨;->ܶۧ:Ll/֫֨֨;

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v3

    invoke-static {v4}, Ll/ۧܿ۠;->ۖ(Ll/ۧܿ۠;)Ll/᩷ۚ֨;

    move-result-object v4

    iget-object v4, v4, Ll/᩷ۚ֨;->ۢ֫:Ll/ܳ֡֨;

    invoke-direct {v1, v0, v2, v3, v4}, Ll/ۧ֨֨;-><init>(Ll/ۖܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/᩶֡֨;)V

    iput-object v1, p0, Ll/ܶᩳ۠;->ۧ:Ll/ۙ֨֨;

    .line 1412
    :cond_2
    iget-object v0, p0, Ll/ܶᩳ۠;->ۧ:Ll/ۙ֨֨;

    return-object v0
.end method

.method public final ֫(Ll/ۡ֡۠;)Ll/ۡ֡۠;
    .locals 8

    .line 1437
    iget-object v0, p1, Ll/ۡ֡۠;->ۨ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iget-object v1, p0, Ll/۟ᩳ۠;->ܳ:Ll/ۖܶ۠;

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢۚ۠;

    .line 1441
    iget-object v3, p0, Ll/ܶᩳ۠;->ܽ:Ll/᩶֡֨;

    check-cast v3, Ll/ܳ֡֨;

    iget-object v4, v2, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    invoke-virtual {v3, v4}, Ll/ܳ֡֨;->֫(Ll/۫֡֨;)Ll/᩸֡֨;

    move-result-object v3

    .line 1442
    new-instance v4, Ll/᩶ۚ۠;

    iget-object v5, p0, Ll/۟ᩳ۠;->᩻:Ll/ۧܿ۠;

    invoke-static {v5}, Ll/ۧܿ۠;->ۢ(Ll/ۧܿ۠;)Ll/ܿ֨۠;

    move-result-object v5

    iget v6, v2, Ll/ۚۚ۠;->᩸:I

    .line 111
    iput v6, v5, Ll/ܿ֨۠;->ܽ:I

    .line 1442
    invoke-direct {v4, v5}, Ll/᩶ۚ۠;-><init>(Ll/ܿ֨۠;)V

    .line 1443
    iget-object v5, v2, Ll/ۢۚ۠;->۫:Ll/ۖ֡۠;

    invoke-virtual {v3}, Ll/᩸֡֨;->۬֫()Ll/ۖܶ۠;

    move-result-object v6

    invoke-virtual {v6}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    .line 1444
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v3

    goto :goto_1

    .line 1445
    :cond_0
    invoke-virtual {v3}, Ll/᩸֡֨;->۬֫()Ll/ۖܶ۠;

    move-result-object v3

    .line 68
    invoke-virtual {v4, v7, v3}, Ll/᩶ۚ۠;->֫(Ljava/lang/Object;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v3

    .line 1445
    :goto_1
    iput-object v3, v5, Ll/ۖ֡۠;->ۗ:Ll/ۖܶ۠;

    .line 1446
    iget-object v3, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۢۚ۠;

    iget-object v3, v3, Ll/ۢۚ۠;->ܰ:Ll/۫᩵۠;

    .line 53
    invoke-virtual {v4, v3, v7}, Ll/᩶ۚ۠;->֫(Ll/ۚۚ۠;Ljava/lang/Object;)Ll/ۚۚ۠;

    move-result-object v3

    .line 1446
    check-cast v3, Ll/۫᩵۠;

    iput-object v3, v2, Ll/ۢۚ۠;->ܰ:Ll/۫᩵۠;

    .line 1447
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public final ᩳ()Ll/ۘ֡֨;
    .locals 11

    .line 1417
    invoke-super {p0}, Ll/ܶᩳ۠;->ᩳ()Ll/ۘ֡֨;

    move-result-object v6

    .line 1421
    iget-wide v0, v6, Ll/ۛ֡֨;->᩶:J

    const-wide v2, 0x8001000000000L

    or-long/2addr v0, v2

    iput-wide v0, v6, Ll/ۛ֡֨;->᩶:J

    .line 1422
    new-instance v7, Ll/ᩴܶ۠;

    invoke-direct {v7}, Ll/ᩴܶ۠;-><init>()V

    .line 1423
    iget-object v0, p0, Ll/۟ᩳ۠;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ll/ۢۚ۠;

    .line 1424
    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۚ۠;

    .line 1425
    new-instance v10, Ll/۫֡֨;

    if-ne v0, v8, :cond_0

    .line 1426
    iget-boolean v1, p0, Ll/۟ᩳ۠;->ܿ:Z

    if-eqz v1, :cond_0

    const-wide v1, 0x400000000L

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    :goto_1
    const-wide v3, 0x2000000201000000L

    or-long/2addr v1, v3

    iget-object v3, v0, Ll/ۢۚ۠;->ۤ:Ll/ۤܶ۠;

    iget-object v0, v0, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    iget-object v4, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    move-object v0, v10

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 227
    invoke-virtual {v7, v10}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 1429
    :cond_1
    invoke-virtual {v7}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, v6, Ll/ۘ֡֨;->۟:Ll/ۖܶ۠;

    .line 1430
    iget-wide v0, v6, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v2, 0x2000000000000000L

    or-long/2addr v0, v2

    iput-wide v0, v6, Ll/ۛ֡֨;->᩶:J

    return-object v6
.end method
