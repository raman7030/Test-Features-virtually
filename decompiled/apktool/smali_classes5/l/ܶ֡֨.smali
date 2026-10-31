.class public final Ll/ܶ֡֨;
.super Ll/۫֡֨;
.source "643O"


# virtual methods
.method public final ܽ֫()Ll/ۤܶ۠;
    .locals 9

    .line 1855
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v2, 0x10000000000000L

    and-long v4, v0, v2

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-nez v8, :cond_1

    or-long/2addr v0, v2

    .line 1856
    iput-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_0

    .line 1858
    instance-of v1, v0, Ll/᩹֡֨;

    if-nez v1, :cond_0

    .line 1859
    iget-object v0, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 1862
    check-cast v0, Ll/᩹֡֨;

    iget-object v0, v0, Ll/᩹֡֨;->ۧ֫:Ll/ۗᩴ֨;

    .line 1863
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    :cond_1
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    return-object v0
.end method

.method public final bridge synthetic ᩴ()Ll/ۤܶ۠;
    .locals 1

    .line 1848
    invoke-virtual {p0}, Ll/ܶ֡֨;->ܽ֫()Ll/ۤܶ۠;

    move-result-object v0

    return-object v0
.end method
