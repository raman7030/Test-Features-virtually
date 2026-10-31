.class public abstract Lmoe/shizuku/server/IShizukuService$Stub;
.super Landroid/os/Binder;
.source "IShizukuService.java"

# interfaces
.implements Lmoe/shizuku/server/IShizukuService;


# static fields
.field public static final DESCRIPTOR:Ljava/lang/String; = "moe.shizuku.server.IShizukuService"

.field public static final TRANSACTION_addUserService:I = 0xc

.field public static final TRANSACTION_attachApplication:I = 0x12

.field public static final TRANSACTION_attachUserService:I = 0x66

.field public static final TRANSACTION_checkPermission:I = 0x5

.field public static final TRANSACTION_checkSelfPermission:I = 0x10

.field public static final TRANSACTION_dispatchPackageChanged:I = 0x67

.field public static final TRANSACTION_dispatchPermissionConfirmationResult:I = 0x69

.field public static final TRANSACTION_exit:I = 0x65

.field public static final TRANSACTION_getFlagsForUid:I = 0x6a

.field public static final TRANSACTION_getSELinuxContext:I = 0x9

.field public static final TRANSACTION_getSystemProperty:I = 0xa

.field public static final TRANSACTION_getUid:I = 0x4

.field public static final TRANSACTION_getVersion:I = 0x3

.field public static final TRANSACTION_isHidden:I = 0x68

.field public static final TRANSACTION_newProcess:I = 0x8

.field public static final TRANSACTION_removeUserService:I = 0xd

.field public static final TRANSACTION_requestPermission:I = 0xf

.field public static final TRANSACTION_setSystemProperty:I = 0xb

.field public static final TRANSACTION_shouldShowRequestPermissionRationale:I = 0x11

.field public static final TRANSACTION_updateFlagsForUid:I = 0x6b


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 93
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "moe.shizuku.server.IShizukuService"

    .line 94
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lmoe/shizuku/server/IShizukuService;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "moe.shizuku.server.IShizukuService"

    .line 105
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 106
    instance-of v1, v0, Lmoe/shizuku/server/IShizukuService;

    if-eqz v1, :cond_1

    .line 107
    check-cast v0, Lmoe/shizuku/server/IShizukuService;

    return-object v0

    .line 109
    :cond_1
    new-instance v0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;

    invoke-direct {v0, p0}, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static getDefaultImpl()Lmoe/shizuku/server/IShizukuService;
    .locals 1

    .line 860
    sget-object v0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IShizukuService;

    return-object v0
.end method

