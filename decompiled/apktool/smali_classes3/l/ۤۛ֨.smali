.class public final enum Ll/ۤۛ֨;
.super Ll/ۧۨ֨;
.source "M43N"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILl/᩵֨֨;)V
    .locals 1

    const/4 v0, 0x0

    .line 1435
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۧۨ֨;-><init>(Ljava/lang/String;ILl/᩵֨֨;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩵֨֨;)V
    .locals 2

    const-string v0, "LOWER"

    const/4 v1, 0x1

    .line 0
    invoke-direct {p0, v0, v1, p1}, Ll/ۤۛ֨;-><init>(Ljava/lang/String;ILl/᩵֨֨;)V

    return-void
.end method


# virtual methods
.method public ܽ(Ll/֨֨֨;Ll/֡ۨ֨;)Ll/ۙ֨֨;
    .locals 4

    .line 1438
    iget-object v0, p2, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    .line 1439
    invoke-virtual {p0, p1, p2}, Ll/ۧۨ֨;->ۧ(Ll/֨֨֨;Ll/֡ۨ֨;)Ll/ۖܶ۠;

    move-result-object p2

    .line 1441
    iget-object v1, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-nez v1, :cond_0

    iget-object v1, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    goto :goto_0

    :cond_0
    iget-object v1, v0, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    invoke-virtual {v1, p2}, Ll/ۛ᩸֨;->ܿ(Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object v1

    .line 1442
    :goto_0
    invoke-virtual {v1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Ll/ۢ۠֨;->۟:Ll/ۢ۠֨;

    invoke-virtual {v1, v2}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v2

    if-nez v2, :cond_1

    return-object v1

    .line 1443
    :cond_1
    iget-object v0, v0, Ll/ۜۨ֨;->ᩳ:Ll/ۛ۠۠;

    iget-object p1, p1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    sget-object v1, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7778
    new-instance v1, Ll/ۨ۠۠;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    const-string p1, "compiler"

    const-string p2, "no.unique.minimal.instance.exists"

    invoke-direct {v1, p1, p2, v2}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1443
    invoke-virtual {v0, v1}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p1

    invoke-static {p1}, Ll/ۜۨ֨;->֫(Ll/ܽܶ۠;)Ll/۬ۛ֨;

    move-result-object p1

    throw p1
.end method
