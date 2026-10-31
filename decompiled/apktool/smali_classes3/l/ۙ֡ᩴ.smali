.class public abstract Ll/ۙ֡ᩴ;
.super Ll/ۨۘᩴ;
.source "W1F5"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final addAll(Ljava/util/Collection;)Z
    .locals 0

    .line 106
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 0

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 0

    .line 101
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    return p1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 0

    return-void
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 42
    sget-object v0, Ll/᩺֡ᩴ;->֫:Ll/ۨ֡ᩴ;

    return-object v0
.end method

.method public bridge synthetic iterator()Ll/۫֡ᩴ;
    .locals 1

    .line 42
    sget-object v0, Ll/᩺֡ᩴ;->֫:Ll/ۨ֡ᩴ;

    return-object v0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0

    .line 111
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final removeIf(Ljava/util/function/Predicate;)Z
    .locals 0

    .line 121
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 116
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۙ֡ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 1

    .line 71
    sget-object v0, Ll/ۤۚᩴ;->֫:Ll/ۙۚᩴ;

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 42
    sget-object v0, Ll/ۤۚᩴ;->֫:Ll/ۙۚᩴ;

    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 53
    sget-object v0, Ll/۠֡ᩴ;->ۧ:[Ljava/lang/Object;

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    .line 58
    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput-object v1, p1, v0

    :cond_0
    return-object p1
.end method
