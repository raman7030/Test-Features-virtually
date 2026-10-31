.class public Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;
.super Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Stub;
.source "DhizukuServiceConnections.java"


# direct methods
.method public static synthetic $r8$lambda$vihHVB2iNk6slHNSBB6__-ARulQ(Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;Landroid/os/Bundle;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;->lambda$connected$0(Landroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Stub;-><init>()V

    return-void
.end method

.method private synthetic lambda$connected$0(Landroid/os/Bundle;)V
    .locals 0

    .line 26
    invoke-virtual {p0, p1}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;->died(Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public connected(Landroid/os/Bundle;Landroid/os/IBinder;)V
    .locals 1

    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;->onServiceConnected(Landroid/os/Bundle;Landroid/os/IBinder;)V

    .line 25
    :try_start_0
    new-instance v0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p1}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1$$ExternalSyntheticLambda0;-><init>(Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;Landroid/os/Bundle;)V

    const/4 p1, 0x0

    invoke-interface {p2, v0, p1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public died(Landroid/os/Bundle;)V
    .locals 2

    .line 44
    new-instance v0, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;

    invoke-direct {v0, p1}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;-><init>(Landroid/os/Bundle;)V

    .line 45
    invoke-virtual {v0}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->getComponentName()Landroid/content/ComponentName;

    move-result-object p1

    .line 46
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-static {}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->access$000()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    invoke-static {}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->access$100()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;

    if-nez v0, :cond_0

    return-void

    .line 50
    :cond_0
    invoke-virtual {v0, p1}, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->onServiceDisconnected(Landroid/content/ComponentName;)V

    return-void
.end method

.method public onServiceConnected(Landroid/os/Bundle;Landroid/os/IBinder;)V
    .locals 2

    .line 33
    new-instance v0, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;

    invoke-direct {v0, p1}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;-><init>(Landroid/os/Bundle;)V

    .line 34
    invoke-virtual {v0}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->getComponentName()Landroid/content/ComponentName;

    move-result-object p1

    .line 35
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-static {}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->access$000()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    invoke-static {}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->access$100()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;

    if-nez v0, :cond_0

    return-void

    .line 39
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    return-void
.end method
