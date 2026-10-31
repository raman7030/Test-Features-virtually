.class public final Ll/᩸ۧܳ;
.super Ljava/lang/Object;
.source "D70T"


# instance fields
.field public final ֫:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5207
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/᩸ۧܳ;->֫:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public final ֫(I[B)Ll/ۡᩳܳ;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    move-object v2, v0

    :goto_0
    if-lez p1, :cond_3

    .line 5229
    iget-object v3, p0, Ll/᩸ۧܳ;->֫:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۧܳ;

    if-eqz v4, :cond_1

    .line 5230
    invoke-virtual {v4}, Ll/ᩳۧܳ;->ܳ()I

    move-result v5

    if-nez v5, :cond_2

    .line 5231
    :cond_1
    new-instance v4, Ll/ᩳۧܳ;

    const/high16 v5, 0x10000

    invoke-direct {v4, v5}, Ll/ᩳۧܳ;-><init>(I)V

    .line 5232
    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 5234
    :cond_2
    invoke-virtual {v4}, Ll/ᩳۧܳ;->ܳ()I

    move-result v3

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 5235
    invoke-virtual {v4, v1, v3, p2}, Ll/ᩳۧܳ;->ܿ(II[B)I

    move-result v5

    .line 5236
    new-instance v6, Ll/᩷ᩳܳ;

    invoke-direct {v6, v4, v5, v3, v0}, Ll/᩷ᩳܳ;-><init>(Ll/ᩴܽܳ;IILl/ܿᩳܳ;)V

    .line 5238
    invoke-static {v6}, Ll/᩵ᩳܳ;->֫(Ll/᩷ᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v4

    invoke-static {v2, v4}, Ll/᩵ᩳܳ;->ᩳ(Ll/ۡᩳܳ;Ll/ۡᩳܳ;)Ll/ۡᩳܳ;

    move-result-object v2

    add-int/2addr v1, v3

    sub-int/2addr p1, v3

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method public final ֫()Ll/ܶۧܳ;
    .locals 3

    .line 5218
    iget-object v0, p0, Ll/᩸ۧܳ;->֫:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۧܳ;

    .line 5219
    new-instance v2, Ll/ܶۧܳ;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/ᩳۧܳ;->length()I

    move-result v1

    :goto_0
    invoke-direct {v2, v0, v1}, Ll/ܶۧܳ;-><init>(II)V

    return-object v2
.end method

.method public final ֫(Ll/ܶۧܳ;)V
    .locals 3

    .line 5246
    :goto_0
    iget-object v0, p0, Ll/᩸ۧܳ;->֫:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    invoke-static {p1}, Ll/ܶۧܳ;->֫(Ll/ܶۧܳ;)I

    move-result v2

    if-le v1, v2, :cond_0

    .line 5247
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    goto :goto_0

    .line 5249
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۧܳ;

    if-eqz v0, :cond_1

    .line 5251
    invoke-static {p1}, Ll/ܶۧܳ;->ۧ(Ll/ܶۧܳ;)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ᩳۧܳ;->֫(I)V

    :cond_1
    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 5259
    :goto_0
    iget-object v0, p0, Ll/᩸ۧܳ;->֫:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    .line 5260
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
