.class public final Ll/ܽܺܿ;
.super Ljava/lang/Object;
.source "R704"


# static fields
.field public static final ۟:Ll/ۡۡܿ;


# instance fields
.field public final ֡:I

.field public volatile ֨:Ll/ۤۡܿ;

.field public ֫:Ll/ܶۘܿ;

.field public final ۖ:Ljava/lang/Object;

.field public ۗ:I

.field public final ۘ:J

.field public ۙ:J

.field public ۚ:Ll/ۨۡܿ;

.field public ۛ:Ll/۟ۡܿ;

.field public final ۜ:Ll/ۛۢܿ;

.field public ۠:Z

.field public ۡ:J

.field public final ۢ:Ljava/lang/Object;

.field public ۤ:I

.field public ۧ:I

.field public final ۨ:Ll/᩷ۘܿ;

.field public ۫:Ll/ܶۘܿ;

.field public ۬:Ll/᩶᩸ᩳ;

.field public ܰ:Z

.field public ܳ:Ll/᩶᩸ᩳ;

.field public ܶ:Ll/ۛۡܿ;

.field public final ܺ:Ll/۫ۡܿ;

.field public ܽ:Ll/᩹ۡܿ;

.field public ܿ:Ll/᩺ܺܿ;

.field public final ᩳ:Ll/֫ۡܿ;

.field public final ᩴ:I

.field public ᩵:J

.field public final ᩶:Z

.field public ᩷:Ll/᩷ۢܿ;

.field public ᩸:Z

.field public final ᩹:Ljava/util/ArrayDeque;

.field public final ᩺:Ljava/util/concurrent/Executor;

.field public ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Ll/ۡۡܿ;

    .line 24
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v1

    invoke-direct {v0, v1}, Ll/ۡۡܿ;-><init>(I)V

    sput-object v0, Ll/ܽܺܿ;->۟:Ll/ۡۡܿ;

    return-void
.end method

.method public constructor <init>(Ll/֫ۡܿ;Ll/۫ۡܿ;)V
    .locals 2

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    .line 27
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ܽܺܿ;->᩹:Ljava/util/ArrayDeque;

    .line 28
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ܽܺܿ;->ۢ:Ljava/lang/Object;

    .line 29
    new-instance v0, Ll/ۛۢܿ;

    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object v0, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    .line 30
    new-instance v0, Ll/᩷ۘܿ;

    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object v0, p0, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    const-wide/16 v0, -0x1

    .line 50
    iput-wide v0, p0, Ll/ܽܺܿ;->ۙ:J

    const/4 v0, 0x1

    .line 82
    iput-boolean v0, p0, Ll/ܽܺܿ;->᩶:Z

    const-string v0, "workerExecutor"

    .line 83
    sget-object v1, Ll/ܽܺܿ;->۟:Ll/ۡۡܿ;

    invoke-static {v1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v1, p0, Ll/ܽܺܿ;->᩺:Ljava/util/concurrent/Executor;

    .line 85
    iget v0, v1, Ll/ۡۡܿ;->᩹:I

    iput v0, p0, Ll/ܽܺܿ;->֡:I

    .line 86
    iput-object p1, p0, Ll/ܽܺܿ;->ᩳ:Ll/֫ۡܿ;

    .line 87
    iput-object p2, p0, Ll/ܽܺܿ;->ܺ:Ll/۫ۡܿ;

    const/16 p1, 0x1000

    .line 91
    iput p1, p0, Ll/ܽܺܿ;->ᩴ:I

    const-wide/32 p1, 0x7a1200

    .line 92
    iput-wide p1, p0, Ll/ܽܺܿ;->ۘ:J

    return-void
.end method

.method public static ֫(Ljava/lang/RuntimeException;)Ll/ۗۡܿ;
    .locals 2

    .line 879
    instance-of v0, p0, Ll/۠ۢܿ;

    if-eqz v0, :cond_4

    move-object v0, p0

    check-cast v0, Ll/۠ۢܿ;

    .line 880
    sget-object v1, Ll/᩸ۡܿ;->֫:[I

    invoke-virtual {v0}, Ll/۠ۢܿ;->֫()Ll/֡ۢܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance p0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {p0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw p0

    .line 884
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Canceled syntax requests must not publish failures"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 883
    :cond_1
    sget-object p0, Ll/ۗۡܿ;->᩶:Ll/ۗۡܿ;

    return-object p0

    .line 882
    :cond_2
    sget-object p0, Ll/ۗۡܿ;->ۙ:Ll/ۗۡܿ;

    return-object p0

    .line 881
    :cond_3
    sget-object p0, Ll/ۗۡܿ;->ۗ:Ll/ۗۡܿ;

    return-object p0

    .line 888
    :cond_4
    sget-object p0, Ll/ۗۡܿ;->᩹:Ll/ۗۡܿ;

    return-object p0
.end method

.method private ֫(Ll/ۨۡܿ;Ll/ۗۡܿ;)Ll/ۙۡܿ;
    .locals 11

    .line 871
    iget-wide v0, p0, Ll/ܽܺܿ;->ۡ:J

    invoke-static {p1}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-static {p1}, Ll/ۨۡܿ;->ۧ(Ll/ۨۡܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ll/ۨۡܿ;->֡(Ll/ۨۡܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 872
    new-instance v0, Ll/ۙۡܿ;

    invoke-static {p1}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v3

    invoke-static {p1}, Ll/ۨۡܿ;->᩷(Ll/ۨۡܿ;)I

    move-result v5

    invoke-static {p1}, Ll/ۨۡܿ;->ܺ(Ll/ۨۡܿ;)I

    move-result v6

    invoke-static {p1}, Ll/ۨۡܿ;->ۜ(Ll/ۨۡܿ;)Ll/᩺ۡܿ;

    move-result-object v7

    .line 873
    invoke-static {p1}, Ll/ۨۡܿ;->֨(Ll/ۨۡܿ;)I

    move-result v8

    .line 874
    invoke-static {p1}, Ll/ۨۡܿ;->ۚ(Ll/ۨۡܿ;)I

    move-result v9

    iget-object v2, p0, Ll/ܽܺܿ;->ۢ:Ljava/lang/Object;

    move-object v1, v0

    move-object v10, p2

    invoke-direct/range {v1 .. v10}, Ll/ۙۡܿ;-><init>(Ljava/lang/Object;JIILl/᩺ۡܿ;IILl/ۗۡܿ;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private ֫(Ll/᩹ۡܿ;)Ll/᩶ۡܿ;
    .locals 17

    move-object/from16 v1, p0

    .line 614
    invoke-static/range {p1 .. p1}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    .line 615
    invoke-static {v0}, Ll/ܽܺܿ;->֫(Ll/ۨۡܿ;)V

    .line 616
    invoke-static {v0}, Ll/ۨۡܿ;->ۡ(Ll/ۨۡܿ;)Ll/᩶᩸ᩳ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v6

    move-object/from16 v2, p1

    .line 617
    invoke-static {v2, v6}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;Ll/۟᩸ᩳ;)V

    .line 618
    invoke-virtual {v6}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v2

    invoke-static {v0}, Ll/ۨۡܿ;->᩷(Ll/ۨۡܿ;)I

    move-result v3

    if-ne v2, v3, :cond_c

    invoke-virtual {v6}, Ll/۟᩸ᩳ;->length()I

    move-result v2

    invoke-static {v0}, Ll/ۨۡܿ;->ܺ(Ll/ۨۡܿ;)I

    move-result v3

    if-ne v2, v3, :cond_c

    .line 623
    iget-object v2, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    move-object/from16 v16, v2

    monitor-enter v16

    .line 624
    :try_start_0
    iget-object v2, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-eqz v2, :cond_b

    invoke-static {v2}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v2

    if-ne v2, v0, :cond_b

    iget-wide v2, v1, Ll/ܽܺܿ;->ۡ:J

    invoke-static {v0}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v4

    cmp-long v7, v2, v4

    if-nez v7, :cond_b

    iget-object v2, v1, Ll/ܽܺܿ;->ܿ:Ll/᩺ܺܿ;

    invoke-static {v0}, Ll/ۨۡܿ;->ۢ(Ll/ۨۡܿ;)Ll/᩺ܺܿ;

    move-result-object v3

    if-ne v2, v3, :cond_b

    iget-object v2, v1, Ll/ܽܺܿ;->ܳ:Ll/᩶᩸ᩳ;

    invoke-static {v0}, Ll/ۨۡܿ;->ۡ(Ll/ۨۡܿ;)Ll/᩶᩸ᩳ;

    move-result-object v3

    if-ne v2, v3, :cond_b

    iget-boolean v2, v1, Ll/ܽܺܿ;->᩻:Z

    invoke-static {v0}, Ll/ۨۡܿ;->ۜ(Ll/ۨۡܿ;)Ll/᩺ۡܿ;

    move-result-object v3

    .line 626
    invoke-static {v3}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result v3

    if-ne v2, v3, :cond_b

    invoke-static {v0}, Ll/ۨۡܿ;->ۧ(Ll/ۨۡܿ;)Z

    move-result v2

    if-nez v2, :cond_b

    .line 630
    iget-object v2, v1, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    .line 631
    iget-object v3, v1, Ll/ܽܺܿ;->ۛ:Ll/۟ۡܿ;

    .line 632
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 633
    invoke-static {v0}, Ll/ܽܺܿ;->֫(Ll/ۨۡܿ;)V

    .line 635
    invoke-static {v0}, Ll/ۨۡܿ;->ۜ(Ll/ۨۡܿ;)Ll/᩺ۡܿ;

    move-result-object v4

    invoke-static {v4}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result v4

    const-wide/16 v14, 0x0

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    if-nez v3, :cond_0

    goto :goto_0

    .line 637
    :cond_0
    invoke-static {v3}, Ll/۟ۡܿ;->ܽ(Ll/۟ۡܿ;)Ll/ܳۘܿ;

    move-result-object v5

    .line 638
    :goto_0
    iget-object v2, v1, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v2}, Ll/᩷ۘܿ;->ۧ()Ll/ܳۘܿ;

    move-result-object v2

    if-eq v2, v5, :cond_1

    .line 640
    iget-object v2, v1, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v2}, Ll/᩷ۘܿ;->֫()V

    .line 642
    :cond_1
    iget-object v2, v1, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-static {v0}, Ll/ۨۡܿ;->ۢ(Ll/ۨۡܿ;)Ll/᩺ܺܿ;

    move-result-object v4

    invoke-static {v0}, Ll/ۨۡܿ;->ۡ(Ll/ۨۡܿ;)Ll/᩶᩸ᩳ;

    move-result-object v7

    invoke-static {v0}, Ll/ۨۡܿ;->᩷(Ll/ۨۡܿ;)I

    move-result v8

    int-to-long v8, v8

    .line 644
    invoke-static {v0}, Ll/ۨۡܿ;->֨(Ll/ۨۡܿ;)I

    move-result v10

    invoke-static {v0}, Ll/ۨۡܿ;->ۚ(Ll/ۨۡܿ;)I

    move-result v11

    new-instance v12, Ll/֡ۡܿ;

    invoke-direct {v12, v0}, Ll/֡ۡܿ;-><init>(Ll/ۨۡܿ;)V

    .line 645
    invoke-static {v0}, Ll/ۨۡܿ;->ۘ(Ll/ۨۡܿ;)Ll/۟ۡܿ;

    move-result-object v13

    if-ne v13, v3, :cond_2

    move-object v13, v5

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    move-object v13, v3

    :goto_1
    invoke-static {v0}, Ll/ۨۡܿ;->ܽ(Ll/ۨۡܿ;)Ll/ܶۘܿ;

    move-result-object v16

    move-object v3, v2

    move-object v5, v7

    move-wide v7, v8

    move v9, v10

    move v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object/from16 v13, v16

    .line 642
    invoke-virtual/range {v3 .. v13}, Ll/᩷ۘܿ;->֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;Ll/۟᩸ᩳ;JIILl/֡ۡܿ;Ll/ܳۘܿ;Ll/ܶۘܿ;)Ll/ۜۘܿ;

    move-result-object v2

    .line 646
    invoke-static {v0}, Ll/ܽܺܿ;->֫(Ll/ۨۡܿ;)V

    .line 647
    iget-boolean v3, v1, Ll/ܽܺܿ;->᩶:Z

    if-eqz v3, :cond_3

    invoke-static {v0}, Ll/ۨۡܿ;->ܳ(Ll/ۨۡܿ;)Ll/᩷ۢܿ;

    move-result-object v3

    iget-object v4, v1, Ll/ܽܺܿ;->᩺:Ljava/util/concurrent/Executor;

    .line 228
    new-instance v5, Ll/ܶۡܿ;

    invoke-direct {v5, v1, v0}, Ll/ܶۡܿ;-><init>(Ll/ܽܺܿ;Ll/ۨۡܿ;)V

    .line 647
    invoke-virtual {v2, v3, v4, v5}, Ll/ۜۘܿ;->֫(Ll/᩷ۢܿ;Ljava/util/concurrent/Executor;Ll/ܶۡܿ;)V

    .line 648
    :cond_3
    new-instance v0, Ll/᩶ۡܿ;

    new-instance v3, Ll/֫ܺܿ;

    invoke-direct {v3, v2}, Ll/֫ܺܿ;-><init>(Ll/ۜۘܿ;)V

    invoke-direct {v0, v3, v14, v15}, Ll/᩶ۡܿ;-><init>(Ll/ۧܺܿ;J)V

    return-object v0

    :cond_4
    if-nez v2, :cond_5

    const/4 v3, 0x0

    goto :goto_2

    .line 651
    :cond_5
    invoke-static {v2}, Ll/ۛۡܿ;->ܽ(Ll/ۛۡܿ;)Ll/ܺۖܿ;

    move-result-object v3

    .line 653
    :goto_2
    iget-object v4, v1, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-virtual {v4}, Ll/ۛۢܿ;->ۧ()Ll/ܺۖܿ;

    move-result-object v4

    if-eq v4, v3, :cond_6

    .line 655
    iget-object v3, v1, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-virtual {v3}, Ll/ۛۢܿ;->֫()V

    goto :goto_3

    :cond_6
    if-nez v2, :cond_7

    goto :goto_3

    .line 658
    :cond_7
    invoke-static {v2}, Ll/ۛۡܿ;->ۧ(Ll/ۛۡܿ;)J

    move-result-wide v14

    .line 661
    :goto_3
    invoke-static {v0}, Ll/ۨۡܿ;->֫(Ll/ۨۡܿ;)Ll/ۛۡܿ;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-static {v0}, Ll/ۨۡܿ;->֫(Ll/ۨۡܿ;)Ll/ۛۡܿ;

    move-result-object v3

    if-ne v3, v2, :cond_8

    iget-object v2, v1, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-virtual {v2}, Ll/ۛۢܿ;->ۧ()Ll/ܺۖܿ;

    move-result-object v2

    invoke-static {v0}, Ll/ۨۡܿ;->֫(Ll/ۨۡܿ;)Ll/ۛۡܿ;

    move-result-object v3

    invoke-static {v3}, Ll/ۛۡܿ;->ܽ(Ll/ۛۡܿ;)Ll/ܺۖܿ;

    move-result-object v3

    if-ne v2, v3, :cond_8

    .line 662
    invoke-static {v0}, Ll/ۨۡܿ;->֫(Ll/ۨۡܿ;)Ll/ۛۡܿ;

    move-result-object v2

    invoke-static {v2}, Ll/ۛۡܿ;->ܽ(Ll/ۛۡܿ;)Ll/ܺۖܿ;

    move-result-object v2

    goto :goto_4

    :cond_8
    const/4 v2, 0x0

    :goto_4
    move-object v7, v2

    .line 663
    invoke-static {v0}, Ll/ۨۡܿ;->ۜ(Ll/ۨۡܿ;)Ll/᩺ۡܿ;

    move-result-object v2

    sget-object v3, Ll/᩺ۡܿ;->᩹:Ll/᩺ۡܿ;

    if-ne v2, v3, :cond_9

    .line 664
    iget-object v3, v1, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-static {v0}, Ll/ۨۡܿ;->ۢ(Ll/ۨۡܿ;)Ll/᩺ܺܿ;

    move-result-object v4

    invoke-static {v0}, Ll/ۨۡܿ;->ۡ(Ll/ۨۡܿ;)Ll/᩶᩸ᩳ;

    move-result-object v5

    invoke-static {v0}, Ll/ۨۡܿ;->᩷(Ll/ۨۡܿ;)I

    move-result v2

    int-to-long v8, v2

    invoke-static {v0}, Ll/ۨۡܿ;->ܽ(Ll/ۨۡܿ;)Ll/ܶۘܿ;

    move-result-object v10

    .line 665
    new-instance v11, Ll/֡ۡܿ;

    invoke-direct {v11, v0}, Ll/֡ۡܿ;-><init>(Ll/ۨۡܿ;)V

    .line 664
    invoke-virtual/range {v3 .. v11}, Ll/ۛۢܿ;->֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;Ll/۟᩸ᩳ;Ll/ܺۖܿ;JLl/ܶۘܿ;Ll/֡ۡܿ;)Ll/ۤۢܿ;

    move-result-object v2

    goto :goto_5

    .line 666
    :cond_9
    iget-object v3, v1, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-static {v0}, Ll/ۨۡܿ;->ۢ(Ll/ۨۡܿ;)Ll/᩺ܺܿ;

    move-result-object v4

    invoke-static {v0}, Ll/ۨۡܿ;->ۡ(Ll/ۨۡܿ;)Ll/᩶᩸ᩳ;

    move-result-object v5

    invoke-static {v0}, Ll/ۨۡܿ;->᩷(Ll/ۨۡܿ;)I

    move-result v2

    int-to-long v7, v2

    .line 667
    new-instance v9, Ll/֡ۡܿ;

    invoke-direct {v9, v0}, Ll/֡ۡܿ;-><init>(Ll/ۨۡܿ;)V

    .line 666
    invoke-virtual/range {v3 .. v9}, Ll/ۛۢܿ;->֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;Ll/۟᩸ᩳ;JLl/֡ۡܿ;)Ll/ۤۢܿ;

    move-result-object v2

    .line 668
    :goto_5
    invoke-static {v0}, Ll/ܽܺܿ;->֫(Ll/ۨۡܿ;)V

    .line 669
    iget-boolean v3, v1, Ll/ܽܺܿ;->᩶:Z

    if-eqz v3, :cond_a

    invoke-static {v0}, Ll/ۨۡܿ;->ܳ(Ll/ۨۡܿ;)Ll/᩷ۢܿ;

    move-result-object v3

    iget-object v4, v1, Ll/ܽܺܿ;->᩺:Ljava/util/concurrent/Executor;

    .line 228
    new-instance v5, Ll/ܶۡܿ;

    invoke-direct {v5, v1, v0}, Ll/ܶۡܿ;-><init>(Ll/ܽܺܿ;Ll/ۨۡܿ;)V

    .line 669
    invoke-virtual {v2, v3, v4, v5}, Ll/ۤۢܿ;->֫(Ll/᩷ۢܿ;Ljava/util/concurrent/Executor;Ll/ܶۡܿ;)V

    .line 670
    :cond_a
    new-instance v0, Ll/᩶ۡܿ;

    new-instance v3, Ll/۬ۡܿ;

    invoke-direct {v3, v2}, Ll/۬ۡܿ;-><init>(Ll/ۤۢܿ;)V

    invoke-direct {v0, v3, v14, v15}, Ll/᩶ۡܿ;-><init>(Ll/ۧܺܿ;J)V

    return-object v0

    .line 628
    :cond_b
    :try_start_1
    new-instance v0, Ll/ܰۡܿ;

    .line 1304
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 628
    throw v0

    :catchall_0
    move-exception v0

    .line 632
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 619
    :cond_c
    new-instance v0, Ll/ܰۡܿ;

    .line 1304
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 619
    throw v0