.method public static setDefaultImpl(Lmoe/shizuku/server/IShizukuService;)Z
    .locals 1

    .line 850
    sget-object v0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IShizukuService;

    if-nez v0, :cond_1

    if-eqz p0, :cond_0

    .line 854
    sput-object p0, Lmoe/shizuku/server/IShizukuService$Stub$Proxy;->sDefaultImpl:Lmoe/shizuku/server/IShizukuService;

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    .line 851
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

    const/4 v0, 0x3

    const/4 v1, 0x1

    const-string v2, "moe.shizuku.server.IShizukuService"

    if-eq p1, v0, :cond_a

    const/4 v0, 0x4

    if-eq p1, v0, :cond_9

    const/4 v0, 0x5

    if-eq p1, v0, :cond_8

    const v0, 0x5f4e5446

    if-eq p1, v0, :cond_7

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    packed-switch p1, :pswitch_data_2

    .line 363
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    .line 215
    :pswitch_0
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 217
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lmoe/shizuku/server/IShizukuServiceConnection$Stub;->asInterface(Landroid/os/IBinder;)Lmoe/shizuku/server/IShizukuServiceConnection;

    move-result-object p1

    .line 219
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    if-eqz p4, :cond_0

    .line 220
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Landroid/os/Bundle;

    .line 225
    :cond_0
    invoke-interface {p0, p1, v0}, Lmoe/shizuku/server/IShizukuService;->removeUserService(Lmoe/shizuku/server/IShizukuServiceConnection;Landroid/os/Bundle;)I

    move-result p1

    .line 226
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 227
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 198
    :pswitch_1
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 200
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lmoe/shizuku/server/IShizukuServiceConnection$Stub;->asInterface(Landroid/os/IBinder;)Lmoe/shizuku/server/IShizukuServiceConnection;

    move-result-object p1

    .line 202
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    if-eqz p4, :cond_1

    .line 203
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Landroid/os/Bundle;

    .line 208
    :cond_1
    invoke-interface {p0, p1, v0}, Lmoe/shizuku/server/IShizukuService;->addUserService(Lmoe/shizuku/server/IShizukuServiceConnection;Landroid/os/Bundle;)I

    move-result p1

    .line 209
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 210
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 187
    :pswitch_2
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 189
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 191
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    .line 192
    invoke-interface {p0, p1, p2}, Lmoe/shizuku/server/IShizukuService;->setSystemProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 175
    :pswitch_3
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 177
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 179
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    .line 180
    invoke-interface {p0, p1, p2}, Lmoe/shizuku/server/IShizukuService;->getSystemProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 181
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 182
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    .line 167
    :pswitch_4
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 168
    invoke-interface {p0}, Lmoe/shizuku/server/IShizukuService;->getSELinuxContext()Ljava/lang/String;

    move-result-object p1

    .line 169
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 170
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    .line 153
    :pswitch_5
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 155
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object p1

    .line 157
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object p4

    .line 159
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    .line 160
    invoke-interface {p0, p1, p4, p2}, Lmoe/shizuku/server/IShizukuService;->newProcess([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lmoe/shizuku/server/IRemoteProcess;

    move-result-object p1

    .line 161
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    if-eqz p1, :cond_2

    .line 162
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    :cond_2
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    return v1

    .line 257
    :pswitch_6
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 259
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lmoe/shizuku/server/IShizukuApplication$Stub;->asInterface(Landroid/os/IBinder;)Lmoe/shizuku/server/IShizukuApplication;

    move-result-object p1

    .line 261
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    if-eqz p4, :cond_3

    .line 262
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Landroid/os/Bundle;

    .line 267
    :cond_3
    invoke-interface {p0, p1, v0}, Lmoe/shizuku/server/IShizukuService;->attachApplication(Lmoe/shizuku/server/IShizukuApplication;Landroid/os/Bundle;)V

    .line 268
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 249
    :pswitch_7
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 250
    invoke-interface {p0}, Lmoe/shizuku/server/IShizukuService;->shouldShowRequestPermissionRationale()Z

    move-result p1

    .line 251
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 252
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 241
    :pswitch_8
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 242
    invoke-interface {p0}, Lmoe/shizuku/server/IShizukuService;->checkSelfPermission()Z

    move-result p1

    .line 243
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 244
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 232
    :pswitch_9
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 234
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    .line 235
    invoke-interface {p0, p1}, Lmoe/shizuku/server/IShizukuService;->requestPermission(I)V

    .line 236
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 350
    :pswitch_a
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 352
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    .line 354
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    .line 356
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    .line 357
    invoke-interface {p0, p1, p4, p2}, Lmoe/shizuku/server/IShizukuService;->updateFlagsForUid(III)V

    .line 358
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 338
    :pswitch_b
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 340
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    .line 342
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    .line 343
    invoke-interface {p0, p1, p2}, Lmoe/shizuku/server/IShizukuService;->getFlagsForUid(II)I

    move-result p1

    .line 344
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 345
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 319
    :pswitch_c
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 321
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    .line 323
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    .line 325
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    .line 327
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_4

    .line 328
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Landroid/os/Bundle;

    .line 333
    :cond_4
    invoke-interface {p0, p1, p3, p4, v0}, Lmoe/shizuku/server/IShizukuService;->dispatchPermissionConfirmationResult(IIILandroid/os/Bundle;)V

    return v1

    .line 309
    :pswitch_d
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 311
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    .line 312
    invoke-interface {p0, p1}, Lmoe/shizuku/server/IShizukuService;->isHidden(I)Z

    move-result p1

    .line 313
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 314
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 296
    :pswitch_e
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 298
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_5

    .line 299
    sget-object p1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroid/content/Intent;

    .line 304
    :cond_5
    invoke-interface {p0, v0}, Lmoe/shizuku/server/IShizukuService;->dispatchPackageChanged(Landroid/content/Intent;)V

    return v1

    .line 280
    :pswitch_f
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 282
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    .line 284
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    if-eqz p4, :cond_6

    .line 285
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p4, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Landroid/os/Bundle;

    .line 290
    :cond_6
    invoke-interface {p0, p1, v0}, Lmoe/shizuku/server/IShizukuService;->attachUserService(Landroid/os/IBinder;Landroid/os/Bundle;)V

    .line 291
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 273
    :pswitch_10
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 274
    invoke-interface {p0}, Lmoe/shizuku/server/IShizukuService;->exit()V

    .line 275
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v1

    .line 122
    :cond_7
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v1

    .line 143
    :cond_8
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 145
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 146
    invoke-interface {p0, p1}, Lmoe/shizuku/server/IShizukuService;->checkPermission(Ljava/lang/String;)I

    move-result p1

    .line 147
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 148
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 135
    :cond_9
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 136
    invoke-interface {p0}, Lmoe/shizuku/server/IShizukuService;->getUid()I

    move-result p1

    .line 137
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 138
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    .line 127
    :cond_a
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 128
    invoke-interface {p0}, Lmoe/shizuku/server/IShizukuService;->getVersion()I

    move-result p1

    .line 129
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 130
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return v1

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xf
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x65
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method
