.class public final Ll/ܺۜ֡;
.super Ll/ᩴۜ֡;
.source "HAT6"


# instance fields
.field public final ֫:[Ll/ۚۜ֡;


# direct methods
.method public constructor <init>(Ll/ۚۜ֡;Ll/ۚۜ֡;)V
    .locals 2

    .line 195
    invoke-direct {p0}, Ll/ۚۜ֡;-><init>()V

    .line 216
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 217
    instance-of v1, p1, Ll/ܺۜ֡;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ܺۜ֡;

    iget-object p1, p1, Ll/ܺۜ֡;->֫:[Ll/ۚۜ֡;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 218
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 219
    :goto_0
    instance-of p1, p2, Ll/ܺۜ֡;

    if-eqz p1, :cond_1

    check-cast p2, Ll/ܺۜ֡;

    iget-object p1, p2, Ll/ܺۜ֡;->֫:[Ll/ۚۜ֡;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 220
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 222
    :goto_1
    invoke-static {v0}, Ll/ۚۜ֡;->֫(Ljava/util/HashSet;)Ljava/util/List;

    move-result-object p1

    .line 223
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    .line 225
    invoke-static {p1}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۜ֡;

    .line 226
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    const/4 p1, 0x0

    new-array p1, p1, [Ll/ۚۜ֡;

    .line 229
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ۚۜ֡;

    iput-object p1, p0, Ll/ܺۜ֡;->֫:[Ll/ۚۜ֡;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 240
    :cond_0
    instance-of v0, p1, Ll/ܺۜ֡;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 241
    :cond_1
    check-cast p1, Ll/ܺۜ֡;

    .line 242
    iget-object v0, p0, Ll/ܺۜ֡;->֫:[Ll/ۚۜ֡;

    iget-object p1, p1, Ll/ܺۜ֡;->֫:[Ll/ۚۜ֡;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 247
    const-class v0, Ll/ܺۜ֡;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 103
    iget-object v1, p0, Ll/ܺۜ֡;->֫:[Ll/ۚۜ֡;

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

    .line 301
    iget-object v0, p0, Ll/ܺۜ֡;->֫:[Ll/ۚۜ֡;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "&&"

    invoke-static {v0, v1}, Ll/ۙ֡᩵;->֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Z
    .locals 5

    .line 259
    iget-object v0, p0, Ll/ܺۜ֡;->֫:[Ll/ۚۜ֡;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 260
    invoke-virtual {v4, p1, p2}, Ll/ۚۜ֡;->֫(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Z

    move-result v4

    if-nez v4, :cond_0

    return v2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Ll/ۚۜ֡;
    .locals 9

    .line 268
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 269
    iget-object v1, p0, Ll/ܺۜ֡;->֫:[Ll/ۚۜ֡;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x1

    if-ge v4, v2, :cond_3

    aget-object v7, v1, v4

    .line 270
    invoke-virtual {v7, p1, p2}, Ll/ۚۜ֡;->ۧ(Ll/ᩴܳ֡;Ll/᩵ܳ֡;)Ll/ۚۜ֡;

    move-result-object v8

    if-eq v8, v7, :cond_0

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    or-int/2addr v5, v6

    if-nez v8, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 276
    :cond_1
    sget-object v6, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    if-eq v8, v6, :cond_2

    .line 278
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-nez v5, :cond_4

    return-object p0

    .line 286
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 288
    sget-object p1, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    return-object p1

    .line 291
    :cond_5
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚۜ֡;

    .line 292
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge v6, p2, :cond_6

    .line 293
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۚۜ֡;

    invoke-static {p1, p2}, Ll/ۚۜ֡;->֫(Ll/ۚۜ֡;Ll/ۚۜ֡;)Ll/ۚۜ֡;

    move-result-object p1

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_6
    return-object p1
.end method
