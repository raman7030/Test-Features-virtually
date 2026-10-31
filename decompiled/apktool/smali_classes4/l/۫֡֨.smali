.class public Ll/۫֡֨;
.super Ll/ۛ֡֨;
.source "643O"

# interfaces
.implements Ll/ۘ᩹۠;


# instance fields
.field public ۛ:I

.field public ۨ:Ljava/lang/Object;

.field public ᩺:I


# direct methods
.method public constructor <init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V
    .locals 7

    .line 1662
    sget-object v1, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Ll/ۛ֡֨;-><init>(Ll/֨ᩴ֨;JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    const/4 p1, -0x1

    .line 1646
    iput p1, p0, Ll/۫֡֨;->᩺:I

    .line 1657
    iput p1, p0, Ll/۫֡֨;->ۛ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1696
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1727
    invoke-virtual {p1, p0, p2}, Ll/۠᩹۠;->֫(Ll/۫֡֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۤ֡֨;Ljava/util/Locale;)Ljava/lang/Object;
    .locals 0

    .line 1783
    invoke-interface {p1, p0, p2}, Ll/ۤ֡֨;->֫(Ll/۫֡֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۛ᩸֨;)Ll/ۛ֡֨;
    .locals 7

    .line 1700
    new-instance v6, Ll/۫֡֨;

    iget-wide v1, p0, Ll/ۛ֡֨;->᩶:J

    iget-object v3, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p2, p0, p1}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v4

    iget-object v5, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    return-object v6
.end method

.method public ֫()Ll/᩺᩸۠;
    .locals 7

    .line 111
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    const-wide v2, 0x200000000L

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_1

    .line 1707
    invoke-virtual {p0}, Ll/۫֡֨;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1708
    sget-object v0, Ll/᩺᩸۠;->ۤ:Ll/᩺᩸۠;

    return-object v0

    .line 1710
    :cond_0
    sget-object v0, Ll/᩺᩸۠;->ᩳ֫:Ll/᩺᩸۠;

    return-object v0

    :cond_1
    const-wide/16 v2, 0x4000

    and-long/2addr v2, v0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    .line 1712
    sget-object v0, Ll/᩺᩸۠;->۫:Ll/᩺᩸۠;

    return-object v0

    .line 1713
    :cond_2
    iget-object v2, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v2, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-eq v2, v3, :cond_6

    sget-object v3, Ll/֨ᩴ֨;->᩺:Ll/֨ᩴ֨;

    if-ne v2, v3, :cond_3

    goto :goto_0

    .line 1715
    :cond_3
    invoke-virtual {p0}, Ll/۫֡֨;->ۗ֫()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1716
    sget-object v0, Ll/᩺᩸۠;->᩻֫:Ll/᩺᩸۠;

    return-object v0

    :cond_4
    const-wide/high16 v2, 0x800000000000000L

    and-long/2addr v0, v2

    cmp-long v2, v0, v4

    if-eqz v2, :cond_5

    .line 1718
    sget-object v0, Ll/᩺᩸۠;->᩶:Ll/᩺᩸۠;

    return-object v0

    .line 1721
    :cond_5
    sget-object v0, Ll/᩺᩸۠;->ܰ:Ll/᩺᩸۠;

    return-object v0

    .line 1714
    :cond_6
    :goto_0
    sget-object v0, Ll/᩺᩸۠;->ۛ:Ll/᩺᩸۠;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 1

    .line 1778
    instance-of v0, p1, Ll/֫ۤ֨;

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Ll/۫ۙ;->֫(Ljava/lang/Object;Z)V

    .line 1779
    iput-object p1, p0, Ll/۫֡֨;->ۨ:Ljava/lang/Object;

    return-void
.end method

.method public final ۗ֫()Z
    .locals 2

    .line 1756
    iget-object v0, p0, Ll/۫֡֨;->ۨ:Ljava/lang/Object;

    sget-object v1, Ll/᩺᩸۠;->᩻֫:Ll/᩺᩸۠;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۘ()I
    .locals 1

    const/16 v0, 0x9

    return v0
.end method

.method public final ۙ֫()Z
    .locals 2

    .line 1752
    iget-object v0, p0, Ll/۫֡֨;->ۨ:Ljava/lang/Object;

    sget-object v1, Ll/᩺᩸۠;->ۤ:Ll/᩺᩸۠;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۜ()Ll/ۨ᩸۠;
    .locals 1

    .line 707
    iget-object v0, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    return-object v0
.end method

.method public bridge synthetic ۧ(Ll/ۛ֡֨;)Ll/ۛ֡֨;
    .locals 0

    .line 1642
    invoke-virtual {p0, p1}, Ll/۫֡֨;->ۧ(Ll/ۛ֡֨;)Ll/۫֡֨;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۛ֡֨;)Ll/۫֡֨;
    .locals 9

    .line 1677
    new-instance v8, Ll/۬֡֨;

    iget-wide v2, p0, Ll/ۛ֡֨;->᩶:J

    iget-object v4, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v5, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Ll/۬֡֨;-><init>(Ll/۫֡֨;JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;Ll/ۛ֡֨;)V

    .line 1688
    iget p1, p0, Ll/۫֡֨;->᩺:I

    iput p1, v8, Ll/۫֡֨;->᩺:I

    .line 1689
    iget p1, p0, Ll/۫֡֨;->ۛ:I

    iput p1, v8, Ll/۫֡֨;->ۛ:I

    .line 1690
    iget-object p1, p0, Ll/۫֡֨;->ۨ:Ljava/lang/Object;

    iput-object p1, v8, Ll/۫֡֨;->ۨ:Ljava/lang/Object;

    return-object v8
.end method

.method public ᩴ()Ll/ۤܶ۠;
    .locals 1

    .line 723
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    return-object v0
.end method

.method public ᩵()Ll/ۙ֨֨;
    .locals 1

    .line 702
    iget-object v0, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    return-object v0
.end method

.method public final ᩶֫()Ljava/lang/Object;
    .locals 2

    .line 1732
    invoke-virtual {p0}, Ll/۫֡֨;->᩹֫()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-static {v0, v1}, Ll/᩹֨۠;->֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ᩷()Ll/ۖܶ۠;
    .locals 1

    .line 1642
    invoke-virtual {p0}, Ll/ۛ֡֨;->ۤ()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ᩹֫()Ljava/lang/Object;
    .locals 3

    .line 1761
    iget-object v0, p0, Ll/۫֡֨;->ۨ:Ljava/lang/Object;

    sget-object v1, Ll/᩺᩸۠;->ۤ:Ll/᩺᩸۠;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    sget-object v1, Ll/᩺᩸۠;->᩻֫:Ll/᩺᩸۠;

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 1764
    :cond_0
    instance-of v1, v0, Ljava/util/concurrent/Callable;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/util/concurrent/Callable;

    .line 1767
    iput-object v2, p0, Ll/۫֡֨;->ۨ:Ljava/lang/Object;

    .line 1769
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/۫֡֨;->ۨ:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1771
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 1774
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/۫֡֨;->ۨ:Ljava/lang/Object;

    return-object v0

    :cond_2
    :goto_1
    return-object v2
.end method
