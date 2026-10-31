.class public final Ll/ܳ֫;
.super Ljava/lang/Object;
.source "64W0"

# interfaces
.implements Ll/᩷֫;


# instance fields
.field public ܿ:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 201
    iput-object p1, p0, Ll/ܳ֫;->ܿ:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ܳ֫;->ܿ:Landroid/os/IBinder;

    return-object v0
.end method

.method public final ֫(Ll/ۧ֫;)V
    .locals 4

    .line 250
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_0
    const-string v1, "android.support.v4.media.session.IMediaControllerCallback"

    .line 252
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    .line 417
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 418
    invoke-virtual {p1, v0, v2}, Ll/ۧ֫;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 420
    :cond_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 254
    :goto_0
    iget-object p1, p0, Ll/ܳ֫;->ܿ:Landroid/os/IBinder;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-interface {p1, v2, v0, v3, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 257
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 258
    throw p1
.end method

.method public final ֫(Ll/᩵ۧ;)V
    .locals 4

    .line 238
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_0
    const-string v1, "android.support.v4.media.session.IMediaControllerCallback"

    .line 240
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    .line 417
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 418
    invoke-virtual {p1, v0, v2}, Ll/᩵ۧ;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 420
    :cond_0
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 242
    :goto_0
    iget-object p1, p0, Ll/ܳ֫;->ܿ:Landroid/os/IBinder;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-interface {p1, v2, v0, v3, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 246
    throw p1
.end method

.method public final ۘ()V
    .locals 5

    .line 226
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    :try_start_0
    const-string v1, "android.support.v4.media.session.IMediaControllerCallback"

    .line 228
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 229
    iget-object v1, p0, Ll/ܳ֫;->ܿ:Landroid/os/IBinder;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-interface {v1, v4, v0, v2, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 232
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 233
    throw v1
.end method