.end method

.method private ֫(Ljava/lang/Runnable;)V
    .locals 3

    .line 751
    :try_start_0
    iget-object v0, p0, Ll/ܽܺܿ;->ᩳ:Ll/֫ۡܿ;

    new-instance v1, Ll/ۚۡܿ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Ll/ۚۡܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/֫ۡܿ;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ֫(Ll/ۨۡܿ;)V
    .locals 1

    .line 893
    invoke-static {p0}, Ll/ۨۡܿ;->ۧ(Ll/ۨۡܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ll/ۨۡܿ;->֡(Ll/ۨۡܿ;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    .line 894
    :cond_0
    new-instance p0, Ll/ܰۡܿ;

    .line 1304
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 894
    throw p0
.end method

.method public static ֫(Ll/ܽܺܿ;)V
    .locals 17

    move-object/from16 v1, p0

    .line 434
    iget-object v2, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v2

    .line 435
    :try_start_0
    iget-object v0, v1, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 436
    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-eqz v0, :cond_0

    .line 437
    invoke-static {v0}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->ᩴ(Ll/ۨۡܿ;)V

    .line 438
    iget-object v0, v1, Ll/ܽܺܿ;->᩹:Ljava/util/ArrayDeque;

    iget-object v4, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 440
    :cond_0
    new-instance v0, Ll/᩹ۡܿ;

    iget-object v4, v1, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    invoke-direct {v0, v4}, Ll/᩹ۡܿ;-><init>(Ll/ۨۡܿ;)V

    .line 441
    iput-object v3, v1, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    .line 442
    iput-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    goto :goto_0

    .line 444
    :cond_1
    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    :goto_0
    move-object v4, v0

    const/4 v5, 0x0

    if-nez v4, :cond_2

    .line 447
    iput-boolean v5, v1, Ll/ܽܺܿ;->ܰ:Z

    .line 448
    monitor-exit v2

    return-void

    :cond_2
    const/4 v6, 0x1

    .line 450
    invoke-static {v4, v6}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;Z)V

    .line 451
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_18

    .line 454
    :try_start_1
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۖ()V

    .line 455
    invoke-static {v4}, Ll/᩹ۡܿ;->ܽ(Ll/᩹ۡܿ;)Ll/ۧܺܿ;

    move-result-object v0

    if-nez v0, :cond_a

    .line 457
    invoke-direct {v1, v4}, Ll/ܽܺܿ;->֫(Ll/᩹ۡܿ;)Ll/᩶ۡܿ;

    move-result-object v2

    .line 459
    iget-object v7, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v7
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_10

    .line 460
    :try_start_2
    iget-object v8, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-ne v8, v4, :cond_3

    iget-wide v8, v1, Ll/ܽܺܿ;->ۡ:J

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v10

    invoke-static {v10}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v10

    cmp-long v12, v8, v10

    if-nez v12, :cond_3

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v8

    invoke-static {v8}, Ll/ۨۡܿ;->ۧ(Ll/ۨۡܿ;)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v8

    .line 461
    invoke-static {v8}, Ll/ۨۡܿ;->֡(Ll/ۨۡܿ;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    const/4 v8, 0x0

    :goto_1
    if-eqz v8, :cond_4

    .line 463
    invoke-static {v2}, Ll/᩶ۡܿ;->ۧ(Ll/᩶ۡܿ;)Ll/ۧܺܿ;

    move-result-object v0

    invoke-static {v4, v0}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;Ll/ۧܺܿ;)V

    .line 464
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    invoke-static {v2}, Ll/᩶ۡܿ;->ۧ(Ll/᩶ۡܿ;)Ll/ۧܺܿ;

    move-result-object v0

    goto :goto_2

    .line 468
    :cond_4
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/ܽܺܿ;->ۧ(Ll/ۨۡܿ;)V

    .line 470
    :goto_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-nez v8, :cond_a

    .line 587
    iget-object v2, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v2

    .line 588
    :try_start_3
    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-ne v0, v4, :cond_5

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->ۧ(Ll/ۨۡܿ;)Z

    move-result v0

    if-eqz v0, :cond_5

    iput-object v3, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    .line 589
    :cond_5
    invoke-static {v4, v5}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;Z)V

    .line 590
    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-eq v0, v4, :cond_6

    iget-object v0, v1, Ll/ܽܺܿ;->᩹:Ljava/util/ArrayDeque;

    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 591
    :cond_6
    iput-boolean v5, v1, Ll/ܽܺܿ;->ܰ:Z

    .line 592
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ܺ()Z

    move-result v3

    .line 593
    iget-object v0, v1, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    if-nez v0, :cond_7

    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-nez v0, :cond_7

    iget-object v0, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 594
    :cond_7
    iget-boolean v0, v1, Ll/ܽܺܿ;->۠:Z

    .line 595
    iput-boolean v5, v1, Ll/ܽܺܿ;->۠:Z

    .line 596
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 598
    :try_start_4
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۖ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v3, :cond_8

    .line 600
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۡ()V

    :cond_8
    if-eqz v0, :cond_32

    .line 602
    iget-object v0, v1, Ll/ܽܺܿ;->ܺ:Ll/۫ۡܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/ۖ۫᩻;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0}, Ll/ۖ۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-direct {v1, v2}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    if-eqz v3, :cond_9

    .line 600
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۡ()V

    .line 601
    :cond_9
    throw v2

    :catchall_1
    move-exception v0

    .line 596
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :catchall_2
    move-exception v0

    .line 470
    :try_start_6
    monitor-exit v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    throw v0

    .line 474
    :cond_a
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v2

    invoke-static {v2}, Ll/ܽܺܿ;->֫(Ll/ۨۡܿ;)V

    .line 475
    iget v2, v1, Ll/ܽܺܿ;->ᩴ:I

    iget-wide v7, v1, Ll/ܽܺܿ;->ۘ:J

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v9

    invoke-static {v9}, Ll/ۨۡܿ;->ܳ(Ll/ۨۡܿ;)Ll/᩷ۢܿ;

    move-result-object v9

    iget-object v9, v9, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    invoke-interface {v0, v2, v7, v8, v9}, Ll/ۧܺܿ;->֫(IJLl/᩺᩷ܿ;)Ll/ۙۢܿ;

    move-result-object v2

    .line 477
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v7

    invoke-static {v7}, Ll/ܽܺܿ;->֫(Ll/ۨۡܿ;)V

    .line 478
    sget-object v7, Ll/ۙۢܿ;->᩶:Ll/ۙۢܿ;

    if-ne v2, v7, :cond_1a

    .line 479
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v2

    invoke-static {v2}, Ll/ۨۡܿ;->ۜ(Ll/ۨۡܿ;)Ll/᩺ۡܿ;

    move-result-object v2

    invoke-static {v2}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 480
    check-cast v0, Ll/֫ܺܿ;

    .line 481
    iget-object v2, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v2
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_10

    .line 482
    :try_start_8
    iget-object v7, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-ne v7, v4, :cond_f

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v7

    invoke-static {v7}, Ll/ۨۡܿ;->ۧ(Ll/ۨۡܿ;)Z

    move-result v7

    if-nez v7, :cond_f

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v7

    .line 483
    invoke-static {v7}, Ll/ۨۡܿ;->֡(Ll/ۨۡܿ;)Z

    move-result v7

    if-eqz v7, :cond_f

    iget-wide v7, v1, Ll/ܽܺܿ;->ۡ:J

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v9

    invoke-static {v9}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v9

    cmp-long v11, v7, v9

    if-nez v11, :cond_f

    .line 485
    iput-object v3, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    .line 486
    iget-object v7, v1, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-static {v0}, Ll/֫ܺܿ;->֫(Ll/֫ܺܿ;)Ll/ۜۘܿ;

    move-result-object v0

    invoke-virtual {v7, v0}, Ll/᩷ۘܿ;->֫(Ll/ۜۘܿ;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 487
    iget-object v0, v1, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v0}, Ll/᩷ۘܿ;->ۧ()Ll/ܳۘܿ;

    move-result-object v12

    if-eqz v12, :cond_c

    .line 489
    invoke-virtual {v12}, Ll/ܳۘܿ;->ᩳ()Ll/᩺ܺܿ;

    move-result-object v0

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v7

    invoke-static {v7}, Ll/ۨۡܿ;->ۢ(Ll/ۨۡܿ;)Ll/᩺ܺܿ;

    move-result-object v7

    if-ne v0, v7, :cond_c

    .line 490
    invoke-virtual {v12}, Ll/ܳۘܿ;->᩷()J

    move-result-wide v7

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->᩷(Ll/ۨۡܿ;)I

    move-result v0

    int-to-long v9, v0

    cmp-long v0, v7, v9

    if-nez v0, :cond_c

    .line 491
    invoke-virtual {v12}, Ll/ܳۘܿ;->ۜ()I

    move-result v0

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v7

    invoke-static {v7}, Ll/ۨۡܿ;->ܺ(Ll/ۨۡܿ;)I

    move-result v7

    if-ne v0, v7, :cond_c

    .line 492
    invoke-virtual {v12}, Ll/ܳۘܿ;->ܳ()I

    move-result v0

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v7

    invoke-static {v7}, Ll/ۨۡܿ;->֨(Ll/ۨۡܿ;)I

    move-result v7

    if-ne v0, v7, :cond_c

    .line 493
    invoke-virtual {v12}, Ll/ܳۘܿ;->ܽ()I

    move-result v0

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v7

    invoke-static {v7}, Ll/ۨۡܿ;->ۚ(Ll/ۨۡܿ;)I

    move-result v7

    if-eq v0, v7, :cond_b

    goto :goto_3

    .line 500
    :cond_b
    new-instance v14, Ll/۟ۡܿ;

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v8

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->᩷(Ll/ۨۡܿ;)I

    move-result v10

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->ܺ(Ll/ۨۡܿ;)I

    move-result v11

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->ܿ(Ll/ۨۡܿ;)I

    move-result v13

    move-object v7, v14

    invoke-direct/range {v7 .. v13}, Ll/۟ۡܿ;-><init>(JIILl/ܳۘܿ;I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 504
    :try_start_9
    iput-object v14, v1, Ll/ܽܺܿ;->ۛ:Ll/۟ۡܿ;

    .line 505
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->ܺ(Ll/ۨۡܿ;)I

    move-result v0

    new-array v7, v5, [Ll/۠ۘܿ;

    invoke-static {v0, v7}, Ll/ܶۘܿ;->֫(I[Ll/۠ۘܿ;)Ll/ܶۘܿ;

    move-result-object v0

    iput-object v0, v1, Ll/ܽܺܿ;->۫:Ll/ܶۘܿ;

    .line 506
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->᩷(Ll/ۨۡܿ;)I

    move-result v0

    iput v0, v1, Ll/ܽܺܿ;->ۤ:I

    .line 507
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۜ()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    move-object v0, v3

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v7, v3

    goto :goto_6

    .line 494
    :cond_c
    :goto_3
    :try_start_a
    iget-object v0, v1, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v0}, Ll/᩷ۘܿ;->֫()V

    .line 495
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    sget-object v7, Ll/ۗۡܿ;->᩶:Ll/ۗۡܿ;

    new-instance v8, Ljava/lang/IllegalStateException;

    const-string v9, "Syntax window task published an invalid result"

    invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0, v7}, Ll/ܽܺܿ;->֫(Ll/ۨۡܿ;Ll/ۗۡܿ;)Ll/ۙۡܿ;

    move-result-object v0

    move-object v14, v3

    :goto_4
    move-object v7, v0

    goto :goto_5

    .line 511
    :cond_d
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_e

    .line 514
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->᩷()V

    .line 515
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    sget-object v7, Ll/ۗۡܿ;->᩶:Ll/ۗۡܿ;

    new-instance v8, Ljava/lang/IllegalStateException;

    const-string v9, "Syntax window task completed without publication"

    invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0, v7}, Ll/ܽܺܿ;->֫(Ll/ۨۡܿ;Ll/ۗۡܿ;)Ll/ۙۡܿ;

    move-result-object v0

    move-object v7, v0

    move-object v14, v3

    goto :goto_5

    .line 512
    :cond_e
    new-instance v0, Ll/ܰۡܿ;

    .line 1304
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 512
    throw v0

    .line 521
    :cond_f
    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-ne v0, v4, :cond_10

    iput-object v3, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    .line 522
    :cond_10
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ܽܺܿ;->ۧ(Ll/ۨۡܿ;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    move-object v7, v3

    move-object v14, v7

    .line 524
    :goto_5
    :try_start_b
    monitor-exit v2

    goto/16 :goto_10

    :catchall_4
    move-exception v0

    goto :goto_6

    :catchall_5
    move-exception v0

    move-object v7, v3

    move-object v14, v7

    :goto_6
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :try_start_c
    throw v0
    :try_end_c
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/Error; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    :catchall_6
    move-exception v0

    move-object/from16 v16, v3

    move-object v5, v4

    move-object v4, v7

    move-object v8, v14

    goto/16 :goto_12

    :catch_0
    move-exception v0

    move-object/from16 v16, v3

    move-object v5, v4

    move-object v4, v7

    move-object v8, v14

    goto/16 :goto_14

    :catch_1
    move-exception v0

    move-object/from16 v16, v3

    move-object v5, v4

    move-object v4, v7

    move-object v8, v14

    goto/16 :goto_17

    .line 526
    :cond_11
    :try_start_d
    check-cast v0, Ll/۬ۡܿ;

    .line 528
    invoke-static {v0}, Ll/۬ۡܿ;->֫(Ll/۬ۡܿ;)Ll/ۤۢܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۤۢܿ;->֫()Ll/ܺۖܿ;

    move-result-object v12

    if-eqz v12, :cond_13

    .line 530
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v2

    invoke-static {v2}, Ll/ۨۡܿ;->ᩳ(Ll/ۨۡܿ;)Ll/ۢۖܿ;

    move-result-object v2

    if-nez v2, :cond_12

    goto :goto_7

    .line 531
    :cond_12
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v2

    invoke-static {v2}, Ll/ۨۡܿ;->ᩳ(Ll/ۨۡܿ;)Ll/ۢۖܿ;

    move-result-object v2

    invoke-virtual {v12}, Ll/ܺۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v7

    invoke-virtual {v2, v7}, Ll/ۢۖܿ;->ۧ(Ll/ۢۖܿ;)Ll/ܳۖܿ;

    move-result-object v2

    move-object v15, v2

    goto :goto_8

    :cond_13
    :goto_7
    move-object v15, v3

    .line 532
    :goto_8
    iget-object v2, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v2
    :try_end_d
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_9
    .catch Ljava/lang/Error; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_10

    .line 533
    :try_start_e
    iget-object v7, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-ne v7, v4, :cond_18

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v7

    invoke-static {v7}, Ll/ۨۡܿ;->ۧ(Ll/ۨۡܿ;)Z

    move-result v7

    if-nez v7, :cond_18

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v7

    .line 534
    invoke-static {v7}, Ll/ۨۡܿ;->֡(Ll/ۨۡܿ;)Z

    move-result v7

    if-eqz v7, :cond_18

    iget-wide v7, v1, Ll/ܽܺܿ;->ۡ:J

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v9

    invoke-static {v9}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v9

    cmp-long v11, v7, v9

    if-nez v11, :cond_18

    .line 536
    iput-object v3, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-eqz v12, :cond_16

    .line 537
    invoke-static {v0}, Ll/۬ۡܿ;->֫(Ll/۬ۡܿ;)Ll/ۤۢܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤۢܿ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_b

    .line 546
    :cond_14
    new-instance v14, Ll/ۛۡܿ;

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v8

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->᩷(Ll/ۨۡܿ;)I

    move-result v10

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->ܺ(Ll/ۨۡܿ;)I

    move-result v11

    .line 549
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->ᩳ(Ll/ۨۡܿ;)Ll/ۢۖܿ;

    move-result-object v0

    if-eqz v0, :cond_15

    const/4 v0, 0x1

    const/4 v13, 0x1

    goto :goto_9

    :cond_15
    const/4 v0, 0x0

    const/4 v13, 0x0

    :goto_9
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->ܿ(Ll/ۨۡܿ;)I

    move-result v0

    move-object v7, v14

    move-object v3, v14

    move v14, v0

    invoke-direct/range {v7 .. v15}, Ll/ۛۡܿ;-><init>(JIILl/ܺۖܿ;ZILl/ܳۖܿ;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 552
    :try_start_f
    iput-object v3, v1, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    .line 553
    iput-boolean v6, v1, Ll/ܽܺܿ;->᩸:Z

    .line 554
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->ܺ(Ll/ۨۡܿ;)I

    move-result v0

    new-array v7, v5, [Ll/۠ۘܿ;

    invoke-static {v0, v7}, Ll/ܶۘܿ;->֫(I[Ll/۠ۘܿ;)Ll/ܶۘܿ;

    move-result-object v0

    iput-object v0, v1, Ll/ܽܺܿ;->֫:Ll/ܶۘܿ;

    .line 555
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->᩷(Ll/ۨۡܿ;)I

    move-result v0

    iput v0, v1, Ll/ܽܺܿ;->ۧ:I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    move-object v14, v3

    const/4 v7, 0x0

    goto :goto_d

    :catchall_7
    move-exception v0

    move-object/from16 v16, v3

    move-object v5, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_a
    const/4 v6, 0x0

    const/4 v7, 0x1

    goto :goto_e

    .line 539
    :cond_16
    :goto_b
    :try_start_10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_17

    .line 542
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ܽܺܿ;->ۧ(Ll/ۨۡܿ;)V

    .line 543
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    sget-object v3, Ll/ۗۡܿ;->᩶:Ll/ۗۡܿ;

    new-instance v7, Ljava/lang/IllegalStateException;

    const-string v8, "Syntax task completed without publication"

    invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0, v3}, Ll/ܽܺܿ;->֫(Ll/ۨۡܿ;Ll/ۗۡܿ;)Ll/ۙۡܿ;

    move-result-object v0

    move-object v7, v0

    goto :goto_c

    .line 540
    :cond_17
    new-instance v0, Ll/ܰۡܿ;

    .line 1304
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 540
    throw v0

    .line 558
    :cond_18
    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-ne v0, v4, :cond_19

    const/4 v3, 0x0

    iput-object v3, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    .line 559
    :cond_19
    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ܽܺܿ;->ۧ(Ll/ۨۡܿ;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    const/4 v7, 0x0

    :goto_c
    const/4 v14, 0x0

    .line 561
    :goto_d
    :try_start_11
    monitor-exit v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    move-object v3, v14

    goto :goto_f

    :catchall_8
    move-exception v0

    move-object v5, v4

    move-object v4, v7

    move-object/from16 v16, v14

    const/4 v3, 0x0

    goto :goto_a

    :catchall_9
    move-exception v0

    move-object v5, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/16 v16, 0x0

    :goto_e
    :try_start_12
    monitor-exit v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    :try_start_13
    throw v0
    :try_end_13
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_3
    .catch Ljava/lang/Error; {:try_start_13 .. :try_end_13} :catch_2
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    :catchall_a
    move-exception v0

    move-object v8, v3

    goto/16 :goto_1a

    :catch_2
    move-exception v0

    move-object v8, v3

    goto/16 :goto_15

    :catch_3
    move-exception v0

    move-object v8, v3

    goto/16 :goto_18

    :catchall_b
    move-exception v0

    goto :goto_e

    .line 563
    :cond_1a
    :try_start_14
    sget-object v0, Ll/ۙۢܿ;->᩹:Ll/ۙۢܿ;
    :try_end_14
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_14} :catch_7
    .catch Ljava/lang/Error; {:try_start_14 .. :try_end_14} :catch_6
    .catchall {:try_start_14 .. :try_end_14} :catchall_f

    if-eq v2, v0, :cond_23

    const/4 v3, 0x0

    const/4 v7, 0x0

    :goto_f
    const/4 v14, 0x0

    .line 587
    :goto_10
    iget-object v2, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v2

    .line 588
    :try_start_15
    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-ne v0, v4, :cond_1b

    invoke-static {v4}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->ۧ(Ll/ۨۡܿ;)Z

    move-result v0

    if-eqz v0, :cond_1b

    const/4 v8, 0x0

    iput-object v8, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    .line 589
    :cond_1b
    invoke-static {v4, v5}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;Z)V

    .line 590
    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-eq v0, v4, :cond_1c

    iget-object v0, v1, Ll/ܽܺܿ;->᩹:Ljava/util/ArrayDeque;

    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 591
    :cond_1c
    iput-boolean v5, v1, Ll/ܽܺܿ;->ܰ:Z

    .line 592
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ܺ()Z

    move-result v4

    .line 593
    iget-object v0, v1, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    if-nez v0, :cond_1d

    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-nez v0, :cond_1d

    iget-object v0, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 594
    :cond_1d
    iget-boolean v0, v1, Ll/ܽܺܿ;->۠:Z

    .line 595
    iput-boolean v5, v1, Ll/ܽܺܿ;->۠:Z

    .line 596
    monitor-exit v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_d

    .line 598
    :try_start_16
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۖ()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    if-eqz v4, :cond_1e

    .line 600
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۡ()V

    :cond_1e
    if-eqz v0, :cond_1f

    .line 602
    iget-object v0, v1, Ll/ܽܺܿ;->ܺ:Ll/۫ۡܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/ۖ۫᩻;

    const/4 v4, 0x1

    invoke-direct {v2, v4, v0}, Ll/ۖ۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-direct {v1, v2}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    :cond_1f
    if-eqz v3, :cond_20

    .line 604
    invoke-static {v3}, Ll/ۛۡܿ;->ۧ(Ll/ۛۡܿ;)J

    move-result-wide v2

    .line 711
    new-instance v0, Ll/۠ۡܿ;

    invoke-direct {v0, v1, v2, v3}, Ll/۠ۡܿ;-><init>(Ll/ܽܺܿ;J)V

    invoke-direct {v1, v0}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    :cond_20
    if-eqz v14, :cond_21

    .line 606
    invoke-static {v14}, Ll/۟ۡܿ;->ۧ(Ll/۟ۡܿ;)J

    move-result-wide v2

    .line 725
    new-instance v0, Ll/֨ۡܿ;

    invoke-direct {v0, v1, v2, v3}, Ll/֨ۡܿ;-><init>(Ll/ܽܺܿ;J)V

    invoke-direct {v1, v0}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    :cond_21
    if-eqz v7, :cond_32

    .line 739
    new-instance v0, Ll/᩶ۜۢ;

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1, v7}, Ll/᩶ۜۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v1, v0}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    return-void

    :catchall_c
    move-exception v0

    move-object v2, v0

    if-eqz v4, :cond_22

    .line 600
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۡ()V

    .line 601
    :cond_22
    throw v2

    :catchall_d
    move-exception v0

    .line 596
    :try_start_17
    monitor-exit v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    throw v0

    :cond_23
    const/4 v8, 0x0

    .line 564
    :try_start_18
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Syntax task aborted without a failure"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_18
    .catch Ljava/lang/RuntimeException; {:try_start_18 .. :try_end_18} :catch_5
    .catch Ljava/lang/Error; {:try_start_18 .. :try_end_18} :catch_4
    .catchall {:try_start_18 .. :try_end_18} :catchall_e

    :catchall_e
    move-exception v0

    goto :goto_11

    :catch_4
    move-exception v0

    goto :goto_13

    :catch_5
    move-exception v0

    goto :goto_16

    :catchall_f
    move-exception v0

    const/4 v8, 0x0

    goto :goto_11

    :catch_6
    move-exception v0

    const/4 v8, 0x0

    goto :goto_13

    :catch_7
    move-exception v0

    const/4 v8, 0x0

    goto :goto_16

    :catchall_10
    move-exception v0

    move-object v8, v3

    :goto_11
    move-object v5, v4

    move-object v3, v8

    move-object v4, v3

    move-object/from16 v16, v4

    :goto_12
    const/4 v6, 0x0

    goto/16 :goto_1a

    :catch_8
    move-exception v0

    move-object v8, v3

    :goto_13
    move-object v5, v4

    move-object v3, v8

    move-object v4, v3

    move-object/from16 v16, v4

    :goto_14
    const/4 v6, 0x0

    .line 581
    :goto_15
    :try_start_19
    iget-object v2, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v2
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_15

    .line 582
    :try_start_1a
    iget-object v7, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-ne v7, v5, :cond_24

    iput-object v3, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    .line 583
    :cond_24
    invoke-static {v5}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v7

    invoke-direct {v1, v7}, Ll/ܽܺܿ;->ۧ(Ll/ۨۡܿ;)V

    .line 584
    monitor-exit v2
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_11

    .line 585
    :try_start_1b
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_15

    :catchall_11
    move-exception v0

    .line 584
    :try_start_1c
    monitor-exit v2
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_11

    :try_start_1d
    throw v0

    :catch_9
    move-exception v0

    move-object v8, v3

    :goto_16
    move-object v5, v4

    move-object v3, v8

    move-object v4, v3

    move-object/from16 v16, v4

    :goto_17
    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 570
    :goto_18
    instance-of v2, v0, Ll/ܰۡܿ;

    if-nez v2, :cond_27

    instance-of v2, v0, Ll/۠ۢܿ;

    if-eqz v2, :cond_25

    .line 568
    move-object v2, v0

    check-cast v2, Ll/۠ۢܿ;

    .line 569
    invoke-virtual {v2}, Ll/۠ۢܿ;->֫()Ll/֡ۢܿ;

    move-result-object v2

    sget-object v9, Ll/֡ۢܿ;->᩹:Ll/֡ۢܿ;

    if-eq v2, v9, :cond_27

    :cond_25
    invoke-static {v5}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v2

    .line 570
    invoke-static {v2}, Ll/ۨۡܿ;->֡(Ll/ۨۡܿ;)Z

    move-result v2

    if-nez v2, :cond_26

    goto :goto_19

    :cond_26
    const/4 v7, 0x0

    .line 571
    :cond_27
    :goto_19
    iget-object v2, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v2
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_15

    .line 572
    :try_start_1e
    iget-object v9, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-ne v9, v5, :cond_28

    iput-object v3, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    :cond_28
    if-eqz v7, :cond_29

    .line 573
    invoke-static {v5}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v9

    invoke-static {v9}, Ll/ۨۡܿ;->ᩴ(Ll/ۨۡܿ;)V

    .line 574
    :cond_29
    invoke-static {v5}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v9

    invoke-direct {v1, v9}, Ll/ܽܺܿ;->ۧ(Ll/ۨۡܿ;)V

    if-nez v7, :cond_2a

    .line 576
    invoke-static {v5}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v7

    .line 577
    invoke-static {v0}, Ll/ܽܺܿ;->֫(Ljava/lang/RuntimeException;)Ll/ۗۡܿ;

    move-result-object v0

    .line 576
    invoke-direct {v1, v7, v0}, Ll/ܽܺܿ;->֫(Ll/ۨۡܿ;Ll/ۗۡܿ;)Ll/ۙۡܿ;

    move-result-object v4

    .line 579
    :cond_2a
    monitor-exit v2
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_14

    .line 587
    iget-object v7, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v7

    .line 588
    :try_start_1f
    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-ne v0, v5, :cond_2b

    invoke-static {v5}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨۡܿ;->ۧ(Ll/ۨۡܿ;)Z

    move-result v0

    if-eqz v0, :cond_2b

    iput-object v3, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    .line 589
    :cond_2b
    invoke-static {v5, v6}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;Z)V

    .line 590
    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-eq v0, v5, :cond_2c

    iget-object v0, v1, Ll/ܽܺܿ;->᩹:Ljava/util/ArrayDeque;

    invoke-virtual {v0, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 591
    :cond_2c
    iput-boolean v6, v1, Ll/ܽܺܿ;->ܰ:Z

    .line 592
    invoke-direct {v1}, Ll/ܽܺܿ;->ܺ()Z

    move-result v2

    .line 593
    iget-object v0, v1, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    if-nez v0, :cond_2d

    iget-object v0, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-nez v0, :cond_2d

    iget-object v0, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 594
    :cond_2d
    iget-boolean v0, v1, Ll/ܽܺܿ;->۠:Z

    .line 595
    iput-boolean v6, v1, Ll/ܽܺܿ;->۠:Z

    .line 596
    monitor-exit v7
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_13

    .line 598
    :try_start_20
    invoke-direct {v1}, Ll/ܽܺܿ;->ۖ()V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_12

    if-eqz v2, :cond_2e

    .line 600
    invoke-direct {v1}, Ll/ܽܺܿ;->ۡ()V

    :cond_2e
    if-eqz v0, :cond_2f

    .line 602
    iget-object v0, v1, Ll/ܽܺܿ;->ܺ:Ll/۫ۡܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/ۖ۫᩻;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0}, Ll/ۖ۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-direct {v1, v2}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    :cond_2f
    if-eqz v16, :cond_30

    .line 604
    invoke-static/range {v16 .. v16}, Ll/ۛۡܿ;->ۧ(Ll/ۛۡܿ;)J

    move-result-wide v2

    .line 711
    new-instance v0, Ll/۠ۡܿ;

    invoke-direct {v0, v1, v2, v3}, Ll/۠ۡܿ;-><init>(Ll/ܽܺܿ;J)V

    invoke-direct {v1, v0}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    :cond_30
    if-eqz v8, :cond_31

    .line 606
    invoke-static {v8}, Ll/۟ۡܿ;->ۧ(Ll/۟ۡܿ;)J

    move-result-wide v2

    .line 725
    new-instance v0, Ll/֨ۡܿ;

    invoke-direct {v0, v1, v2, v3}, Ll/֨ۡܿ;-><init>(Ll/ܽܺܿ;J)V

    invoke-direct {v1, v0}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    :cond_31
    if-eqz v4, :cond_32

    .line 739
    new-instance v0, Ll/᩶ۜۢ;

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1, v4}, Ll/᩶ۜۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v1, v0}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    :cond_32
    return-void

    :catchall_12
    move-exception v0

    move-object v3, v0

    if-eqz v2, :cond_33

    .line 600
    invoke-direct {v1}, Ll/ܽܺܿ;->ۡ()V

    .line 601
    :cond_33
    throw v3

    :catchall_13
    move-exception v0

    .line 596
    :try_start_21
    monitor-exit v7
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_13

    throw v0

    :catchall_14
    move-exception v0

    .line 579
    :try_start_22
    monitor-exit v2
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_14

    :try_start_23
    throw v0
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_15

    :catchall_15
    move-exception v0

    move-object v2, v3

    move-object v3, v8

    move-object v8, v3

    move-object v3, v2

    .line 587
    :goto_1a
    iget-object v7, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v7

    .line 588
    :try_start_24
    iget-object v2, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-ne v2, v5, :cond_34

    invoke-static {v5}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v2

    invoke-static {v2}, Ll/ۨۡܿ;->ۧ(Ll/ۨۡܿ;)Z

    move-result v2

    if-eqz v2, :cond_34

    iput-object v3, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    .line 589
    :cond_34
    invoke-static {v5, v6}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;Z)V

    .line 590
    iget-object v2, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-eq v2, v5, :cond_35

    iget-object v2, v1, Ll/ܽܺܿ;->᩹:Ljava/util/ArrayDeque;

    invoke-virtual {v2, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 591
    :cond_35
    iput-boolean v6, v1, Ll/ܽܺܿ;->ܰ:Z

    .line 592
    invoke-direct {v1}, Ll/ܽܺܿ;->ܺ()Z

    move-result v2

    .line 593
    iget-object v3, v1, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    if-nez v3, :cond_36

    iget-object v3, v1, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-nez v3, :cond_36

    iget-object v3, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    .line 594
    :cond_36
    iget-boolean v3, v1, Ll/ܽܺܿ;->۠:Z

    .line 595
    iput-boolean v6, v1, Ll/ܽܺܿ;->۠:Z

    .line 596
    monitor-exit v7
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_17

    .line 598
    :try_start_25
    invoke-direct {v1}, Ll/ܽܺܿ;->ۖ()V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_16

    if-eqz v2, :cond_37

    .line 600
    invoke-direct {v1}, Ll/ܽܺܿ;->ۡ()V

    :cond_37
    if-eqz v3, :cond_38

    .line 602
    iget-object v2, v1, Ll/ܽܺܿ;->ܺ:Ll/۫ۡܿ;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Ll/ۖ۫᩻;

    const/4 v5, 0x1

    invoke-direct {v3, v5, v2}, Ll/ۖ۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-direct {v1, v3}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    :cond_38
    if-eqz v16, :cond_39

    .line 604
    invoke-static/range {v16 .. v16}, Ll/ۛۡܿ;->ۧ(Ll/ۛۡܿ;)J

    move-result-wide v2

    .line 711
    new-instance v5, Ll/۠ۡܿ;

    invoke-direct {v5, v1, v2, v3}, Ll/۠ۡܿ;-><init>(Ll/ܽܺܿ;J)V

    invoke-direct {v1, v5}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    :cond_39
    if-eqz v8, :cond_3a

    .line 606
    invoke-static {v8}, Ll/۟ۡܿ;->ۧ(Ll/۟ۡܿ;)J

    move-result-wide v2

    .line 725
    new-instance v5, Ll/֨ۡܿ;

    invoke-direct {v5, v1, v2, v3}, Ll/֨ۡܿ;-><init>(Ll/ܽܺܿ;J)V

    invoke-direct {v1, v5}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    :cond_3a
    if-eqz v4, :cond_3b

    .line 739
    new-instance v2, Ll/᩶ۜۢ;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v1, v4}, Ll/᩶ۜۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v1, v2}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    .line 609
    :cond_3b
    throw v0

    :catchall_16
    move-exception v0

    move-object v3, v0

    if-eqz v2, :cond_3c

    .line 600
    invoke-direct {v1}, Ll/ܽܺܿ;->ۡ()V

    .line 601
    :cond_3c
    throw v3

    :catchall_17
    move-exception v0

    .line 596
    :try_start_26
    monitor-exit v7
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_17

    throw v0

    :catchall_18
    move-exception v0

    .line 451
    :try_start_27
    monitor-exit v2
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_18

    throw v0
