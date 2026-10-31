.class public final Ll/᩷۟ۘ;
.super Ll/ܳᩴᩴ;
.source "5SO"


# instance fields
.field public final ᩸:Ll/ۜ۟ۘ;

.field public final synthetic ᩹:Ll/ۙ۟ۘ;


# direct methods
.method public constructor <init>(Ll/ۙ۟ۘ;)V
    .locals 0

    .line 1088
    iput-object p1, p0, Ll/᩷۟ۘ;->᩹:Ll/ۙ۟ۘ;

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 1089
    new-instance p1, Ll/ۜ۟ۘ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷۟ۘ;->᩸:Ll/ۜ۟ۘ;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1137
    iget-object v0, p0, Ll/᩷۟ۘ;->᩹:Ll/ۙ۟ۘ;

    invoke-virtual {v0}, Ll/ۙ۟ۘ;->clear()V

    return-void
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 1093
    iget-object v0, p0, Ll/᩷۟ۘ;->᩸:Ll/ۜ۟ۘ;

    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 1109
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-nez v1, :cond_0

    goto :goto_0

    .line 1110
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 1111
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    .line 1112
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Character;

    if-nez v1, :cond_2

    return v0

    .line 1113
    :cond_2
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    iget-object v1, p0, Ll/᩷۟ۘ;->᩹:Ll/ۙ۟ۘ;

    invoke-virtual {v1, v0}, Ll/ۙ۟ۘ;->ܽ(C)Ll/ۡ۟ۘ;

    move-result-object v0

    .line 1114
    invoke-interface {p1, v0}, Ljava/util/Map$Entry;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public final first()Ljava/lang/Object;
    .locals 1

    .line 1142
    iget-object v0, p0, Ll/᩷۟ۘ;->᩹:Ll/ۙ۟ۘ;

    iget-object v0, v0, Ll/ۙ۟ۘ;->ۙ:Ll/ۡ۟ۘ;

    return-object v0
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1088
    check-cast p1, Ll/ۨ۟ۘ;

    .line 1157
    iget-object v0, p0, Ll/᩷۟ۘ;->᩹:Ll/ۙ۟ۘ;

    invoke-interface {p1}, Ll/ۨ۟ۘ;->ܿ()C

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۙ۟ۘ;->ᩳ(C)Ll/֡֫ᩴ;

    move-result-object p1

    check-cast p1, Ll/᩸۟ۘ;

    invoke-virtual {p1}, Ll/᩸۟ۘ;->ܳ()Ll/֨ۚᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ll/ܶ֡ᩴ;
    .locals 2

    .line 1098
    new-instance v0, Ll/ܺ۟ۘ;

    iget-object v1, p0, Ll/᩷۟ۘ;->᩹:Ll/ۙ۟ۘ;

    .line 1057
    invoke-direct {v0, v1}, Ll/᩹۟ۘ;-><init>(Ll/ۙ۟ۘ;)V

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 1

    .line 1147
    iget-object v0, p0, Ll/᩷۟ۘ;->᩹:Ll/ۙ۟ۘ;

    iget-object v0, v0, Ll/ۙ۟ۘ;->۬:Ll/ۡ۟ۘ;

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 4

    .line 1120
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1121
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 1122
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    .line 1123
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Character;

    if-nez v0, :cond_2

    goto :goto_0

    .line 1124
    :cond_2
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    iget-object v2, p0, Ll/᩷۟ۘ;->᩹:Ll/ۙ۟ۘ;

    invoke-virtual {v2, v0}, Ll/ۙ۟ۘ;->ܽ(C)Ll/ۡ۟ۘ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 125
    iget-object v3, v0, Ll/ܿܰۘ;->᩹:Ljava/lang/Object;

    .line 1125
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v3, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 1126
    :cond_3
    iget-char p1, v0, Ll/ܿܰۘ;->᩸:C

    invoke-virtual {v2, p1}, Ll/ۙ۟ۘ;->ܿ(C)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_0
    return v1
.end method

.method public final size()I
    .locals 1

    .line 1132
    iget-object v0, p0, Ll/᩷۟ۘ;->᩹:Ll/ۙ۟ۘ;

    iget v0, v0, Ll/ۙ۟ۘ;->᩸:I

    return v0
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1088
    check-cast p1, Ll/ۨ۟ۘ;

    check-cast p2, Ll/ۨ۟ۘ;

    .line 1152
    invoke-interface {p1}, Ll/ۨ۟ۘ;->ܿ()C

    move-result p1

    invoke-interface {p2}, Ll/ۨ۟ۘ;->ܿ()C

    move-result p2

    iget-object v0, p0, Ll/᩷۟ۘ;->᩹:Ll/ۙ۟ۘ;

    invoke-virtual {v0, p1, p2}, Ll/ۙ۟ۘ;->ۧ(CC)Ll/֡֫ᩴ;

    move-result-object p1

    check-cast p1, Ll/᩸۟ۘ;

    invoke-virtual {p1}, Ll/᩸۟ۘ;->ܳ()Ll/֨ۚᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1088
    check-cast p1, Ll/ۨ۟ۘ;

    .line 1162
    iget-object v0, p0, Ll/᩷۟ۘ;->᩹:Ll/ۙ۟ۘ;

    invoke-interface {p1}, Ll/ۨ۟ۘ;->ܿ()C

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۙ۟ۘ;->ܳ(C)Ll/֡֫ᩴ;

    move-result-object p1

    check-cast p1, Ll/᩸۟ۘ;

    invoke-virtual {p1}, Ll/᩸۟ۘ;->ܳ()Ll/֨ۚᩴ;

    move-result-object p1

    return-object p1
.end method
