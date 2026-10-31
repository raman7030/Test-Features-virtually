.class public Ll/᩸᩵ᩴ;
.super Ll/ۛۘᩴ;
.source "S24"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public transient ۗ:[Ljava/lang/Object;

.field public ۙ:I

.field public transient ۬:Ll/᩶֡ᩴ;

.field public transient ᩶:Ll/ᩴۚᩴ;

.field public transient ᩸:Ll/۬᩵ᩴ;

.field public transient ᩹:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    sget-object v0, Ll/۠֡ᩴ;->ۧ:[Ljava/lang/Object;

    iput-object v0, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    .line 67
    iput-object v0, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4

    .line 756
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 757
    iget v0, p0, Ll/᩸᩵ᩴ;->ۙ:I

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    .line 758
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    const/4 v2, 0x0

    .line 759
    :goto_0
    iget v3, p0, Ll/᩸᩵ᩴ;->ۙ:I

    if-ge v2, v3, :cond_0

    .line 760
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    .line 761
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 5

    .line 746
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 747
    iget-object v0, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    .line 748
    iget-object v1, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    .line 749
    iget v2, p0, Ll/᩸᩵ᩴ;->ۙ:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 750
    aget-object v4, v0, v3

    invoke-virtual {p1, v4}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 751
    aget-object v4, v1, v3

    invoke-virtual {p1, v4}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩸᩵ᩴ;Ljava/lang/Object;)I
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Ll/᩸᩵ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private ܽ(Ljava/lang/Object;)I
    .locals 3

    .line 398
    iget-object v0, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    .line 399
    iget v1, p0, Ll/᩸᩵ᩴ;->ۙ:I

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
    .locals 4

    .line 418
    iget-object v0, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    .line 419
    iget-object v1, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    .line 420
    iget v2, p0, Ll/᩸᩵ᩴ;->ۙ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 421
    aput-object v2, v0, v3

    .line 422
    aput-object v2, v1, v3

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 424
    iput v0, p0, Ll/᩸᩵ᩴ;->ۙ:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 733
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸᩵ᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 737
    iget-object v1, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    .line 738
    iget-object v1, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 739
    iput-object v1, v0, Ll/᩸᩵ᩴ;->᩸:Ll/۬᩵ᩴ;

    .line 740
    iput-object v1, v0, Ll/᩸᩵ᩴ;->᩶:Ll/ᩴۚᩴ;

    .line 741
    iput-object v1, v0, Ll/᩸᩵ᩴ;->۬:Ll/᩶֡ᩴ;

    return-object v0

    .line 735
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 429
    invoke-direct {p0, p1}, Ll/᩸᩵ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 3

    .line 434
    iget-object v0, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    .line 435
    iget v1, p0, Ll/᩸᩵ᩴ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-object v1, v0, v2

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 406
    iget-object v0, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    .line 407
    iget v1, p0, Ll/᩸᩵ᩴ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-object v1, v0, v2

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    aget-object p1, p1, v2

    return-object p1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 441
    iget v0, p0, Ll/᩸᩵ᩴ;->ۙ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 604
    iget-object v0, p0, Ll/᩸᩵ᩴ;->᩶:Ll/ᩴۚᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/֡᩵ᩴ;

    invoke-direct {v0, p0}, Ll/֡᩵ᩴ;-><init>(Ll/᩸᩵ᩴ;)V

    iput-object v0, p0, Ll/᩸᩵ᩴ;->᩶:Ll/ᩴۚᩴ;

    .line 605
    :cond_0
    iget-object v0, p0, Ll/᩸᩵ᩴ;->᩶:Ll/ᩴۚᩴ;

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 447
    invoke-direct {p0, p1}, Ll/᩸᩵ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 449
    iget-object p1, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    aget-object v1, p1, v0

    .line 450
    aput-object p2, p1, v0

    return-object v1

    .line 453
    :cond_0
    iget v0, p0, Ll/᩸᩵ᩴ;->ۙ:I

    iget-object v1, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    array-length v1, v1

    if-ne v0, v1, :cond_4

    const/4 v1, 0x2

    if-nez v0, :cond_1

    const/4 v2, 0x2

    goto :goto_0

    :cond_1
    mul-int/lit8 v2, v0, 0x2

    .line 454
    :goto_0
    new-array v2, v2, [Ljava/lang/Object;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    mul-int/lit8 v1, v0, 0x2

    .line 455
    :goto_1
    new-array v1, v1, [Ljava/lang/Object;

    :goto_2
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_3

    .line 457
    iget-object v0, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    aget-object v0, v0, v3

    aput-object v0, v2, v3

    .line 458
    iget-object v0, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    aget-object v0, v0, v3

    aput-object v0, v1, v3

    move v0, v3

    goto :goto_2

    .line 460
    :cond_3
    iput-object v2, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    .line 461
    iput-object v1, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    .line 463
    :cond_4
    iget-object v0, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    iget v1, p0, Ll/᩸᩵ᩴ;->ۙ:I

    aput-object p1, v0, v1

    .line 464
    iget-object p1, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    aput-object p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    .line 465
    iput v1, p0, Ll/᩸᩵ᩴ;->ۙ:I

    const/4 p1, 0x0

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 472
    invoke-direct {p0, p1}, Ll/᩸᩵ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    return-object v1

    .line 474
    :cond_0
    iget-object v0, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    aget-object v0, v0, p1

    .line 475
    iget v2, p0, Ll/᩸᩵ᩴ;->ۙ:I

    sub-int/2addr v2, p1

    add-int/lit8 v2, v2, -0x1

    .line 476
    iget-object v3, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    add-int/lit8 v4, p1, 0x1

    invoke-static {v3, v4, v3, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 477
    iget-object v3, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    invoke-static {v3, v4, v3, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 478
    iget p1, p0, Ll/᩸᩵ᩴ;->ۙ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/᩸᩵ᩴ;->ۙ:I

    .line 479
    iget-object v2, p0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    aput-object v1, v2, p1

    .line 480
    iget-object v2, p0, Ll/᩸᩵ᩴ;->ۗ:[Ljava/lang/Object;

    aput-object v1, v2, p1

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 413
    iget v0, p0, Ll/᩸᩵ᩴ;->ۙ:I

    return v0
.end method

.method public final bridge synthetic values()Ljava/util/Collection;
    .locals 1

    .line 30
    invoke-virtual {p0}, Ll/᩸᩵ᩴ;->values()Ll/᩶֡ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final values()Ll/᩶֡ᩴ;
    .locals 1

    .line 715
    iget-object v0, p0, Ll/᩸᩵ᩴ;->۬:Ll/᩶֡ᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ܶ᩵ᩴ;

    invoke-direct {v0, p0}, Ll/ܶ᩵ᩴ;-><init>(Ll/᩸᩵ᩴ;)V

    iput-object v0, p0, Ll/᩸᩵ᩴ;->۬:Ll/᩶֡ᩴ;

    .line 716
    :cond_0
    iget-object v0, p0, Ll/᩸᩵ᩴ;->۬:Ll/᩶֡ᩴ;

    return-object v0
.end method

.method public final ۢۧ()Ll/ᩴۚᩴ;
    .locals 1

    .line 393
    iget-object v0, p0, Ll/᩸᩵ᩴ;->᩸:Ll/۬᩵ᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۘ᩵ᩴ;

    invoke-direct {v0, p0}, Ll/ۘ᩵ᩴ;-><init>(Ll/᩸᩵ᩴ;)V

    iput-object v0, p0, Ll/᩸᩵ᩴ;->᩸:Ll/۬᩵ᩴ;

    .line 394
    :cond_0
    iget-object v0, p0, Ll/᩸᩵ᩴ;->᩸:Ll/۬᩵ᩴ;

    return-object v0
.end method
