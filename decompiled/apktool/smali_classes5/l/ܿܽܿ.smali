.class public final Ll/ܿܽܿ;
.super Ll/ۗۤᩳ;
.source "35OM"


# static fields
.field public static final ۗ֫:[B


# instance fields
.field public ֡֫:Z

.field public ֨֫:Z

.field public volatile ۖ֫:Ljava/lang/Throwable;

.field public ۘ֫:Ll/᩷۟ᩳ;

.field public ۙ֫:I

.field public ۚ֫:I

.field public ۠֫:Ll/ۙ۟ᩳ;

.field public volatile ܶ֫:Ll/᩷۟ᩳ;

.field public final ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ᩵֫:Ljava/util/concurrent/locks/ReentrantLock;

.field public ᩶֫:Ll/᩷۟ᩳ;

.field public volatile ᩸֫:Ll/ۧܽܿ;

.field public ᩹֫:Ll/᩷۟ᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x80

    new-array v0, v0, [B

    const-string v1, " !?;,=|>\t"

    .line 1350
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-char v5, v1, v4

    const/4 v6, 0x1

    aput-byte v6, v0, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const-string v1, "+-*/."

    .line 1351
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    array-length v2, v1

    :goto_1
    if-ge v3, v2, :cond_1

    aget-char v4, v1, v3

    const/4 v5, 0x2

    aput-byte v5, v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1346
    :cond_1
    sput-object v0, Ll/ܿܽܿ;->ۗ֫:[B

    return-void
.end method

.method public constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;Ll/۬ۜܽ;)V
    .locals 0

    .line 96
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۗۤᩳ;-><init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;Ll/۬ۜܽ;)V

    .line 26
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Ll/ܿܽܿ;->᩵֫:Ljava/util/concurrent/locks/ReentrantLock;

    .line 30
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p3, 0x0

    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 32
    iput-boolean p3, p0, Ll/ܿܽܿ;->֨֫:Z

    .line 362
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ll/ܿܽܿ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1102
    new-instance p1, Ll/᩷۟ᩳ;

    invoke-direct {p1}, Ll/᩷۟ᩳ;-><init>()V

    iput-object p1, p0, Ll/ܿܽܿ;->᩹֫:Ll/᩷۟ᩳ;

    .line 1103
    new-instance p1, Ll/᩷۟ᩳ;

    invoke-direct {p1}, Ll/᩷۟ᩳ;-><init>()V

    iput-object p1, p0, Ll/ܿܽܿ;->᩶֫:Ll/᩷۟ᩳ;

    .line 97
    invoke-virtual {p4}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    iput p1, p0, Ll/ܿܽܿ;->ۙ֫:I

    .line 98
    invoke-virtual {p4}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    iput p1, p0, Ll/ܿܽܿ;->ۚ֫:I

    .line 99
    invoke-virtual {p4}, Ll/۬ۜܽ;->ܳ()Z

    move-result p1

    iput-boolean p1, p0, Ll/ܿܽܿ;->֡֫:Z

    .line 100
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܽ()V

    .line 101
    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iput-object p1, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    .line 102
    invoke-virtual {p0, p2}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;)V

    .line 103
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    return-void
.end method

.method public constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;Z)V
    .locals 7

    const/4 v5, -0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 83
    invoke-direct/range {v0 .. v6}, Ll/ܿܽܿ;-><init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;ZILl/۟᩸ᩳ;)V

    return-void
.end method

.method public constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;ZILl/ۗ۟ᩳ;Ll/ۡۨᩳ;Ll/۟᩸ᩳ;)V
    .locals 1

    .line 57
    invoke-direct {p0, p1, p3}, Ll/ۗۤᩳ;-><init>(Ll/۫ۨᩳ;Ll/᩺֫ܿ;)V

    .line 26
    new-instance p3, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p3}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p3, p0, Ll/ܿܽܿ;->᩵֫:Ljava/util/concurrent/locks/ReentrantLock;

    .line 30
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p3, p0, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 32
    iput-boolean v0, p0, Ll/ܿܽܿ;->֨֫:Z

    .line 362
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p3, p0, Ll/ܿܽܿ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1102
    new-instance p3, Ll/᩷۟ᩳ;

    invoke-direct {p3}, Ll/᩷۟ᩳ;-><init>()V

    iput-object p3, p0, Ll/ܿܽܿ;->᩹֫:Ll/᩷۟ᩳ;

    .line 1103
    new-instance p3, Ll/᩷۟ᩳ;

    invoke-direct {p3}, Ll/᩷۟ᩳ;-><init>()V

    iput-object p3, p0, Ll/ܿܽܿ;->᩶֫:Ll/᩷۟ᩳ;

    .line 58
    iput p5, p0, Ll/ۗۤᩳ;->ۨ:I

    if-eqz p8, :cond_0

    .line 59
    invoke-virtual {p8}, Ll/۟᩸ᩳ;->֫()Ll/۟᩸ᩳ;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;Ll/۟᩸ᩳ;)V

    .line 61
    :cond_0
    :try_start_0
    iput-boolean p4, p0, Ll/ܿܽܿ;->֡֫:Z

    .line 62
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܽ()V

    .line 63
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result p1

    iput p1, p0, Ll/ܿܽܿ;->ۙ֫:I

    .line 64
    invoke-virtual {p0, p2}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;)V

    .line 65
    invoke-virtual {p6, p0, p7}, Ll/ۗ۟ᩳ;->֫(Ll/ۗۤᩳ;Ljava/util/function/BooleanSupplier;)Ll/ۙ۟ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ܿܽܿ;->۠֫:Ll/ۙ۟ᩳ;

    .line 66
    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iput-object p1, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    .line 67
    invoke-virtual {p0}, Ll/ܿܽܿ;->᩺()I

    move-result p1

    iput p1, p0, Ll/ۗۤᩳ;->ۙ:I

    .line 69
    iget p1, p0, Ll/ܿܽܿ;->ۙ֫:I

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۜ()I

    move-result p2

    sub-int/2addr p1, p2

    iget-object p2, p6, Ll/ۗ۟ᩳ;->֫:Ll/ۗۤᩳ;

    check-cast p2, Ll/ܿܽܿ;

    iget p2, p2, Ll/ܿܽܿ;->ۚ֫:I

    if-eq p1, p2, :cond_1

    const/4 p1, 0x0

    .line 70
    iput-object p1, p0, Ll/ܿܽܿ;->۠֫:Ll/ۙ۟ᩳ;

    .line 72
    :cond_1
    invoke-direct {p0, v0}, Ll/ܿܽܿ;->ۧ(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    iget-boolean p1, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    iget-boolean p2, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez p2, :cond_3

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    .line 75
    :cond_3
    throw p1
.end method

.method public constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;ZILl/۟᩸ᩳ;)V
    .locals 1

    .line 87
    invoke-direct {p0, p1, p3}, Ll/ۗۤᩳ;-><init>(Ll/۫ۨᩳ;Ll/᩺֫ܿ;)V

    .line 26
    new-instance p3, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p3}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p3, p0, Ll/ܿܽܿ;->᩵֫:Ljava/util/concurrent/locks/ReentrantLock;

    .line 30
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p3, p0, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 32
    iput-boolean v0, p0, Ll/ܿܽܿ;->֨֫:Z

    .line 362
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p3, p0, Ll/ܿܽܿ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1102
    new-instance p3, Ll/᩷۟ᩳ;

    invoke-direct {p3}, Ll/᩷۟ᩳ;-><init>()V

    iput-object p3, p0, Ll/ܿܽܿ;->᩹֫:Ll/᩷۟ᩳ;

    .line 1103
    new-instance p3, Ll/᩷۟ᩳ;

    invoke-direct {p3}, Ll/᩷۟ᩳ;-><init>()V

    iput-object p3, p0, Ll/ܿܽܿ;->᩶֫:Ll/᩷۟ᩳ;

    .line 88
    iput p5, p0, Ll/ۗۤᩳ;->ۨ:I

    if-eqz p6, :cond_0

    .line 89
    invoke-virtual {p6}, Ll/۟᩸ᩳ;->֫()Ll/۟᩸ᩳ;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;Ll/۟᩸ᩳ;)V

    .line 90
    :cond_0
    iput-boolean p4, p0, Ll/ܿܽܿ;->֡֫:Z

    .line 91
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result p1

    iput p1, p0, Ll/ܿܽܿ;->ۙ֫:I

    .line 92
    invoke-virtual {p0, p2}, Ll/ܿܽܿ;->ۧ(Ll/۟᩺ᩳ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷۟ᩳ;I)I
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿܽܿ;->ۧ(Ll/᩷۟ᩳ;I)I

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/᩷۟ᩳ;Ll/᩷ܽܿ;ILl/ᩳܽܿ;Ljava/util/function/BooleanSupplier;)Ll/᩷۟ᩳ;
    .locals 18

    move-object/from16 v0, p1

    .line 754
    new-instance v11, Ll/᩷۟ᩳ;

    invoke-direct {v11}, Ll/᩷۟ᩳ;-><init>()V

    .line 755
    invoke-virtual/range {p2 .. p2}, Ll/᩷ܽܿ;->ܽ()Ljava/util/List;

    move-result-object v12

    .line 756
    invoke-virtual/range {p1 .. p1}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v13

    .line 757
    new-instance v14, Ll/ۨܰᩳ;

    invoke-direct {v14}, Ll/ۨܰᩳ;-><init>()V

    const/4 v15, 0x0

    const/4 v1, 0x0

    .line 758
    :goto_0
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_9

    .line 759
    invoke-interface/range {p5 .. p5}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_6

    .line 760
    :cond_0
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢܽܿ;

    .line 761
    invoke-virtual {v2}, Ll/ۢܽܿ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 762
    invoke-virtual {v2}, Ll/ۢܽܿ;->ܿ()I

    move-result v3

    invoke-virtual {v0, v3}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v3

    invoke-virtual {v2}, Ll/ۢܽܿ;->ܳ()I

    move-result v4

    if-lt v3, v4, :cond_1

    .line 763
    invoke-virtual {v2}, Ll/ۢܽܿ;->ᩳ()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v3

    invoke-virtual {v2}, Ll/ۢܽܿ;->֫()I

    move-result v4

    if-gt v3, v4, :cond_1

    .line 765
    invoke-virtual {v2}, Ll/ۢܽܿ;->ܿ()I

    move-result v3

    invoke-virtual {v2}, Ll/ۢܽܿ;->ᩳ()I

    move-result v2

    invoke-virtual {v11, v3, v2, v0}, Ll/᩷۟ᩳ;->֫(IILl/᩷۟ᩳ;)V

    goto :goto_2

    .line 767
    :cond_1
    invoke-virtual {v2}, Ll/ۢܽܿ;->ܿ()I

    move-result v3

    :goto_1
    invoke-virtual {v2}, Ll/ۢܽܿ;->ᩳ()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 768
    invoke-virtual {v13, v3}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v4

    .line 770
    iget v5, v4, Ll/ۨܰᩳ;->᩶:I

    invoke-virtual {v2}, Ll/ۢܽܿ;->ܳ()I

    move-result v6

    if-lt v5, v6, :cond_2

    iget v5, v4, Ll/ۨܰᩳ;->᩸:I

    invoke-virtual {v2}, Ll/ۢܽܿ;->֫()I

    move-result v6

    if-le v5, v6, :cond_3

    .line 771
    :cond_2
    iget v5, v4, Ll/ۨܰᩳ;->᩶:I

    invoke-virtual {v2}, Ll/ۢܽܿ;->ܳ()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    iget v6, v4, Ll/ۨܰᩳ;->᩸:I

    invoke-virtual {v2}, Ll/ۢܽܿ;->֫()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    iget v7, v4, Ll/ۨܰᩳ;->᩹:I

    invoke-virtual {v4, v5, v6, v7}, Ll/ۨܰᩳ;->֫(III)V

    .line 772
    invoke-virtual {v4, v15}, Ll/ۨܰᩳ;->֫(Z)V

    .line 774
    :cond_3
    invoke-virtual {v11, v4}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 780
    :cond_5
    new-instance v3, Ll/᩷۟ᩳ;

    invoke-direct {v3}, Ll/᩷۟ᩳ;-><init>()V

    :goto_3
    add-int/lit8 v10, v1, 0x1

    .line 783
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢܽܿ;

    .line 784
    invoke-virtual {v1}, Ll/ۢܽܿ;->ܿ()I

    move-result v4

    :goto_4
    invoke-virtual {v1}, Ll/ۢܽܿ;->ᩳ()I

    move-result v5

    if-ge v4, v5, :cond_6

    .line 785
    invoke-virtual {v1}, Ll/ۢܽܿ;->ᩳ()I

    move-result v5

    invoke-virtual {v0, v4}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 786
    invoke-virtual {v0, v4}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v6

    invoke-virtual {v1}, Ll/ۢܽܿ;->ܳ()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/lit8 v7, v5, -0x1

    .line 787
    invoke-virtual {v0, v7}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v7

    invoke-virtual {v1}, Ll/ۢܽܿ;->֫()I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-virtual {v0, v4}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v4

    .line 786
    invoke-virtual {v14, v6, v7, v4}, Ll/ۨܰᩳ;->֫(III)V

    .line 788
    invoke-virtual {v3, v14}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    move v4, v5

    goto :goto_4

    .line 791
    :cond_6
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v4

    if-ge v10, v4, :cond_8

    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۢܽܿ;

    invoke-virtual {v4}, Ll/ۢܽܿ;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_5

    :cond_7
    move v1, v10

    goto :goto_3

    .line 792
    :cond_8
    :goto_5
    invoke-virtual {v3}, Ll/᩷۟ᩳ;->size()I

    move-result v4

    invoke-virtual {v2}, Ll/ۢܽܿ;->ۧ()Z

    move-result v6

    .line 793
    invoke-virtual {v1}, Ll/ۢܽܿ;->᩻()Z

    move-result v1

    xor-int/lit8 v16, v1, 0x1

    const/4 v9, 0x0

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v11

    move/from16 v5, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v17, v10

    move/from16 v10, v16

    .line 792
    invoke-static/range {v1 .. v10}, Ll/ܿܽܿ;->֫(Ljava/lang/CharSequence;Ll/᩷۟ᩳ;Ll/᩷۟ᩳ;IIZLl/ᩳܽܿ;Ljava/util/function/BooleanSupplier;Ll/ܽܽܿ;Z)V

    move/from16 v1, v17

    goto/16 :goto_0

    :cond_9
    :goto_6
    return-object v11
.end method