.end method

.method public static ֫(Ll/ܽܺܿ;J)V
    .locals 5

    .line 727
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 728
    :try_start_0
    iget-object v1, p0, Ll/ܽܺܿ;->ۛ:Ll/۟ۡܿ;

    if-eqz v1, :cond_1

    .line 729
    invoke-static {v1}, Ll/۟ۡܿ;->ۧ(Ll/۟ۡܿ;)J

    move-result-wide v2

    cmp-long v4, v2, p1

    if-nez v4, :cond_1

    iget-wide v2, p0, Ll/ܽܺܿ;->ۡ:J

    cmp-long v4, v2, p1

    if-nez v4, :cond_1

    invoke-static {v1}, Ll/۟ۡܿ;->֫(Ll/۟ۡܿ;)I

    move-result p1

    invoke-static {v1}, Ll/۟ۡܿ;->ᩳ(Ll/۟ۡܿ;)I

    move-result p2

    .line 731
    invoke-direct {p0, p1, p2}, Ll/ܽܺܿ;->֫(II)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 732
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 733
    iget-object p0, p0, Ll/ܽܺܿ;->ܺ:Ll/۫ۡܿ;

    check-cast p0, Ll/ۧۡܿ;

    .line 193
    iget-object p0, p0, Ll/ۧۡܿ;->֫:Ll/᩷ۡܿ;

    invoke-static {p0, v1}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;Ll/۟ۡܿ;)V

    return-void

    .line 731
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 732
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܽܺܿ;Ll/ۙۡܿ;)V
    .locals 6

    .line 740
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 741
    :try_start_0
    iget-wide v1, p0, Ll/ܽܺܿ;->ۡ:J

    invoke-static {p1}, Ll/ۙۡܿ;->ۧ(Ll/ۙۡܿ;)J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    invoke-static {p1}, Ll/ۙۡܿ;->֫(Ll/ۙۡܿ;)I

    move-result v1

    invoke-static {p1}, Ll/ۙۡܿ;->ܽ(Ll/ۙۡܿ;)I

    move-result v2

    .line 742
    invoke-direct {p0, v1, v2}, Ll/ܽܺܿ;->֫(II)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 743
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 744
    iget-object p0, p0, Ll/ܽܺܿ;->ܺ:Ll/۫ۡܿ;

    check-cast p0, Ll/ۧۡܿ;

    .line 208
    iget-object v0, p0, Ll/ۧۡܿ;->֫:Ll/᩷ۡܿ;

    invoke-static {v0, p1}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;Ll/ۙۡܿ;)V

    .line 209
    iget-object p0, p0, Ll/ۧۡܿ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void

    .line 742
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 743
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܽܺܿ;Ll/ۨۡܿ;Ll/۬ۢܿ;)V
    .locals 6

    .line 236
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 237
    :try_start_0
    iget-object v1, p0, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-eqz v1, :cond_2

    invoke-static {v1}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v1

    if-ne v1, p1, :cond_2

    invoke-static {p1}, Ll/ۨۡܿ;->ۧ(Ll/ۨۡܿ;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-wide v1, p0, Ll/ܽܺܿ;->ۡ:J

    invoke-static {p1}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_2

    .line 238
    invoke-static {p1}, Ll/ۨۡܿ;->֡(Ll/ۨۡܿ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 239
    :cond_0
    iget-object v1, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    invoke-static {v1}, Ll/ۤۡܿ;->֫(Ll/ۤۡܿ;)V

    .line 240
    :cond_1
    new-instance v1, Ll/ۤۡܿ;

    invoke-direct {v1, p1, p2}, Ll/ۤۡܿ;-><init>(Ll/ۨۡܿ;Ll/۬ۢܿ;)V

    iput-object v1, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    .line 241
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    invoke-static {p1}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide p1

    .line 244
    new-instance v0, Ll/᩵ۡܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩵ۡܿ;-><init>(Ll/ܽܺܿ;J)V

    invoke-direct {p0, v0}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 238
    :cond_2
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 241
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private ֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;IILl/᩺ۡܿ;Ll/ۢۖܿ;IIIIII)V
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v8, p2

    move/from16 v9, p3

    move/from16 v6, p4

    move-object/from16 v10, p5

    move/from16 v2, p8

    move/from16 v3, p9

    move/from16 v4, p10

    const-string v5, "program"

    .line 347
    invoke-static {v0, v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v5, "text"

    .line 348
    invoke-static {v8, v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 349
    sget-object v5, Ll/᩺ۡܿ;->ۙ:Ll/᩺ۡܿ;

    if-eq v10, v5, :cond_1

    if-eqz p6, :cond_1

    .line 350
    invoke-virtual/range {p6 .. p6}, Ll/ۢۖܿ;->֫()I

    move-result v5

    if-ne v5, v6, :cond_0

    goto :goto_0

    .line 351
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Display syntax base length mismatch"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 355
    :cond_1
    :goto_0
    :try_start_0
    iget-object v5, v1, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    move-object/from16 v16, v5

    monitor-enter v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 356
    :try_start_1
    iget-object v11, v1, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    .line 357
    iget-object v5, v1, Ll/ܽܺܿ;->ܳ:Ll/᩶᩸ᩳ;

    if-eq v5, v8, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 358
    :goto_1
    iget-object v7, v1, Ll/ܽܺܿ;->ܿ:Ll/᩺ܺܿ;

    if-ne v7, v0, :cond_4

    if-nez v5, :cond_4

    if-eqz v7, :cond_3

    iget-boolean v5, v1, Ll/ܽܺܿ;->᩻:Z

    .line 359
    invoke-static/range {p5 .. p5}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result v7

    if-eq v5, v7, :cond_3

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    const/4 v12, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v5, 0x1

    const/4 v12, 0x1

    .line 360
    :goto_3
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ܳ()V

    .line 361
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->᩻()V

    const-wide/16 v13, -0x1

    const/4 v5, 0x0

    if-eqz v12, :cond_6

    .line 363
    iget-object v7, v1, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-virtual {v7}, Ll/ۛۢܿ;->֫()V

    .line 364
    iget-object v7, v1, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v7}, Ll/᩷ۘܿ;->֫()V

    .line 365
    iget-object v7, v1, Ll/ܽܺܿ;->۬:Ll/᩶᩸ᩳ;

    if-eq v7, v8, :cond_5

    .line 366
    iput-object v5, v1, Ll/ܽܺܿ;->۬:Ll/᩶᩸ᩳ;

    .line 367
    iput-wide v13, v1, Ll/ܽܺܿ;->ۙ:J

    .line 369
    :cond_5
    iput-object v0, v1, Ll/ܽܺܿ;->ܿ:Ll/᩺ܺܿ;

    .line 370
    iput-object v8, v1, Ll/ܽܺܿ;->ܳ:Ll/᩶᩸ᩳ;

    .line 371
    invoke-static/range {p5 .. p5}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result v7

    iput-boolean v7, v1, Ll/ܽܺܿ;->᩻:Z

    .line 372
    iput-object v5, v1, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    .line 373
    iput-object v5, v1, Ll/ܽܺܿ;->ۛ:Ll/۟ۡܿ;

    .line 374
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۜ()V

    .line 375
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۢ()V

    goto :goto_4

    .line 376
    :cond_6
    invoke-static/range {p5 .. p5}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 378
    iget-object v5, v1, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v5}, Ll/᩷ۘܿ;->ܽ()V

    goto :goto_4

    .line 381
    :cond_7
    iget-object v5, v1, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-virtual {v5}, Ll/ۛۢܿ;->ܽ()V

    :goto_4
    int-to-long v13, v6

    move-object v15, v11

    move/from16 v29, v12

    int-to-long v11, v4

    sub-long/2addr v13, v11

    int-to-long v11, v3

    add-long/2addr v13, v11

    .line 384
    sget-object v5, Ll/᩺ۡܿ;->᩹:Ll/᩺ۡܿ;

    if-ne v10, v5, :cond_8

    iget-boolean v5, v1, Ll/ܽܺܿ;->᩸:Z

    if-eqz v5, :cond_8

    iget-object v5, v1, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    if-eqz v5, :cond_8

    iget-object v5, v1, Ll/ܽܺܿ;->֫:Ll/ܶۘܿ;

    if-eqz v5, :cond_8

    iget v7, v1, Ll/ܽܺܿ;->ۧ:I

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v9, :cond_8

    .line 386
    invoke-virtual {v5}, Ll/ܶۘܿ;->ᩳ()I

    move-result v5

    int-to-long v11, v5

    cmp-long v5, v11, v13

    if-nez v5, :cond_8

    .line 387
    iget-object v5, v1, Ll/ܽܺܿ;->֫:Ll/ܶۘܿ;

    new-instance v7, Ll/۠ۘܿ;

    add-int/2addr v3, v2

    invoke-direct {v7, v2, v3, v4}, Ll/۠ۘܿ;-><init>(III)V

    invoke-virtual {v5, v7}, Ll/ܶۘܿ;->֫(Ll/۠ۘܿ;)Ll/ܶۘܿ;

    move-result-object v2

    iput-object v2, v1, Ll/ܽܺܿ;->֫:Ll/ܶۘܿ;

    .line 389
    iput v9, v1, Ll/ܽܺܿ;->ۧ:I

    goto :goto_5

    .line 392
    :cond_8
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۜ()V

    .line 394
    :goto_5
    invoke-static/range {p5 .. p5}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, v1, Ll/ܽܺܿ;->۫:Ll/ܶۘܿ;

    if-eqz v2, :cond_9

    iget v3, v1, Ll/ܽܺܿ;->ۤ:I

    if-ne v3, v9, :cond_9

    .line 395
    invoke-virtual {v2}, Ll/ܶۘܿ;->ᩳ()I

    move-result v2

    if-eq v2, v6, :cond_a

    .line 397
    :cond_9
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۢ()V

    .line 399
    :cond_a
    iget-boolean v2, v1, Ll/ܽܺܿ;->᩸:Z

    if-eqz v2, :cond_b

    iget-object v2, v1, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    goto :goto_6

    :cond_b
    const/4 v2, 0x0

    :goto_6
    move-object/from16 v22, v2

    .line 400
    iget-object v2, v1, Ll/ܽܺܿ;->᩷:Ll/᩷ۢܿ;

    if-eqz v2, :cond_c

    .line 25
    iget-object v3, v2, Ll/᩷ۢܿ;->ܽ:Ll/᩺ܺܿ;

    if-ne v3, v0, :cond_c

    iget-object v3, v2, Ll/᩷ۢܿ;->ᩳ:Ll/᩶᩸ᩳ;

    if-ne v3, v8, :cond_c

    iget v3, v2, Ll/᩷ۢܿ;->ۧ:I

    if-ne v3, v9, :cond_c

    iget v2, v2, Ll/᩷ۢܿ;->ܿ:I

    if-ne v2, v6, :cond_c

    goto :goto_7

    .line 402
    :cond_c
    new-instance v11, Ll/᩷ۢܿ;

    iget v7, v1, Ll/ܽܺܿ;->֡:I

    move-object v2, v11

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    invoke-direct/range {v2 .. v7}, Ll/᩷ۢܿ;-><init>(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;III)V

    iput-object v11, v1, Ll/ܽܺܿ;->᩷:Ll/᩷ۢܿ;

    .line 405
    :goto_7
    new-instance v0, Ll/ۨۡܿ;

    iget-wide v2, v1, Ll/ܽܺܿ;->ۡ:J

    iget-object v4, v1, Ll/ܽܺܿ;->᩷:Ll/᩷ۢܿ;

    .line 406
    invoke-static/range {p5 .. p5}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result v5

    if-eqz v5, :cond_d

    iget-object v5, v1, Ll/ܽܺܿ;->۫:Ll/ܶۘܿ;

    goto :goto_8

    :cond_d
    iget-object v5, v1, Ll/ܽܺܿ;->֫:Ll/ܶۘܿ;

    :goto_8
    move-object/from16 v23, v5

    .line 408
    iget-object v5, v1, Ll/ܽܺܿ;->۫:Ll/ܶۘܿ;

    if-nez v5, :cond_e

    const/4 v5, 0x0

    :goto_9
    const-wide/16 v6, -0x1

    move-object/from16 v28, v5

    goto :goto_a

    :cond_e
    iget-object v5, v1, Ll/ܽܺܿ;->ۛ:Ll/۟ۡܿ;

    goto :goto_9

    :goto_a
    move-object/from16 v17, v0

    move-wide/from16 v18, v2

    move-object/from16 v20, v4

    move-object/from16 v21, p5

    move-object/from16 v24, p6

    move/from16 v25, p7

    move/from16 v26, p11

    move/from16 v27, p12

    invoke-direct/range {v17 .. v28}, Ll/ۨۡܿ;-><init>(JLl/᩷ۢܿ;Ll/᩺ۡܿ;Ll/ۛۡܿ;Ll/ܶۘܿ;Ll/ۢۖܿ;IIILl/۟ۡܿ;)V

    iput-object v0, v1, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    .line 409
    iget-object v2, v1, Ll/ܽܺܿ;->۬:Ll/᩶᩸ᩳ;

    if-ne v2, v8, :cond_f

    iget v2, v1, Ll/ܽܺܿ;->ۗ:I

    if-ne v2, v9, :cond_f

    iget-wide v2, v1, Ll/ܽܺܿ;->ۙ:J

    cmp-long v4, v2, v6

    if-eqz v4, :cond_f

    .line 410
    invoke-static {v0, v2, v3}, Ll/ۨۡܿ;->֫(Ll/ۨۡܿ;J)V

    :cond_f
    if-nez v29, :cond_10

    if-eqz v15, :cond_10

    .line 413
    invoke-static/range {p5 .. p5}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result v0

    if-eqz v0, :cond_10

    move-object v0, v15

    iget-object v2, v0, Ll/ۤۡܿ;->ۧ:Ll/᩷ۢܿ;

    iget-object v3, v1, Ll/ܽܺܿ;->᩷:Ll/᩷ۢܿ;

    if-ne v2, v3, :cond_10

    iget-object v0, v0, Ll/ۤۡܿ;->ܽ:Ll/۬ۢܿ;

    iget v2, v0, Ll/۬ۢܿ;->ܽ:I

    move/from16 v3, p12

    if-ge v2, v3, :cond_10

    iget v2, v0, Ll/۬ۢܿ;->ۧ:I

    move/from16 v3, p11

    if-le v2, v3, :cond_10

    .line 416
    new-instance v2, Ll/ۤۡܿ;

    iget-object v3, v1, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    invoke-direct {v2, v3, v0}, Ll/ۤۡܿ;-><init>(Ll/ۨۡܿ;Ll/۬ۢܿ;)V

    iput-object v2, v1, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    .line 418
    :cond_10
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ܺ()Z

    move-result v0

    .line 419
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 421
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۖ()V

    if-eqz v0, :cond_11

    .line 423
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۡ()V

    :cond_11
    return-void

    :catchall_0
    move-exception v0

    .line 419
    :try_start_2
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    .line 421
    invoke-direct/range {p0 .. p0}, Ll/ܽܺܿ;->ۖ()V

    .line 422
    throw v0
.end method

.method private ֫(II)Z
    .locals 2

    .line 900
    iget-object v0, p0, Ll/ܽܺܿ;->ܳ:Ll/᩶᩸ᩳ;

    if-eqz v0, :cond_0

    .line 902
    :try_start_0
    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    if-ne v1, p1, :cond_0

    .line 903
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne v1, p2, :cond_0

    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p2
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ۖ()V
    .locals 2

    .line 803
    :catch_0
    :goto_0
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/ܽܺܿ;->᩹:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ۡܿ;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    return-void

    .line 806
    :cond_0
    :try_start_1
    invoke-static {v1}, Ll/᩹ۡܿ;->ᩳ(Ll/᩹ۡܿ;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 803
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method private ۜ()V
    .locals 2

    const/4 v0, 0x0

    .line 773
    iput-boolean v0, p0, Ll/ܽܺܿ;->᩸:Z

    const/4 v1, 0x0

    .line 774
    iput-object v1, p0, Ll/ܽܺܿ;->֫:Ll/ܶۘܿ;

    .line 775
    iput v0, p0, Ll/ܽܺܿ;->ۧ:I

    return-void
.end method

.method private ۡ()V
    .locals 13

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 676
    :try_start_0
    iget-object v0, p0, Ll/ܽܺܿ;->᩺:Ljava/util/concurrent/Executor;

    new-instance v3, Ll/ۜ֨ᩳ;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p0}, Ll/ۜ֨ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object v3, v0

    .line 696
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 697
    :try_start_1
    iput-boolean v1, p0, Ll/ܽܺܿ;->ܰ:Z

    .line 698
    invoke-direct {p0}, Ll/ܽܺܿ;->᩻()V

    .line 699
    iput-object v2, p0, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    .line 700
    iget-object v1, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-virtual {v1}, Ll/ۛۢܿ;->ܽ()V

    .line 701
    iget-object v1, p0, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v1}, Ll/᩷ۘܿ;->ܽ()V

    .line 837
    iget-object v1, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    iget-object v4, p0, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v4}, Ll/ۛۡܿ;->ܽ(Ll/ۛۡܿ;)Ll/ܺۖܿ;

    move-result-object v2

    .line 838
    :goto_0
    invoke-virtual {v1}, Ll/ۛۢܿ;->ۧ()Ll/ܺۖܿ;

    move-result-object v4

    if-eq v4, v2, :cond_1

    .line 839
    invoke-virtual {v1}, Ll/ۛۢܿ;->֫()V

    .line 840
    invoke-direct {p0}, Ll/ܽܺܿ;->ۜ()V

    .line 857
    :cond_1
    invoke-direct {p0}, Ll/ܽܺܿ;->᩷()V

    .line 703
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 704
    invoke-direct {p0}, Ll/ܽܺܿ;->ۖ()V

    .line 705
    throw v3

    :catchall_0
    move-exception v1

    .line 703
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    .line 679
    :catch_1
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 680
    :try_start_3
    iput-boolean v1, p0, Ll/ܽܺܿ;->ܰ:Z

    .line 681
    iget-object v3, p0, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-nez v3, :cond_3

    move-object v3, v2

    goto :goto_1

    :cond_3
    invoke-static {v3}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_4

    .line 682
    iget-wide v4, p0, Ll/ܽܺܿ;->ۡ:J

    invoke-static {v3}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v6

    cmp-long v8, v4, v6

    if-nez v8, :cond_4

    .line 683
    invoke-static {v3}, Ll/ۨۡܿ;->֡(Ll/ۨۡܿ;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v1, 0x1

    .line 684
    :cond_4
    invoke-direct {p0}, Ll/ܽܺܿ;->᩻()V

    .line 685
    iput-object v2, p0, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    .line 686
    iget-object v4, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-virtual {v4}, Ll/ۛۢܿ;->ܽ()V

    .line 687
    iget-object v4, p0, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v4}, Ll/᩷ۘܿ;->ܽ()V

    .line 837
    iget-object v4, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    iget-object v5, p0, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    if-nez v5, :cond_5

    move-object v5, v2

    goto :goto_2

    :cond_5
    invoke-static {v5}, Ll/ۛۡܿ;->ܽ(Ll/ۛۡܿ;)Ll/ܺۖܿ;

    move-result-object v5

    .line 838
    :goto_2
    invoke-virtual {v4}, Ll/ۛۢܿ;->ۧ()Ll/ܺۖܿ;

    move-result-object v6

    if-eq v6, v5, :cond_6

    .line 839
    invoke-virtual {v4}, Ll/ۛۢܿ;->֫()V

    .line 840
    invoke-direct {p0}, Ll/ܽܺܿ;->ۜ()V

    .line 857
    :cond_6
    invoke-direct {p0}, Ll/ܽܺܿ;->᩷()V

    if-eqz v1, :cond_7

    .line 689
    new-instance v1, Ll/ۙۡܿ;

    iget-object v4, p0, Ll/ܽܺܿ;->ۢ:Ljava/lang/Object;

    invoke-static {v3}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v5

    invoke-static {v3}, Ll/ۨۡܿ;->᩷(Ll/ۨۡܿ;)I

    move-result v7

    invoke-static {v3}, Ll/ۨۡܿ;->ܺ(Ll/ۨۡܿ;)I

    move-result v8

    invoke-static {v3}, Ll/ۨۡܿ;->ۜ(Ll/ۨۡܿ;)Ll/᩺ۡܿ;

    move-result-object v9

    .line 690
    invoke-static {v3}, Ll/ۨۡܿ;->֨(Ll/ۨۡܿ;)I

    move-result v10

    .line 691
    invoke-static {v3}, Ll/ۨۡܿ;->ۚ(Ll/ۨۡܿ;)I

    move-result v11

    sget-object v12, Ll/ۗۡܿ;->۬:Ll/ۗۡܿ;

    move-object v2, v1

    move-object v3, v4

    move-wide v4, v5

    move v6, v7

    move v7, v8

    move-object v8, v9

    move v9, v10

    move v10, v11

    move-object v11, v12

    invoke-direct/range {v2 .. v11}, Ll/ۙۡܿ;-><init>(Ljava/lang/Object;JIILl/᩺ۡܿ;IILl/ۗۡܿ;)V

    move-object v2, v1

    .line 692
    :cond_7
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 693
    invoke-direct {p0}, Ll/ܽܺܿ;->ۖ()V

    if-eqz v2, :cond_8

    .line 739
    new-instance v0, Ll/᩶ۜۢ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, v2}, Ll/᩶ۜۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Ll/ܽܺܿ;->֫(Ljava/lang/Runnable;)V

    :cond_8
    return-void

    :catchall_1
    move-exception v1

    .line 692
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method private ۢ()V
    .locals 1

    const/4 v0, 0x0

    .line 780
    iput-object v0, p0, Ll/ܽܺܿ;->۫:Ll/ܶۘܿ;

    const/4 v0, 0x0

    .line 781
    iput v0, p0, Ll/ܽܺܿ;->ۤ:I

    return-void
