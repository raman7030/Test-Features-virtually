.class public Ll/ܰ֫ۘ;
.super Ljava/lang/Object;
.source "H9D4"


# instance fields
.field public final ᩸:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/ܰ֫ۘ;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܰ֫ۘ;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ܰ֫ۘ;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-lez v0, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ܰ֫ۘ;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
