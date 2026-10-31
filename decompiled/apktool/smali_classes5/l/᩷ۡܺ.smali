.class public final Ll/᩷ۡܺ;
.super Ll/ܺۡܺ;
.source "RBB2"


# instance fields
.field public final ۗ:Ll/ܰۡܺ;

.field public final ۬:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ljava/util/ArrayList;Ll/ܰۡܺ;)V
    .locals 1

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, p2, v0, p3}, Ll/ܺۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    .line 59
    invoke-virtual {p1}, Ll/ۗۡܺ;->ۧ()I

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    .line 63
    iput-object p4, p0, Ll/᩷ۡܺ;->۬:Ljava/util/ArrayList;

    .line 64
    iput-object p5, p0, Ll/᩷ۡܺ;->ۗ:Ll/ܰۡܺ;

    return-void

    .line 60
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

    .line 107
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩸ۡܺ;Ll/᩶ۡܺ;)Ll/ܺۡܺ;
    .locals 6

    .line 127
    new-instance p1, Ll/᩷ۡܺ;

    invoke-virtual {p0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v2

    iget-object v4, p0, Ll/᩷ۡܺ;->۬:Ljava/util/ArrayList;

    iget-object v5, p0, Ll/᩷ۡܺ;->ۗ:Ll/ܰۡܺ;

    move-object v0, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Ll/᩷ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ljava/util/ArrayList;Ll/ܰۡܺ;)V

    return-object p1
.end method

.method public final ֫(Ll/ۡۡܺ;)V
    .locals 0

    .line 99
    invoke-interface {p1, p0}, Ll/ۡۡܺ;->֫(Ll/᩷ۡܺ;)V

    return-void
.end method

.method public final ܽ()Ll/ۧۖܺ;
    .locals 1

    .line 73
    sget-object v0, Ll/ܰܺܺ;->᩺:Ll/ܰܺܺ;

    return-object v0
.end method

.method public final ᩴ()Ll/ܰۡܺ;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/᩷ۡܺ;->ۗ:Ll/ܰۡܺ;

    return-object v0
.end method

.method public final ᩵()Ljava/util/ArrayList;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/᩷ۡܺ;->۬:Ljava/util/ArrayList;

    return-object v0
.end method
