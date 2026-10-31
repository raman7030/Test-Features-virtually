.class public Ll/ۡ֨֨;
.super Ll/ۙ֨֨;
.source "34PY"


# instance fields
.field public ۛ:Ll/ۙ֨֨;

.field public ۤ:Ll/ۙ֨֨;

.field public ۨ:I


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;)V
    .locals 8

    .line 1642
    sget-object v0, Ll/᩷۠֨;->ۧ:Ll/᩷۠֨;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Ll/ۙ֨֨;-><init>(Ll/᩶֡֨;Ll/᩷۠֨;)V

    .line 1632
    iput-object v1, p0, Ll/ۡ֨֨;->ۤ:Ll/ۙ֨֨;

    const/4 v0, -0x1

    .line 1689
    iput v0, p0, Ll/ۡ֨֨;->ۨ:I

    .line 1643
    invoke-static {p2}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 1644
    new-instance v0, Ll/ۙ֡֨;

    const-wide/16 v3, 0x0

    move-object v2, v0

    move-object v5, p3

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, Ll/ۙ֡֨;-><init>(JLl/ۤܶ۠;Ll/ۡ֨֨;Ll/ۛ֡֨;)V

    iput-object v0, p0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 1645
    invoke-virtual {p0, v1}, Ll/ۡ֨֨;->ᩳ(Ll/ۙ֨֨;)V

    .line 1646
    iput-object p2, p0, Ll/ۡ֨֨;->ۛ:Ll/ۙ֨֨;

    return-void
.end method

.method public constructor <init>(Ll/᩶֡֨;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/᩷۠֨;)V
    .locals 0

    .line 1655
    invoke-direct {p0, p1, p4}, Ll/ۙ֨֨;-><init>(Ll/᩶֡֨;Ll/᩷۠֨;)V

    const/4 p1, 0x0

    .line 1632
    iput-object p1, p0, Ll/ۡ֨֨;->ۤ:Ll/ۙ֨֨;

    const/4 p1, -0x1

    .line 1689
    iput p1, p0, Ll/ۡ֨֨;->ۨ:I

    .line 1656
    invoke-static {p3}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 1657
    invoke-virtual {p0, p2}, Ll/ۡ֨֨;->ᩳ(Ll/ۙ֨֨;)V

    .line 1658
    iput-object p3, p0, Ll/ۡ֨֨;->ۛ:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final ֨֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1681
    invoke-interface {p1, p0, p2}, Ll/᩸֨֨;->֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/֡᩹۠;
    .locals 1

    .line 1698
    sget-object v0, Ll/֡᩹۠;->᩻֫:Ll/֡᩹۠;

    return-object v0
.end method

.method public bridge synthetic ֫(Ll/᩷۠֨;)Ll/ۙ֨֨;
    .locals 0

    .line 1620
    invoke-virtual {p0, p1}, Ll/ۡ֨֨;->֫(Ll/᩷۠֨;)Ll/ۡ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/᩷۠֨;)Ll/ۡ֨֨;
    .locals 7

    .line 1663
    new-instance v6, Ll/ۢ֨֨;

    iget-object v2, p0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p0}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object v3

    iget-object v4, p0, Ll/ۡ֨֨;->ۛ:Ll/ۙ֨֨;

    move-object v0, v6

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ll/ۢ֨֨;-><init>(Ll/ۡ֨֨;Ll/᩶֡֨;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/᩷۠֨;)V

    return-object v6
.end method

.method public final ֫֫()Ll/ۢ۠֨;
    .locals 1

    .line 1676
    sget-object v0, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    return-object v0
.end method

.method public final ۤ()Ll/ۙ֨֨;
    .locals 1

    .line 1693
    iget-object v0, p0, Ll/ۡ֨֨;->ۛ:Ll/ۙ֨֨;

    return-object v0
.end method

.method public ۫֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ᩳ(Ll/ۙ֨֨;)V
    .locals 0

    .line 1687
    iput-object p1, p0, Ll/ۡ֨֨;->ۤ:Ll/ۙ֨֨;

    return-void
.end method

.method public ᩳ֫()Ll/ۙ֨֨;
    .locals 1

    .line 1685
    iget-object v0, p0, Ll/ۡ֨֨;->ۤ:Ll/ۙ֨֨;

    return-object v0
.end method
