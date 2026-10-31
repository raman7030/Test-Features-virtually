.class public Ll/ܰ᩶ܺ;
.super Ljava/lang/Object;
.source "O3K3"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:Ll/۟᩶ܺ;

.field public final ᩸:Ljava/util/Iterator;

.field public final ᩹:Ljava/util/Collection;


# direct methods
.method public constructor <init>(Ll/۟᩶ܺ;)V
    .locals 1

    .line 445
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩶ܺ;->᩶:Ll/۟᩶ܺ;

    .line 443
    iget-object p1, p1, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    iput-object p1, p0, Ll/ܰ᩶ܺ;->᩹:Ljava/util/Collection;

    .line 591
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 592
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object p1

    goto :goto_0

    .line 593
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 446
    :goto_0
    iput-object p1, p0, Ll/ܰ᩶ܺ;->᩸:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Ll/ۧۙܺ;Ljava/util/ListIterator;)V
    .locals 0

    .line 449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩶ܺ;->᩶:Ll/۟᩶ܺ;

    .line 443
    iget-object p1, p1, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    iput-object p1, p0, Ll/ܰ᩶ܺ;->᩹:Ljava/util/Collection;

    .line 450
    iput-object p2, p0, Ll/ܰ᩶ܺ;->᩸:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 465
    invoke-virtual {p0}, Ll/ܰ᩶ܺ;->֫()V

    .line 466
    iget-object v0, p0, Ll/ܰ᩶ܺ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 472
    invoke-virtual {p0}, Ll/ܰ᩶ܺ;->֫()V

    .line 473
    iget-object v0, p0, Ll/ܰ᩶ܺ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 478
    iget-object v0, p0, Ll/ܰ᩶ܺ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 479
    iget-object v0, p0, Ll/ܰ᩶ܺ;->᩶:Ll/۟᩶ܺ;

    iget-object v1, v0, Ll/۟᩶ܺ;->ۗ:Ll/ܽۙܺ;

    invoke-static {v1}, Ll/ܽۙܺ;->ܽ(Ll/ܽۙܺ;)V

    .line 480
    invoke-virtual {v0}, Ll/۟᩶ܺ;->ᩳ()V

    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 457
    iget-object v0, p0, Ll/ܰ᩶ܺ;->᩶:Ll/۟᩶ܺ;

    invoke-virtual {v0}, Ll/۟᩶ܺ;->ܽ()V

    .line 458
    iget-object v0, v0, Ll/۟᩶ܺ;->᩶:Ljava/util/Collection;

    iget-object v1, p0, Ll/ܰ᩶ܺ;->᩹:Ljava/util/Collection;

    if-ne v0, v1, :cond_0

    return-void

    .line 459
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method
