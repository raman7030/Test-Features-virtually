.class public final Ll/᩻۬ᩳ;
.super Ljava/lang/Object;
.source "I6U1"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ᩴ֫:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field public ֫֫:Ll/ۖۙᩳ;

.field public volatile ۖ֫:J

.field public ۗ:Ll/ۗ᩻᩵;

.field public ۘ֫:Ll/᩸۬ᩳ;

.field public ۙ:J

.field public ۛ:Ll/ۖ᩹ᩳ;

.field public final ۜ֫:Ljava/util/UUID;

.field public ۟:Z

.field public final ۡ֫:Ll/ۤۙᩳ;

.field public ۢ֫:Z

.field public ۤ:Ll/۟ۙᩳ;

.field public ۧ֫:Ll/ܳۙᩳ;

.field public final ۨ:Ljava/lang/Object;

.field public volatile ۫:Z

.field public volatile ۬:Z

.field public ܰ:Z

.field public ܳ֫:Ll/ۚۙᩳ;

.field public final ܺ֫:Ll/ۗ᩻᩵;

.field public ܽ֫:J

.field public ܿ֫:Ll/ܺۙᩳ;

.field public ᩳ֫:J

.field public ᩶:J

.field public ᩷֫:Ll/ۖۗᩳ;

.field public ᩸:Ll/֡ۗᩳ;

.field public ᩹:I

.field public ᩺:Ll/ܽۙᩳ;

