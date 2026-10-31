.class public final Ll/ۜ᩹֨;
.super Ll/᩻᩹֨;
.source "T57T"


# instance fields
.field public final synthetic ܿ:Ll/ۘ᩹֨;


# direct methods
.method public constructor <init>(Ll/ۘ᩹֨;)V
    .locals 1

    .line 417
    iput-object p1, p0, Ll/ۜ᩹֨;->ܿ:Ll/ۘ᩹֨;

    .line 418
    sget-object v0, Ll/ᩴۚ۠;->֨֫:Ll/ᩴۚ۠;

    invoke-direct {p0, p1, v0}, Ll/᩻᩹֨;-><init>(Ll/ۘ᩹֨;Ll/ᩴۚ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚۚ۠;Ll/ۚۚ۠;Z)V
    .locals 2

    .line 415
    check-cast p1, Ll/ۙ᩵۠;

    check-cast p2, Ll/ۙ᩵۠;

    .line 434
    iget-object p1, p1, Ll/ۙ᩵۠;->۫:Ll/ۢۚ۠;

    iget-object p2, p2, Ll/ۙ᩵۠;->۫:Ll/ۢۚ۠;

    if-nez p3, :cond_0

    .line 381
    iget-object p3, p0, Ll/᩻᩹֨;->ᩳ:Ll/ۘ᩹֨;

    iget-object v0, p3, Ll/ۘ᩹֨;->ܺ:Ll/ۛ᩸֨;

    iget-object v1, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    iget-object p2, p2, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    invoke-virtual {v0, v1, p2}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 382
    iget-object p2, p3, Ll/ۘ᩹֨;->ۢ:Ll/᩹ܶ۠;

    sget-object p3, Ll/ܰᩴ۠;->ۢ:Ll/ۧܶ۠;

    invoke-virtual {p2, p1, p3}, Ll/ۖ֨۠;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۚۚ۠;)Z
    .locals 1

    .line 415
    check-cast p1, Ll/ۙ᩵۠;

    .line 423
    iget-object p1, p1, Ll/ۙ᩵۠;->۫:Ll/ۢۚ۠;

    .line 364
    iget-object p1, p1, Ll/ۢۚ۠;->ܰ:Ll/۫᩵۠;

    iget p1, p1, Ll/ۚۚ۠;->᩸:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final ۧ(Ll/ۚۚ۠;)Ll/ۖܶ۠;
    .locals 5

    .line 415
    check-cast p1, Ll/ۙ᩵۠;

    .line 427
    iget-object v0, p0, Ll/ۜ᩹֨;->ܿ:Ll/ۘ᩹֨;

    iget-object v1, v0, Ll/ۘ᩹֨;->ܳ:Ll/֫᩹֨;

    const/4 v2, 0x0

    .line 53
    invoke-virtual {v1, p1, v2}, Ll/᩶ۚ۠;->֫(Ll/ۚۚ۠;Ljava/lang/Object;)Ll/ۚۚ۠;

    move-result-object v1

    .line 427
    check-cast v1, Ll/ۙ᩵۠;

    .line 428
    iget-object v3, p1, Ll/ۙ᩵۠;->۫:Ll/ۢۚ۠;

    .line 371
    iget-object v4, p0, Ll/᩻᩹֨;->ᩳ:Ll/ۘ᩹֨;

    iget-object v4, v4, Ll/ۘ᩹֨;->ܳ:Ll/֫᩹֨;

    .line 53
    invoke-virtual {v4, v3, v2}, Ll/᩶ۚ۠;->֫(Ll/ۚۚ۠;Ljava/lang/Object;)Ll/ۚۚ۠;

    move-result-object v3

    .line 371
    check-cast v3, Ll/ۢۚ۠;

    .line 372
    iput-object v2, v3, Ll/ۢۚ۠;->ܰ:Ll/۫᩵۠;

    .line 428
    iput-object v3, v1, Ll/ۙ᩵۠;->۫:Ll/ۢۚ۠;

    .line 429
    iget-object v0, v0, Ll/ۘ᩹֨;->ۡ:Ll/ܿ֨۠;

    iget-object p1, p1, Ll/ۙ᩵۠;->ۗ:Ll/ۨ֡۠;

    invoke-virtual {v0, p1}, Ll/ܿ֨۠;->֫(Ll/ۗ۠۠;)V

    const-wide/16 v2, 0x0

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {v0, v2, v3, p1}, Ll/ܿ֨۠;->֫(JLl/ۖܶ۠;)Ll/ۖ᩵۠;

    move-result-object p1

    iput-object p1, v1, Ll/ۙ᩵۠;->ۗ:Ll/ۨ֡۠;

    .line 430
    invoke-static {v1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method
