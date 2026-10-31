.class public abstract Ll/֡ᩳۘ;
.super Ljava/lang/Object;
.source "U9HB"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ۗ:Ljava/lang/Thread;

.field public ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᩶:Ll/֫᩻֨;

.field public ᩸:Ll/ۡ۟ۖ;

.field public ᩹:Ljava/io/BufferedInputStream;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/InputStream;Ll/ۡ۟ۖ;)V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    iput-object v0, p0, Ll/֡ᩳۘ;->᩶:Ll/֫᩻֨;

    .line 35
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/֡ᩳۘ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    instance-of v0, p2, Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_0

    .line 40
    check-cast p2, Ljava/io/BufferedInputStream;

    iput-object p2, p0, Ll/֡ᩳۘ;->᩹:Ljava/io/BufferedInputStream;

    goto :goto_0

    .line 42
    :cond_0
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ll/֡ᩳۘ;->᩹:Ljava/io/BufferedInputStream;

    .line 44
    :goto_0
    iput-object p3, p0, Ll/֡ᩳۘ;->᩸:Ll/ۡ۟ۖ;

    .line 45
    new-instance p2, Ljava/lang/Thread;

    const-string p3, "Packet Reader for "

    const-string v0, ", Original Thread name: "

    .line 0
    invoke-static {p3, p1, v0}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 45
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object p2, p0, Ll/֡ᩳۘ;->ۗ:Ljava/lang/Thread;

    const/4 p1, 0x1

    .line 46
    invoke-virtual {p2, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 51
    iget-object v0, p0, Ll/֡ᩳۘ;->᩸:Ll/ۡ۟ۖ;

    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v1

    iget-object v2, p0, Ll/֡ᩳۘ;->᩶:Ll/֫᩻֨;

    iget-object v3, p0, Ll/֡ᩳۘ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-nez v1, :cond_1

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_1

    .line 75
    :try_start_0
    invoke-virtual {p0}, Ll/֡ᩳۘ;->֫()Ll/ۚܰۖ;

    move-result-object v1

    const-string v4, "Received packet {}"

    .line 76
    invoke-interface {v2, v1, v4}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    move-object v4, v0

    check-cast v4, Ll/᩻ۧۘ;

    invoke-virtual {v4, v1}, Ll/᩻ۧۘ;->֫(Ll/ۚܰۖ;)V
    :try_end_0
    .catch Ll/ۖ۟ۖ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 55
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "PacketReader error, got exception."

    .line 58
    invoke-interface {v2, v3, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 59
    check-cast v0, Ll/᩻ۧۘ;

    invoke-virtual {v0, v1}, Ll/᩻ۧۘ;->֫(Ll/ۖ۟ۖ;)V

    return-void

    .line 63
    :cond_1
    :goto_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "{} stopped."

    .line 64
    iget-object v1, p0, Ll/֡ᩳۘ;->ۗ:Ljava/lang/Thread;

    invoke-interface {v2, v1, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public abstract ֫()Ll/ۚܰۖ;
.end method

.method public final ۧ()V
    .locals 4

    .line 89
    iget-object v0, p0, Ll/֡ᩳۘ;->ۗ:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/֡ᩳۘ;->᩶:Ll/֫᩻֨;

    const-string v3, "Starting PacketReader on thread: {}"

    invoke-interface {v2, v1, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 69
    iget-object v0, p0, Ll/֡ᩳۘ;->᩶:Ll/֫᩻֨;

    const-string v1, "Stopping PacketReader..."

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Ll/֡ᩳۘ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 71
    iget-object v0, p0, Ll/֡ᩳۘ;->ۗ:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method
