.class public final Ll/ۤܳܺ;
.super Ll/ۨܿܺ;
.source "PBDJ"


# static fields
.field public static final ֫:Ll/ۤܳܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Ll/ۤܳܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    sput-object v0, Ll/ۤܳܺ;->֫:Ll/ۤܳܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ֫(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 3

    .line 52
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 53
    check-cast p1, Ll/᩸ܿܺ;

    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/֨ܺܺ;

    .line 55
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

    .line 104
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 105
    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v1, 0x0

    .line 107
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
    .locals 3

    .line 116
    invoke-virtual {p2}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 117
    move-object v1, p2

    check-cast v1, Ll/᩸ܿܺ;

    .line 118
    invoke-virtual {v1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object v1

    check-cast v1, Ll/֨ܺܺ;

    invoke-virtual {v1}, Ll/֨ܺܺ;->ᩴ()I

    move-result v1

    const/4 v2, 0x0

    .line 121
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    int-to-short v0, v1

    .line 120
    invoke-static {p1, p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۛۘܺ;SS)V

    return-void
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 1

    .line 63
    check-cast p1, Ll/᩸ܿܺ;

    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/֨ܺܺ;

    const/16 v0, 0x10

    .line 64
    invoke-static {p1, v0}, Ll/ۨܿܺ;->֫(Ll/֨ܺܺ;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 4

    .line 80
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 81
    instance-of v1, p1, Ll/᩸ܿܺ;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 82
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    .line 83
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {v0}, Ll/ۨܿܺ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 87
    :cond_0
    check-cast p1, Ll/᩸ܿܺ;

    .line 88
    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    .line 90
    instance-of v0, p1, Ll/֨ܺܺ;

    if-nez v0, :cond_1

    goto :goto_0

    .line 94
    :cond_1
    check-cast p1, Ll/֨ܺܺ;

    .line 96
    invoke-virtual {p1}, Ll/֨ܺܺ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll/֨ܺܺ;->ᩴ()I

    move-result p1

    int-to-short v0, p1

    if-ne v0, p1, :cond_2

    return v3

    :cond_2
    :goto_0
    return v2
.end method
