.class public final Ll/ۗ۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ll/ᩴۛ᩷;


# instance fields
.field public final ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ۧ:Ll/ۗ᩻᩵;

.field public final synthetic ܽ:Ll/᩶ܶᩳ;


# direct methods
.method public constructor <init>(Ll/ۗ᩻᩵;Ll/᩶ܶᩳ;)V
    .locals 0

    .line 1823
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ۠ᩳ;->ۧ:Ll/ۗ᩻᩵;

    iput-object p2, p0, Ll/ۗ۠ᩳ;->ܽ:Ll/᩶ܶᩳ;

    .line 1824
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Ll/ۗ۠ᩳ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 1827
    iget-object v0, p0, Ll/ۗ۠ᩳ;->ܽ:Ll/᩶ܶᩳ;

    iget-object v1, p0, Ll/ۗ۠ᩳ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v2, v3, :cond_2

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 1828
    :try_start_0
    iget-object v4, p0, Ll/ۗ۠ᩳ;->ۧ:Ll/ۗ᩻᩵;

    invoke-virtual {v4}, Ll/ۗ᩻᩵;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v4

    goto :goto_0

    :catch_1
    move-exception v4

    .line 1833
    :goto_0
    instance-of v5, v4, Ljava/util/concurrent/ExecutionException;

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    .line 1835
    :cond_0
    instance-of v5, v4, Ljava/util/concurrent/CancellationException;

    if-nez v5, :cond_1

    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1836
    invoke-virtual {v0, v4}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_2
    move-exception v4

    .line 1830
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V

    .line 1831
    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v4}, Ll/᩶ܶᩳ;->֫(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    return-void

    .line 1827
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment state persistence must wait in the background"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()V
    .locals 0

    return-void
.end method
