.class public Lbin/mt/plugin/api/util/UIUpdaterGroup;
.super Ljava/lang/Object;
.source "UIUpdaterGroup.java"


# static fields
.field public static final HANDLER:Landroid/os/Handler;

.field public static final ID_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final id:I

.field public final myRef:Ljava/lang/ref/WeakReference;

.field public final updaters:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->ID_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    new-instance v0, Ll/֫᩻᩷;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֫᩻᩷;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->HANDLER:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    sget-object v0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->ID_COUNTER:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, p0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->id:I

    .line 55
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->myRef:Ljava/lang/ref/WeakReference;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->updaters:Ljava/util/List;

    return-void
.end method

.method public static synthetic access$000(Lbin/mt/plugin/api/util/UIUpdaterGroup;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lbin/mt/plugin/api/util/UIUpdaterGroup;->processPendingUpdates()V

    return-void
.end method

.method private processPendingUpdates()V
    .locals 3

    .line 91
    iget-object v0, p0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->updaters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 92
    iget-object v2, p0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->updaters:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbin/mt/plugin/api/util/UIUpdater;

    invoke-virtual {v2}, Lbin/mt/plugin/api/util/UIUpdater;->processPendingUpdate()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public registerUpdater(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/util/UIUpdater;
    .locals 1

    .line 72
    new-instance v0, Lbin/mt/plugin/api/util/UIUpdater;

    invoke-direct {v0, p0, p1}, Lbin/mt/plugin/api/util/UIUpdater;-><init>(Lbin/mt/plugin/api/util/UIUpdaterGroup;Lbin/mt/plugin/api/util/Consumer;)V

    .line 73
    iget-object p1, p0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->updaters:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public schedulePendingUpdates()V
    .locals 4

    .line 81
    sget-object v0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->HANDLER:Landroid/os/Handler;

    iget v1, p0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->id:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 82
    iget v1, p0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->id:I

    iget-object v2, p0, Lbin/mt/plugin/api/util/UIUpdaterGroup;->myRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0xf

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method
