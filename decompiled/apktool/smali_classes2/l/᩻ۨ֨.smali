.class public final Ll/᩻ۨ֨;
.super Ll/᩻ۛ֨;
.source "M43N"


# instance fields
.field public final synthetic ۢ:Ll/ۜۨ֨;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;Ll/֨֨֨;)V
    .locals 4

    .line 868
    iput-object p1, p0, Ll/᩻ۨ֨;->ۢ:Ll/ۜۨ֨;

    .line 869
    sget-object v0, Ll/᩵֨֨;->᩶:Ll/᩵֨֨;

    const/4 v1, 0x2

    new-array v1, v1, [Ll/᩵֨֨;

    sget-object v2, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {p0, p1, p2, v0, v1}, Ll/᩻ۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/᩵֨֨;[Ll/᩵֨֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֨֨֨;)Ll/᩸ۛ֨;
    .locals 2

    .line 874
    new-instance v0, Ll/᩻ۨ֨;

    iget-object v1, p0, Ll/᩻ۨ֨;->ۢ:Ll/ۜۨ֨;

    invoke-direct {v0, v1, p1}, Ll/᩻ۨ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;)V

    return-object v0
.end method

.method public final ֫(Ll/֡ۨ֨;Ll/֨᩸۠;)V
    .locals 7

    .line 879
    iget-object v0, p0, Ll/᩻ۨ֨;->ۢ:Ll/ۜۨ֨;

    iget-object v1, v0, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    iget-object v2, p1, Ll/֡ۨ֨;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ֨֨;

    .line 881
    check-cast v3, Ll/֨֨֨;

    .line 882
    iget-object v4, p0, Ll/᩸ۛ֨;->ܽ:Ll/֨֨֨;

    iget-object v5, v4, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    invoke-static {v5}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v5

    invoke-virtual {v4}, Ll/֨֨֨;->۫֫()Ll/ۙ֨֨;

    move-result-object v4

    invoke-static {v4}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v4

    invoke-virtual {v3, v1, v5, v4}, Ll/֨֨֨;->֫(Ll/ۛ᩸֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V

    .line 893
    sget-object v4, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    const/4 v5, 0x1

    new-array v5, v5, [Ll/᩵֨֨;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    .line 894
    invoke-virtual {v3, v5}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v5

    new-instance v6, Ll/ᩳۛ֨;

    invoke-direct {v6, p1}, Ll/ᩳۛ֨;-><init>(Ll/֡ۨ֨;)V

    invoke-static {v5, v6}, Ll/ۙ֨֨;->֫(Ll/ۖܶ۠;Ll/ᩳۛ֨;)Ll/ۖܶ۠;

    move-result-object v5

    .line 896
    invoke-virtual {v5}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 897
    iget-object v5, v0, Ll/ۜۨ֨;->ۖ:Ll/᩷ۚ֨;

    iget-object v5, v5, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    goto :goto_1

    .line 898
    :cond_1
    iget-object v6, v5, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v6}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 899
    iget-object v5, v5, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v5, Ll/ۙ֨֨;

    goto :goto_1

    .line 901
    :cond_2
    invoke-virtual {v1, v5}, Ll/ۛ᩸֨;->ᩳ(Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object v5

    :goto_1
    if-eqz v5, :cond_3

    .line 902
    invoke-virtual {v5}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 903
    :cond_3
    invoke-virtual {v0, v3, v4}, Ll/ۜۨ֨;->֫(Ll/֨֨֨;Ll/᩵֨֨;)V

    goto :goto_0

    .line 885
    :cond_4
    invoke-super {p0, p1, p2}, Ll/ܳۛ֨;->֫(Ll/֡ۨ֨;Ll/֨᩸۠;)V

    return-void
.end method
