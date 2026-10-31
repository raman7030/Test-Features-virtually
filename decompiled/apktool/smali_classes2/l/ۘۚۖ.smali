.class public final Ll/ۘۚۖ;
.super Ljava/lang/Object;
.source "V9PU"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:Ll/᩸ۚۖ;

.field public ᩸:Ljava/util/Iterator;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/᩸ۚۖ;)V
    .locals 0

    .line 564
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۚۖ;->᩶:Ll/᩸ۚۖ;

    .line 566
    invoke-static {p1}, Ll/᩸ۚۖ;->ۧ(Ll/᩸ۚۖ;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Ll/ۘۚۖ;->᩹:I

    return-void
.end method

.method private ֫()Ljava/util/Iterator;
    .locals 1

    .line 593
    iget-object v0, p0, Ll/ۘۚۖ;->᩸:Ljava/util/Iterator;

    if-nez v0, :cond_0

    .line 594
    iget-object v0, p0, Ll/ۘۚۖ;->᩶:Ll/᩸ۚۖ;

    invoke-static {v0}, Ll/᩸ۚۖ;->ᩳ(Ll/᩸ۚۖ;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۚۖ;->᩸:Ljava/util/Iterator;

    .line 596
    :cond_0
    iget-object v0, p0, Ll/ۘۚۖ;->᩸:Ljava/util/Iterator;

    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 571
    iget v0, p0, Ll/ۘۚۖ;->᩹:I

    if-lez v0, :cond_0

    iget-object v1, p0, Ll/ۘۚۖ;->᩶:Ll/᩸ۚۖ;

    invoke-static {v1}, Ll/᩸ۚۖ;->ۧ(Ll/᩸ۚۖ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    invoke-direct {p0}, Ll/ۘۚۖ;->֫()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 576
    invoke-direct {p0}, Ll/ۘۚۖ;->֫()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 577
    invoke-direct {p0}, Ll/ۘۚۖ;->֫()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0

    .line 579
    :cond_0
    iget-object v0, p0, Ll/ۘۚۖ;->᩶:Ll/᩸ۚۖ;

    invoke-static {v0}, Ll/᩸ۚۖ;->ۧ(Ll/᩸ۚۖ;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Ll/ۘۚۖ;->᩹:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ۘۚۖ;->᩹:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 584
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
