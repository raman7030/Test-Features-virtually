.class public abstract Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Stub;
.super Landroid/os/Binder;
.source "IDhizukuUserServiceConnection.java"

# interfaces
.implements Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;


# static fields
.field public static final TRANSACTION_connected:I = 0x1

.field public static final TRANSACTION_died:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection"

    .line 27
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection"

    .line 38
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 39
    instance-of v1, v0, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;

    if-eqz v1, :cond_1

    .line 40
    check-cast v0, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;

    return-object v0

    .line 42
    :cond_1
    new-instance v0, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Stub$Proxy;

    invoke-direct {v0, p0}, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    const-string v0, "com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    const v2, 0xffffff

    if-gt p1, v2, :cond_0

    .line 52
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_0
    const v2, 0x5f4e5446

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    .line 82
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 76
    :cond_1
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$_Parcel;->access$000(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    .line 77
    invoke-interface {p0, p1}, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;->died(Landroid/os/Bundle;)V

    goto :goto_0

    .line 67
    :cond_2
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$_Parcel;->access$000(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    .line 69
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    .line 70
    invoke-interface {p0, p1, p2}, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;->connected(Landroid/os/Bundle;Landroid/os/IBinder;)V

    :goto_0
    return v1

    .line 58
    :cond_3
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1
.end method
