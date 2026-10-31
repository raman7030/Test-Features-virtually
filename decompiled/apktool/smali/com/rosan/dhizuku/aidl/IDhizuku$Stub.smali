.class public abstract Lcom/rosan/dhizuku/aidl/IDhizuku$Stub;
.super Landroid/os/Binder;
.source "IDhizuku.java"

# interfaces
.implements Lcom/rosan/dhizuku/aidl/IDhizuku;


# static fields
.field public static final TRANSACTION_bindUserService:I = 0xd

.field public static final TRANSACTION_getDelegatedScopes:I = 0x10

.field public static final TRANSACTION_getVersionCode:I = 0x1

.field public static final TRANSACTION_getVersionName:I = 0x2

.field public static final TRANSACTION_isPermissionGranted:I = 0x3

.field public static final TRANSACTION_remoteProcess:I = 0xc

.field public static final TRANSACTION_setDelegatedScopes:I = 0x11

.field public static final TRANSACTION_unbindUserService:I = 0xe


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "com.rosan.dhizuku.aidl.IDhizuku"

    .line 51
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/rosan/dhizuku/aidl/IDhizuku;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.rosan.dhizuku.aidl.IDhizuku"

    .line 62
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 63
    instance-of v1, v0, Lcom/rosan/dhizuku/aidl/IDhizuku;

    if-eqz v1, :cond_1

    .line 64
    check-cast v0, Lcom/rosan/dhizuku/aidl/IDhizuku;

    return-object v0

    .line 66
    :cond_1
    new-instance v0, Lcom/rosan/dhizuku/aidl/IDhizuku$Stub$Proxy;

    invoke-direct {v0, p0}, Lcom/rosan/dhizuku/aidl/IDhizuku$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 3

    const-string v0, "com.rosan.dhizuku.aidl.IDhizuku"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    const v2, 0xffffff

    if-gt p1, v2, :cond_0

    .line 76
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_0
    const v2, 0x5f4e5446

    if-eq p1, v2, :cond_6

    if-eq p1, v1, :cond_5

    const/4 v0, 0x2

    if-eq p1, v0, :cond_4

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/16 v0, 0x10

    if-eq p1, v0, :cond_2

    const/16 v0, 0x11

    if-eq p1, v0, :cond_1

    packed-switch p1, :pswitch_data_0

    .line 161
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 135
    :pswitch_0
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/rosan/dhizuku/aidl/IDhizuku$_Parcel;->access$000(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    .line 136
    invoke-interface {p0, p1}, Lcom/rosan/dhizuku/aidl/IDhizuku;->unbindUserService(Landroid/os/Bundle;)V

    .line 137
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 125
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection$Stub;->asInterface(Landroid/os/IBinder;)Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;

    move-result-object p1

    .line 127
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lcom/rosan/dhizuku/aidl/IDhizuku$_Parcel;->access$000(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    .line 128
    invoke-interface {p0, p1, p2}, Lcom/rosan/dhizuku/aidl/IDhizuku;->bindUserService(Lcom/rosan/dhizuku/aidl/IDhizukuUserServiceConnection;Landroid/os/Bundle;)V

    .line 129
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 112
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object p1

    .line 114
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object p4

    .line 116
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    .line 117
    invoke-interface {p0, p1, p4, p2}, Lcom/rosan/dhizuku/aidl/IDhizuku;->remoteProcess([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    move-result-object p1

    .line 118
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 119
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V

    goto :goto_0

    .line 152
    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 154
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object p2

    .line 155
    invoke-interface {p0, p1, p2}, Lcom/rosan/dhizuku/aidl/IDhizuku;->setDelegatedScopes(Ljava/lang/String;[Ljava/lang/String;)V

    .line 156
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 143
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 144
    invoke-interface {p0, p1}, Lcom/rosan/dhizuku/aidl/IDhizuku;->getDelegatedScopes(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 145
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 146
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    goto :goto_0

    .line 104
    :cond_3
    invoke-interface {p0}, Lcom/rosan/dhizuku/aidl/IDhizuku;->isPermissionGranted()Z

    move-result p1

    .line 105
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 106
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 97
    :cond_4
    invoke-interface {p0}, Lcom/rosan/dhizuku/aidl/IDhizuku;->getVersionName()Ljava/lang/String;

    move-result-object p1

    .line 98
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 99
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 90
    :cond_5
    invoke-interface {p0}, Lcom/rosan/dhizuku/aidl/IDhizuku;->getVersionCode()I

    move-result p1

    .line 91
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 92
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    return v1

    .line 82
    :cond_6
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
