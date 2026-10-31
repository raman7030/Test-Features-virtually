.class public Lcom/rosan/dhizuku/api/DhizukuServiceConnection;
.super Ljava/lang/Object;
.source "DhizukuServiceConnection.java"


# instance fields
.field public final connections:Ljava/util/List;

.field public final handler:Landroid/os/Handler;


# direct methods
.method public static synthetic $r8$lambda$eN-xMtaD580uSjTbqISzbN6E_HM(Lcom/rosan/dhizuku/api/DhizukuServiceConnection;Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->lambda$onServiceConnected$0(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    return-void
.end method

.method public static synthetic $r8$lambda$lFANh5EjqXTLkDo6MKpd68BZ77U(Lcom/rosan/dhizuku/api/DhizukuServiceConnection;Landroid/content/ComponentName;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->lambda$onServiceDisconnected$1(Landroid/content/ComponentName;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->handler:Landroid/os/Handler;

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->connections:Ljava/util/List;

    return-void
.end method

.method private synthetic lambda$onServiceConnected$0(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 19
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->connections:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ServiceConnection;

    .line 20
    invoke-interface {v1, p1, p2}, Landroid/content/ServiceConnection;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private synthetic lambda$onServiceDisconnected$1(Landroid/content/ComponentName;)V
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->connections:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ServiceConnection;

    .line 28
    invoke-interface {v1, p1}, Landroid/content/ServiceConnection;->onServiceDisconnected(Landroid/content/ComponentName;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public add(Landroid/content/ServiceConnection;)V
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->connections:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->connections:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/rosan/dhizuku/api/DhizukuServiceConnection$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1, p2}, Lcom/rosan/dhizuku/api/DhizukuServiceConnection$$ExternalSyntheticLambda1;-><init>(Lcom/rosan/dhizuku/api/DhizukuServiceConnection;Landroid/content/ComponentName;Landroid/os/IBinder;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/rosan/dhizuku/api/DhizukuServiceConnection$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/rosan/dhizuku/api/DhizukuServiceConnection$$ExternalSyntheticLambda0;-><init>(Lcom/rosan/dhizuku/api/DhizukuServiceConnection;Landroid/content/ComponentName;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public remove(Landroid/content/ServiceConnection;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->connections:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
