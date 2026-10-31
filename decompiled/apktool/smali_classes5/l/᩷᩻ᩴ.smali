.class public final Ll/᩷᩻ᩴ;
.super Ll/ۘܿᩴ;
.source "K9H"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۗ:I

.field public transient ۙ:Ll/ۨۡᩴ;

.field public ۛ:I

.field public transient ۤ:I

.field public transient ۨ:[F

.field public final transient ۫:I

.field public transient ۬:I

.field public transient ᩶:[I

.field public transient ᩸:Z

.field public transient ᩹:Ll/ۙܳᩴ;

.field public transient ᩺:Ll/ۧᩳᩴ;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f400000    # 0.75f

    const/16 v1, 0x10

    .line 103
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v1

    iput v1, p0, Ll/᩷᩻ᩴ;->ۤ:I

    iput v1, p0, Ll/᩷᩻ᩴ;->۫:I

    add-int/lit8 v2, v1, -0x1

    .line 104
    iput v2, p0, Ll/᩷᩻ᩴ;->ۗ:I

    .line 105
    invoke-static {v0, v1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/᩷᩻ᩴ;->۬:I

    .line 106
    iget v0, p0, Ll/᩷᩻ᩴ;->ۤ:I

    add-int/lit8 v0, v0, 0x1

    new-array v1, v0, [I

    iput-object v1, p0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 107
    new-array v0, v0, [F

    iput-object v0, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 8

    .line 1488
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1489
    iget v0, p0, Ll/᩷᩻ᩴ;->ۛ:I

    const/high16 v1, 0x3f400000    # 0.75f

    invoke-static {v1, v0}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    iput v0, p0, Ll/᩷᩻ᩴ;->ۤ:I

    .line 1490
    invoke-static {v1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/᩷᩻ᩴ;->۬:I

    .line 1491
    iget v0, p0, Ll/᩷᩻ᩴ;->ۤ:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Ll/᩷᩻ᩴ;->ۗ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 1492
    new-array v2, v0, [I

    iput-object v2, p0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 1493
    new-array v0, v0, [F

    iput-object v0, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    .line 1496
    iget v3, p0, Ll/᩷᩻ᩴ;->ۛ:I

    :goto_0
    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_2

    .line 1497
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v3

    .line 1498
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v5

    if-nez v3, :cond_0

    .line 1500
    iget v6, p0, Ll/᩷᩻ᩴ;->ۤ:I

    .line 1501
    iput-boolean v1, p0, Ll/᩷᩻ᩴ;->᩸:Z

    goto :goto_2

    .line 1503
    :cond_0
    invoke-static {v3}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    iget v7, p0, Ll/᩷᩻ᩴ;->ۗ:I

    :goto_1
    and-int/2addr v6, v7

    .line 1504
    aget v7, v2, v6

    if-eqz v7, :cond_1

    add-int/lit8 v6, v6, 0x1

    iget v7, p0, Ll/᩷᩻ᩴ;->ۗ:I

    goto :goto_1

    .line 1506
    :cond_1
    :goto_2
    aput v3, v2, v6

    .line 1507
    aput v5, v0, v6

    move v3, v4

    goto :goto_0

    :cond_2
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 6

    .line 1476
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 1477
    iget-object v1, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    .line 1478
    new-instance v2, Ll/ۨܳᩴ;

    invoke-direct {v2, p0}, Ll/ۨܳᩴ;-><init>(Ll/᩷᩻ᩴ;)V

    .line 1479
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1480
    iget v3, p0, Ll/᩷᩻ᩴ;->ۛ:I

    :goto_0
    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_0

    .line 1481
    invoke-virtual {v2}, Ll/ܿ᩻ᩴ;->֫()I

    move-result v3

    .line 1482
    aget v5, v0, v3

    invoke-virtual {p1, v5}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 1483
    aget v3, v1, v3

    invoke-virtual {p1, v3}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    move v3, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫()F
    .locals 4

    const/4 v0, 0x0

    .line 223
    iput-boolean v0, p0, Ll/᩷᩻ᩴ;->᩸:Z

    .line 224
    iget-object v0, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    iget v1, p0, Ll/᩷᩻ᩴ;->ۤ:I

    aget v0, v0, v1

    .line 225
    iget v2, p0, Ll/᩷᩻ᩴ;->ۛ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/᩷᩻ᩴ;->ۛ:I

    .line 226
    iget v3, p0, Ll/᩷᩻ᩴ;->۫:I

    if-le v1, v3, :cond_0

    iget v3, p0, Ll/᩷᩻ᩴ;->۬:I

    div-int/lit8 v3, v3, 0x4

    if-ge v2, v3, :cond_0

    const/16 v2, 0x10

    if-le v1, v2, :cond_0

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v1}, Ll/᩷᩻ᩴ;->ܽ(I)V

    :cond_0
    return v0
.end method

.method public static synthetic ֫(Ll/᩷᩻ᩴ;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ll/᩷᩻ᩴ;->֫()F

    return-void
.end method

.method public static synthetic ֫(Ll/᩷᩻ᩴ;I)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Ll/᩷᩻ᩴ;->ܿ(I)F

    return-void
.end method

.method private ܿ(I)F
    .locals 7

    .line 215
    iget-object v0, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    aget v1, v0, p1

    .line 216
    iget v2, p0, Ll/᩷᩻ᩴ;->ۛ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/᩷᩻ᩴ;->ۛ:I

    .line 324
    iget-object v2, p0, Ll/᩷᩻ᩴ;->᩶:[I

    :goto_0
    add-int/lit8 v3, p1, 0x1

    .line 327
    iget v4, p0, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v3, v4

    .line 329
    :goto_1
    aget v4, v2, v3

    if-nez v4, :cond_1

    const/4 v0, 0x0

    .line 330
    aput v0, v2, p1

    .line 218
    iget p1, p0, Ll/᩷᩻ᩴ;->ۤ:I

    iget v0, p0, Ll/᩷᩻ᩴ;->۫:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/᩷᩻ᩴ;->ۛ:I

    iget v2, p0, Ll/᩷᩻ᩴ;->۬:I

    div-int/lit8 v2, v2, 0x4

    if-ge v0, v2, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/᩷᩻ᩴ;->ܽ(I)V

    :cond_0
    return v1

    .line 333
    :cond_1
    invoke-static {v4}, Ll/ܰۛۡ;->֫(I)I

    move-result v5

    iget v6, p0, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v5, v6

    if-gt p1, v3, :cond_2

    if-ge p1, v5, :cond_3

    if-le v5, v3, :cond_4

    goto :goto_2

    :cond_2
    if-lt p1, v5, :cond_4

    if-le v5, v3, :cond_4

    .line 337
    :cond_3
    :goto_2
    aput v4, v2, p1

    .line 338
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

    .line 593
    iget v0, p0, Ll/᩷᩻ᩴ;->ۛ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 594
    iput v0, p0, Ll/᩷᩻ᩴ;->ۛ:I

    .line 595
    iput-boolean v0, p0, Ll/᩷᩻ᩴ;->᩸:Z

    .line 596
    iget-object v1, p0, Ll/᩷᩻ᩴ;->᩶:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1436
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷᩻ᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    .line 1440
    iput-object v1, v0, Ll/᩷᩻ᩴ;->ۙ:Ll/ۨۡᩴ;

    .line 1441
    iput-object v1, v0, Ll/᩷᩻ᩴ;->᩺:Ll/ۧᩳᩴ;

    .line 1442
    iput-object v1, v0, Ll/᩷᩻ᩴ;->᩹:Ll/ۙܳᩴ;

    .line 1443
    iget-boolean v1, p0, Ll/᩷᩻ᩴ;->᩸:Z

    iput-boolean v1, v0, Ll/᩷᩻ᩴ;->᩸:Z

    .line 1444
    iget-object v1, p0, Ll/᩷᩻ᩴ;->᩶:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 1445
    iget-object v1, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    invoke-virtual {v1}, [F->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [F

    iput-object v1, v0, Ll/᩷᩻ᩴ;->ۨ:[F

    return-object v0

    .line 1438
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final get(I)F
    .locals 3

    if-nez p1, :cond_0

    .line 364
    iget-boolean p1, p0, Ll/᩷᩻ᩴ;->᩸:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    iget v0, p0, Ll/᩷᩻ᩴ;->ۤ:I

    aget p1, p1, v0

    return p1

    .line 366
    :cond_0
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 369
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    if-ne p1, v2, :cond_2

    .line 370
    iget-object p1, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    aget p1, p1, v1

    return p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 373
    iget v2, p0, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_4

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    if-ne p1, v2, :cond_2

    .line 374
    iget-object p1, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    aget p1, p1, v1

    return p1
.end method

.method public final hashCode()I
    .locals 7

    .line 1461
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 1462
    iget-object v1, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    .line 195
    iget-boolean v2, p0, Ll/᩷᩻ᩴ;->᩸:Z

    if-eqz v2, :cond_0

    iget v2, p0, Ll/᩷᩻ᩴ;->ۛ:I

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    iget v2, p0, Ll/᩷᩻ᩴ;->ۛ:I

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    add-int/lit8 v5, v2, -0x1

    if-eqz v2, :cond_2

    .line 1464
    :goto_2
    aget v2, v0, v4

    if-nez v2, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1466
    :cond_1
    aget v6, v1, v4

    .line 132
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    xor-int/2addr v2, v6

    add-int/2addr v3, v2

    add-int/lit8 v4, v4, 0x1

    move v2, v5

    goto :goto_1

    .line 1471
    :cond_2
    iget-boolean v0, p0, Ll/᩷᩻ᩴ;->᩸:Z

    if-eqz v0, :cond_3

    iget v0, p0, Ll/᩷᩻ᩴ;->ۤ:I

    aget v0, v1, v0

    .line 132
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    add-int/2addr v0, v3

    return v0

    :cond_3
    return v3
.end method

.method public final isEmpty()Z
    .locals 1

    .line 606
    iget v0, p0, Ll/᩷᩻ᩴ;->ۛ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic keySet()Ljava/util/Set;
    .locals 1

    .line 61
    invoke-virtual {p0}, Ll/᩷᩻ᩴ;->keySet()Ll/ۨۡᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final keySet()Ll/ۨۡᩴ;
    .locals 1

    .line 1247
    iget-object v0, p0, Ll/᩷᩻ᩴ;->ۙ:Ll/ۨۡᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/֫᩻ᩴ;

    invoke-direct {v0, p0}, Ll/֫᩻ᩴ;-><init>(Ll/᩷᩻ᩴ;)V

    iput-object v0, p0, Ll/᩷᩻ᩴ;->ۙ:Ll/ۨۡᩴ;

    .line 1248
    :cond_0
    iget-object v0, p0, Ll/᩷᩻ᩴ;->ۙ:Ll/ۨۡᩴ;

    return-object v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 6

    const/high16 v0, 0x3f400000    # 0.75f

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    .line 232
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    .line 205
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 206
    iget v1, p0, Ll/᩷᩻ᩴ;->ۤ:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/᩷᩻ᩴ;->ܽ(I)V

    goto :goto_0

    .line 601
    :cond_0
    iget v1, p0, Ll/᩷᩻ᩴ;->ۛ:I

    .line 233
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    add-int/2addr v2, v1

    int-to-long v1, v2

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-double v0, v1

    .line 210
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

    .line 211
    iget v0, p0, Ll/᩷᩻ᩴ;->ۤ:I

    if-le v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ll/᩷᩻ᩴ;->ܽ(I)V

    .line 235
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/ۘܿᩴ;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final remove(I)F
    .locals 3

    if-nez p1, :cond_0

    .line 346
    iget-boolean p1, p0, Ll/᩷᩻ᩴ;->᩸:Z

    if-eqz p1, :cond_3

    invoke-direct {p0}, Ll/᩷᩻ᩴ;->֫()F

    move-result p1

    return p1

    .line 350
    :cond_0
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 353
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    if-ne p1, v2, :cond_2

    .line 354
    invoke-direct {p0, v1}, Ll/᩷᩻ᩴ;->ܿ(I)F

    move-result p1

    return p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 356
    iget v2, p0, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v1, v2

    aget v2, v0, v1

    if-nez v2, :cond_4

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    if-ne p1, v2, :cond_2

    .line 357
    invoke-direct {p0, v1}, Ll/᩷᩻ᩴ;->ܿ(I)F

    move-result p1

    return p1
.end method

.method public final size()I
    .locals 1

    .line 601
    iget v0, p0, Ll/᩷᩻ᩴ;->ۛ:I

    return v0
.end method

.method public final bridge synthetic values()Ljava/util/Collection;
    .locals 1

    .line 61
    invoke-virtual {p0}, Ll/᩷᩻ᩴ;->values()Ll/ۧᩳᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final values()Ll/ۧᩳᩴ;
    .locals 1

    .line 1306
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩺:Ll/ۧᩳᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۛܳᩴ;

    invoke-direct {v0, p0}, Ll/ۛܳᩴ;-><init>(Ll/᩷᩻ᩴ;)V

    iput-object v0, p0, Ll/᩷᩻ᩴ;->᩺:Ll/ۧᩳᩴ;

    .line 1341
    :cond_0
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩺:Ll/ۧᩳᩴ;

    return-object v0
.end method

.method public final ֫(FI)F
    .locals 4

    const/4 v0, 0x1

    if-nez p2, :cond_1

    .line 239
    iget-boolean v1, p0, Ll/᩷᩻ᩴ;->᩸:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/᩷᩻ᩴ;->ۤ:I

    goto :goto_2

    :cond_0
    iget v1, p0, Ll/᩷᩻ᩴ;->ۤ:I

    add-int/2addr v1, v0

    neg-int v1, v1

    goto :goto_2

    .line 241
    :cond_1
    iget-object v1, p0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 244
    invoke-static {p2}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v2, v3

    aget v3, v1, v2

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    if-ne p2, v3, :cond_3

    :goto_0
    move v1, v2

    goto :goto_2

    :cond_3
    add-int/2addr v2, v0

    .line 248
    iget v3, p0, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v2, v3

    aget v3, v1, v2

    if-nez v3, :cond_4

    :goto_1
    add-int/lit8 v2, v2, 0x1

    neg-int v1, v2

    goto :goto_2

    :cond_4
    if-ne p2, v3, :cond_3

    goto :goto_0

    :goto_2
    if-gez v1, :cond_7

    neg-int v1, v1

    sub-int/2addr v1, v0

    .line 254
    iget v2, p0, Ll/᩷᩻ᩴ;->ۤ:I

    if-ne v1, v2, :cond_5

    iput-boolean v0, p0, Ll/᩷᩻ᩴ;->᩸:Z

    .line 255
    :cond_5
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩶:[I

    aput p2, v0, v1

    .line 256
    iget-object p2, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    aput p1, p2, v1

    .line 257
    iget p1, p0, Ll/᩷᩻ᩴ;->ۛ:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Ll/᩷᩻ᩴ;->ۛ:I

    iget p2, p0, Ll/᩷᩻ᩴ;->۬:I

    if-lt p1, p2, :cond_6

    add-int/lit8 p1, p1, 0x2

    const/high16 p2, 0x3f400000    # 0.75f

    invoke-static {p2, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩷᩻ᩴ;->ܽ(I)V

    :cond_6
    const/4 p1, 0x0

    return p1

    .line 268
    :cond_7
    iget-object p2, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    aget v0, p2, v1

    .line 269
    aput p1, p2, v1

    return v0
.end method

.method public final ֫(F)Z
    .locals 5

    .line 397
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 398
    iget-object v1, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    .line 399
    iget-boolean v2, p0, Ll/᩷᩻ᩴ;->᩸:Z

    if-eqz v2, :cond_0

    iget v2, p0, Ll/᩷᩻ᩴ;->ۤ:I

    aget v2, v1, v2

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    if-ne v2, v3, :cond_0

    goto :goto_1

    .line 400
    :cond_0
    iget v2, p0, Ll/᩷᩻ᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_2

    aget v2, v0, v3

    if-eqz v2, :cond_1

    aget v2, v1, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    if-ne v2, v4, :cond_1

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

.method public final ֫(I)Z
    .locals 4

    if-nez p1, :cond_0

    .line 381
    iget-boolean p1, p0, Ll/᩷᩻ᩴ;->᩸:Z

    return p1

    .line 383
    :cond_0
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 386
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/᩷᩻ᩴ;->ۗ:I

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

    .line 390
    iget v2, p0, Ll/᩷᩻ᩴ;->ۗ:I

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

.method public final ۨ()Ll/ᩴۚᩴ;
    .locals 1

    .line 1143
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩹:Ll/ۙܳᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ᩳ᩻ᩴ;

    invoke-direct {v0, p0}, Ll/ᩳ᩻ᩴ;-><init>(Ll/᩷᩻ᩴ;)V

    iput-object v0, p0, Ll/᩷᩻ᩴ;->᩹:Ll/ۙܳᩴ;

    .line 1144
    :cond_0
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩹:Ll/ۙܳᩴ;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 9

    .line 1402
    iget-object v0, p0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 1403
    iget-object v1, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    add-int/lit8 v2, p1, -0x1

    add-int/lit8 v3, p1, 0x1

    .line 1405
    new-array v4, v3, [I

    .line 1406
    new-array v3, v3, [F

    .line 1407
    iget v5, p0, Ll/᩷᩻ᩴ;->ۤ:I

    .line 195
    iget-boolean v6, p0, Ll/᩷᩻ᩴ;->᩸:Z

    if-eqz v6, :cond_0

    iget v6, p0, Ll/᩷᩻ᩴ;->ۛ:I

    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    :cond_0
    iget v6, p0, Ll/᩷᩻ᩴ;->ۛ:I

    :goto_0
    add-int/lit8 v7, v6, -0x1

    if-eqz v6, :cond_3

    :goto_1
    add-int/lit8 v5, v5, -0x1

    .line 1409
    aget v6, v0, v5

    if-nez v6, :cond_1

    goto :goto_1

    .line 1410
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

    .line 1411
    :cond_2
    aget v8, v0, v5

    aput v8, v4, v6

    .line 1412
    aget v8, v1, v5

    aput v8, v3, v6

    move v6, v7

    goto :goto_0

    .line 1414
    :cond_3
    iget v0, p0, Ll/᩷᩻ᩴ;->ۤ:I

    aget v0, v1, v0

    aput v0, v3, p1

    .line 1415
    iput p1, p0, Ll/᩷᩻ᩴ;->ۤ:I

    .line 1416
    iput v2, p0, Ll/᩷᩻ᩴ;->ۗ:I

    const/high16 v0, 0x3f400000    # 0.75f

    .line 1417
    invoke-static {v0, p1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/᩷᩻ᩴ;->۬:I

    .line 1418
    iput-object v4, p0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 1419
    iput-object v3, p0, Ll/᩷᩻ᩴ;->ۨ:[F

    return-void
.end method
