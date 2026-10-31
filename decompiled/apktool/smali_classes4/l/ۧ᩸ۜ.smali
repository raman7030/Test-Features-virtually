.class public final Ll/ۧ᩸ۜ;
.super Ljava/lang/Object;
.source "B749"

# interfaces
.implements Ll/᩸᩷ۧ;


# instance fields
.field public ۙ:I

.field public ᩶:Ll/ᩳ᩸ۜ;

.field public final ᩸:Ljava/util/HashMap;

.field public ᩹:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 506
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 507
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۧ᩸ۜ;->᩸:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(II)Ll/᩵ۢۧ;
    .locals 2

    .line 514
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩸ۜ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ۢۧ;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 520
    new-instance p2, Ll/ᩳ᩸ۜ;

    invoke-direct {p2}, Ll/ᩳ᩸ۜ;-><init>()V

    .line 521
    iget v0, p0, Ll/ۧ᩸ۜ;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۧ᩸ۜ;->ۙ:I

    .line 522
    iput-object p2, p0, Ll/ۧ᩸ۜ;->᩶:Ll/ᩳ᩸ۜ;

    goto :goto_0

    .line 525
    :cond_1
    new-instance p2, Ll/᩵᩷ۧ;

    invoke-direct {p2}, Ll/᩵᩷ۧ;-><init>()V

    .line 527
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final ֫(Ll/ۢۢۧ;)V
    .locals 0

    return-void
.end method

.method public final ֫()Z
    .locals 6

    .line 542
    iget-boolean v0, p0, Ll/ۧ᩸ۜ;->᩹:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۧ᩸ۜ;->ۙ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۧ᩸ۜ;->᩶:Ll/ᩳ᩸ۜ;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ll/ᩳ᩸ۜ;->ۧ(Ll/ᩳ᩸ۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۧ᩸ۜ;->᩶:Ll/ᩳ᩸ۜ;

    invoke-static {v0}, Ll/ᩳ᩸ۜ;->ܽ(Ll/ᩳ᩸ۜ;)J

    move-result-wide v2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۧ᩸ۜ;->᩶:Ll/ᩳ᩸ۜ;

    invoke-static {v0}, Ll/ᩳ᩸ۜ;->֫(Ll/ᩳ᩸ۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()J
    .locals 2

    .line 548
    iget-object v0, p0, Ll/ۧ᩸ۜ;->᩶:Ll/ᩳ᩸ۜ;

    if-nez v0, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    :cond_0
    invoke-static {v0}, Ll/ᩳ᩸ۜ;->ܽ(Ll/ᩳ᩸ۜ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܳ()V
    .locals 1

    const/4 v0, 0x1

    .line 533
    iput-boolean v0, p0, Ll/ۧ᩸ۜ;->᩹:Z

    return-void
.end method
