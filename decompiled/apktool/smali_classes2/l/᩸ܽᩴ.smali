.class public abstract Ll/᩸ܽᩴ;
.super Ll/ۘܽᩴ;
.source "XC7C"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ll/ܰᩳᩴ;
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

    move-object v1, p0

    check-cast v1, Ll/᩺ܽᩴ;

    .line 358
    iget v1, v1, Ll/᩺ܽᩴ;->᩹:I

    if-eq v0, v1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 42
    :cond_2
    instance-of v0, p1, Ll/ܰᩳᩴ;

    if-eqz v0, :cond_3

    .line 43
    check-cast p1, Ll/ܰᩳᩴ;

    invoke-virtual {p0, p1}, Ll/ۘܽᩴ;->ۧ(Ll/ۧᩳᩴ;)Z

    move-result p1

    return p1

    .line 45
    :cond_3
    invoke-virtual {p0, p1}, Ll/ۘܽᩴ;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 57
    move-object v0, p0

    check-cast v0, Ll/᩺ܽᩴ;

    .line 358
    iget v1, v0, Ll/᩺ܽᩴ;->᩹:I

    .line 213
    new-instance v2, Ll/ۛܽᩴ;

    invoke-direct {v2, v0}, Ll/ۛܽᩴ;-><init>(Ll/᩺ܽᩴ;)V

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v3, v1, -0x1

    if-eqz v1, :cond_0

    .line 61
    invoke-virtual {v2}, Ll/ۛܽᩴ;->nextFloat()F

    move-result v1

    .line 132
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    move v1, v3

    goto :goto_0

    :cond_0
    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩸ܽᩴ;->spliterator()Ll/ܶ۫ᩴ;

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

.method public abstract ֫(F)Z
.end method

.method public final ܿ(F)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 85
    invoke-virtual {p0, p1}, Ll/᩸ܽᩴ;->֫(F)Z

    move-result p1

    return p1
.end method
