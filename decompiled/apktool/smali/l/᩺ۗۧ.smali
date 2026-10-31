.class public abstract Ll/᩺ۗۧ;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public ֫:J

.field public ۧ:J

.field public ܳ:J

.field public ܽ:Ljava/util/ArrayList;

.field public ܿ:J

.field public ᩳ:Ll/ۛۗۧ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 13684
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 13747
    iput-object v0, p0, Ll/᩺ۗۧ;->ᩳ:Ll/ۛۗۧ;

    .line 13748
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ۗۧ;->ܽ:Ljava/util/ArrayList;

    const-wide/16 v0, 0x78

    .line 13751
    iput-wide v0, p0, Ll/᩺ۗۧ;->֫:J

    .line 13752
    iput-wide v0, p0, Ll/᩺ۗۧ;->ܳ:J

    const-wide/16 v0, 0xfa

    .line 13753
    iput-wide v0, p0, Ll/᩺ۗۧ;->ܿ:J

    .line 13754
    iput-wide v0, p0, Ll/᩺ۗۧ;->ۧ:J

    return-void
.end method

.method public static ܽ(Ll/ۗ۬ۧ;)V
    .locals 2

    .line 14071
    iget v0, p0, Ll/ۗ۬ۧ;->mFlags:I

    .line 14072
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->isInvalid()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_1

    .line 14076
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getOldPosition()I

    .line 14077
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getAbsoluteAdapterPosition()I

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 14295
    iget-object v0, p0, Ll/᩺ۗۧ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 14297
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤۗۧ;

    invoke-interface {v3}, Ll/ۤۗۧ;->֫()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 14299
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 13789
    iput-wide p1, p0, Ll/᩺ۗۧ;->֫:J

    return-void
.end method

.method public final ֫(Ll/ۗ۬ۧ;)V
    .locals 3

    .line 14156
    iget-object v0, p0, Ll/᩺ۗۧ;->ᩳ:Ll/ۛۗۧ;

    if-eqz v0, :cond_1

    .line 14157
    check-cast v0, Ll/ܰۗۧ;

    .line 13647
    iget-object v0, v0, Ll/ܰۗۧ;->֫:Ll/۬۬ۧ;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ll/ۗ۬ۧ;->setIsRecyclable(Z)V

    .line 13648
    iget-object v1, p1, Ll/ۗ۬ۧ;->mShadowedHolder:Ll/ۗ۬ۧ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p1, Ll/ۗ۬ۧ;->mShadowingHolder:Ll/ۗ۬ۧ;

    if-nez v1, :cond_0

    .line 13649
    iput-object v2, p1, Ll/ۗ۬ۧ;->mShadowedHolder:Ll/ۗ۬ۧ;

    .line 13653
    :cond_0
    iput-object v2, p1, Ll/ۗ۬ۧ;->mShadowingHolder:Ll/ۗ۬ۧ;

    .line 13654
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->shouldBeKeptAsChild()Z

    move-result v1

    if-nez v1, :cond_1

    .line 13655
    iget-object v1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->removeAnimatingView(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->isTmpDetached()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 13656
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/۬۬ۧ;->removeDetachedView(Landroid/view/View;Z)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۛۗۧ;)V
    .locals 0

    .line 13837
    iput-object p1, p0, Ll/᩺ۗۧ;->ᩳ:Ll/ۛۗۧ;

    return-void
.end method

.method public ֫(Ll/ۗ۬ۧ;Ljava/util/List;)Z
    .locals 0

    .line 14287
    move-object p2, p0

    check-cast p2, Ll/ۨ۬ۧ;

    .line 85
    iget-boolean p2, p2, Ll/ۨ۬ۧ;->᩻:Z

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->isInvalid()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/ۘ᩹ܳ;)Z
    .locals 2

    .line 14228
    invoke-virtual {p0}, Ll/᩺ۗۧ;->᩻()Z

    move-result v0

    if-eqz p1, :cond_1

    if-nez v0, :cond_0

    .line 14231
    invoke-virtual {p1}, Ll/ۘ᩹ܳ;->֫()V

    return v0

    .line 14233
    :cond_0
    iget-object v1, p0, Ll/᩺ۗۧ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return v0
.end method

.method public abstract ۜ()V
.end method

.method public abstract ۧ()V
.end method

.method public final ۧ(J)V
    .locals 0

    .line 13825
    iput-wide p1, p0, Ll/᩺ۗۧ;->ۧ:J

    return-void
.end method

.method public abstract ۧ(Ll/ۗ۬ۧ;)V
.end method

.method public final ܳ()J
    .locals 2

    .line 13798
    iget-wide v0, p0, Ll/᩺ۗۧ;->ܳ:J

    return-wide v0
.end method

.method public final ܽ()J
    .locals 2

    .line 13780
    iget-wide v0, p0, Ll/᩺ۗۧ;->֫:J

    return-wide v0
.end method

.method public final ܽ(J)V
    .locals 0

    .line 13771
    iput-wide p1, p0, Ll/᩺ۗۧ;->ܿ:J

    return-void
.end method

.method public final ܿ()J
    .locals 2

    .line 13762
    iget-wide v0, p0, Ll/᩺ۗۧ;->ܿ:J

    return-wide v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 13816
    iget-wide v0, p0, Ll/᩺ۗۧ;->ۧ:J

    return-wide v0
.end method

.method public final ᩳ(J)V
    .locals 0

    .line 13807
    iput-wide p1, p0, Ll/᩺ۗۧ;->ܳ:J

    return-void
.end method

.method public abstract ᩻()Z
.end method
