.class public Lmoe/shizuku/server/IShizukuServiceConnection$Stub$Proxy;
.super Ljava/lang/Object;
.source "IShizukuServiceConnection.java"

# interfaces
.implements Lmoe/shizuku/server/IShizukuServiceConnection;


# static fields
.field public static sDefaultImpl:Lmoe/shizuku/server/IShizukuServiceConnection;


# instance fields
.field public mRemote:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p1, p0, Lmoe/shizuku/server/IShizukuServiceConnection$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 88
    iget-object v0, p0, Lmoe/shizuku/server/IShizukuServiceConnection$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    return-object v0
.end method

.method public connected(Landroid/os/IBinder;)V
    .locals 4

    .line 96
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_0
    const-string v1, "moe.shizuku.server.IShizukuServiceConnection"

    .line 98
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 99
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 100
    iget-object v1, p0, Lmoe/shizuku/server/IShizukuServiceConnection$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-interface {v1, v3, v0, v2, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 101
    invoke-static {}, Lmoe/shizuku/server/IShizukuServiceConnection$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuServiceConnection;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 102
    invoke-static {}, Lmoe/shizuku/server/IShizukuServiceConnection$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuServiceConnection;

    move-result-object v1

    invoke-interface {v1, p1}, Lmoe/shizuku/server/IShizukuServiceConnection;->connected(Landroid/os/IBinder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 108
    throw p1
.end method

.method public died()V
    .locals 5

    .line 112
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_0
    const-string v1, "moe.shizuku.server.IShizukuServiceConnection"

    .line 114
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 115
    iget-object v1, p0, Lmoe/shizuku/server/IShizukuServiceConnection$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-interface {v1, v4, v0, v2, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 116
    invoke-static {}, Lmoe/shizuku/server/IShizukuServiceConnection$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuServiceConnection;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 117
    invoke-static {}, Lmoe/shizuku/server/IShizukuServiceConnection$Stub;->getDefaultImpl()Lmoe/shizuku/server/IShizukuServiceConnection;

    move-result-object v1

    invoke-interface {v1}, Lmoe/shizuku/server/IShizukuServiceConnection;->died()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 123
    throw v1
.end method

.method public getInterfaceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "moe.shizuku.server.IShizukuServiceConnection"

    return-object v0
.end method
