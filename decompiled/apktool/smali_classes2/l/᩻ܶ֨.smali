.class public final Ll/᩻ܶ֨;
.super Ll/۬᩸֨;
.source "X43L"


# instance fields
.field public final synthetic ᩸:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1556
    iput-object p1, p0, Ll/᩻ܶ֨;->᩸:Ll/ۛ᩸֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 2

    .line 1556
    check-cast p1, Ll/ۙ֨֨;

    .line 1559
    invoke-virtual {p1}, Ll/ۙ֨֨;->ᩴ֫()Z

    move-result v0

    iget-object v1, p0, Ll/᩻ܶ֨;->᩸:Ll/ۛ᩸֨;

    if-eqz v0, :cond_0

    .line 1560
    invoke-virtual {v1, p1, p2}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1562
    :cond_0
    invoke-virtual {v1, p2, p1}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֨֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1556
    check-cast p2, Ll/ۙ֨֨;

    .line 1594
    sget-object v0, Ll/ۢ۠֨;->᩵֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1595
    iget-object v0, p0, Ll/᩻ܶ֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1, p2}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1597
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final bridge synthetic ֫(Ll/۫ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1556
    check-cast p2, Ll/ۙ֨֨;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final ֫(Ll/᩶֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1556
    iget-object v0, p1, Ll/᩶֨֨;->ۨ:Ll/ܺۘ֨;

    check-cast p2, Ll/ۙ֨֨;

    .line 1581
    invoke-virtual {p2}, Ll/ۙ֨֨;->ᩴ֫()Z

    move-result v1

    iget-object v2, p0, Ll/᩻ܶ֨;->᩸:Ll/ۛ᩸֨;

    if-eqz v1, :cond_0

    .line 1582
    invoke-virtual {v2, p2, p1}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 1614
    :cond_0
    sget-object v1, Ll/ۢ۠֨;->᩵֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 1616
    :cond_1
    move-object v3, p2

    check-cast v3, Ll/᩶֨֨;

    .line 1617
    iget-object v4, v3, Ll/᩶֨֨;->ۨ:Ll/ܺۘ֨;

    if-ne v4, v0, :cond_2

    iget-object v3, v3, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    iget-object v4, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    if-ne v3, v4, :cond_2

    goto :goto_2

    .line 1608
    :cond_2
    :goto_0
    sget-object v3, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v3}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object v3, p2

    check-cast v3, Ll/ۡ֨֨;

    invoke-virtual {v3}, Ll/ۡ֨֨;->۫֫()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    .line 1610
    :cond_3
    move-object v3, p2

    check-cast v3, Ll/ܶۚ֨;

    iget-object v3, v3, Ll/ܶۚ֨;->᩺:Ll/᩶֨֨;

    .line 1614
    invoke-virtual {v3, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    .line 1617
    :cond_4
    iget-object v1, v3, Ll/᩶֨֨;->ۨ:Ll/ܺۘ֨;

    if-ne v1, v0, :cond_5

    iget-object v0, v3, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    iget-object v1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    if-ne v0, v1, :cond_5

    goto :goto_2

    .line 1587
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ll/᩶֨֨;->ۜ֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_6

    invoke-virtual {v2, p1}, Ll/ۛ᩸֨;->ۙ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ۙ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3

    .line 1074
    invoke-virtual {v2, v0, v3, v1}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1588
    :cond_6
    invoke-virtual {p1}, Ll/᩶֨֨;->۠֫()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v2, p2}, Ll/ۛ᩸֨;->ۗ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    invoke-virtual {v2, p1}, Ll/ۛ᩸֨;->ۗ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    .line 1074
    invoke-virtual {v2, p2, p1, v1}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result p1

    if-eqz p1, :cond_8

    :cond_7
    :goto_2
    const/4 v1, 0x1

    .line 1585
    :cond_8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
