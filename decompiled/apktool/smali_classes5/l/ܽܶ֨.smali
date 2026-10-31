.class public final Ll/ܽܶ֨;
.super Ll/ۘ᩸֨;
.source "X43L"


# instance fields
.field public final synthetic ᩸:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 543
    iput-object p1, p0, Ll/ܽܶ֨;->᩸:Ll/ۛ᩸֨;

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 543
    check-cast p1, Ll/ۛ֡֨;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/۫ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 543
    check-cast p2, Ll/ۛ֡֨;

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 543
    check-cast p2, Ll/ۛ֡֨;

    .line 551
    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v0, p2, :cond_0

    return-object p1

    .line 553
    :cond_0
    iget-object v1, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v2, p0, Ll/ܽܶ֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {v2, v0, v1}, Ll/ۛ᩸֨;->ۧ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_0

    .line 556
    :cond_1
    new-instance v3, Ll/ᩴܶ۠;

    invoke-direct {v3}, Ll/ᩴܶ۠;-><init>()V

    .line 557
    new-instance v4, Ll/ᩴܶ۠;

    invoke-direct {v4}, Ll/ᩴܶ۠;-><init>()V

    .line 559
    :try_start_0
    invoke-virtual {v2, v0, p1, v3, v4}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/ᩴܶ۠;Ll/ᩴܶ۠;)V
    :try_end_0
    .catch Ll/ۡܶ֨; {:try_start_0 .. :try_end_0} :catch_0

    .line 563
    iget-object v0, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v3}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v3

    invoke-virtual {v4}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v4

    invoke-virtual {v2, v0, v3, v4}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object v0

    const/4 v3, 0x1

    .line 1071
    invoke-virtual {v2, v0, p1, v3}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v3

    if-nez v3, :cond_2

    :goto_0
    return-object v1

    .line 566
    :cond_2
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 567
    iget-object p2, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p2}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object p2

    .line 568
    :goto_1
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 569
    iget-object v3, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    invoke-virtual {v0, v3}, Ll/ۙ֨֨;->֫(Ll/ۙ֨֨;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    invoke-virtual {p1, v3}, Ll/᩶ۚ֨;->֫(Ll/ۙ֨֨;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 570
    iget-object v3, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    invoke-virtual {v1, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 568
    :cond_3
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_1

    .line 571
    :cond_4
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ᩳ()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 572
    invoke-virtual {p1}, Ll/᩶ۚ֨;->ۚ֫()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 574
    invoke-virtual {v2, v0}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 577
    :cond_5
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    .line 578
    new-instance p2, Ll/ᩴܶ۠;

    invoke-direct {p2}, Ll/ᩴܶ۠;-><init>()V

    move-object v1, p1

    .line 579
    :goto_2
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 580
    new-instance v3, Ll/᩶֨֨;

    iget-object v4, v2, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object v5, v4, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    sget-object v6, Ll/ܺۘ֨;->ۗ:Ll/ܺۘ֨;

    iget-object v4, v4, Ll/᩷ۚ֨;->ۢ:Ll/ܳ֡֨;

    iget-object v7, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v7, Ll/ۡ֨֨;

    invoke-direct {v3, v5, v6, v4, v7}, Ll/᩶֨֨;-><init>(Ll/ۙ֨֨;Ll/ܺۘ֨;Ll/᩶֡֨;Ll/ۡ֨֨;)V

    invoke-virtual {p2, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 579
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_2

    .line 583
    :cond_6
    invoke-virtual {p2}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p2

    invoke-virtual {v2, v0, p1, p2}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    :cond_7
    return-object v0

    :catch_0
    return-object v1
.end method