.field public ᩻֫:Ll/ᩳ۬ᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 894
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    sput-object v0, Ll/᩻۬ᩳ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩻۬ᩳ;->ۨ:Ljava/lang/Object;

    .line 29
    sget-object v0, Ll/ۚۙᩳ;->ۡ:Ll/ۚۙᩳ;

    iput-object v0, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    .line 31
    new-instance v0, Ll/ܳۙᩳ;

    invoke-direct {v0}, Ll/ܳۙᩳ;-><init>()V

    iput-object v0, p0, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    .line 44
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/᩻۬ᩳ;->ܺ֫:Ll/ۗ᩻᩵;

    .line 57
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Ll/᩻۬ᩳ;->ۜ֫:Ljava/util/UUID;

    .line 60
    new-instance v0, Ll/ۖ᩹ᩳ;

    invoke-direct {v0, p1}, Ll/ۖ᩹ᩳ;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    .line 61
    new-instance p1, Ll/ۖۙᩳ;

    invoke-direct {p1}, Ll/ۖۙᩳ;-><init>()V

    iput-object p1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    const/4 p1, 0x0

    new-array p1, p1, [B

    const/4 v0, 0x0

    .line 62
    invoke-static {v0, p1}, Ll/ۖۗᩳ;->֫(Ll/֨۬ᩳ;[B)Ll/ۖۗᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    .line 63
    iput-object v0, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    return-void
.end method

.method public constructor <init>(Ll/᩸۬ᩳ;Ll/ۖ᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۡۗᩳ;Ll/᩶۬ᩳ;Ll/۬ۙᩳ;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩻۬ᩳ;->ۨ:Ljava/lang/Object;

    .line 29
    sget-object v0, Ll/ۚۙᩳ;->ۡ:Ll/ۚۙᩳ;

    iput-object v0, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    .line 31
    new-instance v0, Ll/ܳۙᩳ;

    invoke-direct {v0}, Ll/ܳۙᩳ;-><init>()V

    iput-object v0, p0, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    .line 44
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/᩻۬ᩳ;->ܺ֫:Ll/ۗ᩻᩵;

    .line 57
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Ll/᩻۬ᩳ;->ۜ֫:Ljava/util/UUID;

    .line 48
    iput-object p1, p0, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;

    .line 49
    iput-object p2, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    .line 50
    iput-object p3, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    .line 51
    iput-object p4, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    .line 52
    iget-object p2, p0, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object p3, p4, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object p4, p3, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object p3, p3, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {p2, p4, p3}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V

    .line 53
    invoke-virtual {p5}, Ll/ۡۗᩳ;->֫()J

    move-result-wide p2

    iput-wide p2, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    .line 54
    new-instance p2, Ll/ۤۙᩳ;

    invoke-direct {p2, p5, p1, p6, p7}, Ll/ۤۙᩳ;-><init>(Ll/ۡۗᩳ;Ll/᩸۬ᩳ;Ll/᩶۬ᩳ;Ll/۬ۙᩳ;)V

    iput-object p2, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩸۬ᩳ;Ll/ۖ᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۡۗᩳ;Ll/᩶۬ᩳ;Ll/۬ۙᩳ;I)V
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p7}, Ll/᩻۬ᩳ;-><init>(Ll/᩸۬ᩳ;Ll/ۖ᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۡۗᩳ;Ll/᩶۬ᩳ;Ll/۬ۙᩳ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩻۬ᩳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩻۬ᩳ;->ۙ:J

    return-wide v0
.end method

.method public static ֫(Ll/᩻۬ᩳ;Ljava/util/function/BooleanSupplier;Ll/᩺ۗᩳ;Ll/᩶۫᩷;)J
    .locals 25

    move-object/from16 v11, p0

    .line 5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    invoke-interface/range {p1 .. p1}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Ll/᩻۬ᩳ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-virtual {v0, v12, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_19

    .line 925
    :cond_0
    new-instance v14, Ll/ۧ۬ᩳ;

    .line 1012
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 930
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ll/֫۬ᩳ; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_16

    .line 931
    :try_start_1
    invoke-direct/range {p0 .. p0}, Ll/᩻۬ᩳ;->ܿ֫()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual/range {p0 .. p0}, Ll/᩻۬ᩳ;->ܶ()J

    move-result-wide v1

    iget-wide v3, v11, Ll/᩻۬ᩳ;->ۖ֫:J

    cmp-long v5, v1, v3

    if-gez v5, :cond_1

    goto/16 :goto_10

    .line 932
    :cond_1
    iget-object v10, v11, Ll/᩻۬ᩳ;->ۤ:Ll/۟ۙᩳ;

    .line 935
    iget-object v1, v11, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۖ᩹ᩳ;->length()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x3

    mul-long v1, v1, v3

    const-wide/32 v3, 0x10000

    add-long/2addr v1, v3

    iget-object v3, v11, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    invoke-virtual {v3}, Ll/ܳۙᩳ;->֫()J

    move-result-wide v3

    const-wide/16 v5, 0x2

    mul-long v3, v3, v5

    add-long v15, v3, v1

    .line 936
    invoke-virtual/range {p0 .. p0}, Ll/᩻۬ᩳ;->ۜ()Ll/ܶۙᩳ;

    move-result-object v8

    .line 937
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_14

    .line 939
    :try_start_2
    iget-object v1, v8, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v1}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v1

    iget-object v1, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->ܽ()J

    move-result-wide v3

    .line 1004
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/32 v1, 0x4000000

    cmp-long v7, v3, v1

    if-ltz v7, :cond_5

    sub-long v1, v3, v15

    const-wide/32 v17, 0x2000000

    cmp-long v7, v1, v17

    if-ltz v7, :cond_5

    div-long v1, v3, v5

    cmp-long v5, v1, v15

    if-ltz v5, :cond_5

    .line 941
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    .line 942
    iget v1, v11, Ll/᩻۬ᩳ;->᩹:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_10

    const-wide/16 v17, -0x1

    move-object/from16 v5, p2

    .line 1000
    :try_start_3
    iget-wide v12, v5, Ll/᩺ۗᩳ;->ۧ:J

    const-wide v19, 0x7fffffffffffffffL

    shr-long v21, v19, v1

    cmp-long v2, v12, v21

    if-lez v2, :cond_2

    goto :goto_0

    :cond_2
    shl-long v1, v12, v1

    move-wide/from16 v19, v1

    .line 943
    :goto_0
    new-instance v12, Ll/֨ۗᩳ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_f

    move-object v1, v12

    move-object/from16 v2, p0

    move-wide/from16 v23, v3

    move-object/from16 v3, p1

    move-object v4, v8

    move-object/from16 v5, p2

    move-object v13, v8

    move-wide/from16 v8, v19

    :try_start_4
    invoke-direct/range {v1 .. v9}, Ll/֨ۗᩳ;-><init>(Ll/᩻۬ᩳ;Ljava/util/function/BooleanSupplier;Ll/ܶۙᩳ;Ll/᩺ۗᩳ;JJ)V

    iput-object v12, v14, Ll/ۧ۬ᩳ;->᩸:Ljava/lang/Runnable;

    .line 949
    invoke-virtual {v14}, Ll/ۧ۬ᩳ;->run()V

    .line 950
    invoke-virtual {v10}, Ll/۟ۙᩳ;->ܳ()J

    move-result-wide v1

    const-wide/32 v3, 0x1000000

    add-long/2addr v15, v3

    cmp-long v3, v1, v15

    if-ltz v3, :cond_4

    .line 952
    iget-object v1, v13, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v1}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v1

    iget-object v1, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    invoke-virtual {v10, v1}, Ll/۟ۙᩳ;->֫(Ll/᩸۬ᩳ;)Ll/᩺ۙᩳ;

    move-result-object v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_e

    .line 953
    :try_start_5
    new-instance v15, Ll/֫ۗᩳ;

    iget-object v1, v13, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v1}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v1

    iget-object v1, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget-object v2, v12, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    invoke-direct {v15, v1, v2}, Ll/֫ۗᩳ;-><init>(Ll/᩸۬ᩳ;Ll/᩸۬ᩳ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_b

    .line 954
    :try_start_6
    iget-object v1, v14, Ll/ۧ۬ᩳ;->᩸:Ljava/lang/Runnable;

    .line 955
    new-instance v2, Ll/۠ۗᩳ;

    move-wide/from16 v8, v23

    invoke-direct {v2, v8, v9, v12, v1}, Ll/۠ۗᩳ;-><init>(JLl/᩺ۙᩳ;Ljava/lang/Runnable;)V

    iput-object v2, v14, Ll/ۧ۬ᩳ;->᩸:Ljava/lang/Runnable;

    .line 960
    invoke-virtual {v15, v14}, Ll/֫ۗᩳ;->֫(Ljava/lang/Runnable;)V

    .line 961
    new-instance v6, Ll/ۡۗᩳ;

    iget-object v1, v12, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    invoke-direct {v6, v1, v14}, Ll/ۡۗᩳ;-><init>(Ll/᩸۬ᩳ;Ljava/lang/Runnable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object v2, v13

    move-object v3, v15

    move-object v4, v12

    move-object v5, v10

    move-object v10, v7

    move-object/from16 v7, p3

    move-wide/from16 v19, v8

    move-object v8, v14

    move-object/from16 v16, v14

    move-object v14, v10

    move-wide/from16 v9, v19

    .line 962
    :try_start_7
    invoke-direct/range {v1 .. v10}, Ll/᩻۬ᩳ;->֫(Ll/ܶۙᩳ;Ll/֫ۗᩳ;Ll/᩺ۙᩳ;Ll/۟ۙᩳ;Ll/ۡۗᩳ;Ll/᩶۫᩷;Ljava/lang/Runnable;J)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    .line 963
    iput v1, v11, Ll/᩻۬ᩳ;->᩹:I

    .line 964
    iget-wide v2, v13, Ll/ܶۙᩳ;->᩶:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 968
    :try_start_8
    invoke-virtual {v15}, Ll/֫ۗᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    invoke-virtual {v12}, Ll/᩺ۙᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 969
    :try_start_a
    invoke-virtual {v13}, Ll/ܶۙᩳ;->close()V
    :try_end_a
    .catch Ll/֫۬ᩳ; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-object/from16 v4, v16

    .line 977
    iput-object v14, v4, Ll/ۧ۬ᩳ;->᩸:Ljava/lang/Runnable;

    .line 978
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-wide v2

    :catchall_0
    move-exception v0

    move-object/from16 v4, v16

    goto :goto_1

    :catch_0
    move-object/from16 v4, v16

    goto :goto_2

    :catch_1
    move-object/from16 v4, v16

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object/from16 v4, v16

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object/from16 v4, v16

    goto :goto_5

    :cond_3
    move-object/from16 v4, v16

    .line 966
    :try_start_b
    invoke-virtual {v4}, Ll/ۧ۬ᩳ;->run()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 968
    :try_start_c
    invoke-virtual {v15}, Ll/֫ۗᩳ;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :try_start_d
    invoke-virtual {v12}, Ll/᩺ۙᩳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 969
    :try_start_e
    invoke-virtual {v13}, Ll/ܶۙᩳ;->close()V
    :try_end_e
    .catch Ll/֫۬ᩳ; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 977
    iput-object v14, v4, Ll/ۧ۬ᩳ;->᩸:Ljava/lang/Runnable;

    const/4 v1, 0x0

    .line 978
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-wide/16 v0, -0x2

    return-wide v0

    :catchall_3
    move-exception v0

    :goto_1
    move-object v7, v14

    const/4 v12, 0x0

    move-object v14, v4

    goto/16 :goto_17

    :catch_2
    :goto_2
    move-object v7, v14

    const/4 v12, 0x0

    move-object v14, v4

    goto/16 :goto_14

    :catch_3
    :goto_3
    move-object v7, v14

    const/4 v12, 0x0

    const/4 v13, 0x1

    move-object v14, v4

    goto/16 :goto_15

    :catchall_4
    move-exception v0

    :goto_4
    move-object v7, v14

    goto/16 :goto_e

    :catchall_5
    move-exception v0

    :goto_5
    move-object v7, v14

    goto :goto_9

    :catchall_6
    move-exception v0

    goto :goto_6

    :catchall_7
    move-exception v0

    move-object/from16 v4, v16

    :goto_6
    move-object v1, v0

    move-object v7, v14

    goto :goto_7

    :catchall_8
    move-exception v0

    move-object v4, v14

    const/4 v7, 0x0

    move-object v1, v0

    .line 952
    :goto_7
    :try_start_f
    invoke-virtual {v15}, Ll/֫ۗᩳ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    goto :goto_8

    :catchall_9
    move-exception v0

    move-object v2, v0

    :try_start_10
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    :catchall_a
    move-exception v0

    goto :goto_9

    :catchall_b
    move-exception v0

    move-object v4, v14

    const/4 v1, 0x0

    move-object v7, v1

    :goto_9
    move-object v1, v0

    :try_start_11
    invoke-virtual {v12}, Ll/᩺ۙᩳ;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    goto :goto_a

    :catchall_c
    move-exception v0

    move-object v2, v0

    :try_start_12
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v1

    :cond_4
    move-object v4, v14

    const/4 v7, 0x0

    .line 951
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Insufficient space for automatic compaction"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_d

    :catchall_d
    move-exception v0

    goto :goto_e

    :catchall_e
    move-exception v0

    :goto_b
    move-object v4, v14

    goto :goto_c

    :catchall_f
    move-exception v0

    move-object v13, v8

    goto :goto_b

    :goto_c
    const/4 v1, 0x0

    goto :goto_d

    :cond_5
    move-object v13, v8

    move-object v4, v14

    const/4 v7, 0x0

    const-wide/16 v17, -0x1

    .line 969
    :try_start_13
    invoke-virtual {v13}, Ll/ܶۙᩳ;->close()V
    :try_end_13
    .catch Ll/֫۬ᩳ; {:try_start_13 .. :try_end_13} :catch_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_13 .. :try_end_13} :catch_6
    .catchall {:try_start_13 .. :try_end_13} :catchall_12

    goto :goto_11

    :catchall_10
    move-exception v0

    move-object v13, v8

    move-object v4, v14

    const/4 v1, 0x0

    const-wide/16 v17, -0x1

    :goto_d
    move-object v7, v1

    :goto_e
    move-object v1, v0

    .line 938
    :try_start_14
    invoke-virtual {v13}, Ll/ܶۙᩳ;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_11

    goto :goto_f

    :catchall_11
    move-exception v0

    move-object v2, v0

    :try_start_15
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v1
    :try_end_15
    .catch Ll/֫۬ᩳ; {:try_start_15 .. :try_end_15} :catch_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_15 .. :try_end_15} :catch_6
    .catchall {:try_start_15 .. :try_end_15} :catchall_12

    :catchall_12
    move-exception v0

    move-object v14, v4

    const/4 v12, 0x0

    goto :goto_17

    :cond_6
    :goto_10
    move-object v4, v14

    const/4 v7, 0x0

    const-wide/16 v17, -0x1

    .line 931
    :try_start_16
    monitor-exit p0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_13

    .line 977
    :goto_11
    iput-object v7, v4, Ll/ۧ۬ᩳ;->᩸:Ljava/lang/Runnable;

    const/4 v1, 0x0

    .line 978
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-wide v17

    :catchall_13
    move-exception v0

    const/4 v1, 0x0

    move-object v14, v4

    goto :goto_12

    :catchall_14
    move-exception v0

    move-object v4, v14

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v5, -0x1

    move-object v7, v2

    move-object v14, v4

    move-wide/from16 v17, v5

    :goto_12
    move-object v1, v11

    const/4 v12, 0x0

    const/4 v13, 0x1

    .line 937
    :goto_13
    :try_start_17
    monitor-exit v11
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_15

    :try_start_18
    throw v0
    :try_end_18
    .catch Ll/֫۬ᩳ; {:try_start_18 .. :try_end_18} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_18 .. :try_end_18} :catch_7
    .catchall {:try_start_18 .. :try_end_18} :catchall_17

    :catch_4
    move-object v11, v1

    goto :goto_15

    :catchall_15
    move-exception v0

    goto :goto_13

    :catchall_16
    move-exception v0

    move-object v4, v14

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v14, v4

    const/4 v12, 0x0

    goto :goto_18

    :catch_5
    move-object v4, v14

    const/4 v1, 0x0

    const/4 v7, 0x0

    const-wide/16 v17, -0x1

    :catch_6
    move-object v14, v4

    const/4 v12, 0x0

    .line 977
    :catch_7
    :goto_14
    iput-object v7, v14, Ll/ۧ۬ᩳ;->᩸:Ljava/lang/Runnable;

    .line 978
    sget-object v0, Ll/᩻۬ᩳ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_16

    :catch_8
    move-object v4, v14

    const/4 v1, 0x0

    const/4 v7, 0x0

    :catch_9
    move-object v14, v4

    const/4 v12, 0x0

    const/4 v13, 0x1

    .line 971
    :goto_15
    :try_start_19
    iget v0, v11, Ll/᩻۬ᩳ;->᩹:I

    add-int/2addr v0, v13

    const/16 v1, 0x3f

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v11, Ll/᩻۬ᩳ;->᩹:I
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_17

    .line 977
    iput-object v7, v14, Ll/ۧ۬ᩳ;->᩸:Ljava/lang/Runnable;

    .line 978
    sget-object v0, Ll/᩻۬ᩳ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-wide/16 v17, -0x3

    :goto_16
    return-wide v17

    :catchall_17
    move-exception v0

    :goto_17
    move-object v2, v7

    .line 977
    :goto_18
    iput-object v2, v14, Ll/ۧ۬ᩳ;->᩸:Ljava/lang/Runnable;

    .line 978
    sget-object v1, Ll/᩻۬ᩳ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 979
    throw v0

    :cond_7
    :goto_19
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method private ֫(Ll/ۢ۬ᩳ;Ll/ܺۙᩳ;)Ll/ۢ۬ᩳ;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 420
    invoke-virtual/range {p2 .. p2}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v1

    .line 421
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/ۢ۬ᩳ;->ۧ()Ll/ۡ۬ᩳ;

    move-result-object v3

    .line 422
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    if-eqz v3, :cond_2

    .line 423
    iget-wide v5, v3, Ll/ۡ۬ᩳ;->ۧ:J

    iget-wide v9, v0, Ll/᩻۬ᩳ;->ᩳ֫:J

    cmp-long v4, v5, v9

    if-eqz v4, :cond_1

    goto :goto_0

    .line 426
    :cond_1
    new-instance v11, Ll/ۡ۬ᩳ;

    sget-object v9, Ll/ܰ᩶ᩳ;->᩹:Ll/ܰ᩶ᩳ;

    iget-object v3, v3, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {v3, v2}, Ll/ܺۙᩳ;->֫(Ll/ܺۙᩳ;)Ll/ܺۙᩳ;

    move-result-object v10

    move-object v4, v11

    invoke-direct/range {v4 .. v10}, Ll/ۡ۬ᩳ;-><init>(JJLl/ܰ᩶ᩳ;Ll/ܺۙᩳ;)V

    .line 427
    new-instance v2, Ll/ۢ۬ᩳ;

    iget-object v3, v1, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    invoke-virtual {v3, v11}, Ll/ܺۙᩳ;->ۧ(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v13

    iget-object v14, v1, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    iget-wide v3, v1, Ll/ۢ۬ᩳ;->ۧ:J

    iget-boolean v1, v1, Ll/ۢ۬ᩳ;->֫:Z

    move-object v12, v2

    move-wide v15, v3

    move/from16 v17, v1

    invoke-direct/range {v12 .. v17}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V

    return-object v2

    .line 424
    :cond_2
    :goto_0
    iget-object v3, v0, Ll/᩻۬ᩳ;->ܿ֫:Ll/ܺۙᩳ;

    invoke-virtual {v3, v2}, Ll/ܺۙᩳ;->֫(Ll/ܺۙᩳ;)Ll/ܺۙᩳ;

    move-result-object v2

    invoke-virtual {v1, v2, v7, v8}, Ll/ۢ۬ᩳ;->֫(Ll/ܺۙᩳ;J)Ll/ۢ۬ᩳ;

    move-result-object v1

    return-object v1
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/ܳ۬ᩳ;
    .locals 1

    .line 832
    new-instance v0, Ll/ܳ۬ᩳ;

    invoke-static {p0}, Ll/ۘۗᩳ;->֫(Ll/۬ۜܽ;)Ll/ܶۙᩳ;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܳ۬ᩳ;-><init>(Ll/ܶۙᩳ;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/CharSequence;)Ll/᩻۬ᩳ;
    .locals 1

    .line 67
    new-instance v0, Ll/᩻۬ᩳ;

    invoke-direct {v0, p0}, Ll/᩻۬ᩳ;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public static ֫(Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ll/۬ۙᩳ;Ll/ۙۗᩳ;)Ll/᩻۬ᩳ;
    .locals 19

    move-object/from16 v0, p3

    .line 121
    invoke-virtual/range {p1 .. p1}, Ll/ۙ۬ᩳ;->֫()Ll/᩶۬ᩳ;

    move-result-object v8

    const/4 v1, 0x0

    .line 127
    :try_start_0
    iget-object v2, v0, Ll/ۙۗᩳ;->֫:[Ll/۟ۙᩳ;

    iget-object v3, v0, Ll/ۙۗᩳ;->ۧ:Ll/᩷۠ᩴ;

    iget-object v4, v0, Ll/ۙۗᩳ;->ܽ:[Ll/᩺ۙᩳ;

    iget-object v0, v0, Ll/ۙۗᩳ;->ᩳ:Ll/֨۬ᩳ;

    .line 95
    invoke-static {v3}, Ll/۟ۙᩳ;->֫(Ll/᩷۠ᩴ;)Ll/۟ۙᩳ;

    move-result-object v3

    const/4 v5, 0x0

    aput-object v3, v2, v5

    .line 96
    invoke-virtual {v3, v0}, Ll/۟ۙᩳ;->֫(Ll/֨۬ᩳ;)Ll/᩺ۙᩳ;

    move-result-object v0

    aput-object v0, v4, v5

    .line 97
    iget-object v9, v0, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    :try_start_1
    new-array v0, v5, [B

    move-object/from16 v2, p0

    .line 128
    invoke-static {v2, v0}, Ll/ۖۗᩳ;->֫(Ll/֨۬ᩳ;[B)Ll/ۖۗᩳ;

    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 129
    :try_start_2
    new-instance v11, Ll/ۖ᩹ᩳ;

    iget v0, v9, Ll/᩸۬ᩳ;->ۗ:I

    iget v2, v9, Ll/᩸۬ᩳ;->ۤ:I

    invoke-static {v0, v2, v9}, Ll/ۨ᩹ᩳ;->֫(IILl/᩸۬ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v0

    const-wide/16 v2, 0x0

    invoke-direct {v11, v0, v2, v3}, Ll/ۖ᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 130
    :try_start_3
    new-instance v5, Ll/ۡۗᩳ;

    invoke-direct {v5, v9}, Ll/ۡۗᩳ;-><init>(Ll/᩸۬ᩳ;)V

    .line 131
    new-instance v4, Ll/ۖۙᩳ;

    invoke-direct {v4}, Ll/ۖۙᩳ;-><init>()V

    .line 132
    invoke-virtual {v11}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v14, v10, Ll/ۖۗᩳ;->᩸:[B

    .line 0
    monitor-enter v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    move-object v12, v5

    move-object v13, v1

    move-object v15, v4

    .line 51
    :try_start_5
    invoke-virtual/range {v12 .. v18}, Ll/ۡۗᩳ;->֫(Ll/۫᩹ᩳ;[BLl/ۖۙᩳ;Ll/ۚۙᩳ;J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 52
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 132
    :try_start_7
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V

    .line 133
    new-instance v12, Ll/᩻۬ᩳ;

    move-object v0, v12

    move-object v1, v9

    move-object v2, v11

    move-object v3, v10

    move-object v6, v8

    move-object/from16 v7, p2

    invoke-direct/range {v0 .. v7}, Ll/᩻۬ᩳ;-><init>(Ll/᩸۬ᩳ;Ll/ۖ᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۡۗᩳ;Ll/᩶۬ᩳ;Ll/۬ۙᩳ;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    return-object v12

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 52
    :try_start_8
    monitor-exit v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 132
    :try_start_a
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_0

    :catchall_3
    move-exception v0

    move-object v1, v0

    :try_start_b
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :goto_1
    move-object v1, v11

    goto :goto_2

    :catchall_4
    move-exception v0

    goto :goto_2

    :catchall_5
    move-exception v0

    move-object v10, v1

    goto :goto_2

    :catchall_6
    move-exception v0

    move-object v9, v1

    move-object v10, v9

    :goto_2
    if-eqz v1, :cond_0

    .line 139
    :try_start_c
    invoke-virtual {v1}, Ll/ۖ᩹ᩳ;->close()V

    goto :goto_3

    :catchall_7
    move-exception v0

    goto :goto_4

    :cond_0
    :goto_3
    if-eqz v10, :cond_2

    .line 140
    invoke-virtual {v10}, Ll/ۖۗᩳ;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    goto :goto_6

    :goto_4
    if-eqz v9, :cond_1

    .line 142
    :try_start_d
    invoke-virtual {v9}, Ll/᩸۬ᩳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    goto :goto_5

    :catchall_8
    move-exception v0

    move-object v1, v0

    invoke-virtual {v8}, Ll/᩶۬ᩳ;->close()V

    throw v1

    :cond_1
    :goto_5
    invoke-virtual {v8}, Ll/᩶۬ᩳ;->close()V

    .line 143
    throw v0

    :cond_2
    :goto_6
    if-eqz v9, :cond_3

    .line 142
    :try_start_e
    invoke-virtual {v9}, Ll/᩸۬ᩳ;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    goto :goto_7

    :catchall_9
    move-exception v0

    move-object v1, v0

    invoke-virtual {v8}, Ll/᩶۬ᩳ;->close()V

    throw v1

    :cond_3
    :goto_7
    invoke-virtual {v8}, Ll/᩶۬ᩳ;->close()V

    .line 145
    throw v0
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;)Ll/᩻۬ᩳ;
    .locals 6

    const/4 v0, 0x1

    new-array v1, v0, [Ll/۟ۙᩳ;

    new-array v0, v0, [Ll/᩺ۙᩳ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 94
    :try_start_0
    sget-object v4, Ll/۬ۙᩳ;->ܿ:Ll/۬ۙᩳ;

    new-instance v5, Ll/ۙۗᩳ;

    invoke-direct {v5, v1, p0, v0, p1}, Ll/ۙۗᩳ;-><init>([Ll/۟ۙᩳ;Ll/᩷۠ᩴ;[Ll/᩺ۙᩳ;Ll/֨۬ᩳ;)V

    invoke-static {p1, p2, v4, v5}, Ll/᩻۬ᩳ;->֫(Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ll/۬ۙᩳ;Ll/ۙۗᩳ;)Ll/᩻۬ᩳ;

    move-result-object v3

    .line 99
    aget-object p0, v1, v2

    aget-object p1, v0, v2

    .line 215
    iget-wide v4, v3, Ll/᩻۬ᩳ;->ۖ֫:J

    .line 99
    invoke-virtual {p0, p1, v4, v5}, Ll/۟ۙᩳ;->֫(Ll/᩺ۙᩳ;J)V

    .line 100
    aget-object p0, v0, v2

    invoke-virtual {p0}, Ll/᩺ۙᩳ;->ܽ֫()Ll/᩸۬ᩳ;

    .line 101
    aget-object p0, v1, v2

    iput-object p0, v3, Ll/᩻۬ᩳ;->ۤ:Ll/۟ۙᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v3

    :catchall_0
    move-exception p0

    if-eqz v3, :cond_3

    .line 106
    :try_start_1
    invoke-virtual {v3}, Ll/᩻۬ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    .line 108
    :try_start_2
    aget-object p1, v0, v2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/᩺ۙᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 109
    :cond_0
    aget-object p1, v1, v2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ll/۟ۙᩳ;->close()V

    .line 110
    :cond_1
    throw p0

    :catchall_2
    move-exception p0

    .line 109
    aget-object p1, v1, v2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ll/۟ۙᩳ;->close()V

    :cond_2
    throw p0

    .line 108
    :cond_3
    :goto_0
    :try_start_3
    aget-object p1, v0, v2

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ll/᩺ۙᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 109
    :cond_4
    aget-object p1, v1, v2

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ll/۟ۙᩳ;->close()V

    .line 112
    :cond_5
    throw p0

    :catchall_3
    move-exception p0

    .line 109
    aget-object p1, v1, v2

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ll/۟ۙᩳ;->close()V

    :cond_6
    throw p0
.end method

.method private ֫(Ll/ܰ᩶ᩳ;Ljava/util/function/Consumer;Ll/ۧۙᩳ;)V
    .locals 25

    move-object/from16 v10, p0

    move-object/from16 v0, p1

    .line 451
    invoke-direct/range {p0 .. p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 452
    sget-object v1, Ll/ܰ᩶ᩳ;->᩶:Ll/ܰ᩶ᩳ;

    if-ne v0, v1, :cond_0

    invoke-direct/range {p0 .. p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 453
    :cond_0
    sget-object v2, Ll/ܰ᩶ᩳ;->۫:Ll/ܰ᩶ᩳ;

    if-eq v0, v2, :cond_2

    sget-object v2, Ll/ܰ᩶ᩳ;->᩹:Ll/ܰ᩶ᩳ;

    if-eq v0, v2, :cond_2

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 454
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported session edit origin"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    const/4 v2, 0x1

    .line 456
    iput-boolean v2, v10, Ll/᩻۬ᩳ;->ۢ֫:Z

    .line 457
    iget-object v3, v10, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v3}, Ll/ۖ᩹ᩳ;->ܽ()J

    move-result-wide v11

    new-array v13, v2, [J

    .line 459
    iget-object v9, v10, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    new-array v14, v2, [Ll/ۖۙᩳ;

    .line 461
    iget-object v3, v9, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    new-array v15, v2, [Ll/ۚۗᩳ;

    const/4 v4, 0x0

    aput-object v3, v15, v4

    const/16 v16, 0x0

    if-eq v0, v1, :cond_4

    if-eqz p3, :cond_3

    goto :goto_1

    .line 463
    :cond_3
    new-instance v17, Ll/᩻ۙᩳ;

    iget-wide v3, v9, Ll/ۖۙᩳ;->֫:J

    iget-wide v5, v9, Ll/ۖۙᩳ;->ᩳ:J

    new-instance v7, Ll/ܿۛ᩻;

    invoke-direct {v7, v2, v15}, Ll/ܿۛ᩻;-><init>(ILjava/lang/Object;)V

    const/4 v8, 0x1

    const/16 v18, 0x0

    move-object/from16 v1, v17

    move-object/from16 v2, p1

    .line 19
    invoke-direct/range {v1 .. v8}, Ll/᩻ۙᩳ;-><init>(Ll/ܰ᩶ᩳ;JJLjava/util/function/Supplier;Z)V

    move-object/from16 v8, v17

    goto :goto_2

    :cond_4
    :goto_1
    const/16 v18, 0x0

    move-object/from16 v8, v16

    :goto_2
    const/4 v7, 0x0

    .line 464
    iget-object v1, v10, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    new-instance v2, Ll/ۗۗᩳ;

    invoke-direct {v2, v7, v15}, Ll/ۗۗᩳ;-><init>(ILjava/lang/Object;)V

    .line 35
    new-instance v16, Ll/᩻ۙᩳ;

    sget-object v18, Ll/ܰ᩶ᩳ;->᩹:Ll/ܰ᩶ᩳ;

    iget-wide v3, v1, Ll/ܽۙᩳ;->ܳ:J

    iget-wide v5, v1, Ll/ܽۙᩳ;->᩻:J

    const/16 v24, 0x0

    move-object/from16 v17, v16

    move-wide/from16 v19, v3

    move-wide/from16 v21, v5

    move-object/from16 v23, v2

    invoke-direct/range {v17 .. v24}, Ll/᩻ۙᩳ;-><init>(Ll/ܰ᩶ᩳ;JJLjava/util/function/Supplier;Z)V

    :goto_3
    move-object/from16 v6, v16

    .line 466
    :try_start_0
    iget-object v5, v10, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    new-instance v4, Ll/۬ۗᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-object v1, v4

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    move-wide/from16 v16, v11

    move-object v11, v4

    move-object v4, v13

    move-object v12, v5

    move-object v5, v8

    move-object/from16 p2, v6

    move-object v6, v9

    move v9, v7

    move-object v7, v14

    move-object/from16 v18, v13

    move-object v13, v8

    move-object v8, v15

    move-object/from16 v19, v14

    move v14, v9

    move-object/from16 v9, p2

    :try_start_1
    invoke-direct/range {v1 .. v9}, Ll/۬ۗᩳ;-><init>(Ll/᩻۬ᩳ;Ljava/util/function/Consumer;[JLl/᩻ۙᩳ;Ll/ۖۙᩳ;[Ll/ۖۙᩳ;[Ll/ۚۗᩳ;Ll/᩻ۙᩳ;)V

    new-instance v1, Ll/۫ۗᩳ;

    move-object/from16 v2, p2

    invoke-direct {v1, v0, v13, v2, v15}, Ll/۫ۗᩳ;-><init>(Ll/ܰ᩶ᩳ;Ll/᩻ۙᩳ;Ll/᩻ۙᩳ;[Ll/ۚۗᩳ;)V

    invoke-virtual {v12, v11, v1}, Ll/ۖ᩹ᩳ;->֫(Ljava/util/function/Consumer;Ll/۫ۗᩳ;)V

    .line 485
    iget-object v0, v10, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۖ᩹ᩳ;->ܽ()J

    move-result-wide v0

    cmp-long v3, v0, v16

    if-eqz v3, :cond_7

    if-eqz v2, :cond_6

    .line 486
    iget-object v0, v10, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    invoke-virtual {v0}, Ll/ܽۙᩳ;->ۧ()V

    .line 487
    :cond_6
    aget-object v0, v19, v14

    iput-object v0, v10, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    .line 488
    aget-wide v0, v18, v14

    invoke-direct {v10, v0, v1}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 491
    :cond_7
    :try_start_2
    iget-object v0, v10, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object v1, v10, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v1, v1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v2, v1, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v1, v1, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v0, v2, v1}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 492
    iput-boolean v14, v10, Ll/᩻۬ᩳ;->ۢ֫:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean v14, v10, Ll/᩻۬ᩳ;->ۢ֫:Z

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_4

    :catchall_2
    move-exception v0

    move v14, v7

    .line 491
    :goto_4
    :try_start_3
    iget-object v1, v10, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object v2, v10, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v2, v2, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v3, v2, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v2, v2, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v1, v3, v2}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 492
    iput-boolean v14, v10, Ll/᩻۬ᩳ;->ۢ֫:Z

    .line 493
    throw v0

    :catchall_3
    move-exception v0

    .line 492
    iput-boolean v14, v10, Ll/᩻۬ᩳ;->ۢ֫:Z

    throw v0
.end method

.method public static ֫(Ll/᩷۠ᩴ;)V
    .locals 0

    .line 86
    invoke-static {p0}, Ll/۟ۙᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩻۬ᩳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/᩻۬ᩳ;->ۙ:J

    return-void
.end method

.method public static ֫(Ll/᩻۬ᩳ;Ljava/lang/Throwable;Ll/۟ۙᩳ;Ljava/lang/Throwable;)V
    .locals 0

    .line 1218
    iget-object p0, p0, Ll/᩻۬ᩳ;->ܺ֫:Ll/ۗ᩻᩵;

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    move-object p1, p3

    goto :goto_0

    :cond_1
    if-eq p1, p3, :cond_2

    .line 1247
    invoke-virtual {p1, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    if-eqz p2, :cond_4

    .line 1220
    :try_start_0
    invoke-virtual {p2}, Ll/۟ۙᩳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    if-nez p1, :cond_3

    move-object p1, p2

    goto :goto_1

    :cond_3
    if-eq p1, p2, :cond_4

    .line 1247
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    if-nez p1, :cond_5

    const/4 p1, 0x0

    .line 1222
    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    goto :goto_2

    .line 1223
    :cond_5
    invoke-virtual {p0, p1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public static ֫(Ll/᩻۬ᩳ;Ljava/util/function/BooleanSupplier;Ll/ܶۙᩳ;Ll/᩺ۗᩳ;JJ)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 945
    invoke-interface {p1}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/᩻۬ᩳ;->۬:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/᩻۬ᩳ;->۫:Z

    if-nez p1, :cond_1

    iget-wide p0, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    iget-wide v0, p2, Ll/ܶۙᩳ;->᩶:J

    cmp-long p2, p0, v0

    if-nez p2, :cond_1

    .line 947
    iget-object p0, p3, Ll/᩺ۗᩳ;->֫:Ll/ۨۗᩳ;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p0

    sub-long/2addr p0, p4

    cmp-long p2, p0, p6

    if-gez p2, :cond_0

    return-void

    :cond_0
    new-instance p0, Ll/֫۬ᩳ;

    .line 1009
    invoke-direct {p0}, Ljava/util/concurrent/CancellationException;-><init>()V

    .line 947
    throw p0

    .line 946
    :cond_1
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string p1, "Automatic compaction yielded"

    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ֫(Ll/᩻۬ᩳ;Ljava/util/function/Consumer;[JLl/᩻ۙᩳ;Ll/ۖۙᩳ;[Ll/ۖۙᩳ;[Ll/ۚۗᩳ;Ll/᩻ۙᩳ;Ll/ܺ᩹ᩳ;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p7

    move-object/from16 v4, p1

    move-object/from16 v5, p8

    .line 467
    invoke-interface {v4, v5}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 468
    invoke-virtual/range {p8 .. p8}, Ll/ܺ᩹ᩳ;->֫()J

    move-result-wide v4

    const/4 v6, 0x0

    aput-wide v4, p2, v6

    const-wide/16 v4, 0x0

    if-nez v1, :cond_0

    .line 469
    iget-object v7, v2, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    goto :goto_0

    :cond_0
    iget-wide v7, v0, Ll/᩻۬ᩳ;->ᩳ֫:J

    cmp-long v9, v7, v4

    if-eqz v9, :cond_1

    .line 470
    iget-object v7, v2, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    invoke-virtual/range {p3 .. p3}, Ll/᩻ۙᩳ;->֫()Ll/ܺۙᩳ;

    move-result-object v8

    invoke-direct {v0, v7, v8}, Ll/᩻۬ᩳ;->֫(Ll/ۢ۬ᩳ;Ll/ܺۙᩳ;)Ll/ۢ۬ᩳ;

    move-result-object v7

    goto :goto_0

    :cond_1
    iget-object v7, v2, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-virtual {v1, v7, v8, v9}, Ll/᩻ۙᩳ;->֫(Ll/ۢ۬ᩳ;J)Ll/ۢ۬ᩳ;

    move-result-object v7

    .line 472
    :goto_0
    iget-wide v8, v0, Ll/᩻۬ᩳ;->ᩳ֫:J

    cmp-long v10, v8, v4

    if-nez v10, :cond_2

    iget-object v4, v0, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-wide v8, v2, Ll/ۖۙᩳ;->ܽ:J

    invoke-virtual/range {p0 .. p0}, Ll/᩻۬ᩳ;->᩶()Z

    move-result v5

    invoke-virtual {v7, v4, v8, v9, v5}, Ll/ۢ۬ᩳ;->֫(Ll/ܳۙᩳ;JZ)Ll/ۢ۬ᩳ;

    move-result-object v7

    :cond_2
    move-object v9, v7

    .line 473
    new-instance v4, Ll/ۖۙᩳ;

    aget-object v10, p6, v6

    if-nez v1, :cond_3

    iget-wide v7, v2, Ll/ۖۙᩳ;->֫:J

    goto :goto_1

    :cond_3
    invoke-virtual/range {p3 .. p3}, Ll/᩻ۙᩳ;->ۧ()J

    move-result-wide v7

    :goto_1
    move-wide v11, v7

    if-nez v1, :cond_4

    .line 474
    iget-wide v7, v2, Ll/ۖۙᩳ;->ᩳ:J

    goto :goto_2

    :cond_4
    invoke-virtual/range {p3 .. p3}, Ll/᩻ۙᩳ;->ܽ()J

    move-result-wide v7

    :goto_2
    move-wide v13, v7

    iget-wide v1, v2, Ll/ۖۙᩳ;->ܽ:J

    move-object v8, v4

    move-wide v15, v1

    invoke-direct/range {v8 .. v16}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    aput-object v4, p5, v6

    if-eqz v3, :cond_5

    .line 475
    iget-object v0, v0, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    invoke-virtual {v0, v3, v4}, Ll/ܽۙᩳ;->֫(Ll/᩻ۙᩳ;Ll/ۖۙᩳ;)V

    :cond_5
    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩻۬ᩳ;Ll/ۖۗᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩻۬ᩳ;Ll/ۗ᩻᩵;Ljava/lang/Throwable;)V
    .locals 2

    if-eqz p2, :cond_0

    move-object v0, p0

    .line 1173
    monitor-enter v0

    const/4 v1, 0x0

    .line 1174
    :try_start_0
    iput-boolean v1, p0, Ll/᩻۬ᩳ;->۫:Z

    const/4 v1, 0x0

    .line 1175
    iput-object v1, p0, Ll/᩻۬ᩳ;->ۗ:Ll/ۗ᩻᩵;

    .line 1176
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1177
    invoke-virtual {p1, p2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p0

    .line 1176
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 1179
    :cond_0
    invoke-virtual {p0}, Ll/᩻۬ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object p0

    new-instance p2, Ll/᩶ۗᩳ;

    invoke-direct {p2, p1}, Ll/᩶ۗᩳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩻۬ᩳ;Ll/ۚۙᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩻۬ᩳ;Ll/۟ۙᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩻۬ᩳ;->ۤ:Ll/۟ۙᩳ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩻۬ᩳ;Ll/۟ۙᩳ;Ll/֨۬ᩳ;)V
    .locals 1

    .line 1103
    iget-object p0, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    new-instance v0, Ll/᩸ۗᩳ;

    invoke-direct {v0, p1, p2}, Ll/᩸ۗᩳ;-><init>(Ll/۟ۙᩳ;Ll/֨۬ᩳ;)V

    invoke-virtual {p0, v0}, Ll/ۤۙᩳ;->֫(Ll/᩸ۗᩳ;)V

    return-void
.end method

.method private ֫(Ll/֡ۗᩳ;[CILl/ۚۙᩳ;ILl/ᩳ۬ᩳ;)Z
    .locals 8

    .line 309
    iget-object v0, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_5

    invoke-virtual {p1}, Ll/֡ۗᩳ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 310
    :cond_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 311
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۖ᩹ᩳ;->length()I

    move-result v0

    int-to-long v2, v0

    int-to-long v4, p3

    add-long/2addr v2, v4

    int-to-long v6, p5

    cmp-long p5, v2, v6

    if-lez p5, :cond_1

    goto :goto_2

    :cond_1
    const/4 p5, 0x1

    .line 312
    iput-boolean p5, p0, Ll/᩻۬ᩳ;->ۢ֫:Z

    const/4 v0, 0x0

    if-eqz p3, :cond_2

    .line 314
    :try_start_0
    iget-object v2, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    new-instance v3, Ll/ۤۗᩳ;

    invoke-direct {v3, p1, p2, p3, p4}, Ll/ۤۗᩳ;-><init>(Ll/֡ۗᩳ;[CILl/ۚۙᩳ;)V

    .line 113
    invoke-virtual {v2, v3, v0}, Ll/ۖ᩹ᩳ;->֫(Ljava/util/function/Consumer;Ll/۫ۗᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 323
    :cond_2
    :try_start_1
    invoke-virtual {p4}, Ll/ۚۙᩳ;->ܿ()Z

    move-result p2

    invoke-virtual {p1, p2}, Ll/֡ۗᩳ;->֫(Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 326
    :goto_0
    :try_start_2
    iput-object p4, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    .line 327
    iput-object p4, p1, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    if-eqz p6, :cond_3

    .line 328
    iput-boolean p5, p6, Ll/ᩳ۬ᩳ;->ۧ:Z

    .line 329
    :cond_3
    invoke-virtual {p4}, Ll/ۚۙᩳ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_4

    iput-object v0, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    :cond_4
    const-wide/16 p1, 0x2

    mul-long v4, v4, p1

    const-wide/16 p1, 0x1

    .line 330
    invoke-static {p1, p2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 332
    iput-boolean v1, p0, Ll/᩻۬ᩳ;->ۢ֫:Z

    return p5

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 324
    :try_start_3
    new-instance p2, Ljava/io/UncheckedIOException;

    invoke-direct {p2, p1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 332
    :goto_1
    iput-boolean v1, p0, Ll/᩻۬ᩳ;->ۢ֫:Z

    throw p1

    :cond_5
    :goto_2
    return v1
.end method

.method private ֫(Ll/ܶۙᩳ;Ll/֫ۗᩳ;Ll/᩺ۙᩳ;Ll/۟ۙᩳ;Ll/ۡۗᩳ;Ll/᩶۫᩷;Ljava/lang/Runnable;J)Z
    .locals 15

    move-object v1, p0

    move-object/from16 v0, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p7

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    .line 1058
    invoke-virtual {v5, v4}, Ll/֫ۗᩳ;->֫(Ll/ܶۙᩳ;)Ll/ܶۙᩳ;

    move-result-object v4

    .line 1059
    :try_start_0
    move-object v5, v3

    check-cast v5, Ll/ۧ۬ᩳ;

    invoke-virtual {v5}, Ll/ۧ۬ᩳ;->run()V

    .line 1060
    iget-object v7, v4, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    iget-object v6, v4, Ll/ܶۙᩳ;->ۙ:Ll/ۖۗᩳ;

    iget-object v8, v6, Ll/ۖۗᩳ;->᩸:[B

    iget-object v9, v4, Ll/ܶۙᩳ;->᩸:Ll/ۖۙᩳ;

    iget-object v10, v4, Ll/ܶۙᩳ;->᩹:Ll/ۚۙᩳ;

    iget-wide v11, v4, Ll/ܶۙᩳ;->᩶:J

    move-object/from16 v6, p5

    invoke-virtual/range {v6 .. v12}, Ll/ۡۗᩳ;->֫(Ll/۫᩹ᩳ;[BLl/ۖۙᩳ;Ll/ۚۙᩳ;J)V

    .line 1061
    invoke-virtual {v5}, Ll/ۧ۬ᩳ;->run()V

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    cmp-long v9, p8, v6

    if-lez v9, :cond_0

    .line 1062
    iget-object v6, v0, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    invoke-virtual {v6}, Ll/᩸۬ᩳ;->ܽ()J

    move-result-wide v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_14

    sub-long v6, p8, v6

    const-wide/32 v9, 0x2000000

    cmp-long v11, v6, v9

    if-gez v11, :cond_0

    .line 1111
    invoke-virtual {v4}, Ll/ܶۙᩳ;->close()V

    return v8

    .line 1063
    :cond_0
    :try_start_1
    iget-wide v6, v4, Ll/ܶۙᩳ;->᩶:J

    invoke-virtual {v2, v6, v7, v0, v3}, Ll/۟ۙᩳ;->֫(JLl/᩺ۙᩳ;Ljava/lang/Runnable;)V

    .line 1065
    invoke-virtual {v5}, Ll/ۧ۬ᩳ;->run()V

    .line 1066
    new-instance v3, Ll/ۖ᩹ᩳ;

    iget-object v6, v4, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v6}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v6

    iget-object v7, v4, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v7}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v9

    invoke-direct {v3, v6, v9, v10}, Ll/ۖ᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V

    .line 1067
    new-instance v6, Ll/ܳۙᩳ;

    invoke-direct {v6}, Ll/ܳۙᩳ;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_14

    const/4 v7, 0x0

    .line 1074
    :try_start_2
    iget-object v9, v4, Ll/ܶۙᩳ;->᩸:Ll/ۖۙᩳ;

    iget-object v9, v9, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v10, v9, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v9, v9, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v6, v10, v9}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V

    .line 1075
    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_e

    .line 1076
    :try_start_3
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    .line 1077
    iget-boolean v9, v1, Ll/᩻۬ᩳ;->۫:Z

    if-nez v9, :cond_3

    .line 1078
    iget-wide v9, v1, Ll/᩻۬ᩳ;->ۖ֫:J

    iget-wide v11, v4, Ll/ܶۙᩳ;->᩶:J

    cmp-long v13, v9, v11

    if-eqz v13, :cond_1

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_b

    .line 1107
    :try_start_4
    invoke-virtual {v3}, Ll/ۖ᩹ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual {v6}, Ll/ܳۙᩳ;->ۧ()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1111
    invoke-virtual {v4}, Ll/ܶۙᩳ;->close()V

    return v8

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v2, v0

    .line 1107
    :try_start_6
    invoke-virtual {v6}, Ll/ܳۙᩳ;->ۧ()V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 1109
    :goto_0
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_14

    .line 1079
    :cond_1
    :try_start_8
    invoke-virtual {v5}, Ll/ۧ۬ᩳ;->run()V

    .line 1080
    iget-object v5, v1, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    iget-object v8, v0, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    move-object/from16 v9, p5

    invoke-virtual {v5, v9, v8}, Ll/ۤۙᩳ;->֫(Ll/ۡۗᩳ;Ll/᩸۬ᩳ;)Ll/ۙۙᩳ;

    move-result-object v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_b

    .line 1081
    :try_start_9
    iget-wide v8, v4, Ll/ܶۙᩳ;->᩶:J

    invoke-virtual {v2, v0, v8, v9}, Ll/۟ۙᩳ;->ۧ(Ll/᩺ۙᩳ;J)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_a

    .line 1087
    :try_start_a
    iget-object v8, v1, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1088
    :try_start_b
    iget-object v9, v1, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 1089
    :try_start_c
    iget-object v7, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    .line 1090
    invoke-virtual/range {p3 .. p3}, Ll/᩺ۙᩳ;->ܽ֫()Ll/᩸۬ᩳ;

    move-result-object v0

    iput-object v0, v1, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;

    .line 1092
    iget-object v10, v1, Ll/᩻۬ᩳ;->ۨ:Ljava/lang/Object;

    monitor-enter v10
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    :try_start_d
    iput-object v3, v1, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    monitor-exit v10
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 1093
    :try_start_e
    iget-object v0, v4, Ll/ܶۙᩳ;->᩸:Ll/ۖۙᩳ;

    iput-object v0, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    .line 1094
    iput-object v6, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    .line 1095
    invoke-virtual {v5}, Ll/ۙۙᩳ;->֫()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    const/4 v0, 0x1

    .line 1097
    :try_start_f
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 1102
    :try_start_10
    iget-object v3, v9, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    .line 1103
    invoke-virtual {v9}, Ll/᩸۬ᩳ;->ۘ()Ll/ۗ᩻᩵;

    move-result-object v6

    new-instance v10, Ll/ܶۗᩳ;

    invoke-direct {v10, p0, v2, v3}, Ll/ܶۗᩳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v10}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 1104
    :try_start_11
    invoke-virtual {v8}, Ll/ۖ᩹ᩳ;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 1105
    :try_start_12
    invoke-virtual {v9}, Ll/᩸۬ᩳ;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    :try_start_13
    invoke-virtual {v7}, Ll/ܳۙᩳ;->ۧ()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    .line 1109
    :try_start_14
    invoke-virtual {v5}, Ll/ۙۙᩳ;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_14

    .line 1111
    invoke-virtual {v4}, Ll/ܶۙᩳ;->close()V

    return v0

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 1105
    :try_start_15
    invoke-virtual {v7}, Ll/ܳۙᩳ;->ۧ()V

    throw v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    :catchall_3
    move-exception v0

    move-object v2, v0

    :try_start_16
    invoke-virtual {v9}, Ll/᩸۬ᩳ;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    :try_start_17
    invoke-virtual {v7}, Ll/ܳۙᩳ;->ۧ()V

    throw v2

    :catchall_4
    move-exception v0

    move-object v2, v0

    invoke-virtual {v7}, Ll/ܳۙᩳ;->ۧ()V

    throw v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    :catchall_5
    move-exception v0

    .line 1109
    :try_start_18
    invoke-virtual {v5}, Ll/ۙۙᩳ;->close()V

    throw v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_14

    :catchall_6
    move-exception v0

    const/4 v10, 0x1

    goto :goto_5

    :catchall_7
    move-exception v0

    .line 1092
    :try_start_19
    monitor-exit v10
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_7

    :try_start_1a
    throw v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_8

    :catchall_8
    move-exception v0

    goto :goto_4

    :catchall_9
    move-exception v0

    move-object v9, v7

    goto :goto_4

    :catchall_a
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    .line 1083
    :goto_1
    :try_start_1b
    invoke-virtual/range {p4 .. p4}, Ll/۟ۙᩳ;->ᩳ()Z

    move-result v8

    if-eqz v8, :cond_2

    iget-object v8, v1, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    invoke-virtual {v8, v0}, Ll/ۤۙᩳ;->֫(Ljava/lang/Throwable;)V

    .line 1084
    :cond_2
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_a

    :goto_2
    move-object v8, v7

    goto :goto_3

    .line 1077
    :cond_3
    :try_start_1c
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v5, "Session is closing during compaction"

    invoke-direct {v0, v5}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_b

    :catchall_b
    move-exception v0

    move-object v5, v7

    move-object v8, v5

    :goto_3
    move-object v9, v8

    :goto_4
    const/4 v10, 0x0

    :goto_5
    move-object v14, v7

    move-object v7, v5

    move-object v5, v14

    .line 1097
    :goto_6
    :try_start_1d
    monitor-exit p0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_d

    :try_start_1e
    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_c

    :catchall_c
    move-exception v0

    move-object v14, v9

    move-object v9, v7

    move-object v7, v14

    goto :goto_7

    :catchall_d
    move-exception v0

    goto :goto_6

    :catchall_e
    move-exception v0

    const/4 v10, 0x0

    move-object v5, v7

    move-object v8, v5

    move-object v9, v8

    :goto_7
    if-eqz v10, :cond_4

    .line 1102
    :try_start_1f
    iget-object v3, v7, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    .line 1103
    invoke-virtual {v7}, Ll/᩸۬ᩳ;->ۘ()Ll/ۗ᩻᩵;

    move-result-object v6

    new-instance v10, Ll/ܶۗᩳ;

    invoke-direct {v10, p0, v2, v3}, Ll/ܶۗᩳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v10}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_12

    .line 1104
    :try_start_20
    invoke-virtual {v8}, Ll/ۖ᩹ᩳ;->close()V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_10

    .line 1105
    :try_start_21
    invoke-virtual {v7}, Ll/᩸۬ᩳ;->close()V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_f

    :try_start_22
    invoke-virtual {v5}, Ll/ܳۙᩳ;->ۧ()V

    goto :goto_8

    :catchall_f
    move-exception v0

    move-object v2, v0

    invoke-virtual {v5}, Ll/ܳۙᩳ;->ۧ()V

    throw v2
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_12

    :catchall_10
    move-exception v0

    move-object v2, v0

    :try_start_23
    invoke-virtual {v7}, Ll/᩸۬ᩳ;->close()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_11

    :try_start_24
    invoke-virtual {v5}, Ll/ܳۙᩳ;->ۧ()V

    throw v2

    :catchall_11
    move-exception v0

    move-object v2, v0

    invoke-virtual {v5}, Ll/ܳۙᩳ;->ۧ()V

    throw v2
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_12

    :catchall_12
    move-exception v0

    goto :goto_9

    .line 1107
    :cond_4
    :try_start_25
    invoke-virtual {v3}, Ll/ۖ᩹ᩳ;->close()V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_13

    :try_start_26
    invoke-virtual {v6}, Ll/ܳۙᩳ;->ۧ()V
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_12

    :goto_8
    if-eqz v9, :cond_5

    .line 1109
    :try_start_27
    invoke-virtual {v9}, Ll/ۙۙᩳ;->close()V

    .line 1110
    :cond_5
    throw v0
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_14

    :catchall_13
    move-exception v0

    move-object v2, v0

    .line 1107
    :try_start_28
    invoke-virtual {v6}, Ll/ܳۙᩳ;->ۧ()V

    throw v2
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_12

    :goto_9
    if-eqz v9, :cond_6

    .line 1109
    :try_start_29
    invoke-virtual {v9}, Ll/ۙۙᩳ;->close()V

    :cond_6
    throw v0
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_14

    :catchall_14
    move-exception v0

    move-object v2, v0

    .line 1058
    :try_start_2a
    invoke-virtual {v4}, Ll/ܶۙᩳ;->close()V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_15

    goto :goto_a

    :catchall_15
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v2
.end method

.method public static bridge synthetic ۜ(Ll/᩻۬ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩷֫()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩻۬ᩳ;)Ll/ۖۗᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    return-object p0
.end method

.method public static ۧ(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;)Ll/ܿ۬ᩳ;
    .locals 5

    .line 169
    sget-object v0, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    .line 174
    invoke-virtual {p2}, Ll/ۙ۬ᩳ;->֫()Ll/᩶۬ᩳ;

    move-result-object p2

    const/4 v1, 0x0

    .line 180
    :try_start_0
    invoke-static {p0}, Ll/۟ۙᩳ;->ᩳ(Ll/᩷۠ᩴ;)Ll/۟ۙᩳ;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 181
    :try_start_1
    invoke-virtual {p0}, Ll/۟ۙᩳ;->֫()Ll/ܰۙᩳ;

    move-result-object v2

    .line 182
    invoke-virtual {p0, v2}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;)Ll/᩷۠ᩴ;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;Z)Ll/۬۬ᩳ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩸۬ᩳ;->ۧ(Ll/ۤ۬ᩳ;Ll/֨۬ᩳ;)Ll/᩸۬ᩳ;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 183
    :try_start_2
    new-instance v0, Ll/ۡۗᩳ;

    invoke-direct {v0, p1}, Ll/ۡۗᩳ;-><init>(Ll/᩸۬ᩳ;)V

    .line 184
    sget-object v3, Ll/᩷ۗᩳ;->֫:Ll/᩷ۗᩳ;

    invoke-virtual {v0, v3}, Ll/ۡۗᩳ;->֫(Ll/᩷ۗᩳ;)Ll/ۢۗᩳ;

    move-result-object v1

    .line 185
    iget-wide v3, v1, Ll/ۢۗᩳ;->ۛ:J

    invoke-static {v2, p1, v3, v4}, Ll/۟ۙᩳ;->֫(Ll/ܰۙᩳ;Ll/᩸۬ᩳ;J)V

    .line 186
    new-instance v2, Ll/ܿ۬ᩳ;

    invoke-direct {v2, p1, v0, v1, p2}, Ll/ܿ۬ᩳ;-><init>(Ll/᩸۬ᩳ;Ll/ۡۗᩳ;Ll/ۢۗᩳ;Ll/᩶۬ᩳ;)V

    .line 187
    invoke-static {v2, p0}, Ll/ܿ۬ᩳ;->֫(Ll/ܿ۬ᩳ;Ll/۟ۙᩳ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v2

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v0, p1

    move-object p1, v1

    goto :goto_0

    :catchall_2
    move-exception v0

    move-object p0, v1

    move-object p1, p0

    :goto_0
    if-eqz v1, :cond_3

    .line 192
    :try_start_3
    invoke-virtual {v1}, Ll/ۢۗᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    if-eqz p1, :cond_1

    .line 194
    :try_start_4
    invoke-virtual {p1}, Ll/᩸۬ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_2

    :catchall_4
    move-exception p1

    if-eqz p0, :cond_0

    .line 196
    :try_start_5
    invoke-virtual {p0}, Ll/۟ۙᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_1

    :catchall_5
    move-exception p0

    .line 197
    invoke-virtual {p2}, Ll/᩶۬ᩳ;->close()V

    throw p0

    :cond_0
    :goto_1
    invoke-virtual {p2}, Ll/᩶۬ᩳ;->close()V

    .line 198
    throw p1

    :cond_1
    :goto_2
    if-eqz p0, :cond_2

    .line 196
    :try_start_6
    invoke-virtual {p0}, Ll/۟ۙᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_3

    :catchall_6
    move-exception p0

    .line 197
    invoke-virtual {p2}, Ll/᩶۬ᩳ;->close()V

    throw p0

    :cond_2
    :goto_3
    invoke-virtual {p2}, Ll/᩶۬ᩳ;->close()V

    .line 199
    throw v0

    :cond_3
    :goto_4
    if-eqz p1, :cond_5

    .line 194
    :try_start_7
    invoke-virtual {p1}, Ll/᩸۬ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_6

    :catchall_7
    move-exception p1

    if-eqz p0, :cond_4

    .line 196
    :try_start_8
    invoke-virtual {p0}, Ll/۟ۙᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    goto :goto_5

    :catchall_8
    move-exception p0

    .line 197
    invoke-virtual {p2}, Ll/᩶۬ᩳ;->close()V

    throw p0

    :cond_4
    :goto_5
    invoke-virtual {p2}, Ll/᩶۬ᩳ;->close()V

    .line 198
    throw p1

    :cond_5
    :goto_6
    if-eqz p0, :cond_6

    .line 196
    :try_start_9
    invoke-virtual {p0}, Ll/۟ۙᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    goto :goto_7

    :catchall_9
    move-exception p0

    .line 197
    invoke-virtual {p2}, Ll/᩶۬ᩳ;->close()V

    throw p0

    :cond_6
    :goto_7
    invoke-virtual {p2}, Ll/᩶۬ᩳ;->close()V

    .line 201
    throw v0
.end method

.method public static bridge synthetic ܳ(Ll/᩻۬ᩳ;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 0
    iput-wide v0, p0, Ll/᩻۬ᩳ;->᩶:J

    return-void
.end method

.method private ܳ֫()V
    .locals 5

    .line 625
    iget-object v0, p0, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩻۬ᩳ;->۟:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩻۬ᩳ;->᩻֫:Ll/ᩳ۬ᩳ;

    if-nez v0, :cond_1

    .line 621
    iget-wide v0, p0, Ll/᩻۬ᩳ;->ᩳ֫:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Operation is unavailable during history grouping"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 625
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Operation is unavailable during editable history replay"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܺ֫()V
    .locals 5

    .line 1135
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩷֫()V

    .line 1136
    iget-wide v0, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Session revision exhausted"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ܽ(Ll/᩻۬ᩳ;)Ll/ۤۙᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/᩻۬ᩳ;)Ll/᩸۬ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;

    return-object p0
.end method

.method private ܿ֫()Z
    .locals 5

    .line 917
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۤ:Ll/۟ۙᩳ;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/᩻۬ᩳ;->۬:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩻۬ᩳ;->۫:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩻۬ᩳ;->ۢ֫:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩻۬ᩳ;->۟:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩻۬ᩳ;->᩻֫:Ll/ᩳ۬ᩳ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    .line 918
    invoke-virtual {v0}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/᩻۬ᩳ;->ܰ:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/᩻۬ᩳ;->ۙ:J

    iget-wide v2, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ᩳ(Ll/᩻۬ᩳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    return-wide v0
.end method

.method private ᩷(J)V
    .locals 9

    .line 699
    iget-boolean v0, p0, Ll/᩻۬ᩳ;->ܰ:Z

    const-wide v1, 0x7fffffffffffffffL

    if-eqz v0, :cond_1

    .line 700
    iget-wide v3, p0, Ll/᩻۬ᩳ;->᩶:J

    sub-long v5, v1, v3

    cmp-long v7, p1, v5

    if-lez v7, :cond_0

    move-wide v3, v1

    goto :goto_0

    :cond_0
    add-long/2addr v3, p1

    .line 701
    :goto_0
    iput-wide v3, p0, Ll/᩻۬ᩳ;->᩶:J

    .line 703
    :cond_1
    iget-object v3, p0, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    if-eqz v3, :cond_3

    .line 58
    iget-wide v4, v3, Ll/ܽۙᩳ;->ۧ:J

    sub-long v6, v1, v4

    cmp-long v0, p1, v6

    if-lez v0, :cond_2

    goto :goto_1

    :cond_2
    add-long v1, v4, p1

    :goto_1
    iput-wide v1, v3, Ll/ܽۙᩳ;->ۧ:J

    return-void

    :cond_3
    if-nez v0, :cond_5

    .line 707
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-nez v0, :cond_4

    goto :goto_2

    .line 708
    :cond_4
    new-instance v8, Ll/ܶۙᩳ;

    iget-object v1, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v2

    iget-object v3, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    iget-object v4, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v5, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    iget-wide v6, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Ll/ܶۙᩳ;-><init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V

    invoke-virtual {v0, v8, p1, p2}, Ll/ۤۙᩳ;->֫(Ll/ܶۙᩳ;J)V

    :cond_5
    :goto_2
    return-void
.end method

.method private ᩷֫()V
    .locals 2

    .line 1140
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    .line 1141
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۤ:Ll/۟ۙᩳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۟ۙᩳ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recovery generation requires reopening"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1142
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/᩻۬ᩳ;->۫:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/᩻۬ᩳ;->ۢ֫:Z

    if-nez v0, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Text session is closing or already editing"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ᩻(J)V
    .locals 7

    .line 688
    iget-wide v0, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    .line 689
    iget-wide v0, p0, Ll/᩻۬ᩳ;->ᩳ֫:J

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-eqz v6, :cond_1

    .line 690
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    .line 691
    iget-wide v0, p0, Ll/᩻۬ᩳ;->ܽ֫:J

    const-wide v2, 0x7fffffffffffffffL

    sub-long v4, v2, v0

    cmp-long v6, p1, v4

    if-lez v6, :cond_0

    goto :goto_0

    :cond_0
    add-long v2, v0, p1

    :goto_0
    iput-wide v2, p0, Ll/᩻۬ᩳ;->ܽ֫:J

    return-void

    .line 694
    :cond_1
    invoke-direct {p0, p1, p2}, Ll/᩻۬ᩳ;->᩷(J)V

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/᩻۬ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    return-void
.end method

.method private ᩻֫()V
    .locals 2

    .line 1131
    iget-boolean v0, p0, Ll/᩻۬ᩳ;->۬:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ll/֫᩹ᩳ;

    const-string v1, "Text session is closed"

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1131
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1232
    invoke-virtual {p0}, Ll/᩻۬ᩳ;->ᩴ()Ll/ۗ᩻᩵;

    move-result-object v0

    .line 1233
    invoke-static {}, Ll/ۙ۬ᩳ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1234
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Use closeAsync from persistence callbacks"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1236
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_0
    .catch Ll/۬᩻᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1238
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 1239
    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_3

    .line 1240
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 1241
    :cond_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to close text session"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1239
    :cond_3
    check-cast v0, Ljava/io/IOException;

    throw v0
.end method

.method public final length()I
    .locals 2

    .line 204
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۨ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۖ᩹ᩳ;->length()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֡()J
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 497
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    iget-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-wide v1, v1, Ll/ۖۙᩳ;->֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(I)C
    .locals 2

    .line 208
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۨ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v1, p1}, Ll/ۖ᩹ᩳ;->֫(I)Ll/ۨ᩹ᩳ;

    move-result-object v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 73
    iget-object v0, v1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    :try_start_1
    invoke-virtual {v1, p1}, Ll/ۨ᩹ᩳ;->֫(I)C

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    :cond_0
    return p1

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    .line 76
    :cond_1
    throw p1

    :catchall_1
    move-exception p1

    .line 208
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final ֫()Ll/ۗ᩻᩵;
    .locals 6

    move-object v0, p0

    .line 1193
    monitor-enter v0

    .line 1194
    :try_start_0
    iget-boolean v1, p0, Ll/᩻۬ᩳ;->۬:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/᩻۬ᩳ;->ܺ֫:Ll/ۗ᩻᩵;

    monitor-exit v0

    return-object v1

    .line 1195
    :cond_0
    iget-boolean v1, p0, Ll/᩻۬ᩳ;->ۢ֫:Z

    if-nez v1, :cond_9

    iget-object v1, p0, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    if-nez v1, :cond_9

    iget-boolean v1, p0, Ll/᩻۬ᩳ;->۟:Z

    if-nez v1, :cond_9

    iget-object v1, p0, Ll/᩻۬ᩳ;->᩻֫:Ll/ᩳ۬ᩳ;

    if-nez v1, :cond_9

    iget-wide v1, p0, Ll/᩻۬ᩳ;->ᩳ֫:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_9

    .line 1196
    iget-object v1, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    if-eqz v1, :cond_1

    .line 1197
    iget-object v2, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    sget-object v3, Ll/֡ۙᩳ;->᩹:Ll/֡ۙᩳ;

    sget-object v4, Ll/᩵ۙᩳ;->ۗ:Ll/᩵ۙᩳ;

    invoke-virtual {v2, v3, v4}, Ll/ۚۙᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;)Ll/ۚۙᩳ;

    move-result-object v2

    iput-object v2, v1, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    :cond_1
    const/4 v2, 0x0

    .line 1198
    iput-object v2, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    const/4 v3, 0x1

    .line 1199
    iput-boolean v3, p0, Ll/᩻۬ᩳ;->۬:Z

    .line 1200
    iget-object v3, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    .line 1201
    iput-object v2, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    .line 1202
    iput-object v2, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    .line 1203
    iget-object v4, p0, Ll/᩻۬ᩳ;->ۤ:Ll/۟ۙᩳ;

    .line 1204
    iput-object v2, p0, Ll/᩻۬ᩳ;->ۤ:Ll/۟ۙᩳ;

    .line 1205
    iget-object v5, p0, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    invoke-virtual {v5}, Ll/ܳۙᩳ;->ۧ()V

    .line 1206
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v1, :cond_2

    .line 1207
    invoke-virtual {v1}, Ll/֡ۗᩳ;->ܽ()V

    .line 1209
    :cond_2
    :try_start_1
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۖ᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v2

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 1210
    :goto_0
    :try_start_2
    invoke-virtual {v3}, Ll/ۖۗᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    if-nez v0, :cond_3

    move-object v0, v1

    goto :goto_1

    :cond_3
    if-eq v0, v1, :cond_4

    .line 1247
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1211
    :cond_4
    :goto_1
    :try_start_3
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v1

    if-nez v0, :cond_5

    move-object v0, v1

    goto :goto_2

    :cond_5
    if-eq v0, v1, :cond_6

    .line 1247
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1212
    :cond_6
    :goto_2
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-nez v1, :cond_8

    if-nez v0, :cond_7

    .line 1213
    iget-object v0, p0, Ll/᩻۬ᩳ;->ܺ֫:Ll/ۗ᩻᩵;

    invoke-virtual {v0, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    iget-object v1, p0, Ll/᩻۬ᩳ;->ܺ֫:Ll/ۗ᩻᩵;

    invoke-virtual {v1, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    .line 1214
    :goto_3
    iget-object v0, p0, Ll/᩻۬ᩳ;->ܺ֫:Ll/ۗ᩻᩵;

    return-object v0

    .line 1217
    :cond_8
    invoke-virtual {v1}, Ll/ۤۙᩳ;->ᩳ()Ll/ۗ᩻᩵;

    move-result-object v1

    new-instance v2, Ll/᩹ۗᩳ;

    invoke-direct {v2, p0, v0, v4}, Ll/᩹ۗᩳ;-><init>(Ll/᩻۬ᩳ;Ljava/lang/Throwable;Ll/۟ۙᩳ;)V

    invoke-virtual {v1, v2}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    .line 1225
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    invoke-virtual {v0}, Ll/ۤۙᩳ;->֫()V

    .line 1226
    iget-object v0, p0, Ll/᩻۬ᩳ;->ܺ֫:Ll/ۗ᩻᩵;

    return-object v0

    .line 1195
    :cond_9
    :try_start_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot abandon during session edit"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_3
    move-exception v1

    .line 1206
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw v1
.end method

.method public final ֫(Ljava/util/function/BooleanSupplier;)Ll/ۗ᩻᩵;
    .locals 5

    .line 902
    sget-object v1, Ll/᩺ۗᩳ;->ܽ:Ll/᩺ۗᩳ;

    new-instance v2, Ll/᩶۫᩷;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 907
    :try_start_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 908
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܿ֫()Z

    move-result v3

    if-nez v3, :cond_0

    sget-object p1, Ll/ܰۗᩳ;->ۗ:Ll/ܰۗᩳ;

    invoke-static {p1}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 909
    :cond_0
    :try_start_1
    iget-object v3, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    new-instance v4, Ll/ۛۗᩳ;

    invoke-direct {v4, p0, p1, v1, v2}, Ll/ۛۗᩳ;-><init>(Ll/᩻۬ᩳ;Ljava/util/function/BooleanSupplier;Ll/᩺ۗᩳ;Ll/᩶۫᩷;)V

    const/4 p1, 0x1

    invoke-virtual {v3, v4, p1}, Ll/ۤۙᩳ;->֫(Ll/ۛۗᩳ;Z)Ll/ۗ᩻᩵;

    move-result-object p1

    new-instance v1, Ll/ᩴۛ֫;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ll/ᩴۛ֫;-><init>(I)V

    .line 910
    invoke-virtual {p1, v1}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 909
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(ZLl/۟᩶ᩳ;)Ll/ܽ۬ᩳ;
    .locals 17

    move-object/from16 v1, p0

    move/from16 v0, p1

    move-object/from16 v16, p0

    .line 7
    monitor-enter v16

    .line 564
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 565
    invoke-direct/range {p0 .. p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 566
    iget-object v2, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    invoke-static {v2, v0}, Ll/ۜۙᩳ;->֫(Ll/ۖۙᩳ;Z)Ll/ۜۙᩳ;

    move-result-object v2

    if-nez v2, :cond_0

    .line 567
    sget-object v0, Ll/ܽ۬ᩳ;->ۙ:Ll/ܽ۬ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    monitor-exit v16

    return-object v0

    .line 568
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ll/ۜۙᩳ;->ۧ()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    .line 569
    iput-boolean v4, v1, Ll/᩻۬ᩳ;->۟:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_b

    .line 570
    :try_start_2
    iget-object v0, v2, Ll/ۜۙᩳ;->֫:Ll/ۚۗᩳ;

    move-object/from16 v2, p2

    invoke-interface {v2, v0}, Ll/۟᩶ᩳ;->֫(Ll/ۚۗᩳ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 571
    :try_start_3
    iput-boolean v5, v1, Ll/᩻۬ᩳ;->۟:Z

    .line 572
    sget-object v0, Ll/ܽ۬ᩳ;->᩶:Ll/ܽ۬ᩳ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_b

    monitor-exit v16

    return-object v0

    :catchall_0
    move-exception v0

    .line 571
    :try_start_4
    iput-boolean v5, v1, Ll/᩻۬ᩳ;->۟:Z

    throw v0

    :cond_1
    move-object/from16 v2, p2

    .line 574
    new-instance v3, Ll/ܽۙᩳ;

    iget-object v4, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    invoke-virtual/range {p0 .. p0}, Ll/᩻۬ᩳ;->᩶()Z

    move-result v5

    invoke-direct {v3, v4, v0, v5}, Ll/ܽۙᩳ;-><init>(Ll/ۖۙᩳ;ZZ)V

    .line 575
    iput-object v3, v1, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_b

    if-eqz v0, :cond_3

    .line 578
    :try_start_5
    iget-object v4, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v4, v4, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    .line 53
    iget-object v5, v4, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    .line 21
    invoke-virtual {v5}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    .line 54
    :cond_2
    new-instance v6, Ll/ۢ۬ᩳ;

    iget-object v7, v4, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    invoke-virtual {v5}, Ll/ܺۙᩳ;->last()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۡ۬ᩳ;

    invoke-virtual {v7, v8}, Ll/ܺۙᩳ;->֫(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v8

    invoke-virtual {v5}, Ll/ܺۙᩳ;->removeLast()Ll/ܺۙᩳ;

    move-result-object v9

    iget-wide v10, v4, Ll/ۢ۬ᩳ;->ۧ:J

    iget-boolean v12, v4, Ll/ۢ۬ᩳ;->֫:Z

    move-object v7, v6

    invoke-direct/range {v7 .. v12}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_0
    move-object v4, v6

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v5, v1

    goto/16 :goto_c

    .line 578
    :cond_3
    :try_start_6
    iget-object v4, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v4, v4, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    .line 48
    iget-object v5, v4, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    invoke-virtual {v4}, Ll/ۢ۬ᩳ;->֫()Z

    move-result v6

    if-nez v6, :cond_4

    :goto_1
    move-object v6, v4

    goto :goto_2

    .line 49
    :cond_4
    new-instance v6, Ll/ۢ۬ᩳ;

    invoke-virtual {v5}, Ll/ܺۙᩳ;->removeLast()Ll/ܺۙᩳ;

    move-result-object v8

    iget-object v7, v4, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v5}, Ll/ܺۙᩳ;->last()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۡ۬ᩳ;

    invoke-virtual {v7, v5}, Ll/ܺۙᩳ;->֫(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v9

    iget-wide v10, v4, Ll/ۢ۬ᩳ;->ۧ:J

    iget-boolean v12, v4, Ll/ۢ۬ᩳ;->֫:Z

    move-object v7, v6

    invoke-direct/range {v7 .. v12}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V

    goto :goto_0

    .line 579
    :goto_2
    new-instance v4, Ll/ۖۙᩳ;

    iget-object v5, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v7, v5, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    iget-wide v8, v5, Ll/ۖۙᩳ;->֫:J

    iget-wide v10, v5, Ll/ۖۙᩳ;->ᩳ:J

    iget-wide v12, v5, Ll/ۖۙᩳ;->ܽ:J

    move-object v5, v4

    invoke-direct/range {v5 .. v13}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    iput-object v4, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    const-wide/16 v4, 0x1

    .line 580
    invoke-direct {v1, v4, v5}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_9

    if-eqz v0, :cond_5

    .line 581
    :try_start_7
    iget-object v4, v3, Ll/ܽۙᩳ;->ۡ:Ll/ۡ۬ᩳ;

    iget-object v4, v4, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {v4}, Ll/ܺۙᩳ;->iterator()Ljava/util/Iterator;

    move-result-object v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-object v5, v1

    goto/16 :goto_9

    :cond_5
    :try_start_8
    iget-object v4, v3, Ll/ܽۙᩳ;->ۡ:Ll/ۡ۬ᩳ;

    iget-object v4, v4, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    new-instance v5, Ll/᩷ۙᩳ;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, Ll/᩷ۙᩳ;-><init>(Ll/ܺۙᩳ;Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    move-object v4, v5

    move-object v5, v1

    .line 582
    :goto_3
    :try_start_9
    move-object v6, v4

    check-cast v6, Ll/᩷ۙᩳ;

    invoke-virtual {v6}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    .line 583
    invoke-virtual {v6}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺᩶ᩳ;

    .line 584
    new-instance v14, Ll/ۖۙᩳ;

    iget-object v7, v5, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v8, v7, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v9, v7, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    if-eqz v0, :cond_6

    .line 585
    iget-wide v10, v6, Ll/᩺᩶ᩳ;->ۧ:J

    goto :goto_4

    :cond_6
    iget-wide v10, v6, Ll/᩺᩶ᩳ;->ܽ:J

    :goto_4
    iget-wide v12, v7, Ll/ۖۙᩳ;->ᩳ:J

    move-object/from16 p1, v2

    iget-wide v1, v7, Ll/ۖۙᩳ;->ܽ:J

    move-object v7, v14

    move-object/from16 p2, v4

    move-object v4, v14

    move-wide v14, v1

    invoke-direct/range {v7 .. v15}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    iput-object v4, v5, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    .line 586
    invoke-virtual {v6}, Ll/᩺᩶ᩳ;->֫()Z

    move-result v1

    if-nez v1, :cond_9

    .line 587
    new-instance v1, Ll/ۧۙᩳ;

    .line 76
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 588
    iput-object v1, v3, Ll/ܽۙᩳ;->ܽ:Ll/ۧۙᩳ;

    if-eqz v0, :cond_7

    .line 589
    iget-object v2, v6, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    goto :goto_5

    :cond_7
    iget-object v2, v6, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    .line 590
    :goto_5
    iget v4, v6, Ll/᩺᩶ᩳ;->ۜ:I

    if-eqz v0, :cond_8

    iget-object v7, v6, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    goto :goto_6

    :cond_8
    iget-object v7, v6, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    :goto_6
    invoke-virtual {v7}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    add-int/2addr v4, v7

    .line 591
    :try_start_a
    new-instance v7, Ll/۬᩹ᩳ;

    invoke-direct {v7, v2}, Ll/۬᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 592
    :try_start_b
    iget v2, v6, Ll/᩺᩶ᩳ;->ۜ:I

    move-object/from16 v6, p1

    invoke-interface {v6, v1, v2, v4, v7}, Ll/۟᩶ᩳ;->֫(Ll/ۧۙᩳ;IILl/۬᩹ᩳ;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 593
    :try_start_c
    invoke-virtual {v7}, Ll/۬᩹ᩳ;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    const/4 v1, 0x0

    :try_start_d
    iput-object v1, v3, Ll/ܽۙᩳ;->ܽ:Ll/ۧۙᩳ;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object v1, v0

    .line 591
    :try_start_e
    invoke-virtual {v7}, Ll/۬᩹ᩳ;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    move-object v2, v0

    :try_start_f
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    :catchall_4
    move-exception v0

    const/4 v1, 0x0

    .line 593
    :try_start_10
    iput-object v1, v3, Ll/ܽۙᩳ;->ܽ:Ll/ۧۙᩳ;

    throw v0

    :cond_9
    move-object/from16 v6, p1

    :goto_8
    move-object/from16 v4, p2

    move-object v2, v6

    :goto_9
    move-object/from16 v1, p0

    goto :goto_3

    :cond_a
    move-object v6, v2

    if-eqz v0, :cond_b

    .line 596
    iget-object v1, v3, Ll/ܽۙᩳ;->ۡ:Ll/ۡ۬ᩳ;

    iget-object v1, v1, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {v1}, Ll/ܺۙᩳ;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺᩶ᩳ;

    const/4 v2, 0x0

    goto :goto_a

    :cond_b
    iget-object v1, v3, Ll/ܽۙᩳ;->ۡ:Ll/ۡ۬ᩳ;

    iget-object v1, v1, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    const/4 v2, 0x0

    .line 31
    :try_start_11
    invoke-virtual {v1, v2}, Ll/ܺۙᩳ;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 596
    check-cast v1, Ll/᩺᩶ᩳ;

    :goto_a
    if-eqz v0, :cond_c

    .line 597
    invoke-virtual {v1}, Ll/᩺᩶ᩳ;->֫()Z

    move-result v0

    if-nez v0, :cond_c

    .line 598
    iget v0, v1, Ll/᩺᩶ᩳ;->ۜ:I

    iget-object v1, v1, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    add-int/2addr v0, v1

    .line 9
    new-instance v1, Ll/ۚۗᩳ;

    invoke-direct {v1, v0, v0}, Ll/ۚۗᩳ;-><init>(II)V

    goto :goto_b

    .line 598
    :cond_c
    iget-object v1, v1, Ll/᩺᩶ᩳ;->᩻:Ll/ۚۗᩳ;

    .line 600
    :goto_b
    invoke-interface {v6, v1}, Ll/۟᩶ᩳ;->֫(Ll/ۚۗᩳ;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 602
    :try_start_12
    sget-object v0, Ll/ܽ۬ᩳ;->᩹:Ll/ܽ۬ᩳ;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 606
    :try_start_13
    iget-object v1, v5, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object v2, v5, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v2, v2, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v4, v2, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v2, v2, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v1, v4, v2}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    const/4 v1, 0x0

    .line 608
    :try_start_14
    iput-object v1, v5, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    .line 609
    invoke-virtual {v3}, Ll/ܽۙᩳ;->֫()V

    .line 611
    iget-object v1, v5, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-eqz v1, :cond_d

    iget-boolean v2, v5, Ll/᩻۬ᩳ;->ܰ:Z

    if-nez v2, :cond_d

    .line 612
    new-instance v2, Ll/ܶۙᩳ;

    iget-object v4, v5, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v4}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v7

    iget-object v8, v5, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    iget-object v9, v5, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v10, v5, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    iget-wide v11, v5, Ll/᩻۬ᩳ;->ۖ֫:J

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, Ll/ܶۙᩳ;-><init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V

    iget-wide v3, v3, Ll/ܽۙᩳ;->ۧ:J

    const-wide/16 v5, 0x1

    .line 613
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    .line 612
    invoke-virtual {v1, v2, v3, v4}, Ll/ۤۙᩳ;->֫(Ll/ܶۙᩳ;J)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    .line 602
    :cond_d
    monitor-exit v16

    return-object v0

    :catchall_5
    move-exception v0

    const/4 v1, 0x0

    .line 608
    :try_start_15
    iput-object v1, v5, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    .line 609
    invoke-virtual {v3}, Ll/ܽۙᩳ;->֫()V

    .line 611
    iget-object v1, v5, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-eqz v1, :cond_e

    iget-boolean v2, v5, Ll/᩻۬ᩳ;->ܰ:Z

    if-nez v2, :cond_e

    .line 612
    new-instance v2, Ll/ܶۙᩳ;

    iget-object v4, v5, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v4}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v7

    iget-object v8, v5, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    iget-object v9, v5, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v10, v5, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    iget-wide v11, v5, Ll/᩻۬ᩳ;->ۖ֫:J

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, Ll/ܶۙᩳ;-><init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V

    iget-wide v3, v3, Ll/ܽۙᩳ;->ۧ:J

    const-wide/16 v5, 0x1

    .line 613
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    .line 612
    invoke-virtual {v1, v2, v3, v4}, Ll/ۤۙᩳ;->֫(Ll/ܶۙᩳ;J)V

    .line 615
    :cond_e
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    :catchall_6
    move-exception v0

    const/4 v1, 0x1

    goto :goto_d

    :catchall_7
    move-exception v0

    move v1, v2

    goto :goto_d

    :catchall_8
    move-exception v0

    goto :goto_c

    :catchall_9
    move-exception v0

    move-object/from16 v5, p0

    :goto_c
    const/4 v1, 0x0

    :goto_d
    if-nez v1, :cond_f

    .line 605
    :try_start_16
    iget-object v1, v5, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    invoke-virtual {v3, v1}, Ll/ܽۙᩳ;->֫(Ll/ۖۙᩳ;)Ll/ۖۙᩳ;

    move-result-object v1

    iput-object v1, v5, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    .line 606
    :cond_f
    iget-object v1, v5, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object v2, v5, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v2, v2, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v4, v2, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v2, v2, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v1, v4, v2}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_a

    const/4 v1, 0x0

    .line 608
    :try_start_17
    iput-object v1, v5, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    .line 609
    invoke-virtual {v3}, Ll/ܽۙᩳ;->֫()V

    .line 611
    iget-object v1, v5, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-eqz v1, :cond_10

    iget-boolean v2, v5, Ll/᩻۬ᩳ;->ܰ:Z

    if-nez v2, :cond_10

    .line 612
    new-instance v2, Ll/ܶۙᩳ;

    iget-object v4, v5, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v4}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v7

    iget-object v8, v5, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    iget-object v9, v5, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v10, v5, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    iget-wide v11, v5, Ll/᩻۬ᩳ;->ۖ֫:J

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, Ll/ܶۙᩳ;-><init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V

    iget-wide v3, v3, Ll/ܽۙᩳ;->ۧ:J

    const-wide/16 v5, 0x1

    .line 613
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    .line 612
    invoke-virtual {v1, v2, v3, v4}, Ll/ۤۙᩳ;->֫(Ll/ܶۙᩳ;J)V

    .line 616
    :cond_10
    throw v0

    :catchall_a
    move-exception v0

    const/4 v1, 0x0

    .line 608
    iput-object v1, v5, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    .line 609
    invoke-virtual {v3}, Ll/ܽۙᩳ;->֫()V

    .line 611
    iget-object v1, v5, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-eqz v1, :cond_11

    iget-boolean v2, v5, Ll/᩻۬ᩳ;->ܰ:Z

    if-nez v2, :cond_11

    .line 612
    new-instance v2, Ll/ܶۙᩳ;

    iget-object v4, v5, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v4}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v7

    iget-object v8, v5, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    iget-object v9, v5, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v10, v5, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    iget-wide v11, v5, Ll/᩻۬ᩳ;->ۖ֫:J

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, Ll/ܶۙᩳ;-><init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V

    iget-wide v3, v3, Ll/ܽۙᩳ;->ۧ:J

    const-wide/16 v5, 0x1

    .line 613
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    .line 612
    invoke-virtual {v1, v2, v3, v4}, Ll/ۤۙᩳ;->֫(Ll/ܶۙᩳ;J)V

    .line 615
    :cond_11
    throw v0

    :catchall_b
    move-exception v0

    monitor-exit v16
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    throw v0
.end method

.method public final declared-synchronized ֫(II)V
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 518
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 519
    new-instance v3, Ll/ۚۗᩳ;

    invoke-direct {v3, p1, p2}, Ll/ۚۗᩳ;-><init>(II)V

    .line 520
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۖ᩹ᩳ;->length()I

    move-result v1

    if-gt p1, v1, :cond_1

    iget-object p1, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {p1}, Ll/ۖ᩹ᩳ;->length()I

    move-result p1

    if-gt p2, p1, :cond_1

    .line 521
    iget-object p1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object p1, p1, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    invoke-virtual {v3, p1}, Ll/ۚۗᩳ;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    monitor-exit v0

    return-void

    .line 522
    :cond_0
    :try_start_1
    new-instance p1, Ll/ۖۙᩳ;

    iget-object p2, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v2, p2, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-wide v4, p2, Ll/ۖۙᩳ;->֫:J

    iget-wide v6, p2, Ll/ۖۙᩳ;->ᩳ:J

    iget-wide v8, p2, Ll/ۖۙᩳ;->ܽ:J

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    iput-object p1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    const-wide/16 p1, 0x1

    .line 523
    invoke-direct {p0, p1, p2}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 524
    monitor-exit v0

    return-void

    .line 520
    :cond_1
    :try_start_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Selection exceeds text length"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ljava/lang/Runnable;)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v13, p0

    .line 3
    monitor-enter v13

    .line 397
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 398
    invoke-direct/range {p0 .. p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 399
    new-instance v0, Ll/ܺۙᩳ;

    invoke-direct {v0}, Ll/ܺۙᩳ;-><init>()V

    iput-object v0, v1, Ll/᩻۬ᩳ;->ܿ֫:Ll/ܺۙᩳ;

    .line 400
    iget-object v0, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v0, v0, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-wide v2, v0, Ll/ۢ۬ᩳ;->ۧ:J

    iput-wide v2, v1, Ll/᩻۬ᩳ;->ᩳ֫:J

    const-wide/16 v2, 0x0

    .line 401
    iput-wide v2, v1, Ll/᩻۬ᩳ;->ܽ֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    const/4 v4, 0x0

    .line 403
    :try_start_1
    invoke-interface/range {p1 .. p1}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 406
    :try_start_2
    iget-object v0, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v5, v0, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v6, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-wide v7, v0, Ll/ۖۙᩳ;->ܽ:J

    invoke-virtual/range {p0 .. p0}, Ll/᩻۬ᩳ;->᩶()Z

    move-result v0

    invoke-virtual {v5, v6, v7, v8, v0}, Ll/ۢ۬ᩳ;->֫(Ll/ܳۙᩳ;JZ)Ll/ۢ۬ᩳ;

    move-result-object v15

    .line 407
    new-instance v0, Ll/ۖۙᩳ;

    iget-object v5, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v6, v5, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    iget-wide v7, v5, Ll/ۖۙᩳ;->֫:J

    iget-wide v9, v5, Ll/ۖۙᩳ;->ᩳ:J

    iget-wide v11, v5, Ll/ۖۙᩳ;->ܽ:J

    move-object v14, v0

    move-object/from16 v16, v6

    move-wide/from16 v17, v7

    move-wide/from16 v19, v9

    move-wide/from16 v21, v11

    invoke-direct/range {v14 .. v22}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    iput-object v0, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 409
    :try_start_3
    iget-wide v5, v1, Ll/᩻۬ᩳ;->ܽ֫:J

    .line 410
    iput-wide v2, v1, Ll/᩻۬ᩳ;->ܽ֫:J

    iput-wide v2, v1, Ll/᩻۬ᩳ;->ᩳ֫:J

    .line 411
    iput-object v4, v1, Ll/᩻۬ᩳ;->ܿ֫:Ll/ܺۙᩳ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 412
    :try_start_4
    iget-object v4, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object v0, v0, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v7, v0, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v0, v0, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v4, v7, v0}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    cmp-long v0, v5, v2

    if-eqz v0, :cond_0

    .line 413
    :try_start_5
    invoke-direct {v1, v5, v6}, Ll/᩻۬ᩳ;->᩷(J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 416
    :cond_0
    monitor-exit v13

    return-void

    :catchall_0
    move-exception v0

    cmp-long v4, v5, v2

    if-eqz v4, :cond_1

    .line 413
    :try_start_6
    invoke-direct {v1, v5, v6}, Ll/᩻۬ᩳ;->᩷(J)V

    :cond_1
    throw v0

    :catchall_1
    move-exception v0

    .line 409
    iget-wide v5, v1, Ll/᩻۬ᩳ;->ܽ֫:J

    .line 410
    iput-wide v2, v1, Ll/᩻۬ᩳ;->ܽ֫:J

    iput-wide v2, v1, Ll/᩻۬ᩳ;->ᩳ֫:J

    .line 411
    iput-object v4, v1, Ll/᩻۬ᩳ;->ܿ֫:Ll/ܺۙᩳ;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 412
    :try_start_7
    iget-object v4, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object v7, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v7, v7, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v8, v7, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v7, v7, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v4, v8, v7}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    cmp-long v4, v5, v2

    if-eqz v4, :cond_2

    .line 413
    :try_start_8
    invoke-direct {v1, v5, v6}, Ll/᩻۬ᩳ;->᩷(J)V

    .line 414
    :cond_2
    throw v0

    :catchall_2
    move-exception v0

    cmp-long v4, v5, v2

    if-eqz v4, :cond_3

    .line 413
    invoke-direct {v1, v5, v6}, Ll/᩻۬ᩳ;->᩷(J)V

    :cond_3
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    :catchall_3
    move-exception v0

    move-object v5, v0

    .line 406
    :try_start_9
    iget-object v0, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v0, v0, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v6, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object v7, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-wide v7, v7, Ll/ۖۙᩳ;->ܽ:J

    invoke-virtual/range {p0 .. p0}, Ll/᩻۬ᩳ;->᩶()Z

    move-result v9

    invoke-virtual {v0, v6, v7, v8, v9}, Ll/ۢ۬ᩳ;->֫(Ll/ܳۙᩳ;JZ)Ll/ۢ۬ᩳ;

    move-result-object v15

    .line 407
    new-instance v0, Ll/ۖۙᩳ;

    iget-object v6, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v6, v6, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    iget-object v7, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-wide v7, v7, Ll/ۖۙᩳ;->֫:J

    iget-object v9, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-wide v9, v9, Ll/ۖۙᩳ;->ᩳ:J

    iget-object v11, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-wide v11, v11, Ll/ۖۙᩳ;->ܽ:J

    move-object v14, v0

    move-object/from16 v16, v6

    move-wide/from16 v17, v7

    move-wide/from16 v19, v9

    move-wide/from16 v21, v11

    invoke-direct/range {v14 .. v22}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    iput-object v0, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 409
    :try_start_a
    iget-wide v6, v1, Ll/᩻۬ᩳ;->ܽ֫:J

    .line 410
    iput-wide v2, v1, Ll/᩻۬ᩳ;->ܽ֫:J

    iput-wide v2, v1, Ll/᩻۬ᩳ;->ᩳ֫:J

    .line 411
    iput-object v4, v1, Ll/᩻۬ᩳ;->ܿ֫:Ll/ܺۙᩳ;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 412
    :try_start_b
    iget-object v0, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object v4, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v4, v4, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v4, v4, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v8, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v8, v8, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v8, v8, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v0, v4, v8}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    cmp-long v0, v6, v2

    if-eqz v0, :cond_4

    .line 413
    :try_start_c
    invoke-direct {v1, v6, v7}, Ll/᩻۬ᩳ;->᩷(J)V

    .line 415
    :cond_4
    throw v5

    :catchall_4
    move-exception v0

    cmp-long v4, v6, v2

    if-eqz v4, :cond_5

    .line 413
    invoke-direct {v1, v6, v7}, Ll/᩻۬ᩳ;->᩷(J)V

    :cond_5
    throw v0

    :catchall_5
    move-exception v0

    .line 409
    iget-wide v5, v1, Ll/᩻۬ᩳ;->ܽ֫:J

    .line 410
    iput-wide v2, v1, Ll/᩻۬ᩳ;->ܽ֫:J

    iput-wide v2, v1, Ll/᩻۬ᩳ;->ᩳ֫:J

    .line 411
    iput-object v4, v1, Ll/᩻۬ᩳ;->ܿ֫:Ll/ܺۙᩳ;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 412
    :try_start_d
    iget-object v4, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object v7, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v7, v7, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v8, v7, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v7, v7, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v4, v8, v7}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    cmp-long v4, v5, v2

    if-eqz v4, :cond_6

    .line 413
    :try_start_e
    invoke-direct {v1, v5, v6}, Ll/᩻۬ᩳ;->᩷(J)V

    .line 414
    :cond_6
    throw v0

    :catchall_6
    move-exception v0

    cmp-long v4, v5, v2

    if-eqz v4, :cond_7

    .line 413
    invoke-direct {v1, v5, v6}, Ll/᩻۬ᩳ;->᩷(J)V

    :cond_7
    throw v0

    :catchall_7
    move-exception v0

    monitor-exit v13
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    throw v0
.end method

.method public final declared-synchronized ֫(Ll/֡ۗᩳ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 357
    :try_start_0
    iget-object v1, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    if-ne v1, p1, :cond_0

    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 358
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/֡ۗᩳ;Ll/֡ۙᩳ;Ll/᩵ۙᩳ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 361
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 362
    iget-object v1, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v1, p1, :cond_0

    monitor-exit v0

    return-void

    .line 363
    :cond_0
    :try_start_1
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 364
    iget-object v1, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    invoke-virtual {v1, p2, p3}, Ll/ۚۙᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;)Ll/ۚۙᩳ;

    move-result-object p2

    iput-object p2, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    .line 365
    iput-object p2, p1, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    const/4 p1, 0x0

    .line 366
    iput-object p1, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    const-wide/16 p1, 0x1

    .line 367
    invoke-direct {p0, p1, p2}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 368
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/֡ۗᩳ;Ll/ۚۙᩳ;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 258
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 259
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 260
    iget-object v1, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    if-nez v1, :cond_3

    if-eqz p2, :cond_1

    .line 262
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۖ᩹ᩳ;->length()I

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    invoke-virtual {v1}, Ll/ۚۙᩳ;->ۡ()Ll/ۜ۬ᩳ;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v1, v1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    invoke-virtual {v1}, Ll/ۢ۬ᩳ;->֫()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v1, v1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    .line 21
    iget-object v1, v1, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v1}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 265
    iput-object p2, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    goto :goto_0

    .line 263
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Initial text loading requires an empty session"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 267
    :cond_1
    iget-object p2, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    invoke-virtual {p2}, Ll/ۚۙᩳ;->ܿ()Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    invoke-virtual {p2}, Ll/ۚۙᩳ;->ۡ()Ll/ۜ۬ᩳ;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 268
    iget-object p2, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    sget-object v1, Ll/֡ۙᩳ;->۬:Ll/֡ۙᩳ;

    sget-object v2, Ll/᩵ۙᩳ;->ۗ:Ll/᩵ۙᩳ;

    invoke-virtual {p2, v1, v2}, Ll/ۚۙᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;)Ll/ۚۙᩳ;

    move-result-object p2

    iput-object p2, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    .line 270
    :goto_0
    iput-object p1, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    .line 271
    iget-object p2, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    iput-object p2, p1, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    const-wide/16 p1, 0x1

    .line 272
    invoke-direct {p0, p1, p2}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 273
    monitor-exit v0

    return-void

    .line 267
    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No incomplete text source to resume"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 260
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Text loader is already active"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 267
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۗ᩸ᩳ;)V
    .locals 3

    .line 432
    sget-object v1, Ll/ܰ᩶ᩳ;->۫:Ll/ܰ᩶ᩳ;

    move-object v0, p0

    .line 0
    monitor-enter v0

    const/4 v2, 0x0

    .line 437
    :try_start_0
    invoke-direct {p0, v1, p1, v2}, Ll/᩻۬ᩳ;->֫(Ll/ܰ᩶ᩳ;Ljava/util/function/Consumer;Ll/ۧۙᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 438
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ۧۙᩳ;Ll/ۙ᩸ᩳ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 443
    :try_start_0
    iget-object v1, p0, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ll/ܽۙᩳ;->ܽ:Ll/ۧۙᩳ;

    if-ne v1, p1, :cond_0

    iget-boolean v1, p1, Ll/ۧۙᩳ;->֫:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 446
    iput-boolean v1, p1, Ll/ۧۙᩳ;->֫:Z

    .line 447
    sget-object v1, Ll/ܰ᩶ᩳ;->۫:Ll/ܰ᩶ᩳ;

    invoke-direct {p0, v1, p2, p1}, Ll/᩻۬ᩳ;->֫(Ll/ܰ᩶ᩳ;Ljava/util/function/Consumer;Ll/ۧۙᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 448
    monitor-exit v0

    return-void

    .line 444
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "History replay step is not active"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ܳ۬ᩳ;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v16, p0

    .line 1
    monitor-enter v16

    .line 856
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    invoke-direct/range {p0 .. p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 857
    iget-object v0, v1, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    if-nez v0, :cond_1

    iget-boolean v0, v1, Ll/᩻۬ᩳ;->ܰ:Z

    if-nez v0, :cond_1

    move-object/from16 v17, p1

    .line 858
    monitor-enter v17
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 859
    :try_start_1
    invoke-static/range {p1 .. p1}, Ll/ܳ۬ᩳ;->֫(Ll/ܳ۬ᩳ;)Ll/ܶۙᩳ;

    move-result-object v0

    .line 860
    new-instance v2, Ll/֫ۗᩳ;

    iget-object v3, v0, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v3}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v3

    iget-object v3, v3, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget-object v4, v1, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;

    sget-object v5, Ll/᩷ۗᩳ;->֫:Ll/᩷ۗᩳ;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Ll/֫ۗᩳ;-><init>(Ll/᩸۬ᩳ;Ll/᩸۬ᩳ;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 862
    :try_start_2
    invoke-virtual {v2, v0}, Ll/֫ۗᩳ;->֫(Ll/ܶۙᩳ;)Ll/ܶۙᩳ;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 863
    :try_start_3
    new-instance v4, Ll/ۖ᩹ᩳ;

    iget-object v0, v3, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v0}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    iget-object v5, v3, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v5}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v5

    invoke-direct {v4, v0, v5, v6}, Ll/ۖ᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V

    .line 864
    new-instance v5, Ll/ܳۙᩳ;

    invoke-direct {v5}, Ll/ܳۙᩳ;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 868
    :try_start_4
    iget-object v0, v3, Ll/ܶۙᩳ;->᩸:Ll/ۖۙᩳ;

    .line 870
    new-instance v15, Ll/ۖۙᩳ;

    iget-object v6, v0, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-wide v7, v0, Ll/ۖۙᩳ;->ܽ:J

    invoke-virtual/range {p0 .. p0}, Ll/᩻۬ᩳ;->᩶()Z

    move-result v9

    invoke-virtual {v6, v5, v7, v8, v9}, Ll/ۢ۬ᩳ;->֫(Ll/ܳۙᩳ;JZ)Ll/ۢ۬ᩳ;

    move-result-object v7

    iget-object v8, v0, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    iget-wide v9, v0, Ll/ۖۙᩳ;->֫:J

    iget-wide v11, v0, Ll/ۖۙᩳ;->ᩳ:J

    iget-wide v13, v0, Ll/ۖۙᩳ;->ܽ:J

    move-object v6, v15

    invoke-direct/range {v6 .. v14}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    .line 872
    iget-object v0, v1, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    :goto_0
    iget-object v6, v3, Ll/ܶۙᩳ;->ۙ:Ll/ۖۗᩳ;

    iget-object v6, v6, Ll/ۖۗᩳ;->᩸:[B

    invoke-static {v0, v6}, Ll/ۖۗᩳ;->֫(Ll/֨۬ᩳ;[B)Ll/ۖۗᩳ;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 874
    :try_start_5
    iget-object v6, v1, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    .line 875
    iget-object v7, v1, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    .line 876
    iget-object v8, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    .line 877
    iget-object v9, v1, Ll/᩻۬ᩳ;->ۨ:Ljava/lang/Object;

    move-object/from16 v18, v9

    monitor-enter v18
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    iput-object v4, v1, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    monitor-exit v18
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 878
    :try_start_7
    iput-object v0, v1, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    .line 879
    iput-object v15, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    .line 880
    iget-object v0, v3, Ll/ܶۙᩳ;->᩹:Ll/ۚۙᩳ;

    iput-object v0, v1, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    .line 881
    iput-object v5, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 882
    :try_start_8
    invoke-virtual {v4}, Ll/ۖ᩹ᩳ;->length()I

    move-result v0

    const/4 v4, 0x1

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-long v4, v0

    invoke-direct {v1, v4, v5}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 883
    :try_start_9
    invoke-virtual {v6}, Ll/ۖ᩹ᩳ;->close()V

    invoke-virtual {v7}, Ll/ۖۗᩳ;->close()V

    invoke-virtual {v8}, Ll/ܳۙᩳ;->ۧ()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 884
    :try_start_a
    invoke-virtual {v3}, Ll/ܶۙᩳ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :try_start_b
    invoke-virtual {v2}, Ll/֫ۗᩳ;->close()V

    .line 885
    monitor-exit v17
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 886
    monitor-exit v16

    return-void

    :catchall_0
    move-exception v0

    .line 883
    :try_start_c
    invoke-virtual {v6}, Ll/ۖ᩹ᩳ;->close()V

    invoke-virtual {v7}, Ll/ۖۗᩳ;->close()V

    invoke-virtual {v8}, Ll/ܳۙᩳ;->ۧ()V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :catchall_1
    move-exception v0

    .line 877
    :try_start_d
    monitor-exit v18
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :try_start_e
    throw v0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    .line 873
    :goto_1
    invoke-virtual {v4}, Ll/ۖ᩹ᩳ;->close()V

    invoke-virtual {v5}, Ll/ܳۙᩳ;->ۧ()V

    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    :catchall_2
    move-exception v0

    move-object v4, v0

    .line 860
    :try_start_f
    invoke-virtual {v3}, Ll/ܶۙᩳ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object v3, v0

    :try_start_10
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v4
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :catchall_4
    move-exception v0

    move-object v3, v0

    :try_start_11
    invoke-virtual {v2}, Ll/֫ۗᩳ;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v0

    move-object v2, v0

    :try_start_12
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v3

    :catchall_6
    move-exception v0

    .line 885
    monitor-exit v17
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    :try_start_13
    throw v0

    .line 857
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot replace active loading or checkpoint session"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_7
    move-exception v0

    monitor-exit v16
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    throw v0
.end method

.method public final declared-synchronized ֫(Ll/ᩳ۬ᩳ;)V
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 301
    :try_start_0
    iget-object v1, p0, Ll/᩻۬ᩳ;->᩻֫:Ll/ᩳ۬ᩳ;

    if-ne v1, p1, :cond_1

    iget-boolean v1, p1, Ll/ᩳ۬ᩳ;->ۧ:Z

    if-nez v1, :cond_1

    .line 302
    iget-object v3, p1, Ll/ᩳ۬ᩳ;->ܿ:Ll/֡ۗᩳ;

    iget-object v4, p1, Ll/ᩳ۬ᩳ;->֫:[C

    iget v5, p1, Ll/ᩳ۬ᩳ;->ᩳ:I

    iget-object v6, p1, Ll/ᩳ۬ᩳ;->ܳ:Ll/ۚۙᩳ;

    iget v7, p1, Ll/ᩳ۬ᩳ;->ܽ:I

    move-object v2, p0

    move-object v8, p1

    invoke-direct/range {v2 .. v8}, Ll/᩻۬ᩳ;->֫(Ll/֡ۗᩳ;[CILl/ۚۙᩳ;ILl/ᩳ۬ᩳ;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 305
    monitor-exit v0

    return-void

    .line 303
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Text load publication was invalidated"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 301
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Text load publication is not active"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Z)V
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v15, p0

    .line 3
    monitor-enter v15

    .line 630
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 625
    iget-object v0, v1, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    if-nez v0, :cond_4

    iget-boolean v0, v1, Ll/᩻۬ᩳ;->۟:Z

    if-nez v0, :cond_4

    iget-object v0, v1, Ll/᩻۬ᩳ;->᩻֫:Ll/ᩳ۬ᩳ;

    if-nez v0, :cond_4

    .line 632
    iget-object v0, v1, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 633
    :try_start_1
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v0

    .line 634
    iget v3, v0, Ll/ۨ᩹ᩳ;->֫:I

    iget v4, v0, Ll/ۨ᩹ᩳ;->ۧ:I

    iget-object v0, v0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    invoke-static {v3, v4, v0}, Ll/ۨ᩹ᩳ;->֫(IILl/᩸۬ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v13

    .line 635
    new-instance v0, Ll/᩺᩶ᩳ;

    iget-object v3, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v3, v3, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    invoke-virtual {v3}, Ll/ۚۗᩳ;->ܽ()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    iget-object v3, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-wide v9, v3, Ll/ۖۙᩳ;->֫:J

    iget-object v11, v3, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    move-object v5, v0

    move-wide v7, v9

    move-object v12, v13

    invoke-direct/range {v5 .. v13}, Ll/᩺᩶ᩳ;-><init>(IJJLl/ۚۗᩳ;Ll/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;)V

    .line 637
    iget-wide v3, v1, Ll/᩻۬ᩳ;->ᩳ֫:J

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x1

    cmp-long v9, v3, v5

    if-eqz v9, :cond_2

    .line 638
    iget-object v3, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v3, v3, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    invoke-virtual {v3}, Ll/ۢ۬ᩳ;->ۧ()Ll/ۡ۬ᩳ;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 639
    iget-wide v3, v3, Ll/ۡ۬ᩳ;->ۧ:J

    iget-wide v5, v1, Ll/᩻۬ᩳ;->ᩳ֫:J

    cmp-long v9, v3, v5

    if-eqz v9, :cond_0

    goto :goto_0

    .line 643
    :cond_0
    iget-object v3, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v3, v3, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    new-instance v4, Ll/ܺۙᩳ;

    invoke-direct {v4}, Ll/ܺۙᩳ;-><init>()V

    invoke-virtual {v4, v0}, Ll/ܺۙᩳ;->֫(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Ll/᩻۬ᩳ;->֫(Ll/ۢ۬ᩳ;Ll/ܺۙᩳ;)Ll/ۢ۬ᩳ;

    move-result-object v0

    .line 644
    new-instance v3, Ll/ۖۙᩳ;

    iget-object v4, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v5, v4, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    iget-wide v9, v4, Ll/ۖۙᩳ;->֫:J

    iget-wide v11, v4, Ll/ۖۙᩳ;->ᩳ:J

    iget-wide v13, v4, Ll/ۖۙᩳ;->ܽ:J

    move-object/from16 v16, v3

    move-object/from16 v17, v0

    move-object/from16 v18, v5

    move-wide/from16 v19, v9

    move-wide/from16 v21, v11

    move-wide/from16 v23, v13

    invoke-direct/range {v16 .. v24}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    iput-object v3, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    .line 645
    iget-object v3, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object v4, v0, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v0, v0, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v3, v4, v0}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V

    .line 646
    invoke-direct {v1, v7, v8}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 653
    :try_start_2
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 647
    monitor-exit v15

    return-void

    .line 640
    :cond_1
    :goto_0
    :try_start_3
    iget-object v3, v1, Ll/᩻۬ᩳ;->ܿ֫:Ll/ܺۙᩳ;

    invoke-virtual {v3, v0}, Ll/ܺۙᩳ;->֫(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v0

    iput-object v0, v1, Ll/᩻۬ᩳ;->ܿ֫:Ll/ܺۙᩳ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 653
    :try_start_4
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 641
    monitor-exit v15

    return-void

    :cond_2
    if-eqz p1, :cond_3

    .line 649
    :try_start_5
    iget-object v3, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v3, v3, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    .line 25
    new-instance v4, Ll/ۢ۬ᩳ;

    iget-object v10, v3, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v11, v3, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    iget-wide v12, v3, Ll/ۢ۬ᩳ;->ۧ:J

    const/4 v14, 0x1

    move-object v9, v4

    invoke-direct/range {v9 .. v14}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V

    goto :goto_1

    .line 649
    :cond_3
    iget-object v3, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v4, v3, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    .line 650
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v4, v0, v5, v6}, Ll/ۢ۬ᩳ;->֫(Ll/᩺᩶ᩳ;J)Ll/ۢ۬ᩳ;

    move-result-object v0

    iget-object v3, v1, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    iget-object v4, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-wide v4, v4, Ll/ۖۙᩳ;->ܽ:J

    invoke-virtual/range {p0 .. p0}, Ll/᩻۬ᩳ;->᩶()Z

    move-result v6

    invoke-virtual {v0, v3, v4, v5, v6}, Ll/ۢ۬ᩳ;->֫(Ll/ܳۙᩳ;JZ)Ll/ۢ۬ᩳ;

    move-result-object v17

    .line 651
    new-instance v0, Ll/ۖۙᩳ;

    iget-object v3, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v4, v3, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    iget-wide v5, v3, Ll/ۖۙᩳ;->֫:J

    iget-wide v9, v3, Ll/ۖۙᩳ;->ᩳ:J

    iget-wide v11, v3, Ll/ۖۙᩳ;->ܽ:J

    move-object/from16 v16, v0

    move-object/from16 v18, v4

    move-wide/from16 v19, v5

    move-wide/from16 v21, v9

    move-wide/from16 v23, v11

    invoke-direct/range {v16 .. v24}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    iput-object v0, v1, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    .line 652
    invoke-direct {v1, v7, v8}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 653
    :try_start_6
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 654
    monitor-exit v15

    return-void

    :catchall_0
    move-exception v0

    move-object v3, v0

    .line 632
    :try_start_7
    invoke-virtual {v2}, Ll/۬᩹ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_8
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v3

    .line 625
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Operation is unavailable during editable history replay"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    .line 632
    monitor-exit v15
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v0
.end method

.method public final declared-synchronized ֫(Ll/֡ۗᩳ;[CILl/ۚۙᩳ;I)Z
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 278
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    .line 279
    invoke-direct/range {v1 .. v7}, Ll/᩻۬ᩳ;->֫(Ll/֡ۗᩳ;[CILl/ۚۙᩳ;ILl/ᩳ۬ᩳ;)Z

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

.method public final declared-synchronized ֫(Ll/֨ۙᩳ;Ll/֡ۗᩳ;[CILl/ۚۙᩳ;I)Z
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 286
    :try_start_0
    iget-object v1, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    const/4 v2, 0x0

    if-ne v1, p2, :cond_3

    invoke-virtual {p2}, Ll/֡ۗᩳ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 287
    :cond_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 288
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 289
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۖ᩹ᩳ;->length()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    int-to-long v3, v1

    int-to-long v5, p4

    add-long/2addr v3, v5

    int-to-long v5, p6

    cmp-long v1, v3, v5

    if-lez v1, :cond_1

    monitor-exit v0

    return v2

    .line 290
    :cond_1
    :try_start_1
    new-instance v1, Ll/ᩳ۬ᩳ;

    move-object v3, v1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move-object v7, p5

    move v8, p6

    invoke-direct/range {v3 .. v8}, Ll/ᩳ۬ᩳ;-><init>(Ll/֡ۗᩳ;[CILl/ۚۙᩳ;I)V

    .line 291
    iput-object v1, p0, Ll/᩻۬ᩳ;->᩻֫:Ll/ᩳ۬ᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 p2, 0x0

    if-nez p4, :cond_2

    .line 293
    :try_start_2
    invoke-virtual {p0, v1}, Ll/᩻۬ᩳ;->֫(Ll/ᩳ۬ᩳ;)V

    goto :goto_0

    .line 294
    :cond_2
    invoke-interface {p1, v1}, Ll/֨ۙᩳ;->֫(Ll/ᩳ۬ᩳ;)V

    .line 295
    :goto_0
    iget-boolean p1, v1, Ll/ᩳ۬ᩳ;->ۧ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 296
    :try_start_3
    iput-object p2, p0, Ll/᩻۬ᩳ;->᩻֫:Ll/ᩳ۬ᩳ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 295
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 296
    :try_start_4
    iput-object p2, p0, Ll/᩻۬ᩳ;->᩻֫:Ll/ᩳ۬ᩳ;

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 286
    :cond_3
    :goto_1
    monitor-exit v0

    return v2

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method public final ֫(Ll/۫᩹ᩳ;)Z
    .locals 2

    .line 227
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۨ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v1, p1}, Ll/ۖ᩹ᩳ;->֫(Ll/۫᩹ᩳ;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۖ()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 214
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۗ()[B
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 384
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    .line 385
    iget-object v1, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    iget-object v1, v1, Ll/ۖۗᩳ;->᩸:[B

    invoke-virtual {v1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۘ()V
    .locals 12

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 669
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 670
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 671
    iget-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v1, v1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    invoke-virtual {v1}, Ll/ۢ۬ᩳ;->֫()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v1, v1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    .line 21
    iget-object v1, v1, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v1}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 671
    monitor-exit v0

    return-void

    .line 672
    :cond_0
    :try_start_1
    new-instance v1, Ll/ۖۙᩳ;

    iget-object v2, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v2, v2, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    new-instance v9, Ll/ۢ۬ᩳ;

    new-instance v4, Ll/ܺۙᩳ;

    invoke-direct {v4}, Ll/ܺۙᩳ;-><init>()V

    new-instance v5, Ll/ܺۙᩳ;

    invoke-direct {v5}, Ll/ܺۙᩳ;-><init>()V

    iget-wide v6, v2, Ll/ۢ۬ᩳ;->ۧ:J

    iget-boolean v8, v2, Ll/ۢ۬ᩳ;->֫:Z

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V

    .line 672
    iget-object v2, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v4, v2, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    iget-wide v5, v2, Ll/ۖۙᩳ;->֫:J

    iget-wide v7, v2, Ll/ۖۙᩳ;->ᩳ:J

    iget-wide v10, v2, Ll/ۖۙᩳ;->ܽ:J

    move-object v2, v1

    move-object v3, v9

    move-wide v9, v10

    invoke-direct/range {v2 .. v10}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    iput-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    .line 673
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    invoke-virtual {v1}, Ll/ܳۙᩳ;->ۧ()V

    const-wide/16 v1, 0x1

    .line 674
    invoke-direct {p0, v1, v2}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 675
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

.method public final declared-synchronized ۙ()Ll/ۚۙᩳ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 230
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    iget-object v1, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۜ()Ll/ܶۙᩳ;
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 816
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    .line 817
    iget-boolean v1, p0, Ll/᩻۬ᩳ;->ۢ֫:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    if-nez v1, :cond_2

    iget-boolean v1, p0, Ll/᩻۬ᩳ;->۟:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/᩻۬ᩳ;->᩻֫:Ll/ᩳ۬ᩳ;

    if-nez v1, :cond_2

    .line 809
    iget-boolean v1, p0, Ll/᩻۬ᩳ;->ܰ:Z

    if-eqz v1, :cond_1

    iget-wide v1, p0, Ll/᩻۬ᩳ;->ۙ:J

    iget-wide v3, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    goto :goto_0

    .line 810
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Current session state requires an explicit checkpoint"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 819
    :cond_1
    :goto_0
    new-instance v1, Ll/ܶۙᩳ;

    iget-object v2, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v2}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v3

    iget-object v4, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    iget-object v5, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v6, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    iget-wide v7, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Ll/ܶۙᩳ;-><init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 817
    :cond_2
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot capture session during edit"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۟()Ljava/util/UUID;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 217
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    iget-object v1, p0, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩻۬ᩳ;->ۜ֫:Ljava/util/UUID;

    goto :goto_0

    :cond_0
    iget-object v1, v1, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۤ()Ll/᩸۬ᩳ;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 250
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 251
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 72
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-eqz v1, :cond_0

    .line 253
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩺ۧ()V

    .line 254
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 72
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Operation requires persistent storage"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 254
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۧ(J)Ll/ۗ᩻᩵;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1118
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    .line 1119
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 1120
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-nez v1, :cond_1

    iget-wide v1, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    cmp-long v3, p1, v1

    if-gtz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Revision exceeds current session"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1121
    :cond_1
    :goto_0
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-nez v1, :cond_2

    iget-wide p1, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {v1, p1, p2}, Ll/ۤۙᩳ;->֫(J)Ll/ۗ᩻᩵;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ([B)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 679
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 680
    iget-object v1, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    iget-object v1, v1, Ll/ۖۗᩳ;->᩸:[B

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 681
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    iget-object v1, v1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    :goto_0
    invoke-static {v1, p1}, Ll/ۖۗᩳ;->֫(Ll/֨۬ᩳ;[B)Ll/ۖۗᩳ;

    move-result-object v1

    .line 682
    iget-object v2, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    .line 683
    iput-object v1, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 684
    :try_start_2
    array-length p1, p1

    const/4 v1, 0x1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-long v3, p1

    invoke-direct {p0, v3, v4}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v2}, Ll/ۖۗᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 685
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 684
    :try_start_4
    invoke-virtual {v2}, Ll/ۖۗᩳ;->close()V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public final declared-synchronized ۧ(Z)Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 503
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    .line 505
    iget-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    invoke-static {v1, p1}, Ll/ۜۙᩳ;->֫(Ll/ۖۙᩳ;Z)Ll/ۜۙᩳ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 506
    invoke-virtual {p1}, Ll/ۜۙᩳ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ll/ۜۙᩳ;->֫()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ֫()Ll/۫᩹ᩳ;
    .locals 2

    .line 222
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۨ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۬()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1126
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    .line 1127
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ۤۙᩳ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1128
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܰ()Ll/ۚۗᩳ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 496
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    iget-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v1, v1, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܳ()Ll/۟ۗᩳ;
    .locals 11

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 729
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 730
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 731
    iget-boolean v1, p0, Ll/᩻۬ᩳ;->ܰ:Z

    if-eqz v1, :cond_0

    .line 732
    new-instance v1, Ll/ܶۙᩳ;

    iget-object v2, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v2}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v3

    iget-object v4, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    iget-object v5, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v6, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    iget-wide v7, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    const-wide/16 v9, 0x1

    add-long/2addr v7, v9

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Ll/ܶۙᩳ;-><init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V

    .line 733
    new-instance v8, Ll/۟ۗᩳ;

    iget-object v2, p0, Ll/᩻۬ᩳ;->ۘ֫:Ll/᩸۬ᩳ;

    iget-object v5, v2, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    iget-wide v6, p0, Ll/᩻۬ᩳ;->᩶:J

    move-object v2, v8

    move-object v3, p0

    move-object v4, v1

    invoke-direct/range {v2 .. v7}, Ll/۟ۗᩳ;-><init>(Ll/᩻۬ᩳ;Ll/ܶۙᩳ;Ljava/util/UUID;J)V

    .line 734
    iget-wide v1, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    add-long/2addr v1, v9

    iput-wide v1, p0, Ll/᩻۬ᩳ;->ۖ֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 735
    monitor-exit v0

    return-object v8

    .line 731
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Explicit checkpoints are not enabled"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 735
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܶ()J
    .locals 2

    .line 218
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-nez v0, :cond_0

    iget-wide v0, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Ll/ۤۙᩳ;->ۧ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final declared-synchronized ܽ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 499
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    iget-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v1, v1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    .line 21
    iget-object v1, v1, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v1}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/lit8 v1, v1, 0x1

    .line 499
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩳ(J)V
    .locals 13

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 658
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 659
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    .line 661
    iget-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-wide v2, v1, Ll/ۖۙᩳ;->ܽ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v4, p1, v2

    if-nez v4, :cond_0

    monitor-exit v0

    return-void

    .line 662
    :cond_0
    :try_start_1
    iget-object v1, v1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    iget-object v2, p0, Ll/᩻۬ᩳ;->ۧ֫:Ll/ܳۙᩳ;

    invoke-virtual {p0}, Ll/᩻۬ᩳ;->᩶()Z

    move-result v3

    invoke-virtual {v1, v2, p1, p2, v3}, Ll/ۢ۬ᩳ;->֫(Ll/ܳۙᩳ;JZ)Ll/ۢ۬ᩳ;

    move-result-object v5

    .line 663
    new-instance v1, Ll/ۖۙᩳ;

    iget-object v2, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v6, v2, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    iget-wide v7, v2, Ll/ۖۙᩳ;->֫:J

    iget-wide v9, v2, Ll/ۖۙᩳ;->ᩳ:J

    move-object v4, v1

    move-wide v11, p1

    invoke-direct/range {v4 .. v12}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    iput-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    const-wide/16 p1, 0x1

    .line 664
    invoke-direct {p0, p1, p2}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 665
    monitor-exit v0

    return-void

    .line 660
    :cond_1
    :try_start_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid history budget"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 665
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ᩳ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 498
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    iget-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v1, v1, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    invoke-virtual {v1}, Ll/ۢ۬ᩳ;->֫()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩳ֫()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 72
    :try_start_0
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-eqz v1, :cond_1

    .line 717
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    .line 718
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 719
    iget-boolean v1, p0, Ll/᩻۬ᩳ;->ܰ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 720
    :try_start_1
    iput-boolean v1, p0, Ll/᩻۬ᩳ;->ܰ:Z

    .line 721
    iget-wide v1, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    iput-wide v1, p0, Ll/᩻۬ᩳ;->ۙ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 722
    monitor-exit v0

    return-void

    .line 72
    :cond_1
    :try_start_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Operation requires persistent storage"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 722
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ᩴ()Ll/ۗ᩻᩵;
    .locals 6

    move-object v0, p0

    .line 1153
    monitor-enter v0

    .line 1154
    :try_start_0
    iget-boolean v1, p0, Ll/᩻۬ᩳ;->۬:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/᩻۬ᩳ;->ܺ֫:Ll/ۗ᩻᩵;

    monitor-exit v0

    return-object v1

    .line 1155
    :cond_0
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ll/᩻۬ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 1156
    :cond_1
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۗ:Ll/ۗ᩻᩵;

    if-eqz v1, :cond_2

    monitor-exit v0

    return-object v1

    .line 1157
    :cond_2
    iget-boolean v1, p0, Ll/᩻۬ᩳ;->ۢ֫:Z

    if-nez v1, :cond_a

    iget-object v1, p0, Ll/᩻۬ᩳ;->᩺:Ll/ܽۙᩳ;

    if-nez v1, :cond_a

    iget-boolean v1, p0, Ll/᩻۬ᩳ;->۟:Z

    if-nez v1, :cond_a

    iget-object v1, p0, Ll/᩻۬ᩳ;->᩻֫:Ll/ᩳ۬ᩳ;

    if-nez v1, :cond_a

    iget-wide v1, p0, Ll/᩻۬ᩳ;->ᩳ֫:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_a

    .line 809
    iget-boolean v1, p0, Ll/᩻۬ᩳ;->ܰ:Z

    if-eqz v1, :cond_4

    iget-wide v1, p0, Ll/᩻۬ᩳ;->ۙ:J

    iget-wide v3, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_3

    goto :goto_0

    .line 810
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Current session state requires an explicit checkpoint"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1159
    :cond_4
    :goto_0
    iget-boolean v1, p0, Ll/᩻۬ᩳ;->ܰ:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Stop loading before the final explicit checkpoint"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1160
    :cond_6
    :goto_1
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۤ:Ll/۟ۙᩳ;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ll/۟ۙᩳ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 1161
    new-instance v1, Ll/ۗ᩻᩵;

    invoke-direct {v1}, Ll/ۗ᩻᩵;-><init>()V

    .line 1162
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Recovery generation requires reopening; abandon before recovery"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    .line 1163
    monitor-exit v0

    return-object v1

    .line 372
    :cond_7
    iget-object v1, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    if-eqz v1, :cond_8

    .line 374
    iget-object v2, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    sget-object v3, Ll/֡ۙᩳ;->᩹:Ll/֡ۙᩳ;

    sget-object v4, Ll/᩵ۙᩳ;->ۗ:Ll/᩵ۙᩳ;

    invoke-virtual {v2, v3, v4}, Ll/ۚۙᩳ;->֫(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;)Ll/ۚۙᩳ;

    move-result-object v2

    iput-object v2, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    .line 375
    iput-object v2, v1, Ll/֡ۗᩳ;->᩶:Ll/ۚۙᩳ;

    const/4 v2, 0x0

    .line 376
    iput-object v2, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    const-wide/16 v2, 0x1

    .line 377
    invoke-direct {p0, v2, v3}, Ll/᩻۬ᩳ;->᩻(J)V

    :cond_8
    const/4 v2, 0x1

    .line 1166
    iput-boolean v2, p0, Ll/᩻۬ᩳ;->۫:Z

    .line 1167
    new-instance v2, Ll/ۗ᩻᩵;

    invoke-direct {v2}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v2, p0, Ll/᩻۬ᩳ;->ۗ:Ll/ۗ᩻᩵;

    .line 1168
    iget-wide v3, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    .line 1169
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_9

    .line 1170
    invoke-virtual {v1}, Ll/֡ۗᩳ;->ܽ()V

    .line 1171
    :cond_9
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    invoke-virtual {v0, v3, v4}, Ll/ۤۙᩳ;->֫(J)Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/᩶ۡܳ;

    invoke-direct {v1, p0, v2}, Ll/᩶ۡܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    return-object v2

    .line 1157
    :cond_a
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot close during session edit"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 1169
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩵()Ll/۫᩹ᩳ;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 244
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    .line 245
    iget-object v1, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    invoke-virtual {v1}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 246
    iget-object v1, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 245
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Text loading is incomplete"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 246
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩶()Z
    .locals 1

    .line 69
    iget-object v0, p0, Ll/᩻۬ᩳ;->ۡ֫:Ll/ۤۙᩳ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final declared-synchronized ᩸()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 234
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܺ֫()V

    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 235
    iget-object v1, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    if-nez v1, :cond_0

    .line 236
    sget-object v1, Ll/ۚۙᩳ;->ۡ:Ll/ۚۙᩳ;

    iput-object v1, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    .line 237
    invoke-virtual {p0}, Ll/᩻۬ᩳ;->ۘ()V

    const-wide/16 v1, 0x1

    .line 238
    invoke-direct {p0, v1, v2}, Ll/᩻۬ᩳ;->᩻(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    monitor-exit v0

    return-void

    .line 235
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Text loading is still active"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 239
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩹()J
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 510
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    iget-object v1, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-wide v1, v1, Ll/ۖۙᩳ;->ܽ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩺()J
    .locals 2

    .line 215
    iget-wide v0, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    return-wide v0
.end method

.method public final declared-synchronized ᩻()Ll/ܳ۬ᩳ;
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 824
    :try_start_0
    invoke-direct {p0}, Ll/᩻۬ᩳ;->᩻֫()V

    invoke-direct {p0}, Ll/᩻۬ᩳ;->ܳ֫()V

    .line 825
    iget-boolean v1, p0, Ll/᩻۬ᩳ;->ۢ֫:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩻۬ᩳ;->᩸:Ll/֡ۗᩳ;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    invoke-virtual {v1}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 827
    new-instance v1, Ll/ܳ۬ᩳ;

    new-instance v9, Ll/ܶۙᩳ;

    iget-object v2, p0, Ll/᩻۬ᩳ;->ۛ:Ll/ۖ᩹ᩳ;

    invoke-virtual {v2}, Ll/ۖ᩹ᩳ;->֫()Ll/۫᩹ᩳ;

    move-result-object v3

    iget-object v4, p0, Ll/᩻۬ᩳ;->᩷֫:Ll/ۖۗᩳ;

    iget-object v5, p0, Ll/᩻۬ᩳ;->֫֫:Ll/ۖۙᩳ;

    iget-object v6, p0, Ll/᩻۬ᩳ;->ܳ֫:Ll/ۚۙᩳ;

    iget-wide v7, p0, Ll/᩻۬ᩳ;->ۖ֫:J

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Ll/ܶۙᩳ;-><init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V

    invoke-direct {v1, v9}, Ll/ܳ۬ᩳ;-><init>(Ll/ܶۙᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 826
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot transfer incomplete or editing session"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
