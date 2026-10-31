.class public final Ll/᩶ᩳ۠;
.super Ll/ۚᩳ۠;
.source "B7KX"

# interfaces
.implements Ll/ۜ֡֨;


# instance fields
.field public final synthetic ۬:Ll/ۧܿ۠;


# direct methods
.method public constructor <init>(Ll/ۧܿ۠;)V
    .locals 2

    .line 752
    iput-object p1, p0, Ll/᩶ᩳ۠;->۬:Ll/ۧܿ۠;

    .line 753
    sget-object v0, Ll/۫֨۠;->ۙ:Ll/۫֨۠;

    new-instance v1, Ll/᩺ᩳ۠;

    invoke-direct {v1, p1}, Ll/᩺ᩳ۠;-><init>(Ll/ۧܿ۠;)V

    invoke-direct {p0, p1, v0, v1}, Ll/ۚᩳ۠;-><init>(Ll/ۧܿ۠;Ll/۫֨۠;Ll/ܰᩳ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫᩵۠;)Ll/۫᩵۠;
    .locals 2

    .line 801
    sget-object v0, Ll/ۖᩳ۠;->֫:[I

    invoke-virtual {p1}, Ll/ۚۚ۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return-object p1

    .line 803
    :cond_0
    check-cast p1, Ll/ܽۚ۠;

    iget-object p1, p1, Ll/ܽۚ۠;->۬:Ll/۫᩵۠;

    return-object p1
.end method

.method public final ֫(Ll/֫ۤ֨;)V
    .locals 7

    .line 773
    iget-object v0, p1, Ll/֫ۤ֨;->᩹:Ll/ۚ᩵۠;

    .line 774
    iget-object v1, v0, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    .line 775
    iget-object v2, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    check-cast v2, Ll/᩶ۚ֨;

    .line 777
    invoke-static {p1, v0}, Ll/ۚᩳ۠;->֫(Ll/֫ۤ֨;Ll/ۚ᩵۠;)Ll/֫ۤ֨;

    move-result-object v3

    .line 779
    invoke-virtual {p0, p1, v3}, Ll/ۚᩳ۠;->֫(Ll/֫ۤ֨;Ll/֫ۤ֨;)V

    .line 781
    iget-object p1, v1, Ll/ܳ֡֨;->ܰ:Ll/ۤܶ۠;

    iget-object v4, p0, Ll/᩶ᩳ۠;->۬:Ll/ۧܿ۠;

    invoke-static {v4}, Ll/ۧܿ۠;->ܺ(Ll/ۧܿ۠;)Ll/ۛܶ۠;

    move-result-object v5

    iget-object v5, v5, Ll/ۛܶ۠;->᩶ۧ:Ll/ۤܶ۠;

    if-ne p1, v5, :cond_1

    .line 782
    iget-object p1, v0, Ll/ۚ᩵۠;->۬:Ll/۫᩵۠;

    if-eqz p1, :cond_0

    .line 783
    invoke-static {v4}, Ll/ۧܿ۠;->ܽ(Ll/ۧܿ۠;)Ll/ܶ۬֨;

    move-result-object p1

    iget-object v5, v0, Ll/ۚ᩵۠;->۬:Ll/۫᩵۠;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v2, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    invoke-virtual {p1, v5, v6}, Ll/ܶ۬֨;->ܳ(Ll/ۗ۠۠;Ll/ۙ֨֨;)V

    .line 785
    sget-object p1, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    iput-object p1, v2, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    goto :goto_0

    .line 787
    :cond_0
    iget-object p1, v0, Ll/ۚ᩵۠;->۫:Ll/ۖܶ۠;

    invoke-virtual {p1}, Ll/ۖܶ۠;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 788
    invoke-static {v4}, Ll/ۧܿ۠;->ܽ(Ll/ۧܿ۠;)Ll/ܶ۬֨;

    move-result-object p1

    iget-object v5, v0, Ll/ۚ᩵۠;->۫:Ll/ۖܶ۠;

    iget-object v5, v5, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v5, Ll/۫᩵۠;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v2, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    iget-object v6, v6, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v6, Ll/ۙ֨֨;

    invoke-virtual {p1, v5, v6}, Ll/ܶ۬֨;->ܳ(Ll/ۗ۠۠;Ll/ۙ֨֨;)V

    .line 790
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, v2, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    .line 794
    :cond_1
    :goto_0
    iget-object p1, v0, Ll/ۚ᩵۠;->ۤ:Ll/ۖ֡۠;

    iget-object p1, p1, Ll/ۖ֡۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {v4, v1, p1, v3}, Ll/ۧܿ۠;->֫(Ll/ۛ֡֨;Ll/ۖܶ۠;Ll/֫ۤ֨;)V

    .line 796
    invoke-static {v4}, Ll/ۧܿ۠;->ܽ(Ll/ۧܿ۠;)Ll/ܶ۬֨;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2262
    new-instance v1, Ll/֡۬֨;

    invoke-direct {v1, p1}, Ll/֡۬֨;-><init>(Ll/ܶ۬֨;)V

    .line 49
    invoke-virtual {v0, v1}, Ll/ۚ᩵۠;->֫(Ll/֡ۚ۠;)V

    .line 2264
    iget-boolean p1, v1, Ll/֡۬֨;->֫:Z

    if-nez p1, :cond_2

    iget-boolean p1, v1, Ll/֡۬֨;->ۧ:Z

    if-nez p1, :cond_2

    .line 2265
    iget-object p1, v0, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v2, 0x40000000

    or-long/2addr v0, v2

    iput-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۛ֡֨;)V
    .locals 2

    .line 811
    iget-object v0, p0, Ll/᩶ᩳ۠;->۬:Ll/ۧܿ۠;

    invoke-static {v0}, Ll/ۧܿ۠;->ᩴ(Ll/ۧܿ۠;)Ll/ܰᩳ۠;

    move-result-object v1

    instance-of v1, v1, Ll/۫ᩳ۠;

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/ۧܿ۠;->ᩴ(Ll/ۧܿ۠;)Ll/ܰᩳ۠;

    move-result-object v1

    if-ne v1, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Ll/۫ۙ;->֫(Z)V

    .line 814
    invoke-static {v0}, Ll/ۧܿ۠;->ᩴ(Ll/ۧܿ۠;)Ll/ܰᩳ۠;

    move-result-object v1

    if-eq v1, p0, :cond_2

    .line 816
    iput-object p0, p1, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    return-void

    .line 820
    :cond_2
    invoke-static {v0}, Ll/ۧܿ۠;->֡(Ll/ۧܿ۠;)Ll/ܽܿ۠;

    move-result-object v0

    check-cast p1, Ll/ܳ֡֨;

    invoke-virtual {v0, p1}, Ll/ܽܿ۠;->֫(Ll/᩶֡֨;)Ll/֫ۤ֨;

    move-result-object p1

    .line 822
    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-super {p0, p1}, Ll/ܰᩳ۠;->ۧ(Ll/ۖܶ۠;)V

    return-void
.end method

.method public final ۧ(Ll/ۖܶ۠;)V
    .locals 2

    .line 763
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۤ֨;

    .line 764
    iget-object v1, v1, Ll/֫ۤ֨;->᩹:Ll/ۚ᩵۠;

    iget-object v1, v1, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    iput-object p0, v1, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    goto :goto_0

    .line 766
    :cond_0
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۤ֨;

    .line 767
    iget-object v0, v0, Ll/֫ۤ֨;->᩹:Ll/ۚ᩵۠;

    iget-object v0, v0, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    invoke-virtual {v0}, Ll/ܳ֡֨;->᩶()V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
