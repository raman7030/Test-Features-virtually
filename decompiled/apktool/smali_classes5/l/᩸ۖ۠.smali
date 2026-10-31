.class public final Ll/᩸ۖ۠;
.super Ljava/lang/Object;
.source "F42B"

# interfaces
.implements Ll/ۙ᩹۠;


# instance fields
.field public final ֫:Ll/ܰ۫֨;

.field public final ۧ:Ll/ۗܰ֨;

.field public final ܽ:Ljava/util/HashMap;

.field public final ᩳ:Ll/᩷ۚ֨;


# direct methods
.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 1

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 189
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 190
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩸ۖ۠;->ܽ:Ljava/util/HashMap;

    .line 109
    const-class v0, Ll/᩸ۖ۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 110
    invoke-static {p1}, Ll/ۙۡ۠;->֫(Ll/ۗ֨۠;)Ll/ۙۡ۠;

    .line 111
    invoke-static {p1}, Ll/᩷ۚ֨;->֫(Ll/ۗ֨۠;)Ll/᩷ۚ֨;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۖ۠;->ᩳ:Ll/᩷ۚ֨;

    .line 112
    invoke-static {p1}, Ll/ۗܰ֨;->֫(Ll/ۗ֨۠;)Ll/ۗܰ֨;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۖ۠;->ۧ:Ll/ۗܰ֨;

    .line 113
    invoke-static {p1}, Ll/ۛܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۛܶ۠;

    .line 114
    invoke-static {p1}, Ll/ۛ᩸֨;->֫(Ll/ۗ֨۠;)Ll/ۛ᩸֨;

    .line 115
    invoke-static {p1}, Ll/ܰ۫֨;->֫(Ll/ۗ֨۠;)Ll/ܰ۫֨;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۖ۠;->֫:Ll/ܰ۫֨;

    .line 116
    invoke-static {p1}, Ll/᩹ܽ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܽ۠;

    .line 117
    const-class v0, Ll/ܳۖ֨;

    invoke-virtual {p1, v0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۖ֨;

    .line 119
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    .line 120
    invoke-static {p1}, Ll/ܽ֡֨;->֫(Ll/ۗ֨۠;)Ll/ܽ֡֨;

    move-result-object p1

    .line 121
    sget-object v0, Ll/ۧ֡֨;->᩷֫:Ll/ۧ֡֨;

    invoke-virtual {v0, p1}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    return-void
.end method

.method public static ֫(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 812
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 814
    invoke-virtual {p0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 813
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/᩸ۖ۠;
    .locals 1

    .line 102
    const-class v0, Ll/᩸ۖ۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ۖ۠;

    if-nez v0, :cond_0

    .line 104
    new-instance v0, Ll/᩸ۖ۠;

    invoke-direct {v0, p0}, Ll/᩸ۖ۠;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ۨ᩸۠;)Ll/ۖܶ۠;
    .locals 9

    .line 583
    const-class v0, Ll/ۛ֡֨;

    invoke-static {v0, p1}, Ll/᩸ۖ۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ֡֨;

    .line 584
    invoke-virtual {p1}, Ll/ۛ֡֨;->ۤ()Ll/ۖܶ۠;

    move-result-object v0

    .line 585
    :goto_0
    invoke-virtual {p1}, Ll/ۛ֡֨;->֫()Ll/᩺᩸۠;

    move-result-object v1

    sget-object v2, Ll/᩺᩸۠;->ۙ:Ll/᩺᩸۠;

    if-ne v1, v2, :cond_5

    .line 586
    check-cast p1, Ll/ܳ֡֨;

    invoke-virtual {p1}, Ll/ܳ֡֨;->ۛ֫()Ll/ۙ֨֨;

    move-result-object p1

    .line 587
    sget-object v1, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {p1, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v1, p0, Ll/᩸ۖ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object v2, v1, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    iget-object v2, v2, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne p1, v2, :cond_0

    goto :goto_2

    .line 593
    :cond_0
    invoke-virtual {p1}, Ll/ۛ֡֨;->ۤ()Ll/ۖܶ۠;

    move-result-object v2

    .line 594
    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v3, v0

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽۘ֨;

    .line 595
    iget-object v5, v4, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    .line 608
    iget-object v5, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v6, v1, Ll/᩷ۚ֨;->ܰ:Ll/ۙ֨֨;

    iget-object v6, v6, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v5, v6}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 595
    iget-object v5, v4, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    .line 617
    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܽۘ֨;

    .line 618
    iget-object v7, v7, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    iget-object v7, v7, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v8, v5, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v7, v8, :cond_2

    goto :goto_1

    .line 597
    :cond_3
    invoke-virtual {v3, v4}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v3

    goto :goto_1

    :cond_4
    move-object v0, v3

    goto :goto_0

    :cond_5
    :goto_2
    return-object v0
.end method

.method public final ֫(Ll/ܳ֡֨;)Ll/۠֡֨;
    .locals 2

    .line 448
    invoke-virtual {p1}, Ll/ܳ֡֨;->֫()Ll/᩺᩸۠;

    move-result-object v0

    sget-object v1, Ll/᩺᩸۠;->֫֫:Ll/᩺᩸۠;

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 451
    :cond_0
    const-class v0, Ll/ۛ֡֨;

    invoke-static {v0, p1}, Ll/᩸ۖ۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ֡֨;

    invoke-virtual {p1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۡ᩹۠;)Ll/ܿ᩹۠;
    .locals 3

    .line 456
    const-class v0, Ll/ۛ֡֨;

    invoke-static {v0, p1}, Ll/᩸ۖ۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֡֨;

    .line 457
    iget-object v1, p0, Ll/᩸ۖ۠;->ۧ:Ll/ۗܰ֨;

    invoke-virtual {v1}, Ll/ۗܰ֨;->ܳ()Ll/֡֡֨;

    move-result-object v1

    iget-object v2, p0, Ll/᩸ۖ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object v2, v2, Ll/᩷ۚ֨;->ۚ֫:Ll/֡֡֨;

    if-ne v1, v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 459
    :cond_0
    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->۟:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_1

    check-cast p1, Ll/ܿ᩹۠;

    return-object p1

    :cond_1
    invoke-virtual {v0}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object p1

    iget-object p1, p1, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    return-object p1
.end method

.method public final ֫(Ll/۫᩸۠;)Ll/᩶᩹۠;
    .locals 1

    .line 483
    const-class v0, Ll/ܽۘ֨;

    invoke-static {v0, p1}, Ll/᩸ۖ۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۘ֨;

    .line 484
    invoke-virtual {p1}, Ll/ܽۘ֨;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 485
    sget-object p1, Ll/᩶᩹۠;->᩶:Ll/᩶᩹۠;

    return-object p1

    .line 486
    :cond_0
    sget-object p1, Ll/᩶᩹۠;->᩹:Ll/᩶᩹۠;

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 818
    iget-object v0, p0, Ll/᩸ۖ۠;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final ۧ(Ll/ۨ᩸۠;)Ljava/lang/String;
    .locals 3

    .line 729
    const-class v0, Ll/ۛ֡֨;

    invoke-static {v0, p1}, Ll/᩸ۖ۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ֡֨;

    .line 782
    sget-object v0, Ll/ܶۖ۠;->֫:[I

    iget-object v1, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 790
    invoke-virtual {p1}, Ll/ۛ֡֨;->ۙ()Ll/ܳ֡֨;

    move-result-object v0

    goto :goto_0

    .line 787
    :cond_0
    move-object v0, p1

    check-cast v0, Ll/֡֡֨;

    goto :goto_0

    .line 784
    :cond_1
    move-object v0, p1

    check-cast v0, Ll/۠֡֨;

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 793
    iget-object v2, p0, Ll/᩸ۖ۠;->֫:Ll/ܰ۫֨;

    invoke-virtual {v2, v0}, Ll/ܰ۫֨;->֫(Ll/᩶֡֨;)Ll/֫ۤ֨;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_3

    goto :goto_2

    .line 733
    :cond_3
    iget-object v2, v0, Ll/֫ۤ֨;->ۤ:Ll/ۚۚ۠;

    invoke-static {p1, v2}, Ll/۟ۚ۠;->֫(Ll/ۛ֡֨;Ll/ۚۚ۠;)Ll/ۚۚ۠;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 734
    iget-object v0, v0, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    if-nez v0, :cond_4

    goto :goto_2

    .line 736
    :cond_4
    new-instance v1, Ll/᩺ܶ۠;

    invoke-direct {v1, p1, v0}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_2
    if-nez v1, :cond_6

    goto :goto_3

    .line 439
    :cond_6
    iget-object p1, v1, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    check-cast p1, Ll/ۚۚ۠;

    .line 440
    iget-object v0, v1, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/֨᩵۠;

    .line 441
    iget-object v0, v0, Ll/֨᩵۠;->۬:Ll/ۡۘ۠;

    if-nez v0, :cond_7

    :goto_3
    const/4 p1, 0x0

    return-object p1

    .line 443
    :cond_7
    invoke-virtual {v0, p1}, Ll/ۡۘ۠;->֫(Ll/ۚۚ۠;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/ۨ᩸۠;)Ll/᩶᩹۠;
    .locals 6

    .line 471
    const-class v0, Ll/ۛ֡֨;

    invoke-static {v0, p1}, Ll/᩸ۖ۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ֡֨;

    .line 472
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide v2, 0x1000000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 473
    sget-object p1, Ll/᩶᩹۠;->᩶:Ll/᩶᩹۠;

    return-object p1

    .line 474
    :cond_0
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide/32 v4, 0x8000

    and-long/2addr v0, v4

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    .line 475
    sget-object p1, Ll/᩶᩹۠;->᩶:Ll/᩶᩹۠;

    return-object p1

    .line 478
    :cond_1
    sget-object p1, Ll/᩶᩹۠;->᩹:Ll/᩶᩹۠;

    return-object p1
.end method
