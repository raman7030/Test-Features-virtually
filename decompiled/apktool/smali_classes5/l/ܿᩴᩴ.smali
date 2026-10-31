.class public abstract Ll/ܿᩴᩴ;
.super Ll/ۨۘᩴ;
.source "71M8"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ll/ᩴۚᩴ;
.implements Ll/ۡ۫ᩴ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 39
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 40
    :cond_1
    check-cast p1, Ljava/util/Set;

    .line 41
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-eq v0, v2, :cond_2

    return v1

    .line 42
    :cond_2
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 4

    .line 54
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    .line 55
    invoke-interface {p0}, Ll/᩶֡ᩴ;->iterator()Ll/۫֡ᩴ;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_1

    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    .line 59
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    move v0, v3

    goto :goto_0

    :cond_1
    return v2
.end method