.method public static bridge synthetic ֫(Ll/ܰ᩸ᩳ;Ll/᩷۟ᩳ;Ll/᩷ܽܿ;ILl/ᩳܽܿ;Ll/᩺ۧܿ;)Ll/᩷۟ᩳ;
    .locals 0

    .line 0
    invoke-static/range {p0 .. p5}, Ll/ܿܽܿ;->֫(Ljava/lang/CharSequence;Ll/᩷۟ᩳ;Ll/᩷ܽܿ;ILl/ᩳܽܿ;Ljava/util/function/BooleanSupplier;)Ll/᩷۟ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ܿܽܿ;)Ll/᩷۟ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/᩷۟ᩳ;Ll/᩷ܽܿ;ILl/ᩳܽܿ;Ll/᩶ۧܿ;Ll/ܰ᩸ᩳ;)Ll/᩷۟ᩳ;
    .locals 6

    move-object v0, p5

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 657
    invoke-static/range {v0 .. v5}, Ll/ܿܽܿ;->֫(Ljava/lang/CharSequence;Ll/᩷۟ᩳ;Ll/᩷ܽܿ;ILl/ᩳܽܿ;Ljava/util/function/BooleanSupplier;)Ll/᩷۟ᩳ;

    move-result-object p0

    return-object p0
.end method

.method private ֫(IIILl/۟᩸ᩳ;)V
    .locals 25

    move-object/from16 v7, p0

    move/from16 v0, p1

    move/from16 v1, p3

    .line 1122
    iget-object v2, v7, Ll/ܿܽܿ;->᩹֫:Ll/᩷۟ᩳ;

    invoke-virtual {v2}, Ll/᩷۟ᩳ;->clear()V

    const/4 v3, 0x0

    .line 1125
    invoke-virtual {v7, v0, v3}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result v4

    .line 1127
    iget-object v5, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v5, v4}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v5

    invoke-virtual {v2, v5}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    const/4 v5, 0x1

    if-lez p2, :cond_1

    add-int v6, v0, p2

    .line 1130
    invoke-virtual {v7, v6, v3}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result v6

    .line 1131
    iget-object v8, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    add-int/lit8 v9, v4, 0x1

    add-int/lit8 v10, v6, 0x1

    invoke-virtual {v2, v9, v10, v8}, Ll/᩷۟ᩳ;->֫(IILl/᩷۟ᩳ;)V

    .line 228
    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v8

    .line 1133
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v9

    .line 1134
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->size()I

    move-result v10

    .line 1135
    iget v11, v9, Ll/ۨܰᩳ;->᩹:I

    iget v12, v8, Ll/ۨܰᩳ;->᩹:I

    sub-int/2addr v11, v12

    .line 1137
    iget v12, v9, Ll/ۨܰᩳ;->᩸:I

    sub-int v12, v12, p2

    .line 1138
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->size()I

    move-result v13

    if-ne v13, v5, :cond_0

    .line 1139
    new-instance v9, Ll/ۨܰᩳ;

    invoke-direct {v9}, Ll/ۨܰᩳ;-><init>()V

    .line 1142
    :cond_0
    iput v0, v8, Ll/ۨܰᩳ;->᩸:I

    .line 1143
    iput v0, v9, Ll/ۨܰᩳ;->᩶:I

    .line 1144
    iput v12, v9, Ll/ۨܰᩳ;->᩸:I

    .line 1145
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->clear()V

    .line 1146
    invoke-virtual {v2, v8}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    .line 1147
    invoke-virtual {v2, v9}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    goto :goto_0

    .line 228
    :cond_1
    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v5

    .line 1152
    new-instance v6, Ll/ۨܰᩳ;

    invoke-direct {v6}, Ll/ۨܰᩳ;-><init>()V

    .line 1153
    iput v0, v6, Ll/ۨܰᩳ;->᩶:I

    .line 1154
    iget v8, v5, Ll/ۨܰᩳ;->᩸:I

    iput v8, v6, Ll/ۨܰᩳ;->᩸:I

    .line 1156
    iput v0, v5, Ll/ۨܰᩳ;->᩸:I

    .line 1157
    invoke-virtual {v2, v3, v5}, Ll/᩷۟ᩳ;->ۧ(ILl/ۨܰᩳ;)V

    .line 1158
    invoke-virtual {v2, v6}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    const/4 v10, 0x1

    const/4 v11, 0x0

    move v6, v4

    :goto_0
    if-lez v1, :cond_5

    .line 228
    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v3

    .line 1165
    iget v3, v3, Ll/ۨܰᩳ;->᩹:I

    add-int v5, v0, v1

    .line 1168
    new-instance v8, Ll/ۨܰᩳ;

    invoke-direct {v8}, Ll/ۨܰᩳ;-><init>()V

    move-object/from16 v15, p4

    .line 1169
    invoke-virtual {v7, v15, v0, v5}, Ll/ۗۤᩳ;->֫(Ll/۟᩸ᩳ;II)Ll/᩺᩸ᩳ;

    move-result-object v9

    const/4 v12, 0x1

    :goto_1
    if-eqz v12, :cond_4

    .line 1171
    :try_start_0
    invoke-virtual {v9}, Ll/᩺᩸ᩳ;->֫()I

    move-result v13

    const/4 v14, -0x1

    if-eq v13, v14, :cond_2

    if-lt v13, v5, :cond_3

    :cond_2
    const/4 v12, 0x0

    move v13, v5

    .line 1176
    :cond_3
    invoke-virtual {v8, v0, v13, v3}, Ll/ۨܰᩳ;->֫(III)V

    .line 1177
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v0

    invoke-virtual {v2, v0, v8}, Ll/᩷۟ᩳ;->֫(ILl/ۨܰᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v13, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 1169
    :try_start_1
    invoke-virtual {v9}, Ll/᩺᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1

    .line 1181
    :cond_4
    invoke-virtual {v9}, Ll/᩺᩸ᩳ;->close()V

    .line 1182
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v0

    invoke-virtual {v2}, Ll/᩷۟ᩳ;->size()I

    move-result v3

    const/4 v5, 0x0

    invoke-virtual {v2, v0, v3, v1, v5}, Ll/᩷۟ᩳ;->֫(IIII)V

    goto :goto_3

    :cond_5
    move-object/from16 v15, p4

    .line 1188
    :goto_3
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v0

    .line 1189
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v3

    iput v3, v0, Ll/ۨܰᩳ;->᩹:I

    .line 1190
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v3

    invoke-virtual {v2, v3, v0}, Ll/᩷۟ᩳ;->ۧ(ILl/ۨܰᩳ;)V

    .line 1191
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v0

    iget v0, v0, Ll/ۨܰᩳ;->᩹:I

    const/4 v3, 0x0

    .line 228
    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v3

    .line 1191
    iget v3, v3, Ll/ۨܰᩳ;->᩹:I

    sub-int/2addr v0, v3

    .line 1196
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v3

    :goto_4
    if-ltz v3, :cond_8

    .line 1197
    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v5

    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v8

    if-ne v5, v8, :cond_7

    .line 1198
    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->᩻(I)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->ۜ(I)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    add-int/lit8 v5, v3, 0x1

    .line 1199
    invoke-virtual {v2, v3, v5}, Ll/᩷۟ᩳ;->֫(II)V

    :cond_7
    add-int/lit8 v3, v3, -0x1

    goto :goto_4

    :cond_8
    sub-int v1, v1, p2

    sub-int v3, v0, v11

    .line 1207
    iget-object v5, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v5, v4}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v5

    .line 1208
    iget-object v8, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v8, v4}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result v22

    if-eqz v3, :cond_a

    if-gez v3, :cond_9

    .line 1212
    iget-object v8, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    sub-int v9, v5, v3

    invoke-virtual {v8, v5, v9}, Ll/᩸ܰᩳ;->֫(II)V

    goto :goto_5

    .line 1214
    :cond_9
    iget-object v8, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v8, v5, v3}, Ll/᩸ܰᩳ;->ۧ(II)V

    .line 9843
    :cond_a
    :goto_5
    iget-object v14, v7, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    iget-boolean v8, v14, Ll/۫ۨᩳ;->ۜۧ:Z

    if-eqz v8, :cond_b

    .line 1218
    iget-object v0, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0, v4, v10, v2}, Ll/᩷۟ᩳ;->ۧ(IILl/᩷۟ᩳ;)V

    .line 1219
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->size()I

    move-result v0

    add-int/2addr v4, v0

    .line 1220
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->clear()V

    .line 1222
    iget-object v0, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v2

    invoke-virtual {v0, v4, v2, v1, v3}, Ll/᩷۟ᩳ;->֫(IIII)V

    return-void

    .line 1228
    :cond_b
    iget-object v13, v7, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-boolean v8, v13, Ll/᩺֫ܿ;->۫ۧ:Z

    if-eqz v8, :cond_c

    invoke-virtual {v7, v3}, Ll/ۗۤᩳ;->֫(I)I

    move-result v8

    iget v9, v7, Ll/ۗۤᩳ;->ۙ:I

    if-eq v8, v9, :cond_c

    .line 1229
    iget-object v6, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v6, v4, v10, v2}, Ll/᩷۟ᩳ;->ۧ(IILl/᩷۟ᩳ;)V

    .line 1230
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->size()I

    move-result v6

    add-int/2addr v4, v6

    .line 1231
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->clear()V

    .line 1233
    iget-object v2, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2}, Ll/᩷۟ᩳ;->size()I

    move-result v6

    invoke-virtual {v2, v4, v6, v1, v3}, Ll/᩷۟ᩳ;->֫(IIII)V

    .line 1235
    iput v8, v7, Ll/ۗۤᩳ;->ۙ:I

    const/4 v1, 0x1

    .line 1236
    invoke-direct {v7, v1}, Ll/ܿܽܿ;->ۧ(Z)V

    move/from16 p1, v5

    move-object/from16 v19, v13

    move-object/from16 v24, v14

    goto/16 :goto_a

    :cond_c
    if-lez v4, :cond_d

    .line 1240
    iget-object v8, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    add-int/lit8 v9, v4, -0x1

    invoke-virtual {v8, v9}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v8

    .line 1241
    iget v9, v8, Ll/ۨܰᩳ;->᩹:I

    const/4 v10, 0x0

    .line 228
    invoke-virtual {v2, v10}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v11

    .line 1241
    iget v11, v11, Ll/ۨܰᩳ;->᩹:I

    if-ne v9, v11, :cond_d

    .line 1242
    invoke-virtual {v2, v10, v8}, Ll/᩷۟ᩳ;->֫(ILl/ۨܰᩳ;)V

    add-int/lit8 v4, v4, -0x1

    .line 1248
    :cond_d
    iget-object v8, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v8, v6}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v8

    add-int/lit8 v6, v6, 0x1

    .line 1251
    iget-object v9, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v9}, Ll/᩷۟ᩳ;->size()I

    move-result v9

    if-ge v6, v9, :cond_e

    iget-object v9, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v9, v6}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v9

    if-ne v9, v8, :cond_e

    .line 1252
    iget-object v9, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v9, v6}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result v9

    add-int/lit8 v9, v9, 0x1

    move v12, v9

    goto :goto_6

    :cond_e
    move v12, v6

    :goto_6
    if-ge v6, v12, :cond_f

    .line 1254
    new-instance v9, Ll/ۨܰᩳ;

    iget-object v10, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v10, v6}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v10

    add-int/2addr v10, v1

    iget-object v11, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    move-object/from16 p1, v14

    add-int/lit8 v14, v12, -0x1

    .line 1255
    invoke-virtual {v11, v14}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v11

    add-int/2addr v11, v1

    add-int/2addr v8, v3

    invoke-direct {v9, v10, v11, v8}, Ll/ۨܰᩳ;-><init>(III)V

    .line 1254
    invoke-virtual {v2, v9}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    goto :goto_7

    :cond_f
    move-object/from16 p1, v14

    .line 1259
    :goto_7
    iget-object v14, v7, Ll/ܿܽܿ;->᩶֫:Ll/᩷۟ᩳ;

    invoke-virtual {v14}, Ll/᩷۟ᩳ;->clear()V

    .line 1260
    iget v8, v7, Ll/ܿܽܿ;->ۙ֫:I

    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result v9

    sub-int/2addr v8, v9

    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ۜ()I

    move-result v9

    sub-int v11, v8, v9

    iput v11, v7, Ll/ܿܽܿ;->ۚ֫:I

    .line 1261
    iget-object v8, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v8, v4}, Ll/᩷۟ᩳ;->᩻(I)Z

    move-result v23

    if-ge v6, v12, :cond_10

    .line 1263
    new-instance v8, Ll/ܽܽܿ;

    iget-object v9, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    move-object/from16 v16, v8

    move-object/from16 v17, v9

    move/from16 v18, v6

    move/from16 v19, v12

    move/from16 v20, v1

    move/from16 v21, v3

    invoke-direct/range {v16 .. v21}, Ll/ܽܽܿ;-><init>(Ll/᩷۟ᩳ;IIII)V

    goto :goto_8

    :cond_10
    const/4 v8, 0x0

    :goto_8
    move-object v6, v8

    .line 1264
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->size()I

    move-result v16

    new-instance v17, Ll/ᩳܽܿ;

    iget-boolean v10, v7, Ll/ܿܽܿ;->֡֫:Z

    .line 1265
    invoke-virtual {v13}, Ll/᩺֫ܿ;->۠()I

    move-result v18

    .line 1266
    invoke-virtual/range {p0 .. p0}, Ll/ܿܽܿ;->֨()Z

    move-result v19

    .line 1094
    iget-boolean v9, v7, Ll/ܿܽܿ;->֡֫:Z

    move-object/from16 v8, v17

    move/from16 v20, v9

    move-object v9, v13

    move/from16 v21, v11

    move/from16 v11, v18

    move/from16 v18, v12

    move/from16 v12, v19

    move-object/from16 v19, v13

    move/from16 v13, v20

    .line 1266
    invoke-direct/range {v8 .. v13}, Ll/ᩳܽܿ;-><init>(Ll/ۢ۫ۡ;ZIZZ)V

    new-instance v13, Ll/ۤۧܿ;

    invoke-direct {v13, v7}, Ll/ۤۧܿ;-><init>(Ll/ܿܽܿ;)V

    const/16 v20, 0x0

    move-object/from16 v8, p4

    move-object v9, v2

    move-object v10, v14

    move/from16 v11, v16

    move/from16 v12, v21

    move-object/from16 v16, v13

    move/from16 v13, v23

    move-object/from16 v24, p1

    move/from16 p1, v5

    move-object v5, v14

    move-object/from16 v14, v17

    move-object/from16 v15, v16

    move-object/from16 v16, v6

    move/from16 v17, v20

    .line 878
    invoke-static/range {v8 .. v17}, Ll/ܿܽܿ;->֫(Ljava/lang/CharSequence;Ll/᩷۟ᩳ;Ll/᩷۟ᩳ;IIZLl/ᩳܽܿ;Ljava/util/function/BooleanSupplier;Ll/ܽܽܿ;Z)V

    if-nez v6, :cond_11

    move/from16 v12, v18

    goto :goto_9

    .line 1268
    :cond_11
    invoke-static {v6}, Ll/ܽܽܿ;->֫(Ll/ܽܽܿ;)I

    move-result v12

    .line 1269
    :goto_9
    iget-object v6, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    sub-int/2addr v12, v4

    invoke-virtual {v6, v4, v12, v5}, Ll/᩷۟ᩳ;->ۧ(IILl/᩷۟ᩳ;)V

    .line 1271
    invoke-virtual {v5}, Ll/᩷۟ᩳ;->size()I

    move-result v6

    add-int/2addr v6, v4

    .line 1272
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->clear()V

    .line 1273
    invoke-virtual {v5}, Ll/᩷۟ᩳ;->clear()V

    .line 1274
    iget-object v2, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2}, Ll/᩷۟ᩳ;->size()I

    move-result v4

    invoke-virtual {v2, v6, v4, v1, v3}, Ll/᩷۟ᩳ;->֫(IIII)V

    .line 1276
    :goto_a
    invoke-virtual/range {v19 .. v19}, Ll/ۢ۫ۡ;->ۡ()I

    move-result v8

    const/4 v1, 0x0

    move/from16 v1, v22

    const/4 v9, 0x0

    :goto_b
    if-gt v9, v0, :cond_12

    add-int v2, p1, v9

    .line 1280
    iget-object v3, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v3, v2, v1}, Ll/᩷۟ᩳ;->ᩳ(II)I

    move-result v10

    .line 1281
    iget-object v1, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    iget-object v3, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v3, v10}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v5

    move-object/from16 v3, p0

    move-object/from16 v4, p4

    move/from16 v11, p1

    move v6, v8

    invoke-virtual/range {v1 .. v6}, Ll/᩸ܰᩳ;->֫(ILl/ۗۤᩳ;Ll/۟᩸ᩳ;II)V

    add-int/lit8 v9, v9, 0x1

    move v1, v10

    goto :goto_b

    :cond_12
    move/from16 v11, p1

    add-int v5, v11, v0

    add-int/lit8 v0, v5, 0x1

    move-object/from16 v1, v24

    .line 1286
    iget-object v1, v1, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    iget-object v1, v1, Ll/ۜܺܿ;->ܽ:Ll/᩻ܺܿ;

    .line 1287
    iget-boolean v2, v1, Ll/᩻ܺܿ;->ܽ:Z

    if-eqz v2, :cond_15

    .line 1288
    iget v2, v1, Ll/᩻ܺܿ;->ۧ:I

    invoke-virtual {v7, v2}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v2

    .line 1289
    iget v1, v1, Ll/᩻ܺܿ;->֫:I

    invoke-virtual {v7, v1}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v1

    .line 568
    iget-object v3, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v3, v2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v2

    iget-object v3, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v3, v1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v1

    .line 1294
    iget v2, v2, Ll/ۨܰᩳ;->᩹:I

    invoke-static {v11, v2}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 1295
    iget v1, v1, Ll/ۨܰᩳ;->᩹:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v10

    move v1, v9

    move v12, v1

    :goto_c
    if-ge v12, v11, :cond_13

    .line 1299
    iget-object v2, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, v12, v1}, Ll/᩷۟ᩳ;->ᩳ(II)I

    move-result v13

    .line 1300
    iget-object v1, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    iget-object v2, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, v13}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v5

    move v2, v12

    move-object/from16 v3, p0

    move-object/from16 v4, p4

    move v6, v8

    invoke-virtual/range {v1 .. v6}, Ll/᩸ܰᩳ;->֫(ILl/ۗۤᩳ;Ll/۟᩸ᩳ;II)V

    add-int/lit8 v12, v12, 0x1

    move v1, v13

    goto :goto_c

    .line 1303
    :cond_13
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_d
    if-ge v0, v10, :cond_14

    .line 1305
    iget-object v2, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, v0, v1}, Ll/᩷۟ᩳ;->ᩳ(II)I

    move-result v11

    .line 1306
    iget-object v1, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    iget-object v2, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, v11}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v5

    move v2, v0

    move-object/from16 v3, p0

    move-object/from16 v4, p4

    move v6, v8

    invoke-virtual/range {v1 .. v6}, Ll/᩸ܰᩳ;->֫(ILl/ۗۤᩳ;Ll/۟᩸ᩳ;II)V

    add-int/lit8 v0, v0, 0x1

    move v1, v11

    goto :goto_d

    :cond_14
    move v5, v9

    move v0, v10

    goto :goto_e

    :cond_15
    move v5, v11

    .line 1313
    :goto_e
    iget-object v1, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v1, v5, v0}, Ll/᩸ܰᩳ;->ᩳ(II)V

    return-void
