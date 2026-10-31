.class public abstract Ll/۫۠᩵;
.super Ll/᩹۠᩵;
.source "79A7"

# interfaces
.implements Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Operation is not supported for read-only collection"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Operation is not supported for read-only collection"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 71
    :cond_0
    instance-of v1, p1, Ljava/util/List;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 73
    :cond_1
    check-cast p1, Ljava/util/Collection;

    .line 168
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    goto :goto_0

    .line 170
    :cond_2
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 171
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 172
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 173
    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :goto_0
    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 161
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    mul-int/lit8 v1, v1, 0x1f

    if-eqz v2, :cond_0

    .line 162
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 3

    .line 364
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 27
    invoke-static {v2, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 25
    new-instance v0, Ll/ۙ۠᩵;

    invoke-direct {v0, p0}, Ll/ۙ۠᩵;-><init>(Ll/۫۠᩵;)V

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 2

    .line 391
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    .line 392
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 393
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    .line 29
    invoke-static {v1, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 394
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 2

    .line 31
    new-instance v0, Ll/ۗ۠᩵;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ۗ۠᩵;-><init>(Ll/۫۠᩵;I)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 33
    new-instance v0, Ll/ۗ۠᩵;

    invoke-direct {v0, p0, p1}, Ll/ۗ۠᩵;-><init>(Ll/۫۠᩵;I)V

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 1

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Operation is not supported for read-only collection"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public subList(II)Ljava/util/List;
    .locals 1

    .line 35
    new-instance v0, Ll/۬۠᩵;

    invoke-direct {v0, p0, p1, p2}, Ll/۬۠᩵;-><init>(Ll/۫۠᩵;II)V

    return-object v0
.end method
