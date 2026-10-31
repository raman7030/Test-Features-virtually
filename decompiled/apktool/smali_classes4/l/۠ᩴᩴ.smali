.class public final Ll/۠ᩴᩴ;
.super Ll/۫ۘᩴ;
.source "W1E0"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public transient ۗ:[I

.field public ۙ:I

.field public transient ۬:Ll/֨ۢᩴ;

.field public transient ᩶:Ll/ᩴۚᩴ;

.field public transient ᩸:Ll/۬ᩴᩴ;

.field public transient ᩹:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    sget-object v0, Ll/۠֡ᩴ;->ۧ:[Ljava/lang/Object;

    iput-object v0, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    .line 70
    sget-object v0, Ll/᩵ۢᩴ;->ۧ:[I

    iput-object v0, p0, Ll/۠ᩴᩴ;->ۗ:[I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4

    .line 774
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 775
    iget v0, p0, Ll/۠ᩴᩴ;->ۙ:I

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    .line 776
    new-array v0, v0, [I

    iput-object v0, p0, Ll/۠ᩴᩴ;->ۗ:[I

    const/4 v2, 0x0

    .line 777
    :goto_0
    iget v3, p0, Ll/۠ᩴᩴ;->ۙ:I

    if-ge v2, v3, :cond_0

    .line 778
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    .line 779
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v3

    aput v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 5

    .line 764
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 765
    iget-object v0, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    .line 766
    iget-object v1, p0, Ll/۠ᩴᩴ;->ۗ:[I

    .line 767
    iget v2, p0, Ll/۠ᩴᩴ;->ۙ:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 768
    aget-object v4, v0, v3

    invoke-virtual {p1, v4}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 769
    aget v4, v1, v3

    invoke-virtual {p1, v4}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/۠ᩴᩴ;Ljava/lang/Object;)I
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Ll/۠ᩴᩴ;->ܽ(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private ܽ(Ljava/lang/Object;)I
    .locals 3

    .line 422
    iget-object v0, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    .line 423
    iget v1, p0, Ll/۠ᩴᩴ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-object v1, v0, v2

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

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
    .locals 3

    .line 442
    iget-object v0, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    .line 443
    iget v1, p0, Ll/۠ᩴᩴ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 444
    aput-object v1, v0, v2

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 446
    iput v0, p0, Ll/۠ᩴᩴ;->ۙ:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 751
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ᩴᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 755
    iget-object v1, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    .line 756
    iget-object v1, p0, Ll/۠ᩴᩴ;->ۗ:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Ll/۠ᩴᩴ;->ۗ:[I

    const/4 v1, 0x0

    .line 757
    iput-object v1, v0, Ll/۠ᩴᩴ;->᩸:Ll/۬ᩴᩴ;

    .line 758
    iput-object v1, v0, Ll/۠ᩴᩴ;->᩶:Ll/ᩴۚᩴ;

    .line 759
    iput-object v1, v0, Ll/۠ᩴᩴ;->۬:Ll/֨ۢᩴ;

    return-object v0

    .line 753
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 451
    invoke-direct {p0, p1}, Ll/۠ᩴᩴ;->ܽ(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 463
    iget v0, p0, Ll/۠ᩴᩴ;->ۙ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 623
    iget-object v0, p0, Ll/۠ᩴᩴ;->᩶:Ll/ᩴۚᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ᩴᩴᩴ;

    invoke-direct {v0, p0}, Ll/ᩴᩴᩴ;-><init>(Ll/۠ᩴᩴ;)V

    iput-object v0, p0, Ll/۠ᩴᩴ;->᩶:Ll/ᩴۚᩴ;

    .line 624
    :cond_0
    iget-object v0, p0, Ll/۠ᩴᩴ;->᩶:Ll/ᩴۚᩴ;

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 437
    iget v0, p0, Ll/۠ᩴᩴ;->ۙ:I

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 733
    iget-object v0, p0, Ll/۠ᩴᩴ;->۬:Ll/֨ۢᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/֨ᩴᩴ;

    invoke-direct {v0, p0}, Ll/֨ᩴᩴ;-><init>(Ll/۠ᩴᩴ;)V

    iput-object v0, p0, Ll/۠ᩴᩴ;->۬:Ll/֨ۢᩴ;

    .line 734
    :cond_0
    iget-object v0, p0, Ll/۠ᩴᩴ;->۬:Ll/֨ۢᩴ;

    return-object v0
.end method

.method public final ֫(ILjava/lang/Object;)I
    .locals 4

    .line 469
    invoke-direct {p0, p2}, Ll/۠ᩴᩴ;->ܽ(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 471
    iget-object p2, p0, Ll/۠ᩴᩴ;->ۗ:[I

    aget v1, p2, v0

    .line 472
    aput p1, p2, v0

    return v1

    .line 475
    :cond_0
    iget v0, p0, Ll/۠ᩴᩴ;->ۙ:I

    iget-object v1, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    array-length v1, v1

    if-ne v0, v1, :cond_4

    const/4 v1, 0x2

    if-nez v0, :cond_1

    const/4 v2, 0x2

    goto :goto_0

    :cond_1
    mul-int/lit8 v2, v0, 0x2

    .line 476
    :goto_0
    new-array v2, v2, [Ljava/lang/Object;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    mul-int/lit8 v1, v0, 0x2

    .line 477
    :goto_1
    new-array v1, v1, [I

    :goto_2
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_3

    .line 479
    iget-object v0, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    aget-object v0, v0, v3

    aput-object v0, v2, v3

    .line 480
    iget-object v0, p0, Ll/۠ᩴᩴ;->ۗ:[I

    aget v0, v0, v3

    aput v0, v1, v3

    move v0, v3

    goto :goto_2

    .line 482
    :cond_3
    iput-object v2, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    .line 483
    iput-object v1, p0, Ll/۠ᩴᩴ;->ۗ:[I

    .line 485
    :cond_4
    iget-object v0, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    iget v1, p0, Ll/۠ᩴᩴ;->ۙ:I

    aput-object p2, v0, v1

    .line 486
    iget-object p2, p0, Ll/۠ᩴᩴ;->ۗ:[I

    aput p1, p2, v1

    add-int/lit8 v1, v1, 0x1

    .line 487
    iput v1, p0, Ll/۠ᩴᩴ;->ۙ:I

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ljava/lang/Object;)I
    .locals 4

    .line 494
    invoke-direct {p0, p1}, Ll/۠ᩴᩴ;->ܽ(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 496
    :cond_0
    iget-object v0, p0, Ll/۠ᩴᩴ;->ۗ:[I

    aget v0, v0, p1

    .line 497
    iget v1, p0, Ll/۠ᩴᩴ;->ۙ:I

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    .line 498
    iget-object v2, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    add-int/lit8 v3, p1, 0x1

    invoke-static {v2, v3, v2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 499
    iget-object v2, p0, Ll/۠ᩴᩴ;->ۗ:[I

    invoke-static {v2, v3, v2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 500
    iget p1, p0, Ll/۠ᩴᩴ;->ۙ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/۠ᩴᩴ;->ۙ:I

    .line 501
    iget-object v1, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v2, v1, p1

    return v0
.end method

.method public final ֫֫()Ll/ᩴۚᩴ;
    .locals 1

    .line 417
    iget-object v0, p0, Ll/۠ᩴᩴ;->᩸:Ll/۬ᩴᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ܺᩴᩴ;

    invoke-direct {v0, p0}, Ll/ܺᩴᩴ;-><init>(Ll/۠ᩴᩴ;)V

    iput-object v0, p0, Ll/۠ᩴᩴ;->᩸:Ll/۬ᩴᩴ;

    .line 418
    :cond_0
    iget-object v0, p0, Ll/۠ᩴᩴ;->᩸:Ll/۬ᩴᩴ;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 3

    .line 430
    iget-object v0, p0, Ll/۠ᩴᩴ;->᩹:[Ljava/lang/Object;

    .line 431
    iget v1, p0, Ll/۠ᩴᩴ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-object v1, v0, v2

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Ll/۠ᩴᩴ;->ۗ:[I

    aget p1, p1, v2

    return p1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ(I)Z
    .locals 3

    .line 456
    iget-object v0, p0, Ll/۠ᩴᩴ;->ۗ:[I

    .line 457
    iget v1, p0, Ll/۠ᩴᩴ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget v1, v0, v2

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
