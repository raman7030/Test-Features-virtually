.class public final Ll/ۚۡܺ;
.super Ll/ܳۡܺ;
.source "4BEJ"


# direct methods
.method public constructor <init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V
    .locals 0

    .line 42
    invoke-direct/range {p0 .. p5}, Ll/ܳۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V

    .line 44
    invoke-virtual {p1}, Ll/ۗۡܺ;->ۧ()I

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    return-void

    .line 45
    :cond_0
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
    .locals 1

    .line 70
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩸ۡܺ;Ll/᩶ۡܺ;)Ll/ܺۡܺ;
    .locals 7

    .line 91
    new-instance v6, Ll/ۚۡܺ;

    invoke-virtual {p0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v2

    .line 94
    invoke-virtual {p0}, Ll/ܳۡܺ;->ᩴ()Ll/ܰۡܺ;

    move-result-object v5

    move-object v0, v6

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Ll/ۚۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V

    return-object v6
.end method

.method public final ֫(Ll/ۡۡܺ;)V
    .locals 0

    .line 62
    invoke-interface {p1, p0}, Ll/ۡۡܺ;->֫(Ll/ۚۡܺ;)V

    return-void
.end method

.method public final ܽ()Ll/ۧۖܺ;
    .locals 1

    .line 54
    sget-object v0, Ll/ܰܺܺ;->᩺:Ll/ܰܺܺ;

    return-object v0
.end method
