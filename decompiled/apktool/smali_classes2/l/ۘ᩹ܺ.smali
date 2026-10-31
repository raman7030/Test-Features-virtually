.class public final Ll/ۘ᩹ܺ;
.super Ljava/util/concurrent/locks/ReentrantLock;
.source "E3QI"


# instance fields
.field public final ֫֫:Ljava/util/AbstractQueue;

.field public final ۗ:J

.field public final ۙ:Ll/ܳ᩶ܺ;

.field public final ۛ:Ll/ܳ᩸ܺ;

.field public final ۟:Ljava/lang/ref/ReferenceQueue;

.field public final ۤ:Ljava/util/AbstractQueue;

.field public volatile ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

.field public final ۫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ۬:I

.field public ܰ:J

.field public final ᩶:Ljava/lang/ref/ReferenceQueue;

.field public final ᩸:Ljava/util/AbstractQueue;

.field public volatile ᩹:I

.field public ᩺:I


# direct methods
.method public constructor <init>(Ll/ܳ᩶ܺ;IJLl/ܳ᩸ܺ;)V
    .locals 3

    .line 1966
    invoke-direct {p0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 1943
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۘ᩹ܺ;->۫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1967
    iput-object p1, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    .line 1968
    iput-wide p3, p0, Ll/ۘ᩹ܺ;->ۗ:J

    .line 902
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1969
    iput-object p5, p0, Ll/ۘ᩹ܺ;->ۛ:Ll/ܳ᩸ܺ;

    .line 1985
    new-instance p5, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {p5, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    .line 1989
    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result p2

    mul-int/lit8 p2, p2, 0x3

    div-int/lit8 p2, p2, 0x4

    iput p2, p0, Ll/ۘ᩹ܺ;->᩺:I

    .line 325
    iget-object v0, p1, Ll/ܳ᩶ܺ;->᩷֫:Ll/᩵᩶ܺ;

    sget-object v1, Ll/ܺ᩸ܺ;->᩹:Ll/ܺ᩸ܺ;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    int-to-long v0, p2

    cmp-long v2, v0, p3

    if-nez v2, :cond_1

    add-int/lit8 p2, p2, 0x1

    .line 1992
    iput p2, p0, Ll/ۘ᩹ܺ;->᩺:I

    .line 1994
    :cond_1
    :goto_0
    iput-object p5, p0, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 373
    iget-object p2, p1, Ll/ܳ᩶ܺ;->ۨ:Ll/֨᩹ܺ;

    sget-object p3, Ll/֨᩹ܺ;->᩶:Ll/֨᩹ܺ;

    const/4 p4, 0x0

    if-eq p2, p3, :cond_2

    .line 1972
    new-instance p2, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p2}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    goto :goto_1

    :cond_2
    move-object p2, p4

    :goto_1
    iput-object p2, p0, Ll/ۘ᩹ܺ;->᩶:Ljava/lang/ref/ReferenceQueue;

    .line 377
    iget-object p2, p1, Ll/ܳ᩶ܺ;->᩻֫:Ll/֨᩹ܺ;

    if-eq p2, p3, :cond_3

    .line 1974
    new-instance p4, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p4}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    :cond_3
    iput-object p4, p0, Ll/ۘ᩹ܺ;->۟:Ljava/lang/ref/ReferenceQueue;

    .line 345
    invoke-virtual {p1}, Ll/ܳ᩶ܺ;->ۧ()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {p1}, Ll/ܳ᩶ܺ;->֫()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    .line 953
    :cond_4
    sget-object p2, Ll/ܳ᩶ܺ;->ۢ֫:Ljava/util/Queue;

    goto :goto_3

    .line 1977
    :cond_5
    :goto_2
    new-instance p2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    :goto_3
    check-cast p2, Ljava/util/AbstractQueue;

    iput-object p2, p0, Ll/ۘ᩹ܺ;->ۤ:Ljava/util/AbstractQueue;

    .line 349
    invoke-virtual {p1}, Ll/ܳ᩶ܺ;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 1979
    new-instance p2, Ll/ᩳ᩶ܺ;

    invoke-direct {p2}, Ll/ᩳ᩶ܺ;-><init>()V

    goto :goto_4

    .line 953
    :cond_6
    sget-object p2, Ll/ܳ᩶ܺ;->ۢ֫:Ljava/util/Queue;

    .line 1979
    :goto_4
    check-cast p2, Ljava/util/AbstractQueue;

    iput-object p2, p0, Ll/ۘ᩹ܺ;->֫֫:Ljava/util/AbstractQueue;

    .line 345
    invoke-virtual {p1}, Ll/ܳ᩶ܺ;->ۧ()Z

    move-result p2

    if-nez p2, :cond_8

    invoke-virtual {p1}, Ll/ܳ᩶ܺ;->֫()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_5

    .line 953
    :cond_7
    sget-object p1, Ll/ܳ᩶ܺ;->ۢ֫:Ljava/util/Queue;

    goto :goto_6

    .line 1981
    :cond_8
    :goto_5
    new-instance p1, Ll/᩶᩸ܺ;

    invoke-direct {p1}, Ll/᩶᩸ܺ;-><init>()V

    :goto_6
    check-cast p1, Ljava/util/AbstractQueue;

    iput-object p1, p0, Ll/ۘ᩹ܺ;->᩸:Ljava/util/AbstractQueue;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;
    .locals 10

    .line 2705
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 2707
    :try_start_0
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v0, v0, Ll/ܳ᩶ܺ;->ܿ֫:Ll/ᩳ᩸ܺ;

    invoke-virtual {v0}, Ll/ᩳ᩸ܺ;->֫()J

    move-result-wide v5

    .line 3369
    invoke-virtual {p0, v5, v6}, Ll/ۘ᩹ܺ;->ۧ(J)V

    .line 2710
    iget v0, p0, Ll/ۘ᩹ܺ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    .line 2711
    iget v1, p0, Ll/ۘ᩹ܺ;->᩺:I

    if-le v0, v1, :cond_0

    .line 2712
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܽ()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    .line 2716
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2717
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    and-int v7, p2, v1

    .line 2718
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻᩶ܺ;

    move-object v8, v1

    :goto_1
    const/4 v9, 0x0

    if-eqz v8, :cond_5

    .line 2722
    invoke-interface {v8}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 2723
    invoke-interface {v8}, Ll/᩻᩶ܺ;->getHash()I

    move-result v3

    if-ne v3, p2, :cond_4

    if-eqz v2, :cond_4

    iget-object v3, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v3, v3, Ll/ܳ᩶ܺ;->ۤ:Ll/ۧܶܺ;

    .line 2725
    invoke-virtual {v3, p1, v2}, Ll/ۧܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 2728
    invoke-interface {v8}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object p2

    .line 2729
    invoke-interface {p2}, Ll/ۗ᩹ܺ;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 2732
    iget p4, p0, Ll/ۘ᩹ܺ;->۬:I

    add-int/lit8 p4, p4, 0x1

    iput p4, p0, Ll/ۘ᩹ܺ;->۬:I

    .line 2733
    invoke-interface {p2}, Ll/ۗ᩹ܺ;->ܽ()Z

    move-result p4

    if-eqz p4, :cond_1

    .line 2735
    invoke-interface {p2}, Ll/ۗ᩹ܺ;->ۧ()I

    move-result p2

    sget-object p4, Ll/ۖ᩶ܺ;->᩹:Ll/ۖ᩶ܺ;

    .line 2734
    invoke-virtual {p0, p1, v0, p2, p4}, Ll/ۘ᩹ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;ILl/ۖ᩶ܺ;)V

    move-object v1, p0

    move-object v2, v8

    move-object v3, p1

    move-object v4, p3

    .line 2736
    invoke-virtual/range {v1 .. v6}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 2737
    iget p1, p0, Ll/ۘ᩹ܺ;->᩹:I

    goto :goto_2

    :cond_1
    move-object v1, p0

    move-object v2, v8

    move-object v3, p1

    move-object v4, p3

    .line 2739
    invoke-virtual/range {v1 .. v6}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 2740
    iget p1, p0, Ll/ۘ᩹ܺ;->᩹:I

    add-int/lit8 p1, p1, 0x1

    .line 2742
    :goto_2
    iput p1, p0, Ll/ۘ᩹ܺ;->᩹:I

    .line 2743
    invoke-virtual {p0, v8}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;)V

    goto :goto_4

    :cond_2
    if-eqz p4, :cond_3

    .line 2749
    invoke-virtual {p0, v8, v5, v6}, Ll/ۘ᩹ܺ;->ۧ(Ll/᩻᩶ܺ;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2773
    :goto_3
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܿ()V

    return-object v0

    .line 2753
    :cond_3
    :try_start_1
    iget p4, p0, Ll/ۘ᩹ܺ;->۬:I

    add-int/lit8 p4, p4, 0x1

    iput p4, p0, Ll/ۘ᩹ܺ;->۬:I

    .line 2755
    invoke-interface {p2}, Ll/ۗ᩹ܺ;->ۧ()I

    move-result p2

    sget-object p4, Ll/ۖ᩶ܺ;->ۗ:Ll/ۖ᩶ܺ;

    .line 2754
    invoke-virtual {p0, p1, v0, p2, p4}, Ll/ۘ᩹ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;ILl/ۖ᩶ܺ;)V

    move-object v1, p0

    move-object v2, v8

    move-object v3, p1

    move-object v4, p3

    .line 2756
    invoke-virtual/range {v1 .. v6}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 2757
    invoke-virtual {p0, v8}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;)V

    goto :goto_3

    .line 2721
    :cond_4
    invoke-interface {v8}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v8

    goto :goto_1

    .line 2764
    :cond_5
    iget p4, p0, Ll/ۘ᩹ܺ;->۬:I

    add-int/lit8 p4, p4, 0x1

    iput p4, p0, Ll/ۘ᩹ܺ;->۬:I

    .line 1999
    iget-object p4, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object p4, p4, Ll/ܳ᩶ܺ;->᩶:Ll/ܰ᩸ܺ;

    invoke-virtual {p4, p0, p1, p2, v1}, Ll/ܰ᩸ܺ;->֫(Ll/ۘ᩹ܺ;Ljava/lang/Object;ILl/᩻᩶ܺ;)Ll/᩻᩶ܺ;

    move-result-object p2

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p3

    .line 2766
    invoke-virtual/range {v1 .. v6}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 2767
    invoke-virtual {v0, v7, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 2768
    iget p1, p0, Ll/ۘ᩹ܺ;->᩹:I

    add-int/lit8 p1, p1, 0x1

    .line 2769
    iput p1, p0, Ll/ۘ᩹ܺ;->᩹:I

    .line 2770
    invoke-virtual {p0, p2}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2773
    :goto_4
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܿ()V

    return-object v9

    .line 2773
    :goto_5
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܿ()V

    .line 2775
    throw p1
.end method

.method public final ֫(Ljava/lang/Object;ILl/ᩴ᩸ܺ;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    .line 2109
    invoke-virtual/range {p0 .. p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 2112
    :try_start_0
    iget-object v3, v1, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v3, v3, Ll/ܳ᩶ܺ;->ܿ֫:Ll/ᩳ᩸ܺ;

    invoke-virtual {v3}, Ll/ᩳ᩸ܺ;->֫()J

    move-result-wide v3

    .line 3369
    invoke-virtual {v1, v3, v4}, Ll/ۘ᩹ܺ;->ۧ(J)V

    .line 2115
    iget v5, v1, Ll/ۘ᩹ܺ;->᩹:I

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    .line 2116
    iget-object v7, v1, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2117
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v8

    sub-int/2addr v8, v6

    and-int/2addr v8, v2

    .line 2118
    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩻᩶ܺ;

    move-object v10, v9

    :goto_0
    const/4 v11, 0x0

    if-eqz v10, :cond_4

    .line 2121
    invoke-interface {v10}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v12

    .line 2122
    invoke-interface {v10}, Ll/᩻᩶ܺ;->getHash()I

    move-result v13

    if-ne v13, v2, :cond_3

    if-eqz v12, :cond_3

    iget-object v13, v1, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v13, v13, Ll/ܳ᩶ܺ;->ۤ:Ll/ۧܶܺ;

    .line 2124
    invoke-virtual {v13, v0, v12}, Ll/ۧܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 2125
    invoke-interface {v10}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v13

    .line 2126
    invoke-interface {v13}, Ll/ۗ᩹ܺ;->֫()Z

    move-result v14

    if-eqz v14, :cond_0

    const/4 v6, 0x0

    goto :goto_2

    .line 2129
    :cond_0
    invoke-interface {v13}, Ll/ۗ᩹ܺ;->get()Ljava/lang/Object;

    move-result-object v14

    if-nez v14, :cond_1

    .line 2132
    invoke-interface {v13}, Ll/ۗ᩹ܺ;->ۧ()I

    move-result v3

    sget-object v4, Ll/ۖ᩶ܺ;->᩹:Ll/ۖ᩶ܺ;

    .line 2131
    invoke-virtual {v1, v12, v14, v3, v4}, Ll/ۘ᩹ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;ILl/ۖ᩶ܺ;)V

    goto :goto_1

    .line 2133
    :cond_1
    iget-object v15, v1, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    invoke-virtual {v15, v10, v3, v4}, Ll/ܳ᩶ܺ;->֫(Ll/᩻᩶ܺ;J)Z

    move-result v15

    if-eqz v15, :cond_2

    .line 2137
    invoke-interface {v13}, Ll/ۗ᩹ܺ;->ۧ()I

    move-result v3

    sget-object v4, Ll/ۖ᩶ܺ;->᩶:Ll/ۖ᩶ܺ;

    .line 2136
    invoke-virtual {v1, v12, v14, v3, v4}, Ll/ۘ᩹ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;ILl/ۖ᩶ܺ;)V

    .line 2146
    :goto_1
    iget-object v3, v1, Ll/ۘ᩹ܺ;->֫֫:Ljava/util/AbstractQueue;

    invoke-interface {v3, v10}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 2147
    iget-object v3, v1, Ll/ۘ᩹ܺ;->᩸:Ljava/util/AbstractQueue;

    invoke-interface {v3, v10}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 2148
    iput v5, v1, Ll/ۘ᩹ܺ;->᩹:I

    goto :goto_2

    .line 2139
    :cond_2
    invoke-virtual {v1, v10, v3, v4}, Ll/ۘ᩹ܺ;->ۧ(Ll/᩻᩶ܺ;J)V

    .line 2140
    iget-object v0, v1, Ll/ۘ᩹ܺ;->ۛ:Ll/ܳ᩸ܺ;

    invoke-interface {v0}, Ll/ܳ᩸ܺ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 2166
    invoke-virtual/range {p0 .. p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual/range {p0 .. p0}, Ll/ۘ᩹ܺ;->ܿ()V

    return-object v14

    .line 2120
    :cond_3
    :try_start_1
    invoke-interface {v10}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v10

    goto :goto_0

    :cond_4
    move-object v13, v11

    :goto_2
    if-eqz v6, :cond_6

    .line 2155
    new-instance v11, Ll/᩻᩹ܺ;

    invoke-direct {v11}, Ll/᩻᩹ܺ;-><init>()V

    if-nez v10, :cond_5

    .line 1999
    iget-object v3, v1, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v3, v3, Ll/ܳ᩶ܺ;->᩶:Ll/ܰ᩸ܺ;

    .line 902
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1999
    invoke-virtual {v3, v1, v0, v2, v9}, Ll/ܰ᩸ܺ;->֫(Ll/ۘ᩹ܺ;Ljava/lang/Object;ILl/᩻᩶ܺ;)Ll/᩻᩶ܺ;

    move-result-object v10

    .line 2159
    invoke-interface {v10, v11}, Ll/᩻᩶ܺ;->֫(Ll/ۗ᩹ܺ;)V

    .line 2160
    invoke-virtual {v7, v8, v10}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    goto :goto_3

    .line 2162
    :cond_5
    invoke-interface {v10, v11}, Ll/᩻᩶ܺ;->֫(Ll/ۗ᩹ܺ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 2166
    :cond_6
    :goto_3
    invoke-virtual/range {p0 .. p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual/range {p0 .. p0}, Ll/ۘ᩹ܺ;->ܿ()V

    if-eqz v6, :cond_7

    move-object/from16 v16, v10

    .line 2175
    :try_start_2
    monitor-enter v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v3, p3

    .line 2217
    :try_start_3
    invoke-virtual {v11, v0, v3}, Ll/᩻᩹ܺ;->֫(Ljava/lang/Object;Ll/ᩴ᩸ܺ;)Ll/ۗܰܺ;

    move-result-object v3

    .line 2218
    invoke-virtual {v1, v0, v2, v11, v3}, Ll/ۘ᩹ܺ;->֫(Ljava/lang/Object;ILl/᩻᩹ܺ;Ll/ۗܰܺ;)Ljava/lang/Object;

    move-result-object v0

    .line 2176
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2179
    iget-object v2, v1, Ll/ۘ᩹ܺ;->ۛ:Ll/ܳ᩸ܺ;

    invoke-interface {v2}, Ll/ܳ᩸ܺ;->֫()V

    return-object v0

    :catchall_0
    move-exception v0

    .line 2177
    :try_start_4
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    .line 2179
    iget-object v2, v1, Ll/ۘ᩹ܺ;->ۛ:Ll/ܳ᩸ܺ;

    invoke-interface {v2}, Ll/ܳ᩸ܺ;->֫()V

    .line 2180
    throw v0

    .line 2183
    :cond_7
    invoke-virtual {v1, v10, v0, v13}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ljava/lang/Object;Ll/ۗ᩹ܺ;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :catchall_2
    move-exception v0

    .line 2166
    invoke-virtual/range {p0 .. p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual/range {p0 .. p0}, Ll/ۘ᩹ܺ;->ܿ()V

    .line 2168
    throw v0
.end method

.method public final ֫(Ljava/lang/Object;ILl/᩻᩹ܺ;Ll/ۗܰܺ;)Ljava/lang/Object;
    .locals 6

    .line 2248
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۛ:Ll/ܳ᩸ܺ;

    const-string v1, "CacheLoader returned null for key "

    .line 2250
    :try_start_0
    invoke-static {p4}, Ll/ۨܰܺ;->֫(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p4, :cond_0

    .line 3497
    :try_start_1
    iget-object v1, p3, Ll/᩻᩹ܺ;->᩶:Ll/۫ܶܺ;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1}, Ll/۫ܶܺ;->֫()J

    move-result-wide v1

    .line 2254
    invoke-interface {v0, v1, v2}, Ll/ܳ᩸ܺ;->ۧ(J)V

    .line 2255
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۘ᩹ܺ;->֫(Ljava/lang/Object;ILl/᩻᩹ܺ;Ljava/lang/Object;)V

    return-object p4

    .line 2252
    :cond_0
    new-instance v2, Ll/ۘ᩸ܺ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 247
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 2252
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v1

    goto :goto_0

    :catchall_1
    move-exception v1

    const/4 p4, 0x0

    :goto_0
    if-nez p4, :cond_4

    .line 3497
    iget-object p4, p3, Ll/᩻᩹ܺ;->᩶:Ll/۫ܶܺ;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p4}, Ll/۫ܶܺ;->֫()J

    move-result-wide v2

    .line 2259
    invoke-interface {v0, v2, v3}, Ll/ܳ᩸ܺ;->֫(J)V

    .line 3288
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 3290
    :try_start_2
    iget-object p4, p0, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3291
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    and-int/2addr v0, p2

    .line 3292
    invoke-virtual {p4, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻᩶ܺ;

    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_3

    .line 3295
    invoke-interface {v3}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v4

    .line 3296
    invoke-interface {v3}, Ll/᩻᩶ܺ;->getHash()I

    move-result v5

    if-ne v5, p2, :cond_2

    if-eqz v4, :cond_2

    iget-object v5, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v5, v5, Ll/ܳ᩶ܺ;->ۤ:Ll/ۧܶܺ;

    .line 3298
    invoke-virtual {v5, p1, v4}, Ll/ۧܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 3299
    invoke-interface {v3}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object p1

    if-ne p1, p3, :cond_3

    .line 3430
    iget-object p1, p3, Ll/᩻᩹ܺ;->᩹:Ll/ۗ᩹ܺ;

    invoke-interface {p1}, Ll/ۗ᩹ܺ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3511
    iget-object p1, p3, Ll/᩻᩹ܺ;->᩹:Ll/ۗ᩹ܺ;

    .line 3302
    invoke-interface {v3, p1}, Ll/᩻᩶ܺ;->֫(Ll/ۗ᩹ܺ;)V

    goto :goto_2

    .line 3304
    :cond_1
    invoke-virtual {p0, v2, v3}, Ll/ۘ᩹ܺ;->ۧ(Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;)Ll/᩻᩶ܺ;

    move-result-object p1

    .line 3305
    invoke-virtual {p4, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    goto :goto_2

    .line 3294
    :cond_2
    invoke-interface {v3}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    .line 3315
    :cond_3
    :goto_2
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܿ()V

    goto :goto_3

    :catchall_2
    move-exception p1

    .line 3315
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܿ()V

    .line 3317
    throw p1

    .line 2262
    :cond_4
    :goto_3
    throw v1
.end method

.method public final ֫(Ll/᩻᩶ܺ;J)Ljava/lang/Object;
    .locals 3

    .line 2639
    invoke-interface {p1}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2640
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܳ()V

    return-object v1

    .line 2643
    :cond_0
    invoke-interface {p1}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۗ᩹ܺ;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2645
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܳ()V

    return-object v1

    .line 2649
    :cond_1
    iget-object v2, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    invoke-virtual {v2, p1, p2, p3}, Ll/ܳ᩶ܺ;->֫(Ll/᩻᩶ܺ;J)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 2510
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 2512
    :try_start_0
    invoke-virtual {p0, p2, p3}, Ll/ۘ᩹ܺ;->֫(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2514
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 2516
    throw p1

    :cond_2
    return-object v1

    :cond_3
    return-object v0
.end method

.method public final ֫(Ll/᩻᩶ܺ;Ljava/lang/Object;ILjava/lang/Object;JLl/ᩴ᩸ܺ;)Ljava/lang/Object;
    .locals 12

    move-object v7, p0

    move-object v0, p2

    move v4, p3

    .line 2272
    iget-object v1, v7, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    .line 341
    iget-wide v1, v1, Ll/ܳ᩶ܺ;->ܰ:J

    const-wide/16 v5, 0x0

    cmp-long v3, v1, v5

    if-lez v3, :cond_6

    .line 2273
    invoke-interface {p1}, Ll/᩻᩶ܺ;->ۢ()J

    move-result-wide v1

    sub-long v1, p5, v1

    iget-object v3, v7, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-wide v5, v3, Ll/ܳ᩶ܺ;->ܰ:J

    cmp-long v3, v1, v5

    if-lez v3, :cond_6

    .line 2274
    invoke-interface {p1}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۗ᩹ܺ;->֫()Z

    move-result v1

    if-nez v1, :cond_6

    .line 2315
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 2317
    :try_start_0
    iget-object v1, v7, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v1, v1, Ll/ܳ᩶ܺ;->ܿ֫:Ll/ᩳ᩸ܺ;

    invoke-virtual {v1}, Ll/ᩳ᩸ܺ;->֫()J

    move-result-wide v1

    .line 3369
    invoke-virtual {p0, v1, v2}, Ll/ۘ᩹ܺ;->ۧ(J)V

    .line 2320
    iget-object v3, v7, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2321
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    and-int/2addr v5, v4

    .line 2322
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩻᩶ܺ;

    move-object v8, v6

    :goto_0
    const/4 v9, 0x0

    if-eqz v8, :cond_3

    .line 2326
    invoke-interface {v8}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v10

    .line 2327
    invoke-interface {v8}, Ll/᩻᩶ܺ;->getHash()I

    move-result v11

    if-ne v11, v4, :cond_2

    if-eqz v10, :cond_2

    iget-object v11, v7, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v11, v11, Ll/ܳ᩶ܺ;->ۤ:Ll/ۧܶܺ;

    .line 2329
    invoke-virtual {v11, p2, v10}, Ll/ۧܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 2332
    invoke-interface {v8}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v3

    .line 2333
    invoke-interface {v3}, Ll/ۗ᩹ܺ;->֫()Z

    move-result v5

    if-nez v5, :cond_1

    .line 2334
    invoke-interface {v8}, Ll/᩻᩶ܺ;->ۢ()J

    move-result-wide v5

    sub-long/2addr v1, v5

    iget-object v5, v7, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-wide v5, v5, Ll/ܳ᩶ܺ;->ܰ:J

    cmp-long v10, v1, v5

    if-gez v10, :cond_0

    goto :goto_1

    .line 2342
    :cond_0
    iget v1, v7, Ll/ۘ᩹ܺ;->۬:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v7, Ll/ۘ᩹ܺ;->۬:I

    .line 2343
    new-instance v1, Ll/᩻᩹ܺ;

    invoke-direct {v1, v3}, Ll/᩻᩹ܺ;-><init>(Ll/ۗ᩹ܺ;)V

    .line 2345
    invoke-interface {v8, v1}, Ll/᩻᩶ܺ;->֫(Ll/ۗ᩹ܺ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_2

    .line 2357
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܿ()V

    move-object v5, v9

    goto :goto_3

    .line 2325
    :cond_2
    :try_start_1
    invoke-interface {v8}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v8

    goto :goto_0

    .line 2350
    :cond_3
    iget v1, v7, Ll/ۘ᩹ܺ;->۬:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v7, Ll/ۘ᩹ܺ;->۬:I

    .line 2351
    new-instance v1, Ll/᩻᩹ܺ;

    invoke-direct {v1}, Ll/᩻᩹ܺ;-><init>()V

    .line 1999
    iget-object v2, v7, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v2, v2, Ll/ܳ᩶ܺ;->᩶:Ll/ܰ᩸ܺ;

    .line 902
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1999
    invoke-virtual {v2, p0, p2, p3, v6}, Ll/ܰ᩸ܺ;->֫(Ll/ۘ᩹ܺ;Ljava/lang/Object;ILl/᩻᩶ܺ;)Ll/᩻᩶ܺ;

    move-result-object v2

    .line 2353
    invoke-interface {v2, v1}, Ll/᩻᩶ܺ;->֫(Ll/ۗ᩹ܺ;)V

    .line 2354
    invoke-virtual {v3, v5, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2357
    :goto_2
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܿ()V

    move-object v5, v1

    :goto_3
    if-nez v5, :cond_4

    goto :goto_4

    :cond_4
    move-object/from16 v1, p7

    .line 2226
    invoke-virtual {v5, p2, v1}, Ll/᩻᩹ܺ;->֫(Ljava/lang/Object;Ll/ᩴ᩸ܺ;)Ll/ۗܰܺ;

    move-result-object v8

    .line 2227
    new-instance v10, Ll/ۖ᩹ܺ;

    move-object v1, v10

    move-object v2, p0

    move-object v3, p2

    move v4, p3

    move-object v6, v8

    invoke-direct/range {v1 .. v6}, Ll/ۖ᩹ܺ;-><init>(Ll/ۘ᩹ܺ;Ljava/lang/Object;ILl/᩻᩹ܺ;Ll/ۗܰܺ;)V

    .line 2236
    invoke-static {}, Ll/۫ܰܺ;->֫()Ljava/util/concurrent/Executor;

    move-result-object v0

    .line 2227
    invoke-interface {v8, v10, v0}, Ll/ۗܰܺ;->֫(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 2298
    invoke-interface {v8}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2300
    :try_start_2
    invoke-static {v8}, Ll/ۨܰܺ;->֫(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_0
    nop

    :cond_5
    :goto_4
    if-eqz v9, :cond_6

    return-object v9

    :catchall_1
    move-exception v0

    .line 2357
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܿ()V

    .line 2359
    throw v0

    :cond_6
    return-object p4
.end method

.method public final ֫(Ll/᩻᩶ܺ;Ljava/lang/Object;Ll/ۗ᩹ܺ;)Ljava/lang/Object;
    .locals 4

    .line 2189
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۛ:Ll/ܳ᩸ܺ;

    const-string v1, "CacheLoader returned null for key "

    invoke-interface {p3}, Ll/ۗ᩹ܺ;->֫()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2193
    invoke-static {p1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    const-string v3, "Recursive load of: %s"

    invoke-static {p2, v3, v2}, Ll/ۘܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 2196
    :try_start_0
    invoke-interface {p3}, Ll/ۗ᩹ܺ;->ᩳ()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 2201
    iget-object p2, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object p2, p2, Ll/ܳ᩶ܺ;->ܿ֫:Ll/ᩳ᩸ܺ;

    invoke-virtual {p2}, Ll/ᩳ᩸ܺ;->֫()J

    move-result-wide v1

    .line 2202
    invoke-virtual {p0, p1, v1, v2}, Ll/ۘ᩹ܺ;->ܽ(Ll/᩻᩶ܺ;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2205
    invoke-interface {v0}, Ll/ܳ᩸ܺ;->֫()V

    return-object p3

    .line 2198
    :cond_0
    :try_start_1
    new-instance p1, Ll/ۘ᩸ܺ;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 247
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 2198
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 2205
    invoke-interface {v0}, Ll/ܳ᩸ܺ;->֫()V

    .line 2206
    throw p1

    .line 2190
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final ֫(ILjava/lang/Object;)Ll/᩻᩶ܺ;
    .locals 3

    .line 2597
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2598
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻᩶ܺ;

    :goto_0
    if-eqz v0, :cond_3

    .line 2605
    invoke-interface {v0}, Ll/᩻᩶ܺ;->getHash()I

    move-result v1

    if-eq v1, p1, :cond_0

    goto :goto_1

    .line 2609
    :cond_0
    invoke-interface {v0}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 2611
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܳ()V

    goto :goto_1

    .line 2615
    :cond_1
    iget-object v2, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v2, v2, Ll/ܳ᩶ܺ;->ۤ:Ll/ۧܶܺ;

    invoke-virtual {v2, p2, v1}, Ll/ۧܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    .line 2604
    :cond_2
    :goto_1
    invoke-interface {v0}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;)Ll/᩻᩶ܺ;
    .locals 4

    .line 2009
    invoke-interface {p1}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2015
    :cond_0
    invoke-interface {p1}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v1

    .line 2016
    invoke-interface {v1}, Ll/ۗ᩹ܺ;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    .line 2017
    invoke-interface {v1}, Ll/ۗ᩹ܺ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 2022
    :cond_1
    iget-object v3, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v3, v3, Ll/ܳ᩶ܺ;->᩶:Ll/ܰ᩸ܺ;

    invoke-virtual {v3, p0, p1, p2, v0}, Ll/ܰ᩸ܺ;->֫(Ll/ۘ᩹ܺ;Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;Ljava/lang/Object;)Ll/᩻᩶ܺ;

    move-result-object p1

    .line 2023
    iget-object p2, p0, Ll/ۘ᩹ܺ;->۟:Ljava/lang/ref/ReferenceQueue;

    invoke-interface {v1, p2, v2, p1}, Ll/ۗ᩹ܺ;->֫(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Ll/᩻᩶ܺ;)Ll/ۗ᩹ܺ;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/᩻᩶ܺ;->֫(Ll/ۗ᩹ܺ;)V

    return-object p1
.end method

.method public final ֫(Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;Ll/ۗ᩹ܺ;Ll/ۖ᩶ܺ;)Ll/᩻᩶ܺ;
    .locals 1

    .line 3163
    invoke-interface {p5}, Ll/ۗ᩹ܺ;->ۧ()I

    move-result v0

    invoke-virtual {p0, p3, p4, v0, p6}, Ll/ۘ᩹ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;ILl/ۖ᩶ܺ;)V

    .line 3164
    iget-object p3, p0, Ll/ۘ᩹ܺ;->֫֫:Ljava/util/AbstractQueue;

    invoke-interface {p3, p2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 3165
    iget-object p3, p0, Ll/ۘ᩹ܺ;->᩸:Ljava/util/AbstractQueue;

    invoke-interface {p3, p2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 3167
    invoke-interface {p5}, Ll/ۗ᩹ܺ;->֫()Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 3168
    invoke-interface {p5, p2}, Ll/ۗ᩹ܺ;->֫(Ljava/lang/Object;)V

    return-object p1

    .line 3171
    :cond_0
    invoke-virtual {p0, p1, p2}, Ll/ۘ᩹ܺ;->ۧ(Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;)Ll/᩻᩶ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 3

    .line 2495
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۤ:Ljava/util/AbstractQueue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻᩶ܺ;

    if-eqz v0, :cond_1

    .line 2500
    iget-object v1, p0, Ll/ۘ᩹ܺ;->᩸:Ljava/util/AbstractQueue;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2501
    invoke-interface {v1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(J)V
    .locals 4

    .line 2522
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->֫()V

    .line 2525
    :goto_0
    iget-object v0, p0, Ll/ۘ᩹ܺ;->֫֫:Ljava/util/AbstractQueue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻᩶ܺ;

    iget-object v1, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    if-eqz v0, :cond_1

    invoke-virtual {v1, v0, p1, p2}, Ll/ܳ᩶ܺ;->֫(Ll/᩻᩶ܺ;J)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2526
    invoke-interface {v0}, Ll/᩻᩶ܺ;->getHash()I

    move-result v1

    sget-object v2, Ll/ۖ᩶ܺ;->᩶:Ll/ۖ᩶ܺ;

    invoke-virtual {p0, v0, v1, v2}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;ILl/ۖ᩶ܺ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2527
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 2530
    :cond_1
    :goto_1
    iget-object v0, p0, Ll/ۘ᩹ܺ;->᩸:Ljava/util/AbstractQueue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻᩶ܺ;

    if-eqz v0, :cond_3

    invoke-virtual {v1, v0, p1, p2}, Ll/ܳ᩶ܺ;->֫(Ll/᩻᩶ܺ;J)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 2531
    invoke-interface {v0}, Ll/᩻᩶ܺ;->getHash()I

    move-result v2

    sget-object v3, Ll/ۖ᩶ܺ;->᩶:Ll/ۖ᩶ܺ;

    invoke-virtual {p0, v0, v2, v3}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;ILl/ۖ᩶ܺ;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 2532
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    return-void
.end method

.method public final ֫(Ljava/lang/Object;ILl/᩻᩹ܺ;Ljava/lang/Object;)V
    .locals 10

    .line 3058
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 3060
    :try_start_0
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v0, v0, Ll/ܳ᩶ܺ;->ܿ֫:Ll/ᩳ᩸ܺ;

    invoke-virtual {v0}, Ll/ᩳ᩸ܺ;->֫()J

    move-result-wide v5

    .line 3369
    invoke-virtual {p0, v5, v6}, Ll/ۘ᩹ܺ;->ۧ(J)V

    .line 3063
    iget v0, p0, Ll/ۘ᩹ܺ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    .line 3064
    iget v1, p0, Ll/ۘ᩹ܺ;->᩺:I

    if-le v0, v1, :cond_0

    .line 3065
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܽ()V

    .line 3066
    iget v0, p0, Ll/ۘ᩹ܺ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    .line 3069
    :cond_0
    :goto_0
    iget-object v7, p0, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3070
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    and-int v8, p2, v1

    .line 3071
    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻᩶ܺ;

    move-object v9, v1

    :goto_1
    if-eqz v9, :cond_6

    .line 3074
    invoke-interface {v9}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 3075
    invoke-interface {v9}, Ll/᩻᩶ܺ;->getHash()I

    move-result v3

    if-ne v3, p2, :cond_5

    if-eqz v2, :cond_5

    iget-object v3, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v3, v3, Ll/ܳ᩶ܺ;->ۤ:Ll/ۧܶܺ;

    .line 3077
    invoke-virtual {v3, p1, v2}, Ll/ۧܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 3078
    invoke-interface {v9}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object p2

    .line 3079
    invoke-interface {p2}, Ll/ۗ᩹ܺ;->get()Ljava/lang/Object;

    move-result-object v1

    if-eq p3, p2, :cond_2

    if-nez v1, :cond_1

    .line 3082
    sget-object v2, Ll/ܳ᩶ܺ;->ۡ֫:Ll/ۚ᩸ܺ;

    if-eq p2, v2, :cond_1

    goto :goto_3

    .line 3098
    :cond_1
    sget-object p2, Ll/ۖ᩶ܺ;->ۗ:Ll/ۖ᩶ܺ;

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p4, p3, p2}, Ll/ۘ᩹ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;ILl/ۖ᩶ܺ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3111
    :goto_2
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܿ()V

    return-void

    .line 3084
    :cond_2
    :goto_3
    :try_start_1
    iget p2, p0, Ll/ۘ᩹ܺ;->۬:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ll/ۘ᩹ܺ;->۬:I

    .line 3430
    iget-object p2, p3, Ll/᩻᩹ܺ;->᩹:Ll/ۗ᩹ܺ;

    invoke-interface {p2}, Ll/ۗ᩹ܺ;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_4

    if-nez v1, :cond_3

    .line 3087
    sget-object p2, Ll/ۖ᩶ܺ;->᩹:Ll/ۖ᩶ܺ;

    goto :goto_4

    :cond_3
    sget-object p2, Ll/ۖ᩶ܺ;->ۗ:Ll/ۖ᩶ܺ;

    .line 3435
    :goto_4
    iget-object p3, p3, Ll/᩻᩹ܺ;->᩹:Ll/ۗ᩹ܺ;

    invoke-interface {p3}, Ll/ۗ᩹ܺ;->ۧ()I

    move-result p3

    .line 3088
    invoke-virtual {p0, p1, v1, p3, p2}, Ll/ۘ᩹ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;ILl/ۖ᩶ܺ;)V

    add-int/lit8 v0, v0, -0x1

    :cond_4
    move-object v1, p0

    move-object v2, v9

    move-object v3, p1

    move-object v4, p4

    .line 3091
    invoke-virtual/range {v1 .. v6}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 3092
    iput v0, p0, Ll/ۘ᩹ܺ;->᩹:I

    .line 3093
    invoke-virtual {p0, v9}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;)V

    goto :goto_2

    .line 3073
    :cond_5
    invoke-interface {v9}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v9

    goto :goto_1

    .line 3103
    :cond_6
    iget p3, p0, Ll/ۘ᩹ܺ;->۬:I

    add-int/lit8 p3, p3, 0x1

    iput p3, p0, Ll/ۘ᩹ܺ;->۬:I

    .line 1999
    iget-object p3, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object p3, p3, Ll/ܳ᩶ܺ;->᩶:Ll/ܰ᩸ܺ;

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1999
    invoke-virtual {p3, p0, p1, p2, v1}, Ll/ܰ᩸ܺ;->֫(Ll/ۘ᩹ܺ;Ljava/lang/Object;ILl/᩻᩶ܺ;)Ll/᩻᩶ܺ;

    move-result-object p2

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p4

    .line 3105
    invoke-virtual/range {v1 .. v6}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 3106
    invoke-virtual {v7, v8, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3107
    iput v0, p0, Ll/ۘ᩹ܺ;->᩹:I

    .line 3108
    invoke-virtual {p0, p2}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 3111
    :goto_5
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܿ()V

    .line 3113
    throw p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;ILl/ۖ᩶ܺ;)V
    .locals 4

    .line 2542
    iget-wide v0, p0, Ll/ۘ᩹ܺ;->ܰ:J

    int-to-long v2, p3

    sub-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۘ᩹ܺ;->ܰ:J

    .line 2543
    invoke-virtual {p4}, Ll/ۖ᩶ܺ;->֫()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 2544
    iget-object p3, p0, Ll/ۘ᩹ܺ;->ۛ:Ll/ܳ᩸ܺ;

    invoke-interface {p3}, Ll/ܳ᩸ܺ;->ۧ()V

    .line 2546
    :cond_0
    iget-object p3, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object p4, p3, Ll/ܳ᩶ܺ;->֫֫:Ljava/util/AbstractQueue;

    sget-object v0, Ll/ܳ᩶ܺ;->ۢ֫:Ljava/util/Queue;

    if-eq p4, v0, :cond_1

    .line 50
    new-instance p4, Ll/ᩴ᩶ܺ;

    .line 54
    invoke-direct {p4, p1, p2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2548
    iget-object p1, p3, Ll/ܳ᩶ܺ;->֫֫:Ljava/util/AbstractQueue;

    invoke-interface {p1, p4}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩻᩶ܺ;)V
    .locals 5

    .line 2560
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    invoke-virtual {v0}, Ll/ܳ᩶ܺ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2564
    :cond_0
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->֫()V

    .line 2568
    invoke-interface {p1}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۗ᩹ܺ;->ۧ()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Ll/ۘ᩹ܺ;->ۗ:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    .line 2569
    invoke-interface {p1}, Ll/᩻᩶ܺ;->getHash()I

    move-result v0

    sget-object v1, Ll/ۖ᩶ܺ;->۬:Ll/ۖ᩶ܺ;

    invoke-virtual {p0, p1, v0, v1}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;ILl/ۖ᩶ܺ;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 2570
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 2574
    :cond_2
    :goto_0
    iget-wide v0, p0, Ll/ۘ᩹ܺ;->ܰ:J

    cmp-long p1, v0, v2

    if-lez p1, :cond_6

    .line 2585
    iget-object p1, p0, Ll/ۘ᩹ܺ;->᩸:Ljava/util/AbstractQueue;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻᩶ܺ;

    .line 2586
    invoke-interface {v0}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۗ᩹ܺ;->ۧ()I

    move-result v1

    if-lez v1, :cond_3

    .line 2576
    invoke-interface {v0}, Ll/᩻᩶ܺ;->getHash()I

    move-result p1

    sget-object v1, Ll/ۖ᩶ܺ;->۬:Ll/ۖ᩶ܺ;

    invoke-virtual {p0, v0, p1, v1}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;ILl/ۖ᩶ܺ;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    .line 2577
    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 2591
    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_6
    :goto_1
    return-void
.end method

.method public final ֫(Ll/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 6

    .line 2030
    invoke-interface {p1}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v0

    .line 2031
    iget-object v1, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v2, v1, Ll/ܳ᩶ܺ;->᩷֫:Ll/᩵᩶ܺ;

    invoke-interface {v2, p2, p3}, Ll/᩵᩶ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    if-ltz p2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "Weights must be non-negative"

    .line 2032
    invoke-static {v3, v2}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    .line 2034
    iget-object v2, v1, Ll/ܳ᩶ܺ;->᩻֫:Ll/֨᩹ܺ;

    .line 2035
    invoke-virtual {v2, p0, p1, p3, p2}, Ll/֨᩹ܺ;->֫(Ll/ۘ᩹ܺ;Ll/᩻᩶ܺ;Ljava/lang/Object;I)Ll/ۗ᩹ܺ;

    move-result-object v2

    .line 2036
    invoke-interface {p1, v2}, Ll/᩻᩶ܺ;->֫(Ll/ۗ᩹ܺ;)V

    .line 2473
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->֫()V

    .line 2474
    iget-wide v2, p0, Ll/ۘ᩹ܺ;->ܰ:J

    int-to-long v4, p2

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/ۘ᩹ܺ;->ܰ:J

    .line 357
    invoke-virtual {v1}, Ll/ܳ᩶ܺ;->ۧ()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 2477
    invoke-interface {p1, p4, p5}, Ll/᩻᩶ܺ;->֫(J)V

    .line 353
    :cond_1
    invoke-virtual {v1}, Ll/ܳ᩶ܺ;->ܽ()Z

    move-result p2

    if-nez p2, :cond_2

    .line 341
    iget-wide v1, v1, Ll/ܳ᩶ܺ;->ܰ:J

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    if-lez p2, :cond_3

    .line 2480
    :cond_2
    invoke-interface {p1, p4, p5}, Ll/᩻᩶ܺ;->ܽ(J)V

    .line 2482
    :cond_3
    iget-object p2, p0, Ll/ۘ᩹ܺ;->᩸:Ljava/util/AbstractQueue;

    invoke-interface {p2, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 2483
    iget-object p2, p0, Ll/ۘ᩹ܺ;->֫֫:Ljava/util/AbstractQueue;

    invoke-interface {p2, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 2038
    invoke-interface {v0, p3}, Ll/ۗ᩹ܺ;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/᩻᩶ܺ;ILl/ۖ᩶ܺ;)Z
    .locals 10

    .line 3325
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3326
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    and-int/2addr p2, v1

    .line 3327
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ll/᩻᩶ܺ;

    move-object v5, v4

    :goto_0
    if-eqz v5, :cond_1

    if-ne v5, p1, :cond_0

    .line 3331
    iget p1, p0, Ll/ۘ᩹ܺ;->۬:I

    add-int/2addr p1, v2

    iput p1, p0, Ll/ۘ᩹ܺ;->۬:I

    .line 3336
    invoke-interface {v5}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v6

    .line 3338
    invoke-interface {v5}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۗ᩹ܺ;->get()Ljava/lang/Object;

    move-result-object v7

    .line 3339
    invoke-interface {v5}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v8

    move-object v3, p0

    move-object v9, p3

    .line 3333
    invoke-virtual/range {v3 .. v9}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;Ll/ۗ᩹ܺ;Ll/ۖ᩶ܺ;)Ll/᩻᩶ܺ;

    move-result-object p1

    .line 3341
    iget p3, p0, Ll/ۘ᩹ܺ;->᩹:I

    sub-int/2addr p3, v2

    .line 3342
    invoke-virtual {v0, p2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3343
    iput p3, p0, Ll/ۘ᩹ܺ;->᩹:I

    return v2

    .line 3329
    :cond_0
    invoke-interface {v5}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v5

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;)Ll/᩻᩶ܺ;
    .locals 3

    .line 3178
    iget v0, p0, Ll/ۘ᩹ܺ;->᩹:I

    .line 3179
    invoke-interface {p2}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v1

    :goto_0
    if-eq p1, p2, :cond_1

    .line 3181
    invoke-virtual {p0, p1, v1}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;)Ll/᩻᩶ܺ;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object v1, v2

    goto :goto_1

    .line 3185
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۘ᩹ܺ;->ۧ(Ll/᩻᩶ܺ;)V

    add-int/lit8 v0, v0, -0x1

    .line 3180
    :goto_1
    invoke-interface {p1}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object p1

    goto :goto_0

    .line 3189
    :cond_1
    iput v0, p0, Ll/ۘ᩹ܺ;->᩹:I

    return-object v1
.end method

.method public final ۧ()V
    .locals 14

    .line 2381
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    .line 373
    iget-object v0, v0, Ll/ܳ᩶ܺ;->ۨ:Ll/֨᩹ܺ;

    sget-object v1, Ll/֨᩹ܺ;->᩶:Ll/֨᩹ܺ;

    const/16 v2, 0x10

    const/4 v3, 0x0

    if-eq v0, v1, :cond_3

    const/4 v0, 0x0

    .line 2393
    :cond_0
    iget-object v1, p0, Ll/ۘ᩹ܺ;->᩶:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 2395
    check-cast v1, Ll/᩻᩶ܺ;

    .line 2396
    iget-object v4, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1736
    invoke-interface {v1}, Ll/᩻᩶ܺ;->getHash()I

    move-result v5

    .line 1737
    invoke-virtual {v4, v5}, Ll/ܳ᩶ܺ;->ۧ(I)Ll/ۘ᩹ܺ;

    move-result-object v4

    .line 3208
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 3211
    :try_start_0
    iget-object v13, v4, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3212
    invoke-virtual {v13}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    and-int/2addr v5, v6

    .line 3213
    invoke-virtual {v13, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ll/᩻᩶ܺ;

    move-object v8, v7

    :goto_0
    if-eqz v8, :cond_2

    if-ne v8, v1, :cond_1

    .line 3217
    iget v1, v4, Ll/ۘ᩹ܺ;->۬:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v4, Ll/ۘ᩹ܺ;->۬:I

    .line 3222
    invoke-interface {v8}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v9

    .line 3224
    invoke-interface {v8}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۗ᩹ܺ;->get()Ljava/lang/Object;

    move-result-object v10

    .line 3225
    invoke-interface {v8}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v11

    sget-object v12, Ll/ۖ᩶ܺ;->᩹:Ll/ۖ᩶ܺ;

    move-object v6, v4

    .line 3219
    invoke-virtual/range {v6 .. v12}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;Ll/ۗ᩹ܺ;Ll/ۖ᩶ܺ;)Ll/᩻᩶ܺ;

    move-result-object v1

    .line 3227
    iget v6, v4, Ll/ۘ᩹ܺ;->᩹:I

    add-int/lit8 v6, v6, -0x1

    .line 3228
    invoke-virtual {v13, v5, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3229
    iput v6, v4, Ll/ۘ᩹ܺ;->᩹:I

    goto :goto_1

    .line 3215
    :cond_1
    invoke-interface {v8}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 3236
    :cond_2
    :goto_1
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {v4}, Ll/ۘ᩹ܺ;->ܿ()V

    add-int/lit8 v0, v0, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 3236
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3374
    invoke-virtual {v4}, Ll/ۘ᩹ܺ;->ܿ()V

    .line 3238
    throw v0

    .line 2384
    :cond_3
    :goto_2
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    .line 377
    iget-object v0, v0, Ll/ܳ᩶ܺ;->᩻֫:Ll/֨᩹ܺ;

    sget-object v1, Ll/֨᩹ܺ;->᩶:Ll/֨᩹ܺ;

    if-eq v0, v1, :cond_a

    .line 2407
    :cond_4
    iget-object v0, p0, Ll/ۘ᩹ܺ;->۟:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 2409
    move-object v9, v0

    check-cast v9, Ll/ۗ᩹ܺ;

    .line 2410
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1730
    invoke-interface {v9}, Ll/ۗ᩹ܺ;->getEntry()Ll/᩻᩶ܺ;

    move-result-object v1

    .line 1731
    invoke-interface {v1}, Ll/᩻᩶ܺ;->getHash()I

    move-result v4

    .line 1732
    invoke-virtual {v0, v4}, Ll/ܳ᩶ܺ;->ۧ(I)Ll/ۘ᩹ܺ;

    move-result-object v0

    invoke-interface {v1}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 3244
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 3247
    :try_start_1
    iget-object v11, v0, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 3248
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    and-int v12, v4, v5

    .line 3249
    invoke-virtual {v11, v12}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩻᩶ܺ;

    move-object v6, v5

    :goto_3
    if-eqz v6, :cond_7

    .line 3252
    invoke-interface {v6}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v7

    .line 3253
    invoke-interface {v6}, Ll/᩻᩶ܺ;->getHash()I

    move-result v8

    if-ne v8, v4, :cond_6

    if-eqz v7, :cond_6

    iget-object v8, v0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v8, v8, Ll/ܳ᩶ܺ;->ۤ:Ll/ۧܶܺ;

    .line 3255
    invoke-virtual {v8, v1, v7}, Ll/ۧܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 3256
    invoke-interface {v6}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v1

    if-ne v1, v9, :cond_5

    .line 3258
    iget v1, v0, Ll/ۘ᩹ܺ;->۬:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/ۘ᩹ܺ;->۬:I

    .line 3265
    invoke-interface {v9}, Ll/ۗ᩹ܺ;->get()Ljava/lang/Object;

    move-result-object v8

    sget-object v10, Ll/ۖ᩶ܺ;->᩹:Ll/ۖ᩶ܺ;

    move-object v4, v0

    .line 3260
    invoke-virtual/range {v4 .. v10}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;Ll/ۗ᩹ܺ;Ll/ۖ᩶ܺ;)Ll/᩻᩶ܺ;

    move-result-object v1

    .line 3268
    iget v4, v0, Ll/ۘ᩹ܺ;->᩹:I

    add-int/lit8 v4, v4, -0x1

    .line 3269
    invoke-virtual {v11, v12, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 3270
    iput v4, v0, Ll/ۘ᩹ܺ;->᩹:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 3279
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3280
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_4

    .line 3279
    :cond_5
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3280
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_4

    .line 3251
    :cond_6
    :try_start_2
    invoke-interface {v6}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    goto :goto_5

    .line 3279
    :cond_7
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3280
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v1

    if-nez v1, :cond_8

    .line 3374
    :goto_4
    invoke-virtual {v0}, Ll/ۘ᩹ܺ;->ܿ()V

    :cond_8
    add-int/lit8 v3, v3, 0x1

    if-ne v3, v2, :cond_4

    goto :goto_6

    .line 3279
    :goto_5
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3280
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v2

    if-nez v2, :cond_9

    .line 3374
    invoke-virtual {v0}, Ll/ۘ᩹ܺ;->ܿ()V

    .line 3283
    :cond_9
    throw v1

    :cond_a
    :goto_6
    return-void
.end method

.method public final ۧ(J)V
    .locals 1

    .line 3384
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3386
    :try_start_0
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ۧ()V

    .line 3387
    invoke-virtual {p0, p1, p2}, Ll/ۘ᩹ܺ;->֫(J)V

    .line 3388
    iget-object p1, p0, Ll/ۘ᩹ܺ;->۫:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3390
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 3391
    throw p1

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/᩻᩶ܺ;)V
    .locals 4

    .line 3196
    invoke-interface {p1}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 3197
    invoke-interface {p1}, Ll/᩻᩶ܺ;->getHash()I

    .line 3198
    invoke-interface {p1}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۗ᩹ܺ;->get()Ljava/lang/Object;

    move-result-object v1

    .line 3199
    invoke-interface {p1}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v2

    invoke-interface {v2}, Ll/ۗ᩹ܺ;->ۧ()I

    move-result v2

    sget-object v3, Ll/ۖ᩶ܺ;->᩹:Ll/ۖ᩶ܺ;

    .line 3195
    invoke-virtual {p0, v0, v1, v2, v3}, Ll/ۘ᩹ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;ILl/ۖ᩶ܺ;)V

    .line 3201
    iget-object v0, p0, Ll/ۘ᩹ܺ;->֫֫:Ljava/util/AbstractQueue;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 3202
    iget-object v0, p0, Ll/ۘ᩹ܺ;->᩸:Ljava/util/AbstractQueue;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ll/᩻᩶ܺ;J)V
    .locals 1

    .line 2460
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    .line 357
    invoke-virtual {v0}, Ll/ܳ᩶ܺ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2461
    invoke-interface {p1, p2, p3}, Ll/᩻᩶ܺ;->֫(J)V

    .line 2463
    :cond_0
    iget-object p2, p0, Ll/ۘ᩹ܺ;->᩸:Ljava/util/AbstractQueue;

    invoke-interface {p2, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 2366
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2368
    :try_start_0
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ۧ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2370
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 2371
    throw v0

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 11

    .line 2781
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2782
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    if-lt v1, v2, :cond_0

    return-void

    .line 2797
    :cond_0
    iget v2, p0, Ll/ۘ᩹ܺ;->᩹:I

    shl-int/lit8 v3, v1, 0x1

    .line 1985
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    .line 2799
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v3

    mul-int/lit8 v3, v3, 0x3

    div-int/lit8 v3, v3, 0x4

    iput v3, p0, Ll/ۘ᩹ܺ;->᩺:I

    .line 2800
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_6

    .line 2804
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩻᩶ܺ;

    if-eqz v6, :cond_5

    .line 2807
    invoke-interface {v6}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v7

    .line 2808
    invoke-interface {v6}, Ll/᩻᩶ܺ;->getHash()I

    move-result v8

    and-int/2addr v8, v3

    if-nez v7, :cond_1

    .line 2812
    invoke-virtual {v4, v8, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    goto :goto_4

    :cond_1
    move-object v9, v6

    :goto_1
    if-eqz v7, :cond_3

    .line 2820
    invoke-interface {v7}, Ll/᩻᩶ܺ;->getHash()I

    move-result v10

    and-int/2addr v10, v3

    if-eq v10, v8, :cond_2

    move-object v9, v7

    move v8, v10

    .line 2819
    :cond_2
    invoke-interface {v7}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v7

    goto :goto_1

    .line 2827
    :cond_3
    invoke-virtual {v4, v8, v9}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    :goto_2
    if-eq v6, v9, :cond_5

    .line 2831
    invoke-interface {v6}, Ll/᩻᩶ܺ;->getHash()I

    move-result v7

    and-int/2addr v7, v3

    .line 2832
    invoke-virtual {v4, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩻᩶ܺ;

    .line 2833
    invoke-virtual {p0, v6, v8}, Ll/ۘ᩹ܺ;->֫(Ll/᩻᩶ܺ;Ll/᩻᩶ܺ;)Ll/᩻᩶ܺ;

    move-result-object v8

    if-eqz v8, :cond_4

    .line 2835
    invoke-virtual {v4, v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    goto :goto_3

    .line 2837
    :cond_4
    invoke-virtual {p0, v6}, Ll/ۘ᩹ܺ;->ۧ(Ll/᩻᩶ܺ;)V

    add-int/lit8 v2, v2, -0x1

    .line 2830
    :goto_3
    invoke-interface {v6}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v6

    goto :goto_2

    :cond_5
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 2844
    :cond_6
    iput-object v4, p0, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 2845
    iput v2, p0, Ll/ۘ᩹ܺ;->᩹:I

    return-void
.end method

.method public final ܽ(Ll/᩻᩶ܺ;J)V
    .locals 1

    .line 2445
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    .line 357
    invoke-virtual {v0}, Ll/ܳ᩶ܺ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2446
    invoke-interface {p1, p2, p3}, Ll/᩻᩶ܺ;->֫(J)V

    .line 2448
    :cond_0
    iget-object p2, p0, Ll/ۘ᩹ܺ;->ۤ:Ljava/util/AbstractQueue;

    invoke-interface {p2, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 3397
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1835
    :goto_0
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v1, v0, Ll/ܳ᩶ܺ;->֫֫:Ljava/util/AbstractQueue;

    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴ᩶ܺ;

    if-eqz v1, :cond_0

    .line 1837
    :try_start_0
    iget-object v0, v0, Ll/ܳ᩶ܺ;->۟:Ll/ۘ᩶ܺ;

    invoke-interface {v0, v1}, Ll/ۘ᩶ܺ;->֫(Ll/ᩴ᩶ܺ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 1839
    sget-object v1, Ll/ܳ᩶ܺ;->ܺ֫:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v3, "Exception thrown by removal listener"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 3356
    iget-object v0, p0, Ll/ۘ᩹ܺ;->۫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    and-int/lit8 v0, v0, 0x3f

    if-nez v0, :cond_0

    .line 3378
    iget-object v0, p0, Ll/ۘ᩹ܺ;->ۙ:Ll/ܳ᩶ܺ;

    iget-object v0, v0, Ll/ܳ᩶ܺ;->ܿ֫:Ll/ᩳ᩸ܺ;

    invoke-virtual {v0}, Ll/ᩳ᩸ܺ;->֫()J

    move-result-wide v0

    .line 3379
    invoke-virtual {p0, v0, v1}, Ll/ۘ᩹ܺ;->ۧ(J)V

    .line 3380
    invoke-virtual {p0}, Ll/ۘ᩹ܺ;->ܿ()V

    :cond_0
    return-void
.end method
