.class public Lcom/rosan/dhizuku/api/DhizukuServiceConnections;
.super Ljava/lang/Object;
.source "DhizukuServiceConnections.java"


# static fields
.field public static final iDhizukuUserServiceConnection:Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;

.field public static final map:Ljava/util/Map;

.field public static final services:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;

    invoke-direct {v0}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections$1;-><init>()V

    sput-object v0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->iDhizukuUserServiceConnection:Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;

    .line 54
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->map:Ljava/util/Map;

    .line 56
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->services:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000()Ljava/util/Map;
    .locals 1

    .line 19
    sget-object v0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->services:Ljava/util/Map;

    return-object v0
.end method

.method public static synthetic access$100()Ljava/util/Map;
    .locals 1

    .line 19
    sget-object v0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->map:Ljava/util/Map;

    return-object v0
.end method

.method public static bind(Lcom/rosan/dhizuku/aidl/IDhizuku;Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;Landroid/content/ServiceConnection;)V
    .locals 4

    .line 70
    invoke-virtual {p1}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    .line 71
    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v1

    .line 72
    sget-object v2, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->map:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;

    if-nez v3, :cond_0

    .line 74
    new-instance v3, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;

    invoke-direct {v3}, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;-><init>()V

    .line 75
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    :cond_0
    invoke-virtual {v3, p2}, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->add(Landroid/content/ServiceConnection;)V

    .line 78
    sget-object v2, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->services:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/IBinder;

    if-nez v1, :cond_1

    .line 79
    sget-object p2, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->iDhizukuUserServiceConnection:Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;

    invoke-virtual {p1}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->build()Landroid/os/Bundle;

    move-result-object p1

    invoke-interface {p0, p2, p1}, Lcom/rosan/dhizuku/aidl/IDhizuku;->bindUserService(Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;Landroid/os/Bundle;)V

    return-void

    .line 80
    :cond_1
    invoke-interface {p2, v0, v1}, Landroid/content/ServiceConnection;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    return-void
.end method

.method public static start(Lcom/rosan/dhizuku/aidl/IDhizuku;Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;)V
    .locals 2

    .line 59
    invoke-virtual {p1}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->getComponentName()Landroid/content/ComponentName;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v0

    .line 61
    sget-object v1, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->services:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    if-nez v0, :cond_0

    .line 62
    sget-object v0, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->iDhizukuUserServiceConnection:Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;

    invoke-virtual {p1}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->build()Landroid/os/Bundle;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/rosan/dhizuku/aidl/IDhizuku;->bindUserService(Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public static stop(Lcom/rosan/dhizuku/aidl/IDhizuku;Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;)V
    .locals 0

    .line 66
    invoke-virtual {p1}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;->build()Landroid/os/Bundle;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/rosan/dhizuku/aidl/IDhizuku;->unbindUserService(Landroid/os/Bundle;)V

    return-void
.end method

.method public static unbind(Lcom/rosan/dhizuku/aidl/IDhizuku;Landroid/content/ServiceConnection;)V
    .locals 4

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 85
    sget-object v1, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->map:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 86
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 87
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;

    if-nez v2, :cond_1

    .line 89
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v2, p1}, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->remove(Landroid/content/ServiceConnection;)V

    .line 93
    invoke-virtual {v2}, Lcom/rosan/dhizuku/api/DhizukuServiceConnection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 95
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 96
    sget-object v1, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->map:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    invoke-static {v0}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v0

    .line 98
    new-instance v1, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;

    invoke-direct {v1, v0}, Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;-><init>(Landroid/content/ComponentName;)V

    .line 99
    invoke-static {p0, v1}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->stop(Lcom/rosan/dhizuku/aidl/IDhizuku;Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;)V

    goto :goto_1

    :cond_3
    return-void
.end method
