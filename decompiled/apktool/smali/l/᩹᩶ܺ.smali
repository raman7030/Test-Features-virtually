.class public final Ll/᩹᩶ܺ;
.super Ljava/lang/Object;
.source "O3K3"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:Ll/᩶᩶ܺ;

.field public ᩸:Ljava/util/Collection;

.field public final ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ll/᩶᩶ܺ;)V
    .locals 0

    .line 1409
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹᩶ܺ;->᩶:Ll/᩶᩶ܺ;

    .line 1410
    iget-object p1, p1, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll/᩹᩶ܺ;->᩹:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1415
    iget-object v0, p0, Ll/᩹᩶ܺ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1420
    iget-object v0, p0, Ll/᩹᩶ܺ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1421
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    iput-object v1, p0, Ll/᩹᩶ܺ;->᩸:Ljava/util/Collection;

    .line 1422
    iget-object v1, p0, Ll/᩹᩶ܺ;->᩶:Ll/᩶᩶ܺ;

    invoke-virtual {v1, v0}, Ll/᩶᩶ܺ;->֫(Ljava/util/Map$Entry;)Ljava/util/AbstractMap$SimpleImmutableEntry;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 1427
    iget-object v0, p0, Ll/᩹᩶ܺ;->᩸:Ljava/util/Collection;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "no calls to next() since the last call to remove()"

    invoke-static {v1, v0}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    .line 1428
    iget-object v0, p0, Ll/᩹᩶ܺ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 1429
    iget-object v0, p0, Ll/᩹᩶ܺ;->᩶:Ll/᩶᩶ܺ;

    iget-object v0, v0, Ll/᩶᩶ܺ;->ۙ:Ll/ܽۙܺ;

    iget-object v1, p0, Ll/᩹᩶ܺ;->᩸:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-static {v0, v1}, Ll/ܽۙܺ;->ۧ(Ll/ܽۙܺ;I)V

    .line 1430
    iget-object v0, p0, Ll/᩹᩶ܺ;->᩸:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    const/4 v0, 0x0

    .line 1431
    iput-object v0, p0, Ll/᩹᩶ܺ;->᩸:Ljava/util/Collection;

    return-void
.end method
