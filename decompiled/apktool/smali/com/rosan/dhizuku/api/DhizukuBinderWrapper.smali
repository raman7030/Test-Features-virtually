.class public Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;
.super Ljava/lang/Object;
.source "DhizukuBinderWrapper.java"

# interfaces
.implements Landroid/os/IBinder;


# instance fields
.field public target:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Landroid/os/IBinder;

    iput-object p1, p0, Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;->target:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public dump(Ljava/io/FileDescriptor;[Ljava/lang/String;)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;->target:Landroid/os/IBinder;

    invoke-interface {v0, p1, p2}, Landroid/os/IBinder;->dump(Ljava/io/FileDescriptor;[Ljava/lang/String;)V

    return-void
.end method

.method public dumpAsync(Ljava/io/FileDescriptor;[Ljava/lang/String;)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;->target:Landroid/os/IBinder;

    invoke-interface {v0, p1, p2}, Landroid/os/IBinder;->dumpAsync(Ljava/io/FileDescriptor;[Ljava/lang/String;)V

    return-void
.end method

.method public getInterfaceDescriptor()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;->target:Landroid/os/IBinder;

    invoke-interface {v0}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isBinderAlive()Z
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;->target:Landroid/os/IBinder;

    invoke-interface {v0}, Landroid/os/IBinder;->isBinderAlive()Z

    move-result v0

    return v0
.end method

.method public linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;->target:Landroid/os/IBinder;

    invoke-interface {v0, p1, p2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    return-void
.end method

.method public pingBinder()Z
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;->target:Landroid/os/IBinder;

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    return v0
.end method

.method public queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;->target:Landroid/os/IBinder;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/rosan/dhizuku/api/Dhizuku;->remoteTransact(Landroid/os/IBinder;ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1
.end method

.method public unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/rosan/dhizuku/api/DhizukuBinderWrapper;->target:Landroid/os/IBinder;

    invoke-interface {v0, p1, p2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    move-result p1

    return p1
.end method
