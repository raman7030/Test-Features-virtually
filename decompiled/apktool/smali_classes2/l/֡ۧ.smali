.class public final Ll/֡ۧ;
.super Ljava/lang/Object;
.source "05LV"

# interfaces
.implements Ll/֨ۧ;


# instance fields
.field public ܿ:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, Ll/֡ۧ;->ܿ:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/֡ۧ;->ܿ:Landroid/os/IBinder;

    return-object v0
.end method

.method public final ֫(ILandroid/os/Bundle;)V
    .locals 2

    .line 93
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 95
    :try_start_0
    sget-object v1, Ll/֨ۧ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 96
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p1, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    .line 124
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 125
    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 127
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 98
    :goto_0
    iget-object p1, p0, Ll/֡ۧ;->ܿ:Landroid/os/IBinder;

    const/4 p2, 0x0

    invoke-interface {p1, v1, v0, p2, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 102
    throw p1
.end method
