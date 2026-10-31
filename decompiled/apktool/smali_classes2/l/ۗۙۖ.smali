.class public final Ll/ۗۙۖ;
.super Ljava/lang/Object;
.source "C5XL"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 62
    check-cast p1, Ll/۬ۙۖ;

    check-cast p2, Ll/۬ۙۖ;

    .line 66
    iget-object v0, p2, Ll/۬ۙۖ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    iget-object v1, p1, Ll/۬ۙۖ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 68
    iget-object p2, p2, Ll/۬ۙۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {p2}, Ljava/util/HashSet;->size()I

    move-result p2

    iget-object p1, p1, Ll/۬ۙۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->size()I

    move-result p1

    sub-int/2addr p2, p1

    return p2

    :cond_0
    return v0
.end method
