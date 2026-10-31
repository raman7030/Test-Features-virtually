.class public final Ll/᩷۬֨;
.super Ll/֡ۚ۠;
.source "542M"


# instance fields
.field public ֫:Z


# virtual methods
.method public final ֫(Ll/ۚۚ۠;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۢۚ۠;)V
    .locals 5

    .line 1360
    iget-object v0, p1, Ll/ۢۚ۠;->۫:Ll/ۖ֡۠;

    iget-wide v0, v0, Ll/ۖ֡۠;->۬:J

    const-wide/16 v2, 0x4000

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 1361
    iget-object p1, p1, Ll/ۢۚ۠;->۬:Ll/۫᩵۠;

    instance-of v0, p1, Ll/᩵֡۠;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩵֡۠;

    iget-object p1, p1, Ll/᩵֡۠;->ۨ:Ll/ۚ᩵۠;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 1362
    iput-boolean p1, p0, Ll/᩷۬֨;->֫:Z

    :cond_0
    return-void
.end method
