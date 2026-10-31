.class public Lcom/rosan/dhizuku/api/Dhizuku;
.super Ljava/lang/Object;
.source "Dhizuku.java"


# static fields
.field public static final synthetic $assertionsDisabled:Z

.field public static mContext:Landroid/content/Context;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field public static mOwnerComponent:Landroid/content/ComponentName;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field public static remote:Lcom/rosan/dhizuku/aidl/IDhizuku;


# direct methods
.method public static synthetic $r8$lambda$z3A_hi8CXCelVySM6ec6wpPGEd4(Landroid/os/IBinder;)V
    .locals 0

    .line 0
    invoke-static {p0}, Lcom/rosan/dhizuku/api/Dhizuku;->lambda$init$0(Landroid/os/IBinder;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bindUserService(Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;Landroid/content/ServiceConnection;)Z
    .locals 1

    .line 262
    :try_start_0
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object v0

    invoke-static {v0, p0, p1}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->bind(Lcom/rosan/dhizuku/aidl/IDhizuku;Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method public static binderWrapper(Landroid/os/IBinder;)Landroid/os/IBinder;
    .locals 1

    .line 221
    new-instance v0, Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;

    invoke-direct {v0, p0}, Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static getDelegatedScopes()[Ljava/lang/String;
    .locals 2

    .line 286
    :try_start_0
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object v0

    sget-object v1, Lcom/rosan/dhizuku/api/Dhizuku;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/rosan/dhizuku/aidl/IDhizuku;->getDelegatedScopes(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 288
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static getOwnerComponent()Landroid/content/ComponentName;
    .locals 1

    .line 149
    sget-object v0, Lcom/rosan/dhizuku/api/Dhizuku;->mOwnerComponent:Landroid/content/ComponentName;

    return-object v0
.end method

.method public static getOwnerComponent(Landroid/app/admin/DevicePolicyManager;)Landroid/content/ComponentName;
    .locals 5

    .line 46
    invoke-virtual {p0}, Landroid/app/admin/DevicePolicyManager;->getActiveAdmins()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 48
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ComponentName;

    .line 49
    invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 50
    invoke-virtual {p0, v3}, Landroid/app/admin/DevicePolicyManager;->isDeviceOwnerApp(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    return-object v2

    .line 55
    :cond_2
    invoke-virtual {p0, v3}, Landroid/app/admin/DevicePolicyManager;->isProfileOwnerApp(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static getOwnerComponent(Landroid/content/Context;)Landroid/content/ComponentName;
    .locals 1

    const-string v0, "device_policy"

    .line 40
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/admin/DevicePolicyManager;

    .line 41
    invoke-static {p0}, Lcom/rosan/dhizuku/api/Dhizuku;->getOwnerComponent(Landroid/app/admin/DevicePolicyManager;)Landroid/content/ComponentName;

    move-result-object p0

    return-object p0
.end method

.method public static getOwnerPackageName()Ljava/lang/String;
    .locals 1

    .line 144
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->getOwnerComponent()Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getVersionCode()I
    .locals 2

    .line 124
    :try_start_0
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object v0

    invoke-interface {v0}, Lcom/rosan/dhizuku/aidl/IDhizuku;->getVersionCode()I

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 126
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static getVersionName()Ljava/lang/String;
    .locals 2

    .line 137
    :try_start_0
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object v0

    invoke-interface {v0}, Lcom/rosan/dhizuku/aidl/IDhizuku;->getVersionName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 139
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static init()Z
    .locals 1

    .line 64
    sget-object v0, Lcom/rosan/dhizuku/api/Dhizuku;->mContext:Landroid/content/Context;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/app/ActivityThread;->currentActivityThread()Landroid/app/ActivityThread;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ActivityThread;->getApplication()Landroid/app/Application;

    move-result-object v0

    sput-object v0, Lcom/rosan/dhizuku/api/Dhizuku;->mContext:Landroid/content/Context;

    .line 65
    :cond_0
    sget-object v0, Lcom/rosan/dhizuku/api/Dhizuku;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/rosan/dhizuku/api/Dhizuku;->init(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public static init(Landroid/content/Context;)Z
    .locals 7

    const-string v0, "device_policy"

    .line 75
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/admin/DevicePolicyManager;

    .line 76
    sget-object v1, Lcom/rosan/dhizuku/api/Dhizuku;->remote:Lcom/rosan/dhizuku/aidl/IDhizuku;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-interface {v1}, Landroid/os/IBinder;->pingBinder()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 77
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->getOwnerPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/admin/DevicePolicyManager;->isDeviceOwnerApp(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->getOwnerPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/admin/DevicePolicyManager;->isProfileOwnerApp(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return v2

    .line 80
    :cond_1
    invoke-static {p0}, Lcom/rosan/dhizuku/api/Dhizuku;->getOwnerComponent(Landroid/content/Context;)Landroid/content/ComponentName;

    move-result-object v0

    sput-object v0, Lcom/rosan/dhizuku/api/Dhizuku;->mOwnerComponent:Landroid/content/ComponentName;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    goto :goto_0

    .line 82
    :cond_2
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->getOwnerPackageName()Ljava/lang/String;

    move-result-object v0

    .line 83
    invoke-static {v0}, Lcom/rosan/dhizuku/shared/DhizukuVariables;->getProviderAuthorityName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 85
    new-instance v3, Landroid/net/Uri$Builder;

    invoke-direct {v3}, Landroid/net/Uri$Builder;-><init>()V

    const-string v4, "content"

    invoke-virtual {v3, v4}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    .line 86
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 87
    new-instance v4, Lcom/rosan/dhizuku/api/DhizukuClient;

    invoke-direct {v4}, Lcom/rosan/dhizuku/api/DhizukuClient;-><init>()V

    invoke-virtual {v4}, Lcom/rosan/dhizuku/aidl/IDhizukuClient$Stub;->asBinder()Landroid/os/IBinder;

    move-result-object v4

    const-string v5, "client"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 90
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const/4 v6, 0x0

    invoke-virtual {v4, v0, v5, v6, v3}, Landroid/content/ContentResolver;->call(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const-string v3, "dhizuku_binder"

    .line 96
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    .line 98
    :cond_4
    invoke-static {v0}, Lcom/rosan/dhizuku/aidl/IDhizuku$Stub;->asInterface(Landroid/os/IBinder;)Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object v3

    sput-object v3, Lcom/rosan/dhizuku/api/Dhizuku;->remote:Lcom/rosan/dhizuku/aidl/IDhizuku;

    .line 100
    :try_start_1
    new-instance v3, Lcom/rosan/dhizuku/api/Dhizuku$$ExternalSyntheticLambda0;

    invoke-direct {v3, v0}, Lcom/rosan/dhizuku/api/Dhizuku$$ExternalSyntheticLambda0;-><init>(Landroid/os/IBinder;)V

    invoke-interface {v0, v3, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 107
    :catch_0
    sput-object p0, Lcom/rosan/dhizuku/api/Dhizuku;->mContext:Landroid/content/Context;

    return v2

    :catch_1
    :goto_0
    return v1
.end method

.method public static isPermissionGranted()Z
    .locals 2

    .line 159
    :try_start_0
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object v0

    invoke-interface {v0}, Lcom/rosan/dhizuku/aidl/IDhizuku;->isPermissionGranted()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 161
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static synthetic lambda$init$0(Landroid/os/IBinder;)V
    .locals 1

    .line 101
    sget-object v0, Lcom/rosan/dhizuku/api/Dhizuku;->remote:Lcom/rosan/dhizuku/aidl/IDhizuku;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    .line 102
    sput-object p0, Lcom/rosan/dhizuku/api/Dhizuku;->remote:Lcom/rosan/dhizuku/aidl/IDhizuku;

    return-void
.end method

.method public static newProcess([Ljava/lang/String;[Ljava/lang/String;Ljava/io/File;)Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;
    .locals 2

    .line 229
    :try_start_0
    new-instance v0, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;

    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object v1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-interface {v1, p0, p1, p2}, Lcom/rosan/dhizuku/aidl/IDhizuku;->remoteProcess([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/rosan/dhizuku/api/DhizukuRemoteProcess;-><init>(Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 231
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static remoteTransact(Landroid/os/IBinder;ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2

    .line 201
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_0
    const-string v1, "com.rosan.dhizuku.server"

    .line 203
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 204
    invoke-virtual {v0, p0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 205
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 206
    invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeInt(I)V

    .line 207
    invoke-virtual {p2}, Landroid/os/Parcel;->dataSize()I

    move-result p0

    const/4 p1, 0x0

    invoke-virtual {v0, p2, p1, p0}, Landroid/os/Parcel;->appendFrom(Landroid/os/Parcel;II)V

    .line 208
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object p0

    invoke-interface {p0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p0

    const/16 p2, 0xb

    invoke-interface {p0, p2, v0, p3, p1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 210
    :try_start_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 212
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 213
    throw p0
.end method

.method public static requestPermission(Landroid/content/Context;Lcom/rosan/dhizuku/api/DhizukuRequestPermissionListener;)V
    .locals 4

    .line 173
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 174
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->uid:I

    const-string v2, "uid"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "request_permission_binder"

    .line 175
    invoke-virtual {p1}, Lcom/rosan/dhizuku/aidl/IDhizukuRequestPermissionListener$Stub;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 177
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->getOwnerPackageName()Ljava/lang/String;

    move-result-object v1

    .line 178
    invoke-static {v1}, Lcom/rosan/dhizuku/shared/DhizukuVariables;->getActionRequestPermission(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 180
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 181
    invoke-virtual {v3, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 182
    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "bundle"

    .line 183
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    const v1, 0x10008000

    .line 184
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    .line 186
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p0, -0x1

    .line 189
    :try_start_1
    invoke-interface {p1, p0}, Lcom/rosan/dhizuku/aidl/IDhizukuRequestPermissionListener;->onRequestPermission(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method

.method public static requestPermission(Lcom/rosan/dhizuku/api/DhizukuRequestPermissionListener;)V
    .locals 1

    .line 169
    sget-object v0, Lcom/rosan/dhizuku/api/Dhizuku;->mContext:Landroid/content/Context;

    invoke-static {v0, p0}, Lcom/rosan/dhizuku/api/Dhizuku;->requestPermission(Landroid/content/Context;Lcom/rosan/dhizuku/api/DhizukuRequestPermissionListener;)V

    return-void
.end method

.method public static requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;
    .locals 2

    .line 112
    sget-object v0, Lcom/rosan/dhizuku/api/Dhizuku;->remote:Lcom/rosan/dhizuku/aidl/IDhizuku;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/rosan/dhizuku/api/Dhizuku;->remote:Lcom/rosan/dhizuku/aidl/IDhizuku;

    return-object v0

    .line 113
    :cond_0
    sget-object v0, Lcom/rosan/dhizuku/api/Dhizuku;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/rosan/dhizuku/api/Dhizuku;->init(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/rosan/dhizuku/api/Dhizuku;->remote:Lcom/rosan/dhizuku/aidl/IDhizuku;

    return-object v0

    .line 114
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "binder haven\'t been received"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static setDelegatedScopes([Ljava/lang/String;)V
    .locals 2

    .line 295
    :try_start_0
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object v0

    sget-object v1, Lcom/rosan/dhizuku/api/Dhizuku;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Lcom/rosan/dhizuku/aidl/IDhizuku;->setDelegatedScopes(Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 297
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static startUserService(Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;)V
    .locals 1

    .line 240
    :try_start_0
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->start(Lcom/rosan/dhizuku/aidl/IDhizuku;Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static stopUserService(Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;)V
    .locals 1

    .line 251
    :try_start_0
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->stop(Lcom/rosan/dhizuku/aidl/IDhizuku;Lcom/rosan/dhizuku/api/DhizukuUserServiceArgs;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static unbindUserService(Landroid/content/ServiceConnection;)Z
    .locals 1

    .line 275
    :try_start_0
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->requireServer()Lcom/rosan/dhizuku/aidl/IDhizuku;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/rosan/dhizuku/api/DhizukuServiceConnections;->unbind(Lcom/rosan/dhizuku/aidl/IDhizuku;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method
