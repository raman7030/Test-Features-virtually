.class public abstract Ll/֡ܰۘ;
.super Ll/᩷ܰۘ;
.source "V1DS"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ll/ۨۧᩴ;
.implements Ll/ۡ۫ᩴ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 39
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    if-nez v0, :cond_1

    goto :goto_0

    .line 40
    :cond_1
    check-cast p1, Ljava/util/Set;

    .line 41
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-eq v0, v1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 42
    :cond_2
    instance-of v0, p1, Ll/ۨۧᩴ;

    if-eqz v0, :cond_3

    .line 43
    check-cast p1, Ll/ۨۧᩴ;

    invoke-virtual {p0, p1}, Ll/᩷ܰۘ;->ۧ(Ll/ۛ֫ᩴ;)Z

    move-result p1

    return p1

    .line 45
    :cond_3
    invoke-virtual {p0, p1}, Ll/᩷ܰۘ;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 4

    .line 57
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    .line 58
    invoke-interface {p0}, Ll/ۛ֫ᩴ;->iterator()Ll/ܺۧᩴ;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_0

    .line 61
    invoke-interface {v1}, Ll/ܺۧᩴ;->֡ۧ()C

    move-result v0

    add-int/2addr v2, v0

    move v0, v3

    goto :goto_0

    :cond_0
    return v2
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/֡ܰۘ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۢ۫ᩴ;->$default$spliterator(Ljava/util/Set;)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public ֫(C)Z
    .locals 0

    .line 73
    invoke-super {p0, p1}, Ll/᩷ܰۘ;->ܿ(C)Z

    move-result p1

    return p1
.end method

.method public final ܿ(C)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 85
    invoke-virtual {p0, p1}, Ll/֡ܰۘ;->֫(C)Z

    move-result p1

    return p1
.end method
