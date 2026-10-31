.class public final Ll/۫ۤ֨;
.super Ll/ܳۤ֨;
.source "6428"


# instance fields
.field public final ܿ:Ljava/util/HashSet;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ۤۤ֨;)V
    .locals 0

    .line 1595
    invoke-direct {p0, p1}, Ll/ܳۤ֨;-><init>(Ll/ۤۤ֨;)V

    .line 1592
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/۫ۤ֨;->ܿ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۘ᩵۠;)V
    .locals 3

    .line 1630
    iget-boolean v0, p0, Ll/۫ۤ֨;->ᩳ:Z

    invoke-static {p0}, Ll/ܳۤ֨;->֫(Ll/ܳۤ֨;)Ll/ۗۤ֨;

    move-result-object v1

    sget-object v2, Ll/ۗۤ֨;->᩹:Ll/ۗۤ֨;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Ll/۫ۤ֨;->ܿ:Ljava/util/HashSet;

    iget-object v2, p1, Ll/ۘ᩵۠;->۬:Ll/ۚۚ۠;

    .line 1631
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Ll/۫ۤ֨;->ᩳ:Z

    .line 1632
    invoke-super {p0, p1}, Ll/ܳۤ֨;->֫(Ll/ۘ᩵۠;)V

    return-void
.end method

.method public final ֫(Ll/ۙ᩵۠;)V
    .locals 1

    .line 1618
    iget-object v0, p0, Ll/۫ۤ֨;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1619
    invoke-super {p0, p1}, Ll/ܳۤ֨;->֫(Ll/ۙ᩵۠;)V

    return-void
.end method

.method public final ֫(Ll/ۡۚ۠;)V
    .locals 1

    .line 1606
    iget-object v0, p0, Ll/۫ۤ֨;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1607
    invoke-super {p0, p1}, Ll/ܳۤ֨;->֫(Ll/ۡۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/ۨ᩵۠;)V
    .locals 1

    .line 1612
    iget-object v0, p0, Ll/۫ۤ֨;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1613
    invoke-super {p0, p1}, Ll/ܳۤ֨;->֫(Ll/ۨ᩵۠;)V

    return-void
.end method

.method public final ֫(Ll/ᩳ֡۠;)V
    .locals 1

    .line 1600
    iget-object v0, p0, Ll/۫ۤ֨;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1601
    invoke-super {p0, p1}, Ll/ܳۤ֨;->֫(Ll/ᩳ֡۠;)V

    return-void
.end method

.method public final ֫(Ll/᩶᩵۠;)V
    .locals 1

    .line 1624
    iget-object v0, p0, Ll/۫ۤ֨;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1625
    invoke-super {p0, p1}, Ll/ܳۤ֨;->֫(Ll/᩶᩵۠;)V

    return-void
.end method

.method public final ܿ()Z
    .locals 1

    .line 1636
    iget-boolean v0, p0, Ll/۫ۤ֨;->ᩳ:Z

    return v0
.end method
