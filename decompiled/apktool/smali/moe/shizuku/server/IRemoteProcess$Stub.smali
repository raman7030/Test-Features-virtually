.class public abstract Lmoe/shizuku/server/IRemoteProcess$Stub;
.super Landroid/os/Binder;
.source "IRemoteProcess.java"

# interfaces
.implements Lmoe/shizuku/server/IRemoteProcess;


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "moe.shizuku.server.IRemoteProcess"

.field public static final TRANSACTION_alive:I = 0x7

.field public static final TRANSACTION_destroy:I = 0x6

.field public static final TRANSACTION_exitValue:I = 0x5

.field public static final TRANSACTION_getErrorStream:I = 0x3

.field public static final TRANSACTION_getInputStream:I = 0x2

.field public static final TRANSACTION_getOutputStream:I = 0x1

.field public static final TRANSACTION_waitFor:I = 0x4

.field public static final TRANSACTION_waitForTimeout:I = 0x8


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "moe.shizuku.server.IRemoteProcess"

    .line 53
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lmoe/shizuku/server/IRemoteProcess;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "moe.shizuku.server.IRemoteProcess"

    .line 64
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 65
    instance-of v1, v0, Lmoe/shizuku/server/IRemoteProcess;

    if-eqz v1, :cond_1

    .line 66
    check-cast v0, Lmoe/shizuku/server/IRemoteProcess;

    return-object v0

    .line 68
    :cond_1
    new-instance v0, Lmoe/shizuku/server/IRemoteProcess$Stub$Proxy;

    invoke-direct {v0, p0}, Lmoe/shizuku/server/IRemoteProcess$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static getDefaultImpl()Lmoe/shizuku/server/IRemoteProcess;
    .locals 1

    .line 389
    sget-object v0, Lmoe/shizuku/server/IRemoteProcess$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IRemoteProcess;

    return-object v0
.end method

.method public static setDefaultImpl(Lmoe/shizuku/server/IRemoteProcess;)Z
    .locals 1

    .line 379
    sget-object v0, Lmoe/shizuku/server/IRemoteProcess$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IRemoteProcess;

    if-nez v0, :cond_1

    if-eqz p0, :cond_0

    .line 383
    sput-object p0, Lmoe/shizuku/server/IRemoteProcess$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IRemoteProcess;

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    .line 380
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

    const v0, 0x5f4e5446

    const/4 v1, 0x1

    const-string v2, "moe.shizuku.server.IRemoteProcess"

    if-eq p1, v0, :cond_3

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    .line 171
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 159
    :pswitch_0
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 161
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    .line 163
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 164
    invoke-interface {p0, v2, v3, p1}, Lmoe/shizuku/server/IRemoteProcess;->waitForTimeout(JLjava/lang/String;)Z

    move-result p1

    .line 165
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 166
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 151
    :pswitch_1
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 152
    invoke-interface {p0}, Lmoe/shizuku/server/IRemoteProcess;->alive()Z

    move-result p1

    .line 153
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 154
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 144
    :pswitch_2
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 145
    invoke-interface {p0}, Lmoe/shizuku/server/IRemoteProcess;->destroy()V

    .line 146
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 136
    :pswitch_3
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 137
    invoke-interface {p0}, Lmoe/shizuku/server/IRemoteProcess;->exitValue()I

    move-result p1

    .line 138
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 139
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 128
    :pswitch_4
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 129
    invoke-interface {p0}, Lmoe/shizuku/server/IRemoteProcess;->waitFor()I

    move-result p1

    .line 130
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 131
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 114
    :pswitch_5
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 115
    invoke-interface {p0}, Lmoe/shizuku/server/IRemoteProcess;->getErrorStream()Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    .line 116
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-eqz p1, :cond_0

    .line 118
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 119
    invoke-virtual {p1, p3, v1}, Landroid/os/ParcelFileDescriptor;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 122
    :cond_0
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    return v1

    .line 100
    :pswitch_6
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 101
    invoke-interface {p0}, Lmoe/shizuku/server/IRemoteProcess;->getInputStream()Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    .line 102
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-eqz p1, :cond_1

    .line 104
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    invoke-virtual {p1, p3, v1}, Landroid/os/ParcelFileDescriptor;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 108
    :cond_1
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1
    return v1

    .line 86
    :pswitch_7
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 87
    invoke-interface {p0}, Lmoe/shizuku/server/IRemoteProcess;->getOutputStream()Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    .line 88
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-eqz p1, :cond_2

    .line 90
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 91
    invoke-virtual {p1, p3, v1}, Landroid/os/ParcelFileDescriptor;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_2

    .line 94
    :cond_2
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_2
    return v1

    .line 81
    :cond_3
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

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
