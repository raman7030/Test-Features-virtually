.class public final Ll/ۖۗۡ;
.super Ljava/lang/Object;
.source "C1V2"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۖۗۡ;->֫:Ljava/util/HashMap;

    .line 28
    iput-object p1, p0, Ll/ۖۗۡ;->ܽ:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Ll/ۖۗۡ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۖۗۡ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 44
    iget-object v0, p0, Ll/ۖۗۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚۙۡ;

    .line 46
    invoke-virtual {v2}, Ll/ۚۙۡ;->֫()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ll/ۚۙۡ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 47
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ܽܳۚ;Ll/ۚܽۚ;Ll/᩹ۗۡ;)Ll/ۚܽۚ;
    .locals 3

    .line 25
    new-instance v0, Ll/ۚۙۡ;

    invoke-interface {p2}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, p3}, Ll/ܽۙۡ;->֫(Ll/ۚܽۚ;Ll/᩹ۗۡ;)Ll/ܽۙۡ;

    move-result-object p3

    const/4 v2, 0x1

    invoke-direct {v0, v1, p3, v2}, Ll/ۚۙۡ;-><init>(Ljava/lang/String;Ll/ܽۙۡ;Z)V

    .line 100
    iget-object p3, p0, Ll/ۖۗۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 112
    :cond_0
    new-instance v0, Ll/ܺۗۡ;

    invoke-direct {v0, p1, p2, p3}, Ll/ܺۗۡ;-><init>(Ll/ܽܳۚ;Ll/ۚܽۚ;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ll/ܽܳۚ;Ll/ᩴܽۚ;Ll/᩹ۗۡ;)Ll/ᩴܽۚ;
    .locals 3

    .line 21
    new-instance v0, Ll/ۚۙۡ;

    invoke-interface {p2}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, p3}, Ll/ܽۙۡ;->֫(Ll/ᩴܽۚ;Ll/᩹ۗۡ;)Ll/ܽۙۡ;

    move-result-object p3

    const/4 v2, 0x0

    invoke-direct {v0, v1, p3, v2}, Ll/ۚۙۡ;-><init>(Ljava/lang/String;Ll/ܽۙۡ;Z)V

    .line 105
    iget-object p3, p0, Ll/ۖۗۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 119
    :cond_0
    new-instance v0, Ll/ۡۗۡ;

    invoke-direct {v0, p1, p2, p3}, Ll/ۡۗۡ;-><init>(Ll/ܽܳۚ;Ll/ᩴܽۚ;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ll/ۚۙۡ;Ljava/lang/String;)V
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۖۗۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ۚۙۡ;)Z
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ۖۗۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/ۖۗۡ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 57
    iget-object v0, p0, Ll/ۖۗۡ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 58
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚۙۡ;

    .line 59
    invoke-virtual {v2}, Ll/ۚۙۡ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ll/ۚۙۡ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 60
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
