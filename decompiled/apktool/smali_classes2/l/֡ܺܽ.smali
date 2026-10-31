.class public final Ll/֡ܺܽ;
.super Ljava/lang/Thread;
.source "W144"


# instance fields
.field public final synthetic ᩶:Ll/ۚܺܽ;

.field public volatile ᩸:Ll/ᩴܺܽ;

.field public final ᩹:Ll/ܶܺܽ;


# direct methods
.method public constructor <init>(Ll/ۚܺܽ;Ll/ܶܺܽ;)V
    .locals 0

    .line 109
    iput-object p1, p0, Ll/֡ܺܽ;->᩶:Ll/ۚܺܽ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 110
    iput-object p2, p0, Ll/֡ܺܽ;->᩹:Ll/ܶܺܽ;

    const/16 p1, 0xa

    .line 111
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setPriority(I)V

    .line 112
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 117
    iget-object v0, p0, Ll/֡ܺܽ;->᩶:Ll/ۚܺܽ;

    invoke-static {v0}, Ll/ۚܺܽ;->ܽ(Ll/ۚܺܽ;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 120
    :goto_0
    invoke-static {}, Ljava/util/concurrent/locks/LockSupport;->park()V

    .line 121
    iget-object v0, p0, Ll/֡ܺܽ;->᩶:Ll/ۚܺܽ;

    invoke-static {v0}, Ll/ۚܺܽ;->ۧ(Ll/ۚܺܽ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 127
    :cond_0
    iget-object v0, p0, Ll/֡ܺܽ;->᩹:Ll/ܶܺܽ;

    iget-object v1, p0, Ll/֡ܺܽ;->᩸:Ll/ᩴܺܽ;

    invoke-interface {v0, v1}, Ll/ܶܺܽ;->֫(Ll/ᩴܺܽ;)V

    .line 130
    iget-object v0, p0, Ll/֡ܺܽ;->᩶:Ll/ۚܺܽ;

    invoke-static {v0}, Ll/ۚܺܽ;->֫(Ll/ۚܺܽ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    goto :goto_0
.end method
