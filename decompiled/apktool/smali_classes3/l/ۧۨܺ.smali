.class public final Ll/ۧۨܺ;
.super Ljava/lang/Object;
.source "15PL"


# direct methods
.method public static ֫(Ljava/util/List;Ll/ܽܶܺ;Ljava/lang/Comparable;Ljava/util/Comparator;Ll/֫ۨܺ;Ll/ۤۛܺ;)I
    .locals 3

    .line 245
    invoke-static {p0, p1}, Ll/۟۫ܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;)Ljava/util/AbstractList;

    move-result-object p0

    .line 902
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    instance-of p1, p0, Ljava/util/RandomAccess;

    if-nez p1, :cond_0

    .line 282
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object p0, p1

    .line 287
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    const/4 v0, 0x0

    :goto_0
    if-gt v0, p1, :cond_3

    add-int v1, v0, p1

    ushr-int/lit8 v1, v1, 0x1

    .line 291
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p3, p2, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-gez v2, :cond_1

    add-int/lit8 p1, v1, -0x1

    goto :goto_0

    :cond_1
    if-lez v2, :cond_2

    add-int/lit8 v0, v1, 0x1

    goto :goto_0

    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 299
    invoke-interface {p0, v0, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    sub-int/2addr v1, v0

    .line 298
    invoke-virtual {p4, p3, p2, p0, v1}, Ll/֫ۨܺ;->֫(Ljava/util/Comparator;Ljava/lang/Object;Ljava/util/List;I)I

    move-result p0

    add-int/2addr v0, p0

    return v0

    .line 302
    :cond_3
    invoke-virtual {p5, v0}, Ll/ۤۛܺ;->֫(I)I

    move-result p0

    return p0
.end method
