.class public abstract Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess$Stub;
.super Landroid/os/Binder;
.source "IDhizukuRemoteProcess.java"

# interfaces
.implements Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;


# static fields
.field public static final TRANSACTION_alive:I = 0x6

.field public static final TRANSACTION_destroy:I = 0x5

.field public static final TRANSACTION_exitValue:I = 0x4

.field public static final TRANSACTION_getErrorStream:I = 0x3

.field public static final TRANSACTION_getInputStream:I = 0x2

.field public static final TRANSACTION_getOutputStream:I = 0x1

.field public static final TRANSACTION_waitFor:I = 0x7

.field public static final TRANSACTION_waitForTimeout:I = 0x8


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "com.rosan.dhizuku.aidl.IDhizukuRemoteProcess"

    .line 52
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.rosan.dhizuku.aidl.IDhizukuRemoteProcess"

    .line 63
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 64
    instance-of v1, v0, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    if-eqz v1, :cond_1

    .line 65
    check-cast v0, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;

    return-object v0

    .line 67
    :cond_1
    new-instance v0, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess$Stub$Proxy;

    invoke-direct {v0, p0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4

    const-string v0, "com.rosan.dhizuku.aidl.IDhizukuRemoteProcess"

    const/4 v1, 0x1

    if-lt p1, v1, :cond_0

    const v2, 0xffffff

    if-gt p1, v2, :cond_0

    .line 77
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_0
    const v2, 0x5f4e5446

    if-eq p1, v2, :cond_1

    packed-switch p1, :pswitch_data_0

    .line 150
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 140
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    .line 142
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 143
    invoke-interface {p0, v2, v3, p1}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->waitForTimeout(JLjava/lang/String;)Z

    move-result p1

    .line 144
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 145
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 132
    :pswitch_1
    invoke-interface {p0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->waitFor()I

    move-result p1

    .line 133
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 134
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 125
    :pswitch_2
    invoke-interface {p0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->alive()Z

    move-result p1

    .line 126
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 127
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 119
    :pswitch_3
    invoke-interface {p0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->destroy()V

    .line 120
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 112
    :pswitch_4
    invoke-interface {p0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->exitValue()I

    move-result p1

    .line 113
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 114
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 105
    :pswitch_5
    invoke-interface {p0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->getErrorStream()Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    .line 106
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 107
    invoke-static {p3, p1, v1}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess$_Parcel;->access$000(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    goto :goto_0

    .line 98
    :pswitch_6
    invoke-interface {p0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->getInputStream()Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    .line 99
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 100
    invoke-static {p3, p1, v1}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess$_Parcel;->access$000(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    goto :goto_0

    .line 91
    :pswitch_7
    invoke-interface {p0}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess;->getOutputStream()Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    .line 92
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 93
    invoke-static {p3, p1, v1}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess$_Parcel;->access$000(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    :goto_0
    return v1

    .line 83
    :cond_1
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
