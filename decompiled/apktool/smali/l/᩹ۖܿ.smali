.class public final Ll/᩹ۖܿ;
.super Ljava/lang/Object;
.source "N6VA"


# instance fields
.field public volatile ֡:J

.field public final ֫:Ll/ܿۖ᩷;

.field public ۖ:I

.field public ۘ:I

.field public final ۚ:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public ۜ:J

.field public volatile ۡ:I

.field public ۢ:I

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܳ:Ljava/util/concurrent/Executor;

.field public ܺ:Ljava/util/List;

.field public volatile ܽ:Z

.field public final ܿ:Ll/᩷ۢܿ;

.field public final ᩳ:Ll/ۨۗᩳ;

.field public ᩴ:I

.field public ᩵:Ll/᩸ۖܿ;

.field public volatile ᩷:J

.field public ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/᩷ۢܿ;Ljava/util/concurrent/Executor;Ll/ܿۖ᩷;Ll/ۨۗᩳ;)V
    .locals 3

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    .line 33
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Ll/᩹ۖܿ;->ۚ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    const v0, 0x7fffffff

    .line 35
    iput v0, p0, Ll/᩹ۖܿ;->ۡ:I

    const/4 v0, 0x1

    .line 36
    iput v0, p0, Ll/᩹ۖܿ;->ۢ:I

    const/4 v0, -0x1

    .line 38
    iput v0, p0, Ll/᩹ۖܿ;->ۘ:I

    .line 39
    iput v0, p0, Ll/᩹ۖܿ;->ᩴ:I

    const-wide/16 v1, -0x1

    .line 41
    iput-wide v1, p0, Ll/᩹ۖܿ;->֡:J

    .line 42
    iput-wide v1, p0, Ll/᩹ۖܿ;->᩷:J

    .line 44
    iput-wide v1, p0, Ll/᩹ۖܿ;->ۜ:J

    .line 47
    iput v0, p0, Ll/᩹ۖܿ;->ۖ:I

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 48
    iput-object v0, p0, Ll/᩹ۖܿ;->ܺ:Ljava/util/List;

    .line 63
    iput-object p1, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    .line 64
    iput-object p2, p0, Ll/᩹ۖܿ;->ܳ:Ljava/util/concurrent/Executor;

    .line 65
    iput-object p3, p0, Ll/᩹ۖܿ;->֫:Ll/ܿۖ᩷;

    .line 66
    iput-object p4, p0, Ll/᩹ۖܿ;->ᩳ:Ll/ۨۗᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ۖܿ;)Ll/ܿۖ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۖܿ;->֫:Ll/ܿۖ᩷;

    return-object p0
.end method