.end method

.method private ۧ(Ll/ۨۡܿ;)V
    .locals 6

    .line 815
    iget-object v0, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    iget-wide v2, v0, Ll/ۤۡܿ;->ᩳ:J

    invoke-static {p1}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    .line 816
    iget-object v0, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    invoke-static {v0}, Ll/ۤۡܿ;->֫(Ll/ۤۡܿ;)V

    .line 817
    iput-object v1, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    const/4 v0, 0x1

    .line 818
    iput-boolean v0, p0, Ll/ܽܺܿ;->۠:Z

    .line 820
    :cond_0
    iget-object v0, p0, Ll/ܽܺܿ;->ܿ:Ll/᩺ܺܿ;

    invoke-static {p1}, Ll/ۨۡܿ;->ۢ(Ll/ۨۡܿ;)Ll/᩺ܺܿ;

    move-result-object v2

    if-ne v0, v2, :cond_4

    iget-object v0, p0, Ll/ܽܺܿ;->ܳ:Ll/᩶᩸ᩳ;

    invoke-static {p1}, Ll/ۨۡܿ;->ۡ(Ll/ۨۡܿ;)Ll/᩶᩸ᩳ;

    move-result-object v2

    if-ne v0, v2, :cond_4

    iget-boolean v0, p0, Ll/ܽܺܿ;->᩻:Z

    invoke-static {p1}, Ll/ۨۡܿ;->ۜ(Ll/ۨۡܿ;)Ll/᩺ۡܿ;

    move-result-object v2

    .line 821
    invoke-static {v2}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result v2

    if-ne v0, v2, :cond_4

    .line 822
    invoke-static {p1}, Ll/ۨۡܿ;->ۜ(Ll/ۨۡܿ;)Ll/᩺ۡܿ;

    move-result-object p1

    invoke-static {p1}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 823
    iget-object p1, p0, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {p1}, Ll/᩷ۘܿ;->ܽ()V

    .line 824
    invoke-direct {p0}, Ll/ܽܺܿ;->᩷()V

    return-void

    .line 826
    :cond_1
    iget-object p1, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-virtual {p1}, Ll/ۛۢܿ;->ܽ()V

    .line 837
    iget-object p1, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    iget-object v0, p0, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v0}, Ll/ۛۡܿ;->ܽ(Ll/ۛۡܿ;)Ll/ܺۖܿ;

    move-result-object v1

    .line 838
    :goto_0
    invoke-virtual {p1}, Ll/ۛۢܿ;->ۧ()Ll/ܺۖܿ;

    move-result-object v0

    if-eq v0, v1, :cond_3

    .line 839
    invoke-virtual {p1}, Ll/ۛۢܿ;->֫()V

    .line 840
    invoke-direct {p0}, Ll/ܽܺܿ;->ۜ()V

    :cond_3
    return-void

    .line 830
    :cond_4
    iget-object p1, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-virtual {p1}, Ll/ۛۢܿ;->֫()V

    .line 831
    iget-object p1, p0, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {p1}, Ll/᩷ۘܿ;->֫()V

    return-void