.end method

.method private ֫(IILl/᩷۟ᩳ;)V
    .locals 0

    .line 744
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 745
    invoke-virtual {p3}, Ll/᩷۟ᩳ;->size()I

    .line 746
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 747
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/᩷۟ᩳ;Ll/ۜ۟ᩳ;IIZLl/ᩳܽܿ;Ljava/util/function/BooleanSupplier;Ll/ܽܽܿ;Z)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p8

    .line 898
    invoke-static/range {p6 .. p6}, Ll/ᩳܽܿ;->ᩳ(Ll/ᩳܽܿ;)Ll/ۢ۫ۡ;

    move-result-object v5

    .line 899
    instance-of v6, v0, Ll/ܰ᩸ᩳ;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    move-object v6, v0

    check-cast v6, Ll/ܰ᩸ᩳ;

    goto :goto_0

    :cond_0
    move-object v6, v7

    :goto_0
    if-nez v6, :cond_1

    goto :goto_1

    .line 900
    :cond_1
    invoke-virtual {v5}, Ll/ۢ۫ۡ;->֫()[F

    move-result-object v7

    .line 902
    :goto_1
    new-instance v8, Ll/ۨܰᩳ;

    invoke-direct {v8}, Ll/ۨܰᩳ;-><init>()V

    .line 905
    invoke-static/range {p6 .. p6}, Ll/ᩳܽܿ;->ܽ(Ll/ᩳܽܿ;)Z

    move-result v9

    .line 907
    invoke-static/range {p6 .. p6}, Ll/ᩳܽܿ;->֫(Ll/ᩳܽܿ;)I

    move-result v10

    const/4 v11, 0x0

    move/from16 v11, p5

    const/4 v12, 0x0

    :goto_2
    if-ge v12, v3, :cond_39

    .line 909
    invoke-interface/range {p7 .. p7}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v13

    if-eqz v13, :cond_2

    goto/16 :goto_1a

    .line 910
    :cond_2
    invoke-virtual {v1, v12}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result v13

    add-int/lit8 v13, v13, 0x1

    invoke-static {v3, v13}, Ljava/lang/Math;->min(II)I

    move-result v13

    .line 911
    invoke-virtual {v1, v12}, Ll/᩷۟ᩳ;->ۡ(I)I

    move-result v14

    move/from16 v15, p4

    int-to-float v3, v15

    if-nez v11, :cond_4

    .line 916
    invoke-static/range {p6 .. p6}, Ll/ᩳܽܿ;->ܿ(Ll/ᩳܽܿ;)Z

    move-result v16

    move/from16 p5, v11

    if-eqz v16, :cond_3

    int-to-float v11, v10

    sub-float/2addr v3, v11

    :cond_3
    const/4 v11, 0x1

    goto :goto_3

    :cond_4
    move/from16 p5, v11

    .line 920
    :goto_3
    invoke-static/range {p6 .. p6}, Ll/ᩳܽܿ;->ۧ(Ll/ᩳܽܿ;)Z

    move-result v16

    if-eqz v16, :cond_5

    move/from16 v16, v11

    int-to-float v11, v10

    sub-float v11, v3, v11

    goto :goto_4

    :cond_5
    move/from16 v16, v11

    move v11, v3

    .line 922
    :goto_4
    invoke-virtual {v1, v12}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v12

    move/from16 v17, v3

    add-int/lit8 v3, v13, -0x1

    .line 923
    invoke-virtual {v1, v3}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v3

    move/from16 v19, p3

    move/from16 v18, p5

    move v1, v12

    :goto_5
    const/16 v20, 0x0

    const/16 v21, 0x0

    move v4, v1

    move/from16 v20, v4

    move/from16 p5, v12

    move/from16 v15, v19

    const/4 v12, 0x0

    move/from16 v19, v20

    :goto_6
    if-ge v4, v3, :cond_35

    .line 930
    sget-object v22, Ll/ܿܽܿ;->ۗ֫:[B

    if-eqz v6, :cond_16

    move/from16 v23, v10

    add-int/lit8 v10, v4, 0x1

    if-ge v10, v3, :cond_15

    .line 931
    invoke-virtual {v6, v4}, Ll/ܰ᩸ᩳ;->ۧ(I)[C

    move-result-object v10

    .line 932
    invoke-virtual {v6}, Ll/ܰ᩸ᩳ;->ۧ()I

    move-result v24

    add-int/lit8 v2, v3, -0x1

    .line 934
    invoke-virtual {v6}, Ll/ܰ᩸ᩳ;->֫()I

    move-result v25

    move-object/from16 v26, v6

    add-int/lit8 v6, v25, -0x1

    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    sub-int/2addr v2, v4

    rsub-int v6, v12, 0x100

    .line 935
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/2addr v2, v4

    move v6, v4

    :goto_7
    if-ge v6, v2, :cond_10

    sub-int v25, v6, v24

    move-object/from16 v27, v8

    .line 938
    aget-char v8, v10, v25

    move/from16 v28, v14

    const/16 v14, 0x7f

    if-gt v8, v14, :cond_11

    const/16 v14, 0x9

    if-ne v8, v14, :cond_6

    goto/16 :goto_a

    :cond_6
    add-int/lit8 v25, v25, 0x1

    .line 940
    aget-char v14, v10, v25

    move-object/from16 v25, v10

    const v10, 0xfe0f

    if-eq v14, v10, :cond_7

    const/16 v10, 0x20e3

    if-ne v14, v10, :cond_9

    .line 942
    :cond_7
    sget v10, Ll/ۛ۬ۡ;->֫:I

    const/16 v10, 0x30

    if-gt v10, v8, :cond_8

    const/16 v10, 0x39

    if-le v8, v10, :cond_11

    :cond_8
    const/16 v10, 0x23

    if-eq v8, v10, :cond_11

    const/16 v10, 0x2a

    if-ne v8, v10, :cond_9

    goto :goto_a

    .line 944
    :cond_9
    aget v10, v7, v8

    add-float v10, v21, v10

    if-eq v1, v6, :cond_a

    cmpl-float v29, v10, v17

    if-lez v29, :cond_a

    goto :goto_a

    :cond_a
    add-int/lit8 v6, v6, 0x1

    cmpg-float v21, v10, v11

    if-gtz v21, :cond_f

    if-eqz v9, :cond_d

    .line 951
    aget-byte v8, v22, v8

    move/from16 v21, v6

    const/4 v6, 0x1

    if-eq v8, v6, :cond_c

    const/4 v6, 0x2

    if-ne v8, v6, :cond_e

    const/16 v6, 0x80

    if-ge v14, v6, :cond_b

    const/16 v6, 0x30

    if-lt v14, v6, :cond_c

    const/16 v6, 0x39

    if-le v14, v6, :cond_e

    goto :goto_8

    .line 953
    :cond_b
    invoke-static {v14}, Ljava/lang/Character;->isDigit(C)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_c
    :goto_8
    move/from16 v19, v21

    move/from16 v20, v19

    goto :goto_9

    :cond_d
    move/from16 v21, v6

    :cond_e
    move/from16 v20, v21

    goto :goto_9

    :cond_f
    move/from16 v21, v6

    :goto_9
    move/from16 v6, v21

    move-object/from16 v8, v27

    move/from16 v14, v28

    move/from16 v21, v10

    move-object/from16 v10, v25

    goto :goto_7

    :cond_10
    move-object/from16 v27, v8

    move/from16 v28, v14

    :cond_11
    :goto_a
    sub-int v8, v6, v4

    add-int/2addr v8, v12

    const/16 v10, 0x100

    if-ne v8, v10, :cond_13

    .line 959
    invoke-interface/range {p7 .. p7}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v8

    if-eqz v8, :cond_12

    goto/16 :goto_1a

    :cond_12
    const/4 v8, 0x0

    const/4 v12, 0x0

    goto :goto_b

    :cond_13
    move v12, v8

    :goto_b
    if-eq v6, v4, :cond_14

    if-ne v6, v2, :cond_14

    move-object/from16 v24, v5

    move v4, v6

    move v2, v15

    move/from16 v5, v19

    move/from16 v6, v21

    move/from16 v21, v23

    move-object/from16 v10, v27

    move/from16 v14, v28

    move-object/from16 v15, p2

    move-object/from16 v19, v7

    goto/16 :goto_19

    :cond_14
    move v4, v6

    goto :goto_d

    :cond_15
    move-object/from16 v26, v6

    move-object/from16 v27, v8

    goto :goto_c

    :cond_16
    move-object/from16 v26, v6

    move-object/from16 v27, v8

    move/from16 v23, v10

    :goto_c
    move/from16 v28, v14

    :goto_d
    move/from16 v2, v19

    move/from16 v6, v21

    .line 964
    invoke-interface {v0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    const/16 v10, 0x7f

    if-gt v8, v10, :cond_17

    const/16 v10, 0x9

    if-eq v8, v10, :cond_17

    const/4 v10, 0x1

    goto :goto_e

    :cond_17
    const/4 v10, 0x0

    :goto_e
    if-eqz v10, :cond_1b

    .line 967
    sget v14, Ll/ۛ۬ۡ;->֫:I

    const/16 v14, 0x30

    if-gt v14, v8, :cond_18

    const/16 v14, 0x39

    if-le v8, v14, :cond_19

    :cond_18
    const/16 v14, 0x23

    if-eq v8, v14, :cond_19

    const/16 v14, 0x2a

    if-ne v8, v14, :cond_1b

    :cond_19
    add-int/lit8 v14, v4, 0x1

    if-ge v14, v3, :cond_1b

    .line 968
    invoke-interface {v0, v14}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    move-object/from16 v19, v7

    const v7, 0xfe0f

    if-eq v14, v7, :cond_1a

    const/16 v7, 0x20e3

    if-ne v14, v7, :cond_1c

    :cond_1a
    const/4 v10, 0x0

    goto :goto_f

    :cond_1b
    move-object/from16 v19, v7

    :cond_1c
    :goto_f
    if-eqz v10, :cond_1d

    add-int/lit8 v12, v12, 0x1

    const/16 v7, 0x100

    if-ne v12, v7, :cond_1f

    .line 973
    :cond_1d
    invoke-interface/range {p7 .. p7}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v7

    if-eqz v7, :cond_1e

    goto/16 :goto_1a

    :cond_1e
    const/4 v12, 0x0

    :cond_1f
    if-eqz v10, :cond_20

    add-int/lit8 v7, v4, 0x1

    goto :goto_10

    .line 976
    :cond_20
    invoke-static {v4, v3, v0}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v7

    :goto_10
    if-eqz v10, :cond_21

    .line 977
    invoke-virtual {v5, v8}, Ll/ۢ۫ۡ;->֫(C)F

    move-result v10

    goto :goto_11

    .line 978
    :cond_21
    invoke-virtual {v5, v0, v4, v7, v6}, Ll/ۢ۫ۡ;->֫(Ljava/lang/CharSequence;IIF)F

    move-result v10

    :goto_11
    add-float/2addr v6, v10

    if-eq v1, v4, :cond_2a

    cmpl-float v10, v6, v17

    if-gtz v10, :cond_22

    if-eqz p9, :cond_2a

    if-ne v13, v15, :cond_2a

    if-ne v7, v3, :cond_2a

    cmpl-float v10, v6, v11

    if-lez v10, :cond_2a

    .line 981
    :cond_22
    invoke-interface/range {p7 .. p7}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v6

    if-eqz v6, :cond_23

    goto/16 :goto_1a

    :cond_23
    if-eqz v9, :cond_24

    if-le v2, v1, :cond_24

    goto :goto_12

    :cond_24
    move/from16 v2, v20

    :goto_12
    if-ne v2, v1, :cond_25

    goto :goto_13

    :cond_25
    move v4, v2

    :goto_13
    move-object/from16 v10, v27

    move/from16 v14, v28

    .line 986
    invoke-virtual {v10, v1, v4, v14}, Ll/ۨܰᩳ;->֫(III)V

    move-object/from16 v1, p2

    .line 987
    invoke-virtual {v1, v10}, Ll/ۜ۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    if-eqz v18, :cond_28

    .line 990
    invoke-static/range {p6 .. p6}, Ll/ᩳܽܿ;->ܿ(Ll/ᩳܽܿ;)Z

    move-result v2

    if-eqz v2, :cond_26

    move/from16 v2, v23

    int-to-float v6, v2

    sub-float v17, v17, v6

    goto :goto_14

    :cond_26
    move/from16 v2, v23

    .line 991
    :goto_14
    invoke-static/range {p6 .. p6}, Ll/ᩳܽܿ;->ۧ(Ll/ᩳܽܿ;)Z

    move-result v6

    if-eqz v6, :cond_27

    int-to-float v6, v2

    sub-float v6, v17, v6

    goto :goto_15

    :cond_27
    move/from16 v6, v17

    :goto_15
    const/4 v7, 0x0

    move v11, v6

    const/16 v18, 0x0

    goto :goto_16

    :cond_28
    move/from16 v2, v23

    :goto_16
    move-object/from16 v6, p8

    if-eqz v6, :cond_29

    .line 998
    invoke-virtual {v6, v10, v1}, Ll/ܽܽܿ;->֫(Ll/ۨܰᩳ;Ll/ۜ۟ᩳ;)Z

    move-result v7

    if-eqz v7, :cond_29

    goto/16 :goto_1a

    :cond_29
    move/from16 v12, p5

    move-object v8, v10

    move-object/from16 v7, v19

    move v10, v2

    move/from16 v19, v15

    move/from16 v15, p4

    move-object v2, v1

    move v1, v4

    move-object v4, v6

    move-object/from16 v6, v26

    goto/16 :goto_5

    :cond_2a
    move-object/from16 v15, p2

    move/from16 v21, v23

    move-object/from16 v10, v27

    move/from16 v14, v28

    cmpg-float v23, v6, v11

    if-gtz v23, :cond_34

    move/from16 v23, v2

    if-eqz v9, :cond_32

    sub-int v2, v7, v4

    move-object/from16 v24, v5

    const/4 v5, 0x2

    if-ge v2, v5, :cond_31

    const/16 v2, 0x80

    if-ge v8, v2, :cond_2e

    .line 1357
    aget-byte v2, v22, v8

    if-eq v2, v5, :cond_2b

    const/4 v4, 0x1

    if-ne v2, v4, :cond_33

    goto :goto_17

    :cond_2b
    add-int/lit8 v4, v4, 0x1

    .line 1360
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lt v4, v2, :cond_2c

    goto :goto_17

    .line 1361
    :cond_2c
    invoke-interface {v0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v4, 0x80

    if-ge v2, v4, :cond_2d

    const/16 v4, 0x30

    if-lt v2, v4, :cond_31

    const/16 v4, 0x39

    if-le v2, v4, :cond_33

    goto :goto_17

    .line 1362
    :cond_2d
    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    move-result v2

    if-nez v2, :cond_33

    goto :goto_17

    :cond_2e
    const/16 v2, 0x200b

    if-ne v8, v2, :cond_2f

    goto :goto_17

    :cond_2f
    const v2, 0xd800

    if-lt v8, v2, :cond_30

    const v2, 0xdbff

    if-gt v8, v2, :cond_30

    goto :goto_17

    :cond_30
    const/16 v2, 0x2e80

    if-lt v8, v2, :cond_33

    const/4 v2, 0x1

    .line 1371
    invoke-static {v2, v8}, Ll/ܿܽܿ;->֫(ZC)Z

    move-result v2

    if-eqz v2, :cond_33

    add-int/lit8 v4, v4, 0x1

    .line 1372
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v4, v2, :cond_33

    invoke-interface {v0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/4 v4, 0x0

    invoke-static {v4, v2}, Ll/ܿܽܿ;->֫(ZC)Z

    move-result v2

    if-eqz v2, :cond_33

    :cond_31
    :goto_17
    move v2, v7

    move/from16 v20, v2

    goto :goto_18

    :cond_32
    move-object/from16 v24, v5

    :cond_33
    move/from16 v20, v7

    move/from16 v2, v23

    goto :goto_18

    :cond_34
    move/from16 v23, v2

    move-object/from16 v24, v5

    :goto_18
    move v5, v2

    move v4, v7

    move/from16 v2, p3

    :goto_19
    move-object v8, v10

    move-object/from16 v7, v19

    move/from16 v10, v21

    move/from16 v19, v5

    move/from16 v21, v6

    move-object/from16 v5, v24

    move-object/from16 v6, v26

    move-object/from16 v30, v15

    move v15, v2

    move-object/from16 v2, v30

    goto/16 :goto_6

    :cond_35
    move-object v15, v2

    move-object/from16 v24, v5

    move-object/from16 v26, v6

    move-object/from16 v19, v7

    move/from16 v21, v10

    move-object v10, v8

    if-ne v1, v3, :cond_36

    move/from16 v2, p5

    if-ne v2, v3, :cond_38

    .line 1008
    :cond_36
    invoke-interface/range {p7 .. p7}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v2

    if-eqz v2, :cond_37

    goto :goto_1a

    .line 1009
    :cond_37
    invoke-virtual {v10, v1, v3, v14}, Ll/ۨܰᩳ;->֫(III)V

    .line 1010
    invoke-virtual {v15, v10}, Ll/ۜ۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    :cond_38
    move-object/from16 v1, p1

    move/from16 v3, p3

    move-object/from16 v4, p8

    move-object v8, v10

    move v12, v13

    move-object v2, v15

    move/from16 v11, v16

    move-object/from16 v7, v19

    move/from16 v10, v21

    move-object/from16 v5, v24

    move-object/from16 v6, v26

    goto/16 :goto_2

    :cond_39
    :goto_1a
    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/᩷۟ᩳ;Ll/᩷۟ᩳ;IIZLl/ᩳܽܿ;Ljava/util/function/BooleanSupplier;Ll/ܽܽܿ;Z)V
    .locals 12

    .line 888
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    new-instance v11, Ll/ۜ۟ᩳ;

    move-object v0, p2

    invoke-direct {v11, p2}, Ll/ۜ۟ᩳ;-><init>(Ll/᩷۟ᩳ;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, v11

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    .line 889
    :try_start_0
    invoke-static/range {v1 .. v10}, Ll/ܿܽܿ;->֫(Ljava/lang/CharSequence;Ll/᩷۟ᩳ;Ll/ۜ۟ᩳ;IIZLl/ᩳܽܿ;Ljava/util/function/BooleanSupplier;Ll/ܽܽܿ;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 891
    invoke-virtual {v11}, Ll/ۜ۟ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 888
    :try_start_1
    invoke-virtual {v11}, Ll/ۜ۟ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method

.method private ֫(Ll/۟᩺ᩳ;IIILl/᩷۟ᩳ;IIF)V
    .locals 12

    move-object v10, p0

    .line 830
    iget v0, v10, Ll/ۗۤᩳ;->ۨ:I

    if-ltz v0, :cond_0

    return-void

    .line 831
    :cond_0
    invoke-static/range {p5 .. p6}, Ll/ܿܽܿ;->ۧ(Ll/᩷۟ᩳ;I)I

    move-result v8

    .line 832
    new-instance v11, Ll/ۛۧܿ;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object/from16 v5, p5

    move/from16 v6, p4

    move/from16 v7, p8

    move/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Ll/ۛۧܿ;-><init>(Ll/ܿܽܿ;Ll/۟᩺ᩳ;IILl/᩷۟ᩳ;IFII)V

    iget-object v0, v10, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0, v11}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private ֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    .line 813
    :try_start_0
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    .line 814
    invoke-interface {p1, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p2, :cond_0

    .line 817
    :try_start_1
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 818
    :cond_0
    iget-object p1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 820
    iput-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    .line 821
    iget-object p1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p1, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    return-void

    :catchall_0
    move-exception p1

    .line 820
    iput-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    .line 821
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    .line 822
    throw p1

    :catchall_1
    move-exception p1

    if-eqz p2, :cond_1

    .line 817
    :try_start_2
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 818
    :cond_1
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Landroid/view/View;->postInvalidate()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 820
    iput-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    .line 821
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    .line 823
    throw p1

    :catchall_2
    move-exception p1

    .line 820
    iput-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    .line 821
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    .line 822
    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ܿܽܿ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܿܽܿ;->ۚ֫:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿܽܿ;IILl/᩷۟ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Ll/ܿܽܿ;->֫(IILl/᩷۟ᩳ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿܽܿ;Ljava/lang/Throwable;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܿܽܿ;->ۖ֫:Ljava/lang/Throwable;

    return-void
.end method

.method public static synthetic ֫(Ll/ܿܽܿ;Ljava/util/List;Ll/᩶ۧܿ;Ll/᩷۟ᩳ;ILl/۟᩺ᩳ;IIIIIFLjava/util/ArrayList;Ll/᩷۟ᩳ;Ljava/lang/Runnable;)V
    .locals 16

    move-object/from16 v10, p0

    move-object/from16 v11, p5

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    const/4 v1, 0x0

    .line 704
    :try_start_0
    new-instance v0, Ll/ۗۧܿ;

    invoke-direct {v0, v10}, Ll/ۗۧܿ;-><init>(Ll/ܿܽܿ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v2, p1

    move-object/from16 v14, p2

    :try_start_1
    invoke-static {v0, v2, v14}, Ll/ۜܽܿ;->֫(Ljava/util/function/Supplier;Ljava/util/List;Ljava/util/function/BooleanSupplier;)Ll/᩷۟ᩳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 705
    invoke-virtual/range {p2 .. p2}, Ll/᩶ۧܿ;->getAsBoolean()Z

    move-result v2

    if-nez v2, :cond_0

    .line 707
    new-instance v15, Ll/᩷۟ᩳ;

    move-object/from16 v2, p3

    invoke-direct {v15, v2}, Ll/᩷۟ᩳ;-><init>(Ljava/util/Collection;)V

    .line 708
    invoke-virtual {v15, v0}, Ll/᩷۟ᩳ;->֫(Ll/᩷۟ᩳ;)V

    .line 710
    iput-object v15, v10, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    iput-object v15, v10, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    move/from16 v0, p4

    .line 711
    iput v0, v10, Ll/ܿܽܿ;->ۚ֫:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v1, p0

    move-object/from16 v2, p5

    move/from16 v3, p6

    move/from16 v4, p7

    move/from16 v5, p8

    move-object v6, v15

    move/from16 v7, p9

    move/from16 v8, p10

    move/from16 v9, p11

    .line 713
    :try_start_2
    invoke-direct/range {v1 .. v9}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;IIILl/᩷۟ᩳ;IIF)V

    .line 714
    invoke-virtual/range {p12 .. p12}, Ljava/util/ArrayList;->size()I

    move-result v0

    sget v1, Ll/ۜܽܿ;->᩷:I

    invoke-direct {v10, v0, v1, v15}, Ll/ܿܽܿ;->֫(IILl/᩷۟ᩳ;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :goto_0
    const/4 v1, 0x1

    goto :goto_5

    :goto_1
    const/4 v1, 0x1

    goto :goto_4

    .line 724
    :cond_0
    iget-object v0, v10, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0, v10}, Ll/۫ۨᩳ;->ܿ(Ll/ۗۤᩳ;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object v12, v10, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 725
    :cond_1
    :goto_2
    invoke-direct {v10, v11, v13}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V

    return-void

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_5

    :catch_4
    move-exception v0

    :goto_3
    move-object/from16 v14, p2

    goto :goto_4

    :catch_5
    move-exception v0

    goto :goto_3

    .line 718
    :goto_4
    :try_start_3
    invoke-virtual/range {p2 .. p2}, Ll/᩶ۧܿ;->getAsBoolean()Z

    move-result v2

    if-nez v2, :cond_2

    .line 719
    iput-object v0, v10, Ll/ܿܽܿ;->ۖ֫:Ljava/lang/Throwable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_2
    if-nez v1, :cond_3

    .line 724
    iget-object v0, v10, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0, v10}, Ll/۫ۨᩳ;->ܿ(Ll/ۗۤᩳ;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object v12, v10, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 725
    :cond_3
    invoke-direct {v10, v11, v13}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V

    return-void

    :goto_5
    if-nez v1, :cond_4

    .line 724
    iget-object v1, v10, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v1, v10}, Ll/۫ۨᩳ;->ܿ(Ll/ۗۤᩳ;)Z

    move-result v1

    if-nez v1, :cond_4

    iput-object v12, v10, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 725
    :cond_4
    invoke-direct {v10, v11, v13}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V

    .line 726
    throw v0
.end method

.method public static synthetic ֫(Ll/ܿܽܿ;Ll/۟᩺ᩳ;IILl/᩷۟ᩳ;IFII)V
    .locals 2

    .line 833
    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    iget-object v1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    if-ne v1, p0, :cond_1

    iget-object v1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    if-ne v1, p1, :cond_1

    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p1

    if-ne p1, p2, :cond_1

    invoke-virtual {p0}, Ll/ۗۤᩳ;->۫()I

    move-result p1

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Ll/ܿܽܿ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 834
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-ne p1, p3, :cond_1

    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    if-ne p1, p4, :cond_1

    .line 835
    invoke-virtual {v0, p0}, Ll/۫ۨᩳ;->֫(Ll/ۗۤᩳ;)Z

    move-result p0

    if-nez p0, :cond_1

    .line 836
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۜܽ()I

    move-result p0

    if-eq p0, p5, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p0, p7

    mul-float p6, p6, p0

    float-to-int p0, p6

    add-int/2addr p0, p8

    .line 838
    invoke-virtual {v0, p0}, Ll/۫ۨᩳ;->᩷(I)I

    move-result p0

    .line 839
    invoke-virtual {v0, p0}, Ll/۫ۨᩳ;->ۖ(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿܽܿ;Ll/᩷۟ᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    return-void
.end method

.method private ֫(ZLl/۟᩺ᩳ;IZ)V
    .locals 28

    move-object/from16 v14, p0

    move-object/from16 v15, p2

    .line 611
    iget-object v1, v14, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 613
    :try_start_0
    iget-object v0, v14, Ll/ܿܽܿ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 614
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v16

    .line 615
    invoke-virtual/range {p0 .. p0}, Ll/ܿܽܿ;->ۧ()V

    .line 616
    invoke-virtual {v14, v15}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;)V

    .line 617
    iput-boolean v7, v14, Ll/ۗۤᩳ;->ܳ֫:Z

    .line 618
    iput-object v8, v14, Ll/ܿܽܿ;->ܶ֫:Ll/᩷۟ᩳ;

    .line 619
    iput-object v8, v14, Ll/ܿܽܿ;->ۖ֫:Ljava/lang/Throwable;

    .line 620
    iget-object v13, v14, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_f
    .catchall {:try_start_0 .. :try_end_0} :catchall_13

    .line 622
    :try_start_1
    iget-object v9, v14, Ll/ܿܽܿ;->۠֫:Ll/ۙ۟ᩳ;

    .line 623
    iput-object v8, v14, Ll/ܿܽܿ;->۠֫:Ll/ۙ۟ᩳ;

    .line 624
    iget v1, v14, Ll/ܿܽܿ;->ۙ֫:I

    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ۜ()I

    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_e
    .catchall {:try_start_1 .. :try_end_1} :catchall_12

    sub-int v10, v1, v2

    const/4 v11, 0x1

    if-gtz v10, :cond_0

    .line 626
    :try_start_2
    iput-boolean v11, v14, Ll/ܿܽܿ;->֨֫:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 735
    invoke-direct {v14, v15, v8}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :catch_0
    move-exception v0

    goto/16 :goto_c

    .line 629
    :cond_0
    :try_start_3
    iget-boolean v1, v14, Ll/ܿܽܿ;->֨֫:Z

    xor-int/2addr v1, v11

    and-int v1, p1, v1

    .line 630
    iput-boolean v7, v14, Ll/ܿܽܿ;->֨֫:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_e
    .catchall {:try_start_3 .. :try_end_3} :catchall_12

    if-eqz v1, :cond_1

    .line 631
    :try_start_4
    iget v1, v14, Ll/ܿܽܿ;->ۚ֫:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne v10, v1, :cond_1

    .line 735
    invoke-direct {v14, v15, v8}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    if-nez v9, :cond_2

    .line 632
    :try_start_5
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ܽ()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 633
    :cond_2
    :try_start_6
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->۫()I

    move-result v24

    .line 634
    iget-object v1, v14, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۜܽ()I

    move-result v25

    .line 635
    new-instance v12, Ll/᩶ۧܿ;

    move-object v1, v12

    move-object/from16 v2, p0

    move/from16 v3, p3

    move v4, v0

    move-object/from16 v5, p2

    move/from16 v6, v24

    invoke-direct/range {v1 .. v6}, Ll/᩶ۧܿ;-><init>(Ll/ܿܽܿ;IILl/۟᩺ᩳ;I)V

    .line 637
    iget-object v1, v14, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v1

    add-int/2addr v1, v11

    int-to-double v1, v1

    invoke-virtual {v14, v1, v2}, Ll/ۗۤᩳ;->֫(D)I

    move-result v1

    .line 638
    iget-object v2, v14, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, v1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v2

    .line 639
    iget v11, v2, Ll/ۨܰᩳ;->᩶:I

    .line 641
    iget-object v2, v14, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    monitor-enter v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_e
    .catchall {:try_start_6 .. :try_end_6} :catchall_12

    .line 642
    :try_start_7
    new-instance v3, Ll/ᩳܽܿ;

    iget-object v4, v14, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v4}, Ll/ۢ۫ۡ;->ۧ()Ll/ۢ۫ۡ;

    move-result-object v19

    iget-boolean v4, v14, Ll/ܿܽܿ;->֡֫:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_f

    :try_start_8
    iget-object v5, v14, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    .line 643
    invoke-virtual {v5}, Ll/᩺֫ܿ;->۠()I

    move-result v21

    invoke-virtual/range {p0 .. p0}, Ll/ܿܽܿ;->֨()Z

    move-result v22

    .line 1094
    iget-boolean v5, v14, Ll/ܿܽܿ;->֡֫:Z

    move-object/from16 v18, v3

    move/from16 v20, v4

    move/from16 v23, v5

    .line 643
    invoke-direct/range {v18 .. v23}, Ll/ᩳܽܿ;-><init>(Ll/ۢ۫ۡ;ZIZZ)V

    .line 644
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_e

    .line 645
    :try_start_9
    invoke-static {v3}, Ll/ᩳܽܿ;->ᩳ(Ll/ᩳܽܿ;)Ll/ۢ۫ۡ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v8

    .line 646
    iget-object v2, v14, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v2

    int-to-float v2, v2

    int-to-float v1, v1

    mul-float v1, v1, v8

    sub-float/2addr v2, v1

    float-to-int v6, v2

    .line 648
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->᩹()Ll/۟᩸ᩳ;

    move-result-object v1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_c
    .catchall {:try_start_9 .. :try_end_9} :catchall_d

    .line 650
    :try_start_a
    invoke-static {v1, v13, v9, v12}, Ll/ۡܽܿ;->֫(Ll/۟᩸ᩳ;Ll/᩷۟ᩳ;Ll/ۙ۟ᩳ;Ljava/util/function/BooleanSupplier;)Ljava/util/ArrayList;

    move-result-object v2
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 654
    :try_start_b
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V

    .line 655
    new-instance v9, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 656
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    if-eqz v4, :cond_3

    :try_start_c
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v20, v4

    check-cast v20, Ll/᩷ܽܿ;

    .line 657
    new-instance v4, Ll/ۙۧܿ;

    move-object/from16 v18, v4

    move-object/from16 v19, v13

    move/from16 v21, v10

    move-object/from16 v22, v3

    move-object/from16 v23, v12

    invoke-direct/range {v18 .. v23}, Ll/ۙۧܿ;-><init>(Ll/᩷۟ᩳ;Ll/᩷ܽܿ;ILl/ᩳܽܿ;Ll/᩶ۧܿ;)V

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    goto/16 :goto_8

    :catch_1
    move-exception v0

    goto/16 :goto_b

    .line 660
    :cond_3
    :try_start_d
    iget v1, v14, Ll/ۗۤᩳ;->ۨ:I

    if-ltz v1, :cond_4

    goto :goto_1

    :cond_4
    move v1, v11

    :goto_1
    const/4 v3, 0x0

    .line 662
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    if-ge v3, v4, :cond_5

    :try_start_e
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ܽܿ;

    invoke-virtual {v4}, Ll/᩷ܽܿ;->֫()I

    move-result v4
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    if-ge v4, v1, :cond_5

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 664
    :cond_5
    :try_start_f
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v2

    sget v4, Ll/ۜܽܿ;->᩷:I

    add-int/lit8 v3, v3, 0x1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    if-eqz p4, :cond_6

    .line 666
    :try_start_10
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v2

    :cond_6
    if-eqz p4, :cond_7

    .line 667
    new-instance v3, Ll/ۗۧܿ;

    invoke-direct {v3, v14}, Ll/ۗۧܿ;-><init>(Ll/ܿܽܿ;)V

    invoke-static {v3, v9, v12}, Ll/ۜܽܿ;->֫(Ll/ۗۧܿ;Ljava/util/ArrayList;Ll/᩶ۧܿ;)Ll/᩷۟ᩳ;

    move-result-object v3
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    goto :goto_3

    .line 668
    :cond_7
    :try_start_11
    new-instance v3, Ll/ۗۧܿ;

    invoke-direct {v3, v14}, Ll/ۗۧܿ;-><init>(Ll/ܿܽܿ;)V

    invoke-virtual {v9, v7, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v4, v12}, Ll/ۜܽܿ;->֫(Ljava/util/function/Supplier;Ljava/util/List;Ljava/util/function/BooleanSupplier;)Ll/᩷۟ᩳ;

    move-result-object v3

    :goto_3
    move-object v7, v3

    .line 670
    iget-object v3, v14, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    .line 6859
    invoke-virtual {v3, v15}, Ll/۫ۨᩳ;->ۧ(Ll/۟᩺ᩳ;)Ll/ۙۤᩳ;

    move-result-object v3

    if-nez v3, :cond_8

    const-wide/16 v3, 0x0

    goto :goto_4

    .line 6860
    :cond_8
    invoke-virtual {v3}, Ll/ۙۤᩳ;->ᩳ()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {v3}, Ll/ۙۤᩳ;->֫()I

    move-result v3
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    move/from16 v18, v2

    int-to-long v2, v3

    add-long v3, v4, v2

    move/from16 v2, v18

    :goto_4
    if-eqz v7, :cond_b

    .line 671
    :try_start_12
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v2, v5, :cond_b

    invoke-virtual {v12}, Ll/᩶ۧܿ;->getAsBoolean()Z

    move-result v5

    if-nez v5, :cond_b

    .line 672
    invoke-direct {v14, v7, v1, v8}, Ll/ܿܽܿ;->֫(Ll/᩷۟ᩳ;IF)Z

    move-result v5

    if-eqz v5, :cond_9

    iget v5, v14, Ll/ۗۤᩳ;->ۨ:I

    if-gez v5, :cond_b

    long-to-float v5, v3

    move/from16 v18, v1

    .line 673
    invoke-virtual {v7}, Ll/᩷۟ᩳ;->size()I

    move-result v1

    move-wide/from16 v19, v3

    int-to-long v3, v1

    const-wide/16 v21, 0x1

    sub-long v3, v3, v21

    long-to-float v1, v3

    mul-float v1, v1, v8

    cmpl-float v1, v5, v1

    if-ltz v1, :cond_b

    goto :goto_5

    :cond_9
    move/from16 v18, v1

    move-wide/from16 v19, v3

    .line 674
    :goto_5
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    sget v3, Ll/ۜܽܿ;->᩷:I

    add-int/2addr v3, v2

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 675
    new-instance v3, Ll/ۗۧܿ;

    invoke-direct {v3, v14}, Ll/ۗۧܿ;-><init>(Ll/ܿܽܿ;)V

    invoke-virtual {v9, v2, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v2

    invoke-static {v3, v2, v12}, Ll/ۜܽܿ;->֫(Ljava/util/function/Supplier;Ljava/util/List;Ljava/util/function/BooleanSupplier;)Ll/᩷۟ᩳ;

    move-result-object v2
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    if-nez v2, :cond_a

    const/4 v0, 0x0

    .line 735
    invoke-direct {v14, v15, v0}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V

    return-void

    .line 677
    :cond_a
    :try_start_13
    invoke-virtual {v7, v2}, Ll/᩷۟ᩳ;->֫(Ll/᩷۟ᩳ;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_2
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    move v2, v1

    move/from16 v1, v18

    move-wide/from16 v3, v19

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_7

    :catch_2
    move-exception v0

    goto :goto_a

    :cond_b
    if-eqz v7, :cond_10

    .line 680
    :try_start_14
    invoke-virtual {v12}, Ll/᩶ۧܿ;->getAsBoolean()Z

    move-result v1

    if-eqz v1, :cond_c

    goto/16 :goto_17

    .line 681
    :cond_c
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v9, v2, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v3

    .line 682
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_7
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    if-eqz v1, :cond_e

    .line 684
    :try_start_15
    iput-object v7, v14, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    iput-object v7, v14, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 685
    iput v10, v14, Ll/ܿܽܿ;->ۚ֫:I

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move/from16 v3, v24

    move v4, v0

    move/from16 v5, v25

    move/from16 v19, v6

    move-object v6, v7

    move-object v0, v7

    move v7, v11

    move/from16 v20, v8

    move/from16 v8, v19

    move-object/from16 v18, v9

    move/from16 v9, v20

    .line 686
    invoke-direct/range {v1 .. v9}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;IIILl/᩷۟ᩳ;IIF)V

    .line 687
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz p4, :cond_d

    const/4 v2, 0x1

    goto :goto_6

    .line 688
    :cond_d
    sget v2, Ll/ۜܽܿ;->᩷:I

    .line 687
    :goto_6
    invoke-direct {v14, v1, v2, v0}, Ll/ܿܽܿ;->֫(IILl/᩷۟ᩳ;)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_2
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    const/4 v0, 0x0

    .line 735
    invoke-direct {v14, v15, v0}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V

    return-void

    :goto_7
    const/4 v7, 0x0

    :goto_8
    const/4 v8, 0x0

    :goto_9
    const/4 v1, 0x0

    move-object v3, v14

    move-object v4, v15

    goto/16 :goto_2b

    :goto_a
    const/4 v7, 0x0

    :goto_b
    const/4 v8, 0x0

    :goto_c
    const/4 v1, 0x0

    move-object v3, v14

    move-object v4, v15

    goto/16 :goto_29

    :cond_e
    move/from16 v19, v6

    move/from16 v20, v8

    move-object/from16 v18, v9

    move-object v9, v7

    .line 692
    :try_start_16
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v1

    sget v2, Ll/ۜܽܿ;->᩷:I

    invoke-direct {v14, v1, v2, v9}, Ll/ܿܽܿ;->֫(IILl/᩷۟ᩳ;)V

    const/4 v1, 0x1

    .line 695
    iput-boolean v1, v14, Ll/ۗۤᩳ;->۬:Z
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_7
    .catchall {:try_start_16 .. :try_end_16} :catchall_7

    .line 697
    :try_start_17
    iput-object v9, v14, Ll/ܿܽܿ;->ܶ֫:Ll/᩷۟ᩳ;

    iput-object v9, v14, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 698
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0xc8

    if-le v1, v2, :cond_f

    iget-object v1, v14, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    new-instance v2, Ll/۟ۤᩳ;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v1}, Ll/۟ۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 882
    new-instance v2, Ll/֫ۛᩳ;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v1}, Ll/֫ۛᩳ;-><init>(ILjava/lang/Object;)V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_6
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    goto :goto_f

    :goto_d
    move-object/from16 v27, v13

    goto/16 :goto_12

    :goto_e
    move-object/from16 v27, v13

    goto/16 :goto_15

    :cond_f
    const/4 v2, 0x0

    :goto_f
    move-object/from16 v21, v2

    .line 700
    :try_start_18
    iget-object v1, v14, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۖۧ()V

    .line 701
    sget-object v8, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v7, Ll/۬ۧܿ;
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_5
    .catchall {:try_start_18 .. :try_end_18} :catchall_5

    move-object v1, v7

    move-object/from16 v2, p0

    move-object v4, v12

    move-object v5, v9

    move v6, v10

    move-object v12, v7

    move-object/from16 v7, p2

    move-object v10, v8

    move/from16 v8, v24

    move-object/from16 v22, v9

    move v9, v0

    move/from16 v23, v0

    move-object v0, v10

    move/from16 v10, v25

    move/from16 v26, v11

    move-object/from16 p1, v0

    move-object v0, v12

    move/from16 v12, v19

    move-object/from16 v27, v13

    move/from16 v13, v20

    move-wide/from16 v14, v16

    move-object/from16 v16, v18

    move-object/from16 v17, v27

    move-object/from16 v18, v21

    :try_start_19
    invoke-direct/range {v1 .. v18}, Ll/۬ۧܿ;-><init>(Ll/ܿܽܿ;Ljava/util/List;Ll/᩶ۧܿ;Ll/᩷۟ᩳ;ILl/۟᩺ᩳ;IIIIIFJLjava/util/ArrayList;Ll/᩷۟ᩳ;Ll/֫ۛᩳ;)V

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_4
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move/from16 v3, v24

    move/from16 v4, v23

    move/from16 v5, v25

    move-object/from16 v6, v22

    move/from16 v7, v26

    move/from16 v8, v19

    move/from16 v9, v20

    .line 729
    :try_start_1a
    invoke-direct/range {v1 .. v9}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;IIILl/᩷۟ᩳ;IIF)V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_3
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    return-void

    :catchall_3
    move-exception v0

    const/4 v1, 0x1

    move-object/from16 v8, v21

    const/4 v7, 0x1

    goto :goto_14

    :catch_3
    move-exception v0

    const/4 v1, 0x1

    goto :goto_16

    :catchall_4
    move-exception v0

    goto :goto_10

    :catch_4
    move-exception v0

    goto :goto_11

    :catchall_5
    move-exception v0

    move-object/from16 v27, v13

    :goto_10
    const/4 v1, 0x0

    move-object/from16 v8, v21

    goto :goto_13

    :catch_5
    move-exception v0

    move-object/from16 v27, v13

    :goto_11
    const/4 v1, 0x0

    goto :goto_16

    :catchall_6
    move-exception v0

    goto :goto_d

    :goto_12
    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v8, v2

    :goto_13
    const/4 v7, 0x0

    :goto_14
    const/4 v1, 0x1

    move-object/from16 v3, p0

    move-object/from16 v4, p2

    goto/16 :goto_26

    :catch_6
    move-exception v0

    goto :goto_e

    :goto_15
    const/4 v1, 0x0

    const/16 v21, 0x0

    :goto_16
    const/4 v2, 0x1

    move-object/from16 v3, p0

    move-object/from16 v4, p2

    move v7, v1

    move-object/from16 v8, v21

    move-object/from16 v13, v27

    const/4 v1, 0x1

    goto/16 :goto_29

    :catchall_7
    move-exception v0

    move-object/from16 v27, v13

    move-object/from16 v3, p0

    move-object/from16 v4, p2

    goto :goto_18

    :catch_7
    move-exception v0

    move-object/from16 v27, v13

    move-object/from16 v3, p0

    move-object/from16 v4, p2

    goto :goto_19

    :cond_10
    :goto_17
    const/4 v0, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p2

    .line 735
    invoke-direct {v3, v4, v0}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V

    return-void

    :catchall_8
    move-exception v0

    move-object/from16 v27, v13

    move-object v3, v14

    move-object v4, v15

    goto :goto_18

    :catch_8
    move-exception v0

    move-object/from16 v27, v13

    move-object v3, v14

    move-object v4, v15

    goto :goto_19

    :goto_18
    const/4 v1, 0x0

    goto :goto_1b

    :goto_19
    const/4 v1, 0x0

    goto :goto_1c

    :catchall_9
    move-exception v0

    move-object/from16 v27, v13

    move-object v3, v14

    move-object v4, v15

    move-object v2, v0

    const/4 v5, 0x0

    .line 648
    :try_start_1b
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_a

    goto :goto_1a

    :catchall_a
    move-exception v0

    move-object v1, v0

    :try_start_1c
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1a
    throw v2
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_9
    .catchall {:try_start_1c .. :try_end_1c} :catchall_b

    :catchall_b
    move-exception v0

    goto :goto_18

    :catch_9
    move-exception v0

    goto :goto_19

    :goto_1b
    const/4 v7, 0x0

    const/4 v8, 0x0

    goto/16 :goto_26

    :goto_1c
    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v8, v5

    move-object/from16 v13, v27

    goto/16 :goto_28

    :catch_a
    move-object/from16 v27, v13

    move-object v3, v14

    move-object v4, v15

    const/4 v2, 0x0

    .line 654
    :try_start_1d
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_b
    .catchall {:try_start_1d .. :try_end_1d} :catchall_c

    const/4 v0, 0x0

    .line 735
    invoke-direct {v3, v4, v0}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V

    return-void

    :catchall_c
    move-exception v0

    const/4 v1, 0x0

    goto :goto_1d

    :catch_b
    move-exception v0

    const/4 v1, 0x0

    goto :goto_1e

    :catchall_d
    move-exception v0

    move-object/from16 v27, v13

    move-object v3, v14

    move-object v4, v15

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1d
    move-object v8, v1

    goto :goto_22

    :catch_c
    move-exception v0

    move-object/from16 v27, v13

    move-object v3, v14

    move-object v4, v15

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1e
    move-object v8, v1

    goto :goto_24

    :catchall_e
    move-exception v0

    move-object/from16 v27, v13

    move-object v3, v14

    move-object v4, v15

    const/4 v8, 0x0

    goto :goto_1f

    :catchall_f
    move-exception v0

    move-object/from16 v27, v13

    move-object v3, v14

    move-object v4, v15

    :goto_1f
    move-object v1, v8

    const/4 v5, 0x0

    .line 644
    :goto_20
    :try_start_1e
    monitor-exit v2
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_11

    :try_start_1f
    throw v0
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_d
    .catchall {:try_start_1f .. :try_end_1f} :catchall_10

    :catchall_10
    move-exception v0

    move-object v8, v1

    goto :goto_21

    :catch_d
    move-exception v0

    move-object v8, v1

    goto :goto_23

    :catchall_11
    move-exception v0

    goto :goto_20

    :catchall_12
    move-exception v0

    move-object/from16 v27, v13

    move-object v3, v14

    move-object v4, v15

    goto :goto_21

    :catch_e
    move-exception v0

    move-object/from16 v27, v13

    move-object v3, v14

    move-object v4, v15

    goto :goto_23

    :goto_21
    const/4 v2, 0x0

    :goto_22
    move v1, v2

    goto :goto_25

    :goto_23
    const/4 v2, 0x0

    :goto_24
    move-object/from16 v1, v27

    goto :goto_27

    :catchall_13
    move-exception v0

    move-object v3, v14

    move-object v4, v15

    const/4 v2, 0x0

    move-object/from16 v27, v1

    const/4 v1, 0x0

    :goto_25
    const/4 v7, 0x0

    :goto_26
    move-object/from16 v13, v27

    goto :goto_2b

    :catch_f
    move-exception v0

    move-object v3, v14

    move-object v4, v15

    const/4 v2, 0x0

    :goto_27
    const/4 v5, 0x0

    move-object v13, v1

    move v1, v2

    :goto_28
    const/4 v7, 0x0

    .line 731
    :goto_29
    :try_start_20
    iget-boolean v2, v3, Ll/ۗۤᩳ;->ᩳ:Z

    if-nez v2, :cond_12

    iget-object v2, v3, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    move/from16 v5, p3

    if-eq v5, v2, :cond_11

    goto :goto_2a

    :cond_11
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_14

    :cond_12
    :goto_2a
    if-nez v7, :cond_14

    if-eqz v1, :cond_13

    .line 734
    iput-object v13, v3, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 735
    :cond_13
    invoke-direct {v3, v4, v8}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V

    :cond_14
    return-void

    :catchall_14
    move-exception v0

    :goto_2b
    if-nez v7, :cond_16

    if-eqz v1, :cond_15

    .line 734
    iput-object v13, v3, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 735
    :cond_15
    invoke-direct {v3, v4, v8}, Ll/ܿܽܿ;->֫(Ll/۟᩺ᩳ;Ljava/lang/Runnable;)V

    .line 737
    :cond_16
    throw v0
.end method

.method public static synthetic ֫(Ll/ܿܽܿ;IILl/۟᩺ᩳ;I)Z
    .locals 1

    .line 635
    iget-boolean v0, p0, Ll/ۗۤᩳ;->ᩳ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Ll/ܿܽܿ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 636
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    if-ne p1, p3, :cond_1

    invoke-virtual {p0}, Ll/ۗۤᩳ;->۫()I

    move-result p0

    if-eq p0, p4, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ֫(Ll/᩷۟ᩳ;IF)Z
    .locals 6

    .line 800
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v0

    iget v0, v0, Ll/ۨܰᩳ;->᩸:I

    if-ge v0, p2, :cond_0

    goto :goto_1

    .line 801
    :cond_0
    invoke-virtual {p1}, Ll/᩷۟ᩳ;->size()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    add-int v4, v3, v0

    ushr-int/2addr v4, v2

    .line 804
    invoke-virtual {p1, v4}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v5

    if-gt v5, p2, :cond_1

    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_0

    .line 807
    :cond_2
    invoke-virtual {p1}, Ll/᩷۟ᩳ;->size()I

    move-result p1

    sub-int/2addr p1, v3

    int-to-long p1, p1

    const-wide/16 v3, 0x1

    sub-long/2addr p1, v3

    long-to-float p1, p1

    mul-float p1, p1, p3

    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/۫ۨᩳ;->᩻֫()I

    move-result p2

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_3

    return v2

    :cond_3
    :goto_1
    return v1
.end method

.method public static ֫(ZC)Z
    .locals 2

    const/16 v0, 0x2e80

    if-lt p1, v0, :cond_0

    const/16 v0, 0x2fff

    if-gt p1, v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v0, 0x3000

    if-ne p1, v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v0, 0x3002

    if-ne p1, v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v0, 0x3040

    if-lt p1, v0, :cond_3

    const/16 v0, 0x309f

    if-gt p1, v0, :cond_3

    if-nez p0, :cond_b

    const/16 p0, 0x3041

    if-eq p1, p0, :cond_c

    const/16 p0, 0x3043

    if-eq p1, p0, :cond_c

    const/16 p0, 0x3045

    if-eq p1, p0, :cond_c

    const/16 p0, 0x3047

    if-eq p1, p0, :cond_c

    const/16 p0, 0x3049

    if-eq p1, p0, :cond_c

    const/16 p0, 0x3063

    if-eq p1, p0, :cond_c

    const/16 p0, 0x3083

    if-eq p1, p0, :cond_c

    const/16 p0, 0x3085

    if-eq p1, p0, :cond_c

    const/16 p0, 0x3087

    if-eq p1, p0, :cond_c

    const/16 p0, 0x308e

    if-eq p1, p0, :cond_c

    const/16 p0, 0x3095

    if-eq p1, p0, :cond_c

    const/16 p0, 0x3096

    if-eq p1, p0, :cond_c

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    :cond_3
    const/16 v0, 0x30a0

    if-lt p1, v0, :cond_4

    const/16 v1, 0x30ff

    if-gt p1, v1, :cond_4

    if-nez p0, :cond_b

    if-eq p1, v0, :cond_c

    const/16 p0, 0x30a1

    if-eq p1, p0, :cond_c

    const/16 p0, 0x30a3

    if-eq p1, p0, :cond_c

    const/16 p0, 0x30a5

    if-eq p1, p0, :cond_c

    const/16 p0, 0x30a7

    if-eq p1, p0, :cond_c

    const/16 p0, 0x30a9

    if-eq p1, p0, :cond_c

    const/16 p0, 0x30c3

    if-eq p1, p0, :cond_c

    const/16 p0, 0x30e3

    if-eq p1, p0, :cond_c

    const/16 p0, 0x30e5

    if-eq p1, p0, :cond_c

    const/16 p0, 0x30e7

    if-eq p1, p0, :cond_c

    const/16 p0, 0x30ee

    if-eq p1, p0, :cond_c

    const/16 p0, 0x30f5

    if-eq p1, p0, :cond_c

    const/16 p0, 0x30f6

    if-eq p1, p0, :cond_c

    packed-switch p1, :pswitch_data_1

    goto :goto_0

    :cond_4
    const/16 p0, 0x3400

    if-lt p1, p0, :cond_5

    const/16 p0, 0x4db5

    if-gt p1, p0, :cond_5

    goto :goto_0

    :cond_5
    const/16 p0, 0x4e00

    if-lt p1, p0, :cond_6

    const p0, 0x9fbb

    if-gt p1, p0, :cond_6

    goto :goto_0

    :cond_6
    const p0, 0xf900

    if-lt p1, p0, :cond_7

    const p0, 0xfad9

    if-gt p1, p0, :cond_7

    goto :goto_0

    :cond_7
    const p0, 0xa000

    if-lt p1, p0, :cond_8

    const p0, 0xa48f

    if-gt p1, p0, :cond_8

    goto :goto_0

    :cond_8
    const p0, 0xa490

    if-lt p1, p0, :cond_9

    const p0, 0xa4cf

    if-gt p1, p0, :cond_9

    goto :goto_0

    :cond_9
    const p0, 0xfe62

    if-lt p1, p0, :cond_a

    const p0, 0xfe66

    if-gt p1, p0, :cond_a

    goto :goto_0

    :cond_a
    const p0, 0xff00

    if-lt p1, p0, :cond_c

    const p0, 0xffef

    if-gt p1, p0, :cond_c

    :cond_b
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_c
    :pswitch_0
    const/4 p0, 0x0

    return p0

    :pswitch_data_0
    .packed-switch 0x309b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x30fb
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ֫֫()V
    .locals 13

    .line 428
    invoke-virtual {p0}, Ll/ܿܽܿ;->᩺()I

    move-result v0

    iput v0, p0, Ll/ۗۤᩳ;->ۙ:I

    .line 429
    iget v0, p0, Ll/ܿܽܿ;->ۙ֫:I

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۜ()I

    move-result v1

    sub-int v4, v0, v1

    const/4 v0, 0x1

    if-gtz v4, :cond_0

    .line 430
    iput-boolean v0, p0, Ll/ܿܽܿ;->֨֫:Z

    return-void

    .line 432
    :cond_0
    iget-object v1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v1

    add-int/2addr v1, v0

    int-to-double v1, v1

    invoke-virtual {p0, v1, v2}, Ll/ۗۤᩳ;->֫(D)I

    move-result v1

    .line 433
    iget-object v2, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, v1}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v6

    .line 435
    iget-object v2, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    monitor-enter v2

    .line 436
    :try_start_0
    new-instance v5, Ll/ᩳܽܿ;

    iget-object v3, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۧ()Ll/ۢ۫ۡ;

    move-result-object v8

    iget-boolean v9, p0, Ll/ܿܽܿ;->֡֫:Z

    iget-object v3, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    .line 437
    invoke-virtual {v3}, Ll/᩺֫ܿ;->۠()I

    move-result v10

    invoke-virtual {p0}, Ll/ܿܽܿ;->֨()Z

    move-result v11

    .line 1094
    iget-boolean v12, p0, Ll/ܿܽܿ;->֡֫:Z

    move-object v7, v5

    .line 437
    invoke-direct/range {v7 .. v12}, Ll/ᩳܽܿ;-><init>(Ll/ۢ۫ۡ;ZIZZ)V

    .line 438
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 439
    iget-object v2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v5}, Ll/ᩳܽܿ;->ᩳ(Ll/ᩳܽܿ;)Ll/ۢ۫ۡ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v3

    int-to-float v1, v1

    mul-float v3, v3, v1

    sub-float/2addr v2, v3

    float-to-int v7, v2

    .line 440
    iget-object v1, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    if-eqz v1, :cond_1

    .line 441
    iput-boolean v0, v1, Ll/ۧܽܿ;->᩸:Z

    .line 442
    :cond_1
    iget-object v1, p0, Ll/ܿܽܿ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 444
    iget-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    if-eqz v1, :cond_2

    iput-boolean v0, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    .line 445
    :cond_2
    new-instance v1, Ll/ۧܽܿ;

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Ll/ۧܽܿ;-><init>(Ll/ܿܽܿ;ILl/ᩳܽܿ;II)V

    .line 446
    iput-object v1, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    const/4 v2, 0x0

    .line 447
    iput-object v2, p0, Ll/ܿܽܿ;->ۖ֫:Ljava/lang/Throwable;

    const/4 v3, 0x0

    .line 448
    iput-boolean v3, p0, Ll/ܿܽܿ;->֨֫:Z

    .line 449
    iget-object v4, v1, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v4, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 450
    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    new-instance v4, Ll/۟ۤᩳ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v0}, Ll/۟ۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v4}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 882
    new-instance v4, Ll/֫ۛᩳ;

    invoke-direct {v4, v5, v0}, Ll/֫ۛᩳ;-><init>(ILjava/lang/Object;)V

    .line 450
    iput-object v4, v1, Ll/ۧܽܿ;->᩶:Ll/֫ۛᩳ;

    .line 452
    :try_start_1
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 454
    :goto_0
    iget-object v4, v1, Ll/ۧܽܿ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v4, v3}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 455
    iget-object v1, v1, Ll/ۧܽܿ;->᩶:Ll/֫ۛᩳ;

    invoke-virtual {v1}, Ll/֫ۛᩳ;->run()V

    .line 456
    iput-object v2, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    .line 457
    throw v0

    :catchall_0
    move-exception v0

    .line 438
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method private ۟()V
    .locals 13

    .line 263
    iget-object v0, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 264
    iget v0, p0, Ll/ܿܽܿ;->ۙ֫:I

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۜ()I

    move-result v1

    sub-int v6, v0, v1

    if-lez v6, :cond_0

    .line 266
    new-instance v0, Ll/᩷۟ᩳ;

    iget-object v1, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    invoke-virtual {v1}, Ll/᩷۟ᩳ;->size()I

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/᩷۟ᩳ;-><init>(I)V

    .line 267
    iput-boolean v1, p0, Ll/ۗۤᩳ;->ᩳ:Z

    .line 268
    iget-object v2, p0, Ll/ۗۤᩳ;->۠:Ljava/lang/String;

    iget-object v3, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    invoke-virtual {v3}, Ll/᩷۟ᩳ;->size()I

    move-result v5

    .line 862
    new-instance v1, Ll/ᩳܽܿ;

    iget-object v8, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-boolean v9, p0, Ll/ܿܽܿ;->֡֫:Z

    .line 863
    invoke-virtual {v8}, Ll/᩺֫ܿ;->۠()I

    move-result v10

    .line 864
    invoke-virtual {p0}, Ll/ܿܽܿ;->֨()Z

    move-result v11

    .line 1094
    iget-boolean v12, p0, Ll/ܿܽܿ;->֡֫:Z

    move-object v7, v1

    .line 864
    invoke-direct/range {v7 .. v12}, Ll/ᩳܽܿ;-><init>(Ll/ۢ۫ۡ;ZIZZ)V

    new-instance v9, Ll/۫ۧܿ;

    invoke-direct {v9, p0}, Ll/۫ۧܿ;-><init>(Ll/ܿܽܿ;)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v7, 0x1

    move-object v4, v0

    move-object v8, v1

    .line 878
    invoke-static/range {v2 .. v11}, Ll/ܿܽܿ;->֫(Ljava/lang/CharSequence;Ll/᩷۟ᩳ;Ll/᩷۟ᩳ;IIZLl/ᩳܽܿ;Ljava/util/function/BooleanSupplier;Ll/ܽܽܿ;Z)V

    .line 269
    iput-object v0, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    :cond_0
    return-void
