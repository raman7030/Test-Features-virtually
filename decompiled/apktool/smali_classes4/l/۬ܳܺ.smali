.class public final Ll/۬ܳܺ;
.super Ll/ۨܿܺ;
.source "FB9X"


# static fields
.field public static final ֫:Ll/۬ܳܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ll/۬ܳܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    sput-object v0, Ll/۬ܳܺ;->֫:Ll/۬ܳܺ;

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

    .line 57
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 58
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

    invoke-virtual {p1}, Ll/ۙܿܺ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙܿܺ;)Ljava/util/BitSet;
    .locals 5

    .line 138
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 139
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 140
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1, v0}, Ljava/util/BitSet;-><init>(I)V

    const/4 v2, 0x0

    .line 141
    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    invoke-static {v3}, Ll/ۨܿܺ;->֫(I)Z

    move-result v3

    const/4 v4, 0x1

    if-ne v0, v4, :cond_0

    .line 144
    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    return-object v1

    .line 146
    :cond_0
    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-virtual {p1, v4}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    if-ne v0, p1, :cond_1

    .line 147
    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 148
    invoke-virtual {v1, v4, v3}, Ljava/util/BitSet;->set(IZ)V

    :cond_1
    return-object v1
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 3

    .line 160
    invoke-virtual {p2}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 161
    move-object v1, p2

    check-cast v1, Ll/᩸ܿܺ;

    invoke-virtual {v1}, Ll/᩸ܿܺ;->ۘ()I

    move-result v1

    const/4 v2, 0x0

    .line 164
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    int-to-short v0, v1

    .line 163
    invoke-static {p1, p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۛۘܺ;SS)V

    return-void
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 0

    .line 67
    invoke-virtual {p1}, Ll/ۙܿܺ;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 5

    .line 86
    instance-of v0, p1, Ll/᩸ܿܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 90
    :cond_0
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    return v1

    .line 103
    :cond_1
    invoke-virtual {v0, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    .line 104
    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    invoke-virtual {v0, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    if-eq v4, v0, :cond_3

    return v1

    .line 95
    :cond_2
    invoke-virtual {v0, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    .line 114
    :cond_3
    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {v0}, Ll/ۨܿܺ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    .line 118
    :cond_4
    check-cast p1, Ll/᩸ܿܺ;

    .line 119
    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۘ()I

    move-result v0

    .line 120
    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    .line 122
    invoke-static {v0}, Ll/ۨܿܺ;->ܽ(I)Z

    move-result v0

    if-nez v0, :cond_5

    return v1

    .line 126
    :cond_5
    instance-of v0, p1, Ll/۫ܺܺ;

    if-nez v0, :cond_7

    instance-of v0, p1, Ll/ۡܺܺ;

    if-nez v0, :cond_7

    instance-of v0, p1, Ll/۬ܺܺ;

    if-nez v0, :cond_7

    instance-of v0, p1, Ll/᩸ܺܺ;

    if-nez v0, :cond_7

    instance-of p1, p1, Ll/ۙܺܺ;

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_6
    return v1

    :cond_7
    :goto_0
    return v3
.end method
