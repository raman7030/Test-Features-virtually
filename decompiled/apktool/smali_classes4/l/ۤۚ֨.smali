.class public Ll/ۤۚ֨;
.super Ll/ۙۚ֨;
.source "34PY"


# instance fields
.field public ۨ:Ll/ۖܶ۠;


# direct methods
.method public constructor <init>(Ll/ۙ֨֨;Ll/ۖܶ۠;)V
    .locals 1

    .line 1823
    sget-object v0, Ll/ۢ۠֨;->ۧ֫:Ll/ۢ۠֨;

    check-cast p1, Ll/ۧ֨֨;

    invoke-direct {p0, v0, p1}, Ll/ۙۚ֨;-><init>(Ll/ۢ۠֨;Ll/ۙ֨֨;)V

    .line 1824
    iput-object p2, p0, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1839
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 459
    invoke-virtual {p0, v0, v1}, Ll/ۙ֨֨;->֫(Ljava/lang/StringBuilder;Z)V

    const/16 v1, 0x3c

    .line 1841
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1842
    iget-object v1, p0, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    .line 1843
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1844
    iget-object v1, p0, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1845
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1834
    invoke-interface {p1, p0, p2}, Ll/᩸֨֨;->֫(Ll/ۤۚ֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/֡᩹۠;
    .locals 1

    .line 1876
    sget-object v0, Ll/֡᩹۠;->ۛ:Ll/֡᩹۠;

    return-object v0
.end method

.method public final ֫(Ll/᩷۠֨;)Ll/ۙ֨֨;
    .locals 1

    .line 1829
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Cannot add metadata to a forall type"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final ֫(Ll/ۙ֨֨;)Z
    .locals 1

    .line 1855
    iget-object v0, p0, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0, p1}, Ll/ۙ֨֨;->֫(Ll/ۙ֨֨;)Z

    move-result p1

    return p1
.end method

.method public final ۙ()V
    .locals 2

    .line 1863
    iget-object v0, p0, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    :goto_0
    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1864
    iget-object v1, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۡ֨֨;

    invoke-virtual {v1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۙ֨֨;->ۙ()V

    .line 1863
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    .line 1866
    :cond_0
    iget-object v0, p0, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->ۙ()V

    return-void
.end method

.method public final ܽ֫()Ll/ۖܶ۠;
    .locals 1

    .line 1848
    iget-object v0, p0, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    return-object v0
.end method

.method public final ᩹()Ll/ۧ֨֨;
    .locals 1

    .line 1859
    iget-object v0, p0, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    check-cast v0, Ll/ۧ֨֨;

    return-object v0
.end method

.method public final ᩻֫()Z
    .locals 1

    .line 1851
    iget-object v0, p0, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    return v0
.end method
