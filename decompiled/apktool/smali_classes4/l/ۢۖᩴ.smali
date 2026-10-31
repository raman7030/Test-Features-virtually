.class public final Ll/ۢۖᩴ;
.super Ll/᩸ܺᩴ;
.source "GQL"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public transient ۗ:[Ljava/lang/Object;

.field public ۙ:I

.field public transient ۬:Ll/᩶֡ᩴ;

.field public transient ᩶:Ll/ᩴۘᩴ;

.field public transient ᩸:Ll/᩵ۖᩴ;

.field public transient ᩹:[J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    sget-object v0, Ll/ۤۖᩴ;->ۧ:[J

    iput-object v0, p0, Ll/ۢۖᩴ;->᩹:[J

    .line 74
    sget-object v0, Ll/۠֡ᩴ;->ۧ:[Ljava/lang/Object;

    iput-object v0, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 5

    .line 767
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 768
    iget v0, p0, Ll/ۢۖᩴ;->ۙ:I

    new-array v1, v0, [J

    iput-object v1, p0, Ll/ۢۖᩴ;->᩹:[J

    .line 769
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    const/4 v2, 0x0

    .line 770
    :goto_0
    iget v3, p0, Ll/ۢۖᩴ;->ۙ:I

    if-ge v2, v3, :cond_0

    .line 771
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readLong()J

    move-result-wide v3

    aput-wide v3, v1, v2

    .line 772
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 6

    .line 757
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 758
    iget-object v0, p0, Ll/ۢۖᩴ;->᩹:[J

    .line 759
    iget-object v1, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    .line 760
    iget v2, p0, Ll/ۢۖᩴ;->ۙ:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 761
    aget-wide v4, v0, v3

    invoke-virtual {p1, v4, v5}, Ljava/io/ObjectOutputStream;->writeLong(J)V

    .line 762
    aget-object v4, v1, v3

    invoke-virtual {p1, v4}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۢۖᩴ;J)I
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Ll/ۢۖᩴ;->ᩳ(J)I

    move-result p0

    return p0
.end method

.method private ᩳ(J)I
    .locals 5

    .line 415
    iget-object v0, p0, Ll/ۢۖᩴ;->᩹:[J

    .line 416
    iget v1, p0, Ll/ۢۖᩴ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-wide v3, v0, v2

    cmp-long v1, v3, p1

    if-nez v1, :cond_0

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

    .line 435
    iget-object v0, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    .line 436
    iget v1, p0, Ll/ۢۖᩴ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 437
    aput-object v1, v0, v2

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 439
    iput v0, p0, Ll/ۢۖᩴ;->ۙ:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 744
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۖᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 748
    iget-object v1, p0, Ll/ۢۖᩴ;->᩹:[J

    invoke-virtual {v1}, [J->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [J

    iput-object v1, v0, Ll/ۢۖᩴ;->᩹:[J

    .line 749
    iget-object v1, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 750
    iput-object v1, v0, Ll/ۢۖᩴ;->᩸:Ll/᩵ۖᩴ;

    .line 751
    iput-object v1, v0, Ll/ۢۖᩴ;->᩶:Ll/ᩴۘᩴ;

    .line 752
    iput-object v1, v0, Ll/ۢۖᩴ;->۬:Ll/᩶֡ᩴ;

    return-object v0

    .line 746
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 3

    .line 449
    iget-object v0, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    .line 450
    iget v1, p0, Ll/ۢۖᩴ;->ۙ:I

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

.method public final isEmpty()Z
    .locals 1

    .line 456
    iget v0, p0, Ll/ۢۖᩴ;->ۙ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 616
    iget-object v0, p0, Ll/ۢۖᩴ;->᩶:Ll/ᩴۘᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ܿۖᩴ;

    invoke-direct {v0, p0}, Ll/ܿۖᩴ;-><init>(Ll/ۢۖᩴ;)V

    iput-object v0, p0, Ll/ۢۖᩴ;->᩶:Ll/ᩴۘᩴ;

    .line 617
    :cond_0
    iget-object v0, p0, Ll/ۢۖᩴ;->᩶:Ll/ᩴۘᩴ;

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 430
    iget v0, p0, Ll/ۢۖᩴ;->ۙ:I

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 726
    iget-object v0, p0, Ll/ۢۖᩴ;->۬:Ll/᩶֡ᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/᩷ۖᩴ;

    invoke-direct {v0, p0}, Ll/᩷ۖᩴ;-><init>(Ll/ۢۖᩴ;)V

    iput-object v0, p0, Ll/ۢۖᩴ;->۬:Ll/᩶֡ᩴ;

    .line 727
    :cond_0
    iget-object v0, p0, Ll/ۢۖᩴ;->۬:Ll/᩶֡ᩴ;

    return-object v0
.end method

.method public final ֫(JLjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 462
    invoke-direct {p0, p1, p2}, Ll/ۢۖᩴ;->ᩳ(J)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 464
    iget-object p1, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    aget-object p2, p1, v0

    .line 465
    aput-object p3, p1, v0

    return-object p2

    .line 468
    :cond_0
    iget v0, p0, Ll/ۢۖᩴ;->ۙ:I

    iget-object v1, p0, Ll/ۢۖᩴ;->᩹:[J

    array-length v1, v1

    if-ne v0, v1, :cond_4

    const/4 v1, 0x2

    if-nez v0, :cond_1

    const/4 v2, 0x2

    goto :goto_0

    :cond_1
    mul-int/lit8 v2, v0, 0x2

    .line 469
    :goto_0
    new-array v2, v2, [J

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    mul-int/lit8 v1, v0, 0x2

    .line 470
    :goto_1
    new-array v1, v1, [Ljava/lang/Object;

    :goto_2
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_3

    .line 472
    iget-object v0, p0, Ll/ۢۖᩴ;->᩹:[J

    aget-wide v4, v0, v3

    aput-wide v4, v2, v3

    .line 473
    iget-object v0, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    aget-object v0, v0, v3

    aput-object v0, v1, v3

    move v0, v3

    goto :goto_2

    .line 475
    :cond_3
    iput-object v2, p0, Ll/ۢۖᩴ;->᩹:[J

    .line 476
    iput-object v1, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    .line 478
    :cond_4
    iget-object v0, p0, Ll/ۢۖᩴ;->᩹:[J

    iget v1, p0, Ll/ۢۖᩴ;->ۙ:I

    aput-wide p1, v0, v1

    .line 479
    iget-object p1, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    aput-object p3, p1, v1

    add-int/lit8 v1, v1, 0x1

    .line 480
    iput v1, p0, Ll/ۢۖᩴ;->ۙ:I

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(J)Z
    .locals 0

    .line 444
    invoke-direct {p0, p1, p2}, Ll/ۢۖᩴ;->ᩳ(J)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(J)Ljava/lang/Object;
    .locals 5

    .line 423
    iget-object v0, p0, Ll/ۢۖᩴ;->᩹:[J

    .line 424
    iget v1, p0, Ll/ۢۖᩴ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-wide v3, v0, v2

    cmp-long v1, v3, p1

    if-nez v1, :cond_0

    iget-object p1, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    aget-object p1, p1, v2

    return-object p1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ܽ(J)Ljava/lang/Object;
    .locals 4

    .line 487
    invoke-direct {p0, p1, p2}, Ll/ۢۖᩴ;->ᩳ(J)I

    move-result p1

    const/4 p2, -0x1

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    return-object v0

    .line 489
    :cond_0
    iget-object p2, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    aget-object p2, p2, p1

    .line 490
    iget v1, p0, Ll/ۢۖᩴ;->ۙ:I

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    .line 491
    iget-object v2, p0, Ll/ۢۖᩴ;->᩹:[J

    add-int/lit8 v3, p1, 0x1

    invoke-static {v2, v3, v2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 492
    iget-object v2, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    invoke-static {v2, v3, v2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 493
    iget p1, p0, Ll/ۢۖᩴ;->ۙ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۢۖᩴ;->ۙ:I

    .line 494
    iget-object v1, p0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object p2
.end method

.method public final ᩵()Ll/ᩴۚᩴ;
    .locals 1

    .line 410
    iget-object v0, p0, Ll/ۢۖᩴ;->᩸:Ll/᩵ۖᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۧۖᩴ;

    invoke-direct {v0, p0}, Ll/ۧۖᩴ;-><init>(Ll/ۢۖᩴ;)V

    iput-object v0, p0, Ll/ۢۖᩴ;->᩸:Ll/᩵ۖᩴ;

    .line 411
    :cond_0
    iget-object v0, p0, Ll/ۢۖᩴ;->᩸:Ll/᩵ۖᩴ;

    return-object v0
.end method
