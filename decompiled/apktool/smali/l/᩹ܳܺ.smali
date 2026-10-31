.class public final Ll/᩹ܳܺ;
.super Ll/ۨܿܺ;
.source "5BAJ"


# static fields
.field public static final ֫:Ll/᩹ܳܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Ll/᩹ܳܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    sput-object v0, Ll/᩹ܳܺ;->֫:Ll/᩹ܳܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x1

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

    .line 105
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 106
    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v1, 0x0

    .line 108
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    invoke-static {p1}, Ll/ۨܿܺ;->ۧ(I)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljava/util/BitSet;->set(IZ)V

    return-object v0
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 3

    .line 117
    invoke-virtual {p2}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 118
    move-object v1, p2

    check-cast v1, Ll/᩸ܿܺ;

    .line 119
    invoke-virtual {v1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object v1

    check-cast v1, Ll/֨ܺܺ;

    invoke-virtual {v1}, Ll/֨ܺܺ;->ᩴ()I

    move-result v1

    const/4 v2, 0x0

    .line 122
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    and-int/lit8 v1, v1, 0xf

    invoke-static {v0, v1}, Ll/ۨܿܺ;->ۧ(II)I

    move-result v0

    invoke-static {p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    .line 556
    invoke-virtual {p1, p2}, Ll/ᩳᩴܺ;->ܳ(I)V

    return-void
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 1

    .line 63
    check-cast p1, Ll/᩸ܿܺ;

    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/֨ܺܺ;

    const/4 v0, 0x4

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

    .line 82
    instance-of v1, p1, Ll/᩸ܿܺ;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 83
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    .line 84
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {v0}, Ll/ۨܿܺ;->ۧ(I)Z

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
    instance-of v0, p1, Ll/֨ܺܺ;

    if-nez v0, :cond_1

    goto :goto_0

    .line 95
    :cond_1
    check-cast p1, Ll/֨ܺܺ;

    .line 97
    invoke-virtual {p1}, Ll/֨ܺܺ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll/֨ܺܺ;->ᩴ()I

    move-result p1

    const/4 v0, -0x8

    if-lt p1, v0, :cond_2

    const/4 v0, 0x7

    if-gt p1, v0, :cond_2

    return v3

    :cond_2
    :goto_0
    return v2
.end method
