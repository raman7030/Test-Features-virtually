.class public abstract Ll/ۘܰᩴ;
.super Ljava/lang/Object;
.source "N673"


# instance fields
.field public final a:J

.field public final b:J

.field public c:Ll/ܶ۫ᩴ;

.field public d:J

.field public e:J


# direct methods
.method public constructor <init>(Ll/ܶ۫ᩴ;JJJJ)V
    .locals 0

    .line 623
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 625
    iput-object p1, p0, Ll/ۘܰᩴ;->c:Ll/ܶ۫ᩴ;

    .line 626
    iput-wide p2, p0, Ll/ۘܰᩴ;->a:J

    .line 627
    iput-wide p4, p0, Ll/ۘܰᩴ;->b:J

    .line 628
    iput-wide p6, p0, Ll/ۘܰᩴ;->d:J

    .line 629
    iput-wide p8, p0, Ll/ۘܰᩴ;->e:J

    return-void
.end method


# virtual methods
.method public abstract a(Ll/ܶ۫ᩴ;JJJJ)Ll/ܶ۫ᩴ;
.end method

.method public final characteristics()I
    .locals 1

    .line 686
    iget-object v0, p0, Ll/ۘܰᩴ;->c:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->characteristics()I

    move-result v0

    return v0
.end method

.method public final estimateSize()J
    .locals 6

    .line 681
    iget-wide v0, p0, Ll/ۘܰᩴ;->e:J

    iget-wide v2, p0, Ll/ۘܰᩴ;->a:J

    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    .line 682
    iget-wide v4, p0, Ll/ۘܰᩴ;->d:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public bridge synthetic trySplit()Ll/֡۫ᩴ;
    .locals 1

    .line 844
    invoke-virtual {p0}, Ll/ۘܰᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    check-cast v0, Ll/֡۫ᩴ;

    return-object v0
.end method

.method public bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    .line 756
    invoke-virtual {p0}, Ll/ۘܰᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    check-cast v0, Ll/֨۫ᩴ;

    return-object v0
.end method

.method public bridge synthetic trySplit()Ll/۠ۨᩴ;
    .locals 1

    .line 868
    invoke-virtual {p0}, Ll/ۘܰᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    check-cast v0, Ll/۠ۨᩴ;

    return-object v0
.end method

.method public final trySplit()Ll/ܶ۫ᩴ;
    .locals 13

    .line 635
    iget-wide v0, p0, Ll/ۘܰᩴ;->e:J

    iget-wide v2, p0, Ll/ۘܰᩴ;->a:J

    cmp-long v4, v2, v0

    if-ltz v4, :cond_0

    goto :goto_1

    .line 638
    :cond_0
    iget-wide v2, p0, Ll/ۘܰᩴ;->d:J

    cmp-long v4, v2, v0

    if-ltz v4, :cond_1

    goto :goto_1

    .line 648
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۘܰᩴ;->c:Ll/ܶ۫ᩴ;

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v2

    if-nez v2, :cond_2

    :goto_1
    const/4 v0, 0x0

    return-object v0

    .line 652
    :cond_2
    iget-wide v0, p0, Ll/ۘܰᩴ;->d:J

    invoke-interface {v2}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v3

    add-long/2addr v3, v0

    .line 653
    iget-wide v0, p0, Ll/ۘܰᩴ;->b:J

    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    .line 654
    iget-wide v5, p0, Ll/ۘܰᩴ;->a:J

    cmp-long v0, v5, v9

    if-ltz v0, :cond_3

    .line 658
    iput-wide v9, p0, Ll/ۘܰᩴ;->d:J

    goto :goto_0

    .line 660
    :cond_3
    iget-wide v7, p0, Ll/ۘܰᩴ;->b:J

    cmp-long v0, v9, v7

    if-ltz v0, :cond_4

    .line 664
    iput-object v2, p0, Ll/ۘܰᩴ;->c:Ll/ܶ۫ᩴ;

    .line 665
    iput-wide v9, p0, Ll/ۘܰᩴ;->e:J

    goto :goto_0

    .line 667
    :cond_4
    iget-wide v11, p0, Ll/ۘܰᩴ;->d:J

    cmp-long v0, v11, v5

    if-ltz v0, :cond_5

    cmp-long v0, v3, v7

    if-gtz v0, :cond_5

    .line 670
    iput-wide v9, p0, Ll/ۘܰᩴ;->d:J

    return-object v2

    .line 675
    :cond_5
    iput-wide v9, p0, Ll/ۘܰᩴ;->d:J

    move-object v1, p0

    move-wide v3, v5

    move-wide v5, v7

    move-wide v7, v11

    invoke-virtual/range {v1 .. v10}, Ll/ۘܰᩴ;->a(Ll/ܶ۫ᩴ;JJJJ)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic trySplit()Ll/ᩴ۫ᩴ;
    .locals 1

    .line 820
    invoke-virtual {p0}, Ll/ۘܰᩴ;->trySplit()Ll/ܶ۫ᩴ;

    move-result-object v0

    check-cast v0, Ll/ᩴ۫ᩴ;

    return-object v0
.end method
