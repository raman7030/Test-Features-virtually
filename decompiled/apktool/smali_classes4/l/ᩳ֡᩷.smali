.class public final Ll/ᩳ֡᩷;
.super Ljava/lang/Object;
.source "6AY4"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:J

.field public ܳ:J

.field public final ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public volatile ܿ:Z

.field public final ᩳ:Ljava/lang/Object;

.field public final synthetic ᩻:Ll/᩵֡᩷;


# direct methods
.method public constructor <init>(Ll/᩵֡᩷;)V
    .locals 1

    .line 1987
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ֡᩷;->᩻:Ll/᩵֡᩷;

    .line 1990
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Ll/ᩳ֡᩷;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1993
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ֡᩷;->ᩳ:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/᩵֡᩷;Ll/ᩳ֡᩷;)V
    .locals 11

    .line 2009
    invoke-virtual {p0}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v1

    const-string v0, "<get-lifecycle>(...)"

    invoke-static {v1, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2010
    sget-object v2, Ll/᩷ۧ᩻;->ܿ:Ll/᩷ۧ᩻;

    .line 2012
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v3, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v3, :cond_1

    goto/16 :goto_5

    .line 2016
    :cond_1
    :try_start_0
    invoke-static {p0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ll/ۖۢۡ;->ܿ()Z

    move-result v0

    const-wide/16 v4, 0x32

    if-nez v0, :cond_16

    iget-boolean v0, p1, Ll/ᩳ֡᩷;->ܿ:Z

    if-nez v0, :cond_16

    .line 2017
    invoke-virtual {v1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v6, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {v0, v6}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_7

    .line 2022
    :cond_2
    invoke-static {p0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ll/ۖۢۡ;->֫()I

    move-result v0

    .line 2023
    invoke-static {p0}, Ll/᩵֡᩷;->ܺ(Ll/᩵֡᩷;)Ljava/util/List;

    move-result-object v6

    .line 2024
    iget-object v7, p1, Ll/ᩳ֡᩷;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v7

    if-ltz v0, :cond_14

    .line 2025
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    if-lt v0, v8, :cond_3

    goto/16 :goto_6

    .line 2029
    :cond_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    move v5, v0

    :goto_1
    if-ge v5, v4, :cond_b

    .line 2030
    invoke-static {p0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-virtual {v8}, Ll/ۖۢۡ;->ܿ()Z

    move-result v8

    if-nez v8, :cond_0

    iget-boolean v8, p1, Ll/ᩳ֡᩷;->ܿ:Z

    if-nez v8, :cond_0

    iget-object v8, p1, Ll/ᩳ֡᩷;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v8

    if-eq v7, v8, :cond_4

    goto :goto_0

    .line 2033
    :cond_4
    invoke-static {p0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Ll/ۖۢۡ;->֫()I

    move-result v8

    if-eq v0, v8, :cond_5

    goto :goto_0

    .line 2036
    :cond_5
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩳۜܳ;

    .line 2037
    invoke-interface {v8}, Ll/ᩳۜܳ;->᩹֫()I

    move-result v9

    if-eqz v9, :cond_7

    .line 2039
    invoke-virtual {v2, v3, v8, v9}, Ll/᩷ۧ᩻;->֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;

    move-result-object v9

    const-string v10, "loadDataIcon(...)"

    invoke-static {v9, v10}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2040
    invoke-interface {v8, v9}, Ll/ᩳۜܳ;->֫(Ll/ۨܺ᩷;)V

    .line 2041
    invoke-static {p0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v9

    if-eqz v9, :cond_6

    new-instance v10, Ll/ܽ֡᩷;

    invoke-direct {v10, p1, v8}, Ll/ܽ֡᩷;-><init>(Ll/ᩳ֡᩷;Ll/ᩳۜܳ;)V

    invoke-virtual {v9, v10}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :cond_6
    const-string v0, "recyclerView"

    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v3

    .line 2043
    :cond_7
    :goto_2
    invoke-virtual {v1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v8

    sget-object v9, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v8, v9, :cond_8

    goto/16 :goto_5

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_9
    const-string v0, "recyclerView"

    .line 2033
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v3

    :cond_a
    const-string v0, "recyclerView"

    .line 2030
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v3

    :cond_b
    const/4 v4, 0x0

    :goto_3
    if-ge v4, v0, :cond_13

    .line 2048
    invoke-static {p0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v5

    if-eqz v5, :cond_12

    invoke-virtual {v5}, Ll/ۖۢۡ;->ܿ()Z

    move-result v5

    if-nez v5, :cond_0

    iget-boolean v5, p1, Ll/ᩳ֡᩷;->ܿ:Z

    if-nez v5, :cond_0

    iget-object v5, p1, Ll/ᩳ֡᩷;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    if-eq v7, v5, :cond_c

    goto/16 :goto_0

    .line 2051
    :cond_c
    invoke-static {p0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v5

    if-eqz v5, :cond_11

    invoke-virtual {v5}, Ll/ۖۢۡ;->֫()I

    move-result v5

    if-eq v0, v5, :cond_d

    goto/16 :goto_0

    .line 2054
    :cond_d
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۜܳ;

    .line 2055
    invoke-interface {v5}, Ll/ᩳۜܳ;->᩹֫()I

    move-result v8

    if-eqz v8, :cond_f

    .line 2057
    invoke-virtual {v2, v3, v5, v8}, Ll/᩷ۧ᩻;->֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;

    move-result-object v8

    const-string v9, "loadDataIcon(...)"

    invoke-static {v8, v9}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2058
    invoke-interface {v5, v8}, Ll/ᩳۜܳ;->֫(Ll/ۨܺ᩷;)V

    .line 2059
    invoke-static {p0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v8

    if-eqz v8, :cond_e

    new-instance v9, Ll/᩺ۚ᩷;

    const/4 v10, 0x1

    invoke-direct {v9, p1, v5, v10}, Ll/᩺ۚ᩷;-><init>(Ljava/lang/Object;Ljava/lang/Cloneable;I)V

    invoke-virtual {v8, v9}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    :cond_e
    const-string v0, "recyclerView"

    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v3

    .line 2061
    :cond_f
    :goto_4
    invoke-virtual {v1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v5

    sget-object v8, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v5, v8, :cond_10

    goto :goto_5

    :cond_10
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_11
    const-string v0, "recyclerView"

    .line 2051
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v3

    :cond_12
    const-string v0, "recyclerView"

    .line 2048
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v3

    .line 2067
    :cond_13
    iget-object v0, p1, Ll/ᩳ֡᩷;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ne v7, v0, :cond_0

    .line 2068
    iget-object v0, p1, Ll/ᩳ֡᩷;->ᩳ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, p1, Ll/ᩳ֡᩷;->ᩳ:Ljava/lang/Object;

    const-wide/16 v4, 0x3e8

    invoke-virtual {v3, v4, v5}, Ljava/lang/Object;->wait(J)V

    sget-object v3, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    .line 2069
    invoke-virtual {v1}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v3, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v3, :cond_13

    :goto_5
    return-void

    :catchall_0
    move-exception v3

    .line 2068
    monitor-exit v0

    throw v3

    .line 2026
    :cond_14
    :goto_6
    invoke-static {v4, v5}, Landroid/os/SystemClock;->sleep(J)V

    goto/16 :goto_0

    :cond_15
    const-string v0, "recyclerView"

    .line 2022
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v3

    .line 2019
    :cond_16
    :goto_7
    invoke-static {v4, v5}, Landroid/os/SystemClock;->sleep(J)V

    goto/16 :goto_0

    :cond_17
    const-string v0, "recyclerView"

    .line 2016
    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    nop

    goto/16 :goto_0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 2000
    iget-object v0, p0, Ll/ᩳ֡᩷;->᩻:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۖۢۡ;->֫()I

    move-result v0

    return v0

    :cond_0
    const-string v0, "recyclerView"

    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 2002
    iget-object v0, p0, Ll/ᩳ֡᩷;->᩻:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ۖۢۡ;->ۧ(I)V

    return-void

    :cond_0
    const-string p1, "recyclerView"

    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    .line 2176
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-eqz p2, :cond_7

    .line 2169
    iget-object v2, p0, Ll/ᩳ֡᩷;->᩻:Ll/᩵֡᩷;

    invoke-static {v2}, Ll/᩵֡᩷;->ܺ(Ll/᩵֡᩷;)Ljava/util/List;

    move-result-object v3

    const-string v4, "<this>"

    .line 0
    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1671
    new-instance v4, Ll/ᩴܶ᩵;

    new-instance v5, Ll/ۜܶ᩵;

    invoke-direct {v5, v3}, Ll/ۜܶ᩵;-><init>(Ljava/util/List;)V

    invoke-direct {v4, v5}, Ll/ᩴܶ᩵;-><init>(Ll/ۜܶ᩵;)V

    .line 296
    invoke-virtual {v4}, Ll/ᩴܶ᩵;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    move-object v4, v3

    check-cast v4, Ll/᩵ܶ᩵;

    invoke-virtual {v4}, Ll/᩵ܶ᩵;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ll/᩵ܶ᩵;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ll/ۘܶ᩵;

    invoke-virtual {v5}, Ll/ۘܶ᩵;->֫()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۜܳ;

    .line 2170
    invoke-interface {v5}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v5}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_1
    move-object v4, v6

    .line 2169
    :goto_0
    check-cast v4, Ll/ۘܶ᩵;

    if-eqz v4, :cond_2

    .line 2171
    invoke-virtual {v4}, Ll/ۘܶ᩵;->ۧ()I

    move-result v0

    .line 2004
    :cond_2
    invoke-static {v2}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ll/ۖۢۡ;->ܽ()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x5

    if-ge v3, v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x5

    :goto_1
    if-nez p1, :cond_4

    .line 2174
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    if-ge v0, v2, :cond_8

    goto :goto_2

    .line 2178
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lt v0, v3, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v3, v2

    if-gt v3, v0, :cond_8

    .line 2179
    :cond_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    if-ge v0, v2, :cond_8

    goto :goto_2

    :cond_6
    const-string p1, "recyclerView"

    .line 2004
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v6

    :cond_7
    if-nez p1, :cond_8

    :goto_2
    move-object p1, v1

    .line 2187
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ᩳ֡᩷;->֫(I)V

    if-eqz p2, :cond_9

    .line 2189
    iput-object p2, p0, Ll/ᩳ֡᩷;->֫:Ljava/lang/String;

    .line 2190
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ᩳ֡᩷;->ۧ:J

    :cond_9
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 6

    const-string v0, "name"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2195
    iget-object v0, p0, Ll/ᩳ֡᩷;->᩻:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->ܺ(Ll/᩵֡᩷;)Ljava/util/List;

    move-result-object v1

    .line 364
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, -0x1

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 365
    check-cast v4, Ll/ᩳۜܳ;

    .line 2195
    invoke-interface {v4}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, -0x1

    :goto_1
    if-ne v3, v5, :cond_2

    return-void

    .line 2200
    :cond_2
    invoke-static {v0}, Ll/᩵֡᩷;->ܺ(Ll/᩵֡᩷;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۜܳ;

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ll/ᩳۜܳ;->ۧ(Z)V

    .line 2201
    invoke-static {v0}, Ll/᩵֡᩷;->ܳ(Ll/᩵֡᩷;)Ll/۫᩵᩷;

    move-result-object p1

    const/4 v4, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p1, v3}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    .line 2203
    invoke-virtual {p0}, Ll/ᩳ֡᩷;->֫()I

    move-result p1

    .line 2004
    invoke-static {v0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ll/ۖۢۡ;->ܽ()I

    move-result v0

    sub-int/2addr v0, v1

    const/4 v1, 0x5

    if-ge v1, v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x5

    :goto_2
    if-lt v3, p1, :cond_5

    add-int v1, p1, v0

    if-gt v1, v3, :cond_4

    goto :goto_3

    :cond_4
    move v2, p1

    goto :goto_4

    :cond_5
    :goto_3
    if-ge v3, v0, :cond_6

    goto :goto_4

    :cond_6
    move v2, v3

    .line 2211
    :goto_4
    invoke-virtual {p0, v2}, Ll/ᩳ֡᩷;->֫(I)V

    return-void

    :cond_7
    const-string p1, "recyclerView"

    .line 2004
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v4

    :cond_8
    const-string p1, "adapter"

    .line 2201
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v4
.end method

.method public final ֫(Ll/ۤ᩵᩷;)V
    .locals 8

    const-string v0, "holder"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ᩳ֡᩷;->ܳ:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    const/4 v4, 0x2

    cmp-long v5, v0, v2

    if-gez v5, :cond_0

    .line 2111
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 2112
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    new-array v1, v4, [F

    fill-array-data v1, :array_0

    invoke-static {v0, v1}, Ll/ܿ֡ۘ;->֫(Ljava/lang/Object;[F)Ll/ܿ֡ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ֡ۘ;->ܳ()V

    .line 2114
    :cond_0
    iget-object v0, p0, Ll/ᩳ֡᩷;->֫:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2116
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v5, p0, Ll/ᩳ֡᩷;->ۧ:J

    sub-long/2addr v2, v5

    const-wide/16 v5, 0x320

    cmp-long v7, v2, v5

    if-lez v7, :cond_1

    move-object v0, v1

    :cond_1
    if-eqz v0, :cond_3

    .line 2122
    invoke-virtual {p1}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object v2

    .line 2123
    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 169
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2125
    sget v0, Ll/᩹֡᩷;->ܳ֫:I

    const v2, 0x20ffffff

    const v3, 0x24ffffff

    invoke-static {v2, v3}, Ll/᩹֡᩷;->֫(II)I

    move-result v2

    and-int/2addr v0, v2

    .line 28
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 2130
    new-instance v5, Landroid/graphics/drawable/TransitionDrawable;

    new-array v4, v4, [Landroid/graphics/drawable/Drawable;

    aput-object v2, v4, v3

    const/4 v2, 0x1

    aput-object v0, v4, v2

    invoke-direct {v5, v4}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 2131
    invoke-virtual {v5, v2}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    .line 2132
    invoke-virtual {p1}, Ll/ۤ᩵᩷;->֫()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 p1, 0x384

    .line 2133
    invoke-virtual {v5, p1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 2134
    iput-object v1, p0, Ll/ᩳ֡᩷;->֫:Ljava/lang/String;

    return-void

    .line 2135
    :cond_2
    invoke-virtual {p1}, Ll/ۤ᩵᩷;->֫()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 2136
    invoke-virtual {p1}, Ll/ۤ᩵᩷;->֫()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final ֫(Ll/ᩳۜܳ;)V
    .locals 9

    .line 2081
    iget-object v0, p0, Ll/ᩳ֡᩷;->᩻:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "recyclerView"

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_4

    .line 2082
    invoke-static {v0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 2084
    invoke-static {v0}, Ll/᩵֡᩷;->ᩴ(Ll/᩵֡᩷;)Ll/ۖۢۡ;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v7, v6}, Ll/۬۬ۧ;->getChildViewHolder(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v6

    const-string v7, "null cannot be cast to non-null type bin.mt.plus.FilePickerActivity.FileListHolder"

    invoke-static {v6, v7}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ll/ۤ᩵᩷;

    .line 2085
    invoke-interface {p1}, Ll/ᩳۜܳ;->getIcon()Ll/ۨܺ᩷;

    move-result-object v7

    .line 2086
    invoke-virtual {v6}, Ll/ۤ᩵᩷;->ۧ()Ll/ᩳۜܳ;

    move-result-object v8

    if-ne v8, p1, :cond_2

    if-eqz v7, :cond_2

    .line 2087
    invoke-virtual {v6}, Ll/ۤ᩵᩷;->ܽ()Landroid/widget/ImageView;

    move-result-object p1

    .line 2088
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 28
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 2090
    :cond_0
    new-instance v1, Landroid/graphics/drawable/TransitionDrawable;

    .line 2093
    invoke-virtual {v7}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    .line 2090
    invoke-direct {v1, v3}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 2096
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    .line 2097
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 p1, 0x12c

    .line 2098
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    return-void

    .line 2084
    :cond_1
    invoke-static {v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 2082
    :cond_3
    invoke-static {v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    :cond_4
    return-void

    .line 2081
    :cond_5
    invoke-static {v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2
.end method

.method public final ֫(Z)V
    .locals 4

    const/4 v0, 0x1

    .line 2143
    iput-boolean v0, p0, Ll/ᩳ֡᩷;->ܿ:Z

    .line 2144
    iget-object v0, p0, Ll/ᩳ֡᩷;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 2146
    sget-object v0, Ll/᩷ۧ᩻;->ܿ:Ll/᩷ۧ᩻;

    .line 2147
    iget-object v1, p0, Ll/ᩳ֡᩷;->᩻:Ll/᩵֡᩷;

    invoke-static {v1}, Ll/᩵֡᩷;->ܺ(Ll/᩵֡᩷;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 2148
    invoke-interface {v2}, Ll/ᩳۜܳ;->getIcon()Ll/ۨܺ᩷;

    move-result-object v3

    if-nez v3, :cond_0

    .line 2149
    invoke-virtual {v0, v2}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->֫(Ll/᩶ۖܳ;)V

    .line 2150
    invoke-virtual {v0, v2}, Ll/᩷ۧ᩻;->ۧ(Ll/ᩳۜܳ;)I

    move-result v3

    if-eqz v3, :cond_0

    .line 2152
    invoke-interface {v2, v3}, Ll/ᩳۜܳ;->ۧ(I)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 2157
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ᩳ֡᩷;->ܳ:J

    .line 2159
    :cond_2
    iget-object p1, p0, Ll/ᩳ֡᩷;->᩻:Ll/᩵֡᩷;

    invoke-static {p1}, Ll/᩵֡᩷;->ܳ(Ll/᩵֡᩷;)Ll/۫᩵᩷;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    const/4 p1, 0x0

    .line 2160
    iput-boolean p1, p0, Ll/ᩳ֡᩷;->ܿ:Z

    .line 2161
    iget-object p1, p0, Ll/ᩳ֡᩷;->ᩳ:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 2162
    :try_start_0
    iget-object p1, p0, Ll/ᩳ֡᩷;->ᩳ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 2163
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2161
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_3
    const-string p1, "adapter"

    .line 2159
    invoke-static {p1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