.method private ֫(J)V
    .locals 11

    const/16 v1, 0x20

    ushr-long v2, p1, v1

    long-to-int v0, v2

    long-to-int p2, p1

    if-ltz v0, :cond_2

    if-ge v0, p2, :cond_2

    .line 163
    iget-object p1, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget p1, p1, Ll/᩷ۢܿ;->ܿ:I

    if-le p2, p1, :cond_0

    goto :goto_0

    :cond_0
    int-to-long p1, p2

    int-to-long v2, v0

    const-wide/32 v4, 0x10000

    add-long/2addr v2, v4

    .line 164
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    const/high16 p1, 0x10000

    sub-int v2, p2, v0

    sub-int/2addr p1, v2

    .line 165
    div-int/lit8 p1, p1, 0x2

    const/16 v2, 0x2710

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 166
    div-int/lit8 v2, p1, 0x2

    sub-int v3, v0, v2

    const/4 v4, 0x0

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 167
    iget-object v5, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget v5, v5, Ll/᩷ۢܿ;->ܿ:I

    int-to-long v5, v5

    int-to-long v7, p2

    int-to-long v9, v2

    add-long/2addr v9, v7

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int p2, v5

    .line 168
    iget-wide v5, p0, Ll/᩹ۖܿ;->֡:J

    const-wide/16 v9, -0x1

    cmp-long v2, v5, v9

    if-eqz v2, :cond_1

    ushr-long v9, v5, v1

    long-to-int v2, v9

    if-gt v2, v3, :cond_1

    long-to-int v2, v5

    if-gt p2, v2, :cond_1

    goto :goto_0

    :cond_1
    sub-int/2addr v0, p1

    .line 170
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 171
    iget-object v0, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget v0, v0, Ll/᩷ۢܿ;->ܿ:I

    int-to-long v2, v0

    int-to-long v4, p1

    add-long/2addr v7, v4

    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p1, v2

    .line 172
    iget-object v0, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    monitor-enter v0

    int-to-long v2, p2

    shl-long v1, v2, v1

    int-to-long p1, p1

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    or-long/2addr p1, v1

    .line 173
    :try_start_0
    iput-wide p1, p0, Ll/᩹ۖܿ;->֡:J

    const/4 p1, 0x0

    .line 174
    iput-object p1, p0, Ll/᩹ۖܿ;->᩻:Ljava/util/List;

    .line 175
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method private ֫(Ljava/util/List;JLl/ܿۖ᩷;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    move-object/from16 v4, p4

    .line 180
    iget-object v5, v1, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    move-object/from16 v16, v5

    monitor-enter v16

    .line 181
    :try_start_0
    iget-boolean v5, v1, Ll/᩹ۖܿ;->ܽ:Z

    if-nez v5, :cond_13

    iget-wide v5, v1, Ll/᩹ۖܿ;->֡:J

    cmp-long v7, v5, v2

    if-nez v7, :cond_13

    iget-wide v5, v1, Ll/᩹ۖܿ;->ۜ:J

    cmp-long v7, v5, v2

    if-nez v7, :cond_0

    iget-object v5, v1, Ll/᩹ۖܿ;->᩻:Ljava/util/List;

    if-ne v5, v0, :cond_0

    goto/16 :goto_7

    .line 183
    :cond_0
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 184
    iget-object v5, v1, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object v5, v5, Ll/᩷ۢܿ;->ܽ:Ll/᩺ܺܿ;

    const/16 v6, 0x20

    ushr-long v6, v2, v6

    long-to-int v7, v6

    long-to-int v6, v2

    .line 23
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_1

    goto/16 :goto_5

    :cond_1
    const/4 v8, 0x0

    .line 24
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܶۖܿ;

    iget v9, v9, Ll/ܶۖܿ;->ܿ:I

    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    const/4 v9, 0x1

    .line 0
    invoke-static {v9, v0}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v9

    .line 25
    check-cast v9, Ll/ܶۖܿ;

    iget v9, v9, Ll/ܶۖܿ;->ܽ:I

    invoke-static {v6, v9}, Ljava/lang/Math;->min(II)I

    move-result v6

    int-to-long v9, v6

    int-to-long v11, v7

    const-wide/32 v13, 0x10000

    add-long/2addr v11, v13

    .line 26
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    long-to-int v6, v9

    if-lt v7, v6, :cond_2

    goto/16 :goto_5

    :cond_2
    sub-int v9, v6, v7

    .line 28
    iget-object v10, v5, Ll/᩺ܺܿ;->ܿ:Ll/᩸᩷ܿ;

    invoke-static {v9, v10, v8}, Ll/ۢۖܿ;->֫(ILl/᩸᩷ܿ;Z)Ll/ۢۖܿ;

    move-result-object v8

    .line 29
    invoke-virtual {v5}, Ll/᩺ܺܿ;->᩻()Z

    move-result v9

    if-eqz v9, :cond_3

    const/4 v9, 0x0

    goto :goto_0

    .line 30
    :cond_3
    new-instance v9, Ll/ۤۖܿ;

    iget-object v10, v5, Ll/᩺ܺܿ;->ܿ:Ll/᩸᩷ܿ;

    invoke-direct {v9, v8, v10, v7}, Ll/ۤۖܿ;-><init>(Ll/ۢۖܿ;Ll/᩸᩷ܿ;I)V

    .line 32
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v10

    .line 33
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    const/4 v13, 0x0

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ܶۖܿ;

    .line 34
    invoke-virtual {v5}, Ll/᩺ܺܿ;->᩻()Z

    move-result v15

    if-eqz v15, :cond_5

    .line 35
    iget v15, v14, Ll/ܶۖܿ;->ܿ:I

    invoke-static {v7, v15}, Ljava/lang/Math;->max(II)I

    move-result v15

    move-object/from16 v16, v5

    .line 36
    iget v5, v14, Ll/ܶۖܿ;->ܽ:I

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    if-ge v15, v5, :cond_4

    move/from16 v17, v6

    sub-int v6, v15, v7

    move-object/from16 v18, v12

    sub-int v12, v5, v7

    move/from16 v19, v13

    .line 37
    iget-object v13, v14, Ll/ܶۖܿ;->ܳ:Ll/ۢۖܿ;

    iget v14, v14, Ll/ܶۖܿ;->ܿ:I

    sub-int/2addr v15, v14

    sub-int/2addr v5, v14

    .line 38
    invoke-virtual {v13, v15, v5}, Ll/ۢۖܿ;->ۧ(II)Ll/ۢۖܿ;

    move-result-object v5

    .line 37
    invoke-virtual {v8, v6, v12, v5}, Ll/ۢۖܿ;->֫(IILl/ۢۖܿ;)Ll/ۢۖܿ;

    move-result-object v5

    move-object v8, v5

    move/from16 v13, v19

    goto :goto_3

    :cond_4
    move/from16 v17, v6

    move-object/from16 v18, v12

    move/from16 v19, v13

    goto :goto_3

    :cond_5
    move-object/from16 v16, v5

    move/from16 v17, v6

    move-object/from16 v18, v12

    move/from16 v19, v13

    .line 40
    iget-object v5, v14, Ll/ܶۖܿ;->᩻:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛۖܿ;

    .line 41
    invoke-virtual {v9, v6}, Ll/ۤۖܿ;->֫(Ll/ۛۖܿ;)Ll/۬ۖܿ;

    move-result-object v6

    :cond_7
    add-int/lit8 v13, v13, 0x1

    const/high16 v12, 0x10000

    if-gt v13, v12, :cond_e

    and-int/lit16 v12, v13, 0xff

    if-nez v12, :cond_8

    .line 45
    invoke-static {v1, v4, v2, v3}, Ll/᩹ۖܿ;->֫(Ll/᩹ۖܿ;Ll/ܿۖ᩷;J)Z

    move-result v12

    if-nez v12, :cond_e

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v14

    sub-long/2addr v14, v10

    const-wide/32 v19, 0x7a1200

    cmp-long v12, v14, v19

    if-lez v12, :cond_8

    goto :goto_5

    :cond_8
    if-eqz v6, :cond_9

    .line 46
    invoke-virtual {v6}, Ll/۬ۖܿ;->֫()Z

    move-result v12

    if-eqz v12, :cond_7

    :cond_9
    if-eqz v6, :cond_6

    .line 47
    invoke-virtual {v9, v6}, Ll/ۤۖܿ;->֫(Ll/۬ۖܿ;)V

    goto :goto_2

    :cond_a
    :goto_3
    move-object/from16 v5, v16

    move/from16 v6, v17

    move-object/from16 v12, v18

    goto/16 :goto_1

    :cond_b
    if-eqz v9, :cond_c

    .line 51
    invoke-virtual {v9}, Ll/ۤۖܿ;->֫()Ll/ۢۖܿ;

    move-result-object v8

    .line 52
    :cond_c
    new-instance v5, Ll/ܽۖܿ;

    invoke-direct {v5}, Ll/ܽۖܿ;-><init>()V

    .line 53
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    new-instance v6, Ll/ᩳۖܿ;

    invoke-direct {v6}, Ll/ᩳۖܿ;-><init>()V

    invoke-virtual {v6, v8}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 54
    :goto_4
    invoke-virtual {v6}, Ll/ᩳۖܿ;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_d

    .line 55
    invoke-virtual {v6}, Ll/ᩳۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v8

    .line 57
    new-instance v15, Ll/᩸᩷ܿ;

    invoke-virtual {v8}, Ll/᩸᩷ܿ;->ᩳ()I

    move-result v11

    invoke-virtual {v8}, Ll/᩸᩷ܿ;->᩵()I

    move-result v13

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object v9, v15

    move-object v0, v15

    move v15, v8

    invoke-direct/range {v9 .. v15}, Ll/᩸᩷ܿ;-><init>(Ljava/lang/String;IIIII)V

    .line 58
    invoke-virtual {v6}, Ll/ᩳۖܿ;->֫()I

    move-result v8

    invoke-virtual {v6}, Ll/ᩳۖܿ;->ۧ()I

    move-result v9

    sub-int/2addr v8, v9

    const/4 v9, 0x0

    invoke-virtual {v5, v8, v0, v9}, Ll/ܽۖܿ;->֫(ILl/᩸᩷ܿ;Z)V

    move-object/from16 v0, p1

    goto :goto_4

    .line 60
    :cond_d
    invoke-static {v1, v4, v2, v3}, Ll/᩹ۖܿ;->֫(Ll/᩹ۖܿ;Ll/ܿۖ᩷;J)Z

    move-result v0

    if-eqz v0, :cond_f

    :cond_e
    :goto_5
    const/4 v0, 0x0

    goto :goto_6

    :cond_f
    new-instance v0, Ll/۬ۢܿ;

    invoke-virtual {v5}, Ll/ܽۖܿ;->֫()Ll/ۢۖܿ;

    move-result-object v5

    invoke-direct {v0, v7, v5}, Ll/۬ۢܿ;-><init>(ILl/ۢۖܿ;)V

    :goto_6
    if-eqz v0, :cond_10

    .line 188
    iput-wide v2, v1, Ll/᩹ۖܿ;->᩷:J

    .line 189
    iget-object v2, v1, Ll/᩹ۖܿ;->᩵:Ll/᩸ۖܿ;

    check-cast v2, Ll/ܶۡܿ;

    .line 230
    iget-object v3, v2, Ll/ܶۡܿ;->֫:Ll/ܽܺܿ;

    iget-object v2, v2, Ll/ܶۡܿ;->ۧ:Ll/ۨۡܿ;

    invoke-static {v3, v2, v0}, Ll/ܽܺܿ;->֫(Ll/ܽܺܿ;Ll/ۨۡܿ;Ll/۬ۢܿ;)V

    return-void

    .line 190
    :cond_10
    invoke-interface/range {p4 .. p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, v1, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    invoke-virtual {v0}, Ll/᩷ۢܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 191
    iget-object v0, v1, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    move-object/from16 v16, v0

    monitor-enter v16

    .line 192
    :try_start_1
    iget-boolean v0, v1, Ll/᩹ۖܿ;->ܽ:Z

    if-nez v0, :cond_11

    iget-wide v4, v1, Ll/᩹ۖܿ;->֡:J

    cmp-long v0, v4, v2

    if-nez v0, :cond_11

    .line 193
    iput-wide v2, v1, Ll/᩹ۖܿ;->ۜ:J

    move-object/from16 v0, p1

    .line 194
    iput-object v0, v1, Ll/᩹ۖܿ;->᩻:Ljava/util/List;

    .line 196
    :cond_11
    monitor-exit v16

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_12
    return-void

    .line 182
    :cond_13
    :goto_7
    :try_start_2
    monitor-exit v16

    return-void

    :catchall_1
    move-exception v0

    .line 183
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public static bridge synthetic ֫(Ll/᩹ۖܿ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹ۖܿ;->ۡ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹ۖܿ;Ljava/util/List;JLl/֨ۖܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩹ۖܿ;->֫(Ljava/util/List;JLl/ܿۖ᩷;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩹ۖܿ;IILl/۠ۖܿ;)Z
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    iget v0, p3, Ll/۠ۖܿ;->᩸:I

    if-le v0, p1, :cond_0

    goto :goto_0

    .line 87
    :cond_0
    iget-boolean p1, p3, Ll/۠ۖܿ;->۫:Z

    if-eqz p1, :cond_2

    iget p1, p3, Ll/۠ۖܿ;->ۨ:I

    if-gt p1, p2, :cond_2

    if-ge p2, v0, :cond_2

    .line 89
    iget-boolean p1, p3, Ll/۠ۖܿ;->᩶:Z

    if-nez p1, :cond_1

    :goto_0
    const/4 p0, 0x0

    return p0

    .line 90
    :cond_1
    iget p1, p3, Ll/۠ۖܿ;->ۨ:I

    iput p1, p0, Ll/᩹ۖܿ;->ۖ:I

    .line 91
    iget-object p1, p3, Ll/۠ۖܿ;->ۙ:Ljava/util/List;

    iput-object p1, p0, Ll/᩹ۖܿ;->ܺ:Ljava/util/List;

    .line 93
    :cond_2
    invoke-virtual {p3}, Ll/۠ۖܿ;->ۧ()V

    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ll/᩹ۖܿ;ILl/۠ۖܿ;)Z
    .locals 3

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    iget-boolean v0, p2, Ll/۠ۖܿ;->۫:Z

    if-nez v0, :cond_0

    iget v0, p2, Ll/۠ۖܿ;->ۨ:I

    iget-object p0, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object p0, p0, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    .line 29
    iget v1, p0, Ll/᩺᩷ܿ;->֫:I

    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    int-to-long v1, p1

    .line 30
    iget p0, p0, Ll/᩺᩷ܿ;->ۧ:I

    int-to-long p0, p0

    mul-long v1, v1, p0

    long-to-int p0, v1

    if-eq v0, p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 124
    :cond_0
    invoke-virtual {p2}, Ll/۠ۖܿ;->ۧ()V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic ֫(Ll/᩹ۖܿ;Ll/ܿۖ᩷;J)Z
    .locals 1

    .line 186
    iget-boolean v0, p0, Ll/᩹ۖܿ;->ܽ:Z

    if-nez v0, :cond_1

    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    invoke-virtual {p1}, Ll/᩷ۢܿ;->֫()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-wide p0, p0, Ll/᩹ۖܿ;->֡:J

    cmp-long v0, p0, p2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static bridge synthetic ۜ(Ll/᩹ۖܿ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩹ۖܿ;->֡:J

    return-wide v0
.end method

.method public static bridge synthetic ۢ(Ll/᩹ۖܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩹ۖܿ;->ۧ()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩹ۖܿ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ۧ()V
    .locals 1

    .line 234
    :goto_0
    iget-object v0, p0, Ll/᩹ۖܿ;->ۚ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟᩸ᩳ;

    if-eqz v0, :cond_0

    .line 236
    :try_start_0
    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static bridge synthetic ܳ(Ll/᩹ۖܿ;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۖܿ;->ܳ:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩹ۖܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩹ۖܿ;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/᩹ۖܿ;)Ll/᩷ۢܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩹ۖܿ;)Ljava/util/function/LongSupplier;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۖܿ;->ᩳ:Ll/ۨۗᩳ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/᩹ۖܿ;)Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹ۖܿ;->ۚ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/᩹ۖܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩹ۖܿ;->ۡ:I

    return p0
.end method


# virtual methods
.method public final ֫(I)Ll/ܶۖܿ;
    .locals 7

    .line 202
    iget-boolean v0, p0, Ll/᩹ۖܿ;->ܽ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_6

    iget v0, p0, Ll/᩹ۖܿ;->ۡ:I

    if-ge p1, v0, :cond_0

    goto :goto_2

    .line 203
    :cond_0
    iget-object v0, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 206
    :try_start_0
    iget-object v2, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const v3, 0x7fffffff

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ۖܿ;

    .line 207
    iget-boolean v5, v4, Ll/۠ۖܿ;->۫:Z

    if-eqz v5, :cond_2

    goto :goto_0

    .line 208
    :cond_2
    iget-object v4, v4, Ll/۠ۖܿ;->ۙ:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܶۖܿ;

    .line 209
    iget v6, v5, Ll/ܶۖܿ;->ܿ:I

    if-ne v6, p1, :cond_4

    move-object v1, v5

    :cond_4
    if-le v6, p1, :cond_3

    .line 210
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    goto :goto_1

    .line 213
    :cond_5
    iput v3, p0, Ll/᩹ۖܿ;->ۡ:I

    .line 214
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 215
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_6
    :goto_2
    return-object v1
.end method

.method public final ֫()V
    .locals 3

    const/4 v0, 0x1

    .line 220
    iput-boolean v0, p0, Ll/᩹ۖܿ;->ܽ:Z

    .line 221
    iget-object v0, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 222
    :try_start_0
    iget-object v1, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ۖܿ;

    invoke-virtual {v2}, Ll/۠ۖܿ;->ۧ()V

    goto :goto_0

    .line 223
    :cond_0
    iget-object v1, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 0
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 224
    iput-object v1, p0, Ll/᩹ۖܿ;->ܺ:Ljava/util/List;

    const/4 v1, -0x1

    .line 225
    iput v1, p0, Ll/᩹ۖܿ;->ۖ:I

    const/4 v1, 0x0

    .line 226
    iput-object v1, p0, Ll/᩹ۖܿ;->᩻:Ljava/util/List;

    .line 227
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 228
    invoke-direct {p0}, Ll/᩹ۖܿ;->ۧ()V

    return-void

    :catchall_0
    move-exception v1

    .line 227
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(II)V
    .locals 13

    .line 71
    iget-boolean v0, p0, Ll/᩹ۖܿ;->ܽ:Z

    if-nez v0, :cond_12

    iget-object v0, p0, Ll/᩹ۖܿ;->֫:Ll/ܿۖ᩷;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    invoke-virtual {v0}, Ll/᩷ۢܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_8

    .line 75
    :cond_0
    iget-object v0, p0, Ll/᩹ۖܿ;->᩵:Ll/᩸ۖܿ;

    if-nez v0, :cond_1

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_1
    check-cast v0, Ll/ܶۡܿ;

    .line 229
    iget-object v0, v0, Ll/ܶۡܿ;->ۧ:Ll/ۨۡܿ;

    invoke-static {v0}, Ll/ۨۡܿ;->ۖ(Ll/ۨۡܿ;)J

    move-result-wide v0

    .line 76
    :goto_0
    invoke-direct {p0, v0, v1}, Ll/᩹ۖܿ;->֫(J)V

    .line 77
    iget-wide v1, p0, Ll/᩹ۖܿ;->֡:J

    const/16 v0, 0x20

    ushr-long v3, v1, v0

    long-to-int v4, v3

    .line 79
    iget-object v0, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 80
    :try_start_0
    iget v3, p0, Ll/᩹ۖܿ;->ۖ:I

    const/4 v5, -0x1

    if-lt v4, v3, :cond_2

    int-to-long v6, v4

    int-to-long v8, v3

    iget-object v3, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object v3, v3, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    iget v3, v3, Ll/᩺᩷ܿ;->ۧ:I

    int-to-long v10, v3

    add-long/2addr v8, v10

    cmp-long v3, v6, v8

    if-ltz v3, :cond_3

    .line 82
    :cond_2
    iput v5, p0, Ll/᩹ۖܿ;->ۖ:I

    .line 0
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 83
    iput-object v3, p0, Ll/᩹ۖܿ;->ܺ:Ljava/util/List;

    .line 85
    :cond_3
    iget-object v3, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    new-instance v5, Ll/֡ۖܿ;

    invoke-direct {v5, p0, p1, v4}, Ll/֡ۖܿ;-><init>(Ll/᩹ۖܿ;II)V

    invoke-static {v3, v5}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 96
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 97
    invoke-direct {p0}, Ll/᩹ۖܿ;->ۧ()V

    .line 99
    iget-object v0, p0, Ll/᩹ۖܿ;->᩵:Ll/᩸ۖܿ;

    const/4 v3, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v0, :cond_b

    iget-object v0, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object v0, v0, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    iget v7, v0, Ll/᩺᩷ܿ;->ܽ:I

    if-le v7, v6, :cond_b

    iget v7, v0, Ll/᩺᩷ܿ;->֫:I

    if-le v7, v6, :cond_b

    long-to-int v7, v1

    .line 102
    iget v0, v0, Ll/᩺᩷ܿ;->ۧ:I

    div-int v8, v4, v0

    .line 103
    iget-wide v9, p0, Ll/᩹ۖܿ;->᩷:J

    cmp-long v0, v1, v9

    if-eqz v0, :cond_6

    .line 104
    iget-object v9, p0, Ll/᩹ۖܿ;->ܺ:Ljava/util/List;

    .line 105
    iget-object v0, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 106
    :try_start_1
    iget-object v10, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_4
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۠ۖܿ;

    .line 107
    iget-boolean v12, v11, Ll/۠ۖܿ;->۫:Z

    if-eqz v12, :cond_4

    iget v12, v11, Ll/۠ۖܿ;->ۨ:I

    if-gt v12, v4, :cond_4

    iget v12, v11, Ll/۠ۖܿ;->᩸:I

    if-le v12, v4, :cond_4

    .line 108
    iget-object v9, v11, Ll/۠ۖܿ;->ۙ:Ljava/util/List;

    goto :goto_1

    .line 111
    :cond_5
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-interface {v9, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶۖܿ;

    iget v0, v0, Ll/ܶۖܿ;->ܿ:I

    if-gt v0, v4, :cond_6

    .line 0
    invoke-static {v6, v9}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 113
    check-cast v0, Ll/ܶۖܿ;

    iget v0, v0, Ll/ܶۖܿ;->ܽ:I

    if-lt v0, v7, :cond_6

    .line 114
    iget-object v0, p0, Ll/᩹ۖܿ;->֫:Ll/ܿۖ᩷;

    invoke-direct {p0, v9, v1, v2, v0}, Ll/᩹ۖܿ;->֫(Ljava/util/List;JLl/ܿۖ᩷;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    .line 111
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_6
    :goto_2
    if-ge v4, v7, :cond_b

    .line 117
    iget-object v0, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object v0, v0, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    iget v0, v0, Ll/᩺᩷ܿ;->֫:I

    if-ge v8, v0, :cond_b

    iget v0, p0, Ll/᩹ۖܿ;->ۘ:I

    if-ne v8, v0, :cond_7

    iget v0, p0, Ll/᩹ۖܿ;->ᩴ:I

    if-le v7, v0, :cond_b

    .line 120
    :cond_7
    iget-object v0, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    monitor-enter v0

    .line 122
    :try_start_3
    iget-object v1, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    new-instance v2, Ll/ۚۖܿ;

    invoke-direct {v2, p0, v8}, Ll/ۚۖܿ;-><init>(Ll/᩹ۖܿ;I)V

    invoke-static {v1, v2}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 127
    iget-object v1, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object v2, v2, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    iget v2, v2, Ll/᩺᩷ܿ;->ܽ:I

    sub-int/2addr v2, v6

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-lt v1, v2, :cond_8

    .line 128
    iget-object v1, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v6

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ۖܿ;

    .line 129
    invoke-virtual {v1}, Ll/۠ۖܿ;->ۧ()V

    .line 131
    :cond_8
    iget-object v1, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget v1, v1, Ll/᩷ۢܿ;->ܿ:I

    int-to-long v1, v1

    int-to-long v4, v7

    const-wide/16 v9, 0x2710

    add-long/2addr v4, v9

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    .line 132
    new-instance v1, Ll/۠ۖܿ;

    iget-object v4, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object v4, v4, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    .line 29
    iget v5, v4, Ll/᩺᩷ܿ;->֫:I

    invoke-static {v8, v5}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    int-to-long v9, v8

    .line 30
    iget v4, v4, Ll/᩺᩷ܿ;->ۧ:I

    int-to-long v4, v4

    mul-long v9, v9, v4

    long-to-int v4, v9

    .line 132
    iget-object v5, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object v5, v5, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    .line 133
    invoke-virtual {v5, v8}, Ll/᩺᩷ܿ;->֫(I)I

    move-result v5

    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-direct {v1, p0, v4, v5, v2}, Ll/۠ۖܿ;-><init>(Ll/᩹ۖܿ;III)V

    .line 134
    iget v2, v1, Ll/۠ۖܿ;->ۨ:I

    iget v4, v1, Ll/۠ۖܿ;->᩸:I

    if-ge v2, v4, :cond_9

    iget-object v2, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    const/4 v1, 0x0

    .line 136
    :goto_3
    iput v8, p0, Ll/᩹ۖܿ;->ۘ:I

    if-nez v1, :cond_a

    const/4 v2, -0x1

    goto :goto_4

    .line 137
    :cond_a
    iget v2, v1, Ll/۠ۖܿ;->᩸:I

    :goto_4
    iput v2, p0, Ll/᩹ۖܿ;->ᩴ:I

    .line 138
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 139
    invoke-direct {p0}, Ll/᩹ۖܿ;->ۧ()V

    if-eqz v1, :cond_b

    .line 140
    invoke-virtual {v1}, Ll/۠ۖܿ;->ܽ()V

    goto :goto_5

    :catchall_1
    move-exception p1

    .line 138
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1

    .line 143
    :cond_b
    :goto_5
    iget v0, p0, Ll/᩹ۖܿ;->ۢ:I

    iget-object v1, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object v1, v1, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    iget v1, v1, Ll/᩺᩷ܿ;->ۧ:I

    div-int/2addr p1, v1

    add-int/2addr p1, v6

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/᩹ۖܿ;->ۢ:I

    .line 144
    :goto_6
    iget-boolean p1, p0, Ll/᩹ۖܿ;->ܽ:Z

    if-nez p1, :cond_11

    iget p1, p0, Ll/᩹ۖܿ;->ۢ:I

    iget-object v0, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object v0, v0, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    iget v0, v0, Ll/᩺᩷ܿ;->֫:I

    if-ge p1, v0, :cond_11

    .line 146
    iget-object p1, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    move-object v0, p1

    monitor-enter v0

    .line 147
    :try_start_5
    iget-object p1, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget-object v1, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object v1, v1, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    iget v1, v1, Ll/᩺᩷ܿ;->ܽ:I

    sub-int/2addr v1, v6

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-lt p1, v1, :cond_c

    monitor-exit v0

    return-void

    .line 148
    :cond_c
    iget-object p1, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object p1, p1, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    iget v1, p0, Ll/᩹ۖܿ;->ۢ:I

    .line 29
    iget v2, p1, Ll/᩺᩷ܿ;->֫:I

    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    int-to-long v1, v1

    .line 30
    iget p1, p1, Ll/᩺᩷ܿ;->ۧ:I

    int-to-long v4, p1

    mul-long v1, v1, v4

    long-to-int p1, v1

    if-lt p1, p2, :cond_d

    .line 149
    monitor-exit v0

    return-void

    .line 151
    :cond_d
    iget-object v1, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_e
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ۖܿ;

    iget v4, v4, Ll/۠ۖܿ;->ۨ:I

    if-ne v4, p1, :cond_e

    const/4 v2, 0x1

    goto :goto_7

    :cond_f
    if-eqz v2, :cond_10

    .line 152
    iget p1, p0, Ll/᩹ۖܿ;->ۢ:I

    add-int/2addr p1, v6

    iput p1, p0, Ll/᩹ۖܿ;->ۢ:I

    monitor-exit v0

    goto :goto_6

    .line 153
    :cond_10
    new-instance v1, Ll/۠ۖܿ;

    iget-object v2, p0, Ll/᩹ۖܿ;->ܿ:Ll/᩷ۢܿ;

    iget-object v2, v2, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    iget v4, p0, Ll/᩹ۖܿ;->ۢ:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Ll/᩹ۖܿ;->ۢ:I

    invoke-virtual {v2, v4}, Ll/᩺᩷ܿ;->֫(I)I

    move-result v2

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-direct {v1, p0, p1, v2}, Ll/۠ۖܿ;-><init>(Ll/᩹ۖܿ;II)V

    .line 154
    iget-object p1, p0, Ll/᩹ۖܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 156
    invoke-virtual {v1}, Ll/۠ۖܿ;->ܽ()V

    goto :goto_6

    :catchall_2
    move-exception p1

    .line 155
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p1

    :cond_11
    return-void

    :catchall_3
    move-exception p1

    .line 96
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw p1

    .line 72
    :cond_12
    :goto_8
    invoke-virtual {p0}, Ll/᩹ۖܿ;->֫()V

    return-void
.end method
