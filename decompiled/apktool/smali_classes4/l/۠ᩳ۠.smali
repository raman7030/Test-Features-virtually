.class public final Ll/۠ᩳ۠;
.super Ll/ܶᩳ۠;
.source "B7KX"


# instance fields
.field public final synthetic ۜ:Ll/ۧܿ۠;

.field public ܳ:Ll/ۘ֡֨;

.field public ܿ:Z

.field public ᩻:Ll/ۙ֨֨;


# direct methods
.method public constructor <init>(Ll/ۧܿ۠;Ll/᩶֡֨;Ll/ۘ֡֨;Ll/۫᩵۠;)V
    .locals 0

    .line 1336
    iput-object p1, p0, Ll/۠ᩳ۠;->ۜ:Ll/ۧܿ۠;

    .line 1337
    invoke-direct {p0, p1, p2}, Ll/ܶᩳ۠;-><init>(Ll/ۧܿ۠;Ll/᩶֡֨;)V

    const/4 p1, 0x0

    .line 1334
    iput-boolean p1, p0, Ll/۠ᩳ۠;->ܿ:Z

    .line 1338
    iput-object p3, p0, Ll/۠ᩳ۠;->ܳ:Ll/ۘ֡֨;

    if-eqz p4, :cond_0

    .line 1339
    iget-object p1, p4, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    goto :goto_0

    :cond_0
    sget-object p1, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    :goto_0
    iput-object p1, p0, Ll/۠ᩳ۠;->᩻:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۙ֨֨;
    .locals 4

    .line 1344
    iget-object v0, p0, Ll/ܶᩳ۠;->ۧ:Ll/ۙ֨֨;

    if-nez v0, :cond_1

    .line 1345
    iget-object v0, p0, Ll/۠ᩳ۠;->ۜ:Ll/ۧܿ۠;

    invoke-static {v0}, Ll/ۧܿ۠;->ۚ(Ll/ۧܿ۠;)Ll/ۛ᩸֨;

    move-result-object v1

    iget-object v2, p0, Ll/ܶᩳ۠;->ܽ:Ll/᩶֡֨;

    iget-object v2, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v3, p0, Ll/۠ᩳ۠;->ܳ:Ll/ۘ֡֨;

    invoke-virtual {v1, v3, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    .line 1346
    sget-object v2, Ll/ۢ۠֨;->᩻֫:Ll/ۢ۠֨;

    iget-object v3, p0, Ll/۠ᩳ۠;->᩻:Ll/ۙ֨֨;

    invoke-virtual {v3, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1347
    invoke-static {v0}, Ll/ۧܿ۠;->ۚ(Ll/ۧܿ۠;)Ll/ۛ᩸֨;

    move-result-object v0

    invoke-virtual {v1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {v2, v3}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object v1

    const/4 v0, 0x1

    .line 1348
    iput-boolean v0, p0, Ll/۠ᩳ۠;->ܿ:Z

    .line 1350
    :cond_0
    iput-object v1, p0, Ll/ܶᩳ۠;->ۧ:Ll/ۙ֨֨;

    .line 1352
    :cond_1
    iget-object v0, p0, Ll/ܶᩳ۠;->ۧ:Ll/ۙ֨֨;

    return-object v0
.end method

.method public final ۧ()Ll/ۖܶ۠;
    .locals 3

    .line 1383
    iget-object v0, p0, Ll/۠ᩳ۠;->ۜ:Ll/ۧܿ۠;

    invoke-static {v0}, Ll/ۧܿ۠;->ۢ(Ll/ۧܿ۠;)Ll/ܿ֨۠;

    move-result-object v0

    invoke-virtual {p0}, Ll/۠ᩳ۠;->֫()Ll/ۙ֨֨;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {p0}, Ll/۠ᩳ۠;->ᩳ()Ll/ۘ֡֨;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll/ܿ֨۠;->֫(Ll/ۖܶ۠;Ll/ۘ֡֨;)Ll/ۖܶ۠;

    move-result-object v0

    .line 1378
    iget-object v1, p0, Ll/۠ᩳ۠;->᩻:Ll/ۙ֨֨;

    .line 1384
    sget-object v2, Ll/ۢ۠֨;->᩻֫:Ll/ۢ۠֨;

    invoke-virtual {v1, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1385
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1387
    :cond_0
    new-instance v1, Ll/֨۟֨;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/֨۟֨;-><init>(I)V

    invoke-virtual {v0, v1}, Ll/ۖܶ۠;->֫(Ljava/util/function/Function;)Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/ۙ֨֨;
    .locals 1

    .line 1378
    iget-object v0, p0, Ll/۠ᩳ۠;->᩻:Ll/ۙ֨֨;

    return-object v0
.end method

.method public final ᩳ()Ll/ۘ֡֨;
    .locals 11

    .line 1357
    invoke-super {p0}, Ll/ܶᩳ۠;->ᩳ()Ll/ۘ֡֨;

    move-result-object v6

    .line 1358
    iget-wide v0, v6, Ll/ۛ֡֨;->᩶:J

    .line 111
    iget-object v7, p0, Ll/۠ᩳ۠;->ܳ:Ll/ۘ֡֨;

    iget-wide v2, v7, Ll/ۛ֡֨;->᩶:J

    const-wide v4, 0x400000000L

    and-long/2addr v2, v4

    const-wide/32 v4, 0x20000000

    or-long/2addr v2, v4

    or-long/2addr v0, v2

    .line 1358
    iput-wide v0, v6, Ll/ۛ֡֨;->᩶:J

    .line 1359
    iget-boolean v2, p0, Ll/۠ᩳ۠;->ܿ:Z

    if-eqz v2, :cond_0

    const-wide/high16 v2, 0x200000000000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    or-long/2addr v0, v2

    iput-wide v0, v6, Ll/ۛ֡֨;->᩶:J

    .line 1360
    new-instance v8, Ll/ᩴܶ۠;

    invoke-direct {v8}, Ll/ᩴܶ۠;-><init>()V

    .line 1361
    invoke-virtual {p0}, Ll/۠ᩳ۠;->֫()Ll/ۙ֨֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v0

    .line 1378
    iget-object v1, p0, Ll/۠ᩳ۠;->᩻:Ll/ۙ֨֨;

    .line 1362
    sget-object v2, Ll/ۢ۠֨;->᩻֫:Ll/ۢ۠֨;

    invoke-virtual {v1, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1363
    iget-object v9, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 1364
    new-instance v10, Ll/۫֡֨;

    iget-object v0, p0, Ll/۠ᩳ۠;->ۜ:Ll/ۧܿ۠;

    invoke-static {v0}, Ll/ۧܿ۠;->ۢ(Ll/ۧܿ۠;)Ll/ܿ֨۠;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܿ֨۠;->ۧ(I)Ll/ۤܶ۠;

    move-result-object v3

    .line 1378
    iget-object v4, p0, Ll/۠ᩳ۠;->᩻:Ll/ۙ֨֨;

    const-wide v1, 0x200000000L

    move-object v0, v10

    move-object v5, v6

    .line 1364
    invoke-direct/range {v0 .. v5}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    invoke-virtual {v8, v10}, Ll/ᩴܶ۠;->ۧ(Ljava/lang/Object;)V

    move-object v0, v9

    .line 1366
    :cond_1
    iget-object v1, v7, Ll/ۘ֡֨;->۟:Ll/ۖܶ۠;

    if-eqz v1, :cond_2

    .line 1367
    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move-object v9, v0

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫֡֨;

    .line 1368
    new-instance v10, Ll/۫֡֨;

    const-wide v1, 0x200000000L

    .line 111
    iget-wide v3, v0, Ll/ۛ֡֨;->᩶:J

    or-long/2addr v1, v3

    .line 1368
    iget-object v3, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v0, v9, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ll/ۙ֨֨;

    move-object v0, v10

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 227
    invoke-virtual {v8, v10}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 1369
    iget-object v9, v9, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_1

    .line 1372
    :cond_2
    invoke-virtual {v8}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, v6, Ll/ۘ֡֨;->۟:Ll/ۖܶ۠;

    return-object v6
.end method
