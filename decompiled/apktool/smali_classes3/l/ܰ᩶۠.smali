.class public final Ll/ܰ᩶۠;
.super Ljava/lang/Object;
.source "H9RQ"

# interfaces
.implements Landroid/os/IBinder;


# instance fields
.field public final ܿ:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Landroid/os/IBinder;

    iput-object p1, p0, Ll/ܰ᩶۠;->ܿ:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final dump(Ljava/io/FileDescriptor;[Ljava/lang/String;)V
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ܰ᩶۠;->ܿ:Landroid/os/IBinder;

    invoke-interface {v0, p1, p2}, Landroid/os/IBinder;->dump(Ljava/io/FileDescriptor;[Ljava/lang/String;)V

    return-void
.end method

.method public final dumpAsync(Ljava/io/FileDescriptor;[Ljava/lang/String;)V
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ܰ᩶۠;->ܿ:Landroid/os/IBinder;

    invoke-interface {v0, p1, p2}, Landroid/os/IBinder;->dumpAsync(Ljava/io/FileDescriptor;[Ljava/lang/String;)V

    return-void
.end method

.method public final getInterfaceDescriptor()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ܰ᩶۠;->ܿ:Landroid/os/IBinder;

    invoke-interface {v0}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isBinderAlive()Z
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ܰ᩶۠;->ܿ:Landroid/os/IBinder;

    invoke-interface {v0}, Landroid/os/IBinder;->isBinderAlive()Z

    move-result v0

    return v0
.end method

.method public final linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ܰ᩶۠;->ܿ:Landroid/os/IBinder;

    invoke-interface {v0, p1, p2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    return-void
.end method

.method public final pingBinder()Z
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ܰ᩶۠;->ܿ:Landroid/os/IBinder;

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    return v0
.end method

.method public final queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 5

    .line 31
    invoke-static {}, Ll/᩺᩶۠;->ܳ()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Ll/᩺᩶۠;->ܿ()I

    move-result v0

    const/16 v3, 0xd

    if-lt v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 33
    :goto_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    :try_start_0
    const-string v4, "moe.shizuku.server.IShizukuService"

    .line 35
    invoke-virtual {v3, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 36
    iget-object v4, p0, Ll/ܰ᩶۠;->ܿ:Landroid/os/IBinder;

    invoke-virtual {v3, v4}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 37
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz v0, :cond_1

    .line 39
    invoke-virtual {v3, p4}, Landroid/os/Parcel;->writeInt(I)V

    .line 41
    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->dataSize()I

    move-result p1

    invoke-virtual {v3, p2, v2, p1}, Landroid/os/Parcel;->appendFrom(Landroid/os/Parcel;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    .line 471
    :try_start_1
    invoke-static {}, Ll/᩺᩶۠;->ۜ()Lmoe/shizuku/server/IShizukuService;

    move-result-object p1

    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-interface {p1, v1, v3, p3, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 459
    :try_start_2
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 473
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 471
    :cond_2
    :try_start_3
    invoke-static {}, Ll/᩺᩶۠;->ۜ()Lmoe/shizuku/server/IShizukuService;

    move-result-object p1

    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-interface {p1, v1, v3, p3, p4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 48
    :goto_1
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    return v1

    :catch_1
    move-exception p1

    .line 459
    :try_start_4
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 473
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p1

    .line 48
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 49
    throw p1
.end method

.method public final unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ܰ᩶۠;->ܿ:Landroid/os/IBinder;

    invoke-interface {v0, p1, p2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    move-result p1

    return p1
.end method
