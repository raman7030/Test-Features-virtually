.class public abstract Ll/ۗۘۖ;
.super Ll/᩶ۘۖ;
.source "X93U"

# interfaces
.implements Ll/ۘ֡ۖ;


# instance fields
.field public ᩸:Ll/ۘۘۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1220
    invoke-direct {p0}, Ll/᩶ۘۖ;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ۗۘۖ;)Ll/᩵ۘۖ;
    .locals 0

    .line 1369
    iget-object p0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    if-nez p0, :cond_0

    .line 1370
    invoke-static {}, Ll/᩵ۘۖ;->ۢ()Ll/᩵ۘۖ;

    move-result-object p0

    return-object p0

    .line 1371
    :cond_0
    invoke-virtual {p0}, Ll/ۘۘۖ;->ۧ()Ll/᩵ۘۖ;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/֡ۖۖ;)V
    .locals 1

    .line 1589
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object p1

    invoke-virtual {p0}, Ll/᩶ۘۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 1590
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "FieldDescriptor does not match message type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ܽ()V
    .locals 2

    .line 1238
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    if-nez v0, :cond_0

    .line 1239
    sget v0, Ll/᩵ۘۖ;->ᩳ:I

    .line 88
    new-instance v0, Ll/ۘۘۖ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۘۘۖ;-><init>(I)V

    .line 1239
    iput-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    :cond_0
    return-void
.end method


# virtual methods
.method public final addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;
    .locals 1

    .line 1546
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1547
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1548
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1549
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v0, p1, p2}, Ll/ۘۘۖ;->֫(Ll/֡ۖۖ;Ljava/lang/Object;)V

    .line 1550
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 1553
    :cond_0
    invoke-super {p0, p1, p2}, Ll/᩶ۘۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ۗۘۖ;

    return-object p1
.end method

.method public final addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/᩶ۘۖ;
    .locals 1

    .line 1546
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1547
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1548
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1549
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v0, p1, p2}, Ll/ۘۘۖ;->֫(Ll/֡ۖۖ;Ljava/lang/Object;)V

    .line 1550
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 1553
    :cond_0
    invoke-super {p0, p1, p2}, Ll/᩶ۘۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ۗۘۖ;

    return-object p1
.end method

