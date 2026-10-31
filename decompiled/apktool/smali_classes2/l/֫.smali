.class public final Ll/֫;
.super Ljava/lang/Object;
.source "43G9"

# interfaces
.implements Ll/ܽ;


# instance fields
.field public ܿ:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    iput-object p1, p0, Ll/֫;->ܿ:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/֫;->ܿ:Landroid/os/IBinder;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Landroid/app/Notification;)V
    .locals 3

    .line 129
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 131
    :try_start_0
    sget-object v1, Ll/ܽ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 132
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/16 p1, 0x3ee

    .line 133
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p1, 0x0

    .line 134
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_0

    .line 197
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 198
    invoke-interface {p2, v0, v1}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 200
    :cond_0
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 136
    :goto_0
    iget-object p2, p0, Ll/֫;->ܿ:Landroid/os/IBinder;

    invoke-interface {p2, v2, v0, p1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 140
    throw p1
.end method
