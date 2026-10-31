.class public final Ll/ᩳ᩻ܺ;
.super Ll/ۨܿܺ;
.source "CBHG"


# static fields
.field public static final ֫:Ll/ᩳ᩻ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Ll/ᩳ᩻ܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    sput-object v0, Ll/ᩳ᩻ܺ;->֫:Ll/ᩳ᩻ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final ֫(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 3

    .line 55
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

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

    invoke-virtual {p1}, Ll/ۙܿܺ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙܿܺ;)Ljava/util/BitSet;
    .locals 5

    .line 129
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 130
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 131
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1, v0}, Ljava/util/BitSet;-><init>(I)V

    const/4 v2, 0x0

    .line 132
    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    invoke-static {v3}, Ll/ۨܿܺ;->֫(I)Z

    move-result v3

    const/4 v4, 0x1

    if-ne v0, v4, :cond_0

    .line 135
    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    return-object v1

    .line 137
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

    .line 138
    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 139
    invoke-virtual {v1, v4, v3}, Ljava/util/BitSet;->set(IZ)V

    :cond_1
    return-object v1
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 3

    .line 151
    invoke-virtual {p2}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 152
    move-object v1, p2

    check-cast v1, Ll/᩸ܿܺ;

    invoke-virtual {v1}, Ll/᩸ܿܺ;->ۘ()I

    move-result v1

    const/4 v2, 0x0

    .line 154
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    invoke-static {p1, p2, v1}, Ll/ۨܿܺ;->֫(Ll/ᩳᩴܺ;SI)V

    return-void
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 0

    .line 65
    invoke-virtual {p1}, Ll/ۙܿܺ;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 5

    .line 84
    instance-of v0, p1, Ll/᩸ܿܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 88
    :cond_0
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    return v1

    .line 101
    :cond_1
    invoke-virtual {v0, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    .line 102
    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    invoke-virtual {v0, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    if-eq v4, v0, :cond_3

    return v1

    .line 93
    :cond_2
    invoke-virtual {v0, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    .line 112
    :cond_3
    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {v0}, Ll/ۨܿܺ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    .line 116
    :cond_4
    check-cast p1, Ll/᩸ܿܺ;

    .line 117
    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    .line 119
    instance-of v0, p1, Ll/۫ܺܺ;

    if-nez v0, :cond_6

    instance-of v0, p1, Ll/ۡܺܺ;

    if-nez v0, :cond_6

    instance-of p1, p1, Ll/۬ܺܺ;

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    return v1

    :cond_6
    :goto_0
    return v3
.end method
