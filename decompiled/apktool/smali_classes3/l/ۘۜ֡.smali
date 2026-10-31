.class public final Ll/ۘۜ֡;
.super Ll/ᩴۜ֡;
.source "HAT6"


# instance fields
.field public final ֫:[Ll/ۚۜ֡;


# direct methods
.method public constructor <init>(Ll/ۚۜ֡;Ll/ۚۜ֡;)V
    .locals 2

    .line 195
    invoke-direct {p0}, Ll/ۚۜ֡;-><init>()V

    .line 313
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 314
    instance-of v1, p1, Ll/ۘۜ֡;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ۘۜ֡;

    iget-object p1, p1, Ll/ۘۜ֡;->֫:[Ll/ۚۜ֡;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 315
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 316
    :goto_0
    instance-of p1, p2, Ll/ۘۜ֡;

    if-eqz p1, :cond_1

    check-cast p2, Ll/ۘۜ֡;

    iget-object p1, p2, Ll/ۘۜ֡;->֫:[Ll/ۚۜ֡;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 317
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 319
    :goto_1
    invoke-static {v0}, Ll/ۚۜ֡;->֫(Ljava/util/HashSet;)Ljava/util/List;

    move-result-object p1

    .line 320
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    .line 322
    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۜ֡;

    .line 323
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    const/4 p1, 0x0

    new-array p1, p1, [Ll/ۚۜ֡;

    .line 326
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ۚۜ֡;

    iput-object p1, p0, Ll/ۘۜ֡;->֫:[Ll/ۚۜ֡;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 337
    :cond_0
    instance-of v0, p1, Ll/ۘۜ֡;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 338
    :cond_1
    check-cast p1, Ll/ۘۜ֡;

    .line 339
    iget-object v0, p0, Ll/ۘۜ֡;->֫:[Ll/ۚۜ֡;

    iget-object p1, p1, Ll/ۘۜ֡;->֫:[Ll/ۚۜ֡;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 344
    const-class v0, Ll/ۘۜ֡;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 103
    iget-object v1, p0, Ll/ۘۜ֡;->֫:[Ll/ۚۜ֡;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 104
    invoke-static {v0, v4}, Ll/֫᩸ۡ;->֫(ILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 107
    :cond_0
    array-length v1, v1

    invoke-static {v0, v1}, Ll/֫᩸ۡ;->֫(II)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 398
    iget-object v0, p0, Ll/ۘۜ֡;->֫:[Ll/ۚۜ֡;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "||"

    invoke-static {v0, v1}, Ll/ۙ֡᩵;->֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Z
    .locals 5

    .line 356
    iget-object v0, p0, Ll/ۘۜ֡;->֫:[Ll/ۚۜ֡;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 357
    invoke-virtual {v4, p1, p2}, Ll/ۚۜ֡;->֫(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final ۧ(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Ll/ۚۜ֡;
    .locals 9

    .line 365
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 366
    iget-object v1, p0, Ll/ۘۜ֡;->֫:[Ll/ۚۜ֡;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x1

    if-ge v4, v2, :cond_3

    aget-object v7, v1, v4

    .line 367
    invoke-virtual {v7, p1, p2}, Ll/ۚۜ֡;->ۧ(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Ll/ۚۜ֡;

    move-result-object v8

    if-eq v8, v7, :cond_0

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    or-int/2addr v5, v6

    .line 369
    sget-object v6, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    if-ne v8, v6, :cond_1

    return-object v6

    :cond_1
    if-eqz v8, :cond_2

    .line 375
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-nez v5, :cond_4

    return-object p0

    .line 383
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    return-object p1

    .line 388
    :cond_5
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚۜ֡;

    const/4 p2, 0x1

    .line 389
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p2, v1, :cond_a

    .line 390
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۜ֡;

    if-nez p1, :cond_6

    move-object p1, v1

    goto :goto_4

    :cond_6
    if-nez v1, :cond_7

    goto :goto_4

    .line 420
    :cond_7
    sget-object v2, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    if-eq p1, v2, :cond_9

    if-ne v1, v2, :cond_8

    goto :goto_3

    .line 421
    :cond_8
    new-instance v2, Ll/ۘۜ֡;

    invoke-direct {v2, p1, v1}, Ll/ۘۜ֡;-><init>(Ll/ۚۜ֡;Ll/ۚۜ֡;)V

    .line 422
    iget-object p1, v2, Ll/ۘۜ֡;->֫:[Ll/ۚۜ֡;

    array-length v1, p1

    if-ne v1, v6, :cond_9

    .line 423
    aget-object p1, p1, v3

    goto :goto_4

    :cond_9
    :goto_3
    move-object p1, v2

    :goto_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_a
    return-object p1
.end method
