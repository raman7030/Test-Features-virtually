.class public final Ll/ۡܿۘ;
.super Ll/ܺܿۘ;
.source "31MV"


# instance fields
.field public final ۜ:Ljava/util/List;

.field public final ܳ:Ll/ܺۢᩴ;

.field public final ᩷:Ljava/util/List;

.field public final ᩻:Ll/ܺۢᩴ;


# direct methods
.method public constructor <init>(Ll/ܺۢᩴ;Ll/ܺۢᩴ;Ljava/util/List;Ljava/util/List;Ll/ۜܳۘ;Ll/ۙܳۘ;)V
    .locals 2

    .line 167
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p0, v0, v1, p5, p6}, Ll/ܺܿۘ;-><init>(IILl/ۜܳۘ;Ll/ۙܳۘ;)V

    .line 168
    iput-object p1, p0, Ll/ۡܿۘ;->ܳ:Ll/ܺۢᩴ;

    .line 169
    iput-object p2, p0, Ll/ۡܿۘ;->᩻:Ll/ܺۢᩴ;

    .line 170
    iput-object p3, p0, Ll/ۡܿۘ;->ۜ:Ljava/util/List;

    .line 171
    iput-object p4, p0, Ll/ۡܿۘ;->᩷:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/᩸ܳۘ;
    .locals 2

    .line 193
    iget-object v0, p0, Ll/ۡܿۘ;->ܳ:Ll/ܺۢᩴ;

    invoke-virtual {v0, p1}, Ll/ܺۢᩴ;->getInt(I)I

    move-result p1

    .line 194
    new-instance v0, Ll/᩸ܳۘ;

    add-int/lit8 v1, p1, 0x1

    invoke-direct {v0, p1, v1}, Ll/᩸ܳۘ;-><init>(II)V

    return-object v0
.end method

.method public final ֫(IIII)V
    .locals 8

    .line 176
    iget-object v0, p0, Ll/ۡܿۘ;->ۜ:Ljava/util/List;

    iget-object v1, p0, Ll/ۡܿۘ;->᩷:Ljava/util/List;

    move v2, p1

    move v3, p3

    move v4, p2

    move v5, p4

    invoke-static/range {v0 .. v5}, Ll/ۗܿۘ;->֫(Ljava/util/List;Ljava/util/List;IIII)Ll/᩹ܳۘ;

    move-result-object v0

    .line 178
    iget v1, v0, Ll/᩹ܳۘ;->ܽ:I

    iget v2, v0, Ll/᩹ܳۘ;->֫:I

    iget-object v3, p0, Ll/ۡܿۘ;->ۜ:Ljava/util/List;

    invoke-interface {v3, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    .line 179
    iget v4, v0, Ll/᩹ܳۘ;->ᩳ:I

    iget v0, v0, Ll/᩹ܳۘ;->ۧ:I

    iget-object v5, p0, Ll/ۡܿۘ;->᩷:Ljava/util/List;

    invoke-interface {v5, v4, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    .line 180
    iget-object v6, p0, Ll/ܺܿۘ;->ܽ:Ll/ۙܳۘ;

    invoke-static {v3, v5, v6}, Ll/᩻ܳۘ;->֫(Ljava/util/List;Ljava/util/List;Ll/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object v3

    .line 182
    iget-object v5, p0, Ll/ܺܿۘ;->֫:Ll/ᩳܳۘ;

    invoke-virtual {v5, p1, p3, v1, v4}, Ll/ܿܳۘ;->ۧ(IIII)V

    .line 184
    invoke-interface {v3}, Ll/֫ܳۘ;->ۧ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩹ܳۘ;

    .line 185
    iget v3, p3, Ll/᩹ܳۘ;->ܽ:I

    add-int v6, v1, v3

    iget v7, p3, Ll/᩹ܳۘ;->ᩳ:I

    add-int/2addr v7, v4

    iget p3, p3, Ll/᩹ܳۘ;->֫:I

    sub-int/2addr p3, v3

    invoke-virtual {v5, v6, v7, p3}, Ll/ܿܳۘ;->֫(III)V

    goto :goto_0

    .line 188
    :cond_0
    invoke-virtual {v5, v2, v0, p2, p4}, Ll/ܿܳۘ;->ۧ(IIII)V

    return-void
.end method

.method public final ۧ(I)Ll/᩸ܳۘ;
    .locals 2

    .line 199
    iget-object v0, p0, Ll/ۡܿۘ;->᩻:Ll/ܺۢᩴ;

    invoke-virtual {v0, p1}, Ll/ܺۢᩴ;->getInt(I)I

    move-result p1

    .line 200
    new-instance v0, Ll/᩸ܳۘ;

    add-int/lit8 v1, p1, 0x1

    invoke-direct {v0, p1, v1}, Ll/᩸ܳۘ;-><init>(II)V

    return-object v0
.end method
