.class public final Ll/ܺۤۜ;
.super Ljava/lang/Object;
.source "D8GL"


# instance fields
.field public ֫:Ll/ۖۤۜ;

.field public ۧ:J

.field public ܽ:Ll/ۖۤۜ;


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 5644
    iput-object v0, p0, Ll/ܺۤۜ;->ܽ:Ll/ۖۤۜ;

    .line 5645
    iput-object v0, p0, Ll/ܺۤۜ;->֫:Ll/ۖۤۜ;

    const-wide/16 v0, 0x0

    .line 5646
    iput-wide v0, p0, Ll/ܺۤۜ;->ۧ:J

    return-void
.end method

.method public final ֫(Ll/ۖۤۜ;)Z
    .locals 4

    .line 5616
    iget-object v0, p0, Ll/ܺۤۜ;->֫:Ll/ۖۤۜ;

    if-eqz v0, :cond_1

    .line 5617
    invoke-virtual {v0}, Ll/ۖۤۜ;->֡()J

    move-result-wide v0

    invoke-virtual {p1}, Ll/ۖۤۜ;->֡()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5620
    iput-object p1, p0, Ll/ܺۤۜ;->֫:Ll/ۖۤۜ;

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 5635
    iget-object v0, p0, Ll/ܺۤۜ;->֫:Ll/ۖۤۜ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(Ll/ۖۤۜ;)Z
    .locals 4

    .line 5631
    iget-object v0, p0, Ll/ܺۤۜ;->ܽ:Ll/ۖۤۜ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۖۤۜ;->֡()J

    move-result-wide v0

    invoke-virtual {p1}, Ll/ۖۤۜ;->֡()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()J
    .locals 2

    .line 5639
    iget-wide v0, p0, Ll/ܺۤۜ;->ۧ:J

    return-wide v0
.end method

.method public final ܽ(Ll/ۖۤۜ;)V
    .locals 0

    .line 5594
    iput-object p1, p0, Ll/ܺۤۜ;->ܽ:Ll/ۖۤۜ;

    return-void
.end method

.method public final ᩳ()Ll/ۖۤۜ;
    .locals 2

    .line 5600
    iget-object v0, p0, Ll/ܺۤۜ;->ܽ:Ll/ۖۤۜ;

    const/4 v1, 0x0

    .line 5601
    iput-object v1, p0, Ll/ܺۤۜ;->ܽ:Ll/ۖۤۜ;

    return-object v0
.end method

.method public final ᩳ(Ll/ۖۤۜ;)V
    .locals 2

    .line 5607
    iget-object v0, p0, Ll/ܺۤۜ;->֫:Ll/ۖۤۜ;

    if-nez v0, :cond_0

    .line 5610
    iput-object p1, p0, Ll/ܺۤۜ;->֫:Ll/ۖۤۜ;

    .line 5611
    invoke-virtual {p1}, Ll/ۖۤۜ;->֡()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܺۤۜ;->ۧ:J

    return-void

    .line 5608
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "HLS preview frame is already pending"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
