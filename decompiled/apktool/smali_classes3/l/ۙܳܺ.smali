.class public final Ll/ۙܳܺ;
.super Ll/ۨܿܺ;
.source "IBG6"


# static fields
.field public static final ֫:Ll/ۙܳܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Ll/ۙܳܺ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۙܳܺ;->֫:Ll/ۙܳܺ;

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

    .line 51
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 52
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v2, v0, -0x2

    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ۡܺ;->۠()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, -0x1

    .line 61
    invoke-virtual {p1, v0}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->۠()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙܿܺ;)Ljava/util/BitSet;
    .locals 8

    .line 126
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 127
    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v2, 0x0

    .line 128
    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    const/4 v4, 0x1

    .line 129
    invoke-virtual {p1, v4}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v5

    .line 131
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v6

    if-eq v6, v1, :cond_2

    const/4 v7, 0x3

    if-ne v6, v7, :cond_1

    if-eq v3, v5, :cond_0

    .line 139
    invoke-virtual {v0, v2, v2}, Ljava/util/BitSet;->set(IZ)V

    .line 140
    invoke-virtual {v0, v4, v2}, Ljava/util/BitSet;->set(IZ)V

    goto :goto_0

    .line 142
    :cond_0
    invoke-static {v5}, Ll/ۨܿܺ;->ۧ(I)Z

    move-result v3

    .line 143
    invoke-virtual {v0, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 144
    invoke-virtual {v0, v4, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 147
    :goto_0
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    invoke-static {p1}, Ll/ۨܿܺ;->ۧ(I)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljava/util/BitSet;->set(IZ)V

    return-object v0

    .line 151
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 133
    :cond_2
    invoke-static {v3}, Ll/ۨܿܺ;->ۧ(I)Z

    move-result p1

    invoke-virtual {v0, v2, p1}, Ljava/util/BitSet;->set(IZ)V

    .line 134
    invoke-static {v5}, Ll/ۨܿܺ;->ۧ(I)Z

    move-result p1

    invoke-virtual {v0, v4, p1}, Ljava/util/BitSet;->set(IZ)V

    return-object v0
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 3

    .line 163
    invoke-virtual {p2}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 164
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    add-int/lit8 v2, v1, -0x2

    .line 173
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    add-int/lit8 v1, v1, -0x1

    .line 174
    invoke-virtual {v0, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    .line 173
    invoke-static {v2, v0}, Ll/ۨܿܺ;->ۧ(II)I

    move-result v0

    .line 172
    invoke-static {p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    .line 556
    invoke-virtual {p1, p2}, Ll/ᩳᩴܺ;->ܳ(I)V

    return-void
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 5

    .line 86
    instance-of v0, p1, Ll/ᩴܳܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 90
    :cond_0
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 94
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v2, :cond_2

    const/4 v4, 0x3

    if-eq v0, v4, :cond_1

    return v1

    .line 105
    :cond_1
    invoke-virtual {p1, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    .line 106
    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    .line 107
    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    if-eq v4, p1, :cond_3

    return v1

    .line 96
    :cond_2
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    .line 97
    invoke-virtual {p1, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    .line 117
    :cond_3
    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    invoke-static {p1}, Ll/ۨܿܺ;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 118
    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    invoke-static {p1}, Ll/ۨܿܺ;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_4

    return v3

    :cond_4
    return v1
.end method