.end method

.method public static ۧ(Ll/ܽܺܿ;J)V
    .locals 5

    .line 246
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 247
    :try_start_0
    iget-object v1, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    if-eqz v1, :cond_1

    .line 248
    iget-wide v2, v1, Ll/ۤۡܿ;->ᩳ:J

    cmp-long v4, v2, p1

    if-nez v4, :cond_1

    invoke-virtual {v1}, Ll/ۤۡܿ;->֫()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 249
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 250
    iget-object p0, p0, Ll/ܽܺܿ;->ܺ:Ll/۫ۡܿ;

    check-cast p0, Ll/ۧۡܿ;

    .line 198
    iget-object p0, p0, Ll/ۧۡܿ;->֫:Ll/᩷ۡܿ;

    invoke-static {p0, v1}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;Ll/ۤۡܿ;)V

    return-void

    .line 248
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 249
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private ܳ()V
    .locals 4

    .line 765
    iget-object v0, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    invoke-static {v0}, Ll/ۤۡܿ;->֫(Ll/ۤۡܿ;)V

    :cond_0
    const/4 v0, 0x0

    .line 766
    iput-object v0, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    .line 767
    iget-wide v0, p0, Ll/ܽܺܿ;->᩵:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܽܺܿ;->᩵:J

    iput-wide v0, p0, Ll/ܽܺܿ;->ۡ:J

    .line 768
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    return-void
.end method

