.class public final Ll/ۗ᩶ܺ;
.super Ljava/lang/Object;
.source "O3K3"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:Ljava/util/Iterator;

.field public ᩸:Ljava/util/Map$Entry;

.field public final synthetic ᩹:Ll/۬᩶ܺ;


# direct methods
.method public constructor <init>(Ll/۬᩶ܺ;Ljava/util/Iterator;)V
    .locals 0

    .line 940
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۗ᩶ܺ;->᩶:Ljava/util/Iterator;

    iput-object p1, p0, Ll/ۗ᩶ܺ;->᩹:Ll/۬᩶ܺ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 945
    iget-object v0, p0, Ll/ۗ᩶ܺ;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 951
    iget-object v0, p0, Ll/ۗ᩶ܺ;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iput-object v0, p0, Ll/ۗ᩶ܺ;->᩸:Ljava/util/Map$Entry;

    .line 952
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 3

    .line 957
    iget-object v0, p0, Ll/ۗ᩶ܺ;->᩸:Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "no calls to next() since the last call to remove()"

    invoke-static {v1, v0}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    .line 958
    iget-object v0, p0, Ll/ۗ᩶ܺ;->᩸:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 959
    iget-object v1, p0, Ll/ۗ᩶ܺ;->᩶:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 960
    iget-object v1, p0, Ll/ۗ᩶ܺ;->᩹:Ll/۬᩶ܺ;

    iget-object v1, v1, Ll/۬᩶ܺ;->᩹:Ll/ܽۙܺ;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-static {v1, v2}, Ll/ܽۙܺ;->ۧ(Ll/ܽۙܺ;I)V

    .line 961
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    const/4 v0, 0x0

    .line 962
    iput-object v0, p0, Ll/ۗ᩶ܺ;->᩸:Ljava/util/Map$Entry;

    return-void
.end method
