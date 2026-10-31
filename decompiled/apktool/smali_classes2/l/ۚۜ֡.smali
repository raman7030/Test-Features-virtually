.class public abstract Ll/ۚۜ֡;
.super Ljava/lang/Object;
.source "HAT6"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/util/HashSet;)Ljava/util/List;
    .locals 3

    .line 431
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 432
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۜ֡;

    .line 433
    instance-of v2, v1, Ll/᩵ۜ֡;

    if-eqz v2, :cond_0

    if-nez v0, :cond_1

    .line 435
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 438
    :cond_1
    check-cast v1, Ll/᩵ۜ֡;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    if-nez v0, :cond_3

    .line 444
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    :cond_3
    return-object v0
.end method

.method public static ֫(Ll/ۚۜ֡;Ll/ۚۜ֡;)Ll/ۚۜ֡;
    .locals 2

    if-eqz p0, :cond_4

    .line 403
    sget-object v0, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    if-ne p0, v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_3

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 405
    :cond_1
    new-instance v0, Ll/ܺۜ֡;

    invoke-direct {v0, p0, p1}, Ll/ܺۜ֡;-><init>(Ll/ۚۜ֡;Ll/ۚۜ֡;)V

    .line 406
    iget-object p0, v0, Ll/ܺۜ֡;->֫:[Ll/ۚۜ֡;

    array-length p1, p0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    const/4 p1, 0x0

    .line 407
    aget-object p0, p0, p1

    return-object p0

    :cond_2
    return-object v0

    :cond_3
    :goto_0
    return-object p0

    :cond_4
    :goto_1
    return-object p1
.end method


# virtual methods
.method public abstract ֫(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Z
.end method

.method public ۧ(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Ll/ۚۜ֡;
    .locals 0

    return-object p0
.end method