.method public clear()Ll/ۗۘۖ;
    .locals 1

    const/4 v0, 0x0

    .line 1233
    iput-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    .line 1234
    invoke-super {p0}, Ll/᩶ۘۖ;->clear()Ll/᩶ۘۖ;

    move-result-object v0

    check-cast v0, Ll/ۗۘۖ;

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ۢ֡ۖ;
    .locals 1

    .line 1212
    invoke-virtual {p0}, Ll/ۗۘۖ;->clear()Ll/ۗۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/ܳ֡ۖ;
    .locals 1

    .line 1212
    invoke-virtual {p0}, Ll/ۗۘۖ;->clear()Ll/ۗۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩶ۘۖ;
    .locals 1

    .line 1212
    invoke-virtual {p0}, Ll/ۗۘۖ;->clear()Ll/ۗۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Ll/᩷ۜۖ;
    .locals 1

    .line 1212
    invoke-virtual {p0}, Ll/ۗۘۖ;->clear()Ll/ۗۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clearField(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 1519
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1520
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1521
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1522
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v0, p1}, Ll/ۘۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1523
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 1526
    :cond_0
    invoke-super {p0, p1}, Ll/᩶ۘۖ;->clearField(Ll/֡ۖۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ۗۘۖ;

    return-object p1
.end method

.method public final clearField(Ll/֡ۖۖ;)Ll/᩶ۘۖ;
    .locals 1

    .line 1519
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1520
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1521
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1522
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v0, p1}, Ll/ۘۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1523
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 1526
    :cond_0
    invoke-super {p0, p1}, Ll/᩶ۘۖ;->clearField(Ll/֡ۖۖ;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ۗۘۖ;

    return-object p1
.end method

.method public final getAllFields()Ljava/util/Map;
    .locals 2

    .line 1384
    invoke-static {p0}, Ll/᩶ۘۖ;->֫(Ll/᩶ۘۖ;)Ljava/util/Map;

    move-result-object v0

    .line 1385
    iget-object v1, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    if-eqz v1, :cond_0

    .line 1386
    invoke-virtual {v1}, Ll/ۘۘۖ;->ܽ()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 1388
    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 882
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getDefaultInstanceForType()Ll/᩻֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getField(Ll/֡ۖۖ;)Ljava/lang/Object;
    .locals 2

    .line 1393
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1394
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1395
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ll/ۘۘۖ;->ۧ(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_2

    .line 1397
    invoke-virtual {p1}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v0, v1, :cond_1

    .line 1400
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object p1

    invoke-static {p1}, Ll/۫ۖۖ;->֫(Ll/ᩳۖۖ;)Ll/۫ۖۖ;

    move-result-object p1

    return-object p1

    .line 1402
    :cond_1
    invoke-virtual {p1}, Ll/֡ۖۖ;->֡()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0

    .line 1408
    :cond_3
    invoke-super {p0, p1}, Ll/᩶ۘۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getFieldBuilder(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;
    .locals 3

    .line 1414
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1415
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1416
    invoke-virtual {p1}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v0, v1, :cond_3

    .line 1420
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1421
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v0, p1}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1423
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v0

    .line 118
    new-instance v1, Ll/۬ۖۖ;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ll/۬ۖۖ;-><init>(Ll/ᩳۖۖ;I)V

    .line 1424
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v0, p1, v1}, Ll/ۘۘۖ;->ۧ(Ll/֡ۖۖ;Ljava/lang/Object;)V

    .line 1425
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object v1

    .line 1428
    :cond_0
    instance-of v1, v0, Ll/ܳ֡ۖ;

    if-eqz v1, :cond_1

    .line 1429
    check-cast v0, Ll/ܳ֡ۖ;

    return-object v0

    .line 1430
    :cond_1
    instance-of v1, v0, Ll/᩻֡ۖ;

    if-eqz v1, :cond_2

    .line 1431
    check-cast v0, Ll/᩻֡ۖ;

    invoke-interface {v0}, Ll/᩻֡ۖ;->toBuilder()Ll/ܳ֡ۖ;

    move-result-object v0

    .line 1432
    iget-object v1, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v1, p1, v0}, Ll/ۘۘۖ;->ۧ(Ll/֡ۖۖ;Ljava/lang/Object;)V

    .line 1433
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object v0

    .line 1436
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getRepeatedFieldBuilder() called on a non-Message type."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1417
    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getFieldBuilder() called on a non-Message type."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1441
    :cond_4
    invoke-super {p0, p1}, Ll/᩶ۘۖ;->getFieldBuilder(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final getRepeatedField(Ll/֡ۖۖ;I)Ljava/lang/Object;
    .locals 1

    .line 1457
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1458
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1459
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    if-eqz v0, :cond_0

    .line 1462
    invoke-virtual {v0, p1, p2}, Ll/ۘۘۖ;->֫(Ll/֡ۖۖ;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1460
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 1464
    :cond_1
    invoke-super {p0, p1, p2}, Ll/᩶ۘۖ;->getRepeatedField(Ll/֡ۖۖ;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getRepeatedFieldBuilder(Ll/֡ۖۖ;I)Ll/ܳ֡ۖ;
    .locals 3

    .line 1470
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1471
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1472
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1473
    invoke-virtual {p1}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    const-string v2, "getRepeatedFieldBuilder() called on a non-Message type."

    if-ne v0, v1, :cond_2

    .line 1477
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v0, p1, p2}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;I)Ljava/lang/Object;

    move-result-object v0

    .line 1478
    instance-of v1, v0, Ll/ܳ֡ۖ;

    if-eqz v1, :cond_0

    .line 1479
    check-cast v0, Ll/ܳ֡ۖ;

    return-object v0

    .line 1480
    :cond_0
    instance-of v1, v0, Ll/᩻֡ۖ;

    if-eqz v1, :cond_1

    .line 1481
    check-cast v0, Ll/᩻֡ۖ;

    invoke-interface {v0}, Ll/᩻֡ۖ;->toBuilder()Ll/ܳ֡ۖ;

    move-result-object v0

    .line 1482
    iget-object v1, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v1, p1, p2, v0}, Ll/ۘۘۖ;->֫(Ll/֡ۖۖ;ILjava/lang/Object;)V

    .line 1483
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object v0

    .line 1486
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1474
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1490
    :cond_3
    invoke-super {p0, p1, p2}, Ll/᩶ۘۖ;->getRepeatedFieldBuilder(Ll/֡ۖۖ;I)Ll/ܳ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final getRepeatedFieldCount(Ll/֡ۖۖ;)I
    .locals 3

    .line 1447
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1448
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1449
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1141
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1146
    invoke-virtual {v0, p1}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    .line 1150
    :cond_1
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    return p1

    .line 1142
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "getRepeatedFieldCount() can only be called on repeated fields."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1451
    :cond_3
    invoke-super {p0, p1}, Ll/᩶ۘۖ;->getRepeatedFieldCount(Ll/֡ۖۖ;)I

    move-result p1

    return p1
.end method

