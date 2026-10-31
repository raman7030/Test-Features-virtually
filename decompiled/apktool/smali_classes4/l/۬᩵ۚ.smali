.class public final Ll/۬᩵ۚ;
.super Ljava/lang/Object;
.source "R4VP"

# interfaces
.implements Ll/֡ۤۖ;


# direct methods
.method public static ֫(Ljava/util/List;Ljava/lang/Object;I)I
    .locals 3

    .line 50
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_0

    .line 51
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    .line 53
    :cond_0
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ll/ᩴܺۚ;->ۗ:Ljava/util/Comparator;

    invoke-interface {v1, v0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_1

    return p2

    :cond_1
    if-gez v0, :cond_5

    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 59
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_4

    .line 60
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_3

    return p2

    :cond_3
    if-lez v0, :cond_2

    add-int/lit8 p2, p2, 0x1

    neg-int p0, p2

    return p0

    .line 69
    :cond_4
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    return p0

    :cond_5
    const/4 v0, -0x1

    add-int/2addr p2, v0

    :goto_0
    if-ltz p2, :cond_8

    .line 73
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_6

    return p2

    :cond_6
    if-gez v2, :cond_7

    add-int/lit8 p2, p2, 0x2

    neg-int p0, p2

    return p0

    :cond_7
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_8
    return v0
.end method
