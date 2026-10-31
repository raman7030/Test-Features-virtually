.class public abstract Ll/ۙ᩵;
.super Ljava/lang/Object;
.source "G58P"


# instance fields
.field public ֫:Ll/ܶ᩵;

.field public ۧ:Ll/᩸᩵;

.field public ܽ:Ll/᩶᩵;


# direct methods
.method public static ֫(Ljava/util/Map;Ljava/util/Collection;)Z
    .locals 3

    .line 478
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    .line 479
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 480
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 481
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 482
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 485
    :cond_1
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result p0

    if-eq v0, p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ljava/util/Set;Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 518
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_1

    .line 519
    check-cast p1, Ljava/util/Set;

    .line 522
    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public abstract ֫(Ljava/lang/Object;)I
.end method

.method public abstract ֫(II)Ljava/lang/Object;
.end method

.method public abstract ֫(ILjava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ֫()V
.end method

.method public abstract ֫(I)V
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public final ֫(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 499
    invoke-virtual {p0}, Ll/ۙ᩵;->ܽ()I

    move-result v0

    .line 500
    array-length v1, p2

    if-ge v1, v0, :cond_0

    .line 502
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Object;

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 506
    invoke-virtual {p0, v1, p1}, Ll/ۙ᩵;->֫(II)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 508
    :cond_1
    array-length p1, p2

    if-le p1, v0, :cond_2

    const/4 p1, 0x0

    .line 509
    aput-object p1, p2, v0

    :cond_2
    return-object p2
.end method

.method public abstract ۧ(Ljava/lang/Object;)I
.end method

.method public abstract ۧ()Ljava/util/Map;
.end method

.method public abstract ܽ()I
.end method
