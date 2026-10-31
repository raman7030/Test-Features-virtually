.class public abstract Lmoe/shizuku/server/IShizukuApplication$Stub;
.super Landroid/os/Binder;
.source "IShizukuApplication.java"

# interfaces
.implements Lmoe/shizuku/server/IShizukuApplication;


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "moe.shizuku.server.IShizukuApplication"

.field public static final TRANSACTION_bindApplication:I = 0x2

.field public static final TRANSACTION_dispatchRequestPermissionResult:I = 0x3

.field public static final TRANSACTION_showPermissionConfirmation:I = 0x2711


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "moe.shizuku.server.IShizukuApplication"

    .line 33
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lmoe/shizuku/server/IShizukuApplication;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "moe.shizuku.server.IShizukuApplication"

    .line 44
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 45
    instance-of v1, v0, Lmoe/shizuku/server/IShizukuApplication;

    if-eqz v1, :cond_1

    .line 46
    check-cast v0, Lmoe/shizuku/server/IShizukuApplication;

    return-object v0

    .line 48
    :cond_1
    new-instance v0, Lmoe/shizuku/server/IShizukuApplication$Stub$Proxy;

    invoke-direct {v0, p0}, Lmoe/shizuku/server/IShizukuApplication$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static getDefaultImpl()Lmoe/shizuku/server/IShizukuApplication;
    .locals 1

    .line 216
    sget-object v0, Lmoe/shizuku/server/IShizukuApplication$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IShizukuApplication;

    return-object v0
.end method

.method public static setDefaultImpl(Lmoe/shizuku/server/IShizukuApplication;)Z
    .locals 1

    .line 206
    sget-object v0, Lmoe/shizuku/server/IShizukuApplication$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IShizukuApplication;

    if-nez v0, :cond_1

    if-eqz p0, :cond_0

    .line 210
    sput-object p0, Lmoe/shizuku/server/IShizukuApplication$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IShizukuApplication;

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    .line 207
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
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "moe.shizuku.server.IShizukuApplication"

    if-eq p1, v0, :cond_4

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2711

    if-eq p1, v0, :cond_1

    const v0, 0x5f4e5446

    if-eq p1, v0, :cond_0

    .line 109
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 61
    :cond_0
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v2

    .line 94
    :cond_1
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    .line 98
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    .line 100
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 102
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    .line 103
    invoke-interface {p0, p1, p4, v0, p2}, Lmoe/shizuku/server/IShizukuApplication;->showPermissionConfirmation(IILjava/lang/String;I)V

    .line 104
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v2

    .line 79
    :cond_2
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 81
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    .line 83
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_3

    .line 84
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p3, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Landroid/os/Bundle;

    .line 89
    :cond_3
    invoke-interface {p0, p1, v1}, Lmoe/shizuku/server/IShizukuApplication;->dispatchRequestPermissionResult(ILandroid/os/Bundle;)V

    return v2

    .line 66
    :cond_4
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 68
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_5

    .line 69
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/os/Bundle;

    .line 74
    :cond_5
    invoke-interface {p0, v1}, Lmoe/shizuku/server/IShizukuApplication;->bindApplication(Landroid/os/Bundle;)V

    return v2
.end method
