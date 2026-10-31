.class public final Ll/ۢ֡ᩴ;
.super Ll/ۛۘᩴ;
.source "DD2"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۗ:Ll/ᩴۚᩴ;

.field public transient ۙ:[Ljava/lang/Object;

.field public transient ۛ:I

.field public transient ۟:Ll/᩶֡ᩴ;

.field public final transient ۤ:I

.field public ۨ:I

.field public transient ۫:I

.field public transient ۬:I

.field public transient ܰ:[Ljava/lang/Object;

.field public final ᩶:F

.field public transient ᩸:Z

.field public transient ᩹:Ll/۬᩵ᩴ;

.field public ᩺:Ll/ۡ᩺ۘ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ۡ᩺ۘ;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    iput-object p1, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    const/high16 p1, 0x3f400000    # 0.75f

    .line 97
    iput p1, p0, Ll/ۢ֡ᩴ;->᩶:F

    const/16 v0, 0x10

    .line 98
    invoke-static {p1, v0}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    iput v0, p0, Ll/ۢ֡ᩴ;->ۛ:I

    iput v0, p0, Ll/ۢ֡ᩴ;->ۤ:I

    add-int/lit8 v1, v0, -0x1

    .line 99
    iput v1, p0, Ll/ۢ֡ᩴ;->۬:I

    .line 100
    invoke-static {p1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/ۢ֡ᩴ;->۫:I

    .line 101
    iget p1, p0, Ll/ۢ֡ᩴ;->ۛ:I

    add-int/lit8 p1, p1, 0x1

    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 102
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 8

    .line 1397
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1398
    iget v0, p0, Ll/ۢ֡ᩴ;->ۨ:I

    iget v1, p0, Ll/ۢ֡ᩴ;->᩶:F

    invoke-static {v1, v0}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    iput v0, p0, Ll/ۢ֡ᩴ;->ۛ:I

    .line 1399
    invoke-static {v1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v0

    iput v0, p0, Ll/ۢ֡ᩴ;->۫:I

    .line 1400
    iget v0, p0, Ll/ۢ֡ᩴ;->ۛ:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Ll/ۢ֡ᩴ;->۬:I

    add-int/lit8 v1, v0, 0x1

    .line 1401
    new-array v1, v1, [Ljava/lang/Object;

    iput-object v1, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    const/4 v2, 0x1

    add-int/2addr v0, v2

    .line 1402
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    .line 1405
    iget v3, p0, Ll/ۢ֡ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_2

    .line 1406
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    .line 1407
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v5

    .line 1408
    iget-object v6, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    const/4 v7, 0x0

    invoke-interface {v6, v3, v7}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 1409
    iget v6, p0, Ll/ۢ֡ᩴ;->ۛ:I

    .line 1410
    iput-boolean v2, p0, Ll/ۢ֡ᩴ;->᩸:Z

    goto :goto_2

    .line 1412
    :cond_0
    iget-object v6, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v6, v3}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v6

    invoke-static {v6}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    iget v7, p0, Ll/ۢ֡ᩴ;->۬:I

    :goto_1
    and-int/2addr v6, v7

    .line 1413
    aget-object v7, v1, v6

    if-eqz v7, :cond_1

    add-int/lit8 v6, v6, 0x1

    iget v7, p0, Ll/ۢ֡ᩴ;->۬:I

    goto :goto_1

    .line 1415
    :cond_1
    :goto_2
    aput-object v3, v1, v6

    .line 1416
    aput-object v5, v0, v6

    move v3, v4

    goto :goto_0

    :cond_2
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 6

    .line 1384
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1385
    iget-object v1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    .line 1386
    new-instance v2, Ll/᩺᩵ᩴ;

    invoke-direct {v2, p0}, Ll/᩺᩵ᩴ;-><init>(Ll/ۢ֡ᩴ;)V

    .line 1387
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1388
    iget v3, p0, Ll/ۢ֡ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v4, v3, -0x1

    if-eqz v3, :cond_0

    .line 1389
    invoke-virtual {v2}, Ll/ܳ֡ᩴ;->֫()I

    move-result v3

    .line 1390
    aget-object v5, v0, v3

    invoke-virtual {p1, v5}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 1391
    aget-object v3, v1, v3

    invoke-virtual {p1, v3}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    move v3, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 271
    iget v0, p0, Ll/ۢ֡ᩴ;->ۛ:I

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll/ۢ֡ᩴ;->᩸:Z

    .line 272
    :cond_0
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    aput-object p2, v0, p1

    .line 273
    iget-object p2, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aput-object p3, p2, p1

    .line 274
    iget p1, p0, Ll/ۢ֡ᩴ;->ۨ:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Ll/ۢ֡ᩴ;->ۨ:I

    iget p2, p0, Ll/ۢ֡ᩴ;->۫:I

    if-lt p1, p2, :cond_1

    add-int/lit8 p1, p1, 0x2

    iget p2, p0, Ll/ۢ֡ᩴ;->᩶:F

    invoke-static {p2, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۢ֡ᩴ;->ܽ(I)V

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ۢ֡ᩴ;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ll/ۢ֡ᩴ;->ܿ()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ֫(Ll/ۢ֡ᩴ;I)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Ll/ۢ֡ᩴ;->ܿ(I)Ljava/lang/Object;

    return-void
.end method

.method private ܽ(Ljava/lang/Object;)I
    .locals 4

    .line 256
    iget-object v0, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean p1, p0, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz p1, :cond_0

    iget p1, p0, Ll/ۢ֡ᩴ;->ۛ:I

    return p1

    :cond_0
    iget p1, p0, Ll/ۢ֡ᩴ;->ۛ:I

    add-int/lit8 p1, p1, 0x1

    neg-int p1, p1

    return p1

    .line 258
    :cond_1
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 261
    iget-object v1, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v1, p1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    neg-int p1, v1

    return p1

    .line 262
    :cond_2
    iget-object v3, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v3, p1, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    return v1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 265
    iget v2, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_4

    add-int/lit8 v1, v1, 0x1

    neg-int p1, v1

    return p1

    .line 266
    :cond_4
    iget-object v3, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v3, p1, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    return v1
.end method

.method private ܿ()Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    .line 237
    iput-boolean v0, p0, Ll/ۢ֡ᩴ;->᩸:Z

    .line 238
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    iget v1, p0, Ll/ۢ֡ᩴ;->ۛ:I

    const/4 v2, 0x0

    aput-object v2, v0, v1

    .line 239
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v3, v0, v1

    .line 240
    aput-object v2, v0, v1

    .line 241
    iget v0, p0, Ll/ۢ֡ᩴ;->ۨ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۢ֡ᩴ;->ۨ:I

    .line 242
    iget v2, p0, Ll/ۢ֡ᩴ;->ۤ:I

    if-le v1, v2, :cond_0

    iget v2, p0, Ll/ۢ֡ᩴ;->۫:I

    div-int/lit8 v2, v2, 0x4

    if-ge v0, v2, :cond_0

    const/16 v0, 0x10

    if-le v1, v0, :cond_0

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v1}, Ll/ۢ֡ᩴ;->ܽ(I)V

    :cond_0
    return-object v3
.end method

.method private ܿ(I)Ljava/lang/Object;
    .locals 8

    .line 228
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v1, v0, p1

    const/4 v2, 0x0

    .line 229
    aput-object v2, v0, p1

    .line 230
    iget v3, p0, Ll/ۢ֡ᩴ;->ۨ:I

    add-int/lit8 v3, v3, -0x1

    iput v3, p0, Ll/ۢ֡ᩴ;->ۨ:I

    .line 300
    iget-object v3, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    :goto_0
    add-int/lit8 v4, p1, 0x1

    .line 303
    iget v5, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v4, v5

    .line 305
    :goto_1
    aget-object v5, v3, v4

    if-nez v5, :cond_1

    .line 306
    aput-object v2, v3, p1

    .line 307
    aput-object v2, v0, p1

    .line 232
    iget p1, p0, Ll/ۢ֡ᩴ;->ۛ:I

    iget v0, p0, Ll/ۢ֡ᩴ;->ۤ:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/ۢ֡ᩴ;->ۨ:I

    iget v2, p0, Ll/ۢ֡ᩴ;->۫:I

    div-int/lit8 v2, v2, 0x4

    if-ge v0, v2, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/ۢ֡ᩴ;->ܽ(I)V

    :cond_0
    return-object v1

    .line 310
    :cond_1
    iget-object v6, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v6, v5}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v6

    invoke-static {v6}, Ll/ܰۛۡ;->֫(I)I

    move-result v6

    iget v7, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v6, v7

    if-gt p1, v4, :cond_2

    if-ge p1, v6, :cond_3

    if-le v6, v4, :cond_4

    goto :goto_2

    :cond_2
    if-lt p1, v6, :cond_4

    if-le v6, v4, :cond_4

    .line 314
    :cond_3
    :goto_2
    aput-object v5, v3, p1

    .line 315
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

    .line 533
    iget v0, p0, Ll/ۢ֡ᩴ;->ۨ:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 534
    iput v0, p0, Ll/ۢ֡ᩴ;->ۨ:I

    .line 535
    iput-boolean v0, p0, Ll/ۢ֡ᩴ;->᩸:Z

    .line 536
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 537
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1343
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ֡ᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    .line 1347
    iput-object v1, v0, Ll/ۢ֡ᩴ;->ۗ:Ll/ᩴۚᩴ;

    .line 1348
    iput-object v1, v0, Ll/ۢ֡ᩴ;->۟:Ll/᩶֡ᩴ;

    .line 1349
    iput-object v1, v0, Ll/ۢ֡ᩴ;->᩹:Ll/۬᩵ᩴ;

    .line 1350
    iget-boolean v1, p0, Ll/ۢ֡ᩴ;->᩸:Z

    iput-boolean v1, v0, Ll/ۢ֡ᩴ;->᩸:Z

    .line 1351
    iget-object v1, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1352
    iget-object v1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    .line 1353
    iget-object v1, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    iput-object v1, v0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    return-object v0

    .line 1345
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 3

    .line 487
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    invoke-direct {p0, p1}, Ll/ۢ֡ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    .line 489
    iget-object v2, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-interface {p2, p1, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_3

    if-ltz v0, :cond_2

    .line 492
    iget-object p2, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {p2, p1, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Ll/ۢ֡ᩴ;->ܿ()Ljava/lang/Object;

    goto :goto_1

    .line 493
    :cond_1
    invoke-direct {p0, v0}, Ll/ۢ֡ᩴ;->ܿ(I)Ljava/lang/Object;

    :cond_2
    :goto_1
    return-object v1

    :cond_3
    if-gez v0, :cond_4

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    .line 499
    invoke-direct {p0, v0, p1, p2}, Ll/ۢ֡ᩴ;->֫(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    .line 502
    :cond_4
    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aput-object p2, p1, v0

    return-object p2
.end method

.method public final computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 3

    .line 471
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    invoke-direct {p0, p1}, Ll/ۢ֡ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_0

    return-object v1

    .line 474
    :cond_0
    iget-object v2, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    if-nez v2, :cond_1

    return-object v1

    .line 475
    :cond_1
    invoke-interface {p2, p1, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_3

    .line 477
    iget-object p2, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {p2, p1, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Ll/ۢ֡ᩴ;->ܿ()Ljava/lang/Object;

    goto :goto_0

    .line 478
    :cond_2
    invoke-direct {p0, v0}, Ll/ۢ֡ᩴ;->ܿ(I)Ljava/lang/Object;

    :goto_0
    return-object v1

    .line 481
    :cond_3
    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aput-object p2, p1, v0

    return-object p2
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 5

    .line 358
    iget-object v0, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean p1, p0, Ll/ۢ֡ᩴ;->᩸:Z

    return p1

    .line 360
    :cond_0
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 363
    iget-object v1, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v1, p1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    .line 364
    :cond_1
    iget-object v3, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v3, p1, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v1, v3

    .line 367
    iget v2, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 368
    :cond_3
    iget-object v4, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v4, p1, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    return v3
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 4

    .line 374
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 375
    iget-object v1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    .line 376
    iget-boolean v2, p0, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz v2, :cond_0

    iget v2, p0, Ll/ۢ֡ᩴ;->ۛ:I

    aget-object v2, v1, v2

    invoke-static {v2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 377
    :cond_0
    iget v2, p0, Ll/ۢ֡ᩴ;->ۛ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_2

    aget-object v2, v0, v3

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

.method public final forEach(Ljava/util/function/BiConsumer;)V
    .locals 4

    .line 553
    iget-boolean v0, p0, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz v0, :cond_0

    .line 554
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    iget v1, p0, Ll/ۢ֡ᩴ;->ۛ:I

    aget-object v0, v0, v1

    iget-object v2, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v1, v2, v1

    invoke-interface {p1, v0, v1}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 556
    :cond_0
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 557
    iget v1, p0, Ll/ۢ֡ᩴ;->ۛ:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_2

    aget-object v1, v0, v2

    if-eqz v1, :cond_1

    .line 558
    iget-object v3, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v3, v3, v2

    invoke-interface {p1, v1, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 341
    iget-object v0, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean p1, p0, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    iget v0, p0, Ll/ۢ֡ᩴ;->ۛ:I

    aget-object p1, p1, v0

    return-object p1

    .line 343
    :cond_0
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 346
    iget-object v2, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v2, p1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_1

    goto :goto_0

    .line 347
    :cond_1
    iget-object v4, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v4, p1, v3}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object p1, p1, v2

    return-object p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 350
    iget v3, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_4

    :cond_3
    :goto_0
    return-object v1

    .line 351
    :cond_4
    iget-object v4, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v4, p1, v3}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object p1, p1, v2

    return-object p1
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 385
    iget-object v0, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean p1, p0, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    iget p2, p0, Ll/ۢ֡ᩴ;->ۛ:I

    aget-object p1, p1, p2

    return-object p1

    .line 387
    :cond_0
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 390
    iget-object v1, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v1, p1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    .line 391
    :cond_1
    iget-object v3, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v3, p1, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object p1, p1, v1

    return-object p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 394
    iget v2, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_4

    :cond_3
    :goto_0
    return-object p2

    .line 395
    :cond_4
    iget-object v3, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v3, p1, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object p1, p1, v1

    return-object p1
.end method

.method public final hashCode()I
    .locals 8

    .line 1369
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1370
    iget-object v1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    .line 208
    iget-boolean v2, p0, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz v2, :cond_0

    iget v2, p0, Ll/ۢ֡ᩴ;->ۨ:I

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    iget v2, p0, Ll/ۢ֡ᩴ;->ۨ:I

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    add-int/lit8 v7, v2, -0x1

    if-eqz v2, :cond_5

    .line 1372
    :goto_2
    aget-object v2, v0, v4

    if-nez v2, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    if-eq p0, v2, :cond_2

    .line 1373
    iget-object v6, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v6, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v6

    .line 1374
    :cond_2
    aget-object v2, v1, v4

    if-eq p0, v2, :cond_4

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v2, v6

    move v6, v2

    :cond_4
    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    move v2, v7

    goto :goto_1

    .line 1379
    :cond_5
    iget-boolean v0, p0, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz v0, :cond_7

    iget v0, p0, Ll/ۢ֡ᩴ;->ۛ:I

    aget-object v0, v1, v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v5, v3

    :cond_7
    return v5
.end method

.method public final isEmpty()Z
    .locals 1

    .line 547
    iget v0, p0, Ll/ۢ֡ᩴ;->ۨ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 1154
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۗ:Ll/ᩴۚᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۧ֡ᩴ;

    invoke-direct {v0, p0}, Ll/ۧ֡ᩴ;-><init>(Ll/ۢ֡ᩴ;)V

    iput-object v0, p0, Ll/ۢ֡ᩴ;->ۗ:Ll/ᩴۚᩴ;

    .line 1155
    :cond_0
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۗ:Ll/ᩴۚᩴ;

    return-object v0
.end method

.method public final merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 2

    .line 508
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    invoke-direct {p0, p1}, Ll/ۢ֡ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_3

    .line 511
    iget-object v1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v1, v1, v0

    if-nez v1, :cond_0

    goto :goto_1

    .line 516
    :cond_0
    invoke-interface {p3, v1, p2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_2

    .line 518
    iget-object p2, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    const/4 p3, 0x0

    invoke-interface {p2, p1, p3}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Ll/ۢ֡ᩴ;->ܿ()Ljava/lang/Object;

    goto :goto_0

    .line 519
    :cond_1
    invoke-direct {p0, v0}, Ll/ۢ֡ᩴ;->ܿ(I)Ljava/lang/Object;

    :goto_0
    return-object p3

    .line 522
    :cond_2
    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aput-object p2, p1, v0

    return-object p2

    :cond_3
    :goto_1
    if-gez v0, :cond_4

    neg-int p3, v0

    add-int/lit8 p3, p3, -0x1

    .line 512
    invoke-direct {p0, p3, p1, p2}, Ll/ۢ֡ᩴ;->֫(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    .line 513
    :cond_4
    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aput-object p2, p1, v0

    return-object p2
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 280
    invoke-direct {p0, p1}, Ll/ۢ֡ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    .line 282
    invoke-direct {p0, v0, p1, p2}, Ll/ۢ֡ᩴ;->֫(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1

    .line 285
    :cond_0
    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v1, p1, v0

    .line 286
    aput-object p2, p1, v0

    return-object v1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 6

    .line 248
    iget v0, p0, Ll/ۢ֡ᩴ;->᩶:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    .line 218
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 219
    iget v1, p0, Ll/ۢ֡ᩴ;->ۛ:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/ۢ֡ᩴ;->ܽ(I)V

    goto :goto_0

    .line 542
    :cond_0
    iget v1, p0, Ll/ۢ֡ᩴ;->ۨ:I

    .line 249
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    add-int/2addr v2, v1

    int-to-long v1, v2

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-double v0, v1

    .line 223
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

    .line 224
    iget v0, p0, Ll/ۢ֡ᩴ;->ۛ:I

    if-le v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ll/ۢ֡ᩴ;->ܽ(I)V

    .line 251
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/ۛۘᩴ;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public final putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 402
    invoke-direct {p0, p1}, Ll/ۢ֡ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 403
    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    .line 404
    invoke-direct {p0, v0, p1, p2}, Ll/ۢ֡ᩴ;->֫(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 322
    iget-object v0, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 323
    iget-boolean p1, p0, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz p1, :cond_3

    invoke-direct {p0}, Ll/ۢ֡ᩴ;->ܿ()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 327
    :cond_0
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 330
    iget-object v2, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v2, p1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_1

    goto :goto_0

    .line 331
    :cond_1
    iget-object v4, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v4, p1, v3}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v2}, Ll/ۢ֡ᩴ;->ܿ(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 333
    iget v3, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_4

    :cond_3
    :goto_0
    return-object v1

    .line 334
    :cond_4
    iget-object v4, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v4, p1, v3}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v2}, Ll/ۢ֡ᩴ;->ܿ(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 5

    .line 412
    iget-object v0, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 413
    iget-boolean p1, p0, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    iget v0, p0, Ll/ۢ֡ᩴ;->ۛ:I

    aget-object p1, p1, v0

    invoke-static {p2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 414
    invoke-direct {p0}, Ll/ۢ֡ᩴ;->ܿ()Ljava/lang/Object;

    return v1

    .line 420
    :cond_0
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 423
    iget-object v2, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v2, p1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_1

    goto :goto_0

    .line 424
    :cond_1
    iget-object v4, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v4, p1, v3}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v3, v3, v2

    invoke-static {p2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 425
    invoke-direct {p0, v2}, Ll/ۢ֡ᩴ;->ܿ(I)Ljava/lang/Object;

    return v1

    :cond_2
    add-int/2addr v2, v1

    .line 429
    iget v3, p0, Ll/ۢ֡ᩴ;->۬:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_4

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1

    .line 430
    :cond_4
    iget-object v4, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v4, p1, v3}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v3, v3, v2

    invoke-static {p2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 431
    invoke-direct {p0, v2}, Ll/ۢ֡ᩴ;->ܿ(I)Ljava/lang/Object;

    return v1
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 449
    invoke-direct {p0, p1}, Ll/ۢ֡ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 451
    :cond_0
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v1, v0, p1

    .line 452
    aput-object p2, v0, p1

    return-object v1
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 440
    invoke-direct {p0, p1}, Ll/ۢ֡ᩴ;->ܽ(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_1

    .line 441
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aget-object v0, v0, p1

    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 442
    :cond_0
    iget-object p2, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    aput-object p3, p2, p1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 542
    iget v0, p0, Ll/ۢ֡ᩴ;->ۨ:I

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1213
    iget-object v0, p0, Ll/ۢ֡ᩴ;->۟:Ll/᩶֡ᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ۨ᩵ᩴ;

    invoke-direct {v0, p0}, Ll/ۨ᩵ᩴ;-><init>(Ll/ۢ֡ᩴ;)V

    iput-object v0, p0, Ll/ۢ֡ᩴ;->۟:Ll/᩶֡ᩴ;

    .line 1248
    :cond_0
    iget-object v0, p0, Ll/ۢ֡ᩴ;->۟:Ll/᩶֡ᩴ;

    return-object v0
.end method

.method public final ֫()V
    .locals 4

    .line 1265
    iget v0, p0, Ll/ۢ֡ᩴ;->ۨ:I

    int-to-float v0, v0

    .line 1287
    iget v1, p0, Ll/ۢ֡ᩴ;->᩶:F

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

    .line 1288
    iget v2, p0, Ll/ۢ֡ᩴ;->ۛ:I

    if-ge v0, v2, :cond_1

    iget v2, p0, Ll/ۢ֡ᩴ;->ۨ:I

    invoke-static {v1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v1

    if-le v2, v1, :cond_0

    goto :goto_0

    .line 1290
    :cond_0
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ۢ֡ᩴ;->ܽ(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public final ۢۧ()Ll/ᩴۚᩴ;
    .locals 1

    .line 1050
    iget-object v0, p0, Ll/ۢ֡ᩴ;->᩹:Ll/۬᩵ᩴ;

    if-nez v0, :cond_0

    new-instance v0, Ll/ܿ֡ᩴ;

    invoke-direct {v0, p0}, Ll/ܿ֡ᩴ;-><init>(Ll/ۢ֡ᩴ;)V

    iput-object v0, p0, Ll/ۢ֡ᩴ;->᩹:Ll/۬᩵ᩴ;

    .line 1051
    :cond_0
    iget-object v0, p0, Ll/ۢ֡ᩴ;->᩹:Ll/۬᩵ᩴ;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 9

    .line 1309
    iget-object v0, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1310
    iget-object v1, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    add-int/lit8 v2, p1, -0x1

    add-int/lit8 v3, p1, 0x1

    .line 1312
    new-array v4, v3, [Ljava/lang/Object;

    .line 1313
    new-array v3, v3, [Ljava/lang/Object;

    .line 1314
    iget v5, p0, Ll/ۢ֡ᩴ;->ۛ:I

    .line 208
    iget-boolean v6, p0, Ll/ۢ֡ᩴ;->᩸:Z

    if-eqz v6, :cond_0

    iget v6, p0, Ll/ۢ֡ᩴ;->ۨ:I

    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    :cond_0
    iget v6, p0, Ll/ۢ֡ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v7, v6, -0x1

    if-eqz v6, :cond_3

    :goto_1
    add-int/lit8 v5, v5, -0x1

    .line 1316
    aget-object v6, v0, v5

    if-nez v6, :cond_1

    goto :goto_1

    .line 1317
    :cond_1
    iget-object v8, p0, Ll/ۢ֡ᩴ;->᩺:Ll/ۡ᩺ۘ;

    invoke-interface {v8, v6}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

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

    .line 1318
    :cond_2
    aget-object v8, v0, v5

    aput-object v8, v4, v6

    .line 1319
    aget-object v8, v1, v5

    aput-object v8, v3, v6

    move v6, v7

    goto :goto_0

    .line 1321
    :cond_3
    iget v0, p0, Ll/ۢ֡ᩴ;->ۛ:I

    aget-object v0, v1, v0

    aput-object v0, v3, p1

    .line 1322
    iput p1, p0, Ll/ۢ֡ᩴ;->ۛ:I

    .line 1323
    iput v2, p0, Ll/ۢ֡ᩴ;->۬:I

    .line 1324
    iget v0, p0, Ll/ۢ֡ᩴ;->᩶:F

    invoke-static {v0, p1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/ۢ֡ᩴ;->۫:I

    .line 1325
    iput-object v4, p0, Ll/ۢ֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1326
    iput-object v3, p0, Ll/ۢ֡ᩴ;->ܰ:[Ljava/lang/Object;

    return-void
.end method
