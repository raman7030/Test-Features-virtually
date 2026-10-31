.class public Ll/᩺ܽ۠;
.super Ll/ܰܽ۠;
.source "A7MK"


# instance fields
.field public ֫:Ljava/util/LinkedHashMap;

.field public ۧ:Ll/ܰܽ۠;

.field public final synthetic ܽ:Ll/֫ᩳ۠;


# direct methods
.method public constructor <init>(Ll/֫ᩳ۠;)V
    .locals 0

    .line 751
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 765
    iput-object p1, p0, Ll/᩺ܽ۠;->ܽ:Ll/֫ᩳ۠;

    .line 766
    iget-object p1, p1, Ll/֫ᩳ۠;->ܽ:Ll/ܰܽ۠;

    iput-object p1, p0, Ll/᩺ܽ۠;->ۧ:Ll/ܰܽ۠;

    .line 767
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll/᩺ܽ۠;->֫:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۖܶ۠;
    .locals 9

    .line 795
    iget-object v0, p0, Ll/᩺ܽ۠;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    .line 796
    :cond_0
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 797
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 798
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫֡֨;

    .line 848
    iget-object v4, p0, Ll/᩺ܽ۠;->ܽ:Ll/֫ᩳ۠;

    invoke-static {v4}, Ll/֫ᩳ۠;->ۧ(Ll/֫ᩳ۠;)Ll/ܿ֨۠;

    move-result-object v4

    .line 111
    iput p1, v4, Ll/ܿ֨۠;->ܽ:I

    const/4 v5, 0x0

    .line 848
    invoke-virtual {v4, v3, v5}, Ll/ܿ֨۠;->֫(Ll/۫֡֨;Ll/۫᩵۠;)Ll/ۢۚ۠;

    move-result-object v3

    .line 799
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܿ֡֨;

    .line 1893
    iget-wide v4, v4, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v6, 0x1000000000000000L

    and-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-eqz v8, :cond_2

    .line 800
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ֡֨;

    iget-object v4, p0, Ll/᩺ܽ۠;->ۧ:Ll/ܰܽ۠;

    invoke-virtual {v4, v2, v3}, Ll/ܰܽ۠;->֫(Ll/ܿ֡֨;Ll/ۢۚ۠;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 227
    :cond_2
    invoke-virtual {v1, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 804
    :cond_3
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۨ֡۠;)Ll/ۨ֡۠;
    .locals 4

    .line 819
    iget v0, p1, Ll/ۚۚ۠;->᩸:I

    invoke-virtual {p0, v0}, Ll/᩺ܽ۠;->֫(I)Ll/ۖܶ۠;

    move-result-object v0

    .line 820
    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 821
    iget-object v1, p0, Ll/᩺ܽ۠;->ܽ:Ll/֫ᩳ۠;

    invoke-static {v1}, Ll/֫ᩳ۠;->ۧ(Ll/֫ᩳ۠;)Ll/ܿ֨۠;

    move-result-object v1

    iget v2, p1, Ll/ۚۚ۠;->᩸:I

    .line 111
    iput v2, v1, Ll/ܿ֨۠;->ܽ:I

    const-wide/16 v2, 0x0

    .line 821
    invoke-virtual {v0, p1}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {v1, v2, v3, p1}, Ll/ܿ֨۠;->֫(JLl/ۖܶ۠;)Ll/ۖ᩵۠;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public ֫(Ll/ܿ֡֨;)Ll/۫֡֨;
    .locals 7

    .line 772
    iget-object v0, p0, Ll/᩺ܽ۠;->ۧ:Ll/ܰܽ۠;

    invoke-virtual {v0, p1}, Ll/ܰܽ۠;->֫(Ll/ܿ֡֨;)Ll/۫֡֨;

    move-result-object v0

    if-nez v0, :cond_0

    .line 774
    new-instance v0, Ll/۫֡֨;

    .line 111
    iget-wide v2, p1, Ll/ۛ֡֨;->᩶:J

    .line 774
    iget-object v4, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v5, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v1, p0, Ll/᩺ܽ۠;->ܽ:Ll/֫ᩳ۠;

    invoke-static {v1}, Ll/֫ᩳ۠;->֫(Ll/֫ᩳ۠;)Ll/ۘ֡֨;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 775
    invoke-virtual {p1}, Ll/ۛ֡֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۛ֡֨;->ۜ(Ll/ۖܶ۠;)V

    .line 776
    iget-object v1, p0, Ll/᩺ܽ۠;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final ֫(Ll/۫᩵۠;)Ll/۫᩵۠;
    .locals 5

    .line 831
    iget-object v0, p0, Ll/᩺ܽ۠;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫֡֨;

    .line 832
    iget-object v2, p0, Ll/᩺ܽ۠;->ܽ:Ll/֫ᩳ۠;

    invoke-static {v2}, Ll/֫ᩳ۠;->ۧ(Ll/֫ᩳ۠;)Ll/ܿ֨۠;

    move-result-object v3

    iget v4, p1, Ll/ۚۚ۠;->᩸:I

    .line 111
    iput v4, v3, Ll/ܿ֨۠;->ܽ:I

    .line 848
    invoke-static {v2}, Ll/֫ᩳ۠;->ۧ(Ll/֫ᩳ۠;)Ll/ܿ֨۠;

    move-result-object v2

    .line 111
    iput v4, v2, Ll/ܿ֨۠;->ܽ:I

    const/4 v4, 0x0

    .line 848
    invoke-virtual {v2, v1, v4}, Ll/ܿ֨۠;->֫(Ll/۫֡֨;Ll/۫᩵۠;)Ll/ۢۚ۠;

    move-result-object v1

    .line 832
    invoke-virtual {v3, v1, p1}, Ll/ܿ֨۠;->֫(Ll/ۢۚ۠;Ll/۫᩵۠;)Ll/ۘۚ۠;

    move-result-object v1

    iget-object p1, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 471
    iput-object p1, v1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    move-object p1, v1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public final ֫()Ll/ܰܽ۠;
    .locals 2

    .line 839
    iget-object v0, p0, Ll/᩺ܽ۠;->ܽ:Ll/֫ᩳ۠;

    iget-object v1, p0, Ll/᩺ܽ۠;->ۧ:Ll/ܰܽ۠;

    iput-object v1, v0, Ll/֫ᩳ۠;->ܽ:Ll/ܰܽ۠;

    return-object v1
.end method

.method public ֫(Ll/ܿ֡֨;Ll/ۢۚ۠;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ܿ֡֨;)Ll/۫֡֨;
    .locals 2

    .line 783
    iget-object v0, p0, Ll/᩺ܽ۠;->ۧ:Ll/ܰܽ۠;

    invoke-virtual {v0, p1}, Ll/ܰܽ۠;->ۧ(Ll/ܿ֡֨;)Ll/۫֡֨;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 787
    :cond_0
    iget-object v0, p0, Ll/᩺ܽ۠;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۨܽ۠;

    invoke-direct {v1, p1}, Ll/ۨܽ۠;-><init>(Ll/ܿ֡֨;)V

    .line 788
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 789
    invoke-interface {p1}, Ll/ܿ᩺ᩴ;->findFirst()Ll/ܽ۫ᩴ;

    move-result-object p1

    new-instance v0, Ll/ܽۤ֨;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/ܽۤ֨;-><init>(I)V

    .line 790
    invoke-virtual {p1, v0}, Ll/ܽ۫ᩴ;->map(Ljava/util/function/Function;)Ll/ܽ۫ᩴ;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫֡֨;

    return-object p1
.end method
