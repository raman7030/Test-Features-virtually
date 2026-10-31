.class public final Ll/֡۬֨;
.super Ll/ܳ֨۠;
.source "542M"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܽ:Ljava/util/HashSet;

.field public final synthetic ᩳ:Ll/ܶ۬֨;


# direct methods
.method public constructor <init>(Ll/ܶ۬֨;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2269
    iput-object p1, p0, Ll/֡۬֨;->ᩳ:Ll/ܶ۬֨;

    .line 2271
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/֡۬֨;->ܽ:Ljava/util/HashSet;

    const/4 p1, 0x0

    .line 2272
    iput-boolean p1, p0, Ll/֡۬֨;->֫:Z

    .line 2273
    iput-boolean p1, p0, Ll/֡۬֨;->ۧ:Z

    return-void
.end method

.method private ֫(Ll/ۛ֡֨;Ll/ۚۚ۠;)V
    .locals 4

    if-eqz p1, :cond_1

    .line 2276
    iget-object v0, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v0, v1, :cond_1

    .line 2277
    iget-object v0, p0, Ll/֡۬֨;->ᩳ:Ll/ܶ۬֨;

    invoke-static {v0}, Ll/ܶ۬֨;->ܽ(Ll/ܶ۬֨;)Ll/ܰ۫֨;

    move-result-object v2

    move-object v3, p1

    check-cast v3, Ll/᩶֡֨;

    .line 151
    iget-object v2, v2, Ll/ܰ۫֨;->᩵:Ll/ܽܿ۠;

    invoke-virtual {v2, v3}, Ll/ܽܿ۠;->֫(Ll/᩶֡֨;)Ll/֫ۤ֨;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 2279
    invoke-static {v0}, Ll/ܶ۬֨;->ܿ(Ll/ܶ۬֨;)Ll/᩹ܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object p1

    .line 2281
    :try_start_0
    invoke-static {v0}, Ll/ܶ۬֨;->ܿ(Ll/ܶ۬֨;)Ll/᩹ܶ۠;

    move-result-object p2

    iget-object v1, v2, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object v1, v1, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    invoke-virtual {p2, v1}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    .line 2282
    iget-object p2, v2, Ll/֫ۤ֨;->ۤ:Ll/ۚۚ۠;

    invoke-virtual {p0, p2}, Ll/ܳ֨۠;->ۧ(Ll/ۚۚ۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2285
    invoke-static {v0}, Ll/ܶ۬֨;->ܿ(Ll/ܶ۬֨;)Ll/᩹ܶ۠;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܳ۠۠;->֫()Ll/ᩳ᩶۠;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    return-void

    :catchall_0
    move-exception p2

    invoke-static {v0}, Ll/ܶ۬֨;->ܿ(Ll/ܶ۬֨;)Ll/᩹ܶ۠;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܳ۠۠;->֫()Ll/ᩳ᩶۠;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    .line 2286
    throw p2

    .line 2287
    :cond_0
    iget-object v0, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-ne v0, v1, :cond_2

    .line 2288
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Ll/֡۬֨;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Ll/ۖܶ۠;)V

    return-void

    :cond_1
    if-eqz p1, :cond_3

    .line 2290
    iget-object p1, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object p2, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-eq p1, p2, :cond_2

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_0
    const/4 p1, 0x1

    .line 2292
    iput-boolean p1, p0, Ll/֡۬֨;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ᩵۠;)V
    .locals 3

    .line 2319
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 851
    iget-object v1, p1, Ll/ۚ᩵۠;->۬:Ll/۫᩵۠;

    if-eqz v1, :cond_0

    .line 2321
    invoke-virtual {v0, v1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    .line 854
    :cond_0
    iget-object v1, p1, Ll/ۚ᩵۠;->۫:Ll/ۖܶ۠;

    if-eqz v1, :cond_1

    .line 2324
    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚۚ۠;

    .line 2325
    invoke-virtual {v0, v2}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    goto :goto_0

    .line 2328
    :cond_1
    iget-object v1, p1, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    invoke-virtual {p0, v1, p1, v0}, Ll/֡۬֨;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Ll/ۖܶ۠;)V

    return-void
.end method

.method public final ֫(Ll/ۛ֡֨;Ll/ۚۚ۠;Ll/ۖܶ۠;)V
    .locals 5

    .line 2332
    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v2, 0x40000000

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto/16 :goto_4

    .line 2334
    :cond_0
    iget-object v0, p0, Ll/֡۬֨;->ܽ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 2335
    iput-boolean v2, p0, Ll/֡۬֨;->֫:Z

    .line 2336
    iget-object p3, p0, Ll/֡۬֨;->ᩳ:Ll/ܶ۬֨;

    check-cast p1, Ll/ܳ֡֨;

    invoke-static {p3, p2, p1}, Ll/ܶ۬֨;->֫(Ll/ܶ۬֨;Ll/ۚۚ۠;Ll/ܳ֡֨;)V

    return-void

    .line 2337
    :cond_1
    iget-object v1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v1

    if-nez v1, :cond_7

    .line 2339
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2340
    iget-object v1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    sget-object v3, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v1, v3}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2341
    invoke-virtual {p3}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2342
    invoke-virtual {p0, p3}, Ll/ܳ֨۠;->֫(Ll/ۖܶ۠;)V

    goto :goto_1

    .line 2345
    :cond_2
    iget-object p3, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    check-cast p3, Ll/᩶ۚ֨;

    .line 2346
    iget-object v1, p3, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    if-eqz v1, :cond_5

    iget-object v3, p3, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    if-nez v3, :cond_3

    goto :goto_2

    .line 2352
    :cond_3
    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-direct {p0, v1, p2}, Ll/֡۬֨;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;)V

    .line 2353
    iget-object p3, p3, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    invoke-virtual {p3}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 2354
    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-direct {p0, v1, p2}, Ll/֡۬֨;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;)V

    goto :goto_0

    .line 2357
    :cond_4
    :goto_1
    iget-object p3, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v1, p3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_6

    .line 2358
    invoke-direct {p0, p3, p2}, Ll/֡۬֨;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;)V

    goto :goto_3

    .line 2349
    :cond_5
    :goto_2
    iput-boolean v2, p0, Ll/֡۬֨;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2362
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void

    :cond_6
    :goto_3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 2363
    throw p2

    :cond_7
    :goto_4
    return-void
.end method

.method public final ֫(Ll/ۛ᩵۠;)V
    .locals 1

    .line 331
    iget-object v0, p1, Ll/ۛ᩵۠;->۬:Ll/۫᩵۠;

    invoke-virtual {p0, v0}, Ll/ܳ֨۠;->ۧ(Ll/ۚۚ۠;)V

    .line 2299
    iget-object v0, p1, Ll/ۛ᩵۠;->۫:Ll/ۛ֡֨;

    invoke-direct {p0, v0, p1}, Ll/֡۬֨;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/۟᩵۠;)V
    .locals 1

    .line 2304
    iget-object v0, p1, Ll/۟᩵۠;->۬:Ll/ۛ֡֨;

    invoke-direct {p0, v0, p1}, Ll/֡۬֨;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/ܽۚ۠;)V
    .locals 0

    .line 2309
    iget-object p1, p1, Ll/ܽۚ۠;->۬:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/ܳ֨۠;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/᩻᩵۠;)V
    .locals 0

    .line 2314
    iget-object p1, p1, Ll/᩻᩵۠;->ۗ:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/ܳ֨۠;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method
