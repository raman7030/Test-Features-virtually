.class public Ll/۫۬ܺ;
.super Ll/ۛۗܺ;
.source "5608"


# instance fields
.field public ܿ:[Ljava/lang/Object;

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 469
    invoke-direct {p0, v0}, Ll/ۛۗܺ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public ֫()Ll/ۛ۬ܺ;
    .locals 9

    .line 601
    iget v0, p0, Ll/ۛۗܺ;->ܽ:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 612
    iget-object v2, p0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    if-eqz v2, :cond_1

    invoke-static {v0}, Ll/ۛ۬ܺ;->֫(I)I

    move-result v0

    iget-object v2, p0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    array-length v2, v2

    if-ne v0, v2, :cond_1

    .line 614
    iget v0, p0, Ll/ۛۗܺ;->ܽ:I

    iget-object v2, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    array-length v3, v2

    shr-int/lit8 v4, v3, 0x1

    shr-int/lit8 v3, v3, 0x2

    add-int/2addr v4, v3

    if-ge v0, v4, :cond_0

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    :cond_0
    move-object v7, v2

    .line 615
    new-instance v0, Ll/᩷ۛܺ;

    iget v4, p0, Ll/۫۬ܺ;->ᩳ:I

    iget-object v8, p0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    array-length v2, v8

    add-int/lit8 v5, v2, -0x1

    iget v6, p0, Ll/ۛۗܺ;->ܽ:I

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Ll/᩷ۛܺ;-><init>(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_0

    .line 619
    :cond_1
    iget v0, p0, Ll/ۛۗܺ;->ܽ:I

    iget-object v2, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    invoke-static {v0, v2}, Ll/ۛ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object v0

    .line 622
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    iput v2, p0, Ll/ۛۗܺ;->ܽ:I

    .line 624
    :goto_0
    iput-boolean v1, p0, Ll/ۛۗܺ;->ۧ:Z

    const/4 v1, 0x0

    .line 625
    iput-object v1, p0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    return-object v0

    .line 609
    :cond_2
    iget-object v0, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget v1, Ll/ۛ۬ܺ;->᩶:I

    .line 88
    new-instance v1, Ll/᩸ۛܺ;

    invoke-direct {v1, v0}, Ll/᩸ۛܺ;-><init>(Ljava/lang/Object;)V

    return-object v1

    .line 603
    :cond_3
    sget v0, Ll/ۛ۬ܺ;->᩶:I

    .line 79
    sget-object v0, Ll/᩷ۛܺ;->ۛ:Ll/᩷ۛܺ;

    return-object v0
.end method

.method public bridge synthetic ֫(Ljava/lang/Object;)Ll/ۨۗܺ;
    .locals 0

    .line 460
    invoke-virtual {p0, p1}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ljava/lang/Iterable;)Ll/۫۬ܺ;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    iget-object v0, p0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 554
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 555
    invoke-virtual {p0, v0}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    goto :goto_0

    :cond_0
    return-object p0

    .line 558
    :cond_1
    invoke-virtual {p0, p1}, Ll/ۛۗܺ;->֫(Ljava/lang/Iterable;)Ll/ۨۗܺ;

    return-object p0
.end method

.method public ֫(Ljava/lang/Object;)Ll/۫۬ܺ;
    .locals 5

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    iget-object v0, p0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget v0, p0, Ll/ۛۗܺ;->ܽ:I

    invoke-static {v0}, Ll/ۛ۬ܺ;->֫(I)I

    move-result v0

    iget-object v1, p0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    array-length v2, v1

    if-gt v0, v2, :cond_2

    .line 525
    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    .line 526
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    .line 527
    invoke-static {v1}, Ll/ۗۗܺ;->֫(I)I

    move-result v2

    :goto_0
    and-int/2addr v2, v0

    .line 529
    iget-object v3, p0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    aget-object v4, v3, v2

    if-nez v4, :cond_0

    .line 531
    aput-object p1, v3, v2

    .line 532
    iget v0, p0, Ll/۫۬ܺ;->ᩳ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/۫۬ܺ;->ᩳ:I

    .line 533
    invoke-virtual {p0, p1}, Ll/ۛۗܺ;->֫(Ljava/lang/Object;)V

    return-object p0

    .line 535
    :cond_0
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 496
    iput-object v0, p0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    .line 497
    invoke-virtual {p0, p1}, Ll/ۛۗܺ;->֫(Ljava/lang/Object;)V

    return-object p0
.end method

.method public ֫(Ll/۫۬ܺ;)Ll/۫۬ܺ;
    .locals 2

    .line 584
    iget-object v0, p0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 585
    :goto_0
    iget v1, p1, Ll/ۛۗܺ;->ܽ:I

    if-ge v0, v1, :cond_0

    .line 587
    iget-object v1, p1, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v1}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0

    .line 590
    :cond_1
    iget-object v0, p1, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    iget p1, p1, Ll/ۛۗܺ;->ܽ:I

    invoke-virtual {p0, p1, v0}, Ll/ۛۗܺ;->֫(I[Ljava/lang/Object;)V

    return-object p0
.end method

.method public varargs ֫([Ljava/lang/Object;)Ll/۫۬ܺ;
    .locals 3

    .line 513
    iget-object v0, p0, Ll/۫۬ܺ;->ܿ:[Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 514
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 515
    invoke-virtual {p0, v2}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0

    .line 534
    :cond_1
    array-length v0, p1

    invoke-virtual {p0, v0, p1}, Ll/ۛۗܺ;->֫(I[Ljava/lang/Object;)V

    return-object p0
.end method
