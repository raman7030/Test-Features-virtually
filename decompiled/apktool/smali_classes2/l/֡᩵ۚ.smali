.class public abstract Ll/֡᩵ۚ;
.super Ljava/util/AbstractSequentialList;
.source "K5QL"


# direct methods
.method public static ֫(Ll/֡᩵ۚ;I)Ljava/util/Iterator;
    .locals 1

    if-ltz p1, :cond_1

    .line 50
    invoke-virtual {p0}, Ll/֡᩵ۚ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 52
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0

    .line 47
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method


# virtual methods
.method public abstract iterator()Ljava/util/Iterator;
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 131
    invoke-virtual {p0, v0}, Ll/֡᩵ۚ;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 2

    if-ltz p1, :cond_1

    .line 50
    :try_start_0
    invoke-virtual {p0}, Ll/֡᩵ۚ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 72
    :cond_0
    new-instance v1, Ll/᩵᩵ۚ;

    invoke-direct {v1, p0, p1, v0}, Ll/᩵᩵ۚ;-><init>(Ll/֡᩵ۚ;ILjava/util/Iterator;)V

    return-object v1

    .line 47
    :cond_1
    :try_start_1
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/util/NoSuchElementException; {:try_start_1 .. :try_end_1} :catch_0

    .line 69
    :catch_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
