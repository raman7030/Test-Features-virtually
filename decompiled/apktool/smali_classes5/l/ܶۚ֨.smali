.class public Ll/ܶۚ֨;
.super Ll/ۡ֨֨;
.source "34PY"


# instance fields
.field public ᩺:Ll/᩶֨֨;


# direct methods
.method public constructor <init>(Ll/ۤܶ۠;Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/᩶֨֨;)V
    .locals 0

    .line 1734
    invoke-direct {p0, p2, p4, p1}, Ll/ۡ֨֨;-><init>(Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;)V

    .line 1735
    iput-object p4, p0, Ll/ۡ֨֨;->ۛ:Ll/ۙ֨֨;

    .line 1736
    invoke-virtual {p0, p3}, Ll/ۡ֨֨;->ᩳ(Ll/ۙ֨֨;)V

    .line 1737
    iput-object p5, p0, Ll/ܶۚ֨;->᩺:Ll/᩶֨֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1775
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 459
    invoke-virtual {p0, v0, v1}, Ll/ۙ֨֨;->֫(Ljava/lang/StringBuilder;Z)V

    const-string v1, "capture#"

    .line 1777
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1778
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    int-to-long v1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    const-wide/16 v3, 0x3e5

    rem-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " of "

    .line 1779
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1780
    iget-object v1, p0, Ll/ܶۚ֨;->᩺:Ll/᩶֨֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1781
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1765
    invoke-interface {p1, p0, p2}, Ll/᩸֨֨;->֫(Ll/ܶۚ֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ֫(Ll/᩷۠֨;)Ll/ۙ֨֨;
    .locals 0

    .line 1725
    invoke-virtual {p0, p1}, Ll/ܶۚ֨;->֫(Ll/᩷۠֨;)Ll/ܶۚ֨;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ֫(Ll/᩷۠֨;)Ll/ۡ֨֨;
    .locals 0

    .line 1725
    invoke-virtual {p0, p1}, Ll/ܶۚ֨;->֫(Ll/᩷۠֨;)Ll/ܶۚ֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩷۠֨;)Ll/ܶۚ֨;
    .locals 8

    .line 1752
    new-instance v7, Ll/۠ۚ֨;

    iget-object v2, p0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p0}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object v3

    invoke-virtual {p0}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    iget-object v4, p0, Ll/ۡ֨֨;->ۛ:Ll/ۙ֨֨;

    iget-object v5, p0, Ll/ܶۚ֨;->᩺:Ll/᩶֨֨;

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Ll/۠ۚ֨;-><init>(Ll/ܶۚ֨;Ll/᩶֡֨;Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/᩶֨֨;Ll/᩷۠֨;)V

    return-object v7
.end method

.method public final ۫֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
