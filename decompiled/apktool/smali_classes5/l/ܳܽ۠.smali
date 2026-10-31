.class public final Ll/ܳܽ۠;
.super Ll/᩶۫֨;
.source "A451"


# instance fields
.field public ۧ:Z

.field public final ܽ:Ll/ۙ֨֨;

.field public final synthetic ܿ:Ll/᩻ܽ۠;

.field public final ᩳ:Ll/ۙ֨֨;


# direct methods
.method public constructor <init>(Ll/᩻ܽ۠;Ll/ۙ֨֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 1296
    iput-object p1, p0, Ll/ܳܽ۠;->ܿ:Ll/᩻ܽ۠;

    invoke-direct {p0}, Ll/᩶۫֨;-><init>()V

    .line 1297
    iput-object p2, p0, Ll/ܳܽ۠;->ᩳ:Ll/ۙ֨֨;

    .line 1298
    iput-object p3, p0, Ll/ܳܽ۠;->ܽ:Ll/ۙ֨֨;

    const/4 p1, 0x1

    .line 1299
    iput-boolean p1, p0, Ll/ܳܽ۠;->ۧ:Z

    return-void
.end method

.method private ֫(Ll/۫᩵۠;)Ll/۫᩵۠;
    .locals 3

    .line 1380
    iget-object v0, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    sget-object v1, Ll/ۢ۠֨;->᩺:Ll/ۢ۠֨;

    invoke-virtual {v0, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1381
    iget-object v0, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    check-cast v0, Ll/֨۫֨;

    iget-object v1, p0, Ll/ܳܽ۠;->ܿ:Ll/᩻ܽ۠;

    iget-object v2, v1, Ll/ܶۧ۠;->֫:Ll/ۜ۫֨;

    invoke-virtual {v0, v2}, Ll/֨۫֨;->֫(Ll/ۜ۫֨;)Ll/ۚۚ۠;

    move-result-object v0

    .line 1382
    iget-object v1, v1, Ll/᩻ܽ۠;->ܳ:Ll/ۜܽ۠;

    iget-object v1, v1, Ll/ۜܽ۠;->ۧ:Ll/᩹ܽ۠;

    iget-object v1, v1, Ll/᩹ܽ۠;->ᩴ:Ll/۫۫֨;

    iget-object v1, v1, Ll/۫۫֨;->᩵:Ll/۟᩵۠;

    if-eq v0, v1, :cond_0

    .line 1383
    check-cast v0, Ll/۫᩵۠;

    return-object v0

    :cond_0
    return-object p1
.end method

.method public static bridge synthetic ֫(Ll/ܳܽ۠;Ll/۫᩵۠;)Ll/۫᩵۠;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܳܽ۠;->֫(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/۠᩵۠;)V
    .locals 1

    .line 1309
    iget-object v0, p1, Ll/۠᩵۠;->ۤ:Ll/۫᩵۠;

    invoke-direct {p0, v0}, Ll/ܳܽ۠;->֫(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܶ۫֨;->ۧ(Ll/ۚۚ۠;)V

    .line 1310
    iget-object p1, p1, Ll/۠᩵۠;->۫:Ll/۫᩵۠;

    invoke-direct {p0, p1}, Ll/ܳܽ۠;->֫(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶ۫֨;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/ۢ֡۠;)V
    .locals 5

    .line 1315
    sget-object v0, Ll/ۢ۠֨;->ᩴ֫:Ll/ۢ۠֨;

    iget-object v1, p0, Ll/ܳܽ۠;->ܽ:Ll/ۙ֨֨;

    invoke-virtual {v1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1316
    iget-boolean p1, p0, Ll/ܳܽ۠;->ۧ:Z

    iput-boolean p1, p0, Ll/ܳܽ۠;->ۧ:Z

    return-void

    .line 1317
    :cond_0
    iget-object v2, p0, Ll/ܳܽ۠;->ᩳ:Ll/ۙ֨֨;

    invoke-virtual {v2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 1318
    iput-boolean v3, p0, Ll/ܳܽ۠;->ۧ:Z

    return-void

    .line 1319
    :cond_1
    invoke-virtual {v2}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v0

    invoke-virtual {v1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v4

    if-eq v0, v4, :cond_4

    .line 1320
    iget-object v0, p1, Ll/ۢ֡۠;->۟:Ll/᩶֡۠;

    sget-object v4, Ll/᩶֡۠;->᩶:Ll/᩶֡۠;

    if-ne v0, v4, :cond_2

    iget-object p1, p1, Ll/ۢ֡۠;->ۧ֫:Ll/ۛ֡֨;

    iget-object p1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 1322
    invoke-virtual {p1}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 1323
    :goto_0
    iget-boolean v0, p0, Ll/ܳܽ۠;->ۧ:Z

    invoke-virtual {v2}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v2

    if-ne p1, v2, :cond_3

    .line 1324
    invoke-virtual {v1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v1

    if-eq p1, v1, :cond_3

    const/4 v3, 0x1

    :cond_3
    and-int p1, v0, v3

    iput-boolean p1, p0, Ll/ܳܽ۠;->ۧ:Z

    return-void

    .line 1326
    :cond_4
    iget-boolean p1, p0, Ll/ܳܽ۠;->ۧ:Z

    iget-object v0, p0, Ll/ܳܽ۠;->ܿ:Ll/᩻ܽ۠;

    invoke-static {v0, v2, v1}, Ll/᩻ܽ۠;->֫(Ll/᩻ܽ۠;Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v0

    and-int/2addr p1, v0

    iput-boolean p1, p0, Ll/ܳܽ۠;->ۧ:Z

    return-void
.end method

.method public final ֫(Ll/ܳ֡۠;)V
    .locals 6

    .line 1337
    sget-object v0, Ll/ۢ۠֨;->ᩴ֫:Ll/ۢ۠֨;

    iget-object v1, p0, Ll/ܳܽ۠;->ܽ:Ll/ۙ֨֨;

    invoke-virtual {v1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1338
    iget-boolean p1, p0, Ll/ܳܽ۠;->ۧ:Z

    iput-boolean p1, p0, Ll/ܳܽ۠;->ۧ:Z

    return-void

    .line 1339
    :cond_0
    iget-object v2, p0, Ll/ܳܽ۠;->ᩳ:Ll/ۙ֨֨;

    invoke-virtual {v2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 1340
    iput-boolean v3, p0, Ll/ܳܽ۠;->ۧ:Z

    return-void

    .line 1361
    :cond_1
    invoke-virtual {p1}, Ll/ܳ֡۠;->᩷֫()Ll/ܰۡ֨;

    move-result-object v0

    sget-object v3, Ll/ܰۡ֨;->᩹:Ll/ܰۡ֨;

    if-ne v0, v3, :cond_2

    .line 1362
    iget-object p1, p1, Ll/ܳ֡۠;->۫:Ll/ۚۚ۠;

    check-cast p1, Ll/۫᩵۠;

    invoke-direct {p0, p1}, Ll/ܳܽ۠;->֫(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object p1

    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    goto :goto_0

    .line 1364
    :cond_2
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 1365
    new-instance v3, Ll/ܿܽ۠;

    invoke-direct {v3, p0, v0}, Ll/ܿܽ۠;-><init>(Ll/ܳܽ۠;Ll/ᩴܶ۠;)V

    .line 1374
    iget-object p1, p1, Ll/ܳ֡۠;->۫:Ll/ۚۚ۠;

    invoke-virtual {v3, p1}, Ll/ܶ۫֨;->ۧ(Ll/ۚۚ۠;)V

    .line 1375
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    .line 1343
    :goto_0
    invoke-virtual {p1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    iget-object v3, p0, Ll/ܳܽ۠;->ܿ:Ll/᩻ܽ۠;

    if-nez v0, :cond_3

    invoke-static {v3, v2, v1}, Ll/᩻ܽ۠;->ۧ(Ll/᩻ܽ۠;Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1344
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫᩵۠;

    .line 1345
    iget-boolean v4, p0, Ll/ܳܽ۠;->ۧ:Z

    invoke-static {v3, v2, v1, v0}, Ll/᩻ܽ۠;->֫(Ll/᩻ܽ۠;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/۫᩵۠;)Z

    move-result v0

    and-int/2addr v0, v4

    iput-boolean v0, p0, Ll/ܳܽ۠;->ۧ:Z

    goto :goto_1

    .line 1347
    :cond_3
    invoke-virtual {p1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v2}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v0

    invoke-virtual {v1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v4

    if-eq v0, v4, :cond_7

    .line 1348
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫᩵۠;

    .line 1349
    invoke-virtual {v0}, Ll/۫᩵۠;->ۜ֫()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    iget-object v0, v0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    .line 1350
    :goto_3
    iget-boolean v3, p0, Ll/ܳܽ۠;->ۧ:Z

    invoke-virtual {v2}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v5

    if-ne v0, v5, :cond_5

    .line 1351
    invoke-virtual {v1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v5

    if-eq v0, v5, :cond_5

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    :goto_4
    and-int v0, v3, v4

    iput-boolean v0, p0, Ll/ܳܽ۠;->ۧ:Z

    goto :goto_2

    :cond_6
    return-void

    .line 1354
    :cond_7
    iget-boolean p1, p0, Ll/ܳܽ۠;->ۧ:Z

    invoke-static {v3, v2, v1}, Ll/᩻ܽ۠;->֫(Ll/᩻ܽ۠;Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v0

    and-int/2addr p1, v0

    iput-boolean p1, p0, Ll/ܳܽ۠;->ۧ:Z

    return-void
.end method

.method public final ֫(Ll/ܶ֡۠;)V
    .locals 0

    .line 1332
    iget-object p1, p1, Ll/ܶ֡۠;->ۗ:Ll/۫᩵۠;

    invoke-direct {p0, p1}, Ll/ܳܽ۠;->֫(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶ۫֨;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 1304
    iput-boolean v0, p0, Ll/ܳܽ۠;->ۧ:Z

    return-void
.end method
