.class public Ll/ۧۤᩴ;
.super Ljava/util/AbstractMap;
.source "N673"

# interfaces
.implements Ljava/util/concurrent/ConcurrentMap;
.implements Ljava/io/Serializable;
.implements Ll/ܿۤᩴ;


# static fields
.field public static final g:I

.field public static final h:Ll/ᩳ᩹ᩴ;

.field public static final i:J

.field public static final j:J

.field public static final k:J

.field public static final l:J

.field public static final m:J

.field public static final n:I

.field public static final o:I

.field public static final serialPersistentFields:[Ljava/io/ObjectStreamField;

.field public static final serialVersionUID:J = 0x6499de129d87293dL


# instance fields
.field public volatile transient a:[Ll/֡ۤᩴ;

.field public volatile transient b:[Ll/֡ۤᩴ;

.field public volatile transient baseCount:J

.field public volatile transient c:[Ll/᩷ۤᩴ;

.field public volatile transient cellsBusy:I

.field public transient d:Ll/֫ۤᩴ;

.field public transient e:Ll/᩶ۤᩴ;

.field public transient f:Ll/ۡۤᩴ;

.field public volatile transient sizeCtl:I

.field public volatile transient transferIndex:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 597
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Ll/ۧۤᩴ;->g:I

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/io/ObjectStreamField;

    .line 609
    new-instance v1, Ljava/io/ObjectStreamField;

    const-string v2, "segments"

    const-class v3, [Ll/֨ۤᩴ;

    invoke-direct {v1, v2, v3}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Ljava/io/ObjectStreamField;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v3, "segmentMask"

    invoke-direct {v1, v3, v2}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const/4 v3, 0x1

    aput-object v1, v0, v3

    new-instance v1, Ljava/io/ObjectStreamField;

    const-string v3, "segmentShift"

    invoke-direct {v1, v3, v2}, Ljava/io/ObjectStreamField;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Ll/ۧۤᩴ;->serialPersistentFields:[Ljava/io/ObjectStreamField;

    .line 114
    sget-object v0, Ll/ᩳ᩹ᩴ;->b:Ll/ᩳ᩹ᩴ;

    .line 6350
    sput-object v0, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    .line 6360
    const-class v1, Ll/ۧۤᩴ;

    const-string v2, "sizeCtl"

    .line 6361
    invoke-virtual {v0, v1, v2}, Ll/ᩳ᩹ᩴ;->h(Ljava/lang/Class;Ljava/lang/String;)J

    move-result-wide v1

    sput-wide v1, Ll/ۧۤᩴ;->i:J

    .line 6362
    const-class v1, Ll/ۧۤᩴ;

    const-string v2, "transferIndex"

    .line 6363
    invoke-virtual {v0, v1, v2}, Ll/ᩳ᩹ᩴ;->h(Ljava/lang/Class;Ljava/lang/String;)J

    move-result-wide v1

    sput-wide v1, Ll/ۧۤᩴ;->j:J

    .line 6364
    const-class v1, Ll/ۧۤᩴ;

    const-string v2, "baseCount"

    .line 6365
    invoke-virtual {v0, v1, v2}, Ll/ᩳ᩹ᩴ;->h(Ljava/lang/Class;Ljava/lang/String;)J

    move-result-wide v1

    sput-wide v1, Ll/ۧۤᩴ;->k:J

    .line 6366
    const-class v1, Ll/ۧۤᩴ;

    const-string v2, "cellsBusy"

    .line 6367
    invoke-virtual {v0, v1, v2}, Ll/ᩳ᩹ᩴ;->h(Ljava/lang/Class;Ljava/lang/String;)J

    move-result-wide v1

    sput-wide v1, Ll/ۧۤᩴ;->l:J

    .line 6369
    const-class v1, Ll/᩷ۤᩴ;

    const-string v2, "value"

    .line 6370
    invoke-virtual {v0, v1, v2}, Ll/ᩳ᩹ᩴ;->h(Ljava/lang/Class;Ljava/lang/String;)J

    move-result-wide v1

    sput-wide v1, Ll/ۧۤᩴ;->m:J

    .line 6372
    const-class v1, [Ll/֡ۤᩴ;

    invoke-virtual {v0, v1}, Ll/ᩳ᩹ᩴ;->a(Ljava/lang/Class;)I

    move-result v1

    sput v1, Ll/ۧۤᩴ;->n:I

    .line 6373
    const-class v1, [Ll/֡ۤᩴ;

    invoke-virtual {v0, v1}, Ll/ᩳ᩹ᩴ;->b(Ljava/lang/Class;)I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    and-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 6376
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x1f

    sput v0, Ll/ۧۤᩴ;->o:I

    .line 6380
    const-class v0, Ljava/util/concurrent/locks/LockSupport;

    .line 6383
    const-class v0, Ll/ۚۤᩴ;

    return-void

    .line 6375
    :cond_0
    new-instance v0, Ljava/lang/ExceptionInInitializerError;

    const-string v1, "array index scale not a power of two"

    invoke-direct {v0, v1}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>()V
    .locals 0

    .line 828
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/high16 v0, 0x3f400000    # 0.75f

    const/4 v1, 0x1

    .line 842
    invoke-direct {p0, p1, v0, v1}, Ll/ۧۤᩴ;-><init>(IFI)V

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 1

    const/4 v0, 0x1

    .line 871
    invoke-direct {p0, p1, p2, v0}, Ll/ۧۤᩴ;-><init>(IFI)V

    return-void
.end method

.method public constructor <init>(IFI)V
    .locals 2

    .line 893
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_2

    if-ltz p1, :cond_2

    if-lez p3, :cond_2

    if-ge p1, p3, :cond_0

    move p1, p3

    :cond_0
    int-to-long v0, p1

    long-to-float p1, v0

    div-float/2addr p1, p2

    float-to-double p1, p1

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr p1, v0

    double-to-long p1, p1

    const-wide/32 v0, 0x40000000

    cmp-long p3, p1, v0

    if-ltz p3, :cond_1

    const/high16 p1, 0x40000000    # 2.0f

    goto :goto_0

    :cond_1
    long-to-int p2, p1

    .line 900
    invoke-static {p2}, Ll/ۧۤᩴ;->l(I)I

    move-result p1

    .line 901
    :goto_0
    iput p1, p0, Ll/ۧۤᩴ;->sizeCtl:I

    return-void

    .line 895
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public static final b([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)Z
    .locals 5

    .line 765
    sget-object v0, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    int-to-long v1, p1

    sget p1, Ll/ۧۤᩴ;->o:I

    shl-long/2addr v1, p1

    sget p1, Ll/ۧۤᩴ;->n:I

    int-to-long v3, p1

    add-long/2addr v1, v3

    .line 339
    iget-object p1, v0, Ll/ᩳ᩹ᩴ;->a:Lsun/misc/Unsafe;

    invoke-static {p1, p0, v1, v2, p2}, Ll/᩺ۚᩴ;->E(Lsun/misc/Unsafe;Ljava/lang/Object;JLl/֡ۤᩴ;)Z

    move-result p0

    return p0
.end method

.method public static c(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 7

    .line 714
    instance-of v0, p0, Ljava/lang/Comparable;

    if-eqz v0, :cond_2

    .line 716
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-class v0, Ljava/lang/String;

    if-ne p0, v0, :cond_0

    goto :goto_1

    .line 718
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 719
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    .line 720
    instance-of v5, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v5, :cond_1

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 721
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v5

    const-class v6, Ljava/lang/Comparable;

    if-ne v5, v6, :cond_1

    .line 723
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v4

    if-eqz v4, :cond_1

    array-length v5, v4

    const/4 v6, 0x1

    if-ne v5, v6, :cond_1

    aget-object v4, v4, v2

    if-ne v4, p0, :cond_1

    :goto_1
    return-object p0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V
    .locals 5

    .line 769
    sget-object v0, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    int-to-long v1, p1

    sget p1, Ll/ۧۤᩴ;->o:I

    shl-long/2addr v1, p1

    sget p1, Ll/ۧۤᩴ;->n:I

    int-to-long v3, p1

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2, p2}, Ll/ᩳ᩹ᩴ;->j(Ljava/lang/Object;JLl/֡ۤᩴ;)V

    return-void
.end method

.method public static final i(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x10

    xor-int/2addr p0, v0

    const v0, 0x7fffffff

    and-int/2addr p0, v0

    return p0
.end method

.method public static final k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;
    .locals 5

    .line 760
    sget-object v0, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    int-to-long v1, p1

    sget p1, Ll/ۧۤᩴ;->o:I

    shl-long/2addr v1, p1

    sget p1, Ll/ۧۤᩴ;->n:I

    int-to-long v3, p1

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2}, Ll/ᩳ᩹ᩴ;->f(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֡ۤᩴ;

    return-object p0
.end method

.method public static final l(I)I
    .locals 2

    const/4 v0, 0x1

    sub-int/2addr p0, v0

    .line 705
    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    const/4 v1, -0x1

    ushr-int p0, v1, p0

    if-gez p0, :cond_0

    return v0

    :cond_0
    const/high16 v1, 0x40000000    # 2.0f

    if-lt p0, v1, :cond_1

    return v1

    :cond_1
    add-int/2addr p0, v0

    return p0
.end method

.method public static newKeySet()Ll/֫ۤᩴ;
    .locals 3

    .line 2182
    new-instance v0, Ll/֫ۤᩴ;

    new-instance v1, Ll/ۧۤᩴ;

    invoke-direct {v1}, Ll/ۧۤᩴ;-><init>()V

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1, v2}, Ll/֫ۤᩴ;-><init>(Ll/ۧۤᩴ;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static p(Ll/᩹ۤᩴ;)Ll/֡ۤᩴ;
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    if-eqz p0, :cond_1

    .line 2692
    new-instance v2, Ll/֡ۤᩴ;

    iget v3, p0, Ll/֡ۤᩴ;->a:I

    iget-object v4, p0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    iget-object v5, p0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-direct {v2, v3, v4, v5}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    if-nez v1, :cond_0

    move-object v0, v2

    goto :goto_1

    .line 2696
    :cond_0
    iput-object v2, v1, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    .line 2691
    :goto_1
    iget-object p0, p0, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    move-object v1, v2

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, -0x1

    .line 1449
    iput v1, v0, Ll/ۧۤᩴ;->sizeCtl:I

    .line 1450
    invoke-virtual/range {p1 .. p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-wide v4, v1

    .line 1455
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v6

    .line 1457
    invoke-virtual/range {p1 .. p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v7

    const-wide/16 v8, 0x1

    if-eqz v6, :cond_0

    if-eqz v7, :cond_0

    .line 1459
    new-instance v10, Ll/֡ۤᩴ;

    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v11

    invoke-static {v11}, Ll/ۧۤᩴ;->i(I)I

    move-result v11

    invoke-direct {v10, v11, v6, v7, v3}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ll/֡ۤᩴ;)V

    add-long/2addr v4, v8

    move-object v3, v10

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    cmp-long v7, v4, v1

    if-nez v7, :cond_1

    .line 1466
    iput v6, v0, Ll/ۧۤᩴ;->sizeCtl:I

    return-void

    :cond_1
    long-to-float v4, v4

    const/high16 v5, 0x3f400000    # 0.75f

    div-float/2addr v4, v5

    float-to-double v4, v4

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    add-double/2addr v4, v6

    double-to-long v4, v4

    const-wide/32 v6, 0x40000000

    cmp-long v10, v4, v6

    if-ltz v10, :cond_2

    const/high16 v4, 0x40000000    # 2.0f

    goto :goto_1

    :cond_2
    long-to-int v5, v4

    .line 1470
    invoke-static {v5}, Ll/ۧۤᩴ;->l(I)I

    move-result v4

    .line 1472
    :goto_1
    new-array v5, v4, [Ll/֡ۤᩴ;

    add-int/lit8 v6, v4, -0x1

    :goto_2
    if-eqz v3, :cond_d

    .line 1477
    iget-object v7, v3, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    .line 1478
    iget v10, v3, Ll/֡ۤᩴ;->a:I

    and-int v11, v10, v6

    .line 1479
    invoke-static {v5, v11}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v12

    if-nez v12, :cond_3

    const/4 v13, 0x1

    goto/16 :goto_8

    .line 1482
    :cond_3
    iget-object v14, v3, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    .line 1483
    iget v15, v12, Ll/֡ۤᩴ;->a:I

    if-gez v15, :cond_4

    .line 1484
    move-object v13, v12

    check-cast v13, Ll/᩸ۤᩴ;

    .line 1485
    iget-object v15, v3, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-virtual {v13, v10, v14, v15}, Ll/᩸ۤᩴ;->e(ILjava/lang/Object;Ljava/lang/Object;)Ll/᩹ۤᩴ;

    move-result-object v10

    if-nez v10, :cond_a

    add-long/2addr v1, v8

    goto/16 :goto_7

    :cond_4
    const/4 v15, 0x0

    move-object v13, v12

    :goto_3
    if-eqz v13, :cond_7

    .line 1494
    iget v8, v13, Ll/֡ۤᩴ;->a:I

    if-ne v8, v10, :cond_6

    iget-object v8, v13, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v8, v14, :cond_5

    if-eqz v8, :cond_6

    .line 1496
    invoke-virtual {v14, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    :cond_5
    const/4 v8, 0x0

    const/4 v13, 0x0

    goto :goto_4

    :cond_6
    add-int/lit8 v15, v15, 0x1

    .line 1493
    iget-object v13, v13, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    const-wide/16 v8, 0x1

    goto :goto_3

    :cond_7
    const/4 v13, 0x1

    :goto_4
    if-eqz v13, :cond_b

    const/16 v8, 0x8

    if-lt v15, v8, :cond_b

    const-wide/16 v8, 0x1

    add-long/2addr v1, v8

    .line 1505
    iput-object v12, v3, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v10, v3

    :goto_5
    if-eqz v10, :cond_9

    .line 1508
    new-instance v13, Ll/᩹ۤᩴ;

    iget v14, v10, Ll/֡ۤᩴ;->a:I

    iget-object v15, v10, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    move-wide/from16 v22, v1

    iget-object v1, v10, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, v13

    move/from16 v17, v14

    move-object/from16 v18, v15

    move-object/from16 v19, v1

    invoke-direct/range {v16 .. v21}, Ll/᩹ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ll/֡ۤᩴ;Ll/᩹ۤᩴ;)V

    .line 1510
    iput-object v9, v13, Ll/᩹ۤᩴ;->h:Ll/᩹ۤᩴ;

    if-nez v9, :cond_8

    move-object v8, v13

    goto :goto_6

    .line 1513
    :cond_8
    iput-object v13, v9, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    .line 1507
    :goto_6
    iget-object v10, v10, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    move-object v9, v13

    move-wide/from16 v1, v22

    goto :goto_5

    :cond_9
    move-wide/from16 v22, v1

    .line 1516
    new-instance v1, Ll/᩸ۤᩴ;

    invoke-direct {v1, v8}, Ll/᩸ۤᩴ;-><init>(Ll/᩹ۤᩴ;)V

    invoke-static {v5, v11, v1}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    move-wide/from16 v1, v22

    :cond_a
    :goto_7
    const/4 v13, 0x0

    :cond_b
    :goto_8
    const-wide/16 v8, 0x1

    if-eqz v13, :cond_c

    add-long/2addr v1, v8

    .line 1522
    iput-object v12, v3, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    .line 1523
    invoke-static {v5, v11, v3}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    :cond_c
    move-object v3, v7

    goto/16 :goto_2

    .line 1527
    :cond_d
    iput-object v5, v0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    ushr-int/lit8 v3, v4, 0x2

    sub-int/2addr v4, v3

    .line 1528
    iput v4, v0, Ll/ۧۤᩴ;->sizeCtl:I

    .line 1529
    iput-wide v1, v0, Ll/ۧۤᩴ;->baseCount:J

    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x10

    if-ge v1, v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    rsub-int/lit8 v2, v2, 0x20

    add-int/lit8 v1, v1, -0x1

    new-array v4, v3, [Ll/֨ۤᩴ;

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_1

    .line 1414
    new-instance v6, Ll/֨ۤᩴ;

    .line 1385
    invoke-direct {v6}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 1414
    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 1415
    :cond_1
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->putFields()Ljava/io/ObjectOutputStream$PutField;

    move-result-object v3

    const-string v5, "segments"

    .line 1416
    invoke-virtual {v3, v5, v4}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "segmentShift"

    .line 1417
    invoke-virtual {v3, v4, v2}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;I)V

    const-string v2, "segmentMask"

    .line 1418
    invoke-virtual {v3, v2, v1}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;I)V

    .line 1419
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->writeFields()V

    .line 1422
    iget-object v1, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-eqz v1, :cond_2

    .line 1423
    new-instance v2, Ll/ܶۤᩴ;

    array-length v3, v1

    array-length v4, v1

    invoke-direct {v2, v1, v3, v0, v4}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 1424
    :goto_2
    invoke-virtual {v2}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1425
    iget-object v1, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 1426
    iget-object v0, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    .line 1429
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 1430
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(JI)V
    .locals 23

    move-object/from16 v9, p0

    move-wide/from16 v10, p1

    move/from16 v0, p3

    .line 2320
    iget-object v12, v9, Ll/ۧۤᩴ;->c:[Ll/᩷ۤᩴ;

    const/4 v13, 0x2

    if-nez v12, :cond_0

    sget-object v1, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v3, Ll/ۧۤᩴ;->k:J

    iget-wide v5, v9, Ll/ۧۤᩴ;->baseCount:J

    add-long v14, v5, v10

    move-object/from16 v2, p0

    move-wide v7, v14

    .line 2321
    invoke-virtual/range {v1 .. v8}, Ll/ᩳ᩹ᩴ;->d(Ljava/lang/Object;JJJ)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_0
    const/4 v1, 0x1

    if-eqz v12, :cond_7

    .line 2324
    array-length v2, v12

    sub-int/2addr v2, v1

    if-ltz v2, :cond_7

    .line 977
    sget-object v3, Ll/ܳۤᩴ;->f:Ll/ۙۤᩴ;

    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳۤᩴ;

    iget v3, v3, Ll/ܳۤᩴ;->b:I

    and-int/2addr v2, v3

    .line 2325
    aget-object v15, v12, v2

    if-eqz v15, :cond_7

    sget-object v14, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v16, Ll/ۧۤᩴ;->m:J

    iget-wide v2, v15, Ll/᩷ۤᩴ;->value:J

    add-long v20, v2, v10

    move-wide/from16 v18, v2

    .line 2327
    invoke-virtual/range {v14 .. v21}, Ll/ᩳ᩹ᩴ;->d(Ljava/lang/Object;JJJ)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_2

    :cond_1
    if-gt v0, v1, :cond_2

    goto/16 :goto_9

    .line 2333
    :cond_2
    invoke-virtual/range {p0 .. p0}, Ll/ۧۤᩴ;->j()J

    move-result-wide v14

    :cond_3
    if-ltz v0, :cond_16

    .line 2337
    :goto_0
    iget v5, v9, Ll/ۧۤᩴ;->sizeCtl:I

    int-to-long v0, v5

    cmp-long v2, v14, v0

    if-ltz v2, :cond_16

    iget-object v0, v9, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-eqz v0, :cond_16

    array-length v1, v0

    const/high16 v2, 0x40000000    # 2.0f

    if-ge v1, v2, :cond_16

    .line 2279
    invoke-static {v1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v1

    const v2, 0x8000

    or-int/2addr v1, v2

    if-gez v5, :cond_5

    ushr-int/lit8 v2, v5, 0x10

    if-ne v2, v1, :cond_16

    add-int/lit8 v2, v1, 0x1

    if-eq v5, v2, :cond_16

    const v2, 0xffff

    add-int/2addr v1, v2

    if-eq v5, v1, :cond_16

    .line 2341
    iget-object v7, v9, Ll/ۧۤᩴ;->b:[Ll/֡ۤᩴ;

    if-eqz v7, :cond_16

    iget v1, v9, Ll/ۧۤᩴ;->transferIndex:I

    if-gtz v1, :cond_4

    goto/16 :goto_9

    .line 2345
    :cond_4
    sget-object v1, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v3, Ll/ۧۤᩴ;->i:J

    add-int/lit8 v6, v5, 0x1

    move-object/from16 v2, p0

    invoke-virtual/range {v1 .. v6}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2346
    invoke-virtual {v9, v0, v7}, Ll/ۧۤᩴ;->m([Ll/֡ۤᩴ;[Ll/֡ۤᩴ;)V

    goto :goto_1

    .line 2348
    :cond_5
    sget-object v2, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v3, Ll/ۧۤᩴ;->i:J

    shl-int/lit8 v1, v1, 0x10

    add-int/lit8 v6, v1, 0x2

    move-object v1, v2

    move-object/from16 v2, p0

    invoke-virtual/range {v1 .. v6}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x0

    .line 2350
    invoke-virtual {v9, v0, v1}, Ll/ۧۤᩴ;->m([Ll/֡ۤᩴ;[Ll/֡ۤᩴ;)V

    .line 2351
    :cond_6
    :goto_1
    invoke-virtual/range {p0 .. p0}, Ll/ۧۤᩴ;->j()J

    move-result-wide v14

    goto :goto_0

    :cond_7
    const/4 v2, 0x1

    .line 977
    :goto_2
    sget-object v0, Ll/ܳۤᩴ;->f:Ll/ۙۤᩴ;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۤᩴ;

    iget v1, v1, Ll/ܳۤᩴ;->b:I

    if-nez v1, :cond_8

    .line 2580
    invoke-static {}, Ll/ܳۤᩴ;->d()V

    .line 977
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۤᩴ;

    iget v1, v0, Ll/ܳۤᩴ;->b:I

    const/4 v2, 0x1

    :cond_8
    const/4 v3, 0x0

    move-object v0, v9

    :goto_3
    const/4 v4, 0x0

    move/from16 v22, v1

    move-object v1, v0

    move/from16 v0, v22

    .line 2587
    :cond_9
    :goto_4
    iget-object v5, v1, Ll/ۧۤᩴ;->c:[Ll/᩷ۤᩴ;

    if-eqz v5, :cond_13

    array-length v6, v5

    if-lez v6, :cond_13

    add-int/lit8 v7, v6, -0x1

    and-int/2addr v7, v0

    .line 2588
    aget-object v15, v5, v7

    if-nez v15, :cond_b

    .line 2589
    iget v5, v1, Ll/ۧۤᩴ;->cellsBusy:I

    if-nez v5, :cond_12

    .line 2590
    new-instance v5, Ll/᩷ۤᩴ;

    invoke-direct {v5, v10, v11}, Ll/᩷ۤᩴ;-><init>(J)V

    .line 2591
    iget v6, v1, Ll/ۧۤᩴ;->cellsBusy:I

    if-nez v6, :cond_12

    sget-object v14, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v16, Ll/ۧۤᩴ;->l:J

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v15, v1

    .line 2592
    invoke-virtual/range {v14 .. v19}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 2596
    :try_start_0
    iget-object v6, v1, Ll/ۧۤᩴ;->c:[Ll/᩷ۤᩴ;

    if-eqz v6, :cond_a

    array-length v7, v6

    if-lez v7, :cond_a

    add-int/lit8 v7, v7, -0x1

    and-int/2addr v7, v0

    aget-object v8, v6, v7

    if-nez v8, :cond_a

    .line 2599
    aput-object v5, v6, v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, 0x1

    goto :goto_5

    :cond_a
    const/4 v5, 0x0

    .line 2603
    :goto_5
    iput v3, v1, Ll/ۧۤᩴ;->cellsBusy:I

    if-eqz v5, :cond_9

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    iput v3, v1, Ll/ۧۤᩴ;->cellsBusy:I

    .line 2604
    throw v0

    :cond_b
    if-nez v2, :cond_c

    const/4 v2, 0x1

    goto :goto_7

    .line 2614
    :cond_c
    sget-object v7, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v16, Ll/ۧۤᩴ;->m:J

    move v8, v4

    iget-wide v3, v15, Ll/᩷ۤᩴ;->value:J

    add-long v20, v3, v10

    move-object v14, v7

    move-wide/from16 v18, v3

    invoke-virtual/range {v14 .. v21}, Ll/ᩳ᩹ᩴ;->d(Ljava/lang/Object;JJJ)Z

    move-result v3

    if-eqz v3, :cond_d

    goto/16 :goto_9

    .line 2616
    :cond_d
    iget-object v3, v1, Ll/ۧۤᩴ;->c:[Ll/᩷ۤᩴ;

    if-ne v3, v5, :cond_12

    sget v3, Ll/ۧۤᩴ;->g:I

    if-lt v6, v3, :cond_e

    goto :goto_6

    :cond_e
    if-nez v8, :cond_f

    const/4 v4, 0x1

    goto :goto_7

    .line 2620
    :cond_f
    iget v3, v1, Ll/ۧۤᩴ;->cellsBusy:I

    if-nez v3, :cond_11

    sget-wide v16, Ll/ۧۤᩴ;->l:J

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v14, v7

    move-object v15, v1

    .line 2621
    invoke-virtual/range {v14 .. v19}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 2623
    :try_start_1
    iget-object v3, v1, Ll/ۧۤᩴ;->c:[Ll/᩷ۤᩴ;

    if-ne v3, v5, :cond_10

    shl-int/lit8 v3, v6, 0x1

    .line 2624
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ll/᩷ۤᩴ;

    iput-object v3, v1, Ll/ۧۤᩴ;->c:[Ll/᩷ۤᩴ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_10
    const/4 v3, 0x0

    .line 2626
    iput v3, v1, Ll/ۧۤᩴ;->cellsBusy:I

    move-object/from16 v22, v1

    move v1, v0

    move-object/from16 v0, v22

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    const/4 v3, 0x0

    iput v3, v1, Ll/ۧۤᩴ;->cellsBusy:I

    .line 2627
    throw v0

    :cond_11
    move v4, v8

    goto :goto_7

    :cond_12
    :goto_6
    const/4 v4, 0x0

    :goto_7
    shl-int/lit8 v1, v0, 0xd

    xor-int/2addr v0, v1

    ushr-int/lit8 v1, v0, 0x11

    xor-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    xor-int/2addr v0, v1

    .line 990
    sget-object v1, Ll/ܳۤᩴ;->f:Ll/ۙۤᩴ;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۤᩴ;

    iput v0, v1, Ll/ܳۤᩴ;->b:I

    move v8, v4

    const/4 v4, 0x0

    goto :goto_a

    :cond_13
    move v8, v4

    .line 2633
    iget v3, v1, Ll/ۧۤᩴ;->cellsBusy:I

    if-nez v3, :cond_15

    iget-object v3, v1, Ll/ۧۤᩴ;->c:[Ll/᩷ۤᩴ;

    if-ne v3, v5, :cond_15

    sget-object v14, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v16, Ll/ۧۤᩴ;->l:J

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v15, v1

    .line 2634
    invoke-virtual/range {v14 .. v19}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 2637
    :try_start_2
    iget-object v3, v1, Ll/ۧۤᩴ;->c:[Ll/᩷ۤᩴ;

    if-ne v3, v5, :cond_14

    new-array v3, v13, [Ll/᩷ۤᩴ;

    and-int/lit8 v4, v0, 0x1

    .line 2639
    new-instance v5, Ll/᩷ۤᩴ;

    invoke-direct {v5, v10, v11}, Ll/᩷ۤᩴ;-><init>(J)V

    aput-object v5, v3, v4

    .line 2640
    iput-object v3, v1, Ll/ۧۤᩴ;->c:[Ll/᩷ۤᩴ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 v3, 0x1

    goto :goto_8

    :cond_14
    const/4 v3, 0x0

    :goto_8
    const/4 v4, 0x0

    .line 2644
    iput v4, v1, Ll/ۧۤᩴ;->cellsBusy:I

    if-eqz v3, :cond_17

    goto :goto_9

    :catchall_2
    move-exception v0

    const/4 v4, 0x0

    iput v4, v1, Ll/ۧۤᩴ;->cellsBusy:I

    .line 2645
    throw v0

    :cond_15
    const/4 v4, 0x0

    .line 2649
    sget-object v14, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v16, Ll/ۧۤᩴ;->k:J

    iget-wide v5, v1, Ll/ۧۤᩴ;->baseCount:J

    add-long v20, v5, v10

    move-object v15, v1

    move-wide/from16 v18, v5

    invoke-virtual/range {v14 .. v21}, Ll/ᩳ᩹ᩴ;->d(Ljava/lang/Object;JJJ)Z

    move-result v1

    if-eqz v1, :cond_17

    :cond_16
    :goto_9
    return-void

    :cond_17
    :goto_a
    move v4, v8

    move-object v1, v9

    const/4 v3, 0x0

    goto/16 :goto_4
.end method

.method public clear()V
    .locals 11

    .line 1189
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    const-wide/16 v1, 0x0

    move-object v3, v0

    move-wide v4, v1

    :goto_0
    const/4 v0, 0x0

    move-wide v5, v4

    const/4 v4, 0x0

    :goto_1
    const/4 v7, -0x1

    if-eqz v3, :cond_6

    .line 1190
    array-length v0, v3

    if-ge v4, v0, :cond_6

    .line 1192
    invoke-static {v3, v4}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v8

    if-nez v8, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 1195
    :cond_0
    iget v9, v8, Ll/֡ۤᩴ;->a:I

    if-ne v9, v7, :cond_1

    .line 1196
    invoke-virtual {p0, v3, v8}, Ll/ۧۤᩴ;->d([Ll/֡ۤᩴ;Ll/֡ۤᩴ;)[Ll/֡ۤᩴ;

    move-result-object v3

    move-wide v4, v5

    goto :goto_0

    :cond_1
    move-object v0, v8

    .line 1200
    monitor-enter v0

    .line 1201
    :try_start_0
    invoke-static {v3, v4}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v7

    if-ne v7, v8, :cond_5

    const/4 v7, 0x0

    if-ltz v9, :cond_2

    goto :goto_2

    .line 1203
    :cond_2
    instance-of v9, v8, Ll/᩸ۤᩴ;

    if-eqz v9, :cond_3

    .line 1204
    check-cast v8, Ll/᩸ۤᩴ;

    iget-object v8, v8, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_2

    :cond_3
    move-object v8, v7

    :goto_2
    if-eqz v8, :cond_4

    const-wide/16 v9, 0x1

    sub-long/2addr v5, v9

    .line 1207
    iget-object v8, v8, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    goto :goto_2

    :cond_4
    add-int/lit8 v8, v4, 0x1

    .line 1209
    invoke-static {v3, v4, v7}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    move v4, v8

    .line 1211
    :cond_5
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_6
    cmp-long v0, v5, v1

    if-eqz v0, :cond_7

    .line 1215
    invoke-virtual {p0, v5, v6, v7}, Ll/ۧۤᩴ;->a(JI)V

    :cond_7
    return-void
.end method

.method public final compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 12

    const/4 v1, 0x0

    if-eqz p1, :cond_19

    if-eqz p2, :cond_19

    .line 1895
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ll/ۧۤᩴ;->i(I)I

    move-result v2

    .line 1899
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v3, v0

    move-object v6, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_0
    :goto_0
    if-eqz v3, :cond_18

    .line 1901
    array-length v0, v3

    if-nez v0, :cond_1

    goto/16 :goto_b

    :cond_1
    add-int/lit8 v0, v0, -0x1

    and-int v7, v0, v2

    .line 1903
    invoke-static {v3, v7}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v8

    if-nez v8, :cond_4

    .line 1904
    new-instance v8, Ll/ۚۤᩴ;

    invoke-direct {v8}, Ll/ۚۤᩴ;-><init>()V

    move-object v0, v8

    .line 1905
    monitor-enter v0

    .line 1906
    :try_start_0
    invoke-static {v3, v7, v8}, Ll/ۧۤᩴ;->b([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)Z

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v8, :cond_3

    .line 1910
    :try_start_1
    invoke-interface {p2, p1, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 1912
    new-instance v5, Ll/֡ۤᩴ;

    invoke-direct {v5, v2, p1, v4}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    move v6, v5

    move-object v5, v1

    .line 1915
    :goto_1
    :try_start_2
    invoke-static {v3, v7, v5}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    const/4 v5, 0x1

    move v5, v6

    move-object v6, v4

    const/4 v4, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    invoke-static {v3, v7, v1}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    .line 1916
    throw p1

    .line 1918
    :cond_3
    :goto_2
    monitor-exit v0

    if-eqz v4, :cond_0

    goto/16 :goto_a

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 1922
    :cond_4
    iget v9, v8, Ll/֡ۤᩴ;->a:I

    const/4 v0, -0x1

    if-ne v9, v0, :cond_5

    .line 1923
    invoke-virtual {p0, v3, v8}, Ll/ۧۤᩴ;->d([Ll/֡ۤᩴ;Ll/֡ۤᩴ;)[Ll/֡ۤᩴ;

    move-result-object v3

    goto :goto_0

    :cond_5
    move-object v0, v8

    .line 1925
    monitor-enter v0

    .line 1926
    :try_start_3
    invoke-static {v3, v7}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v10

    if-ne v10, v8, :cond_15

    if-ltz v9, :cond_c

    const/4 v4, 0x1

    move-object v6, v1

    .line 1931
    :goto_3
    iget v9, v8, Ll/֡ۤᩴ;->a:I

    if-ne v9, v2, :cond_9

    iget-object v9, v8, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v9, p1, :cond_6

    if-eqz v9, :cond_9

    .line 1933
    invoke-virtual {p1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 1934
    :cond_6
    iget-object v9, v8, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-interface {p2, p1, v9}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_7

    .line 1936
    iput-object v9, v8, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    :goto_4
    move-object v6, v9

    goto/16 :goto_9

    .line 1939
    :cond_7
    iget-object v5, v8, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-eqz v6, :cond_8

    .line 1941
    iput-object v5, v6, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    goto :goto_5

    .line 1943
    :cond_8
    invoke-static {v3, v7, v5}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    :goto_5
    const/4 v5, -0x1

    goto :goto_4

    .line 1948
    :cond_9
    iget-object v6, v8, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-nez v6, :cond_b

    .line 1949
    invoke-interface {p2, p1, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_15

    .line 1951
    iget-object v5, v8, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-nez v5, :cond_a

    .line 1954
    new-instance v5, Ll/֡ۤᩴ;

    invoke-direct {v5, v2, p1, v6}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v5, v8, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    const/4 v5, 0x1

    goto :goto_9

    .line 1952
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Recursive update"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    add-int/lit8 v4, v4, 0x1

    move-object v11, v8

    move-object v8, v6

    move-object v6, v11

    goto :goto_3

    .line 1960
    :cond_c
    instance-of v9, v8, Ll/᩸ۤᩴ;

    if-eqz v9, :cond_13

    .line 1962
    check-cast v8, Ll/᩸ۤᩴ;

    .line 1964
    iget-object v4, v8, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-eqz v4, :cond_d

    .line 1965
    invoke-virtual {v4, v2, p1, v1}, Ll/᩹ۤᩴ;->b(ILjava/lang/Object;Ljava/lang/Class;)Ll/᩹ۤᩴ;

    move-result-object v4

    goto :goto_6

    :cond_d
    move-object v4, v1

    :goto_6
    if-nez v4, :cond_e

    move-object v6, v1

    goto :goto_7

    .line 1968
    :cond_e
    iget-object v6, v4, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    .line 1969
    :goto_7
    invoke-interface {p2, p1, v6}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_10

    if-eqz v4, :cond_f

    .line 1972
    iput-object v6, v4, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    goto :goto_8

    .line 1975
    :cond_f
    invoke-virtual {v8, v2, p1, v6}, Ll/᩸ۤᩴ;->e(ILjava/lang/Object;Ljava/lang/Object;)Ll/᩹ۤᩴ;

    const/4 v5, 0x1

    goto :goto_8

    :cond_10
    if-eqz v4, :cond_12

    .line 1980
    invoke-virtual {v8, v4}, Ll/᩸ۤᩴ;->f(Ll/᩹ۤᩴ;)Z

    move-result v4

    if-eqz v4, :cond_11

    .line 1981
    iget-object v4, v8, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    invoke-static {v4}, Ll/ۧۤᩴ;->p(Ll/᩹ۤᩴ;)Ll/֡ۤᩴ;

    move-result-object v4

    invoke-static {v3, v7, v4}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    :cond_11
    const/4 v5, -0x1

    :cond_12
    :goto_8
    const/4 v4, 0x1

    goto :goto_9

    .line 1984
    :cond_13
    instance-of v8, v8, Ll/ۚۤᩴ;

    if-nez v8, :cond_14

    goto :goto_9

    .line 1985
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Recursive update"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1987
    :cond_15
    :goto_9
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v4, :cond_0

    const/16 p1, 0x8

    if-lt v4, p1, :cond_16

    .line 1990
    invoke-virtual {p0, v3, v7}, Ll/ۧۤᩴ;->n([Ll/֡ۤᩴ;I)V

    :cond_16
    :goto_a
    if-eqz v5, :cond_17

    int-to-long p1, v5

    .line 1996
    invoke-virtual {p0, p1, p2, v4}, Ll/ۧۤᩴ;->a(JI)V

    :cond_17
    return-object v6

    :catchall_2
    move-exception p1

    .line 1987
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1

    .line 1902
    :cond_18
    :goto_b
    invoke-virtual {p0}, Ll/ۧۤᩴ;->e()[Ll/֡ۤᩴ;

    move-result-object v3

    goto/16 :goto_0

    .line 1894
    :cond_19
    throw v1
.end method

.method public final computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    .locals 11

    const/4 v1, 0x0

    if-eqz p1, :cond_16

    if-eqz p2, :cond_16

    .line 1693
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ll/ۧۤᩴ;->i(I)I

    move-result v2

    .line 1696
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    const/4 v3, 0x0

    move-object v3, v0

    move-object v5, v1

    const/4 v4, 0x0

    :cond_0
    :goto_0
    if-eqz v3, :cond_15

    .line 1698
    array-length v0, v3

    if-nez v0, :cond_1

    goto/16 :goto_9

    :cond_1
    add-int/lit8 v0, v0, -0x1

    and-int v6, v0, v2

    .line 1700
    invoke-static {v3, v6}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v7

    const/4 v8, 0x1

    if-nez v7, :cond_4

    .line 1701
    new-instance v7, Ll/ۚۤᩴ;

    invoke-direct {v7}, Ll/ۚۤᩴ;-><init>()V

    move-object v0, v7

    .line 1702
    monitor-enter v0

    .line 1703
    :try_start_0
    invoke-static {v3, v6, v7}, Ll/ۧۤᩴ;->b([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v7, :cond_3

    .line 1707
    :try_start_1
    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 1708
    new-instance v5, Ll/֡ۤᩴ;

    invoke-direct {v5, v2, p1, v4}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_2
    move-object v5, v1

    .line 1710
    :goto_1
    :try_start_2
    invoke-static {v3, v6, v5}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    const/4 v5, 0x1

    move-object v5, v4

    const/4 v4, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    invoke-static {v3, v6, v1}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    .line 1711
    throw p1

    .line 1713
    :cond_3
    :goto_2
    monitor-exit v0

    if-eqz v4, :cond_0

    goto/16 :goto_8

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 1717
    :cond_4
    iget v9, v7, Ll/֡ۤᩴ;->a:I

    const/4 v0, -0x1

    if-ne v9, v0, :cond_5

    .line 1718
    invoke-virtual {p0, v3, v7}, Ll/ۧۤᩴ;->d([Ll/֡ۤᩴ;Ll/֡ۤᩴ;)[Ll/֡ۤᩴ;

    move-result-object v3

    goto :goto_0

    :cond_5
    if-ne v9, v2, :cond_7

    .line 1719
    iget-object v0, v7, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v0, p1, :cond_6

    if-eqz v0, :cond_7

    .line 1720
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    iget-object v0, v7, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    if-eqz v0, :cond_7

    return-object v0

    :cond_7
    move-object v0, v7

    .line 1725
    monitor-enter v0

    .line 1726
    :try_start_3
    invoke-static {v3, v6}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v10

    if-ne v10, v7, :cond_11

    if-ltz v9, :cond_c

    const/4 v4, 0x1

    .line 1731
    :goto_3
    iget v5, v7, Ll/֡ۤᩴ;->a:I

    if-ne v5, v2, :cond_9

    iget-object v5, v7, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v5, p1, :cond_8

    if-eqz v5, :cond_9

    .line 1733
    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 1734
    :cond_8
    iget-object v5, v7, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    goto :goto_6

    .line 1738
    :cond_9
    iget-object v5, v7, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-nez v5, :cond_b

    .line 1739
    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_11

    .line 1740
    iget-object v9, v7, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-nez v9, :cond_a

    .line 1743
    new-instance v9, Ll/֡ۤᩴ;

    invoke-direct {v9, v2, p1, v5}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v9, v7, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    goto :goto_7

    .line 1741
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Recursive update"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    add-int/lit8 v4, v4, 0x1

    move-object v7, v5

    goto :goto_3

    .line 1749
    :cond_c
    instance-of v9, v7, Ll/᩸ۤᩴ;

    if-eqz v9, :cond_f

    .line 1751
    check-cast v7, Ll/᩸ۤᩴ;

    .line 1753
    iget-object v4, v7, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-eqz v4, :cond_d

    .line 1754
    invoke-virtual {v4, v2, p1, v1}, Ll/᩹ۤᩴ;->b(ILjava/lang/Object;Ljava/lang/Class;)Ll/᩹ۤᩴ;

    move-result-object v4

    if-eqz v4, :cond_d

    .line 1755
    iget-object v4, v4, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    goto :goto_4

    .line 1756
    :cond_d
    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_e

    .line 1758
    invoke-virtual {v7, v2, p1, v4}, Ll/᩸ۤᩴ;->e(ILjava/lang/Object;Ljava/lang/Object;)Ll/᩹ۤᩴ;

    goto :goto_5

    :cond_e
    :goto_4
    const/4 v8, 0x0

    :goto_5
    const/4 v5, 0x2

    move-object v5, v4

    const/4 v4, 0x2

    goto :goto_7

    .line 1761
    :cond_f
    instance-of v7, v7, Ll/ۚۤᩴ;

    if-nez v7, :cond_10

    goto :goto_6

    .line 1762
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Recursive update"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    :goto_6
    const/4 v8, 0x0

    .line 1764
    :goto_7
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v4, :cond_0

    const/16 p1, 0x8

    if-lt v4, p1, :cond_12

    .line 1767
    invoke-virtual {p0, v3, v6}, Ll/ۧۤᩴ;->n([Ll/֡ۤᩴ;I)V

    :cond_12
    if-nez v8, :cond_13

    return-object v5

    :cond_13
    :goto_8
    if-eqz v5, :cond_14

    const-wide/16 p1, 0x1

    .line 1775
    invoke-virtual {p0, p1, p2, v4}, Ll/ۧۤᩴ;->a(JI)V

    :cond_14
    return-object v5

    :catchall_2
    move-exception p1

    .line 1764
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1

    .line 1699
    :cond_15
    :goto_9
    invoke-virtual {p0}, Ll/ۧۤᩴ;->e()[Ll/֡ۤᩴ;

    move-result-object v3

    goto/16 :goto_0

    .line 1692
    :cond_16
    throw v1
.end method

.method public final computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 12

    const/4 v1, 0x0

    if-eqz p1, :cond_12

    if-eqz p2, :cond_12

    .line 1802
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ll/ۧۤᩴ;->i(I)I

    move-result v2

    .line 1806
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v3, v0

    move-object v6, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_0
    :goto_0
    if-eqz v3, :cond_11

    .line 1808
    array-length v0, v3

    if-nez v0, :cond_1

    goto/16 :goto_6

    :cond_1
    add-int/lit8 v0, v0, -0x1

    and-int v7, v0, v2

    .line 1810
    invoke-static {v3, v7}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v8

    if-nez v8, :cond_2

    goto/16 :goto_5

    .line 1812
    :cond_2
    iget v9, v8, Ll/֡ۤᩴ;->a:I

    const/4 v0, -0x1

    if-ne v9, v0, :cond_3

    .line 1813
    invoke-virtual {p0, v3, v8}, Ll/ۧۤᩴ;->d([Ll/֡ۤᩴ;Ll/֡ۤᩴ;)[Ll/֡ۤᩴ;

    move-result-object v3

    goto :goto_0

    :cond_3
    move-object v0, v8

    .line 1815
    monitor-enter v0

    .line 1816
    :try_start_0
    invoke-static {v3, v7}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v10

    if-ne v10, v8, :cond_f

    if-ltz v9, :cond_9

    const/4 v5, 0x1

    move-object v9, v1

    .line 1821
    :goto_1
    iget v10, v8, Ll/֡ۤᩴ;->a:I

    if-ne v10, v2, :cond_7

    iget-object v10, v8, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v10, p1, :cond_4

    if-eqz v10, :cond_7

    .line 1823
    invoke-virtual {p1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 1824
    :cond_4
    iget-object v6, v8, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-interface {p2, p1, v6}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 1826
    iput-object v6, v8, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    goto :goto_4

    .line 1829
    :cond_5
    iget-object v4, v8, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-eqz v9, :cond_6

    .line 1831
    iput-object v4, v9, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    goto :goto_2

    .line 1833
    :cond_6
    invoke-static {v3, v7, v4}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    :goto_2
    const/4 v4, -0x1

    goto :goto_4

    .line 1838
    :cond_7
    iget-object v9, v8, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-nez v9, :cond_8

    goto :goto_4

    :cond_8
    add-int/lit8 v5, v5, 0x1

    move-object v11, v9

    move-object v9, v8

    move-object v8, v11

    goto :goto_1

    .line 1842
    :cond_9
    instance-of v9, v8, Ll/᩸ۤᩴ;

    if-eqz v9, :cond_d

    .line 1844
    check-cast v8, Ll/᩸ۤᩴ;

    .line 1846
    iget-object v5, v8, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-eqz v5, :cond_c

    .line 1847
    invoke-virtual {v5, v2, p1, v1}, Ll/᩹ۤᩴ;->b(ILjava/lang/Object;Ljava/lang/Class;)Ll/᩹ۤᩴ;

    move-result-object v5

    if-eqz v5, :cond_c

    .line 1848
    iget-object v6, v5, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-interface {p2, p1, v6}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_a

    .line 1850
    iput-object v6, v5, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    goto :goto_3

    .line 1853
    :cond_a
    invoke-virtual {v8, v5}, Ll/᩸ۤᩴ;->f(Ll/᩹ۤᩴ;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 1854
    iget-object v4, v8, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    invoke-static {v4}, Ll/ۧۤᩴ;->p(Ll/᩹ۤᩴ;)Ll/֡ۤᩴ;

    move-result-object v4

    invoke-static {v3, v7, v4}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    :cond_b
    const/4 v4, -0x1

    :cond_c
    :goto_3
    const/4 v5, 0x2

    goto :goto_4

    .line 1858
    :cond_d
    instance-of v7, v8, Ll/ۚۤᩴ;

    if-nez v7, :cond_e

    goto :goto_4

    .line 1859
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Recursive update"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1861
    :cond_f
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_0

    :goto_5
    if-eqz v4, :cond_10

    int-to-long p1, v4

    .line 1867
    invoke-virtual {p0, p1, p2, v5}, Ll/ۧۤᩴ;->a(JI)V

    :cond_10
    return-object v6

    :catchall_0
    move-exception p1

    .line 1861
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 1809
    :cond_11
    :goto_6
    invoke-virtual {p0}, Ll/ۧۤᩴ;->e()[Ll/֡ۤᩴ;

    move-result-object v3

    goto/16 :goto_0

    .line 1801
    :cond_12
    throw v1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    .line 2129
    invoke-virtual {p0, p1}, Ll/ۧۤᩴ;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 964
    invoke-virtual {p0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 5

    .line 979
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 981
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 982
    new-instance v2, Ll/ܶۤᩴ;

    array-length v3, v0

    array-length v4, v0

    invoke-direct {v2, v0, v3, v1, v4}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 983
    :cond_0
    invoke-virtual {v2}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 985
    iget-object v0, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    if-eq v0, p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final d([Ll/֡ۤᩴ;Ll/֡ۤᩴ;)[Ll/֡ۤᩴ;
    .locals 8

    .line 2361
    instance-of v0, p2, Ll/ۖۤᩴ;

    if-eqz v0, :cond_3

    check-cast p2, Ll/ۖۤᩴ;

    iget-object p2, p2, Ll/ۖۤᩴ;->e:[Ll/֡ۤᩴ;

    .line 2363
    array-length v0, p1

    .line 2279
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    const v1, 0x8000

    or-int/2addr v0, v1

    .line 2364
    :cond_0
    iget-object v1, p0, Ll/ۧۤᩴ;->b:[Ll/֡ۤᩴ;

    if-ne p2, v1, :cond_2

    iget-object v1, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-ne v1, p1, :cond_2

    iget v6, p0, Ll/ۧۤᩴ;->sizeCtl:I

    if-gez v6, :cond_2

    ushr-int/lit8 v1, v6, 0x10

    if-ne v1, v0, :cond_2

    add-int/lit8 v1, v0, 0x1

    if-eq v6, v1, :cond_2

    const v1, 0xffff

    add-int/2addr v1, v0

    if-eq v6, v1, :cond_2

    .line 2366
    iget v1, p0, Ll/ۧۤᩴ;->transferIndex:I

    if-gtz v1, :cond_1

    goto :goto_0

    .line 2369
    :cond_1
    sget-object v2, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v4, Ll/ۧۤᩴ;->i:J

    add-int/lit8 v7, v6, 0x1

    move-object v3, p0

    invoke-virtual/range {v2 .. v7}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2370
    invoke-virtual {p0, p1, p2}, Ll/ۧۤᩴ;->m([Ll/֡ۤᩴ;[Ll/֡ۤᩴ;)V

    :cond_2
    :goto_0
    return-object p2

    .line 2376
    :cond_3
    iget-object p1, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    return-object p1
.end method

.method public final e()[Ll/֡ۤᩴ;
    .locals 8

    .line 2287
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-eqz v0, :cond_2

    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    .line 2288
    :cond_2
    :goto_1
    iget v0, p0, Ll/ۧۤᩴ;->sizeCtl:I

    if-gez v0, :cond_3

    .line 2289
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    .line 2290
    :cond_3
    sget-object v2, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v4, Ll/ۧۤᩴ;->i:J

    const/4 v7, -0x1

    move-object v3, p0

    move v6, v0

    invoke-virtual/range {v2 .. v7}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2292
    :try_start_0
    iget-object v1, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-eqz v1, :cond_4

    array-length v2, v1

    if-nez v2, :cond_6

    :cond_4
    if-lez v0, :cond_5

    move v1, v0

    goto :goto_2

    :cond_5
    const/16 v1, 0x10

    .line 2295
    :goto_2
    new-array v2, v1, [Ll/֡ۤᩴ;

    .line 2296
    iput-object v2, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    ushr-int/lit8 v0, v1, 0x2

    sub-int v0, v1, v0

    move-object v1, v2

    .line 2300
    :cond_6
    iput v0, p0, Ll/ۧۤᩴ;->sizeCtl:I

    return-object v1

    :catchall_0
    move-exception v1

    iput v0, p0, Ll/ۧۤᩴ;->sizeCtl:I

    .line 2301
    throw v1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1

    .line 1287
    iget-object v0, p0, Ll/ۧۤᩴ;->f:Ll/ۡۤᩴ;

    if-eqz v0, :cond_0

    return-object v0

    .line 1288
    :cond_0
    new-instance v0, Ll/ۡۤᩴ;

    .line 4788
    invoke-direct {v0, p0}, Ll/۟۫ᩴ;-><init>(Ll/ۧۤᩴ;)V

    .line 1288
    iput-object v0, p0, Ll/ۧۤᩴ;->f:Ll/ۡۤᩴ;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-eq p1, p0, :cond_7

    .line 1354
    instance-of v0, p1, Ljava/util/Map;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1356
    :cond_0
    check-cast p1, Ljava/util/Map;

    .line 1358
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-nez v0, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    array-length v2, v0

    .line 1359
    :goto_0
    new-instance v3, Ll/ܶۤᩴ;

    invoke-direct {v3, v0, v2, v1, v2}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 1360
    :cond_2
    invoke-virtual {v3}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 1361
    iget-object v2, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    .line 1362
    iget-object v0, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    .line 1363
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_3
    return v1

    .line 1366
    :cond_4
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1368
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 1369
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 1370
    invoke-virtual {p0, v2}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_6

    if-eq v0, v2, :cond_5

    .line 1371
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_6
    return v1

    :cond_7
    const/4 p1, 0x1

    return p1
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 9

    const/4 v1, 0x0

    if-eqz p1, :cond_13

    if-eqz p2, :cond_13

    .line 1012
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ll/ۧۤᩴ;->i(I)I

    move-result v2

    .line 1014
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    const/4 v3, 0x0

    move-object v3, v0

    const/4 v4, 0x0

    :cond_0
    :goto_0
    if-eqz v3, :cond_12

    .line 1016
    array-length v0, v3

    if-nez v0, :cond_1

    goto/16 :goto_6

    :cond_1
    add-int/lit8 v0, v0, -0x1

    and-int v5, v0, v2

    .line 1018
    invoke-static {v3, v5}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v6

    if-nez v6, :cond_2

    .line 1019
    new-instance v0, Ll/֡ۤᩴ;

    invoke-direct {v0, v2, p1, p2}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v5, v0}, Ll/ۧۤᩴ;->b([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    .line 1022
    :cond_2
    iget v7, v6, Ll/֡ۤᩴ;->a:I

    const/4 v0, -0x1

    if-ne v7, v0, :cond_3

    .line 1023
    invoke-virtual {p0, v3, v6}, Ll/ۧۤᩴ;->d([Ll/֡ۤᩴ;Ll/֡ۤᩴ;)[Ll/֡ۤᩴ;

    move-result-object v3

    goto :goto_0

    :cond_3
    if-eqz p3, :cond_5

    if-ne v7, v2, :cond_5

    .line 1024
    iget-object v0, v6, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v0, p1, :cond_4

    if-eqz v0, :cond_5

    .line 1026
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    iget-object v0, v6, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    move-object v0, v6

    .line 1031
    monitor-enter v0

    .line 1032
    :try_start_0
    invoke-static {v3, v5}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v8

    if-ne v8, v6, :cond_e

    if-ltz v7, :cond_9

    const/4 v4, 0x1

    .line 1037
    :goto_1
    iget v7, v6, Ll/֡ۤᩴ;->a:I

    if-ne v7, v2, :cond_7

    iget-object v7, v6, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v7, p1, :cond_6

    if-eqz v7, :cond_7

    .line 1039
    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 1040
    :cond_6
    iget-object v7, v6, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    if-nez p3, :cond_f

    .line 1042
    iput-object p2, v6, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    goto :goto_4

    .line 1046
    :cond_7
    iget-object v7, v6, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-nez v7, :cond_8

    .line 1047
    new-instance v7, Ll/֡ۤᩴ;

    invoke-direct {v7, v2, p1, p2}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v7, v6, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    goto :goto_3

    :cond_8
    add-int/lit8 v4, v4, 0x1

    move-object v6, v7

    goto :goto_1

    .line 1052
    :cond_9
    instance-of v7, v6, Ll/᩸ۤᩴ;

    if-eqz v7, :cond_c

    .line 1055
    check-cast v6, Ll/᩸ۤᩴ;

    invoke-virtual {v6, v2, p1, p2}, Ll/᩸ۤᩴ;->e(ILjava/lang/Object;Ljava/lang/Object;)Ll/᩹ۤᩴ;

    move-result-object v4

    if-eqz v4, :cond_b

    .line 1057
    iget-object v6, v4, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    if-nez p3, :cond_a

    .line 1059
    iput-object p2, v4, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    :cond_a
    move-object v7, v6

    goto :goto_2

    :cond_b
    move-object v7, v1

    :goto_2
    const/4 v4, 0x2

    goto :goto_4

    .line 1062
    :cond_c
    instance-of v6, v6, Ll/ۚۤᩴ;

    if-nez v6, :cond_d

    goto :goto_3

    .line 1063
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Recursive update"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_3
    move-object v7, v1

    .line 1065
    :cond_f
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    const/16 p1, 0x8

    if-lt v4, p1, :cond_10

    .line 1068
    invoke-virtual {p0, v3, v5}, Ll/ۧۤᩴ;->n([Ll/֡ۤᩴ;I)V

    :cond_10
    if-eqz v7, :cond_11

    return-object v7

    :cond_11
    :goto_5
    const-wide/16 p1, 0x1

    .line 1075
    invoke-virtual {p0, p1, p2, v4}, Ll/ۧۤᩴ;->a(JI)V

    return-object v1

    :catchall_0
    move-exception p1

    .line 1065
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 1017
    :cond_12
    :goto_6
    invoke-virtual {p0}, Ll/ۧۤᩴ;->e()[Ll/֡ۤᩴ;

    move-result-object v3

    goto/16 :goto_0

    .line 1011
    :cond_13
    throw v1
.end method

.method public final forEach(Ljava/util/function/BiConsumer;)V
    .locals 5

    .line 1600
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1602
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-eqz v0, :cond_0

    .line 1603
    new-instance v1, Ll/ܶۤᩴ;

    array-length v2, v0

    const/4 v3, 0x0

    array-length v4, v0

    invoke-direct {v1, v0, v2, v3, v4}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 1604
    :goto_0
    invoke-virtual {v1}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1605
    iget-object v2, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    iget-object v0, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-interface {p1, v2, v0}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1111
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ll/ۧۤᩴ;->i(I)I

    move-result v1

    .line 1112
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    move-object v2, v0

    :cond_0
    :goto_0
    const/4 v3, 0x0

    if-eqz v2, :cond_12

    .line 1114
    array-length v0, v2

    if-eqz v0, :cond_12

    add-int/lit8 v0, v0, -0x1

    and-int v4, v0, v1

    .line 1115
    invoke-static {v2, v4}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v5

    if-nez v5, :cond_1

    goto/16 :goto_5

    .line 1117
    :cond_1
    iget v6, v5, Ll/֡ۤᩴ;->a:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_2

    .line 1118
    invoke-virtual {p0, v2, v5}, Ll/ۧۤᩴ;->d([Ll/֡ۤᩴ;Ll/֡ۤᩴ;)[Ll/֡ۤᩴ;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v0, v5

    .line 1122
    monitor-enter v0

    .line 1123
    :try_start_0
    invoke-static {v2, v4}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v8

    if-ne v8, v5, :cond_e

    const/4 v8, 0x1

    if-ltz v6, :cond_9

    move-object v6, v3

    .line 1128
    :goto_1
    iget v9, v5, Ll/֡ۤᩴ;->a:I

    if-ne v9, v1, :cond_7

    iget-object v9, v5, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v9, p1, :cond_3

    if-eqz v9, :cond_7

    .line 1130
    invoke-virtual {p1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 1131
    :cond_3
    iget-object v9, v5, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    if-eqz p3, :cond_4

    if-eq p3, v9, :cond_4

    if-eqz v9, :cond_f

    .line 1133
    invoke-virtual {p3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f

    :cond_4
    if-eqz p2, :cond_5

    .line 1136
    iput-object p2, v5, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    goto :goto_4

    :cond_5
    if-eqz v6, :cond_6

    .line 1138
    iget-object v4, v5, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    iput-object v4, v6, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    goto :goto_4

    .line 1140
    :cond_6
    iget-object v5, v5, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    invoke-static {v2, v4, v5}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    goto :goto_4

    .line 1145
    :cond_7
    iget-object v6, v5, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-nez v6, :cond_8

    goto :goto_3

    :cond_8
    move-object v11, v6

    move-object v6, v5

    move-object v5, v11

    goto :goto_1

    .line 1149
    :cond_9
    instance-of v6, v5, Ll/᩸ۤᩴ;

    if-eqz v6, :cond_c

    .line 1151
    check-cast v5, Ll/᩸ۤᩴ;

    .line 1153
    iget-object v6, v5, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-eqz v6, :cond_f

    .line 1154
    invoke-virtual {v6, v1, p1, v3}, Ll/᩹ۤᩴ;->b(ILjava/lang/Object;Ljava/lang/Class;)Ll/᩹ۤᩴ;

    move-result-object v6

    if-eqz v6, :cond_f

    .line 1155
    iget-object v9, v6, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    if-eqz p3, :cond_a

    if-eq p3, v9, :cond_a

    if-eqz v9, :cond_f

    .line 1157
    invoke-virtual {p3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f

    :cond_a
    if-eqz p2, :cond_b

    .line 1160
    iput-object p2, v6, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    goto :goto_4

    .line 1161
    :cond_b
    invoke-virtual {v5, v6}, Ll/᩸ۤᩴ;->f(Ll/᩹ۤᩴ;)Z

    move-result v6

    if-eqz v6, :cond_10

    .line 1162
    iget-object v5, v5, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    invoke-static {v5}, Ll/ۧۤᩴ;->p(Ll/᩹ۤᩴ;)Ll/֡ۤᩴ;

    move-result-object v5

    invoke-static {v2, v4, v5}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    goto :goto_4

    .line 1166
    :cond_c
    instance-of v4, v5, Ll/ۚۤᩴ;

    if-nez v4, :cond_d

    goto :goto_2

    .line 1167
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Recursive update"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_2
    const/4 v8, 0x0

    :cond_f
    :goto_3
    move-object v9, v3

    .line 1169
    :cond_10
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v8, :cond_0

    if-eqz v9, :cond_12

    if-nez p2, :cond_11

    const-wide/16 p1, -0x1

    .line 1173
    invoke-virtual {p0, p1, p2, v7}, Ll/ۧۤᩴ;->a(JI)V

    :cond_11
    return-object v9

    :catchall_0
    move-exception p1

    .line 1169
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_12
    :goto_5
    return-object v3
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 936
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ll/ۧۤᩴ;->i(I)I

    move-result v0

    .line 937
    iget-object v1, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-eqz v1, :cond_4

    array-length v2, v1

    if-lez v2, :cond_4

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v2, v0

    .line 938
    invoke-static {v1, v2}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 939
    iget v2, v1, Ll/֡ۤᩴ;->a:I

    if-ne v2, v0, :cond_1

    .line 940
    iget-object v2, v1, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v2, p1, :cond_0

    if-eqz v2, :cond_2

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 941
    :cond_0
    iget-object p1, v1, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    return-object p1

    :cond_1
    if-gez v2, :cond_2

    .line 944
    invoke-virtual {v1, v0, p1}, Ll/֡ۤᩴ;->a(ILjava/lang/Object;)Ll/֡ۤᩴ;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p1, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    return-object p1

    .line 945
    :cond_2
    iget-object v1, v1, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-eqz v1, :cond_4

    .line 946
    iget v2, v1, Ll/֡ۤᩴ;->a:I

    if-ne v2, v0, :cond_2

    iget-object v2, v1, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v2, p1, :cond_3

    if-eqz v2, :cond_2

    .line 947
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 948
    :cond_3
    iget-object p1, v1, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1596
    invoke-virtual {p0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    return-object p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1301
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1302
    new-instance v2, Ll/ܶۤᩴ;

    array-length v3, v0

    array-length v4, v0

    invoke-direct {v2, v0, v3, v1, v4}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 1303
    :goto_0
    invoke-virtual {v2}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1304
    iget-object v3, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    iget-object v0, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    xor-int/2addr v0, v3

    add-int/2addr v1, v0

    goto :goto_0

    :cond_0
    return v1
.end method

.method public isEmpty()Z
    .locals 5

    .line 920
    invoke-virtual {p0}, Ll/ۧۤᩴ;->j()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()J
    .locals 7

    .line 2566
    iget-object v0, p0, Ll/ۧۤᩴ;->c:[Ll/᩷ۤᩴ;

    .line 2567
    iget-wide v1, p0, Ll/ۧۤᩴ;->baseCount:J

    if-eqz v0, :cond_1

    .line 2569
    array-length v3, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v0, v4

    if-eqz v5, :cond_0

    .line 2571
    iget-wide v5, v5, Ll/᩷ۤᩴ;->value:J

    add-long/2addr v1, v5

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-wide v1
.end method

.method public keySet()Ljava/util/Set;
    .locals 2

    .line 1240
    iget-object v0, p0, Ll/ۧۤᩴ;->d:Ll/֫ۤᩴ;

    if-eqz v0, :cond_0

    return-object v0

    .line 1241
    :cond_0
    new-instance v0, Ll/֫ۤᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/֫ۤᩴ;-><init>(Ll/ۧۤᩴ;Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۧۤᩴ;->d:Ll/֫ۤᩴ;

    return-object v0
.end method

.method public final m([Ll/֡ۤᩴ;[Ll/֡ۤᩴ;)V
    .locals 27

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    .line 2421
    array-length v8, v0

    .line 2422
    sget v1, Ll/ۧۤᩴ;->g:I

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    ushr-int/lit8 v2, v8, 0x3

    div-int/2addr v2, v1

    goto :goto_0

    :cond_0
    move v2, v8

    :goto_0
    const/16 v1, 0x10

    if-ge v2, v1, :cond_1

    const/16 v2, 0x10

    const/16 v9, 0x10

    goto :goto_1

    :cond_1
    move v9, v2

    :goto_1
    if-nez p2, :cond_2

    shl-int/lit8 v1, v8, 0x1

    .line 2427
    :try_start_0
    new-array v1, v1, [Ll/֡ۤᩴ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2433
    iput-object v1, v7, Ll/ۧۤᩴ;->b:[Ll/֡ۤᩴ;

    .line 2434
    iput v8, v7, Ll/ۧۤᩴ;->transferIndex:I

    move-object v10, v1

    goto :goto_2

    :catchall_0
    const v0, 0x7fffffff

    .line 2430
    iput v0, v7, Ll/ۧۤᩴ;->sizeCtl:I

    return-void

    :cond_2
    move-object/from16 v10, p2

    .line 2436
    :goto_2
    array-length v11, v10

    .line 2437
    new-instance v12, Ll/ۖۤᩴ;

    invoke-direct {v12, v10}, Ll/ۖۤᩴ;-><init>([Ll/֡ۤᩴ;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v17, 0x0

    :cond_3
    :goto_3
    const/4 v1, -0x1

    if-eqz v15, :cond_8

    add-int/lit8 v13, v13, -0x1

    if-ge v13, v14, :cond_7

    if-eqz v17, :cond_4

    goto :goto_5

    .line 2446
    :cond_4
    iget v6, v7, Ll/ۧۤᩴ;->transferIndex:I

    if-gtz v6, :cond_5

    const/4 v1, -0x1

    const/4 v13, -0x1

    goto :goto_5

    .line 2450
    :cond_5
    sget-object v1, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v3, Ll/ۧۤᩴ;->j:J

    if-le v6, v9, :cond_6

    sub-int v2, v6, v9

    move/from16 v16, v2

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    const/16 v16, 0x0

    :goto_4
    move-object/from16 v2, p0

    move v5, v6

    move/from16 v18, v6

    move/from16 v6, v16

    .line 2451
    invoke-virtual/range {v1 .. v6}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v1

    if-eqz v1, :cond_3

    add-int/lit8 v6, v18, -0x1

    move v13, v6

    move/from16 v14, v16

    :cond_7
    :goto_5
    const/4 v15, 0x0

    goto :goto_3

    :cond_8
    const/4 v2, 0x0

    if-ltz v13, :cond_1c

    if-ge v13, v8, :cond_1c

    add-int v3, v13, v8

    if-lt v3, v11, :cond_9

    goto/16 :goto_12

    .line 2474
    :cond_9
    invoke-static {v0, v13}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v4

    if-nez v4, :cond_a

    .line 2475
    invoke-static {v0, v13, v12}, Ll/ۧۤᩴ;->b([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)Z

    move-result v1

    goto :goto_6

    .line 2476
    :cond_a
    iget v5, v4, Ll/֡ۤᩴ;->a:I

    if-ne v5, v1, :cond_b

    const/4 v1, 0x1

    :goto_6
    move v15, v1

    move/from16 v19, v9

    move/from16 v18, v11

    move/from16 v26, v14

    goto/16 :goto_13

    :cond_b
    move-object/from16 v16, v4

    .line 2479
    monitor-enter v16

    .line 2480
    :try_start_1
    invoke-static {v0, v13}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v1

    if-ne v1, v4, :cond_1a

    if-ltz v5, :cond_11

    and-int v1, v5, v8

    .line 2485
    iget-object v5, v4, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    move-object v6, v4

    :goto_7
    if-eqz v5, :cond_d

    .line 2486
    iget v15, v5, Ll/֡ۤᩴ;->a:I

    and-int/2addr v15, v8

    if-eq v15, v1, :cond_c

    move-object v6, v5

    move v1, v15

    .line 2485
    :cond_c
    iget-object v5, v5, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    goto :goto_7

    :cond_d
    if-nez v1, :cond_e

    move-object v1, v2

    move-object v2, v6

    goto :goto_8

    :cond_e
    move-object v1, v6

    :goto_8
    if-eq v4, v6, :cond_10

    .line 2501
    iget v5, v4, Ll/֡ۤᩴ;->a:I

    iget-object v15, v4, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    move-object/from16 v18, v6

    iget-object v6, v4, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    and-int v19, v5, v8

    if-nez v19, :cond_f

    move/from16 v19, v9

    .line 2503
    new-instance v9, Ll/֡ۤᩴ;

    invoke-direct {v9, v5, v15, v6, v2}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ll/֡ۤᩴ;)V

    move-object v2, v9

    goto :goto_9

    :cond_f
    move/from16 v19, v9

    .line 2505
    new-instance v9, Ll/֡ۤᩴ;

    invoke-direct {v9, v5, v15, v6, v1}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ll/֡ۤᩴ;)V

    move-object v1, v9

    .line 2500
    :goto_9
    iget-object v4, v4, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    move-object/from16 v6, v18

    move/from16 v9, v19

    goto :goto_8

    :cond_10
    move/from16 v19, v9

    .line 2507
    invoke-static {v10, v13, v2}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    .line 2508
    invoke-static {v10, v3, v1}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    .line 2509
    invoke-static {v0, v13, v12}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    move/from16 v18, v11

    move/from16 v26, v14

    goto/16 :goto_10

    :cond_11
    move/from16 v19, v9

    .line 2512
    instance-of v1, v4, Ll/᩸ۤᩴ;

    if-eqz v1, :cond_1b

    .line 2513
    check-cast v4, Ll/᩸ۤᩴ;

    .line 2517
    iget-object v1, v4, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v5, v2

    move-object v6, v5

    move-object v9, v6

    move-object/from16 p2, v4

    const/4 v4, 0x0

    const/4 v15, 0x0

    :goto_a
    if-eqz v1, :cond_15

    move/from16 v18, v11

    .line 2518
    iget v11, v1, Ll/֡ۤᩴ;->a:I

    move/from16 v26, v14

    .line 2519
    new-instance v14, Ll/᩹ۤᩴ;

    iget-object v7, v1, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    iget-object v0, v1, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v14

    move/from16 v21, v11

    move-object/from16 v22, v7

    move-object/from16 v23, v0

    invoke-direct/range {v20 .. v25}, Ll/᩹ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ll/֡ۤᩴ;Ll/᩹ۤᩴ;)V

    and-int v0, v11, v8

    if-nez v0, :cond_13

    .line 2522
    iput-object v9, v14, Ll/᩹ۤᩴ;->h:Ll/᩹ۤᩴ;

    if-nez v9, :cond_12

    move-object v2, v14

    goto :goto_b

    .line 2525
    :cond_12
    iput-object v14, v9, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    :goto_b
    add-int/lit8 v15, v15, 0x1

    move-object v9, v14

    goto :goto_d

    .line 2530
    :cond_13
    iput-object v6, v14, Ll/᩹ۤᩴ;->h:Ll/᩹ۤᩴ;

    if-nez v6, :cond_14

    move-object v5, v14

    goto :goto_c

    .line 2533
    :cond_14
    iput-object v14, v6, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    :goto_c
    add-int/lit8 v4, v4, 0x1

    move-object v6, v14

    .line 2517
    :goto_d
    iget-object v1, v1, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    move/from16 v11, v18

    move/from16 v14, v26

    goto :goto_a

    :cond_15
    move/from16 v18, v11

    move/from16 v26, v14

    const/4 v0, 0x6

    if-gt v15, v0, :cond_16

    .line 2538
    invoke-static {v2}, Ll/ۧۤᩴ;->p(Ll/᩹ۤᩴ;)Ll/֡ۤᩴ;

    move-result-object v1

    goto :goto_e

    :cond_16
    if-eqz v4, :cond_17

    .line 2539
    new-instance v1, Ll/᩸ۤᩴ;

    invoke-direct {v1, v2}, Ll/᩸ۤᩴ;-><init>(Ll/᩹ۤᩴ;)V

    goto :goto_e

    :cond_17
    move-object/from16 v1, p2

    :goto_e
    if-gt v4, v0, :cond_18

    .line 2540
    invoke-static {v5}, Ll/ۧۤᩴ;->p(Ll/᩹ۤᩴ;)Ll/֡ۤᩴ;

    move-result-object v4

    goto :goto_f

    :cond_18
    if-eqz v15, :cond_19

    .line 2541
    new-instance v4, Ll/᩸ۤᩴ;

    invoke-direct {v4, v5}, Ll/᩸ۤᩴ;-><init>(Ll/᩹ۤᩴ;)V

    goto :goto_f

    :cond_19
    move-object/from16 v4, p2

    .line 2542
    :goto_f
    invoke-static {v10, v13, v1}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    .line 2543
    invoke-static {v10, v3, v4}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    move-object/from16 v0, p1

    .line 2544
    invoke-static {v0, v13, v12}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    :goto_10
    const/4 v15, 0x1

    goto :goto_11

    :cond_1a
    move/from16 v19, v9

    :cond_1b
    move/from16 v18, v11

    move/from16 v26, v14

    .line 2548
    :goto_11
    monitor-exit v16

    move-object/from16 v7, p0

    goto :goto_13

    :catchall_1
    move-exception v0

    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    :cond_1c
    :goto_12
    move/from16 v19, v9

    move/from16 v18, v11

    move/from16 v26, v14

    if-eqz v17, :cond_1d

    move-object/from16 v7, p0

    .line 2462
    iput-object v2, v7, Ll/ۧۤᩴ;->b:[Ll/֡ۤᩴ;

    .line 2463
    iput-object v10, v7, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    shl-int/lit8 v0, v8, 0x1

    ushr-int/lit8 v1, v8, 0x1

    sub-int/2addr v0, v1

    .line 2464
    iput v0, v7, Ll/ۧۤᩴ;->sizeCtl:I

    return-void

    :cond_1d
    move-object/from16 v7, p0

    .line 2467
    sget-object v1, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v3, Ll/ۧۤᩴ;->i:J

    iget v9, v7, Ll/ۧۤᩴ;->sizeCtl:I

    add-int/lit8 v6, v9, -0x1

    move-object/from16 v2, p0

    move v5, v9

    invoke-virtual/range {v1 .. v6}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v1

    if-eqz v1, :cond_1f

    add-int/lit8 v9, v9, -0x2

    .line 2279
    invoke-static {v8}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v1

    const v2, 0x8000

    or-int/2addr v1, v2

    shl-int/lit8 v1, v1, 0x10

    if-eq v9, v1, :cond_1e

    return-void

    :cond_1e
    const/4 v1, 0x1

    const/4 v2, 0x1

    move v13, v8

    const/4 v15, 0x1

    const/16 v17, 0x1

    :cond_1f
    :goto_13
    move/from16 v11, v18

    move/from16 v9, v19

    move/from16 v14, v26

    goto/16 :goto_3
.end method

.method public final merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 12

    const/4 v1, 0x0

    if-eqz p1, :cond_16

    if-eqz p2, :cond_16

    if-eqz p3, :cond_16

    .line 2023
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ll/ۧۤᩴ;->i(I)I

    move-result v2

    .line 2027
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v3, v0

    move-object v6, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_0
    :goto_0
    if-eqz v3, :cond_15

    .line 2029
    array-length v0, v3

    if-nez v0, :cond_1

    goto/16 :goto_9

    :cond_1
    add-int/lit8 v0, v0, -0x1

    and-int v7, v0, v2

    .line 2031
    invoke-static {v3, v7}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v8

    const/4 v0, 0x1

    if-nez v8, :cond_2

    .line 2032
    new-instance v8, Ll/֡ۤᩴ;

    invoke-direct {v8, v2, p1, p2}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v7, v8}, Ll/ۧۤᩴ;->b([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto/16 :goto_8

    .line 2038
    :cond_2
    iget v9, v8, Ll/֡ۤᩴ;->a:I

    const/4 v0, -0x1

    if-ne v9, v0, :cond_3

    .line 2039
    invoke-virtual {p0, v3, v8}, Ll/ۧۤᩴ;->d([Ll/֡ۤᩴ;Ll/֡ۤᩴ;)[Ll/֡ۤᩴ;

    move-result-object v3

    goto :goto_0

    :cond_3
    move-object v0, v8

    .line 2041
    monitor-enter v0

    .line 2042
    :try_start_0
    invoke-static {v3, v7}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v10

    if-ne v10, v8, :cond_12

    if-ltz v9, :cond_9

    const/4 v4, 0x1

    move-object v6, v1

    .line 2047
    :goto_1
    iget v9, v8, Ll/֡ۤᩴ;->a:I

    if-ne v9, v2, :cond_7

    iget-object v9, v8, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v9, p1, :cond_4

    if-eqz v9, :cond_7

    .line 2049
    invoke-virtual {p1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 2050
    :cond_4
    iget-object v9, v8, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-interface {p3, v9, p2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 2052
    iput-object v9, v8, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    :goto_2
    move-object v6, v9

    goto/16 :goto_7

    .line 2055
    :cond_5
    iget-object v5, v8, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-eqz v6, :cond_6

    .line 2057
    iput-object v5, v6, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    goto :goto_3

    .line 2059
    :cond_6
    invoke-static {v3, v7, v5}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    :goto_3
    const/4 v5, -0x1

    goto :goto_2

    .line 2064
    :cond_7
    iget-object v6, v8, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    if-nez v6, :cond_8

    .line 2067
    new-instance v5, Ll/֡ۤᩴ;

    invoke-direct {v5, v2, p1, p2}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v5, v8, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    const/4 v5, 0x1

    move-object v6, p2

    goto :goto_7

    :cond_8
    add-int/lit8 v4, v4, 0x1

    move-object v11, v8

    move-object v8, v6

    move-object v6, v11

    goto :goto_1

    .line 2072
    :cond_9
    instance-of v9, v8, Ll/᩸ۤᩴ;

    if-eqz v9, :cond_10

    .line 2074
    check-cast v8, Ll/᩸ۤᩴ;

    .line 2075
    iget-object v4, v8, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez v4, :cond_a

    move-object v4, v1

    goto :goto_4

    .line 2077
    :cond_a
    invoke-virtual {v4, v2, p1, v1}, Ll/᩹ۤᩴ;->b(ILjava/lang/Object;Ljava/lang/Class;)Ll/᩹ۤᩴ;

    move-result-object v4

    :goto_4
    if-nez v4, :cond_b

    move-object v6, p2

    goto :goto_5

    .line 2079
    :cond_b
    iget-object v6, v4, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    invoke-interface {p3, v6, p2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :goto_5
    if-eqz v6, :cond_d

    if-eqz v4, :cond_c

    .line 2082
    iput-object v6, v4, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    goto :goto_6

    .line 2085
    :cond_c
    invoke-virtual {v8, v2, p1, v6}, Ll/᩸ۤᩴ;->e(ILjava/lang/Object;Ljava/lang/Object;)Ll/᩹ۤᩴ;

    const/4 v5, 0x1

    goto :goto_6

    :cond_d
    if-eqz v4, :cond_f

    .line 2090
    invoke-virtual {v8, v4}, Ll/᩸ۤᩴ;->f(Ll/᩹ۤᩴ;)Z

    move-result v4

    if-eqz v4, :cond_e

    .line 2091
    iget-object v4, v8, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    invoke-static {v4}, Ll/ۧۤᩴ;->p(Ll/᩹ۤᩴ;)Ll/֡ۤᩴ;

    move-result-object v4

    invoke-static {v3, v7, v4}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    :cond_e
    const/4 v5, -0x1

    :cond_f
    :goto_6
    const/4 v4, 0x2

    goto :goto_7

    .line 2094
    :cond_10
    instance-of v8, v8, Ll/ۚۤᩴ;

    if-nez v8, :cond_11

    goto :goto_7

    .line 2095
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Recursive update"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2097
    :cond_12
    :goto_7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    const/16 p1, 0x8

    if-lt v4, p1, :cond_13

    .line 2100
    invoke-virtual {p0, v3, v7}, Ll/ۧۤᩴ;->n([Ll/֡ۤᩴ;I)V

    :cond_13
    move v0, v5

    move-object p2, v6

    :goto_8
    if-eqz v0, :cond_14

    int-to-long v0, v0

    .line 2106
    invoke-virtual {p0, v0, v1, v4}, Ll/ۧۤᩴ;->a(JI)V

    :cond_14
    return-object p2

    :catchall_0
    move-exception p1

    .line 2097
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 2030
    :cond_15
    :goto_9
    invoke-virtual {p0}, Ll/ۧۤᩴ;->e()[Ll/֡ۤᩴ;

    move-result-object v3

    goto/16 :goto_0

    .line 2022
    :cond_16
    throw v1
.end method

.method public final n([Ll/֡ۤᩴ;I)V
    .locals 11

    .line 2663
    array-length v0, p1

    const/16 v1, 0x40

    if-ge v0, v1, :cond_0

    shl-int/lit8 p1, v0, 0x1

    .line 2664
    invoke-virtual {p0, p1}, Ll/ۧۤᩴ;->o(I)V

    return-void

    .line 2665
    :cond_0
    invoke-static {p1, p2}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v1

    if-eqz v1, :cond_4

    iget v0, v1, Ll/֡ۤᩴ;->a:I

    if-ltz v0, :cond_4

    move-object v0, v1

    .line 2666
    monitor-enter v0

    .line 2667
    :try_start_0
    invoke-static {p1, p2}, Ll/ۧۤᩴ;->k([Ll/֡ۤᩴ;I)Ll/֡ۤᩴ;

    move-result-object v2

    if-ne v2, v1, :cond_3

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    if-eqz v1, :cond_2

    .line 2670
    new-instance v10, Ll/᩹ۤᩴ;

    iget v5, v1, Ll/֡ۤᩴ;->a:I

    iget-object v6, v1, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    iget-object v7, v1, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Ll/᩹ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ll/֡ۤᩴ;Ll/᩹ۤᩴ;)V

    .line 2673
    iput-object v3, v10, Ll/᩹ۤᩴ;->h:Ll/᩹ۤᩴ;

    if-nez v3, :cond_1

    move-object v2, v10

    goto :goto_1

    .line 2676
    :cond_1
    iput-object v10, v3, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    .line 2669
    :goto_1
    iget-object v1, v1, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    move-object v3, v10

    goto :goto_0

    .line 2679
    :cond_2
    new-instance v1, Ll/᩸ۤᩴ;

    invoke-direct {v1, v2}, Ll/᩸ۤᩴ;-><init>(Ll/᩹ۤᩴ;)V

    invoke-static {p1, p2, v1}, Ll/ۧۤᩴ;->h([Ll/֡ۤᩴ;ILl/֡ۤᩴ;)V

    .line 2681
    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_4
    return-void
.end method

.method public final o(I)V
    .locals 10

    const/high16 v0, 0x20000000

    const/high16 v1, 0x40000000    # 2.0f

    if-lt p1, v0, :cond_0

    const/high16 p1, 0x40000000    # 2.0f

    goto :goto_0

    :cond_0
    ushr-int/lit8 v0, p1, 0x1

    add-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x1

    .line 2386
    invoke-static {p1}, Ll/ۧۤᩴ;->l(I)I

    move-result p1

    .line 2388
    :cond_1
    :goto_0
    iget v0, p0, Ll/ۧۤᩴ;->sizeCtl:I

    if-ltz v0, :cond_7

    .line 2389
    iget-object v8, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-eqz v8, :cond_4

    .line 2390
    array-length v2, v8

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    if-le p1, v0, :cond_7

    if-lt v2, v1, :cond_3

    goto :goto_3

    .line 2407
    :cond_3
    iget-object v3, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-ne v8, v3, :cond_1

    .line 2279
    invoke-static {v2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v2

    const v3, 0x8000

    or-int/2addr v2, v3

    .line 2409
    sget-object v3, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v4, Ll/ۧۤᩴ;->i:J

    shl-int/lit8 v2, v2, 0x10

    add-int/lit8 v7, v2, 0x2

    move-object v2, v3

    move-object v3, p0

    move v6, v0

    invoke-virtual/range {v2 .. v7}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 2411
    invoke-virtual {p0, v8, v0}, Ll/ۧۤᩴ;->m([Ll/֡ۤᩴ;[Ll/֡ۤᩴ;)V

    goto :goto_0

    :cond_4
    :goto_1
    if-le v0, p1, :cond_5

    move v9, v0

    goto :goto_2

    :cond_5
    move v9, p1

    .line 2392
    :goto_2
    sget-object v2, Ll/ۧۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v4, Ll/ۧۤᩴ;->i:J

    const/4 v7, -0x1

    move-object v3, p0

    move v6, v0

    invoke-virtual/range {v2 .. v7}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2394
    :try_start_0
    iget-object v2, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-ne v2, v8, :cond_6

    .line 2396
    new-array v2, v9, [Ll/֡ۤᩴ;

    .line 2397
    iput-object v2, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    ushr-int/lit8 v0, v9, 0x2

    sub-int v0, v9, v0

    .line 2401
    :cond_6
    iput v0, p0, Ll/ۧۤᩴ;->sizeCtl:I

    goto :goto_0

    :catchall_0
    move-exception p1

    iput v0, p0, Ll/ۧۤᩴ;->sizeCtl:I

    .line 2402
    throw p1

    :cond_7
    :goto_3
    return-void
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 1006
    invoke-virtual {p0, p1, p2, v0}, Ll/ۧۤᩴ;->f(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 3

    .line 1087
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۧۤᩴ;->o(I)V

    .line 1088
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1089
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Ll/ۧۤᩴ;->f(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    .line 1543
    invoke-virtual {p0, p1, p2, v0}, Ll/ۧۤᩴ;->f(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 1102
    invoke-virtual {p0, p1, v0, v0}, Ll/ۧۤᩴ;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1553
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    .line 1554
    invoke-virtual {p0, p1, v0, p2}, Ll/ۧۤᩴ;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 1578
    invoke-virtual {p0, p1, p2, v0}, Ll/ۧۤᩴ;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1577
    :cond_0
    throw v0
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    .line 1565
    invoke-virtual {p0, p1, p3, p2}, Ll/ۧۤᩴ;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x0

    .line 1564
    throw p1
.end method

.method public final replaceAll(Ljava/util/function/BiFunction;)V
    .locals 5

    .line 1611
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1613
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    if-eqz v0, :cond_2

    .line 1614
    new-instance v1, Ll/ܶۤᩴ;

    array-length v2, v0

    const/4 v3, 0x0

    array-length v4, v0

    invoke-direct {v1, v0, v2, v3, v4}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 1615
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1616
    iget-object v2, v0, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    .line 1617
    iget-object v0, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    .line 1618
    :cond_1
    invoke-interface {p1, v0, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 1620
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1621
    invoke-virtual {p0, v0, v3, v2}, Ll/ۧۤᩴ;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 1622
    invoke-virtual {p0, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public size()I
    .locals 5

    .line 910
    invoke-virtual {p0}, Ll/ۧۤᩴ;->j()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    const v0, 0x7fffffff

    return v0

    :cond_1
    long-to-int v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1322
    iget-object v0, p0, Ll/ۧۤᩴ;->a:[Ll/֡ۤᩴ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    array-length v2, v0

    .line 1323
    :goto_0
    new-instance v3, Ll/ܶۤᩴ;

    invoke-direct {v3, v0, v2, v1, v2}, Ll/ܶۤᩴ;-><init>([Ll/֡ۤᩴ;III)V

    .line 1324
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1327
    invoke-virtual {v3}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 1329
    :goto_1
    iget-object v2, v1, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    .line 1330
    iget-object v1, v1, Ll/֡ۤᩴ;->c:Ljava/lang/Object;

    const-string v4, "(this Map)"

    if-ne v2, p0, :cond_1

    move-object v2, v4

    .line 1331
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3d

    .line 1332
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-ne v1, p0, :cond_2

    move-object v1, v4

    .line 1333
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1334
    invoke-virtual {v3}, Ll/ܶۤᩴ;->a()Ll/֡ۤᩴ;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    const-string v2, ", "

    .line 1336
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    :goto_2
    const/16 v1, 0x7d

    .line 1339
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1

    .line 1264
    iget-object v0, p0, Ll/ۧۤᩴ;->e:Ll/᩶ۤᩴ;

    if-eqz v0, :cond_0

    return-object v0

    .line 1265
    :cond_0
    new-instance v0, Ll/᩶ۤᩴ;

    .line 4714
    invoke-direct {v0, p0}, Ll/۟۫ᩴ;-><init>(Ll/ۧۤᩴ;)V

    .line 1265
    iput-object v0, p0, Ll/ۧۤᩴ;->e:Ll/᩶ۤᩴ;

    return-object v0
.end method
