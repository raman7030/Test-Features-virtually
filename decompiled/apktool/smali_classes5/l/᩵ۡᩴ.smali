.class public final Ll/᩵ۡᩴ;
.super Ll/ۨܿᩴ;
.source "0C94"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۗ:I

.field public transient ۙ:[I

.field public final transient ۛ:I

.field public transient ۤ:I

.field public transient ۨ:I

.field public transient ۫:I

.field public transient ۬:[J

.field public transient ᩶:I

.field public transient ᩸:Z

.field public final ᩹:F

.field public ᩺:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    const/4 v0, -0x1

    .line 88
    iput v0, p0, Ll/᩵ۡᩴ;->᩶:I

    .line 93
    iput v0, p0, Ll/᩵ۡᩴ;->ۗ:I

    const/high16 v0, 0x3f400000    # 0.75f

    .line 126
    iput v0, p0, Ll/᩵ۡᩴ;->᩹:F

    const/16 v1, 0x10

    .line 127
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v1

    iput v1, p0, Ll/᩵ۡᩴ;->ۨ:I

    iput v1, p0, Ll/᩵ۡᩴ;->ۛ:I

    add-int/lit8 v2, v1, -0x1

    .line 128
    iput v2, p0, Ll/᩵ۡᩴ;->۫:I

    .line 129
    invoke-static {v0, v1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/᩵ۡᩴ;->ۤ:I

    .line 130
    iget v0, p0, Ll/᩵ۡᩴ;->ۨ:I

    add-int/lit8 v0, v0, 0x1

    new-array v1, v0, [I

    iput-object v1, p0, Ll/᩵ۡᩴ;->ۙ:[I

    .line 131
    new-array v0, v0, [J

    iput-object v0, p0, Ll/᩵ۡᩴ;->۬:[J

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 15

    move-object v0, p0

    .line 1266
    invoke-virtual/range {p1 .. p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1267
    iget v1, v0, Ll/᩵ۡᩴ;->᩺:I

    iget v2, v0, Ll/᩵ۡᩴ;->᩹:F

    invoke-static {v2, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v1

    iput v1, v0, Ll/᩵ۡᩴ;->ۨ:I

    .line 1268
    invoke-static {v2, v1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v1

    iput v1, v0, Ll/᩵ۡᩴ;->ۤ:I

    .line 1269
    iget v1, v0, Ll/᩵ۡᩴ;->ۨ:I

    add-int/lit8 v2, v1, -0x1

    iput v2, v0, Ll/᩵ۡᩴ;->۫:I

    add-int/lit8 v2, v1, 0x1

    .line 1270
    new-array v2, v2, [I

    iput-object v2, v0, Ll/᩵ۡᩴ;->ۙ:[I

    const/4 v3, 0x1

    add-int/2addr v1, v3

    .line 1271
    new-array v1, v1, [J

    iput-object v1, v0, Ll/᩵ۡᩴ;->۬:[J

    const/4 v4, -0x1

    .line 1273
    iput v4, v0, Ll/᩵ۡᩴ;->ۗ:I

    iput v4, v0, Ll/᩵ۡᩴ;->᩶:I

    .line 1275
    iget v5, v0, Ll/᩵ۡᩴ;->᩺:I

    const/4 v6, -0x1

    :goto_0
    add-int/lit8 v7, v5, -0x1

    if-eqz v5, :cond_3

    .line 1276
    invoke-virtual/range {p1 .. p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v5

    if-nez v5, :cond_0

    .line 1278
    iget v8, v0, Ll/᩵ۡᩴ;->ۨ:I

    .line 1279
    iput-boolean v3, v0, Ll/᩵ۡᩴ;->᩸:Z

    goto :goto_2

    .line 1281
    :cond_0
    invoke-static {v5}, Ll/ܰۛۡ;->֫(I)I

    move-result v8

    iget v9, v0, Ll/᩵ۡᩴ;->۫:I

    and-int/2addr v8, v9

    aget v9, v2, v8

    if-eqz v9, :cond_1

    :goto_1
    add-int/2addr v8, v3

    iget v9, v0, Ll/᩵ۡᩴ;->۫:I

    and-int/2addr v8, v9

    aget v9, v2, v8

    if-eqz v9, :cond_1

    goto :goto_1

    .line 1283
    :cond_1
    :goto_2
    aput v5, v2, v8

    .line 1284
    iget v5, v0, Ll/᩵ۡᩴ;->᩶:I

    const-wide v9, -0x100000000L

    if-eq v5, v4, :cond_2

    .line 1285
    aget-wide v11, v1, v6

    const-wide v13, 0xffffffffL

    int-to-long v3, v8

    and-long/2addr v3, v13

    xor-long/2addr v3, v11

    and-long/2addr v3, v13

    xor-long/2addr v3, v11

    aput-wide v3, v1, v6

    .line 1286
    aget-wide v3, v1, v8

    int-to-long v11, v6

    and-long/2addr v11, v13

    const/16 v6, 0x20

    shl-long/2addr v11, v6

    xor-long/2addr v11, v3

    and-long/2addr v9, v11

    xor-long/2addr v3, v9

    aput-wide v3, v1, v8

    goto :goto_3

    .line 1289
    :cond_2
    iput v8, v0, Ll/᩵ۡᩴ;->᩶:I

    .line 1291
    aget-wide v3, v1, v8

    or-long/2addr v3, v9

    aput-wide v3, v1, v8

    :goto_3
    move v5, v7

    move v6, v8

    const/4 v3, 0x1

    const/4 v4, -0x1

    goto :goto_0

    :cond_3
    const-wide v2, 0xffffffffL

    .line 1294
    iput v6, v0, Ll/᩵ۡᩴ;->ۗ:I

    const/4 v4, -0x1

    if-eq v6, v4, :cond_4

    .line 1297
    aget-wide v4, v1, v6

    or-long/2addr v2, v4

    aput-wide v2, v1, v6

    :cond_4
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 1082
    new-instance v0, Ll/ᩴۡᩴ;

    invoke-direct {v0, p0}, Ll/ᩴۡᩴ;-><init>(Ll/᩵ۡᩴ;)V

    .line 1261
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1262
    iget v1, p0, Ll/᩵ۡᩴ;->᩺:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/ᩴۡᩴ;->nextInt()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    move v1, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(J)V
    .locals 2

    long-to-float p1, p1

    .line 414
    iget p2, p0, Ll/᩵ۡᩴ;->᩹:F

    div-float/2addr p1, p2

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-long p1, p1

    invoke-static {p1, p2}, Ll/ܰۛۡ;->֫(J)J

    move-result-wide p1

    const-wide/16 v0, 0x2

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    const-wide/32 v0, 0x40000000

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    .line 415
    iget p1, p0, Ll/᩵ۡᩴ;->ۨ:I

    if-le p2, p1, :cond_0

    invoke-virtual {p0, p2}, Ll/᩵ۡᩴ;->ᩳ(I)V

    :cond_0
    return-void
.end method

.method private ܿ(I)V
    .locals 5

    .line 494
    iget v0, p0, Ll/᩵ۡᩴ;->᩺:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩵ۡᩴ;->᩺:I

    .line 495
    invoke-virtual {p0, p1}, Ll/᩵ۡᩴ;->֫(I)V

    .line 476
    iget-object v0, p0, Ll/᩵ۡᩴ;->ۙ:[I

    :goto_0
    add-int/lit8 v1, p1, 0x1

    .line 478
    iget v2, p0, Ll/᩵ۡᩴ;->۫:I

    and-int/2addr v1, v2

    .line 480
    :goto_1
    aget v2, v0, v1

    if-nez v2, :cond_1

    const/4 v1, 0x0

    .line 481
    aput v1, v0, p1

    .line 497
    iget p1, p0, Ll/᩵ۡᩴ;->ۨ:I

    iget v0, p0, Ll/᩵ۡᩴ;->ۛ:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/᩵ۡᩴ;->᩺:I

    iget v1, p0, Ll/᩵ۡᩴ;->ۤ:I

    div-int/lit8 v1, v1, 0x4

    if-ge v0, v1, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/᩵ۡᩴ;->ᩳ(I)V

    :cond_0
    return-void

    .line 484
    :cond_1
    invoke-static {v2}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, p0, Ll/᩵ۡᩴ;->۫:I

    and-int/2addr v3, v4

    if-gt p1, v1, :cond_2

    if-ge p1, v3, :cond_3

    if-le v3, v1, :cond_4

    goto :goto_2

    :cond_2
    if-lt p1, v3, :cond_4

    if-le v3, v1, :cond_4

    .line 488
    :cond_3
    :goto_2
    aput v2, v0, p1

    .line 489
    invoke-virtual {p0, v1, p1}, Ll/᩵ۡᩴ;->ۧ(II)V

    move p1, v1

    goto :goto_0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    and-int/2addr v1, v4

    goto :goto_1
.end method


# virtual methods
.method public final add(I)Z
    .locals 10

    const/4 v0, 0x1

    if-nez p1, :cond_1

    .line 439
    iget-boolean p1, p0, Ll/᩵ۡᩴ;->᩸:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 440
    :cond_0
    iget p1, p0, Ll/᩵ۡᩴ;->ۨ:I

    .line 441
    iput-boolean v0, p0, Ll/᩵ۡᩴ;->᩸:Z

    goto :goto_1

    .line 444
    :cond_1
    iget-object v1, p0, Ll/᩵ۡᩴ;->ۙ:[I

    .line 446
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/᩵ۡᩴ;->۫:I

    and-int/2addr v2, v3

    aget v3, v1, v2

    if-eqz v3, :cond_3

    if-ne v3, p1, :cond_2

    goto :goto_0

    :cond_2
    add-int/2addr v2, v0

    .line 448
    iget v3, p0, Ll/᩵ۡᩴ;->۫:I

    and-int/2addr v2, v3

    aget v3, v1, v2

    if-eqz v3, :cond_3

    if-ne v3, p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 450
    :cond_3
    aput p1, v1, v2

    move p1, v2

    .line 452
    :goto_1
    iget v1, p0, Ll/᩵ۡᩴ;->᩺:I

    if-nez v1, :cond_4

    .line 453
    iput p1, p0, Ll/᩵ۡᩴ;->ۗ:I

    iput p1, p0, Ll/᩵ۡᩴ;->᩶:I

    .line 455
    iget-object v2, p0, Ll/᩵ۡᩴ;->۬:[J

    const-wide/16 v3, -0x1

    aput-wide v3, v2, p1

    goto :goto_2

    .line 457
    :cond_4
    iget-object v2, p0, Ll/᩵ۡᩴ;->۬:[J

    iget v3, p0, Ll/᩵ۡᩴ;->ۗ:I

    aget-wide v4, v2, v3

    int-to-long v6, p1

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    xor-long/2addr v6, v4

    and-long/2addr v6, v8

    xor-long/2addr v4, v6

    aput-wide v4, v2, v3

    int-to-long v3, v3

    and-long/2addr v3, v8

    const/16 v5, 0x20

    shl-long/2addr v3, v5

    or-long/2addr v3, v8

    .line 458
    aput-wide v3, v2, p1

    .line 459
    iput p1, p0, Ll/᩵ۡᩴ;->ۗ:I

    :goto_2
    add-int/lit8 p1, v1, 0x1

    .line 461
    iput p1, p0, Ll/᩵ۡᩴ;->᩺:I

    iget p1, p0, Ll/᩵ۡᩴ;->ۤ:I

    if-lt v1, p1, :cond_5

    add-int/lit8 v1, v1, 0x2

    iget p1, p0, Ll/᩵ۡᩴ;->᩹:F

    invoke-static {p1, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩵ۡᩴ;->ᩳ(I)V

    :cond_5
    return v0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 6

    .line 429
    iget v0, p0, Ll/᩵ۡᩴ;->᩹:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 409
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 410
    iget v1, p0, Ll/᩵ۡᩴ;->ۨ:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/᩵ۡᩴ;->ᩳ(I)V

    goto :goto_0

    .line 742
    :cond_0
    iget v0, p0, Ll/᩵ۡᩴ;->᩺:I

    .line 430
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    int-to-long v0, v1

    invoke-direct {p0, v0, v1}, Ll/᩵ۡᩴ;->֫(J)V

    .line 432
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/᩸ܿᩴ;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 2

    .line 733
    iget v0, p0, Ll/᩵ۡᩴ;->᩺:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 734
    iput v0, p0, Ll/᩵ۡᩴ;->᩺:I

    .line 735
    iput-boolean v0, p0, Ll/᩵ۡᩴ;->᩸:Z

    .line 736
    iget-object v1, p0, Ll/᩵ۡᩴ;->ۙ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    const/4 v0, -0x1

    .line 737
    iput v0, p0, Ll/᩵ۡᩴ;->ۗ:I

    iput v0, p0, Ll/᩵ۡᩴ;->᩶:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1227
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ۡᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1231
    iget-object v1, p0, Ll/᩵ۡᩴ;->ۙ:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Ll/᩵ۡᩴ;->ۙ:[I

    .line 1232
    iget-boolean v1, p0, Ll/᩵ۡᩴ;->᩸:Z

    iput-boolean v1, v0, Ll/᩵ۡᩴ;->᩸:Z

    .line 1233
    iget-object v1, p0, Ll/᩵ۡᩴ;->۬:[J

    invoke-virtual {v1}, [J->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [J

    iput-object v1, v0, Ll/᩵ۡᩴ;->۬:[J

    return-object v0

    .line 1229
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final bridge synthetic comparator()Ljava/util/Comparator;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final comparator()Ll/ۙۢᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final contains(I)Z
    .locals 4

    if-nez p1, :cond_0

    .line 530
    iget-boolean p1, p0, Ll/᩵ۡᩴ;->᩸:Z

    return p1

    .line 532
    :cond_0
    iget-object v0, p0, Ll/᩵ۡᩴ;->ۙ:[I

    .line 535
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/᩵ۡᩴ;->۫:I

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

    .line 538
    iget v2, p0, Ll/᩵ۡᩴ;->۫:I

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

.method public final forEach(Ljava/util/function/IntConsumer;)V
    .locals 4

    .line 1108
    iget v0, p0, Ll/᩵ۡᩴ;->᩶:I

    :goto_0
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1111
    iget-object v1, p0, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v2, v1, v0

    long-to-int v1, v2

    .line 1113
    iget-object v2, p0, Ll/᩵ۡᩴ;->ۙ:[I

    aget v0, v2, v0

    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    move v0, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hashCode()I
    .locals 5

    .line 1249
    iget-object v0, p0, Ll/᩵ۡᩴ;->ۙ:[I

    .line 399
    iget-boolean v1, p0, Ll/᩵ۡᩴ;->᩸:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/᩵ۡᩴ;->᩺:I

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget v1, p0, Ll/᩵ۡᩴ;->᩺:I

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    add-int/lit8 v4, v1, -0x1

    if-eqz v1, :cond_2

    .line 1251
    :goto_2
    aget v1, v0, v3

    if-nez v1, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    add-int/2addr v2, v1

    add-int/lit8 v3, v3, 0x1

    move v1, v4

    goto :goto_1

    :cond_2
    return v2
.end method

.method public final isEmpty()Z
    .locals 1

    .line 747
    iget v0, p0, Ll/᩵ۡᩴ;->᩺:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1082
    new-instance v0, Ll/ᩴۡᩴ;

    invoke-direct {v0, p0}, Ll/ᩴۡᩴ;-><init>(Ll/᩵ۡᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/ۜۡᩴ;
    .locals 1

    .line 1082
    new-instance v0, Ll/ᩴۡᩴ;

    invoke-direct {v0, p0}, Ll/ᩴۡᩴ;-><init>(Ll/᩵ۡᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/ܶۡᩴ;
    .locals 1

    .line 1082
    new-instance v0, Ll/ᩴۡᩴ;

    invoke-direct {v0, p0}, Ll/ᩴۡᩴ;-><init>(Ll/᩵ۡᩴ;)V

    return-object v0
.end method

.method public final remove(I)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    .line 513
    iget-boolean p1, p0, Ll/᩵ۡᩴ;->᩸:Z

    if-eqz p1, :cond_4

    .line 502
    iput-boolean v0, p0, Ll/᩵ۡᩴ;->᩸:Z

    .line 503
    iget-object p1, p0, Ll/᩵ۡᩴ;->ۙ:[I

    iget v2, p0, Ll/᩵ۡᩴ;->ۨ:I

    aput v0, p1, v2

    .line 504
    iget p1, p0, Ll/᩵ۡᩴ;->᩺:I

    sub-int/2addr p1, v1

    iput p1, p0, Ll/᩵ۡᩴ;->᩺:I

    .line 505
    invoke-virtual {p0, v2}, Ll/᩵ۡᩴ;->֫(I)V

    .line 506
    iget p1, p0, Ll/᩵ۡᩴ;->ۨ:I

    iget v0, p0, Ll/᩵ۡᩴ;->ۛ:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/᩵ۡᩴ;->᩺:I

    iget v2, p0, Ll/᩵ۡᩴ;->ۤ:I

    div-int/lit8 v2, v2, 0x4

    if-ge v0, v2, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/᩵ۡᩴ;->ᩳ(I)V

    :cond_0
    return v1

    .line 517
    :cond_1
    iget-object v2, p0, Ll/᩵ۡᩴ;->ۙ:[I

    .line 520
    invoke-static {p1}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, p0, Ll/᩵ۡᩴ;->۫:I

    and-int/2addr v3, v4

    aget v4, v2, v3

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    if-ne p1, v4, :cond_3

    .line 521
    invoke-direct {p0, v3}, Ll/᩵ۡᩴ;->ܿ(I)V

    return v1

    :cond_3
    add-int/2addr v3, v1

    .line 523
    iget v4, p0, Ll/᩵ۡᩴ;->۫:I

    and-int/2addr v3, v4

    aget v4, v2, v3

    if-nez v4, :cond_5

    :cond_4
    :goto_0
    return v0

    :cond_5
    if-ne p1, v4, :cond_3

    .line 524
    invoke-direct {p0, v3}, Ll/᩵ۡᩴ;->ܿ(I)V

    return v1
.end method

.method public final size()I
    .locals 1

    .line 742
    iget v0, p0, Ll/᩵ۡᩴ;->᩺:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩵ۡᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 75
    invoke-virtual {p0}, Ll/᩵ۡᩴ;->spliterator()Ll/ܽܺᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܽܺᩴ;
    .locals 5

    .line 1082
    new-instance v0, Ll/ᩴۡᩴ;

    invoke-direct {v0, p0}, Ll/ᩴۡᩴ;-><init>(Ll/᩵ۡᩴ;)V

    .line 1102
    invoke-static {p0}, Ll/ۘ᩺ۘ;->֫(Ljava/util/Collection;)J

    move-result-wide v1

    .line 1455
    new-instance v3, Ll/ۡܺᩴ;

    const/16 v4, 0x151

    invoke-direct {v3, v0, v1, v2, v4}, Ll/ۡܺᩴ;-><init>(Ll/ۜۡᩴ;JI)V

    return-object v3
.end method

.method public final ֡()I
    .locals 2

    .line 825
    iget v0, p0, Ll/᩵ۡᩴ;->᩺:I

    if-eqz v0, :cond_0

    .line 826
    iget-object v0, p0, Ll/᩵ۡᩴ;->ۙ:[I

    iget v1, p0, Ll/᩵ۡᩴ;->᩶:I

    aget v0, v0, v1

    return v0

    .line 825
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ֫(I)V
    .locals 12

    .line 757
    iget v0, p0, Ll/᩵ۡᩴ;->᩺:I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    .line 758
    iput p1, p0, Ll/᩵ۡᩴ;->ۗ:I

    iput p1, p0, Ll/᩵ۡᩴ;->᩶:I

    return-void

    .line 761
    :cond_0
    iget v0, p0, Ll/᩵ۡᩴ;->᩶:I

    const-wide v1, -0x100000000L

    if-ne v0, p1, :cond_1

    .line 762
    iget-object v0, p0, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v3, v0, p1

    long-to-int p1, v3

    iput p1, p0, Ll/᩵ۡᩴ;->᩶:I

    if-ltz p1, :cond_2

    .line 765
    aget-wide v3, v0, p1

    or-long/2addr v1, v3

    aput-wide v1, v0, p1

    return-void

    .line 769
    :cond_1
    iget v0, p0, Ll/᩵ۡᩴ;->ۗ:I

    const/16 v3, 0x20

    const-wide v4, 0xffffffffL

    if-ne v0, p1, :cond_3

    .line 770
    iget-object v0, p0, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v1, v0, p1

    ushr-long/2addr v1, v3

    long-to-int p1, v1

    iput p1, p0, Ll/᩵ۡᩴ;->ۗ:I

    if-ltz p1, :cond_2

    .line 773
    aget-wide v1, v0, p1

    or-long/2addr v1, v4

    aput-wide v1, v0, p1

    :cond_2
    return-void

    .line 777
    :cond_3
    iget-object v0, p0, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v6, v0, p1

    ushr-long v8, v6, v3

    long-to-int p1, v8

    long-to-int v3, v6

    .line 780
    aget-wide v8, v0, p1

    and-long v10, v6, v4

    xor-long/2addr v10, v8

    and-long/2addr v4, v10

    xor-long/2addr v4, v8

    aput-wide v4, v0, p1

    .line 781
    aget-wide v4, v0, v3

    and-long/2addr v6, v1

    xor-long/2addr v6, v4

    and-long/2addr v1, v6

    xor-long/2addr v1, v4

    aput-wide v1, v0, v3

    return-void
.end method

.method public final ֫(Ll/֨ۢᩴ;)Z
    .locals 6

    .line 420
    iget v0, p0, Ll/᩵ۡᩴ;->᩹:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 409
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 410
    iget v1, p0, Ll/᩵ۡᩴ;->ۨ:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/᩵ۡᩴ;->ᩳ(I)V

    goto :goto_0

    .line 742
    :cond_0
    iget v0, p0, Ll/᩵ۡᩴ;->᩺:I

    .line 421
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    int-to-long v0, v1

    invoke-direct {p0, v0, v1}, Ll/᩵ۡᩴ;->֫(J)V

    .line 423
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/᩸ܿᩴ;->֫(Ll/֨ۢᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ۗ()Ll/ܶۡᩴ;
    .locals 1

    .line 1082
    new-instance v0, Ll/ᩴۡᩴ;

    invoke-direct {v0, p0}, Ll/ᩴۡᩴ;-><init>(Ll/᩵ۡᩴ;)V

    return-object v0
.end method

.method public final ۧ(II)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 792
    iget v3, v0, Ll/᩵ۡᩴ;->᩺:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    .line 793
    iput v2, v0, Ll/᩵ۡᩴ;->ۗ:I

    iput v2, v0, Ll/᩵ۡᩴ;->᩶:I

    .line 795
    iget-object v1, v0, Ll/᩵ۡᩴ;->۬:[J

    const-wide/16 v3, -0x1

    aput-wide v3, v1, v2

    return-void

    .line 798
    :cond_0
    iget v3, v0, Ll/᩵ۡᩴ;->᩶:I

    const-wide v4, -0x100000000L

    const/16 v6, 0x20

    const-wide v7, 0xffffffffL

    if-ne v3, v1, :cond_1

    .line 799
    iput v2, v0, Ll/᩵ۡᩴ;->᩶:I

    .line 800
    iget-object v3, v0, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v9, v3, v1

    long-to-int v11, v9

    aget-wide v12, v3, v11

    long-to-int v10, v9

    aget-wide v9, v3, v10

    int-to-long v14, v2

    and-long/2addr v7, v14

    shl-long v6, v7, v6

    xor-long/2addr v6, v9

    and-long/2addr v4, v6

    xor-long/2addr v4, v12

    aput-wide v4, v3, v11

    .line 801
    aget-wide v4, v3, v1

    aput-wide v4, v3, v2

    return-void

    .line 804
    :cond_1
    iget v3, v0, Ll/᩵ۡᩴ;->ۗ:I

    if-ne v3, v1, :cond_2

    .line 805
    iput v2, v0, Ll/᩵ۡᩴ;->ۗ:I

    .line 806
    iget-object v3, v0, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v4, v3, v1

    ushr-long v9, v4, v6

    long-to-int v10, v9

    aget-wide v11, v3, v10

    ushr-long/2addr v4, v6

    long-to-int v5, v4

    aget-wide v4, v3, v5

    int-to-long v13, v2

    and-long/2addr v13, v7

    xor-long/2addr v4, v13

    and-long/2addr v4, v7

    xor-long/2addr v4, v11

    aput-wide v4, v3, v10

    .line 807
    aget-wide v4, v3, v1

    aput-wide v4, v3, v2

    return-void

    .line 810
    :cond_2
    iget-object v3, v0, Ll/᩵ۡᩴ;->۬:[J

    aget-wide v9, v3, v1

    ushr-long v11, v9, v6

    long-to-int v1, v11

    long-to-int v11, v9

    .line 813
    aget-wide v12, v3, v1

    int-to-long v14, v2

    and-long/2addr v14, v7

    xor-long v16, v12, v14

    and-long v7, v16, v7

    xor-long/2addr v7, v12

    aput-wide v7, v3, v1

    .line 814
    aget-wide v7, v3, v11

    shl-long v12, v14, v6

    xor-long/2addr v12, v7

    and-long/2addr v4, v12

    xor-long/2addr v4, v7

    aput-wide v4, v3, v11

    .line 815
    aput-wide v9, v3, v2

    return-void
.end method

.method public final ܳ(I)Ll/֫ܺᩴ;
    .locals 0

    .line 847
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ܽ(II)Ll/֫ܺᩴ;
    .locals 0

    .line 867
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ᩳ(I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 1175
    iget-object v2, v0, Ll/᩵ۡᩴ;->ۙ:[I

    add-int/lit8 v3, v1, -0x1

    add-int/lit8 v4, v1, 0x1

    .line 1177
    new-array v5, v4, [I

    .line 1178
    iget v6, v0, Ll/᩵ۡᩴ;->᩶:I

    .line 1179
    iget-object v7, v0, Ll/᩵ۡᩴ;->۬:[J

    .line 1180
    new-array v4, v4, [J

    const/4 v8, -0x1

    .line 1181
    iput v8, v0, Ll/᩵ۡᩴ;->᩶:I

    .line 1182
    iget v9, v0, Ll/᩵ۡᩴ;->᩺:I

    const/4 v10, -0x1

    const/4 v11, -0x1

    :goto_0
    add-int/lit8 v12, v9, -0x1

    if-eqz v9, :cond_3

    .line 1183
    aget v9, v2, v6

    if-nez v9, :cond_0

    move v9, v1

    goto :goto_2

    .line 1185
    :cond_0
    invoke-static {v9}, Ll/ܰۛۡ;->֫(I)I

    move-result v9

    :goto_1
    and-int/2addr v9, v3

    .line 1186
    aget v13, v5, v9

    if-eqz v13, :cond_1

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 1188
    :cond_1
    :goto_2
    aget v13, v2, v6

    aput v13, v5, v9

    if-eq v11, v8, :cond_2

    .line 1190
    aget-wide v13, v4, v10

    const-wide v15, 0xffffffffL

    move/from16 v17, v12

    int-to-long v11, v9

    and-long/2addr v11, v15

    xor-long/2addr v11, v13

    and-long/2addr v11, v15

    xor-long/2addr v11, v13

    aput-wide v11, v4, v10

    .line 1191
    aget-wide v11, v4, v9

    int-to-long v13, v10

    and-long/2addr v13, v15

    const/16 v10, 0x20

    shl-long/2addr v13, v10

    xor-long/2addr v13, v11

    const-wide v15, -0x100000000L

    and-long/2addr v13, v15

    xor-long v10, v13, v11

    aput-wide v10, v4, v9

    goto :goto_3

    :cond_2
    move/from16 v17, v12

    .line 1194
    iput v9, v0, Ll/᩵ۡᩴ;->᩶:I

    const-wide/16 v10, -0x1

    .line 1196
    aput-wide v10, v4, v9

    .line 1199
    :goto_3
    aget-wide v10, v7, v6

    long-to-int v11, v10

    move v10, v9

    move/from16 v9, v17

    move/from16 v18, v11

    move v11, v6

    move/from16 v6, v18

    goto :goto_0

    :cond_3
    const-wide v6, 0xffffffffL

    .line 1202
    iput-object v4, v0, Ll/᩵ۡᩴ;->۬:[J

    .line 1203
    iput v10, v0, Ll/᩵ۡᩴ;->ۗ:I

    if-eq v10, v8, :cond_4

    .line 1206
    aget-wide v8, v4, v10

    or-long/2addr v6, v8

    aput-wide v6, v4, v10

    .line 1207
    :cond_4
    iput v1, v0, Ll/᩵ۡᩴ;->ۨ:I

    .line 1208
    iput v3, v0, Ll/᩵ۡᩴ;->۫:I

    .line 1209
    iget v2, v0, Ll/᩵ۡᩴ;->᩹:F

    invoke-static {v2, v1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v1

    iput v1, v0, Ll/᩵ۡᩴ;->ۤ:I

    .line 1210
    iput-object v5, v0, Ll/᩵ۡᩴ;->ۙ:[I

    return-void
.end method

.method public final ᩴ(I)Ll/֫ܺᩴ;
    .locals 0

    .line 857
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ᩻֫()I
    .locals 2

    .line 836
    iget v0, p0, Ll/᩵ۡᩴ;->᩺:I

    if-eqz v0, :cond_0

    .line 837
    iget-object v0, p0, Ll/᩵ۡᩴ;->ۙ:[I

    iget v1, p0, Ll/᩵ۡᩴ;->ۗ:I

    aget v0, v0, v1

    return v0

    .line 836
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
