.class public final Ll/ۜ֫;
.super Ljava/lang/Object;
.source "64W0"


# direct methods
.method public static ֫(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;
    .locals 1

    .line 408
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 409
    invoke-interface {p1, p0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
