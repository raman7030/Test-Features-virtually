.class public final Ll/ۨ᩷ᩴ;
.super Ll/ܶܿᩴ;
.source "X5U"


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# instance fields
.field public final synthetic ۗ:Ll/۟᩷ᩴ;

.field public transient ۙ:Ll/֫ܺᩴ;

.field public transient ۤ:Ll/᩶֡ᩴ;

.field public ۫:Z

.field public ۬:I

.field public ᩶:I

.field public ᩸:Z

.field public transient ᩹:Ll/֨ۚᩴ;


# direct methods
.method public constructor <init>(Ll/۟᩷ᩴ;IZIZ)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1276
    iput-object p1, p0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    if-nez p3, :cond_1

    if-nez p5, :cond_1

    .line 192
    invoke-static {p2, p4}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    if-gtz p1, :cond_0

    goto :goto_0

    .line 1277
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, ") is larger than end key ("

    const-string p5, ")"

    const-string v0, "Start key ("

    .line 0
    invoke-static {v0, p2, p3, p5, p4}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    .line 1277
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1278
    :cond_1
    :goto_0
    iput p2, p0, Ll/ۨ᩷ᩴ;->᩶:I

    .line 1279
    iput-boolean p3, p0, Ll/ۨ᩷ᩴ;->᩸:Z

    .line 1280
    iput p4, p0, Ll/ۨ᩷ᩴ;->۬:I

    .line 1281
    iput-boolean p5, p0, Ll/ۨ᩷ᩴ;->۫:Z

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 1287
    new-instance v0, Ll/۫᩷ᩴ;

    invoke-direct {v0, p0}, Ll/۫᩷ᩴ;-><init>(Ll/ۨ᩷ᩴ;)V

    .line 1288
    :goto_0
    invoke-virtual {v0}, Ll/᩺᩷ᩴ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1289
    invoke-virtual {v0}, Ll/᩺᩷ᩴ;->֫()Ll/۠᩷ᩴ;

    .line 1290
    invoke-virtual {v0}, Ll/᩺᩷ᩴ;->remove()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final bridge synthetic comparator()Ljava/util/Comparator;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 2

    .line 1441
    new-instance v0, Ll/۫᩷ᩴ;

    invoke-direct {v0, p0}, Ll/۫᩷ᩴ;-><init>(Ll/ۨ᩷ᩴ;)V

    .line 1443
    :cond_0
    invoke-virtual {v0}, Ll/᩺᩷ᩴ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1444
    invoke-virtual {v0}, Ll/᩺᩷ᩴ;->֫()Ll/۠᩷ᩴ;

    move-result-object v1

    iget-object v1, v1, Ll/ۚܿᩴ;->᩹:Ljava/lang/Object;

    .line 1445
    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final firstEntry()Ll/۠᩷ᩴ;
    .locals 3

    .line 1523
    iget-object v0, p0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    iget-object v1, v0, Ll/۟᩷ᩴ;->ۛ:Ll/۠᩷ᩴ;

    if-nez v1, :cond_0

    goto :goto_1

    .line 1527
    :cond_0
    iget-boolean v1, p0, Ll/ۨ᩷ᩴ;->᩸:Z

    if-eqz v1, :cond_1

    iget-object v0, v0, Ll/۟᩷ᩴ;->ۙ:Ll/۠᩷ᩴ;

    goto :goto_0

    .line 1529
    :cond_1
    iget v1, p0, Ll/ۨ᩷ᩴ;->᩶:I

    invoke-virtual {v0, v1}, Ll/۟᩷ᩴ;->ܿ(I)Ll/۠᩷ᩴ;

    move-result-object v0

    .line 1531
    iget v2, v0, Ll/ۚܿᩴ;->᩸:I

    .line 192
    invoke-static {v2, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    if-gez v1, :cond_2

    .line 1531
    invoke-virtual {v0}, Ll/۠᩷ᩴ;->ܳ()Ll/۠᩷ᩴ;

    move-result-object v0

    :cond_2
    :goto_0
    if-eqz v0, :cond_4

    .line 1535
    iget-boolean v1, p0, Ll/ۨ᩷ᩴ;->۫:Z

    if-nez v1, :cond_3

    iget v1, v0, Ll/ۚܿᩴ;->᩸:I

    iget v2, p0, Ll/ۨ᩷ᩴ;->۬:I

    .line 192
    invoke-static {v1, v2}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    if-ltz v1, :cond_3

    goto :goto_1

    :cond_3
    return-object v0

    :cond_4
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1455
    invoke-virtual {p0, p1}, Ll/ۨ᩷ᩴ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    invoke-virtual {v0, p1}, Ll/۟᩷ᩴ;->ܽ(I)Ll/۠᩷ᩴ;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Ll/ۚܿᩴ;->᩹:Ljava/lang/Object;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 926
    iget-object v0, p0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    iget-object v0, v0, Ll/۟᩷ᩴ;->ۙ:Ll/۠᩷ᩴ;

    .line 1586
    invoke-virtual {p0}, Ll/ۨ᩷ᩴ;->firstEntry()Ll/۠᩷ᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final keySet()Ll/֫ܺᩴ;
    .locals 1

    .line 1402
    iget-object v0, p0, Ll/ۨ᩷ᩴ;->ۙ:Ll/֫ܺᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۗ᩷ᩴ;

    invoke-direct {v0, p0}, Ll/ۗ᩷ᩴ;-><init>(Ll/ۨ᩷ᩴ;)V

    iput-object v0, p0, Ll/ۨ᩷ᩴ;->ۙ:Ll/֫ܺᩴ;

    .line 1403
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ᩴ;->ۙ:Ll/֫ܺᩴ;

    return-object v0
.end method

.method public final lastEntry()Ll/۠᩷ᩴ;
    .locals 3

    .line 1545
    iget-object v0, p0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    iget-object v1, v0, Ll/۟᩷ᩴ;->ۛ:Ll/۠᩷ᩴ;

    if-nez v1, :cond_0

    goto :goto_1

    .line 1549
    :cond_0
    iget-boolean v1, p0, Ll/ۨ᩷ᩴ;->۫:Z

    if-eqz v1, :cond_1

    iget-object v0, v0, Ll/۟᩷ᩴ;->۬:Ll/۠᩷ᩴ;

    goto :goto_0

    .line 1551
    :cond_1
    iget v1, p0, Ll/ۨ᩷ᩴ;->۬:I

    invoke-virtual {v0, v1}, Ll/۟᩷ᩴ;->ܿ(I)Ll/۠᩷ᩴ;

    move-result-object v0

    .line 1553
    iget v2, v0, Ll/ۚܿᩴ;->᩸:I

    .line 192
    invoke-static {v2, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    if-ltz v1, :cond_2

    .line 1553
    invoke-virtual {v0}, Ll/۠᩷ᩴ;->ۖ()Ll/۠᩷ᩴ;

    move-result-object v0

    :cond_2
    :goto_0
    if-eqz v0, :cond_4

    .line 1557
    iget-boolean v1, p0, Ll/ۨ᩷ᩴ;->᩸:Z

    if-nez v1, :cond_3

    iget v1, v0, Ll/ۚܿᩴ;->᩸:I

    iget v2, p0, Ll/ۨ᩷ᩴ;->᩶:I

    .line 192
    invoke-static {v1, v2}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    if-gez v1, :cond_3

    goto :goto_1

    :cond_3
    return-object v0

    :cond_4
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 1469
    iget-object v1, p0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    iput-boolean v0, v1, Ll/۟᩷ᩴ;->۫:Z

    .line 1470
    invoke-virtual {p0, p1}, Ll/ۨ᩷ᩴ;->ܽ(I)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return-object v2

    .line 1471
    :cond_0
    invoke-virtual {v1, p1}, Ll/۟᩷ᩴ;->remove(I)Ljava/lang/Object;

    move-result-object p1

    .line 1472
    iget-boolean v0, v1, Ll/۟᩷ᩴ;->۫:Z

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    return-object v2
.end method

.method public final size()I
    .locals 3

    .line 1477
    new-instance v0, Ll/۫᩷ᩴ;

    invoke-direct {v0, p0}, Ll/۫᩷ᩴ;-><init>(Ll/ۨ᩷ᩴ;)V

    const/4 v1, 0x0

    .line 1479
    :goto_0
    invoke-virtual {v0}, Ll/᩺᩷ᩴ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 1481
    invoke-virtual {v0}, Ll/᩺᩷ᩴ;->֫()Ll/۠᩷ᩴ;

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1408
    iget-object v0, p0, Ll/ۨ᩷ᩴ;->ۤ:Ll/᩶֡ᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۙ᩷ᩴ;

    invoke-direct {v0, p0}, Ll/ۙ᩷ᩴ;-><init>(Ll/ۨ᩷ᩴ;)V

    iput-object v0, p0, Ll/ۨ᩷ᩴ;->ۤ:Ll/᩶֡ᩴ;

    .line 1429
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ᩴ;->ۤ:Ll/᩶֡ᩴ;

    return-object v0
.end method

.method public final ֫(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    .line 1460
    iget-object v1, p0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    iput-boolean v0, v1, Ll/۟᩷ᩴ;->۫:Z

    .line 1461
    invoke-virtual {p0, p1}, Ll/ۨ᩷ᩴ;->ܽ(I)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Key ("

    const-string v1, ") out of range ["

    .line 0
    invoke-static {p1, v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 1461
    iget-boolean v0, p0, Ll/ۨ᩷ᩴ;->᩸:Z

    const-string v1, "-"

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget v0, p0, Ll/ۨ᩷ᩴ;->᩶:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Ll/ۨ᩷ᩴ;->۫:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Ll/ۨ᩷ᩴ;->۬:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    const-string v0, ")"

    .line 0
    invoke-static {p1, v1, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1461
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1462
    :cond_2
    invoke-virtual {v1, p1, p2}, Ll/۟᩷ᩴ;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1463
    iget-boolean p2, v1, Ll/۟᩷ᩴ;->۫:Z

    if-eqz p2, :cond_3

    const/4 p1, 0x0

    :cond_3
    return-object p1
.end method

.method public final ֫(I)Z
    .locals 1

    .line 1436
    invoke-virtual {p0, p1}, Ll/ۨ᩷ᩴ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    invoke-virtual {v0, p1}, Ll/۟᩷ᩴ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۛ()I
    .locals 1

    .line 1570
    invoke-virtual {p0}, Ll/ۨ᩷ᩴ;->lastEntry()Ll/۠᩷ᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1572
    iget v0, v0, Ll/ۚܿᩴ;->᩸:I

    return v0

    .line 1571
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ۜ()Ll/֨ۚᩴ;
    .locals 1

    .line 1306
    iget-object v0, p0, Ll/ۨ᩷ᩴ;->᩹:Ll/֨ۚᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/᩶᩷ᩴ;

    invoke-direct {v0, p0}, Ll/᩶᩷ᩴ;-><init>(Ll/ۨ᩷ᩴ;)V

    iput-object v0, p0, Ll/ۨ᩷ᩴ;->᩹:Ll/֨ۚᩴ;

    .line 1385
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ᩴ;->᩹:Ll/֨ۚᩴ;

    return-object v0
.end method

.method public final ۡ()I
    .locals 1

    .line 1563
    invoke-virtual {p0}, Ll/ۨ᩷ᩴ;->firstEntry()Ll/۠᩷ᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1565
    iget v0, v0, Ll/ۚܿᩴ;->᩸:I

    return v0

    .line 1564
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ۡ(I)Ll/֫ۢᩴ;
    .locals 7

    .line 1504
    iget-boolean v0, p0, Ll/ۨ᩷ᩴ;->᩸:Z

    iget-object v2, p0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    if-eqz v0, :cond_0

    new-instance v0, Ll/ۨ᩷ᩴ;

    iget v5, p0, Ll/ۨ᩷ᩴ;->۬:I

    iget-boolean v6, p0, Ll/ۨ᩷ᩴ;->۫:Z

    const/4 v4, 0x0

    move-object v1, v0

    move v3, p1

    invoke-direct/range {v1 .. v6}, Ll/ۨ᩷ᩴ;-><init>(Ll/۟᩷ᩴ;IZIZ)V

    return-object v0

    .line 1505
    :cond_0
    iget v0, p0, Ll/ۨ᩷ᩴ;->᩶:I

    .line 192
    invoke-static {p1, v0}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-lez v0, :cond_1

    .line 1505
    new-instance v0, Ll/ۨ᩷ᩴ;

    iget v5, p0, Ll/ۨ᩷ᩴ;->۬:I

    iget-boolean v6, p0, Ll/ۨ᩷ᩴ;->۫:Z

    const/4 v4, 0x0

    move-object v1, v0

    move v3, p1

    invoke-direct/range {v1 .. v6}, Ll/ۨ᩷ᩴ;-><init>(Ll/۟᩷ᩴ;IZIZ)V

    return-object v0

    :cond_1
    return-object p0
.end method

.method public final ۧ(II)Ll/֫ۢᩴ;
    .locals 7

    .line 1510
    iget-object v1, p0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    iget-boolean v0, p0, Ll/ۨ᩷ᩴ;->᩸:Z

    iget-boolean v2, p0, Ll/ۨ᩷ᩴ;->۫:Z

    if-eqz v2, :cond_0

    if-eqz v0, :cond_0

    new-instance v6, Ll/ۨ᩷ᩴ;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move v2, p1

    move v4, p2

    invoke-direct/range {v0 .. v5}, Ll/ۨ᩷ᩴ;-><init>(Ll/۟᩷ᩴ;IZIZ)V

    return-object v6

    .line 1511
    :cond_0
    iget v3, p0, Ll/ۨ᩷ᩴ;->۬:I

    if-nez v2, :cond_2

    .line 192
    invoke-static {p2, v3}, Ljava/lang/Integer;->compare(II)I

    move-result v4

    if-gez v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v4, p2

    .line 1512
    :goto_1
    iget p2, p0, Ll/ۨ᩷ᩴ;->᩶:I

    if-nez v0, :cond_4

    .line 192
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result v5

    if-lez v5, :cond_3

    goto :goto_2

    :cond_3
    move p1, p2

    :cond_4
    :goto_2
    if-nez v2, :cond_5

    if-nez v0, :cond_5

    if-ne p1, p2, :cond_5

    if-ne v4, v3, :cond_5

    return-object p0

    .line 1514
    :cond_5
    new-instance p2, Ll/ۨ᩷ᩴ;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p2

    move v2, p1

    invoke-direct/range {v0 .. v5}, Ll/ۨ᩷ᩴ;-><init>(Ll/۟᩷ᩴ;IZIZ)V

    return-object p2
.end method

.method public final ۫()V
    .locals 0

    return-void
.end method

.method public final ܽ(I)Z
    .locals 1

    .line 1301
    iget-boolean v0, p0, Ll/ۨ᩷ᩴ;->᩸:Z

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۨ᩷ᩴ;->᩶:I

    .line 192
    invoke-static {p1, v0}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-ltz v0, :cond_1

    .line 1301
    :cond_0
    iget-boolean v0, p0, Ll/ۨ᩷ᩴ;->۫:Z

    if-nez v0, :cond_2

    iget v0, p0, Ll/ۨ᩷ᩴ;->۬:I

    .line 192
    invoke-static {p1, v0}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ᩻(I)Ll/֫ۢᩴ;
    .locals 7

    .line 1498
    iget-boolean v0, p0, Ll/ۨ᩷ᩴ;->۫:Z

    iget-object v2, p0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    if-eqz v0, :cond_0

    new-instance v0, Ll/ۨ᩷ᩴ;

    iget-boolean v4, p0, Ll/ۨ᩷ᩴ;->᩸:Z

    const/4 v6, 0x0

    iget v3, p0, Ll/ۨ᩷ᩴ;->᩶:I

    move-object v1, v0

    move v5, p1

    invoke-direct/range {v1 .. v6}, Ll/ۨ᩷ᩴ;-><init>(Ll/۟᩷ᩴ;IZIZ)V

    return-object v0

    .line 1499
    :cond_0
    iget v0, p0, Ll/ۨ᩷ᩴ;->۬:I

    .line 192
    invoke-static {p1, v0}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-gez v0, :cond_1

    .line 1499
    new-instance v0, Ll/ۨ᩷ᩴ;

    iget-boolean v4, p0, Ll/ۨ᩷ᩴ;->᩸:Z

    const/4 v6, 0x0

    iget v3, p0, Ll/ۨ᩷ᩴ;->᩶:I

    move-object v1, v0

    move v5, p1

    invoke-direct/range {v1 .. v6}, Ll/ۨ᩷ᩴ;-><init>(Ll/۟᩷ᩴ;IZIZ)V

    return-object v0

    :cond_1
    return-object p0
.end method
