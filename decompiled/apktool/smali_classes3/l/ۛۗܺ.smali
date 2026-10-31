.class public abstract Ll/ۛۗܺ;
.super Ll/ۨۗܺ;
.source "C5UX"


# instance fields
.field public ֫:[Ljava/lang/Object;

.field public ۧ:Z

.field public ܽ:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 501
    invoke-direct {p0}, Ll/ۨۗܺ;-><init>()V

    const-string v0, "initialCapacity"

    .line 502
    invoke-static {p1, v0}, Ll/᩹ۙܺ;->֫(ILjava/lang/String;)V

    .line 503
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    const/4 p1, 0x0

    .line 504
    iput p1, p0, Ll/ۛۗܺ;->ܽ:I

    return-void
.end method

.method private ֫(I)V
    .locals 3

    .line 513
    iget-object v0, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    .line 514
    array-length v1, v0

    iget v2, p0, Ll/ۛۗܺ;->ܽ:I

    add-int/2addr v2, p1

    invoke-static {v1, v2}, Ll/ۨۗܺ;->֫(II)I

    move-result p1

    .line 516
    array-length v0, v0

    if-gt p1, v0, :cond_1

    iget-boolean v0, p0, Ll/ۛۗܺ;->ۧ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 517
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    const/4 p1, 0x0

    .line 518
    iput-boolean p1, p0, Ll/ۛۗܺ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Iterable;)Ll/ۨۗܺ;
    .locals 2

    .line 556
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    .line 557
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    .line 558
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {p0, v1}, Ll/ۛۗܺ;->֫(I)V

    .line 559
    instance-of v1, v0, Ll/᩺ۗܺ;

    if-eqz v1, :cond_0

    .line 560
    check-cast v0, Ll/᩺ۗܺ;

    .line 561
    iget-object p1, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    iget v1, p0, Ll/ۛۗܺ;->ܽ:I

    invoke-virtual {v0, v1, p1}, Ll/᩺ۗܺ;->֫(I[Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Ll/ۛۗܺ;->ܽ:I

    return-object p0

    .line 461
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 462
    invoke-virtual {p0, v0}, Ll/ۨۗܺ;->֫(Ljava/lang/Object;)Ll/ۨۗܺ;

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public final ֫(I[Ljava/lang/Object;)V
    .locals 3

    .line 539
    invoke-static {p1, p2}, Ll/۫ۤܺ;->֫(I[Ljava/lang/Object;)V

    .line 540
    invoke-direct {p0, p1}, Ll/ۛۗܺ;->֫(I)V

    .line 549
    iget-object v0, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    iget v1, p0, Ll/ۛۗܺ;->ܽ:I

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 550
    iget p2, p0, Ll/ۛۗܺ;->ܽ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ۛۗܺ;->ܽ:I

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 3

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 526
    invoke-direct {p0, v0}, Ll/ۛۗܺ;->֫(I)V

    .line 527
    iget-object v0, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    iget v1, p0, Ll/ۛۗܺ;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۛۗܺ;->ܽ:I

    aput-object p1, v0, v1

    return-void
.end method

.method public ֫(Ljava/util/List;)V
    .locals 0

    .line 817
    invoke-virtual {p0, p1}, Ll/ۛۗܺ;->֫(Ljava/lang/Iterable;)Ll/ۨۗܺ;

    return-void
.end method

.method public ۧ(Ljava/lang/Object;)V
    .locals 0

    .line 789
    invoke-virtual {p0, p1}, Ll/ۛۗܺ;->֫(Ljava/lang/Object;)V

    return-void
.end method
