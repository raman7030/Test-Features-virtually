.class public final Ll/᩷᩹֨;
.super Ll/ۡ᩹֨;
.source "T57T"


# instance fields
.field public final synthetic ᩳ:Ll/ۘ᩹֨;


# direct methods
.method public constructor <init>(Ll/ۘ᩹֨;)V
    .locals 2

    .line 329
    iput-object p1, p0, Ll/᩷᩹֨;->ᩳ:Ll/ۘ᩹֨;

    .line 330
    sget-object v0, Ll/ۧ᩹֨;->۫:Ll/ۧ᩹֨;

    sget-object v1, Ll/ᩴۚ۠;->۬:Ll/ᩴۚ۠;

    invoke-direct {p0, p1, v0, v1}, Ll/ۡ᩹֨;-><init>(Ll/ۘ᩹֨;Ll/ۧ᩹֨;Ll/ᩴۚ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚۚ۠;Ll/ۚۚ۠;Z)V
    .locals 0

    .line 327
    check-cast p1, Ll/ܺ֡۠;

    check-cast p2, Ll/ܺ֡۠;

    if-nez p3, :cond_0

    .line 349
    iget-object p2, p0, Ll/᩷᩹֨;->ᩳ:Ll/ۘ᩹֨;

    iget-object p2, p2, Ll/ۘ᩹֨;->ۢ:Ll/᩹ܶ۠;

    sget-object p3, Ll/ܰᩴ۠;->ۡ:Ll/ۧܶ۠;

    invoke-virtual {p2, p1, p3}, Ll/ۖ֨۠;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۚۚ۠;)Z
    .locals 0

    .line 327
    check-cast p1, Ll/ܺ֡۠;

    .line 335
    iget-object p1, p1, Ll/ܺ֡۠;->ۤ:Ll/ۖܶ۠;

    if-eqz p1, :cond_0

    .line 336
    invoke-virtual {p1}, Ll/ۖܶ۠;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/ۚۚ۠;)Ll/ۖܶ۠;
    .locals 2

    .line 327
    check-cast p1, Ll/ܺ֡۠;

    .line 340
    iget-object v0, p0, Ll/᩷᩹֨;->ᩳ:Ll/ۘ᩹֨;

    iget-object v0, v0, Ll/ۘ᩹֨;->ܳ:Ll/֫᩹֨;

    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, p1, v1}, Ll/᩶ۚ۠;->֫(Ll/ۚۚ۠;Ljava/lang/Object;)Ll/ۚۚ۠;

    move-result-object p1

    .line 340
    check-cast p1, Ll/ܺ֡۠;

    .line 341
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p1, Ll/ܺ֡۠;->ۤ:Ll/ۖܶ۠;

    .line 342
    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method
