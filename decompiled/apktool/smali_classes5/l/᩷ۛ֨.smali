.class public final Ll/᩷ۛ֨;
.super Ll/᩸ۛ֨;
.source "M43N"


# instance fields
.field public final synthetic ᩳ:Ll/ۜۨ֨;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 912
    iput-object p1, p0, Ll/᩷ۛ֨;->ᩳ:Ll/ۜۨ֨;

    .line 913
    invoke-direct {p0, p1, p2, p3}, Ll/᩸ۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֨֨֨;)Ll/᩸ۛ֨;
    .locals 3

    .line 918
    new-instance v0, Ll/᩷ۛ֨;

    iget-object v1, p0, Ll/᩷ۛ֨;->ᩳ:Ll/ۜۨ֨;

    iget-object v2, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    invoke-direct {v0, v1, p1, v2}, Ll/᩷ۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;)V

    return-object v0
.end method

.method public final ֫(Ll/֡ۨ֨;Ll/֨᩸۠;)V
    .locals 10

    const/4 p2, 0x1

    new-array p2, p2, [Ll/᩵֨֨;

    .line 923
    sget-object v0, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    iget-object v0, p0, Ll/᩸ۛ֨;->ܽ:Ll/֨֨֨;

    invoke-virtual {v0, p2}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object p2

    invoke-static {p2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    iget-object v2, p0, Ll/᩷ۛ֨;->ᩳ:Ll/ۜۨ֨;

    iget-object v3, v2, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    .line 924
    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ll/ۜۛ֨;

    invoke-direct {v4, v3}, Ll/ۜۛ֨;-><init>(Ll/ۛ᩸֨;)V

    .line 3736
    new-instance v5, Ll/ۘ۠֨;

    invoke-direct {v5, v1, v3, v4}, Ll/ۘ۠֨;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll/ᩴ۠֨;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Ll/᩵۠֨;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v6, Ll/֡۠֨;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-array v1, v1, [Ll/ۛۨᩴ;

    invoke-static {v5, v3, v4, v6, v1}, Ll/ۤۨᩴ;->of(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;[Ll/ۛۨᩴ;)Ll/ۨۨᩴ;

    move-result-object v1

    .line 924
    invoke-interface {p2, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۖܶ۠;

    .line 925
    invoke-virtual {p2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨֨;

    .line 926
    iget-object v3, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    if-ne v3, v1, :cond_1

    goto :goto_0

    :cond_1
    if-eq v3, v1, :cond_0

    .line 930
    sget-object v4, Ll/ۢ۠֨;->᩵֫:Ll/ۢ۠֨;

    invoke-virtual {v3, v4}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1, v4}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 931
    iget-object v3, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    invoke-static {v2, v3, v1}, Ll/ۜۨ֨;->֫(Ll/ۜۨ֨;Ll/ۙ֨֨;Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ܶ۠;

    .line 932
    iget-object v4, v3, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    check-cast v4, Ll/ۙ֨֨;

    invoke-virtual {v4}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v4

    .line 933
    iget-object v3, v3, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    invoke-virtual {v3}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v3

    .line 934
    :goto_2
    invoke-virtual {v4}, Ll/ۖܶ۠;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v3}, Ll/ۖܶ۠;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 936
    iget-object v5, v4, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v5, Ll/ۙ֨֨;

    sget-object v6, Ll/ۢ۠֨;->᩵֫:Ll/ۢ۠֨;

    invoke-virtual {v5, v6}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-nez v5, :cond_2

    iget-object v5, v3, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v5, Ll/ۙ֨֨;

    .line 937
    invoke-virtual {v5, v6}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 938
    iget-object v5, v4, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v5, Ll/ۙ֨֨;

    invoke-virtual {p1, v5}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v5

    iget-object v6, v3, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v6, Ll/ۙ֨֨;

    .line 939
    invoke-virtual {p1, v6}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v6

    .line 716
    sget-object v7, Ll/ۗۛ֨;->᩹:Ll/ۗۛ֨;

    const/4 v8, 0x0

    iget-object v9, p0, Ll/᩸ۛ֨;->ۧ:Ll/ۜۨ֨;

    invoke-virtual {v9, v7, v5, v6, v8}, Ll/ۜۨ֨;->֫(Ll/ۗۛ֨;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 940
    sget-object v5, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    invoke-virtual {v2, v0, v5}, Ll/ۜۨ֨;->֫(Ll/֨֨֨;Ll/᩵֨֨;)V

    .line 943
    :cond_2
    iget-object v4, v4, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 944
    iget-object v3, v3, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_2

    .line 946
    :cond_3
    invoke-virtual {v4}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    invoke-static {v3}, Ll/۫ۙ;->֫(Z)V

    goto :goto_1

    :cond_5
    return-void
.end method
