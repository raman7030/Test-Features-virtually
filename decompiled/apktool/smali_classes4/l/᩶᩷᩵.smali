.class public final Ll/᩶᩷᩵;
.super Ljava/lang/Object;
.source "G9ZA"


# static fields
.field public static ܽ:Ll/֫᩻֨;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 36
    const-class v0, Ll/᩶᩷᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩶᩷᩵;->ܽ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Ll/᩶᩷᩵;->֫:Ljava/lang/String;

    .line 48
    new-instance p1, Ll/ۧۤᩴ;

    const/16 v0, 0x32

    invoke-direct {p1, v0}, Ll/ۧۤᩴ;-><init>(I)V

    iput-object p1, p0, Ll/᩶᩷᩵;->ۧ:Ll/ۧۤᩴ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    const/16 v0, 0x3e8

    const-string v1, "Semaphore: "

    .line 0
    invoke-static {v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 87
    iget-object v1, p0, Ll/᩶᩷᩵;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    iget-object v1, p0, Ll/᩶᩷᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->size()I

    move-result v2

    if-nez v2, :cond_0

    const-string v1, " no semaphores."

    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v2, " semaphores:\n"

    .line 91
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    invoke-virtual {v1}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    const-string v3, "\tThread: "

    .line 93
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Thread;

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    .line 95
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    .line 97
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 100
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 3

    .line 76
    iget-object v0, p0, Ll/᩶᩷᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v0

    .line 77
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Semaphore;

    .line 78
    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->release()V

    .line 79
    invoke-interface {v0, v2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(J)V
    .locals 4

    .line 57
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 58
    iget-object v1, p0, Ll/᩶᩷᩵;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Semaphore;

    if-nez v2, :cond_0

    .line 60
    new-instance v2, Ljava/util/concurrent/Semaphore;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v3}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    .line 61
    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->drainPermits()I

    .line 62
    invoke-virtual {v1, v0, v2}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    :cond_0
    invoke-virtual {v1, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Semaphore;

    .line 66
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 68
    sget-object p2, Ll/᩶᩷᩵;->ܽ:Ll/֫᩻֨;

    const-string v0, "Exception "

    invoke-interface {p2, v0, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method
