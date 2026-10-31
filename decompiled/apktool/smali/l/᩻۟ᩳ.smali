.class public final Ll/᩻۟ᩳ;
.super Ljava/lang/Object;
.source "Z6PS"


# instance fields
.field public final ֫:Ll/ܿܰᩳ;

.field public final ۖ:I

.field public final ۘ:Ll/ۤܽᩴ;

.field public final ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۡ:Z

.field public final ۢ:Ll/ᩳܰᩳ;

.field public final ۧ:Ll/ܳܰᩳ;

.field public ܳ:F

.field public ܺ:[I

.field public final ܽ:Ljava/util/concurrent/atomic/AtomicReference;

.field public ܿ:I

.field public final ᩳ:Ll/᩷۟ᩳ;

.field public final ᩷:Ll/ܳ۟ᩳ;

.field public final ᩻:Ll/ۢ۫ۡ;


# direct methods
.method public constructor <init>(Ll/ᩳܰᩳ;Ll/᩷۟ᩳ;Ll/ۤܽᩴ;Ll/ۢ۫ۡ;ILl/ܳ۟ᩳ;ZLl/ܿܰᩳ;Ll/ܳܰᩳ;)V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/᩻۟ᩳ;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/᩻۟ᩳ;->ܽ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 53
    iput-object p1, p0, Ll/᩻۟ᩳ;->ۢ:Ll/ᩳܰᩳ;

    .line 54
    iput-object p2, p0, Ll/᩻۟ᩳ;->ᩳ:Ll/᩷۟ᩳ;

    .line 55
    iput-object p3, p0, Ll/᩻۟ᩳ;->ۘ:Ll/ۤܽᩴ;

    .line 56
    iput-object p4, p0, Ll/᩻۟ᩳ;->᩻:Ll/ۢ۫ۡ;

    .line 57
    iput p5, p0, Ll/᩻۟ᩳ;->ۖ:I

    iput p5, p0, Ll/᩻۟ᩳ;->ܿ:I

    .line 58
    iput-object p6, p0, Ll/᩻۟ᩳ;->᩷:Ll/ܳ۟ᩳ;

    .line 59
    iput-boolean p7, p0, Ll/᩻۟ᩳ;->ۡ:Z

    .line 60
    invoke-virtual {p3, p5}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result p1

    iput p1, p0, Ll/᩻۟ᩳ;->ܳ:F

    .line 61
    iput-object p8, p0, Ll/᩻۟ᩳ;->֫:Ll/ܿܰᩳ;

    .line 62
    iput-object p9, p0, Ll/᩻۟ᩳ;->ۧ:Ll/ܳܰᩳ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩻۟ᩳ;)V
    .locals 0

    .line 105
    iget-object p0, p0, Ll/᩻۟ᩳ;->֫:Ll/ܿܰᩳ;

    invoke-virtual {p0}, Ll/ܿܰᩳ;->getAsBoolean()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    invoke-direct {p0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw p0
.end method

.method public static ֫(Ll/᩻۟ᩳ;II)V
    .locals 7

    .line 102
    :try_start_0
    iget-object v0, p0, Ll/᩻۟ᩳ;->֫:Ll/ܿܰᩳ;

    invoke-virtual {v0}, Ll/ܿܰᩳ;->getAsBoolean()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Ll/᩻۟ᩳ;->ܽ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    .line 103
    :cond_0
    iget-object v0, p0, Ll/᩻۟ᩳ;->ۢ:Ll/ᩳܰᩳ;

    iget-object v0, v0, Ll/ᩳܰᩳ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۖܰᩳ;

    invoke-virtual {v0}, Ll/ۗۤᩳ;->᩹()Ll/۟᩸ᩳ;

    move-result-object v1
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 104
    :try_start_1
    new-instance v0, Ll/ܿ۟ᩳ;

    invoke-direct {v0, p0}, Ll/ܿ۟ᩳ;-><init>(Ll/᩻۟ᩳ;)V

    invoke-virtual {v1, v0}, Ll/۟᩸ᩳ;->ۧ(Ljava/lang/Runnable;)V

    .line 107
    new-instance v2, Ll/᩷۫ۡ;

    invoke-direct {v2, v1}, Ll/᩷۫ۡ;-><init>(Ll/۟᩸ᩳ;)V

    .line 108
    iget-object v0, p0, Ll/᩻۟ᩳ;->ᩳ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v3

    :goto_0
    if-ge p1, p2, :cond_9

    .line 110
    iget-object v0, p0, Ll/᩻۟ᩳ;->ܺ:[I

    if-nez v0, :cond_1

    move v4, p1

    goto :goto_1

    :cond_1
    aget v0, v0, p1

    move v4, v0

    .line 111
    :goto_1
    iget-object v0, p0, Ll/᩻۟ᩳ;->֫:Ll/ܿܰᩳ;

    invoke-virtual {v0}, Ll/ܿܰᩳ;->getAsBoolean()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/᩻۟ᩳ;->ܽ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_3

    .line 112
    :cond_2
    iget v0, p0, Ll/᩻۟ᩳ;->ۖ:I

    const/4 v5, 0x0

    if-eq v4, v0, :cond_3

    iget-object v0, p0, Ll/᩻۟ᩳ;->᩷:Ll/ܳ۟ᩳ;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v4}, Ll/ܳ۟ᩳ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Ll/᩻۟ᩳ;->ۘ:Ll/ۤܽᩴ;

    invoke-virtual {v0, v4}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v0

    cmpl-float v0, v0, v5

    if-ltz v0, :cond_4

    goto :goto_2

    .line 113
    :cond_4
    iget-boolean v0, p0, Ll/᩻۟ᩳ;->ۡ:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/᩻۟ᩳ;->ۘ:Ll/ۤܽᩴ;

    invoke-virtual {v0, v4}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v0

    cmpl-float v0, v0, v5

    if-ltz v0, :cond_5

    goto :goto_2

    .line 114
    :cond_5
    invoke-virtual {v3, v4}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v0

    iget-object v5, p0, Ll/᩻۟ᩳ;->᩻:Ll/ۢ۫ۡ;

    invoke-virtual {v0, v2, v5}, Ll/ۨܰᩳ;->֫(Ljava/lang/CharSequence;Ll/ۢ۫ۡ;)F

    move-result v5

    .line 115
    iget-object v0, p0, Ll/᩻۟ᩳ;->֫:Ll/ܿܰᩳ;

    invoke-virtual {v0}, Ll/ܿܰᩳ;->getAsBoolean()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_6

    .line 124
    :try_start_2
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 130
    invoke-direct {p0}, Ll/᩻۟ᩳ;->ܽ()V

    return-void

    .line 116
    :cond_6
    :try_start_3
    iget-object v0, p0, Ll/᩻۟ᩳ;->ۘ:Ll/ۤܽᩴ;

    invoke-virtual {v0, v5, v4}, Ll/ۤܽᩴ;->֫(FI)F

    move-object v0, p0

    .line 117
    monitor-enter v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 118
    :try_start_4
    iget v6, p0, Ll/᩻۟ᩳ;->ܳ:F

    cmpl-float v6, v5, v6

    if-lez v6, :cond_7

    .line 119
    iput v5, p0, Ll/᩻۟ᩳ;->ܳ:F

    .line 120
    iput v4, p0, Ll/᩻۟ᩳ;->ܿ:I

    .line 122
    :cond_7
    monitor-exit v0

    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 124
    :cond_8
    :goto_3
    :try_start_6
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 130
    invoke-direct {p0}, Ll/᩻۟ᩳ;->ܽ()V

    return-void

    .line 124
    :cond_9
    :try_start_7
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 130
    invoke-direct {p0}, Ll/᩻۟ᩳ;->ܽ()V

    return-void

    :catchall_1
    move-exception p1

    .line 103
    :try_start_8
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception p2

    :try_start_9
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 130
    :cond_a
    :goto_5
    invoke-direct {p0}, Ll/᩻۟ᩳ;->ܽ()V

    return-void

    :catchall_3
    move-exception p1

    goto :goto_7

    :catch_0
    move-exception p1

    goto :goto_6

    :catch_1
    move-exception p1

    .line 128
    :goto_6
    :try_start_a
    iget-object p2, p0, Ll/᩻۟ᩳ;->ܽ:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_b
    const/4 v0, 0x0

    .line 0
    invoke-virtual {p2, v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    if-eqz v0, :cond_b

    goto :goto_8

    .line 130
    :goto_7
    invoke-direct {p0}, Ll/᩻۟ᩳ;->ܽ()V

    .line 131
    throw p1

    .line 130
    :catch_2
    :goto_8
    invoke-direct {p0}, Ll/᩻۟ᩳ;->ܽ()V

    return-void
.end method

.method private ܽ()V
    .locals 1

    .line 135
    iget-object v0, p0, Ll/᩻۟ᩳ;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 136
    iget-object v0, p0, Ll/᩻۟ᩳ;->ۧ:Ll/ܳܰᩳ;

    invoke-virtual {v0}, Ll/ܳܰᩳ;->run()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Throwable;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/᩻۟ᩳ;->ܽ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    return-object v0
.end method

.method public final ֫(Ljava/util/concurrent/Executor;I)V
    .locals 5

    .line 80
    iget-object v0, p0, Ll/᩻۟ᩳ;->ܺ:[I

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩻۟ᩳ;->ᩳ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    array-length v0, v0

    :goto_0
    const/4 v1, 0x1

    .line 81
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    div-int p2, v0, p2

    add-int/2addr p2, v1

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    sub-int v2, v0, v1

    .line 85
    :try_start_0
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/2addr v2, v1

    .line 87
    iget-object v3, p0, Ll/᩻۟ᩳ;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    :try_start_1
    new-instance v3, Ll/ᩳ۟ᩳ;

    invoke-direct {v3, p0, v1, v2}, Ll/ᩳ۟ᩳ;-><init>(Ll/᩻۟ᩳ;II)V

    invoke-interface {p1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catch_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 91
    :goto_2
    :try_start_2
    iget-object v3, p0, Ll/᩻۟ᩳ;->ܽ:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_1
    const/4 v4, 0x0

    .line 0
    invoke-virtual {v3, v4, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 92
    :goto_3
    invoke-direct {p0}, Ll/᩻۟ᩳ;->ܽ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    move v1, v2

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 96
    invoke-direct {p0}, Ll/᩻۟ᩳ;->ܽ()V

    .line 97
    throw p1

    .line 96
    :cond_3
    invoke-direct {p0}, Ll/᩻۟ᩳ;->ܽ()V

    return-void
.end method

.method public final ֫([I)V
    .locals 0

    .line 67
    iput-object p1, p0, Ll/᩻۟ᩳ;->ܺ:[I

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 141
    iget v0, p0, Ll/᩻۟ᩳ;->ܿ:I

    return v0
.end method
