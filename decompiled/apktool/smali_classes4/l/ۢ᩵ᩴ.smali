.class public final Ll/ۢ᩵ᩴ;
.super Ll/۫ۘᩴ;
.source "H1MW"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۗ:Ll/ᩴۚᩴ;

.field public transient ۙ:[Ljava/lang/Object;

.field public transient ۛ:I

.field public final transient ۤ:I

.field public ۨ:I

.field public transient ۫:I

.field public transient ۬:I

.field public transient ܰ:Ll/֨ۢᩴ;

.field public final ᩶:F

.field public transient ᩸:Z

.field public transient ᩹:Ll/۬ᩴᩴ;

.field public transient ᩺:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x10

    .line 119
    invoke-direct {p0, v0}, Ll/ۢ᩵ᩴ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_0

    const/high16 v0, 0x3f400000    # 0.75f

    .line 97
    iput v0, p0, Ll/ۢ᩵ᩴ;->᩶:F

    .line 98
    invoke-static {v0, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    iput p1, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    iput p1, p0, Ll/ۢ᩵ᩴ;->ۤ:I

    add-int/lit8 v1, p1, -0x1

    .line 99
    iput v1, p0, Ll/ۢ᩵ᩴ;->۬:I

    .line 100
    invoke-static {v0, p1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/ۢ᩵ᩴ;->۫:I

    .line 101
    iget p1, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    add-int/lit8 p1, p1, 0x1

    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 102
    new-array p1, p1, [I

    iput-object p1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    return-void

    .line 96
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The expected number of elements must be nonnegative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 8

    .line 1461
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1462
    iget v0, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    iget v1, p0, Ll/ۢ᩵ᩴ;->᩶:F

    invoke-static {v1, v0}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    iput v0, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    .line 1463
    invoke-static {v1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/ۢ᩵ᩴ;->۫:I

    .line 1464
    iget v0, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Ll/ۢ᩵ᩴ;->۬:I

    add-int/lit8 v1, v0, 0x1

    .line 1465
    new-array v1, v1, [Ljava/lang/Object;

    iput-object v1, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    const/4 v2, 0x1

    add-int/2addr v0, v2

    .line 1466
    new-array v0, v0, [I

    iput-object v0, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    .line 1469
    iget v3, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_2

    .line 1470
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    .line 1471
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v5

    if-nez v3, :cond_0

    .line 1473
    iget v6, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    .line 1474
    iput-boolean v2, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    goto :goto_2

    .line 1476
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v6

    invoke-static {v6}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    iget v7, p0, Ll/ۢ᩵ᩴ;->۬:I

    :goto_1
    and-int/2addr v6, v7

    .line 1477
    aget-object v7, v1, v6

    if-eqz v7, :cond_1

    add-int/lit8 v6, v6, 0x1

    iget v7, p0, Ll/ۢ᩵ᩴ;->۬:I

    goto :goto_1

    .line 1479
    :cond_1
    :goto_2
    aput-object v3, v1, v6

    .line 1480
    aput v5, v0, v6

    move v3, v4

    goto :goto_0

    :cond_2
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 6

    .line 1448
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1449
    iget-object v1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    .line 1450
    new-instance v2, Ll/᩺ᩴᩴ;

    invoke-direct {v2, p0}, Ll/᩺ᩴᩴ;-><init>(Ll/ۢ᩵ᩴ;)V

    .line 1451
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1452
    iget v3, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_0

    .line 1453
    invoke-virtual {v2}, Ll/ܳ᩵ᩴ;->֫()I

    move-result v3

    .line 1454
    aget-object v5, v0, v3

    invoke-virtual {p1, v5}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 1455
    aget v3, v1, v3

    invoke-virtual {p1, v3}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    move v3, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫()I
    .locals 4

    const/4 v0, 0x0

    .line 218
    iput-boolean v0, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    .line 219
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    iget v1, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    const/4 v2, 0x0

    aput-object v2, v0, v1

    .line 220
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    aget v0, v0, v1

    .line 221
    iget v2, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    .line 222
    iget v3, p0, Ll/ۢ᩵ᩴ;->ۤ:I

    if-le v1, v3, :cond_0

    iget v3, p0, Ll/ۢ᩵ᩴ;->۫:I

    div-int/lit8 v3, v3, 0x4

    if-ge v2, v3, :cond_0

    const/16 v2, 0x10

    if-le v1, v2, :cond_0

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v1}, Ll/ۢ᩵ᩴ;->ܽ(I)V

    :cond_0
    return v0
.end method

.method private ֫(IILjava/lang/Object;)V
    .locals 1

    .line 251
    iget v0, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    .line 252
    :cond_0
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    aput-object p3, v0, p1

    .line 253
    iget-object p3, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    aput p2, p3, p1

    .line 254
    iget p1, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    iget p2, p0, Ll/ۢ᩵ᩴ;->۫:I

    if-lt p1, p2, :cond_1

    add-int/lit8 p1, p1, 0x2

    iget p2, p0, Ll/ۢ᩵ᩴ;->᩶:F

    invoke-static {p2, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۢ᩵ᩴ;->ܽ(I)V

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ۢ᩵ᩴ;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ll/ۢ᩵ᩴ;->֫()I

    return-void
.end method

.method public static synthetic ֫(Ll/ۢ᩵ᩴ;I)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Ll/ۢ᩵ᩴ;->ܿ(I)I

    return-void
.end method

.method private ܽ(Ljava/lang/Object;)I
    .locals 3

    if-nez p1, :cond_1

    .line 236
    iget-boolean p1, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    if-eqz p1, :cond_0

    iget p1, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    return p1

    :cond_0
    iget p1, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    add-int/lit8 p1, p1, 0x1

    neg-int p1, p1

    return p1

    .line 238
    :cond_1
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 241
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    neg-int p1, v1

    return p1

    .line 242
    :cond_2
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    return v1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 245
    iget v2, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_4

    add-int/lit8 v1, v1, 0x1

    neg-int p1, v1

    return p1

    .line 246
    :cond_4
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    return v1
.end method

.method private ܿ(I)I
    .locals 7

    .line 210
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    aget v1, v0, p1

    .line 211
    iget v2, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    .line 321
    iget-object v2, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    :goto_0
    add-int/lit8 v3, p1, 0x1

    .line 324
    iget v4, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v3, v4

    .line 326
    :goto_1
    aget-object v4, v2, v3

    if-nez v4, :cond_1

    const/4 v0, 0x0

    .line 327
    aput-object v0, v2, p1

    .line 213
    iget p1, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    iget v0, p0, Ll/ۢ᩵ᩴ;->ۤ:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    iget v2, p0, Ll/ۢ᩵ᩴ;->۫:I

    div-int/lit8 v2, v2, 0x4

    if-ge v0, v2, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/ۢ᩵ᩴ;->ܽ(I)V

    :cond_0
    return v1

    .line 330
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v5

    invoke-static {v5}, Ll/ܰۛۡ;->֫(I)I

    move-result v5

    iget v6, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v5, v6

    if-gt p1, v3, :cond_2

    if-ge p1, v5, :cond_3

    if-le v5, v3, :cond_4

    goto :goto_2

    :cond_2
    if-lt p1, v5, :cond_4

    if-le v5, v3, :cond_4

    .line 334
    :cond_3
    :goto_2
    aput-object v4, v2, p1

    .line 335
    aget v4, v0, v3

    aput v4, v0, p1

    move p1, v3

    goto :goto_0

    :cond_4
    add-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v6

    goto :goto_1
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 577
    iget v0, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 578
    iput v0, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    .line 579
    iput-boolean v0, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    .line 580
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1408
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ᩵ᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    .line 1412
    iput-object v1, v0, Ll/ۢ᩵ᩴ;->ۗ:Ll/ᩴۚᩴ;

    .line 1413
    iput-object v1, v0, Ll/ۢ᩵ᩴ;->ܰ:Ll/֨ۢᩴ;

    .line 1414
    iput-object v1, v0, Ll/ۢ᩵ᩴ;->᩹:Ll/۬ᩴᩴ;

    .line 1415
    iget-boolean v1, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    iput-boolean v1, v0, Ll/ۢ᩵ᩴ;->᩸:Z

    .line 1416
    iget-object v1, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1417
    iget-object v1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Ll/ۢ᩵ᩴ;->᩺:[I

    return-object v0

    .line 1410
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 4

    if-nez p1, :cond_0

    .line 378
    iget-boolean p1, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    return p1

    .line 380
    :cond_0
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    .line 384
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v1, v3

    .line 387
    iget v2, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 388
    :cond_3
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    return v3
.end method

.method public final hashCode()I
    .locals 7

    .line 1433
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1434
    iget-object v1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    .line 190
    iget-boolean v2, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    if-eqz v2, :cond_0

    iget v2, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    iget v2, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    add-int/lit8 v6, v2, -0x1

    if-eqz v2, :cond_3

    .line 1436
    :goto_2
    aget-object v2, v0, v3

    if-nez v2, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    if-eq p0, v2, :cond_2

    .line 1437
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v5

    .line 1438
    :cond_2
    aget v2, v1, v3

    xor-int/2addr v5, v2

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    move v2, v6

    goto :goto_1

    .line 1443
    :cond_3
    iget-boolean v0, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    if-eqz v0, :cond_4

    iget v0, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    aget v0, v1, v0

    add-int/2addr v4, v0

    :cond_4
    return v4
.end method

.method public final isEmpty()Z
    .locals 1

    .line 590
    iget v0, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 1219
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۗ:Ll/ᩴۚᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۧ᩵ᩴ;

    invoke-direct {v0, p0}, Ll/ۧ᩵ᩴ;-><init>(Ll/ۢ᩵ᩴ;)V

    iput-object v0, p0, Ll/ۢ᩵ᩴ;->ۗ:Ll/ᩴۚᩴ;

    .line 1220
    :cond_0
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۗ:Ll/ᩴۚᩴ;

    return-object v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 6

    .line 228
    iget v0, p0, Ll/ۢ᩵ᩴ;->᩶:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    .line 200
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 201
    iget v1, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/ۢ᩵ᩴ;->ܽ(I)V

    goto :goto_0

    .line 585
    :cond_0
    iget v1, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    .line 229
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    add-int/2addr v2, v1

    int-to-long v1, v2

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-double v0, v1

    .line 205
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-long v0, v0

    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(J)J

    move-result-wide v0

    const-wide/16 v2, 0x2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/32 v2, 0x40000000

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    .line 206
    iget v0, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    if-le v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ll/ۢ᩵ᩴ;->ܽ(I)V

    .line 231
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/۫ۘᩴ;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final size()I
    .locals 1

    .line 585
    iget v0, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1278
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ܰ:Ll/֨ۢᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۨᩴᩴ;

    invoke-direct {v0, p0}, Ll/ۨᩴᩴ;-><init>(Ll/ۢ᩵ᩴ;)V

    iput-object v0, p0, Ll/ۢ᩵ᩴ;->ܰ:Ll/֨ۢᩴ;

    .line 1313
    :cond_0
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ܰ:Ll/֨ۢᩴ;

    return-object v0
.end method

.method public final ֫(ILjava/lang/Object;)I
    .locals 2

    .line 260
    invoke-direct {p0, p2}, Ll/ۢ᩵ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    .line 262
    invoke-direct {p0, v0, p1, p2}, Ll/ۢ᩵ᩴ;->֫(IILjava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    .line 265
    :cond_0
    iget-object p2, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    aget v1, p2, v0

    .line 266
    aput p1, p2, v0

    return v1
.end method

.method public final ֫(ILjava/lang/String;)I
    .locals 3

    if-nez p2, :cond_0

    .line 405
    iget-boolean p2, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    if-eqz p2, :cond_3

    iget-object p1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    iget p2, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    aget p1, p1, p2

    return p1

    .line 407
    :cond_0
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 410
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    .line 411
    :cond_1
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    aget p1, p1, v1

    return p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 414
    iget v2, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_4

    :cond_3
    :goto_0
    return p1

    .line 415
    :cond_4
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    aget p1, p1, v1

    return p1
.end method

.method public final ֫(Ljava/lang/Object;)I
    .locals 3

    if-nez p1, :cond_0

    .line 343
    iget-boolean p1, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    if-eqz p1, :cond_3

    invoke-direct {p0}, Ll/ۢ᩵ᩴ;->֫()I

    move-result p1

    return p1

    .line 347
    :cond_0
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 350
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    .line 351
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0, v1}, Ll/ۢ᩵ᩴ;->ܿ(I)I

    move-result p1

    return p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 353
    iget v2, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_4

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1

    .line 354
    :cond_4
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0, v1}, Ll/ۢ᩵ᩴ;->ܿ(I)I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/String;Ll/ܳۢ᩷;)I
    .locals 1

    .line 491
    invoke-direct {p0, p1}, Ll/ۢ᩵ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 492
    iget-object p1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    aget p1, p1, v0

    return p1

    .line 494
    :cond_0
    invoke-virtual {p2, p1}, Ll/ܳۢ᩷;->ۧ(Ljava/lang/Object;)I

    move-result p2

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    .line 495
    invoke-direct {p0, v0, p2, p1}, Ll/ۢ᩵ᩴ;->֫(IILjava/lang/Object;)V

    return p2
.end method

.method public final ֫֫()Ll/ᩴۚᩴ;
    .locals 1

    .line 1115
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->᩹:Ll/۬ᩴᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ܿ᩵ᩴ;

    invoke-direct {v0, p0}, Ll/ܿ᩵ᩴ;-><init>(Ll/ۢ᩵ᩴ;)V

    iput-object v0, p0, Ll/ۢ᩵ᩴ;->᩹:Ll/۬ᩴᩴ;

    .line 1116
    :cond_0
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->᩹:Ll/۬ᩴᩴ;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 3

    if-nez p1, :cond_0

    .line 361
    iget-boolean p1, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    iget v0, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    aget p1, p1, v0

    return p1

    .line 363
    :cond_0
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 366
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    .line 367
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    aget p1, p1, v1

    return p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 370
    iget v2, p0, Ll/ۢ᩵ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_4

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1

    .line 371
    :cond_4
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    aget p1, p1, v1

    return p1
.end method

.method public final ܽ(I)V
    .locals 9

    .line 1374
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1375
    iget-object v1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    add-int/lit8 v2, p1, -0x1

    add-int/lit8 v3, p1, 0x1

    .line 1377
    new-array v4, v3, [Ljava/lang/Object;

    .line 1378
    new-array v3, v3, [I

    .line 1379
    iget v5, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    .line 190
    iget-boolean v6, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    if-eqz v6, :cond_0

    iget v6, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    :cond_0
    iget v6, p0, Ll/ۢ᩵ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v7, v6, -0x1

    if-eqz v6, :cond_3

    :goto_1
    add-int/lit8 v5, v5, -0x1

    .line 1381
    aget-object v6, v0, v5

    if-nez v6, :cond_1

    goto :goto_1

    .line 1382
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v6

    invoke-static {v6}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    and-int/2addr v6, v2

    aget-object v8, v4, v6

    if-eqz v8, :cond_2

    :goto_2
    add-int/lit8 v6, v6, 0x1

    and-int/2addr v6, v2

    aget-object v8, v4, v6

    if-eqz v8, :cond_2

    goto :goto_2

    .line 1383
    :cond_2
    aget-object v8, v0, v5

    aput-object v8, v4, v6

    .line 1384
    aget v8, v1, v5

    aput v8, v3, v6

    move v6, v7

    goto :goto_0

    .line 1386
    :cond_3
    iget v0, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    aget v0, v1, v0

    aput v0, v3, p1

    .line 1387
    iput p1, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    .line 1388
    iput v2, p0, Ll/ۢ᩵ᩴ;->۬:I

    .line 1389
    iget v0, p0, Ll/ۢ᩵ᩴ;->᩶:F

    invoke-static {v0, p1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/ۢ᩵ᩴ;->۫:I

    .line 1390
    iput-object v4, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1391
    iput-object v3, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    return-void
.end method

.method public final ᩳ(I)Z
    .locals 4

    .line 394
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    .line 395
    iget-object v1, p0, Ll/ۢ᩵ᩴ;->᩺:[I

    .line 396
    iget-boolean v2, p0, Ll/ۢ᩵ᩴ;->᩸:Z

    if-eqz v2, :cond_0

    iget v2, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    aget v2, v1, v2

    if-ne v2, p1, :cond_0

    goto :goto_1

    .line 397
    :cond_0
    iget v2, p0, Ll/ۢ᩵ᩴ;->ۛ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_2

    aget-object v2, v0, v3

    if-eqz v2, :cond_1

    aget v2, v1, v3

    if-ne v2, p1, :cond_1

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
