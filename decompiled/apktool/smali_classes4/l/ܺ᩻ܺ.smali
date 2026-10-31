.class public final Ll/ܺ᩻ܺ;
.super Ll/ۨܿܺ;
.source "CBAC"


# static fields
.field public static final ֫:Ll/ܺ᩻ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 38
    new-instance v0, Ll/ܺ᩻ܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    sput-object v0, Ll/ܺ᩻ܺ;->֫:Ll/ܺ᩻ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public final ֫(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 3

    .line 53
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 54
    check-cast p1, Ll/᩸ܿܺ;

    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/֨ܺܺ;

    .line 56
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->۠()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ll/ۨܿܺ;->֫(Ll/֨ܺܺ;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙܿܺ;)Ljava/util/BitSet;
    .locals 2

    .line 99
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 100
    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v1, 0x0

    .line 102
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    invoke-static {p1}, Ll/ۨܿܺ;->֫(I)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljava/util/BitSet;->set(IZ)V

    return-object v0
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 6

    .line 111
    invoke-virtual {p2}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 112
    move-object v1, p2

    check-cast v1, Ll/᩸ܿܺ;

    .line 113
    invoke-virtual {v1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object v1

    check-cast v1, Ll/ۚܺܺ;

    invoke-virtual {v1}, Ll/ۚܺܺ;->֡()J

    move-result-wide v1

    const/4 v3, 0x0

    .line 115
    invoke-virtual {v0, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    long-to-int v0, v1

    int-to-short v0, v0

    const/16 v3, 0x10

    shr-long v3, v1, v3

    long-to-int v4, v3

    int-to-short v3, v4

    const/16 v4, 0x20

    shr-long v4, v1, v4

    long-to-int v5, v4

    int-to-short v4, v5

    const/16 v5, 0x30

    shr-long/2addr v1, v5

    long-to-int v2, v1

    int-to-short v1, v2

    .line 615
    invoke-virtual {p1, p2}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 616
    invoke-virtual {p1, v0}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 617
    invoke-virtual {p1, v3}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 618
    invoke-virtual {p1, v4}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 619
    invoke-virtual {p1, v1}, Ll/ᩳᩴܺ;->ܳ(I)V

    return-void
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 1

    .line 64
    check-cast p1, Ll/᩸ܿܺ;

    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/֨ܺܺ;

    const/16 v0, 0x40

    .line 65
    invoke-static {p1, v0}, Ll/ۨܿܺ;->֫(Ll/֨ܺܺ;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 4

    .line 81
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 82
    instance-of v1, p1, Ll/᩸ܿܺ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 83
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_1

    .line 84
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {v0}, Ll/ۨܿܺ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    check-cast p1, Ll/᩸ܿܺ;

    .line 89
    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    .line 91
    instance-of p1, p1, Ll/ۚܺܺ;

    return p1

    :cond_1
    :goto_0
    return v2
.end method
