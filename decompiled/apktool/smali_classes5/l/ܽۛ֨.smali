.class public abstract Ll/ܽۛ֨;
.super Ll/ܽۨ֨;
.source "M43N"


# instance fields
.field public final ֫:Ll/᩺ܶ۠;

.field public final ۧ:Ljava/util/HashMap;

.field public ܽ:Ll/ۖܶ۠;


# direct methods
.method public constructor <init>(Ll/ۖܶ۠;)V
    .locals 3

    .line 1328
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1383
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܽۛ֨;->ۧ:Ljava/util/HashMap;

    .line 1386
    new-instance v0, Ll/᩺ܶ۠;

    const v1, 0x7fffffff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ܽۛ֨;->֫:Ll/᩺ܶ۠;

    .line 1349
    iput-object p1, p0, Ll/ܽۛ֨;->ܽ:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ۛ֨;)Ll/᩵ۛ֨;
    .locals 5

    .line 1393
    iget-object v0, p0, Ll/ܽۛ֨;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 1395
    iget-object p1, p1, Ll/֡ۛ֨;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iget-object v0, p0, Ll/ܽۛ֨;->֫:Ll/᩺ܶ۠;

    move-object v1, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵ۛ֨;

    .line 1396
    iget-object v3, v2, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ljava/util/Collection;

    iget-object v4, p0, Ll/ܽۛ֨;->ܽ:Ll/ۖܶ۠;

    invoke-static {v3, v4}, Ljava/util/Collections;->disjoint(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1397
    invoke-virtual {p0, v2}, Ll/ܽۛ֨;->֫(Ll/᩵ۛ֨;)Ll/᩺ܶ۠;

    move-result-object v2

    .line 1400
    iget-object v3, v2, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, v1, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ge v3, v4, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_1
    if-eq v1, v0, :cond_2

    .line 1409
    iget-object p1, v1, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    check-cast p1, Ll/ۖܶ۠;

    iget-object p1, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/᩵ۛ֨;

    return-object p1

    .line 1407
    :cond_2
    new-instance p1, Ll/֨ۛ֨;

    .line 1310
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 1407
    throw p1
.end method

.method public final ֫(Ll/᩵ۛ֨;)Ll/᩺ܶ۠;
    .locals 7

    .line 1359
    iget-object v0, p0, Ll/ܽۛ֨;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ܶ۠;

    if-nez v1, :cond_5

    .line 1762
    iget-object v1, p1, Ll/᩵ۛ֨;->ۙ:Ljava/util/LinkedHashSet;

    iget-object v2, p1, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 1763
    :cond_0
    iget-object v1, p1, Ll/᩵ۛ֨;->ۙ:Ljava/util/LinkedHashSet;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵ۛ֨;

    if-eq v3, p1, :cond_1

    .line 1367
    new-instance v1, Ll/᩺ܶ۠;

    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v3

    check-cast v2, Ll/ᩴܶ۠;

    invoke-virtual {v2}, Ll/ᩴܶ۠;->ۧ()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v3, v2}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1703
    iget-object v2, p1, Ll/᩵ۛ֨;->ۙ:Ljava/util/LinkedHashSet;

    .line 1368
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵ۛ֨;

    if-ne v3, p1, :cond_2

    goto :goto_0

    .line 1370
    :cond_2
    invoke-virtual {p0, v3}, Ll/ܽۛ֨;->֫(Ll/᩵ۛ֨;)Ll/᩺ܶ۠;

    move-result-object v3

    .line 1371
    new-instance v4, Ll/᩺ܶ۠;

    iget-object v5, v1, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    check-cast v5, Ll/ۖܶ۠;

    iget-object v6, v3, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    check-cast v6, Ll/ۖܶ۠;

    invoke-virtual {v5, v6}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v5

    iget-object v1, v1, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    .line 1372
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v3, v3, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v4, v5, v1}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v1, v4

    goto :goto_0

    .line 1364
    :cond_3
    :goto_1
    new-instance v1, Ll/᩺ܶ۠;

    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v3

    check-cast v2, Ll/ᩴܶ۠;

    invoke-virtual {v2}, Ll/ᩴܶ۠;->ۧ()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v3, v2}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1377
    :cond_4
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-object v1
.end method
