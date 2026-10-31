.class public final Ll/᩶۠֨;
.super Ll/۫᩸֨;
.source "X43L"


# instance fields
.field public final synthetic ᩸:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2587
    iput-object p1, p0, Ll/᩶۠֨;->᩸:Ll/ۛ᩸֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 2587
    check-cast p1, Ljava/lang/Void;

    .line 2590
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2587
    check-cast p2, Ljava/lang/Void;

    .line 2631
    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2632
    iget-object p2, p0, Ll/᩶۠֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    .line 2634
    :cond_0
    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۙ֨֨;->ۡ֫()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 2635
    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p1

    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    .line 2637
    :cond_1
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 2587
    check-cast p2, Ljava/lang/Void;

    .line 2595
    iget-object p2, p1, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    if-nez p2, :cond_3

    .line 2596
    iget-object p2, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    check-cast p2, Ll/ܳ֡֨;

    invoke-virtual {p2}, Ll/ܳ֡֨;->ۗ֫()Ll/ۖܶ۠;

    move-result-object p2

    .line 2597
    iget-object v0, p1, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    if-nez v0, :cond_3

    .line 2613
    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v0}, Ll/۫ۙ;->֫(Ljava/lang/Object;Z)V

    .line 2614
    invoke-virtual {p1}, Ll/᩶ۚ֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v0

    .line 2615
    iget-object v1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v1

    .line 2616
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܿ֫()Z

    move-result v2

    iget-object v3, p0, Ll/᩶۠֨;->᩸:Ll/ۛ᩸֨;

    if-eqz v2, :cond_1

    .line 2617
    invoke-virtual {v3, p2}, Ll/ۛ᩸֨;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p2

    iput-object p2, p1, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    goto :goto_1

    .line 2618
    :cond_1
    invoke-virtual {v1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2619
    invoke-virtual {v3, p2, v1, v0}, Ll/ۛ᩸֨;->֫(Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p2

    iput-object p2, p1, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    goto :goto_1

    .line 2622
    :cond_2
    iput-object p2, p1, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    .line 2626
    :cond_3
    :goto_1
    iget-object p1, p1, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    return-object p1
.end method
