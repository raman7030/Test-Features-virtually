.class public final Ll/ܳ᩹֨;
.super Ll/᩻᩹֨;
.source "T57T"


# instance fields
.field public final synthetic ܿ:Ll/ۘ᩹֨;


# direct methods
.method public constructor <init>(Ll/ۘ᩹֨;)V
    .locals 1

    .line 393
    iput-object p1, p0, Ll/ܳ᩹֨;->ܿ:Ll/ۘ᩹֨;

    .line 394
    sget-object v0, Ll/ᩴۚ۠;->᩹ܽ:Ll/ᩴۚ۠;

    invoke-direct {p0, p1, v0}, Ll/᩻᩹֨;-><init>(Ll/ۘ᩹֨;Ll/ᩴۚ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚۚ۠;Ll/ۚۚ۠;Z)V
    .locals 2

    .line 391
    check-cast p1, Ll/ۢۚ۠;

    check-cast p2, Ll/ۢۚ۠;

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
    .locals 2

    .line 391
    check-cast p1, Ll/ۢۚ۠;

    .line 398
    iget-object v0, p1, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Ll/ۢۚ۠;->۬:Ll/۫᩵۠;

    if-eqz v0, :cond_1

    .line 364
    iget-object v0, p1, Ll/ۢۚ۠;->ܰ:Ll/۫᩵۠;

    iget v0, v0, Ll/ۚۚ۠;->᩸:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 399
    :cond_0
    iget-object v0, p0, Ll/ܳ᩹֨;->ܿ:Ll/ۘ᩹֨;

    iget-object v0, v0, Ll/ۘ᩹֨;->ܿ:Ll/ۢۗ֨;

    .line 400
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1356
    new-instance v0, Ll/ۧۗ֨;

    .line 3437
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 1362
    iput-object v1, v0, Ll/ۧۗ֨;->֫:Ll/ۨ۠۠;

    const/4 v1, 0x1

    .line 1363
    iput-boolean v1, v0, Ll/ۧۗ֨;->ۧ:Z

    .line 1357
    iget-object p1, p1, Ll/ۢۚ۠;->۬:Ll/۫᩵۠;

    invoke-virtual {v0, p1}, Ll/ܳ֨۠;->ۧ(Ll/ۚۚ۠;)V

    .line 1358
    iget-object p1, v0, Ll/ۧۗ֨;->֫:Ll/ۨ۠۠;

    if-nez p1, :cond_1

    return v1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ۚۚ۠;)Ll/ۖܶ۠;
    .locals 2

    .line 391
    check-cast p1, Ll/ۢۚ۠;

    .line 371
    iget-object v0, p0, Ll/᩻᩹֨;->ᩳ:Ll/ۘ᩹֨;

    iget-object v0, v0, Ll/ۘ᩹֨;->ܳ:Ll/֫᩹֨;

    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, p1, v1}, Ll/᩶ۚ۠;->֫(Ll/ۚۚ۠;Ljava/lang/Object;)Ll/ۚۚ۠;

    move-result-object p1

    .line 371
    check-cast p1, Ll/ۢۚ۠;

    .line 372
    iput-object v1, p1, Ll/ۢۚ۠;->ܰ:Ll/۫᩵۠;

    .line 404
    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method
