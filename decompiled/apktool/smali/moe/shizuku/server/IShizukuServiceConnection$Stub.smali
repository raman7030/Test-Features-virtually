.class public abstract Lmoe/shizuku/server/IShizukuServiceConnection$Stub;
.super Landroid/os/Binder;
.source "IShizukuServiceConnection.java"

# interfaces
.implements Lmoe/shizuku/server/IShizukuServiceConnection;


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "moe.shizuku.server.IShizukuServiceConnection"

.field public static final TRANSACTION_connected:I = 0x1

.field public static final TRANSACTION_died:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "moe.shizuku.server.IShizukuServiceConnection"

    .line 28
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lmoe/shizuku/server/IShizukuServiceConnection;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "moe.shizuku.server.IShizukuServiceConnection"

    .line 39
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 40
    instance-of v1, v0, Lmoe/shizuku/server/IShizukuServiceConnection;

    if-eqz v1, :cond_1

    .line 41
    check-cast v0, Lmoe/shizuku/server/IShizukuServiceConnection;

    return-object v0

    .line 43
    :cond_1
    new-instance v0, Lmoe/shizuku/server/IShizukuServiceConnection$Stub$Proxy;

    invoke-direct {v0, p0}, Lmoe/shizuku/server/IShizukuServiceConnection$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static getDefaultImpl()Lmoe/shizuku/server/IShizukuServiceConnection;
    .locals 1

    .line 143
    sget-object v0, Lmoe/shizuku/server/IShizukuServiceConnection$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IShizukuServiceConnection;

    return-object v0
.end method

.method public static setDefaultImpl(Lmoe/shizuku/server/IShizukuServiceConnection;)Z
    .locals 1

    .line 133
    sget-object v0, Lmoe/shizuku/server/IShizukuServiceConnection$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IShizukuServiceConnection;

    if-nez v0, :cond_1

    if-eqz p0, :cond_0

    .line 137
    sput-object p0, Lmoe/shizuku/server/IShizukuServiceConnection$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IShizukuServiceConnection;

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    .line 134
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "setDefaultImpl() called twice"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    const-string v0, "moe.shizuku.server.IShizukuServiceConnection"

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    const v2, 0x5f4e5446

    if-eq p1, v2, :cond_0

    .line 75
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 56
    :cond_0
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    .line 69
    :cond_1
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 70
    invoke-interface {p0}, Lmoe/shizuku/server/IShizukuServiceConnection;->died()V

    return v1

    .line 61
    :cond_2
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    .line 64
    invoke-interface {p0, p1}, Lmoe/shizuku/server/IShizukuServiceConnection;->connected(Landroid/os/IBinder;)V

    return v1
.end method
