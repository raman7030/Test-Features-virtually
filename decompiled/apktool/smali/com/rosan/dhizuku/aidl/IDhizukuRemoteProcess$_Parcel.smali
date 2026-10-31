.class public Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess$_Parcel;
.super Ljava/lang/Object;
.source "IDhizukuRemoteProcess.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 325
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000(Landroid/os/Parcel;Landroid/os/Parcelable;I)V
    .locals 0

    .line 325
    invoke-static {p0, p1, p2}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess$_Parcel;->writeTypedObject(Landroid/os/Parcel;Landroid/os/Parcelable;I)V

    return-void
.end method

.method public static synthetic access$100(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;
    .locals 0

    .line 325
    invoke-static {p0, p1}, Lcom/rosan/dhizuku/aidl/IDhizukuRemoteProcess$_Parcel;->readTypedObject(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static readTypedObject(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;
    .locals 1

    .line 329
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 330
    invoke-interface {p1, p0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static writeTypedObject(Landroid/os/Parcel;Landroid/os/Parcelable;I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 338
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 339
    invoke-interface {p1, p0, p2}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 341
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
