.class public final enum Ll/֫ۨ֨;
.super Ll/ۧۨ֨;
.source "M43N"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILl/᩵֨֨;)V
    .locals 1

    const/4 v0, 0x0

    .line 1509
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۧۨ֨;-><init>(Ljava/lang/String;ILl/᩵֨֨;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩵֨֨;)V
    .locals 2

    const-string v0, "CAPTURED"

    const/4 v1, 0x5

    .line 0
    invoke-direct {p0, v0, v1, p1}, Ll/֫ۨ֨;-><init>(Ljava/lang/String;ILl/᩵֨֨;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨֨֨;Ll/֡ۨ֨;)Z
    .locals 4

    .line 1512
    invoke-virtual {p1}, Ll/֨֨֨;->ۤ֫()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [Ll/᩵֨֨;

    sget-object v2, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    aput-object v2, v0, v1

    sget-object v2, Ll/᩵֨֨;->᩶:Ll/᩵֨֨;

    const/4 v3, 0x1

    aput-object v2, v0, v3

    .line 1513
    invoke-virtual {p1, v0}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/֡ۨ֨;->ܽ(Ll/ۖܶ۠;)Z

    move-result p1

    if-nez p1, :cond_0

    return v3

    :cond_0
    return v1
.end method

.method public ܽ(Ll/֨֨֨;Ll/֡ۨ֨;)Ll/ۙ֨֨;
    .locals 8

    .line 1518
    iget-object v0, p2, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    .line 1519
    sget-object v1, Ll/ۧۨ֨;->۫:Ll/ۧۨ֨;

    invoke-virtual {v1, p1, p2}, Ll/ۧۨ֨;->ۧ(Ll/֨֨֨;Ll/֡ۨ֨;)Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1520
    invoke-virtual {v1, p1, p2}, Ll/ۧۨ֨;->ܽ(Ll/֨֨֨;Ll/֡ۨ֨;)Ll/ۙ֨֨;

    move-result-object v1

    goto :goto_0

    .line 1521
    :cond_0
    iget-object v1, v0, Ll/ۜۨ֨;->ۖ:Ll/᩷ۚ֨;

    iget-object v1, v1, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    :goto_0
    move-object v5, v1

    .line 1522
    sget-object v1, Ll/ۧۨ֨;->ۗ:Ll/ۧۨ֨;

    invoke-virtual {v1, p1, p2}, Ll/ۧۨ֨;->ۧ(Ll/֨֨֨;Ll/֡ۨ֨;)Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1523
    invoke-virtual {v1, p1, p2}, Ll/ۧۨ֨;->ܽ(Ll/֨֨֨;Ll/֡ۨ֨;)Ll/ۙ֨֨;

    move-result-object p2

    goto :goto_1

    .line 1524
    :cond_1
    iget-object p2, v0, Ll/ۜۨ֨;->ۖ:Ll/᩷ۚ֨;

    iget-object p2, p2, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    :goto_1
    move-object v6, p2

    .line 1525
    iget-object p1, p1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    check-cast p1, Ll/ܶۚ֨;

    .line 1526
    new-instance p2, Ll/ܶۚ֨;

    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v3, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v4, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v7, p1, Ll/ܶۚ֨;->᩺:Ll/᩶֨֨;

    move-object v2, p2

    invoke-direct/range {v2 .. v7}, Ll/ܶۚ֨;-><init>(Ll/ۤܶ۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/᩶֨֨;)V

    return-object p2
.end method
