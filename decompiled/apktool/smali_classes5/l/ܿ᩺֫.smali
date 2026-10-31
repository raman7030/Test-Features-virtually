.class public final Ll/ܿ᩺֫;
.super Ljava/lang/Object;
.source "07NF"

# interfaces
.implements Ll/ᩳܳۧ;
.implements Ll/ۜܳۧ;
.implements Ll/֡ܽۧ;
.implements Ll/᩸᩷ۧ;
.implements Ll/ۖܽۧ;


# static fields
.field public static final ᩳۧ:Ljava/util/Set;


# instance fields
.field public ֡֫:I

.field public ֨֫:I

.field public final ֫֫:Ll/ۧܳۧ;

.field public ֫ۧ:Z

.field public final ۖ֫:Ljava/util/Map;

.field public final ۗ:Ll/ܶۛ֫;

.field public ۗ֫:[I

.field public ۘ֫:J

.field public ۙ:Ll/۠ᩴ֫;

.field public ۙ֫:Ljava/util/HashSet;

.field public ۚ֫:I

.field public ۛ:I

.field public ۛ֫:Z

.field public final ۜ֫:I

.field public ۟:J

.field public final ۟֫:I

.field public final ۠֫:Ljava/util/List;

.field public final ۡ֫:Ll/ܰۨ֫;

.field public final ۢ֫:Ll/֡ۨ֫;

.field public ۤ:Ll/᩵ۢۧ;

.field public ۤ֫:[Z

.field public final ۧ֫:Ll/ۡܳۧ;

.field public final ۧۧ:Ljava/lang/String;

.field public final ۨ:Landroid/os/Handler;

.field public ۨ֫:Ll/᩶ۨ֫;

.field public final ۫:Ll/ۙۛ֫;

.field public ۫֫:Z

.field public ۬:Ll/᩵ᩴ֫;

.field public ۬֫:[Ll/ᩳ᩺֫;

.field public final ܰ:Ljava/util/ArrayList;

.field public ܰ֫:Ll/ۛܽۧ;

.field public final ܳ֫:Ljava/util/ArrayList;

.field public ܶ֫:Z

.field public ܺ֫:Ljava/util/Set;

.field public ܽ֫:Ll/۟ܽۧ;

.field public ܽۧ:Ll/۠ᩴ֫;

.field public final ܿ֫:Ll/᩺ۨ֫;

.field public ᩳ֫:Z

.field public ᩴ֫:Z

.field public ᩵֫:Z

.field public final ᩶:Ll/ܶۨ֫;

.field public ᩶֫:[Z

.field public final ᩷֫:Ll/۠ᩴ֫;

.field public final ᩸:Ll/᩸ܿۧ;

.field public ᩸֫:J

.field public final ᩹:Ll/ۧ᩺֫;

.field public ᩹֫:Landroid/util/SparseIntArray;

.field public ᩺:Z

.field public ᩺֫:[I

.field public final ᩻֫:Ll/۠ۧۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 131
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    .line 134
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Integer;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    aput-object v4, v6, v1

    aput-object v5, v6, v3

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 132
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ܿ᩺֫;->ᩳۧ:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILl/ۧ᩺֫;Ll/ܶۨ֫;Ljava/util/Map;Ll/᩸ܿۧ;JLl/۠ᩴ֫;Ll/ۙۛ֫;Ll/ܶۛ֫;Ll/ۧܳۧ;Ll/۠ۧۧ;I)V
    .locals 0

    .line 230
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 231
    iput-object p1, p0, Ll/ܿ᩺֫;->ۧۧ:Ljava/lang/String;

    .line 232
    iput p2, p0, Ll/ܿ᩺֫;->۟֫:I

    .line 233
    iput-object p3, p0, Ll/ܿ᩺֫;->᩹:Ll/ۧ᩺֫;

    .line 234
    iput-object p4, p0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    .line 235
    iput-object p5, p0, Ll/ܿ᩺֫;->ۖ֫:Ljava/util/Map;

    .line 236
    iput-object p6, p0, Ll/ܿ᩺֫;->᩸:Ll/᩸ܿۧ;

    .line 237
    iput-object p9, p0, Ll/ܿ᩺֫;->᩷֫:Ll/۠ᩴ֫;

    .line 238
    iput-object p10, p0, Ll/ܿ᩺֫;->۫:Ll/ۙۛ֫;

    .line 239
    iput-object p11, p0, Ll/ܿ᩺֫;->ۗ:Ll/ܶۛ֫;

    .line 240
    iput-object p12, p0, Ll/ܿ᩺֫;->֫֫:Ll/ۧܳۧ;

    .line 241
    iput-object p13, p0, Ll/ܿ᩺֫;->᩻֫:Ll/۠ۧۧ;

    .line 242
    iput p14, p0, Ll/ܿ᩺֫;->ۜ֫:I

    .line 243
    new-instance p1, Ll/ۡܳۧ;

    const-string p2, "Loader:HlsSampleStreamWrapper"

    invoke-direct {p1, p2}, Ll/ۡܳۧ;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ll/ܿ᩺֫;->ۧ֫:Ll/ۡܳۧ;

    .line 244
    new-instance p1, Ll/֡ۨ֫;

    .line 75
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    .line 90
    iput-object p2, p1, Ll/֡ۨ֫;->֫:Ll/۟ܽۧ;

    const/4 p3, 0x0

    .line 91
    iput-boolean p3, p1, Ll/֡ۨ֫;->ۧ:Z

    .line 92
    iput-object p2, p1, Ll/֡ۨ֫;->ܽ:Landroid/net/Uri;

    .line 244
    iput-object p1, p0, Ll/ܿ᩺֫;->ۢ֫:Ll/֡ۨ֫;

    new-array p1, p3, [I

    .line 245
    iput-object p1, p0, Ll/ܿ᩺֫;->ۗ֫:[I

    .line 246
    new-instance p1, Ljava/util/HashSet;

    sget-object p4, Ll/ܿ᩺֫;->ᩳۧ:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->size()I

    move-result p5

    invoke-direct {p1, p5}, Ljava/util/HashSet;-><init>(I)V

    iput-object p1, p0, Ll/ܿ᩺֫;->ۙ֫:Ljava/util/HashSet;

    .line 247
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-interface {p4}, Ljava/util/Set;->size()I

    move-result p4

    invoke-direct {p1, p4}, Landroid/util/SparseIntArray;-><init>(I)V

    iput-object p1, p0, Ll/ܿ᩺֫;->᩹֫:Landroid/util/SparseIntArray;

    new-array p1, p3, [Ll/ᩳ᩺֫;

    .line 248
    iput-object p1, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    new-array p1, p3, [Z

    .line 249
    iput-object p1, p0, Ll/ܿ᩺֫;->᩶֫:[Z

    new-array p1, p3, [Z

    .line 250
    iput-object p1, p0, Ll/ܿ᩺֫;->ۤ֫:[Z

    .line 251
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    .line 252
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩺֫;->۠֫:Ljava/util/List;

    .line 253
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܿ᩺֫;->ܰ:Ljava/util/ArrayList;

    .line 256
    new-instance p1, Ll/᩺ۨ֫;

    invoke-direct {p1, p0}, Ll/᩺ۨ֫;-><init>(Ll/ܿ᩺֫;)V

    .line 257
    iput-object p1, p0, Ll/ܿ᩺֫;->ܿ֫:Ll/᩺ۨ֫;

    .line 259
    new-instance p1, Ll/ܰۨ֫;

    invoke-direct {p1, p0}, Ll/ܰۨ֫;-><init>(Ll/ܿ᩺֫;)V

    .line 260
    iput-object p1, p0, Ll/ܿ᩺֫;->ۡ֫:Ll/ܰۨ֫;

    .line 715
    invoke-static {p2}, Ll/ۘ֨֫;->֫(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    .line 261
    iput-object p1, p0, Ll/ܿ᩺֫;->ۨ:Landroid/os/Handler;

    .line 262
    iput-wide p7, p0, Ll/ܿ᩺֫;->۟:J

    .line 263
    iput-wide p7, p0, Ll/ܿ᩺֫;->ۘ֫:J

    return-void
.end method

.method private ֡()Ll/᩶ۨ֫;
    .locals 2

    .line 1547
    iget-object v0, p0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    const/4 v1, 0x1

    .line 0
    invoke-static {v0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 1547
    check-cast v0, Ll/᩶ۨ֫;

    return-object v0
.end method

.method private ֨()V
    .locals 15

    .line 1380
    iget-boolean v0, p0, Ll/ܿ᩺֫;->ܶ֫:Z

    if-nez v0, :cond_1a

    iget-object v0, p0, Ll/ܿ᩺֫;->᩺֫:[I

    if-nez v0, :cond_1a

    iget-boolean v0, p0, Ll/ܿ᩺֫;->۫֫:Z

    if-nez v0, :cond_0

    goto/16 :goto_12

    .line 1383
    :cond_0
    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    .line 1384
    invoke-virtual {v4}, Ll/ۘܽۧ;->᩻()Ll/۠ᩴ֫;

    move-result-object v4

    if-nez v4, :cond_1

    goto/16 :goto_12

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1388
    :cond_2
    iget-object v0, p0, Ll/ܿ᩺֫;->ܰ֫:Ll/ۛܽۧ;

    const/4 v1, 0x3

    const/4 v3, -0x1

    if-eqz v0, :cond_a

    .line 1403
    iget v0, v0, Ll/ۛܽۧ;->ۧ:I

    .line 1404
    new-array v4, v0, [I

    iput-object v4, p0, Ll/ܿ᩺֫;->᩺֫:[I

    .line 1405
    invoke-static {v4, v3}, Ljava/util/Arrays;->fill([II)V

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_9

    const/4 v4, 0x0

    .line 1407
    :goto_2
    iget-object v5, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v6, v5

    if-ge v4, v6, :cond_8

    .line 1408
    aget-object v5, v5, v4

    .line 1409
    invoke-virtual {v5}, Ll/ۘܽۧ;->᩻()Ll/۠ᩴ֫;

    move-result-object v5

    invoke-static {v5}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 1410
    iget-object v6, p0, Ll/ܿ᩺֫;->ܰ֫:Ll/ۛܽۧ;

    invoke-virtual {v6, v3}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v6

    invoke-virtual {v6, v2}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v6

    .line 1701
    iget-object v7, v5, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 1702
    iget-object v8, v6, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 1703
    invoke-static {v7}, Ll/ۢ᩵֫;->ܿ(Ljava/lang/String;)I

    move-result v9

    if-eq v9, v1, :cond_3

    .line 1705
    invoke-static {v8}, Ll/ۢ᩵֫;->ܿ(Ljava/lang/String;)I

    move-result v5

    if-ne v9, v5, :cond_7

    goto :goto_3

    .line 1706
    :cond_3
    invoke-static {v7, v8}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_4

    :cond_4
    const-string v8, "application/cea-608"

    .line 1709
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "application/cea-708"

    .line 1710
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 1711
    :cond_5
    iget v5, v5, Ll/۠ᩴ֫;->֫:I

    iget v6, v6, Ll/۠ᩴ֫;->֫:I

    if-ne v5, v6, :cond_7

    .line 1411
    :cond_6
    :goto_3
    iget-object v5, p0, Ll/ܿ᩺֫;->᩺֫:[I

    aput v4, v5, v3

    goto :goto_5

    :cond_7
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_8
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1416
    :cond_9
    iget-object v0, p0, Ll/ܿ᩺֫;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۨ֫;

    .line 1417
    invoke-virtual {v1}, Ll/ۨۨ֫;->ۧ()V

    goto :goto_6

    .line 1457
    :cond_a
    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, -0x2

    const/4 v4, -0x1

    :goto_7
    const/4 v5, 0x1

    const/4 v6, 0x2

    if-ge v1, v0, :cond_10

    .line 1460
    iget-object v6, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object v6, v6, v1

    .line 1461
    invoke-virtual {v6}, Ll/ۘܽۧ;->᩻()Ll/۠ᩴ֫;

    move-result-object v6

    invoke-static {v6}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget-object v6, v6, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 1463
    invoke-static {v6}, Ll/ۢ᩵֫;->ۢ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_b

    const/4 v5, 0x2

    goto :goto_8

    .line 1465
    :cond_b
    invoke-static {v6}, Ll/ۢ᩵֫;->᩻(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_8

    .line 1467
    :cond_c
    invoke-static {v6}, Ll/ۢ᩵֫;->᩷(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d

    const/4 v5, 0x3

    goto :goto_8

    :cond_d
    const/4 v5, -0x2

    .line 1472
    :goto_8
    invoke-static {v5}, Ll/ܿ᩺֫;->᩻(I)I

    move-result v6

    invoke-static {v2}, Ll/ܿ᩺֫;->᩻(I)I

    move-result v7

    if-le v6, v7, :cond_e

    move v4, v1

    move v2, v5

    goto :goto_9

    :cond_e
    if-ne v5, v2, :cond_f

    if-eq v4, v3, :cond_f

    const/4 v4, -0x1

    :cond_f
    :goto_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 1483
    :cond_10
    iget-object v1, p0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    invoke-virtual {v1}, Ll/ܶۨ֫;->֫()Ll/۬᩵֫;

    move-result-object v1

    .line 1484
    iget v7, v1, Ll/۬᩵֫;->ᩳ:I

    .line 1487
    iput v3, p0, Ll/ܿ᩺֫;->֨֫:I

    .line 1488
    new-array v3, v0, [I

    iput-object v3, p0, Ll/ܿ᩺֫;->᩺֫:[I

    const/4 v3, 0x0

    :goto_a
    if-ge v3, v0, :cond_11

    .line 1490
    iget-object v8, p0, Ll/ܿ᩺֫;->᩺֫:[I

    aput v3, v8, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    .line 1494
    :cond_11
    new-array v3, v0, [Ll/۬᩵֫;

    const/4 v8, 0x0

    :goto_b
    if-ge v8, v0, :cond_18

    .line 1496
    iget-object v9, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object v9, v9, v8

    invoke-virtual {v9}, Ll/ۘܽۧ;->᩻()Ll/۠ᩴ֫;

    move-result-object v9

    invoke-static {v9}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 1497
    iget-object v10, p0, Ll/ܿ᩺֫;->ۧۧ:Ljava/lang/String;

    iget-object v11, p0, Ll/ܿ᩺֫;->᩷֫:Ll/۠ᩴ֫;

    if-ne v8, v4, :cond_15

    .line 1498
    new-array v12, v7, [Ll/۠ᩴ֫;

    const/4 v13, 0x0

    :goto_c
    if-ge v13, v7, :cond_14

    .line 1500
    invoke-virtual {v1, v13}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v14

    if-ne v2, v5, :cond_12

    if-eqz v11, :cond_12

    .line 1502
    invoke-virtual {v14, v11}, Ll/۠ᩴ֫;->ۧ(Ll/۠ᩴ֫;)Ll/۠ᩴ֫;

    move-result-object v14

    :cond_12
    if-ne v7, v5, :cond_13

    .line 1509
    invoke-virtual {v9, v14}, Ll/۠ᩴ֫;->ۧ(Ll/۠ᩴ֫;)Ll/۠ᩴ֫;

    move-result-object v14

    goto :goto_d

    .line 1510
    :cond_13
    invoke-static {v14, v9, v5}, Ll/ܿ᩺֫;->֫(Ll/۠ᩴ֫;Ll/۠ᩴ֫;Z)Ll/۠ᩴ֫;

    move-result-object v14

    :goto_d
    aput-object v14, v12, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_c

    .line 1512
    :cond_14
    new-instance v9, Ll/۬᩵֫;

    invoke-direct {v9, v10, v12}, Ll/۬᩵֫;-><init>(Ljava/lang/String;[Ll/۠ᩴ֫;)V

    aput-object v9, v3, v8

    .line 1513
    iput v8, p0, Ll/ܿ᩺֫;->֨֫:I

    goto :goto_10

    :cond_15
    if-ne v2, v6, :cond_16

    .line 1518
    iget-object v12, v9, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v12}, Ll/ۢ᩵֫;->᩻(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_16

    goto :goto_e

    :cond_16
    const/4 v11, 0x0

    :goto_e
    const-string v12, ":muxed:"

    .line 0
    invoke-static {v10, v12}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    if-ge v8, v4, :cond_17

    move v12, v8

    goto :goto_f

    :cond_17
    add-int/lit8 v12, v8, -0x1

    .line 1521
    :goto_f
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 1522
    new-instance v12, Ll/۬᩵֫;

    const/4 v13, 0x0

    .line 1525
    invoke-static {v11, v9, v13}, Ll/ܿ᩺֫;->֫(Ll/۠ᩴ֫;Ll/۠ᩴ֫;Z)Ll/۠ᩴ֫;

    move-result-object v9

    new-array v11, v5, [Ll/۠ᩴ֫;

    aput-object v9, v11, v13

    invoke-direct {v12, v10, v11}, Ll/۬᩵֫;-><init>(Ljava/lang/String;[Ll/۠ᩴ֫;)V

    aput-object v12, v3, v8

    :goto_10
    add-int/lit8 v8, v8, 0x1

    goto :goto_b

    .line 1528
    :cond_18
    invoke-direct {p0, v3}, Ll/ܿ᩺֫;->֫([Ll/۬᩵֫;)Ll/ۛܽۧ;

    move-result-object v0

    iput-object v0, p0, Ll/ܿ᩺֫;->ܰ֫:Ll/ۛܽۧ;

    .line 1529
    iget-object v0, p0, Ll/ܿ᩺֫;->ܺ֫:Ljava/util/Set;

    if-nez v0, :cond_19

    const/4 v0, 0x1

    goto :goto_11

    :cond_19
    const/4 v0, 0x0

    :goto_11
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1530
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    iput-object v0, p0, Ll/ܿ᩺֫;->ܺ֫:Ljava/util/Set;

    .line 1588
    iput-boolean v5, p0, Ll/ܿ᩺֫;->᩵֫:Z

    .line 1396
    iget-object v0, p0, Ll/ܿ᩺֫;->᩹:Ll/ۧ᩺֫;

    check-cast v0, Ll/۬ۨ֫;

    invoke-virtual {v0}, Ll/۬ۨ֫;->֫()V

    :cond_1a
    :goto_12
    return-void
.end method

.method private ֫([Ll/۬᩵֫;)Ll/ۛܽۧ;
    .locals 6

    const/4 v0, 0x0

    .line 1534
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 1535
    aget-object v1, p1, v0

    .line 1536
    iget v2, v1, Ll/۬᩵֫;->ᩳ:I

    new-array v2, v2, [Ll/۠ᩴ֫;

    const/4 v3, 0x0

    .line 1537
    :goto_1
    iget v4, v1, Ll/۬᩵֫;->ᩳ:I

    if-ge v3, v4, :cond_0

    .line 1538
    invoke-virtual {v1, v3}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v4

    .line 1539
    iget-object v5, p0, Ll/ܿ᩺֫;->۫:Ll/ۙۛ֫;

    invoke-interface {v5, v4}, Ll/ۙۛ֫;->֫(Ll/۠ᩴ֫;)I

    move-result v5

    invoke-virtual {v4, v5}, Ll/۠ᩴ֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1541
    :cond_0
    new-instance v3, Ll/۬᩵֫;

    iget-object v1, v1, Ll/۬᩵֫;->ܽ:Ljava/lang/String;

    invoke-direct {v3, v1, v2}, Ll/۬᩵֫;-><init>(Ljava/lang/String;[Ll/۠ᩴ֫;)V

    aput-object v3, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1543
    :cond_1
    new-instance v0, Ll/ۛܽۧ;

    invoke-direct {v0, p1}, Ll/ۛܽۧ;-><init>([Ll/۬᩵֫;)V

    return-object v0
.end method

.method public static ֫(Ll/۠ᩴ֫;Ll/۠ᩴ֫;Z)Ll/۠ᩴ֫;
    .locals 7

    if-nez p0, :cond_0

    return-object p1

    .line 1635
    :cond_0
    iget-object v0, p0, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    .line 1639
    iget-object v1, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v1}, Ll/ۢ᩵֫;->ܿ(Ljava/lang/String;)I

    move-result v2

    .line 1642
    invoke-static {v2, v0}, Ll/ۘ֨֫;->֫(ILjava/lang/String;)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 1645
    invoke-static {v2, v0}, Ll/ۘ֨֫;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1646
    invoke-static {v0}, Ll/ۢ᩵֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 1652
    :cond_1
    invoke-static {v0, v1}, Ll/ۢ᩵֫;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1659
    :goto_0
    invoke-virtual {p1}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v3

    iget-object v5, p0, Ll/۠ᩴ֫;->ܶ:Ljava/lang/String;

    .line 1660
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    iget-object v5, p0, Ll/۠ᩴ֫;->᩹:Ljava/lang/String;

    .line 1661
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ᩳ(Ljava/lang/String;)V

    iget-object v5, p0, Ll/۠ᩴ֫;->᩶:Ljava/util/List;

    .line 1662
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ۧ(Ljava/util/List;)V

    iget-object v5, p0, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    .line 1663
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    iget v5, p0, Ll/۠ᩴ֫;->ᩳ֫:I

    .line 1664
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ܶ(I)V

    iget v5, p0, Ll/۠ᩴ֫;->۟:I

    .line 1665
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ۚ(I)V

    const/4 v5, -0x1

    if-eqz p2, :cond_2

    .line 1666
    iget v6, p0, Ll/۠ᩴ֫;->ܽ:I

    goto :goto_1

    :cond_2
    const/4 v6, -0x1

    :goto_1
    invoke-virtual {v3, v6}, Ll/֨ᩴ֫;->ܽ(I)V

    if-eqz p2, :cond_3

    .line 1667
    iget p2, p0, Ll/۠ᩴ֫;->ۨ:I

    goto :goto_2

    :cond_3
    const/4 p2, -0x1

    :goto_2
    invoke-virtual {v3, p2}, Ll/֨ᩴ֫;->֡(I)V

    .line 1668
    invoke-virtual {v3, v0}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    const/4 p2, 0x2

    if-ne v2, p2, :cond_4

    .line 1671
    iget p2, p0, Ll/۠ᩴ֫;->᩷֫:I

    .line 1672
    invoke-virtual {v3, p2}, Ll/֨ᩴ֫;->ۙ(I)V

    iget p2, p0, Ll/۠ᩴ֫;->۠:I

    .line 1673
    invoke-virtual {v3, p2}, Ll/֨ᩴ֫;->ۡ(I)V

    iget p2, p0, Ll/۠ᩴ֫;->֡:F

    .line 1674
    invoke-virtual {v3, p2}, Ll/֨ᩴ֫;->֫(F)V

    :cond_4
    if-eqz v1, :cond_5

    .line 1678
    invoke-virtual {v3, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 1681
    :cond_5
    iget p2, p0, Ll/۠ᩴ֫;->ܿ:I

    if-eq p2, v5, :cond_6

    if-ne v2, v4, :cond_6

    .line 1682
    invoke-virtual {v3, p2}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 1685
    :cond_6
    iget-object p0, p0, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    if-eqz p0, :cond_8

    .line 1687
    iget-object p1, p1, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    if-eqz p1, :cond_7

    .line 1688
    invoke-virtual {p1, p0}, Ll/᩻᩵֫;->֫(Ll/᩻᩵֫;)Ll/᩻᩵֫;

    move-result-object p0

    .line 1690
    :cond_7
    invoke-virtual {v3, p0}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    .line 1693
    :cond_8
    invoke-virtual {v3}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/ܿ᩺֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܿ᩺֫;->֨()V

    return-void
.end method

.method public static ֫(Ll/ܿ᩺֫;Ll/᩶ۨ֫;)V
    .locals 0

    .line 558
    iget-object p0, p0, Ll/ܿ᩺֫;->᩹:Ll/ۧ᩺֫;

    iget-object p1, p1, Ll/᩶ۨ֫;->ۨ:Landroid/net/Uri;

    check-cast p0, Ll/۬ۨ֫;

    .line 985
    iget-object p0, p0, Ll/۬ۨ֫;->᩸:Ll/۫ۨ֫;

    invoke-static {p0}, Ll/۫ۨ֫;->ܽ(Ll/۫ۨ֫;)Ll/ܿܰ֫;

    move-result-object p0

    invoke-interface {p0, p1}, Ll/ܿܰ֫;->ܽ(Landroid/net/Uri;)V

    return-void
.end method

.method private ۚ()Z
    .locals 5

    .line 1551
    iget-wide v0, p0, Ll/ܿ᩺֫;->ۘ֫:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private ۠()V
    .locals 6

    .line 1368
    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 1369
    iget-boolean v5, p0, Ll/ܿ᩺֫;->ᩴ֫:Z

    invoke-virtual {v4, v5}, Ll/ۘܽۧ;->ۧ(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1371
    :cond_0
    iput-boolean v2, p0, Ll/ܿ᩺֫;->ᩴ֫:Z

    return-void
.end method

.method public static ۧ(II)Ll/᩵᩷ۧ;
    .locals 2

    .line 1717
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unmapped track with id "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 1718
    new-instance p0, Ll/᩵᩷ۧ;

    invoke-direct {p0}, Ll/᩵᩷ۧ;-><init>()V

    return-object p0
.end method

.method public static ۧ(Ll/ܿ᩺֫;)V
    .locals 1

    const/4 v0, 0x1

    .line 1375
    iput-boolean v0, p0, Ll/ܿ᩺֫;->۫֫:Z

    .line 1376
    invoke-direct {p0}, Ll/ܿ᩺֫;->֨()V

    return-void
.end method

.method private ܳ(I)V
    .locals 14

    .line 1115
    iget-object v0, p0, Ll/ܿ᩺֫;->ۧ֫:Ll/ۡܳۧ;

    invoke-virtual {v0}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1118
    :goto_0
    iget-object v0, p0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, -0x1

    if-ge p1, v1, :cond_1

    .line 1119
    invoke-direct {p0, p1}, Ll/ܿ᩺֫;->ܿ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_1
    if-ne p1, v2, :cond_2

    return-void

    .line 1128
    :cond_2
    invoke-direct {p0}, Ll/ܿ᩺֫;->֡()Ll/᩶ۨ֫;

    move-result-object v1

    iget-wide v1, v1, Ll/۟ܽۧ;->ܽ:J

    .line 1358
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶ۨ֫;

    .line 1359
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    sget-object v5, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    if-ltz p1, :cond_6

    .line 599
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-gt v4, v5, :cond_6

    if-gt p1, v4, :cond_6

    if-eq p1, v4, :cond_3

    .line 603
    invoke-virtual {v0, p1, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_3
    const/4 p1, 0x0

    const/4 v4, 0x0

    .line 1360
    :goto_2
    iget-object v5, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v5, v5

    if-ge v4, v5, :cond_4

    .line 1361
    invoke-virtual {v3, v4}, Ll/᩶ۨ֫;->֫(I)I

    move-result v5

    .line 1362
    iget-object v6, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object v6, v6, v4

    invoke-virtual {v6, v5}, Ll/ۘܽۧ;->֫(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1130
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 1131
    iget-wide v4, p0, Ll/ܿ᩺֫;->۟:J

    iput-wide v4, p0, Ll/ܿ᩺֫;->ۘ֫:J

    goto :goto_3

    .line 1133
    :cond_5
    invoke-static {v0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۨ֫;

    invoke-virtual {v0}, Ll/᩶ۨ֫;->ۜ()V

    .line 1135
    :goto_3
    iput-boolean p1, p0, Ll/ܿ᩺֫;->ᩳ֫:Z

    .line 1137
    iget v6, p0, Ll/ܿ᩺֫;->ۚ֫:I

    iget-wide v3, v3, Ll/۟ܽۧ;->ܿ:J

    .line 469
    new-instance p1, Ll/ۜۧۧ;

    .line 476
    invoke-static {v3, v4}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v10

    .line 477
    invoke-static {v1, v2}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v12

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v4, p1

    invoke-direct/range {v4 .. v13}, Ll/ۜۧۧ;-><init>(IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    .line 482
    iget-object v0, p0, Ll/ܿ᩺֫;->᩻֫:Ll/۠ۧۧ;

    iget-object v1, v0, Ll/۠ۧۧ;->ۧ:Ll/ܺۧۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    new-instance v2, Ll/᩻ۚۡ;

    invoke-direct {v2, v0, v1, p1}, Ll/᩻ۚۡ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    return-void

    .line 600
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method private ܿ(I)Z
    .locals 4

    move v0, p1

    .line 1336
    :goto_0
    iget-object v1, p0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ge v0, v2, :cond_1

    .line 1337
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۨ֫;

    invoke-virtual {v1}, Ll/᩶ۨ֫;->ۡ()Z

    move-result v1

    if-eqz v1, :cond_0

    return v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1344
    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶ۨ֫;

    const/4 v0, 0x0

    .line 1345
    :goto_1
    iget-object v1, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    .line 1346
    invoke-virtual {p1, v0}, Ll/᩶ۨ֫;->֫(I)I

    move-result v1

    .line 1347
    iget-object v2, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Ll/ۘܽۧ;->ܳ()I

    move-result v2

    if-le v2, v1, :cond_2

    return v3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private ᩵()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "trackGroups",
            "optionalTrackGroups"
        }
    .end annotation

    .line 1593
    iget-boolean v0, p0, Ll/ܿ᩺֫;->᩵֫:Z

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1594
    iget-object v0, p0, Ll/ܿ᩺֫;->ܰ֫:Ll/ۛܽۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1595
    iget-object v0, p0, Ll/ܿ᩺֫;->ܺ֫:Ljava/util/Set;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static ᩻(I)I
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x3

    if-eq p0, v0, :cond_1

    if-eq p0, v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v1

    :cond_1
    return v2

    :cond_2
    return v0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 2

    .line 311
    invoke-direct {p0}, Ll/ܿ᩺֫;->᩵()V

    .line 312
    iget-object v0, p0, Ll/ܿ᩺֫;->᩺֫:[I

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    iget-object v0, p0, Ll/ܿ᩺֫;->᩺֫:[I

    aget v0, v0, p1

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 316
    iget-object v0, p0, Ll/ܿ᩺֫;->ܺ֫:Ljava/util/Set;

    iget-object v1, p0, Ll/ܿ᩺֫;->ܰ֫:Ll/ۛܽۧ;

    invoke-virtual {v1, p1}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x3

    return p1

    .line 320
    :cond_0
    iget-object p1, p0, Ll/ܿ᩺֫;->ۤ֫:[Z

    aget-boolean v1, p1, v0

    if-eqz v1, :cond_2

    :cond_1
    const/4 p1, -0x2

    return p1

    :cond_2
    const/4 v1, 0x1

    .line 324
    aput-boolean v1, p1, v0

    return v0
.end method

.method public final ֫(IJ)I
    .locals 3

    .line 711
    invoke-direct {p0}, Ll/ܿ᩺֫;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 715
    :cond_0
    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object v0, v0, p1

    .line 716
    iget-boolean v1, p0, Ll/ܿ᩺֫;->ᩳ֫:Z

    invoke-virtual {v0, p2, p3, v1}, Ll/ۘܽۧ;->֫(JZ)I

    move-result p2

    .line 889
    iget-object p3, p0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    if-eqz p3, :cond_2

    .line 891
    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    .line 0
    invoke-static {p3, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p3

    goto :goto_1

    .line 900
    :cond_2
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    .line 924
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 906
    :cond_3
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 907
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    move-object p3, v1

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p3, 0x0

    .line 719
    :goto_1
    check-cast p3, Ll/᩶ۨ֫;

    if-eqz p3, :cond_5

    .line 720
    invoke-virtual {p3}, Ll/᩶ۨ֫;->ۢ()Z

    move-result v1

    if-nez v1, :cond_5

    .line 721
    invoke-virtual {v0}, Ll/ۘܽۧ;->ܳ()I

    move-result v1

    .line 722
    invoke-virtual {p3, p1}, Ll/᩶ۨ֫;->֫(I)I

    move-result p1

    sub-int/2addr p1, v1

    .line 723
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 726
    :cond_5
    invoke-virtual {v0, p2}, Ll/ۘܽۧ;->ܽ(I)V

    return p2
.end method

.method public final ֫(ILl/ۗۙ֫;Ll/᩸᩸֫;I)I
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    .line 658
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩺֫;->ۚ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_5

    .line 663
    :cond_0
    iget-object v3, v0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_7

    const/4 v4, 0x0

    .line 665
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    if-ge v4, v6, :cond_3

    .line 666
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩶ۨ֫;

    .line 1325
    iget v6, v6, Ll/᩶ۨ֫;->ᩳ֫:I

    .line 1326
    iget-object v7, v0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v7, v7

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_2

    .line 1328
    iget-object v9, v0, Ll/ܿ᩺֫;->ۤ֫:[Z

    aget-boolean v9, v9, v8

    if-eqz v9, :cond_1

    iget-object v9, v0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object v9, v9, v8

    invoke-virtual {v9}, Ll/ۘܽۧ;->ܺ()J

    move-result-wide v9

    int-to-long v11, v6

    cmp-long v13, v9, v11

    if-nez v13, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 669
    :cond_3
    :goto_2
    sget-object v6, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 599
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-gt v4, v6, :cond_6

    if-ltz v4, :cond_6

    if-eqz v4, :cond_4

    .line 603
    invoke-virtual {v3, v5, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 670
    :cond_4
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩶ۨ֫;

    .line 671
    iget-object v14, v4, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    .line 672
    iget-object v6, v0, Ll/ܿ᩺֫;->ۙ:Ll/۠ᩴ֫;

    invoke-virtual {v14, v6}, Ll/۠ᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 673
    iget v10, v4, Ll/۟ܽۧ;->ۜ:I

    iget-object v11, v4, Ll/۟ܽۧ;->᩻:Ljava/lang/Object;

    iget-wide v6, v4, Ll/۟ܽۧ;->ܿ:J

    .line 494
    new-instance v4, Ll/ۜۧۧ;

    .line 501
    invoke-static {v6, v7}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v12

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x1

    iget v8, v0, Ll/ܿ᩺֫;->۟֫:I

    move-object v6, v4

    move-object v9, v14

    move-object v5, v14

    move-wide v14, v15

    invoke-direct/range {v6 .. v15}, Ll/ۜۧۧ;-><init>(IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    .line 507
    new-instance v6, Ll/۬֡ۢ;

    iget-object v7, v0, Ll/ܿ᩺֫;->᩻֫:Ll/۠ۧۧ;

    invoke-direct {v6, v7, v4}, Ll/۬֡ۢ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v6}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    goto :goto_3

    :cond_5
    move-object v5, v14

    .line 680
    :goto_3
    iput-object v5, v0, Ll/ܿ᩺֫;->ۙ:Ll/۠ᩴ֫;

    goto :goto_4

    .line 600
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    .line 683
    :cond_7
    :goto_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩶ۨ֫;

    invoke-virtual {v5}, Ll/᩶ۨ֫;->ۢ()Z

    move-result v5

    if-nez v5, :cond_9

    :goto_5
    const/4 v1, -0x3

    return v1

    :cond_8
    const/4 v4, 0x0

    .line 688
    :cond_9
    iget-object v5, v0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object v5, v5, v1

    iget-boolean v6, v0, Ll/ܿ᩺֫;->ᩳ֫:Z

    move-object/from16 v7, p3

    move/from16 v8, p4

    .line 689
    invoke-virtual {v5, v2, v7, v8, v6}, Ll/ۘܽۧ;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;IZ)I

    move-result v5

    const/4 v6, -0x5

    if-ne v5, v6, :cond_d

    .line 691
    iget-object v6, v2, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    iget v7, v0, Ll/ܿ᩺֫;->֡֫:I

    if-ne v1, v7, :cond_c

    .line 694
    iget-object v7, v0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object v1, v7, v1

    invoke-virtual {v1}, Ll/ۘܽۧ;->ܺ()J

    move-result-wide v7

    invoke-static {v7, v8}, Ll/۬᩺ܺ;->֫(J)I

    move-result v1

    .line 696
    :goto_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v4, v7, :cond_a

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩶ۨ֫;

    iget v7, v7, Ll/᩶ۨ֫;->ᩳ֫:I

    if-eq v7, v1, :cond_a

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    .line 700
    :cond_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v4, v1, :cond_b

    .line 701
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۨ֫;

    iget-object v1, v1, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    goto :goto_7

    .line 702
    :cond_b
    iget-object v1, v0, Ll/ܿ᩺֫;->ܽۧ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    :goto_7
    invoke-virtual {v6, v1}, Ll/۠ᩴ֫;->ۧ(Ll/۠ᩴ֫;)Ll/۠ᩴ֫;

    move-result-object v6

    .line 705
    :cond_c
    iput-object v6, v2, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    :cond_d
    return v5
.end method

.method public final ֫(JLl/ۢ۬֫;)J
    .locals 1

    .line 634
    iget-object v0, p0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܶۨ֫;->֫(JLl/ۢ۬֫;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ֫(Ll/᩻ܳۧ;JJLjava/io/IOException;I)Ll/ܿܳۧ;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v12, p6

    .line 96
    move-object/from16 v1, p1

    check-cast v1, Ll/۟ܽۧ;

    .line 1697
    instance-of v2, v1, Ll/᩶ۨ֫;

    if-eqz v2, :cond_1

    .line 998
    move-object v3, v1

    check-cast v3, Ll/᩶ۨ֫;

    .line 999
    invoke-virtual {v3}, Ll/᩶ۨ֫;->ۢ()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v12, Ll/᩻ܶ֫;

    if-eqz v3, :cond_1

    .line 1001
    move-object v3, v12

    check-cast v3, Ll/᩻ܶ֫;

    iget v3, v3, Ll/᩻ܶ֫;->۬:I

    const/16 v4, 0x19a

    if-eq v3, v4, :cond_0

    const/16 v4, 0x194

    if-ne v3, v4, :cond_1

    .line 1006
    :cond_0
    sget-object v1, Ll/ۡܳۧ;->ܳ:Ll/ܿܳۧ;

    return-object v1

    .line 1009
    :cond_1
    invoke-virtual {v1}, Ll/۟ܽۧ;->ܽ()J

    move-result-wide v3

    .line 1011
    new-instance v5, Ll/ۧۧۧ;

    .line 1015
    invoke-virtual {v1}, Ll/۟ܽۧ;->ܿ()Landroid/net/Uri;

    .line 1016
    invoke-virtual {v1}, Ll/۟ܽۧ;->ᩳ()Ljava/util/Map;

    move-result-object v6

    move-wide/from16 v7, p4

    invoke-direct {v5, v7, v8, v6}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 1020
    iget-wide v6, v1, Ll/۟ܽۧ;->ܿ:J

    .line 1027
    invoke-static {v6, v7}, Ll/ۘ֨֫;->ۧ(J)J

    iget-wide v6, v1, Ll/۟ܽۧ;->ܽ:J

    .line 1028
    invoke-static {v6, v7}, Ll/ۘ֨֫;->ۧ(J)J

    .line 1029
    new-instance v6, Ll/֫ܳۧ;

    move/from16 v7, p7

    invoke-direct {v6, v12, v7}, Ll/֫ܳۧ;-><init>(Ljava/io/IOException;I)V

    .line 1035
    iget-object v7, v0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    invoke-virtual {v7}, Ll/ܶۨ֫;->ۧ()Ll/ۢܿۧ;

    move-result-object v8

    invoke-static {v8}, Ll/᩵ܿۧ;->֫(Ll/ۢܿۧ;)Ll/ܰܿۧ;

    move-result-object v8

    .line 1034
    iget-object v9, v0, Ll/ܿ᩺֫;->֫֫:Ll/ۧܳۧ;

    invoke-interface {v9, v8, v6}, Ll/ۧܳۧ;->֫(Ll/ܰܿۧ;Ll/֫ܳۧ;)Ll/۟ܿۧ;

    move-result-object v8

    const/4 v10, 0x0

    if-eqz v8, :cond_2

    .line 1036
    iget v11, v8, Ll/۟ܿۧ;->ۧ:I

    const/4 v13, 0x2

    if-ne v11, v13, :cond_2

    .line 1038
    iget-wide v13, v8, Ll/۟ܿۧ;->֫:J

    .line 1039
    invoke-virtual {v7, v1, v13, v14}, Ll/ܶۨ֫;->֫(Ll/۟ܽۧ;J)Z

    move-result v7

    move v14, v7

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    const/4 v14, 0x0

    :goto_0
    if-eqz v14, :cond_6

    if-eqz v2, :cond_5

    const-wide/16 v6, 0x0

    cmp-long v2, v3, v6

    if-nez v2, :cond_5

    .line 0
    iget-object v2, v0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ll/ۘ᩺ۘ;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v3

    .line 1044
    check-cast v3, Ll/᩶ۨ֫;

    if-ne v3, v1, :cond_3

    const/4 v10, 0x1

    .line 1045
    :cond_3
    invoke-static {v10}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1046
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1047
    iget-wide v2, v0, Ll/ܿ᩺֫;->۟:J

    iput-wide v2, v0, Ll/ܿ᩺֫;->ۘ֫:J

    goto :goto_1

    .line 1049
    :cond_4
    invoke-static {v2}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ۨ֫;

    invoke-virtual {v2}, Ll/᩶ۨ֫;->ۜ()V

    .line 1052
    :cond_5
    :goto_1
    sget-object v2, Ll/ۡܳۧ;->ᩳ:Ll/ܿܳۧ;

    goto :goto_2

    .line 1054
    :cond_6
    invoke-interface {v9, v6}, Ll/ۧܳۧ;->֫(Ll/֫ܳۧ;)J

    move-result-wide v2

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v6

    if-eqz v4, :cond_7

    .line 1057
    invoke-static {v2, v3, v10}, Ll/ۡܳۧ;->֫(JZ)Ll/ܿܳۧ;

    move-result-object v2

    goto :goto_2

    .line 1058
    :cond_7
    sget-object v2, Ll/ۡܳۧ;->ܿ:Ll/ܿܳۧ;

    :goto_2
    move-object v15, v2

    .line 1061
    invoke-virtual {v15}, Ll/ܿܳۧ;->֫()Z

    move-result v16

    xor-int/lit8 v13, v16, 0x1

    .line 1062
    iget v3, v1, Ll/۟ܽۧ;->᩷:I

    iget-object v6, v1, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    iget v7, v1, Ll/۟ܽۧ;->ۜ:I

    iget-object v8, v1, Ll/۟ܽۧ;->᩻:Ljava/lang/Object;

    iget-wide v9, v1, Ll/۟ܽۧ;->ܿ:J

    iget-wide v1, v1, Ll/۟ܽۧ;->ܽ:J

    iget-object v4, v0, Ll/ܿ᩺֫;->᩻֫:Ll/۠ۧۧ;

    iget v11, v0, Ll/ܿ᩺֫;->۟֫:I

    move-wide/from16 v17, v1

    move-object v1, v4

    move-object v2, v5

    move v4, v11

    move-object v5, v6

    move v6, v7

    move-object v7, v8

    move-wide v8, v9

    move-wide/from16 v10, v17

    move-object/from16 v12, p6

    invoke-virtual/range {v1 .. v13}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-nez v16, :cond_8

    const/4 v1, 0x0

    .line 1074
    iput-object v1, v0, Ll/ܿ᩺֫;->ܽ֫:Ll/۟ܽۧ;

    :cond_8
    if-eqz v14, :cond_a

    .line 1079
    iget-boolean v1, v0, Ll/ܿ᩺֫;->᩵֫:Z

    if-nez v1, :cond_9

    .line 1080
    new-instance v1, Ll/ۛۙ֫;

    invoke-direct {v1}, Ll/ۛۙ֫;-><init>()V

    iget-wide v2, v0, Ll/ܿ᩺֫;->۟:J

    .line 1081
    invoke-virtual {v1, v2, v3}, Ll/ۛۙ֫;->ۧ(J)V

    invoke-virtual {v1}, Ll/ۛۙ֫;->֫()Ll/ۨۙ֫;

    move-result-object v1

    .line 1080
    invoke-virtual {v0, v1}, Ll/ܿ᩺֫;->֫(Ll/ۨۙ֫;)Z

    return-object v15

    .line 1083
    :cond_9
    iget-object v1, v0, Ll/ܿ᩺֫;->᩹:Ll/ۧ᩺֫;

    check-cast v1, Ll/۬ۨ֫;

    invoke-virtual {v1, v0}, Ll/۬ۨ֫;->֫(Ll/֡ܽۧ;)V

    :cond_a
    return-object v15
.end method

.method public final ֫(II)Ll/᩵ۢۧ;
    .locals 10

    .line 1146
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ll/ܿ᩺֫;->ᩳۧ:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ܿ᩺֫;->ۙ֫:Ljava/util/HashSet;

    iget-object v4, p0, Ll/ܿ᩺֫;->᩹֫:Landroid/util/SparseIntArray;

    const/4 v5, 0x0

    if-eqz v0, :cond_3

    .line 1193
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    const/4 v0, -0x1

    .line 1194
    invoke-virtual {v4, p2, v0}, Landroid/util/SparseIntArray;->get(II)I

    move-result v1

    if-ne v1, v0, :cond_0

    goto :goto_1

    .line 1199
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1200
    iget-object v0, p0, Ll/ܿ᩺֫;->ۗ֫:[I

    aput p1, v0, v1

    .line 1202
    :cond_1
    iget-object v0, p0, Ll/ܿ᩺֫;->ۗ֫:[I

    aget v0, v0, v1

    if-ne v0, p1, :cond_2

    .line 1203
    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object v5, v0, v1

    goto :goto_1

    .line 1204
    :cond_2
    invoke-static {p1, p2}, Ll/ܿ᩺֫;->ۧ(II)Ll/᩵᩷ۧ;

    move-result-object v5

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    .line 1150
    :goto_0
    iget-object v1, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v6, v1

    if-ge v0, v6, :cond_5

    .line 1151
    iget-object v6, p0, Ll/ܿ᩺֫;->ۗ֫:[I

    aget v6, v6, v0

    if-ne v6, p1, :cond_4

    .line 1152
    aget-object v5, v1, v0

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    if-nez v5, :cond_c

    .line 1159
    iget-boolean v0, p0, Ll/ܿ᩺֫;->֫ۧ:Z

    if-eqz v0, :cond_6

    .line 1160
    invoke-static {p1, p2}, Ll/ܿ᩺֫;->ۧ(II)Ll/᩵᩷ۧ;

    move-result-object p1

    return-object p1

    .line 1208
    :cond_6
    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v0, v0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_7

    const/4 v5, 0x2

    if-ne p2, v5, :cond_8

    :cond_7
    const/4 v2, 0x1

    .line 1211
    :cond_8
    new-instance v5, Ll/ᩳ᩺֫;

    iget-object v6, p0, Ll/ܿ᩺֫;->ۗ:Ll/ܶۛ֫;

    iget-object v7, p0, Ll/ܿ᩺֫;->ۖ֫:Ljava/util/Map;

    iget-object v8, p0, Ll/ܿ᩺֫;->᩸:Ll/᩸ܿۧ;

    iget-object v9, p0, Ll/ܿ᩺֫;->۫:Ll/ۙۛ֫;

    invoke-direct {v5, v8, v9, v6, v7}, Ll/ᩳ᩺֫;-><init>(Ll/᩸ܿۧ;Ll/ۙۛ֫;Ll/ܶۛ֫;Ljava/util/Map;)V

    .line 1213
    iget-wide v6, p0, Ll/ܿ᩺֫;->۟:J

    invoke-virtual {v5, v6, v7}, Ll/ۘܽۧ;->ܽ(J)V

    if-eqz v2, :cond_9

    .line 1215
    iget-object v6, p0, Ll/ܿ᩺֫;->۬:Ll/᩵ᩴ֫;

    invoke-virtual {v5, v6}, Ll/ᩳ᩺֫;->֫(Ll/᩵ᩴ֫;)V

    .line 1217
    :cond_9
    iget-wide v6, p0, Ll/ܿ᩺֫;->᩸֫:J

    invoke-virtual {v5, v6, v7}, Ll/ۘܽۧ;->ۧ(J)V

    .line 1218
    iget-object v6, p0, Ll/ܿ᩺֫;->ۨ֫:Ll/᩶ۨ֫;

    if-eqz v6, :cond_a

    .line 1767
    iget v6, v6, Ll/᩶ۨ֫;->ᩳ֫:I

    int-to-long v6, v6

    invoke-virtual {v5, v6, v7}, Ll/ۘܽۧ;->ᩳ(J)V

    .line 1221
    :cond_a
    invoke-virtual {v5, p0}, Ll/ۘܽۧ;->֫(Ll/ۖܽۧ;)V

    .line 1222
    iget-object v6, p0, Ll/ܿ᩺֫;->ۗ֫:[I

    add-int/lit8 v7, v0, 0x1

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v6

    iput-object v6, p0, Ll/ܿ᩺֫;->ۗ֫:[I

    .line 1223
    aput p1, v6, v0

    .line 1224
    iget-object p1, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    sget-object v6, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 667
    array-length v6, p1

    add-int/2addr v6, v1

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    .line 668
    array-length p1, p1

    aput-object v5, v1, p1

    .line 1224
    check-cast v1, [Ll/ᩳ᩺֫;

    iput-object v1, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    .line 1225
    iget-object p1, p0, Ll/ܿ᩺֫;->᩶֫:[Z

    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩺֫;->᩶֫:[Z

    .line 1226
    aput-boolean v2, p1, v0

    .line 1227
    iget-boolean p1, p0, Ll/ܿ᩺֫;->᩺:Z

    or-int/2addr p1, v2

    iput-boolean p1, p0, Ll/ܿ᩺֫;->᩺:Z

    .line 1228
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1229
    invoke-virtual {v4, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    .line 1230
    invoke-static {p2}, Ll/ܿ᩺֫;->᩻(I)I

    move-result p1

    iget v1, p0, Ll/ܿ᩺֫;->ۚ֫:I

    invoke-static {v1}, Ll/ܿ᩺֫;->᩻(I)I

    move-result v1

    if-le p1, v1, :cond_b

    .line 1231
    iput v0, p0, Ll/ܿ᩺֫;->֡֫:I

    .line 1232
    iput p2, p0, Ll/ܿ᩺֫;->ۚ֫:I

    .line 1234
    :cond_b
    iget-object p1, p0, Ll/ܿ᩺֫;->ۤ֫:[Z

    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩺֫;->ۤ֫:[Z

    :cond_c
    const/4 p1, 0x5

    if-ne p2, p1, :cond_e

    .line 1168
    iget-object p1, p0, Ll/ܿ᩺֫;->ۤ:Ll/᩵ۢۧ;

    if-nez p1, :cond_d

    .line 1169
    new-instance p1, Ll/ܽ᩺֫;

    iget p2, p0, Ll/ܿ᩺֫;->ۜ֫:I

    invoke-direct {p1, v5, p2}, Ll/ܽ᩺֫;-><init>(Ll/᩵ۢۧ;I)V

    iput-object p1, p0, Ll/ܿ᩺֫;->ۤ:Ll/᩵ۢۧ;

    .line 1171
    :cond_d
    iget-object p1, p0, Ll/ܿ᩺֫;->ۤ:Ll/᩵ۢۧ;

    return-object p1

    :cond_e
    return-object v5
.end method

.method public final ֫(JZ)V
    .locals 4

    .line 480
    iget-boolean v0, p0, Ll/ܿ᩺֫;->۫֫:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Ll/ܿ᩺֫;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 483
    :cond_0
    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 485
    iget-object v2, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object v2, v2, v1

    iget-object v3, p0, Ll/ܿ᩺֫;->ۤ֫:[Z

    aget-boolean v3, v3, v1

    invoke-virtual {v2, p1, p2, p3, v3}, Ll/ۘܽۧ;->֫(JZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ֫(Ll/ۢۢۧ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/᩵ᩴ֫;)V
    .locals 3

    .line 1303
    iget-object v0, p0, Ll/ܿ᩺֫;->۬:Ll/᩵ᩴ֫;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1304
    iput-object p1, p0, Ll/ܿ᩺֫;->۬:Ll/᩵ᩴ֫;

    const/4 v0, 0x0

    .line 1305
    :goto_0
    iget-object v1, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 1306
    iget-object v2, p0, Ll/ܿ᩺֫;->᩶֫:[Z

    aget-boolean v2, v2, v0

    if-eqz v2, :cond_0

    .line 1307
    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ll/ᩳ᩺֫;->֫(Ll/᩵ᩴ֫;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJ)V
    .locals 14

    move-object v0, p0

    .line 96
    move-object v1, p1

    check-cast v1, Ll/۟ܽۧ;

    const/4 v2, 0x0

    .line 929
    iput-object v2, v0, Ll/ܿ᩺֫;->ܽ֫:Ll/۟ܽۧ;

    .line 930
    iget-object v2, v0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    invoke-virtual {v2, v1}, Ll/ܶۨ֫;->֫(Ll/۟ܽۧ;)V

    .line 931
    new-instance v4, Ll/ۧۧۧ;

    iget-wide v2, v1, Ll/۟ܽۧ;->ᩳ:J

    .line 935
    invoke-virtual {v1}, Ll/۟ܽۧ;->ܿ()Landroid/net/Uri;

    .line 936
    invoke-virtual {v1}, Ll/۟ܽۧ;->ᩳ()Ljava/util/Map;

    move-result-object v2

    .line 939
    invoke-virtual {v1}, Ll/۟ܽۧ;->ܽ()J

    move-wide/from16 v5, p4

    invoke-direct {v4, v5, v6, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 940
    iget-object v2, v0, Ll/ܿ᩺֫;->֫֫:Ll/ۧܳۧ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    iget v5, v1, Ll/۟ܽۧ;->᩷:I

    iget-object v7, v1, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    iget v8, v1, Ll/۟ܽۧ;->ۜ:I

    iget-object v9, v1, Ll/۟ܽۧ;->᩻:Ljava/lang/Object;

    iget-wide v10, v1, Ll/۟ܽۧ;->ܿ:J

    iget-wide v12, v1, Ll/۟ܽۧ;->ܽ:J

    iget-object v3, v0, Ll/ܿ᩺֫;->᩻֫:Ll/۠ۧۧ;

    iget v6, v0, Ll/ܿ᩺֫;->۟֫:I

    invoke-virtual/range {v3 .. v13}, Ll/۠ۧۧ;->ۧ(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    .line 950
    iget-boolean v1, v0, Ll/ܿ᩺֫;->᩵֫:Z

    if-nez v1, :cond_0

    .line 951
    new-instance v1, Ll/ۛۙ֫;

    invoke-direct {v1}, Ll/ۛۙ֫;-><init>()V

    iget-wide v2, v0, Ll/ܿ᩺֫;->۟:J

    invoke-virtual {v1, v2, v3}, Ll/ۛۙ֫;->ۧ(J)V

    invoke-virtual {v1}, Ll/ۛۙ֫;->֫()Ll/ۨۙ֫;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ܿ᩺֫;->֫(Ll/ۨۙ֫;)Z

    return-void

    .line 953
    :cond_0
    iget-object v1, v0, Ll/ܿ᩺֫;->᩹:Ll/ۧ᩺֫;

    check-cast v1, Ll/۬ۨ֫;

    invoke-virtual {v1, p0}, Ll/۬ۨ֫;->֫(Ll/֡ܽۧ;)V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJI)V
    .locals 14

    move-object v0, p0

    .line 96
    move-object v1, p1

    check-cast v1, Ll/۟ܽۧ;

    if-nez p6, :cond_0

    .line 906
    new-instance v2, Ll/ۧۧۧ;

    iget-wide v3, v1, Ll/۟ܽۧ;->ᩳ:J

    iget-object v3, v1, Ll/۟ܽۧ;->ۧ:Ll/ۗ۠֫;

    invoke-direct {v2, v3}, Ll/ۧۧۧ;-><init>(Ll/ۗ۠֫;)V

    goto :goto_0

    .line 907
    :cond_0
    new-instance v2, Ll/ۧۧۧ;

    iget-wide v3, v1, Ll/۟ܽۧ;->ᩳ:J

    .line 910
    invoke-virtual {v1}, Ll/۟ܽۧ;->ܿ()Landroid/net/Uri;

    .line 911
    invoke-virtual {v1}, Ll/۟ܽۧ;->ᩳ()Ljava/util/Map;

    move-result-object v3

    .line 914
    invoke-virtual {v1}, Ll/۟ܽۧ;->ܽ()J

    move-wide/from16 v4, p4

    invoke-direct {v2, v4, v5, v3}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    :goto_0
    move-object v3, v2

    .line 915
    iget v4, v1, Ll/۟ܽۧ;->᩷:I

    iget-object v6, v1, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    iget v7, v1, Ll/۟ܽۧ;->ۜ:I

    iget-object v8, v1, Ll/۟ܽۧ;->᩻:Ljava/lang/Object;

    iget-wide v9, v1, Ll/۟ܽۧ;->ܿ:J

    iget-wide v11, v1, Ll/۟ܽۧ;->ܽ:J

    iget-object v2, v0, Ll/ܿ᩺֫;->᩻֫:Ll/۠ۧۧ;

    iget v5, v0, Ll/ܿ᩺֫;->۟֫:I

    move/from16 v13, p6

    invoke-virtual/range {v2 .. v13}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJI)V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJZ)V
    .locals 14

    move-object v0, p0

    .line 96
    move-object v1, p1

    check-cast v1, Ll/۟ܽۧ;

    const/4 v2, 0x0

    .line 960
    iput-object v2, v0, Ll/ܿ᩺֫;->ܽ֫:Ll/۟ܽۧ;

    .line 961
    new-instance v4, Ll/ۧۧۧ;

    iget-wide v2, v1, Ll/۟ܽۧ;->ᩳ:J

    .line 965
    invoke-virtual {v1}, Ll/۟ܽۧ;->ܿ()Landroid/net/Uri;

    .line 966
    invoke-virtual {v1}, Ll/۟ܽۧ;->ᩳ()Ljava/util/Map;

    move-result-object v2

    .line 969
    invoke-virtual {v1}, Ll/۟ܽۧ;->ܽ()J

    move-wide/from16 v5, p4

    invoke-direct {v4, v5, v6, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 970
    iget-object v2, v0, Ll/ܿ᩺֫;->֫֫:Ll/ۧܳۧ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    iget v5, v1, Ll/۟ܽۧ;->᩷:I

    iget-object v7, v1, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    iget v8, v1, Ll/۟ܽۧ;->ۜ:I

    iget-object v9, v1, Ll/۟ܽۧ;->᩻:Ljava/lang/Object;

    iget-wide v10, v1, Ll/۟ܽۧ;->ܿ:J

    iget-wide v12, v1, Ll/۟ܽۧ;->ܽ:J

    iget-object v3, v0, Ll/ܿ᩺֫;->᩻֫:Ll/۠ۧۧ;

    iget v6, v0, Ll/ܿ᩺֫;->۟֫:I

    invoke-virtual/range {v3 .. v13}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_2

    .line 981
    invoke-direct {p0}, Ll/ܿ᩺֫;->ۚ()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, v0, Ll/ܿ᩺֫;->ۛ:I

    if-nez v1, :cond_1

    .line 982
    :cond_0
    invoke-direct {p0}, Ll/ܿ᩺֫;->۠()V

    .line 984
    :cond_1
    iget v1, v0, Ll/ܿ᩺֫;->ۛ:I

    if-lez v1, :cond_2

    .line 985
    iget-object v1, v0, Ll/ܿ᩺֫;->᩹:Ll/ۧ᩺֫;

    check-cast v1, Ll/۬ۨ֫;

    invoke-virtual {v1, p0}, Ll/۬ۨ֫;->֫(Ll/֡ܽۧ;)V

    :cond_2
    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 589
    iget-object v0, p0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    invoke-virtual {v0, p1}, Ll/ܶۨ֫;->֫(Z)V

    return-void
.end method

.method public final varargs ֫([Ll/۬᩵֫;[I)V
    .locals 5

    .line 283
    invoke-direct {p0, p1}, Ll/ܿ᩺֫;->֫([Ll/۬᩵֫;)Ll/ۛܽۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ᩺֫;->ܰ֫:Ll/ۛܽۧ;

    .line 284
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/ܿ᩺֫;->ܺ֫:Ljava/util/Set;

    .line 285
    array-length p1, p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    aget v2, p2, v1

    .line 286
    iget-object v3, p0, Ll/ܿ᩺֫;->ܺ֫:Ljava/util/Set;

    iget-object v4, p0, Ll/ܿ᩺֫;->ܰ֫:Ll/ۛܽۧ;

    invoke-virtual {v4, v2}, Ll/ۛܽۧ;->֫(I)Ll/۬᩵֫;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 288
    :cond_0
    iput v0, p0, Ll/ܿ᩺֫;->֨֫:I

    .line 289
    new-instance p1, Ll/۟ۨ֫;

    iget-object p2, p0, Ll/ܿ᩺֫;->᩹:Ll/ۧ᩺֫;

    invoke-direct {p1, p2}, Ll/۟ۨ֫;-><init>(Ll/ۧ᩺֫;)V

    iget-object p2, p0, Ll/ܿ᩺֫;->ۨ:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x1

    .line 1588
    iput-boolean p1, p0, Ll/ܿ᩺֫;->᩵֫:Z

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 866
    iget-object v0, p0, Ll/ܿ᩺֫;->ۧ֫:Ll/ۡܳۧ;

    invoke-virtual {v0}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public final ֫(Landroid/net/Uri;Ll/֫ܳۧ;Z)Z
    .locals 2

    .line 601
    iget-object v0, p0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    invoke-virtual {v0, p1}, Ll/ܶۨ֫;->֫(Landroid/net/Uri;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-nez p3, :cond_1

    .line 610
    invoke-virtual {v0}, Ll/ܶۨ֫;->ۧ()Ll/ۢܿۧ;

    move-result-object p3

    invoke-static {p3}, Ll/᩵ܿۧ;->֫(Ll/ۢܿۧ;)Ll/ܰܿۧ;

    move-result-object p3

    .line 609
    iget-object v1, p0, Ll/ܿ᩺֫;->֫֫:Ll/ۧܳۧ;

    invoke-interface {v1, p3, p2}, Ll/ۧܳۧ;->֫(Ll/ܰܿۧ;Ll/֫ܳۧ;)Ll/۟ܿۧ;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 611
    iget p3, p2, Ll/۟ܿۧ;->ۧ:I

    const/4 v1, 0x2

    if-ne p3, v1, :cond_1

    .line 613
    iget-wide p2, p2, Ll/۟ܿۧ;->֫:J

    goto :goto_0

    :cond_1
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 618
    :goto_0
    invoke-virtual {v0, p1, p2, p3}, Ll/ܶۨ֫;->֫(Landroid/net/Uri;J)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۨۙ֫;)Z
    .locals 18

    move-object/from16 v0, p0

    .line 768
    iget-boolean v1, v0, Ll/ܿ᩺֫;->ᩳ֫:Z

    const/4 v2, 0x0

    if-nez v1, :cond_12

    iget-object v1, v0, Ll/ܿ᩺֫;->ۧ֫:Ll/ۡܳۧ;

    invoke-virtual {v1}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v3

    if-nez v3, :cond_12

    invoke-virtual {v1}, Ll/ۡܳۧ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_b

    .line 775
    :cond_0
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩺֫;->ۚ()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 776
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 777
    iget-wide v4, v0, Ll/ܿ᩺֫;->ۘ֫:J

    .line 779
    iget-object v6, v0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 780
    iget-wide v10, v0, Ll/ܿ᩺֫;->ۘ֫:J

    invoke-virtual {v9, v10, v11}, Ll/ۘܽۧ;->ܽ(J)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    move-object v15, v3

    move-wide v11, v4

    move-wide v13, v11

    goto :goto_4

    .line 784
    :cond_2
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩺֫;->֡()Ll/᩶ۨ֫;

    move-result-object v3

    .line 785
    invoke-virtual {v3}, Ll/᩶ۨ֫;->᩷()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Ll/᩶ۨ֫;->ۢ()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    .line 791
    :cond_3
    invoke-virtual {v3}, Ll/᩶ۨ֫;->᩻()J

    move-result-wide v3

    goto :goto_2

    .line 788
    :cond_4
    :goto_1
    iget-wide v4, v0, Ll/ܿ᩺֫;->۟:J

    iget-wide v6, v3, Ll/۟ܽۧ;->ܿ:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :goto_2
    move-wide v4, v3

    .line 793
    iget-wide v6, v0, Ll/ܿ᩺֫;->۟:J

    .line 794
    iget-boolean v3, v0, Ll/ܿ᩺֫;->۫֫:Z

    iget-object v8, v0, Ll/ܿ᩺֫;->۠֫:Ljava/util/List;

    if-eqz v3, :cond_5

    .line 795
    iget-object v3, v0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v9, v3

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v9, :cond_5

    aget-object v11, v3, v10

    .line 797
    invoke-virtual {v11}, Ll/ۘܽۧ;->ܿ()J

    move-result-wide v11

    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_5
    move-wide v11, v4

    move-wide v13, v6

    move-object v15, v8

    .line 90
    :goto_4
    iget-object v3, v0, Ll/ܿ᩺֫;->ۢ֫:Ll/֡ۨ֫;

    const/4 v4, 0x0

    iput-object v4, v3, Ll/֡ۨ֫;->֫:Ll/۟ܽۧ;

    .line 91
    iput-boolean v2, v3, Ll/֡ۨ֫;->ۧ:Z

    .line 92
    iput-object v4, v3, Ll/֡ۨ֫;->ܽ:Landroid/net/Uri;

    .line 802
    iget-boolean v4, v0, Ll/ܿ᩺֫;->᩵֫:Z

    const/4 v5, 0x1

    if-nez v4, :cond_7

    .line 807
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    const/16 v16, 0x0

    goto :goto_6

    :cond_7
    :goto_5
    const/4 v4, 0x1

    const/16 v16, 0x1

    :goto_6
    iget-object v4, v0, Ll/ܿ᩺֫;->ۢ֫:Ll/֡ۨ֫;

    .line 802
    iget-object v9, v0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    move-object/from16 v10, p1

    move-object/from16 v17, v4

    invoke-virtual/range {v9 .. v17}, Ll/ܶۨ֫;->֫(Ll/ۨۙ֫;JJLjava/util/List;ZLl/֡ۨ֫;)V

    .line 809
    iget-boolean v4, v3, Ll/֡ۨ֫;->ۧ:Z

    .line 810
    iget-object v6, v3, Ll/֡ۨ֫;->֫:Ll/۟ܽۧ;

    .line 811
    iget-object v3, v3, Ll/֡ۨ֫;->ܽ:Landroid/net/Uri;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v4, :cond_8

    .line 814
    iput-wide v7, v0, Ll/ܿ᩺֫;->ۘ֫:J

    .line 815
    iput-boolean v5, v0, Ll/ܿ᩺֫;->ᩳ֫:Z

    return v5

    :cond_8
    if-nez v6, :cond_9

    if-eqz v3, :cond_12

    .line 821
    iget-object v1, v0, Ll/ܿ᩺֫;->᩹:Ll/ۧ᩺֫;

    check-cast v1, Ll/۬ۨ֫;

    .line 985
    iget-object v1, v1, Ll/۬ۨ֫;->᩸:Ll/۫ۨ֫;

    invoke-static {v1}, Ll/۫ۨ֫;->ܽ(Ll/۫ۨ֫;)Ll/ܿܰ֫;

    move-result-object v1

    invoke-interface {v1, v3}, Ll/ܿܰ֫;->ܽ(Landroid/net/Uri;)V

    return v2

    .line 1697
    :cond_9
    instance-of v3, v6, Ll/᩶ۨ֫;

    if-eqz v3, :cond_11

    .line 827
    move-object v3, v6

    check-cast v3, Ll/᩶ۨ֫;

    .line 837
    iget-object v4, v0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_a

    goto :goto_8

    .line 840
    :cond_a
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩺֫;->֡()Ll/᩶ۨ֫;

    move-result-object v9

    invoke-virtual {v9}, Ll/᩶ۨ֫;->ۢ()Z

    move-result v9

    if-nez v9, :cond_b

    .line 843
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int/2addr v9, v5

    invoke-direct {v0, v9}, Ll/ܿ᩺֫;->ܳ(I)V

    .line 845
    :cond_b
    iget-boolean v9, v3, Ll/᩶ۨ֫;->᩸:Z

    if-eqz v9, :cond_e

    invoke-virtual {v3}, Ll/᩶ۨ֫;->ۡ()Z

    move-result v9

    if-eqz v9, :cond_e

    .line 848
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int/2addr v9, v5

    :goto_7
    if-ltz v9, :cond_e

    .line 849
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩶ۨ֫;

    iget-wide v10, v10, Ll/۟ܽۧ;->ܿ:J

    .line 850
    iget-wide v12, v3, Ll/۟ܽۧ;->ܿ:J

    cmp-long v14, v10, v12

    if-gez v14, :cond_c

    goto :goto_8

    :cond_c
    if-nez v14, :cond_d

    .line 854
    invoke-direct {v0, v9}, Ll/ܿ᩺֫;->ܿ(I)Z

    move-result v10

    if-eqz v10, :cond_d

    .line 856
    invoke-direct {v0, v9}, Ll/ܿ᩺֫;->ܳ(I)V

    .line 857
    invoke-virtual {v3}, Ll/᩶ۨ֫;->ܳ()V

    goto :goto_8

    :cond_d
    add-int/lit8 v9, v9, -0x1

    goto :goto_7

    .line 1097
    :cond_e
    :goto_8
    iput-object v3, v0, Ll/ܿ᩺֫;->ۨ֫:Ll/᩶ۨ֫;

    .line 1098
    iget-object v9, v3, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    iput-object v9, v0, Ll/ܿ᩺֫;->ܽۧ:Ll/۠ᩴ֫;

    .line 1099
    iput-wide v7, v0, Ll/ܿ᩺֫;->ۘ֫:J

    .line 1100
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1101
    sget v4, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v4, Ll/֫۬ܺ;

    invoke-direct {v4}, Ll/֫۬ܺ;-><init>()V

    .line 1102
    iget-object v7, v0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v8, v7

    const/4 v9, 0x0

    :goto_9
    if-ge v9, v8, :cond_f

    aget-object v10, v7, v9

    .line 1103
    invoke-virtual {v10}, Ll/ۘܽۧ;->ۜ()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v4, v10}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    .line 1105
    :cond_f
    invoke-virtual {v4}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Ll/᩶ۨ֫;->֫(Ll/ܿ᩺֫;Ll/ܳ۬ܺ;)V

    .line 1106
    iget-object v4, v0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v7, v4

    :goto_a
    if-ge v2, v7, :cond_11

    aget-object v8, v4, v2

    .line 1107
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1767
    iget v9, v3, Ll/᩶ۨ֫;->ᩳ֫:I

    int-to-long v9, v9

    invoke-virtual {v8, v9, v10}, Ll/ۘܽۧ;->ᩳ(J)V

    .line 1108
    invoke-virtual {v3}, Ll/᩶ۨ֫;->ۡ()Z

    move-result v9

    if-eqz v9, :cond_10

    .line 1109
    invoke-virtual {v8}, Ll/ۘܽۧ;->ᩴ()V

    :cond_10
    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    .line 830
    :cond_11
    iput-object v6, v0, Ll/ܿ᩺֫;->ܽ֫:Ll/۟ܽۧ;

    .line 831
    iget-object v2, v0, Ll/ܿ᩺֫;->֫֫:Ll/ۧܳۧ;

    iget v3, v6, Ll/۟ܽۧ;->᩷:I

    .line 832
    invoke-interface {v2, v3}, Ll/ۧܳۧ;->֫(I)I

    move-result v2

    .line 831
    invoke-virtual {v1, v6, v0, v2}, Ll/ۡܳۧ;->֫(Ll/᩻ܳۧ;Ll/ᩳܳۧ;I)V

    return v5

    :cond_12
    :goto_b
    return v2
.end method

.method public final ֫([Ll/ۢܿۧ;[Z[Ll/ᩴܽۧ;[ZJZ)Z
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-wide/from16 v12, p5

    .line 360
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩺֫;->᩵()V

    .line 361
    iget v3, v0, Ll/ܿ᩺֫;->ۛ:I

    const/4 v14, 0x0

    const/4 v4, 0x0

    .line 363
    :goto_0
    array-length v5, v1

    const/4 v6, 0x0

    const/4 v15, 0x1

    if-ge v4, v5, :cond_2

    .line 364
    aget-object v5, v2, v4

    check-cast v5, Ll/ۨۨ֫;

    if-eqz v5, :cond_1

    .line 365
    aget-object v7, v1, v4

    if-eqz v7, :cond_0

    aget-boolean v7, p2, v4

    if-nez v7, :cond_1

    .line 366
    :cond_0
    iget v7, v0, Ll/ܿ᩺֫;->ۛ:I

    sub-int/2addr v7, v15

    iput v7, v0, Ll/ܿ᩺֫;->ۛ:I

    .line 367
    invoke-virtual {v5}, Ll/ۨۨ֫;->ܽ()V

    .line 368
    aput-object v6, v2, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-nez p7, :cond_5

    .line 374
    iget-boolean v4, v0, Ll/ܿ᩺֫;->ۛ֫:Z

    if-eqz v4, :cond_3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_3
    iget-wide v3, v0, Ll/ܿ᩺֫;->۟:J

    cmp-long v5, v12, v3

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v3, 0x1

    .line 381
    :goto_2
    iget-object v11, v0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    invoke-virtual {v11}, Ll/ܶۨ֫;->ۧ()Ll/ۢܿۧ;

    move-result-object v4

    const/4 v5, 0x0

    move/from16 v16, v3

    move-object v10, v4

    .line 384
    :goto_3
    array-length v3, v1

    if-ge v5, v3, :cond_a

    .line 385
    aget-object v3, v1, v5

    if-nez v3, :cond_6

    goto :goto_5

    .line 389
    :cond_6
    iget-object v7, v0, Ll/ܿ᩺֫;->ܰ֫:Ll/ۛܽۧ;

    invoke-interface {v3}, Ll/ᩴܿۧ;->ܿ()Ll/۬᩵֫;

    move-result-object v8

    invoke-virtual {v7, v8}, Ll/ۛܽۧ;->֫(Ll/۬᩵֫;)I

    move-result v7

    .line 390
    iget v8, v0, Ll/ܿ᩺֫;->֨֫:I

    if-ne v7, v8, :cond_7

    .line 392
    invoke-virtual {v11, v3}, Ll/ܶۨ֫;->֫(Ll/ۢܿۧ;)V

    move-object v10, v3

    .line 394
    :cond_7
    aget-object v3, v2, v5

    if-nez v3, :cond_9

    .line 395
    iget v3, v0, Ll/ܿ᩺֫;->ۛ:I

    add-int/2addr v3, v15

    iput v3, v0, Ll/ܿ᩺֫;->ۛ:I

    .line 396
    new-instance v3, Ll/ۨۨ֫;

    invoke-direct {v3, v0, v7}, Ll/ۨۨ֫;-><init>(Ll/ܿ᩺֫;I)V

    aput-object v3, v2, v5

    .line 397
    aput-boolean v15, p4, v5

    .line 398
    iget-object v8, v0, Ll/ܿ᩺֫;->᩺֫:[I

    if-eqz v8, :cond_9

    .line 399
    invoke-virtual {v3}, Ll/ۨۨ֫;->ۧ()V

    if-nez v16, :cond_9

    .line 402
    iget-object v3, v0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    iget-object v8, v0, Ll/ܿ᩺֫;->᩺֫:[I

    aget v7, v8, v7

    aget-object v3, v3, v7

    .line 407
    invoke-virtual {v3}, Ll/ۘܽۧ;->ܳ()I

    move-result v7

    if-eqz v7, :cond_8

    .line 408
    invoke-virtual {v3, v12, v13, v15}, Ll/ۘܽۧ;->ۧ(JZ)Z

    move-result v3

    if-nez v3, :cond_8

    const/4 v3, 0x1

    goto :goto_4

    :cond_8
    const/4 v3, 0x0

    :goto_4
    move/from16 v16, v3

    :cond_9
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 414
    :cond_a
    iget v1, v0, Ll/ܿ᩺֫;->ۛ:I

    iget-object v3, v0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    if-nez v1, :cond_d

    .line 415
    invoke-virtual {v11}, Ll/ܶۨ֫;->ܿ()V

    .line 416
    iput-object v6, v0, Ll/ܿ᩺֫;->ۙ:Ll/۠ᩴ֫;

    .line 417
    iput-boolean v15, v0, Ll/ܿ᩺֫;->ᩴ֫:Z

    .line 418
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 419
    iget-object v1, v0, Ll/ܿ᩺֫;->ۧ֫:Ll/ۡܳۧ;

    invoke-virtual {v1}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 420
    iget-boolean v3, v0, Ll/ܿ᩺֫;->۫֫:Z

    if-eqz v3, :cond_b

    .line 422
    iget-object v3, v0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_6
    if-ge v5, v4, :cond_b

    aget-object v6, v3, v5

    .line 423
    invoke-virtual {v6}, Ll/ۘܽۧ;->֫()V

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 426
    :cond_b
    invoke-virtual {v1}, Ll/ۡܳۧ;->֫()V

    goto/16 :goto_9

    .line 428
    :cond_c
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩺֫;->۠()V

    goto :goto_9

    .line 431
    :cond_d
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_10

    .line 432
    invoke-static {v10, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    .line 436
    iget-boolean v1, v0, Ll/ܿ᩺֫;->ۛ֫:Z

    if-nez v1, :cond_f

    const-wide/16 v3, 0x0

    cmp-long v1, v12, v3

    if-gez v1, :cond_e

    neg-long v3, v12

    :cond_e
    move-wide v6, v3

    .line 438
    invoke-direct/range {p0 .. p0}, Ll/ܿ᩺֫;->֡()Ll/᩶ۨ֫;

    move-result-object v1

    .line 440
    invoke-virtual {v11, v1, v12, v13}, Ll/ܶۨ֫;->֫(Ll/᩶ۨ֫;J)[Ll/ᩳᩳۧ;

    move-result-object v17

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 441
    iget-object v4, v0, Ll/ܿ᩺֫;->۠֫:Ljava/util/List;

    move-object v3, v10

    move-object/from16 v18, v4

    move-wide/from16 v4, p5

    move-object/from16 v19, v10

    move-object/from16 v10, v18

    move-object/from16 v18, v11

    move-object/from16 v11, v17

    invoke-interface/range {v3 .. v11}, Ll/ۢܿۧ;->֫(JJJLjava/util/List;[Ll/ᩳᩳۧ;)V

    .line 447
    invoke-virtual/range {v18 .. v18}, Ll/ܶۨ֫;->֫()Ll/۬᩵֫;

    move-result-object v3

    iget-object v1, v1, Ll/۟ܽۧ;->ܳ:Ll/۠ᩴ֫;

    invoke-virtual {v3, v1}, Ll/۬᩵֫;->֫(Ll/۠ᩴ֫;)I

    move-result v1

    .line 448
    invoke-interface/range {v19 .. v19}, Ll/ۢܿۧ;->᩻()I

    move-result v3

    if-eq v3, v1, :cond_10

    .line 460
    :cond_f
    iput-boolean v15, v0, Ll/ܿ᩺֫;->ᩴ֫:Z

    const/4 v1, 0x1

    const/16 v16, 0x1

    goto :goto_7

    :cond_10
    move/from16 v1, p7

    :goto_7
    if-eqz v16, :cond_12

    .line 464
    invoke-virtual {v0, v12, v13, v1}, Ll/ܿ᩺֫;->ۧ(JZ)Z

    const/4 v1, 0x0

    .line 466
    :goto_8
    array-length v3, v2

    if-ge v1, v3, :cond_12

    .line 467
    aget-object v3, v2, v1

    if-eqz v3, :cond_11

    .line 468
    aput-boolean v15, p4, v1

    :cond_11
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 1316
    :cond_12
    :goto_9
    iget-object v1, v0, Ll/ܿ᩺֫;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1317
    array-length v3, v2

    :goto_a
    if-ge v14, v3, :cond_14

    aget-object v4, v2, v14

    if-eqz v4, :cond_13

    .line 1319
    check-cast v4, Ll/ۨۨ֫;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    add-int/lit8 v14, v14, 0x1

    goto :goto_a

    .line 475
    :cond_14
    iput-boolean v15, v0, Ll/ܿ᩺֫;->ۛ֫:Z

    return v16
.end method

.method public final ۖ()V
    .locals 1

    .line 1260
    iget-object v0, p0, Ll/ܿ᩺֫;->ۙ֫:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public final ۘ()V
    .locals 4

    .line 547
    iget-object v0, p0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 550
    :cond_0
    invoke-static {v0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۨ֫;

    .line 552
    iget-object v1, p0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    invoke-virtual {v1, v0}, Ll/ܶۨ֫;->֫(Ll/᩶ۨ֫;)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 554
    invoke-virtual {v0}, Ll/᩶ۨ֫;->ۢ()Z

    move-result v2

    if-nez v2, :cond_3

    .line 555
    invoke-virtual {v1, v0}, Ll/ܶۨ֫;->ۧ(Ll/᩶ۨ֫;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/᩶ۨ֫;->֫(J)V

    return-void

    :cond_1
    if-nez v2, :cond_2

    .line 558
    new-instance v1, Ll/֫᩺֫;

    invoke-direct {v1, p0, v0}, Ll/֫᩺֫;-><init>(Ll/ܿ᩺֫;Ll/᩶ۨ֫;)V

    iget-object v0, p0, Ll/ܿ᩺֫;->ۨ:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    const/4 v0, 0x2

    if-ne v2, v0, :cond_3

    .line 559
    iget-boolean v0, p0, Ll/ܿ᩺֫;->ᩳ֫:Z

    if-nez v0, :cond_3

    .line 561
    iget-object v0, p0, Ll/ܿ᩺֫;->ۧ֫:Ll/ۡܳۧ;

    invoke-virtual {v0}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 562
    invoke-virtual {v0}, Ll/ۡܳۧ;->֫()V

    :cond_3
    :goto_0
    return-void
.end method

.method public final ۜ()J
    .locals 7

    .line 734
    iget-boolean v0, p0, Ll/ܿ᩺֫;->ᩳ֫:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    .line 736
    :cond_0
    invoke-direct {p0}, Ll/ܿ᩺֫;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 737
    iget-wide v0, p0, Ll/ܿ᩺֫;->ۘ֫:J

    return-wide v0

    .line 739
    :cond_1
    iget-wide v0, p0, Ll/ܿ᩺֫;->۟:J

    .line 740
    invoke-direct {p0}, Ll/ܿ᩺֫;->֡()Ll/᩶ۨ֫;

    move-result-object v2

    .line 742
    invoke-virtual {v2}, Ll/᩶ۨ֫;->᩷()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 744
    :cond_2
    iget-object v2, p0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_3

    const/4 v3, 0x2

    .line 0
    invoke-static {v2, v3}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 744
    check-cast v2, Ll/᩶ۨ֫;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    .line 746
    iget-wide v2, v2, Ll/۟ܽۧ;->ܽ:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 748
    :cond_4
    iget-boolean v2, p0, Ll/ܿ᩺֫;->۫֫:Z

    if-eqz v2, :cond_5

    .line 749
    iget-object v2, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_5

    aget-object v5, v2, v4

    .line 750
    invoke-virtual {v5}, Ll/ۘܽۧ;->ᩳ()J

    move-result-wide v5

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    return-wide v0
.end method

.method public final ۡ()Z
    .locals 2

    .line 623
    iget v0, p0, Ll/ܿ᩺֫;->ۚ֫:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()V
    .locals 3

    .line 267
    iget-boolean v0, p0, Ll/ܿ᩺֫;->᩵֫:Z

    if-nez v0, :cond_0

    .line 268
    new-instance v0, Ll/ۛۙ֫;

    invoke-direct {v0}, Ll/ۛۙ֫;-><init>()V

    iget-wide v1, p0, Ll/ܿ᩺֫;->۟:J

    invoke-virtual {v0, v1, v2}, Ll/ۛۙ֫;->ۧ(J)V

    invoke-virtual {v0}, Ll/ۛۙ֫;->֫()Ll/ۨۙ֫;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܿ᩺֫;->֫(Ll/ۨۙ֫;)Z

    :cond_0
    return-void
.end method

.method public final ۧ()J
    .locals 2

    .line 759
    invoke-direct {p0}, Ll/ܿ᩺֫;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 760
    iget-wide v0, p0, Ll/ܿ᩺֫;->ۘ֫:J

    return-wide v0

    .line 762
    :cond_0
    iget-boolean v0, p0, Ll/ܿ᩺֫;->ᩳ֫:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_1
    invoke-direct {p0}, Ll/ܿ᩺֫;->֡()Ll/᩶ۨ֫;

    move-result-object v0

    iget-wide v0, v0, Ll/۟ܽۧ;->ܽ:J

    return-wide v0
.end method

.method public final ۧ(J)V
    .locals 5

    .line 871
    iget-object v0, p0, Ll/ܿ᩺֫;->ۧ֫:Ll/ۡܳۧ;

    invoke-virtual {v0}, Ll/ۡܳۧ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-direct {p0}, Ll/ܿ᩺֫;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 875
    :cond_0
    invoke-virtual {v0}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v1

    iget-object v2, p0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    iget-object v3, p0, Ll/ܿ᩺֫;->۠֫:Ljava/util/List;

    if-eqz v1, :cond_1

    .line 876
    iget-object v1, p0, Ll/ܿ᩺֫;->ܽ֫:Ll/۟ܽۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 877
    iget-object v1, p0, Ll/ܿ᩺֫;->ܽ֫:Ll/۟ܽۧ;

    invoke-virtual {v2, p1, p2, v1, v3}, Ll/ܶۨ֫;->֫(JLl/۟ܽۧ;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 878
    invoke-virtual {v0}, Ll/ۡܳۧ;->֫()V

    return-void

    .line 883
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-lez v0, :cond_2

    add-int/lit8 v1, v0, -0x1

    .line 885
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۨ֫;

    invoke-virtual {v2, v1}, Ll/ܶۨ֫;->֫(Ll/᩶ۨ֫;)I

    move-result v1

    const/4 v4, 0x2

    if-ne v1, v4, :cond_2

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 889
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 890
    invoke-direct {p0, v0}, Ll/ܿ᩺֫;->ܳ(I)V

    .line 893
    :cond_3
    invoke-virtual {v2, p1, p2, v3}, Ll/ܶۨ֫;->֫(JLjava/util/List;)I

    move-result p1

    .line 894
    iget-object p2, p0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_4

    .line 895
    invoke-direct {p0, p1}, Ll/ܿ᩺֫;->ܳ(I)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final ۧ(I)Z
    .locals 1

    .line 640
    invoke-direct {p0}, Ll/ܿ᩺֫;->ۚ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Ll/ܿ᩺֫;->ᩳ֫:Z

    invoke-virtual {p1, v0}, Ll/ۘܽۧ;->֫(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(JZ)Z
    .locals 11

    .line 498
    iput-wide p1, p0, Ll/ܿ᩺֫;->۟:J

    .line 499
    invoke-direct {p0}, Ll/ܿ᩺֫;->ۚ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 501
    iput-wide p1, p0, Ll/ܿ᩺֫;->ۘ֫:J

    return v1

    .line 507
    :cond_0
    iget-object v0, p0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    invoke-virtual {v0}, Ll/ܶۨ֫;->ܽ()Z

    move-result v0

    iget-object v2, p0, Ll/ܿ᩺֫;->ܳ֫:Ljava/util/ArrayList;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 508
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v0, v4, :cond_2

    .line 509
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩶ۨ֫;

    .line 510
    iget-wide v5, v4, Ll/۟ܽۧ;->ܿ:J

    cmp-long v7, v5, p1

    if-nez v7, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 519
    :goto_1
    iget-boolean v0, p0, Ll/ܿ᩺֫;->۫֫:Z

    if-eqz v0, :cond_9

    if-nez p3, :cond_9

    .line 521
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_9

    .line 1563
    iget-object p3, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length p3, p3

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p3, :cond_8

    .line 1565
    iget-object v5, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object v5, v5, v0

    if-eqz v4, :cond_3

    .line 1568
    invoke-virtual {v4, v0}, Ll/᩶ۨ֫;->֫(I)I

    move-result v6

    invoke-virtual {v5, v6}, Ll/ۘܽۧ;->ۧ(I)Z

    move-result v5

    goto :goto_5

    .line 1570
    :cond_3
    invoke-virtual {p0}, Ll/ܿ᩺֫;->ۧ()J

    move-result-wide v6

    const-wide/high16 v8, -0x8000000000000000L

    cmp-long v10, v6, v8

    if-eqz v10, :cond_5

    cmp-long v8, p1, v6

    if-gez v8, :cond_4

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v6, 0x1

    .line 1573
    :goto_4
    invoke-virtual {v5, p1, p2, v6}, Ll/ۘܽۧ;->ۧ(JZ)Z

    move-result v5

    :goto_5
    if-nez v5, :cond_7

    .line 1579
    iget-object v5, p0, Ll/ܿ᩺֫;->᩶֫:[Z

    aget-boolean v5, v5, v0

    if-nez v5, :cond_6

    iget-boolean v5, p0, Ll/ܿ᩺֫;->᩺:Z

    if-nez v5, :cond_7

    :cond_6
    const/4 p3, 0x0

    goto :goto_6

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_8
    const/4 p3, 0x1

    :goto_6
    if-eqz p3, :cond_9

    return v3

    .line 527
    :cond_9
    iput-wide p1, p0, Ll/ܿ᩺֫;->ۘ֫:J

    .line 528
    iput-boolean v3, p0, Ll/ܿ᩺֫;->ᩳ֫:Z

    .line 529
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 530
    iget-object p1, p0, Ll/ܿ᩺֫;->ۧ֫:Ll/ۡܳۧ;

    invoke-virtual {p1}, Ll/ۡܳۧ;->ᩳ()Z

    move-result p2

    if-eqz p2, :cond_b

    .line 531
    iget-boolean p2, p0, Ll/ܿ᩺֫;->۫֫:Z

    if-eqz p2, :cond_a

    .line 533
    iget-object p2, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length p3, p2

    :goto_7
    if-ge v3, p3, :cond_a

    aget-object v0, p2, v3

    .line 534
    invoke-virtual {v0}, Ll/ۘܽۧ;->֫()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    .line 537
    :cond_a
    invoke-virtual {p1}, Ll/ۡܳۧ;->֫()V

    return v1

    .line 539
    :cond_b
    invoke-virtual {p1}, Ll/ۡܳۧ;->ۧ()V

    .line 540
    invoke-direct {p0}, Ll/ܿ᩺֫;->۠()V

    return v1
.end method

.method public final ܳ()V
    .locals 2

    const/4 v0, 0x1

    .line 1240
    iput-boolean v0, p0, Ll/ܿ᩺֫;->֫ۧ:Z

    .line 1241
    iget-object v0, p0, Ll/ܿ᩺֫;->ۨ:Landroid/os/Handler;

    iget-object v1, p0, Ll/ܿ᩺֫;->ۡ֫:Ll/ܰۨ֫;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ܺ()V
    .locals 2

    .line 649
    iget-object v0, p0, Ll/ܿ᩺֫;->ۧ֫:Ll/ۡܳۧ;

    const/high16 v1, -0x80000000

    .line 341
    invoke-virtual {v0, v1}, Ll/ۡܳۧ;->֫(I)V

    .line 650
    iget-object v0, p0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    invoke-virtual {v0}, Ll/ܶۨ֫;->ᩳ()V

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    .line 644
    invoke-virtual {p0}, Ll/ܿ᩺֫;->ܺ()V

    .line 645
    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Ll/ۘܽۧ;->ۡ()V

    return-void
.end method

.method public final ܽ(J)V
    .locals 4

    .line 1270
    iget-wide v0, p0, Ll/ܿ᩺֫;->᩸֫:J

    cmp-long v2, v0, p1

    if-eqz v2, :cond_0

    .line 1271
    iput-wide p1, p0, Ll/ܿ᩺֫;->᩸֫:J

    .line 1272
    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 1273
    invoke-virtual {v3, p1, p2}, Ll/ۘܽۧ;->ۧ(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 294
    invoke-virtual {p0}, Ll/ܿ᩺֫;->ܺ()V

    .line 295
    iget-boolean v0, p0, Ll/ܿ᩺֫;->ᩳ֫:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ܿ᩺֫;->᩵֫:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Loading finished before preparation is complete."

    const/4 v1, 0x0

    .line 296
    invoke-static {v0, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩳ()V
    .locals 4

    .line 583
    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 584
    invoke-virtual {v3}, Ll/ۘܽۧ;->ۘ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩳ(I)V
    .locals 2

    .line 329
    invoke-direct {p0}, Ll/ܿ᩺֫;->᩵()V

    .line 330
    iget-object v0, p0, Ll/ܿ᩺֫;->᩺֫:[I

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    iget-object v0, p0, Ll/ܿ᩺֫;->᩺֫:[I

    aget p1, v0, p1

    .line 332
    iget-object v0, p0, Ll/ܿ᩺֫;->ۤ֫:[Z

    aget-boolean v0, v0, p1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 333
    iget-object v0, p0, Ll/ܿ᩺֫;->ۤ֫:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, p1

    return-void
.end method

.method public final ᩴ()V
    .locals 4

    .line 567
    iget-boolean v0, p0, Ll/ܿ᩺֫;->᩵֫:Z

    if-eqz v0, :cond_0

    .line 570
    iget-object v0, p0, Ll/ܿ᩺֫;->۬֫:[Ll/ᩳ᩺֫;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 571
    invoke-virtual {v3}, Ll/ۘܽۧ;->ۖ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 574
    :cond_0
    iget-object v0, p0, Ll/ܿ᩺֫;->᩶:Ll/ܶۨ֫;

    invoke-virtual {v0}, Ll/ܶۨ֫;->ܿ()V

    .line 575
    iget-object v0, p0, Ll/ܿ᩺֫;->ۧ֫:Ll/ۡܳۧ;

    invoke-virtual {v0, p0}, Ll/ۡܳۧ;->֫(Ll/ۜܳۧ;)V

    .line 576
    iget-object v0, p0, Ll/ܿ᩺֫;->ۨ:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 577
    iput-boolean v0, p0, Ll/ܿ᩺֫;->ܶ֫:Z

    .line 578
    iget-object v0, p0, Ll/ܿ᩺֫;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ᩷()V
    .locals 2

    .line 1253
    iget-object v0, p0, Ll/ܿ᩺֫;->ۨ:Landroid/os/Handler;

    iget-object v1, p0, Ll/ܿ᩺֫;->ܿ֫:Ll/᩺ۨ֫;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ᩻()Ll/ۛܽۧ;
    .locals 1

    .line 302
    invoke-direct {p0}, Ll/ܿ᩺֫;->᩵()V

    .line 303
    iget-object v0, p0, Ll/ܿ᩺֫;->ܰ֫:Ll/ۛܽۧ;

    return-object v0
.end method
