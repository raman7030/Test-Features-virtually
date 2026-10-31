.class public final synthetic Ll/᩹۬ᩳ;
.super Ljava/lang/Object;
.source "I6UJ"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic ֫:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹۬ᩳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    .line 22
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ll/۟ۤᩳ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p1}, Ll/۟ۤᩳ;-><init>(ILjava/lang/Object;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "editable-persist-"

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    iget-object v2, p0, Ll/᩹۬ᩳ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0
.end method
