.class public final Ll/ۨ᩸ۡ;
.super Ljava/util/ArrayList;
.source "BB0B"


# instance fields
.field public final ᩸:Ljava/util/concurrent/locks/ReentrantLock;

.field public final ᩹:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Ll/ۨ᩸ۡ;->᩸:Ljava/util/concurrent/locks/ReentrantLock;

    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۨ᩸ۡ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final ܽ()Z
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ۨ᩸ۡ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()V
    .locals 1

    .line 31
    iget-object v0, p0, Ll/ۨ᩸ۡ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 32
    iget-object v0, p0, Ll/ۨ᩸ۡ;->᩸:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ۨ᩸ۡ;->᩸:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 27
    iget-object v0, p0, Ll/ۨ᩸ۡ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method
