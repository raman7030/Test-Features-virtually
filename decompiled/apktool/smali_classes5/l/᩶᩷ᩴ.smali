.class public final Ll/᩶᩷ᩴ;
.super Ll/ܳᩴᩴ;
.source "X5U"


# instance fields
.field public final synthetic ᩸:Ll/ۨ᩷ᩴ;


# direct methods
.method public constructor <init>(Ll/ۨ᩷ᩴ;)V
    .locals 0

    .line 1306
    iput-object p1, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1357
    iget-object v0, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    invoke-virtual {v0}, Ll/ۨ᩷ᩴ;->clear()V

    return-void
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 1319
    iget-object v0, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    iget-object v0, v0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    invoke-virtual {v0}, Ll/۟᩷ᩴ;->ۜ()Ll/֨ۚᩴ;

    move-result-object v0

    check-cast v0, Ll/ۚ᩷ᩴ;

    .line 1036
    iget-object v0, v0, Ll/ۚ᩷ᩴ;->᩸:Ll/֡᩷ᩴ;

    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    .line 1325
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1326
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 1327
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    .line 1328
    :cond_1
    iget-object v0, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    iget-object v2, v0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/۟᩷ᩴ;->ܽ(I)Ll/۠᩷ᩴ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 1329
    iget v3, v2, Ll/ۚܿᩴ;->᩸:I

    invoke-virtual {v0, v3}, Ll/ۨ᩷ᩴ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1, v2}, Ljava/util/Map$Entry;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final first()Ljava/lang/Object;
    .locals 1

    .line 1362
    iget-object v0, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    invoke-virtual {v0}, Ll/ۨ᩷ᩴ;->firstEntry()Ll/۠᩷ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1306
    check-cast p1, Ll/ۨۜᩴ;

    .line 1377
    iget-object v0, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    invoke-interface {p1}, Ll/ۨۜᩴ;->֫()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۨ᩷ᩴ;->᩻(I)Ll/֫ۢᩴ;

    move-result-object p1

    check-cast p1, Ll/ۨ᩷ᩴ;

    invoke-virtual {p1}, Ll/ۨ᩷ᩴ;->ۜ()Ll/֨ۚᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 2

    .line 1585
    iget-object v0, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    iget-object v1, v0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    .line 926
    iget-object v1, v1, Ll/۟᩷ᩴ;->ۙ:Ll/۠᩷ᩴ;

    .line 1586
    invoke-virtual {v0}, Ll/ۨ᩷ᩴ;->firstEntry()Ll/۠᩷ᩴ;

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

.method public final iterator()Ll/ܶ֡ᩴ;
    .locals 2

    .line 1309
    new-instance v0, Ll/۬᩷ᩴ;

    iget-object v1, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    .line 1618
    invoke-direct {v0, v1}, Ll/۫᩷ᩴ;-><init>(Ll/ۨ᩷ᩴ;)V

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 1

    .line 1367
    iget-object v0, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    invoke-virtual {v0}, Ll/ۨ᩷ᩴ;->lastEntry()Ll/۠᩷ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 3

    .line 1335
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1336
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 1337
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    .line 1338
    :cond_1
    iget-object v0, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    iget-object v2, v0, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v2, p1}, Ll/۟᩷ᩴ;->ܽ(I)Ll/۠᩷ᩴ;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 1339
    iget v2, p1, Ll/ۚܿᩴ;->᩸:I

    invoke-virtual {v0, v2}, Ll/ۨ᩷ᩴ;->ܽ(I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p1, Ll/ۚܿᩴ;->᩸:I

    invoke-virtual {v0, v2}, Ll/ۨ᩷ᩴ;->remove(I)Ljava/lang/Object;

    :cond_2
    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    return v1
.end method

.method public final size()I
    .locals 3

    .line 1346
    invoke-virtual {p0}, Ll/᩶᩷ᩴ;->iterator()Ll/ܶ֡ᩴ;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    move-object v2, v0

    check-cast v2, Ll/᩺᩷ᩴ;

    invoke-virtual {v2}, Ll/᩺᩷ᩴ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    move-object v2, v0

    check-cast v2, Ll/۬᩷ᩴ;

    invoke-virtual {v2}, Ll/᩺᩷ᩴ;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1306
    check-cast p1, Ll/ۨۜᩴ;

    check-cast p2, Ll/ۨۜᩴ;

    .line 1372
    invoke-interface {p1}, Ll/ۨۜᩴ;->֫()I

    move-result p1

    invoke-interface {p2}, Ll/ۨۜᩴ;->֫()I

    move-result p2

    iget-object v0, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ۨ᩷ᩴ;->ۧ(II)Ll/֫ۢᩴ;

    move-result-object p1

    check-cast p1, Ll/ۨ᩷ᩴ;

    invoke-virtual {p1}, Ll/ۨ᩷ᩴ;->ۜ()Ll/֨ۚᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1306
    check-cast p1, Ll/ۨۜᩴ;

    .line 1382
    iget-object v0, p0, Ll/᩶᩷ᩴ;->᩸:Ll/ۨ᩷ᩴ;

    invoke-interface {p1}, Ll/ۨۜᩴ;->֫()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۨ᩷ᩴ;->ۡ(I)Ll/֫ۢᩴ;

    move-result-object p1

    check-cast p1, Ll/ۨ᩷ᩴ;

    invoke-virtual {p1}, Ll/ۨ᩷ᩴ;->ۜ()Ll/֨ۚᩴ;

    move-result-object p1

    return-object p1
.end method
