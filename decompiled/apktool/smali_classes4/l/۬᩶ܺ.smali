.class public Ll/۬᩶ܺ;
.super Ll/ۡۤܺ;
.source "O3K3"


# instance fields
.field public final synthetic ᩹:Ll/ܽۙܺ;


# direct methods
.method public constructor <init>(Ll/ܽۙܺ;Ljava/util/Map;)V
    .locals 0

    .line 933
    iput-object p1, p0, Ll/۬᩶ܺ;->᩹:Ll/ܽۙܺ;

    .line 934
    invoke-direct {p0, p2}, Ll/ۡۤܺ;-><init>(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 3

    .line 983
    invoke-virtual {p0}, Ll/۬᩶ܺ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 1039
    :goto_0
    move-object v1, v0

    check-cast v1, Ll/ۗ᩶ܺ;

    invoke-virtual {v1}, Ll/ۗ᩶ܺ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1040
    invoke-virtual {v1}, Ll/ۗ᩶ܺ;->next()Ljava/lang/Object;

    .line 1041
    invoke-virtual {v1}, Ll/ۗ᩶ܺ;->remove()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 3745
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    .line 988
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    .line 3745
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    .line 993
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

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

.method public final hashCode()I
    .locals 1

    .line 3745
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    .line 998
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->hashCode()I

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 3745
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    .line 939
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 940
    new-instance v1, Ll/ۗ᩶ܺ;

    invoke-direct {v1, p0, v0}, Ll/ۗ᩶ܺ;-><init>(Ll/۬᩶ܺ;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    .line 3745
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    .line 972
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 974
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 975
    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    .line 976
    iget-object p1, p0, Ll/۬᩶ܺ;->᩹:Ll/ܽۙܺ;

    invoke-static {p1, v1}, Ll/ܽۙܺ;->ۧ(Ll/ܽۙܺ;I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-lez v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method
