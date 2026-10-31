.class public final Ll/᩶᩹ۘ;
.super Ljava/io/FilterOutputStream;
.source "QABT"


# instance fields
.field public final synthetic ᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ᩸:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ᩹:Ll/֡۬ۡ;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Ll/֡۬ۡ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    .line 532
    iput-object p2, p0, Ll/᩶᩹ۘ;->᩹:Ll/֡۬ۡ;

    iput-object p3, p0, Ll/᩶᩹ۘ;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p4, p0, Ll/᩶᩹ۘ;->᩸:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method

.method private ֫()V
    .locals 3

    .line 591
    iget-object v0, p0, Ll/᩶᩹ۘ;->᩸:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    .line 593
    :cond_0
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 568
    iget-object v0, p0, Ll/᩶᩹ۘ;->᩹:Ll/֡۬ۡ;

    invoke-virtual {v0}, Ll/֡۬ۡ;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 569
    invoke-direct {p0}, Ll/᩶᩹ۘ;->֫()V

    return-void

    .line 573
    :cond_0
    :try_start_0
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 578
    invoke-direct {p0}, Ll/᩶᩹ۘ;->֫()V

    .line 579
    :goto_0
    iget-object v0, p0, Ll/᩶᩹ۘ;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 580
    invoke-direct {p0}, Ll/᩶᩹ۘ;->֫()V

    const-wide/16 v0, 0x1

    .line 583
    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    return-void

    :catch_1
    move-exception v0

    .line 575
    invoke-direct {p0}, Ll/᩶᩹ۘ;->֫()V

    .line 576
    throw v0
.end method

.method public final flush()V
    .locals 1

    .line 558
    :try_start_0
    invoke-super {p0}, Ljava/io/FilterOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 563
    invoke-direct {p0}, Ll/᩶᩹ۘ;->֫()V

    return-void

    :catch_0
    move-exception v0

    .line 560
    invoke-direct {p0}, Ll/᩶᩹ۘ;->֫()V

    .line 561
    throw v0
.end method

.method public final write(I)V
    .locals 1

    .line 536
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 541
    invoke-direct {p0}, Ll/᩶᩹ۘ;->֫()V

    return-void

    :catch_0
    move-exception p1

    .line 538
    invoke-direct {p0}, Ll/᩶᩹ۘ;->֫()V

    .line 539
    throw p1
.end method

.method public final write([BII)V
    .locals 1

    .line 547
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 552
    invoke-direct {p0}, Ll/᩶᩹ۘ;->֫()V

    return-void

    :catch_0
    move-exception p1

    .line 549
    invoke-direct {p0}, Ll/᩶᩹ۘ;->֫()V

    .line 550
    throw p1
.end method
