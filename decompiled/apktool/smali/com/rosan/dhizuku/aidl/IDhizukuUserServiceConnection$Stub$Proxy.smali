.class public Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Stub$Proxy;
.super Ljava/lang/Object;
.source "IDhizukuUserServiceConnection.java"

# interfaces
.implements Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;


# instance fields
.field public mRemote:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    return-object v0
.end method

.method public connected(Landroid/os/Bundle;Landroid/os/IBinder;)V
    .locals 2

    .line 104
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_0
    const-string v1, "com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection"

    .line 106
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 107
    invoke-static {v0, p1, v1}, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$_Parcel;->access$100(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    .line 108
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 109
    iget-object p1, p0, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 p2, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v1, v0, p2, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 113
    throw p1
.end method

.method public died(Landroid/os/Bundle;)V
    .locals 4

    .line 117
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_0
    const-string v1, "com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection"

    .line 119
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 120
    invoke-static {v0, p1, v1}, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$_Parcel;->access$100(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    .line 121
    iget-object p1, p0, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-interface {p1, v3, v0, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 125
    throw p1
.end method

.method public getInterfaceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection"

    return-object v0
.end method
