.class public final Ll/֨ۘ֡;
.super Ljava/util/concurrent/locks/ReentrantLock;
.source "PAHH"


# static fields
.field public static final serialVersionUID:J = 0x1L


# virtual methods
.method public final ֫(Ljava/util/concurrent/locks/Condition;)V
    .locals 1

    .line 52
    invoke-virtual {p0, p1}, Ljava/util/concurrent/locks/ReentrantLock;->getWaitingThreads(Ljava/util/concurrent/locks/Condition;)Ljava/util/Collection;

    move-result-object p1

    new-instance v0, Ll/ۚۘ֡;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method
