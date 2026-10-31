.class public final Ll/᩷ܿۜ;
.super Ljava/lang/Object;
.source "L78E"

# interfaces
.implements Ll/۟ۛ֡;


# instance fields
.field public ֫:Ll/ۡܿۜ;

.field public ۧ:Ll/۬ۛ֡;

.field public ܽ:Ll/᩺ۖܽ;

.field public ܿ:Ll/ۧܿۜ;

.field public ᩳ:Ljava/util/BitSet;


# virtual methods
.method public final ֫(I)V
    .locals 7

    .line 1840
    iget-object v0, p0, Ll/᩷ܿۜ;->ۧ:Ll/۬ۛ֡;

    iget-object v1, p0, Ll/᩷ܿۜ;->֫:Ll/ۡܿۜ;

    iget-object v2, p0, Ll/᩷ܿۜ;->ܿ:Ll/ۧܿۜ;

    iget-object v3, p0, Ll/᩷ܿۜ;->ܽ:Ll/᩺ۖܽ;

    iget-object v4, p0, Ll/᩷ܿۜ;->ᩳ:Ljava/util/BitSet;

    if-eqz v4, :cond_0

    .line 1643
    invoke-virtual {v4, p1}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    .line 1608
    :cond_0
    iget v5, v1, Ll/ۡܿۜ;->ۧ:I

    .line 1609
    invoke-virtual {v3}, Ll/᩺ۖܽ;->ܽ()V

    const/4 v6, 0x0

    .line 1610
    invoke-virtual {v0, p1, v3, v6}, Ll/۬ۛ֡;->֫(ILjava/io/Writer;Z)V

    .line 1611
    invoke-virtual {v3}, Ll/᩺ۖܽ;->֫()Ll/ۨۖܽ;

    move-result-object v0

    .line 1747
    new-instance v3, Ll/ۢܿۜ;

    invoke-direct {v3, v1}, Ll/ۢܿۜ;-><init>(Ll/ۡܿۜ;)V

    invoke-virtual {v2, v0, v3}, Ll/ۧܿۜ;->֫(Ljava/lang/CharSequence;Ll/ۢܿۜ;)V

    if-eqz v4, :cond_1

    .line 1652
    iget v0, v1, Ll/ۡܿۜ;->ۧ:I

    if-ne v0, v5, :cond_1

    .line 1653
    invoke-virtual {v4, p1}, Ljava/util/BitSet;->set(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/۬ۛ֡;Ll/ۡܿۜ;Ll/ۧܿۜ;Ll/᩺ۖܽ;Ljava/util/BitSet;)V
    .locals 0

    .line 1831
    iput-object p1, p0, Ll/᩷ܿۜ;->ۧ:Ll/۬ۛ֡;

    .line 1832
    iput-object p2, p0, Ll/᩷ܿۜ;->֫:Ll/ۡܿۜ;

    .line 1833
    iput-object p3, p0, Ll/᩷ܿۜ;->ܿ:Ll/ۧܿۜ;

    .line 1834
    iput-object p4, p0, Ll/᩷ܿۜ;->ܽ:Ll/᩺ۖܽ;

    .line 1835
    iput-object p5, p0, Ll/᩷ܿۜ;->ᩳ:Ljava/util/BitSet;

    return-void
.end method
