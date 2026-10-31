.class public final Ll/ۤۖۜ;
.super Ljava/lang/Object;
.source "Y6X9"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:Ll/۫ۖۜ;

.field public final synthetic ᩹:Ll/ۛۖۜ;


# direct methods
.method public constructor <init>(Ll/ۛۖۜ;Ll/۫ۖۜ;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۖۜ;->᩹:Ll/ۛۖۜ;

    .line 99
    iput-object p2, p0, Ll/ۤۖۜ;->᩸:Ll/۫ۖۜ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 104
    iget-object v0, p0, Ll/ۤۖۜ;->᩹:Ll/ۛۖۜ;

    invoke-static {v0}, Ll/ۛۖۜ;->ܽ(Ll/ۛۖۜ;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 106
    :try_start_0
    iget-object v1, p0, Ll/ۤۖۜ;->᩸:Ll/۫ۖۜ;

    if-eqz v1, :cond_0

    .line 107
    invoke-static {v0}, Ll/ۛۖۜ;->֫(Ll/ۛۖۜ;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Ll/ۤۖۜ;->᩸:Ll/۫ۖۜ;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 108
    iput-object v1, p0, Ll/ۤۖۜ;->᩸:Ll/۫ۖۜ;

    .line 109
    invoke-static {v0}, Ll/ۛۖۜ;->ۧ(Ll/ۛۖۜ;)Ljava/util/concurrent/locks/Condition;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    :cond_0
    invoke-static {v0}, Ll/ۛۖۜ;->ܽ(Ll/ۛۖۜ;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v0}, Ll/ۛۖۜ;->ܽ(Ll/ۛۖۜ;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 113
    throw v1
.end method