.method private ܺ()Z
    .locals 1

    .line 862
    iget-boolean v0, p0, Ll/ܽܺܿ;->ܰ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 863
    iput-boolean v0, p0, Ll/ܽܺܿ;->ܰ:Z

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ܽ(Ll/ܽܺܿ;J)V
    .locals 5

    .line 713
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 714
    :try_start_0
    iget-object v1, p0, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    if-eqz v1, :cond_1

    .line 715
    invoke-static {v1}, Ll/ۛۡܿ;->ۧ(Ll/ۛۡܿ;)J

    move-result-wide v2

    cmp-long v4, v2, p1

    if-nez v4, :cond_1

    iget-wide v2, p0, Ll/ܽܺܿ;->ۡ:J

    cmp-long v4, v2, p1

    if-nez v4, :cond_1

    invoke-static {v1}, Ll/ۛۡܿ;->֫(Ll/ۛۡܿ;)I

    move-result p1

    invoke-static {v1}, Ll/ۛۡܿ;->ᩳ(Ll/ۛۡܿ;)I

    move-result p2

    .line 717
    invoke-direct {p0, p1, p2}, Ll/ܽܺܿ;->֫(II)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 718
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 719
    iget-object p0, p0, Ll/ܽܺܿ;->ܺ:Ll/۫ۡܿ;

    check-cast p0, Ll/ۧۡܿ;

    .line 188
    iget-object p0, p0, Ll/ۧۡܿ;->֫:Ll/᩷ۡܿ;

    invoke-static {p0, v1}, Ll/᩷ۡܿ;->֫(Ll/᩷ۡܿ;Ll/ۛۡܿ;)V

    return-void

    .line 717
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 718
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private ᩷()V
    .locals 3

    .line 846
    iget-object v0, p0, Ll/ܽܺܿ;->ۛ:Ll/۟ۡܿ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 847
    :cond_0
    invoke-static {v0}, Ll/۟ۡܿ;->ܽ(Ll/۟ۡܿ;)Ll/ܳۘܿ;

    move-result-object v0

    .line 848
    :goto_0
    iget-object v1, p0, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v1}, Ll/᩷ۘܿ;->ۧ()Ll/ܳۘܿ;

    move-result-object v2

    if-eq v2, v0, :cond_1

    .line 849
    invoke-virtual {v1}, Ll/᩷ۘܿ;->֫()V

    .line 850
    invoke-direct {p0}, Ll/ܽܺܿ;->ۢ()V

    :cond_1
    return-void