.end method

.method public static ۧ(Ll/᩷۟ᩳ;I)I
    .locals 4

    .line 845
    invoke-virtual {p0}, Ll/᩷۟ᩳ;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    .line 848
    invoke-virtual {p0, v2}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v3

    if-ge v3, p1, :cond_0

    invoke-virtual {p0, v2}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v3

    if-gt v3, p1, :cond_0

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static bridge synthetic ۧ(Ll/ܿܽܿ;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܿܽܿ;Ll/᩷۟ᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܿܽܿ;->ܶ֫:Ll/᩷۟ᩳ;

    return-void
.end method

.method private ۧ(Z)V
    .locals 5

    .line 402
    invoke-virtual {p0}, Ll/ۗۤᩳ;->֡()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۡ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 403
    :cond_0
    iget-object v1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    .line 404
    invoke-interface {v1}, Ll/۟᩺ᩳ;->᩵֫()Z

    move-result v2

    .line 405
    iget-object v0, p0, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    const/4 v0, 0x1

    .line 407
    invoke-interface {v1, v0}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    move-object v0, p0

    .line 408
    monitor-enter v0

    .line 409
    :try_start_0
    iget-object v4, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    if-ne v4, v1, :cond_2

    iget-object v4, p0, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v4

    if-eq v3, v4, :cond_1

    goto :goto_0

    .line 413
    :cond_1
    invoke-direct {p0, p1, v1, v3, v2}, Ll/ܿܽܿ;->֫(ZLl/۟᩺ᩳ;IZ)V

    .line 414
    monitor-exit v0

    return-void

    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 410
    invoke-interface {v1, p1}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 411
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 414
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ܳ(II)I
    .locals 4

    if-ltz p1, :cond_4

    if-lez p2, :cond_4

    .line 293
    iget-boolean v0, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ܿܽܿ;->ۖ֫:Ljava/lang/Throwable;

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 294
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget-object v1, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܿܽܿ;->ܶ֫:Ll/᩷۟ᩳ;

    if-eqz v0, :cond_2

    :cond_1
    return p2

    .line 295
    :cond_2
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget-object v1, p0, Ll/ܿܽܿ;->ܶ֫:Ll/᩷۟ᩳ;

    if-eq v0, v1, :cond_3

    goto :goto_0

    .line 297
    :cond_3
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    long-to-float v0, v0

    iget-object v1, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v1}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v1

    mul-float v1, v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    int-to-double v2, p1

    sub-double/2addr v0, v2

    int-to-double p1, p2

    .line 298
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    double-to-int p1, p1

    return p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ܳ(Ll/ܿܽܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܿܽܿ;->֫֫()V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܿܽܿ;)Ll/ۧܽܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    return-object p0
