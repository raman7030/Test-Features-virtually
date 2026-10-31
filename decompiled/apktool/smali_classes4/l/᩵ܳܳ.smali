.class public final Ll/᩵ܳܳ;
.super Ljava/util/HashMap;
.source "27BS"


# instance fields
.field public final synthetic ᩸:Ll/۠ܳܳ;


# direct methods
.method public constructor <init>(Ll/۠ܳܳ;)V
    .locals 0

    .line 1821
    iput-object p1, p0, Ll/᩵ܳܳ;->᩸:Ll/۠ܳܳ;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 1865
    iget-object v0, p0, Ll/᩵ܳܳ;->᩸:Ll/۠ܳܳ;

    invoke-static {v0}, Ll/۠ܳܳ;->֫(Ll/۠ܳܳ;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 1866
    invoke-static {v0}, Ll/۠ܳܳ;->ۧ(Ll/۠ܳܳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1867
    invoke-super {p0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1821
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    .line 1825
    invoke-virtual {p0, p1}, Ll/᩵ܳܳ;->remove(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1826
    iget-object v1, p0, Ll/᩵ܳܳ;->᩸:Ll/۠ܳܳ;

    invoke-static {v1}, Ll/۠ܳܳ;->֫(Ll/۠ܳܳ;)Ljava/util/HashMap;

    move-result-object v1

    if-nez p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1827
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1821
    invoke-virtual {p0, p1}, Ll/᩵ܳܳ;->remove(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1833
    instance-of v0, p1, Ljava/lang/String;

    iget-object v1, p0, Ll/᩵ܳܳ;->᩸:Ll/۠ܳܳ;

    if-nez v0, :cond_0

    .line 1834
    invoke-static {v1}, Ll/۠ܳܳ;->֫(Ll/۠ܳܳ;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1835
    invoke-super {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 1838
    :cond_0
    check-cast p1, Ljava/lang/String;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 1839
    invoke-static {v1}, Ll/۠ܳܳ;->֫(Ll/۠ܳܳ;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1840
    invoke-static {v1}, Ll/۠ܳܳ;->ۧ(Ll/۠ܳܳ;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 1841
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1842
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1843
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 1844
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1845
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 1849
    :cond_2
    invoke-virtual {p0}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    .line 1850
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1851
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1852
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_3

    .line 1853
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez v1, :cond_4

    .line 1855
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1857
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_5
    return-object v1
.end method
