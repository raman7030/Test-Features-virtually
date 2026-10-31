.class public final Ll/ܿ᩹֨;
.super Ll/ۡ᩹֨;
.source "T57T"


# instance fields
.field public final synthetic ᩳ:Ll/ۘ᩹֨;


# direct methods
.method public constructor <init>(Ll/ۘ᩹֨;)V
    .locals 2

    .line 279
    iput-object p1, p0, Ll/ܿ᩹֨;->ᩳ:Ll/ۘ᩹֨;

    .line 280
    sget-object v0, Ll/ۧ᩹֨;->ۗ:Ll/ۧ᩹֨;

    sget-object v1, Ll/ᩴۚ۠;->ܺۧ:Ll/ᩴۚ۠;

    invoke-direct {p0, p1, v0, v1}, Ll/ۡ᩹֨;-><init>(Ll/ۘ᩹֨;Ll/ۧ᩹֨;Ll/ᩴۚ۠;)V

    return-void
.end method

.method public static ֫(Ll/ۚ᩵۠;)Ll/ۖܶ۠;
    .locals 7

    .line 293
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 294
    iget-object p0, p0, Ll/ۚ᩵۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {p0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۚ۠;

    .line 295
    sget-object v2, Ll/ᩴۚ۠;->۟֫:Ll/ᩴۚ۠;

    invoke-virtual {v1, v2}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 296
    check-cast v1, Ll/ۡ֡۠;

    .line 933
    iget-object v2, v1, Ll/ۡ֡۠;->ۤ:Ll/ۖ֡۠;

    .line 297
    iget-wide v2, v2, Ll/ۖ֡۠;->۬:J

    const-wide v4, 0x1000000000L

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 227
    :cond_1
    invoke-virtual {v0, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 304
    :cond_2
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۚۚ۠;Ll/ۚۚ۠;Z)V
    .locals 0

    .line 277
    check-cast p1, Ll/᩵֡۠;

    check-cast p2, Ll/ܳ֡۠;

    if-nez p3, :cond_0

    .line 319
    iget-object p2, p0, Ll/ܿ᩹֨;->ᩳ:Ll/ۘ᩹֨;

    iget-object p2, p2, Ll/ۘ᩹֨;->ۢ:Ll/᩹ܶ۠;

    iget-object p1, p1, Ll/᩵֡۠;->ۨ:Ll/ۚ᩵۠;

    sget-object p3, Ll/ܰᩴ۠;->ᩴ:Ll/ۧܶ۠;

    invoke-virtual {p2, p1, p3}, Ll/ۖ֨۠;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۚۚ۠;)Z
    .locals 2

    .line 277
    check-cast p1, Ll/᩵֡۠;

    .line 285
    iget-object v0, p1, Ll/᩵֡۠;->۫:Ll/۫᩵۠;

    iget-object v0, v0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 286
    iget-object v1, p1, Ll/᩵֡۠;->ۨ:Ll/ۚ᩵۠;

    if-eqz v1, :cond_0

    sget-object v1, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    .line 287
    invoke-virtual {v0, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ܿ᩹֨;->ᩳ:Ll/ۘ᩹֨;

    iget-object v1, v1, Ll/ۘ᩹֨;->ܺ:Ll/ۛ᩸֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 288
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    :try_start_0
    invoke-virtual {v1, v0}, Ll/ۛ᩸֨;->֫(Ll/᩶֡֨;)Ll/ۛ֡֨;
    :try_end_0
    .catch Ll/ۛܶ֨; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    iget-object p1, p1, Ll/᩵֡۠;->ۨ:Ll/ۚ᩵۠;

    .line 289
    invoke-static {p1}, Ll/ܿ᩹֨;->֫(Ll/ۚ᩵۠;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->ۧ()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ۚۚ۠;)Ll/ۖܶ۠;
    .locals 4

    .line 277
    check-cast p1, Ll/᩵֡۠;

    .line 309
    iget-object v0, p0, Ll/ܿ᩹֨;->ᩳ:Ll/ۘ᩹֨;

    iget-object v1, v0, Ll/ۘ᩹֨;->ܳ:Ll/֫᩹֨;

    iget-object v2, p1, Ll/᩵֡۠;->ۨ:Ll/ۚ᩵۠;

    invoke-static {v2}, Ll/ܿ᩹֨;->֫(Ll/ۚ᩵۠;)Ll/ۖܶ۠;

    move-result-object v2

    iget-object v2, v2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۚۚ۠;

    const/4 v3, 0x0

    .line 53
    invoke-virtual {v1, v2, v3}, Ll/᩶ۚ۠;->֫(Ll/ۚۚ۠;Ljava/lang/Object;)Ll/ۚۚ۠;

    move-result-object v1

    .line 309
    check-cast v1, Ll/ۡ֡۠;

    .line 310
    iget-object v2, v1, Ll/ۡ֡۠;->ۨ:Ll/ۖܶ۠;

    .line 311
    iget-object v1, v1, Ll/ۡ֡۠;->ۗ:Ll/ۖ᩵۠;

    .line 312
    iget-object v0, v0, Ll/ۘ᩹֨;->ۡ:Ll/ܿ֨۠;

    invoke-virtual {v0, p1}, Ll/ܿ֨۠;->֫(Ll/ۗ۠۠;)V

    invoke-virtual {v0, v1, v2}, Ll/ܿ֨۠;->ۧ(Ll/ۚۚ۠;Ll/ۖܶ۠;)Ll/ܳ֡۠;

    move-result-object p1

    .line 313
    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method