.end method

.method private ܽ(Ll/۟᩺ᩳ;)V
    .locals 12

    .line 122
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܽ()V

    const/4 v0, 0x0

    .line 123
    iput-object v0, p0, Ll/ܿܽܿ;->۠֫:Ll/ۙ۟ᩳ;

    .line 124
    iget-object v0, p0, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 126
    invoke-virtual {p0}, Ll/ܿܽܿ;->ۧ()V

    .line 130
    :try_start_0
    iget-object v0, p0, Ll/ܿܽܿ;->᩵֫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v1, 0x0

    .line 131
    iput-boolean v1, p0, Ll/ۗۤᩳ;->ᩳ:Z

    .line 132
    invoke-virtual {p0, p1}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;)V

    .line 133
    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    goto :goto_0

    :cond_0
    new-instance p1, Ll/᩷۟ᩳ;

    invoke-direct {p1}, Ll/᩷۟ᩳ;-><init>()V

    .line 134
    :goto_0
    iget-object v0, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v0}, Ll/᩸ܰᩳ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    goto :goto_1

    :cond_1
    new-instance v0, Ll/᩸ܰᩳ;

    invoke-direct {v0}, Ll/᩸ܰᩳ;-><init>()V

    .line 135
    :goto_1
    invoke-virtual {v0}, Ll/᩸ܰᩳ;->clear()V

    .line 137
    invoke-virtual {p0}, Ll/ۗۤᩳ;->᩹()Ll/۟᩸ᩳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 142
    :try_start_1
    iget-object v3, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۡ()I

    move-result v3

    .line 143
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->length()I

    move-result v4

    invoke-virtual {p0, v2, v1, v4}, Ll/ۗۤᩳ;->֫(Ll/۟᩸ᩳ;II)Ll/᩺᩸ᩳ;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 144
    :try_start_2
    new-instance v5, Ll/ۨܰᩳ;

    invoke-direct {v5}, Ll/ۨܰᩳ;-><init>()V

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_2
    if-eqz v7, :cond_4

    .line 147
    iget-boolean v10, p0, Ll/ۗۤᩳ;->ᩳ:Z

    if-eqz v10, :cond_2

    .line 148
    invoke-virtual {p1}, Ll/᩷۟ᩳ;->clear()V

    .line 149
    invoke-virtual {v0}, Ll/᩸ܰᩳ;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 164
    :try_start_3
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 167
    :try_start_4
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 171
    iget-object p1, p0, Ll/ܿܽܿ;->᩵֫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    .line 153
    :cond_2
    :try_start_5
    invoke-static {p0, v2, v8, v3}, Ll/᩵ܰᩳ;->֫(Ll/ۗۤᩳ;Ljava/lang/CharSequence;II)I

    move-result v10

    invoke-virtual {v0, v10}, Ll/᩸ܰᩳ;->add(I)V

    .line 154
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->֫()I

    move-result v10

    const/4 v11, -0x1

    if-ne v10, v11, :cond_3

    .line 157
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->length()I

    move-result v10

    const/4 v7, 0x0

    .line 159
    :cond_3
    invoke-virtual {v5, v8, v10, v9}, Ll/ۨܰᩳ;->֫(III)V

    .line 160
    invoke-virtual {p1, v5}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    add-int/lit8 v8, v10, 0x1

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 164
    :cond_4
    :try_start_6
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->close()V

    .line 166
    invoke-virtual {v0}, Ll/᩸ܰᩳ;->ܽ()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 167
    :try_start_7
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V

    .line 168
    iput-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 169
    iput-object v0, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 171
    iget-object p1, p0, Ll/ܿܽܿ;->᩵֫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 173
    iget-object p1, p0, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    move-object v0, p1

    monitor-enter v0

    .line 174
    :try_start_8
    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iput-object p1, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    .line 175
    iget-object p1, p0, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 176
    invoke-virtual {p0}, Ll/ܿܽܿ;->᩺()I

    move-result p1

    iput p1, p0, Ll/ۗۤᩳ;->ۙ:I

    .line 179
    iget-object p1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result p1

    if-lez p1, :cond_5

    .line 180
    iget v2, p0, Ll/ܿܽܿ;->ۙ֫:I

    if-eq p1, v2, :cond_5

    const/4 v2, 0x1

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_6

    .line 181
    iput p1, p0, Ll/ܿܽܿ;->ۙ֫:I

    .line 182
    :cond_6
    iget p1, p0, Ll/ܿܽܿ;->ۙ֫:I

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result v3

    sub-int/2addr p1, v3

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۜ()I

    move-result v3

    sub-int/2addr p1, v3

    if-gtz p1, :cond_7

    goto :goto_4

    :cond_7
    const/4 v6, 0x0

    :goto_4
    iput-boolean v6, p0, Ll/ܿܽܿ;->֨֫:Z

    if-nez v6, :cond_8

    .line 184
    invoke-direct {p0, v1}, Ll/ܿܽܿ;->ۧ(Z)V

    if-eqz v2, :cond_8

    .line 185
    invoke-direct {p0}, Ll/ܿܽܿ;->۟()V

    .line 187
    :cond_8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 143
    :try_start_9
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    :try_start_a
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :catchall_3
    move-exception p1

    .line 137
    :try_start_b
    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception v0

    :try_start_c
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :catchall_5
    move-exception p1

    .line 171
    iget-object v0, p0, Ll/ܿܽܿ;->᩵֫:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 172
    throw p1
