.class public final Ll/֫ܿ۠;
.super Ll/֨ᩳ۠;
.source "B7KX"


# instance fields
.field public final synthetic ۤ:Ll/ۧܿ۠;


# direct methods
.method public constructor <init>(Ll/ۧܿ۠;)V
    .locals 2

    .line 956
    iput-object p1, p0, Ll/֫ܿ۠;->ۤ:Ll/ۧܿ۠;

    .line 957
    sget-object v0, Ll/۫֨۠;->ۨ:Ll/۫֨۠;

    new-instance v1, Ll/ۨᩳ۠;

    invoke-direct {v1, p1}, Ll/ۨᩳ۠;-><init>(Ll/ۧܿ۠;)V

    invoke-direct {p0, p1, v0, v1}, Ll/֨ᩳ۠;-><init>(Ll/ۧܿ۠;Ll/۫֨۠;Ll/ۨᩳ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;)V
    .locals 10

    .line 962
    iget-object v0, p1, Ll/֫ۤ֨;->᩹:Ll/ۚ᩵۠;

    .line 963
    iget-object v1, v0, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    .line 964
    iget-wide v2, v1, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v4, 0x2000000000000000L

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_4

    .line 965
    invoke-static {v0}, Ll/۟ۚ۠;->֫(Ll/ۚ᩵۠;)Ll/ۖܶ۠;

    move-result-object v2

    .line 967
    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, p0, Ll/֫ܿ۠;->ۤ:Ll/ۧܿ۠;

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۢۚ۠;

    .line 988
    invoke-virtual {v1, v3}, Ll/ܳ֡֨;->֫(Ll/ۢۚ۠;)Ll/᩸֡֨;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    .line 990
    invoke-virtual {v5}, Ll/᩸֡֨;->۬֫()Ll/ۖܶ۠;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۖܶ۠;->ۧ()I

    move-result v7

    iget-object v8, v3, Ll/ۢۚ۠;->۫:Ll/ۖ֡۠;

    iget-object v8, v8, Ll/ۖ֡۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {v8}, Ll/ۖܶ۠;->ۧ()I

    move-result v8

    if-eq v7, v8, :cond_0

    .line 991
    new-instance v7, Ll/᩶ۚ۠;

    invoke-static {v4}, Ll/ۧܿ۠;->ۢ(Ll/ۧܿ۠;)Ll/ܿ֨۠;

    move-result-object v8

    iget v9, v3, Ll/ۚۚ۠;->᩸:I

    .line 111
    iput v9, v8, Ll/ܿ֨۠;->ܽ:I

    .line 991
    invoke-direct {v7, v8}, Ll/᩶ۚ۠;-><init>(Ll/ܿ֨۠;)V

    .line 992
    invoke-virtual {v5}, Ll/᩸֡֨;->۬֫()Ll/ۖܶ۠;

    move-result-object v8

    .line 68
    invoke-virtual {v7, v6, v8}, Ll/᩶ۚ۠;->֫(Ljava/lang/Object;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v7

    .line 993
    iget-object v8, v3, Ll/ۢۚ۠;->۫:Ll/ۖ֡۠;

    iput-object v7, v8, Ll/ۖ֡۠;->ۗ:Ll/ۖܶ۠;

    .line 996
    :cond_0
    invoke-static {v4}, Ll/ۧܿ۠;->ۡ(Ll/ۧܿ۠;)Ll/ܽܰ֨;

    move-result-object v7

    invoke-virtual {v7, v3, p1}, Ll/ܽܰ֨;->֫(Ll/ۚۚ۠;Ll/֫ۤ֨;)V

    .line 999
    iget-object v7, v3, Ll/ۢۚ۠;->۫:Ll/ۖ֡۠;

    iget-object v7, v7, Ll/ۖ֡۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {v7}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 1000
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v4

    goto :goto_1

    .line 1001
    :cond_1
    new-instance v7, Ll/᩶ۚ۠;

    invoke-static {v4}, Ll/ۧܿ۠;->ۢ(Ll/ۧܿ۠;)Ll/ܿ֨۠;

    move-result-object v4

    iget v8, v3, Ll/ۚۚ۠;->᩸:I

    .line 111
    iput v8, v4, Ll/ܿ֨۠;->ܽ:I

    .line 1001
    invoke-direct {v7, v4}, Ll/᩶ۚ۠;-><init>(Ll/ܿ֨۠;)V

    iget-object v4, v3, Ll/ۢۚ۠;->۫:Ll/ۖ֡۠;

    iget-object v4, v4, Ll/ۖ֡۠;->ۗ:Ll/ۖܶ۠;

    .line 68
    invoke-virtual {v7, v6, v4}, Ll/᩶ۚ۠;->֫(Ljava/lang/Object;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v4

    .line 998
    :goto_1
    invoke-virtual {v1, v5, v3, v4}, Ll/ܳ֡֨;->֫(Ll/᩸֡֨;Ll/ۢۚ۠;Ll/ۖܶ۠;)V

    goto :goto_0

    .line 1004
    :cond_2
    invoke-virtual {p0, v1, p1}, Ll/֨ᩳ۠;->֫(Ll/ܳ֡֨;Ll/֫ۤ֨;)V

    .line 1007
    iget-object v0, v0, Ll/ۚ᩵۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۚ۠;

    .line 1008
    invoke-static {v1}, Ll/۟ۚ۠;->ܺ(Ll/ۚۚ۠;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1009
    invoke-static {v4}, Ll/ۧܿ۠;->ۡ(Ll/ۧܿ۠;)Ll/ܽܰ֨;

    move-result-object v2

    invoke-virtual {v2, v1, p1}, Ll/ܽܰ֨;->֫(Ll/ۚۚ۠;Ll/֫ۤ֨;)V

    goto :goto_2

    :cond_4
    return-void
.end method
