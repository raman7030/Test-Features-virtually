.class public final Ll/ۢ۫֨;
.super Ll/ܳ֨۠;
.source "W7SR"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/ۗ۠۠;


# virtual methods
.method public final ۧ(Ll/ۚۚ۠;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 527
    iget-object v0, p0, Ll/ۢ۫֨;->ۧ:Ll/ۗ۠۠;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    .line 528
    iput-boolean v0, p0, Ll/ۢ۫֨;->֫:Z

    .line 530
    :cond_0
    invoke-super {p0, p1}, Ll/ܳ֨۠;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method
