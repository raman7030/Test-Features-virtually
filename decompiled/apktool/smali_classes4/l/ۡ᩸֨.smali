.class public final Ll/ۡ᩸֨;
.super Ll/۫᩸֨;
.source "X43L"


# instance fields
.field public final synthetic ᩶:Ll/ۛ᩸֨;

.field public ᩸:Z

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;ZZ)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4729
    iput-object p1, p0, Ll/ۡ᩸֨;->᩶:Ll/ۛ᩸֨;

    .line 4730
    iput-boolean p2, p0, Ll/ۡ᩸֨;->᩸:Z

    .line 4731
    iput-boolean p3, p0, Ll/ۡ᩸֨;->᩹:Z

    return-void
.end method

.method private ֫(Ll/ۙ֨֨;Ll/ۡ֨֨;Ll/ܺۘ֨;)Ll/᩶֨֨;
    .locals 5

    .line 4785
    iget-object v0, p0, Ll/ۡ᩸֨;->᩶:Ll/ۛ᩸֨;

    iget-object v1, v0, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    sget-object v2, Ll/ۧܶ֨;->֫:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    iget-boolean v4, p0, Ll/ۡ᩸֨;->᩸:Z

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    const/4 p1, 0x3

    if-ne v2, p1, :cond_0

    .line 4792
    iget-object p1, v1, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    invoke-static {v0, p1, p2}, Ll/ۛ᩸֨;->֫(Ll/ۛ᩸֨;Ll/ۙ֨֨;Ll/ۡ֨֨;)Ll/᩶֨֨;

    move-result-object p1

    return-object p1

    .line 4794
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Invalid bound kind "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۫ۙ;->֫(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    if-eqz v4, :cond_2

    .line 4790
    iget-object p1, v1, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    invoke-static {v0, p1, p2}, Ll/ۛ᩸֨;->ۧ(Ll/ۛ᩸֨;Ll/ۙ֨֨;Ll/ۡ֨֨;)Ll/᩶֨֨;

    move-result-object p1

    return-object p1

    .line 4791
    :cond_2
    invoke-virtual {p0, p1}, Ll/ۡ᩸֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-static {v0, p1, p2}, Ll/ۛ᩸֨;->ۧ(Ll/ۛ᩸֨;Ll/ۙ֨֨;Ll/ۡ֨֨;)Ll/᩶֨֨;

    move-result-object p1

    return-object p1

    :cond_3
    if-eqz v4, :cond_4

    .line 4787
    invoke-virtual {p0, p1}, Ll/ۡ᩸֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-static {v0, p1, p2}, Ll/ۛ᩸֨;->֫(Ll/ۛ᩸֨;Ll/ۙ֨֨;Ll/ۡ֨֨;)Ll/᩶֨֨;

    move-result-object p1

    return-object p1

    .line 4788
    :cond_4
    iget-object p1, v1, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    invoke-static {v0, p1, p2}, Ll/ۛ᩸֨;->֫(Ll/ۛ᩸֨;Ll/ۙ֨֨;Ll/ۡ֨֨;)Ll/᩶֨֨;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 4724
    check-cast p1, Ljava/lang/Void;

    return-object p2
.end method

