.class public final Ll/۟֡ᩴ;
.super Ll/ܳᩴᩴ;
.source "1CGN"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۗ:I

.field public transient ۙ:[Ljava/lang/Object;

.field public final transient ۛ:I

.field public transient ۤ:I

.field public transient ۨ:I

.field public transient ۫:I

.field public transient ۬:[J

.field public ܰ:Ll/ۡ᩺ۘ;

.field public transient ᩶:I

.field public transient ᩸:Z

.field public final ᩹:F

.field public ᩺:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ۡ᩺ۘ;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    const/4 v0, -0x1

    .line 92
    iput v0, p0, Ll/۟֡ᩴ;->᩶:I

    .line 97
    iput v0, p0, Ll/۟֡ᩴ;->ۗ:I

    .line 129
    iput-object p1, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    const/high16 p1, 0x3f400000    # 0.75f

    .line 132
    iput p1, p0, Ll/۟֡ᩴ;->᩹:F

    const/16 v0, 0x10

    .line 133
    invoke-static {p1, v0}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    iput v0, p0, Ll/۟֡ᩴ;->ۨ:I

    iput v0, p0, Ll/۟֡ᩴ;->ۛ:I

    add-int/lit8 v1, v0, -0x1

    .line 134
    iput v1, p0, Ll/۟֡ᩴ;->۫:I

    .line 135
    invoke-static {p1, v0}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result p1

    iput p1, p0, Ll/۟֡ᩴ;->ۤ:I

    .line 136
    iget p1, p0, Ll/۟֡ᩴ;->ۨ:I

    add-int/lit8 p1, p1, 0x1

    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 137
    new-array p1, p1, [J

    iput-object p1, p0, Ll/۟֡ᩴ;->۬:[J

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 15

    move-object v0, p0

    .line 1219
    invoke-virtual/range {p1 .. p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1220
    iget v1, v0, Ll/۟֡ᩴ;->᩺:I

    iget v2, v0, Ll/۟֡ᩴ;->᩹:F

    invoke-static {v2, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v1

    iput v1, v0, Ll/۟֡ᩴ;->ۨ:I

    .line 1221
    invoke-static {v2, v1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v1

    iput v1, v0, Ll/۟֡ᩴ;->ۤ:I

    .line 1222
    iget v1, v0, Ll/۟֡ᩴ;->ۨ:I

    add-int/lit8 v2, v1, -0x1

    iput v2, v0, Ll/۟֡ᩴ;->۫:I

    add-int/lit8 v2, v1, 0x1

    .line 1223
    new-array v2, v2, [Ljava/lang/Object;

    iput-object v2, v0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    const/4 v3, 0x1

    add-int/2addr v1, v3

    .line 1224
    new-array v1, v1, [J

    iput-object v1, v0, Ll/۟֡ᩴ;->۬:[J

    const/4 v4, -0x1

    .line 1226
    iput v4, v0, Ll/۟֡ᩴ;->ۗ:I

    iput v4, v0, Ll/۟֡ᩴ;->᩶:I

    .line 1228
    iget v5, v0, Ll/۟֡ᩴ;->᩺:I

    const/4 v6, -0x1

    :goto_0
    add-int/lit8 v7, v5, -0x1

    if-eqz v5, :cond_3

    .line 1229
    invoke-virtual/range {p1 .. p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v5

    .line 1230
    iget-object v8, v0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    const/4 v9, 0x0

    invoke-interface {v8, v5, v9}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 1231
    iget v8, v0, Ll/۟֡ᩴ;->ۨ:I

    .line 1232
    iput-boolean v3, v0, Ll/۟֡ᩴ;->᩸:Z

    goto :goto_2

    .line 1234
    :cond_0
    iget-object v8, v0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v8, v5}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v8

    invoke-static {v8}, Ll/ܰۛۡ;->֫(I)I

    move-result v8

    iget v9, v0, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v8, v9

    aget-object v9, v2, v8

    if-eqz v9, :cond_1

    :goto_1
    add-int/2addr v8, v3

    iget v9, v0, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v8, v9

    aget-object v9, v2, v8

    if-eqz v9, :cond_1

    goto :goto_1

    .line 1236
    :cond_1
    :goto_2
    aput-object v5, v2, v8

    .line 1237
    iget v5, v0, Ll/۟֡ᩴ;->᩶:I

    const-wide v9, -0x100000000L

    if-eq v5, v4, :cond_2

    .line 1238
    aget-wide v11, v1, v6

    const-wide v13, 0xffffffffL

    int-to-long v3, v8

    and-long/2addr v3, v13

    xor-long/2addr v3, v11

    and-long/2addr v3, v13

    xor-long/2addr v3, v11

    aput-wide v3, v1, v6

    .line 1239
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

    .line 1242
    :cond_2
    iput v8, v0, Ll/۟֡ᩴ;->᩶:I

    .line 1244
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

    .line 1247
    iput v6, v0, Ll/۟֡ᩴ;->ۗ:I

    const/4 v4, -0x1

    if-eq v6, v4, :cond_4

    .line 1250
    aget-wide v4, v1, v6

    or-long/2addr v2, v4

    aput-wide v2, v1, v6

    :cond_4
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 1033
    new-instance v0, Ll/ܰ֡ᩴ;

    invoke-direct {v0, p0}, Ll/ܰ֡ᩴ;-><init>(Ll/۟֡ᩴ;)V

    .line 1213
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1214
    iget v1, p0, Ll/۟֡ᩴ;->᩺:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/ܰ֡ᩴ;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    move v1, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ᩻(I)V
    .locals 2

    .line 421
    iget v0, p0, Ll/۟֡ᩴ;->᩺:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۟֡ᩴ;->᩺:I

    .line 422
    invoke-virtual {p0, p1}, Ll/۟֡ᩴ;->֫(I)V

    .line 423
    invoke-virtual {p0, p1}, Ll/۟֡ᩴ;->ܿ(I)V

    .line 424
    iget p1, p0, Ll/۟֡ᩴ;->ۨ:I

    iget v0, p0, Ll/۟֡ᩴ;->ۛ:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/۟֡ᩴ;->᩺:I

    iget v1, p0, Ll/۟֡ᩴ;->ۤ:I

    div-int/lit8 v1, v1, 0x4

    if-ge v0, v1, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/۟֡ᩴ;->ᩳ(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 10

    .line 320
    iget-object v0, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 321
    iget-boolean v0, p0, Ll/۟֡ᩴ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 322
    :cond_0
    iget v0, p0, Ll/۟֡ᩴ;->ۨ:I

    .line 323
    iput-boolean v1, p0, Ll/۟֡ᩴ;->᩸:Z

    .line 324
    iget-object v2, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    aput-object p1, v2, v0

    goto :goto_1

    .line 327
    :cond_1
    iget-object v0, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 329
    iget-object v2, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v2, p1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ll/ܰۛۡ;->֫(I)I

    move-result v2

    iget v3, p0, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-eqz v3, :cond_3

    .line 330
    iget-object v4, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v4, v3, p1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    add-int/2addr v2, v1

    .line 331
    iget v3, p0, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-eqz v3, :cond_3

    iget-object v4, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v4, v3, p1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 333
    :cond_3
    aput-object p1, v0, v2

    move v0, v2

    .line 335
    :goto_1
    iget p1, p0, Ll/۟֡ᩴ;->᩺:I

    if-nez p1, :cond_4

    .line 336
    iput v0, p0, Ll/۟֡ᩴ;->ۗ:I

    iput v0, p0, Ll/۟֡ᩴ;->᩶:I

    .line 338
    iget-object v2, p0, Ll/۟֡ᩴ;->۬:[J

    const-wide/16 v3, -0x1

    aput-wide v3, v2, v0

    goto :goto_2

    .line 340
    :cond_4
    iget-object v2, p0, Ll/۟֡ᩴ;->۬:[J

    iget v3, p0, Ll/۟֡ᩴ;->ۗ:I

    aget-wide v4, v2, v3

    int-to-long v6, v0

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

    .line 341
    aput-wide v3, v2, v0

    .line 342
    iput v0, p0, Ll/۟֡ᩴ;->ۗ:I

    :goto_2
    add-int/lit8 v0, p1, 0x1

    .line 344
    iput v0, p0, Ll/۟֡ᩴ;->᩺:I

    iget v0, p0, Ll/۟֡ᩴ;->ۤ:I

    if-lt p1, v0, :cond_5

    add-int/lit8 p1, p1, 0x2

    iget v0, p0, Ll/۟֡ᩴ;->᩹:F

    invoke-static {v0, p1}, Ll/ܰۛۡ;->֫(FI)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۟֡ᩴ;->ᩳ(I)V

    :cond_5
    return v1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 6

    .line 311
    iget v0, p0, Ll/۟֡ᩴ;->᩹:F

    float-to-double v1, v0

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 299
    invoke-static {v0, v1}, Ll/ܰۛۡ;->֫(FI)I

    move-result v0

    .line 300
    iget v1, p0, Ll/۟֡ᩴ;->ۨ:I

    if-le v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ll/۟֡ᩴ;->ᩳ(I)V

    goto :goto_0

    .line 693
    :cond_0
    iget v1, p0, Ll/۟֡ᩴ;->᩺:I

    .line 312
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v2, v1

    int-to-long v1, v2

    long-to-float v1, v1

    div-float/2addr v1, v0

    float-to-double v0, v1

    .line 304
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

    .line 305
    iget v0, p0, Ll/۟֡ᩴ;->ۨ:I

    if-le v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ll/۟֡ᩴ;->ᩳ(I)V

    .line 314
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 2

    .line 684
    iget v0, p0, Ll/۟֡ᩴ;->᩺:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 685
    iput v0, p0, Ll/۟֡ᩴ;->᩺:I

    .line 686
    iput-boolean v0, p0, Ll/۟֡ᩴ;->᩸:Z

    .line 687
    iget-object v0, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, -0x1

    .line 688
    iput v0, p0, Ll/۟֡ᩴ;->ۗ:I

    iput v0, p0, Ll/۟֡ᩴ;->᩶:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1178
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟֡ᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1182
    iget-object v1, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 1183
    iget-boolean v1, p0, Ll/۟֡ᩴ;->᩸:Z

    iput-boolean v1, v0, Ll/۟֡ᩴ;->᩸:Z

    .line 1184
    iget-object v1, p0, Ll/۟֡ᩴ;->۬:[J

    invoke-virtual {v1}, [J->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [J

    iput-object v1, v0, Ll/۟֡ᩴ;->۬:[J

    .line 1185
    iget-object v1, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    iput-object v1, v0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    return-object v0

    .line 1180
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 5

    .line 459
    iget-object v0, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean p1, p0, Ll/۟֡ᩴ;->᩸:Z

    return p1

    .line 461
    :cond_0
    iget-object v0, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 464
    iget-object v1, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v1, p1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v2, p0, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_0

    .line 465
    :cond_1
    iget-object v3, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v3, p1, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v1, v3

    .line 467
    iget v2, p0, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 468
    :cond_3
    iget-object v4, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v4, p1, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    return v3
.end method

.method public final first()Ljava/lang/Object;
    .locals 2

    .line 776
    iget v0, p0, Ll/۟֡ᩴ;->᩺:I

    if-eqz v0, :cond_0

    .line 777
    iget-object v0, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    iget v1, p0, Ll/۟֡ᩴ;->᩶:I

    aget-object v0, v0, v1

    return-object v0

    .line 776
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 4

    .line 1059
    iget v0, p0, Ll/۟֡ᩴ;->᩶:I

    :goto_0
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1062
    iget-object v1, p0, Ll/۟֡ᩴ;->۬:[J

    aget-wide v2, v1, v0

    long-to-int v1, v2

    .line 1064
    iget-object v2, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    aget-object v0, v2, v0

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    move v0, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hashCode()I
    .locals 6

    .line 1201
    iget-object v0, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 289
    iget-boolean v1, p0, Ll/۟֡ᩴ;->᩸:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/۟֡ᩴ;->᩺:I

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget v1, p0, Ll/۟֡ᩴ;->᩺:I

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    add-int/lit8 v4, v1, -0x1

    if-eqz v1, :cond_3

    .line 1203
    :goto_2
    aget-object v1, v0, v3

    if-nez v1, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    if-eq p0, v1, :cond_2

    .line 1204
    iget-object v5, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v5, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v2

    move v2, v1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    move v1, v4

    goto :goto_1

    :cond_3
    return v2
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 808
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 698
    iget v0, p0, Ll/۟֡ᩴ;->᩺:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1033
    new-instance v0, Ll/ܰ֡ᩴ;

    invoke-direct {v0, p0}, Ll/ܰ֡ᩴ;-><init>(Ll/۟֡ᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 1

    .line 1033
    new-instance v0, Ll/ܰ֡ᩴ;

    invoke-direct {v0, p0}, Ll/ܰ֡ᩴ;-><init>(Ll/۟֡ᩴ;)V

    return-object v0
.end method

.method public final iterator()Ll/ܶ֡ᩴ;
    .locals 1

    .line 1033
    new-instance v0, Ll/ܰ֡ᩴ;

    invoke-direct {v0, p0}, Ll/ܰ֡ᩴ;-><init>(Ll/۟֡ᩴ;)V

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 2

    .line 787
    iget v0, p0, Ll/۟֡ᩴ;->᩺:I

    if-eqz v0, :cond_0

    .line 788
    iget-object v0, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    iget v1, p0, Ll/۟֡ᩴ;->ۗ:I

    aget-object v0, v0, v1

    return-object v0

    .line 787
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 6

    .line 440
    iget-object v0, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    .line 441
    iget-boolean p1, p0, Ll/۟֡ᩴ;->᩸:Z

    if-eqz p1, :cond_4

    .line 429
    iput-boolean v2, p0, Ll/۟֡ᩴ;->᩸:Z

    .line 430
    iget-object p1, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    iget v0, p0, Ll/۟֡ᩴ;->ۨ:I

    aput-object v1, p1, v0

    .line 431
    iget p1, p0, Ll/۟֡ᩴ;->᩺:I

    sub-int/2addr p1, v3

    iput p1, p0, Ll/۟֡ᩴ;->᩺:I

    .line 432
    invoke-virtual {p0, v0}, Ll/۟֡ᩴ;->֫(I)V

    .line 433
    iget p1, p0, Ll/۟֡ᩴ;->ۨ:I

    iget v0, p0, Ll/۟֡ᩴ;->ۛ:I

    if-le p1, v0, :cond_0

    iget v0, p0, Ll/۟֡ᩴ;->᩺:I

    iget v1, p0, Ll/۟֡ᩴ;->ۤ:I

    div-int/lit8 v1, v1, 0x4

    if-ge v0, v1, :cond_0

    const/16 v0, 0x10

    if-le p1, v0, :cond_0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ll/۟֡ᩴ;->ᩳ(I)V

    :cond_0
    return v3

    .line 445
    :cond_1
    iget-object v0, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    .line 448
    iget-object v1, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v1, p1}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ll/ܰۛۡ;->֫(I)I

    move-result v1

    iget v4, p0, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v1, v4

    aget-object v4, v0, v1

    if-nez v4, :cond_2

    goto :goto_0

    .line 449
    :cond_2
    iget-object v5, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v5, p1, v4}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-direct {p0, v1}, Ll/۟֡ᩴ;->᩻(I)V

    return v3

    :cond_3
    add-int/2addr v1, v3

    .line 451
    iget v4, p0, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v1, v4

    aget-object v4, v0, v1

    if-nez v4, :cond_5

    :cond_4
    :goto_0
    return v2

    .line 452
    :cond_5
    iget-object v5, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v5, p1, v4}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-direct {p0, v1}, Ll/۟֡ᩴ;->᩻(I)V

    return v3
.end method

.method public final removeFirst()Ljava/lang/Object;
    .locals 10

    .line 501
    iget v0, p0, Ll/۟֡ᩴ;->᩺:I

    if-eqz v0, :cond_4

    .line 502
    iget v1, p0, Ll/۟֡ᩴ;->᩶:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v3, -0x1

    .line 504
    iput v3, p0, Ll/۟֡ᩴ;->ۗ:I

    iput v3, p0, Ll/۟֡ᩴ;->᩶:I

    goto :goto_0

    .line 506
    :cond_0
    iget-object v3, p0, Ll/۟֡ᩴ;->۬:[J

    aget-wide v4, v3, v1

    long-to-int v5, v4

    iput v5, p0, Ll/۟֡ᩴ;->᩶:I

    if-ltz v5, :cond_1

    .line 509
    aget-wide v6, v3, v5

    const-wide v8, -0x100000000L

    or-long/2addr v6, v8

    aput-wide v6, v3, v5

    .line 512
    :cond_1
    :goto_0
    iget-object v3, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    aget-object v3, v3, v1

    sub-int/2addr v0, v2

    .line 513
    iput v0, p0, Ll/۟֡ᩴ;->᩺:I

    .line 514
    iget-object v0, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    const/4 v2, 0x0

    invoke-interface {v0, v3, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 515
    iput-boolean v0, p0, Ll/۟֡ᩴ;->᩸:Z

    .line 516
    iget-object v0, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    iget v1, p0, Ll/۟֡ᩴ;->ۨ:I

    aput-object v2, v0, v1

    goto :goto_1

    .line 517
    :cond_2
    invoke-virtual {p0, v1}, Ll/۟֡ᩴ;->ܿ(I)V

    .line 518
    :goto_1
    iget v0, p0, Ll/۟֡ᩴ;->ۨ:I

    iget v1, p0, Ll/۟֡ᩴ;->ۛ:I

    if-le v0, v1, :cond_3

    iget v1, p0, Ll/۟֡ᩴ;->᩺:I

    iget v2, p0, Ll/۟֡ᩴ;->ۤ:I

    div-int/lit8 v2, v2, 0x4

    if-ge v1, v2, :cond_3

    const/16 v1, 0x10

    if-le v0, v1, :cond_3

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Ll/۟֡ᩴ;->ᩳ(I)V

    :cond_3
    return-object v3

    .line 501
    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final removeLast()Ljava/lang/Object;
    .locals 10

    .line 529
    iget v0, p0, Ll/۟֡ᩴ;->᩺:I

    if-eqz v0, :cond_4

    .line 530
    iget v1, p0, Ll/۟֡ᩴ;->ۗ:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v3, -0x1

    .line 532
    iput v3, p0, Ll/۟֡ᩴ;->ۗ:I

    iput v3, p0, Ll/۟֡ᩴ;->᩶:I

    goto :goto_0

    .line 534
    :cond_0
    iget-object v3, p0, Ll/۟֡ᩴ;->۬:[J

    aget-wide v4, v3, v1

    const/16 v6, 0x20

    ushr-long/2addr v4, v6

    long-to-int v5, v4

    iput v5, p0, Ll/۟֡ᩴ;->ۗ:I

    if-ltz v5, :cond_1

    .line 537
    aget-wide v6, v3, v5

    const-wide v8, 0xffffffffL

    or-long/2addr v6, v8

    aput-wide v6, v3, v5

    .line 540
    :cond_1
    :goto_0
    iget-object v3, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    aget-object v3, v3, v1

    sub-int/2addr v0, v2

    .line 541
    iput v0, p0, Ll/۟֡ᩴ;->᩺:I

    .line 542
    iget-object v0, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    const/4 v2, 0x0

    invoke-interface {v0, v3, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 543
    iput-boolean v0, p0, Ll/۟֡ᩴ;->᩸:Z

    .line 544
    iget-object v0, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    iget v1, p0, Ll/۟֡ᩴ;->ۨ:I

    aput-object v2, v0, v1

    goto :goto_1

    .line 545
    :cond_2
    invoke-virtual {p0, v1}, Ll/۟֡ᩴ;->ܿ(I)V

    .line 546
    :goto_1
    iget v0, p0, Ll/۟֡ᩴ;->ۨ:I

    iget v1, p0, Ll/۟֡ᩴ;->ۛ:I

    if-le v0, v1, :cond_3

    iget v1, p0, Ll/۟֡ᩴ;->᩺:I

    iget v2, p0, Ll/۟֡ᩴ;->ۤ:I

    div-int/lit8 v2, v2, 0x4

    if-ge v1, v2, :cond_3

    const/16 v1, 0x10

    if-le v0, v1, :cond_3

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Ll/۟֡ᩴ;->ᩳ(I)V

    :cond_3
    return-object v3

    .line 529
    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final size()I
    .locals 1

    .line 693
    iget v0, p0, Ll/۟֡ᩴ;->᩺:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/۟֡ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 5

    .line 1033
    new-instance v0, Ll/ܰ֡ᩴ;

    invoke-direct {v0, p0}, Ll/ܰ֡ᩴ;-><init>(Ll/۟֡ᩴ;)V

    .line 1053
    invoke-static {p0}, Ll/ۘ᩺ۘ;->֫(Ljava/util/Collection;)J

    move-result-wide v1

    .line 1278
    new-instance v3, Ll/۬ۚᩴ;

    const/16 v4, 0x51

    invoke-direct {v3, v0, v1, v2, v4}, Ll/۬ۚᩴ;-><init>(Ll/۫֡ᩴ;JI)V

    return-object v3
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 77
    invoke-virtual {p0}, Ll/۟֡ᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 818
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 798
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(I)V
    .locals 12

    .line 708
    iget v0, p0, Ll/۟֡ᩴ;->᩺:I

    if-nez v0, :cond_0

    const/4 p1, -0x1

    .line 709
    iput p1, p0, Ll/۟֡ᩴ;->ۗ:I

    iput p1, p0, Ll/۟֡ᩴ;->᩶:I

    return-void

    .line 712
    :cond_0
    iget v0, p0, Ll/۟֡ᩴ;->᩶:I

    const-wide v1, -0x100000000L

    if-ne v0, p1, :cond_1

    .line 713
    iget-object v0, p0, Ll/۟֡ᩴ;->۬:[J

    aget-wide v3, v0, p1

    long-to-int p1, v3

    iput p1, p0, Ll/۟֡ᩴ;->᩶:I

    if-ltz p1, :cond_2

    .line 716
    aget-wide v3, v0, p1

    or-long/2addr v1, v3

    aput-wide v1, v0, p1

    return-void

    .line 720
    :cond_1
    iget v0, p0, Ll/۟֡ᩴ;->ۗ:I

    const/16 v3, 0x20

    const-wide v4, 0xffffffffL

    if-ne v0, p1, :cond_3

    .line 721
    iget-object v0, p0, Ll/۟֡ᩴ;->۬:[J

    aget-wide v1, v0, p1

    ushr-long/2addr v1, v3

    long-to-int p1, v1

    iput p1, p0, Ll/۟֡ᩴ;->ۗ:I

    if-ltz p1, :cond_2

    .line 724
    aget-wide v1, v0, p1

    or-long/2addr v1, v4

    aput-wide v1, v0, p1

    :cond_2
    return-void

    .line 728
    :cond_3
    iget-object v0, p0, Ll/۟֡ᩴ;->۬:[J

    aget-wide v6, v0, p1

    ushr-long v8, v6, v3

    long-to-int p1, v8

    long-to-int v3, v6

    .line 731
    aget-wide v8, v0, p1

    and-long v10, v6, v4

    xor-long/2addr v10, v8

    and-long/2addr v4, v10

    xor-long/2addr v4, v8

    aput-wide v4, v0, p1

    .line 732
    aget-wide v4, v0, v3

    and-long/2addr v6, v1

    xor-long/2addr v6, v4

    and-long/2addr v1, v6

    xor-long/2addr v1, v4

    aput-wide v1, v0, v3

    return-void
.end method

.method public final ۧ(II)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 743
    iget v3, v0, Ll/۟֡ᩴ;->᩺:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    .line 744
    iput v2, v0, Ll/۟֡ᩴ;->ۗ:I

    iput v2, v0, Ll/۟֡ᩴ;->᩶:I

    .line 746
    iget-object v1, v0, Ll/۟֡ᩴ;->۬:[J

    const-wide/16 v3, -0x1

    aput-wide v3, v1, v2

    return-void

    .line 749
    :cond_0
    iget v3, v0, Ll/۟֡ᩴ;->᩶:I

    const-wide v4, -0x100000000L

    const/16 v6, 0x20

    const-wide v7, 0xffffffffL

    if-ne v3, v1, :cond_1

    .line 750
    iput v2, v0, Ll/۟֡ᩴ;->᩶:I

    .line 751
    iget-object v3, v0, Ll/۟֡ᩴ;->۬:[J

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

    .line 752
    aget-wide v4, v3, v1

    aput-wide v4, v3, v2

    return-void

    .line 755
    :cond_1
    iget v3, v0, Ll/۟֡ᩴ;->ۗ:I

    if-ne v3, v1, :cond_2

    .line 756
    iput v2, v0, Ll/۟֡ᩴ;->ۗ:I

    .line 757
    iget-object v3, v0, Ll/۟֡ᩴ;->۬:[J

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

    .line 758
    aget-wide v4, v3, v1

    aput-wide v4, v3, v2

    return-void

    .line 761
    :cond_2
    iget-object v3, v0, Ll/۟֡ᩴ;->۬:[J

    aget-wide v9, v3, v1

    ushr-long v11, v9, v6

    long-to-int v1, v11

    long-to-int v11, v9

    .line 764
    aget-wide v12, v3, v1

    int-to-long v14, v2

    and-long/2addr v14, v7

    xor-long v16, v12, v14

    and-long v7, v16, v7

    xor-long/2addr v7, v12

    aput-wide v7, v3, v1

    .line 765
    aget-wide v7, v3, v11

    shl-long v12, v14, v6

    xor-long/2addr v12, v7

    and-long/2addr v4, v12

    xor-long/2addr v4, v7

    aput-wide v4, v3, v11

    .line 766
    aput-wide v9, v3, v2

    return-void
.end method

.method public final ܿ(I)V
    .locals 5

    .line 403
    iget-object v0, p0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    :goto_0
    add-int/lit8 v1, p1, 0x1

    .line 405
    iget v2, p0, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v1, v2

    .line 407
    :goto_1
    aget-object v2, v0, v1

    if-nez v2, :cond_0

    const/4 v1, 0x0

    .line 408
    aput-object v1, v0, p1

    return-void

    .line 411
    :cond_0
    iget-object v3, p0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    invoke-interface {v3, v2}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ll/ܰۛۡ;->֫(I)I

    move-result v3

    iget v4, p0, Ll/۟֡ᩴ;->۫:I

    and-int/2addr v3, v4

    if-gt p1, v1, :cond_1

    if-ge p1, v3, :cond_2

    if-le v3, v1, :cond_3

    goto :goto_2

    :cond_1
    if-lt p1, v3, :cond_3

    if-le v3, v1, :cond_3

    .line 415
    :cond_2
    :goto_2
    aput-object v2, v0, p1

    .line 416
    invoke-virtual {p0, v1, p1}, Ll/۟֡ᩴ;->ۧ(II)V

    move p1, v1

    goto :goto_0

    :cond_3
    add-int/lit8 v1, v1, 0x1

    and-int/2addr v1, v4

    goto :goto_1
.end method

.method public final ᩳ(I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 1126
    iget-object v2, v0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    add-int/lit8 v3, v1, -0x1

    add-int/lit8 v4, v1, 0x1

    .line 1128
    new-array v5, v4, [Ljava/lang/Object;

    .line 1129
    iget v6, v0, Ll/۟֡ᩴ;->᩶:I

    .line 1130
    iget-object v7, v0, Ll/۟֡ᩴ;->۬:[J

    .line 1131
    new-array v4, v4, [J

    const/4 v8, -0x1

    .line 1132
    iput v8, v0, Ll/۟֡ᩴ;->᩶:I

    .line 1133
    iget v9, v0, Ll/۟֡ᩴ;->᩺:I

    const/4 v10, -0x1

    const/4 v11, -0x1

    :goto_0
    add-int/lit8 v12, v9, -0x1

    if-eqz v9, :cond_3

    .line 1134
    iget-object v9, v0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    aget-object v13, v2, v6

    const/4 v14, 0x0

    invoke-interface {v9, v13, v14}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move v9, v1

    goto :goto_2

    .line 1136
    :cond_0
    iget-object v9, v0, Ll/۟֡ᩴ;->ܰ:Ll/ۡ᩺ۘ;

    aget-object v13, v2, v6

    invoke-interface {v9, v13}, Ll/ۡ᩺ۘ;->֫(Ljava/lang/Object;)I

    move-result v9

    invoke-static {v9}, Ll/ܰۛۡ;->֫(I)I

    move-result v9

    :goto_1
    and-int/2addr v9, v3

    .line 1137
    aget-object v13, v5, v9

    if-eqz v13, :cond_1

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 1139
    :cond_1
    :goto_2
    aget-object v13, v2, v6

    aput-object v13, v5, v9

    if-eq v11, v8, :cond_2

    .line 1141
    aget-wide v13, v4, v10

    move v15, v12

    int-to-long v11, v9

    const-wide v16, 0xffffffffL

    and-long v11, v11, v16

    xor-long/2addr v11, v13

    and-long v11, v11, v16

    xor-long/2addr v11, v13

    aput-wide v11, v4, v10

    .line 1142
    aget-wide v11, v4, v9

    int-to-long v13, v10

    and-long v13, v13, v16

    const/16 v10, 0x20

    shl-long/2addr v13, v10

    xor-long/2addr v13, v11

    const-wide v16, -0x100000000L

    and-long v13, v13, v16

    xor-long v10, v11, v13

    aput-wide v10, v4, v9

    goto :goto_3

    :cond_2
    move v15, v12

    .line 1145
    iput v9, v0, Ll/۟֡ᩴ;->᩶:I

    const-wide/16 v10, -0x1

    .line 1147
    aput-wide v10, v4, v9

    .line 1150
    :goto_3
    aget-wide v10, v7, v6

    long-to-int v11, v10

    move v10, v9

    move v9, v15

    move/from16 v18, v11

    move v11, v6

    move/from16 v6, v18

    goto :goto_0

    :cond_3
    const-wide v6, 0xffffffffL

    .line 1153
    iput-object v4, v0, Ll/۟֡ᩴ;->۬:[J

    .line 1154
    iput v10, v0, Ll/۟֡ᩴ;->ۗ:I

    if-eq v10, v8, :cond_4

    .line 1157
    aget-wide v8, v4, v10

    or-long/2addr v6, v8

    aput-wide v6, v4, v10

    .line 1158
    :cond_4
    iput v1, v0, Ll/۟֡ᩴ;->ۨ:I

    .line 1159
    iput v3, v0, Ll/۟֡ᩴ;->۫:I

    .line 1160
    iget v2, v0, Ll/۟֡ᩴ;->᩹:F

    invoke-static {v2, v1}, Ll/ܰۛۡ;->ۧ(FI)I

    move-result v1

    iput v1, v0, Ll/۟֡ᩴ;->ۤ:I

    .line 1161
    iput-object v5, v0, Ll/۟֡ᩴ;->ۙ:[Ljava/lang/Object;

    return-void
.end method