.method public final hasField(Ll/֡ۖۖ;)Z
    .locals 1

    .line 1496
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1497
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1498
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ۘۘۖ;->ܽ(Ll/֡ۖۖ;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 1500
    :cond_1
    invoke-super {p0, p1}, Ll/᩶ۘۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result p1

    return p1
.end method

.method public isInitialized()Z
    .locals 1

    .line 1376
    invoke-super {p0}, Ll/᩶ۘۖ;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۗۘۖ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final newBuilderForField(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 1559
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1560
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object p1

    .line 118
    new-instance v0, Ll/۬ۖۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/۬ۖۖ;-><init>(Ll/ᩳۖۖ;I)V

    return-object v0

    .line 1562
    :cond_0
    invoke-super {p0, p1}, Ll/᩶ۘۖ;->newBuilderForField(Ll/֡ۖۖ;)Ll/ܳ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final parseUnknownField(Ll/۟ۜۖ;Ll/ᩳۘۖ;I)Z
    .locals 6

    .line 1578
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1581
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ll/᩶ۘۖ;->getUnknownFieldSetBuilder()Ll/ܳ֨ۖ;

    move-result-object v1

    .line 1583
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v3

    new-instance v4, Ll/֡֡ۖ;

    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-direct {v4, v0}, Ll/֡֡ۖ;-><init>(Ll/ۘۘۖ;)V

    move-object v0, p1

    move-object v2, p2

    move v5, p3

    .line 1579
    invoke-static/range {v0 .. v5}, Ll/۠֡ۖ;->֫(Ll/۟ۜۖ;Ll/ܳ֨ۖ;Ll/ᩳۘۖ;Ll/ᩳۖۖ;Ll/֨֡ۖ;I)Z

    move-result p1

    return p1
.end method

.method public final setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/ܳ֡ۖ;
    .locals 1

    .line 1506
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1507
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1508
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1509
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v0, p1, p2}, Ll/ۘۘۖ;->ۧ(Ll/֡ۖۖ;Ljava/lang/Object;)V

    .line 1510
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 1513
    :cond_0
    invoke-super {p0, p1, p2}, Ll/᩶ۘۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ۗۘۖ;

    return-object p1
.end method

.method public final setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/᩶ۘۖ;
    .locals 1

    .line 1506
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1507
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1508
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1509
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v0, p1, p2}, Ll/ۘۘۖ;->ۧ(Ll/֡ۖۖ;Ljava/lang/Object;)V

    .line 1510
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 1513
    :cond_0
    invoke-super {p0, p1, p2}, Ll/᩶ۘۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ۗۘۖ;

    return-object p1
.end method

.method public final setRepeatedField(Ll/֡ۖۖ;ILjava/lang/Object;)Ll/ܳ֡ۖ;
    .locals 1

    .line 1533
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1534
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1535
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1536
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۘۘۖ;->֫(Ll/֡ۖۖ;ILjava/lang/Object;)V

    .line 1537
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 1540
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ll/᩶ۘۖ;->setRepeatedField(Ll/֡ۖۖ;ILjava/lang/Object;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ۗۘۖ;

    return-object p1
.end method

.method public final setRepeatedField(Ll/֡ۖۖ;ILjava/lang/Object;)Ll/᩶ۘۖ;
    .locals 1

    .line 1533
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1534
    invoke-direct {p0, p1}, Ll/ۗۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1535
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1536
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۘۘۖ;->֫(Ll/֡ۖۖ;ILjava/lang/Object;)V

    .line 1537
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-object p0

    .line 1540
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ll/᩶ۘۖ;->setRepeatedField(Ll/֡ۖۖ;ILjava/lang/Object;)Ll/᩶ۘۖ;

    move-result-object p1

    check-cast p1, Ll/ۗۘۖ;

    return-object p1
.end method

.method public final ֫(Ll/ۨۖۖ;Ll/ܳ᩵ۖ;)V
    .locals 2

    .line 1313
    invoke-static {p1}, Ll/ۘᩴۖ;->֫(Ll/ۨۖۖ;)Ll/ۛۖۖ;

    move-result-object p1

    .line 1244
    invoke-virtual {p1}, Ll/ۛۖۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {p0}, Ll/᩶ۘۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 1316
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1317
    invoke-virtual {p1}, Ll/ۛۖۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v0

    .line 1318
    iget-object v1, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-virtual {p1, p2}, Ll/ۛۖۖ;->֫(Ll/ܳ᩵ۖ;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ll/ۘۘۖ;->ۧ(Ll/֡ۖۖ;Ljava/lang/Object;)V

    .line 1319
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    return-void

    .line 1246
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Extension is for type \""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1248
    invoke-virtual {p1}, Ll/ۛۖۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳۖۖ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" which does not match message type \""

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1250
    invoke-virtual {p0}, Ll/᩶ۘۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳۖۖ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\"."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ֫(Ll/۫ۘۖ;)V
    .locals 1

    .line 1567
    invoke-static {p1}, Ll/۫ۘۖ;->֫(Ll/۫ۘۖ;)Ll/᩵ۘۖ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1568
    invoke-direct {p0}, Ll/ۗۘۖ;->ܽ()V

    .line 1569
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    invoke-static {p1}, Ll/۫ۘۖ;->֫(Ll/۫ۘۖ;)Ll/᩵ۘۖ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۘۘۖ;->֫(Ll/᩵ۘۖ;)V

    .line 1570
    invoke-virtual {p0}, Ll/᩶ۘۖ;->onChanged()V

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 1362
    iget-object v0, p0, Ll/ۗۘۖ;->᩸:Ll/ۘۘۖ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ۘۘۖ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
