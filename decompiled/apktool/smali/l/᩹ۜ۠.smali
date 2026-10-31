.class public final Ll/᩹ۜ۠;
.super Ljava/lang/Object;
.source "Z5U8"

# interfaces
.implements Ll/ۜ֡֨;


# instance fields
.field public final synthetic ۙ:Ll/᩶ۜ۠;

.field public final ᩶:Ll/ۖܶ۠;

.field public final ᩸:Ll/֡֡֨;

.field public final ᩹:Ll/ۖܶ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/֡֡֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V
    .locals 0

    .line 2946
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۜ۠;->ۙ:Ll/᩶ۜ۠;

    .line 2947
    iput-object p2, p0, Ll/᩹ۜ۠;->᩸:Ll/֡֡֨;

    .line 2948
    iput-object p3, p0, Ll/᩹ۜ۠;->᩶:Ll/ۖܶ۠;

    .line 2949
    iput-object p4, p0, Ll/᩹ۜ۠;->᩹:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ֡֨;)V
    .locals 9

    .line 2954
    new-instance p1, Ll/ᩴܶ۠;

    invoke-direct {p1}, Ll/ᩴܶ۠;-><init>()V

    .line 2955
    iget-object v0, p0, Ll/᩹ۜ۠;->᩸:Ll/֡֡֨;

    iget-object v1, v0, Ll/֡֡֨;->ۨ:Ll/ۖܶ۠;

    invoke-virtual {p1, v1}, Ll/ᩴܶ۠;->addAll(Ljava/util/Collection;)Z

    .line 2956
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 2957
    iget-object v2, p0, Ll/᩹ۜ۠;->᩶:Ll/ۖܶ۠;

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, p0, Ll/᩹ۜ۠;->ۙ:Ll/᩶ۜ۠;

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵ۜ۠;

    .line 2958
    new-instance v5, Ll/ܺᩴ֨;

    iget-object v4, v4, Ll/᩶ۜ۠;->ܳ֫:Ll/᩷ۚ֨;

    iget-object v3, v3, Ll/᩵ۜ۠;->֫:Ll/ۤܶ۠;

    invoke-virtual {v4, v0, v3}, Ll/᩷ۚ֨;->֫(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;

    move-result-object v3

    invoke-direct {v5, v3}, Ll/ܺᩴ֨;-><init>(Ll/ܳ֡֨;)V

    .line 227
    invoke-virtual {v1, v5}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    invoke-virtual {p1, v5}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 2962
    :cond_0
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v1

    iput-object v1, v0, Ll/֡֡֨;->ۡ֫:Ll/ۖܶ۠;

    .line 2963
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 2964
    iget-object v2, p0, Ll/᩹ۜ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۜ۠;

    .line 2965
    new-instance v5, Ll/ᩴܶ۠;

    invoke-direct {v5}, Ll/ᩴܶ۠;-><init>()V

    .line 2966
    iget-object v6, v3, Ll/ᩴۜ۠;->֫:Ll/ۖܶ۠;

    invoke-virtual {v6}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۤܶ۠;

    .line 2967
    iget-object v8, v4, Ll/᩶ۜ۠;->ܳ֫:Ll/᩷ۚ֨;

    invoke-virtual {v8, v0, v7}, Ll/᩷ۚ֨;->֫(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;

    move-result-object v7

    invoke-virtual {v5, v7}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_2

    .line 2969
    :cond_1
    new-instance v6, Ll/᩷ᩴ֨;

    iget-object v7, v4, Ll/᩶ۜ۠;->ܳ֫:Ll/᩷ۚ֨;

    iget-object v3, v3, Ll/ᩴۜ۠;->ۧ:Ll/ۤܶ۠;

    invoke-virtual {v7, v0, v3}, Ll/᩷ۚ֨;->֫(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;

    move-result-object v3

    .line 2970
    invoke-virtual {v5}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v5

    invoke-direct {v6, v3, v5}, Ll/᩷ᩴ֨;-><init>(Ll/ܳ֡֨;Ll/ۖܶ۠;)V

    .line 227
    invoke-virtual {v1, v6}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    invoke-virtual {p1, v6}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 2974
    :cond_2
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v1

    iput-object v1, v0, Ll/֡֡֨;->ܿ֫:Ll/ۖܶ۠;

    .line 2975
    invoke-virtual {p1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, v0, Ll/֡֡֨;->ۨ:Ll/ۖܶ۠;

    return-void
.end method

.method public final synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
