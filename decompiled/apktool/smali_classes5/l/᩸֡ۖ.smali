.class public final Ll/᩸֡ۖ;
.super Ljava/lang/Object;
.source "U9PR"

# interfaces
.implements Ll/ۢۚۖ;


# instance fields
.field public final ֫:Ll/ۡ֡ۖ;

.field public final ۧ:Ll/ܿۘۖ;

.field public final ܽ:Z

.field public final ᩳ:Ll/ܿ֨ۖ;


# direct methods
.method public constructor <init>(Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۡ֡ۖ;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Ll/᩸֡ۖ;->ᩳ:Ll/ܿ֨ۖ;

    .line 27
    invoke-virtual {p2, p3}, Ll/ܿۘۖ;->֫(Ll/ۡ֡ۖ;)Z

    move-result p1

    iput-boolean p1, p0, Ll/᩸֡ۖ;->ܽ:Z

    .line 28
    iput-object p2, p0, Ll/᩸֡ۖ;->ۧ:Ll/ܿۘۖ;

    .line 29
    iput-object p3, p0, Ll/᩸֡ۖ;->֫:Ll/ۡ֡ۖ;

    return-void
.end method

.method public static ֫(Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۡ֡ۖ;)Ll/᩸֡ۖ;
    .locals 1

    .line 36
    new-instance v0, Ll/᩸֡ۖ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩸֡ۖ;-><init>(Ll/ܿ֨ۖ;Ll/ܿۘۖ;Ll/ۡ֡ۖ;)V

    return-object v0
.end method

.method private ֫(Ll/ۧۚۖ;Ll/ᩳۘۖ;Ll/ܿۘۖ;Ll/᩵ۘۖ;Ll/ܿ֨ۖ;Ljava/lang/Object;)Z
    .locals 7

    .line 270
    invoke-interface {p1}, Ll/ۧۚۖ;->getTag()I

    move-result v0

    const/16 v1, 0xb

    const/4 v2, 0x1

    .line 271
    iget-object v3, p0, Ll/᩸֡ۖ;->֫:Ll/ۡ֡ۖ;

    if-eq v0, v1, :cond_2

    and-int/lit8 v1, v0, 0x7

    const/4 v4, 0x2

    if-ne v1, v4, :cond_1

    ushr-int/lit8 v0, v0, 0x3

    .line 274
    invoke-virtual {p3, p2, v3, v0}, Ll/ܿۘۖ;->֫(Ll/ᩳۘۖ;Ll/ۡ֡ۖ;I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 277
    invoke-virtual {p3, p1, v0, p2, p4}, Ll/ܿۘۖ;->֫(Ll/ۧۚۖ;Ljava/lang/Object;Ll/ᩳۘۖ;Ll/᩵ۘۖ;)V

    return v2

    .line 281
    :cond_0
    invoke-virtual {p5, p6, p1}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;Ll/ۧۚۖ;)Z

    move-result p1

    return p1

    .line 284
    :cond_1
    invoke-interface {p1}, Ll/ۧۚۖ;->᩵()Z

    move-result p1

    return p1

    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v1, v0

    const/4 v4, 0x0

    .line 312
    :cond_3
    :goto_0
    invoke-interface {p1}, Ll/ۧۚۖ;->ۘ()I

    move-result v5

    const v6, 0x7fffffff

    if-ne v5, v6, :cond_4

    goto :goto_1

    .line 317
    :cond_4
    invoke-interface {p1}, Ll/ۧۚۖ;->getTag()I

    move-result v5

    const/16 v6, 0x10

    if-ne v5, v6, :cond_5

    .line 319
    invoke-interface {p1}, Ll/ۧۚۖ;->ᩳ()I

    move-result v4

    .line 321
    invoke-virtual {p3, p2, v3, v4}, Ll/ܿۘۖ;->֫(Ll/ᩳۘۖ;Ll/ۡ֡ۖ;I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_5
    const/16 v6, 0x1a

    if-ne v5, v6, :cond_7

    if-eqz v0, :cond_6

    .line 325
    invoke-virtual {p3, p1, v0, p2, p4}, Ll/ܿۘۖ;->֫(Ll/ۧۚۖ;Ljava/lang/Object;Ll/ᩳۘۖ;Ll/᩵ۘۖ;)V

    goto :goto_0

    .line 330
    :cond_6
    invoke-interface {p1}, Ll/ۧۚۖ;->ۜ()Ll/ۛۜۖ;

    move-result-object v1

    goto :goto_0

    .line 333
    :cond_7
    invoke-interface {p1}, Ll/ۧۚۖ;->᩵()Z

    move-result v5

    if-nez v5, :cond_3

    .line 339
    :goto_1
    invoke-interface {p1}, Ll/ۧۚۖ;->getTag()I

    move-result p1

    const/16 v3, 0xc

    if-ne p1, v3, :cond_a

    if-eqz v1, :cond_9

    if-eqz v0, :cond_8

    .line 348
    invoke-virtual {p3, v1, v0, p2, p4}, Ll/ܿۘۖ;->֫(Ll/ۛۜۖ;Ljava/lang/Object;Ll/ᩳۘۖ;Ll/᩵ۘۖ;)V

    return v2

    .line 350
    :cond_8
    invoke-virtual {p5, p6, v4, v1}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;ILl/ۛۜۖ;)V

    :cond_9
    return v2

    .line 340
    :cond_a
    invoke-static {}, Ll/֫᩵ۖ;->ۧ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public final ֫(Ll/ۘۜۖ;)I
    .locals 2

    .line 377
    iget-object v0, p0, Ll/᩸֡ۖ;->ᩳ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, p1}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 378
    invoke-virtual {v0, v1}, Ll/ܿ֨ۖ;->ᩳ(Ljava/lang/Object;)I

    move-result v0

    .line 368
    iget-boolean v1, p0, Ll/᩸֡ۖ;->ܽ:Z

    if-eqz v1, :cond_0

    .line 369
    iget-object v1, p0, Ll/᩸֡ۖ;->ۧ:Ll/ܿۘۖ;

    invoke-virtual {v1, p1}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩵ۘۖ;->ܽ()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final ֫(Ll/᩸ᩴۖ;)I
    .locals 2

    .line 68
    iget-object v0, p0, Ll/᩸֡ۖ;->ᩳ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, p1}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 69
    iget-boolean v1, p0, Ll/᩸֡ۖ;->ܽ:Z

    if-eqz v1, :cond_0

    .line 70
    iget-object v1, p0, Ll/᩸֡ۖ;->ۧ:Ll/ܿۘۖ;

    invoke-virtual {v1, p1}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p1

    mul-int/lit8 v0, v0, 0x35

    .line 71
    invoke-virtual {p1}, Ll/᩵ۘۖ;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 2

    .line 44
    iget-object v0, p0, Ll/᩸֡ۖ;->֫:Ll/ۡ֡ۖ;

    instance-of v1, v0, Ll/᩸ᩴۖ;

    if-eqz v1, :cond_0

    .line 45
    check-cast v0, Ll/᩸ᩴۖ;

    .line 106
    sget-object v1, Ll/۠ᩴۖ;->ۙ:Ll/۠ᩴۖ;

    .line 290
    invoke-virtual {v0}, Ll/᩸ᩴۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 106
    check-cast v0, Ll/᩸ᩴۖ;

    return-object v0

    .line 47
    :cond_0
    invoke-interface {v0}, Ll/ۡ֡ۖ;->newBuilderForType()Ll/ۢ֡ۖ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۢ֡ۖ;->buildPartial()Ll/ۡ֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 1

    .line 257
    iget-object v0, p0, Ll/᩸֡ۖ;->ᩳ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, p1}, Ll/ܿ֨ۖ;->ܿ(Ljava/lang/Object;)V

    .line 258
    iget-object v0, p0, Ll/᩸֡ۖ;->ۧ:Ll/ܿۘۖ;

    invoke-virtual {v0, p1}, Ll/ܿۘۖ;->ܽ(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 78
    sget v0, Ll/ۡۚۖ;->֫:I

    .line 872
    iget-object v0, p0, Ll/᩸֡ۖ;->ᩳ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, p1}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 873
    invoke-virtual {v0, p2}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 874
    invoke-virtual {v0, v1, v2}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 875
    invoke-virtual {v0, p1, v1}, Ll/ܿ֨ۖ;->ܽ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    iget-boolean v0, p0, Ll/᩸֡ۖ;->ܽ:Z

    if-eqz v0, :cond_0

    .line 863
    iget-object v0, p0, Ll/᩸֡ۖ;->ۧ:Ll/ܿۘۖ;

    invoke-virtual {v0, p2}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p2

    .line 864
    invoke-virtual {p2}, Ll/᩵ۘۖ;->ܿ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 865
    invoke-virtual {v0, p1}, Ll/ܿۘۖ;->ۧ(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p1

    .line 866
    invoke-virtual {p1, p2}, Ll/᩵ۘۖ;->֫(Ll/᩵ۘۖ;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۜ۠ۖ;)V
    .locals 5

    .line 87
    iget-object v0, p0, Ll/᩸֡ۖ;->ۧ:Ll/ܿۘۖ;

    invoke-virtual {v0, p1}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object v0

    .line 88
    invoke-virtual {v0}, Ll/᩵ۘۖ;->ۜ()Ljava/util/Iterator;

    move-result-object v0

    .line 89
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 91
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۘۖ;

    .line 92
    invoke-interface {v2}, Ll/ᩴۘۖ;->ܽܽ()Ll/֫۠ۖ;

    move-result-object v3

    sget-object v4, Ll/֫۠ۖ;->ۨ:Ll/֫۠ۖ;

    if-ne v3, v4, :cond_1

    invoke-interface {v2}, Ll/ᩴۘۖ;->۟֫()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v2}, Ll/ᩴۘۖ;->ᩳܽ()Z

    move-result v3

    if-nez v3, :cond_1

    .line 95
    instance-of v3, v1, Ll/᩷᩵ۖ;

    if-eqz v3, :cond_0

    .line 97
    invoke-interface {v2}, Ll/ᩴۘۖ;->getNumber()I

    move-result v2

    check-cast v1, Ll/᩷᩵ۖ;

    invoke-virtual {v1}, Ll/᩷᩵ۖ;->ۧ()Ll/ۡ᩵ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺ᩵ۖ;->ۧ()Ll/ۛۜۖ;

    move-result-object v1

    .line 96
    move-object v3, p2

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v2, v1}, Ll/᩻᩷ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_0

    .line 99
    :cond_0
    invoke-interface {v2}, Ll/ᩴۘۖ;->getNumber()I

    move-result v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v3, p2

    check-cast v3, Ll/᩻᩷ۖ;

    invoke-virtual {v3, v2, v1}, Ll/᩻᩷ۖ;->ܽ(ILjava/lang/Object;)V

    goto :goto_0

    .line 93
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Found invalid MessageSet item."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 111
    :cond_2
    iget-object v0, p0, Ll/᩸֡ۖ;->ᩳ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, p1}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;Ll/ۜ۠ۖ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۧۚۖ;Ll/ᩳۘۖ;)V
    .locals 11

    .line 230
    iget-object v7, p0, Ll/᩸֡ۖ;->ᩳ:Ll/ܿ֨ۖ;

    invoke-virtual {v7, p1}, Ll/ܿ֨ۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 231
    iget-object v9, p0, Ll/᩸֡ۖ;->ۧ:Ll/ܿۘۖ;

    invoke-virtual {v9, p1}, Ll/ܿۘۖ;->ۧ(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object v10

    .line 234
    :goto_0
    :try_start_0
    invoke-interface {p2}, Ll/ۧۚۖ;->ۘ()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    .line 251
    invoke-virtual {v7, p1, v8}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, v9

    move-object v4, v10

    move-object v5, v7

    move-object v6, v8

    .line 238
    :try_start_1
    invoke-direct/range {v0 .. v6}, Ll/᩸֡ۖ;->֫(Ll/ۧۚۖ;Ll/ᩳۘۖ;Ll/ܿۘۖ;Ll/᩵ۘۖ;Ll/ܿ֨ۖ;Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 251
    :cond_1
    invoke-virtual {v7, p1, v8}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {v7, p1, v8}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    throw p2
.end method

.method public final ֫(Ll/᩸ᩴۖ;Ll/᩸ᩴۖ;)Z
    .locals 2

    .line 53
    iget-object v0, p0, Ll/᩸֡ۖ;->ᩳ:Ll/ܿ֨ۖ;

    invoke-virtual {v0, p1}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 54
    invoke-virtual {v0, p2}, Ll/ܿ֨ۖ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 55
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 58
    :cond_0
    iget-boolean v0, p0, Ll/᩸֡ۖ;->ܽ:Z

    if-eqz v0, :cond_1

    .line 59
    iget-object v0, p0, Ll/᩸֡ۖ;->ۧ:Ll/ܿۘۖ;

    invoke-virtual {v0, p1}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p1

    .line 60
    invoke-virtual {v0, p2}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p2

    .line 61
    invoke-virtual {p1, p2}, Ll/᩵ۘۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)Z
    .locals 1

    .line 358
    iget-object v0, p0, Ll/᩸֡ۖ;->ۧ:Ll/ܿۘۖ;

    invoke-virtual {v0, p1}, Ll/ܿۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p1

    .line 359
    invoke-virtual {p1}, Ll/᩵ۘۖ;->᩻()Z

    move-result p1

    return p1
.end method
