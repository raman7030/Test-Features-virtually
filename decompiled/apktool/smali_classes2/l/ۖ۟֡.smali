.class public abstract Ll/ۖ۟֡;
.super Ljava/util/AbstractList;
.source "45V6"


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    if-ltz p1, :cond_0

    .line 46
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 49
    invoke-virtual {p0, p1}, Ll/ۖ۟֡;->֫(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public abstract ֫(I)Ljava/lang/Object;
.end method