.end method

.method public static bridge synthetic ܿ(Ll/ܿܽܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ܿܽܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿܽܿ;->ۙ֫:I

    return p0
.end method


# virtual methods
.method public final ֨()Z
    .locals 1

    .line 1089
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-boolean v0, v0, Ll/᩺֫ܿ;->ۤ֫:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final declared-synchronized ֫(Ll/ۙۤᩳ;)I
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 289
    :try_start_0
    invoke-virtual {p1}, Ll/ۙۤᩳ;->ᩳ()I

    move-result v1

    invoke-virtual {p1}, Ll/ۙۤᩳ;->֫()I

    move-result p1

    invoke-direct {p0, v1, p1}, Ll/ܿܽܿ;->ܳ(II)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(F)V
    .locals 1

    .line 1319
    iget-object p1, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    if-eqz p1, :cond_0

    .line 1320
    iget-object p1, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    const/4 v0, 0x1

    iput-boolean v0, p1, Ll/ۧܽܿ;->ۧ֫:Z

    .line 1321
    iget-object p1, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    iput-boolean v0, p1, Ll/ۧܽܿ;->᩸:Z

    .line 1323
    :cond_0
    invoke-virtual {p0}, Ll/ܿܽܿ;->᩺()I

    move-result p1

    iput p1, p0, Ll/ۗۤᩳ;->ۙ:I

    return-void
.end method

.method public final declared-synchronized ֫(III)V
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 1106
    :try_start_0
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܺ()V

    .line 1107
    invoke-virtual {p0}, Ll/ܿܽܿ;->ۖ()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1108
    iget-object v1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-virtual {p0, v1}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;)V

    .line 1109
    iget v1, p0, Ll/ܿܽܿ;->ۙ֫:I

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۜ()I

    move-result v2

    sub-int/2addr v1, v2

    if-gtz v1, :cond_0

    .line 1111
    iget-object p1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-virtual {p0, p1}, Ll/ܿܽܿ;->ۧ(Ll/۟᩺ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 1112
    monitor-exit v0

    return-void

    .line 1115
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ll/ۗۤᩳ;->᩹()Ll/۟᩸ᩳ;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1116
    :try_start_2
    invoke-direct {p0, p1, p2, p3, v1}, Ll/ܿܽܿ;->֫(IIILl/۟᩸ᩳ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1117
    :try_start_3
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 1118
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 1115
    :try_start_5
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_6
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    .line 1117
    :try_start_7
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    throw p1

    .line 1107
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Layout is still preparing"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_3
    move-exception p1

    .line 1117
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 108
    invoke-super {p0, p1}, Ll/ۗۤᩳ;->֫(Ljava/lang/String;)V

    .line 109
    invoke-direct {p0}, Ll/ܿܽܿ;->۟()V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    .line 1463
    iget-object v0, p0, Ll/ܿܽܿ;->᩵֫:Ljava/util/concurrent/locks/ReentrantLock;

    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 1464
    invoke-super {p0, p1}, Ll/ۗۤᩳ;->֫(Ll/ۤۜܽ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1466
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1468
    iget v0, p0, Ll/ܿܽܿ;->ۙ֫:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 1469
    iget v0, p0, Ll/ܿܽܿ;->ۚ֫:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 1470
    iget-boolean v0, p0, Ll/ܿܽܿ;->֡֫:Z

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    return-void

    :catchall_0
    move-exception p1

    .line 1466
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1467
    throw p1
.end method

.method public final ֫(Z)V
    .locals 0

    .line 191
    iput-boolean p1, p0, Ll/ܿܽܿ;->֡֫:Z

    const/4 p1, 0x0

    .line 192
    iput p1, p0, Ll/ܿܽܿ;->ۚ֫:I

    .line 193
    invoke-direct {p0, p1}, Ll/ܿܽܿ;->ۧ(Z)V

    .line 194
    invoke-direct {p0}, Ll/ܿܽܿ;->۟()V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۖ()Z
    .locals 1

    .line 375
    iget-object v0, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    if-nez v0, :cond_1

    .line 2111
    iget-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۚ()Z
    .locals 1

    .line 1094
    iget-boolean v0, p0, Ll/ܿܽܿ;->֡֫:Z

    return v0
.end method

.method public final ۛ()Z
    .locals 2

    .line 37
    iget-boolean v0, p0, Ll/ܿܽܿ;->֨֫:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget-object v1, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()F
    .locals 1

    .line 1099
    iget v0, p0, Ll/ܿܽܿ;->ۙ֫:I

    int-to-float v0, v0

    return v0
.end method

.method public final ۤ()I
    .locals 1

    .line 302
    iget-object v0, p0, Ll/ܿܽܿ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final declared-synchronized ۧ(II)J
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 331
    :try_start_0
    iget-object v1, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget-object v2, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 342
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ۗۤᩳ;->ۧ(II)J

    move-result-wide p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide p1

    .line 332
    :cond_1
    :goto_0
    :try_start_1
    iget-object v1, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    const-wide/16 v2, 0x0

    if-nez v1, :cond_3

    .line 333
    iget-object v1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v1, p0}, Ll/۫ۨᩳ;->ۧ(Ll/ۗۤᩳ;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_2

    monitor-exit v0

    return-wide v2

    .line 334
    :cond_2
    :try_start_2
    invoke-direct {p0, p1, p2}, Ll/ܿܽܿ;->ܳ(II)I

    move-result p2

    :cond_3
    const/4 v1, 0x0

    if-lez p2, :cond_4

    .line 284
    invoke-direct {p0, p1, p2}, Ll/ܿܽܿ;->ܳ(II)I

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v4, p2, :cond_4

    const/4 v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_5

    .line 336
    monitor-exit v0

    return-wide v2

    .line 337
    :cond_5
    :try_start_3
    iget-object v2, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 338
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v3

    int-to-double v4, p1

    iget-object p1, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {p1}, Ll/ۢ۫ۡ;->ۜ()F

    move-result p1

    float-to-double v6, p1

    div-double v6, v4, v6

    double-to-int p1, v6

    add-int/lit16 p1, p1, -0xc8

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 339
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v1

    int-to-double v6, p2

    add-double/2addr v4, v6

    iget-object p2, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {p2}, Ll/ۢ۫ۡ;->ۜ()F

    move-result p2

    float-to-double v6, p2

    div-double/2addr v4, v6

    double-to-int p2, v4

    add-int/lit16 p2, p2, 0xc8

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 340
    invoke-virtual {v2, p1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object p1

    iget p1, p1, Ll/ۨܰᩳ;->᩶:I

    int-to-long v3, p1

    const/16 p1, 0x20

    shl-long/2addr v3, p1

    invoke-virtual {v2, p2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۨܰᩳ;->֫()I

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    int-to-long p1, p1

    const-wide v1, 0xffffffffL

    and-long/2addr p1, v1

    or-long/2addr p1, v3

    monitor-exit v0

    return-wide p1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final ۧ()V
    .locals 2

    .line 391
    invoke-virtual {p0}, Ll/ܿܽܿ;->ۨ()V

    .line 2115
    iget-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2116
    iput-boolean v0, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    .line 2117
    :goto_0
    iget-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x64

    .line 2118
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/۟᩺ᩳ;)V
    .locals 1

    .line 117
    :try_start_0
    invoke-direct {p0, p1}, Ll/ܿܽܿ;->ܽ(Ll/۟᩺ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    iget-boolean p1, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    iget-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    :cond_1
    throw p1
.end method

.method public final declared-synchronized ۧ(I)Z
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 309
    :try_start_0
    invoke-super {p0, p1}, Ll/ۗۤᩳ;->ۧ(I)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Ll/ۙۤᩳ;)Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 280
    :try_start_0
    invoke-virtual {p1}, Ll/ۙۤᩳ;->ᩳ()I

    move-result v1

    invoke-virtual {p1}, Ll/ۙۤᩳ;->֫()I

    move-result p1

    if-lez p1, :cond_0

    .line 284
    invoke-direct {p0, v1, p1}, Ll/ܿܽܿ;->ܳ(II)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 280
    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۨ()V
    .locals 3

    .line 380
    iget-object v0, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    const/4 v1, 0x0

    .line 381
    iput-object v1, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    .line 383
    iput-boolean v2, v0, Ll/ۧܽܿ;->᩸:Z

    .line 384
    iget-object v0, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    iput-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 385
    iput-object v1, p0, Ll/ܿܽܿ;->ܶ֫:Ll/᩷۟ᩳ;

    :cond_0
    return-void
.end method

.method public final ܰ()Z
    .locals 1

    .line 198
    iget-boolean v0, p0, Ll/ܿܽܿ;->֡֫:Z

    return v0
.end method

.method public final ܳ(I)V
    .locals 3

    .line 231
    iget-object v0, p0, Ll/ܿܽܿ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    monitor-enter v0

    if-lez p1, :cond_6

    .line 232
    :try_start_0
    iget v1, p0, Ll/ܿܽܿ;->ۙ֫:I

    if-ne v1, p1, :cond_0

    iget-boolean v1, p0, Ll/ܿܽܿ;->֨֫:Z

    if-eqz v1, :cond_6

    :cond_0
    invoke-virtual {p0}, Ll/ۗۤᩳ;->֡()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 234
    :cond_1
    iput p1, p0, Ll/ܿܽܿ;->ۙ֫:I

    .line 235
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۜ()I

    move-result v1

    sub-int/2addr p1, v1

    const/4 v1, 0x1

    if-gtz p1, :cond_2

    .line 236
    iput-boolean v1, p0, Ll/ܿܽܿ;->֨֫:Z

    .line 237
    monitor-exit v0

    return-void

    .line 239
    :cond_2
    iget-object p1, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    invoke-virtual {p1}, Ll/᩷۟ᩳ;->ܽ()Z

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    .line 240
    iput-boolean v2, p0, Ll/ܿܽܿ;->֨֫:Z

    .line 241
    monitor-exit v0

    return-void

    .line 243
    :cond_3
    iget-object p1, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    if-eqz p1, :cond_4

    .line 245
    invoke-direct {p0}, Ll/ܿܽܿ;->֫֫()V

    goto :goto_0

    .line 246
    :cond_4
    iget-boolean p1, p0, Ll/ܿܽܿ;->֨֫:Z

    if-eqz p1, :cond_5

    .line 248
    iput-boolean v2, p0, Ll/ܿܽܿ;->֨֫:Z

    .line 249
    invoke-direct {p0, v2}, Ll/ܿܽܿ;->ۧ(Z)V

    goto :goto_0

    .line 251
    :cond_5
    invoke-direct {p0, v1}, Ll/ܿܽܿ;->ۧ(Z)V

    .line 252
    :goto_0
    invoke-direct {p0}, Ll/ܿܽܿ;->۟()V

    .line 253
    iget-object p1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 254
    monitor-exit v0

    return-void

    .line 233
    :cond_6
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 254
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ܶ()V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 348
    :try_start_0
    invoke-virtual {p0}, Ll/ۗۤᩳ;->֡()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    .line 349
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    iget-object v2, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    iget-object v3, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    iget-object v4, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v4}, Ll/ۢ۫ۡ;->ۡ()I

    move-result v4

    invoke-virtual {v1, p0, v2, v3, v4}, Ll/᩸ܰᩳ;->֫(Ll/ۗۤᩳ;Ll/᩶᩸ᩳ;Ll/᩷۟ᩳ;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 350
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ(II)J
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 314
    :try_start_0
    iget-object v1, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget-object v2, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 325
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ۗۤᩳ;->ܽ(II)J

    move-result-wide p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide p1

    .line 315
    :cond_1
    :goto_0
    :try_start_1
    iget-object v1, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    const-wide/16 v2, -0x1

    if-nez v1, :cond_3

    .line 316
    iget-object v1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v1, p0}, Ll/۫ۨᩳ;->ۧ(Ll/ۗۤᩳ;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_2

    monitor-exit v0

    return-wide v2

    .line 317
    :cond_2
    :try_start_2
    invoke-direct {p0, p1, p2}, Ll/ܿܽܿ;->ܳ(II)I

    move-result p2

    :cond_3
    const/4 v1, 0x0

    if-lez p2, :cond_4

    .line 284
    invoke-direct {p0, p1, p2}, Ll/ܿܽܿ;->ܳ(II)I

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v4, p2, :cond_4

    const/4 v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_5

    .line 319
    monitor-exit v0

    return-wide v2

    .line 320
    :cond_5
    :try_start_3
    iget-object v2, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 321
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v3

    int-to-double v4, p1

    iget-object p1, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {p1}, Ll/ۢ۫ۡ;->ۜ()F

    move-result p1

    float-to-double v6, p1

    div-double v6, v4, v6

    double-to-int p1, v6

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 322
    invoke-virtual {v2}, Ll/᩷۟ᩳ;->ܿ()I

    move-result v1

    int-to-double v6, p2

    add-double/2addr v4, v6

    iget-object p2, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {p2}, Ll/ۢ۫ۡ;->ۜ()F

    move-result p2

    float-to-double v6, p2

    div-double/2addr v4, v6

    double-to-int p2, v4

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 323
    invoke-virtual {v2, p1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object p1

    iget p1, p1, Ll/ۨܰᩳ;->᩶:I

    int-to-long v3, p1

    const/16 p1, 0x20

    shl-long/2addr v3, p1

    invoke-virtual {v2, p2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۨܰᩳ;->֫()I

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    int-to-long p1, p1

    const-wide v1, 0xffffffffL

    and-long/2addr p1, v1

    or-long/2addr p1, v3

    monitor-exit v0

    return-wide p1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ܿ(II)Z
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 355
    :try_start_0
    iget-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget-object v2, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 358
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ۗۤᩳ;->ܿ(II)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    .line 356
    :cond_1
    :goto_0
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ᩶()Ljava/lang/Throwable;
    .locals 1

    .line 305
    iget-object v0, p0, Ll/ܿܽܿ;->ۖ֫:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final ᩷()B
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩸()V
    .locals 2

    .line 1328
    invoke-virtual {p0}, Ll/ܿܽܿ;->᩺()I

    move-result v0

    iput v0, p0, Ll/ۗۤᩳ;->ۙ:I

    .line 418
    invoke-virtual {p0}, Ll/ۗۤᩳ;->֡()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۡ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 420
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    iget-object v0, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    if-ne v0, p0, :cond_2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    .line 421
    invoke-interface {v0}, Ll/۟᩺ᩳ;->᩵֫()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ܿܽܿ;->᩸֫:Ll/ۧܽܿ;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۗۤᩳ;->۬()I

    move-result v0

    const v1, 0x186a0

    if-le v0, v1, :cond_2

    .line 422
    :cond_1
    invoke-direct {p0}, Ll/ܿܽܿ;->֫֫()V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 423
    invoke-direct {p0, v0}, Ll/ܿܽܿ;->ۧ(Z)V

    .line 1330
    :goto_0
    invoke-direct {p0}, Ll/ܿܽܿ;->۟()V

    .line 1331
    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 1332
    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡܽ()V

    return-void
.end method

.method public final ᩺()I
    .locals 2

    .line 368
    iget-object v0, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 369
    :cond_0
    iget-object v0, p0, Ll/ܿܽܿ;->ۘ֫:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v0

    iget v0, v0, Ll/ۨܰᩳ;->᩹:I

    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v1

    iget v1, v1, Ll/ۨܰᩳ;->᩹:I

    sub-int/2addr v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 370
    :goto_1
    invoke-virtual {p0, v0}, Ll/ۗۤᩳ;->֫(I)I

    move-result v0

    return v0
.end method

.method public final ᩻(I)Z
    .locals 1

    .line 259
    iget-boolean v0, p0, Ll/ܿܽܿ;->֨֫:Z

    if-nez v0, :cond_0

    iget v0, p0, Ll/ܿܽܿ;->ۙ֫:I

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result p1

    sub-int/2addr v0, p1

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۜ()I

    move-result p1

    sub-int/2addr v0, p1

    if-lez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
