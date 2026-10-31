.class public abstract Ll/ܽ᩶֨;
.super Ll/֨۫֨;
.source "I7LP"


# instance fields
.field public ֫֫:Ll/۫᩵۠;

.field public ۧ֫:Ljava/util/Map;

.field public final synthetic ܽ֫:Ll/ۚ᩶֨;


# direct methods
.method public constructor <init>(Ll/ۚ᩶֨;Ll/۫᩵۠;Ll/֫ۤ֨;Ll/۫᩵۠;Ljava/util/Map;)V
    .locals 0

    .line 345
    iput-object p1, p0, Ll/ܽ᩶֨;->ܽ֫:Ll/ۚ᩶֨;

    .line 346
    invoke-static {p1}, Ll/ۚ᩶֨;->ۧ(Ll/ۚ᩶֨;)Ll/۫۫֨;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1, p2, p3}, Ll/֨۫֨;-><init>(Ll/۫۫֨;Ll/۫᩵۠;Ll/֫ۤ֨;)V

    .line 347
    iput-object p4, p0, Ll/ܽ᩶֨;->֫֫:Ll/۫᩵۠;

    .line 348
    iput-object p5, p0, Ll/ܽ᩶֨;->ۧ֫:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ֡֨;Ll/ܽܽ۠;)Ll/ۙ֨֨;
    .locals 4

    .line 369
    iget-object v0, p0, Ll/֨۫֨;->ۨ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 370
    invoke-super {p0, p1, p2}, Ll/֨۫֨;->֫(Ll/ۛ֡֨;Ll/ܽܽ۠;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 372
    :cond_0
    iget-object v0, p0, Ll/ܽ᩶֨;->ۧ֫:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 373
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۗ֨;

    iget-object v2, v2, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    invoke-interface {v2}, Ll/ۘ۬֨;->ۧ()Ll/ۜ۫֨;

    move-result-object v2

    .line 374
    iget-object v3, v2, Ll/ۜ۫֨;->ܳ:Ll/ܽܽ۠;

    if-ne v3, p2, :cond_1

    iget-object v2, v2, Ll/ۜ۫֨;->ᩳ:Ll/ۛ֡֨;

    if-ne v2, p1, :cond_1

    .line 375
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙ֨֨;

    return-object p1

    .line 378
    :cond_2
    sget-object p1, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    return-object p1
.end method

.method public final ֫(Ll/᩻ۗ֨;Ll/ۜ۫֨;)Ll/ۙ֨֨;
    .locals 4

    .line 353
    iget-object v0, p2, Ll/ۜ۫֨;->ܽ:Ll/ܰ۬֨;

    sget-object v1, Ll/ܰ۬֨;->᩶:Ll/ܰ۬֨;

    if-ne v0, v1, :cond_1

    .line 354
    iget-object v0, p1, Ll/᩻ۗ֨;->ᩳ:Ll/ۙ֨֨;

    sget-object v1, Ll/ۙ֨֨;->ۗ:Ll/ۨۚ֨;

    if-ne v0, v1, :cond_0

    .line 355
    invoke-super {p0, p1, p2}, Ll/֨۫֨;->֫(Ll/᩻ۗ֨;Ll/ۜ۫֨;)Ll/ۙ֨֨;

    move-result-object p2

    goto :goto_0

    .line 356
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܽ᩶֨;->ۧ(Ll/᩻ۗ֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 357
    :goto_0
    iget-object v0, p0, Ll/ܽ᩶֨;->ۧ֫:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    .line 360
    :cond_1
    iget-object v0, p0, Ll/֨۫֨;->ۤ:Ll/֫ۤ֨;

    iget-object v0, v0, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    check-cast v0, Ll/ۡۗ֨;

    iget-object v0, v0, Ll/ۡۗ֨;->֫:Ll/۟۬֨;

    iget-boolean v0, v0, Ll/۟۬֨;->᩸:Z

    if-nez v0, :cond_2

    .line 361
    iget-object v0, p0, Ll/ܽ᩶֨;->ܽ֫:Ll/ۚ᩶֨;

    iget-object v1, v0, Ll/ۚ᩶֨;->֫:Ljava/util/HashMap;

    new-instance v2, Ll/֡᩶֨;

    iget-object v3, p0, Ll/֨۫֨;->۟:Ll/۫᩵۠;

    invoke-direct {v2, v0, v3}, Ll/֡᩶֨;-><init>(Ll/ۚ᩶֨;Ll/ۚۚ۠;)V

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    :cond_2
    invoke-super {p0, p1, p2}, Ll/֨۫֨;->֫(Ll/᩻ۗ֨;Ll/ۜ۫֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۜ۫֨;)Ll/ۚۚ۠;
    .locals 2

    .line 384
    iget-object v0, p0, Ll/֨۫֨;->ۨ:Ljava/util/HashSet;

    iget-object v1, p1, Ll/ۜ۫֨;->ᩳ:Ll/ۛ֡֨;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 385
    invoke-super {p0, p1}, Ll/֨۫֨;->֫(Ll/ۜ۫֨;)Ll/ۚۚ۠;

    move-result-object p1

    return-object p1

    .line 386
    :cond_0
    iget-object p1, p0, Ll/ܽ᩶֨;->֫֫:Ll/۫᩵۠;

    return-object p1
.end method

.method public abstract ֫(Ll/֫ۤ֨;Ll/۫᩵۠;)Ll/ܽ᩶֨;
.end method

.method public abstract ۧ(Ll/᩻ۗ֨;)Ll/ۙ֨֨;
.end method
