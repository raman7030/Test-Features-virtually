.class public abstract Ll/ۚܰۘ;
.super Ll/֡ܰۘ;
.source "YRI"

# interfaces
.implements Ll/֫ܽᩴ;
.implements Ll/ܺ۫ᩴ;


# virtual methods
.method public final first()Ljava/lang/Object;
    .locals 1

    .line 211
    move-object v0, p0

    check-cast v0, Ll/᩻ܰۘ;

    .line 74
    iget-object v0, v0, Ll/᩻ܰۘ;->᩸:Ll/ۜܰۘ;

    invoke-interface {v0}, Ll/֡֫ᩴ;->۬֫()C

    move-result v0

    .line 211
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 34
    check-cast p1, Ljava/lang/Character;

    .line 189
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    move-object v0, p0

    check-cast v0, Ll/᩻ܰۘ;

    .line 84
    iget-object v0, v0, Ll/᩻ܰۘ;->᩸:Ll/ۜܰۘ;

    invoke-interface {v0, p1}, Ll/֡֫ᩴ;->ᩳ(C)Ll/֡֫ᩴ;

    move-result-object p1

    check-cast p1, Ll/᩸۟ۘ;

    invoke-virtual {p1}, Ll/᩸۟ۘ;->keySet()Ll/֫ܽᩴ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1196
    invoke-interface {p0}, Ll/֫ܽᩴ;->ۤ()Ll/ܶۧᩴ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ll/ܺۧᩴ;
    .locals 1

    .line 1196
    invoke-interface {p0}, Ll/֫ܽᩴ;->ۤ()Ll/ܶۧᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 1

    .line 222
    move-object v0, p0

    check-cast v0, Ll/᩻ܰۘ;

    .line 79
    iget-object v0, v0, Ll/᩻ܰۘ;->᩸:Ll/ۜܰۘ;

    invoke-interface {v0}, Ll/֡֫ᩴ;->ܳ֫()C

    move-result v0

    .line 222
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۚܰۘ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 34
    invoke-virtual {p0}, Ll/ۚܰۘ;->spliterator()Ll/ܽܽᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܽܽᩴ;
    .locals 5

    .line 118
    invoke-interface {p0}, Ll/֫ܽᩴ;->ۤ()Ll/ܶۧᩴ;

    move-result-object v0

    invoke-static {p0}, Ll/ۘ᩺ۘ;->֫(Ljava/util/Collection;)J

    move-result-wide v1

    move-object v3, p0

    check-cast v3, Ll/᩻ܰۘ;

    .line 69
    iget-object v3, v3, Ll/᩻ܰۘ;->᩸:Ll/ۜܰۘ;

    invoke-interface {v3}, Ll/֡֫ᩴ;->comparator()V

    .line 1522
    new-instance v3, Ll/ۡܽᩴ;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v2, v4}, Ll/ۡܽᩴ;-><init>(Ll/ܶۧᩴ;JLl/֫ۧᩴ;)V

    return-object v3
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 34
    check-cast p1, Ljava/lang/Character;

    check-cast p2, Ljava/lang/Character;

    .line 178
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result p2

    move-object v0, p0

    check-cast v0, Ll/᩻ܰۘ;

    .line 94
    iget-object v0, v0, Ll/᩻ܰۘ;->᩸:Ll/ۜܰۘ;

    invoke-interface {v0, p1, p2}, Ll/֡֫ᩴ;->ۧ(CC)Ll/֡֫ᩴ;

    move-result-object p1

    check-cast p1, Ll/᩸۟ۘ;

    invoke-virtual {p1}, Ll/᩸۟ۘ;->keySet()Ll/֫ܽᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 34
    check-cast p1, Ljava/lang/Character;

    .line 200
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    move-object v0, p0

    check-cast v0, Ll/᩻ܰۘ;

    .line 89
    iget-object v0, v0, Ll/᩻ܰۘ;->᩸:Ll/ۜܰۘ;

    invoke-interface {v0, p1}, Ll/֡֫ᩴ;->ܳ(C)Ll/֡֫ᩴ;

    move-result-object p1

    check-cast p1, Ll/᩸۟ۘ;

    invoke-virtual {p1}, Ll/᩸۟ۘ;->keySet()Ll/֫ܽᩴ;

    move-result-object p1

    return-object p1
.end method