.method public final ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 4724
    check-cast p2, Ljava/lang/Void;

    .line 4768
    iget-boolean p2, p0, Ll/ۡ᩸֨;->᩹:Z

    if-eqz p2, :cond_1

    .line 4769
    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p2

    invoke-virtual {p2, p1}, Ll/ۙ֨֨;->֫(Ll/ۙ֨֨;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4770
    iget-object p2, p0, Ll/ۡ᩸֨;->᩶:Ll/ۛ᩸֨;

    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    goto :goto_0

    .line 4771
    :cond_0
    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p2

    const/4 v0, 0x0

    .line 4980
    invoke-virtual {p2, p0, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 4771
    check-cast p2, Ll/ۙ֨֨;

    .line 4772
    :goto_0
    sget-object v0, Ll/ܺۘ֨;->᩶:Ll/ܺۘ֨;

    invoke-direct {p0, p2, p1, v0}, Ll/ۡ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۡ֨֨;Ll/ܺۘ֨;)Ll/᩶֨֨;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public final ֫(Ll/ܶۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 4724
    check-cast p2, Ljava/lang/Void;

    .line 4759
    iget-object p2, p1, Ll/ܶۚ֨;->᩺:Ll/᩶֨֨;

    iget-object v0, p2, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    .line 4760
    invoke-virtual {v0, p1}, Ll/ۙ֨֨;->֫(Ll/ۙ֨֨;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 4761
    iget-object p1, p0, Ll/ۡ᩸֨;->᩶:Ll/ۛ᩸֨;

    invoke-virtual {p1, v0}, Ll/ۛ᩸֨;->ۢ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    goto :goto_0

    .line 4980
    :cond_0
    invoke-virtual {v0, p0, v1}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 4762
    check-cast p1, Ll/ۙ֨֨;

    .line 4980
    :goto_0
    invoke-virtual {p1, p0, v1}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 4763
    check-cast p1, Ll/ۙ֨֨;

    iget-object v0, p2, Ll/᩶֨֨;->ۤ:Ll/ۡ֨֨;

    iget-object p2, p2, Ll/᩶֨֨;->ۨ:Ll/ܺۘ֨;

    invoke-direct {p0, p1, v0, p2}, Ll/ۡ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۡ֨֨;Ll/ܺۘ֨;)Ll/᩶֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 4724
    check-cast p2, Ljava/lang/Void;

    .line 4780
    iget-object p2, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    const/4 v0, 0x0

    .line 4980
    invoke-virtual {p2, p0, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 4780
    check-cast p2, Ll/ۙ֨֨;

    .line 4781
    iget-object v0, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    if-ne v0, p2, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p1, Ll/᩶֨֨;->ۤ:Ll/ۡ֨֨;

    iget-object p1, p1, Ll/᩶֨֨;->ۨ:Ll/ܺۘ֨;

    invoke-direct {p0, p2, v0, p1}, Ll/ۡ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۡ֨֨;Ll/ܺۘ֨;)Ll/᩶֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 4724
    check-cast p2, Ljava/lang/Void;

    .line 4736
    new-instance p2, Ll/ᩴܶ۠;

    invoke-direct {p2}, Ll/ᩴܶ۠;-><init>()V

    .line 4738
    invoke-virtual {p1}, Ll/᩶ۚ֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ֨֨;

    const/4 v3, 0x0

    .line 4980
    invoke-virtual {v2, p0, v3}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 4739
    check-cast v3, Ll/ۙ֨֨;

    if-eq v2, v3, :cond_0

    const/4 v1, 0x1

    .line 4743
    :cond_0
    invoke-virtual {p2, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    .line 4746
    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object p1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 4747
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v0

    .line 4748
    invoke-virtual {p2}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p2

    .line 4746
    iget-object v1, p0, Ll/ۡ᩸֨;->᩶:Ll/ۛ᩸֨;

    invoke-virtual {v1, p1, v0, p2}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public final ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 5

    .line 4800
    iget-object v0, p0, Ll/ۡ᩸֨;->᩶:Ll/ۛ᩸֨;

    iget-object v0, v0, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    :cond_0
    :goto_0
    sget-object v1, Ll/ۢ۠֨;->᩵֫:Ll/ۢ۠֨;

    invoke-virtual {p1, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 4801
    check-cast p1, Ll/᩶֨֨;

    iget-object v1, p1, Ll/᩶֨֨;->ۨ:Ll/ܺۘ֨;

    const/4 v2, 0x0

    .line 4802
    iget-boolean v3, p0, Ll/ۡ᩸֨;->᩸:Z

    if-eqz v3, :cond_1

    .line 922
    sget-object v4, Ll/ܺۘ֨;->᩶:Ll/ܺۘ֨;

    if-ne v1, v4, :cond_2

    .line 923
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    goto :goto_1

    .line 930
    :cond_1
    sget-object v4, Ll/ܺۘ֨;->ۙ:Ll/ܺۘ֨;

    if-ne v1, v4, :cond_2

    .line 931
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    goto :goto_1

    :cond_2
    move-object p1, v2

    :goto_1
    if-nez p1, :cond_0

    if-eqz v3, :cond_3

    .line 4806
    iget-object p1, v0, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    goto :goto_0

    :cond_3
    iget-object p1, v0, Ll/᩷ۚ֨;->᩷:Ll/ۙ֨֨;

    goto :goto_0

    :cond_4
    return-object p1
.end method