.end method

.method private ᩻()V
    .locals 3

    .line 786
    iget-object v0, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    invoke-static {v0}, Ll/ۤۡܿ;->֫(Ll/ۤۡܿ;)V

    :cond_0
    const/4 v0, 0x0

    .line 787
    iput-object v0, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    .line 788
    iget-object v1, p0, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    if-eqz v1, :cond_1

    invoke-static {v1}, Ll/ۨۡܿ;->ᩴ(Ll/ۨۡܿ;)V

    .line 789
    :cond_1
    iget-object v1, p0, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-eqz v1, :cond_2

    .line 790
    invoke-static {v1}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object v1

    invoke-static {v1}, Ll/ۨۡܿ;->ᩴ(Ll/ۨۡܿ;)V

    .line 791
    iget-object v1, p0, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    invoke-static {v1}, Ll/᩹ۡܿ;->ۧ(Ll/᩹ۡܿ;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/ܽܺܿ;->᩹:Ljava/util/ArrayDeque;

    iget-object v2, p0, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 793
    :cond_2
    iput-object v0, p0, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    .line 795
    iput-object v0, p0, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    .line 796
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩶᩸ᩳ;)J
    .locals 3

    .line 256
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 257
    :try_start_0
    iget-object v1, p0, Ll/ܽܺܿ;->ܳ:Ll/᩶᩸ᩳ;

    if-ne v1, p1, :cond_0

    iget-wide v1, p0, Ll/ܽܺܿ;->ۡ:J

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception p1

    .line 258
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫()V
    .locals 4

    .line 319
    :try_start_0
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 320
    :try_start_1
    invoke-direct {p0}, Ll/ܽܺܿ;->ܳ()V

    .line 321
    invoke-direct {p0}, Ll/ܽܺܿ;->᩻()V

    .line 322
    iget-object v1, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-virtual {v1}, Ll/ۛۢܿ;->֫()V

    .line 323
    iget-object v1, p0, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v1}, Ll/᩷ۘܿ;->֫()V

    const/4 v1, 0x0

    .line 324
    iput-object v1, p0, Ll/ܽܺܿ;->ܿ:Ll/᩺ܺܿ;

    .line 325
    iput-object v1, p0, Ll/ܽܺܿ;->ܳ:Ll/᩶᩸ᩳ;

    .line 326
    iput-object v1, p0, Ll/ܽܺܿ;->۬:Ll/᩶᩸ᩳ;

    const-wide/16 v2, -0x1

    .line 327
    iput-wide v2, p0, Ll/ܽܺܿ;->ۙ:J

    const/4 v2, 0x0

    .line 328
    iput-boolean v2, p0, Ll/ܽܺܿ;->᩻:Z

    .line 329
    iput-object v1, p0, Ll/ܽܺܿ;->᩷:Ll/᩷ۢܿ;

    .line 330
    iput-object v1, p0, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    .line 331
    iput-object v1, p0, Ll/ܽܺܿ;->ۛ:Ll/۟ۡܿ;

    .line 332
    invoke-direct {p0}, Ll/ܽܺܿ;->ۜ()V

    .line 333
    invoke-direct {p0}, Ll/ܽܺܿ;->ۢ()V

    .line 334
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 336
    invoke-direct {p0}, Ll/ܽܺܿ;->ۖ()V

    return-void

    :catchall_0
    move-exception v1

    .line 334
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    .line 336
    invoke-direct {p0}, Ll/ܽܺܿ;->ۖ()V

    .line 337
    throw v0
.end method

.method public final ֫(J)V
    .locals 9

    const-wide/16 v1, 0x0

    cmp-long v0, p1, v1

    if-eqz v0, :cond_3

    .line 264
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1f4

    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v5

    add-long/2addr v5, v3

    .line 265
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 266
    :goto_0
    :try_start_0
    iget-wide v3, p0, Ll/ܽܺܿ;->ۡ:J

    cmp-long v7, v3, p1

    if-nez v7, :cond_2

    iget-object v3, p0, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    if-nez v3, :cond_0

    iget-object v3, p0, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-eqz v3, :cond_2

    .line 267
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long v3, v5, v3

    cmp-long v7, v3, v1

    if-gtz v7, :cond_1

    .line 268
    monitor-exit v0

    return-void

    .line 269
    :cond_1
    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v8, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    invoke-virtual {v7, v8, v3, v4}, Ljava/util/concurrent/TimeUnit;->timedWait(Ljava/lang/Object;J)V

    goto :goto_0

    .line 271
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    return-void
.end method

.method public final ֫(Ll/᩶᩸ᩳ;II)V
    .locals 5

    if-ltz p2, :cond_5

    if-ge p2, p3, :cond_5

    .line 207
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-le p3, v0, :cond_0

    goto :goto_1

    .line 208
    :cond_0
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 209
    :try_start_0
    iget-object v1, p0, Ll/ܽܺܿ;->ܳ:Ll/᩶᩸ᩳ;

    if-eq v1, p1, :cond_1

    monitor-exit v0

    return-void

    .line 210
    :cond_1
    iput-object p1, p0, Ll/ܽܺܿ;->۬:Ll/᩶᩸ᩳ;

    .line 211
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p1

    iput p1, p0, Ll/ܽܺܿ;->ۗ:I

    int-to-long p1, p2

    const/16 v1, 0x20

    shl-long/2addr p1, v1

    int-to-long v1, p3

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    or-long/2addr p1, v1

    .line 212
    iput-wide p1, p0, Ll/ܽܺܿ;->ۙ:J

    .line 213
    iget-object p3, p0, Ll/ܽܺܿ;->ۚ:Ll/ۨۡܿ;

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    iget-object p3, p0, Ll/ܽܺܿ;->ܽ:Ll/᩹ۡܿ;

    if-nez p3, :cond_3

    const/4 p3, 0x0

    goto :goto_0

    :cond_3
    invoke-static {p3}, Ll/᩹ۡܿ;->֫(Ll/᩹ۡܿ;)Ll/ۨۡܿ;

    move-result-object p3

    :goto_0
    if-eqz p3, :cond_4

    .line 214
    invoke-static {p3}, Ll/ۨۡܿ;->֡(Ll/ۨۡܿ;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p3, p1, p2}, Ll/ۨۡܿ;->֫(Ll/ۨۡܿ;J)V

    .line 215
    :cond_4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_5
    :goto_1
    return-void
