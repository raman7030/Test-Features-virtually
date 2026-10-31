.class public final Ll/۬ۖۧ;
.super Ljava/lang/Object;
.source "K8QR"

# interfaces
.implements Ll/֨᩷ۧ;


# static fields
.field public static final ܳ֫:Ll/۠ᩴ֫;

.field public static final ᩻֫:[B


# instance fields
.field public ֡:Z

.field public ֨:Z

.field public ֫:Ll/ᩳ֨֫;

.field public ֫֫:J

.field public ۖ:J

.field public final ۗ:Ljava/util/ArrayDeque;

.field public final ۘ:Ll/ۘۗۡ;

.field public ۙ:I

.field public ۚ:Z

.field public ۛ:I

.field public final ۜ:Ljava/util/List;

.field public final ۟:[B

.field public ۠:Ll/ܳ۬ܺ;

.field public ۡ:J

.field public ۢ:Ll/ۗۖۧ;

.field public final ۤ:Ll/᩻۠֫;

.field public final ۧ:Ll/ᩳ֨֫;

.field public ۧ֫:J

.field public ۨ:I

.field public ۫:Z

.field public ۬:J

.field public final ܰ:Ll/ᩳ֨֫;

.field public ܳ:[Ll/᩵ۢۧ;

.field public final ܶ:Ll/ᩳ֨֫;

.field public ܺ:[Ll/᩵ۢۧ;

.field public ܽ:I

.field public final ܽ֫:Ll/ۜᩴۧ;

.field public ܿ:I

.field public final ܿ֫:Landroid/util/SparseArray;

.field public ᩳ:J

.field public final ᩳ֫:Ll/ۢ֨֫;

.field public ᩴ:Ll/᩸᩷ۧ;

.field public final ᩵:I

.field public ᩶:I

.field public final ᩷:Ljava/util/ArrayDeque;

.field public final ᩸:Ll/ᩳ֨֫;

.field public final ᩹:Ll/ᩳ֨֫;

.field public ᩺:I

.field public final ᩻:Ll/ۢ᩷ۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 184
    fill-array-data v0, :array_0

    sput-object v0, Ll/۬ۖۧ;->᩻֫:[B

    .line 188
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v1, "application/x-emsg"

    .line 189
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    sput-object v0, Ll/۬ۖۧ;->ܳ֫:Ll/۠ᩴ֫;

    return-void

    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>(Ll/ۜᩴۧ;ILl/ۢ֨֫;Ljava/util/List;)V
    .locals 0

    .line 417
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 418
    iput-object p1, p0, Ll/۬ۖۧ;->ܽ֫:Ll/ۜᩴۧ;

    .line 419
    iput p2, p0, Ll/۬ۖۧ;->᩵:I

    .line 420
    iput-object p3, p0, Ll/۬ۖۧ;->ᩳ֫:Ll/ۢ֨֫;

    .line 422
    invoke-static {p4}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/۬ۖۧ;->ۜ:Ljava/util/List;

    .line 424
    new-instance p1, Ll/ۘۗۡ;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ll/ۘۗۡ;-><init>(I)V

    iput-object p1, p0, Ll/۬ۖۧ;->ۘ:Ll/ۘۗۡ;

    .line 425
    new-instance p1, Ll/ᩳ֨֫;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/۬ۖۧ;->ۧ:Ll/ᩳ֨֫;

    .line 426
    new-instance p1, Ll/ᩳ֨֫;

    sget-object p3, Ll/ܽ۠֫;->ۧ:[B

    invoke-direct {p1, p3}, Ll/ᩳ֨֫;-><init>([B)V

    iput-object p1, p0, Ll/۬ۖۧ;->᩸:Ll/ᩳ֨֫;

    .line 427
    new-instance p1, Ll/ᩳ֨֫;

    const/4 p3, 0x6

    invoke-direct {p1, p3}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/۬ۖۧ;->ܶ:Ll/ᩳ֨֫;

    .line 428
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/۬ۖۧ;->᩹:Ll/ᩳ֨֫;

    new-array p1, p2, [B

    .line 429
    iput-object p1, p0, Ll/۬ۖۧ;->۟:[B

    .line 430
    new-instance p2, Ll/ᩳ֨֫;

    invoke-direct {p2, p1}, Ll/ᩳ֨֫;-><init>([B)V

    iput-object p2, p0, Ll/۬ۖۧ;->ܰ:Ll/ᩳ֨֫;

    .line 431
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/۬ۖۧ;->᩷:Ljava/util/ArrayDeque;

    .line 432
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/۬ۖۧ;->ۗ:Ljava/util/ArrayDeque;

    .line 433
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/۬ۖۧ;->ܿ֫:Landroid/util/SparseArray;

    .line 434
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/۬ۖۧ;->۠:Ll/ܳ۬ܺ;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 435
    iput-wide p1, p0, Ll/۬ۖۧ;->ۡ:J

    .line 436
    iput-wide p1, p0, Ll/۬ۖۧ;->۬:J

    .line 437
    iput-wide p1, p0, Ll/۬ۖۧ;->ۧ֫:J

    .line 438
    sget-object p1, Ll/᩸᩷ۧ;->ܿ:Ll/᩸᩷ۧ;

    iput-object p1, p0, Ll/۬ۖۧ;->ᩴ:Ll/᩸᩷ۧ;

    const/4 p1, 0x0

    new-array p2, p1, [Ll/᩵ۢۧ;

    .line 439
    iput-object p2, p0, Ll/۬ۖۧ;->ܺ:[Ll/᩵ۢۧ;

    new-array p1, p1, [Ll/᩵ۢۧ;

    .line 440
    iput-object p1, p0, Ll/۬ۖۧ;->ܳ:[Ll/᩵ۢۧ;

    .line 441
    new-instance p1, Ll/᩻۠֫;

    new-instance p2, Ll/ۡ᩻ۜ;

    invoke-direct {p2, p0}, Ll/ۡ᩻ۜ;-><init>(Ljava/lang/Object;)V

    invoke-direct {p1, p2}, Ll/᩻۠֫;-><init>(Ll/ܳ۠֫;)V

    iput-object p1, p0, Ll/۬ۖۧ;->ۤ:Ll/᩻۠֫;

    .line 445
    new-instance p1, Ll/ۢ᩷ۧ;

    invoke-direct {p1}, Ll/ۢ᩷ۧ;-><init>()V

    iput-object p1, p0, Ll/۬ۖۧ;->᩻:Ll/ۢ᩷ۧ;

    const-wide/16 p1, -0x1

    .line 446
    iput-wide p1, p0, Ll/۬ۖۧ;->֫֫:J

    return-void
.end method

.method public static ֫(JLl/ᩳ֨֫;)Landroid/util/Pair;
    .locals 23

    move-object/from16 v0, p2

    const/16 v1, 0x8

    .line 1523
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1524
    invoke-virtual/range {p2 .. p2}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    .line 1525
    invoke-static {v1}, Ll/᩹ۖۧ;->֫(I)I

    move-result v1

    const/4 v2, 0x4

    .line 1527
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1528
    invoke-virtual/range {p2 .. p2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v10

    if-nez v1, :cond_0

    .line 1532
    invoke-virtual/range {p2 .. p2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v1

    .line 1533
    invoke-virtual/range {p2 .. p2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v3

    goto :goto_0

    .line 1535
    :cond_0
    invoke-virtual/range {p2 .. p2}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v1

    .line 1536
    invoke-virtual/range {p2 .. p2}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v3

    :goto_0
    add-long v12, v3, p0

    .line 1539
    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v5, 0xf4240

    move-wide v3, v1

    move-wide v7, v10

    invoke-static/range {v3 .. v9}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v14

    const/4 v3, 0x2

    .line 1541
    invoke-virtual {v0, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1543
    invoke-virtual/range {p2 .. p2}, Ll/ᩳ֨֫;->ۗ()I

    move-result v9

    .line 1544
    new-array v7, v9, [I

    .line 1545
    new-array v8, v9, [J

    .line 1546
    new-array v5, v9, [J

    .line 1547
    new-array v6, v9, [J

    const/4 v3, 0x0

    move-wide/from16 v16, v12

    move-wide v3, v14

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v9, :cond_2

    .line 1552
    invoke-virtual/range {p2 .. p2}, Ll/ᩳ֨֫;->᩻()I

    move-result v13

    const/high16 v18, -0x80000000

    and-int v18, v13, v18

    if-nez v18, :cond_1

    .line 1559
    invoke-virtual/range {p2 .. p2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v18

    const v20, 0x7fffffff

    and-int v13, v13, v20

    .line 1561
    aput v13, v7, v12

    .line 1562
    aput-wide v16, v8, v12

    .line 1566
    aput-wide v3, v6, v12

    add-long v1, v1, v18

    const-wide/32 v18, 0xf4240

    .line 1955
    sget-object v13, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide v3, v1

    move-wide/from16 p0, v1

    move-object v1, v5

    move-object v2, v6

    move-wide/from16 v5, v18

    move-object/from16 v21, v7

    move-object/from16 v22, v8

    move-wide v7, v10

    move/from16 v18, v9

    move-object v9, v13

    invoke-static/range {v3 .. v9}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v3

    .line 1569
    aget-wide v5, v2, v12

    sub-long v5, v3, v5

    aput-wide v5, v1, v12

    const/4 v5, 0x4

    .line 1571
    invoke-virtual {v0, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    move-object/from16 v5, v21

    .line 1572
    aget v6, v5, v12

    int-to-long v6, v6

    add-long v16, v16, v6

    add-int/lit8 v12, v12, 0x1

    move-object v6, v2

    move-object v7, v5

    move/from16 v9, v18

    move-object/from16 v8, v22

    move-object v5, v1

    move-wide/from16 v1, p0

    goto :goto_1

    :cond_1
    const-string v0, "Unhandled indirect reference"

    const/4 v1, 0x0

    .line 1556
    invoke-static {v0, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_2
    move-object v1, v5

    move-object v2, v6

    move-object v5, v7

    move-object/from16 v22, v8

    .line 1576
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v3, Ll/᩷᩷ۧ;

    move-object/from16 v4, v22

    invoke-direct {v3, v5, v4, v1, v2}, Ll/᩷᩷ۧ;-><init>([I[J[J[J)V

    .line 1575
    invoke-static {v0, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/util/List;)Ll/᩵ᩴ֫;
    .locals 8

    .line 1895
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v1

    :goto_0
    if-ge v2, v0, :cond_4

    .line 1897
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠֨֫;

    .line 1898
    iget v5, v4, Ll/ܶ֨֫;->֫:I

    const v6, 0x70737368    # 3.013775E29f

    if-ne v5, v6, :cond_3

    if-nez v3, :cond_0

    .line 1900
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1902
    :cond_0
    iget-object v4, v4, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    .line 103
    invoke-static {v4}, Ll/ۧۘۧ;->֫([B)Ll/֫ۘۧ;

    move-result-object v5

    if-nez v5, :cond_1

    move-object v5, v1

    goto :goto_1

    .line 107
    :cond_1
    iget-object v5, v5, Ll/֫ۘۧ;->ܽ:Ljava/util/UUID;

    :goto_1
    if-nez v5, :cond_2

    const-string v4, "Skipped pssh atom (failed to extract uuid)"

    .line 1905
    invoke-static {v4}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_2

    .line 1907
    :cond_2
    new-instance v6, Ll/ᩴᩴ֫;

    const-string v7, "video/mp4"

    .line 286
    invoke-direct {v6, v5, v1, v7, v4}, Ll/ᩴᩴ֫;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 1907
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    if-nez v3, :cond_5

    return-object v1

    .line 1911
    :cond_5
    new-instance p0, Ll/᩵ᩴ֫;

    invoke-direct {p0, v3}, Ll/᩵ᩴ֫;-><init>(Ljava/util/ArrayList;)V

    return-object p0
.end method

.method private ֫(J)V
    .locals 48

    move-object/from16 v0, p0

    .line 704
    :cond_0
    :goto_0
    iget-object v1, v0, Ll/۬ۖۧ;->᩷:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5d

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨֨֫;

    iget-wide v2, v2, Ll/֨֨֫;->ܽ:J

    cmp-long v4, v2, p1

    if-nez v4, :cond_5d

    .line 705
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ll/֨֨֫;

    .line 731
    iget v2, v3, Ll/ܶ֨֫;->֫:I

    iget-object v4, v3, Ll/֨֨֫;->ۧ:Ljava/util/ArrayList;

    iget-object v5, v3, Ll/֨֨֫;->ᩳ:Ljava/util/ArrayList;

    const v6, 0x6d6f6f76

    iget v7, v0, Ll/۬ۖۧ;->᩵:I

    const/16 v8, 0xc

    iget-object v11, v0, Ll/۬ۖۧ;->ܿ֫:Landroid/util/SparseArray;

    if-ne v2, v6, :cond_f

    .line 743
    invoke-static {v5}, Ll/۬ۖۧ;->֫(Ljava/util/List;)Ll/᩵ᩴ֫;

    move-result-object v1

    const v2, 0x6d766578

    .line 746
    invoke-virtual {v3, v2}, Ll/֨֨֫;->ۧ(I)Ll/֨֨֫;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    new-instance v12, Landroid/util/SparseArray;

    invoke-direct {v12}, Landroid/util/SparseArray;-><init>()V

    .line 749
    iget-object v2, v2, Ll/֨֨֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    :goto_1
    if-ge v5, v4, :cond_4

    .line 751
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۠֨֫;

    .line 752
    iget v13, v6, Ll/ܶ֨֫;->֫:I

    iget-object v6, v6, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const v14, 0x74726578

    if-ne v13, v14, :cond_1

    .line 981
    invoke-virtual {v6, v8}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 982
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v8

    .line 983
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v13

    add-int/lit8 v13, v13, -0x1

    .line 984
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v14

    .line 985
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v15

    .line 986
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    .line 989
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v16, v2

    new-instance v2, Ll/᩶ۖۧ;

    invoke-direct {v2, v13, v14, v15, v6}, Ll/᩶ۖۧ;-><init>(IIII)V

    .line 988
    invoke-static {v8, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    .line 754
    iget-object v6, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ll/᩶ۖۧ;

    invoke-virtual {v12, v6, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    move-object/from16 v16, v2

    const v2, 0x6d656864

    if-ne v13, v2, :cond_3

    const/16 v2, 0x8

    .line 999
    invoke-virtual {v6, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1000
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    .line 1001
    invoke-static {v2}, Ll/᩹ۖۧ;->֫(I)I

    move-result v2

    if-nez v2, :cond_2

    .line 1002
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v9

    goto :goto_2

    :cond_2
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v9

    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    const/16 v8, 0xc

    move-object/from16 v2, v16

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    const v4, 0x6d657461

    .line 761
    invoke-virtual {v3, v4}, Ll/֨֨֫;->ۧ(I)Ll/֨֨֫;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 763
    invoke-static {v4}, Ll/᩹ۖۧ;->֫(Ll/֨֨֫;)Ll/᩻᩵֫;

    move-result-object v4

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    :goto_3
    move-object v13, v4

    .line 765
    new-instance v14, Ll/۟᩷ۧ;

    invoke-direct {v14}, Ll/۟᩷ۧ;-><init>()V

    const v4, 0x75647461

    .line 767
    invoke-virtual {v3, v4}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 769
    invoke-static {v4}, Ll/᩹ۖۧ;->֫(Ll/۠֨֫;)Ll/᩻᩵֫;

    move-result-object v4

    .line 770
    invoke-virtual {v14, v4}, Ll/۟᩷ۧ;->֫(Ll/᩻᩵֫;)V

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    :goto_4
    move-object v15, v4

    .line 772
    new-instance v8, Ll/᩻᩵֫;

    const v4, 0x6d766864

    .line 774
    invoke-virtual {v3, v4}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v4

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    iget-object v4, v4, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    invoke-static {v4}, Ll/᩹ۖۧ;->ܽ(Ll/ᩳ֨֫;)Ll/᩹֨֫;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ll/ܳ᩵֫;

    aput-object v4, v5, v2

    invoke-direct {v8, v5}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    and-int/lit8 v4, v7, 0x10

    if-eqz v4, :cond_7

    const/4 v4, 0x1

    const/16 v16, 0x1

    goto :goto_5

    :cond_7
    const/4 v4, 0x0

    const/16 v16, 0x0

    .line 777
    :goto_5
    new-instance v7, Ll/᩶ۗᩳ;

    invoke-direct {v7, v0}, Ll/᩶ۗᩳ;-><init>(Ljava/lang/Object;)V

    const/16 v17, 0x0

    move-object v4, v14

    move-wide v5, v9

    move-object v10, v7

    move-object v7, v1

    move-object v1, v8

    move/from16 v8, v16

    move/from16 v9, v17

    .line 778
    invoke-static/range {v3 .. v10}, Ll/᩹ۖۧ;->֫(Ll/֨֨֫;Ll/۟᩷ۧ;JLl/᩵ᩴ֫;ZZLl/ܽܶܺ;)Ljava/util/ArrayList;

    move-result-object v3

    .line 787
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 788
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-nez v5, :cond_c

    .line 790
    invoke-static {v3}, Ll/ۛۖۧ;->֫(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v4, :cond_b

    .line 792
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷ۘۧ;

    .line 793
    iget-object v8, v7, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    .line 794
    iget-object v9, v0, Ll/۬ۖۧ;->ᩴ:Ll/᩸᩷ۧ;

    iget v10, v8, Ll/ܳۘۧ;->ۖ:I

    move-object/from16 v16, v3

    iget v3, v8, Ll/ܳۘۧ;->ܳ:I

    move/from16 v17, v4

    iget-object v4, v8, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    move-object/from16 v18, v7

    iget-wide v7, v8, Ll/ܳۘۧ;->֫:J

    invoke-interface {v9, v6, v10}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v9

    .line 795
    invoke-interface {v9, v7, v8}, Ll/᩵ۢۧ;->֫(J)V

    move/from16 v19, v6

    .line 796
    invoke-virtual {v4}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v6

    .line 797
    invoke-virtual {v6, v5}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    move-object/from16 v20, v5

    const/4 v5, 0x1

    if-ne v10, v5, :cond_8

    .line 109
    iget v5, v14, Ll/۟᩷ۧ;->֫:I

    move-wide/from16 v21, v7

    const/4 v7, -0x1

    if-eq v5, v7, :cond_9

    iget v8, v14, Ll/۟᩷ۧ;->ۧ:I

    if-eq v8, v7, :cond_9

    .line 137
    invoke-virtual {v6, v5}, Ll/֨ᩴ֫;->᩷(I)V

    iget v5, v14, Ll/۟᩷ۧ;->ۧ:I

    .line 138
    invoke-virtual {v6, v5}, Ll/֨ᩴ֫;->ۢ(I)V

    goto :goto_7

    :cond_8
    move-wide/from16 v21, v7

    .line 799
    :cond_9
    :goto_7
    iget-object v4, v4, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    const/4 v5, 0x2

    new-array v5, v5, [Ll/᩻᩵֫;

    aput-object v15, v5, v2

    const/4 v2, 0x1

    aput-object v1, v5, v2

    invoke-static {v10, v13, v6, v4, v5}, Ll/ۤۖۧ;->֫(ILl/᩻᩵֫;Ll/֨ᩴ֫;Ll/᩻᩵֫;[Ll/᩻᩵֫;)V

    .line 806
    new-instance v4, Ll/ۗۖۧ;

    .line 835
    invoke-virtual {v12}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-ne v5, v2, :cond_a

    const/4 v2, 0x0

    .line 838
    invoke-virtual {v12, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ۖۧ;

    goto :goto_8

    .line 840
    :cond_a
    invoke-virtual {v12, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ۖۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    :goto_8
    invoke-virtual {v6}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v5

    move-object/from16 v7, v18

    invoke-direct {v4, v9, v7, v2, v5}, Ll/ۗۖۧ;-><init>(Ll/᩵ۢۧ;Ll/᩷ۘۧ;Ll/᩶ۖۧ;Ll/۠ᩴ֫;)V

    .line 812
    invoke-virtual {v11, v3, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 813
    iget-wide v2, v0, Ll/۬ۖۧ;->ۡ:J

    move-wide/from16 v4, v21

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, v0, Ll/۬ۖۧ;->ۡ:J

    add-int/lit8 v6, v19, 0x1

    const/4 v2, 0x0

    move-object/from16 v3, v16

    move/from16 v4, v17

    move-object/from16 v5, v20

    goto/16 :goto_6

    .line 815
    :cond_b
    iget-object v1, v0, Ll/۬ۖۧ;->ᩴ:Ll/᩸᩷ۧ;

    invoke-interface {v1}, Ll/᩸᩷ۧ;->ܳ()V

    goto/16 :goto_0

    :cond_c
    move-object/from16 v16, v3

    move/from16 v17, v4

    .line 817
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    move-result v1

    move/from16 v2, v17

    if-ne v1, v2, :cond_d

    const/4 v1, 0x1

    goto :goto_9

    :cond_d
    const/4 v1, 0x0

    :goto_9
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v2, :cond_0

    move-object/from16 v3, v16

    .line 819
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۘۧ;

    .line 820
    iget-object v5, v4, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    .line 821
    iget v6, v5, Ll/ܳۘۧ;->ܳ:I

    .line 822
    invoke-virtual {v11, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗۖۧ;

    iget v5, v5, Ll/ܳۘۧ;->ܳ:I

    .line 835
    invoke-virtual {v12}, Landroid/util/SparseArray;->size()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_e

    const/4 v5, 0x0

    .line 838
    invoke-virtual {v12, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩶ۖۧ;

    goto :goto_b

    .line 840
    :cond_e
    invoke-virtual {v12, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩶ۖۧ;

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    :goto_b
    invoke-virtual {v6, v4, v5}, Ll/ۗۖۧ;->֫(Ll/᩷ۘۧ;Ll/᩶ۖۧ;)V

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v16, v3

    goto :goto_a

    :cond_f
    const v6, 0x6d6f6f66

    if-ne v2, v6, :cond_5b

    .line 1012
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_c
    if-ge v2, v1, :cond_56

    .line 1014
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨֨֫;

    .line 1016
    iget v6, v3, Ll/ܶ֨֫;->֫:I

    const v8, 0x74726166

    if-ne v6, v8, :cond_55

    const v6, 0x74666864

    .line 1030
    invoke-virtual {v3, v6}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v6

    iget-object v8, v3, Ll/֨֨֫;->ᩳ:Ljava/util/ArrayList;

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    iget-object v6, v6, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v12, 0x8

    .line 1199
    invoke-virtual {v6, v12}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1200
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v12

    .line 1201
    sget v13, Ll/᩹ۖۧ;->֫:I

    .line 1202
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v13

    .line 1205
    invoke-virtual {v11, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۗۖۧ;

    if-nez v13, :cond_10

    const/4 v13, 0x0

    move/from16 v16, v1

    goto :goto_11

    .line 1206
    :cond_10
    iget-object v14, v13, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    and-int/lit8 v15, v12, 0x1

    if-eqz v15, :cond_11

    .line 1210
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v9

    .line 1211
    iput-wide v9, v14, Ll/ۜۘۧ;->ۧ:J

    .line 1212
    iput-wide v9, v14, Ll/ۜۘۧ;->֫:J

    .line 1215
    :cond_11
    iget-object v9, v13, Ll/ۗۖۧ;->᩻:Ll/᩶ۖۧ;

    and-int/lit8 v10, v12, 0x2

    if-eqz v10, :cond_12

    .line 1218
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    goto :goto_d

    .line 1219
    :cond_12
    iget v10, v9, Ll/᩶ۖۧ;->ܽ:I

    :goto_d
    and-int/lit8 v17, v12, 0x8

    if-eqz v17, :cond_13

    .line 1222
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v17

    move/from16 v15, v17

    goto :goto_e

    .line 1223
    :cond_13
    iget v15, v9, Ll/᩶ۖۧ;->֫:I

    :goto_e
    and-int/lit8 v16, v12, 0x10

    if-eqz v16, :cond_14

    .line 1226
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v16

    move/from16 v47, v16

    move/from16 v16, v1

    move/from16 v1, v47

    goto :goto_f

    :cond_14
    move/from16 v16, v1

    .line 1227
    iget v1, v9, Ll/᩶ۖۧ;->ᩳ:I

    :goto_f
    and-int/lit8 v12, v12, 0x20

    if-eqz v12, :cond_15

    .line 1230
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    goto :goto_10

    .line 1231
    :cond_15
    iget v6, v9, Ll/᩶ۖۧ;->ۧ:I

    .line 1232
    :goto_10
    new-instance v9, Ll/᩶ۖۧ;

    invoke-direct {v9, v10, v15, v1, v6}, Ll/᩶ۖۧ;-><init>(IIII)V

    iput-object v9, v14, Ll/ۜۘۧ;->ᩳ:Ll/᩶ۖۧ;

    :goto_11
    if-nez v13, :cond_16

    goto/16 :goto_38

    .line 1032
    :cond_16
    iget-object v1, v13, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    .line 1037
    iget-wide v9, v1, Ll/ۜۘۧ;->ܿ:J

    .line 1038
    iget-boolean v6, v1, Ll/ۜۘۧ;->ܳ:Z

    .line 1039
    invoke-virtual {v13}, Ll/ۗۖۧ;->᩻()V

    .line 1040
    invoke-static {v13}, Ll/ۗۖۧ;->ۧ(Ll/ۗۖۧ;)V

    const v12, 0x74666474

    .line 1041
    invoke-virtual {v3, v12}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v12

    if-eqz v12, :cond_18

    and-int/lit8 v14, v7, 0x2

    if-nez v14, :cond_18

    .line 1043
    iget-object v6, v12, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v9, 0x8

    .line 1248
    invoke-virtual {v6, v9}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1249
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v9

    .line 1250
    invoke-static {v9}, Ll/᩹ۖۧ;->֫(I)I

    move-result v9

    const/4 v10, 0x1

    if-ne v9, v10, :cond_17

    .line 1251
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v14

    goto :goto_12

    :cond_17
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v14

    .line 1043
    :goto_12
    iput-wide v14, v1, Ll/ۜۘۧ;->ܿ:J

    .line 1044
    iput-boolean v10, v1, Ll/ۜۘۧ;->ܳ:Z

    goto :goto_13

    .line 1046
    :cond_18
    iput-wide v9, v1, Ll/ۜۘۧ;->ܿ:J

    .line 1047
    iput-boolean v6, v1, Ll/ۜۘۧ;->ܳ:Z

    .line 1088
    :goto_13
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    :goto_14
    const v14, 0x7472756e

    if-ge v9, v6, :cond_1a

    .line 1090
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/۠֨֫;

    move-object/from16 v19, v4

    .line 1091
    iget v4, v15, Ll/ܶ֨֫;->֫:I

    if-ne v4, v14, :cond_19

    .line 1092
    iget-object v4, v15, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v14, 0xc

    .line 1093
    invoke-virtual {v4, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1094
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩹()I

    move-result v4

    if-lez v4, :cond_19

    add-int/2addr v12, v4

    add-int/lit8 v10, v10, 0x1

    :cond_19
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v4, v19

    goto :goto_14

    :cond_1a
    move-object/from16 v19, v4

    const/4 v4, 0x0

    .line 1101
    iput v4, v13, Ll/ۗۖۧ;->ᩳ:I

    .line 1102
    iput v4, v13, Ll/ۗۖۧ;->ۧ:I

    .line 1103
    iput v4, v13, Ll/ۗۖۧ;->ܽ:I

    .line 129
    iput v10, v1, Ll/ۜۘۧ;->ᩴ:I

    .line 130
    iput v12, v1, Ll/ۜۘۧ;->᩻:I

    .line 131
    iget-object v4, v1, Ll/ۜۘۧ;->֡:[I

    array-length v4, v4

    if-ge v4, v10, :cond_1b

    .line 132
    new-array v4, v10, [J

    iput-object v4, v1, Ll/ۜۘۧ;->᩵:[J

    .line 133
    new-array v4, v10, [I

    iput-object v4, v1, Ll/ۜۘۧ;->֡:[I

    .line 135
    :cond_1b
    iget-object v4, v1, Ll/ۜۘۧ;->ۖ:[I

    array-length v4, v4

    if-ge v4, v12, :cond_1c

    mul-int/lit8 v12, v12, 0x7d

    .line 138
    div-int/lit8 v12, v12, 0x64

    .line 139
    new-array v4, v12, [I

    iput-object v4, v1, Ll/ۜۘۧ;->ۖ:[I

    .line 140
    new-array v4, v12, [J

    iput-object v4, v1, Ll/ۜۘۧ;->ܺ:[J

    .line 141
    new-array v4, v12, [Z

    iput-object v4, v1, Ll/ۜۘۧ;->ۡ:[Z

    .line 142
    new-array v4, v12, [Z

    iput-object v4, v1, Ll/ۜۘۧ;->ۢ:[Z

    :cond_1c
    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_15
    const-wide/16 v20, 0x0

    if-ge v4, v6, :cond_36

    .line 1109
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۠֨֫;

    .line 1110
    iget v15, v12, Ll/ܶ֨֫;->֫:I

    if-ne v15, v14, :cond_35

    add-int/lit8 v14, v9, 0x1

    .line 1111
    iget-object v12, v12, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v15, 0x8

    .line 1291
    invoke-virtual {v12, v15}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1292
    invoke-virtual {v12}, Ll/ᩳ֨֫;->᩻()I

    move-result v15

    .line 1293
    sget v22, Ll/᩹ۖۧ;->֫:I

    move/from16 v23, v6

    .line 1295
    iget-object v6, v13, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v6, v6, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    move/from16 v22, v14

    .line 1297
    iget-object v14, v1, Ll/ۜۘۧ;->ᩳ:Ll/᩶ۖۧ;

    sget-object v24, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    move-object/from16 v25, v11

    .line 1299
    iget-object v11, v1, Ll/ۜۘۧ;->֡:[I

    invoke-virtual {v12}, Ll/ᩳ֨֫;->᩹()I

    move-result v24

    aput v24, v11, v9

    .line 1300
    iget-object v11, v1, Ll/ۜۘۧ;->᩵:[J

    move/from16 v24, v2

    move-object/from16 v26, v3

    iget-wide v2, v1, Ll/ۜۘۧ;->ۧ:J

    aput-wide v2, v11, v9

    and-int/lit8 v27, v15, 0x1

    if-eqz v27, :cond_1d

    move-object/from16 v27, v5

    .line 1302
    invoke-virtual {v12}, Ll/ᩳ֨֫;->᩻()I

    move-result v5

    move/from16 v28, v4

    int-to-long v4, v5

    add-long/2addr v2, v4

    aput-wide v2, v11, v9

    goto :goto_16

    :cond_1d
    move/from16 v28, v4

    move-object/from16 v27, v5

    :goto_16
    and-int/lit8 v2, v15, 0x4

    if-eqz v2, :cond_1e

    const/4 v2, 0x1

    goto :goto_17

    :cond_1e
    const/4 v2, 0x0

    .line 1306
    :goto_17
    iget v3, v14, Ll/᩶ۖۧ;->ۧ:I

    if-eqz v2, :cond_1f

    .line 1308
    invoke-virtual {v12}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    :cond_1f
    and-int/lit16 v4, v15, 0x100

    if-eqz v4, :cond_20

    const/4 v4, 0x1

    goto :goto_18

    :cond_20
    const/4 v4, 0x0

    :goto_18
    and-int/lit16 v5, v15, 0x200

    if-eqz v5, :cond_21

    const/4 v5, 0x1

    goto :goto_19

    :cond_21
    const/4 v5, 0x0

    :goto_19
    and-int/lit16 v11, v15, 0x400

    if-eqz v11, :cond_22

    const/4 v11, 0x1

    goto :goto_1a

    :cond_22
    const/4 v11, 0x0

    :goto_1a
    and-int/lit16 v15, v15, 0x800

    if-eqz v15, :cond_23

    const/4 v15, 0x1

    goto :goto_1b

    :cond_23
    const/4 v15, 0x0

    :goto_1b
    move/from16 v29, v3

    .line 1258
    iget-object v3, v6, Ll/ܳۘۧ;->ۧ:[J

    iget-object v0, v6, Ll/ܳۘۧ;->ܽ:[J

    move-object/from16 v30, v8

    if-eqz v3, :cond_27

    array-length v8, v3

    move-object/from16 v31, v13

    const/4 v13, 0x1

    if-ne v8, v13, :cond_26

    if-nez v0, :cond_24

    goto :goto_1d

    :cond_24
    const/4 v8, 0x0

    .line 1263
    aget-wide v32, v3, v8

    cmp-long v3, v32, v20

    if-nez v3, :cond_25

    move v3, v9

    move-object/from16 v32, v14

    goto :goto_1c

    :cond_25
    move v3, v9

    .line 1266
    iget-wide v8, v6, Ll/ܳۘۧ;->ۜ:J

    .line 1955
    sget-object v40, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v34, 0xf4240

    move-wide/from16 v36, v8

    move-object/from16 v38, v40

    invoke-static/range {v32 .. v38}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v8

    const/4 v13, 0x0

    .line 1269
    aget-wide v34, v0, v13

    const-wide/32 v36, 0xf4240

    move-object/from16 v32, v14

    iget-wide v13, v6, Ll/ܳۘۧ;->ܺ:J

    move-wide/from16 v38, v13

    .line 1955
    invoke-static/range {v34 .. v40}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v13

    add-long/2addr v8, v13

    .line 1271
    iget-wide v13, v6, Ll/ܳۘۧ;->֫:J

    cmp-long v34, v8, v13

    if-ltz v34, :cond_28

    const/4 v8, 0x0

    .line 1323
    :goto_1c
    aget-wide v20, v0, v8

    goto :goto_1f

    :cond_26
    :goto_1d
    move v3, v9

    goto :goto_1e

    :cond_27
    move v3, v9

    move-object/from16 v31, v13

    :goto_1e
    move-object/from16 v32, v14

    .line 1326
    :cond_28
    :goto_1f
    iget-object v0, v1, Ll/ۜۘۧ;->ۖ:[I

    .line 1327
    iget-object v8, v1, Ll/ۜۘۧ;->ܺ:[J

    .line 1328
    iget-object v9, v1, Ll/ۜۘۧ;->ۡ:[Z

    .line 1330
    iget v13, v6, Ll/ܳۘۧ;->ۖ:I

    const/4 v14, 0x2

    if-ne v13, v14, :cond_29

    and-int/lit8 v13, v7, 0x1

    if-eqz v13, :cond_29

    const/4 v13, 0x1

    goto :goto_20

    :cond_29
    const/4 v13, 0x0

    .line 1334
    :goto_20
    iget-object v14, v1, Ll/ۜۘۧ;->֡:[I

    aget v3, v14, v3

    add-int/2addr v3, v10

    move v14, v7

    .line 1335
    iget-wide v6, v6, Ll/ܳۘۧ;->ܺ:J

    move-object/from16 v40, v9

    move/from16 v33, v10

    .line 1336
    iget-wide v9, v1, Ll/ۜۘۧ;->ܿ:J

    move/from16 v41, v14

    move/from16 v14, v33

    :goto_21
    if-ge v14, v3, :cond_34

    if-eqz v4, :cond_2a

    .line 1340
    invoke-virtual {v12}, Ll/ᩳ֨֫;->᩻()I

    move-result v33

    move/from16 v42, v3

    move-object/from16 v3, v32

    move/from16 v32, v4

    move/from16 v4, v33

    goto :goto_22

    :cond_2a
    move/from16 v42, v3

    move-object/from16 v3, v32

    move/from16 v32, v4

    iget v4, v3, Ll/᩶ۖۧ;->֫:I

    :goto_22
    move/from16 v43, v13

    const-string v13, "Unexpected negative value: "

    if-ltz v4, :cond_33

    if-eqz v5, :cond_2b

    .line 1342
    invoke-virtual {v12}, Ll/ᩳ֨֫;->᩻()I

    move-result v33

    move/from16 v44, v5

    move/from16 v5, v33

    goto :goto_23

    :cond_2b
    move/from16 v44, v5

    iget v5, v3, Ll/᩶ۖۧ;->ᩳ:I

    :goto_23
    if-ltz v5, :cond_32

    if-eqz v11, :cond_2c

    .line 1345
    invoke-virtual {v12}, Ll/ᩳ֨֫;->᩻()I

    move-result v13

    goto :goto_24

    :cond_2c
    if-nez v14, :cond_2d

    if-eqz v2, :cond_2d

    move/from16 v13, v29

    goto :goto_24

    .line 1346
    :cond_2d
    iget v13, v3, Ll/᩶ۖۧ;->ۧ:I

    :goto_24
    if-eqz v15, :cond_2e

    .line 1354
    invoke-virtual {v12}, Ll/ᩳ֨֫;->᩻()I

    move-result v33

    move/from16 v45, v2

    move/from16 v2, v33

    goto :goto_25

    :cond_2e
    const/16 v33, 0x0

    move/from16 v45, v2

    const/4 v2, 0x0

    :goto_25
    move-object/from16 v46, v3

    int-to-long v2, v2

    add-long/2addr v2, v9

    sub-long v33, v2, v20

    const-wide/32 v35, 0xf4240

    .line 1955
    sget-object v39, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v37, v6

    invoke-static/range {v33 .. v39}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v2

    .line 1358
    aput-wide v2, v8, v14

    move-wide/from16 v34, v6

    .line 1359
    iget-boolean v6, v1, Ll/ۜۘۧ;->ܳ:Z

    if-nez v6, :cond_2f

    move-object/from16 v6, v31

    .line 1360
    iget-object v7, v6, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    move/from16 v36, v11

    move-object/from16 v31, v12

    iget-wide v11, v7, Ll/᩷ۘۧ;->֫:J

    add-long/2addr v2, v11

    aput-wide v2, v8, v14

    goto :goto_26

    :cond_2f
    move/from16 v36, v11

    move-object/from16 v6, v31

    move-object/from16 v31, v12

    .line 1362
    :goto_26
    aput v5, v0, v14

    shr-int/lit8 v2, v13, 0x10

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_31

    if-eqz v43, :cond_30

    if-nez v14, :cond_31

    :cond_30
    const/4 v2, 0x1

    goto :goto_27

    :cond_31
    const/4 v2, 0x0

    .line 1363
    :goto_27
    aput-boolean v2, v40, v14

    int-to-long v2, v4

    add-long/2addr v9, v2

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v12, v31

    move/from16 v4, v32

    move/from16 v11, v36

    move/from16 v3, v42

    move/from16 v13, v43

    move/from16 v5, v44

    move/from16 v2, v45

    move-object/from16 v32, v46

    move-object/from16 v31, v6

    move-wide/from16 v6, v34

    goto/16 :goto_21

    .line 1373
    :cond_32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_33
    const/4 v0, 0x0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_34
    move/from16 v42, v3

    move-object/from16 v6, v31

    .line 1367
    iput-wide v9, v1, Ll/ۜۘۧ;->ܿ:J

    move/from16 v9, v22

    move/from16 v10, v42

    goto :goto_28

    :cond_35
    move/from16 v24, v2

    move-object/from16 v26, v3

    move/from16 v28, v4

    move-object/from16 v27, v5

    move/from16 v23, v6

    move/from16 v41, v7

    move-object/from16 v30, v8

    move v3, v9

    move/from16 v33, v10

    move-object/from16 v25, v11

    move-object v6, v13

    :goto_28
    add-int/lit8 v4, v28, 0x1

    const v14, 0x7472756e

    move-object/from16 v0, p0

    move-object v13, v6

    move/from16 v6, v23

    move/from16 v2, v24

    move-object/from16 v11, v25

    move-object/from16 v3, v26

    move-object/from16 v5, v27

    move-object/from16 v8, v30

    move/from16 v7, v41

    goto/16 :goto_15

    :cond_36
    move/from16 v24, v2

    move-object/from16 v26, v3

    move-object/from16 v27, v5

    move/from16 v41, v7

    move-object/from16 v30, v8

    move-object/from16 v25, v11

    move-object v6, v13

    const/4 v0, 0x0

    .line 1053
    iget-object v2, v6, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v2, v2, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    iget-object v3, v1, Ll/ۜۘۧ;->ᩳ:Ll/᩶ۖۧ;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1055
    iget v3, v3, Ll/᩶ۖۧ;->ܽ:I

    .line 1054
    invoke-virtual {v2, v3}, Ll/ܳۘۧ;->֫(I)Ll/᩻ۘۧ;

    move-result-object v2

    const v3, 0x7361697a

    move-object/from16 v4, v26

    .line 1057
    invoke-virtual {v4, v3}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v3

    if-eqz v3, :cond_3d

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1059
    iget-object v3, v3, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    .line 1120
    iget v5, v2, Ll/᩻ۘۧ;->ᩳ:I

    const/16 v6, 0x8

    .line 1121
    invoke-virtual {v3, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1122
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩻()I

    move-result v7

    .line 1123
    sget v8, Ll/᩹ۖۧ;->֫:I

    const/4 v8, 0x1

    and-int/2addr v7, v8

    if-ne v7, v8, :cond_37

    .line 1125
    invoke-virtual {v3, v6}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1127
    :cond_37
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֨()I

    move-result v6

    .line 1129
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩹()I

    move-result v7

    .line 1130
    iget v8, v1, Ll/ۜۘۧ;->᩻:I

    if-gt v7, v8, :cond_3c

    if-nez v6, :cond_39

    .line 1141
    iget-object v6, v1, Ll/ۜۘۧ;->ۢ:[Z

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_29
    if-ge v8, v7, :cond_3b

    .line 1143
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֨()I

    move-result v10

    add-int/2addr v9, v10

    if-le v10, v5, :cond_38

    const/4 v10, 0x1

    goto :goto_2a

    :cond_38
    const/4 v10, 0x0

    .line 1145
    :goto_2a
    aput-boolean v10, v6, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_29

    :cond_39
    if-le v6, v5, :cond_3a

    const/4 v3, 0x1

    goto :goto_2b

    :cond_3a
    const/4 v3, 0x0

    :goto_2b
    mul-int v9, v6, v7

    .line 1150
    iget-object v5, v1, Ll/ۜۘۧ;->ۢ:[Z

    const/4 v6, 0x0

    invoke-static {v5, v6, v7, v3}, Ljava/util/Arrays;->fill([ZIIZ)V

    :cond_3b
    const/4 v3, 0x0

    .line 1152
    iget-object v5, v1, Ll/ۜۘۧ;->ۢ:[Z

    iget v6, v1, Ll/ۜۘۧ;->᩻:I

    invoke-static {v5, v7, v6, v3}, Ljava/util/Arrays;->fill([ZIIZ)V

    if-lez v9, :cond_3d

    .line 155
    iget-object v3, v1, Ll/ۜۘۧ;->ۜ:Ll/ᩳ֨֫;

    invoke-virtual {v3, v9}, Ll/ᩳ֨֫;->ܽ(I)V

    const/4 v3, 0x1

    .line 156
    iput-boolean v3, v1, Ll/ۜۘۧ;->ܽ:Z

    .line 157
    iput-boolean v3, v1, Ll/ۜۘۧ;->᩷:Z

    goto :goto_2c

    :cond_3c
    const-string v2, "Saiz sample count "

    const-string v3, " is greater than fragment sample count"

    .line 0
    invoke-static {v7, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1131
    iget v1, v1, Ll/ۜۘۧ;->᩻:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_3d
    :goto_2c
    const v3, 0x7361696f

    .line 1062
    invoke-virtual {v4, v3}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v3

    if-eqz v3, :cond_41

    .line 1064
    iget-object v3, v3, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v5, 0x8

    .line 1165
    invoke-virtual {v3, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1166
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    .line 1167
    sget v7, Ll/᩹ۖۧ;->֫:I

    and-int/lit8 v7, v6, 0x1

    const/4 v8, 0x1

    if-ne v7, v8, :cond_3e

    .line 1169
    invoke-virtual {v3, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1172
    :cond_3e
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩹()I

    move-result v5

    if-ne v5, v8, :cond_40

    .line 1179
    invoke-static {v6}, Ll/᩹ۖۧ;->֫(I)I

    move-result v5

    .line 1180
    iget-wide v6, v1, Ll/ۜۘۧ;->֫:J

    if-nez v5, :cond_3f

    .line 1181
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v8

    goto :goto_2d

    :cond_3f
    invoke-virtual {v3}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v8

    :goto_2d
    add-long/2addr v6, v8

    iput-wide v6, v1, Ll/ۜۘۧ;->֫:J

    goto :goto_2e

    .line 1175
    :cond_40
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected saio entry count: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_41
    :goto_2e
    const v3, 0x73656e63

    .line 1067
    invoke-virtual {v4, v3}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v3

    if-eqz v3, :cond_42

    .line 1069
    iget-object v3, v3, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/4 v4, 0x0

    .line 1397
    invoke-static {v3, v4, v1}, Ll/۬ۖۧ;->֫(Ll/ᩳ֨֫;ILl/ۜۘۧ;)V

    :cond_42
    if-eqz v2, :cond_43

    .line 1072
    iget-object v2, v2, Ll/᩻ۘۧ;->ܿ:Ljava/lang/String;

    move-object v5, v2

    goto :goto_2f

    :cond_43
    move-object v5, v0

    :goto_2f
    const/4 v2, 0x0

    move-object v3, v0

    move-object v4, v3

    .line 1437
    :goto_30
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v2, v6, :cond_46

    move-object/from16 v11, v30

    .line 1438
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۠֨֫;

    .line 1439
    iget-object v7, v6, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    .line 1440
    iget v6, v6, Ll/ܶ֨֫;->֫:I

    const v8, 0x73626770

    const v9, 0x73656967

    if-ne v6, v8, :cond_44

    const/16 v6, 0xc

    .line 1441
    invoke-virtual {v7, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1442
    invoke-virtual {v7}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    if-ne v6, v9, :cond_45

    move-object v3, v7

    goto :goto_31

    :cond_44
    const/16 v8, 0xc

    const v10, 0x73677064

    if-ne v6, v10, :cond_45

    .line 1446
    invoke-virtual {v7, v8}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1447
    invoke-virtual {v7}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    if-ne v6, v9, :cond_45

    move-object v4, v7

    :cond_45
    :goto_31
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v30, v11

    goto :goto_30

    :cond_46
    move-object/from16 v11, v30

    if-eqz v3, :cond_51

    if-nez v4, :cond_47

    goto/16 :goto_35

    :cond_47
    const/16 v2, 0x8

    .line 1456
    invoke-virtual {v3, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1457
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    invoke-static {v6}, Ll/᩹ۖۧ;->֫(I)I

    move-result v6

    const/4 v7, 0x4

    .line 1458
    invoke-virtual {v3, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    const/4 v8, 0x1

    if-ne v6, v8, :cond_48

    .line 1460
    invoke-virtual {v3, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1462
    :cond_48
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    if-ne v3, v8, :cond_50

    .line 1467
    invoke-virtual {v4, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1468
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    invoke-static {v2}, Ll/᩹ۖۧ;->֫(I)I

    move-result v2

    .line 1469
    invoke-virtual {v4, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    if-ne v2, v8, :cond_4a

    .line 1471
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    cmp-long v6, v2, v20

    if-eqz v6, :cond_49

    goto :goto_32

    :cond_49
    const-string v0, "Variable length description in sgpd found (unsupported)"

    .line 1472
    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_4a
    const/4 v3, 0x2

    if-lt v2, v3, :cond_4b

    .line 1476
    invoke-virtual {v4, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1478
    :cond_4b
    :goto_32
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    const-wide/16 v6, 0x1

    cmp-long v8, v2, v6

    if-nez v8, :cond_4f

    const/4 v2, 0x1

    .line 1484
    invoke-virtual {v4, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1485
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    and-int/lit16 v6, v3, 0xf0

    shr-int/lit8 v8, v6, 0x4

    and-int/lit8 v9, v3, 0xf

    .line 1488
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    if-ne v3, v2, :cond_4c

    const/4 v2, 0x1

    goto :goto_33

    :cond_4c
    const/4 v2, 0x0

    :goto_33
    if-nez v2, :cond_4d

    goto :goto_35

    .line 1492
    :cond_4d
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֨()I

    move-result v6

    const/16 v3, 0x10

    new-array v7, v3, [B

    const/4 v10, 0x0

    .line 1494
    invoke-virtual {v4, v10, v3, v7}, Ll/ᩳ֨֫;->֫(II[B)V

    if-nez v6, :cond_4e

    .line 1497
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    .line 1498
    new-array v3, v0, [B

    .line 1499
    invoke-virtual {v4, v10, v0, v3}, Ll/ᩳ֨֫;->֫(II[B)V

    move-object v10, v3

    goto :goto_34

    :cond_4e
    move-object v10, v0

    :goto_34
    const/4 v0, 0x1

    .line 1501
    iput-boolean v0, v1, Ll/ۜۘۧ;->ܽ:Z

    .line 1502
    new-instance v0, Ll/᩻ۘۧ;

    move-object v3, v0

    move v4, v2

    invoke-direct/range {v3 .. v10}, Ll/᩻ۘۧ;-><init>(ZLjava/lang/String;I[BII[B)V

    iput-object v0, v1, Ll/ۜۘۧ;->ۘ:Ll/᩻ۘۧ;

    goto :goto_35

    :cond_4f
    const-string v0, "Entry count in sgpd != 1 (unsupported)."

    .line 1479
    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_50
    const-string v0, "Entry count in sbgp != 1 (unsupported)."

    .line 1463
    invoke-static {v0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    .line 1074
    :cond_51
    :goto_35
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_36
    if-ge v2, v0, :cond_54

    .line 1076
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠֨֫;

    .line 1077
    iget v4, v3, Ll/ܶ֨֫;->֫:I

    const v5, 0x75756964

    if-ne v4, v5, :cond_53

    .line 1078
    iget-object v3, v3, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v4, 0x8

    .line 1382
    invoke-virtual {v3, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    move-object/from16 v4, p0

    .line 1383
    iget-object v5, v4, Ll/۬ۖۧ;->۟:[B

    const/4 v6, 0x0

    const/16 v7, 0x10

    invoke-virtual {v3, v6, v7, v5}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 1386
    sget-object v6, Ll/۬ۖۧ;->᩻֫:[B

    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v5

    if-nez v5, :cond_52

    goto :goto_37

    .line 1393
    :cond_52
    invoke-static {v3, v7, v1}, Ll/۬ۖۧ;->֫(Ll/ᩳ֨֫;ILl/ۜۘۧ;)V

    goto :goto_37

    :cond_53
    move-object/from16 v4, p0

    :goto_37
    add-int/lit8 v2, v2, 0x1

    goto :goto_36

    :cond_54
    move-object/from16 v4, p0

    goto :goto_39

    :cond_55
    move/from16 v16, v1

    :goto_38
    move/from16 v24, v2

    move-object/from16 v19, v4

    move-object/from16 v27, v5

    move/from16 v41, v7

    move-object/from16 v25, v11

    move-object v4, v0

    :goto_39
    add-int/lit8 v2, v24, 0x1

    move-object v0, v4

    move/from16 v1, v16

    move-object/from16 v4, v19

    move-object/from16 v11, v25

    move-object/from16 v5, v27

    move/from16 v7, v41

    goto/16 :goto_c

    :cond_56
    move-object v4, v0

    move-object/from16 v27, v5

    move-object/from16 v25, v11

    .line 846
    invoke-static/range {v27 .. v27}, Ll/۬ۖۧ;->֫(Ljava/util/List;)Ll/᩵ᩴ֫;

    move-result-object v0

    if-eqz v0, :cond_57

    .line 848
    invoke-virtual/range {v25 .. v25}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_3a
    if-ge v2, v1, :cond_57

    move-object/from16 v3, v25

    .line 850
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗۖۧ;

    invoke-virtual {v5, v0}, Ll/ۗۖۧ;->֫(Ll/᩵ᩴ֫;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3a

    :cond_57
    move-object/from16 v3, v25

    .line 854
    iget-wide v0, v4, Ll/۬ۖۧ;->۬:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v5

    if-eqz v2, :cond_5c

    .line 855
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_3b
    if-ge v1, v0, :cond_5a

    .line 857
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗۖۧ;

    iget-wide v5, v4, Ll/۬ۖۧ;->۬:J

    .line 2050
    iget v7, v2, Ll/ۗۖۧ;->ܽ:I

    .line 2051
    :goto_3c
    iget-object v8, v2, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    iget v9, v8, Ll/ۜۘۧ;->᩻:I

    if-ge v7, v9, :cond_59

    .line 189
    iget-object v9, v8, Ll/ۜۘۧ;->ܺ:[J

    aget-wide v10, v9, v7

    cmp-long v9, v10, v5

    if-gtz v9, :cond_59

    .line 2053
    iget-object v8, v8, Ll/ۜۘۧ;->ۡ:[Z

    aget-boolean v8, v8, v7

    if-eqz v8, :cond_58

    .line 2054
    iput v7, v2, Ll/ۗۖۧ;->᩷:I

    :cond_58
    add-int/lit8 v7, v7, 0x1

    goto :goto_3c

    :cond_59
    add-int/lit8 v1, v1, 0x1

    goto :goto_3b

    :cond_5a
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 859
    iput-wide v1, v4, Ll/۬ۖۧ;->۬:J

    goto :goto_3d

    :cond_5b
    move-object v4, v0

    .line 735
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5c

    .line 736
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨֨֫;

    .line 543
    iget-object v0, v0, Ll/֨֨֫;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5c
    :goto_3d
    move-object v0, v4

    goto/16 :goto_0

    :cond_5d
    move-object v4, v0

    .line 707
    invoke-direct/range {p0 .. p0}, Ll/۬ۖۧ;->ۧ()V

    return-void
.end method

.method public static synthetic ֫(Ll/۬ۖۧ;JLl/ᩳ֨֫;)V
    .locals 0

    .line 444
    iget-object p0, p0, Ll/۬ۖۧ;->ܳ:[Ll/᩵ۢۧ;

    invoke-static {p1, p2, p3, p0}, Ll/ۜ᩷ۧ;->֫(JLl/ᩳ֨֫;[Ll/᩵ۢۧ;)V

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;ILl/ۜۘۧ;)V
    .locals 5

    add-int/lit8 p1, p1, 0x8

    .line 1402
    invoke-virtual {p0, p1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1403
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result p1

    .line 1404
    sget v0, Ll/᩹ۖۧ;->֫:I

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_3

    and-int/lit8 p1, p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1413
    :goto_0
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩹()I

    move-result v2

    if-nez v2, :cond_1

    .line 1416
    iget-object p0, p2, Ll/ۜۘۧ;->ۢ:[Z

    iget p1, p2, Ll/ۜۘۧ;->᩻:I

    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    return-void

    .line 1418
    :cond_1
    iget v3, p2, Ll/ۜۘۧ;->᩻:I

    iget-object v4, p2, Ll/ۜۘۧ;->ۜ:Ll/ᩳ֨֫;

    if-ne v2, v3, :cond_2

    .line 1427
    iget-object v3, p2, Ll/ۜۘۧ;->ۢ:[Z

    invoke-static {v3, v0, v2, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1428
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    .line 155
    invoke-virtual {v4, p1}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 156
    iput-boolean v1, p2, Ll/ۜۘۧ;->ܽ:Z

    .line 157
    iput-boolean v1, p2, Ll/ۜۘۧ;->᩷:Z

    .line 177
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p1

    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܿ()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 178
    invoke-virtual {v4, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 179
    iput-boolean v0, p2, Ll/ۜۘۧ;->᩷:Z

    return-void

    :cond_2
    const-string p0, "Senc sample count "

    const-string p1, " is different from fragment sample count"

    .line 0
    invoke-static {v2, p0, p1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 1419
    iget p1, p2, Ll/ۜۘۧ;->᩻:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p0

    throw p0

    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 1408
    invoke-static {p0}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object p0

    throw p0
.end method

.method private ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 563
    iput v0, p0, Ll/۬ۖۧ;->᩶:I

    .line 564
    iput v0, p0, Ll/۬ۖۧ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 533
    :goto_0
    iget v2, v0, Ll/۬ۖۧ;->᩶:I

    iget-object v3, v0, Ll/۬ۖۧ;->᩷:Ljava/util/ArrayDeque;

    iget-object v4, v0, Ll/۬ۖۧ;->ۤ:Ll/᩻۠֫;

    iget-object v5, v0, Ll/۬ۖۧ;->ܰ:Ll/ᩳ֨֫;

    iget-object v6, v0, Ll/۬ۖۧ;->᩻:Ll/ۢ᩷ۧ;

    iget-object v7, v0, Ll/۬ۖۧ;->ܿ֫:Landroid/util/SparseArray;

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v2, :cond_41

    iget-object v11, v0, Ll/۬ۖۧ;->ۗ:Ljava/util/ArrayDeque;

    iget v12, v0, Ll/۬ۖۧ;->᩵:I

    iget-object v13, v0, Ll/۬ۖۧ;->ᩳ֫:Ll/ۢ֨֫;

    if-eq v2, v10, :cond_32

    const-wide v14, 0x7fffffffffffffffL

    if-eq v2, v9, :cond_2d

    .line 1620
    iget-object v2, v0, Ll/۬ۖۧ;->ۢ:Ll/ۗۖۧ;

    if-nez v2, :cond_7

    .line 1872
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v6, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v2, :cond_3

    .line 1874
    invoke-virtual {v7, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v9, v16

    check-cast v9, Ll/ۗۖۧ;

    .line 1875
    invoke-static {v9}, Ll/ۗۖۧ;->֫(Ll/ۗۖۧ;)Z

    move-result v16

    if-nez v16, :cond_0

    iget v3, v9, Ll/ۗۖۧ;->ܽ:I

    iget-object v8, v9, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget v8, v8, Ll/᩷ۘۧ;->ܿ:I

    if-eq v3, v8, :cond_2

    :cond_0
    invoke-static {v9}, Ll/ۗۖۧ;->֫(Ll/ۗۖۧ;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget v3, v9, Ll/ۗۖۧ;->ᩳ:I

    iget-object v8, v9, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    iget v8, v8, Ll/ۜۘۧ;->ᩴ:I

    if-ne v3, v8, :cond_1

    goto :goto_2

    .line 1881
    :cond_1
    invoke-virtual {v9}, Ll/ۗۖۧ;->ۧ()J

    move-result-wide v19

    cmp-long v3, v19, v14

    if-gez v3, :cond_2

    move-object v6, v9

    move-wide/from16 v14, v19

    :cond_2
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    if-nez v6, :cond_5

    .line 1626
    iget-wide v2, v0, Ll/۬ۖۧ;->ۖ:J

    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v3, v2

    if-ltz v3, :cond_4

    .line 1631
    invoke-interface {v1, v3}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 1632
    invoke-direct/range {p0 .. p0}, Ll/۬ۖۧ;->ۧ()V

    goto :goto_0

    :cond_4
    const-string v1, "Offset to end of mdat was negative."

    const/4 v2, 0x0

    .line 1628
    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 1636
    :cond_5
    invoke-virtual {v6}, Ll/ۗۖۧ;->ۧ()J

    move-result-wide v7

    .line 1638
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v9

    sub-long/2addr v7, v9

    long-to-int v3, v7

    if-gez v3, :cond_6

    const-string v3, "Ignoring negative offset to sample data."

    .line 1641
    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 1644
    :cond_6
    invoke-interface {v1, v3}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 1645
    iput-object v6, v0, Ll/۬ۖۧ;->ۢ:Ll/ۗۖۧ;

    move-object v2, v6

    const/4 v3, 0x0

    const/4 v9, 0x2

    goto :goto_3

    :cond_7
    const/4 v9, 0x2

    const/4 v3, 0x0

    .line 1647
    :goto_3
    iget-object v6, v2, Ll/ۗۖۧ;->ܺ:Ll/᩵ۢۧ;

    iget v7, v0, Ll/۬ۖۧ;->᩶:I

    const-string v8, "video/hevc"

    const-string v10, "video/avc"

    const/4 v14, 0x4

    const/4 v15, 0x3

    if-ne v7, v15, :cond_11

    .line 1648
    invoke-virtual {v2}, Ll/ۗۖۧ;->ᩳ()I

    move-result v7

    iput v7, v0, Ll/۬ۖۧ;->᩺:I

    .line 1652
    iget-object v7, v2, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v7, v7, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    iget-object v7, v7, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    .line 1824
    iget-object v15, v7, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v15, v10}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_8

    and-int/lit8 v7, v12, 0x40

    if-eqz v7, :cond_9

    goto :goto_4

    .line 1827
    :cond_8
    iget-object v7, v7, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v7, v8}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    and-int/lit16 v7, v12, 0x80

    if-eqz v7, :cond_9

    :goto_4
    const/4 v7, 0x1

    goto :goto_5

    :cond_9
    const/4 v7, 0x0

    :goto_5
    xor-int/lit8 v7, v7, 0x1

    .line 1653
    iput-boolean v7, v0, Ll/۬ۖۧ;->֨:Z

    .line 1655
    iget v7, v2, Ll/ۗۖۧ;->ܽ:I

    iget v12, v2, Ll/ۗۖۧ;->᩷:I

    if-ge v7, v12, :cond_e

    .line 1656
    iget v4, v0, Ll/۬ۖۧ;->᩺:I

    invoke-interface {v1, v4}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 2221
    iget-object v1, v2, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    invoke-virtual {v2}, Ll/ۗۖۧ;->ܿ()Ll/᩻ۘۧ;

    move-result-object v4

    if-nez v4, :cond_a

    goto :goto_6

    .line 2226
    :cond_a
    iget-object v5, v1, Ll/ۜۘۧ;->ۜ:Ll/ᩳ֨֫;

    .line 2227
    iget v4, v4, Ll/᩻ۘۧ;->ᩳ:I

    if-eqz v4, :cond_b

    .line 2228
    invoke-virtual {v5, v4}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2230
    :cond_b
    iget v4, v2, Ll/ۗۖۧ;->ܽ:I

    .line 194
    iget-boolean v6, v1, Ll/ۜۘۧ;->ܽ:Z

    if-eqz v6, :cond_c

    iget-object v1, v1, Ll/ۜۘۧ;->ۢ:[Z

    aget-boolean v1, v1, v4

    if-eqz v1, :cond_c

    .line 2231
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    mul-int/lit8 v1, v1, 0x6

    invoke-virtual {v5, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1658
    :cond_c
    :goto_6
    invoke-virtual {v2}, Ll/ۗۖۧ;->ܳ()Z

    move-result v1

    if-nez v1, :cond_d

    const/4 v1, 0x0

    .line 1659
    iput-object v1, v0, Ll/۬ۖۧ;->ۢ:Ll/ۗۖۧ;

    :cond_d
    const/4 v1, 0x3

    .line 1661
    iput v1, v0, Ll/۬ۖۧ;->᩶:I

    return v3

    .line 1665
    :cond_e
    iget-object v3, v2, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v3, v3, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    iget v3, v3, Ll/ܳۘۧ;->ۡ:I

    const/4 v7, 0x1

    if-ne v3, v7, :cond_f

    .line 1667
    iget v3, v0, Ll/۬ۖۧ;->᩺:I

    add-int/lit8 v3, v3, -0x8

    iput v3, v0, Ll/۬ۖۧ;->᩺:I

    const/16 v3, 0x8

    .line 1668
    invoke-interface {v1, v3}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 1671
    :cond_f
    iget-object v3, v2, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v3, v3, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    iget-object v3, v3, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    iget-object v3, v3, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v7, "audio/ac4"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 1673
    iget v3, v0, Ll/۬ۖۧ;->᩺:I

    const/4 v7, 0x7

    .line 1674
    invoke-virtual {v2, v3, v7}, Ll/ۗۖۧ;->֫(II)I

    move-result v3

    iput v3, v0, Ll/۬ۖۧ;->ۛ:I

    .line 1675
    iget v3, v0, Ll/۬ۖۧ;->᩺:I

    invoke-static {v3, v5}, Ll/ܰۜۧ;->֫(ILl/ᩳ֨֫;)V

    .line 1676
    invoke-interface {v6, v7, v5}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 1677
    iget v3, v0, Ll/۬ۖۧ;->ۛ:I

    add-int/2addr v3, v7

    iput v3, v0, Ll/۬ۖۧ;->ۛ:I

    goto :goto_7

    .line 1679
    :cond_10
    iget v3, v0, Ll/۬ۖۧ;->᩺:I

    const/4 v5, 0x0

    .line 1680
    invoke-virtual {v2, v3, v5}, Ll/ۗۖۧ;->֫(II)I

    move-result v3

    iput v3, v0, Ll/۬ۖۧ;->ۛ:I

    :goto_7
    const/4 v3, 0x0

    .line 1682
    iget v5, v0, Ll/۬ۖۧ;->᩺:I

    iget v7, v0, Ll/۬ۖۧ;->ۛ:I

    add-int/2addr v5, v7

    iput v5, v0, Ll/۬ۖۧ;->᩺:I

    .line 1683
    iput v14, v0, Ll/۬ۖۧ;->᩶:I

    .line 1684
    iput v3, v0, Ll/۬ۖۧ;->ۨ:I

    .line 1687
    :cond_11
    iget-object v3, v2, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v3, v3, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    .line 1689
    invoke-virtual {v2}, Ll/ۗۖۧ;->ܽ()J

    move-result-wide v14

    if-eqz v13, :cond_12

    .line 1691
    invoke-virtual {v13, v14, v15}, Ll/ۢ֨֫;->֫(J)J

    move-result-wide v14

    .line 1693
    :cond_12
    iget v5, v3, Ll/ܳۘۧ;->᩷:I

    iget-object v3, v3, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    if-eqz v5, :cond_24

    .line 1696
    iget-object v7, v0, Ll/۬ۖۧ;->ܶ:Ll/ᩳ֨֫;

    invoke-virtual {v7}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v12

    const/16 v16, 0x0

    .line 1697
    aput-byte v16, v12, v16

    const/16 v17, 0x1

    .line 1698
    aput-byte v16, v12, v17

    .line 1699
    aput-byte v16, v12, v9

    rsub-int/lit8 v9, v5, 0x4

    move-object/from16 v16, v13

    .line 1704
    :goto_8
    iget v13, v0, Ll/۬ۖۧ;->ۛ:I

    move-object/from16 v17, v11

    iget v11, v0, Ll/۬ۖۧ;->᩺:I

    if-ge v13, v11, :cond_23

    .line 1705
    iget v11, v0, Ll/۬ۖۧ;->ۨ:I

    if-nez v11, :cond_1d

    .line 1707
    iget-object v11, v0, Ll/۬ۖۧ;->ܳ:[Ll/᩵ۢۧ;

    array-length v11, v11

    if-gtz v11, :cond_14

    iget-boolean v11, v0, Ll/۬ۖۧ;->֨:Z

    if-nez v11, :cond_13

    goto :goto_9

    :cond_13
    move-object/from16 v18, v2

    goto :goto_a

    .line 1709
    :cond_14
    :goto_9
    invoke-static {v3}, Ll/ܽ۠֫;->֫(Ll/۠ᩴ֫;)I

    move-result v11

    add-int v13, v5, v11

    move/from16 p2, v11

    .line 1710
    iget v11, v0, Ll/۬ۖۧ;->᩺:I

    move-object/from16 v18, v2

    iget v2, v0, Ll/۬ۖۧ;->ۛ:I

    sub-int/2addr v11, v2

    if-gt v13, v11, :cond_15

    move/from16 v11, p2

    goto :goto_b

    :cond_15
    :goto_a
    const/4 v11, 0x0

    :goto_b
    add-int v2, v5, v11

    .line 1724
    invoke-interface {v1, v12, v9, v2}, Ll/۠᩷ۧ;->readFully([BII)V

    const/4 v2, 0x0

    .line 1725
    invoke-virtual {v7, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1726
    invoke-virtual {v7}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    if-ltz v2, :cond_1c

    sub-int/2addr v2, v11

    .line 1731
    iput v2, v0, Ll/۬ۖۧ;->ۨ:I

    .line 1733
    iget-object v2, v0, Ll/۬ۖۧ;->᩸:Ll/ᩳ֨֫;

    const/4 v13, 0x0

    invoke-virtual {v2, v13}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v13, 0x4

    .line 1734
    invoke-interface {v6, v13, v2}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 1735
    iget v2, v0, Ll/۬ۖۧ;->ۛ:I

    add-int/2addr v2, v13

    iput v2, v0, Ll/۬ۖۧ;->ۛ:I

    .line 1736
    iget v2, v0, Ll/۬ۖۧ;->᩺:I

    add-int/2addr v2, v9

    iput v2, v0, Ll/۬ۖۧ;->᩺:I

    .line 1737
    iget-object v2, v0, Ll/۬ۖۧ;->ܳ:[Ll/᩵ۢۧ;

    array-length v2, v2

    if-lez v2, :cond_1a

    if-lez v11, :cond_1a

    aget-byte v2, v12, v13

    .line 641
    iget-object v13, v3, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    move/from16 v19, v5

    iget-object v5, v3, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    invoke-static {v13, v10}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_17

    .line 344
    invoke-static {v5, v10}, Ll/ۢ᩵֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_16

    goto :goto_c

    :cond_16
    move/from16 p2, v9

    goto :goto_d

    :cond_17
    :goto_c
    and-int/lit8 v13, v2, 0x1f

    move/from16 p2, v9

    const/4 v9, 0x6

    if-eq v13, v9, :cond_19

    .line 642
    :goto_d
    iget-object v9, v3, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 644
    invoke-static {v9, v8}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_18

    .line 344
    invoke-static {v5, v8}, Ll/ۢ᩵֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1b

    :cond_18
    and-int/lit8 v2, v2, 0x7e

    shr-int/lit8 v2, v2, 0x1

    const/16 v5, 0x27

    if-ne v2, v5, :cond_1b

    :cond_19
    const/4 v2, 0x1

    goto :goto_e

    :cond_1a
    move/from16 v19, v5

    move/from16 p2, v9

    :cond_1b
    const/4 v2, 0x0

    .line 1740
    :goto_e
    iput-boolean v2, v0, Ll/۬ۖۧ;->۫:Z

    .line 1742
    invoke-interface {v6, v11, v7}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 1743
    iget v2, v0, Ll/۬ۖۧ;->ۛ:I

    add-int/2addr v2, v11

    iput v2, v0, Ll/۬ۖۧ;->ۛ:I

    if-lez v11, :cond_22

    .line 1744
    iget-boolean v2, v0, Ll/۬ۖۧ;->֨:Z

    if-nez v2, :cond_22

    .line 1746
    invoke-static {v12, v11, v3}, Ll/ܽ۠֫;->֫([BILl/۠ᩴ֫;)Z

    move-result v2

    if-eqz v2, :cond_22

    const/4 v2, 0x1

    .line 1751
    iput-boolean v2, v0, Ll/۬ۖۧ;->֨:Z

    goto/16 :goto_11

    :cond_1c
    const-string v1, "Invalid NAL length"

    const/4 v2, 0x0

    .line 1728
    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    :cond_1d
    move-object/from16 v18, v2

    move/from16 v19, v5

    move/from16 p2, v9

    .line 1755
    iget-boolean v2, v0, Ll/۬ۖۧ;->۫:Z

    if-eqz v2, :cond_20

    .line 1757
    iget-object v2, v0, Ll/۬ۖۧ;->᩹:Ll/ᩳ֨֫;

    invoke-virtual {v2, v11}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 1759
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    iget v9, v0, Ll/۬ۖۧ;->ۨ:I

    const/4 v11, 0x0

    .line 1758
    invoke-interface {v1, v5, v11, v9}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 1760
    iget v5, v0, Ll/۬ۖۧ;->ۨ:I

    invoke-interface {v6, v5, v2}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 1761
    iget v5, v0, Ll/۬ۖۧ;->ۨ:I

    .line 1765
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v9

    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܿ()I

    move-result v13

    .line 1764
    invoke-static {v13, v9}, Ll/ܽ۠֫;->֫(I[B)I

    move-result v9

    .line 1766
    invoke-virtual {v2, v11}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1767
    invoke-virtual {v2, v9}, Ll/ᩳ֨֫;->ᩳ(I)V

    .line 1769
    iget v9, v3, Ll/۠ᩴ֫;->۬:I

    const/4 v13, -0x1

    if-ne v9, v13, :cond_1e

    .line 1770
    invoke-virtual {v4}, Ll/᩻۠֫;->ܽ()I

    move-result v9

    if-eqz v9, :cond_1f

    .line 1771
    invoke-virtual {v4, v11}, Ll/᩻۠֫;->֫(I)V

    goto :goto_f

    .line 1773
    :cond_1e
    invoke-virtual {v4}, Ll/᩻۠֫;->ܽ()I

    move-result v9

    iget v11, v3, Ll/۠ᩴ֫;->۬:I

    if-eq v9, v11, :cond_1f

    .line 1774
    invoke-virtual {v4, v11}, Ll/᩻۠֫;->֫(I)V

    .line 1776
    :cond_1f
    :goto_f
    invoke-virtual {v4, v14, v15, v2}, Ll/᩻۠֫;->֫(JLl/ᩳ֨֫;)V

    .line 1778
    invoke-virtual/range {v18 .. v18}, Ll/ۗۖۧ;->֫()I

    move-result v2

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_21

    .line 1779
    invoke-virtual {v4}, Ll/᩻۠֫;->ۧ()V

    goto :goto_10

    :cond_20
    const/4 v2, 0x0

    .line 1783
    invoke-interface {v6, v1, v11, v2}, Ll/᩵ۢۧ;->֫(Ll/ۢᩴ֫;IZ)I

    move-result v5

    .line 1785
    :cond_21
    :goto_10
    iget v2, v0, Ll/۬ۖۧ;->ۛ:I

    add-int/2addr v2, v5

    iput v2, v0, Ll/۬ۖۧ;->ۛ:I

    .line 1786
    iget v2, v0, Ll/۬ۖۧ;->ۨ:I

    sub-int/2addr v2, v5

    iput v2, v0, Ll/۬ۖۧ;->ۨ:I

    :cond_22
    :goto_11
    move/from16 v9, p2

    move-object/from16 v11, v17

    move-object/from16 v2, v18

    move/from16 v5, v19

    goto/16 :goto_8

    :cond_23
    move-object/from16 v18, v2

    goto :goto_13

    :cond_24
    move-object/from16 v18, v2

    move-object/from16 v17, v11

    move-object/from16 v16, v13

    .line 1790
    :goto_12
    iget v2, v0, Ll/۬ۖۧ;->ۛ:I

    iget v3, v0, Ll/۬ۖۧ;->᩺:I

    if-ge v2, v3, :cond_25

    sub-int/2addr v3, v2

    const/4 v2, 0x0

    .line 1791
    invoke-interface {v6, v1, v3, v2}, Ll/᩵ۢۧ;->֫(Ll/ۢᩴ֫;IZ)I

    move-result v2

    .line 1792
    iget v3, v0, Ll/۬ۖۧ;->ۛ:I

    add-int/2addr v3, v2

    iput v3, v0, Ll/۬ۖۧ;->ۛ:I

    goto :goto_12

    .line 1796
    :cond_25
    :goto_13
    invoke-virtual/range {v18 .. v18}, Ll/ۗۖۧ;->֫()I

    move-result v1

    .line 1797
    iget-boolean v2, v0, Ll/۬ۖۧ;->֨:Z

    if-nez v2, :cond_26

    const/high16 v2, 0x4000000

    or-int/2addr v1, v2

    :cond_26
    move/from16 v22, v1

    .line 1803
    invoke-virtual/range {v18 .. v18}, Ll/ۗۖۧ;->ܿ()Ll/᩻ۘۧ;

    move-result-object v1

    if-eqz v1, :cond_27

    .line 1805
    iget-object v1, v1, Ll/᩻ۘۧ;->֫:Ll/ᩴۢۧ;

    goto :goto_14

    :cond_27
    const/4 v1, 0x0

    :goto_14
    move-object/from16 v25, v1

    .line 1808
    iget v1, v0, Ll/۬ۖۧ;->᩺:I

    const/16 v24, 0x0

    move-object/from16 v19, v6

    move-wide/from16 v20, v14

    move/from16 v23, v1

    invoke-interface/range {v19 .. v25}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    .line 1840
    :goto_15
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2b

    .line 1841
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙۖۧ;

    .line 1842
    iget v2, v0, Ll/۬ۖۧ;->ۙ:I

    iget v3, v1, Ll/ۙۖۧ;->ܽ:I

    sub-int/2addr v2, v3

    iput v2, v0, Ll/۬ۖۧ;->ۙ:I

    .line 1843
    iget-wide v2, v1, Ll/ۙۖۧ;->ۧ:J

    .line 1844
    iget-boolean v4, v1, Ll/ۙۖۧ;->֫:Z

    if-eqz v4, :cond_28

    add-long/2addr v2, v14

    :cond_28
    move-object/from16 v4, v16

    if-eqz v16, :cond_29

    .line 1850
    invoke-virtual {v4, v2, v3}, Ll/ۢ֨֫;->֫(J)J

    move-result-wide v2

    .line 1852
    :cond_29
    iget-object v12, v0, Ll/۬ۖۧ;->ܺ:[Ll/᩵ۢۧ;

    array-length v13, v12

    const/4 v5, 0x0

    const/4 v11, 0x0

    :goto_16
    if-ge v11, v13, :cond_2a

    aget-object v5, v12, v11

    .line 1853
    iget v9, v1, Ll/ۙۖۧ;->ܽ:I

    iget v10, v0, Ll/۬ۖۧ;->ۙ:I

    const/16 v16, 0x0

    const/4 v8, 0x1

    move-wide v6, v2

    move/from16 v19, v11

    move-object/from16 v11, v16

    invoke-interface/range {v5 .. v11}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    add-int/lit8 v11, v19, 0x1

    goto :goto_16

    :cond_2a
    move-object/from16 v16, v4

    goto :goto_15

    .line 1812
    :cond_2b
    invoke-virtual/range {v18 .. v18}, Ll/ۗۖۧ;->ܳ()Z

    move-result v1

    if-nez v1, :cond_2c

    const/4 v1, 0x0

    .line 1813
    iput-object v1, v0, Ll/۬ۖۧ;->ۢ:Ll/ۗۖۧ;

    :cond_2c
    const/4 v1, 0x3

    .line 1815
    iput v1, v0, Ll/۬ۖۧ;->᩶:I

    const/4 v1, 0x0

    return v1

    .line 1582
    :cond_2d
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_17
    if-ge v3, v2, :cond_2f

    .line 1584
    invoke-virtual {v7, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗۖۧ;

    iget-object v5, v5, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    .line 1585
    iget-boolean v6, v5, Ll/ۜۘۧ;->᩷:Z

    if-eqz v6, :cond_2e

    iget-wide v5, v5, Ll/ۜۘۧ;->֫:J

    cmp-long v8, v5, v14

    if-gez v8, :cond_2e

    .line 1588
    invoke-virtual {v7, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗۖۧ;

    move-wide v14, v5

    :cond_2e
    add-int/lit8 v3, v3, 0x1

    goto :goto_17

    :cond_2f
    if-nez v4, :cond_30

    const/4 v2, 0x3

    .line 1592
    iput v2, v0, Ll/۬ۖۧ;->᩶:I

    goto/16 :goto_0

    .line 1595
    :cond_30
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    sub-long/2addr v14, v2

    long-to-int v2, v14

    if-ltz v2, :cond_31

    .line 1600
    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 1601
    iget-object v2, v4, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    .line 166
    iget-object v3, v2, Ll/ۜۘۧ;->ۜ:Ll/ᩳ֨֫;

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    invoke-virtual {v3}, Ll/ᩳ֨֫;->ܿ()I

    move-result v5

    const/4 v6, 0x0

    invoke-interface {v1, v4, v6, v5}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 167
    invoke-virtual {v3, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 168
    iput-boolean v6, v2, Ll/ۜۘۧ;->᩷:Z

    goto/16 :goto_0

    :cond_31
    const-string v1, "Offset to encryption data was negative."

    const/4 v2, 0x0

    .line 1597
    invoke-static {v1, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    :cond_32
    move-object/from16 v17, v11

    move-object v4, v13

    .line 692
    iget-wide v7, v0, Ll/۬ۖۧ;->ᩳ:J

    iget v2, v0, Ll/۬ۖۧ;->ܽ:I

    int-to-long v9, v2

    sub-long/2addr v7, v9

    long-to-int v2, v7

    .line 693
    iget-object v5, v0, Ll/۬ۖۧ;->֫:Ll/ᩳ֨֫;

    if-eqz v5, :cond_3f

    .line 695
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v7

    const/16 v8, 0x8

    invoke-interface {v1, v7, v8, v2}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 696
    new-instance v2, Ll/۠֨֫;

    iget v7, v0, Ll/۬ۖۧ;->ܿ:I

    invoke-direct {v2, v7, v5}, Ll/۠֨֫;-><init>(ILl/ᩳ֨֫;)V

    .line 711
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_33

    .line 712
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨֨֫;

    .line 534
    iget-object v3, v3, Ll/֨֨֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1c

    :cond_33
    const v2, 0x73696478

    if-ne v7, v2, :cond_35

    .line 714
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    invoke-static {v2, v3, v5}, Ll/۬ۖۧ;->֫(JLl/ᩳ֨֫;)Landroid/util/Pair;

    move-result-object v2

    .line 715
    iget-object v3, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ll/᩷᩷ۧ;

    invoke-virtual {v6, v3}, Ll/ۢ᩷ۧ;->֫(Ll/᩷᩷ۧ;)V

    .line 716
    iget-boolean v3, v0, Ll/۬ۖۧ;->֡:Z

    if-nez v3, :cond_34

    .line 717
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput-wide v3, v0, Ll/۬ۖۧ;->ۧ֫:J

    .line 718
    iget-object v3, v0, Ll/۬ۖۧ;->ᩴ:Ll/᩸᩷ۧ;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ll/ۢۢۧ;

    invoke-interface {v3, v2}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    const/4 v2, 0x1

    .line 719
    iput-boolean v2, v0, Ll/۬ۖۧ;->֡:Z

    goto/16 :goto_1c

    :cond_34
    const/4 v2, 0x1

    and-int/lit16 v3, v12, 0x100

    if-eqz v3, :cond_40

    .line 720
    iget-boolean v3, v0, Ll/۬ۖۧ;->ۚ:Z

    if-nez v3, :cond_40

    .line 722
    invoke-virtual {v6}, Ll/ۢ᩷ۧ;->ۧ()I

    move-result v3

    if-le v3, v2, :cond_40

    .line 723
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    iput-wide v2, v0, Ll/۬ۖۧ;->֫֫:J

    goto/16 :goto_1c

    :cond_35
    const v2, 0x656d7367

    if-ne v7, v2, :cond_40

    .line 890
    iget-object v2, v0, Ll/۬ۖۧ;->ܺ:[Ll/᩵ۢۧ;

    array-length v2, v2

    if-nez v2, :cond_36

    goto/16 :goto_1c

    :cond_36
    const/16 v2, 0x8

    .line 893
    invoke-virtual {v5, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 894
    invoke-virtual {v5}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    .line 895
    invoke-static {v2}, Ll/᩹ۖۧ;->֫(I)I

    move-result v2

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_38

    const/4 v3, 0x1

    if-eq v2, v3, :cond_37

    const-string v3, "Skipping unsupported emsg version: "

    .line 0
    invoke-static {v2, v3}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    goto/16 :goto_1c

    .line 918
    :cond_37
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    .line 920
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v8

    .line 1955
    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v10, 0xf4240

    move-wide v12, v2

    move-object v14, v15

    invoke-static/range {v8 .. v14}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v18

    .line 922
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v8

    const-wide/16 v10, 0x3e8

    .line 1955
    invoke-static/range {v8 .. v14}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v2

    .line 923
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v8

    .line 924
    invoke-virtual {v5}, Ll/ᩳ֨֫;->᩵()Ljava/lang/String;

    move-result-object v10

    .line 155
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    invoke-virtual {v5}, Ll/ᩳ֨֫;->᩵()Ljava/lang/String;

    move-result-object v11

    .line 155
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide/from16 v21, v2

    move-wide v12, v6

    move-wide/from16 v23, v8

    move-object/from16 v20, v11

    move-wide/from16 v14, v18

    move-object/from16 v19, v10

    goto :goto_19

    .line 905
    :cond_38
    invoke-virtual {v5}, Ll/ᩳ֨֫;->᩵()Ljava/lang/String;

    move-result-object v10

    .line 155
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    invoke-virtual {v5}, Ll/ᩳ֨֫;->᩵()Ljava/lang/String;

    move-result-object v11

    .line 155
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 907
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    .line 909
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v18

    .line 1955
    sget-object v8, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v20, 0xf4240

    move-wide/from16 v22, v2

    move-object/from16 v24, v8

    invoke-static/range {v18 .. v24}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v12

    .line 910
    iget-wide v14, v0, Ll/۬ۖۧ;->ۧ֫:J

    cmp-long v9, v14, v6

    if-eqz v9, :cond_39

    add-long/2addr v14, v12

    goto :goto_18

    :cond_39
    move-wide v14, v6

    .line 914
    :goto_18
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v18

    const-wide/16 v20, 0x3e8

    move-wide/from16 v22, v2

    move-object/from16 v24, v8

    .line 1955
    invoke-static/range {v18 .. v24}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v2

    .line 915
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v8

    move-wide/from16 v21, v2

    move-wide/from16 v23, v8

    move-object/from16 v19, v10

    move-object/from16 v20, v11

    .line 932
    :goto_19
    invoke-virtual {v5}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    new-array v2, v2, [B

    .line 933
    invoke-virtual {v5}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    const/4 v8, 0x0

    invoke-virtual {v5, v8, v3, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 934
    new-instance v3, Ll/᩶ۡۧ;

    move-object/from16 v18, v3

    move-object/from16 v25, v2

    invoke-direct/range {v18 .. v25}, Ll/᩶ۡۧ;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 935
    new-instance v2, Ll/ᩳ֨֫;

    iget-object v5, v0, Ll/۬ۖۧ;->ۘ:Ll/ۘۗۡ;

    .line 936
    invoke-virtual {v5, v3}, Ll/ۘۗۡ;->֫(Ll/᩶ۡۧ;)[B

    move-result-object v3

    invoke-direct {v2, v3}, Ll/ᩳ֨֫;-><init>([B)V

    .line 937
    invoke-virtual {v2}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    .line 940
    iget-object v5, v0, Ll/۬ۖۧ;->ܺ:[Ll/᩵ۢۧ;

    array-length v8, v5

    const/4 v9, 0x0

    :goto_1a
    if-ge v9, v8, :cond_3a

    aget-object v10, v5, v9

    const/4 v11, 0x0

    .line 941
    invoke-virtual {v2, v11}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 942
    invoke-interface {v10, v3, v2}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1a

    :cond_3a
    cmp-long v2, v14, v6

    if-nez v2, :cond_3b

    .line 949
    new-instance v2, Ll/ۙۖۧ;

    const/4 v4, 0x1

    invoke-direct {v2, v12, v13, v3, v4}, Ll/ۙۖۧ;-><init>(JIZ)V

    move-object/from16 v5, v17

    invoke-virtual {v5, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 952
    iget v2, v0, Ll/۬ۖۧ;->ۙ:I

    add-int/2addr v2, v3

    iput v2, v0, Ll/۬ۖۧ;->ۙ:I

    goto :goto_1c

    :cond_3b
    move-object/from16 v5, v17

    .line 953
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3c

    .line 957
    new-instance v2, Ll/ۙۖۧ;

    const/4 v4, 0x0

    invoke-direct {v2, v14, v15, v3, v4}, Ll/ۙۖۧ;-><init>(JIZ)V

    invoke-virtual {v5, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 959
    iget v2, v0, Ll/۬ۖۧ;->ۙ:I

    add-int/2addr v2, v3

    iput v2, v0, Ll/۬ۖۧ;->ۙ:I

    goto :goto_1c

    :cond_3c
    const/4 v2, 0x0

    if-eqz v4, :cond_3d

    .line 960
    invoke-virtual {v4}, Ll/ۢ֨֫;->ᩳ()Z

    move-result v6

    if-nez v6, :cond_3d

    .line 964
    new-instance v4, Ll/ۙۖۧ;

    invoke-direct {v4, v14, v15, v3, v2}, Ll/ۙۖۧ;-><init>(JIZ)V

    invoke-virtual {v5, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 966
    iget v2, v0, Ll/۬ۖۧ;->ۙ:I

    add-int/2addr v2, v3

    iput v2, v0, Ll/۬ۖۧ;->ۙ:I

    goto :goto_1c

    :cond_3d
    if-eqz v4, :cond_3e

    .line 970
    invoke-virtual {v4, v14, v15}, Ll/ۢ֨֫;->֫(J)J

    move-result-wide v14

    .line 972
    :cond_3e
    iget-object v2, v0, Ll/۬ۖۧ;->ܺ:[Ll/᩵ۢۧ;

    array-length v4, v2

    const/4 v5, 0x0

    :goto_1b
    if-ge v5, v4, :cond_40

    aget-object v18, v2, v5

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v21, 0x1

    move-wide/from16 v19, v14

    move/from16 v22, v3

    .line 973
    invoke-interface/range {v18 .. v24}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1b

    .line 698
    :cond_3f
    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 700
    :cond_40
    :goto_1c
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ll/۬ۖۧ;->֫(J)V

    goto/16 :goto_0

    .line 568
    :cond_41
    iget v2, v0, Ll/۬ۖۧ;->ܽ:I

    const-wide/16 v8, -0x1

    iget-object v10, v0, Ll/۬ۖۧ;->ۧ:Ll/ᩳ֨֫;

    if-nez v2, :cond_44

    .line 570
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    const/16 v11, 0x8

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-interface {v1, v12, v13, v11, v2}, Ll/۠᩷ۧ;->֫(ZII[B)Z

    move-result v2

    if-nez v2, :cond_43

    .line 536
    iget-wide v1, v0, Ll/۬ۖۧ;->֫֫:J

    cmp-long v3, v1, v8

    if-eqz v3, :cond_42

    move-object/from16 v11, p2

    .line 537
    iput-wide v1, v11, Ll/᩻ۢۧ;->֫:J

    .line 538
    iput-wide v8, v0, Ll/۬ۖۧ;->֫֫:J

    .line 539
    iget-object v1, v0, Ll/۬ۖۧ;->ᩴ:Ll/᩸᩷ۧ;

    invoke-virtual {v6}, Ll/ۢ᩷ۧ;->֫()Ll/᩷᩷ۧ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 540
    iput-boolean v12, v0, Ll/۬ۖۧ;->ۚ:Z

    return v12

    .line 543
    :cond_42
    invoke-virtual {v4}, Ll/᩻۠֫;->ۧ()V

    const/4 v1, -0x1

    return v1

    :cond_43
    move-object/from16 v11, p2

    const/16 v2, 0x8

    .line 573
    iput v2, v0, Ll/۬ۖۧ;->ܽ:I

    const/4 v2, 0x0

    .line 574
    invoke-virtual {v10, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 575
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v12

    iput-wide v12, v0, Ll/۬ۖۧ;->ᩳ:J

    .line 576
    invoke-virtual {v10}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    iput v2, v0, Ll/۬ۖۧ;->ܿ:I

    goto :goto_1d

    :cond_44
    move-object/from16 v11, p2

    .line 579
    :goto_1d
    iget-wide v12, v0, Ll/۬ۖۧ;->ᩳ:J

    const-wide/16 v14, 0x1

    cmp-long v2, v12, v14

    if-nez v2, :cond_45

    .line 582
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    const/16 v4, 0x8

    invoke-interface {v1, v2, v4, v4}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 583
    iget v2, v0, Ll/۬ۖۧ;->ܽ:I

    add-int/2addr v2, v4

    iput v2, v0, Ll/۬ۖۧ;->ܽ:I

    .line 584
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v12

    iput-wide v12, v0, Ll/۬ۖۧ;->ᩳ:J

    goto :goto_1e

    :cond_45
    const-wide/16 v14, 0x0

    cmp-long v2, v12, v14

    if-nez v2, :cond_47

    .line 588
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v12

    cmp-long v2, v12, v8

    if-nez v2, :cond_46

    .line 589
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    .line 590
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨֨֫;

    iget-wide v12, v2, Ll/֨֨֫;->ܽ:J

    :cond_46
    cmp-long v2, v12, v8

    if-eqz v2, :cond_47

    .line 593
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v14

    sub-long/2addr v12, v14

    iget v2, v0, Ll/۬ۖۧ;->ܽ:I

    int-to-long v14, v2

    add-long/2addr v12, v14

    iput-wide v12, v0, Ll/۬ۖۧ;->ᩳ:J

    .line 597
    :cond_47
    :goto_1e
    iget-wide v12, v0, Ll/۬ۖۧ;->ᩳ:J

    iget v2, v0, Ll/۬ۖۧ;->ܽ:I

    int-to-long v14, v2

    cmp-long v2, v12, v14

    if-ltz v2, :cond_57

    move-object v4, v3

    .line 602
    iget-wide v2, v0, Ll/۬ۖۧ;->֫֫:J

    cmp-long v16, v2, v8

    if-eqz v16, :cond_49

    .line 603
    iget v2, v0, Ll/۬ۖۧ;->ܿ:I

    const v3, 0x73696478

    if-ne v2, v3, :cond_48

    long-to-int v2, v12

    .line 604
    invoke-virtual {v5, v2}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 605
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    const/16 v4, 0x8

    const/4 v7, 0x0

    invoke-static {v2, v7, v3, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 607
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    iget-wide v7, v0, Ll/۬ۖۧ;->ᩳ:J

    iget v3, v0, Ll/۬ۖۧ;->ܽ:I

    int-to-long v9, v3

    sub-long/2addr v7, v9

    long-to-int v3, v7

    .line 606
    invoke-interface {v1, v2, v4, v3}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 610
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v2

    invoke-static {v2, v3, v5}, Ll/۬ۖۧ;->֫(JLl/ᩳ֨֫;)Landroid/util/Pair;

    move-result-object v2

    .line 611
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ll/᩷᩷ۧ;

    invoke-virtual {v6, v2}, Ll/ۢ᩷ۧ;->֫(Ll/᩷᩷ۧ;)V

    goto :goto_1f

    :cond_48
    sub-long/2addr v12, v14

    long-to-int v2, v12

    const/4 v3, 0x1

    .line 613
    invoke-interface {v1, v2, v3}, Ll/۠᩷ۧ;->֫(IZ)Z

    .line 615
    :goto_1f
    invoke-direct/range {p0 .. p0}, Ll/۬ۖۧ;->ۧ()V

    goto/16 :goto_0

    .line 619
    :cond_49
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v2

    iget v6, v0, Ll/۬ۖۧ;->ܽ:I

    int-to-long v8, v6

    sub-long/2addr v2, v8

    .line 620
    iget v6, v0, Ll/۬ۖۧ;->ܿ:I

    const v8, 0x6d646174

    const v9, 0x6d6f6f66

    if-eq v6, v9, :cond_4a

    if-ne v6, v8, :cond_4b

    .line 621
    :cond_4a
    iget-boolean v6, v0, Ll/۬ۖۧ;->֡:Z

    if-nez v6, :cond_4b

    .line 623
    iget-object v6, v0, Ll/۬ۖۧ;->ᩴ:Ll/᩸᩷ۧ;

    new-instance v12, Ll/᩷ۢۧ;

    iget-wide v13, v0, Ll/۬ۖۧ;->ۡ:J

    invoke-direct {v12, v13, v14, v2, v3}, Ll/᩷ۢۧ;-><init>(JJ)V

    invoke-interface {v6, v12}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    const/4 v6, 0x1

    .line 624
    iput-boolean v6, v0, Ll/۬ۖۧ;->֡:Z

    .line 628
    :cond_4b
    iget v6, v0, Ll/۬ۖۧ;->ܿ:I

    if-ne v6, v9, :cond_4c

    .line 630
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v6

    const/4 v12, 0x0

    :goto_20
    if-ge v12, v6, :cond_4c

    .line 632
    invoke-virtual {v7, v12}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۗۖۧ;

    iget-object v13, v13, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    .line 633
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    iput-wide v2, v13, Ll/ۜۘۧ;->֫:J

    .line 635
    iput-wide v2, v13, Ll/ۜۘۧ;->ۧ:J

    add-int/lit8 v12, v12, 0x1

    goto :goto_20

    .line 639
    :cond_4c
    iget v6, v0, Ll/۬ۖۧ;->ܿ:I

    if-ne v6, v8, :cond_4d

    const/4 v4, 0x0

    .line 640
    iput-object v4, v0, Ll/۬ۖۧ;->ۢ:Ll/ۗۖۧ;

    .line 641
    iget-wide v4, v0, Ll/۬ۖۧ;->ᩳ:J

    add-long/2addr v2, v4

    iput-wide v2, v0, Ll/۬ۖۧ;->ۖ:J

    const/4 v2, 0x2

    .line 642
    iput v2, v0, Ll/۬ۖۧ;->᩶:I

    goto/16 :goto_0

    :cond_4d
    const v2, 0x6d6f6f76

    const v3, 0x6d657461

    if-eq v6, v2, :cond_54

    const v2, 0x7472616b

    if-eq v6, v2, :cond_54

    const v2, 0x6d646961

    if-eq v6, v2, :cond_54

    const v2, 0x6d696e66

    if-eq v6, v2, :cond_54

    const v2, 0x7374626c

    if-eq v6, v2, :cond_54

    if-eq v6, v9, :cond_54

    const v2, 0x74726166

    if-eq v6, v2, :cond_54

    const v2, 0x6d766578

    if-eq v6, v2, :cond_54

    const v2, 0x65647473

    if-eq v6, v2, :cond_54

    if-ne v6, v3, :cond_4e

    goto/16 :goto_22

    :cond_4e
    const v2, 0x68646c72    # 4.3148E24f

    const-wide/32 v3, 0x7fffffff

    if-eq v6, v2, :cond_51

    const v2, 0x6d646864

    if-eq v6, v2, :cond_51

    const v2, 0x6d766864

    if-eq v6, v2, :cond_51

    const v2, 0x73696478

    if-eq v6, v2, :cond_51

    const v2, 0x73747364

    if-eq v6, v2, :cond_51

    const v2, 0x73747473

    if-eq v6, v2, :cond_51

    const v2, 0x63747473

    if-eq v6, v2, :cond_51

    const v2, 0x73747363

    if-eq v6, v2, :cond_51

    const v2, 0x7374737a

    if-eq v6, v2, :cond_51

    const v2, 0x73747a32

    if-eq v6, v2, :cond_51

    const v2, 0x7374636f

    if-eq v6, v2, :cond_51

    const v2, 0x636f3634

    if-eq v6, v2, :cond_51

    const v2, 0x73747373

    if-eq v6, v2, :cond_51

    const v2, 0x74666474

    if-eq v6, v2, :cond_51

    const v2, 0x74666864

    if-eq v6, v2, :cond_51

    const v2, 0x746b6864

    if-eq v6, v2, :cond_51

    const v2, 0x74726578

    if-eq v6, v2, :cond_51

    const v2, 0x7472756e

    if-eq v6, v2, :cond_51

    const v2, 0x70737368    # 3.013775E29f

    if-eq v6, v2, :cond_51

    const v2, 0x7361697a

    if-eq v6, v2, :cond_51

    const v2, 0x7361696f

    if-eq v6, v2, :cond_51

    const v2, 0x73656e63

    if-eq v6, v2, :cond_51

    const v2, 0x75756964

    if-eq v6, v2, :cond_51

    const v2, 0x73626770

    if-eq v6, v2, :cond_51

    const v2, 0x73677064

    if-eq v6, v2, :cond_51

    const v2, 0x656c7374

    if-eq v6, v2, :cond_51

    const v2, 0x6d656864

    if-eq v6, v2, :cond_51

    const v2, 0x656d7367

    if-eq v6, v2, :cond_51

    const v2, 0x75647461

    if-eq v6, v2, :cond_51

    const v2, 0x6b657973

    if-eq v6, v2, :cond_51

    const v2, 0x696c7374

    if-ne v6, v2, :cond_4f

    goto :goto_21

    .line 672
    :cond_4f
    iget-wide v5, v0, Ll/۬ۖۧ;->ᩳ:J

    cmp-long v2, v5, v3

    if-gtz v2, :cond_50

    const/4 v2, 0x0

    .line 676
    iput-object v2, v0, Ll/۬ۖۧ;->֫:Ll/ᩳ֨֫;

    const/4 v2, 0x1

    .line 677
    iput v2, v0, Ll/۬ۖۧ;->᩶:I

    goto/16 :goto_0

    :cond_50
    const-string v1, "Skipping atom with length > 2147483647 (unsupported)."

    .line 673
    invoke-static {v1}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 659
    :cond_51
    :goto_21
    iget v2, v0, Ll/۬ۖۧ;->ܽ:I

    const/16 v5, 0x8

    if-ne v2, v5, :cond_53

    .line 663
    iget-wide v6, v0, Ll/۬ۖۧ;->ᩳ:J

    cmp-long v2, v6, v3

    if-gtz v2, :cond_52

    .line 667
    new-instance v2, Ll/ᩳ֨֫;

    iget-wide v3, v0, Ll/۬ۖۧ;->ᩳ:J

    long-to-int v4, v3

    invoke-direct {v2, v4}, Ll/ᩳ֨֫;-><init>(I)V

    .line 668
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    const/4 v6, 0x0

    invoke-static {v3, v6, v4, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 669
    iput-object v2, v0, Ll/۬ۖۧ;->֫:Ll/ᩳ֨֫;

    const/4 v2, 0x1

    .line 670
    iput v2, v0, Ll/۬ۖۧ;->᩶:I

    goto/16 :goto_0

    :cond_52
    const-string v1, "Leaf atom with length > 2147483647 (unsupported)."

    .line 664
    invoke-static {v1}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    :cond_53
    const-string v1, "Leaf atom defines extended atom size (unsupported)."

    .line 660
    invoke-static {v1}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 647
    :cond_54
    :goto_22
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v6

    iget-wide v8, v0, Ll/۬ۖۧ;->ᩳ:J

    add-long/2addr v6, v8

    const-wide/16 v12, 0x8

    sub-long/2addr v6, v12

    .line 648
    iget v2, v0, Ll/۬ۖۧ;->ܽ:I

    int-to-long v12, v2

    cmp-long v2, v8, v12

    if-eqz v2, :cond_55

    iget v2, v0, Ll/۬ۖۧ;->ܿ:I

    if-ne v2, v3, :cond_55

    const/16 v2, 0x8

    .line 684
    invoke-virtual {v5, v2}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 685
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    const/4 v8, 0x0

    invoke-interface {v1, v8, v2, v3}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 686
    invoke-static {v5}, Ll/᩹ۖۧ;->֫(Ll/ᩳ֨֫;)V

    .line 687
    invoke-virtual {v5}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v2

    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    .line 688
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 651
    :cond_55
    new-instance v2, Ll/֨֨֫;

    iget v3, v0, Ll/۬ۖۧ;->ܿ:I

    invoke-direct {v2, v3, v6, v7}, Ll/֨֨֫;-><init>(IJ)V

    invoke-virtual {v4, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 652
    iget-wide v2, v0, Ll/۬ۖۧ;->ᩳ:J

    iget v4, v0, Ll/۬ۖۧ;->ܽ:I

    int-to-long v4, v4

    cmp-long v8, v2, v4

    if-nez v8, :cond_56

    .line 653
    invoke-direct {v0, v6, v7}, Ll/۬ۖۧ;->֫(J)V

    goto/16 :goto_0

    .line 656
    :cond_56
    invoke-direct/range {p0 .. p0}, Ll/۬ۖۧ;->ۧ()V

    goto/16 :goto_0

    :cond_57
    const-string v1, "Atom size less than header length (unsupported)."

    .line 598
    invoke-static {v1}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 3

    .line 513
    iget-object p1, p0, Ll/۬ۖۧ;->ܿ֫:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 515
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗۖۧ;

    invoke-virtual {v2}, Ll/ۗۖۧ;->᩻()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 517
    :cond_0
    iget-object p1, p0, Ll/۬ۖۧ;->ۗ:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 518
    iput v0, p0, Ll/۬ۖۧ;->ۙ:I

    .line 519
    iget-object p1, p0, Ll/۬ۖۧ;->ۤ:Ll/᩻۠֫;

    invoke-virtual {p1}, Ll/᩻۠֫;->֫()V

    .line 520
    iput-wide p3, p0, Ll/۬ۖۧ;->۬:J

    .line 521
    iget-object p1, p0, Ll/۬ۖۧ;->᩷:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 522
    invoke-direct {p0}, Ll/۬ۖۧ;->ۧ()V

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 6

    .line 481
    iget v0, p0, Ll/۬ۖۧ;->᩵:I

    and-int/lit8 v1, v0, 0x20

    if-nez v1, :cond_0

    .line 482
    new-instance v1, Ll/ۡᩴۧ;

    iget-object v2, p0, Ll/۬ۖۧ;->ܽ֫:Ll/ۜᩴۧ;

    invoke-direct {v1, p1, v2}, Ll/ۡᩴۧ;-><init>(Ll/᩸᩷ۧ;Ll/ۜᩴۧ;)V

    move-object p1, v1

    .line 483
    :cond_0
    iput-object p1, p0, Ll/۬ۖۧ;->ᩴ:Ll/᩸᩷ۧ;

    .line 484
    invoke-direct {p0}, Ll/۬ۖۧ;->ۧ()V

    const/4 p1, 0x2

    new-array p1, p1, [Ll/᩵ۢۧ;

    .line 866
    iput-object p1, p0, Ll/۬ۖۧ;->ܺ:[Ll/᩵ۢۧ;

    and-int/lit8 v0, v0, 0x4

    const/16 v1, 0x64

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 872
    iget-object v0, p0, Ll/۬ۖۧ;->ᩴ:Ll/᩸᩷ۧ;

    const/4 v3, 0x5

    .line 873
    invoke-interface {v0, v1, v3}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    aput-object v0, p1, v2

    const/4 p1, 0x1

    const/16 v1, 0x65

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 875
    :goto_0
    iget-object v0, p0, Ll/۬ۖۧ;->ܺ:[Ll/᩵ۢۧ;

    invoke-static {p1, v0}, Ll/ۘ֨֫;->֫(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/᩵ۢۧ;

    iput-object p1, p0, Ll/۬ۖۧ;->ܺ:[Ll/᩵ۢۧ;

    .line 876
    array-length v0, p1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_2

    aget-object v4, p1, v3

    .line 877
    sget-object v5, Ll/۬ۖۧ;->ܳ֫:Ll/۠ᩴ֫;

    invoke-interface {v4, v5}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 880
    :cond_2
    iget-object p1, p0, Ll/۬ۖۧ;->ۜ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ll/᩵ۢۧ;

    iput-object v0, p0, Ll/۬ۖۧ;->ܳ:[Ll/᩵ۢۧ;

    .line 881
    :goto_2
    iget-object v0, p0, Ll/۬ۖۧ;->ܳ:[Ll/᩵ۢۧ;

    array-length v0, v0

    if-ge v2, v0, :cond_3

    .line 882
    iget-object v0, p0, Ll/۬ۖۧ;->ᩴ:Ll/᩸᩷ۧ;

    add-int/lit8 v3, v1, 0x1

    const/4 v4, 0x3

    invoke-interface {v0, v1, v4}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    .line 883
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ᩴ֫;

    invoke-interface {v0, v1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 884
    iget-object v1, p0, Ll/۬ۖۧ;->ܳ:[Ll/᩵ۢۧ;

    aput-object v0, v1, v2

    add-int/lit8 v2, v2, 0x1

    move v1, v3

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 1

    .line 468
    check-cast p1, Ll/ܺ᩷ۧ;

    invoke-static {p1}, Ll/ܿۘۧ;->֫(Ll/ܺ᩷ۧ;)Ll/ۘۢۧ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 469
    invoke-static {p1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ll/۬ۖۧ;->۠:Ll/ܳ۬ܺ;

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 475
    iget-object v0, p0, Ll/۬ۖۧ;->۠:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
