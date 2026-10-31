.class public final Ll/ۤ᩻ᩴ;
.super Ll/᩵ܿᩴ;
.source "M1N0"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۗ:[I

.field public final ۙ:F

.field public final transient ۛ:I

.field public transient ۟:Ll/֨ۢᩴ;

.field public transient ۤ:I

.field public transient ۨ:I

.field public transient ۫:I

.field public transient ۬:Ll/ۨۡᩴ;

.field public transient ܰ:[I

.field public transient ᩶:Ll/ۘ᩻ᩴ;

.field public transient ᩹:Z

.field public ᩺:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x10

    const/4 v1, 0x0

    .line 118
    invoke-direct {p0, v0, v1}, Ll/ۤ᩻ᩴ;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_0

    const/high16 p2, 0x3f400000    # 0.75f

    .line 96
    iput p2, p0, Ll/ۤ᩻ᩴ;->ۙ:F

    .line 97
    invoke-static {p2, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    iput p1, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    iput p1, p0, Ll/ۤ᩻ᩴ;->ۛ:I

    add-int/lit8 v0, p1, -0x1

    .line 98
    iput v0, p0, Ll/ۤ᩻ᩴ;->۫:I

    .line 99
    invoke-static {p2, p1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/ۤ᩻ᩴ;->ۤ:I

    .line 100
    iget p1, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    add-int/lit8 p1, p1, 0x1

    new-array p2, p1, [I

    iput-object p2, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 101
    new-array p1, p1, [I

    iput-object p1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    return-void

    .line 95
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The expected number of elements must be nonnegative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 8

    .line 1482
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1483
    iget v0, p0, Ll/ۤ᩻ᩴ;->᩺:I

    iget v1, p0, Ll/ۤ᩻ᩴ;->ۙ:F

    invoke-static {v1, v0}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    iput v0, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    .line 1484
    invoke-static {v1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/ۤ᩻ᩴ;->ۤ:I

    .line 1485
    iget v0, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Ll/ۤ᩻ᩴ;->۫:I

    add-int/lit8 v1, v0, 0x1

    .line 1486
    new-array v1, v1, [I

    iput-object v1, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    .line 1487
    new-array v0, v0, [I

    iput-object v0, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    .line 1490
    iget v3, p0, Ll/ۤ᩻ᩴ;->᩺:I

    :goto_0
    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_2

    .line 1491
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v3

    .line 1492
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v5

    if-nez v3, :cond_0

    .line 1494
    iget v6, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    .line 1495
    iput-boolean v2, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    goto :goto_2

    .line 1497
    :cond_0
    invoke-static {v3}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    iget v7, p0, Ll/ۤ᩻ᩴ;->۫:I

    :goto_1
    and-int/2addr v6, v7

    .line 1498
    aget v7, v1, v6

    if-eqz v7, :cond_1

    add-int/lit8 v6, v6, 0x1

    iget v7, p0, Ll/ۤ᩻ᩴ;->۫:I

    goto :goto_1

    .line 1500
    :cond_1
    :goto_2
    aput v3, v1, v6

    .line 1501
    aput v5, v0, v6

    move v3, v4

    goto :goto_0

    :cond_2
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 6

    .line 1470
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 1471
    iget-object v1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    .line 1472
    new-instance v2, Ll/֡᩻ᩴ;

    invoke-direct {v2, p0}, Ll/֡᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;)V

    .line 1473
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1474
    iget v3, p0, Ll/ۤ᩻ᩴ;->᩺:I

    :goto_0
    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_0

    .line 1475
    invoke-virtual {v2}, Ll/ۙ᩻ᩴ;->֫()I

    move-result v3

    .line 1476
    aget v5, v0, v3

    invoke-virtual {p1, v5}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 1477
    aget v3, v1, v3

    invoke-virtual {p1, v3}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    move v3, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۤ᩻ᩴ;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ll/ۤ᩻ᩴ;->᩷()I

    return-void
.end method

.method public static synthetic ֫(Ll/ۤ᩻ᩴ;I)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Ll/ۤ᩻ᩴ;->ܳ(I)I

    return-void
.end method

.method private ܳ(I)I
    .locals 7

    .line 209
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    aget v1, v0, p1

    .line 210
    iget v2, p0, Ll/ۤ᩻ᩴ;->᩺:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ۤ᩻ᩴ;->᩺:I

    .line 318
    iget-object v2, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    :goto_0
    add-int/lit8 v3, p1, 0x1

    .line 321
    iget v4, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v3, v4

    .line 323
    :goto_1
    aget v4, v2, v3

    if-nez v4, :cond_1

    const/4 v0, 0x0

    .line 324
    aput v0, v2, p1

    .line 212
    iget p1, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    iget v0, p0, Ll/ۤ᩻ᩴ;->ۛ:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/ۤ᩻ᩴ;->᩺:I

    iget v2, p0, Ll/ۤ᩻ᩴ;->ۤ:I

    div-int/lit8 v2, v2, 0x4

    if-ge v0, v2, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/ۤ᩻ᩴ;->ܿ(I)V

    :cond_0
    return v1

    .line 327
    :cond_1
    invoke-static {v4}, Ll/ܰۛۡ;->֫(I)I

    move-result v5

    iget v6, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v5, v6

    if-gt p1, v3, :cond_2

    if-ge p1, v5, :cond_3

    if-le v5, v3, :cond_4

    goto :goto_2

    :cond_2
    if-lt p1, v5, :cond_4

    if-le v5, v3, :cond_4

    .line 331
    :cond_3
    :goto_2
    aput v4, v2, p1

    .line 332
    aget v4, v0, v3

    aput v4, v0, p1

    move p1, v3

    goto :goto_0

    :cond_4
    add-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v6

    goto :goto_1
.end method

.method private ᩷()I
    .locals 4

    const/4 v0, 0x0

    .line 217
    iput-boolean v0, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    .line 218
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    iget v1, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    aget v0, v0, v1

    .line 219
    iget v2, p0, Ll/ۤ᩻ᩴ;->᩺:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ۤ᩻ᩴ;->᩺:I

    .line 220
    iget v3, p0, Ll/ۤ᩻ᩴ;->ۛ:I

    if-le v1, v3, :cond_0

    iget v3, p0, Ll/ۤ᩻ᩴ;->ۤ:I

    div-int/lit8 v3, v3, 0x4

    if-ge v2, v3, :cond_0

    const/16 v2, 0x10

    if-le v1, v2, :cond_0

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v1}, Ll/ۤ᩻ᩴ;->ܿ(I)V

    :cond_0
    return v0
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 587
    iget v0, p0, Ll/ۤ᩻ᩴ;->᩺:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 588
    iput v0, p0, Ll/ۤ᩻ᩴ;->᩺:I

    .line 589
    iput-boolean v0, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    .line 590
    iget-object v1, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1430
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤ᩻ᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    .line 1434
    iput-object v1, v0, Ll/ۤ᩻ᩴ;->۬:Ll/ۨۡᩴ;

    .line 1435
    iput-object v1, v0, Ll/ۤ᩻ᩴ;->۟:Ll/֨ۢᩴ;

    .line 1436
    iput-object v1, v0, Ll/ۤ᩻ᩴ;->᩶:Ll/ۘ᩻ᩴ;

    .line 1437
    iget-boolean v1, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    iput-boolean v1, v0, Ll/ۤ᩻ᩴ;->᩹:Z

    .line 1438
    iget-object v1, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 1439
    iget-object v1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Ll/ۤ᩻ᩴ;->ܰ:[I

    return-object v0

    .line 1432
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final get(I)I
    .locals 3

    if-nez p1, :cond_1

    .line 358
    iget-boolean p1, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    iget v0, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    aget p1, p1, v0

    return p1

    :cond_0
    iget p1, p0, Ll/ᩴܿᩴ;->᩸:I

    return p1

    .line 360
    :cond_1
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 363
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_2

    iget p1, p0, Ll/ᩴܿᩴ;->᩸:I

    return p1

    :cond_2
    if-ne p1, v2, :cond_3

    .line 364
    iget-object p1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    aget p1, p1, v1

    return p1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 367
    iget v2, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_4

    iget p1, p0, Ll/ᩴܿᩴ;->᩸:I

    return p1

    :cond_4
    if-ne p1, v2, :cond_3

    .line 368
    iget-object p1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    aget p1, p1, v1

    return p1
.end method

.method public final hashCode()I
    .locals 7

    .line 1455
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 1456
    iget-object v1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    .line 189
    iget-boolean v2, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz v2, :cond_0

    iget v2, p0, Ll/ۤ᩻ᩴ;->᩺:I

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    iget v2, p0, Ll/ۤ᩻ᩴ;->᩺:I

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    add-int/lit8 v5, v2, -0x1

    if-eqz v2, :cond_2

    .line 1458
    :goto_2
    aget v2, v0, v4

    if-nez v2, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1460
    :cond_1
    aget v6, v1, v4

    xor-int/2addr v2, v6

    add-int/2addr v3, v2

    add-int/lit8 v4, v4, 0x1

    move v2, v5

    goto :goto_1

    .line 1465
    :cond_2
    iget-boolean v0, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz v0, :cond_3

    iget v0, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    aget v0, v1, v0

    add-int/2addr v3, v0

    :cond_3
    return v3
.end method

.method public final isEmpty()Z
    .locals 1

    .line 600
    iget v0, p0, Ll/ۤ᩻ᩴ;->᩺:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 1241
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->۬:Ll/ۨۡᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ܶ᩻ᩴ;

    invoke-direct {v0, p0}, Ll/ܶ᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;)V

    iput-object v0, p0, Ll/ۤ᩻ᩴ;->۬:Ll/ۨۡᩴ;

    .line 1242
    :cond_0
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->۬:Ll/ۨۡᩴ;

    return-object v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 6

    .line 226
    iget v0, p0, Ll/ۤ᩻ᩴ;->ۙ:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    .line 199
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 200
    iget v1, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/ۤ᩻ᩴ;->ܿ(I)V

    goto :goto_0

    .line 595
    :cond_0
    iget v1, p0, Ll/ۤ᩻ᩴ;->᩺:I

    .line 227
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    add-int/2addr v2, v1

    int-to-long v1, v2

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-double v0, v1

    .line 204
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

    .line 205
    iget v0, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    if-le v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ll/ۤ᩻ᩴ;->ܿ(I)V

    .line 229
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/᩵ܿᩴ;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final remove(I)I
    .locals 3

    if-nez p1, :cond_1

    .line 340
    iget-boolean p1, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Ll/ۤ᩻ᩴ;->᩷()I

    move-result p1

    return p1

    .line 341
    :cond_0
    iget p1, p0, Ll/ᩴܿᩴ;->᩸:I

    return p1

    .line 344
    :cond_1
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 347
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_2

    iget p1, p0, Ll/ᩴܿᩴ;->᩸:I

    return p1

    :cond_2
    if-ne p1, v2, :cond_3

    .line 348
    invoke-direct {p0, v1}, Ll/ۤ᩻ᩴ;->ܳ(I)I

    move-result p1

    return p1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 350
    iget v2, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_4

    iget p1, p0, Ll/ᩴܿᩴ;->᩸:I

    return p1

    :cond_4
    if-ne p1, v2, :cond_3

    .line 351
    invoke-direct {p0, v1}, Ll/ۤ᩻ᩴ;->ܳ(I)I

    move-result p1

    return p1
.end method

.method public final size()I
    .locals 1

    .line 595
    iget v0, p0, Ll/ۤ᩻ᩴ;->᩺:I

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1300
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->۟:Ll/֨ۢᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/᩵᩻ᩴ;

    invoke-direct {v0, p0}, Ll/᩵᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;)V

    iput-object v0, p0, Ll/ۤ᩻ᩴ;->۟:Ll/֨ۢᩴ;

    .line 1335
    :cond_0
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->۟:Ll/֨ۢᩴ;

    return-object v0
.end method

.method public final ֫(II)I
    .locals 4

    const/4 v0, 0x1

    if-nez p1, :cond_1

    .line 233
    iget-boolean v1, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    goto :goto_2

    :cond_0
    iget v1, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    add-int/2addr v1, v0

    neg-int v1, v1

    goto :goto_2

    .line 235
    :cond_1
    iget-object v1, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 238
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v2, v3

    aget v3, v1, v2

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    if-ne p1, v3, :cond_3

    :goto_0
    move v1, v2

    goto :goto_2

    :cond_3
    add-int/2addr v2, v0

    .line 242
    iget v3, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v2, v3

    aget v3, v1, v2

    if-nez v3, :cond_4

    :goto_1
    add-int/lit8 v2, v2, 0x1

    neg-int v1, v2

    goto :goto_2

    :cond_4
    if-ne p1, v3, :cond_3

    goto :goto_0

    :goto_2
    if-gez v1, :cond_7

    neg-int v1, v1

    sub-int/2addr v1, v0

    .line 248
    iget v2, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    if-ne v1, v2, :cond_5

    iput-boolean v0, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    .line 249
    :cond_5
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    aput p1, v0, v1

    .line 250
    iget-object p1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    aput p2, p1, v1

    .line 251
    iget p1, p0, Ll/ۤ᩻ᩴ;->᩺:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Ll/ۤ᩻ᩴ;->᩺:I

    iget p2, p0, Ll/ۤ᩻ᩴ;->ۤ:I

    if-lt p1, p2, :cond_6

    add-int/lit8 p1, p1, 0x2

    iget p2, p0, Ll/ۤ᩻ᩴ;->ۙ:F

    invoke-static {p2, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۤ᩻ᩴ;->ܿ(I)V

    .line 260
    :cond_6
    iget p1, p0, Ll/ᩴܿᩴ;->᩸:I

    return p1

    .line 262
    :cond_7
    iget-object p1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    aget v0, p1, v1

    .line 263
    aput p2, p1, v1

    return v0
.end method

.method public final ֫(I)Z
    .locals 4

    if-nez p1, :cond_0

    .line 375
    iget-boolean p1, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    return p1

    .line 377
    :cond_0
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 380
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    if-ne p1, v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v1, v3

    .line 384
    iget v2, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    if-ne p1, v2, :cond_2

    :goto_1
    return v3
.end method

.method public final ۫֫()Ll/ᩴۚᩴ;
    .locals 1

    .line 1137
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->᩶:Ll/ۘ᩻ᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/᩶᩻ᩴ;

    invoke-direct {v0, p0}, Ll/᩶᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;)V

    iput-object v0, p0, Ll/ۤ᩻ᩴ;->᩶:Ll/ۘ᩻ᩴ;

    .line 1138
    :cond_0
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->᩶:Ll/ۘ᩻ᩴ;

    return-object v0
.end method

.method public final ܽ(I)I
    .locals 3

    if-nez p1, :cond_0

    .line 402
    iget-boolean p1, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    iget v0, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    aget p1, p1, v0

    return p1

    .line 404
    :cond_0
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 407
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    if-ne p1, v2, :cond_2

    .line 408
    iget-object p1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    aget p1, p1, v1

    return p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 411
    iget v2, p0, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_4

    :cond_3
    :goto_0
    const/4 p1, -0x1

    return p1

    :cond_4
    if-ne p1, v2, :cond_2

    .line 412
    iget-object p1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    aget p1, p1, v1

    return p1
.end method

.method public final ܿ()V
    .locals 4

    .line 1352
    iget v0, p0, Ll/ۤ᩻ᩴ;->᩺:I

    int-to-float v0, v0

    .line 1374
    iget v1, p0, Ll/ۤ᩻ᩴ;->ۙ:F

    div-float/2addr v0, v1

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    .line 167
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x20

    shl-int v0, v2, v0

    .line 1375
    iget v2, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    if-ge v0, v2, :cond_1

    iget v2, p0, Ll/ۤ᩻ᩴ;->᩺:I

    invoke-static {v1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v1

    if-le v2, v1, :cond_0

    goto :goto_0

    .line 1377
    :cond_0
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ۤ᩻ᩴ;->ܿ(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public final ܿ(I)V
    .locals 9

    .line 1396
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 1397
    iget-object v1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    add-int/lit8 v2, p1, -0x1

    add-int/lit8 v3, p1, 0x1

    .line 1399
    new-array v4, v3, [I

    .line 1400
    new-array v3, v3, [I

    .line 1401
    iget v5, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    .line 189
    iget-boolean v6, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz v6, :cond_0

    iget v6, p0, Ll/ۤ᩻ᩴ;->᩺:I

    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    :cond_0
    iget v6, p0, Ll/ۤ᩻ᩴ;->᩺:I

    :goto_0
    add-int/lit8 v7, v6, -0x1

    if-eqz v6, :cond_3

    :goto_1
    add-int/lit8 v5, v5, -0x1

    .line 1403
    aget v6, v0, v5

    if-nez v6, :cond_1

    goto :goto_1

    .line 1404
    :cond_1
    invoke-static {v6}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    and-int/2addr v6, v2

    aget v8, v4, v6

    if-eqz v8, :cond_2

    :goto_2
    add-int/lit8 v6, v6, 0x1

    and-int/2addr v6, v2

    aget v8, v4, v6

    if-eqz v8, :cond_2

    goto :goto_2

    .line 1405
    :cond_2
    aget v8, v0, v5

    aput v8, v4, v6

    .line 1406
    aget v8, v1, v5

    aput v8, v3, v6

    move v6, v7

    goto :goto_0

    .line 1408
    :cond_3
    iget v0, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    aget v0, v1, v0

    aput v0, v3, p1

    .line 1409
    iput p1, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    .line 1410
    iput v2, p0, Ll/ۤ᩻ᩴ;->۫:I

    .line 1411
    iget v0, p0, Ll/ۤ᩻ᩴ;->ۙ:F

    invoke-static {v0, p1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/ۤ᩻ᩴ;->ۤ:I

    .line 1412
    iput-object v4, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 1413
    iput-object v3, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    return-void
.end method

.method public final ᩳ(I)Z
    .locals 4

    .line 391
    iget-object v0, p0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 392
    iget-object v1, p0, Ll/ۤ᩻ᩴ;->ܰ:[I

    .line 393
    iget-boolean v2, p0, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz v2, :cond_0

    iget v2, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    aget v2, v1, v2

    if-ne v2, p1, :cond_0

    goto :goto_1

    .line 394
    :cond_0
    iget v2, p0, Ll/ۤ᩻ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_2

    aget v2, v0, v3

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
