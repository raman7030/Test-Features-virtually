.class public final Ll/ۨܰۘ;
.super Ll/ܽܰۘ;
.source "YCK3"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public transient ۗ:[C

.field public ۙ:I

.field public transient ۬:Ll/ۛ֫ᩴ;

.field public transient ᩶:Ll/ۨۧᩴ;

.field public transient ᩸:Ll/ᩳ۟ۘ;

.field public transient ᩹:[C


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    sget-object v0, Ll/۬֫ᩴ;->ۧ:[C

    iput-object v0, p0, Ll/ۨܰۘ;->᩹:[C

    .line 71
    iput-object v0, p0, Ll/ۨܰۘ;->ۗ:[C

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    new-array v0, p1, [C

    iput-object v0, p0, Ll/ۨܰۘ;->᩹:[C

    .line 81
    new-array p1, p1, [C

    iput-object p1, p0, Ll/ۨܰۘ;->ۗ:[C

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4

    .line 777
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 778
    iget v0, p0, Ll/ۨܰۘ;->ۙ:I

    new-array v1, v0, [C

    iput-object v1, p0, Ll/ۨܰۘ;->᩹:[C

    .line 779
    new-array v0, v0, [C

    iput-object v0, p0, Ll/ۨܰۘ;->ۗ:[C

    const/4 v2, 0x0

    .line 780
    :goto_0
    iget v3, p0, Ll/ۨܰۘ;->ۙ:I

    if-ge v2, v3, :cond_0

    .line 781
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readChar()C

    move-result v3

    aput-char v3, v1, v2

    .line 782
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readChar()C

    move-result v3

    aput-char v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 5

    .line 767
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 768
    iget-object v0, p0, Ll/ۨܰۘ;->᩹:[C

    .line 769
    iget-object v1, p0, Ll/ۨܰۘ;->ۗ:[C

    .line 770
    iget v2, p0, Ll/ۨܰۘ;->ۙ:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 771
    aget-char v4, v0, v3

    invoke-virtual {p1, v4}, Ljava/io/ObjectOutputStream;->writeChar(I)V

    .line 772
    aget-char v4, v1, v3

    invoke-virtual {p1, v4}, Ljava/io/ObjectOutputStream;->writeChar(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۨܰۘ;C)I
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Ll/ۨܰۘ;->ܽ(C)I

    move-result p0

    return p0
.end method

.method private ܽ(C)I
    .locals 3

    .line 433
    iget-object v0, p0, Ll/ۨܰۘ;->᩹:[C

    .line 434
    iget v1, p0, Ll/ۨܰۘ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-char v1, v0, v2

    if-ne v1, p1, :cond_0

    return v2

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method


# virtual methods
.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 453
    iput v0, p0, Ll/ۨܰۘ;->ۙ:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 754
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨܰۘ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 758
    iget-object v1, p0, Ll/ۨܰۘ;->᩹:[C

    invoke-virtual {v1}, [C->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [C

    iput-object v1, v0, Ll/ۨܰۘ;->᩹:[C

    .line 759
    iget-object v1, p0, Ll/ۨܰۘ;->ۗ:[C

    invoke-virtual {v1}, [C->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [C

    iput-object v1, v0, Ll/ۨܰۘ;->ۗ:[C

    const/4 v1, 0x0

    .line 760
    iput-object v1, v0, Ll/ۨܰۘ;->᩸:Ll/ᩳ۟ۘ;

    .line 761
    iput-object v1, v0, Ll/ۨܰۘ;->᩶:Ll/ۨۧᩴ;

    .line 762
    iput-object v1, v0, Ll/ۨܰۘ;->۬:Ll/ۛ֫ᩴ;

    return-object v0

    .line 756
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 470
    iget v0, p0, Ll/ۨܰۘ;->ۙ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 627
    iget-object v0, p0, Ll/ۨܰۘ;->᩶:Ll/ۨۧᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۗܰۘ;

    invoke-direct {v0, p0}, Ll/ۗܰۘ;-><init>(Ll/ۨܰۘ;)V

    iput-object v0, p0, Ll/ۨܰۘ;->᩶:Ll/ۨۧᩴ;

    .line 628
    :cond_0
    iget-object v0, p0, Ll/ۨܰۘ;->᩶:Ll/ۨۧᩴ;

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 448
    iget v0, p0, Ll/ۨܰۘ;->ۙ:I

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 736
    iget-object v0, p0, Ll/ۨܰۘ;->۬:Ll/ۛ֫ᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۛܰۘ;

    invoke-direct {v0, p0}, Ll/ۛܰۘ;-><init>(Ll/ۨܰۘ;)V

    iput-object v0, p0, Ll/ۨܰۘ;->۬:Ll/ۛ֫ᩴ;

    .line 737
    :cond_0
    iget-object v0, p0, Ll/ۨܰۘ;->۬:Ll/ۛ֫ᩴ;

    return-object v0
.end method

.method public final ֫(CC)C
    .locals 4

    .line 476
    invoke-direct {p0, p1}, Ll/ۨܰۘ;->ܽ(C)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 478
    iget-object p1, p0, Ll/ۨܰۘ;->ۗ:[C

    aget-char v1, p1, v0

    .line 479
    aput-char p2, p1, v0

    return v1

    .line 482
    :cond_0
    iget v0, p0, Ll/ۨܰۘ;->ۙ:I

    iget-object v1, p0, Ll/ۨܰۘ;->᩹:[C

    array-length v1, v1

    if-ne v0, v1, :cond_4

    const/4 v1, 0x2

    if-nez v0, :cond_1

    const/4 v2, 0x2

    goto :goto_0

    :cond_1
    mul-int/lit8 v2, v0, 0x2

    .line 483
    :goto_0
    new-array v2, v2, [C

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    mul-int/lit8 v1, v0, 0x2

    .line 484
    :goto_1
    new-array v1, v1, [C

    :goto_2
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_3

    .line 486
    iget-object v0, p0, Ll/ۨܰۘ;->᩹:[C

    aget-char v0, v0, v3

    aput-char v0, v2, v3

    .line 487
    iget-object v0, p0, Ll/ۨܰۘ;->ۗ:[C

    aget-char v0, v0, v3

    aput-char v0, v1, v3

    move v0, v3

    goto :goto_2

    .line 489
    :cond_3
    iput-object v2, p0, Ll/ۨܰۘ;->᩹:[C

    .line 490
    iput-object v1, p0, Ll/ۨܰۘ;->ۗ:[C

    .line 492
    :cond_4
    iget-object v0, p0, Ll/ۨܰۘ;->᩹:[C

    iget v1, p0, Ll/ۨܰۘ;->ۙ:I

    aput-char p1, v0, v1

    .line 493
    iget-object p1, p0, Ll/ۨܰۘ;->ۗ:[C

    aput-char p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    .line 494
    iput v1, p0, Ll/ۨܰۘ;->ۙ:I

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(C)Z
    .locals 1

    .line 458
    invoke-direct {p0, p1}, Ll/ۨܰۘ;->ܽ(C)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(C)C
    .locals 3

    .line 441
    iget-object v0, p0, Ll/ۨܰۘ;->᩹:[C

    .line 442
    iget v1, p0, Ll/ۨܰۘ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-char v1, v0, v2

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Ll/ۨܰۘ;->ۗ:[C

    aget-char p1, p1, v2

    return p1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۨ֫()Ll/ᩴۚᩴ;
    .locals 1

    .line 428
    iget-object v0, p0, Ll/ۨܰۘ;->᩸:Ll/ᩳ۟ۘ;

    if-nez v0, :cond_0

    new-instance v0, Ll/᩹ܰۘ;

    invoke-direct {v0, p0}, Ll/᩹ܰۘ;-><init>(Ll/ۨܰۘ;)V

    iput-object v0, p0, Ll/ۨܰۘ;->᩸:Ll/ᩳ۟ۘ;

    .line 429
    :cond_0
    iget-object v0, p0, Ll/ۨܰۘ;->᩸:Ll/ᩳ۟ۘ;

    return-object v0
.end method

.method public final ܿ(C)C
    .locals 4

    .line 501
    invoke-direct {p0, p1}, Ll/ۨܰۘ;->ܽ(C)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 503
    :cond_0
    iget-object v0, p0, Ll/ۨܰۘ;->ۗ:[C

    aget-char v0, v0, p1

    .line 504
    iget v1, p0, Ll/ۨܰۘ;->ۙ:I

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    .line 505
    iget-object v2, p0, Ll/ۨܰۘ;->᩹:[C

    add-int/lit8 v3, p1, 0x1

    invoke-static {v2, v3, v2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 506
    iget-object v2, p0, Ll/ۨܰۘ;->ۗ:[C

    invoke-static {v2, v3, v2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 507
    iget p1, p0, Ll/ۨܰۘ;->ۙ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۨܰۘ;->ۙ:I

    return v0
.end method