.end method

.method public final ֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;III)V
    .locals 8

    .line 157
    invoke-interface {p2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    .line 158
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    int-to-long v2, v0

    int-to-long v4, p5

    sub-long/2addr v2, v4

    int-to-long v4, p4

    add-long/2addr v2, v4

    if-ltz p3, :cond_3

    if-ltz p4, :cond_3

    if-ltz p5, :cond_3

    const-wide/16 v6, 0x0

    cmp-long v0, v2, v6

    if-ltz v0, :cond_3

    const-wide/32 v6, 0x7fffffff

    cmp-long v0, v2, v6

    if-gtz v0, :cond_3

    int-to-long v6, p3

    add-long/2addr v6, v4

    cmp-long v0, v6, v2

    if-gtz v0, :cond_3

    .line 166
    :try_start_0
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 167
    :try_start_1
    invoke-direct {p0}, Ll/ܽܺܿ;->ܳ()V

    .line 168
    invoke-direct {p0}, Ll/ܽܺܿ;->᩻()V

    .line 169
    iget-object v4, p0, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v4}, Ll/᩷ۘܿ;->ܽ()V

    .line 837
    iget-object v4, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    iget-object v5, p0, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    if-nez v5, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v5}, Ll/ۛۡܿ;->ܽ(Ll/ۛۡܿ;)Ll/ܺۖܿ;

    move-result-object v5

    .line 838
    :goto_0
    invoke-virtual {v4}, Ll/ۛۢܿ;->ۧ()Ll/ܺۖܿ;

    move-result-object v6

    if-eq v6, v5, :cond_1

    .line 839
    invoke-virtual {v4}, Ll/ۛۢܿ;->֫()V

    .line 840
    invoke-direct {p0}, Ll/ܽܺܿ;->ۜ()V

    .line 857
    :cond_1
    invoke-direct {p0}, Ll/ܽܺܿ;->᩷()V

    .line 171
    invoke-direct {p0}, Ll/ܽܺܿ;->ۜ()V

    .line 172
    iget-boolean v4, p0, Ll/ܽܺܿ;->᩻:Z

    if-eqz v4, :cond_2

    iget-object v4, p0, Ll/ܽܺܿ;->ܿ:Ll/᩺ܺܿ;

    if-ne v4, p1, :cond_2

    iget-object p1, p0, Ll/ܽܺܿ;->ܳ:Ll/᩶᩸ᩳ;

    if-ne p1, p2, :cond_2

    iget-object p1, p0, Ll/ܽܺܿ;->ۛ:Ll/۟ۡܿ;

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/ܽܺܿ;->۫:Ll/ܶۘܿ;

    if-eqz p1, :cond_2

    iget p2, p0, Ll/ܽܺܿ;->ۤ:I

    add-int/lit8 p2, p2, 0x1

    if-ne p2, v1, :cond_2

    .line 175
    invoke-virtual {p1}, Ll/ܶۘܿ;->ᩳ()I

    move-result p1

    int-to-long p1, p1

    cmp-long v4, p1, v2

    if-nez v4, :cond_2

    .line 176
    iget-object p1, p0, Ll/ܽܺܿ;->۫:Ll/ܶۘܿ;

    new-instance p2, Ll/۠ۘܿ;

    add-int/2addr p4, p3

    invoke-direct {p2, p3, p4, p5}, Ll/۠ۘܿ;-><init>(III)V

    invoke-virtual {p1, p2}, Ll/ܶۘܿ;->֫(Ll/۠ۘܿ;)Ll/ܶۘܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ܽܺܿ;->۫:Ll/ܶۘܿ;

    .line 179
    iput v1, p0, Ll/ܽܺܿ;->ۤ:I

    goto :goto_1

    .line 181
    :cond_2
    invoke-direct {p0}, Ll/ܽܺܿ;->ۢ()V

    .line 183
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 185
    invoke-direct {p0}, Ll/ܽܺܿ;->ۖ()V

    return-void

    :catchall_0
    move-exception p1

    .line 183
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 185
    invoke-direct {p0}, Ll/ܽܺܿ;->ۖ()V

    .line 186
    throw p1

    .line 163
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid syntax window edit range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;IIILl/ۢۖܿ;I)V
    .locals 13

    move/from16 v8, p3

    move/from16 v9, p4

    move/from16 v10, p5

    const-string v0, "text"

    move-object v2, p2

    .line 119
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 120
    invoke-interface {p2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v3

    .line 121
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    int-to-long v0, v4

    int-to-long v5, v10

    sub-long/2addr v0, v5

    int-to-long v5, v9

    add-long/2addr v0, v5

    if-ltz v8, :cond_0

    if-ltz v9, :cond_0

    if-ltz v10, :cond_0

    const-wide/16 v11, 0x0

    cmp-long v7, v0, v11

    if-ltz v7, :cond_0

    const-wide/32 v11, 0x7fffffff

    cmp-long v7, v0, v11

    if-gtz v7, :cond_0

    int-to-long v11, v8

    add-long/2addr v11, v5

    cmp-long v5, v11, v0

    if-gtz v5, :cond_0

    .line 128
    sget-object v5, Ll/᩺ۡܿ;->᩹:Ll/᩺ۡܿ;

    const/4 v11, -0x1

    const/4 v12, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p3

    move/from16 v9, p4

    move/from16 v10, p5

    invoke-direct/range {v0 .. v12}, Ll/ܽܺܿ;->֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;IILl/᩺ۡܿ;Ll/ۢۖܿ;IIIIII)V

    return-void

    .line 126
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Invalid syntax worker edit range"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;Ll/ۢۖܿ;I)V
    .locals 13

    .line 103
    invoke-interface {p2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v3

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    sget-object v5, Ll/᩺ۡܿ;->᩶:Ll/᩺ۡܿ;

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v12}, Ll/ܽܺܿ;->֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;IILl/᩺ۡܿ;Ll/ۢۖܿ;IIIIII)V

    return-void
.end method

.method public final ֫(Ll/ۙۡܿ;)Z
    .locals 6

    .line 292
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 293
    :try_start_0
    invoke-static {p1}, Ll/ۙۡܿ;->ᩳ(Ll/ۙۡܿ;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Ll/ܽܺܿ;->ۢ:Ljava/lang/Object;

    if-ne v1, v2, :cond_0

    iget-wide v1, p0, Ll/ܽܺܿ;->ۡ:J

    invoke-static {p1}, Ll/ۙۡܿ;->ۧ(Ll/ۙۡܿ;)J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    invoke-static {p1}, Ll/ۙۡܿ;->֫(Ll/ۙۡܿ;)I

    move-result v1

    invoke-static {p1}, Ll/ۙۡܿ;->ܽ(Ll/ۙۡܿ;)I

    move-result p1

    .line 294
    invoke-direct {p0, v1, p1}, Ll/ܽܺܿ;->֫(II)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 295
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۛۡܿ;)Z
    .locals 6

    .line 276
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 277
    :try_start_0
    iget-object v1, p0, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    if-ne v1, p1, :cond_0

    iget-wide v1, p0, Ll/ܽܺܿ;->ۡ:J

    invoke-static {p1}, Ll/ۛۡܿ;->ۧ(Ll/ۛۡܿ;)J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    invoke-static {p1}, Ll/ۛۡܿ;->֫(Ll/ۛۡܿ;)I

    move-result v1

    invoke-static {p1}, Ll/ۛۡܿ;->ᩳ(Ll/ۛۡܿ;)I

    move-result p1

    .line 278
    invoke-direct {p0, v1, p1}, Ll/ܽܺܿ;->֫(II)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 279
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/۟ۡܿ;)Z
    .locals 6

    .line 284
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 285
    :try_start_0
    iget-object v1, p0, Ll/ܽܺܿ;->ۛ:Ll/۟ۡܿ;

    if-ne v1, p1, :cond_0

    iget-wide v1, p0, Ll/ܽܺܿ;->ۡ:J

    invoke-static {p1}, Ll/۟ۡܿ;->ۧ(Ll/۟ۡܿ;)J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    invoke-static {p1}, Ll/۟ۡܿ;->֫(Ll/۟ۡܿ;)I

    move-result v1

    invoke-static {p1}, Ll/۟ۡܿ;->ᩳ(Ll/۟ۡܿ;)I

    move-result p1

    .line 286
    invoke-direct {p0, v1, p1}, Ll/ܽܺܿ;->֫(II)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 287
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ()Ll/ۤۡܿ;
    .locals 1

    .line 224
    iget-object v0, p0, Ll/ܽܺܿ;->֨:Ll/ۤۡܿ;

    return-object v0
.end method

.method public final ۧ(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;III)V
    .locals 14

    const-string v0, "program"

    move-object v2, p1

    .line 140
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "text"

    move-object/from16 v3, p2

    .line 141
    invoke-static {v3, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    invoke-interface/range {p2 .. p2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v4

    .line 146
    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    move/from16 v0, p3

    move/from16 v13, p4

    .line 147
    invoke-static {v0, v13, v5}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 148
    sget-object v6, Ll/᩺ۡܿ;->ۙ:Ll/᩺ۡܿ;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move/from16 v8, p5

    move/from16 v12, p3

    invoke-direct/range {v1 .. v13}, Ll/ܽܺܿ;->֫(Ll/᩺ܺܿ;Ll/᩶᩸ᩳ;IILl/᩺ۡܿ;Ll/ۢۖܿ;IIIIII)V

    return-void
.end method

.method public final ܽ()Ll/ۛۡܿ;
    .locals 2

    .line 192
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 193
    :try_start_0
    iget-object v1, p0, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 194
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܿ()V
    .locals 4

    .line 301
    :try_start_0
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 302
    :try_start_1
    invoke-direct {p0}, Ll/ܽܺܿ;->ܳ()V

    .line 303
    invoke-direct {p0}, Ll/ܽܺܿ;->᩻()V

    .line 304
    iget-object v1, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    invoke-virtual {v1}, Ll/ۛۢܿ;->ܽ()V

    .line 305
    iget-object v1, p0, Ll/ܽܺܿ;->ۨ:Ll/᩷ۘܿ;

    invoke-virtual {v1}, Ll/᩷ۘܿ;->ܽ()V

    const/4 v1, 0x0

    .line 306
    iput-object v1, p0, Ll/ܽܺܿ;->᩷:Ll/᩷ۢܿ;

    .line 837
    iget-object v2, p0, Ll/ܽܺܿ;->ۜ:Ll/ۛۢܿ;

    iget-object v3, p0, Ll/ܽܺܿ;->ܶ:Ll/ۛۡܿ;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v3}, Ll/ۛۡܿ;->ܽ(Ll/ۛۡܿ;)Ll/ܺۖܿ;

    move-result-object v1

    .line 838
    :goto_0
    invoke-virtual {v2}, Ll/ۛۢܿ;->ۧ()Ll/ܺۖܿ;

    move-result-object v3

    if-eq v3, v1, :cond_1

    .line 839
    invoke-virtual {v2}, Ll/ۛۢܿ;->֫()V

    .line 840
    invoke-direct {p0}, Ll/ܽܺܿ;->ۜ()V

    .line 857
    :cond_1
    invoke-direct {p0}, Ll/ܽܺܿ;->᩷()V

    .line 308
    invoke-direct {p0}, Ll/ܽܺܿ;->ۜ()V

    .line 309
    invoke-direct {p0}, Ll/ܽܺܿ;->ۢ()V

    .line 310
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 312
    invoke-direct {p0}, Ll/ܽܺܿ;->ۖ()V

    return-void

    :catchall_0
    move-exception v1

    .line 310
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    .line 312
    invoke-direct {p0}, Ll/ܽܺܿ;->ۖ()V

    .line 313
    throw v0
.end method

.method public final ᩳ()Ll/۟ۡܿ;
    .locals 2

    .line 200
    iget-object v0, p0, Ll/ܽܺܿ;->ۖ:Ljava/lang/Object;

    monitor-enter v0

    .line 201
    :try_start_0
    iget-object v1, p0, Ll/ܽܺܿ;->ۛ:Ll/۟ۡܿ;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 202
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
