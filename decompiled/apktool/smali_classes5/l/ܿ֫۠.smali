.class public final Ll/ܿ֫۠;
.super Ll/ᩳۧ۠;
.source "A451"


# instance fields
.field public final synthetic ᩻:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/ۤܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V
    .locals 0

    .line 2734
    iput-object p1, p0, Ll/ܿ֫۠;->᩻:Ll/᩹ܽ۠;

    invoke-direct/range {p0 .. p5}, Ll/ᩳۧ۠;-><init>(Ll/᩹ܽ۠;Ll/ۤܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۛ֡֨;)Ll/ۛ֡֨;
    .locals 6

    .line 2743
    iget-object v0, p4, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v0}, Ll/֨ᩴ֨;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2744
    invoke-super {p0, p1, p2, p3, p4}, Ll/ᩳۧ۠;->֫(Ll/֫ۤ֨;Ll/ۗ۠۠;Ll/ۛ֡֨;Ll/ۛ֡֨;)Ll/ۛ֡֨;

    move-result-object p1

    return-object p1

    .line 2746
    :cond_0
    move-object p2, p4

    check-cast p2, Ll/ۘ֡֨;

    .line 111
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    const-wide v2, 0x400000000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-eqz p3, :cond_4

    .line 2748
    iget-object p3, p1, Ll/֫ۤ֨;->ۙ:Ljava/lang/Object;

    check-cast p3, Ll/ۡۗ֨;

    sget-object v0, Ll/ܽܽ۠;->ۙ:Ll/ܽܽ۠;

    iput-object v0, p3, Ll/ۡۗ֨;->ۡ:Ll/ܽܽ۠;

    .line 2767
    iget-object p3, p0, Ll/ܿ֫۠;->᩻:Ll/᩹ܽ۠;

    iget-object v0, p3, Ll/᩹ܽ۠;->۠:Ll/ۜۨ֨;

    iget-object v1, p3, Ll/᩹ܽ۠;->ۘ:Ll/۫ۧ۠;

    .line 561
    iget-object v2, v0, Ll/ۜۨ֨;->ۖ:Ll/᩷ۚ֨;

    .line 702
    iget-object v3, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 2263
    invoke-virtual {v3}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v3

    .line 563
    sget-object v4, Ll/֫ۛ֨;->ۧ:[I

    iget-object v5, p1, Ll/֫ۤ֨;->ۗ:Ll/֫ۤ֨;

    iget-object v5, v5, Ll/֫ۤ֨;->ۤ:Ll/ۚۚ۠;

    invoke-virtual {v5}, Ll/ۚۚ۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    if-eq v4, v5, :cond_2

    const/4 v5, 0x2

    if-eq v4, v5, :cond_1

    goto :goto_0

    .line 571
    :cond_1
    iget-object v4, p1, Ll/֫ۤ֨;->ۗ:Ll/֫ۤ֨;

    iget-object v4, v4, Ll/֫ۤ֨;->ۤ:Ll/ۚۚ۠;

    check-cast v4, Ll/ۤ᩵۠;

    .line 573
    iget-object v4, v4, Ll/ۤ᩵۠;->ۗ:Ll/۫᩵۠;

    invoke-static {v4}, Ll/۟ۚ۠;->ۧ(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object v4

    iget-object p1, p1, Ll/֫ۤ֨;->ۤ:Ll/ۚۚ۠;

    if-ne v4, p1, :cond_3

    .line 574
    iget-object v3, v2, Ll/᩷ۚ֨;->ܶۧ:Ll/֫֨֨;

    goto :goto_0

    .line 565
    :cond_2
    iget-object v4, p1, Ll/֫ۤ֨;->ۗ:Ll/֫ۤ֨;

    iget-object v4, v4, Ll/֫ۤ֨;->ۤ:Ll/ۚۚ۠;

    check-cast v4, Ll/ᩳۚ۠;

    .line 566
    iget-object v5, v4, Ll/ᩳۚ۠;->۬:Ll/۫᩵۠;

    invoke-static {v5}, Ll/۟ۚ۠;->ۧ(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object v5

    iget-object p1, p1, Ll/֫ۤ֨;->ۤ:Ll/ۚۚ۠;

    if-ne v5, p1, :cond_3

    .line 567
    iget-object p1, v4, Ll/ᩳۚ۠;->ۗ:Ll/ۚۚ۠;

    iget-object v3, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    .line 581
    :cond_3
    :goto_0
    new-instance p1, Ll/ܶۛ֨;

    iget-object v1, v1, Ll/۫ۧ۠;->ܿ:Ll/ܽܽ۠;

    invoke-direct {p1, v0, p2, v1}, Ll/ܶۛ֨;-><init>(Ll/ۜۨ֨;Ll/ۛ֡֨;Ll/ܽܽ۠;)V

    iget-object v0, p0, Ll/֨ۧ۠;->֫:Ll/ۖܶ۠;

    invoke-virtual {v0, p1}, Ll/ۖܶ۠;->֫(Ljava/util/function/Function;)Ll/ۖܶ۠;

    move-result-object p1

    .line 702
    iget-object p2, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 2268
    invoke-virtual {p2}, Ll/ۙ֨֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object p2

    .line 586
    new-instance v0, Ll/ۧ֨֨;

    iget-object v1, v2, Ll/᩷ۚ֨;->ۢ֫:Ll/ܳ֡֨;

    invoke-direct {v0, p1, v3, p2, v1}, Ll/ۧ֨֨;-><init>(Ll/ۖܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/᩶֡֨;)V

    .line 2769
    invoke-virtual {p3, p4, v0}, Ll/᩹ܽ۠;->֫(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۛ֡֨;

    move-result-object p1

    return-object p1

    :cond_4
    return-object p4
.end method

.method public final ۧ(Ll/֫ۤ֨;Ll/ܽܽ۠;)Ll/ۛ֡֨;
    .locals 7

    .line 2737
    iget-object v2, p0, Ll/֨ۧ۠;->ᩳ:Ll/ۙ֨֨;

    .line 2738
    invoke-virtual {p2}, Ll/ܽܽ۠;->֫()Z

    .line 2739
    invoke-virtual {p2}, Ll/ܽܽ۠;->ۧ()Z

    move-result v6

    .line 2737
    iget-object v0, p0, Ll/ܿ֫۠;->᩻:Ll/᩹ܽ۠;

    iget-object v3, p0, Ll/֨ۧ۠;->ܽ:Ll/ۤܶ۠;

    iget-object v4, p0, Ll/֨ۧ۠;->֫:Ll/ۖܶ۠;

    iget-object v5, p0, Ll/֨ۧ۠;->ܿ:Ll/ۖܶ۠;

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, Ll/᩹ܽ۠;->֫(Ll/֫ۤ֨;Ll/ۙ֨֨;Ll/ۤܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;Z)Ll/ۛ֡֨;

    move-result-object p1

    return-object p1
.end method
