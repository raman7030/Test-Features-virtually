.class public Lbin/mt/plugin/api/util/UIUpdater;
.super Ljava/lang/Object;
.source "UIUpdater.java"


# static fields
.field public static final NOT_SET:Ljava/lang/Object;


# instance fields
.field public final pendingData:Ljava/util/concurrent/atomic/AtomicReference;

.field public final uiConsumer:Lbin/mt/plugin/api/util/Consumer;

.field public final updaterGroup:Lbin/mt/plugin/api/util/UIUpdaterGroup;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lbin/mt/plugin/api/util/UIUpdater;->NOT_SET:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbin/mt/plugin/api/util/UIUpdaterGroup;Lbin/mt/plugin/api/util/Consumer;)V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lbin/mt/plugin/api/util/UIUpdater;->NOT_SET:Ljava/lang/Object;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lbin/mt/plugin/api/util/UIUpdater;->pendingData:Ljava/util/concurrent/atomic/AtomicReference;

    .line 39
    iput-object p1, p0, Lbin/mt/plugin/api/util/UIUpdater;->updaterGroup:Lbin/mt/plugin/api/util/UIUpdaterGroup;

    .line 40
    iput-object p2, p0, Lbin/mt/plugin/api/util/UIUpdater;->uiConsumer:Lbin/mt/plugin/api/util/Consumer;

    return-void
.end method


# virtual methods
.method public processPendingUpdate()V
    .locals 2

    .line 72
    iget-object v0, p0, Lbin/mt/plugin/api/util/UIUpdater;->pendingData:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lbin/mt/plugin/api/util/UIUpdater;->NOT_SET:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v1, :cond_0

    .line 75
    iget-object v1, p0, Lbin/mt/plugin/api/util/UIUpdater;->uiConsumer:Lbin/mt/plugin/api/util/Consumer;

    invoke-interface {v1, v0}, Lbin/mt/plugin/api/util/Consumer;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public submitUpdate(Ljava/lang/Object;)V
    .locals 2

    .line 53
    invoke-static {}, Lbin/mt/plugin/api/util/ThreadUtil;->isInUiThread()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lbin/mt/plugin/api/util/UIUpdater;->pendingData:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lbin/mt/plugin/api/util/UIUpdater;->NOT_SET:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 55
    iget-object v0, p0, Lbin/mt/plugin/api/util/UIUpdater;->uiConsumer:Lbin/mt/plugin/api/util/Consumer;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/util/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    .line 57
    :cond_0
    iget-object v0, p0, Lbin/mt/plugin/api/util/UIUpdater;->pendingData:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 58
    iget-object p1, p0, Lbin/mt/plugin/api/util/UIUpdater;->updaterGroup:Lbin/mt/plugin/api/util/UIUpdaterGroup;

    invoke-virtual {p1}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->schedulePendingUpdates()V

    return-void
.end method
