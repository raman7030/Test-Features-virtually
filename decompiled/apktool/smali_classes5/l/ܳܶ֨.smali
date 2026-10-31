.class public final Ll/ܳܶ֨;
.super Ll/۬᩸֨;
.source "X43L"


# instance fields
.field public final synthetic ᩸:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1348
    iput-object p1, p0, Ll/ܳܶ֨;->᩸:Ll/ۛ᩸֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 2

    .line 1348
    check-cast p1, Ll/ۙ֨֨;

    .line 1351
    invoke-virtual {p2, p1}, Ll/ۙ֨֨;->ۧ(Ll/ۙ֨֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1352
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 1354
    :cond_0
    invoke-virtual {p1}, Ll/ۙ֨֨;->ᩴ֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4900
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1355
    check-cast p1, Ljava/lang/Boolean;

    return-object p1

    .line 1357
    :cond_1
    sget-object v0, Ll/ۧܶ֨;->ۧ:[I

    invoke-virtual {p2}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1376
    :pswitch_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "isSameType "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 1362
    :pswitch_1
    sget-object v0, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {p1, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-ne p2, p1, :cond_2

    const/4 v1, 0x1

    .line 1365
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1370
    :cond_3
    invoke-virtual {p1}, Ll/ۙ֨֨;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1371
    invoke-virtual {p1}, Ll/ۙ֨֨;->ۜ֫()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ܳܶ֨;->᩸:Ll/ۛ᩸֨;

    .line 1372
    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->ۗ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    .line 4900
    invoke-virtual {p2, p0, p1}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1372
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v1, 0x1

    .line 1370
    :cond_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1360
    :pswitch_2
    invoke-virtual {p1}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public final ֫(Ll/֨֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1348
    check-cast p2, Ll/ۙ֨֨;

    .line 1464
    sget-object v0, Ll/ۢ۠֨;->᩵֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1466
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    if-eq p1, p2, :cond_2

    .line 1469
    iget-object v0, p1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    if-eq v0, p2, :cond_2

    sget-object v0, Ll/ۢ۠֨;->۟:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Ll/ۢ۠֨;->ۘ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 1473
    :cond_1
    sget-object v0, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    iget-object v1, p0, Ll/ܳܶ֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {p1, v0, p2, v1}, Ll/֨֨֨;->֫(Ll/᩵֨֨;Ll/ۙ֨֨;Ll/ۛ᩸֨;)V

    .line 1475
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 1470
    :cond_2
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final ֫(Ll/ۚۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1348
    check-cast p2, Ll/ۙ֨֨;

    if-ne p1, p2, :cond_0

    .line 1430
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 1432
    :cond_0
    invoke-virtual {p2}, Ll/ۙ֨֨;->ᩴ֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4900
    invoke-virtual {p2, p0, p1}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1433
    check-cast p1, Ljava/lang/Boolean;

    return-object p1

    .line 1435
    :cond_1
    sget-object v0, Ll/ۢ۠֨;->ۗ:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p1, Ll/ۚۚ֨;->ۤ:Ll/ۙ֨֨;

    .line 1436
    iget-object v0, p0, Ll/ܳܶ֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {v0, p2}, Ll/ۛ᩸֨;->ۜ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 4563
    invoke-virtual {v0, p1, p2}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 4564
    invoke-virtual {v0, p1, p2}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0, p2, p1}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    const/4 p1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    .line 1435
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۤۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1348
    check-cast p2, Ll/ۙ֨֨;

    .line 1453
    sget-object v0, Ll/ۢ۠֨;->ۧ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1454
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 1457
    :cond_0
    check-cast p2, Ll/ۤۚ֨;

    .line 1458
    iget-object v0, p0, Ll/ܳܶ֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1, p2}, Ll/ۛ᩸֨;->֫(Ll/ۤۚ֨;Ll/ۤۚ֨;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    iget-object v2, p2, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    iget-object p2, p2, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    iget-object p1, p1, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    .line 1459
    invoke-virtual {v0, v2, p2, p1}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object p1

    .line 4900
    invoke-virtual {v1, p0, p1}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1459
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 1458
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۧ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1348
    check-cast p2, Ll/ۙ֨֨;

    .line 3255
    iget-object v0, p0, Ll/ܳܶ֨;->᩸:Ll/ۛ᩸֨;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1487
    iget-object p1, p1, Ll/ۧ֨֨;->ۨ:Ll/ۙ֨֨;

    .line 1443
    invoke-virtual {p2}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object p2

    .line 4900
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1443
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic ֫(Ll/۫ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1348
    check-cast p2, Ll/ۙ֨֨;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final ֫(Ll/ᩳ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1348
    check-cast p2, Ll/ۙ֨֨;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1448
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1348
    check-cast p2, Ll/ۙ֨֨;

    .line 1382
    sget-object v0, Ll/ۢ۠֨;->᩵֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1383
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 1385
    :cond_0
    move-object v0, p2

    check-cast v0, Ll/᩶֨֨;

    .line 1386
    iget-object v1, p1, Ll/᩶֨֨;->ۨ:Ll/ܺۘ֨;

    iget-object v2, v0, Ll/᩶֨֨;->ۨ:Ll/ܺۘ֨;

    if-eq v1, v2, :cond_1

    invoke-virtual {p1}, Ll/᩶֨֨;->ۜ֫()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Ll/ۙ֨֨;->ۜ֫()Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_1
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    iget-object p2, v0, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    .line 1387
    iget-object v0, p0, Ll/ܳܶ֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1, p2}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 1386
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1348
    check-cast p2, Ll/ۙ֨֨;

    if-ne p1, p2, :cond_0

    .line 1394
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 1396
    :cond_0
    invoke-virtual {p2}, Ll/ۙ֨֨;->ᩴ֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4900
    invoke-virtual {p2, p0, p1}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1397
    check-cast p1, Ljava/lang/Boolean;

    return-object p1

    .line 1399
    :cond_1
    invoke-virtual {p2}, Ll/ۙ֨֨;->۠֫()Z

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ܳܶ֨;->᩸:Ll/ۛ᩸֨;

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Ll/ۙ֨֨;->ۜ֫()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1400
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ۗ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    .line 4900
    invoke-virtual {p1, p0, v0}, Ll/᩶ۚ֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1400
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ۙ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 4900
    invoke-virtual {p1, p0, p2}, Ll/᩶ۚ֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1400
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1402
    :cond_3
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p2}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1403
    invoke-virtual {v2, p1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    .line 4900
    invoke-virtual {v0, p0, v1}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1403
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1404
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 1406
    :cond_4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1407
    invoke-virtual {v2, p1}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 1408
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 1411
    iget-object v3, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1409
    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Malformed intersection"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 1413
    :cond_6
    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۙ֨֨;

    .line 1414
    iget-object v1, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 1415
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 1416
    :cond_8
    iget-object v1, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 4900
    invoke-virtual {v1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 1417
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_7

    .line 1418
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 1420
    :cond_9
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1422
    :cond_a
    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v3, p2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v0, v3, :cond_b

    .line 1423
    invoke-virtual {p1}, Ll/᩶ۚ֨;->۫()Ll/ۙ֨֨;

    move-result-object v0

    invoke-virtual {p2}, Ll/ۙ֨֨;->۫()Ll/ۙ֨֨;

    move-result-object v3

    .line 4900
    invoke-virtual {v0, p0, v3}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1423
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1424
    invoke-virtual {p1}, Ll/᩶ۚ֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p2}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object p2

    invoke-virtual {v2, p1, p2}, Ll/ۛ᩸֨;->ۧ(Ll/ۖܶ۠;Ll/ۖܶ۠;)Z

    move-result p1

    if-eqz p1, :cond_b

    const/4 v1, 0x1

    .line 1422
    :cond_b
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
