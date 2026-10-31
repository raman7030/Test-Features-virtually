.class public final Ll/۠ۚۖ;
.super Ljava/lang/Object;
.source "V9PU"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۙ:Ll/᩸ۚۖ;

.field public ᩶:I

.field public ᩸:Ljava/util/Iterator;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/᩸ۚۖ;)V
    .locals 0

    .line 509
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۚۖ;->ۙ:Ll/᩸ۚۖ;

    const/4 p1, -0x1

    .line 511
    iput p1, p0, Ll/۠ۚۖ;->᩶:I

    return-void
.end method

.method private ֫()Ljava/util/Iterator;
    .locals 1

    .line 553
    iget-object v0, p0, Ll/۠ۚۖ;->᩸:Ljava/util/Iterator;

    if-nez v0, :cond_0

    .line 554
    iget-object v0, p0, Ll/۠ۚۖ;->ۙ:Ll/᩸ۚۖ;

    invoke-static {v0}, Ll/᩸ۚۖ;->ܽ(Ll/᩸ۚۖ;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۚۖ;->᩸:Ljava/util/Iterator;

    .line 556
    :cond_0
    iget-object v0, p0, Ll/۠ۚۖ;->᩸:Ljava/util/Iterator;

    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    .line 517
    iget v0, p0, Ll/۠ۚۖ;->᩶:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Ll/۠ۚۖ;->ۙ:Ll/᩸ۚۖ;

    invoke-static {v2}, Ll/᩸ۚۖ;->ۧ(Ll/᩸ۚۖ;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lt v0, v3, :cond_1

    .line 518
    invoke-static {v2}, Ll/᩸ۚۖ;->ܽ(Ll/᩸ۚۖ;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ll/۠ۚۖ;->֫()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x1

    .line 523
    iput-boolean v0, p0, Ll/۠ۚۖ;->᩹:Z

    .line 526
    iget v1, p0, Ll/۠ۚۖ;->᩶:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/۠ۚۖ;->᩶:I

    iget-object v0, p0, Ll/۠ۚۖ;->ۙ:Ll/᩸ۚۖ;

    invoke-static {v0}, Ll/᩸ۚۖ;->ۧ(Ll/᩸ۚۖ;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 527
    invoke-static {v0}, Ll/᩸ۚۖ;->ۧ(Ll/᩸ۚۖ;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Ll/۠ۚۖ;->᩶:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0

    .line 529
    :cond_0
    invoke-direct {p0}, Ll/۠ۚۖ;->֫()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final remove()V
    .locals 3

    .line 534
    iget-boolean v0, p0, Ll/۠ۚۖ;->᩹:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 537
    iput-boolean v0, p0, Ll/۠ۚۖ;->᩹:Z

    .line 538
    iget-object v0, p0, Ll/۠ۚۖ;->ۙ:Ll/᩸ۚۖ;

    invoke-static {v0}, Ll/᩸ۚۖ;->֫(Ll/᩸ۚۖ;)V

    .line 540
    iget v1, p0, Ll/۠ۚۖ;->᩶:I

    invoke-static {v0}, Ll/᩸ۚۖ;->ۧ(Ll/᩸ۚۖ;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 541
    iget v1, p0, Ll/۠ۚۖ;->᩶:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Ll/۠ۚۖ;->᩶:I

    invoke-static {v0, v1}, Ll/᩸ۚۖ;->֫(Ll/᩸ۚۖ;I)V

    return-void

    .line 543
    :cond_0
    invoke-direct {p0}, Ll/۠ۚۖ;->֫()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void

    .line 535
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() was called before next()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
