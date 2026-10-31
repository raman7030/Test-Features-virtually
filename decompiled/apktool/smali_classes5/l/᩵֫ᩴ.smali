.class public final Ll/᩵֫ᩴ;
.super Ll/ܳܰۘ;
.source "97L"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۗ:Ll/ۨۧᩴ;

.field public transient ۙ:[C

.field public transient ۛ:I

.field public final transient ۤ:I

.field public ۨ:I

.field public transient ۫:I

.field public transient ۬:I

.field public transient ܰ:Ll/᩶֡ᩴ;

.field public final ᩶:F

.field public transient ᩸:Z

.field public transient ᩹:Ll/᩺۟ۘ;

.field public transient ᩺:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x10

    .line 120
    invoke-direct {p0, v0}, Ll/᩵֫ᩴ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_0

    const/high16 v0, 0x3f400000    # 0.75f

    .line 98
    iput v0, p0, Ll/᩵֫ᩴ;->᩶:F

    .line 99
    invoke-static {v0, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    iput p1, p0, Ll/᩵֫ᩴ;->ۛ:I

    iput p1, p0, Ll/᩵֫ᩴ;->ۤ:I

    add-int/lit8 v1, p1, -0x1

    .line 100
    iput v1, p0, Ll/᩵֫ᩴ;->۬:I

    .line 101
    invoke-static {v0, p1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/᩵֫ᩴ;->۫:I

    .line 102
    iget p1, p0, Ll/᩵֫ᩴ;->ۛ:I

    add-int/lit8 p1, p1, 0x1

    new-array v0, p1, [C

    iput-object v0, p0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 103
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    return-void

    .line 97
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The expected number of elements must be nonnegative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 8

    .line 1400
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1401
    iget v0, p0, Ll/᩵֫ᩴ;->ۨ:I

    iget v1, p0, Ll/᩵֫ᩴ;->᩶:F

    invoke-static {v1, v0}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    iput v0, p0, Ll/᩵֫ᩴ;->ۛ:I

    .line 1402
    invoke-static {v1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/᩵֫ᩴ;->۫:I

    .line 1403
    iget v0, p0, Ll/᩵֫ᩴ;->ۛ:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Ll/᩵֫ᩴ;->۬:I

    add-int/lit8 v1, v0, 0x1

    .line 1404
    new-array v1, v1, [C

    iput-object v1, p0, Ll/᩵֫ᩴ;->ۙ:[C

    const/4 v2, 0x1

    add-int/2addr v0, v2

    .line 1405
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    .line 1408
    iget v3, p0, Ll/᩵֫ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_2

    .line 1409
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readChar()C

    move-result v3

    .line 1410
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_0

    .line 1412
    iget v6, p0, Ll/᩵֫ᩴ;->ۛ:I

    .line 1413
    iput-boolean v2, p0, Ll/᩵֫ᩴ;->᩸:Z

    goto :goto_2

    .line 1415
    :cond_0
    invoke-static {v3}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    iget v7, p0, Ll/᩵֫ᩴ;->۬:I

    :goto_1
    and-int/2addr v6, v7

    .line 1416
    aget-char v7, v1, v6

    if-eqz v7, :cond_1

    add-int/lit8 v6, v6, 0x1

    iget v7, p0, Ll/᩵֫ᩴ;->۬:I

    goto :goto_1

    .line 1418
    :cond_1
    :goto_2
    aput-char v3, v1, v6

    .line 1419
    aput-object v5, v0, v6

    move v3, v4

    goto :goto_0

    :cond_2
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 6

    .line 1387
    iget-object v0, p0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 1388
    iget-object v1, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    .line 1389
    new-instance v2, Ll/ᩳ֫ᩴ;

    invoke-direct {v2, p0}, Ll/ᩳ֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    .line 1390
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1391
    iget v3, p0, Ll/᩵֫ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_0

    .line 1392
    invoke-virtual {v2}, Ll/ܺ֫ᩴ;->֫()I

    move-result v3

    .line 1393
    aget-char v5, v0, v3

    invoke-virtual {p1, v5}, Ljava/io/ObjectOutputStream;->writeChar(I)V

    .line 1394
    aget-object v3, v1, v3

    invoke-virtual {p1, v3}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    move v3, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫()Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    .line 220
    iput-boolean v0, p0, Ll/᩵֫ᩴ;->᩸:Z

    .line 221
    iget-object v0, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    iget v1, p0, Ll/᩵֫ᩴ;->ۛ:I

    aget-object v2, v0, v1

    const/4 v3, 0x0

    .line 222
    aput-object v3, v0, v1

    .line 223
    iget v0, p0, Ll/᩵֫ᩴ;->ۨ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩵֫ᩴ;->ۨ:I

    .line 224
    iget v3, p0, Ll/᩵֫ᩴ;->ۤ:I

    if-le v1, v3, :cond_0

    iget v3, p0, Ll/᩵֫ᩴ;->۫:I

    div-int/lit8 v3, v3, 0x4

    if-ge v0, v3, :cond_0

    const/16 v0, 0x10

    if-le v1, v0, :cond_0

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v1}, Ll/᩵֫ᩴ;->ܽ(I)V

    :cond_0
    return-object v2
.end method

.method public static synthetic ֫(Ll/᩵֫ᩴ;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ll/᩵֫ᩴ;->֫()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ֫(Ll/᩵֫ᩴ;I)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Ll/᩵֫ᩴ;->ܿ(I)Ljava/lang/Object;

    return-void
.end method

.method private ܿ(I)Ljava/lang/Object;
    .locals 8

    .line 211
    iget-object v0, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    aget-object v1, v0, p1

    const/4 v2, 0x0

    .line 212
    aput-object v2, v0, p1

    .line 213
    iget v3, p0, Ll/᩵֫ᩴ;->ۨ:I

    add-int/lit8 v3, v3, -0x1

    iput v3, p0, Ll/᩵֫ᩴ;->ۨ:I

    .line 281
    iget-object v3, p0, Ll/᩵֫ᩴ;->ۙ:[C

    :goto_0
    add-int/lit8 v4, p1, 0x1

    .line 284
    iget v5, p0, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v4, v5

    .line 286
    :goto_1
    aget-char v5, v3, v4

    if-nez v5, :cond_1

    const/4 v4, 0x0

    .line 287
    aput-char v4, v3, p1

    .line 288
    aput-object v2, v0, p1

    .line 215
    iget p1, p0, Ll/᩵֫ᩴ;->ۛ:I

    iget v0, p0, Ll/᩵֫ᩴ;->ۤ:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/᩵֫ᩴ;->ۨ:I

    iget v2, p0, Ll/᩵֫ᩴ;->۫:I

    div-int/lit8 v2, v2, 0x4

    if-ge v0, v2, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/᩵֫ᩴ;->ܽ(I)V

    :cond_0
    return-object v1

    .line 291
    :cond_1
    invoke-static {v5}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    iget v7, p0, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v6, v7

    if-gt p1, v4, :cond_2

    if-ge p1, v6, :cond_3

    if-le v6, v4, :cond_4

    goto :goto_2

    :cond_2
    if-lt p1, v6, :cond_4

    if-le v6, v4, :cond_4

    .line 295
    :cond_3
    :goto_2
    aput-char v5, v3, p1

    .line 296
    aget-object v5, v0, v4

    aput-object v5, v0, p1

    move p1, v4

    goto :goto_0

    :cond_4
    add-int/lit8 v4, v4, 0x1

    and-int/2addr v4, v7

    goto :goto_1
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 525
    iget v0, p0, Ll/᩵֫ᩴ;->ۨ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 526
    iput v0, p0, Ll/᩵֫ᩴ;->ۨ:I

    .line 527
    iput-boolean v0, p0, Ll/᩵֫ᩴ;->᩸:Z

    .line 528
    iget-object v1, p0, Ll/᩵֫ᩴ;->ۙ:[C

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([CC)V

    .line 529
    iget-object v0, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1347
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֫ᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    .line 1351
    iput-object v1, v0, Ll/᩵֫ᩴ;->ۗ:Ll/ۨۧᩴ;

    .line 1352
    iput-object v1, v0, Ll/᩵֫ᩴ;->ܰ:Ll/᩶֡ᩴ;

    .line 1353
    iput-object v1, v0, Ll/᩵֫ᩴ;->᩹:Ll/᩺۟ۘ;

    .line 1354
    iget-boolean v1, p0, Ll/᩵֫ᩴ;->᩸:Z

    iput-boolean v1, v0, Ll/᩵֫ᩴ;->᩸:Z

    .line 1355
    iget-object v1, p0, Ll/᩵֫ᩴ;->ۙ:[C

    invoke-virtual {v1}, [C->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [C

    iput-object v1, v0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 1356
    iget-object v1, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    return-object v0

    .line 1349
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 4

    .line 355
    iget-object v0, p0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 356
    iget-object v1, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    .line 357
    iget-boolean v2, p0, Ll/᩵֫ᩴ;->᩸:Z

    if-eqz v2, :cond_0

    iget v2, p0, Ll/᩵֫ᩴ;->ۛ:I

    aget-object v2, v1, v2

    invoke-static {v2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 358
    :cond_0
    iget v2, p0, Ll/᩵֫ᩴ;->ۛ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_2

    aget-char v2, v0, v3

    if-eqz v2, :cond_1

    aget-object v2, v1, v3

    invoke-static {v2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

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

.method public final hashCode()I
    .locals 8

    .line 1372
    iget-object v0, p0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 1373
    iget-object v1, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    .line 191
    iget-boolean v2, p0, Ll/᩵֫ᩴ;->᩸:Z

    if-eqz v2, :cond_0

    iget v2, p0, Ll/᩵֫ᩴ;->ۨ:I

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    iget v2, p0, Ll/᩵֫ᩴ;->ۨ:I

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    add-int/lit8 v6, v2, -0x1

    if-eqz v2, :cond_4

    .line 1375
    :goto_2
    aget-char v2, v0, v4

    if-nez v2, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1377
    :cond_1
    aget-object v7, v1, v4

    if-eq p0, v7, :cond_3

    if-nez v7, :cond_2

    const/4 v7, 0x0

    goto :goto_3

    :cond_2
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v7

    :goto_3
    xor-int/2addr v2, v7

    :cond_3
    add-int/2addr v5, v2

    add-int/lit8 v4, v4, 0x1

    move v2, v6

    goto :goto_1

    .line 1382
    :cond_4
    iget-boolean v0, p0, Ll/᩵֫ᩴ;->᩸:Z

    if-eqz v0, :cond_6

    iget v0, p0, Ll/᩵֫ᩴ;->ۛ:I

    aget-object v0, v1, v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v5, v3

    :cond_6
    return v5
.end method

.method public final isEmpty()Z
    .locals 1

    .line 539
    iget v0, p0, Ll/᩵֫ᩴ;->ۨ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 1158
    iget-object v0, p0, Ll/᩵֫ᩴ;->ۗ:Ll/ۨۧᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۜ֫ᩴ;

    invoke-direct {v0, p0}, Ll/ۜ֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    iput-object v0, p0, Ll/᩵֫ᩴ;->ۗ:Ll/ۨۧᩴ;

    .line 1159
    :cond_0
    iget-object v0, p0, Ll/᩵֫ᩴ;->ۗ:Ll/ۨۧᩴ;

    return-object v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 6

    .line 230
    iget v0, p0, Ll/᩵֫ᩴ;->᩶:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    .line 201
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 202
    iget v1, p0, Ll/᩵֫ᩴ;->ۛ:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/᩵֫ᩴ;->ܽ(I)V

    goto :goto_0

    .line 534
    :cond_0
    iget v1, p0, Ll/᩵֫ᩴ;->ۨ:I

    .line 231
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    add-int/2addr v2, v1

    int-to-long v1, v2

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-double v0, v1

    .line 206
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

    .line 207
    iget v0, p0, Ll/᩵֫ᩴ;->ۛ:I

    if-le v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ll/᩵֫ᩴ;->ܽ(I)V

    .line 233
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/ܳܰۘ;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final size()I
    .locals 1

    .line 534
    iget v0, p0, Ll/᩵֫ᩴ;->ۨ:I

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1217
    iget-object v0, p0, Ll/᩵֫ᩴ;->ܰ:Ll/᩶֡ᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ܽ֫ᩴ;

    invoke-direct {v0, p0}, Ll/ܽ֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    iput-object v0, p0, Ll/᩵֫ᩴ;->ܰ:Ll/᩶֡ᩴ;

    .line 1252
    :cond_0
    iget-object v0, p0, Ll/᩵֫ᩴ;->ܰ:Ll/᩶֡ᩴ;

    return-object v0
.end method

.method public final ֫(CLjava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x1

    if-nez p1, :cond_1

    .line 237
    iget-boolean v1, p0, Ll/᩵֫ᩴ;->᩸:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/᩵֫ᩴ;->ۛ:I

    goto :goto_2

    :cond_0
    iget v1, p0, Ll/᩵֫ᩴ;->ۛ:I

    add-int/2addr v1, v0

    neg-int v1, v1

    goto :goto_2

    .line 239
    :cond_1
    iget-object v1, p0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 242
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-char v3, v1, v2

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    if-ne p1, v3, :cond_3

    :goto_0
    move v1, v2

    goto :goto_2

    :cond_3
    add-int/2addr v2, v0

    .line 246
    iget v3, p0, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-char v3, v1, v2

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

    .line 252
    iget v2, p0, Ll/᩵֫ᩴ;->ۛ:I

    if-ne v1, v2, :cond_5

    iput-boolean v0, p0, Ll/᩵֫ᩴ;->᩸:Z

    .line 253
    :cond_5
    iget-object v0, p0, Ll/᩵֫ᩴ;->ۙ:[C

    aput-char p1, v0, v1

    .line 254
    iget-object p1, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    aput-object p2, p1, v1

    .line 255
    iget p1, p0, Ll/᩵֫ᩴ;->ۨ:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Ll/᩵֫ᩴ;->ۨ:I

    iget p2, p0, Ll/᩵֫ᩴ;->۫:I

    if-lt p1, p2, :cond_6

    add-int/lit8 p1, p1, 0x2

    iget p2, p0, Ll/᩵֫ᩴ;->᩶:F

    invoke-static {p2, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩵֫ᩴ;->ܽ(I)V

    :cond_6
    const/4 p1, 0x0

    return-object p1

    .line 266
    :cond_7
    iget-object p1, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    aget-object v0, p1, v1

    .line 267
    aput-object p2, p1, v1

    return-object v0
.end method

.method public final ֫(C)Z
    .locals 4

    if-nez p1, :cond_0

    .line 339
    iget-boolean p1, p0, Ll/᩵֫ᩴ;->᩸:Z

    return p1

    .line 341
    :cond_0
    iget-object v0, p0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 344
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-char v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    if-ne p1, v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v1, v3

    .line 348
    iget v2, p0, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-char v2, v0, v1

    if-nez v2, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    if-ne p1, v2, :cond_2

    :goto_1
    return v3
.end method

.method public final ۧ(C)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 322
    iget-boolean p1, p0, Ll/᩵֫ᩴ;->᩸:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    iget v0, p0, Ll/᩵֫ᩴ;->ۛ:I

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    return-object v0

    .line 324
    :cond_1
    iget-object v1, p0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 327
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-char v3, v1, v2

    if-nez v3, :cond_2

    return-object v0

    :cond_2
    if-ne p1, v3, :cond_3

    .line 328
    iget-object p1, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    aget-object p1, p1, v2

    return-object p1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 331
    iget v3, p0, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-char v3, v1, v2

    if-nez v3, :cond_4

    return-object v0

    :cond_4
    if-ne p1, v3, :cond_3

    .line 332
    iget-object p1, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    aget-object p1, p1, v2

    return-object p1
.end method

.method public final ܳ()Ll/ᩴۚᩴ;
    .locals 1

    .line 1054
    iget-object v0, p0, Ll/᩵֫ᩴ;->᩹:Ll/᩺۟ۘ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۡ֫ᩴ;

    invoke-direct {v0, p0}, Ll/ۡ֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    iput-object v0, p0, Ll/᩵֫ᩴ;->᩹:Ll/᩺۟ۘ;

    .line 1055
    :cond_0
    iget-object v0, p0, Ll/᩵֫ᩴ;->᩹:Ll/᩺۟ۘ;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 9

    .line 1313
    iget-object v0, p0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 1314
    iget-object v1, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    add-int/lit8 v2, p1, -0x1

    add-int/lit8 v3, p1, 0x1

    .line 1316
    new-array v4, v3, [C

    .line 1317
    new-array v3, v3, [Ljava/lang/Object;

    .line 1318
    iget v5, p0, Ll/᩵֫ᩴ;->ۛ:I

    .line 191
    iget-boolean v6, p0, Ll/᩵֫ᩴ;->᩸:Z

    if-eqz v6, :cond_0

    iget v6, p0, Ll/᩵֫ᩴ;->ۨ:I

    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    :cond_0
    iget v6, p0, Ll/᩵֫ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v7, v6, -0x1

    if-eqz v6, :cond_3

    :goto_1
    add-int/lit8 v5, v5, -0x1

    .line 1320
    aget-char v6, v0, v5

    if-nez v6, :cond_1

    goto :goto_1

    .line 1321
    :cond_1
    invoke-static {v6}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    and-int/2addr v6, v2

    aget-char v8, v4, v6

    if-eqz v8, :cond_2

    :goto_2
    add-int/lit8 v6, v6, 0x1

    and-int/2addr v6, v2

    aget-char v8, v4, v6

    if-eqz v8, :cond_2

    goto :goto_2

    .line 1322
    :cond_2
    aget-char v8, v0, v5

    aput-char v8, v4, v6

    .line 1323
    aget-object v8, v1, v5

    aput-object v8, v3, v6

    move v6, v7

    goto :goto_0

    .line 1325
    :cond_3
    iget v0, p0, Ll/᩵֫ᩴ;->ۛ:I

    aget-object v0, v1, v0

    aput-object v0, v3, p1

    .line 1326
    iput p1, p0, Ll/᩵֫ᩴ;->ۛ:I

    .line 1327
    iput v2, p0, Ll/᩵֫ᩴ;->۬:I

    .line 1328
    iget v0, p0, Ll/᩵֫ᩴ;->᩶:F

    invoke-static {v0, p1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/᩵֫ᩴ;->۫:I

    .line 1329
    iput-object v4, p0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 1330
    iput-object v3, p0, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    return-void
.end method

.method public final ܿ(C)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 304
    iget-boolean p1, p0, Ll/᩵֫ᩴ;->᩸:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Ll/᩵֫ᩴ;->֫()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0

    .line 308
    :cond_1
    iget-object v1, p0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 311
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-char v3, v1, v2

    if-nez v3, :cond_2

    return-object v0

    :cond_2
    if-ne p1, v3, :cond_3

    .line 312
    invoke-direct {p0, v2}, Ll/᩵֫ᩴ;->ܿ(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 314
    iget v3, p0, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-char v3, v1, v2

    if-nez v3, :cond_4

    return-object v0

    :cond_4
    if-ne p1, v3, :cond_3

    .line 315
    invoke-direct {p0, v2}, Ll/᩵֫ᩴ;->ܿ(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
