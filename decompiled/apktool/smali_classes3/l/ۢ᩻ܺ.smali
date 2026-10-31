.class public final Ll/ۢ᩻ܺ;
.super Ll/ۨܿܺ;
.source "7BBQ"


# static fields
.field public static final ֫:Ll/ۢ᩻ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Ll/ۢ᩻ܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    sput-object v0, Ll/ۢ᩻ܺ;->֫:Ll/ۢ᩻ܺ;

    return-void
.end method

.method public static ܿ(Ll/᩶ۡܺ;)I
    .locals 7

    .line 178
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x5

    if-le v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 188
    invoke-virtual {p0, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v5

    .line 189
    invoke-virtual {v5}, Ll/᩸ۡܺ;->ۧ()I

    move-result v6

    add-int/2addr v4, v6

    .line 196
    invoke-virtual {v5}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v6

    invoke-virtual {v5}, Ll/᩸ۡܺ;->ۧ()I

    move-result v5

    add-int/2addr v5, v6

    add-int/lit8 v5, v5, -0x1

    invoke-static {v5}, Ll/ۨܿܺ;->ۧ(I)Z

    move-result v5

    if-nez v5, :cond_1

    return v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-gt v4, v2, :cond_3

    return v4

    :cond_3
    return v1
.end method

.method public static ᩳ(Ll/᩶ۡܺ;)Ll/᩶ۡܺ;
    .locals 7

    .line 214
    invoke-static {p0}, Ll/ۢ᩻ܺ;->ܿ(Ll/᩶ۡܺ;)I

    move-result v0

    .line 215
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p0

    .line 221
    :cond_0
    new-instance v2, Ll/᩶ۡܺ;

    .line 105
    invoke-direct {v2, v0}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v0, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v0, v1, :cond_2

    .line 225
    invoke-virtual {p0, v0}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v4

    .line 226
    invoke-virtual {v2, v3, v4}, Ll/ܿᩴܺ;->֫(ILl/᩸ۡܺ;)V

    .line 227
    invoke-virtual {v4}, Ll/᩸ۡܺ;->ۧ()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 229
    invoke-virtual {v4}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    sget-object v6, Ll/۟ܺܺ;->ۨ֫:Ll/۟ܺܺ;

    invoke-static {v4, v6}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v4

    .line 228
    invoke-virtual {v2, v5, v4}, Ll/ܿᩴܺ;->֫(ILl/᩸ۡܺ;)V

    add-int/lit8 v3, v3, 0x2

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 236
    :cond_2
    invoke-virtual {v2}, Ll/ᩴᩴܺ;->ܺ()V

    return-object v2
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final ֫(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 2

    .line 60
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    invoke-static {v0}, Ll/ۢ᩻ܺ;->ᩳ(Ll/᩶ۡܺ;)Ll/᩶ۡܺ;

    move-result-object v0

    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Ll/ۨܿܺ;->ۧ(Ll/᩶ۡܺ;)Ljava/lang/String;

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

    .line 123
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 124
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 125
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1, v0}, Ljava/util/BitSet;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 128
    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    .line 135
    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    .line 136
    invoke-virtual {v3}, Ll/᩸ۡܺ;->ۧ()I

    move-result v3

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    .line 135
    invoke-static {v3}, Ll/ۨܿܺ;->ۧ(I)Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 10

    .line 147
    move-object v0, p2

    check-cast v0, Ll/ᩳܳܺ;

    const/4 v1, 0x0

    .line 148
    invoke-virtual {v0, v1}, Ll/ᩳܳܺ;->ᩳ(I)I

    move-result v2

    int-to-short v2, v2

    const/4 v3, 0x1

    .line 149
    invoke-virtual {v0, v3}, Ll/ᩳܳܺ;->ᩳ(I)I

    move-result v0

    int-to-short v0, v0

    .line 151
    invoke-virtual {p2}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v4

    invoke-static {v4}, Ll/ۢ᩻ܺ;->ᩳ(Ll/᩶ۡܺ;)Ll/᩶ۡܺ;

    move-result-object v4

    .line 152
    invoke-virtual {v4}, Ll/ܿᩴܺ;->size()I

    move-result v5

    if-lez v5, :cond_0

    .line 153
    invoke-virtual {v4, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v6

    invoke-virtual {v6}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    if-le v5, v3, :cond_1

    .line 154
    invoke-virtual {v4, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const/4 v7, 0x2

    if-le v5, v7, :cond_2

    .line 155
    invoke-virtual {v4, v7}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v7

    invoke-virtual {v7}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v7

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    :goto_2
    const/4 v8, 0x3

    if-le v5, v8, :cond_3

    .line 156
    invoke-virtual {v4, v8}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v8

    invoke-virtual {v8}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v8

    goto :goto_3

    :cond_3
    const/4 v8, 0x0

    :goto_3
    const/4 v9, 0x4

    if-le v5, v9, :cond_4

    .line 157
    invoke-virtual {v4, v9}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    .line 161
    :cond_4
    invoke-static {v1, v5}, Ll/ۨܿܺ;->ۧ(II)I

    move-result v1

    invoke-static {p2, v1}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    .line 163
    invoke-static {v6, v3, v7, v8}, Ll/ۨܿܺ;->֫(IIII)S

    move-result v1

    .line 597
    invoke-virtual {p1, p2}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 598
    invoke-virtual {p1, v2}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 599
    invoke-virtual {p1, v1}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 600
    invoke-virtual {p1, v0}, Ll/ᩳᩴܺ;->ܳ(I)V

    return-void
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 0

    .line 70
    invoke-virtual {p1}, Ll/ۙܿܺ;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 4

    .line 89
    instance-of v0, p1, Ll/ᩳܳܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 93
    :cond_0
    check-cast p1, Ll/ᩳܳܺ;

    .line 94
    invoke-virtual {p1}, Ll/ᩳܳܺ;->ۖ()I

    move-result v0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    return v1

    .line 98
    :cond_1
    invoke-virtual {p1, v1}, Ll/ᩳܳܺ;->ᩳ(I)I

    move-result v0

    const/4 v2, 0x1

    .line 99
    invoke-virtual {p1, v2}, Ll/ᩳܳܺ;->ᩳ(I)I

    move-result v3

    .line 100
    invoke-static {v0}, Ll/ۨܿܺ;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v3}, Ll/ۨܿܺ;->ܽ(I)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 104
    :cond_2
    invoke-virtual {p1, v1}, Ll/ᩳܳܺ;->ܽ(I)Ll/ܰۡܺ;

    move-result-object v0

    .line 105
    instance-of v0, v0, Ll/᩹ܺܺ;

    if-nez v0, :cond_3

    return v1

    .line 109
    :cond_3
    invoke-virtual {p1, v2}, Ll/ᩳܳܺ;->ܽ(I)Ll/ܰۡܺ;

    move-result-object v0

    .line 110
    instance-of v0, v0, Ll/ۙܺܺ;

    if-nez v0, :cond_4

    return v1

    .line 114
    :cond_4
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 115
    invoke-static {p1}, Ll/ۢ᩻ܺ;->ܿ(Ll/᩶ۡܺ;)I

    move-result p1

    if-ltz p1, :cond_5

    return v2

    :cond_5
    :goto_0
    return v1
.end method
