.class public Ll/۬ܳ֡;
.super Ljava/lang/Object;
.source "0AST"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field public ۗ:Ljava/util/BitSet;

.field public final ۙ:Ljava/util/ArrayList;

.field public ۛ:Z

.field public ۤ:Z

.field public ۨ:I

.field public final ۫:Z

.field public ۬:Z

.field public ᩶:Ll/᩶ܳ֡;

.field public ᩸:I

.field public ᩹:[Ll/᩹ܳ֡;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 110
    invoke-direct {p0, v0, v1}, Ll/۬ܳ֡;-><init>(ZZ)V

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 2

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 72
    iput-boolean v0, p0, Ll/۬ܳ֡;->ۛ:Z

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 107
    iput v0, p0, Ll/۬ܳ֡;->᩸:I

    .line 115
    iput-boolean p1, p0, Ll/۬ܳ֡;->۫:Z

    if-eqz p2, :cond_0

    const/16 p1, 0x8

    new-array p1, p1, [Ll/᩹ܳ֡;

    .line 116
    iput-object p1, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    return-void

    .line 117
    :cond_0
    new-instance p1, Ll/ۗܳ֡;

    .line 37
    sget-object p2, Ll/ۙܳ֡;->ۧ:Ll/ۙܳ֡;

    const/4 v0, 0x2

    .line 433
    invoke-direct {p1, p2, v0}, Ll/֫᩷֡;-><init>(Ll/ۖ᩹ۢ;I)V

    .line 117
    iput-object p1, p0, Ll/۬ܳ֡;->᩶:Ll/᩶ܳ֡;

    return-void
.end method

.method private ֫(IILl/ۚۜ֡;)I
    .locals 4

    add-int/lit16 v0, p1, 0xd9

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, p2

    mul-int/lit8 v0, v0, 0x1f

    .line 204
    invoke-virtual {p3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 205
    iget-object v0, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    ushr-int/lit8 v2, v1, 0x10

    xor-int/2addr v1, v2

    :goto_0
    and-int/2addr v1, v0

    .line 208
    iget-object v2, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    aget-object v2, v2, v1

    if-eqz v2, :cond_1

    .line 209
    iget-object v3, v2, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v3, v3, Ll/᩺ܳ֡;->ܿ:I

    if-ne v3, p1, :cond_0

    iget v3, v2, Ll/᩹ܳ֡;->֫:I

    if-ne v3, p2, :cond_0

    iget-object v2, v2, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    .line 210
    invoke-virtual {v2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v1
.end method

.method private ֫(Ll/᩹ܳ֡;Ll/ܽۜ֡;ILl/ۧ᩷֡;)V
    .locals 2

    .line 186
    iget-boolean v0, p0, Ll/۬ܳ֡;->۫:Z

    xor-int/lit8 v0, v0, 0x1

    .line 187
    iget-object v1, p1, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    .line 188
    invoke-static {v1, p2, v0, p4}, Ll/ܽۜ֡;->֫(Ll/ܽۜ֡;Ll/ܽۜ֡;ZLl/ۧ᩷֡;)Ll/ܽۜ֡;

    move-result-object p2

    .line 192
    iget p4, p1, Ll/᩹ܳ֡;->ܽ:I

    .line 193
    invoke-static {p4, p3}, Ljava/lang/Math;->max(II)I

    move-result p4

    iput p4, p1, Ll/᩹ܳ֡;->ܽ:I

    const/high16 v0, 0x40000000    # 2.0f

    and-int/2addr p3, v0

    if-eqz p3, :cond_0

    or-int p3, p4, v0

    .line 144
    iput p3, p1, Ll/᩹ܳ֡;->ܽ:I

    .line 200
    :cond_0
    iput-object p2, p1, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    .line 27
    check-cast p1, Ll/᩹ܳ֡;

    const/4 v0, 0x0

    .line 132
    invoke-virtual {p0, p1, v0}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 2

    .line 286
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܳ֡;

    const/4 v1, 0x0

    .line 132
    invoke-virtual {p0, v0, v1}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final clear()V
    .locals 2

    .line 364
    iget-boolean v0, p0, Ll/۬ܳ֡;->ۛ:Z

    if-nez v0, :cond_1

    .line 365
    iget-object v0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, -0x1

    .line 366
    iput v0, p0, Ll/۬ܳ֡;->᩸:I

    .line 367
    iget-object v0, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 368
    :cond_0
    iget-object v0, p0, Ll/۬ܳ֡;->᩶:Ll/᩶ܳ֡;

    invoke-virtual {v0}, Ll/֫᩷֡;->clear()V

    return-void

    .line 364
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This set is readonly"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 5

    .line 338
    iget-object v0, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    const-string v1, "This method is not implemented for readonly sets."

    if-eqz v0, :cond_4

    instance-of v2, p1, Ll/᩹ܳ֡;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    check-cast p1, Ll/᩹ܳ֡;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 348
    iget-object v1, p1, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v1, v1, Ll/᩺ܳ֡;->ܿ:I

    iget v4, p1, Ll/᩹ܳ֡;->֫:I

    iget-object p1, p1, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    invoke-direct {p0, v1, v4, p1}, Ll/۬ܳ֡;->֫(IILl/ۚۜ֡;)I

    move-result p1

    aget-object p1, v0, p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    .line 350
    :cond_1
    iget-object v0, p0, Ll/۬ܳ֡;->᩶:Ll/᩶ܳ֡;

    if-eqz v0, :cond_2

    .line 354
    invoke-virtual {v0, p1}, Ll/֫᩷֡;->ۧ(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_3

    return v2

    .line 351
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return v3

    .line 339
    :cond_4
    iget-object v0, p0, Ll/۬ܳ֡;->᩶:Ll/᩶ܳ֡;

    if-eqz v0, :cond_5

    .line 343
    invoke-virtual {v0, p1}, Ll/֫᩷֡;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 340
    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 0

    .line 413
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    .line 295
    :cond_0
    instance-of v0, p1, Ll/۬ܳ֡;

    if-nez v0, :cond_1

    goto :goto_1

    .line 300
    :cond_1
    check-cast p1, Ll/۬ܳ֡;

    .line 301
    iget-object v0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v1, p1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    .line 302
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/۬ܳ֡;->۫:Z

    iget-boolean v1, p1, Ll/۬ܳ֡;->۫:Z

    if-ne v0, v1, :cond_2

    iget v0, p0, Ll/۬ܳ֡;->ۨ:I

    iget v1, p1, Ll/۬ܳ֡;->ۨ:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll/۬ܳ֡;->ۗ:Ljava/util/BitSet;

    iget-object v1, p1, Ll/۬ܳ֡;->ۗ:Ljava/util/BitSet;

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ll/۬ܳ֡;->ۤ:Z

    iget-boolean v1, p1, Ll/۬ܳ֡;->ۤ:Z

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ll/۬ܳ֡;->۬:Z

    iget-boolean p1, p1, Ll/۬ܳ֡;->۬:Z

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 372
    iget-boolean v0, p0, Ll/۬ܳ֡;->ۛ:Z

    .line 315
    iget-object v1, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 316
    iget v0, p0, Ll/۬ܳ֡;->᩸:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    .line 317
    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v0

    iput v0, p0, Ll/۬ܳ֡;->᩸:I

    .line 320
    :cond_0
    iget v0, p0, Ll/۬ܳ֡;->᩸:I

    return v0

    .line 323
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 333
    iget-object v0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 359
    iget-object v0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 408
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0

    .line 423
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 418
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    .line 328
    iget-object v0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 2

    .line 396
    iget-object v0, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ll/᩹ܳ֡;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩹ܳ֡;

    return-object v0

    .line 397
    :cond_0
    iget-object v0, p0, Ll/۬ܳ֡;->᩶:Ll/᩶ܳ֡;

    invoke-virtual {v0}, Ll/֫᩷֡;->toArray()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩹ܳ֡;

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 402
    iget-object v0, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 403
    :cond_0
    iget-object v0, p0, Ll/۬ܳ֡;->᩶:Ll/᩶ܳ֡;

    invoke-virtual {v0, p1}, Ll/֫᩷֡;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 383
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    iget-object v1, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    .line 384
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    iget-boolean v1, p0, Ll/۬ܳ֡;->ۤ:Z

    if-eqz v1, :cond_0

    const-string v1, ",hasSemanticContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/۬ܳ֡;->ۤ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 386
    :cond_0
    iget v1, p0, Ll/۬ܳ֡;->ۨ:I

    if-eqz v1, :cond_1

    const-string v1, ",uniqueAlt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۬ܳ֡;->ۨ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 387
    :cond_1
    iget-object v1, p0, Ll/۬ܳ֡;->ۗ:Ljava/util/BitSet;

    if-eqz v1, :cond_2

    const-string v1, ",conflictingAlts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۬ܳ֡;->ۗ:Ljava/util/BitSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 388
    :cond_2
    iget-boolean v1, p0, Ll/۬ܳ֡;->۬:Z

    if-eqz v1, :cond_3

    const-string v1, ",dipsIntoOuterContext"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V
    .locals 10

    .line 149
    iget-boolean v0, p0, Ll/۬ܳ֡;->ۛ:Z

    if-nez v0, :cond_7

    .line 150
    iget-object v0, p1, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    iget-object v1, p1, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    sget-object v2, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    const/4 v3, 0x1

    if-eq v0, v2, :cond_0

    .line 151
    iput-boolean v3, p0, Ll/۬ܳ֡;->ۤ:Z

    .line 135
    :cond_0
    iget v2, p1, Ll/᩹ܳ֡;->ܽ:I

    const v4, -0x40000001    # -1.9999999f

    and-int/2addr v2, v4

    if-lez v2, :cond_1

    .line 154
    iput-boolean v3, p0, Ll/۬ܳ֡;->۬:Z

    .line 156
    :cond_1
    iget-object v2, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    iget-object v3, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    if-eqz v2, :cond_5

    .line 216
    iget v2, v1, Ll/᩺ܳ֡;->ܿ:I

    iget v4, p1, Ll/᩹ܳ֡;->֫:I

    invoke-direct {p0, v2, v4, v0}, Ll/۬ܳ֡;->֫(IILl/ۚۜ֡;)I

    move-result v2

    .line 217
    iget-object v5, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    aget-object v5, v5, v2

    if-eqz v5, :cond_2

    goto :goto_1

    .line 220
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget-object v6, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    array-length v7, v6

    div-int/lit8 v7, v7, 0x2

    if-lt v5, v7, :cond_4

    .line 221
    array-length v2, v6

    mul-int/lit8 v2, v2, 0x2

    new-array v2, v2, [Ll/᩹ܳ֡;

    iput-object v2, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    const/4 v2, 0x0

    .line 222
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v2, v5, :cond_3

    .line 223
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ܳ֡;

    .line 224
    iget-object v6, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    iget-object v7, v5, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v7, v7, Ll/᩺ܳ֡;->ܿ:I

    iget v8, v5, Ll/᩹ܳ֡;->֫:I

    iget-object v9, v5, Ll/᩹ܳ֡;->ᩳ:Ll/ۚۜ֡;

    invoke-direct {p0, v7, v8, v9}, Ll/۬ܳ֡;->֫(IILl/ۚۜ֡;)I

    move-result v7

    aput-object v5, v6, v7

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 226
    :cond_3
    iget v1, v1, Ll/᩺ܳ֡;->ܿ:I

    invoke-direct {p0, v1, v4, v0}, Ll/۬ܳ֡;->֫(IILl/ۚۜ֡;)I

    move-result v2

    .line 228
    :cond_4
    iget-object v0, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    aput-object p1, v0, v2

    move-object v5, p1

    goto :goto_1

    .line 156
    :cond_5
    iget-object v0, p0, Ll/۬ܳ֡;->᩶:Ll/᩶ܳ֡;

    invoke-virtual {v0, p1}, Ll/֫᩷֡;->ᩳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ll/᩹ܳ֡;

    :goto_1
    if-ne v5, p1, :cond_6

    const/4 p2, -0x1

    .line 158
    iput p2, p0, Ll/۬ܳ֡;->᩸:I

    .line 159
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 162
    :cond_6
    iget-object v0, p1, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget p1, p1, Ll/᩹ܳ֡;->ܽ:I

    invoke-direct {p0, v5, v0, p1, p2}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ܽۜ֡;ILl/ۧ᩷֡;)V

    return-void

    .line 149
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This set is readonly"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;Ll/ۧ᩷֡;)V
    .locals 3

    .line 170
    iget-boolean v0, p0, Ll/۬ܳ֡;->ۛ:Z

    if-nez v0, :cond_3

    .line 171
    iget-object v0, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    if-eqz v0, :cond_2

    .line 172
    iget v1, p2, Ll/᩺ܳ֡;->ܿ:I

    iget v2, p1, Ll/᩹ܳ֡;->֫:I

    invoke-direct {p0, v1, v2, p4}, Ll/۬ܳ֡;->֫(IILl/ۚۜ֡;)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    .line 174
    sget-object p2, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    const/4 v1, 0x1

    if-eq p4, p2, :cond_0

    iput-boolean v1, p0, Ll/۬ܳ֡;->ۤ:Z

    .line 135
    :cond_0
    iget p1, p1, Ll/᩹ܳ֡;->ܽ:I

    const p2, -0x40000001    # -1.9999999f

    and-int/2addr p2, p1

    if-lez p2, :cond_1

    .line 175
    iput-boolean v1, p0, Ll/۬ܳ֡;->۬:Z

    .line 176
    :cond_1
    invoke-direct {p0, v0, p3, p1, p5}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ܽۜ֡;ILl/ۧ᩷֡;)V

    return-void

    .line 180
    :cond_2
    new-instance v0, Ll/᩹ܳ֡;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    invoke-virtual {p0, v0, p5}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    return-void

    .line 170
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This set is readonly"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Ljava/util/BitSet;
    .locals 3

    .line 253
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 254
    iget-object v1, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܳ֡;

    .line 255
    iget v2, v2, Ll/᩹ܳ֡;->֫:I

    invoke-virtual {v0, v2}, Ljava/util/BitSet;->set(I)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x1

    .line 376
    iput-boolean v0, p0, Ll/۬ܳ֡;->ۛ:Z

    const/4 v0, 0x0

    .line 377
    iput-object v0, p0, Ll/۬ܳ֡;->᩶:Ll/᩶ܳ֡;

    .line 378
    iput-object v0, p0, Ll/۬ܳ֡;->᩹:[Ll/᩹ܳ֡;

    return-void
.end method
