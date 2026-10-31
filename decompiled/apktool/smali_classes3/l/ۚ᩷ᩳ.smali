.class public final Ll/ۚ᩷ᩳ;
.super Ll/۟ܶۡ;
.source "61L9"


# instance fields
.field public final synthetic ֡:Ll/ۡ᩹ۡ;

.field public final synthetic ۖ:Ll/۫ۨᩳ;

.field public final synthetic ۘ:Ll/۫ۨᩳ;

.field public ۜ:Ll/ۙܶᩳ;

.field public final synthetic ۡ:Ll/֫ۢᩳ;

.field public ۢ:Ll/ܳ᩸ᩳ;

.field public ܳ:Z

.field public final synthetic ܺ:Lbin/mt/plugin/api/util/ResultCallback;

.field public final synthetic ᩴ:Z

.field public final synthetic ᩵:Z

.field public ᩷:Ll/ܳ᩸ᩳ;

.field public ᩻:Ll/ۙܶᩳ;


# direct methods
.method public constructor <init>(Ll/֫ۢᩳ;ZLl/۫ۨᩳ;ZLl/۫ۨᩳ;Ll/ۡ᩹ۡ;Lbin/mt/plugin/api/util/ResultCallback;)V
    .locals 0

    .line 1306
    iput-object p1, p0, Ll/ۚ᩷ᩳ;->ۡ:Ll/֫ۢᩳ;

    iput-boolean p2, p0, Ll/ۚ᩷ᩳ;->ᩴ:Z

    iput-object p3, p0, Ll/ۚ᩷ᩳ;->ۖ:Ll/۫ۨᩳ;

    iput-boolean p4, p0, Ll/ۚ᩷ᩳ;->᩵:Z

    iput-object p5, p0, Ll/ۚ᩷ᩳ;->ۘ:Ll/۫ۨᩳ;

    iput-object p6, p0, Ll/ۚ᩷ᩳ;->֡:Ll/ۡ᩹ۡ;

    iput-object p7, p0, Ll/ۚ᩷ᩳ;->ܺ:Lbin/mt/plugin/api/util/ResultCallback;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const/4 p1, 0x1

    .line 1307
    iput-boolean p1, p0, Ll/ۚ᩷ᩳ;->ܳ:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 1349
    iget-object v0, p0, Ll/ۚ᩷ᩳ;->֡:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f1208d1

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 1350
    :cond_0
    iget-object v0, p0, Ll/ۚ᩷ᩳ;->ܺ:Lbin/mt/plugin/api/util/ResultCallback;

    if-eqz v0, :cond_1

    .line 1351
    invoke-interface {v0}, Lbin/mt/plugin/api/util/ResultCallback;->onSuccess()V

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 3

    .line 1357
    iget-object v0, p0, Ll/ۚ᩷ᩳ;->֡:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1358
    iget-boolean v0, p0, Ll/ۚ᩷ᩳ;->ܳ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚ᩷ᩳ;->ۖ:Ll/۫ۨᩳ;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۚ᩷ᩳ;->ۘ:Ll/۫ۨᩳ;

    .line 1359
    :goto_0
    instance-of v1, p1, Ll/ۙ֫ᩳ;

    if-eqz v1, :cond_1

    .line 1360
    move-object v1, p1

    check-cast v1, Ll/ۙ֫ᩳ;

    invoke-virtual {v1}, Ll/ۙ֫ᩳ;->֫()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 1361
    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->ۘ(I)V

    goto :goto_1

    .line 1362
    :cond_1
    instance-of v1, p1, Ll/֫ۘܽ;

    if-eqz v1, :cond_2

    .line 1363
    move-object v1, p1

    check-cast v1, Ll/֫ۘܽ;

    invoke-virtual {v1}, Ll/֫ۘܽ;->֫()Ll/ܽۘܽ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۘܽ;->ᩳ()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_4

    add-int/lit8 v1, v1, -0x1

    .line 1365
    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->ۘ(I)V

    goto :goto_1

    .line 1366
    :cond_2
    instance-of v1, p1, Ll/ܳܿ֡;

    if-eqz v1, :cond_3

    move-object v1, p1

    check-cast v1, Ll/ܳܿ֡;

    .line 1367
    iget v2, v1, Ll/ܳܿ֡;->ۙ:I

    iget v1, v1, Ll/ܳܿ֡;->᩹:I

    invoke-static {v2, v1}, Ll/᩵ۛ᩷;->֫(II)Ll/᩵ۛ᩷;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/᩵ۛ᩷;->֫(Ll/۫ۨᩳ;)V

    goto :goto_1

    .line 1368
    :cond_3
    instance-of v1, p1, Ll/ۘۜܿ;

    if-eqz v1, :cond_4

    move-object v1, p1

    check-cast v1, Ll/ۘۜܿ;

    .line 1369
    invoke-virtual {v1, v0}, Ll/ۘۜܿ;->֫(Ll/۫ۨᩳ;)V

    .line 1372
    :cond_4
    :goto_1
    iget-object v0, p0, Ll/ۚ᩷ᩳ;->ܺ:Lbin/mt/plugin/api/util/ResultCallback;

    if-eqz v0, :cond_5

    .line 1373
    invoke-static {p1}, Ll/ᩳ᩸ۡ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/util/ResultCallback;->onFailure(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 1315
    iget-boolean v0, p0, Ll/ۚ᩷ᩳ;->ᩴ:Z

    iget-object v1, p0, Ll/ۚ᩷ᩳ;->ۡ:Ll/֫ۢᩳ;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ll/֫ۢᩳ;->ܺ(Ll/֫ۢᩳ;)Ll/᩺ܶᩳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1316
    new-instance v0, Ll/ۙܶᩳ;

    invoke-static {v1}, Ll/֫ۢᩳ;->᩻(Ll/֫ۢᩳ;)Ll/ܰۜᩳ;

    move-result-object v2

    iget-object v2, v2, Ll/ܰۜᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-direct {v0, v2}, Ll/ۙܶᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    iput-object v0, p0, Ll/ۚ᩷ᩳ;->᩻:Ll/ۙܶᩳ;

    .line 1317
    iget-object v0, p0, Ll/ۚ᩷ᩳ;->ۖ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩹֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Ll/֫ۢᩳ;->ܺ(Ll/֫ۢᩳ;)Ll/᩺ܶᩳ;

    move-result-object v3

    invoke-static {v2, v0, v3}, Ll/ܳ᩸ᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/String;Ll/᩺ܶᩳ;)Ll/ܳ᩸ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚ᩷ᩳ;->᩷:Ll/ܳ᩸ᩳ;

    .line 1319
    :cond_0
    iget-boolean v0, p0, Ll/ۚ᩷ᩳ;->᩵:Z

    if-eqz v0, :cond_1

    invoke-static {v1}, Ll/֫ۢᩳ;->ۖ(Ll/֫ۢᩳ;)Ll/᩺ܶᩳ;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 1320
    iput-boolean v0, p0, Ll/ۚ᩷ᩳ;->ܳ:Z

    .line 1321
    new-instance v0, Ll/ۙܶᩳ;

    invoke-static {v1}, Ll/֫ۢᩳ;->ۜ(Ll/֫ۢᩳ;)Ll/ܰۜᩳ;

    move-result-object v2

    iget-object v2, v2, Ll/ܰۜᩳ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-direct {v0, v2}, Ll/ۙܶᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    iput-object v0, p0, Ll/ۚ᩷ᩳ;->ۜ:Ll/ۙܶᩳ;

    .line 1322
    iget-object v0, p0, Ll/ۚ᩷ᩳ;->ۘ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩹֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Ll/֫ۢᩳ;->ۖ(Ll/֫ۢᩳ;)Ll/᩺ܶᩳ;

    move-result-object v3

    invoke-static {v2, v0, v3}, Ll/ܳ᩸ᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/String;Ll/᩺ܶᩳ;)Ll/ܳ᩸ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚ᩷ᩳ;->ۢ:Ll/ܳ᩸ᩳ;

    :cond_1
    const v0, 0x7f1208d2

    .line 1324
    invoke-virtual {p0, v1, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 6

    .line 1329
    iget-object v0, p0, Ll/ۚ᩷ᩳ;->᩷:Ll/ܳ᩸ᩳ;

    :try_start_0
    iget-object v1, p0, Ll/ۚ᩷ᩳ;->ۢ:Ll/ܳ᩸ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1330
    iget-object v2, p0, Ll/ۚ᩷ᩳ;->֡:Ll/ۡ᩹ۡ;

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    .line 1331
    :try_start_1
    iput-boolean v3, p0, Ll/ۚ᩷ᩳ;->ܳ:Z

    .line 1332
    iget-object v3, p0, Ll/ۚ᩷ᩳ;->᩻:Ll/ۙܶᩳ;

    invoke-virtual {v0, v3}, Ll/ܳ᩸ᩳ;->֫(Ll/ۗܶᩳ;)V

    .line 1333
    iget-object v3, p0, Ll/ۚ᩷ᩳ;->ۖ:Ll/۫ۨᩳ;

    new-instance v4, Ll/᩵᩷ᩳ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v2, v3}, Ll/᩵᩷ᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_0
    if-eqz v1, :cond_2

    const/4 v3, 0x0

    .line 1338
    iput-boolean v3, p0, Ll/ۚ᩷ᩳ;->ܳ:Z

    .line 1339
    iget-object v3, p0, Ll/ۚ᩷ᩳ;->ۜ:Ll/ۙܶᩳ;

    invoke-virtual {v1, v3}, Ll/ܳ᩸ᩳ;->֫(Ll/ۗܶᩳ;)V

    .line 1340
    iget-object v3, p0, Ll/ۚ᩷ᩳ;->ۘ:Ll/۫ۨᩳ;

    new-instance v4, Ll/֡᩷ᩳ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v2, v3}, Ll/֡᩷ᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_1

    .line 1329
    :try_start_2
    invoke-virtual {v1}, Ll/ܳ᩸ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_3
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v2

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 1344
    invoke-virtual {v1}, Ll/ܳ᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ll/ܳ᩸ᩳ;->close()V

    :cond_4
    return-void

    :catchall_2
    move-exception v1

    if-eqz v0, :cond_5

    .line 1329
    :try_start_4
    invoke-virtual {v0}, Ll/ܳ᩸ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    throw v1
.end method

.method public final ᩳ()V
    .locals 1

    .line 1379
    iget-object v0, p0, Ll/ۚ᩷ᩳ;->᩷:Ll/ܳ᩸ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܳ᩸ᩳ;->close()V

    .line 1380
    :cond_0
    iget-object v0, p0, Ll/ۚ᩷ᩳ;->ۢ:Ll/ܳ᩸ᩳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ܳ᩸ᩳ;->close()V

    .line 1381
    :cond_1
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
