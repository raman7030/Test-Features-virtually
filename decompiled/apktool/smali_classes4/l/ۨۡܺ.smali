.class public final Ll/ۨۡܺ;
.super Ll/ܳۡܺ;
.source "SBDW"


# instance fields
.field public final ۬:Ll/ۧۖܺ;


# direct methods
.method public constructor <init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ۧۖܺ;Ll/ܰۡܺ;)V
    .locals 6

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    .line 47
    invoke-direct/range {v0 .. v5}, Ll/ܳۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V

    .line 49
    invoke-virtual {p1}, Ll/ۗۡܺ;->ۧ()I

    move-result p2

    const/4 p3, 0x6

    if-ne p2, p3, :cond_1

    if-eqz p4, :cond_0

    .line 57
    iput-object p4, p0, Ll/ۨۡܺ;->۬:Ll/ۧۖܺ;

    return-void

    .line 54
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "catches == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 50
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "opcode with invalid branchingness: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۗۡܺ;->ۧ()I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final ֫(Ll/۟ܺܺ;)Ll/ܺۡܺ;
    .locals 7

    .line 94
    new-instance v6, Ll/ۨۡܺ;

    invoke-virtual {p0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v2

    .line 95
    invoke-virtual {p0}, Ll/ܺۡܺ;->ۖ()Ll/᩶ۡܺ;

    move-result-object v3

    iget-object v0, p0, Ll/ۨۡܺ;->۬:Ll/ۧۖܺ;

    invoke-interface {v0, p1}, Ll/ۧۖܺ;->֫(Ll/۟ܺܺ;)Ll/ۧۖܺ;

    move-result-object v4

    .line 96
    invoke-virtual {p0}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۨۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ۧۖܺ;Ll/ܰۡܺ;)V

    return-object v6
.end method

.method public final ֫(Ll/᩸ۡܺ;Ll/᩶ۡܺ;)Ll/ܺۡܺ;
    .locals 6

    .line 117
    new-instance p1, Ll/ۨۡܺ;

    invoke-virtual {p0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v2

    iget-object v4, p0, Ll/ۨۡܺ;->۬:Ll/ۧۖܺ;

    .line 120
    invoke-virtual {p0}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object v5

    move-object v0, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Ll/ۨۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ۧۖܺ;Ll/ܰۡܺ;)V

    return-object p1
.end method

.method public final ֫(Ll/ۡۡܺ;)V
    .locals 0

    .line 86
    invoke-interface {p1, p0}, Ll/ۡۡܺ;->֫(Ll/ۨۡܺ;)V

    return-void
.end method

.method public final ܽ()Ll/ۧۖܺ;
    .locals 1

    .line 78
    iget-object v0, p0, Ll/ۨۡܺ;->۬:Ll/ۧۖܺ;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 3

    .line 65
    invoke-virtual {p0}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object v0

    .line 66
    invoke-interface {v0}, Ll/֡ᩴܺ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 67
    instance-of v2, v0, Ll/۬ܺܺ;

    if-eqz v2, :cond_0

    .line 68
    check-cast v0, Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->ۚ()Ljava/lang/String;

    move-result-object v1

    :cond_0
    const-string v0, " "

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 70
    iget-object v1, p0, Ll/ۨۡܺ;->۬:Ll/ۧۖܺ;

    invoke-static {v1}, Ll/᩺ۡܺ;->֫(Ll/ۧۖܺ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
