.class public final Ll/᩸۫ܺ;
.super Ll/᩶ۨܺ;
.source "I5ZF"


# instance fields
.field public final ᩸:Ljava/util/PriorityQueue;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;Ljava/util/Comparator;)V
    .locals 4

    .line 1337
    invoke-direct {p0}, Ll/᩶ۨܺ;-><init>()V

    .line 1340
    new-instance v0, Ll/۠۫ܺ;

    invoke-direct {v0, p2}, Ll/۠۫ܺ;-><init>(Ljava/util/Comparator;)V

    .line 1348
    new-instance p2, Ljava/util/PriorityQueue;

    const/4 v1, 0x2

    invoke-direct {p2, v1, v0}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    iput-object p2, p0, Ll/᩸۫ܺ;->᩸:Ljava/util/PriorityQueue;

    .line 1351
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    .line 1352
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1353
    iget-object v1, p0, Ll/᩸۫ܺ;->᩸:Ljava/util/PriorityQueue;

    new-instance v2, Ll/ܶ۫ܺ;

    invoke-static {v0}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;)Ll/ۛۤܺ;

    move-result-object v0

    add-int/lit8 v3, p2, 0x1

    invoke-direct {v2, v0, p2}, Ll/ܶ۫ܺ;-><init>(Ll/ۛۤܺ;I)V

    invoke-virtual {v1, v2}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    move p2, v3

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1360
    iget-object v0, p0, Ll/᩸۫ܺ;->᩸:Ljava/util/PriorityQueue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1366
    iget-object v0, p0, Ll/᩸۫ܺ;->᩸:Ljava/util/PriorityQueue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ۫ܺ;

    .line 1367
    iget-object v2, v1, Ll/ܶ۫ܺ;->ۧ:Ll/ۛۤܺ;

    .line 1368
    check-cast v2, Ll/᩹۫ܺ;

    invoke-virtual {v2}, Ll/᩹۫ܺ;->next()Ljava/lang/Object;

    move-result-object v3

    .line 1369
    invoke-virtual {v2}, Ll/᩹۫ܺ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1370
    invoke-virtual {v0, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v3
.end method
