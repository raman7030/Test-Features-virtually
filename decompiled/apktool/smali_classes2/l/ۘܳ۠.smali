.class public final Ll/ۘܳ۠;
.super Ljava/lang/Object;
.source "K7QT"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public final ۧ:Ljava/util/LinkedHashMap;

.field public final synthetic ܽ:Ll/᩹ܳ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܳ۠;)V
    .locals 0

    .line 1061
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘܳ۠;->ܽ:Ll/᩹ܳ۠;

    .line 1062
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll/ۘܳ۠;->֫:Ljava/util/LinkedHashMap;

    .line 1063
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll/ۘܳ۠;->ۧ:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘܳ۠;)Ljava/util/LinkedHashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘܳ۠;->֫:Ljava/util/LinkedHashMap;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ܽܳ۠;
    .locals 1

    .line 1087
    iget-object v0, p0, Ll/ۘܳ۠;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽܳ۠;

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 1104
    iget-object v0, p0, Ll/ۘܳ۠;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 1105
    iget-object v0, p0, Ll/ۘܳ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    return-void
.end method

.method public final ֫(Ll/ܽܳ۠;)V
    .locals 3

    .line 1066
    iget-object v0, p0, Ll/ۘܳ۠;->֫:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ll/ܽܳ۠;->֫(Ll/ܽܳ۠;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1067
    iget-object v0, p1, Ll/ܽܳ۠;->۬:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷۠ᩴ;

    .line 1068
    iget-object v2, p0, Ll/ۘܳ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ll/᩹ܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩷۠ᩴ;)Z
    .locals 2

    .line 1113
    iget-object v0, p0, Ll/ۘܳ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Ll/ۘܳ۠;->ܽ:Ll/᩹ܳ۠;

    invoke-static {v1, v0, p1}, Ll/᩹ܳ۠;->֫(Ll/᩹ܳ۠;Ljava/util/Collection;Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()Ljava/util/Set;
    .locals 2

    .line 1121
    iget-object v0, p0, Ll/ۘܳ۠;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 1122
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܺܳ۠;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1123
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۖܳ۠;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1124
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 1125
    invoke-static {}, Ll/᩺ۨᩴ;->toSet()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 1121
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/᩷۠ᩴ;)Ll/ܽܳ۠;
    .locals 1

    :goto_0
    if-eqz p1, :cond_1

    .line 1092
    iget-object v0, p0, Ll/ۘܳ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽܳ۠;

    if-eqz v0, :cond_0

    return-object v0

    .line 1097
    :cond_0
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Ll/ܽܳ۠;)V
    .locals 3

    .line 1074
    iget-object v0, p0, Ll/ۘܳ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 1075
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1076
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1077
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p1, :cond_0

    .line 1078
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 1081
    :cond_1
    iget-object v1, p1, Ll/ܽܳ۠;->۬:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷۠ᩴ;

    .line 1082
    invoke-static {v2}, Ll/᩹ܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 1109
    iget-object v0, p0, Ll/ۘܳ۠;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()Ljava/util/Set;
    .locals 2

    .line 1117
    iget-object v0, p0, Ll/ۘܳ۠;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {}, Ll/᩺ۨᩴ;->toSet()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
