.class public final Ll/ܰ۟ܳ;
.super Ljava/lang/Object;
.source "18AW"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ljava/util/concurrent/locks/ReentrantLock;

.field public ܽ:Ll/ۙۖᩴ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 529
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 525
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>(Z)V

    iput-object v0, p0, Ll/ܰ۟ܳ;->ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 553
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ܰ۟ܳ;->֫:Ljava/util/ArrayList;

    .line 554
    new-instance v0, Ll/ۙۖᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۙۖᩴ;-><init>(I)V

    iput-object v0, p0, Ll/ܰ۟ܳ;->ܽ:Ll/ۙۖᩴ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰ۟ܳ;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ۟ܳ;->ۧ:Ljava/util/concurrent/locks/ReentrantLock;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 543
    iget-object v0, p0, Ll/ܰ۟ܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 545
    :try_start_0
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/᩺۟ܳ;

    iget-object v2, p0, Ll/ܰ۟ܳ;->֫:Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ܰ۟ܳ;->ܽ:Ll/ۙۖᩴ;

    invoke-direct {v1, p0, v2, v3}, Ll/᩺۟ܳ;-><init>(Ll/ܰ۟ܳ;Ljava/util/ArrayList;Ll/ۙۖᩴ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܶ᩵ܿ;J)V
    .locals 2

    .line 534
    iget-object v0, p0, Ll/ܰ۟ܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    iget-object p1, p0, Ll/ܰ۟ܳ;->ܽ:Ll/ۙۖᩴ;

    invoke-virtual {p1, p2, p3}, Ll/ۙۖᩴ;->add(J)Z

    .line 536
    iget-object p1, p0, Ll/ܰ۟ܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/16 p2, 0x64

    if-ne p1, p2, :cond_0

    .line 537
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance p3, Ll/᩺۟ܳ;

    iget-object v0, p0, Ll/ܰ۟ܳ;->֫:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܰ۟ܳ;->ܽ:Ll/ۙۖᩴ;

    invoke-direct {p3, p0, v0, v1}, Ll/᩺۟ܳ;-><init>(Ll/ܰ۟ܳ;Ljava/util/ArrayList;Ll/ۙۖᩴ;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 553
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ܰ۟ܳ;->֫:Ljava/util/ArrayList;

    .line 554
    new-instance p1, Ll/ۙۖᩴ;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/ۙۖᩴ;-><init>(I)V

    iput-object p1, p0, Ll/ܰ۟ܳ;->ܽ:Ll/ۙۖᩴ;

    :cond_0
    return-void
.end method
