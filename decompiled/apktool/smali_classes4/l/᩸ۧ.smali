.class public Ll/᩸ۧ;
.super Ljava/lang/Object;
.source "25NL"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ᩸:Ll/֨ۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 149
    new-instance v0, Ll/۠ۧ;

    .line 150
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 149
    sput-object v0, Ll/᩸ۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    move-object v0, p0

    .line 131
    monitor-enter v0

    .line 132
    :try_start_0
    iget-object p2, p0, Ll/᩸ۧ;->᩸:Ll/֨ۧ;

    if-nez p2, :cond_0

    .line 133
    new-instance p2, Ll/ܶۧ;

    invoke-direct {p2, p0}, Ll/ܶۧ;-><init>(Ll/᩸ۧ;)V

    iput-object p2, p0, Ll/᩸ۧ;->᩸:Ll/֨ۧ;

    .line 135
    :cond_0
    iget-object p2, p0, Ll/᩸ۧ;->᩸:Ll/֨ۧ;

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 136
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ֫(ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final ۧ(ILandroid/os/Bundle;)V
    .locals 1

    .line 105
    iget-object v0, p0, Ll/᩸ۧ;->᩸:Ll/֨ۧ;

    if-eqz v0, :cond_0

    .line 107
    :try_start_0
    invoke-interface {v0, p1, p2}, Ll/֨ۧ;->֫(ILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
