.class public final Ll/ܺܰᩳ;
.super Ljava/lang/Object;
.source "Q5YY"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ۗ:Ll/۟᩺ᩳ;

.field public final ۙ:[Ll/ۨܰᩳ;

.field public final ۛ:I

.field public final synthetic ۤ:Ll/ۖܰᩳ;

.field public final ۫:[F

.field public final ۬:Ll/ۢ۫ۡ;

.field public final ᩶:[I

.field public volatile ᩸:Z

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/ۖܰᩳ;[I[Ll/ۨܰᩳ;)V
    .locals 1

    .line 505
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    .line 497
    iget-object v0, p1, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    iput-object v0, p0, Ll/ܺܰᩳ;->ۗ:Ll/۟᩺ᩳ;

    .line 498
    invoke-virtual {p1}, Ll/ۗۤᩳ;->۫()I

    move-result v0

    iput v0, p0, Ll/ܺܰᩳ;->ۛ:I

    invoke-static {p1}, Ll/ۖܰᩳ;->ۧ(Ll/ۖܰᩳ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iput v0, p0, Ll/ܺܰᩳ;->᩹:I

    .line 506
    iput-object p2, p0, Ll/ܺܰᩳ;->᩶:[I

    .line 507
    iput-object p3, p0, Ll/ܺܰᩳ;->ۙ:[Ll/ۨܰᩳ;

    .line 508
    array-length p2, p2

    new-array p2, p2, [F

    iput-object p2, p0, Ll/ܺܰᩳ;->۫:[F

    .line 509
    iget-object p2, p1, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    move-object v0, p2

    monitor-enter v0

    :try_start_0
    iget-object p1, p1, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {p1}, Ll/ۢ۫ۡ;->ۧ()Ll/ۢ۫ۡ;

    move-result-object p1

    iput-object p1, p0, Ll/ܺܰᩳ;->۬:Ll/ۢ۫ۡ;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ֫()V
    .locals 2

    .line 513
    iget-boolean v0, p0, Ll/ܺܰᩳ;->᩸:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    iget-boolean v0, v0, Ll/ۗۤᩳ;->ܳ֫:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܺܰᩳ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    iget v1, p0, Ll/ܺܰᩳ;->ۛ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܺܰᩳ;->᩹:I

    iget-object v1, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-static {v1}, Ll/ۖܰᩳ;->ۧ(Ll/ۖܰᩳ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    .line 514
    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0
.end method

.method public static synthetic ֫(Ll/ܺܰᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܺܰᩳ;->֫()V

    return-void
.end method

.method public static ֫(Ll/ܺܰᩳ;Z)V
    .locals 3

    .line 543
    iget-object v0, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-static {v0}, Ll/ۖܰᩳ;->ܽ(Ll/ۖܰᩳ;)Ll/ܺܰᩳ;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto/16 :goto_2

    .line 544
    :cond_0
    iget-object v0, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-static {v0}, Ll/ۖܰᩳ;->ܳ(Ll/ۖܰᩳ;)V

    .line 545
    iget-object v0, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    iget-object v1, v0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    iget-object v1, v1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    if-ne v1, v0, :cond_7

    iget-object v1, v0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    iget-object v2, p0, Ll/ܺܰᩳ;->ۗ:Ll/۟᩺ᩳ;

    if-ne v1, v2, :cond_7

    iget-boolean v0, v0, Ll/ۗۤᩳ;->ܳ֫:Z

    if-eqz v0, :cond_1

    goto/16 :goto_2

    .line 546
    :cond_1
    iget-boolean v0, p0, Ll/ܺܰᩳ;->᩸:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-virtual {v0}, Ll/ۗۤᩳ;->֡()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-virtual {v0}, Ll/ۗۤᩳ;->۫()I

    move-result v0

    iget v1, p0, Ll/ܺܰᩳ;->ۛ:I

    if-ne v0, v1, :cond_6

    iget v0, p0, Ll/ܺܰᩳ;->᩹:I

    iget-object v1, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-static {v1}, Ll/ۖܰᩳ;->ۧ(Ll/ۖܰᩳ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-eq v0, v1, :cond_2

    goto :goto_1

    :cond_2
    if-nez p1, :cond_3

    goto :goto_2

    .line 551
    :cond_3
    iget-object p1, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-static {p1}, Ll/ۖܰᩳ;->ᩳ(Ll/ۖܰᩳ;)Ll/ܽ۟ᩳ;

    move-result-object p1

    if-nez p1, :cond_4

    iget-object p1, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-static {p1}, Ll/ۖܰᩳ;->ܿ(Ll/ۖܰᩳ;)Ll/ۤܽᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ܽ۟ᩳ;->֫(Ll/ۤܽᩴ;)Ll/ܽ۟ᩳ;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۖܰᩳ;->֫(Ll/ۖܰᩳ;Ll/ܽ۟ᩳ;)V

    :cond_4
    const/4 p1, 0x0

    .line 552
    :goto_0
    iget-object v0, p0, Ll/ܺܰᩳ;->᩶:[I

    array-length v0, v0

    if-ge p1, v0, :cond_5

    .line 553
    iget-object v0, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-static {v0}, Ll/ۖܰᩳ;->ܿ(Ll/ۖܰᩳ;)Ll/ۤܽᩴ;

    move-result-object v0

    iget-object v1, p0, Ll/ܺܰᩳ;->᩶:[I

    aget v1, v1, p1

    iget-object v2, p0, Ll/ܺܰᩳ;->۫:[F

    aget v2, v2, p1

    invoke-virtual {v0, v2, v1}, Ll/ۤܽᩴ;->֫(FI)F

    .line 554
    iget-object v0, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-static {v0}, Ll/ۖܰᩳ;->ᩳ(Ll/ۖܰᩳ;)Ll/ܽ۟ᩳ;

    move-result-object v0

    iget-object v1, p0, Ll/ܺܰᩳ;->᩶:[I

    aget v1, v1, p1

    invoke-virtual {v0, v1}, Ll/ܽ۟ᩳ;->֫(I)V

    .line 555
    iget-object v0, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-static {v0}, Ll/ۖܰᩳ;->֫(Ll/ۖܰᩳ;)F

    move-result v1

    iget-object v2, p0, Ll/ܺܰᩳ;->۫:[F

    aget v2, v2, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v0, v1}, Ll/ۖܰᩳ;->֫(Ll/ۖܰᩳ;F)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 557
    :cond_5
    iget-object p1, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    invoke-static {p1}, Ll/ۖܰᩳ;->ᩳ(Ll/ۖܰᩳ;)Ll/ܽ۟ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ۟ᩳ;->֫()I

    move-result v0

    invoke-static {p1, v0}, Ll/ۖܰᩳ;->֫(Ll/ۖܰᩳ;I)V

    .line 558
    iget-object p0, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    iget-object p0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 547
    :cond_6
    :goto_1
    iget-object p0, p0, Ll/ܺܰᩳ;->ۤ:Ll/ۖܰᩳ;

    iget-object p0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_7
    :goto_2
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x0

    .line 521
    :try_start_0
    invoke-direct {p0}, Ll/ܺܰᩳ;->֫()V

    .line 522
    iget-object v1, p0, Ll/ܺܰᩳ;->ۗ:Ll/۟᩺ᩳ;

    invoke-interface {v1}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v1
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 523
    :try_start_1
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v2

    iget v3, p0, Ll/ܺܰᩳ;->ۛ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v2, v3, :cond_0

    .line 531
    :try_start_2
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 538
    new-instance v0, Ll/᩷ܰᩳ;

    invoke-direct {v0, p0}, Ll/᩷ܰᩳ;-><init>(Ll/ܺܰᩳ;)V

    goto :goto_1

    .line 524
    :cond_0
    :try_start_3
    new-instance v2, Ll/ܿۤᩳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0}, Ll/ܿۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Ll/۟᩸ᩳ;->ۧ(Ljava/lang/Runnable;)V

    .line 525
    new-instance v2, Ll/᩷۫ۡ;

    invoke-direct {v2, v1}, Ll/᩷۫ۡ;-><init>(Ll/۟᩸ᩳ;)V

    const/4 v3, 0x0

    .line 526
    :goto_0
    iget-object v4, p0, Ll/ܺܰᩳ;->᩶:[I

    array-length v4, v4

    if-ge v3, v4, :cond_1

    .line 527
    invoke-direct {p0}, Ll/ܺܰᩳ;->֫()V

    .line 528
    iget-object v4, p0, Ll/ܺܰᩳ;->۫:[F

    iget-object v5, p0, Ll/ܺܰᩳ;->ۙ:[Ll/ۨܰᩳ;

    aget-object v5, v5, v3

    iget-object v6, p0, Ll/ܺܰᩳ;->۬:Ll/ۢ۫ۡ;

    invoke-virtual {v5, v2, v6}, Ll/ۨܰᩳ;->֫(Ljava/lang/CharSequence;Ll/ۢ۫ۡ;)F

    move-result v5

    aput v5, v4, v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 531
    :try_start_4
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 538
    new-instance v0, Ll/ۢܰᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۢܰᩳ;-><init>(ILjava/lang/Object;)V

    :goto_1
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v2

    .line 522
    :try_start_5
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    :try_start_6
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v1

    .line 538
    new-instance v2, Ll/ۡܰᩳ;

    invoke-direct {v2, p0, v0}, Ll/ۡܰᩳ;-><init>(Ll/ܺܰᩳ;Z)V

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 539
    throw v1

    .line 538
    :catch_0
    new-instance v1, Ll/ۡܰᩳ;

    invoke-direct {v1, p0, v0}, Ll/ۡܰᩳ;-><init>(Ll/ܺܰᩳ;Z)V

    goto :goto_3

    :catch_1
    new-instance v1, Ll/ۡܰᩳ;

    invoke-direct {v1, p0, v0}, Ll/ۡܰᩳ;-><init>(Ll/ܺܰᩳ;Z)V

    :goto_3
    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
